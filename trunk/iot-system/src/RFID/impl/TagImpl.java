
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RFID.impl;

import RFID.RFIDPackage;
import RFID.Reader;
import RFID.Tag;

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
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RFID.impl.TagImpl#getTid <em>Tid</em>}</li>
 *   <li>{@link RFID.impl.TagImpl#getSemaphore <em>Semaphore</em>}</li>
 *   <li>{@link RFID.impl.TagImpl#getPower <em>Power</em>}</li>
 *   <li>{@link RFID.impl.TagImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link RFID.impl.TagImpl#isLowPower <em>Low Power</em>}</li>
 *   <li>{@link RFID.impl.TagImpl#getLastReciveTime <em>Last Recive Time</em>}</li>
 *   <li>{@link RFID.impl.TagImpl#getReader <em>Reader</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TagImpl extends WrappingEObjectImpl implements Tag
{
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
   * The default value of the '{@link #getSemaphore() <em>Semaphore</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemaphore()
   * @generated
   * @ordered
   */
  protected static final double SEMAPHORE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getSemaphore() <em>Semaphore</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemaphore()
   * @generated
   * @ordered
   */
  protected double semaphore = SEMAPHORE_EDEFAULT;

  /**
   * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPower()
   * @generated
   * @ordered
   */
  protected static final int POWER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPower()
   * @generated
   * @ordered
   */
  protected int power = POWER_EDEFAULT;

  /**
   * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected static final int PERIOD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected int period = PERIOD_EDEFAULT;

  /**
   * The default value of the '{@link #isLowPower() <em>Low Power</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLowPower()
   * @generated
   * @ordered
   */
  protected static final boolean LOW_POWER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLowPower() <em>Low Power</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLowPower()
   * @generated
   * @ordered
   */
  protected boolean lowPower = LOW_POWER_EDEFAULT;

  /**
   * The default value of the '{@link #getLastReciveTime() <em>Last Recive Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastReciveTime()
   * @generated
   * @ordered
   */
  protected static final String LAST_RECIVE_TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLastReciveTime() <em>Last Recive Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastReciveTime()
   * @generated
   * @ordered
   */
  protected String lastReciveTime = LAST_RECIVE_TIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TagImpl()
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
    return RFIDPackage.Literals.TAG;
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
  
    String core=(String)this.getCore();
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
  public int getTid()
  {
        Object result=null;
        String core=(String)getCore();
        if(core==null) return tid;	
        tid=new Integer(core).intValue();
    return tid; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTid(int newTid)
  {
    int oldTid = tid;
    tid = newTid;
        	
      String core=(String)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.TAG__TID, oldTid, tid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getSemaphore()
  {
        Object result=null;
        String core=(String)getCore();
        if(core==null) return semaphore;
    return semaphore; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSemaphore(double newSemaphore)
  {
    double oldSemaphore = semaphore;
    semaphore = newSemaphore;
        	
      String core=(String)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.TAG__SEMAPHORE, oldSemaphore, semaphore));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPower()
  {
        Object result=null;
        String core=(String)getCore();
        if(core==null) return power;
    return power; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPower(int newPower)
  {
    int oldPower = power;
    power = newPower;
        	
      String core=(String)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.TAG__POWER, oldPower, power));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPeriod()
  {
        Object result=null;
        String core=(String)getCore();
        if(core==null) return period;
    return period; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPeriod(int newPeriod)
  {
    int oldPeriod = period;
    period = newPeriod;
        	
      String core=(String)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.TAG__PERIOD, oldPeriod, period));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLowPower()
  {
        Object result=null;
        String core=(String)getCore();
        if(core==null) return lowPower;
    return lowPower; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowPower(boolean newLowPower)
  {
    boolean oldLowPower = lowPower;
    lowPower = newLowPower;
        	
      String core=(String)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.TAG__LOW_POWER, oldLowPower, lowPower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLastReciveTime()
  {
        Object result=null;
        String core=(String)getCore();
        if(core==null) return lastReciveTime;
    return lastReciveTime; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLastReciveTime(String newLastReciveTime)
  {
    String oldLastReciveTime = lastReciveTime;
    lastReciveTime = newLastReciveTime;
        	
      String core=(String)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.TAG__LAST_RECIVE_TIME, oldLastReciveTime, lastReciveTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reader getReader()
  {
    if (eContainerFeatureID != RFIDPackage.TAG__READER) return null;
    return (Reader)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReader(Reader newReader, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newReader, RFIDPackage.TAG__READER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReader(Reader newReader)
  {
    if (newReader != eInternalContainer() || (eContainerFeatureID != RFIDPackage.TAG__READER && newReader != null))
    {
      if (EcoreUtil.isAncestor(this, newReader))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newReader != null)
        msgs = ((InternalEObject)newReader).eInverseAdd(this, RFIDPackage.READER__TAG, Reader.class, msgs);
      msgs = basicSetReader(newReader, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.TAG__READER, newReader, newReader));
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
      case RFIDPackage.TAG__READER:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetReader((Reader)otherEnd, msgs);
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
      case RFIDPackage.TAG__READER:
        return basicSetReader(null, msgs);
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
      case RFIDPackage.TAG__READER:
        return eInternalContainer().eInverseRemove(this, RFIDPackage.READER__TAG, Reader.class, msgs);
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
      case RFIDPackage.TAG__TID:
        return new Integer(getTid());
      case RFIDPackage.TAG__SEMAPHORE:
        return new Double(getSemaphore());
      case RFIDPackage.TAG__POWER:
        return new Integer(getPower());
      case RFIDPackage.TAG__PERIOD:
        return new Integer(getPeriod());
      case RFIDPackage.TAG__LOW_POWER:
        return isLowPower() ? Boolean.TRUE : Boolean.FALSE;
      case RFIDPackage.TAG__LAST_RECIVE_TIME:
        return getLastReciveTime();
      case RFIDPackage.TAG__READER:
        return getReader();
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
      case RFIDPackage.TAG__TID:
        setTid(((Integer)newValue).intValue());
        return;
      case RFIDPackage.TAG__SEMAPHORE:
        setSemaphore(((Double)newValue).doubleValue());
        return;
      case RFIDPackage.TAG__POWER:
        setPower(((Integer)newValue).intValue());
        return;
      case RFIDPackage.TAG__PERIOD:
        setPeriod(((Integer)newValue).intValue());
        return;
      case RFIDPackage.TAG__LOW_POWER:
        setLowPower(((Boolean)newValue).booleanValue());
        return;
      case RFIDPackage.TAG__LAST_RECIVE_TIME:
        setLastReciveTime((String)newValue);
        return;
      case RFIDPackage.TAG__READER:
        setReader((Reader)newValue);
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
      case RFIDPackage.TAG__TID:
        setTid(TID_EDEFAULT);
        return;
      case RFIDPackage.TAG__SEMAPHORE:
        setSemaphore(SEMAPHORE_EDEFAULT);
        return;
      case RFIDPackage.TAG__POWER:
        setPower(POWER_EDEFAULT);
        return;
      case RFIDPackage.TAG__PERIOD:
        setPeriod(PERIOD_EDEFAULT);
        return;
      case RFIDPackage.TAG__LOW_POWER:
        setLowPower(LOW_POWER_EDEFAULT);
        return;
      case RFIDPackage.TAG__LAST_RECIVE_TIME:
        setLastReciveTime(LAST_RECIVE_TIME_EDEFAULT);
        return;
      case RFIDPackage.TAG__READER:
        setReader((Reader)null);
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
      case RFIDPackage.TAG__TID:
        return tid != TID_EDEFAULT;
      case RFIDPackage.TAG__SEMAPHORE:
        return semaphore != SEMAPHORE_EDEFAULT;
      case RFIDPackage.TAG__POWER:
        return power != POWER_EDEFAULT;
      case RFIDPackage.TAG__PERIOD:
        return period != PERIOD_EDEFAULT;
      case RFIDPackage.TAG__LOW_POWER:
        return lowPower != LOW_POWER_EDEFAULT;
      case RFIDPackage.TAG__LAST_RECIVE_TIME:
        return LAST_RECIVE_TIME_EDEFAULT == null ? lastReciveTime != null : !LAST_RECIVE_TIME_EDEFAULT.equals(lastReciveTime);
      case RFIDPackage.TAG__READER:
        return getReader() != null;
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
    result.append(" (tid: ");
    result.append(tid);
    result.append(", semaphore: ");
    result.append(semaphore);
    result.append(", power: ");
    result.append(power);
    result.append(", period: ");
    result.append(period);
    result.append(", lowPower: ");
    result.append(lowPower);
    result.append(", lastReciveTime: ");
    result.append(lastReciveTime);
    result.append(')');
    return result.toString();
  }

} //TagImpl
