/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RFID;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;



/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see RFID.RFIDFactory
 * @model kind="package"
 * @generated
 */
public interface RFIDPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "RFID";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://sei.pku.edu.cn/iot/rfid";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "RFID";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RFIDPackage eINSTANCE = RFID.impl.RFIDPackageImpl.init();

  /**
   * The meta object id for the '{@link RFID.impl.RFIDSystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see RFID.impl.RFIDSystemImpl
   * @see RFID.impl.RFIDPackageImpl#getRFIDSystem()
   * @generated
   */
  int RFID_SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Reader</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFID_SYSTEM__READER = 0;

  /**
   * The feature id for the '<em><b>Sensor</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFID_SYSTEM__SENSOR = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFID_SYSTEM__NAME = 2;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFID_SYSTEM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link RFID.impl.TagImpl <em>Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see RFID.impl.TagImpl
   * @see RFID.impl.RFIDPackageImpl#getTag()
   * @generated
   */
  int TAG = 1;

  /**
   * The feature id for the '<em><b>Tid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__TID = 0;

  /**
   * The feature id for the '<em><b>Semaphore</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__SEMAPHORE = 1;

  /**
   * The feature id for the '<em><b>Power</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__POWER = 2;

  /**
   * The feature id for the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__PERIOD = 3;

  /**
   * The feature id for the '<em><b>Low Power</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__LOW_POWER = 4;

  /**
   * The feature id for the '<em><b>Last Recive Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__LAST_RECIVE_TIME = 5;

  /**
   * The feature id for the '<em><b>Reader</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__READER = 6;

  /**
   * The number of structural features of the '<em>Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link RFID.impl.ReaderImpl <em>Reader</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see RFID.impl.ReaderImpl
   * @see RFID.impl.RFIDPackageImpl#getReader()
   * @generated
   */
  int READER = 2;

  /**
   * The feature id for the '<em><b>Rid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READER__RID = 0;

  /**
   * The feature id for the '<em><b>Baud Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READER__BAUD_RATE = 1;

  /**
   * The feature id for the '<em><b>Power Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READER__POWER_LEVEL = 2;

  /**
   * The feature id for the '<em><b>Channel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READER__CHANNEL = 3;

  /**
   * The feature id for the '<em><b>Command Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READER__COMMAND_DURATION = 4;

  /**
   * The feature id for the '<em><b>Command Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READER__COMMAND_INTERVAL = 5;

  /**
   * The feature id for the '<em><b>Min Sensitity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READER__MIN_SENSITITY = 6;

  /**
   * The feature id for the '<em><b>System</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READER__SYSTEM = 7;

  /**
   * The feature id for the '<em><b>Tag</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READER__TAG = 8;

  /**
   * The number of structural features of the '<em>Reader</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READER_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link RFID.impl.SensorImpl <em>Sensor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see RFID.impl.SensorImpl
   * @see RFID.impl.RFIDPackageImpl#getSensor()
   * @generated
   */
  int SENSOR = 3;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__SID = 0;

  /**
   * The feature id for the '<em><b>Temperature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__TEMPERATURE = 1;

  /**
   * The feature id for the '<em><b>Brightness</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__BRIGHTNESS = 2;

  /**
   * The feature id for the '<em><b>System</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__SYSTEM = 3;

  /**
   * The number of structural features of the '<em>Sensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link RFID.RFIDSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see RFID.RFIDSystem
   * @generated
   */
  EClass getRFIDSystem();

  /**
   * Returns the meta object for the containment reference list '{@link RFID.RFIDSystem#getReader <em>Reader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reader</em>'.
   * @see RFID.RFIDSystem#getReader()
   * @see #getRFIDSystem()
   * @generated
   */
  EReference getRFIDSystem_Reader();

  /**
   * Returns the meta object for the containment reference list '{@link RFID.RFIDSystem#getSensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sensor</em>'.
   * @see RFID.RFIDSystem#getSensor()
   * @see #getRFIDSystem()
   * @generated
   */
  EReference getRFIDSystem_Sensor();

  /**
   * Returns the meta object for the attribute '{@link RFID.RFIDSystem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see RFID.RFIDSystem#getName()
   * @see #getRFIDSystem()
   * @generated
   */
  EAttribute getRFIDSystem_Name();

  /**
   * Returns the meta object for class '{@link RFID.Tag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag</em>'.
   * @see RFID.Tag
   * @generated
   */
  EClass getTag();

  /**
   * Returns the meta object for the attribute '{@link RFID.Tag#getTid <em>Tid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tid</em>'.
   * @see RFID.Tag#getTid()
   * @see #getTag()
   * @generated
   */
  EAttribute getTag_Tid();

  /**
   * Returns the meta object for the attribute '{@link RFID.Tag#getSemaphore <em>Semaphore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Semaphore</em>'.
   * @see RFID.Tag#getSemaphore()
   * @see #getTag()
   * @generated
   */
  EAttribute getTag_Semaphore();

  /**
   * Returns the meta object for the attribute '{@link RFID.Tag#getPower <em>Power</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Power</em>'.
   * @see RFID.Tag#getPower()
   * @see #getTag()
   * @generated
   */
  EAttribute getTag_Power();

  /**
   * Returns the meta object for the attribute '{@link RFID.Tag#getPeriod <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Period</em>'.
   * @see RFID.Tag#getPeriod()
   * @see #getTag()
   * @generated
   */
  EAttribute getTag_Period();

  /**
   * Returns the meta object for the attribute '{@link RFID.Tag#isLowPower <em>Low Power</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Low Power</em>'.
   * @see RFID.Tag#isLowPower()
   * @see #getTag()
   * @generated
   */
  EAttribute getTag_LowPower();

  /**
   * Returns the meta object for the attribute '{@link RFID.Tag#getLastReciveTime <em>Last Recive Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Recive Time</em>'.
   * @see RFID.Tag#getLastReciveTime()
   * @see #getTag()
   * @generated
   */
  EAttribute getTag_LastReciveTime();

  /**
   * Returns the meta object for the container reference '{@link RFID.Tag#getReader <em>Reader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Reader</em>'.
   * @see RFID.Tag#getReader()
   * @see #getTag()
   * @generated
   */
  EReference getTag_Reader();

  /**
   * Returns the meta object for class '{@link RFID.Reader <em>Reader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reader</em>'.
   * @see RFID.Reader
   * @generated
   */
  EClass getReader();

  /**
   * Returns the meta object for the attribute '{@link RFID.Reader#getRid <em>Rid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rid</em>'.
   * @see RFID.Reader#getRid()
   * @see #getReader()
   * @generated
   */
  EAttribute getReader_Rid();

  /**
   * Returns the meta object for the attribute '{@link RFID.Reader#getBaudRate <em>Baud Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Baud Rate</em>'.
   * @see RFID.Reader#getBaudRate()
   * @see #getReader()
   * @generated
   */
  EAttribute getReader_BaudRate();

  /**
   * Returns the meta object for the attribute '{@link RFID.Reader#getPowerLevel <em>Power Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Power Level</em>'.
   * @see RFID.Reader#getPowerLevel()
   * @see #getReader()
   * @generated
   */
  EAttribute getReader_PowerLevel();

  /**
   * Returns the meta object for the attribute '{@link RFID.Reader#getChannel <em>Channel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Channel</em>'.
   * @see RFID.Reader#getChannel()
   * @see #getReader()
   * @generated
   */
  EAttribute getReader_Channel();

  /**
   * Returns the meta object for the attribute '{@link RFID.Reader#getCommandDuration <em>Command Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Command Duration</em>'.
   * @see RFID.Reader#getCommandDuration()
   * @see #getReader()
   * @generated
   */
  EAttribute getReader_CommandDuration();

  /**
   * Returns the meta object for the attribute '{@link RFID.Reader#getCommandInterval <em>Command Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Command Interval</em>'.
   * @see RFID.Reader#getCommandInterval()
   * @see #getReader()
   * @generated
   */
  EAttribute getReader_CommandInterval();

  /**
   * Returns the meta object for the attribute '{@link RFID.Reader#getMinSensitity <em>Min Sensitity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Sensitity</em>'.
   * @see RFID.Reader#getMinSensitity()
   * @see #getReader()
   * @generated
   */
  EAttribute getReader_MinSensitity();

  /**
   * Returns the meta object for the container reference '{@link RFID.Reader#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>System</em>'.
   * @see RFID.Reader#getSystem()
   * @see #getReader()
   * @generated
   */
  EReference getReader_System();

  /**
   * Returns the meta object for the containment reference list '{@link RFID.Reader#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tag</em>'.
   * @see RFID.Reader#getTag()
   * @see #getReader()
   * @generated
   */
  EReference getReader_Tag();

  /**
   * Returns the meta object for class '{@link RFID.Sensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sensor</em>'.
   * @see RFID.Sensor
   * @generated
   */
  EClass getSensor();

  /**
   * Returns the meta object for the attribute '{@link RFID.Sensor#getSid <em>Sid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sid</em>'.
   * @see RFID.Sensor#getSid()
   * @see #getSensor()
   * @generated
   */
  EAttribute getSensor_Sid();

  /**
   * Returns the meta object for the attribute '{@link RFID.Sensor#getTemperature <em>Temperature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Temperature</em>'.
   * @see RFID.Sensor#getTemperature()
   * @see #getSensor()
   * @generated
   */
  EAttribute getSensor_Temperature();

  /**
   * Returns the meta object for the attribute '{@link RFID.Sensor#getBrightness <em>Brightness</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Brightness</em>'.
   * @see RFID.Sensor#getBrightness()
   * @see #getSensor()
   * @generated
   */
  EAttribute getSensor_Brightness();

  /**
   * Returns the meta object for the container reference '{@link RFID.Sensor#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>System</em>'.
   * @see RFID.Sensor#getSystem()
   * @see #getSensor()
   * @generated
   */
  EReference getSensor_System();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RFIDFactory getRFIDFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link RFID.impl.RFIDSystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see RFID.impl.RFIDSystemImpl
     * @see RFID.impl.RFIDPackageImpl#getRFIDSystem()
     * @generated
     */
    EClass RFID_SYSTEM = eINSTANCE.getRFIDSystem();

    /**
     * The meta object literal for the '<em><b>Reader</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RFID_SYSTEM__READER = eINSTANCE.getRFIDSystem_Reader();

    /**
     * The meta object literal for the '<em><b>Sensor</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RFID_SYSTEM__SENSOR = eINSTANCE.getRFIDSystem_Sensor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RFID_SYSTEM__NAME = eINSTANCE.getRFIDSystem_Name();

    /**
     * The meta object literal for the '{@link RFID.impl.TagImpl <em>Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see RFID.impl.TagImpl
     * @see RFID.impl.RFIDPackageImpl#getTag()
     * @generated
     */
    EClass TAG = eINSTANCE.getTag();

    /**
     * The meta object literal for the '<em><b>Tid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG__TID = eINSTANCE.getTag_Tid();

    /**
     * The meta object literal for the '<em><b>Semaphore</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG__SEMAPHORE = eINSTANCE.getTag_Semaphore();

    /**
     * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG__POWER = eINSTANCE.getTag_Power();

    /**
     * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG__PERIOD = eINSTANCE.getTag_Period();

    /**
     * The meta object literal for the '<em><b>Low Power</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG__LOW_POWER = eINSTANCE.getTag_LowPower();

    /**
     * The meta object literal for the '<em><b>Last Recive Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG__LAST_RECIVE_TIME = eINSTANCE.getTag_LastReciveTime();

    /**
     * The meta object literal for the '<em><b>Reader</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG__READER = eINSTANCE.getTag_Reader();

    /**
     * The meta object literal for the '{@link RFID.impl.ReaderImpl <em>Reader</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see RFID.impl.ReaderImpl
     * @see RFID.impl.RFIDPackageImpl#getReader()
     * @generated
     */
    EClass READER = eINSTANCE.getReader();

    /**
     * The meta object literal for the '<em><b>Rid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READER__RID = eINSTANCE.getReader_Rid();

    /**
     * The meta object literal for the '<em><b>Baud Rate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READER__BAUD_RATE = eINSTANCE.getReader_BaudRate();

    /**
     * The meta object literal for the '<em><b>Power Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READER__POWER_LEVEL = eINSTANCE.getReader_PowerLevel();

    /**
     * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READER__CHANNEL = eINSTANCE.getReader_Channel();

    /**
     * The meta object literal for the '<em><b>Command Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READER__COMMAND_DURATION = eINSTANCE.getReader_CommandDuration();

    /**
     * The meta object literal for the '<em><b>Command Interval</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READER__COMMAND_INTERVAL = eINSTANCE.getReader_CommandInterval();

    /**
     * The meta object literal for the '<em><b>Min Sensitity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READER__MIN_SENSITITY = eINSTANCE.getReader_MinSensitity();

    /**
     * The meta object literal for the '<em><b>System</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference READER__SYSTEM = eINSTANCE.getReader_System();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference READER__TAG = eINSTANCE.getReader_Tag();

    /**
     * The meta object literal for the '{@link RFID.impl.SensorImpl <em>Sensor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see RFID.impl.SensorImpl
     * @see RFID.impl.RFIDPackageImpl#getSensor()
     * @generated
     */
    EClass SENSOR = eINSTANCE.getSensor();

    /**
     * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR__SID = eINSTANCE.getSensor_Sid();

    /**
     * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR__TEMPERATURE = eINSTANCE.getSensor_Temperature();

    /**
     * The meta object literal for the '<em><b>Brightness</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR__BRIGHTNESS = eINSTANCE.getSensor_Brightness();

    /**
     * The meta object literal for the '<em><b>System</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENSOR__SYSTEM = eINSTANCE.getSensor_System();

  }

  /*Global utility methods are generated here*/
    
} //RFIDPackage
