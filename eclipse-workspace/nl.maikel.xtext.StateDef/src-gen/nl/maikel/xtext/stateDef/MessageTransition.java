/**
 * generated by Xtext 2.14.0
 */
package nl.sudohenk.xtext.stateDef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.sudohenk.xtext.stateDef.MessageTransition#getName <em>Name</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.MessageTransition#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.MessageTransition#getAnyState <em>Any State</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.MessageTransition#getReceivedMessages <em>Received Messages</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.MessageTransition#getSentMessages <em>Sent Messages</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.MessageTransition#getNextState <em>Next State</em>}</li>
 * </ul>
 *
 * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageTransition()
 * @model
 * @generated
 */
public interface MessageTransition extends EObject
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
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageTransition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.sudohenk.xtext.stateDef.MessageTransition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Current State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current State</em>' containment reference.
   * @see #setCurrentState(State)
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageTransition_CurrentState()
   * @model containment="true"
   * @generated
   */
  State getCurrentState();

  /**
   * Sets the value of the '{@link nl.sudohenk.xtext.stateDef.MessageTransition#getCurrentState <em>Current State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Current State</em>' containment reference.
   * @see #getCurrentState()
   * @generated
   */
  void setCurrentState(State value);

  /**
   * Returns the value of the '<em><b>Any State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Any State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any State</em>' attribute.
   * @see #setAnyState(String)
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageTransition_AnyState()
   * @model
   * @generated
   */
  String getAnyState();

  /**
   * Sets the value of the '{@link nl.sudohenk.xtext.stateDef.MessageTransition#getAnyState <em>Any State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Any State</em>' attribute.
   * @see #getAnyState()
   * @generated
   */
  void setAnyState(String value);

  /**
   * Returns the value of the '<em><b>Received Messages</b></em>' containment reference list.
   * The list contents are of type {@link nl.sudohenk.xtext.stateDef.Message}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Received Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Received Messages</em>' containment reference list.
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageTransition_ReceivedMessages()
   * @model containment="true"
   * @generated
   */
  EList<Message> getReceivedMessages();

  /**
   * Returns the value of the '<em><b>Sent Messages</b></em>' containment reference list.
   * The list contents are of type {@link nl.sudohenk.xtext.stateDef.Message}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sent Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sent Messages</em>' containment reference list.
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageTransition_SentMessages()
   * @model containment="true"
   * @generated
   */
  EList<Message> getSentMessages();

  /**
   * Returns the value of the '<em><b>Next State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next State</em>' containment reference.
   * @see #setNextState(State)
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#getMessageTransition_NextState()
   * @model containment="true"
   * @generated
   */
  State getNextState();

  /**
   * Sets the value of the '{@link nl.sudohenk.xtext.stateDef.MessageTransition#getNextState <em>Next State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next State</em>' containment reference.
   * @see #getNextState()
   * @generated
   */
  void setNextState(State value);

} // MessageTransition
