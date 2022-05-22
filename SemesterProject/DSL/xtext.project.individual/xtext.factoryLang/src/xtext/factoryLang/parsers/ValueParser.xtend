package xtext.factoryLang.parsers

import xtext.factoryLang.factoryLang.VariableValue
import xtext.factoryLang.factoryLang.DiskSlotStateValue
import xtext.factoryLang.factoryLang.ColorValue
import xtext.factoryLang.factoryLang.DiskStateValue
import xtext.factoryLang.factoryLang.Number
import xtext.factoryLang.factoryLang.DeviceValue
import xtext.factoryLang.factoryLang.CranePositionParameter
import xtext.factoryLang.factoryLang.DiskZoneParameter
import xtext.factoryLang.factoryLang.DiskSlotValue
import xtext.factoryLang.factoryLang.DeviceValueS
import xtext.factoryLang.factoryLang.CraneZoneS
import xtext.factoryLang.factoryLang.DiskZoneS
import xtext.factoryLang.factoryLang.VariableValueS
import xtext.factoryLang.factoryLang.DiskSlotValueS

class ValueParser {
	def static CharSequence parseDeviceValueShort(DeviceValueS deviceValue, Class<?> originClass) {
		switch deviceValue.configurationValue {
			CraneZoneS: (deviceValue.configurationValue as CraneZoneS).name
			DiskZoneS: (deviceValue.configurationValue as DiskZoneS).name
		}

		switch deviceValue.value {
			DiskStateValue:
				EnumParser.parseDiskState((deviceValue.value as DiskStateValue).value, originClass)
			ColorValue:
				EnumParser.parseColor((deviceValue.value as ColorValue).value, originClass)
		}
	}
	
	def static CharSequence parseDeviceValueLong(DeviceValue deviceValue, Class<?> originClass) {
		switch deviceValue.ref {
			CranePositionParameter: (deviceValue.ref as CranePositionParameter).name
			DiskZoneParameter: (deviceValue.ref as DiskZoneParameter).name
		}

		switch deviceValue.value {
			DiskStateValue:
				EnumParser.parseDiskState((deviceValue.value as DiskStateValue).value, originClass)
			ColorValue:
				EnumParser.parseColor((deviceValue.value as ColorValue).value, originClass)
		}
	}

	def static CharSequence parseVariableValueShort(VariableValueS variableValue, Class<?> originClass) {
		if (variableValue.ref !== null) {
			return variableValue.ref.name
		}

		switch variableValue.value {
			DiskSlotStateValue:
				EnumParser.parseDiskSlotState((variableValue.value as DiskSlotStateValue).value, originClass)
			ColorValue:
				EnumParser.parseColor((variableValue.value as ColorValue).value, originClass)
			Number: originClass !== null ? "HasMark(" + (variableValue.value as Number).value + ")" : (variableValue.value as Number).value.toString
			DiskStateValue:
				EnumParser.parseDiskState((variableValue.value as DiskStateValue).value, originClass)
		}
	}
	
	def static CharSequence parseVariableValueLong(VariableValue variableValue, Class<?> originClass) {
		if (variableValue.ref !== null) {
			return variableValue.ref.name
		}

		switch variableValue.value {
			DiskSlotStateValue:
				EnumParser.parseDiskSlotState((variableValue.value as DiskSlotStateValue).value, originClass)
			ColorValue:
				EnumParser.parseColor((variableValue.value as ColorValue).value, originClass)
			Number: originClass !== null ? "HasMark(" + (variableValue.value as Number).value + ")" : (variableValue.value as Number).value.toString
			DiskStateValue:
				EnumParser.parseDiskState((variableValue.value as DiskStateValue).value, originClass)
		}
	}
	
	def static CharSequence parseDiskSlotValueShort(DiskSlotValueS diskSlotValue, Class<?> originClass) {
		if (diskSlotValue.ref !== null) {
			return diskSlotValue.ref.name
		}

		switch diskSlotValue.value {
			DiskSlotStateValue:
				EnumParser.parseDiskSlotState((diskSlotValue.value as DiskSlotStateValue).value, originClass)
			ColorValue:
				EnumParser.parseColor((diskSlotValue.value as ColorValue).value, originClass)
		}
	}
	
	
	def static CharSequence parseDiskSlotValueLong(DiskSlotValue diskSlotValue, Class<?> originClass) {
		if (diskSlotValue.ref !== null) {
			return diskSlotValue.ref.name
		}

		switch diskSlotValue.value {
			DiskSlotStateValue:
				EnumParser.parseDiskSlotState((diskSlotValue.value as DiskSlotStateValue).value, originClass)
			ColorValue:
				EnumParser.parseColor((diskSlotValue.value as ColorValue).value, originClass)
		}	
	}
}
