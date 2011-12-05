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
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IOTApplication.Room#getHid <em>Hid</em>}</li>
 *   <li>{@link IOTApplication.Room#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link IOTApplication.Room#getSystem <em>System</em>}</li>
 *   <li>{@link IOTApplication.Room#getThing <em>Thing</em>}</li>
 *   <li>{@link IOTApplication.Room#getPerson <em>Person</em>}</li>
 *   <li>{@link IOTApplication.Room#getBrightness <em>Brightness</em>}</li>
 * </ul>
 * </p>
 *
 * @see IOTApplication.IOTApplicationPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Hid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hid</em>' attribute.
	 * @see #setHid(int)
	 * @see IOTApplication.IOTApplicationPackage#getRoom_Hid()
	 * @model
	 * @generated
	 */
	int getHid();

	/**
	 * Sets the value of the '{@link IOTApplication.Room#getHid <em>Hid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hid</em>' attribute.
	 * @see #getHid()
	 * @generated
	 */
	void setHid(int value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(double)
	 * @see IOTApplication.IOTApplicationPackage#getRoom_Temperature()
	 * @model default="0.0"
	 * @generated
	 */
	double getTemperature();

	/**
	 * Sets the value of the '{@link IOTApplication.Room#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(double value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link IOTApplication.AppSystem#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(AppSystem)
	 * @see IOTApplication.IOTApplicationPackage#getRoom_System()
	 * @see IOTApplication.AppSystem#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	AppSystem getSystem();

	/**
	 * Sets the value of the '{@link IOTApplication.Room#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(AppSystem value);

	/**
	 * Returns the value of the '<em><b>Thing</b></em>' reference list.
	 * The list contents are of type {@link IOTApplication.Thing}.
	 * It is bidirectional and its opposite is '{@link IOTApplication.Thing#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thing</em>' reference list.
	 * @see IOTApplication.IOTApplicationPackage#getRoom_Thing()
	 * @see IOTApplication.Thing#getLocation
	 * @model opposite="location"
	 * @generated
	 */
	EList<Thing> getThing();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference list.
	 * The list contents are of type {@link IOTApplication.Person}.
	 * It is bidirectional and its opposite is '{@link IOTApplication.Person#getLocate <em>Locate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference list.
	 * @see IOTApplication.IOTApplicationPackage#getRoom_Person()
	 * @see IOTApplication.Person#getLocate
	 * @model opposite="locate"
	 * @generated
	 */
	EList<Person> getPerson();

	/**
	 * Returns the value of the '<em><b>Brightness</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brightness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brightness</em>' attribute.
	 * @see #setBrightness(double)
	 * @see IOTApplication.IOTApplicationPackage#getRoom_Brightness()
	 * @model default="0.0"
	 * @generated
	 */
	double getBrightness();

	/**
	 * Sets the value of the '{@link IOTApplication.Room#getBrightness <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brightness</em>' attribute.
	 * @see #getBrightness()
	 * @generated
	 */
	void setBrightness(double value);

} // Room
