package xtext.factoryLang.generator.subgenerators

import xtext.factoryLang.factoryLang.Crane
import xtext.factoryLang.factoryLang.CraneZoneS
import xtext.factoryLang.factoryLang.CraneS
import xtext.factoryLang.factoryLang.CranePositionParameter
import xtext.factoryLang.factoryLang.LOGGING_TYPE_ENUM_S
import xtext.factoryLang.factoryLang.FactoryLangPackage.Literals

class UppaalCraneGenerator {
	def static String generateUppaalCraneTemplateShort(CraneS crane){
		return 
		'''
		<template>
			<name>«crane.name»</name>
			<declaration>
			</declaration>
			«FOR position : crane.targets»
			<location id="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (position as CraneZoneS).name)»">
				<name>«crane.name»_«(position as CraneZoneS).name»</name>
			</location>
			<location id="«UppaalGenerator.getIdOfLocation(crane.name + "_LoweredAt" + (position as CraneZoneS).name)»">
				<name>«crane.name»_LoweredAt«(position as CraneZoneS).name»</name>
			</location>
			«ENDFOR»
			<location id="«UppaalGenerator.getIdOfLocation(crane.name + "_Stopped")»">
				<name>«crane.name»_Stopped</name>
			</location>
			«IF crane.eIsSet(Literals.DEVICE_S__LOGGING)»
		 		«generateLoggingLocation(crane, crane.logging.loggingType.value)»
		 	«ENDIF»
			<init ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (crane.targets.get(0) as CraneZoneS).name)»"/>
			«FOR position : crane.targets»
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (position as CraneZoneS).name)»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (position as CraneZoneS).name)»"/>
				<label kind="synchronisation">«crane.name»_goto_«(position as CraneZoneS).name»?</label>
			</transition>
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (position as CraneZoneS).name)»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_Stopped")»"/>
				<label kind="synchronisation">emergencyStop?</label>
			</transition>
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_LoweredAt" + (position as CraneZoneS).name)»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_Stopped")»"/>
				<label kind="synchronisation">emergencyStop?</label>
			</transition>
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (position as CraneZoneS).name)»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_LoweredAt" + (position as CraneZoneS).name)»"/>
				<label kind="synchronisation">«crane.name»_lowerMagnet?</label>
			</transition>
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_LoweredAt" + (position as CraneZoneS).name)»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (position as CraneZoneS).name)»"/>
				<label kind="synchronisation">«crane.name»_raiseMagnet?</label>
			</transition>
			«FOR otherposition : crane.targets»
			«IF otherposition != position»
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (position as CraneZoneS).name)»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (otherposition as CraneZoneS).name)»"/>
				<label kind="synchronisation">«crane.name»_goto_«(otherposition as CraneZoneS).name»?</label>
			</transition>
			«ENDIF»
			«ENDFOR»
			«ENDFOR»
			
			«IF crane.eIsSet(Literals.DEVICE_S__LOGGING)»
		 		«generateLoggingTransition(crane, crane.logging.loggingType.value)»
		 	«ENDIF»
		</template>
		'''
	}
	
	def static String generateLoggingLocation(CraneS crane, LOGGING_TYPE_ENUM_S loggingType) {
		var loggingTypeName = ""
		switch loggingType {
			case LOGGING_TYPE_ENUM_S.INFO:
				loggingTypeName = "Info"
			case LOGGING_TYPE_ENUM_S.WARNING:
				loggingTypeName = "Warning"
			case LOGGING_TYPE_ENUM_S.ERROR:
				loggingTypeName = "Error"
			default:
				loggingTypeName = "All"
		}
		return
		'''
		<location id="«UppaalGenerator.getIdOfLocation(crane.name + "_Logging" + loggingTypeName)»">
			<name>«crane.name»_Logging«loggingTypeName»</name>
			<committed/>
		</location>
		'''
	}
	
	def static String generateLoggingTransition(CraneS crane, LOGGING_TYPE_ENUM_S loggingType) {
		var loggingTypeName = ""
		switch loggingType {
			case LOGGING_TYPE_ENUM_S.INFO:
				loggingTypeName = "Info"
			case LOGGING_TYPE_ENUM_S.WARNING:
				loggingTypeName = "Warning"
			case LOGGING_TYPE_ENUM_S.ERROR:
				loggingTypeName = "Error"
			default:
				loggingTypeName = "All"
		}
		return
		'''
		«FOR position : crane.targets»
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (position as CraneZoneS).name)»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_Logging" + loggingTypeName)»"/>
			<label kind="synchronisation">«crane.name»_Log?</label>
		</transition>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_Logging" + loggingTypeName)»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (position as CraneZoneS).name)»"/>
			<label kind="synchronisation">«crane.name»_NoLog?</label>
		</transition>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_LoweredAt" + (position as CraneZoneS).name)»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_Logging" + loggingTypeName)»"/>
			<label kind="synchronisation">«crane.name»_Log?</label>
		</transition>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_Logging" + loggingTypeName)»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_LoweredAt" + (position as CraneZoneS).name)»"/>
			<label kind="synchronisation">«crane.name»_NoLog?</label>
		</transition>
		«ENDFOR»
		'''
	}
	
	def static String generateUppaalCraneTemplateLong(Crane crane){
		return 
		'''
		<template>
			<name>«crane.name»</name>
			<declaration>
			</declaration>
			«FOR position : crane.targets»
			<location id="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (position as CranePositionParameter).name)»">
				<name>«crane.name»_«(position as CranePositionParameter).name»</name>
			</location>
			<location id="«UppaalGenerator.getIdOfLocation(crane.name + "_LoweredAt" + (position as CranePositionParameter).name)»">
				<name>«crane.name»_LoweredAt«(position as CranePositionParameter).name»</name>
			</location>
			«ENDFOR»
			<location id="«UppaalGenerator.getIdOfLocation(crane.name + "_Stopped")»">
				<name>«crane.name»_Stopped</name>
			</location>
			<init ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (crane.targets.get(0) as CranePositionParameter).name)»"/>
			«FOR position : crane.targets»
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (position as CranePositionParameter).name)»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (position as CranePositionParameter).name)»"/>
				<label kind="synchronisation">«crane.name»_goto_«(position as CranePositionParameter).name»?</label>
			</transition>
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (position as CranePositionParameter).name)»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_Stopped")»"/>
				<label kind="synchronisation">emergencyStop?</label>
			</transition>
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_LoweredAt" + (position as CranePositionParameter).name)»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_Stopped")»"/>
				<label kind="synchronisation">emergencyStop?</label>
			</transition>
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (position as CranePositionParameter).name)»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_LoweredAt" + (position as CranePositionParameter).name)»"/>
				<label kind="synchronisation">«crane.name»_lowerMagnet?</label>
			</transition>
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_LoweredAt" + (position as CranePositionParameter).name)»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (position as CranePositionParameter).name)»"/>
				<label kind="synchronisation">«crane.name»_raiseMagnet?</label>
			</transition>
			«FOR otherposition : crane.targets»
			«IF otherposition != position»
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (position as CranePositionParameter).name)»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_" + (otherposition as CranePositionParameter).name)»"/>
				<label kind="synchronisation">«crane.name»_goto_«(otherposition as CranePositionParameter).name»?</label>
			</transition>
			«ENDIF»
			«ENDFOR»
			«ENDFOR»
		</template>
		'''
	}
}