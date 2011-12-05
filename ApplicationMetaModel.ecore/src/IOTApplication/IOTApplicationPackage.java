/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IOTApplication;

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
 * @see IOTApplication.IOTApplicationFactory
 * @model kind="package"
 * @generated
 */
public interface IOTApplicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IOTApplication";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sei.pku.edu.cn/iot/application/old";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IOTApplication";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IOTApplicationPackage eINSTANCE = IOTApplication.impl.IOTApplicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link IOTApplication.impl.AppSystemImpl <em>App System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IOTApplication.impl.AppSystemImpl
	 * @see IOTApplication.impl.IOTApplicationPackageImpl#getAppSystem()
	 * @generated
	 */
	int APP_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SYSTEM__ROOM = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SYSTEM__PERSON = 1;

	/**
	 * The feature id for the '<em><b>Thing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SYSTEM__THING = 2;

	/**
	 * The feature id for the '<em><b>Warner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SYSTEM__WARNER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SYSTEM__NAME = 4;

	/**
	 * The number of structural features of the '<em>App System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SYSTEM_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link IOTApplication.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IOTApplication.impl.RoomImpl
	 * @see IOTApplication.impl.IOTApplicationPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 1;

	/**
	 * The feature id for the '<em><b>Hid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__HID = 0;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__TEMPERATURE = 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Thing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__THING = 3;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__PERSON = 4;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__BRIGHTNESS = 5;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link IOTApplication.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IOTApplication.impl.PersonImpl
	 * @see IOTApplication.impl.IOTApplicationPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GROUP = 2;

	/**
	 * The feature id for the '<em><b>Office</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OFFICE = 3;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENDER = 4;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Locate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LOCATE = 6;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__HAS = 7;

	/**
	 * The feature id for the '<em><b>Warner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__WARNER = 8;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link IOTApplication.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IOTApplication.impl.ThingImpl
	 * @see IOTApplication.impl.IOTApplicationPackageImpl#getThing()
	 * @generated
	 */
	int THING = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__TID = 1;

	/**
	 * The feature id for the '<em><b>Prefer Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__PREFER_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__IMPORTANCE = 3;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__OWNER = 6;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link IOTApplication.impl.WarnerImpl <em>Warner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IOTApplication.impl.WarnerImpl
	 * @see IOTApplication.impl.IOTApplicationPackageImpl#getWarner()
	 * @generated
	 */
	int WARNER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNER__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNER__LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNER__TIME = 3;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNER__SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Warnee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNER__WARNEE = 5;

	/**
	 * The number of structural features of the '<em>Warner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNER_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link IOTApplication.AppSystem <em>App System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App System</em>'.
	 * @see IOTApplication.AppSystem
	 * @generated
	 */
	EClass getAppSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link IOTApplication.AppSystem#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Room</em>'.
	 * @see IOTApplication.AppSystem#getRoom()
	 * @see #getAppSystem()
	 * @generated
	 */
	EReference getAppSystem_Room();

	/**
	 * Returns the meta object for the containment reference list '{@link IOTApplication.AppSystem#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see IOTApplication.AppSystem#getPerson()
	 * @see #getAppSystem()
	 * @generated
	 */
	EReference getAppSystem_Person();

	/**
	 * Returns the meta object for the containment reference list '{@link IOTApplication.AppSystem#getThing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thing</em>'.
	 * @see IOTApplication.AppSystem#getThing()
	 * @see #getAppSystem()
	 * @generated
	 */
	EReference getAppSystem_Thing();

	/**
	 * Returns the meta object for the containment reference list '{@link IOTApplication.AppSystem#getWarner <em>Warner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Warner</em>'.
	 * @see IOTApplication.AppSystem#getWarner()
	 * @see #getAppSystem()
	 * @generated
	 */
	EReference getAppSystem_Warner();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.AppSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see IOTApplication.AppSystem#getName()
	 * @see #getAppSystem()
	 * @generated
	 */
	EAttribute getAppSystem_Name();

	/**
	 * Returns the meta object for class '{@link IOTApplication.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see IOTApplication.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.Room#getHid <em>Hid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hid</em>'.
	 * @see IOTApplication.Room#getHid()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Hid();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.Room#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see IOTApplication.Room#getTemperature()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Temperature();

	/**
	 * Returns the meta object for the container reference '{@link IOTApplication.Room#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see IOTApplication.Room#getSystem()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_System();

	/**
	 * Returns the meta object for the reference list '{@link IOTApplication.Room#getThing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Thing</em>'.
	 * @see IOTApplication.Room#getThing()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Thing();

	/**
	 * Returns the meta object for the reference list '{@link IOTApplication.Room#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person</em>'.
	 * @see IOTApplication.Room#getPerson()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Person();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.Room#getBrightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brightness</em>'.
	 * @see IOTApplication.Room#getBrightness()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Brightness();

	/**
	 * Returns the meta object for class '{@link IOTApplication.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see IOTApplication.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.Person#getPid <em>Pid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pid</em>'.
	 * @see IOTApplication.Person#getPid()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Pid();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see IOTApplication.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.Person#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see IOTApplication.Person#getGroup()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Group();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.Person#getOffice <em>Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Office</em>'.
	 * @see IOTApplication.Person#getOffice()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Office();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.Person#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see IOTApplication.Person#getGender()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Gender();

	/**
	 * Returns the meta object for the container reference '{@link IOTApplication.Person#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see IOTApplication.Person#getSystem()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_System();

	/**
	 * Returns the meta object for the reference '{@link IOTApplication.Person#getLocate <em>Locate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Locate</em>'.
	 * @see IOTApplication.Person#getLocate()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Locate();

	/**
	 * Returns the meta object for the reference list '{@link IOTApplication.Person#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has</em>'.
	 * @see IOTApplication.Person#getHas()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Has();

	/**
	 * Returns the meta object for the reference list '{@link IOTApplication.Person#getWarner <em>Warner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Warner</em>'.
	 * @see IOTApplication.Person#getWarner()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Warner();

	/**
	 * Returns the meta object for class '{@link IOTApplication.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see IOTApplication.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.Thing#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see IOTApplication.Thing#getName()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Name();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.Thing#getTid <em>Tid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tid</em>'.
	 * @see IOTApplication.Thing#getTid()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Tid();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.Thing#getPreferLocation <em>Prefer Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefer Location</em>'.
	 * @see IOTApplication.Thing#getPreferLocation()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_PreferLocation();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.Thing#getImportance <em>Importance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importance</em>'.
	 * @see IOTApplication.Thing#getImportance()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Importance();

	/**
	 * Returns the meta object for the container reference '{@link IOTApplication.Thing#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see IOTApplication.Thing#getSystem()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_System();

	/**
	 * Returns the meta object for the reference '{@link IOTApplication.Thing#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see IOTApplication.Thing#getLocation()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Location();

	/**
	 * Returns the meta object for the reference '{@link IOTApplication.Thing#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see IOTApplication.Thing#getOwner()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Owner();

	/**
	 * Returns the meta object for class '{@link IOTApplication.Warner <em>Warner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warner</em>'.
	 * @see IOTApplication.Warner
	 * @generated
	 */
	EClass getWarner();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.Warner#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see IOTApplication.Warner#getName()
	 * @see #getWarner()
	 * @generated
	 */
	EAttribute getWarner_Name();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.Warner#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see IOTApplication.Warner#getMessage()
	 * @see #getWarner()
	 * @generated
	 */
	EAttribute getWarner_Message();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.Warner#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see IOTApplication.Warner#getLevel()
	 * @see #getWarner()
	 * @generated
	 */
	EAttribute getWarner_Level();

	/**
	 * Returns the meta object for the attribute '{@link IOTApplication.Warner#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see IOTApplication.Warner#getTime()
	 * @see #getWarner()
	 * @generated
	 */
	EAttribute getWarner_Time();

	/**
	 * Returns the meta object for the container reference '{@link IOTApplication.Warner#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see IOTApplication.Warner#getSystem()
	 * @see #getWarner()
	 * @generated
	 */
	EReference getWarner_System();

	/**
	 * Returns the meta object for the reference list '{@link IOTApplication.Warner#getWarnee <em>Warnee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Warnee</em>'.
	 * @see IOTApplication.Warner#getWarnee()
	 * @see #getWarner()
	 * @generated
	 */
	EReference getWarner_Warnee();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IOTApplicationFactory getIOTApplicationFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link IOTApplication.impl.AppSystemImpl <em>App System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IOTApplication.impl.AppSystemImpl
		 * @see IOTApplication.impl.IOTApplicationPackageImpl#getAppSystem()
		 * @generated
		 */
		EClass APP_SYSTEM = eINSTANCE.getAppSystem();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_SYSTEM__ROOM = eINSTANCE.getAppSystem_Room();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_SYSTEM__PERSON = eINSTANCE.getAppSystem_Person();

		/**
		 * The meta object literal for the '<em><b>Thing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_SYSTEM__THING = eINSTANCE.getAppSystem_Thing();

		/**
		 * The meta object literal for the '<em><b>Warner</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_SYSTEM__WARNER = eINSTANCE.getAppSystem_Warner();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_SYSTEM__NAME = eINSTANCE.getAppSystem_Name();

		/**
		 * The meta object literal for the '{@link IOTApplication.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IOTApplication.impl.RoomImpl
		 * @see IOTApplication.impl.IOTApplicationPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Hid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__HID = eINSTANCE.getRoom_Hid();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__TEMPERATURE = eINSTANCE.getRoom_Temperature();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__SYSTEM = eINSTANCE.getRoom_System();

		/**
		 * The meta object literal for the '<em><b>Thing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__THING = eINSTANCE.getRoom_Thing();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__PERSON = eINSTANCE.getRoom_Person();

		/**
		 * The meta object literal for the '<em><b>Brightness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__BRIGHTNESS = eINSTANCE.getRoom_Brightness();

		/**
		 * The meta object literal for the '{@link IOTApplication.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IOTApplication.impl.PersonImpl
		 * @see IOTApplication.impl.IOTApplicationPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Pid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PID = eINSTANCE.getPerson_Pid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GROUP = eINSTANCE.getPerson_Group();

		/**
		 * The meta object literal for the '<em><b>Office</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__OFFICE = eINSTANCE.getPerson_Office();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__SYSTEM = eINSTANCE.getPerson_System();

		/**
		 * The meta object literal for the '<em><b>Locate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__LOCATE = eINSTANCE.getPerson_Locate();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__HAS = eINSTANCE.getPerson_Has();

		/**
		 * The meta object literal for the '<em><b>Warner</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__WARNER = eINSTANCE.getPerson_Warner();

		/**
		 * The meta object literal for the '{@link IOTApplication.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IOTApplication.impl.ThingImpl
		 * @see IOTApplication.impl.IOTApplicationPackageImpl#getThing()
		 * @generated
		 */
		EClass THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__NAME = eINSTANCE.getThing_Name();

		/**
		 * The meta object literal for the '<em><b>Tid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__TID = eINSTANCE.getThing_Tid();

		/**
		 * The meta object literal for the '<em><b>Prefer Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__PREFER_LOCATION = eINSTANCE.getThing_PreferLocation();

		/**
		 * The meta object literal for the '<em><b>Importance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__IMPORTANCE = eINSTANCE.getThing_Importance();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__SYSTEM = eINSTANCE.getThing_System();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__LOCATION = eINSTANCE.getThing_Location();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__OWNER = eINSTANCE.getThing_Owner();

		/**
		 * The meta object literal for the '{@link IOTApplication.impl.WarnerImpl <em>Warner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IOTApplication.impl.WarnerImpl
		 * @see IOTApplication.impl.IOTApplicationPackageImpl#getWarner()
		 * @generated
		 */
		EClass WARNER = eINSTANCE.getWarner();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARNER__NAME = eINSTANCE.getWarner_Name();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARNER__MESSAGE = eINSTANCE.getWarner_Message();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARNER__LEVEL = eINSTANCE.getWarner_Level();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARNER__TIME = eINSTANCE.getWarner_Time();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WARNER__SYSTEM = eINSTANCE.getWarner_System();

		/**
		 * The meta object literal for the '<em><b>Warnee</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WARNER__WARNEE = eINSTANCE.getWarner_Warnee();

	}

} //IOTApplicationPackage
