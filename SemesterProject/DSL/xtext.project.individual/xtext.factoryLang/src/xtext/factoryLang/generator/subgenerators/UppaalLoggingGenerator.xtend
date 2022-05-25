package xtext.factoryLang.generator.subgenerators

import xtext.factoryLang.factoryLang.CraneS
import xtext.factoryLang.factoryLang.DiskS
import xtext.factoryLang.factoryLang.CameraS
import xtext.factoryLang.factoryLang.LOGGING_TYPE_ENUM_S
import java.util.List
import xtext.factoryLang.factoryLang.DeviceS

class UppaalLoggingGenerator {
	def static String generate(List<DeviceS> devices) {
		val initState = "NoLogging"
		return
		'''
		<template>
		<name>Logging</name>
		<declaration>
		</declaration>
		<location id="«UppaalGenerator.getIdOfLocation(initState)»">
			<name>NoLogging</name>
		</location>
		<init ref="«UppaalGenerator.getIdOfLocation(initState)»"/>
		«FOR device : devices»
			«IF device instanceof CraneS»
				«UppaalLoggingGenerator.generate(initState, device as CraneS)»
			«ELSEIF device instanceof DiskS»
				«UppaalLoggingGenerator.generate(initState, device as DiskS)»
			«ELSE»
				«UppaalLoggingGenerator.generate(initState, device as CameraS)»
			«ENDIF»
		«ENDFOR»
		</template>
		'''
	}
	
	def static dispatch String generate(String initState, CraneS crane) {
		val loggingType = crane.logging.loggingType.value
		var result = ''''''
		/*switch loggingType {
			case LOGGING_TYPE_ENUM_S.INFO: {
				result =
				'''
				<template>
				<name>«crane.name»_LoggingInfo</name>
				<location id="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOff")»">
					<name>«crane.name»_MagnetOff</name>
				</location>
				</template>
				'''
			}
			case LOGGING_TYPE_ENUM_S.WARNING: {
				result =
				'''
				<template>
				<name>«crane.name»_</name>
				</template>
				'''
			}
			case LOGGING_TYPE_ENUM_S.ERROR: {
				result =
				'''
				<template>
				<name>«crane.name»_</name>
				</template>
				'''
			}
			default: result = ''''''
			
		}*/
		
		return
		'''
		<location id="«UppaalGenerator.getIdOfLocation(crane.name + "_Logging")»">
			<name>«crane.name»_Logging</name>
		</location>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(initState)»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(crane.name + "_Logging")»"/>
			<label kind="synchronisation">«crane.name»_Log!</label>
		</transition>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(crane.name + "_Logging")»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(initState)»"/>
			<label kind="synchronisation">«crane.name»_NoLog!</label>
		</transition>
		'''	
	}
	
	def static dispatch String generate(String initState, DiskS disk) {
		return
		'''
		<location id="«UppaalGenerator.getIdOfLocation(disk.name + "_Logging")»">
			<name>«disk.name»_Logging</name>
		</location>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(initState)»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(disk.name + "_Logging")»"/>
			<label kind="synchronisation">«disk.name»_Log!</label>
		</transition>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(disk.name + "_Logging")»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(initState)»"/>
			<label kind="synchronisation">«disk.name»_NoLog!</label>
		</transition>
		'''
	}
	
	def static dispatch String generate(String initState, CameraS camera) {
		return
		'''
		<location id="«UppaalGenerator.getIdOfLocation(camera.name + "_Logging")»">
			<name>«camera.name»_Logging</name>
		</location>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(initState)»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(camera.name + "_Logging")»"/>
			<label kind="synchronisation">«camera.name»_Log!</label>
		</transition>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(camera.name + "_Logging")»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(initState)»"/>
			<label kind="synchronisation">«camera.name»_NoLog!</label>
		</transition>
		'''
	}
}