
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RFID.impl;

import RFID.RFIDPackage;
import RFID.RFIDSystem;
import RFID.Sensor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import java.io.*;

import cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.WrappingEObjectImpl;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.EObjectContainmentEListForWrapping;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.EObjectResolvingEListForWrapping;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.ImagePool;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RFID.impl.SensorImpl#getSid <em>Sid</em>}</li>
 *   <li>{@link RFID.impl.SensorImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link RFID.impl.SensorImpl#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link RFID.impl.SensorImpl#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorImpl extends WrappingEObjectImpl implements Sensor
{
  /**
   * The default value of the '{@link #getSid() <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSid()
   * @generated
   * @ordered
   */
  protected static final int SID_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSid() <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSid()
   * @generated
   * @ordered
   */
  protected int sid = SID_EDEFAULT;

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
  protected SensorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RFIDPackage.Literals.SENSOR;
  }

  
  

  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
   public boolean isForCore(Object arg0){
   	boolean result=true;
   	if(core==null) return false;
    try{
    result=core.equals(arg0);
    }
    catch(Exception e){
      result=false;
    }
    return result;
  }
  

  
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
  public List listSubCores(int featureID){
    List result=new ArrayList();
  
    Object core=(Object)this.getCore();
    if(core==null) 
      return result;
    switch(featureID){
    
  
  
  
  
  }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
  public EClass getChildClassMap(Object object){
    RFIDPackage pack=RFIDPackage.eINSTANCE;	
  
  
  
  
    return null;
  }


      
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSid()
  {
        Object result=null;
        Object core=(Object)getCore();
        if(core==null) return sid;	
        String tmp=(String)(core);
sid=new Integer(tmp).intValue();
    return sid; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSid(int newSid)
  {
    int oldSid = sid;
    sid = newSid;
        	
      Object core=(Object)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.SENSOR__SID, oldSid, sid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getTemperature()
  {
        Object result=null;
        Object core=(Object)getCore();
        if(core==null) return temperature;	
        temperature=26.3;
    return temperature; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemperature(double newTemperature)
  {
    double oldTemperature = temperature;
    temperature = newTemperature;
        	
      Object core=(Object)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.SENSOR__TEMPERATURE, oldTemperature, temperature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getBrightness()
  {
        Object result=null;
        Object core=(Object)getCore();
        if(core==null) return brightness;	
        brightness=2.5;
    return brightness; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBrightness(double newBrightness)
  {
    double oldBrightness = brightness;
    brightness = newBrightness;
        	
      Object core=(Object)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.SENSOR__BRIGHTNESS, oldBrightness, brightness));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RFIDSystem getSystem()
  {
    if (eContainerFeatureID != RFIDPackage.SENSOR__SYSTEM) return null;
    return (RFIDSystem)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSystem(RFIDSystem newSystem, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newSystem, RFIDPackage.SENSOR__SYSTEM, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystem(RFIDSystem newSystem)
  {
    if (newSystem != eInternalContainer() || (eContainerFeatureID != RFIDPackage.SENSOR__SYSTEM && newSystem != null))
    {
      if (EcoreUtil.isAncestor(this, newSystem))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newSystem != null)
        msgs = ((InternalEObject)newSystem).eInverseAdd(this, RFIDPackage.RFID_SYSTEM__SENSOR, RFIDSystem.class, msgs);
      msgs = basicSetSystem(newSystem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.SENSOR__SYSTEM, newSystem, newSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RFIDPackage.SENSOR__SYSTEM:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetSystem((RFIDSystem)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RFIDPackage.SENSOR__SYSTEM:
        return basicSetSystem(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
      case RFIDPackage.SENSOR__SYSTEM:
        return eInternalContainer().eInverseRemove(this, RFIDPackage.RFID_SYSTEM__SENSOR, RFIDSystem.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RFIDPackage.SENSOR__SID:
        return new Integer(getSid());
      case RFIDPackage.SENSOR__TEMPERATURE:
        return new Double(getTemperature());
      case RFIDPackage.SENSOR__BRIGHTNESS:
        return new Double(getBrightness());
      case RFIDPackage.SENSOR__SYSTEM:
        return getSystem();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RFIDPackage.SENSOR__SID:
        setSid(((Integer)newValue).intValue());
        return;
      case RFIDPackage.SENSOR__TEMPERATURE:
        setTemperature(((Double)newValue).doubleValue());
        return;
      case RFIDPackage.SENSOR__BRIGHTNESS:
        setBrightness(((Double)newValue).doubleValue());
        return;
      case RFIDPackage.SENSOR__SYSTEM:
        setSystem((RFIDSystem)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RFIDPackage.SENSOR__SID:
        setSid(SID_EDEFAULT);
        return;
      case RFIDPackage.SENSOR__TEMPERATURE:
        setTemperature(TEMPERATURE_EDEFAULT);
        return;
      case RFIDPackage.SENSOR__BRIGHTNESS:
        setBrightness(BRIGHTNESS_EDEFAULT);
        return;
      case RFIDPackage.SENSOR__SYSTEM:
        setSystem((RFIDSystem)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RFIDPackage.SENSOR__SID:
        return sid != SID_EDEFAULT;
      case RFIDPackage.SENSOR__TEMPERATURE:
        return temperature != TEMPERATURE_EDEFAULT;
      case RFIDPackage.SENSOR__BRIGHTNESS:
        return brightness != BRIGHTNESS_EDEFAULT;
      case RFIDPackage.SENSOR__SYSTEM:
        return getSystem() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (sid: ");
    result.append(sid);
    result.append(", temperature: ");
    result.append(temperature);
    result.append(", brightness: ");
    result.append(brightness);
    result.append(')');
    return result.toString();
  }

} //SensorImpl
