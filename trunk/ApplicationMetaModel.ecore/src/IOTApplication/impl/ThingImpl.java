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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IOTApplication.impl.ThingImpl#getName <em>Name</em>}</li>
 *   <li>{@link IOTApplication.impl.ThingImpl#getTid <em>Tid</em>}</li>
 *   <li>{@link IOTApplication.impl.ThingImpl#getPreferLocation <em>Prefer Location</em>}</li>
 *   <li>{@link IOTApplication.impl.ThingImpl#getImportance <em>Importance</em>}</li>
 *   <li>{@link IOTApplication.impl.ThingImpl#getSystem <em>System</em>}</li>
 *   <li>{@link IOTApplication.impl.ThingImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link IOTApplication.impl.ThingImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThingImpl extends EObjectImpl implements Thing {
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
	 * The default value of the '{@link #getTid() <em>Tid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTid()
	 * @generated
	 * @ordered
	 */
	protected static final int TID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTid() <em>Tid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTid()
	 * @generated
	 * @ordered
	 */
	protected int tid = TID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreferLocation() <em>Prefer Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferLocation()
	 * @generated
	 * @ordered
	 */
	protected static final int PREFER_LOCATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPreferLocation() <em>Prefer Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferLocation()
	 * @generated
	 * @ordered
	 */
	protected int preferLocation = PREFER_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportance() <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportance()
	 * @generated
	 * @ordered
	 */
	protected static final int IMPORTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getImportance() <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportance()
	 * @generated
	 * @ordered
	 */
	protected int importance = IMPORTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Room location;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Person owner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTApplicationPackage.Literals.THING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.THING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTid() {
		return tid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTid(int newTid) {
		int oldTid = tid;
		tid = newTid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.THING__TID, oldTid, tid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPreferLocation() {
		return preferLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferLocation(int newPreferLocation) {
		int oldPreferLocation = preferLocation;
		preferLocation = newPreferLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.THING__PREFER_LOCATION, oldPreferLocation, preferLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getImportance() {
		return importance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportance(int newImportance) {
		int oldImportance = importance;
		importance = newImportance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.THING__IMPORTANCE, oldImportance, importance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppSystem getSystem() {
		if (eContainerFeatureID() != IOTApplicationPackage.THING__SYSTEM) return null;
		return (AppSystem)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(AppSystem newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystem, IOTApplicationPackage.THING__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(AppSystem newSystem) {
		if (newSystem != eInternalContainer() || (eContainerFeatureID() != IOTApplicationPackage.THING__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, IOTApplicationPackage.APP_SYSTEM__THING, AppSystem.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.THING__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Room)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IOTApplicationPackage.THING__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Room newLocation, NotificationChain msgs) {
		Room oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.THING__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Room newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, IOTApplicationPackage.ROOM__THING, Room.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, IOTApplicationPackage.ROOM__THING, Room.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.THING__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Person)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IOTApplicationPackage.THING__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Person newOwner, NotificationChain msgs) {
		Person oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.THING__OWNER, oldOwner, newOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Person newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, IOTApplicationPackage.PERSON__HAS, Person.class, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, IOTApplicationPackage.PERSON__HAS, Person.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.THING__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IOTApplicationPackage.THING__SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystem((AppSystem)otherEnd, msgs);
			case IOTApplicationPackage.THING__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, IOTApplicationPackage.ROOM__THING, Room.class, msgs);
				return basicSetLocation((Room)otherEnd, msgs);
			case IOTApplicationPackage.THING__OWNER:
				if (owner != null)
					msgs = ((InternalEObject)owner).eInverseRemove(this, IOTApplicationPackage.PERSON__HAS, Person.class, msgs);
				return basicSetOwner((Person)otherEnd, msgs);
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
			case IOTApplicationPackage.THING__SYSTEM:
				return basicSetSystem(null, msgs);
			case IOTApplicationPackage.THING__LOCATION:
				return basicSetLocation(null, msgs);
			case IOTApplicationPackage.THING__OWNER:
				return basicSetOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case IOTApplicationPackage.THING__SYSTEM:
				return eInternalContainer().eInverseRemove(this, IOTApplicationPackage.APP_SYSTEM__THING, AppSystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IOTApplicationPackage.THING__NAME:
				return getName();
			case IOTApplicationPackage.THING__TID:
				return getTid();
			case IOTApplicationPackage.THING__PREFER_LOCATION:
				return getPreferLocation();
			case IOTApplicationPackage.THING__IMPORTANCE:
				return getImportance();
			case IOTApplicationPackage.THING__SYSTEM:
				return getSystem();
			case IOTApplicationPackage.THING__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case IOTApplicationPackage.THING__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IOTApplicationPackage.THING__NAME:
				setName((String)newValue);
				return;
			case IOTApplicationPackage.THING__TID:
				setTid((Integer)newValue);
				return;
			case IOTApplicationPackage.THING__PREFER_LOCATION:
				setPreferLocation((Integer)newValue);
				return;
			case IOTApplicationPackage.THING__IMPORTANCE:
				setImportance((Integer)newValue);
				return;
			case IOTApplicationPackage.THING__SYSTEM:
				setSystem((AppSystem)newValue);
				return;
			case IOTApplicationPackage.THING__LOCATION:
				setLocation((Room)newValue);
				return;
			case IOTApplicationPackage.THING__OWNER:
				setOwner((Person)newValue);
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
			case IOTApplicationPackage.THING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IOTApplicationPackage.THING__TID:
				setTid(TID_EDEFAULT);
				return;
			case IOTApplicationPackage.THING__PREFER_LOCATION:
				setPreferLocation(PREFER_LOCATION_EDEFAULT);
				return;
			case IOTApplicationPackage.THING__IMPORTANCE:
				setImportance(IMPORTANCE_EDEFAULT);
				return;
			case IOTApplicationPackage.THING__SYSTEM:
				setSystem((AppSystem)null);
				return;
			case IOTApplicationPackage.THING__LOCATION:
				setLocation((Room)null);
				return;
			case IOTApplicationPackage.THING__OWNER:
				setOwner((Person)null);
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
			case IOTApplicationPackage.THING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IOTApplicationPackage.THING__TID:
				return tid != TID_EDEFAULT;
			case IOTApplicationPackage.THING__PREFER_LOCATION:
				return preferLocation != PREFER_LOCATION_EDEFAULT;
			case IOTApplicationPackage.THING__IMPORTANCE:
				return importance != IMPORTANCE_EDEFAULT;
			case IOTApplicationPackage.THING__SYSTEM:
				return getSystem() != null;
			case IOTApplicationPackage.THING__LOCATION:
				return location != null;
			case IOTApplicationPackage.THING__OWNER:
				return owner != null;
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
		result.append(", tid: ");
		result.append(tid);
		result.append(", preferLocation: ");
		result.append(preferLocation);
		result.append(", importance: ");
		result.append(importance);
		result.append(')');
		return result.toString();
	}

} //ThingImpl
