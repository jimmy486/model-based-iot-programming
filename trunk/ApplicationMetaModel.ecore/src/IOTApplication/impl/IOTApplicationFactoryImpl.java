/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IOTApplication.impl;

import IOTApplication.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IOTApplicationFactoryImpl extends EFactoryImpl implements IOTApplicationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IOTApplicationFactory init() {
		try {
			IOTApplicationFactory theIOTApplicationFactory = (IOTApplicationFactory)EPackage.Registry.INSTANCE.getEFactory("http://sei.pku.edu.cn/iot/application/old"); 
			if (theIOTApplicationFactory != null) {
				return theIOTApplicationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IOTApplicationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOTApplicationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IOTApplicationPackage.APP_SYSTEM: return createAppSystem();
			case IOTApplicationPackage.ROOM: return createRoom();
			case IOTApplicationPackage.PERSON: return createPerson();
			case IOTApplicationPackage.THING: return createThing();
			case IOTApplicationPackage.WARNER: return createWarner();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppSystem createAppSystem() {
		AppSystemImpl appSystem = new AppSystemImpl();
		return appSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing createThing() {
		ThingImpl thing = new ThingImpl();
		return thing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Warner createWarner() {
		WarnerImpl warner = new WarnerImpl();
		return warner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOTApplicationPackage getIOTApplicationPackage() {
		return (IOTApplicationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IOTApplicationPackage getPackage() {
		return IOTApplicationPackage.eINSTANCE;
	}

} //IOTApplicationFactoryImpl
