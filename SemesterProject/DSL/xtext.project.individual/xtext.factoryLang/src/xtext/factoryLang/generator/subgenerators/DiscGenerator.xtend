package xtext.factoryLang.generator.subgenerators

import xtext.factoryLang.factoryLang.Disk
import xtext.factoryLang.factoryLang.DiskSlotParameter
import static xtext.factoryLang.generator.subgenerators.UppaalGenerator.getIdOfLocation
import xtext.factoryLang.factoryLang.DiskS
import xtext.factoryLang.factoryLang.LOGGING_TYPE_ENUM_S
import xtext.factoryLang.factoryLang.FactoryLangPackage.Literals

class DiscGenerator {
	def static String generateShort(DiskS disc){
		'''
		<template>
			<name>«disc.name»</name>
			«FOR i : 1 ..disc.NSlots»
			<location id="«getIdOfLocation('''Position«i»''')»">
				<name>Position«i»</name>
			</location>
			<location id="«getIdOfLocation('''AddItem«i»Req''')»">
				<name>AddItem«i»Req</name>
				<committed/>
			</location>
			<location id="«getIdOfLocation('''RemoveItem«i»Req''')»">
				<name>RemoveItem«i»Req</name>
				<committed/>
			</location>
			«ENDFOR»
			<location id="«getIdOfLocation('''«disc.name»_Stopped''')»">
				<name>Stopped</name>
			</location>
			«IF disc.eIsSet(Literals.DEVICE_S__LOGGING)»
		 		«generateLoggingLocation(disc, disc.logging.loggingType.value)»
		 	«ENDIF»
			<init ref="«getIdOfLocation('''Position1''')»"/>
			«FOR i : 1 ..disc.NSlots»
			<transition>
				<source ref="«getIdOfLocation('''Position«i»''')»"/>
				<target ref="«getIdOfLocation('''«disc.name»_Stopped''')»"/>
				<label kind="synchronisation">emergencyStop?</label>
			</transition>
			<transition>
				<source ref="«getIdOfLocation('''Position«i»''')»"/>
				<target ref="«getIdOfLocation('''AddItem«i»Req''')»"/>
				<label kind="synchronisation">«disc.name»_addItemCmd?</label>
			</transition>
			<transition>
				<source ref="«getIdOfLocation('''Position«i»''')»"/>
				<target ref="«getIdOfLocation('''RemoveItem«i»Req''')»"/>
				<label kind="synchronisation">«disc.name»_removeItemCmd?</label>
			</transition>
			<transition>
				<source ref="«getIdOfLocation('''AddItem«i»Req''')»"/>
				<target ref="«getIdOfLocation('''Position«i»''')»"/>
				<label kind="synchronisation">«disc.name»_addItem[currentSlot]!</label>
			</transition>
			<transition>
				<source ref="«getIdOfLocation('''RemoveItem«i»Req''')»"/>
				<target ref="«getIdOfLocation('''Position«i»''')»"/>
				<label kind="synchronisation">«disc.name»_removeItem[currentSlot]!</label>
			</transition>
			«FOR j : 0 ..< disc.NSlots»
			<transition>
				<source ref="«getIdOfLocation('''Position«((i + j) % disc.NSlots) + 1»''')»"/>
				<target ref="«getIdOfLocation('''Position«i»''')»"/>
				<label kind="synchronisation">«disc.name»_goto[«i-1»]?</label>
			</transition>
			«ENDFOR»
			«ENDFOR»
			
			«IF disc.eIsSet(Literals.DEVICE_S__LOGGING)»
		 		«generateLoggingTransition(disc, disc.logging.loggingType.value)»
		 	«ENDIF»
			
		</template>
		'''
		//<label kind="assignment">currentSlot = «i-1»</label>
	}
	
	def static String generateLoggingLocation(DiskS disc, LOGGING_TYPE_ENUM_S loggingType) {
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
		'''
		<location id="«UppaalGenerator.getIdOfLocation(disc.name + "_Logging" + loggingTypeName)»">
			<name>«disc.name»_Logging«loggingTypeName»</name>
			<committed/>
		</location>
		'''
	}
	
	def static String generateLoggingTransition(DiskS disc, LOGGING_TYPE_ENUM_S loggingType) {
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
		'''
		«FOR i : 1 ..disc.NSlots»
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation('''Position«i»''')»"/>
			<target ref="«UppaalGenerator.getIdOfLocation(disc.name + "_Logging" + loggingTypeName)»"/>
			<label kind="synchronisation">«disc.name»_Log?</label>
		</transition>
		<transition>
			<source ref="«UppaalGenerator.getIdOfLocation(disc.name + "_Logging" + loggingTypeName)»"/>
			<target ref="«UppaalGenerator.getIdOfLocation('''Position«i»''')»"/>
			<label kind="synchronisation">«disc.name»_NoLog?</label>
		</transition>
		«ENDFOR»
		'''
	}
	
	def static String generateLong(Disk disc){
		'''
		<template>
			<name>«disc.name»</name>
			«FOR i : 1 ..(disc.slotParameter as DiskSlotParameter).size»
			<location id="«getIdOfLocation('''Position«i»''')»">
				<name>Position«i»</name>
			</location>
			<location id="«getIdOfLocation('''AddItem«i»Req''')»">
				<name>AddItem«i»Req</name>
				<committed/>
			</location>
			<location id="«getIdOfLocation('''RemoveItem«i»Req''')»">
				<name>RemoveItem«i»Req</name>
				<committed/>
			</location>
			«ENDFOR»
			<location id="«getIdOfLocation('''«disc.name»_Stopped''')»">
				<name>Stopped</name>
			</location>
			<init ref="«getIdOfLocation('''Position1''')»"/>
			«FOR i : 1 ..(disc.slotParameter as DiskSlotParameter).size»
			<transition>
				<source ref="«getIdOfLocation('''Position«i»''')»"/>
				<target ref="«getIdOfLocation('''«disc.name»_Stopped''')»"/>
				<label kind="synchronisation">emergencyStop?</label>
			</transition>
			<transition>
				<source ref="«getIdOfLocation('''Position«i»''')»"/>
				<target ref="«getIdOfLocation('''AddItem«i»Req''')»"/>
				<label kind="synchronisation">«disc.name»_addItemCmd?</label>
			</transition>
			<transition>
				<source ref="«getIdOfLocation('''Position«i»''')»"/>
				<target ref="«getIdOfLocation('''RemoveItem«i»Req''')»"/>
				<label kind="synchronisation">«disc.name»_removeItemCmd?</label>
			</transition>
			<transition>
				<source ref="«getIdOfLocation('''AddItem«i»Req''')»"/>
				<target ref="«getIdOfLocation('''Position«i»''')»"/>
				<label kind="synchronisation">«disc.name»_addItem[currentSlot]!</label>
			</transition>
			<transition>
				<source ref="«getIdOfLocation('''RemoveItem«i»Req''')»"/>
				<target ref="«getIdOfLocation('''Position«i»''')»"/>
				<label kind="synchronisation">«disc.name»_removeItem[currentSlot]!</label>
			</transition>
			«FOR j : 0 ..< (disc.slotParameter as DiskSlotParameter).size»
			<transition>
				<source ref="«getIdOfLocation('''Position«((i + j) % (disc.slotParameter as DiskSlotParameter).size) + 1»''')»"/>
				<target ref="«getIdOfLocation('''Position«i»''')»"/>
				<label kind="synchronisation">«disc.name»_goto[«i-1»]?</label>
			</transition>
			«ENDFOR»
			«ENDFOR»
		</template>
		'''
		//<label kind="assignment">currentSlot = «i-1»</label>
	}
}