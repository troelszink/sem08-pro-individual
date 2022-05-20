/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.shortDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Type Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.DSLTypeValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getDSLTypeValue()
 * @model
 * @generated
 */
public interface DSLTypeValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link xtext.factoryLang.shortDSL.shortDSL.DSL_TYPE_ENUM}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see xtext.factoryLang.shortDSL.shortDSL.DSL_TYPE_ENUM
   * @see #setValue(DSL_TYPE_ENUM)
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getDSLTypeValue_Value()
   * @model
   * @generated
   */
  DSL_TYPE_ENUM getValue();

  /**
   * Sets the value of the '{@link xtext.factoryLang.shortDSL.shortDSL.DSLTypeValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see xtext.factoryLang.shortDSL.shortDSL.DSL_TYPE_ENUM
   * @see #getValue()
   * @generated
   */
  void setValue(DSL_TYPE_ENUM value);

} // DSLTypeValue
