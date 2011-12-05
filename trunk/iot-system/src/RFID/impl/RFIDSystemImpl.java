
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RFID.impl;

import RFID.RFIDPackage;
import RFID.RFIDSystem;
import RFID.Reader;
import RFID.Sensor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;
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
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RFID.impl.RFIDSystemImpl#getReader <em>Reader</em>}</li>
 *   <li>{@link RFID.impl.RFIDSystemImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link RFID.impl.RFIDSystemImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RFIDSystemImpl extends WrappingEObjectImpl implements RFIDSystem
{
  /**
   * The cached value of the '{@link #getReader() <em>Reader</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReader()
   * @generated
   * @ordered
   */
  protected EList<Reader> reader;

  /**
   * The cached value of the '{@link #getSensor() <em>Sensor</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensor()
   * @generated
   * @ordered
   */
  protected EList<Sensor> sensor;

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
  protected RFIDSystemImpl()
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
    return RFIDPackage.Literals.RFID_SYSTEM;
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
   public Object lookupCore(){
    Object result=null;
    result="D:\\IOTSystem\\RFIDReader";
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
    
    case RFIDPackage.RFID_SYSTEM__READER:
  
      result.add("1616");
result.add("1621");
result.add("1435");
result.add("1537");
result.add("1501");
    break;
    
    case RFIDPackage.RFID_SYSTEM__SENSOR:
  
      result.add("01616");
result.add("01621");
result.add("01435");
result.add("01537");
result.add("01501");
    break;
    
  
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
  public EList<Reader> getReader()
  {

    
    if (reader == null)
    {
  
  
    
      
      reader = new EObjectContainmentEListForWrapping<Reader>(
          Reader.class, 
          this, 
          RFIDPackage.RFID_SYSTEM__READER,
          RFIDPackage.eINSTANCE.getReader()
        );
        
  }
  
      ((EObjectContainmentEListForWrapping<Reader>)reader)
      .refreshWrap();
  
    return reader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Sensor> getSensor()
  {

    
    if (sensor == null)
    {
  
  
    
      
      sensor = new EObjectContainmentEListForWrapping<Sensor>(
          Sensor.class, 
          this, 
          RFIDPackage.RFID_SYSTEM__SENSOR,
          RFIDPackage.eINSTANCE.getSensor()
        );
        
  }
  
      ((EObjectContainmentEListForWrapping<Sensor>)sensor)
      .refreshWrap();
  
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
        Object result=null;
        String core=(String)getCore();
        if(core==null) return name;	
        name="test";
    return name; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
        	
      String core=(String)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.RFID_SYSTEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RFIDPackage.RFID_SYSTEM__READER:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getReader()).basicAdd(otherEnd, msgs);
      case RFIDPackage.RFID_SYSTEM__SENSOR:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSensor()).basicAdd(otherEnd, msgs);
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
      case RFIDPackage.RFID_SYSTEM__READER:
        return ((InternalEList<?>)getReader()).basicRemove(otherEnd, msgs);
      case RFIDPackage.RFID_SYSTEM__SENSOR:
        return ((InternalEList<?>)getSensor()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RFIDPackage.RFID_SYSTEM__READER:
        return getReader();
      case RFIDPackage.RFID_SYSTEM__SENSOR:
        return getSensor();
      case RFIDPackage.RFID_SYSTEM__NAME:
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RFIDPackage.RFID_SYSTEM__READER:
        getReader().clear();
        getReader().addAll((Collection<? extends Reader>)newValue);
        return;
      case RFIDPackage.RFID_SYSTEM__SENSOR:
        getSensor().clear();
        getSensor().addAll((Collection<? extends Sensor>)newValue);
        return;
      case RFIDPackage.RFID_SYSTEM__NAME:
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RFIDPackage.RFID_SYSTEM__READER:
        getReader().clear();
        return;
      case RFIDPackage.RFID_SYSTEM__SENSOR:
        getSensor().clear();
        return;
      case RFIDPackage.RFID_SYSTEM__NAME:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RFIDPackage.RFID_SYSTEM__READER:
        return reader != null && !reader.isEmpty();
      case RFIDPackage.RFID_SYSTEM__SENSOR:
        return sensor != null && !sensor.isEmpty();
      case RFIDPackage.RFID_SYSTEM__NAME:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RFIDSystemImpl
