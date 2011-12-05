/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RFID.impl;

import RFID.RFIDFactory;
import RFID.RFIDPackage;
import RFID.RFIDSystem;
import RFID.Reader;
import RFID.Sensor;
import RFID.Tag;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import java.io.*;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RFIDPackageImpl extends EPackageImpl implements RFIDPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rfidSystemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass readerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sensorEClass = null;

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
   * @see RFID.RFIDPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RFIDPackageImpl()
  {
    super(eNS_URI, RFIDFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RFIDPackage init()
  {
    if (isInited) return (RFIDPackage)EPackage.Registry.INSTANCE.getEPackage(RFIDPackage.eNS_URI);

    // Obtain or create and register package
    RFIDPackageImpl theRFIDPackage = (RFIDPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof RFIDPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new RFIDPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRFIDPackage.createPackageContents();

    // Initialize created meta-data
    theRFIDPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRFIDPackage.freeze();

    return theRFIDPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRFIDSystem()
  {
    return rfidSystemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRFIDSystem_Reader()
  {
    return (EReference)rfidSystemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRFIDSystem_Sensor()
  {
    return (EReference)rfidSystemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRFIDSystem_Name()
  {
    return (EAttribute)rfidSystemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTag()
  {
    return tagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTag_Tid()
  {
    return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTag_Semaphore()
  {
    return (EAttribute)tagEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTag_Power()
  {
    return (EAttribute)tagEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTag_Period()
  {
    return (EAttribute)tagEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTag_LowPower()
  {
    return (EAttribute)tagEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTag_LastReciveTime()
  {
    return (EAttribute)tagEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTag_Reader()
  {
    return (EReference)tagEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReader()
  {
    return readerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReader_Rid()
  {
    return (EAttribute)readerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReader_BaudRate()
  {
    return (EAttribute)readerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReader_PowerLevel()
  {
    return (EAttribute)readerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReader_Channel()
  {
    return (EAttribute)readerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReader_CommandDuration()
  {
    return (EAttribute)readerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReader_CommandInterval()
  {
    return (EAttribute)readerEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReader_MinSensitity()
  {
    return (EAttribute)readerEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReader_System()
  {
    return (EReference)readerEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReader_Tag()
  {
    return (EReference)readerEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSensor()
  {
    return sensorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSensor_Sid()
  {
    return (EAttribute)sensorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSensor_Temperature()
  {
    return (EAttribute)sensorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSensor_Brightness()
  {
    return (EAttribute)sensorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSensor_System()
  {
    return (EReference)sensorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RFIDFactory getRFIDFactory()
  {
    return (RFIDFactory)getEFactoryInstance();
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
    rfidSystemEClass = createEClass(RFID_SYSTEM);
    createEReference(rfidSystemEClass, RFID_SYSTEM__READER);
    createEReference(rfidSystemEClass, RFID_SYSTEM__SENSOR);
    createEAttribute(rfidSystemEClass, RFID_SYSTEM__NAME);

    tagEClass = createEClass(TAG);
    createEAttribute(tagEClass, TAG__TID);
    createEAttribute(tagEClass, TAG__SEMAPHORE);
    createEAttribute(tagEClass, TAG__POWER);
    createEAttribute(tagEClass, TAG__PERIOD);
    createEAttribute(tagEClass, TAG__LOW_POWER);
    createEAttribute(tagEClass, TAG__LAST_RECIVE_TIME);
    createEReference(tagEClass, TAG__READER);

    readerEClass = createEClass(READER);
    createEAttribute(readerEClass, READER__RID);
    createEAttribute(readerEClass, READER__BAUD_RATE);
    createEAttribute(readerEClass, READER__POWER_LEVEL);
    createEAttribute(readerEClass, READER__CHANNEL);
    createEAttribute(readerEClass, READER__COMMAND_DURATION);
    createEAttribute(readerEClass, READER__COMMAND_INTERVAL);
    createEAttribute(readerEClass, READER__MIN_SENSITITY);
    createEReference(readerEClass, READER__SYSTEM);
    createEReference(readerEClass, READER__TAG);

    sensorEClass = createEClass(SENSOR);
    createEAttribute(sensorEClass, SENSOR__SID);
    createEAttribute(sensorEClass, SENSOR__TEMPERATURE);
    createEAttribute(sensorEClass, SENSOR__BRIGHTNESS);
    createEReference(sensorEClass, SENSOR__SYSTEM);
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

    // Initialize classes and features; add operations and parameters
    initEClass(rfidSystemEClass, RFIDSystem.class, "RFIDSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRFIDSystem_Reader(), this.getReader(), this.getReader_System(), "reader", null, 0, -1, RFIDSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getRFIDSystem_Reader().getEKeys().add(this.getReader_Rid());
    initEReference(getRFIDSystem_Sensor(), this.getSensor(), this.getSensor_System(), "sensor", null, 0, -1, RFIDSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRFIDSystem_Name(), ecorePackage.getEString(), "name", null, 1, 1, RFIDSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTag_Tid(), ecorePackage.getEInt(), "tid", null, 1, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTag_Semaphore(), ecorePackage.getEDouble(), "semaphore", null, 1, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTag_Power(), ecorePackage.getEInt(), "power", null, 1, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTag_Period(), ecorePackage.getEInt(), "period", null, 1, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTag_LowPower(), ecorePackage.getEBoolean(), "lowPower", null, 1, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTag_LastReciveTime(), ecorePackage.getEString(), "lastReciveTime", null, 1, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTag_Reader(), this.getReader(), this.getReader_Tag(), "Reader", null, 0, 1, Tag.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(readerEClass, Reader.class, "Reader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReader_Rid(), ecorePackage.getEInt(), "rid", null, 1, 1, Reader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReader_BaudRate(), ecorePackage.getEInt(), "baudRate", null, 1, 1, Reader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReader_PowerLevel(), ecorePackage.getEString(), "powerLevel", null, 1, 1, Reader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReader_Channel(), ecorePackage.getEInt(), "channel", null, 1, 1, Reader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReader_CommandDuration(), ecorePackage.getEInt(), "commandDuration", null, 1, 1, Reader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReader_CommandInterval(), ecorePackage.getEInt(), "commandInterval", null, 1, 1, Reader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReader_MinSensitity(), ecorePackage.getEDouble(), "minSensitity", null, 1, 1, Reader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReader_System(), this.getRFIDSystem(), this.getRFIDSystem_Reader(), "system", null, 0, 1, Reader.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReader_Tag(), this.getTag(), this.getTag_Reader(), "tag", null, 0, -1, Reader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getReader_Tag().getEKeys().add(this.getTag_Tid());

    initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSensor_Sid(), ecorePackage.getEInt(), "sid", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSensor_Temperature(), ecorePackage.getEDouble(), "temperature", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSensor_Brightness(), ecorePackage.getEDouble(), "brightness", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSensor_System(), this.getRFIDSystem(), this.getRFIDSystem_Sensor(), "System", null, 0, 1, Sensor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

  /*Global utility methods are generated here*/
    
} //RFIDPackageImpl
