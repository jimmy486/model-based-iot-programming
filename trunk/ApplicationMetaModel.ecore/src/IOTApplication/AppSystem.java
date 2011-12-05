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
 * A representation of the model object '<em><b>App System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IOTApplication.AppSystem#getRoom <em>Room</em>}</li>
 *   <li>{@link IOTApplication.AppSystem#getPerson <em>Person</em>}</li>
 *   <li>{@link IOTApplication.AppSystem#getThing <em>Thing</em>}</li>
 *   <li>{@link IOTApplication.AppSystem#getWarner <em>Warner</em>}</li>
 *   <li>{@link IOTApplication.AppSystem#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see IOTApplication.IOTApplicationPackage#getAppSystem()
 * @model
 * @generated
 */
public interface AppSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' containment reference list.
	 * The list contents are of type {@link IOTApplication.Room}.
	 * It is bidirectional and its opposite is '{@link IOTApplication.Room#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' containment reference list.
	 * @see IOTApplication.IOTApplicationPackage#getAppSystem_Room()
	 * @see IOTApplication.Room#getSystem
	 * @model opposite="system" containment="true" keys="hid"
	 * @generated
	 */
	EList<Room> getRoom();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link IOTApplication.Person}.
	 * It is bidirectional and its opposite is '{@link IOTApplication.Person#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see IOTApplication.IOTApplicationPackage#getAppSystem_Person()
	 * @see IOTApplication.Person#getSystem
	 * @model opposite="System" containment="true" keys="pid"
	 * @generated
	 */
	EList<Person> getPerson();

	/**
	 * Returns the value of the '<em><b>Thing</b></em>' containment reference list.
	 * The list contents are of type {@link IOTApplication.Thing}.
	 * It is bidirectional and its opposite is '{@link IOTApplication.Thing#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thing</em>' containment reference list.
	 * @see IOTApplication.IOTApplicationPackage#getAppSystem_Thing()
	 * @see IOTApplication.Thing#getSystem
	 * @model opposite="System" containment="true" keys="tid"
	 * @generated
	 */
	EList<Thing> getThing();

	/**
	 * Returns the value of the '<em><b>Warner</b></em>' containment reference list.
	 * The list contents are of type {@link IOTApplication.Warner}.
	 * It is bidirectional and its opposite is '{@link IOTApplication.Warner#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warner</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warner</em>' containment reference list.
	 * @see IOTApplication.IOTApplicationPackage#getAppSystem_Warner()
	 * @see IOTApplication.Warner#getSystem
	 * @model opposite="System" containment="true"
	 * @generated
	 */
	EList<Warner> getWarner();

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
	 * @see IOTApplication.IOTApplicationPackage#getAppSystem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IOTApplication.AppSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AppSystem
