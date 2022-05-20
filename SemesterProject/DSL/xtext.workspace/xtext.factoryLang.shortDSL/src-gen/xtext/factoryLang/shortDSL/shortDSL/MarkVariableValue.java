/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.shortDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mark Variable Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.MarkVariableValue#getVariable <em>Variable</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.MarkVariableValue#getValue <em>Value</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.MarkVariableValue#getTime <em>Time</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.MarkVariableValue#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getMarkVariableValue()
 * @model
 * @generated
 */
public interface MarkVariableValue extends MarkS
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(VariableS)
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getMarkVariableValue_Variable()
   * @model
   * @generated
   */
  VariableS getVariable();

  /**
   * Sets the value of the '{@link xtext.factoryLang.shortDSL.shortDSL.MarkVariableValue#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableS value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ValueSlotS)
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getMarkVariableValue_Value()
   * @model containment="true"
   * @generated
   */
  ValueSlotS getValue();

  /**
   * Sets the value of the '{@link xtext.factoryLang.shortDSL.shortDSL.MarkVariableValue#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ValueSlotS value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(int)
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getMarkVariableValue_Time()
   * @model
   * @generated
   */
  int getTime();

  /**
   * Sets the value of the '{@link xtext.factoryLang.shortDSL.shortDSL.MarkVariableValue#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(int value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * The literals are from the enumeration {@link xtext.factoryLang.shortDSL.shortDSL.TIME_UNIT_S}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see xtext.factoryLang.shortDSL.shortDSL.TIME_UNIT_S
   * @see #setUnit(TIME_UNIT_S)
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getMarkVariableValue_Unit()
   * @model
   * @generated
   */
  TIME_UNIT_S getUnit();

  /**
   * Sets the value of the '{@link xtext.factoryLang.shortDSL.shortDSL.MarkVariableValue#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see xtext.factoryLang.shortDSL.shortDSL.TIME_UNIT_S
   * @see #getUnit()
   * @generated
   */
  void setUnit(TIME_UNIT_S value);

} // MarkVariableValue