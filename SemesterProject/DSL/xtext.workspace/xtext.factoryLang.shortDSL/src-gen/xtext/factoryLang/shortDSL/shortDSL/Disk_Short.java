/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.shortDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disk Short</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.Disk_Short#getNSlots <em>NSlots</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.Disk_Short#getZones <em>Zones</em>}</li>
 * </ul>
 *
 * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getDisk_Short()
 * @model
 * @generated
 */
public interface Disk_Short extends Device_Short
{
  /**
   * Returns the value of the '<em><b>NSlots</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>NSlots</em>' attribute.
   * @see #setNSlots(int)
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getDisk_Short_NSlots()
   * @model
   * @generated
   */
  int getNSlots();

  /**
   * Sets the value of the '{@link xtext.factoryLang.shortDSL.shortDSL.Disk_Short#getNSlots <em>NSlots</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>NSlots</em>' attribute.
   * @see #getNSlots()
   * @generated
   */
  void setNSlots(int value);

  /**
   * Returns the value of the '<em><b>Zones</b></em>' containment reference list.
   * The list contents are of type {@link xtext.factoryLang.shortDSL.shortDSL.DiskZone_Short}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Zones</em>' containment reference list.
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#getDisk_Short_Zones()
   * @model containment="true"
   * @generated
   */
  EList<DiskZone_Short> getZones();

} // Disk_Short