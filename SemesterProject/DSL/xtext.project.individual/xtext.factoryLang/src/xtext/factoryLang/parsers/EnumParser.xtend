package xtext.factoryLang.parsers

import xtext.factoryLang.factoryLang.DISK_SLOT_STATES
import xtext.factoryLang.factoryLang.COLOR
import xtext.factoryLang.factoryLang.DISK_STATES
import xtext.factoryLang.factoryLang.COMPARISON_OPERATOR
import xtext.factoryLang.factoryLang.impl.ForEachImpl
import xtext.factoryLang.factoryLang.impl.DiskMarkSlotOperationImpl
import xtext.factoryLang.factoryLang.impl.LocalVariableImpl
import xtext.factoryLang.factoryLang.impl.GlobalVariableImpl
import xtext.factoryLang.factoryLang.COMPARISON_OPERATOR_S
import xtext.factoryLang.factoryLang.impl.MarkSlotValueSImpl
import xtext.factoryLang.factoryLang.impl.LoopVariableSImpl
import xtext.factoryLang.factoryLang.impl.LoopSlotSImpl
import xtext.factoryLang.factoryLang.impl.OrdinaryVariableSImpl
import xtext.factoryLang.factoryLang.impl.SlotVariableSImpl

class EnumParser {
	def static CharSequence parseDiskSlotState(DISK_SLOT_STATES diskSlotState, Class<?> originClass) {
		switch originClass {
			case ForEachImpl,
			case LoopVariableSImpl,
			case LoopSlotSImpl: {	
				switch diskSlotState {
					case DISK_SLOT_STATES.FREE: 'GetSlotsWithMark(SlotState.Empty)'
					case DISK_SLOT_STATES.IN_PROGRESS: 'GetSlotsWithMark(SlotState.InProgress)'
					case DISK_SLOT_STATES.COMPLETE: 'GetSlotsWithMark(SlotState.Complete)'
				}
			}
			case DiskMarkSlotOperationImpl,
			case MarkSlotValueSImpl: {
				switch diskSlotState {
					case DISK_SLOT_STATES.FREE: "SlotState.Empty"
					case DISK_SLOT_STATES.IN_PROGRESS: "SlotState.InProgress"
					case DISK_SLOT_STATES.COMPLETE: "SlotState.Complete"
				}
			}
		}
	}

	def static CharSequence parseColor(COLOR color, Class<?> originClass) {
		switch originClass {
			case LocalVariableImpl,
			case SlotVariableSImpl: {
				switch color {
					case COLOR.RED: 'HasMark("RED")'
					case COLOR.GREEN: 'HasMark("GREEN")'
					case COLOR.BLUE: 'HasMark("BLUE")'
				}
			}
			case GlobalVariableImpl,
			case OrdinaryVariableSImpl: {
				switch color {
					case COLOR.RED: "RED"
					case COLOR.GREEN: "GREEN"
					case COLOR.BLUE: "BLUE"
				}
			}
		}
	}

	def static CharSequence parseDiskState(DISK_STATES diskState, Class<?> originClass) {
		switch diskState {
			case DISK_STATES.FULL: originClass !== null ? "IsFull()" : "full"
			case DISK_STATES.EMPTY: originClass !== null ? "IsEmpty()" : "empty"
		}
	}

	def static CharSequence parseComparisonOperatorShort(COMPARISON_OPERATOR_S operator) {
		switch operator {
			case COMPARISON_OPERATOR.GREATER_THAN: ">"
			case COMPARISON_OPERATOR.LESS_THAN: "<"
			case COMPARISON_OPERATOR.NOT: "!="
			default: "=="
		}
	}
	
	def static CharSequence parseComparisonOperatorLong(COMPARISON_OPERATOR operator) {
		switch operator {
			case COMPARISON_OPERATOR.GREATER_THAN: ">"
			case COMPARISON_OPERATOR.LESS_THAN: "<"
			case COMPARISON_OPERATOR.NOT: "!="
			default: "=="
		}
	}
}
