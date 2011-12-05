/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RFID.impl;

import RFID.*;

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
public class RFIDFactoryImpl extends EFactoryImpl implements RFIDFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RFIDFactory init()
  {
    try
    {
      RFIDFactory theRFIDFactory = (RFIDFactory)EPackage.Registry.INSTANCE.getEFactory("http://sei.pku.edu.cn/iot/rfid"); 
      if (theRFIDFactory != null)
      {
        return theRFIDFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RFIDFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RFIDFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RFIDPackage.RFID_SYSTEM: return createRFIDSystem();
      case RFIDPackage.TAG: return createTag();
      case RFIDPackage.READER: return createReader();
      case RFIDPackage.SENSOR: return createSensor();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RFIDSystem createRFIDSystem()
  {
    RFIDSystemImpl rfidSystem = new RFIDSystemImpl();
    return rfidSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tag createTag()
  {
    TagImpl tag = new TagImpl();
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reader createReader()
  {
    ReaderImpl reader = new ReaderImpl();
    return reader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sensor createSensor()
  {
    SensorImpl sensor = new SensorImpl();
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RFIDPackage getRFIDPackage()
  {
    return (RFIDPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RFIDPackage getPackage()
  {
    return RFIDPackage.eINSTANCE;
  }

} //RFIDFactoryImpl
