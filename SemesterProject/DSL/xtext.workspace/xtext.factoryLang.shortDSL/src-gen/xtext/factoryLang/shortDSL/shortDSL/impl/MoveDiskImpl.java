/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.shortDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xtext.factoryLang.shortDSL.shortDSL.DiskZone;
import xtext.factoryLang.shortDSL.shortDSL.MoveDisk;
import xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage;
import xtext.factoryLang.shortDSL.shortDSL.SlotVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Disk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.impl.MoveDiskImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link xtext.factoryLang.shortDSL.shortDSL.impl.MoveDiskImpl#getZone <em>Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveDiskImpl extends MoveSImpl implements MoveDisk
{
  /**
   * The cached value of the '{@link #getSlot() <em>Slot</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlot()
   * @generated
   * @ordered
   */
  protected SlotVariable slot;

  /**
   * The cached value of the '{@link #getZone() <em>Zone</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZone()
   * @generated
   * @ordered
   */
  protected DiskZone zone;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MoveDiskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ShortDSLPackage.Literals.MOVE_DISK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlotVariable getSlot()
  {
    if (slot != null && slot.eIsProxy())
    {
      InternalEObject oldSlot = (InternalEObject)slot;
      slot = (SlotVariable)eResolveProxy(oldSlot);
      if (slot != oldSlot)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShortDSLPackage.MOVE_DISK__SLOT, oldSlot, slot));
      }
    }
    return slot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SlotVariable basicGetSlot()
  {
    return slot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSlot(SlotVariable newSlot)
  {
    SlotVariable oldSlot = slot;
    slot = newSlot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShortDSLPackage.MOVE_DISK__SLOT, oldSlot, slot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DiskZone getZone()
  {
    if (zone != null && zone.eIsProxy())
    {
      InternalEObject oldZone = (InternalEObject)zone;
      zone = (DiskZone)eResolveProxy(oldZone);
      if (zone != oldZone)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShortDSLPackage.MOVE_DISK__ZONE, oldZone, zone));
      }
    }
    return zone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiskZone basicGetZone()
  {
    return zone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setZone(DiskZone newZone)
  {
    DiskZone oldZone = zone;
    zone = newZone;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShortDSLPackage.MOVE_DISK__ZONE, oldZone, zone));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ShortDSLPackage.MOVE_DISK__SLOT:
        if (resolve) return getSlot();
        return basicGetSlot();
      case ShortDSLPackage.MOVE_DISK__ZONE:
        if (resolve) return getZone();
        return basicGetZone();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ShortDSLPackage.MOVE_DISK__SLOT:
        setSlot((SlotVariable)newValue);
        return;
      case ShortDSLPackage.MOVE_DISK__ZONE:
        setZone((DiskZone)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ShortDSLPackage.MOVE_DISK__SLOT:
        setSlot((SlotVariable)null);
        return;
      case ShortDSLPackage.MOVE_DISK__ZONE:
        setZone((DiskZone)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ShortDSLPackage.MOVE_DISK__SLOT:
        return slot != null;
      case ShortDSLPackage.MOVE_DISK__ZONE:
        return zone != null;
    }
    return super.eIsSet(featureID);
  }

} //MoveDiskImpl
