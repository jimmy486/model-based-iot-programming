
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RFID;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RFID.Reader#getRid <em>Rid</em>}</li>
 *   <li>{@link RFID.Reader#getBaudRate <em>Baud Rate</em>}</li>
 *   <li>{@link RFID.Reader#getPowerLevel <em>Power Level</em>}</li>
 *   <li>{@link RFID.Reader#getChannel <em>Channel</em>}</li>
 *   <li>{@link RFID.Reader#getCommandDuration <em>Command Duration</em>}</li>
 *   <li>{@link RFID.Reader#getCommandInterval <em>Command Interval</em>}</li>
 *   <li>{@link RFID.Reader#getMinSensitity <em>Min Sensitity</em>}</li>
 *   <li>{@link RFID.Reader#getSystem <em>System</em>}</li>
 *   <li>{@link RFID.Reader#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see RFID.RFIDPackage#getReader()
 * @model
 * @generated
 */
public interface Reader extends EObject
{
  /**
   * Returns the value of the '<em><b>Rid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rid</em>' attribute.
   * @see #setRid(int)
   * @see RFID.RFIDPackage#getReader_Rid()
   * @model required="true"
   * @generated
   */
  int getRid();

  /**
   * Sets the value of the '{@link RFID.Reader#getRid <em>Rid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rid</em>' attribute.
   * @see #getRid()
   * @generated
   */
  void setRid(int value);

  /**
   * Returns the value of the '<em><b>Baud Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Baud Rate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Baud Rate</em>' attribute.
   * @see #setBaudRate(int)
   * @see RFID.RFIDPackage#getReader_BaudRate()
   * @model required="true"
   * @generated
   */
  int getBaudRate();

  /**
   * Sets the value of the '{@link RFID.Reader#getBaudRate <em>Baud Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Baud Rate</em>' attribute.
   * @see #getBaudRate()
   * @generated
   */
  void setBaudRate(int value);

  /**
   * Returns the value of the '<em><b>Power Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Power Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Power Level</em>' attribute.
   * @see #setPowerLevel(String)
   * @see RFID.RFIDPackage#getReader_PowerLevel()
   * @model required="true"
   * @generated
   */
  String getPowerLevel();

  /**
   * Sets the value of the '{@link RFID.Reader#getPowerLevel <em>Power Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Power Level</em>' attribute.
   * @see #getPowerLevel()
   * @generated
   */
  void setPowerLevel(String value);

  /**
   * Returns the value of the '<em><b>Channel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Channel</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Channel</em>' attribute.
   * @see #setChannel(int)
   * @see RFID.RFIDPackage#getReader_Channel()
   * @model required="true"
   * @generated
   */
  int getChannel();

  /**
   * Sets the value of the '{@link RFID.Reader#getChannel <em>Channel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Channel</em>' attribute.
   * @see #getChannel()
   * @generated
   */
  void setChannel(int value);

  /**
   * Returns the value of the '<em><b>Command Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command Duration</em>' attribute.
   * @see #setCommandDuration(int)
   * @see RFID.RFIDPackage#getReader_CommandDuration()
   * @model required="true"
   * @generated
   */
  int getCommandDuration();

  /**
   * Sets the value of the '{@link RFID.Reader#getCommandDuration <em>Command Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command Duration</em>' attribute.
   * @see #getCommandDuration()
   * @generated
   */
  void setCommandDuration(int value);

  /**
   * Returns the value of the '<em><b>Command Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command Interval</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command Interval</em>' attribute.
   * @see #setCommandInterval(int)
   * @see RFID.RFIDPackage#getReader_CommandInterval()
   * @model required="true"
   * @generated
   */
  int getCommandInterval();

  /**
   * Sets the value of the '{@link RFID.Reader#getCommandInterval <em>Command Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command Interval</em>' attribute.
   * @see #getCommandInterval()
   * @generated
   */
  void setCommandInterval(int value);

  /**
   * Returns the value of the '<em><b>Min Sensitity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Sensitity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Sensitity</em>' attribute.
   * @see #setMinSensitity(double)
   * @see RFID.RFIDPackage#getReader_MinSensitity()
   * @model required="true"
   * @generated
   */
  double getMinSensitity();

  /**
   * Sets the value of the '{@link RFID.Reader#getMinSensitity <em>Min Sensitity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Sensitity</em>' attribute.
   * @see #getMinSensitity()
   * @generated
   */
  void setMinSensitity(double value);

  /**
   * Returns the value of the '<em><b>System</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link RFID.RFIDSystem#getReader <em>Reader</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' container reference.
   * @see #setSystem(RFIDSystem)
   * @see RFID.RFIDPackage#getReader_System()
   * @see RFID.RFIDSystem#getReader
   * @model opposite="reader"
   * @generated
   */
  RFIDSystem getSystem();

  /**
   * Sets the value of the '{@link RFID.Reader#getSystem <em>System</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' container reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(RFIDSystem value);

  /**
   * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
   * The list contents are of type {@link RFID.Tag}.
   * It is bidirectional and its opposite is '{@link RFID.Tag#getReader <em>Reader</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag</em>' containment reference list.
   * @see RFID.RFIDPackage#getReader_Tag()
   * @see RFID.Tag#getReader
   * @model opposite="Reader" containment="true" keys="tid"
   * @generated
   */
  EList<Tag> getTag();

} // Reader
