/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.shortDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disk Handling S</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.DiskHandlingS#getDisk <em>Disk</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.DiskHandlingS#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getDiskHandlingS()
 * @model
 * @generated
 */
public interface DiskHandlingS extends EObject
{
  /**
   * Returns the value of the '<em><b>Disk</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disk</em>' reference.
   * @see #setDisk(Disk)
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getDiskHandlingS_Disk()
   * @model
   * @generated
   */
  Disk getDisk();

  /**
   * Sets the value of the '{@link xtext.factoryLang.shortDSL.shortDSL.DiskHandlingS#getDisk <em>Disk</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Disk</em>' reference.
   * @see #getDisk()
   * @generated
   */
  void setDisk(Disk value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link xtext.factoryLang.shortDSL.shortDSL.StatementS}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getDiskHandlingS_Statements()
   * @model containment="true"
   * @generated
   */
  EList<StatementS> getStatements();

} // DiskHandlingS