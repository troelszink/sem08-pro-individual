package xtext.factoryLang.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject
import xtext.factoryLang.factoryLang.MoveS
import xtext.factoryLang.factoryLang.DeviceValueS
import org.eclipse.xtext.EcoreUtil2
import xtext.factoryLang.factoryLang.Model
import xtext.factoryLang.factoryLang.DSLShort
import xtext.factoryLang.factoryLang.DiskHandlingS
import org.eclipse.xtext.scoping.Scopes
import xtext.factoryLang.factoryLang.LoopVariableS
import xtext.factoryLang.factoryLang.MoveCraneS
import xtext.factoryLang.factoryLang.MarkCameraValueS
import xtext.factoryLang.factoryLang.ConditionDeviceS

class FactoryLangShortScopeProvider {
	
	/*def static IScope getScopeOfShortDSL(EObject context, EReference reference) {
		switch (reference) {
			case Literals.MOVE_DISK_S__ZONE,
			case Literals.MOVE_ANY_SLOT_S__ZONE:
				return getDiskTargetScope(context as MoveS)
			case Literals.MOVE_CRANE_S__ZONE:
				return getCraneTargetScope(context as MoveS)
			case Literals.DEVICE_VALUE_S__CONFIGURATION_VALUE:
				return getDeviceValueRefScope(context as DeviceValueS)
			case Literals.CONDITION_VARIABLE_S__VARIABLE:
				return getVariableScope(context, context)
		}
		//return super.getScope(context, reference)
	}*/
	
	def static IScope getVariableScope(EObject currentContext, EObject context) {
		val parent = currentContext.eContainer
		val nextForEach = EcoreUtil2.getContainerOfType(parent, LoopVariableS);

		if (nextForEach !== null)
			return Scopes.scopeFor(#[nextForEach.ordinaryVariable], getVariableScope(nextForEach, context));
		return getGlobalRefValueScope(context)
	}
	
	def static IScope getDiskTargetScope(MoveS move) {
		val root = EcoreUtil2.getRootContainer(move) as Model
		val dsl = root.dslProgram as DSLShort
		val diskHandling = EcoreUtil2.getContainerOfType(move, DiskHandlingS)
		val diskRef = diskHandling.disk
		val diskName = diskRef.name

		val device = dsl.configuration.devices.filter[name == diskName].map[diskRef].toList
		val targets = device.get(0).targets

		return Scopes.scopeFor(targets)
	}
	
	def static IScope getCraneTargetScope(MoveS move) {
		val root = EcoreUtil2.getRootContainer(move) as Model
		val dsl = root.dslProgram as DSLShort
		val moveCrane = EcoreUtil2.getContainerOfType(move, MoveCraneS)
		val craneRef = moveCrane.crane
		val craneName = craneRef.name
	
		val device = dsl.configuration.devices.filter[name == craneName].map[craneRef].toList
		val targets = device.get(0).targets

		return Scopes.scopeFor(targets)
	}
	
	def static IScope getGlobalRefValueScope(EObject context) {
		val root = EcoreUtil2.getRootContainer(context) as Model
		val dsl = root.dslProgram
		val cameraScanOperations = EcoreUtil2.getAllContentsOfType(dsl, MarkCameraValueS).map[ordinaryVariable].toList
		return Scopes.scopeFor(cameraScanOperations);
	}
	
	def static IScope getDeviceValueRefScope(DeviceValueS deviceValue) {
		val deviceConditional = EcoreUtil2.getContainerOfType(deviceValue, ConditionDeviceS)
		val deviceRef = deviceConditional.device
		val deviceName = deviceRef.name

		val root = EcoreUtil2.getRootContainer(deviceValue) as Model
		val dsl = root.dslProgram as DSLShort
		val device = dsl.configuration.devices.filter[name == deviceName].map[deviceRef].get(0)
		var targets = device.targets
		return Scopes.scopeFor(targets)
	}
}