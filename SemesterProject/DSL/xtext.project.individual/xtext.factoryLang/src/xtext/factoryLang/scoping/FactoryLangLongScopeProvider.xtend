package xtext.factoryLang.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import xtext.factoryLang.factoryLang.DiskOperation
import xtext.factoryLang.factoryLang.Model
import org.eclipse.xtext.scoping.Scopes
import xtext.factoryLang.factoryLang.Operation
import xtext.factoryLang.factoryLang.CraneOperation
import xtext.factoryLang.factoryLang.CameraScanOperation
import xtext.factoryLang.factoryLang.ForEach
import xtext.factoryLang.factoryLang.DeviceConditional
import xtext.factoryLang.factoryLang.DeviceValue
import xtext.factoryLang.factoryLang.DSLLong

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class FactoryLangLongScopeProvider {

	/*def static IScope getScopeOfLongDSL(EObject context, EReference reference) {
		switch (reference) {
			case Literals.CRANE_OPERATION__TARGET,
			case Literals.DISK_MOVE_SLOT_OPERATION__SOURCE,
			case Literals.DISK_MOVE_SLOT_OPERATION__TARGET,
			case Literals.DISK_MOVE_VARIABLE_SLOT_OPERATION__TARGET,
			case Literals.DISK_MOVE_EMPTY_SLOT_OPERATION__TARGET,
			case Literals.DISK_MARK_SLOT_OPERATION__TARGET:
				return getOperationTargetScope(context as Operation)
			case Literals.DISK_MOVE_VARIABLE_SLOT_OPERATION__VARIABLE,
			case Literals.VARIABLE_CONDITIONAL__VARIABLE:
				return getVariableScope(context, context)
			case Literals.DEVICE_VALUE__REF:
				return getDeviceValueRefScope(context as DeviceValue)
		}
		//return super.getScope(context, reference)
	}*/

	def static IScope getVariableScope(EObject currentContext, EObject context) {
		val parent = currentContext.eContainer
		val nextForEach = EcoreUtil2.getContainerOfType(parent, ForEach);

		if (nextForEach !== null)
			return Scopes.scopeFor(#[nextForEach.variable], getVariableScope(nextForEach, context));
		return getGlobalRefValueScope(context)
	}

	def static IScope getOperationTargetScope(Operation operation) {
		val root = EcoreUtil2.getRootContainer(operation) as Model
		val dsl = root.dslProgram as DSLLong
		var tempDeviceName = ""
		switch (operation) {
			case operation instanceof CraneOperation:
				tempDeviceName = (operation as CraneOperation).device.name
			case operation instanceof DiskOperation:
				tempDeviceName = (operation as DiskOperation).device.name
		}
		val deviceName = tempDeviceName
		val device = dsl.configurations.filter[device.name == deviceName].map[device].toList
		val targets = device.get(0).targets

		return Scopes.scopeFor(targets)
	}

	// forward declaration does not work
	def static IScope getGlobalRefValueScope(EObject context) {
		val root = EcoreUtil2.getRootContainer(context) as Model
		val cameraScanOperations = EcoreUtil2.getAllContentsOfType(root, CameraScanOperation).map[variable].toList
		// Scopes.index(context,)
		// ExpressionsModelUtil.
		return Scopes.scopeFor(cameraScanOperations);
	}

	// auto-complete does not work with this, but scoping does
	def static IScope getDeviceValueRefScope(DeviceValue deviceValue) {
		val deviceConditional = EcoreUtil2.getContainerOfType(deviceValue, DeviceConditional)
		val deviceName = deviceConditional.device.name

		val root = EcoreUtil2.getRootContainer(deviceValue) as Model
		val dsl = root.dslProgram as DSLLong
		val device = dsl.configurations.filter[device.name == deviceName].map[device].get(0)
		var targets = device.targets
		return Scopes.scopeFor(targets)
	}
}
