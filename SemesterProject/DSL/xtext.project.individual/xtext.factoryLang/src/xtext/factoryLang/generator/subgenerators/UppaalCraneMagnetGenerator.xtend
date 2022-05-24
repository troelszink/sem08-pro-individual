package xtext.factoryLang.generator.subgenerators

import xtext.factoryLang.factoryLang.Crane
import xtext.factoryLang.factoryLang.CraneS

class UppaalCraneMagnetGenerator {
	def static String generateUppaalCraneMagnetTemplateShort(CraneS crane){
		return '''
		<template>
			<name>«crane.name»_CraneMagnet</name>
			<location id="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOff")»">
				<name>«crane.name»_MagnetOff</name>
			</location>
			<location id="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOn")»">
				<name>«crane.name»_MagnetOn</name>
			</location>
			<location id="«UppaalGenerator.getIdOfLocation(crane.name+"_StoppedMagnetOn")»">
				<name>«crane.name»_StoppedMagnetOn</name>
			</location>
			<location id="«UppaalGenerator.getIdOfLocation(crane.name+"_StoppedMagnetOff")»">
				<name>«crane.name»_StoppedMagnetOff</name>
			</location>
			<init ref="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOff")»"/>
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOn")»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name+"_StoppedMagnetOff")»"/>
				<label kind="synchronisation">emergencyStop?</label>
			</transition>
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOff")»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name+"_StoppedMagnetOn")»"/>
				<label kind="synchronisation">emergencyStop?</label>
			</transition>
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOn")»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOff")»"/>
				<label kind="synchronisation">«crane.name»_toggleMagnet?</label>
			</transition>
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOff")»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOn")»"/>
				<label kind="synchronisation">«crane.name»_toggleMagnet?</label>
			</transition>
		</template>
		'''
	}
	
	def static String generateUppaalCraneMagnetTemplateLong(Crane crane){
		return '''
		<template>
			<name>«crane.name»_CraneMagnet</name>
			<location id="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOff")»">
				<name>«crane.name»_MagnetOff</name>
			</location>
			<location id="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOn")»">
				<name>«crane.name»_MagnetOn</name>
			</location>
			<location id="«UppaalGenerator.getIdOfLocation(crane.name+"_StoppedMagnetOn")»">
				<name>«crane.name»_StoppedMagnetOn</name>
			</location>
			<location id="«UppaalGenerator.getIdOfLocation(crane.name+"_StoppedMagnetOff")»">
				<name>«crane.name»_StoppedMagnetOff</name>
			</location>
			<init ref="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOff")»"/>
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOn")»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name+"_StoppedMagnetOff")»"/>
				<label kind="synchronisation">emergencyStop?</label>
			</transition>
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOff")»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name+"_StoppedMagnetOn")»"/>
				<label kind="synchronisation">emergencyStop?</label>
			</transition>
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOn")»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOff")»"/>
				<label kind="synchronisation">«crane.name»_toggleMagnet?</label>
			</transition>
			<transition>
				<source ref="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOff")»"/>
				<target ref="«UppaalGenerator.getIdOfLocation(crane.name+"_MagnetOn")»"/>
				<label kind="synchronisation">«crane.name»_toggleMagnet?</label>
			</transition>
		</template>
		'''
	}
}