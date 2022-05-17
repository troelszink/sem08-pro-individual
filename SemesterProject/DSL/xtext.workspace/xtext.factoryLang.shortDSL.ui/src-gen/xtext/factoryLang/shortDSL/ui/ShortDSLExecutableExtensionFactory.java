/*
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import xtext.factoryLang.shortDSL.ui.internal.ShortDSLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ShortDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(ShortDSLActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		ShortDSLActivator activator = ShortDSLActivator.getInstance();
		return activator != null ? activator.getInjector(ShortDSLActivator.XTEXT_FACTORYLANG_SHORTDSL_SHORTDSL) : null;
	}

}
