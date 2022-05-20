/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.shortDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.ConditionDevice#getDevice <em>Device</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.ConditionDevice#getComparisonOperatorDevice <em>Comparison Operator Device</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.ConditionDevice#getDeviceValue <em>Device Value</em>}</li>
 * </ul>
 *
 * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getConditionDevice()
 * @model
 * @generated
 */
public interface ConditionDevice extends ConditionS
{
  /**
   * Returns the value of the '<em><b>Device</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device</em>' reference.
   * @see #setDevice(DeviceS)
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getConditionDevice_Device()
   * @model
   * @generated
   */
  DeviceS getDevice();

  /**
   * Sets the value of the '{@link xtext.factoryLang.shortDSL.shortDSL.ConditionDevice#getDevice <em>Device</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Device</em>' reference.
   * @see #getDevice()
   * @generated
   */
  void setDevice(DeviceS value);

  /**
   * Returns the value of the '<em><b>Comparison Operator Device</b></em>' attribute.
   * The literals are from the enumeration {@link xtext.factoryLang.shortDSL.shortDSL.COMPARISON_OPERATOR_S}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comparison Operator Device</em>' attribute.
   * @see xtext.factoryLang.shortDSL.shortDSL.COMPARISON_OPERATOR_S
   * @see #setComparisonOperatorDevice(COMPARISON_OPERATOR_S)
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getConditionDevice_ComparisonOperatorDevice()
   * @model
   * @generated
   */
  COMPARISON_OPERATOR_S getComparisonOperatorDevice();

  /**
   * Sets the value of the '{@link xtext.factoryLang.shortDSL.shortDSL.ConditionDevice#getComparisonOperatorDevice <em>Comparison Operator Device</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comparison Operator Device</em>' attribute.
   * @see xtext.factoryLang.shortDSL.shortDSL.COMPARISON_OPERATOR_S
   * @see #getComparisonOperatorDevice()
   * @generated
   */
  void setComparisonOperatorDevice(COMPARISON_OPERATOR_S value);

  /**
   * Returns the value of the '<em><b>Device Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device Value</em>' containment reference.
   * @see #setDeviceValue(DeviceValueS)
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getConditionDevice_DeviceValue()
   * @model containment="true"
   * @generated
   */
  DeviceValueS getDeviceValue();

  /**
   * Sets the value of the '{@link xtext.factoryLang.shortDSL.shortDSL.ConditionDevice#getDeviceValue <em>Device Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Device Value</em>' containment reference.
   * @see #getDeviceValue()
   * @generated
   */
  void setDeviceValue(DeviceValueS value);

} // ConditionDevice
