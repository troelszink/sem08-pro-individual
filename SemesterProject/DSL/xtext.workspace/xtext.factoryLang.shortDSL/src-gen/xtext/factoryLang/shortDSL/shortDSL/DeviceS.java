/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.shortDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device S</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.DeviceS#getName <em>Name</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.DeviceS#getLogging <em>Logging</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.DeviceS#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getDeviceS()
 * @model
 * @generated
 */
public interface DeviceS extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getDeviceS_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xtext.factoryLang.shortDSL.shortDSL.DeviceS#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Logging</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logging</em>' containment reference.
   * @see #setLogging(LoggingS)
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getDeviceS_Logging()
   * @model containment="true"
   * @generated
   */
  LoggingS getLogging();

  /**
   * Sets the value of the '{@link xtext.factoryLang.shortDSL.shortDSL.DeviceS#getLogging <em>Logging</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logging</em>' containment reference.
   * @see #getLogging()
   * @generated
   */
  void setLogging(LoggingS value);

  /**
   * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
   * The list contents are of type {@link xtext.factoryLang.shortDSL.shortDSL.ConfigurationValueS}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Targets</em>' containment reference list.
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getDeviceS_Targets()
   * @model containment="true"
   * @generated
   */
  EList<ConfigurationValueS> getTargets();

} // DeviceS
