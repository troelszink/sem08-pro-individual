/*
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.validation

import org.eclipse.xtext.validation.Check
import xtext.factoryLang.factoryLang.Model
import xtext.factoryLang.factoryLang.FactoryLangPackage.Literals
import xtext.factoryLang.factoryLang.DSL_TYPE_ENUM
import xtext.factoryLang.factoryLang.DSLProgram
import xtext.factoryLang.factoryLang.DSLShort
import xtext.factoryLang.factoryLang.DSLLong

import xtext.factoryLang.validation.FactoryLangShortValidator
import xtext.factoryLang.validation.FactoryLangLongValidator
import xtext.factoryLang.factoryLang.CraneZoneS
import xtext.factoryLang.factoryLang.DiskZoneS
import org.eclipse.xtext.EcoreUtil2
import xtext.factoryLang.factoryLang.DiskS
import xtext.factoryLang.factoryLang.MarkVariableValueS
import xtext.factoryLang.factoryLang.TIME_UNIT_S
import xtext.factoryLang.factoryLang.ConditionDeviceS
import xtext.factoryLang.factoryLang.CraneS
import xtext.factoryLang.factoryLang.DiskStateValue
import xtext.factoryLang.factoryLang.ColorValue
import xtext.factoryLang.factoryLang.DiskSlotStateValue
import xtext.factoryLang.factoryLang.CameraS
import xtext.factoryLang.factoryLang.ConditionVariableS
import xtext.factoryLang.factoryLang.OrdinaryVariableS
import xtext.factoryLang.factoryLang.SlotVariableS
import xtext.factoryLang.factoryLang.CranePositionParameter
import xtext.factoryLang.factoryLang.DiskZoneParameter
import xtext.factoryLang.factoryLang.Disk
import xtext.factoryLang.factoryLang.DiskSlotParameter
import xtext.factoryLang.factoryLang.DiskMarkSlotOperation
import xtext.factoryLang.factoryLang.TIME
import xtext.factoryLang.factoryLang.DeviceConditional
import xtext.factoryLang.factoryLang.Crane
import xtext.factoryLang.factoryLang.Camera

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class FactoryLangValidator extends AbstractFactoryLangValidator {

	public static val INVALID_VALUE = 'invalidValue'
	
	// ----- COMMON CHECKS ----- \\
	@Check
	def checkDSLType(Model model) {
		if (!model.eIsSet(Literals.MODEL__DSL_TYPE)) {
			error('Please specify dsl type: ' + DSL_TYPE_ENUM.LONG + ', ' + DSL_TYPE_ENUM.SHORT,
				Literals.MODEL__DSL_TYPE, INVALID_VALUE)
			return
		}
		
		val dslType = model.dslType
		val dslTypeValue = dslType.value
		val dslProgram = model.dslProgram as DSLProgram
		
		if (dslTypeValue == DSL_TYPE_ENUM.LONG) {
			if (dslProgram instanceof DSLShort) {
				error('Wrong dsl syntax - use syntax of long dsl or switch to short dsl',
					Literals.MODEL__DSL_TYPE, INVALID_VALUE)
			}
		}
		else {
			if (dslProgram instanceof DSLLong) {
				error('Wrong dsl syntax - use syntax of short dsl or switch to long dsl',
					Literals.MODEL__DSL_TYPE, INVALID_VALUE)
			}
		}
	}
	
	
	// ----- CHECKS FOR SHORT DSL ----- \\
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
			error('''Slot must be within available slots (1-�nSlots�)''', Literals.DISK_ZONE_S__SLOT,
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
	
	
	// ----- CHECKS FOR LONG DSL ----- \\
	@Check
	def checkCranePositionParameter(CranePositionParameter parameter) {
		if (!(parameter.degree>= 0 && parameter.degree <= 359)) {
			error('Degree value should be between 0 and 359 degrees (inclusive)',
				Literals.CRANE_POSITION_PARAMETER__DEGREE, INVALID_VALUE)
		}
	}

	@Check
	def checkDiskZoneParameter(DiskZoneParameter parameter) {
		val disk = EcoreUtil2.getContainerOfType(parameter, Disk) as Disk
		val nSlots = (disk.slotParameter as DiskSlotParameter).size

		if (!(parameter.slot> 0 && parameter.slot <= nSlots)) {
			error('''Slot must be within available slots (1-�nSlots�)''', Literals.DISK_ZONE_PARAMETER__SLOT,
				INVALID_VALUE)
		}
	}

	@Check
	def checkDiskMarkSlotOperation(DiskMarkSlotOperation operation) {
		if (!operation.eIsSet(Literals.DISK_MARK_SLOT_OPERATION__QUANTITY) ||
			!operation.eIsSet(Literals.DISK_MARK_SLOT_OPERATION__MEASURE)) {
			return
		}

		val quantity = operation.quantity
		val measure = operation.measure

		if (quantity < 1) {
			error('The time to finish should be>= 1', (Literals.DISK_MARK_SLOT_OPERATION__QUANTITY), INVALID_VALUE)
			return
		}
		if (quantity == 1) {
			if (!(measure == TIME.SECOND || measure == TIME.MINUTE || measure == TIME.HOUR)) {
				error('Use singular unit notation when quantity is <= 1', (Literals.DISK_MARK_SLOT_OPERATION__MEASURE),
					INVALID_VALUE)
			}
			return
		} else {
			if (!(measure == TIME.SECONDS || measure == TIME.MINUTES || measure == TIME.HOURS)) {
				error('Use plural unit notation when quantity is> 1', Literals.DISK_MARK_SLOT_OPERATION__MEASURE,
					INVALID_VALUE)
			}
		}
	}

	@Check
	def checkDeviceConditionalValues(DeviceConditional conditional) {
		if (!conditional.eIsSet(Literals.DEVICE_CONDITIONAL__DEVICE) ||
			!conditional.eIsSet(Literals.DEVICE_CONDITIONAL__DEVICE_VALUE)) {
			return
		}

		val device = conditional.device
		val value = conditional.deviceValue.value

		switch (device) {
			case device instanceof Crane: {
				if (value instanceof DiskStateValue) {
					error(device.name + ' cannot be compared to disk states', Literals.DEVICE_CONDITIONAL__DEVICE_VALUE,
						INVALID_VALUE)
					return
				}
				if (value instanceof ColorValue) {
					error(device.name + ' cannot be compared to colors', Literals.DEVICE_CONDITIONAL__DEVICE_VALUE,
						INVALID_VALUE)
					return
				}
				return
			}
			case device instanceof Disk: {
				if (value instanceof ColorValue) {
					error(device.name + ' cannot be compared to colors', Literals.DEVICE_CONDITIONAL__DEVICE_VALUE,
						INVALID_VALUE)
					return
				}
			}
			case device instanceof Camera: {
				if (value instanceof DiskStateValue) {
					error(device.name + ' cannot be compared to disk states', Literals.DEVICE_CONDITIONAL__DEVICE_VALUE,
						INVALID_VALUE)
					return
				}
				if (value instanceof ColorValue) {
					error(device.name + ' cannot be compared to colors', Literals.DEVICE_CONDITIONAL__DEVICE_VALUE,
						INVALID_VALUE)
					return
				}
				return
			}
		}
	}
}