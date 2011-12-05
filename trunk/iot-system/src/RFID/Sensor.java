
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RFID;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RFID.Sensor#getSid <em>Sid</em>}</li>
 *   <li>{@link RFID.Sensor#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link RFID.Sensor#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link RFID.Sensor#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see RFID.RFIDPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends EObject
{
  /**
   * Returns the value of the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sid</em>' attribute.
   * @see #setSid(int)
   * @see RFID.RFIDPackage#getSensor_Sid()
   * @model
   * @generated
   */
  int getSid();

  /**
   * Sets the value of the '{@link RFID.Sensor#getSid <em>Sid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sid</em>' attribute.
   * @see #getSid()
   * @generated
   */
  void setSid(int value);

  /**
   * Returns the value of the '<em><b>Temperature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temperature</em>' attribute.
   * @see #setTemperature(double)
   * @see RFID.RFIDPackage#getSensor_Temperature()
   * @model
   * @generated
   */
  double getTemperature();

  /**
   * Sets the value of the '{@link RFID.Sensor#getTemperature <em>Temperature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temperature</em>' attribute.
   * @see #getTemperature()
   * @generated
   */
  void setTemperature(double value);

  /**
   * Returns the value of the '<em><b>Brightness</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Brightness</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Brightness</em>' attribute.
   * @see #setBrightness(double)
   * @see RFID.RFIDPackage#getSensor_Brightness()
   * @model
   * @generated
   */
  double getBrightness();

  /**
   * Sets the value of the '{@link RFID.Sensor#getBrightness <em>Brightness</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Brightness</em>' attribute.
   * @see #getBrightness()
   * @generated
   */
  void setBrightness(double value);

  /**
   * Returns the value of the '<em><b>System</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link RFID.RFIDSystem#getSensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' container reference.
   * @see #setSystem(RFIDSystem)
   * @see RFID.RFIDPackage#getSensor_System()
   * @see RFID.RFIDSystem#getSensor
   * @model opposite="sensor"
   * @generated
   */
  RFIDSystem getSystem();

  /**
   * Sets the value of the '{@link RFID.Sensor#getSystem <em>System</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' container reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(RFIDSystem value);

} // Sensor
