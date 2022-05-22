package xtext.factoryLang.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import xtext.factoryLang.factoryLang.FactoryLangPackage.Literals

import xtext.factoryLang.scoping.FactoryLangShortScopeProvider
import xtext.factoryLang.scoping.FactoryLangLongScopeProvider
import xtext.factoryLang.factoryLang.MoveS
import xtext.factoryLang.factoryLang.DeviceValueS
import xtext.factoryLang.factoryLang.Operation
import xtext.factoryLang.factoryLang.DeviceValue

class FactoryLangScopeProvider extends AbstractFactoryLangScopeProvider {
	
	override IScope getScope(EObject context, EReference reference) {
		switch (reference) {
			// short dsl
			case Literals.MOVE_DISK_S__DISK_ZONE,
			case Literals.MOVE_ANY_SLOT_S__DISK_ZONE:
				return FactoryLangShortScopeProvider.getDiskTargetScope(context as MoveS)
			case Literals.MOVE_CRANE_S__CRANE_ZONE:
				return FactoryLangShortScopeProvider.getCraneTargetScope(context as MoveS)
			case Literals.DEVICE_VALUE_S__CONFIGURATION_VALUE:
				return FactoryLangShortScopeProvider.getDeviceValueRefScope(context as DeviceValueS)
			case Literals.CONDITION_VARIABLE_S__ORDINARY_VARIABLE:
				return FactoryLangShortScopeProvider.getVariableScope(context, context)
			
			// long dsl
			case Literals.CRANE_OPERATION__TARGET,
			case Literals.DISK_MOVE_SLOT_OPERATION__SOURCE,
			case Literals.DISK_MOVE_SLOT_OPERATION__TARGET,
			case Literals.DISK_MOVE_VARIABLE_SLOT_OPERATION__TARGET,
			case Literals.DISK_MOVE_EMPTY_SLOT_OPERATION__TARGET,
			case Literals.DISK_MARK_SLOT_OPERATION__TARGET:
				return FactoryLangLongScopeProvider.getOperationTargetScope(context as Operation)
			case Literals.DISK_MOVE_VARIABLE_SLOT_OPERATION__VARIABLE,
			case Literals.VARIABLE_CONDITIONAL__VARIABLE:
				return FactoryLangLongScopeProvider.getVariableScope(context, context)
			case Literals.DEVICE_VALUE__REF:
				return FactoryLangLongScopeProvider.getDeviceValueRefScope(context as DeviceValue)	
		}
		return super.getScope(context, reference)
	}
	
}