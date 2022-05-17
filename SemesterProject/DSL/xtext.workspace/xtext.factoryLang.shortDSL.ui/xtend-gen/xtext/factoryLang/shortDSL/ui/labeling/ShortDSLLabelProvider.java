/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
@SuppressWarnings("all")
public class ShortDSLLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public ShortDSLLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}