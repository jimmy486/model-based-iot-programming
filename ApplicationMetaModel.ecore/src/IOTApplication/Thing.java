/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IOTApplication;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IOTApplication.Thing#getName <em>Name</em>}</li>
 *   <li>{@link IOTApplication.Thing#getTid <em>Tid</em>}</li>
 *   <li>{@link IOTApplication.Thing#getPreferLocation <em>Prefer Location</em>}</li>
 *   <li>{@link IOTApplication.Thing#getImportance <em>Importance</em>}</li>
 *   <li>{@link IOTApplication.Thing#getSystem <em>System</em>}</li>
 *   <li>{@link IOTApplication.Thing#getLocation <em>Location</em>}</li>
 *   <li>{@link IOTApplication.Thing#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see IOTApplication.IOTApplicationPackage#getThing()
 * @model
 * @generated
 */
public interface Thing extends EObject {
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
	 * @see IOTApplication.IOTApplicationPackage#getThing_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IOTApplication.Thing#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tid</em>' attribute.
	 * @see #setTid(int)
	 * @see IOTApplication.IOTApplicationPackage#getThing_Tid()
	 * @model
	 * @generated
	 */
	int getTid();

	/**
	 * Sets the value of the '{@link IOTApplication.Thing#getTid <em>Tid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tid</em>' attribute.
	 * @see #getTid()
	 * @generated
	 */
	void setTid(int value);

	/**
	 * Returns the value of the '<em><b>Prefer Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefer Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefer Location</em>' attribute.
	 * @see #setPreferLocation(int)
	 * @see IOTApplication.IOTApplicationPackage#getThing_PreferLocation()
	 * @model
	 * @generated
	 */
	int getPreferLocation();

	/**
	 * Sets the value of the '{@link IOTApplication.Thing#getPreferLocation <em>Prefer Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefer Location</em>' attribute.
	 * @see #getPreferLocation()
	 * @generated
	 */
	void setPreferLocation(int value);

	/**
	 * Returns the value of the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importance</em>' attribute.
	 * @see #setImportance(int)
	 * @see IOTApplication.IOTApplicationPackage#getThing_Importance()
	 * @model
	 * @generated
	 */
	int getImportance();

	/**
	 * Sets the value of the '{@link IOTApplication.Thing#getImportance <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importance</em>' attribute.
	 * @see #getImportance()
	 * @generated
	 */
	void setImportance(int value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link IOTApplication.AppSystem#getThing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(AppSystem)
	 * @see IOTApplication.IOTApplicationPackage#getThing_System()
	 * @see IOTApplication.AppSystem#getThing
	 * @model opposite="thing"
	 * @generated
	 */
	AppSystem getSystem();

	/**
	 * Sets the value of the '{@link IOTApplication.Thing#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(AppSystem value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IOTApplication.Room#getThing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Room)
	 * @see IOTApplication.IOTApplicationPackage#getThing_Location()
	 * @see IOTApplication.Room#getThing
	 * @model opposite="thing"
	 * @generated
	 */
	Room getLocation();

	/**
	 * Sets the value of the '{@link IOTApplication.Thing#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Room value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IOTApplication.Person#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Person)
	 * @see IOTApplication.IOTApplicationPackage#getThing_Owner()
	 * @see IOTApplication.Person#getHas
	 * @model opposite="has" required="true"
	 * @generated
	 */
	Person getOwner();

	/**
	 * Sets the value of the '{@link IOTApplication.Thing#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Person value);

} // Thing
