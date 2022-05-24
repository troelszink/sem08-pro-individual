package xtext.factoryLang.generator.subgenerators

import xtext.factoryLang.factoryLang.CameraScanOperation
import xtext.factoryLang.factoryLang.ColorValue
import xtext.factoryLang.factoryLang.CraneDropOperation
import xtext.factoryLang.factoryLang.CranePickupOperation
import xtext.factoryLang.factoryLang.CranePositionParameter
import xtext.factoryLang.factoryLang.DeviceConditional
import xtext.factoryLang.factoryLang.DiskMarkSlotOperation
import xtext.factoryLang.factoryLang.DiskMoveEmptySlotOperation
import xtext.factoryLang.factoryLang.DiskMoveSlotOperation
import xtext.factoryLang.factoryLang.DiskMoveVariableSlotOperation
import xtext.factoryLang.factoryLang.DiskSlotStateValue
import xtext.factoryLang.factoryLang.ForEach
import xtext.factoryLang.factoryLang.VariableConditional
import xtext.factoryLang.uppaalParsers.EnumParser

import static xtext.factoryLang.generator.subgenerators.UppaalGenerator.getIdOfLocation
import static xtext.factoryLang.generator.subgenerators.UppaalGenerator.statementsIndexer
import static xtext.factoryLang.generator.subgenerators.UppaalGenerator.statementsIndexerShort
import xtext.factoryLang.factoryLang.DiskStateValue
import xtext.factoryLang.factoryLang.DISK_STATES
import xtext.factoryLang.factoryLang.Variable
import xtext.factoryLang.factoryLang.Camera
import xtext.factoryLang.factoryLang.Parameter
import xtext.factoryLang.factoryLang.Model
import xtext.factoryLang.factoryLang.DiskWaitOperation
import xtext.factoryLang.factoryLang.ConditionDeviceS
import xtext.factoryLang.factoryLang.COMPARISON_OPERATOR_S
import xtext.factoryLang.factoryLang.WaitS
import xtext.factoryLang.factoryLang.ConditionVariableS
import xtext.factoryLang.factoryLang.MoveCraneS
import xtext.factoryLang.factoryLang.CraneZoneS
import xtext.factoryLang.factoryLang.CRANE_ACTION_S
import xtext.factoryLang.factoryLang.MoveDiskS
import org.eclipse.xtext.EcoreUtil2
import xtext.factoryLang.factoryLang.DiskHandlingS
import xtext.factoryLang.factoryLang.MoveAnySlotS
import xtext.factoryLang.factoryLang.MarkSlotValueS
import xtext.factoryLang.factoryLang.MarkCameraValueS
import xtext.factoryLang.factoryLang.LoopS
import xtext.factoryLang.factoryLang.LoopVariableS
import xtext.factoryLang.factoryLang.LoopSlotS
import xtext.factoryLang.factoryLang.ConditionSlotS

class UppaalMasterGenerator {
	static String lastTransistionState = "id0";
	static String currentDisc = "ERROR_NO_DISC";
	
	// SHORT
	def static dispatch String generateLocation(ConditionDeviceS statement) {
		var value = ""
		switch(statement.deviceValue.value){
			DiskStateValue:{
				value = (statement.deviceValue.value as DiskStateValue).value.toString
				if(statement.comparisonOperator === COMPARISON_OPERATOR_S.NOT && value === DISK_STATES.EMPTY.toString){
					value = DISK_STATES.FULL.toString
				}else if (statement.comparisonOperator === COMPARISON_OPERATOR_S.NOT && value === DISK_STATES.FULL.toString){
					value = DISK_STATES.EMPTY.toString
				}
			} 
			//Missing not implementation
			ColorValue: value = (statement.deviceValue.value as DiskStateValue).value.toString
		}
		'''
		<location id="«getIdOfLocation('''«statement.device.name»_get«value»_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.device.name»_get«value»_«statementsIndexerShort.indexOf(statement)»</name>
			<label kind="invariant">GlobalTimer &lt; 10</label>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_Is«value»_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.device.name»_Is«value»_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_EndIf«value»_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.device.name»_EndIf«value»_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		«FOR s : statement.statements»
		«generateLocation(s)»
		«ENDFOR»
		'''
	}
	
	def static dispatch String generateLocation(WaitS statement){
		
	}
	
	def static dispatch String generateTransistion(WaitS statement){
		
	}
	
	
	def static dispatch String generateTransistion(ConditionDeviceS statement) {
		var value = ""
		switch(statement.deviceValue.value){
			DiskStateValue:{
				value = (statement.deviceValue.value as DiskStateValue).value.toString
				if(statement.comparisonOperator === COMPARISON_OPERATOR_S.NOT && value === DISK_STATES.EMPTY.toString){
					value = DISK_STATES.FULL.toString
				}else if (statement.comparisonOperator === COMPARISON_OPERATOR_S.NOT && value === DISK_STATES.FULL.toString){
					value = DISK_STATES.EMPTY.toString
				}
			} 
			//Missing not implementation
			ColorValue: value = (statement.deviceValue.value as DiskStateValue).value.toString
		}
		currentDisc = statement.device.name
		var returnTransistion = ""
		if (statement.eContainer instanceof Model) {
			returnTransistion = lastTransistionState
		} else {
			returnTransistion = getIdOfLocation('''«statement.device.name»_EndIf«value»_«statementsIndexerShort.indexOf(statement)»''')
		}
		switch(statement.deviceValue.value){
			DiskStateValue:{
				val trans = '''
				<transition>
					<source ref="«lastTransistionState»"/>
					<target ref="«getIdOfLocation('''«statement.device.name»_get«value»_«statementsIndexerShort.indexOf(statement)»''')»"/>
					<label kind="synchronisation">«currentDisc»_get«value»Slot!</label>
					<label kind="assignment">GlobalTimer = 0</label>
				</transition>
				<transition>
					<source ref="«getIdOfLocation('''«statement.device.name»_get«value»_«statementsIndexerShort.indexOf(statement)»''')»"/>
					<target ref="«getIdOfLocation('''«statement.device.name»_Is«value»_«statementsIndexerShort.indexOf(statement)»''')»"/>
					<label kind="synchronisation">«currentDisc»_found«value»Slot?</label>
				</transition>
				«updateLastTrans('''«getIdOfLocation('''«statement.device.name»_Is«value»_«statementsIndexerShort.indexOf(statement)»''')»''')»
				«FOR s : statement.statements»
				«generateTransistion(s)»
				«ENDFOR»
				<transition>
					<source ref="«lastTransistionState»"/>
					<target ref="«returnTransistion»"/>
				</transition>
				<transition>
					<source ref="«getIdOfLocation('''«statement.device.name»_get«value»_«statementsIndexerShort.indexOf(statement)»''')»"/>
					<target ref="«returnTransistion»"/>
					<label kind="guard">GlobalTimer &gt; 2</label>
				</transition>
				''';
				lastTransistionState = returnTransistion
				return trans
				}
			default: throw new UnsupportedOperationException("This conditional value is not implemented yet")
		}
	}
	
	def static dispatch String generateLocation(ConditionVariableS statement) {
		'''
		<location id="«getIdOfLocation('''«statement.ordinaryVariable.name»_get«(statement.variableValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.ordinaryVariable.name»_get«(statement.variableValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»</name>
			<label kind="invariant">GlobalTimer &lt; 10</label>
		</location>
		<location id="«getIdOfLocation('''«statement.ordinaryVariable.name»_Is«(statement.variableValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.ordinaryVariable.name»_Is«(statement.variableValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.ordinaryVariable.name»_EndIf«(statement.variableValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.ordinaryVariable.name»_EndIf«(statement.variableValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		«FOR s : statement.statements»
		«generateLocation(s)»
		«ENDFOR»
		'''
		/*
		<location id="«getIdOfLocation('''EndIf_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>EndIf_«statementsIndexerShort.indexOf(statement)»</name>
		</location>*/
	}
	
	def static dispatch String generateTransistion(ConditionVariableS statement){
		val returnTransistion = getIdOfLocation('''«statement.ordinaryVariable.name»_EndIf«(statement.variableValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')
		switch(statement.variableValue.value){
			ColorValue:{
				val trans = '''
				<transition>
					<source ref="«lastTransistionState»"/>
					<target ref="«getIdOfLocation('''«statement.ordinaryVariable.name»_get«(statement.variableValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')»"/>
					<label kind="synchronisation">«currentDisc»_getColourSlot[currentSlot]!</label>
					<label kind="assignment">GlobalTimer = 0</label>
				</transition>
				<transition>
					<source ref="«getIdOfLocation('''«statement.ordinaryVariable.name»_get«(statement.variableValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')»"/>
					<target ref="«getIdOfLocation('''«statement.ordinaryVariable.name»_Is«(statement.variableValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')»"/>
					<label kind="guard">currentSlot_colour == «EnumParser.ColourToInt((statement.variableValue.value as ColorValue).value)»</label>
					<label kind="synchronisation">«currentDisc»_gottenColourSlot?</label>
				</transition>
				«updateLastTrans('''«getIdOfLocation('''«statement.ordinaryVariable.name»_Is«(statement.variableValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')»''')»
				«FOR s : statement.statements»
				«generateTransistion(s)»
				«ENDFOR»
				<transition>
					<source ref="«lastTransistionState»"/>
					<target ref="«returnTransistion»"/>
				</transition>
				<transition>
					<source ref="«getIdOfLocation('''«statement.ordinaryVariable.name»_get«(statement.variableValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')»"/>
					<target ref="«returnTransistion»"/>
					<label kind="guard">currentSlot_colour != «EnumParser.ColourToInt((statement.variableValue.value as ColorValue).value)»</label>
					<label kind="synchronisation">«currentDisc»_gottenColourSlot?</label>
				</transition>
				''';
				lastTransistionState = returnTransistion
				return trans
				}
			default: throw new UnsupportedOperationException("This conditional value is not implemented yet")
		}
	}
	
	def static dispatch String generateLocation(ConditionSlotS statement) {
		'''
		<location id="«getIdOfLocation('''«statement.slotVariable.name»_get«(statement.slotValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.slotVariable.name»_get«(statement.slotValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»</name>
			<label kind="invariant">GlobalTimer &lt; 10</label>
		</location>
		<location id="«getIdOfLocation('''«statement.slotVariable.name»_Is«(statement.slotValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.slotVariable.name»_Is«(statement.slotValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.slotVariable.name»_EndIf«(statement.slotValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.slotVariable.name»_EndIf«(statement.slotValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		«FOR s : statement.statements»
		«generateLocation(s)»
		«ENDFOR»
		'''
		/*
		<location id="«getIdOfLocation('''EndIf_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>EndIf_«statementsIndexerShort.indexOf(statement)»</name>
		</location>*/
	}
	
	def static dispatch String generateTransistion(ConditionSlotS statement){
		val returnTransistion = getIdOfLocation('''«statement.slotVariable.name»_EndIf«(statement.slotValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')
		switch(statement.slotValue.value){
			ColorValue:{
				val trans = '''
				<transition>
					<source ref="«lastTransistionState»"/>
					<target ref="«getIdOfLocation('''«statement.slotVariable.name»_get«(statement.slotValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')»"/>
					<label kind="synchronisation">«currentDisc»_getColourSlot[currentSlot]!</label>
					<label kind="assignment">GlobalTimer = 0</label>
				</transition>
				<transition>
					<source ref="«getIdOfLocation('''«statement.slotVariable.name»_get«(statement.slotValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')»"/>
					<target ref="«getIdOfLocation('''«statement.slotVariable.name»_Is«(statement.slotValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')»"/>
					<label kind="guard">currentSlot_colour == «EnumParser.ColourToInt((statement.slotValue.value as ColorValue).value)»</label>
					<label kind="synchronisation">«currentDisc»_gottenColourSlot?</label>
				</transition>
				«updateLastTrans('''«getIdOfLocation('''«statement.slotVariable.name»_Is«(statement.slotValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')»''')»
				«FOR s : statement.statements»
				«generateTransistion(s)»
				«ENDFOR»
				<transition>
					<source ref="«lastTransistionState»"/>
					<target ref="«returnTransistion»"/>
				</transition>
				<transition>
					<source ref="«getIdOfLocation('''«statement.slotVariable.name»_get«(statement.slotValue.value as ColorValue).value»_«statementsIndexerShort.indexOf(statement)»''')»"/>
					<target ref="«returnTransistion»"/>
					<label kind="guard">currentSlot_colour != «EnumParser.ColourToInt((statement.slotValue.value as ColorValue).value)»</label>
					<label kind="synchronisation">«currentDisc»_gottenColourSlot?</label>
				</transition>
				''';
				lastTransistionState = returnTransistion
				return trans
				}
			default: throw new UnsupportedOperationException("This conditional value is not implemented yet")
		}
	}
	
	def static dispatch String generateLocation(MoveCraneS statement) {
		'''
		<location id="«getIdOfLocation('''«statement.crane.name»_goto_«(statement.craneZone as CraneZoneS).name»_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.crane.name»_goto_«(statement.craneZone as CraneZoneS).name»_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.crane.name»_lower_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.crane.name»_lower_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.crane.name»_toggleMagnet_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.crane.name»_toggleMagnet_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.crane.name»_raise_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.crane.name»_raise_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		'''
	}
	
	def static dispatch String generateTransistion(MoveCraneS statement){
		val trans = '''
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«statement.crane.name»_goto_«(statement.craneZone as CraneZoneS).name»_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.crane.name»_goto_«(statement.craneZone as CraneZoneS).name»!</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.crane.name»_goto_«(statement.craneZone as CraneZoneS).name»_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.crane.name»_lower_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.crane.name»_lowerMagnet!</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.crane.name»_lower_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.crane.name»_toggleMagnet_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.crane.name»_toggleMagnet!</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.crane.name»_toggleMagnet_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.crane.name»_raise_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.crane.name»_raiseMagnet!</label>
		</transition>
		''';
		lastTransistionState = getIdOfLocation('''«statement.crane.name»_raise_«statementsIndexerShort.indexOf(statement)»''')
		return trans
	}
	
	/*def static dispatch String generateLocation(CraneDropOperation statement) {
		'''
		<location id="«getIdOfLocation('''«statement.device.name»_goto_«(statement.target as CranePositionParameter).name»_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.device.name»_goto_«(statement.target as CranePositionParameter).name»_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_lower_«(statement.target as CranePositionParameter).name»_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.device.name»_lower_«(statement.target as CranePositionParameter).name»_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_toggleMagnet_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.device.name»_toggleMagnet_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_raise_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.device.name»_raise_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		'''
	}
	
	def static dispatch String generateTransistion(CraneDropOperation statement){
		val trans = '''
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_goto_«(statement.target as CranePositionParameter).name»_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_goto_«(statement.target as CranePositionParameter).name»!</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_goto_«(statement.target as CranePositionParameter).name»_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_lower_«(statement.target as CranePositionParameter).name»_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_lowerMagnet!</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_lower_«(statement.target as CranePositionParameter).name»_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_toggleMagnet_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_toggleMagnet!</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_toggleMagnet_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_raise_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_raiseMagnet!</label>
		</transition>
		''';
		lastTransistionState = getIdOfLocation('''«statement.device.name»_raise_«statementsIndexerShort.indexOf(statement)»''')
		return trans
	}*/
	
	def static dispatch String generateLocation(MoveDiskS statement) {
		val diskHandling = EcoreUtil2.getContainerOfType(statement, DiskHandlingS)
		'''
		<location id="«getIdOfLocation('''«diskHandling.disk.name»_goto_«statement.diskZone.name»_statement«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«diskHandling.disk.name»_goto_«statement.diskZone.name»_statement«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		'''
	}
	
	def static dispatch String generateTransistion(MoveDiskS statement){
		val diskHandling = EcoreUtil2.getContainerOfType(statement, DiskHandlingS)
		val trans = '''
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«diskHandling.disk.name»_goto_«statement.diskZone.name»_statement«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«diskHandling.disk.name»_goto[(«statement.diskZone.name»_zones_«statement.diskZone.name» + currentSlot) % «diskHandling.disk.name»_numberOfSlots]!</label>
		</transition>
		'''
		lastTransistionState = getIdOfLocation('''«diskHandling.disk.name»_goto_«statement.diskZone.name»_statement«statementsIndexerShort.indexOf(statement)»''')
		return trans
	}
	
	/*def static dispatch String generateLocation(DiskMoveVariableSlotOperation statement) {
		'''
		<location id="«getIdOfLocation('''«statement.device.name»_goto_«statement.target.name»_statment«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«statement.device.name»goto_«statement.target.name»_statment«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		'''
	}
	
	def static dispatch String generateTransistion(DiskMoveVariableSlotOperation statement){
		val trans = '''
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_goto_«statement.target.name»_statment«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_goto[(«statement.device.name»_zones_«statement.target.name» + currentSlot) % «statement.device.name»_numberOfSlots]!</label>
		</transition>
		'''
		lastTransistionState = getIdOfLocation('''«statement.device.name»_goto_«statement.target.name»_statment«statementsIndexerShort.indexOf(statement)»''')
		return trans
	}*/
	
	def static dispatch String generateLocation(MoveAnySlotS statement) {
		val diskHandling = EcoreUtil2.getContainerOfType(statement, DiskHandlingS)
		'''
		<location id="«getIdOfLocation('''«diskHandling.disk.name»_getemptySlot_statement«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«diskHandling.disk.name»_getemptySlot_statment«statementsIndexerShort.indexOf(statement)»</name>
			<committed/>
		</location>
		<location id="«getIdOfLocation('''«diskHandling.disk.name»_gottenemptySlot_statement«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«diskHandling.disk.name»_gottenemptySlot_statment«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«diskHandling.disk.name»_goto_«statement.diskZone.name»_statement«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«diskHandling.disk.name»_goto_«statement.diskZone.name»_statment«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		'''
	}
	
	def static dispatch String generateTransistion(MoveAnySlotS statement) {
		val diskHandling = EcoreUtil2.getContainerOfType(statement, DiskHandlingS)
		val trans = '''
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«diskHandling.disk.name»_getemptySlot_statement«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«diskHandling.disk.name»_getemptySlot!</label>
			<label kind="assignment">GlobalTimer = 0</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«diskHandling.disk.name»_getemptySlot_statement«statementsIndexerShort.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«diskHandling.disk.name»_gottenemptySlot_statement«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«diskHandling.disk.name»_foundemptySlot?</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«diskHandling.disk.name»_gottenemptySlot_statement«statementsIndexerShort.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«diskHandling.disk.name»_goto_«statement.diskZone.name»_statement«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«diskHandling.disk.name»_goto[(«statement.diskZone.name»_zones_«statement.diskZone.name» + currentSlot) % «diskHandling.disk.name»_numberOfSlots]!</label>
		</transition>
		'''
		lastTransistionState = getIdOfLocation('''«diskHandling.disk.name»_goto_«statement.diskZone.name»_statement«statementsIndexerShort.indexOf(statement)»''')
		currentDisc = diskHandling.disk.name
		return trans
	}
	
	
	def static dispatch String generateLocation(MarkSlotValueS statement) {
		var value = ""
		switch(statement.slotValue.value){
			DiskSlotStateValue: value = (statement.slotValue.value as DiskSlotStateValue).value.toString
			ColorValue: value = (statement.slotValue.value as ColorValue).value.toString
			default: value = "Colour"
		}
		val diskHandling = EcoreUtil2.getContainerOfType(statement, DiskHandlingS)
		'''
		«IF statement.time > 0»
		<location id="«getIdOfLocation('''«diskHandling.disk.name»_markSlot«value»In«statement.time»«statement.unit»_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«diskHandling.disk.name»_markSlot«value»In«statement.time»«statement.unit»_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		«ENDIF»
		«IF value === "free" »
		<location id="«getIdOfLocation('''«diskHandling.disk.name»_markSlotopposite_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«diskHandling.disk.name»_markSlotempty_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		«ENDIF»
		«IF value === "empty" »
		<location id="«getIdOfLocation('''«diskHandling.disk.name»_markSlotopposite_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«diskHandling.disk.name»_markSlotfree_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		«ENDIF»
		«IF value === "in_progress" »
		<location id="«getIdOfLocation('''«diskHandling.disk.name»_markSlotfull_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«diskHandling.disk.name»_markSlotfull_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		«ENDIF»
		<location id="«getIdOfLocation('''«diskHandling.disk.name»_markSlot«value»_statement«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«diskHandling.disk.name»_markSlot«value»_statement«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		'''
	}
	
	def static dispatch String generateTransistion(MarkSlotValueS statement) {
		var value = ""
		switch(statement.slotValue.value){
			DiskSlotStateValue: value = (statement.slotValue.value as DiskSlotStateValue).value.toString
			ColorValue: value = (statement.slotValue.value as ColorValue).value.toString
			default: value = "Colour"
		}
		val diskHandling = EcoreUtil2.getContainerOfType(statement, DiskHandlingS)
		val trans = '''
		«IF statement.time > 0»
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«diskHandling.disk.name»_markSlot«value»In«statement.time»«statement.unit»_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="assignment">timer = 0</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«diskHandling.disk.name»_markSlot«value»In«statement.time»«statement.unit»_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«diskHandling.disk.name»_markSlot«value»_statement«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="guard">timer &gt;= «statement.time»</label>
			«IF value === "Colour"»
			<label kind="synchronisation">«diskHandling.disk.name»_set«value»[currentSlot][colour]!</label>
			«ELSE»
			<label kind="synchronisation">«diskHandling.disk.name»_set_«value»[currentSlot]!</label>
			«ENDIF»
		</transition>
		«ELSE»
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«diskHandling.disk.name»_markSlot«value»_statement«statementsIndexerShort.indexOf(statement)»''')»"/>
			«IF value === "Colour"»
			<label kind="synchronisation">«diskHandling.disk.name»_set«value»[currentSlot][colour]!</label>
			«ELSE»
			<label kind="synchronisation">«diskHandling.disk.name»_set_«value»[currentSlot]!</label>
			«ENDIF»
		</transition>
		«ENDIF»
		«IF value === "free" || value == "empty"»
		<transition>
			<source ref="«getIdOfLocation('''«diskHandling.disk.name»_markSlot«value»_statement«statementsIndexerShort.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«diskHandling.disk.name»_markSlotopposite_«statementsIndexerShort.indexOf(statement)»''')»"/>
			«IF value === "free" »
			<label kind="synchronisation">«diskHandling.disk.name»_removeItemCmd!</label>
			«ELSE»
			<label kind="synchronisation">«diskHandling.disk.name»_set_free[currentSlot]!</label>
			«ENDIF»
		</transition>
		«ENDIF»
		«IF value === "in_progress"»
		<transition>
			<source ref="«getIdOfLocation('''«diskHandling.disk.name»_markSlot«value»_statement«statementsIndexerShort.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«diskHandling.disk.name»_markSlotfull_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«diskHandling.disk.name»_addItemCmd!</label>
		</transition>
		«ENDIF»
		'''
		
		lastTransistionState = getIdOfLocation('''«diskHandling.disk.name»_markSlot«value»_statement«statementsIndexerShort.indexOf(statement)»''')
		if (value === "free" || value == "empty") {
			lastTransistionState = getIdOfLocation('''«diskHandling.disk.name»_markSlotopposite_«statementsIndexerShort.indexOf(statement)»''')
		} else if (value == "in_progress"){
			lastTransistionState = getIdOfLocation('''«diskHandling.disk.name»_markSlotfull_«statementsIndexerShort.indexOf(statement)»''')
		}
		return trans
	}
	
	def static dispatch String generateLocation(MarkCameraValueS statement) {
		val diskHandling = EcoreUtil2.getContainerOfType(statement, DiskHandlingS)
		'''
		<location id="«getIdOfLocation('''«diskHandling.disk.name»_scanItem_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«diskHandling.disk.name»_scanItem_«statementsIndexerShort.indexOf(statement)»</name>
			<committed/>
		</location>
		<location id="«getIdOfLocation('''«diskHandling.disk.name»_itemColour_«statementsIndexerShort.indexOf(statement)»''')»">
			<name>«diskHandling.disk.name»_itemColour_«statementsIndexerShort.indexOf(statement)»</name>
		</location>
		'''
	}
	
	def static dispatch String generateTransistion(MarkCameraValueS statement) {
		val diskHandling = EcoreUtil2.getContainerOfType(statement, DiskHandlingS)
		val trans = '''
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«diskHandling.disk.name»_scanItem_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«diskHandling.disk.name»_getColour!</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«diskHandling.disk.name»_scanItem_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«diskHandling.disk.name»_itemColour_«statementsIndexerShort.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«diskHandling.disk.name»_gottenColour?</label>
		</transition>
		'''
		lastTransistionState = getIdOfLocation('''«diskHandling.disk.name»_itemColour_«statementsIndexerShort.indexOf(statement)»''')
		return trans
	}
	
	def static dispatch String generateLocation(LoopS statement) {
		val diskHandling = EcoreUtil2.getContainerOfType(statement, DiskHandlingS)
		if (statement instanceof LoopVariableS) {
			'''
			<location id="«getIdOfLocation('''«diskHandling.disk.name»_get«(statement.variableValue.value as DiskSlotStateValue).value»Slot_«statementsIndexerShort.indexOf(statement)»''')»">
				<name>«diskHandling.disk.name»_get«(statement.variableValue.value as DiskSlotStateValue).value»Slot_«statementsIndexerShort.indexOf(statement)»</name>
				<committed/>
			</location>
			<location id="«getIdOfLocation('''«diskHandling.disk.name»_gottenSlot«(statement.variableValue.value as DiskSlotStateValue).value»_«statementsIndexerShort.indexOf(statement)»''')»">
				<name>«diskHandling.disk.name»_gottenSlot«(statement.variableValue.value as DiskSlotStateValue).value»_«statementsIndexerShort.indexOf(statement)»</name>
			</location>
			«FOR s : statement.statements»
			«generateLocation(s)»
			«ENDFOR»
			'''
		}
		else if (statement instanceof LoopSlotS) {
			'''
			<location id="«getIdOfLocation('''«diskHandling.disk.name»_get«(statement.slotValue.value as DiskSlotStateValue).value»Slot_«statementsIndexerShort.indexOf(statement)»''')»">
				<name>«diskHandling.disk.name»_get«(statement.slotValue.value as DiskSlotStateValue).value»Slot_«statementsIndexerShort.indexOf(statement)»</name>
				<committed/>
			</location>
			<location id="«getIdOfLocation('''«diskHandling.disk.name»_gottenSlot«(statement.slotValue.value as DiskSlotStateValue).value»_«statementsIndexerShort.indexOf(statement)»''')»">
				<name>«diskHandling.disk.name»_gottenSlot«(statement.slotValue.value as DiskSlotStateValue).value»_«statementsIndexerShort.indexOf(statement)»</name>
			</location>
			«FOR s : statement.statements»
			«generateLocation(s)»
			«ENDFOR»
			'''
		}
	}
	
	def static dispatch String generateTransistion(LoopS statement) {
		val diskHandling = EcoreUtil2.getContainerOfType(statement, DiskHandlingS)
		if (statement instanceof LoopVariableS) {
			val returnTransistion = lastTransistionState
			currentDisc = diskHandling.disk.name
			val trans = '''
			<transition>
				<source ref="«lastTransistionState»"/>
				<target ref="«getIdOfLocation('''«diskHandling.disk.name»_get«(statement.variableValue.value as DiskSlotStateValue).value»Slot_«statementsIndexerShort.indexOf(statement)»''')»"/>
				<label kind="synchronisation">«diskHandling.disk.name»_get«(statement.variableValue.value as DiskSlotStateValue).value»Slot!</label>
				<label kind="assignment">GlobalTimer = 0</label>
			</transition>
			<transition>
				<source ref="«getIdOfLocation('''«diskHandling.disk.name»_get«(statement.variableValue.value as DiskSlotStateValue).value»Slot_«statementsIndexerShort.indexOf(statement)»''')»"/>
				<target ref="«getIdOfLocation('''«diskHandling.disk.name»_gottenSlot«(statement.variableValue.value as DiskSlotStateValue).value»_«statementsIndexerShort.indexOf(statement)»''')»"/>
				<label kind="synchronisation">«diskHandling.disk.name»_found«(statement.variableValue.value as DiskSlotStateValue).value»Slot?</label>
			</transition>
			«updateLastTrans('''«getIdOfLocation('''«diskHandling.disk.name»_gottenSlot«(statement.variableValue.value as DiskSlotStateValue).value»_«statementsIndexerShort.indexOf(statement)»''')»''')»
			«FOR s : statement.statements»
			«generateTransistion(s)»
			«ENDFOR»
			<transition>
				<source ref="«lastTransistionState»"/>
				<target ref="«returnTransistion»"/>
			</transition>
			<transition>
				<source ref="«getIdOfLocation('''«diskHandling.disk.name»_get«(statement.variableValue.value as DiskSlotStateValue).value»Slot_«statementsIndexerShort.indexOf(statement)»''')»"/>
				<target ref="«returnTransistion»"/>
				<label kind="guard">GlobalTimer &gt; 2</label>
			</transition>
			'''
			lastTransistionState = returnTransistion
			return trans
		}
		else if (statement instanceof LoopSlotS) {
			val returnTransistion = lastTransistionState
			currentDisc = diskHandling.disk.name
			val trans = '''
			<transition>
				<source ref="«lastTransistionState»"/>
				<target ref="«getIdOfLocation('''«diskHandling.disk.name»_get«(statement.slotValue.value as DiskSlotStateValue).value»Slot_«statementsIndexerShort.indexOf(statement)»''')»"/>
				<label kind="synchronisation">«diskHandling.disk.name»_get«(statement.slotValue.value as DiskSlotStateValue).value»Slot!</label>
				<label kind="assignment">GlobalTimer = 0</label>
			</transition>
			<transition>
				<source ref="«getIdOfLocation('''«diskHandling.disk.name»_get«(statement.slotValue.value as DiskSlotStateValue).value»Slot_«statementsIndexerShort.indexOf(statement)»''')»"/>
				<target ref="«getIdOfLocation('''«diskHandling.disk.name»_gottenSlot«(statement.slotValue.value as DiskSlotStateValue).value»_«statementsIndexerShort.indexOf(statement)»''')»"/>
				<label kind="synchronisation">«diskHandling.disk.name»_found«(statement.slotValue.value as DiskSlotStateValue).value»Slot?</label>
			</transition>
			«updateLastTrans('''«getIdOfLocation('''«diskHandling.disk.name»_gottenSlot«(statement.slotValue.value as DiskSlotStateValue).value»_«statementsIndexerShort.indexOf(statement)»''')»''')»
			«FOR s : statement.statements»
			«generateTransistion(s)»
			«ENDFOR»
			<transition>
				<source ref="«lastTransistionState»"/>
				<target ref="«returnTransistion»"/>
			</transition>
			<transition>
				<source ref="«getIdOfLocation('''«diskHandling.disk.name»_get«(statement.slotValue.value as DiskSlotStateValue).value»Slot_«statementsIndexerShort.indexOf(statement)»''')»"/>
				<target ref="«returnTransistion»"/>
				<label kind="guard">GlobalTimer &gt; 2</label>
			</transition>
			'''
			lastTransistionState = returnTransistion
			return trans
		}
	}
	
	// LONG
	def static dispatch String generateLocation(DeviceConditional statement) {
		var value = ""
		switch(statement.deviceValue.value){
			DiskStateValue:{
				value = (statement.deviceValue.value as DiskStateValue).value.toString
				if(statement.not_operator !== null && value === DISK_STATES.EMPTY.toString){
					value = DISK_STATES.FULL.toString
				}else if (statement.not_operator !== null && value === DISK_STATES.FULL.toString){
					value = DISK_STATES.EMPTY.toString
				}
			} 
			//Missing not implementation
			ColorValue: value = (statement.deviceValue.value as DiskStateValue).value.toString
		}
		'''
		<location id="«getIdOfLocation('''«statement.device.name»_get«value»_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_get«value»_«statementsIndexer.indexOf(statement)»</name>
			<label kind="invariant">GlobalTimer &lt; 10</label>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_Is«value»_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_Is«value»_«statementsIndexer.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_EndIf«value»_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_EndIf«value»_«statementsIndexer.indexOf(statement)»</name>
		</location>
		«FOR s : statement.statements»
		«generateLocation(s)»
		«ENDFOR»
		'''
	}
	
	def static dispatch String generateLocation(DiskWaitOperation statement){
		
	}
	
	def static dispatch String generateTransistion(DiskWaitOperation statement){
		
	}
	
	
	def static dispatch String generateTransistion(DeviceConditional statement) {
		var value = ""
		switch(statement.deviceValue.value){
			DiskStateValue:{
				value = (statement.deviceValue.value as DiskStateValue).value.toString
				if(statement.not_operator !== null && value === DISK_STATES.EMPTY.toString){
					value = DISK_STATES.FULL.toString
				}else if (statement.not_operator !== null && value === DISK_STATES.FULL.toString){
					value = DISK_STATES.EMPTY.toString
				}
			} 
			//Missing not implementation
			ColorValue: value = (statement.deviceValue.value as DiskStateValue).value.toString
		}
		currentDisc = statement.device.name
		var returnTransistion = ""
		if (statement.eContainer instanceof Model) {
			returnTransistion = lastTransistionState
		} else {
			returnTransistion = getIdOfLocation('''«statement.device.name»_EndIf«value»_«statementsIndexer.indexOf(statement)»''')
		}
		switch(statement.deviceValue.value){
			DiskStateValue:{
				val trans = '''
				<transition>
					<source ref="«lastTransistionState»"/>
					<target ref="«getIdOfLocation('''«statement.device.name»_get«value»_«statementsIndexer.indexOf(statement)»''')»"/>
					<label kind="synchronisation">«currentDisc»_get«value»Slot!</label>
					<label kind="assignment">GlobalTimer = 0</label>
				</transition>
				<transition>
					<source ref="«getIdOfLocation('''«statement.device.name»_get«value»_«statementsIndexer.indexOf(statement)»''')»"/>
					<target ref="«getIdOfLocation('''«statement.device.name»_Is«value»_«statementsIndexer.indexOf(statement)»''')»"/>
					<label kind="synchronisation">«currentDisc»_found«value»Slot?</label>
				</transition>
				«updateLastTrans('''«getIdOfLocation('''«statement.device.name»_Is«value»_«statementsIndexer.indexOf(statement)»''')»''')»
				«FOR s : statement.statements»
				«generateTransistion(s)»
				«ENDFOR»
				<transition>
					<source ref="«lastTransistionState»"/>
					<target ref="«returnTransistion»"/>
				</transition>
				<transition>
					<source ref="«getIdOfLocation('''«statement.device.name»_get«value»_«statementsIndexer.indexOf(statement)»''')»"/>
					<target ref="«returnTransistion»"/>
					<label kind="guard">GlobalTimer &gt; 2</label>
				</transition>
				''';
				lastTransistionState = returnTransistion
				return trans
				}
			default: throw new UnsupportedOperationException("This conditional value is not implemented yet")
		}
	}
	
	def static dispatch String generateLocation(VariableConditional statement) {
		'''
		<location id="«getIdOfLocation('''«statement.variable.name»_get«(statement.variableValue.value as ColorValue).value»_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.variable.name»_get«(statement.variableValue.value as ColorValue).value»_«statementsIndexer.indexOf(statement)»</name>
			<label kind="invariant">GlobalTimer &lt; 10</label>
		</location>
		<location id="«getIdOfLocation('''«statement.variable.name»_Is«(statement.variableValue.value as ColorValue).value»_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.variable.name»_Is«(statement.variableValue.value as ColorValue).value»_«statementsIndexer.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.variable.name»_EndIf«(statement.variableValue.value as ColorValue).value»_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.variable.name»_EndIf«(statement.variableValue.value as ColorValue).value»_«statementsIndexer.indexOf(statement)»</name>
		</location>
		«FOR s : statement.statements»
		«generateLocation(s)»
		«ENDFOR»
		'''
		/*
		<location id="«getIdOfLocation('''EndIf_«statementsIndexer.indexOf(statement)»''')»">
			<name>EndIf_«statementsIndexer.indexOf(statement)»</name>
		</location>*/
	}
	
	def static dispatch String generateTransistion(VariableConditional statement){
		val returnTransistion = getIdOfLocation('''«statement.variable.name»_EndIf«(statement.variableValue.value as ColorValue).value»_«statementsIndexer.indexOf(statement)»''')
		switch(statement.variableValue.value){
			ColorValue:{
				val trans = '''
				<transition>
					<source ref="«lastTransistionState»"/>
					<target ref="«getIdOfLocation('''«statement.variable.name»_get«(statement.variableValue.value as ColorValue).value»_«statementsIndexer.indexOf(statement)»''')»"/>
					<label kind="synchronisation">«currentDisc»_getColourSlot[currentSlot]!</label>
					<label kind="assignment">GlobalTimer = 0</label>
				</transition>
				<transition>
					<source ref="«getIdOfLocation('''«statement.variable.name»_get«(statement.variableValue.value as ColorValue).value»_«statementsIndexer.indexOf(statement)»''')»"/>
					<target ref="«getIdOfLocation('''«statement.variable.name»_Is«(statement.variableValue.value as ColorValue).value»_«statementsIndexer.indexOf(statement)»''')»"/>
					<label kind="guard">currentSlot_colour == «EnumParser.ColourToInt((statement.variableValue.value as ColorValue).value)»</label>
					<label kind="synchronisation">«currentDisc»_gottenColourSlot?</label>
				</transition>
				«updateLastTrans('''«getIdOfLocation('''«statement.variable.name»_Is«(statement.variableValue.value as ColorValue).value»_«statementsIndexer.indexOf(statement)»''')»''')»
				«FOR s : statement.statements»
				«generateTransistion(s)»
				«ENDFOR»
				<transition>
					<source ref="«lastTransistionState»"/>
					<target ref="«returnTransistion»"/>
				</transition>
				<transition>
					<source ref="«getIdOfLocation('''«statement.variable.name»_get«(statement.variableValue.value as ColorValue).value»_«statementsIndexer.indexOf(statement)»''')»"/>
					<target ref="«returnTransistion»"/>
					<label kind="guard">currentSlot_colour != «EnumParser.ColourToInt((statement.variableValue.value as ColorValue).value)»</label>
					<label kind="synchronisation">«currentDisc»_gottenColourSlot?</label>
				</transition>
				''';
				lastTransistionState = returnTransistion
				return trans
				}
			default: throw new UnsupportedOperationException("This conditional value is not implemented yet")
		}
	}
	
	def static dispatch String generateLocation(CranePickupOperation statement) {
		'''
		<location id="«getIdOfLocation('''«statement.device.name»_goto_«(statement.target as CranePositionParameter).name»_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_goto_«(statement.target as CranePositionParameter).name»_«statementsIndexer.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_lower_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_lower_«statementsIndexer.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_toggleMagnet_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_toggleMagnet_«statementsIndexer.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_raise_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_raise_«statementsIndexer.indexOf(statement)»</name>
		</location>
		'''
	}
	
	def static dispatch String generateTransistion(CranePickupOperation statement){
		val trans = '''
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_goto_«(statement.target as CranePositionParameter).name»_«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_goto_«(statement.target as CranePositionParameter).name»!</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_goto_«(statement.target as CranePositionParameter).name»_«statementsIndexer.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_lower_«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_lowerMagnet!</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_lower_«statementsIndexer.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_toggleMagnet_«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_toggleMagnet!</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_toggleMagnet_«statementsIndexer.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_raise_«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_raiseMagnet!</label>
		</transition>
		''';
		lastTransistionState = getIdOfLocation('''«statement.device.name»_raise_«statementsIndexer.indexOf(statement)»''')
		return trans
	}
	
	def static dispatch String generateLocation(CraneDropOperation statement) {
		'''
		<location id="«getIdOfLocation('''«statement.device.name»_goto_«(statement.target as CranePositionParameter).name»_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_goto_«(statement.target as CranePositionParameter).name»_«statementsIndexer.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_lower_«(statement.target as CranePositionParameter).name»_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_lower_«(statement.target as CranePositionParameter).name»_«statementsIndexer.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_toggleMagnet_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_toggleMagnet_«statementsIndexer.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_raise_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_raise_«statementsIndexer.indexOf(statement)»</name>
		</location>
		'''
	}
	
	def static dispatch String generateTransistion(CraneDropOperation statement){
		val trans = '''
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_goto_«(statement.target as CranePositionParameter).name»_«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_goto_«(statement.target as CranePositionParameter).name»!</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_goto_«(statement.target as CranePositionParameter).name»_«statementsIndexer.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_lower_«(statement.target as CranePositionParameter).name»_«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_lowerMagnet!</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_lower_«(statement.target as CranePositionParameter).name»_«statementsIndexer.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_toggleMagnet_«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_toggleMagnet!</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_toggleMagnet_«statementsIndexer.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_raise_«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_raiseMagnet!</label>
		</transition>
		''';
		lastTransistionState = getIdOfLocation('''«statement.device.name»_raise_«statementsIndexer.indexOf(statement)»''')
		return trans
	}
	
	def static dispatch String generateLocation(DiskMoveSlotOperation statement) {
		'''
		<location id="«getIdOfLocation('''«statement.device.name»_goto_«statement.target.name»_statement«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_goto_«statement.target.name»_statement«statementsIndexer.indexOf(statement)»</name>
		</location>
		'''
	}
	
	def static dispatch String generateTransistion(DiskMoveSlotOperation statement){
		val trans = '''
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_goto_«statement.target.name»_statement«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_goto[(«statement.device.name»_zones_«statement.target.name» + currentSlot) % «statement.device.name»_numberOfSlots]!</label>
		</transition>
		'''
		lastTransistionState = getIdOfLocation('''«statement.device.name»_goto_«statement.target.name»_statement«statementsIndexer.indexOf(statement)»''')
		return trans
	}
	
	def static dispatch String generateLocation(DiskMoveVariableSlotOperation statement) {
		'''
		<location id="«getIdOfLocation('''«statement.device.name»_goto_«statement.target.name»_statment«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»goto_«statement.target.name»_statment«statementsIndexer.indexOf(statement)»</name>
		</location>
		'''
	}
	
	def static dispatch String generateTransistion(DiskMoveVariableSlotOperation statement){
		val trans = '''
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_goto_«statement.target.name»_statment«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_goto[(«statement.device.name»_zones_«statement.target.name» + currentSlot) % «statement.device.name»_numberOfSlots]!</label>
		</transition>
		'''
		lastTransistionState = getIdOfLocation('''«statement.device.name»_goto_«statement.target.name»_statment«statementsIndexer.indexOf(statement)»''')
		return trans
	}
	
	def static dispatch String generateLocation(DiskMoveEmptySlotOperation statement) {
		'''
		<location id="«getIdOfLocation('''«statement.device.name»_getemptySlot_statement«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_getemptySlot_statment«statementsIndexer.indexOf(statement)»</name>
			<committed/>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_gottenemptySlot_statement«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_gottenemptySlot_statment«statementsIndexer.indexOf(statement)»</name>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_goto_«statement.target.name»_statement«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_goto_«statement.target.name»_statment«statementsIndexer.indexOf(statement)»</name>
		</location>
		'''
	}
	
	def static dispatch String generateTransistion(DiskMoveEmptySlotOperation statement) {
		val trans = '''
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_getemptySlot_statement«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_getemptySlot!</label>
			<label kind="assignment">GlobalTimer = 0</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_getemptySlot_statement«statementsIndexer.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_gottenemptySlot_statement«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_foundemptySlot?</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_gottenemptySlot_statement«statementsIndexer.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_goto_«statement.target.name»_statement«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_goto[(«statement.device.name»_zones_«statement.target.name» + currentSlot) % «statement.device.name»_numberOfSlots]!</label>
		</transition>
		'''
		lastTransistionState = getIdOfLocation('''«statement.device.name»_goto_«statement.target.name»_statement«statementsIndexer.indexOf(statement)»''')
		currentDisc = statement.device.name
		return trans
	}
	
	
	def static dispatch String generateLocation(DiskMarkSlotOperation statement) {
		var value = ""
		switch(statement.diskSlotValue.value){
			DiskSlotStateValue: value = (statement.diskSlotValue.value as DiskSlotStateValue).value.toString
			ColorValue: value = (statement.diskSlotValue.value as ColorValue).value.toString
			default: value = "Colour"
		}
		'''
		«IF statement.quantity > 0»
		<location id="«getIdOfLocation('''«statement.device.name»_markSlot«value»In«statement.quantity»«statement.measure»_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_markSlot«value»In«statement.quantity»«statement.measure»_«statementsIndexer.indexOf(statement)»</name>
		</location>
		«ENDIF»
		«IF value === "free" »
		<location id="«getIdOfLocation('''«statement.device.name»_markSlotopposite_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_markSlotempty_«statementsIndexer.indexOf(statement)»</name>
		</location>
		«ENDIF»
		«IF value === "empty" »
		<location id="«getIdOfLocation('''«statement.device.name»_markSlotopposite_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_markSlotfree_«statementsIndexer.indexOf(statement)»</name>
		</location>
		«ENDIF»
		«IF value === "in_progress" »
		<location id="«getIdOfLocation('''«statement.device.name»_markSlotfull_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_markSlotfull_«statementsIndexer.indexOf(statement)»</name>
		</location>
		«ENDIF»
		<location id="«getIdOfLocation('''«statement.device.name»_markSlot«value»_statement«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_markSlot«value»_statement«statementsIndexer.indexOf(statement)»</name>
		</location>
		'''
	}
	
	def static dispatch String generateTransistion(DiskMarkSlotOperation statement) {
		var value = ""
		switch(statement.diskSlotValue.value){
			DiskSlotStateValue: value = (statement.diskSlotValue.value as DiskSlotStateValue).value.toString
			ColorValue: value = (statement.diskSlotValue.value as ColorValue).value.toString
			default: value = "Colour"
		}
		val trans = '''
		«IF statement.quantity > 0»
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_markSlot«value»In«statement.quantity»«statement.measure»_«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="assignment">timer = 0</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_markSlot«value»In«statement.quantity»«statement.measure»_«statementsIndexer.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_markSlot«value»_statement«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="guard">timer &gt;= «statement.quantity»</label>
			«IF value === "Colour"»
			<label kind="synchronisation">«statement.device.name»_set«value»[currentSlot][colour]!</label>
			«ELSE»
			<label kind="synchronisation">«statement.device.name»_set_«value»[currentSlot]!</label>
			«ENDIF»
		</transition>
		«ELSE»
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_markSlot«value»_statement«statementsIndexer.indexOf(statement)»''')»"/>
			«IF value === "Colour"»
			<label kind="synchronisation">«statement.device.name»_set«value»[currentSlot][colour]!</label>
			«ELSE»
			<label kind="synchronisation">«statement.device.name»_set_«value»[currentSlot]!</label>
			«ENDIF»
		</transition>
		«ENDIF»
		«IF value === "free" || value == "empty"»
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_markSlot«value»_statement«statementsIndexer.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_markSlotopposite_«statementsIndexer.indexOf(statement)»''')»"/>
			«IF value === "free" »
			<label kind="synchronisation">«statement.device.name»_removeItemCmd!</label>
			«ELSE»
			<label kind="synchronisation">«statement.device.name»_set_free[currentSlot]!</label>
			«ENDIF»
		</transition>
		«ENDIF»
		«IF value === "in_progress"»
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_markSlot«value»_statement«statementsIndexer.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_markSlotfull_«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_addItemCmd!</label>
		</transition>
		«ENDIF»
		'''
		
		lastTransistionState = getIdOfLocation('''«statement.device.name»_markSlot«value»_statement«statementsIndexer.indexOf(statement)»''')
		if (value === "free" || value == "empty") {
			lastTransistionState = getIdOfLocation('''«statement.device.name»_markSlotopposite_«statementsIndexer.indexOf(statement)»''')
		} else if (value == "in_progress"){
			lastTransistionState = getIdOfLocation('''«statement.device.name»_markSlotfull_«statementsIndexer.indexOf(statement)»''')
		}
		return trans
	}
	
	def static dispatch String generateLocation(CameraScanOperation statement) {
		'''
		<location id="«getIdOfLocation('''«statement.device.name»_scanItem_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_scanItem_«statementsIndexer.indexOf(statement)»</name>
			<committed/>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_itemColour_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_itemColour_«statementsIndexer.indexOf(statement)»</name>
		</location>
		'''
	}
	
	def static dispatch String generateTransistion(CameraScanOperation statement) {
		val trans = '''
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_scanItem_«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_getColour!</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_scanItem_«statementsIndexer.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_itemColour_«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_gottenColour?</label>
		</transition>
		'''
		lastTransistionState = getIdOfLocation('''«statement.device.name»_itemColour_«statementsIndexer.indexOf(statement)»''')
		return trans
	}
	
	def static dispatch String generateLocation(ForEach statement) {
		'''
		<location id="«getIdOfLocation('''«statement.device.name»_get«(statement.variableValue.value as DiskSlotStateValue).value»Slot_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_get«(statement.variableValue.value as DiskSlotStateValue).value»Slot_«statementsIndexer.indexOf(statement)»</name>
			<committed/>
		</location>
		<location id="«getIdOfLocation('''«statement.device.name»_gottenSlot«(statement.variableValue.value as DiskSlotStateValue).value»_«statementsIndexer.indexOf(statement)»''')»">
			<name>«statement.device.name»_gottenSlot«(statement.variableValue.value as DiskSlotStateValue).value»_«statementsIndexer.indexOf(statement)»</name>
		</location>
		«FOR s : statement.statements»
		«generateLocation(s)»
		«ENDFOR»
		'''
	}
	
	def static dispatch String generateTransistion(ForEach statement) {
		val returnTransistion = lastTransistionState
		currentDisc = statement.device.name
		val trans = '''
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_get«(statement.variableValue.value as DiskSlotStateValue).value»Slot_«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_get«(statement.variableValue.value as DiskSlotStateValue).value»Slot!</label>
			<label kind="assignment">GlobalTimer = 0</label>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_get«(statement.variableValue.value as DiskSlotStateValue).value»Slot_«statementsIndexer.indexOf(statement)»''')»"/>
			<target ref="«getIdOfLocation('''«statement.device.name»_gottenSlot«(statement.variableValue.value as DiskSlotStateValue).value»_«statementsIndexer.indexOf(statement)»''')»"/>
			<label kind="synchronisation">«statement.device.name»_found«(statement.variableValue.value as DiskSlotStateValue).value»Slot?</label>
		</transition>
		«updateLastTrans('''«getIdOfLocation('''«statement.device.name»_gottenSlot«(statement.variableValue.value as DiskSlotStateValue).value»_«statementsIndexer.indexOf(statement)»''')»''')»
		«FOR s : statement.statements»
		«generateTransistion(s)»
		«ENDFOR»
		<transition>
			<source ref="«lastTransistionState»"/>
			<target ref="«returnTransistion»"/>
		</transition>
		<transition>
			<source ref="«getIdOfLocation('''«statement.device.name»_get«(statement.variableValue.value as DiskSlotStateValue).value»Slot_«statementsIndexer.indexOf(statement)»''')»"/>
			<target ref="«returnTransistion»"/>
			<label kind="guard">GlobalTimer &gt; 2</label>
		</transition>
		'''
		lastTransistionState = returnTransistion
		return trans
	}
	
	def static String updateLastTrans(String newValue){
		lastTransistionState = newValue
		return ""
	}
}

