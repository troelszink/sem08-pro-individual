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
import xtext.factoryLang.shortDSL.shortDSL.MarkVariable

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ShortDSLScopeProvider extends AbstractShortDSLScopeProvider {
	
	override IScope getScope(EObject context, EReference reference) {
		switch (reference) {
			case Literals.MOVE_DISK__ZONE:
				return getVariableScope(context, context)
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
	
	def IScope getGlobalRefValueScope(EObject context) {
		val root = EcoreUtil2.getRootContainer(context) as Model
		val dsl = root.type
		val cameraScanOperations = EcoreUtil2.getAllContentsOfType(dsl, MarkVariable).map[variable].toList
		return Scopes.scopeFor(cameraScanOperations);
	}
}
