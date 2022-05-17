/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.shortDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crane Position Short</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.CranePosition_Short#getName <em>Name</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.CranePosition_Short#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getCranePosition_Short()
 * @model
 * @generated
 */
public interface CranePosition_Short extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getCranePosition_Short_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xtext.factoryLang.shortDSL.shortDSL.CranePosition_Short#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' attribute.
   * @see #setPosition(int)
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getCranePosition_Short_Position()
   * @model
   * @generated
   */
  int getPosition();

  /**
   * Sets the value of the '{@link xtext.factoryLang.shortDSL.shortDSL.CranePosition_Short#getPosition <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' attribute.
   * @see #getPosition()
   * @generated
   */
  void setPosition(int value);

} // CranePosition_Short