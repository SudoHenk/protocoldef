/**
 * generated by Xtext 2.14.0
 */
package nl.sudohenk.xtext.stateDef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.sudohenk.xtext.stateDef.MessageEnum#getName <em>Name</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.MessageEnum#getNames <em>Names</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.MessageEnum#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageEnum()
 * @model
 * @generated
 */
public interface MessageEnum extends EObject
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
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageEnum_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.sudohenk.xtext.stateDef.MessageEnum#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' attribute list.
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageEnum_Names()
   * @model unique="false"
   * @generated
   */
  EList<String> getNames();

  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageEnum_Values()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getValues();

} // MessageEnum
