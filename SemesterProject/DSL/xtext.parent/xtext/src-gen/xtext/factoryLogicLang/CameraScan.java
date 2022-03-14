/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLogicLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera Scan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLogicLang.CameraScan#getDevice <em>Device</em>}</li>
 *   <li>{@link xtext.factoryLogicLang.CameraScan#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see xtext.factoryLogicLang.FactoryLogicLangPackage#getCameraScan()
 * @model
 * @generated
 */
public interface CameraScan extends Operation
{
  /**
   * Returns the value of the '<em><b>Device</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device</em>' reference.
   * @see #setDevice(Camera)
   * @see xtext.factoryLogicLang.FactoryLogicLangPackage#getCameraScan_Device()
   * @model
   * @generated
   */
  Camera getDevice();

  /**
   * Sets the value of the '{@link xtext.factoryLogicLang.CameraScan#getDevice <em>Device</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Device</em>' reference.
   * @see #getDevice()
   * @generated
   */
  void setDevice(Camera value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see xtext.factoryLogicLang.FactoryLogicLangPackage#getCameraScan_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xtext.factoryLogicLang.CameraScan#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // CameraScan