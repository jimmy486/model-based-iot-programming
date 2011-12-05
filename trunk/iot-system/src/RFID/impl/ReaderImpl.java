
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RFID.impl;
import java.sql.*;
import RFID.RFIDPackage;
import RFID.RFIDSystem;
import RFID.Reader;
import RFID.Tag;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
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
 * An implementation of the model object '<em><b>Reader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RFID.impl.ReaderImpl#getRid <em>Rid</em>}</li>
 *   <li>{@link RFID.impl.ReaderImpl#getBaudRate <em>Baud Rate</em>}</li>
 *   <li>{@link RFID.impl.ReaderImpl#getPowerLevel <em>Power Level</em>}</li>
 *   <li>{@link RFID.impl.ReaderImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link RFID.impl.ReaderImpl#getCommandDuration <em>Command Duration</em>}</li>
 *   <li>{@link RFID.impl.ReaderImpl#getCommandInterval <em>Command Interval</em>}</li>
 *   <li>{@link RFID.impl.ReaderImpl#getMinSensitity <em>Min Sensitity</em>}</li>
 *   <li>{@link RFID.impl.ReaderImpl#getSystem <em>System</em>}</li>
 *   <li>{@link RFID.impl.ReaderImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReaderImpl extends WrappingEObjectImpl implements Reader
{
  /**
   * The default value of the '{@link #getRid() <em>Rid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRid()
   * @generated
   * @ordered
   */
  protected static final int RID_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRid() <em>Rid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRid()
   * @generated
   * @ordered
   */
  protected int rid = RID_EDEFAULT;

  /**
   * The default value of the '{@link #getBaudRate() <em>Baud Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaudRate()
   * @generated
   * @ordered
   */
  protected static final int BAUD_RATE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBaudRate() <em>Baud Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaudRate()
   * @generated
   * @ordered
   */
  protected int baudRate = BAUD_RATE_EDEFAULT;

  /**
   * The default value of the '{@link #getPowerLevel() <em>Power Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPowerLevel()
   * @generated
   * @ordered
   */
  protected static final String POWER_LEVEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPowerLevel() <em>Power Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPowerLevel()
   * @generated
   * @ordered
   */
  protected String powerLevel = POWER_LEVEL_EDEFAULT;

  /**
   * The default value of the '{@link #getChannel() <em>Channel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannel()
   * @generated
   * @ordered
   */
  protected static final int CHANNEL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getChannel() <em>Channel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannel()
   * @generated
   * @ordered
   */
  protected int channel = CHANNEL_EDEFAULT;

  /**
   * The default value of the '{@link #getCommandDuration() <em>Command Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommandDuration()
   * @generated
   * @ordered
   */
  protected static final int COMMAND_DURATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCommandDuration() <em>Command Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommandDuration()
   * @generated
   * @ordered
   */
  protected int commandDuration = COMMAND_DURATION_EDEFAULT;

  /**
   * The default value of the '{@link #getCommandInterval() <em>Command Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommandInterval()
   * @generated
   * @ordered
   */
  protected static final int COMMAND_INTERVAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCommandInterval() <em>Command Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommandInterval()
   * @generated
   * @ordered
   */
  protected int commandInterval = COMMAND_INTERVAL_EDEFAULT;

  /**
   * The default value of the '{@link #getMinSensitity() <em>Min Sensitity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinSensitity()
   * @generated
   * @ordered
   */
  protected static final double MIN_SENSITITY_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getMinSensitity() <em>Min Sensitity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinSensitity()
   * @generated
   * @ordered
   */
  protected double minSensitity = MIN_SENSITITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getTag() <em>Tag</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected EList<Tag> tag;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReaderImpl()
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
    return RFIDPackage.Literals.READER;
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
    
  
  
  
  
  
  
  
  
    case RFIDPackage.READER__TAG:
  
      final  String driverName = "oracle.jdbc.driver.OracleDriver"; 
   final  String serverName = "192.168.4.193";
   final  String portNumber = "1521";
   final  String sid = "orcl";
   final  String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
   final  String username = "iot";
   final  String password = "oslab";
   Connection conn;
   
   try
   {
     Class.forName(driverName);
     conn = DriverManager.getConnection(url, username, password);
     Statement s;
     s = conn.createStatement();
     String query = "select RFID from rfidstatus where status='" + core + "'";
//     System.out.println("*********************");
//     System.out.println(query);
//     System.out.println("*********************");
     
     ResultSet rs = s.executeQuery(query);
     while(rs.next())
     {
//			 System.out.println(core + "  " + rs.getInt(1));
       result.add("" + rs.getInt(1));
     }
     conn.close();
   }
   catch (Exception e)
   {
    e.printStackTrace();
   }
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
  public int getRid()
  {
        Object result=null;
        String core=(String)getCore();
        if(core==null) return rid;	
        rid=new Integer(core).intValue();
    return rid; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRid(int newRid)
  {
    int oldRid = rid;
    rid = newRid;
        	
      String core=(String)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.READER__RID, oldRid, rid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBaudRate()
  {
        Object result=null;
        String core=(String)getCore();
        if(core==null) return baudRate;
    return baudRate; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaudRate(int newBaudRate)
  {
    int oldBaudRate = baudRate;
    baudRate = newBaudRate;
        	
      String core=(String)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.READER__BAUD_RATE, oldBaudRate, baudRate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPowerLevel()
  {
        Object result=null;
        String core=(String)getCore();
        if(core==null) return powerLevel;
    return powerLevel; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPowerLevel(String newPowerLevel)
  {
    String oldPowerLevel = powerLevel;
    powerLevel = newPowerLevel;
        	
      String core=(String)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.READER__POWER_LEVEL, oldPowerLevel, powerLevel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getChannel()
  {
        Object result=null;
        String core=(String)getCore();
        if(core==null) return channel;
    return channel; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChannel(int newChannel)
  {
    int oldChannel = channel;
    channel = newChannel;
        	
      String core=(String)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.READER__CHANNEL, oldChannel, channel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCommandDuration()
  {
        Object result=null;
        String core=(String)getCore();
        if(core==null) return commandDuration;
    return commandDuration; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommandDuration(int newCommandDuration)
  {
    int oldCommandDuration = commandDuration;
    commandDuration = newCommandDuration;
        	
      String core=(String)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.READER__COMMAND_DURATION, oldCommandDuration, commandDuration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCommandInterval()
  {
        Object result=null;
        String core=(String)getCore();
        if(core==null) return commandInterval;
    return commandInterval; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommandInterval(int newCommandInterval)
  {
    int oldCommandInterval = commandInterval;
    commandInterval = newCommandInterval;
        	
      String core=(String)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.READER__COMMAND_INTERVAL, oldCommandInterval, commandInterval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getMinSensitity()
  {
        Object result=null;
        String core=(String)getCore();
        if(core==null) return minSensitity;
    return minSensitity; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinSensitity(double newMinSensitity)
  {
    double oldMinSensitity = minSensitity;
    minSensitity = newMinSensitity;
        	
      String core=(String)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.READER__MIN_SENSITITY, oldMinSensitity, minSensitity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RFIDSystem getSystem()
  {
    if (eContainerFeatureID != RFIDPackage.READER__SYSTEM) return null;
    return (RFIDSystem)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSystem(RFIDSystem newSystem, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newSystem, RFIDPackage.READER__SYSTEM, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystem(RFIDSystem newSystem)
  {
    if (newSystem != eInternalContainer() || (eContainerFeatureID != RFIDPackage.READER__SYSTEM && newSystem != null))
    {
      if (EcoreUtil.isAncestor(this, newSystem))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newSystem != null)
        msgs = ((InternalEObject)newSystem).eInverseAdd(this, RFIDPackage.RFID_SYSTEM__READER, RFIDSystem.class, msgs);
      msgs = basicSetSystem(newSystem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFIDPackage.READER__SYSTEM, newSystem, newSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Tag> getTag()
  {

    
    if (tag == null)
    {
  
  
    
      
      tag = new EObjectContainmentEListForWrapping<Tag>(
          Tag.class, 
          this, 
          RFIDPackage.READER__TAG,
          RFIDPackage.eINSTANCE.getTag()
        );
        
  }
  
      ((EObjectContainmentEListForWrapping<Tag>)tag)
      .refreshWrap();
  
    return tag;
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
      case RFIDPackage.READER__SYSTEM:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetSystem((RFIDSystem)otherEnd, msgs);
      case RFIDPackage.READER__TAG:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getTag()).basicAdd(otherEnd, msgs);
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
      case RFIDPackage.READER__SYSTEM:
        return basicSetSystem(null, msgs);
      case RFIDPackage.READER__TAG:
        return ((InternalEList<?>)getTag()).basicRemove(otherEnd, msgs);
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
      case RFIDPackage.READER__SYSTEM:
        return eInternalContainer().eInverseRemove(this, RFIDPackage.RFID_SYSTEM__READER, RFIDSystem.class, msgs);
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
      case RFIDPackage.READER__RID:
        return new Integer(getRid());
      case RFIDPackage.READER__BAUD_RATE:
        return new Integer(getBaudRate());
      case RFIDPackage.READER__POWER_LEVEL:
        return getPowerLevel();
      case RFIDPackage.READER__CHANNEL:
        return new Integer(getChannel());
      case RFIDPackage.READER__COMMAND_DURATION:
        return new Integer(getCommandDuration());
      case RFIDPackage.READER__COMMAND_INTERVAL:
        return new Integer(getCommandInterval());
      case RFIDPackage.READER__MIN_SENSITITY:
        return new Double(getMinSensitity());
      case RFIDPackage.READER__SYSTEM:
        return getSystem();
      case RFIDPackage.READER__TAG:
        return getTag();
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
      case RFIDPackage.READER__RID:
        setRid(((Integer)newValue).intValue());
        return;
      case RFIDPackage.READER__BAUD_RATE:
        setBaudRate(((Integer)newValue).intValue());
        return;
      case RFIDPackage.READER__POWER_LEVEL:
        setPowerLevel((String)newValue);
        return;
      case RFIDPackage.READER__CHANNEL:
        setChannel(((Integer)newValue).intValue());
        return;
      case RFIDPackage.READER__COMMAND_DURATION:
        setCommandDuration(((Integer)newValue).intValue());
        return;
      case RFIDPackage.READER__COMMAND_INTERVAL:
        setCommandInterval(((Integer)newValue).intValue());
        return;
      case RFIDPackage.READER__MIN_SENSITITY:
        setMinSensitity(((Double)newValue).doubleValue());
        return;
      case RFIDPackage.READER__SYSTEM:
        setSystem((RFIDSystem)newValue);
        return;
      case RFIDPackage.READER__TAG:
        getTag().clear();
        getTag().addAll((Collection<? extends Tag>)newValue);
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
      case RFIDPackage.READER__RID:
        setRid(RID_EDEFAULT);
        return;
      case RFIDPackage.READER__BAUD_RATE:
        setBaudRate(BAUD_RATE_EDEFAULT);
        return;
      case RFIDPackage.READER__POWER_LEVEL:
        setPowerLevel(POWER_LEVEL_EDEFAULT);
        return;
      case RFIDPackage.READER__CHANNEL:
        setChannel(CHANNEL_EDEFAULT);
        return;
      case RFIDPackage.READER__COMMAND_DURATION:
        setCommandDuration(COMMAND_DURATION_EDEFAULT);
        return;
      case RFIDPackage.READER__COMMAND_INTERVAL:
        setCommandInterval(COMMAND_INTERVAL_EDEFAULT);
        return;
      case RFIDPackage.READER__MIN_SENSITITY:
        setMinSensitity(MIN_SENSITITY_EDEFAULT);
        return;
      case RFIDPackage.READER__SYSTEM:
        setSystem((RFIDSystem)null);
        return;
      case RFIDPackage.READER__TAG:
        getTag().clear();
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
      case RFIDPackage.READER__RID:
        return rid != RID_EDEFAULT;
      case RFIDPackage.READER__BAUD_RATE:
        return baudRate != BAUD_RATE_EDEFAULT;
      case RFIDPackage.READER__POWER_LEVEL:
        return POWER_LEVEL_EDEFAULT == null ? powerLevel != null : !POWER_LEVEL_EDEFAULT.equals(powerLevel);
      case RFIDPackage.READER__CHANNEL:
        return channel != CHANNEL_EDEFAULT;
      case RFIDPackage.READER__COMMAND_DURATION:
        return commandDuration != COMMAND_DURATION_EDEFAULT;
      case RFIDPackage.READER__COMMAND_INTERVAL:
        return commandInterval != COMMAND_INTERVAL_EDEFAULT;
      case RFIDPackage.READER__MIN_SENSITITY:
        return minSensitity != MIN_SENSITITY_EDEFAULT;
      case RFIDPackage.READER__SYSTEM:
        return getSystem() != null;
      case RFIDPackage.READER__TAG:
        return tag != null && !tag.isEmpty();
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
    result.append(" (rid: ");
    result.append(rid);
    result.append(", baudRate: ");
    result.append(baudRate);
    result.append(", powerLevel: ");
    result.append(powerLevel);
    result.append(", channel: ");
    result.append(channel);
    result.append(", commandDuration: ");
    result.append(commandDuration);
    result.append(", commandInterval: ");
    result.append(commandInterval);
    result.append(", minSensitity: ");
    result.append(minSensitity);
    result.append(')');
    return result.toString();
  }

} //ReaderImpl
