package xtext.factoryLang.generator.subgenerators

import xtext.factoryLang.factoryLang.Camera
import xtext.factoryLang.factoryLang.CameraS
import xtext.factoryLang.factoryLang.LOGGING_TYPE_ENUM_S
import xtext.factoryLang.factoryLang.FactoryLangPackage.Literals

class CameraGenerator {
	def static String generateShort(CameraS camera){
		return 
		'''
		<template>
		    <name>«camera.name»</name>
		    <location id="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»">
		        <name>«camera.name»_Idle</name>
		    </location>
		    <location id="«UppaalGenerator.getIdOfLocation(camera.name+"_Red")»">
		        <name>«camera.name»_Red</name>
		        <committed/>
		    </location>
		    <location id="«UppaalGenerator.getIdOfLocation(camera.name+"_Green")»">
		        <name>«camera.name»_Green</name>
		        <committed/>
		    </location>
		    <location id="«UppaalGenerator.getIdOfLocation(camera.name+"_Blue")»">
		        <name>«camera.name»_Blue</name>
		        <committed/>
		    </location>
		    «IF camera.eIsSet(Literals.DEVICE_S__LOGGING)»
		 		«generateLoggingLocation(camera, camera.logging.loggingType.value)»
		 	«ENDIF»
		    <init ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
		    <transition>
		        <source ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Blue")»"/>
		        <target ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
		        <label kind="synchronisation">«camera.name»_gottenColour!</label>
		    </transition>
		    <transition>
		        <source ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
		        <target ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Blue")»"/>
		        <label kind="synchronisation">«camera.name»_getColour?</label>
		        <label kind="assignment">colour = 3</label>
		    </transition>
		    <transition>
		        <source ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Green")»"/>
		        <target ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
		        <label kind="synchronisation">«camera.name»_gottenColour!</label>
		    </transition>
		    <transition>
		        <source ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
		        <target ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Green")»"/>
		        <label kind="synchronisation">«camera.name»_getColour?</label>
		        <label kind="assignment">colour=2</label>
		    </transition>
		    <transition>
		        <source ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Red")»"/>
		        <target ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
		        <label kind="synchronisation">«camera.name»_gottenColour!</label>
		    </transition>
		    <transition>
		        <source ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
		        <target ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Red")»"/>
		        <label kind="synchronisation">«camera.name»_getColour?</label>
		        <label kind="assignment">colour = 1</label>
		    </transition>
		 	
		 	«IF camera.eIsSet(Literals.DEVICE_S__LOGGING)»
		 		«generateLoggingTransition(camera, camera.logging.loggingType.value)»
		 	«ENDIF»
		</template>
		'''
	}
	
	def static String generateLoggingLocation(CameraS camera, LOGGING_TYPE_ENUM_S loggingType) {
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
		<location id="«UppaalGenerator.getIdOfLocation(camera.name + "_Logging" + loggingTypeName)»">
			<name>«camera.name»_Logging«loggingTypeName»</name>
			<committed/>
		</location>
		'''
	}
	
	def static String generateLoggingTransition(CameraS camera, LOGGING_TYPE_ENUM_S loggingType) {
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
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(camera.name + "_Logging" + loggingTypeName)»"/>
			<label kind="synchronisation">«camera.name»_Log?</label>
		</transition>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(camera.name + "_Logging" + loggingTypeName)»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
			<label kind="synchronisation">«camera.name»_NoLog?</label>
		</transition>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Red")»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(camera.name + "_Logging" + loggingTypeName)»"/>
			<label kind="synchronisation">«camera.name»_Log?</label>
		</transition>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(camera.name + "_Logging" + loggingTypeName)»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Red")»"/>
			<label kind="synchronisation">«camera.name»_NoLog?</label>
		</transition>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Green")»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(camera.name + "_Logging" + loggingTypeName)»"/>
			<label kind="synchronisation">«camera.name»_Log?</label>
		</transition>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(camera.name + "_Logging" + loggingTypeName)»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Green")»"/>
			<label kind="synchronisation">«camera.name»_NoLog?</label>
		</transition>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Blue")»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(camera.name + "_Logging" + loggingTypeName)»"/>
			<label kind="synchronisation">«camera.name»_Log?</label>
		</transition>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(camera.name + "_Blue" + loggingTypeName)»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
			<label kind="synchronisation">«camera.name»_NoLog?</label>
		</transition>
		'''
	}
	
	def static String generateLong(Camera camera){
		return 
		'''
		<template>
		    <name>«camera.name»</name>
		    <location id="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»">
		        <name>«camera.name»_Idle</name>
		    </location>
		    <location id="«UppaalGenerator.getIdOfLocation(camera.name+"_Red")»">
		        <name>«camera.name»_Red</name>
		        <committed/>
		    </location>
		    <location id="«UppaalGenerator.getIdOfLocation(camera.name+"_Green")»">
		        <name>«camera.name»_Green</name>
		        <committed/>
		    </location>
		    <location id="«UppaalGenerator.getIdOfLocation(camera.name+"_Blue")»">
		        <name>«camera.name»_Blue</name>
		        <committed/>
		    </location>
		    <init ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
		    <transition>
		        <source ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Blue")»"/>
		        <target ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
		        <label kind="synchronisation">«camera.name»_gottenColour!</label>
		    </transition>
		    <transition>
		        <source ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
		        <target ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Blue")»"/>
		        <label kind="synchronisation">«camera.name»_getColour?</label>
		        <label kind="assignment">colour = 3</label>
		    </transition>
		    <transition>
		        <source ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Green")»"/>
		        <target ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
		        <label kind="synchronisation">«camera.name»_gottenColour!</label>
		    </transition>
		    <transition>
		        <source ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
		        <target ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Green")»"/>
		        <label kind="synchronisation">«camera.name»_getColour?</label>
		        <label kind="assignment">colour=2</label>
		    </transition>
		    <transition>
		        <source ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Red")»"/>
		        <target ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
		        <label kind="synchronisation">«camera.name»_gottenColour!</label>
		    </transition>
		    <transition>
		        <source ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Idle")»"/>
		        <target ref="«UppaalGenerator.getIdOfLocation(camera.name+"_Red")»"/>
		        <label kind="synchronisation">«camera.name»_getColour?</label>
		        <label kind="assignment">colour = 1</label>
		    </transition>
		</template>
		'''
	}
}