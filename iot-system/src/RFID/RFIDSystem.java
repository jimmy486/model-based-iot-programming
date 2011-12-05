
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
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RFID.RFIDSystem#getReader <em>Reader</em>}</li>
 *   <li>{@link RFID.RFIDSystem#getSensor <em>Sensor</em>}</li>
 *   <li>{@link RFID.RFIDSystem#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see RFID.RFIDPackage#getRFIDSystem()
 * @model
 * @generated
 */
public interface RFIDSystem extends EObject
{
  /**
   * Returns the value of the '<em><b>Reader</b></em>' containment reference list.
   * The list contents are of type {@link RFID.Reader}.
   * It is bidirectional and its opposite is '{@link RFID.Reader#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reader</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reader</em>' containment reference list.
   * @see RFID.RFIDPackage#getRFIDSystem_Reader()
   * @see RFID.Reader#getSystem
   * @model opposite="system" containment="true" keys="rid"
   * @generated
   */
  EList<Reader> getReader();

  /**
   * Returns the value of the '<em><b>Sensor</b></em>' containment reference list.
   * The list contents are of type {@link RFID.Sensor}.
   * It is bidirectional and its opposite is '{@link RFID.Sensor#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensor</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor</em>' containment reference list.
   * @see RFID.RFIDPackage#getRFIDSystem_Sensor()
   * @see RFID.Sensor#getSystem
   * @model opposite="System" containment="true"
   * @generated
   */
  EList<Sensor> getSensor();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see RFID.RFIDPackage#getRFIDSystem_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link RFID.RFIDSystem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // RFIDSystem
