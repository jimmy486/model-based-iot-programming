
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
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RFID.Tag#getTid <em>Tid</em>}</li>
 *   <li>{@link RFID.Tag#getSemaphore <em>Semaphore</em>}</li>
 *   <li>{@link RFID.Tag#getPower <em>Power</em>}</li>
 *   <li>{@link RFID.Tag#getPeriod <em>Period</em>}</li>
 *   <li>{@link RFID.Tag#isLowPower <em>Low Power</em>}</li>
 *   <li>{@link RFID.Tag#getLastReciveTime <em>Last Recive Time</em>}</li>
 *   <li>{@link RFID.Tag#getReader <em>Reader</em>}</li>
 * </ul>
 * </p>
 *
 * @see RFID.RFIDPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends EObject
{
  /**
   * Returns the value of the '<em><b>Tid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tid</em>' attribute.
   * @see #setTid(int)
   * @see RFID.RFIDPackage#getTag_Tid()
   * @model required="true"
   * @generated
   */
  int getTid();

  /**
   * Sets the value of the '{@link RFID.Tag#getTid <em>Tid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tid</em>' attribute.
   * @see #getTid()
   * @generated
   */
  void setTid(int value);

  /**
   * Returns the value of the '<em><b>Semaphore</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Semaphore</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semaphore</em>' attribute.
   * @see #setSemaphore(double)
   * @see RFID.RFIDPackage#getTag_Semaphore()
   * @model required="true"
   * @generated
   */
  double getSemaphore();

  /**
   * Sets the value of the '{@link RFID.Tag#getSemaphore <em>Semaphore</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semaphore</em>' attribute.
   * @see #getSemaphore()
   * @generated
   */
  void setSemaphore(double value);

  /**
   * Returns the value of the '<em><b>Power</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Power</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Power</em>' attribute.
   * @see #setPower(int)
   * @see RFID.RFIDPackage#getTag_Power()
   * @model required="true"
   * @generated
   */
  int getPower();

  /**
   * Sets the value of the '{@link RFID.Tag#getPower <em>Power</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Power</em>' attribute.
   * @see #getPower()
   * @generated
   */
  void setPower(int value);

  /**
   * Returns the value of the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Period</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Period</em>' attribute.
   * @see #setPeriod(int)
   * @see RFID.RFIDPackage#getTag_Period()
   * @model required="true"
   * @generated
   */
  int getPeriod();

  /**
   * Sets the value of the '{@link RFID.Tag#getPeriod <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period</em>' attribute.
   * @see #getPeriod()
   * @generated
   */
  void setPeriod(int value);

  /**
   * Returns the value of the '<em><b>Low Power</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Low Power</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Low Power</em>' attribute.
   * @see #setLowPower(boolean)
   * @see RFID.RFIDPackage#getTag_LowPower()
   * @model required="true"
   * @generated
   */
  boolean isLowPower();

  /**
   * Sets the value of the '{@link RFID.Tag#isLowPower <em>Low Power</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Low Power</em>' attribute.
   * @see #isLowPower()
   * @generated
   */
  void setLowPower(boolean value);

  /**
   * Returns the value of the '<em><b>Last Recive Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last Recive Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last Recive Time</em>' attribute.
   * @see #setLastReciveTime(String)
   * @see RFID.RFIDPackage#getTag_LastReciveTime()
   * @model required="true"
   * @generated
   */
  String getLastReciveTime();

  /**
   * Sets the value of the '{@link RFID.Tag#getLastReciveTime <em>Last Recive Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last Recive Time</em>' attribute.
   * @see #getLastReciveTime()
   * @generated
   */
  void setLastReciveTime(String value);

  /**
   * Returns the value of the '<em><b>Reader</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link RFID.Reader#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reader</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reader</em>' container reference.
   * @see #setReader(Reader)
   * @see RFID.RFIDPackage#getTag_Reader()
   * @see RFID.Reader#getTag
   * @model opposite="tag"
   * @generated
   */
  Reader getReader();

  /**
   * Sets the value of the '{@link RFID.Tag#getReader <em>Reader</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reader</em>' container reference.
   * @see #getReader()
   * @generated
   */
  void setReader(Reader value);

} // Tag
