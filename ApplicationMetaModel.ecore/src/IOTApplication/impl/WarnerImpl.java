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
 * An implementation of the model object '<em><b>Warner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IOTApplication.impl.WarnerImpl#getName <em>Name</em>}</li>
 *   <li>{@link IOTApplication.impl.WarnerImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link IOTApplication.impl.WarnerImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link IOTApplication.impl.WarnerImpl#getTime <em>Time</em>}</li>
 *   <li>{@link IOTApplication.impl.WarnerImpl#getSystem <em>System</em>}</li>
 *   <li>{@link IOTApplication.impl.WarnerImpl#getWarnee <em>Warnee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WarnerImpl extends EObjectImpl implements Warner {
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
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWarnee() <em>Warnee</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarnee()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> warnee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WarnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTApplicationPackage.Literals.WARNER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.WARNER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.WARNER__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.WARNER__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(String newTime) {
		String oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.WARNER__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppSystem getSystem() {
		if (eContainerFeatureID() != IOTApplicationPackage.WARNER__SYSTEM) return null;
		return (AppSystem)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(AppSystem newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystem, IOTApplicationPackage.WARNER__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(AppSystem newSystem) {
		if (newSystem != eInternalContainer() || (eContainerFeatureID() != IOTApplicationPackage.WARNER__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, IOTApplicationPackage.APP_SYSTEM__WARNER, AppSystem.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.WARNER__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getWarnee() {
		if (warnee == null) {
			warnee = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this, IOTApplicationPackage.WARNER__WARNEE, IOTApplicationPackage.PERSON__WARNER);
		}
		return warnee;
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
			case IOTApplicationPackage.WARNER__SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystem((AppSystem)otherEnd, msgs);
			case IOTApplicationPackage.WARNER__WARNEE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWarnee()).basicAdd(otherEnd, msgs);
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
			case IOTApplicationPackage.WARNER__SYSTEM:
				return basicSetSystem(null, msgs);
			case IOTApplicationPackage.WARNER__WARNEE:
				return ((InternalEList<?>)getWarnee()).basicRemove(otherEnd, msgs);
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
			case IOTApplicationPackage.WARNER__SYSTEM:
				return eInternalContainer().eInverseRemove(this, IOTApplicationPackage.APP_SYSTEM__WARNER, AppSystem.class, msgs);
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
			case IOTApplicationPackage.WARNER__NAME:
				return getName();
			case IOTApplicationPackage.WARNER__MESSAGE:
				return getMessage();
			case IOTApplicationPackage.WARNER__LEVEL:
				return getLevel();
			case IOTApplicationPackage.WARNER__TIME:
				return getTime();
			case IOTApplicationPackage.WARNER__SYSTEM:
				return getSystem();
			case IOTApplicationPackage.WARNER__WARNEE:
				return getWarnee();
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
			case IOTApplicationPackage.WARNER__NAME:
				setName((String)newValue);
				return;
			case IOTApplicationPackage.WARNER__MESSAGE:
				setMessage((String)newValue);
				return;
			case IOTApplicationPackage.WARNER__LEVEL:
				setLevel((Integer)newValue);
				return;
			case IOTApplicationPackage.WARNER__TIME:
				setTime((String)newValue);
				return;
			case IOTApplicationPackage.WARNER__SYSTEM:
				setSystem((AppSystem)newValue);
				return;
			case IOTApplicationPackage.WARNER__WARNEE:
				getWarnee().clear();
				getWarnee().addAll((Collection<? extends Person>)newValue);
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
			case IOTApplicationPackage.WARNER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IOTApplicationPackage.WARNER__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case IOTApplicationPackage.WARNER__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case IOTApplicationPackage.WARNER__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case IOTApplicationPackage.WARNER__SYSTEM:
				setSystem((AppSystem)null);
				return;
			case IOTApplicationPackage.WARNER__WARNEE:
				getWarnee().clear();
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
			case IOTApplicationPackage.WARNER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IOTApplicationPackage.WARNER__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case IOTApplicationPackage.WARNER__LEVEL:
				return level != LEVEL_EDEFAULT;
			case IOTApplicationPackage.WARNER__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case IOTApplicationPackage.WARNER__SYSTEM:
				return getSystem() != null;
			case IOTApplicationPackage.WARNER__WARNEE:
				return warnee != null && !warnee.isEmpty();
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
		result.append(", message: ");
		result.append(message);
		result.append(", level: ");
		result.append(level);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //WarnerImpl
