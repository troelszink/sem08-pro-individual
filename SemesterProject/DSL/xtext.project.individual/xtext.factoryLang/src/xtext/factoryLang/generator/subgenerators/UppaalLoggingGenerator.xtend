package xtext.factoryLang.generator.subgenerators

import xtext.factoryLang.factoryLang.CraneS
import xtext.factoryLang.factoryLang.DiskS
import xtext.factoryLang.factoryLang.CameraS
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
		«FOR device : devices»
			«IF device instanceof CraneS»
				«UppaalLoggingGenerator.generateLocation(initState, device as CraneS)»
			«ELSEIF device instanceof DiskS»
				«UppaalLoggingGenerator.generateLocation(initState, device as DiskS)»
			«ELSE»
				«UppaalLoggingGenerator.generateLocation(initState, device as CameraS)»
			«ENDIF»
		«ENDFOR»
		<init ref="«UppaalGenerator.getIdOfLocation(initState)»"/>
		«FOR device : devices»
			«IF device instanceof CraneS»
				«UppaalLoggingGenerator.generateTransition(initState, device as CraneS)»
			«ELSEIF device instanceof DiskS»
				«UppaalLoggingGenerator.generateTransition(initState, device as DiskS)»
			«ELSE»
				«UppaalLoggingGenerator.generateTransition(initState, device as CameraS)»
			«ENDIF»
		«ENDFOR»
		</template>
		'''
	}
	
	def static dispatch String generateLocation(String initState, CraneS crane) {
		return
		'''
		<location id="«UppaalGenerator.getIdOfLocation(crane.name + "_Logging")»">
			<name>«crane.name»_Logging</name>
		</location>
		'''	
	}
	
	def static dispatch String generateTransition(String initState, CraneS crane) {
		return
		'''
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
	
	def static dispatch String generateLocation(String initState, DiskS disk) {
		return
		'''
		<location id="«UppaalGenerator.getIdOfLocation(disk.name + "_Logging")»">
			<name>«disk.name»_Logging</name>
		</location>
		'''
	}
	
	def static dispatch String generateTransition(String initState, DiskS disk) {
		return
		'''
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
	
	def static dispatch String generateLocation(String initState, CameraS camera) {
		return
		'''
		<location id="«UppaalGenerator.getIdOfLocation(camera.name + "_Logging")»">
			<name>«camera.name»_Logging</name>
		</location>
		'''
	}
	
	def static dispatch String generateTransition(String initState, CameraS camera) {
		return
		'''
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