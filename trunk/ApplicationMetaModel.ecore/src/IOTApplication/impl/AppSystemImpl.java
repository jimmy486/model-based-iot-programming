/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IOTApplication.impl;

import IOTApplication.AppSystem;
import IOTApplication.IOTApplicationPackage;
import IOTApplication.Person;
import IOTApplication.Room;
import IOTApplication.Thing;
import IOTApplication.Warner;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IOTApplication.impl.AppSystemImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link IOTApplication.impl.AppSystemImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link IOTApplication.impl.AppSystemImpl#getThing <em>Thing</em>}</li>
 *   <li>{@link IOTApplication.impl.AppSystemImpl#getWarner <em>Warner</em>}</li>
 *   <li>{@link IOTApplication.impl.AppSystemImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppSystemImpl extends EObjectImpl implements AppSystem {
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> room;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> person;

	/**
	 * The cached value of the '{@link #getThing() <em>Thing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThing()
	 * @generated
	 * @ordered
	 */
	protected EList<Thing> thing;

	/**
	 * The cached value of the '{@link #getWarner() <em>Warner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarner()
	 * @generated
	 * @ordered
	 */
	protected EList<Warner> warner;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTApplicationPackage.Literals.APP_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoom() {
		if (room == null) {
			room = new EObjectContainmentWithInverseEList<Room>(Room.class, this, IOTApplicationPackage.APP_SYSTEM__ROOM, IOTApplicationPackage.ROOM__SYSTEM);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPerson() {
		if (person == null) {
			person = new EObjectContainmentWithInverseEList<Person>(Person.class, this, IOTApplicationPackage.APP_SYSTEM__PERSON, IOTApplicationPackage.PERSON__SYSTEM);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Thing> getThing() {
		if (thing == null) {
			thing = new EObjectContainmentWithInverseEList<Thing>(Thing.class, this, IOTApplicationPackage.APP_SYSTEM__THING, IOTApplicationPackage.THING__SYSTEM);
		}
		return thing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Warner> getWarner() {
		if (warner == null) {
			warner = new EObjectContainmentWithInverseEList<Warner>(Warner.class, this, IOTApplicationPackage.APP_SYSTEM__WARNER, IOTApplicationPackage.WARNER__SYSTEM);
		}
		return warner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.APP_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IOTApplicationPackage.APP_SYSTEM__ROOM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoom()).basicAdd(otherEnd, msgs);
			case IOTApplicationPackage.APP_SYSTEM__PERSON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPerson()).basicAdd(otherEnd, msgs);
			case IOTApplicationPackage.APP_SYSTEM__THING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getThing()).basicAdd(otherEnd, msgs);
			case IOTApplicationPackage.APP_SYSTEM__WARNER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWarner()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IOTApplicationPackage.APP_SYSTEM__ROOM:
				return ((InternalEList<?>)getRoom()).basicRemove(otherEnd, msgs);
			case IOTApplicationPackage.APP_SYSTEM__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case IOTApplicationPackage.APP_SYSTEM__THING:
				return ((InternalEList<?>)getThing()).basicRemove(otherEnd, msgs);
			case IOTApplicationPackage.APP_SYSTEM__WARNER:
				return ((InternalEList<?>)getWarner()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IOTApplicationPackage.APP_SYSTEM__ROOM:
				return getRoom();
			case IOTApplicationPackage.APP_SYSTEM__PERSON:
				return getPerson();
			case IOTApplicationPackage.APP_SYSTEM__THING:
				return getThing();
			case IOTApplicationPackage.APP_SYSTEM__WARNER:
				return getWarner();
			case IOTApplicationPackage.APP_SYSTEM__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IOTApplicationPackage.APP_SYSTEM__ROOM:
				getRoom().clear();
				getRoom().addAll((Collection<? extends Room>)newValue);
				return;
			case IOTApplicationPackage.APP_SYSTEM__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends Person>)newValue);
				return;
			case IOTApplicationPackage.APP_SYSTEM__THING:
				getThing().clear();
				getThing().addAll((Collection<? extends Thing>)newValue);
				return;
			case IOTApplicationPackage.APP_SYSTEM__WARNER:
				getWarner().clear();
				getWarner().addAll((Collection<? extends Warner>)newValue);
				return;
			case IOTApplicationPackage.APP_SYSTEM__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IOTApplicationPackage.APP_SYSTEM__ROOM:
				getRoom().clear();
				return;
			case IOTApplicationPackage.APP_SYSTEM__PERSON:
				getPerson().clear();
				return;
			case IOTApplicationPackage.APP_SYSTEM__THING:
				getThing().clear();
				return;
			case IOTApplicationPackage.APP_SYSTEM__WARNER:
				getWarner().clear();
				return;
			case IOTApplicationPackage.APP_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IOTApplicationPackage.APP_SYSTEM__ROOM:
				return room != null && !room.isEmpty();
			case IOTApplicationPackage.APP_SYSTEM__PERSON:
				return person != null && !person.isEmpty();
			case IOTApplicationPackage.APP_SYSTEM__THING:
				return thing != null && !thing.isEmpty();
			case IOTApplicationPackage.APP_SYSTEM__WARNER:
				return warner != null && !warner.isEmpty();
			case IOTApplicationPackage.APP_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AppSystemImpl
