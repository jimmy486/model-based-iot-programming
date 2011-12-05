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
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IOTApplication.impl.RoomImpl#getHid <em>Hid</em>}</li>
 *   <li>{@link IOTApplication.impl.RoomImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link IOTApplication.impl.RoomImpl#getSystem <em>System</em>}</li>
 *   <li>{@link IOTApplication.impl.RoomImpl#getThing <em>Thing</em>}</li>
 *   <li>{@link IOTApplication.impl.RoomImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link IOTApplication.impl.RoomImpl#getBrightness <em>Brightness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomImpl extends EObjectImpl implements Room {
	/**
	 * The default value of the '{@link #getHid() <em>Hid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHid()
	 * @generated
	 * @ordered
	 */
	protected static final int HID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHid() <em>Hid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHid()
	 * @generated
	 * @ordered
	 */
	protected int hid = HID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final double TEMPERATURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected double temperature = TEMPERATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThing() <em>Thing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThing()
	 * @generated
	 * @ordered
	 */
	protected EList<Thing> thing;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> person;

	/**
	 * The default value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
	protected static final double BRIGHTNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
	protected double brightness = BRIGHTNESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTApplicationPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHid() {
		return hid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHid(int newHid) {
		int oldHid = hid;
		hid = newHid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.ROOM__HID, oldHid, hid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperature(double newTemperature) {
		double oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.ROOM__TEMPERATURE, oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppSystem getSystem() {
		if (eContainerFeatureID() != IOTApplicationPackage.ROOM__SYSTEM) return null;
		return (AppSystem)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(AppSystem newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystem, IOTApplicationPackage.ROOM__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(AppSystem newSystem) {
		if (newSystem != eInternalContainer() || (eContainerFeatureID() != IOTApplicationPackage.ROOM__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, IOTApplicationPackage.APP_SYSTEM__ROOM, AppSystem.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.ROOM__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Thing> getThing() {
		if (thing == null) {
			thing = new EObjectWithInverseResolvingEList<Thing>(Thing.class, this, IOTApplicationPackage.ROOM__THING, IOTApplicationPackage.THING__LOCATION);
		}
		return thing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPerson() {
		if (person == null) {
			person = new EObjectWithInverseResolvingEList<Person>(Person.class, this, IOTApplicationPackage.ROOM__PERSON, IOTApplicationPackage.PERSON__LOCATE);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBrightness() {
		return brightness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrightness(double newBrightness) {
		double oldBrightness = brightness;
		brightness = newBrightness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTApplicationPackage.ROOM__BRIGHTNESS, oldBrightness, brightness));
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
			case IOTApplicationPackage.ROOM__SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystem((AppSystem)otherEnd, msgs);
			case IOTApplicationPackage.ROOM__THING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getThing()).basicAdd(otherEnd, msgs);
			case IOTApplicationPackage.ROOM__PERSON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPerson()).basicAdd(otherEnd, msgs);
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
			case IOTApplicationPackage.ROOM__SYSTEM:
				return basicSetSystem(null, msgs);
			case IOTApplicationPackage.ROOM__THING:
				return ((InternalEList<?>)getThing()).basicRemove(otherEnd, msgs);
			case IOTApplicationPackage.ROOM__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
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
			case IOTApplicationPackage.ROOM__SYSTEM:
				return eInternalContainer().eInverseRemove(this, IOTApplicationPackage.APP_SYSTEM__ROOM, AppSystem.class, msgs);
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
			case IOTApplicationPackage.ROOM__HID:
				return getHid();
			case IOTApplicationPackage.ROOM__TEMPERATURE:
				return getTemperature();
			case IOTApplicationPackage.ROOM__SYSTEM:
				return getSystem();
			case IOTApplicationPackage.ROOM__THING:
				return getThing();
			case IOTApplicationPackage.ROOM__PERSON:
				return getPerson();
			case IOTApplicationPackage.ROOM__BRIGHTNESS:
				return getBrightness();
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
			case IOTApplicationPackage.ROOM__HID:
				setHid((Integer)newValue);
				return;
			case IOTApplicationPackage.ROOM__TEMPERATURE:
				setTemperature((Double)newValue);
				return;
			case IOTApplicationPackage.ROOM__SYSTEM:
				setSystem((AppSystem)newValue);
				return;
			case IOTApplicationPackage.ROOM__THING:
				getThing().clear();
				getThing().addAll((Collection<? extends Thing>)newValue);
				return;
			case IOTApplicationPackage.ROOM__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends Person>)newValue);
				return;
			case IOTApplicationPackage.ROOM__BRIGHTNESS:
				setBrightness((Double)newValue);
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
			case IOTApplicationPackage.ROOM__HID:
				setHid(HID_EDEFAULT);
				return;
			case IOTApplicationPackage.ROOM__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case IOTApplicationPackage.ROOM__SYSTEM:
				setSystem((AppSystem)null);
				return;
			case IOTApplicationPackage.ROOM__THING:
				getThing().clear();
				return;
			case IOTApplicationPackage.ROOM__PERSON:
				getPerson().clear();
				return;
			case IOTApplicationPackage.ROOM__BRIGHTNESS:
				setBrightness(BRIGHTNESS_EDEFAULT);
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
			case IOTApplicationPackage.ROOM__HID:
				return hid != HID_EDEFAULT;
			case IOTApplicationPackage.ROOM__TEMPERATURE:
				return temperature != TEMPERATURE_EDEFAULT;
			case IOTApplicationPackage.ROOM__SYSTEM:
				return getSystem() != null;
			case IOTApplicationPackage.ROOM__THING:
				return thing != null && !thing.isEmpty();
			case IOTApplicationPackage.ROOM__PERSON:
				return person != null && !person.isEmpty();
			case IOTApplicationPackage.ROOM__BRIGHTNESS:
				return brightness != BRIGHTNESS_EDEFAULT;
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
		result.append(" (hid: ");
		result.append(hid);
		result.append(", temperature: ");
		result.append(temperature);
		result.append(", brightness: ");
		result.append(brightness);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
