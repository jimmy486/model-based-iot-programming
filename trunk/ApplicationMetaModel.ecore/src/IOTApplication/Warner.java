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
 * A representation of the model object '<em><b>Warner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IOTApplication.Warner#getName <em>Name</em>}</li>
 *   <li>{@link IOTApplication.Warner#getMessage <em>Message</em>}</li>
 *   <li>{@link IOTApplication.Warner#getLevel <em>Level</em>}</li>
 *   <li>{@link IOTApplication.Warner#getTime <em>Time</em>}</li>
 *   <li>{@link IOTApplication.Warner#getSystem <em>System</em>}</li>
 *   <li>{@link IOTApplication.Warner#getWarnee <em>Warnee</em>}</li>
 * </ul>
 * </p>
 *
 * @see IOTApplication.IOTApplicationPackage#getWarner()
 * @model
 * @generated
 */
public interface Warner extends EObject {
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
	 * @see IOTApplication.IOTApplicationPackage#getWarner_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IOTApplication.Warner#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see IOTApplication.IOTApplicationPackage#getWarner_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link IOTApplication.Warner#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see IOTApplication.IOTApplicationPackage#getWarner_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link IOTApplication.Warner#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see IOTApplication.IOTApplicationPackage#getWarner_Time()
	 * @model
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link IOTApplication.Warner#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link IOTApplication.AppSystem#getWarner <em>Warner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(AppSystem)
	 * @see IOTApplication.IOTApplicationPackage#getWarner_System()
	 * @see IOTApplication.AppSystem#getWarner
	 * @model opposite="warner"
	 * @generated
	 */
	AppSystem getSystem();

	/**
	 * Sets the value of the '{@link IOTApplication.Warner#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(AppSystem value);

	/**
	 * Returns the value of the '<em><b>Warnee</b></em>' reference list.
	 * The list contents are of type {@link IOTApplication.Person}.
	 * It is bidirectional and its opposite is '{@link IOTApplication.Person#getWarner <em>Warner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warnee</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warnee</em>' reference list.
	 * @see IOTApplication.IOTApplicationPackage#getWarner_Warnee()
	 * @see IOTApplication.Person#getWarner
	 * @model opposite="warner" required="true"
	 * @generated
	 */
	EList<Person> getWarnee();

} // Warner
