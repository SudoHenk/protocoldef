/**
 * generated by Xtext 2.14.0
 */
package nl.sudohenk.xtext.stateDef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.sudohenk.xtext.stateDef.MessageStruct#getName <em>Name</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.MessageStruct#getStructEntries <em>Struct Entries</em>}</li>
 * </ul>
 *
 * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageStruct()
 * @model
 * @generated
 */
public interface MessageStruct extends EObject
{
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
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageStruct_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.sudohenk.xtext.stateDef.MessageStruct#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Struct Entries</b></em>' containment reference list.
   * The list contents are of type {@link nl.sudohenk.xtext.stateDef.MessageStructEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct Entries</em>' containment reference list.
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageStruct_StructEntries()
   * @model containment="true"
   * @generated
   */
  EList<MessageStructEntry> getStructEntries();

} // MessageStruct
