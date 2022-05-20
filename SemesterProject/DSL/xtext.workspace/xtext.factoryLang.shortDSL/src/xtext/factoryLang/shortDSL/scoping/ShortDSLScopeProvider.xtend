/*
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage.Literals
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes
import xtext.factoryLang.shortDSL.shortDSL.Loop
import xtext.factoryLang.shortDSL.shortDSL.Model
import xtext.factoryLang.shortDSL.shortDSL.MarkCameraValue
import xtext.factoryLang.shortDSL.shortDSL.DeviceValue
import xtext.factoryLang.shortDSL.shortDSL.ConditionDevice
import xtext.factoryLang.shortDSL.shortDSL.DSLShort
import xtext.factoryLang.shortDSL.shortDSL.MoveS
import xtext.factoryLang.shortDSL.shortDSL.DiskHandlingS
import xtext.factoryLang.shortDSL.shortDSL.MoveCrane

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ShortDSLScopeProvider extends AbstractShortDSLScopeProvider {
	
	override IScope getScope(EObject context, EReference reference) {
		switch (reference) {
			case Literals.MOVE_DISK__ZONE,
			case Literals.MOVE_ANY_SLOT__ZONE:
				return getDiskTargetScope(context as MoveS)
			case Literals.MOVE_CRANE__ZONE:
				return getCraneTargetScope(context as MoveS)
			/*case Literals.MOVE_DISK__ZONE:
				return getVariableScope(context, context)*/
			case Literals.DEVICE_VALUE__CONFIGURATION_VALUE:
				return getDeviceValueRefScope(context as DeviceValue)
		}
		return super.getScope(context, reference)
	}
	
	// get scope for variable
	def IScope getVariableScope(EObject currentContext, EObject context) {
		val parent = currentContext.eContainer
		val nextForEach = EcoreUtil2.getContainerOfType(parent, Loop);

		if (nextForEach !== null)
			return Scopes.scopeFor(#[nextForEach.variable], getVariableScope(nextForEach, context));
		return getGlobalRefValueScope(context)
	}
	
	def IScope getDiskTargetScope(MoveS move) {
		val root = EcoreUtil2.getRootContainer(move) as Model
		val dsl = root.type as DSLShort
		val diskHandling = EcoreUtil2.getContainerOfType(move, DiskHandlingS)
		val diskRef = diskHandling.disk
		val diskName = diskRef.name

		val device = dsl.configuration.devices.filter[name == diskName].map[diskRef].toList
		val targets = device.get(0).targets

		return Scopes.scopeFor(targets)
	}
	
	def IScope getCraneTargetScope(MoveS move) {
		val root = EcoreUtil2.getRootContainer(move) as Model
		val dsl = root.type as DSLShort
		val moveCrane = EcoreUtil2.getContainerOfType(move, MoveCrane)
		val craneRef = moveCrane.crane
		val craneName = craneRef.name
	
		val device = dsl.configuration.devices.filter[name == craneName].map[craneRef].toList
		val targets = device.get(0).targets

		return Scopes.scopeFor(targets)
	}
	
	def IScope getGlobalRefValueScope(EObject context) {
		val root = EcoreUtil2.getRootContainer(context) as Model
		val dsl = root.type
		val cameraScanOperations = EcoreUtil2.getAllContentsOfType(dsl, MarkCameraValue).map[variable].toList
		return Scopes.scopeFor(cameraScanOperations);
	}
	
	def IScope getDeviceValueRefScope(DeviceValue deviceValue) {
		val deviceConditional = EcoreUtil2.getContainerOfType(deviceValue, ConditionDevice)
		val deviceRef = deviceConditional.device
		val deviceName = deviceRef.name

		val root = EcoreUtil2.getRootContainer(deviceValue) as Model
		val dsl = root.type as DSLShort
		val device = dsl.configuration.devices.filter[name == deviceName].map[deviceRef].get(0)
		var targets = device.targets
		return Scopes.scopeFor(targets)
	}
}
