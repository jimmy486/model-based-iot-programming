/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IOTApplication;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IOTApplication.Person#getPid <em>Pid</em>}</li>
 *   <li>{@link IOTApplication.Person#getName <em>Name</em>}</li>
 *   <li>{@link IOTApplication.Person#getGroup <em>Group</em>}</li>
 *   <li>{@link IOTApplication.Person#getOffice <em>Office</em>}</li>
 *   <li>{@link IOTApplication.Person#getGender <em>Gender</em>}</li>
 *   <li>{@link IOTApplication.Person#getSystem <em>System</em>}</li>
 *   <li>{@link IOTApplication.Person#getLocate <em>Locate</em>}</li>
 *   <li>{@link IOTApplication.Person#getHas <em>Has</em>}</li>
 *   <li>{@link IOTApplication.Person#getWarner <em>Warner</em>}</li>
 * </ul>
 * </p>
 *
 * @see IOTApplication.IOTApplicationPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pid</em>' attribute.
	 * @see #setPid(int)
	 * @see IOTApplication.IOTApplicationPackage#getPerson_Pid()
	 * @model
	 * @generated
	 */
	int getPid();

	/**
	 * Sets the value of the '{@link IOTApplication.Person#getPid <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pid</em>' attribute.
	 * @see #getPid()
	 * @generated
	 */
	void setPid(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see IOTApplication.IOTApplicationPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IOTApplication.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see IOTApplication.IOTApplicationPackage#getPerson_Group()
	 * @model
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link IOTApplication.Person#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Office</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Office</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Office</em>' attribute.
	 * @see #setOffice(int)
	 * @see IOTApplication.IOTApplicationPackage#getPerson_Office()
	 * @model
	 * @generated
	 */
	int getOffice();

	/**
	 * Sets the value of the '{@link IOTApplication.Person#getOffice <em>Office</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Office</em>' attribute.
	 * @see #getOffice()
	 * @generated
	 */
	void setOffice(int value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see #setGender(String)
	 * @see IOTApplication.IOTApplicationPackage#getPerson_Gender()
	 * @model
	 * @generated
	 */
	String getGender();

	/**
	 * Sets the value of the '{@link IOTApplication.Person#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(String value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link IOTApplication.AppSystem#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(AppSystem)
	 * @see IOTApplication.IOTApplicationPackage#getPerson_System()
	 * @see IOTApplication.AppSystem#getPerson
	 * @model opposite="person"
	 * @generated
	 */
	AppSystem getSystem();

	/**
	 * Sets the value of the '{@link IOTApplication.Person#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(AppSystem value);

	/**
	 * Returns the value of the '<em><b>Locate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IOTApplication.Room#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locate</em>' reference.
	 * @see #setLocate(Room)
	 * @see IOTApplication.IOTApplicationPackage#getPerson_Locate()
	 * @see IOTApplication.Room#getPerson
	 * @model opposite="person"
	 * @generated
	 */
	Room getLocate();

	/**
	 * Sets the value of the '{@link IOTApplication.Person#getLocate <em>Locate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locate</em>' reference.
	 * @see #getLocate()
	 * @generated
	 */
	void setLocate(Room value);

	/**
	 * Returns the value of the '<em><b>Has</b></em>' reference list.
	 * The list contents are of type {@link IOTApplication.Thing}.
	 * It is bidirectional and its opposite is '{@link IOTApplication.Thing#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' reference list.
	 * @see IOTApplication.IOTApplicationPackage#getPerson_Has()
	 * @see IOTApplication.Thing#getOwner
	 * @model opposite="owner"
	 * @generated
	 */
	EList<Thing> getHas();

	/**
	 * Returns the value of the '<em><b>Warner</b></em>' reference list.
	 * The list contents are of type {@link IOTApplication.Warner}.
	 * It is bidirectional and its opposite is '{@link IOTApplication.Warner#getWarnee <em>Warnee</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warner</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warner</em>' reference list.
	 * @see IOTApplication.IOTApplicationPackage#getPerson_Warner()
	 * @see IOTApplication.Warner#getWarnee
	 * @model opposite="warnee" required="true"
	 * @generated
	 */
	EList<Warner> getWarner();

} // Person
