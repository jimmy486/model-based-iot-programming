/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IOTApplication;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see IOTApplication.IOTApplicationPackage
 * @generated
 */
public interface IOTApplicationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IOTApplicationFactory eINSTANCE = IOTApplication.impl.IOTApplicationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>App System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App System</em>'.
	 * @generated
	 */
	AppSystem createAppSystem();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thing</em>'.
	 * @generated
	 */
	Thing createThing();

	/**
	 * Returns a new object of class '<em>Warner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Warner</em>'.
	 * @generated
	 */
	Warner createWarner();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IOTApplicationPackage getIOTApplicationPackage();

} //IOTApplicationFactory
