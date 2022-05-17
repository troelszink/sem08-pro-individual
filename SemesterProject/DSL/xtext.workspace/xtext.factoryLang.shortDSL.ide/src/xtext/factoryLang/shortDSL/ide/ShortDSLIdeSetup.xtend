/*
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import xtext.factoryLang.shortDSL.ShortDSLRuntimeModule
import xtext.factoryLang.shortDSL.ShortDSLStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ShortDSLIdeSetup extends ShortDSLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ShortDSLRuntimeModule, new ShortDSLIdeModule))
	}
	
}