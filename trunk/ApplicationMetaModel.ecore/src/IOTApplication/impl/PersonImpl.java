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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IOTApplication.impl.PersonImpl#getPid <em>Pid</em>}</li>
 *   <li>{@link IOTApplication.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link IOTApplication.impl.PersonImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link IOTApplication.impl.PersonImpl#getOffice <em>Office</em>}</li>
 *   <li>{@link IOTApplication.impl.PersonImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link IOTApplication.impl.PersonImpl#getSystem <em>System</em>}</li>
 *   <li>{@link IOTApplication.impl.PersonImpl#getLocate <em>Locate</em>}</li>
 *   <li>{@link IOTApplication.impl.PersonImpl#getHas <em>Has</em>}</li>
 *   <li>{@link IOTApplication.impl.PersonImpl#getWarner <em>Warner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
	/**
	 * The default value of the '{@link #getPid() <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected static final int PID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPid() <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected int pid = PID_EDEFAULT;

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
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffice() <em>Office</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffice()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffice() <em>Office</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffice()
	 * @generated
	 * @ordered
	 */
	protected int office = OFFICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final String GENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected String gender = GENDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocate() <em>Locate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocate()
	 * @generated
	 * @ordered
	 */
	protected Room locate;

	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected EList<Thing> has;

	/**
	 * The cached value of the '{@link #getWarner() <em>Warner</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarner()
	 * @generated
	 * @ordered
	 */
	protected EList<Warner> warner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTApplicationPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPid(int newPid) {
		int oldPid = pid;
		pid = newPid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.PERSON__PID, oldPid, pid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.PERSON__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffice() {
		return office;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffice(int newOffice) {
		int oldOffice = office;
		office = newOffice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.PERSON__OFFICE, oldOffice, office));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(String newGender) {
		String oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.PERSON__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppSystem getSystem() {
		if (eContainerFeatureID() != IOTApplicationPackage.PERSON__SYSTEM) return null;
		return (AppSystem)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(AppSystem newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystem, IOTApplicationPackage.PERSON__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(AppSystem newSystem) {
		if (newSystem != eInternalContainer() || (eContainerFeatureID() != IOTApplicationPackage.PERSON__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, IOTApplicationPackage.APP_SYSTEM__PERSON, AppSystem.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.PERSON__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getLocate() {
		if (locate != null && locate.eIsProxy()) {
			InternalEObject oldLocate = (InternalEObject)locate;
			locate = (Room)eResolveProxy(oldLocate);
			if (locate != oldLocate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IOTApplicationPackage.PERSON__LOCATE, oldLocate, locate));
			}
		}
		return locate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetLocate() {
		return locate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocate(Room newLocate, NotificationChain msgs) {
		Room oldLocate = locate;
		locate = newLocate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.PERSON__LOCATE, oldLocate, newLocate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocate(Room newLocate) {
		if (newLocate != locate) {
			NotificationChain msgs = null;
			if (locate != null)
				msgs = ((InternalEObject)locate).eInverseRemove(this, IOTApplicationPackage.ROOM__PERSON, Room.class, msgs);
			if (newLocate != null)
				msgs = ((InternalEObject)newLocate).eInverseAdd(this, IOTApplicationPackage.ROOM__PERSON, Room.class, msgs);
			msgs = basicSetLocate(newLocate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.PERSON__LOCATE, newLocate, newLocate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Thing> getHas() {
		if (has == null) {
			has = new EObjectWithInverseResolvingEList<Thing>(Thing.class, this, IOTApplicationPackage.PERSON__HAS, IOTApplicationPackage.THING__OWNER);
		}
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Warner> getWarner() {
		if (warner == null) {
			warner = new EObjectWithInverseResolvingEList.ManyInverse<Warner>(Warner.class, this, IOTApplicationPackage.PERSON__WARNER, IOTApplicationPackage.WARNER__WARNEE);
		}
		return warner;
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
			case IOTApplicationPackage.PERSON__SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystem((AppSystem)otherEnd, msgs);
			case IOTApplicationPackage.PERSON__LOCATE:
				if (locate != null)
					msgs = ((InternalEObject)locate).eInverseRemove(this, IOTApplicationPackage.ROOM__PERSON, Room.class, msgs);
				return basicSetLocate((Room)otherEnd, msgs);
			case IOTApplicationPackage.PERSON__HAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHas()).basicAdd(otherEnd, msgs);
			case IOTApplicationPackage.PERSON__WARNER:
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
			case IOTApplicationPackage.PERSON__SYSTEM:
				return basicSetSystem(null, msgs);
			case IOTApplicationPackage.PERSON__LOCATE:
				return basicSetLocate(null, msgs);
			case IOTApplicationPackage.PERSON__HAS:
				return ((InternalEList<?>)getHas()).basicRemove(otherEnd, msgs);
			case IOTApplicationPackage.PERSON__WARNER:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case IOTApplicationPackage.PERSON__SYSTEM:
				return eInternalContainer().eInverseRemove(this, IOTApplicationPackage.APP_SYSTEM__PERSON, AppSystem.class, msgs);
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
			case IOTApplicationPackage.PERSON__PID:
				return getPid();
			case IOTApplicationPackage.PERSON__NAME:
				return getName();
			case IOTApplicationPackage.PERSON__GROUP:
				return getGroup();
			case IOTApplicationPackage.PERSON__OFFICE:
				return getOffice();
			case IOTApplicationPackage.PERSON__GENDER:
				return getGender();
			case IOTApplicationPackage.PERSON__SYSTEM:
				return getSystem();
			case IOTApplicationPackage.PERSON__LOCATE:
				if (resolve) return getLocate();
				return basicGetLocate();
			case IOTApplicationPackage.PERSON__HAS:
				return getHas();
			case IOTApplicationPackage.PERSON__WARNER:
				return getWarner();
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
			case IOTApplicationPackage.PERSON__PID:
				setPid((Integer)newValue);
				return;
			case IOTApplicationPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case IOTApplicationPackage.PERSON__GROUP:
				setGroup((String)newValue);
				return;
			case IOTApplicationPackage.PERSON__OFFICE:
				setOffice((Integer)newValue);
				return;
			case IOTApplicationPackage.PERSON__GENDER:
				setGender((String)newValue);
				return;
			case IOTApplicationPackage.PERSON__SYSTEM:
				setSystem((AppSystem)newValue);
				return;
			case IOTApplicationPackage.PERSON__LOCATE:
				setLocate((Room)newValue);
				return;
			case IOTApplicationPackage.PERSON__HAS:
				getHas().clear();
				getHas().addAll((Collection<? extends Thing>)newValue);
				return;
			case IOTApplicationPackage.PERSON__WARNER:
				getWarner().clear();
				getWarner().addAll((Collection<? extends Warner>)newValue);
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
			case IOTApplicationPackage.PERSON__PID:
				setPid(PID_EDEFAULT);
				return;
			case IOTApplicationPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IOTApplicationPackage.PERSON__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case IOTApplicationPackage.PERSON__OFFICE:
				setOffice(OFFICE_EDEFAULT);
				return;
			case IOTApplicationPackage.PERSON__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case IOTApplicationPackage.PERSON__SYSTEM:
				setSystem((AppSystem)null);
				return;
			case IOTApplicationPackage.PERSON__LOCATE:
				setLocate((Room)null);
				return;
			case IOTApplicationPackage.PERSON__HAS:
				getHas().clear();
				return;
			case IOTApplicationPackage.PERSON__WARNER:
				getWarner().clear();
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
			case IOTApplicationPackage.PERSON__PID:
				return pid != PID_EDEFAULT;
			case IOTApplicationPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IOTApplicationPackage.PERSON__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case IOTApplicationPackage.PERSON__OFFICE:
				return office != OFFICE_EDEFAULT;
			case IOTApplicationPackage.PERSON__GENDER:
				return GENDER_EDEFAULT == null ? gender != null : !GENDER_EDEFAULT.equals(gender);
			case IOTApplicationPackage.PERSON__SYSTEM:
				return getSystem() != null;
			case IOTApplicationPackage.PERSON__LOCATE:
				return locate != null;
			case IOTApplicationPackage.PERSON__HAS:
				return has != null && !has.isEmpty();
			case IOTApplicationPackage.PERSON__WARNER:
				return warner != null && !warner.isEmpty();
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
		result.append(" (pid: ");
		result.append(pid);
		result.append(", name: ");
		result.append(name);
		result.append(", group: ");
		result.append(group);
		result.append(", office: ");
		result.append(office);
		result.append(", gender: ");
		result.append(gender);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
