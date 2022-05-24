package xtext.factoryLang.generator.subgenerators

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import xtext.factoryLang.factoryLang.Camera
import xtext.factoryLang.factoryLang.Conditional
import xtext.factoryLang.factoryLang.Crane
import xtext.factoryLang.factoryLang.CranePositionParameter
import xtext.factoryLang.factoryLang.DISK_STATES
import xtext.factoryLang.factoryLang.Disk
import xtext.factoryLang.factoryLang.DiskSlotParameter
import xtext.factoryLang.factoryLang.DiskSlotStateValue
import xtext.factoryLang.factoryLang.DiskZoneParameter
import xtext.factoryLang.factoryLang.ForEach
import xtext.factoryLang.factoryLang.Model
import xtext.factoryLang.factoryLang.Statement
import xtext.factoryLang.factoryLang.DSLLong
import xtext.factoryLang.factoryLang.DSLShort
import xtext.factoryLang.factoryLang.DiskS
import xtext.factoryLang.factoryLang.CraneS
import xtext.factoryLang.factoryLang.CameraS
import xtext.factoryLang.factoryLang.StatementS
import xtext.factoryLang.factoryLang.DiskHandlingS
import xtext.factoryLang.factoryLang.ConditionS
import xtext.factoryLang.factoryLang.LoopVariableS
import xtext.factoryLang.factoryLang.LoopSlotS
import xtext.factoryLang.factoryLang.DiskZoneS
import xtext.factoryLang.factoryLang.CraneZoneS
import xtext.factoryLang.factoryLang.DeviceS
import xtext.factoryLang.factoryLang.FactoryLangPackage.Literals

class UppaalGenerator {
	public static List<StatementS> statementsIndexerShort;
	public static List<Statement> statementsIndexer;
	static Map<String, String> locationIds = new HashMap();

	def static generateShort(IFileSystemAccess2 fsa, Resource resource) {
		val model = resource.allContents.filter(Model).next
		val dsl = model.dslProgram as DSLShort
		val devices = dsl.configuration.devices.toList
		val List<DeviceS> devicesWithLogging = newArrayList
		for (DeviceS device : devices) {
			if (device.eIsSet(Literals.DEVICE_S__LOGGING)) {
				devicesWithLogging.add(device)
			}
		}
		val discs = dsl.configuration.devices.filter[it instanceof DiskS].map[it as DiskS]
		val cranes = dsl.configuration.devices.filter[it instanceof CraneS].map[it as CraneS]
		val cameras = dsl.configuration.devices.filter[it instanceof CameraS].map[it as CameraS]
		val discSlotStateValues = resource.allContents.filter(DiskSlotStateValue).map[value].toSet.map[toString]
		val List<StatementS> statements = newArrayList
		for (DiskHandlingS diskHandling : dsl.diskHandlings) {
			for (StatementS statement : diskHandling.statements)
			statements.add(statement)
		}
		UppaalGenerator.statementsIndexerShort = getStatementsShort(statements)
		fsa.generateFile(
			"uppaal/systemShort.xml",
			'''
				<?xml version="1.0" encoding="utf-8"?>
				<!DOCTYPE nta PUBLIC '-//Uppaal Team//DTD Flat System 1.1//EN' 'http://www.it.uu.se/research/group/darts/uppaal/flat-1_2.dtd'>
				<nta>
					<declaration>
				«FOR disc : discs»
					//«disc.name»
					
					const int «disc.name»_numberOfSlots = «disc.NSlots»;
					typedef int[0,«disc.name»_numberOfSlots-1] «disc.name»_id_t;
					chan «disc.name»_goto[«disc.name»_numberOfSlots];
					chan «disc.name»_addItemCmd, «disc.name»_removeItemCmd;
					chan «disc.name»_addItem[«disc.name»_numberOfSlots];
					broadcast chan «disc.name»_removeItem[«disc.name»_numberOfSlots];
					
					//default tags
					chan «disc.name»_getemptySlot;
					chan «disc.name»_foundemptySlot;
					chan «disc.name»_setColour[«disc.name»_numberOfSlots][4];
					bool «disc.name»_notemptySlots[«disc.name»_numberOfSlots];
					chan «disc.name»_getColourSlot[«disc.name»_numberOfSlots];
					chan «disc.name»_gottenColourSlot;
					
					«FOR value : discSlotStateValues»
						//«value» tag
						chan «disc.name»_set_«value»[«disc.name»_numberOfSlots];
						chan «disc.name»_get«value»Slot;
						chan «disc.name»_found«value»Slot;
						bool «disc.name»_not«value»Slots[«disc.name»_numberOfSlots] = {«FOR i : 1..disc.NSlots SEPARATOR ", "»1«ENDFOR»};
					«ENDFOR»
					
					//Zones: 
					«FOR zone : disc.targets.filter[it instanceof DiskZoneS].map[it as DiskZoneS]»
						int «disc.name»_zones_«zone.name» = «zone.slot»;
					«ENDFOR»
				«ENDFOR»
				
				«FOR camera : cameras»
					//«camera.name»
					chan «camera.name»_getColour;
					chan «camera.name»_gottenColour;
				«ENDFOR»
				
				«FOR crane : cranes»
					//«crane.name»
					chan «crane.name»_toggleMagnet;
					chan «crane.name»_lowerMagnet, «crane.name»_raiseMagnet;
					«FOR position : crane.targets.filter[it instanceof CraneZoneS].map[it as CraneZoneS]»
						chan «crane.name»_goto_«position.name»;
					«ENDFOR»
				«ENDFOR»
				//-----------------current slot-----------------------------
				int currentSlot = -1;
				
				/**
				1: Red
				2: Green
				3: Blue
				*/
				int colour = 0;
				int currentSlot_colour = 0;
				
				//--------------------defaults------------------------
				clock GlobalTimer;
				broadcast chan emergencyStop;
				
				/**
				1: Tried to remove item from empty disc slot
				2: Tried to add item to full slot
				4:
				8:
				*/
				int error;
				</declaration>
				<template>
					<name>MasterController</name>
					<declaration>
						clock timer;
					</declaration>
					<location id="id0">
						<name>Idle</name>
					</location>
					«FOR diskHandling : dsl.diskHandlings»
						«FOR statement : diskHandling.statements»
							«UppaalMasterGenerator.generateLocation(statement)»
						«ENDFOR»
					«ENDFOR»
					<init ref="id0"/>
					«FOR diskHandling : dsl.diskHandlings»
						«FOR statement : diskHandling.statements»
							«UppaalMasterGenerator.generateTransistion(statement)»	
						«ENDFOR»
					«ENDFOR»
				</template>
					«FOR disc : discs»
						«DiscGenerator.generateShort(disc)»
						«DiscSlotGenerator.generateShort(disc)»
						«DiscGetVariableGenerator.generateShort(disc, DISK_STATES.EMPTY.toString)»
						«FOR value : discSlotStateValues»
							«DiscGetVariableGenerator.generateShort(disc, value)»
							«DiscVariableGenerator.generateShort(disc, value)»
						«ENDFOR»
					«ENDFOR»
					
					«FOR crane : cranes»
						«UppaalCraneMagnetGenerator.generateUppaalCraneMagnetTemplateShort(crane)»
						«UppaalCraneGenerator.generateUppaalCraneTemplateShort(crane)»
					«ENDFOR»
					
					«FOR camera : cameras»
						«CameraGenerator.generateShort(camera)»
					«ENDFOR»
					«UppaalEmergencyButtonGenerator.generateUppaalEmergencyButtonTemplate()»
					«FOR deviceWithLogging : devicesWithLogging»
						«IF deviceWithLogging instanceof CraneS»
							«UppaalLoggingGenerator.generate(devicesWithLogging as CraneS)»
						«ELSEIF deviceWithLogging instanceof DiskS»
							«UppaalLoggingGenerator.generate(devicesWithLogging as DiskS)»
						«ELSE»
							«UppaalLoggingGenerator.generate(devicesWithLogging as CameraS)»
						«ENDIF»
					«ENDFOR»
				<system>
					system «FOR disc : discs»«disc.name»,«ENDFOR» «FOR crane : cranes»«crane.name»,«ENDFOR» «FOR camera : cameras»«camera.name»«ENDFOR»;
				</system>
				«UppaalQueryGenerator.generateUpaalQueryShort(cranes.toList(), discs.toList(), cameras.toList())»
			'''
		)
	}
	
	def static generateLong(IFileSystemAccess2 fsa, Resource resource) {
		val model = resource.allContents.filter(Model).next
		val dsl = model.dslProgram as DSLLong
		val discs = dsl.configurations.map[device].filter[it instanceof Disk].map[x|x as Disk]
		val cranes = dsl.configurations.map[device].filter[it instanceof Crane].map[x|x as Crane]
		val cameras = dsl.configurations.map[device].filter[it instanceof Camera].map[x|x as Camera]
		val discSlotStateValues = resource.allContents.filter(DiskSlotStateValue).map[value].toSet.map[toString]
		UppaalGenerator.statementsIndexer = getStatementsLong(dsl.statements)
		fsa.generateFile(
			"uppaal/systemLong.xml",
			'''
				<?xml version="1.0" encoding="utf-8"?>
				<!DOCTYPE nta PUBLIC '-//Uppaal Team//DTD Flat System 1.1//EN' 'http://www.it.uu.se/research/group/darts/uppaal/flat-1_2.dtd'>
				<nta>
					<declaration>
				«FOR disc : discs»
					//«disc.name»
					
					const int «disc.name»_numberOfSlots = «(disc.slotParameter as DiskSlotParameter).size»;
					typedef int[0,«disc.name»_numberOfSlots-1] «disc.name»_id_t;
					chan «disc.name»_goto[«disc.name»_numberOfSlots];
					chan «disc.name»_addItemCmd, «disc.name»_removeItemCmd;
					chan «disc.name»_addItem[«disc.name»_numberOfSlots];
					broadcast chan «disc.name»_removeItem[«disc.name»_numberOfSlots];
					
					//default tags
					chan «disc.name»_getemptySlot;
					chan «disc.name»_foundemptySlot;
					chan «disc.name»_setColour[«disc.name»_numberOfSlots][4];
					bool «disc.name»_notemptySlots[«disc.name»_numberOfSlots];
					chan «disc.name»_getColourSlot[«disc.name»_numberOfSlots];
					chan «disc.name»_gottenColourSlot;
					
					«FOR value : discSlotStateValues»
						//«value» tag
						chan «disc.name»_set_«value»[«disc.name»_numberOfSlots];
						chan «disc.name»_get«value»Slot;
						chan «disc.name»_found«value»Slot;
						bool «disc.name»_not«value»Slots[«disc.name»_numberOfSlots] = {«FOR i : 1..(disc.slotParameter as DiskSlotParameter).size SEPARATOR ", "»1«ENDFOR»};
					«ENDFOR»
					
					//Zones: 
					«FOR zone : disc.targets.filter[it instanceof DiskZoneParameter].map[it as DiskZoneParameter]»
						int «disc.name»_zones_«zone.name» = «zone.slot»;
					«ENDFOR»
				«ENDFOR»
				
				«FOR camera : cameras»
					//«camera.name»
					chan «camera.name»_getColour;
					chan «camera.name»_gottenColour;
				«ENDFOR»
				
				«FOR crane : cranes»
					//«crane.name»
					chan «crane.name»_toggleMagnet;
					chan «crane.name»_lowerMagnet, «crane.name»_raiseMagnet;
					«FOR position : crane.targets.filter[it instanceof CranePositionParameter].map[it as CranePositionParameter]»
						chan «crane.name»_goto_«position.name»;
					«ENDFOR»
				«ENDFOR»
				//-----------------current slot-----------------------------
				int currentSlot = -1;
				
				/**
				1: Red
				2: Green
				3: Blue
				*/
				int colour = 0;
				int currentSlot_colour = 0;
				
				//--------------------defaults------------------------
				clock GlobalTimer;
				broadcast chan emergencyStop;
				
				/**
				1: Tried to remove item from empty disc slot
				2: Tried to add item to full slot
				4:
				8:
				*/
				int error;</declaration>
					<template>
						<name>MasterController</name>
						<declaration>
				clock timer;</declaration>
						<location id="id0">
							<name>Idle</name>
						</location>
						«FOR statement : dsl.statements»
							«UppaalMasterGenerator.generateLocation(statement)»
						«ENDFOR»
						<init ref="id0"/>
						«FOR statement : dsl.statements»
							«UppaalMasterGenerator.generateTransistion(statement)»	
						«ENDFOR»
					</template>
					«FOR disc : discs»
						«DiscGenerator.generateLong(disc)»
						«DiscSlotGenerator.generateLong(disc)»
						«DiscGetVariableGenerator.generateLong(disc, DISK_STATES.EMPTY.toString)»
						«FOR value : discSlotStateValues»
							«DiscGetVariableGenerator.generateLong(disc, value)»
							«DiscVariableGenerator.generateLong(disc, value)»
						«ENDFOR»
					«ENDFOR»
					
					«FOR crane : cranes»
						«UppaalCraneMagnetGenerator.generateUppaalCraneMagnetTemplateLong(crane)»
						«UppaalCraneGenerator.generateUppaalCraneTemplateLong(crane)»
					«ENDFOR»
					
					«FOR camera : cameras»
						«CameraGenerator.generateLong(camera)»
					«ENDFOR»
					«UppaalEmergencyButtonGenerator.generateUppaalEmergencyButtonTemplate()»
				<system>
					system MasterController, «FOR disc : discs»«disc.name», «disc.name»_DiscSlot, «disc.name»_GetemptySlot, «FOR value: discSlotStateValues»«disc.name»_SlotVariable_«value», «disc.name»_Get«value»Slot,«ENDFOR»«ENDFOR» «FOR crane : cranes»«crane.name»,«crane.name»_CraneMagnet,«ENDFOR» «FOR camera : cameras»«camera.name»,«ENDFOR» EmergencyButton;
				</system>
				«UppaalQueryGenerator.generateUpaalQueryLong(cranes.toList(), discs.toList(), cameras.toList())»
			'''
		)
	}

	def static List<StatementS> getStatementsShort(List<StatementS> statements) {
		val result = new ArrayList<StatementS>();
		result.addAll(statements)
		for (s : statements) {
			switch (s) {
				ConditionS: result.addAll(getStatementsShort(s.statements))
				LoopVariableS: result.addAll(getStatementsShort(s.statements))
				LoopSlotS: result.addAll(getStatementsShort(s.statements))
			}
		}
		return result
	}
	
	def static List<Statement> getStatementsLong(List<Statement> statements) {
		val result = new ArrayList<Statement>();
		result.addAll(statements)
		for (s : statements) {
			switch (s) {
				Conditional: result.addAll(getStatementsLong(s.statements))
				ForEach: result.addAll(getStatementsLong(s.statements))
			}
		}
		return result
	}

	static int idCounter = 1;

	def static String getIdOfLocation(String location) {
		var value = ""
		if (locationIds.containsKey(location)) {
			value = locationIds.get(location)
		} else {
			locationIds.put(location, '''id«idCounter++»''')
			value = '''id«idCounter - 1»'''
		}
		return value
	}
}
