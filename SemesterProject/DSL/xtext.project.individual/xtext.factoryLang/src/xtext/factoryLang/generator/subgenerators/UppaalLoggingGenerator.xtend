package xtext.factoryLang.generator.subgenerators

import xtext.factoryLang.factoryLang.CraneS
import xtext.factoryLang.factoryLang.DiskS
import xtext.factoryLang.factoryLang.CameraS
import xtext.factoryLang.factoryLang.LOGGING_TYPE_ENUM_S

class UppaalLoggingGenerator {
	def static dispatch String generate(CraneS crane) {
		val loggingType = crane.logging.loggingType.value
		var result = ''''''
		switch loggingType {
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
			
		}
		return result
	}
	
	def static dispatch String generate(DiskS disk) {
		return
		'''
		'''
	}
	
	def static dispatch String generate(CameraS camera) {
		return
		'''
		'''
	}
}