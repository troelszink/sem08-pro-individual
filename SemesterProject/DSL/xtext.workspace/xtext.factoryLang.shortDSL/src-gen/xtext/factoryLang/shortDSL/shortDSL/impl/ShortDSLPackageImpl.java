/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.shortDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xtext.factoryLang.shortDSL.shortDSL.CameraColor_Short;
import xtext.factoryLang.shortDSL.shortDSL.Camera_Short;
import xtext.factoryLang.shortDSL.shortDSL.Configuration_Short;
import xtext.factoryLang.shortDSL.shortDSL.CranePosition_Short;
import xtext.factoryLang.shortDSL.shortDSL.Crane_Short;
import xtext.factoryLang.shortDSL.shortDSL.DSLShort;
import xtext.factoryLang.shortDSL.shortDSL.DSLType;
import xtext.factoryLang.shortDSL.shortDSL.DeviceHandling_Short;
import xtext.factoryLang.shortDSL.shortDSL.Device_Short;
import xtext.factoryLang.shortDSL.shortDSL.DiskZone_Short;
import xtext.factoryLang.shortDSL.shortDSL.Disk_Short;
import xtext.factoryLang.shortDSL.shortDSL.Model;
import xtext.factoryLang.shortDSL.shortDSL.ShortDSLFactory;
import xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShortDSLPackageImpl extends EPackageImpl implements ShortDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configuration_ShortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass device_ShortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass crane_ShortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cranePosition_ShortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disk_ShortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass diskZone_ShortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass camera_ShortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cameraColor_ShortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviceHandling_ShortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslShortEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ShortDSLPackageImpl()
  {
    super(eNS_URI, ShortDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link ShortDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ShortDSLPackage init()
  {
    if (isInited) return (ShortDSLPackage)EPackage.Registry.INSTANCE.getEPackage(ShortDSLPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredShortDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    ShortDSLPackageImpl theShortDSLPackage = registeredShortDSLPackage instanceof ShortDSLPackageImpl ? (ShortDSLPackageImpl)registeredShortDSLPackage : new ShortDSLPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theShortDSLPackage.createPackageContents();

    // Initialize created meta-data
    theShortDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theShortDSLPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ShortDSLPackage.eNS_URI, theShortDSLPackage);
    return theShortDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Type()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDSLType()
  {
    return dslTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getConfiguration_Short()
  {
    return configuration_ShortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConfiguration_Short_Devices()
  {
    return (EReference)configuration_ShortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDevice_Short()
  {
    return device_ShortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDevice_Short_Name()
  {
    return (EAttribute)device_ShortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCrane_Short()
  {
    return crane_ShortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCrane_Short_Positions()
  {
    return (EReference)crane_ShortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCranePosition_Short()
  {
    return cranePosition_ShortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCranePosition_Short_Name()
  {
    return (EAttribute)cranePosition_ShortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCranePosition_Short_Position()
  {
    return (EAttribute)cranePosition_ShortEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDisk_Short()
  {
    return disk_ShortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDisk_Short_NSlots()
  {
    return (EAttribute)disk_ShortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDisk_Short_Zones()
  {
    return (EReference)disk_ShortEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDiskZone_Short()
  {
    return diskZone_ShortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDiskZone_Short_Name()
  {
    return (EAttribute)diskZone_ShortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDiskZone_Short_Slot()
  {
    return (EAttribute)diskZone_ShortEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCamera_Short()
  {
    return camera_ShortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCamera_Short_Colors()
  {
    return (EReference)camera_ShortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCameraColor_Short()
  {
    return cameraColor_ShortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCameraColor_Short_Name()
  {
    return (EAttribute)cameraColor_ShortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDeviceHandling_Short()
  {
    return deviceHandling_ShortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDeviceHandling_Short_Name()
  {
    return (EAttribute)deviceHandling_ShortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDSLShort()
  {
    return dslShortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDSLShort_Configuration()
  {
    return (EReference)dslShortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDSLShort_DeviceHandlings()
  {
    return (EReference)dslShortEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ShortDSLFactory getShortDSLFactory()
  {
    return (ShortDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__TYPE);

    dslTypeEClass = createEClass(DSL_TYPE);

    configuration_ShortEClass = createEClass(CONFIGURATION_SHORT);
    createEReference(configuration_ShortEClass, CONFIGURATION_SHORT__DEVICES);

    device_ShortEClass = createEClass(DEVICE_SHORT);
    createEAttribute(device_ShortEClass, DEVICE_SHORT__NAME);

    crane_ShortEClass = createEClass(CRANE_SHORT);
    createEReference(crane_ShortEClass, CRANE_SHORT__POSITIONS);

    cranePosition_ShortEClass = createEClass(CRANE_POSITION_SHORT);
    createEAttribute(cranePosition_ShortEClass, CRANE_POSITION_SHORT__NAME);
    createEAttribute(cranePosition_ShortEClass, CRANE_POSITION_SHORT__POSITION);

    disk_ShortEClass = createEClass(DISK_SHORT);
    createEAttribute(disk_ShortEClass, DISK_SHORT__NSLOTS);
    createEReference(disk_ShortEClass, DISK_SHORT__ZONES);

    diskZone_ShortEClass = createEClass(DISK_ZONE_SHORT);
    createEAttribute(diskZone_ShortEClass, DISK_ZONE_SHORT__NAME);
    createEAttribute(diskZone_ShortEClass, DISK_ZONE_SHORT__SLOT);

    camera_ShortEClass = createEClass(CAMERA_SHORT);
    createEReference(camera_ShortEClass, CAMERA_SHORT__COLORS);

    cameraColor_ShortEClass = createEClass(CAMERA_COLOR_SHORT);
    createEAttribute(cameraColor_ShortEClass, CAMERA_COLOR_SHORT__NAME);

    deviceHandling_ShortEClass = createEClass(DEVICE_HANDLING_SHORT);
    createEAttribute(deviceHandling_ShortEClass, DEVICE_HANDLING_SHORT__NAME);

    dslShortEClass = createEClass(DSL_SHORT);
    createEReference(dslShortEClass, DSL_SHORT__CONFIGURATION);
    createEReference(dslShortEClass, DSL_SHORT__DEVICE_HANDLINGS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    crane_ShortEClass.getESuperTypes().add(this.getDevice_Short());
    disk_ShortEClass.getESuperTypes().add(this.getDevice_Short());
    camera_ShortEClass.getESuperTypes().add(this.getDevice_Short());
    dslShortEClass.getESuperTypes().add(this.getDSLType());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Type(), this.getDSLType(), null, "type", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslTypeEClass, DSLType.class, "DSLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(configuration_ShortEClass, Configuration_Short.class, "Configuration_Short", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConfiguration_Short_Devices(), this.getDevice_Short(), null, "devices", null, 0, -1, Configuration_Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(device_ShortEClass, Device_Short.class, "Device_Short", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDevice_Short_Name(), ecorePackage.getEString(), "name", null, 0, 1, Device_Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(crane_ShortEClass, Crane_Short.class, "Crane_Short", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCrane_Short_Positions(), this.getCranePosition_Short(), null, "positions", null, 0, -1, Crane_Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cranePosition_ShortEClass, CranePosition_Short.class, "CranePosition_Short", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCranePosition_Short_Name(), ecorePackage.getEString(), "name", null, 0, 1, CranePosition_Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCranePosition_Short_Position(), ecorePackage.getEInt(), "position", null, 0, 1, CranePosition_Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(disk_ShortEClass, Disk_Short.class, "Disk_Short", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDisk_Short_NSlots(), ecorePackage.getEInt(), "nSlots", null, 0, 1, Disk_Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDisk_Short_Zones(), this.getDiskZone_Short(), null, "zones", null, 0, -1, Disk_Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(diskZone_ShortEClass, DiskZone_Short.class, "DiskZone_Short", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDiskZone_Short_Name(), ecorePackage.getEString(), "name", null, 0, 1, DiskZone_Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiskZone_Short_Slot(), ecorePackage.getEInt(), "slot", null, 0, 1, DiskZone_Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(camera_ShortEClass, Camera_Short.class, "Camera_Short", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCamera_Short_Colors(), this.getCameraColor_Short(), null, "colors", null, 0, -1, Camera_Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cameraColor_ShortEClass, CameraColor_Short.class, "CameraColor_Short", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCameraColor_Short_Name(), ecorePackage.getEString(), "name", null, 0, 1, CameraColor_Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceHandling_ShortEClass, DeviceHandling_Short.class, "DeviceHandling_Short", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeviceHandling_Short_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeviceHandling_Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslShortEClass, DSLShort.class, "DSLShort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSLShort_Configuration(), this.getConfiguration_Short(), null, "configuration", null, 0, 1, DSLShort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSLShort_DeviceHandlings(), this.getDeviceHandling_Short(), null, "deviceHandlings", null, 0, -1, DSLShort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ShortDSLPackageImpl
