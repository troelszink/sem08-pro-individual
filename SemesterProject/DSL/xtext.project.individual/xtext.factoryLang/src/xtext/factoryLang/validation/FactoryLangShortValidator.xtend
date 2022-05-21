package xtext.factoryLang.validation

import org.eclipse.xtext.validation.Check
import xtext.factoryLang.factoryLang.FactoryLangPackage.Literals
import xtext.factoryLang.factoryLang.CraneZoneS
import xtext.factoryLang.factoryLang.DiskZoneS
import org.eclipse.xtext.EcoreUtil2
import xtext.factoryLang.factoryLang.MarkVariableValueS
import xtext.factoryLang.factoryLang.TIME_UNIT_S
import xtext.factoryLang.factoryLang.ConditionDeviceS
import xtext.factoryLang.factoryLang.DiskStateValue
import xtext.factoryLang.factoryLang.ColorValue
import xtext.factoryLang.factoryLang.DiskSlotStateValue
import xtext.factoryLang.factoryLang.OrdinaryVariableS
import xtext.factoryLang.factoryLang.SlotVariableS
import xtext.factoryLang.factoryLang.CraneS
import xtext.factoryLang.factoryLang.DiskS
import xtext.factoryLang.factoryLang.CameraS
import xtext.factoryLang.factoryLang.ConditionVariableS

class FactoryLangShortValidator extends AbstractFactoryLangValidator {
	
	public static val INVALID_VALUE = 'invalidValue'
	
	@Check
	def checkCraneZone(CraneZoneS zone) {
		if (!(zone.zoneValue>= 0 && zone.zoneValue <= 359)) {
			error('Degree value should be between 0 and 359 degrees (inclusive)',
				Literals.CRANE_ZONE_S__ZONE_VALUE, INVALID_VALUE)
		}
	}

	@Check
	def checkDiskZone(DiskZoneS zone) {
		val disk = EcoreUtil2.getContainerOfType(zone, DiskS) as DiskS
		val nSlots = disk.NSlots

		if (!(zone.slot> 0 && zone.slot <= nSlots)) {
			error('''Slot must be within available slots (1-«nSlots»)''', Literals.DISK_ZONE_S__SLOT,
				INVALID_VALUE)
		}
	}

	@Check
	def checkMarkVariableValue(MarkVariableValueS mark) {
		if (!mark.eIsSet(Literals.MARK_VARIABLE_VALUE_S__TIME) &&
			!mark.eIsSet(Literals.MARK_VARIABLE_VALUE_S__UNIT)) {
			return
		}
		if (!mark.eIsSet(Literals.MARK_VARIABLE_VALUE_S__UNIT)) {
			error('Remember to add unit: ' + TIME_UNIT_S.SECOND + ', ' + TIME_UNIT_S.MINUTE + ', ' + TIME_UNIT_S.HOUR,
				(Literals.MARK_VARIABLE_VALUE_S__TIME), INVALID_VALUE)
			return
		}

		val time = mark.time
		if (time < 1) {
			error('The time to finish should be>= 1', (Literals.MARK_VARIABLE_VALUE_S__TIME), INVALID_VALUE)
			return
		}
	}

	@Check
	def checkConditionDeviceValues(ConditionDeviceS condition) {
		if (!condition.eIsSet(Literals.CONDITION_DEVICE_S__DEVICE) ||
			!condition.eIsSet(Literals.CONDITION_DEVICE_S__DEVICE_VALUE)) {
			return
		}

		val device = condition.device
		val value = condition.deviceValue.value

		switch (device) {
			case device instanceof CraneS: {
				if (value instanceof DiskStateValue) {
					error(device.name + ' cannot be compared to disk states', Literals.CONDITION_DEVICE_S__DEVICE_VALUE,
						INVALID_VALUE)
					return
				}
				if (value instanceof ColorValue) {
					error(device.name + ' cannot be compared to colors', Literals.CONDITION_DEVICE_S__DEVICE_VALUE,
						INVALID_VALUE)
					return
				}
				return
			}
			case device instanceof DiskS: {
				if (value instanceof ColorValue) {
					error(device.name + ' cannot be compared to colors', Literals.CONDITION_DEVICE_S__DEVICE_VALUE,
						INVALID_VALUE)
					return
				}
				if (value instanceof DiskSlotStateValue) {
					error(device.name + ' cannot be compared to disk slot states', Literals.CONDITION_DEVICE_S__DEVICE_VALUE,
						INVALID_VALUE)
					return
				}
				return
			}
			case device instanceof CameraS: {
				if (value instanceof DiskStateValue) {
					error(device.name + ' cannot be compared to disk states', Literals.CONDITION_DEVICE_S__DEVICE_VALUE,
						INVALID_VALUE)
					return
				}
				if (value instanceof ColorValue) {
					error(device.name + ' cannot be compared to colors', Literals.CONDITION_DEVICE_S__DEVICE_VALUE,
						INVALID_VALUE)
					return
				}
				return
			}
		}
	}
	
	@Check
	def checkConditionVariableValues(ConditionVariableS condition) {
		if (!condition.eIsSet(Literals.CONDITION_VARIABLE_S__VARIABLE) ||
			!condition.eIsSet(Literals.CONDITION_VARIABLE_S__VARIABLE_VALUE)) {
			return
		}

		val variable = condition.variable
		val value = condition.variableValue.value

		switch (variable) {
			case variable instanceof OrdinaryVariableS: {
				if (value instanceof DiskStateValue) {
					error(variable.name + ' cannot be compared to disk states', Literals.CONDITION_VARIABLE_S__VARIABLE_VALUE,
						INVALID_VALUE)
					return
				}
				if (value instanceof DiskSlotStateValue) {
					error(variable.name + ' cannot be compared to disk slot states', Literals.CONDITION_VARIABLE_S__VARIABLE_VALUE,
						INVALID_VALUE)
					return
				}
				return
			}
			case variable instanceof SlotVariableS: {
				if (value instanceof DiskStateValue) {
					error(variable.name + ' cannot be compared to disk states', Literals.CONDITION_VARIABLE_S__VARIABLE_VALUE,
						INVALID_VALUE)
					return
				}
				return
			}
		}
	}
}