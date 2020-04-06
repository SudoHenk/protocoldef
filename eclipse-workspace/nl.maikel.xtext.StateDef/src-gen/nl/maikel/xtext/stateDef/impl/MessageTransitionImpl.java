/**
 * generated by Xtext 2.14.0
 */
package nl.sudohenk.xtext.stateDef.impl;

import java.util.Collection;

import nl.sudohenk.xtext.stateDef.Message;
import nl.sudohenk.xtext.stateDef.MessageTransition;
import nl.sudohenk.xtext.stateDef.State;
import nl.sudohenk.xtext.stateDef.StateDefPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.sudohenk.xtext.stateDef.impl.MessageTransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.impl.MessageTransitionImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.impl.MessageTransitionImpl#getAnyState <em>Any State</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.impl.MessageTransitionImpl#getReceivedMessages <em>Received Messages</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.impl.MessageTransitionImpl#getSentMessages <em>Sent Messages</em>}</li>
 *   <li>{@link nl.sudohenk.xtext.stateDef.impl.MessageTransitionImpl#getNextState <em>Next State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageTransitionImpl extends MinimalEObjectImpl.Container implements MessageTransition
{
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
   * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrentState()
   * @generated
   * @ordered
   */
  protected State currentState;

  /**
   * The default value of the '{@link #getAnyState() <em>Any State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnyState()
   * @generated
   * @ordered
   */
  protected static final String ANY_STATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAnyState() <em>Any State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnyState()
   * @generated
   * @ordered
   */
  protected String anyState = ANY_STATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getReceivedMessages() <em>Received Messages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceivedMessages()
   * @generated
   * @ordered
   */
  protected EList<Message> receivedMessages;

  /**
   * The cached value of the '{@link #getSentMessages() <em>Sent Messages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSentMessages()
   * @generated
   * @ordered
   */
  protected EList<Message> sentMessages;

  /**
   * The cached value of the '{@link #getNextState() <em>Next State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextState()
   * @generated
   * @ordered
   */
  protected State nextState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageTransitionImpl()
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
    return StateDefPackage.Literals.MESSAGE_TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
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
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateDefPackage.MESSAGE_TRANSITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getCurrentState()
  {
    return currentState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCurrentState(State newCurrentState, NotificationChain msgs)
  {
    State oldCurrentState = currentState;
    currentState = newCurrentState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateDefPackage.MESSAGE_TRANSITION__CURRENT_STATE, oldCurrentState, newCurrentState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurrentState(State newCurrentState)
  {
    if (newCurrentState != currentState)
    {
      NotificationChain msgs = null;
      if (currentState != null)
        msgs = ((InternalEObject)currentState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateDefPackage.MESSAGE_TRANSITION__CURRENT_STATE, null, msgs);
      if (newCurrentState != null)
        msgs = ((InternalEObject)newCurrentState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateDefPackage.MESSAGE_TRANSITION__CURRENT_STATE, null, msgs);
      msgs = basicSetCurrentState(newCurrentState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateDefPackage.MESSAGE_TRANSITION__CURRENT_STATE, newCurrentState, newCurrentState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAnyState()
  {
    return anyState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnyState(String newAnyState)
  {
    String oldAnyState = anyState;
    anyState = newAnyState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateDefPackage.MESSAGE_TRANSITION__ANY_STATE, oldAnyState, anyState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Message> getReceivedMessages()
  {
    if (receivedMessages == null)
    {
      receivedMessages = new EObjectContainmentEList<Message>(Message.class, this, StateDefPackage.MESSAGE_TRANSITION__RECEIVED_MESSAGES);
    }
    return receivedMessages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Message> getSentMessages()
  {
    if (sentMessages == null)
    {
      sentMessages = new EObjectContainmentEList<Message>(Message.class, this, StateDefPackage.MESSAGE_TRANSITION__SENT_MESSAGES);
    }
    return sentMessages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getNextState()
  {
    return nextState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNextState(State newNextState, NotificationChain msgs)
  {
    State oldNextState = nextState;
    nextState = newNextState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateDefPackage.MESSAGE_TRANSITION__NEXT_STATE, oldNextState, newNextState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNextState(State newNextState)
  {
    if (newNextState != nextState)
    {
      NotificationChain msgs = null;
      if (nextState != null)
        msgs = ((InternalEObject)nextState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateDefPackage.MESSAGE_TRANSITION__NEXT_STATE, null, msgs);
      if (newNextState != null)
        msgs = ((InternalEObject)newNextState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateDefPackage.MESSAGE_TRANSITION__NEXT_STATE, null, msgs);
      msgs = basicSetNextState(newNextState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateDefPackage.MESSAGE_TRANSITION__NEXT_STATE, newNextState, newNextState));
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
      case StateDefPackage.MESSAGE_TRANSITION__CURRENT_STATE:
        return basicSetCurrentState(null, msgs);
      case StateDefPackage.MESSAGE_TRANSITION__RECEIVED_MESSAGES:
        return ((InternalEList<?>)getReceivedMessages()).basicRemove(otherEnd, msgs);
      case StateDefPackage.MESSAGE_TRANSITION__SENT_MESSAGES:
        return ((InternalEList<?>)getSentMessages()).basicRemove(otherEnd, msgs);
      case StateDefPackage.MESSAGE_TRANSITION__NEXT_STATE:
        return basicSetNextState(null, msgs);
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
      case StateDefPackage.MESSAGE_TRANSITION__NAME:
        return getName();
      case StateDefPackage.MESSAGE_TRANSITION__CURRENT_STATE:
        return getCurrentState();
      case StateDefPackage.MESSAGE_TRANSITION__ANY_STATE:
        return getAnyState();
      case StateDefPackage.MESSAGE_TRANSITION__RECEIVED_MESSAGES:
        return getReceivedMessages();
      case StateDefPackage.MESSAGE_TRANSITION__SENT_MESSAGES:
        return getSentMessages();
      case StateDefPackage.MESSAGE_TRANSITION__NEXT_STATE:
        return getNextState();
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
      case StateDefPackage.MESSAGE_TRANSITION__NAME:
        setName((String)newValue);
        return;
      case StateDefPackage.MESSAGE_TRANSITION__CURRENT_STATE:
        setCurrentState((State)newValue);
        return;
      case StateDefPackage.MESSAGE_TRANSITION__ANY_STATE:
        setAnyState((String)newValue);
        return;
      case StateDefPackage.MESSAGE_TRANSITION__RECEIVED_MESSAGES:
        getReceivedMessages().clear();
        getReceivedMessages().addAll((Collection<? extends Message>)newValue);
        return;
      case StateDefPackage.MESSAGE_TRANSITION__SENT_MESSAGES:
        getSentMessages().clear();
        getSentMessages().addAll((Collection<? extends Message>)newValue);
        return;
      case StateDefPackage.MESSAGE_TRANSITION__NEXT_STATE:
        setNextState((State)newValue);
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
      case StateDefPackage.MESSAGE_TRANSITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateDefPackage.MESSAGE_TRANSITION__CURRENT_STATE:
        setCurrentState((State)null);
        return;
      case StateDefPackage.MESSAGE_TRANSITION__ANY_STATE:
        setAnyState(ANY_STATE_EDEFAULT);
        return;
      case StateDefPackage.MESSAGE_TRANSITION__RECEIVED_MESSAGES:
        getReceivedMessages().clear();
        return;
      case StateDefPackage.MESSAGE_TRANSITION__SENT_MESSAGES:
        getSentMessages().clear();
        return;
      case StateDefPackage.MESSAGE_TRANSITION__NEXT_STATE:
        setNextState((State)null);
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
      case StateDefPackage.MESSAGE_TRANSITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateDefPackage.MESSAGE_TRANSITION__CURRENT_STATE:
        return currentState != null;
      case StateDefPackage.MESSAGE_TRANSITION__ANY_STATE:
        return ANY_STATE_EDEFAULT == null ? anyState != null : !ANY_STATE_EDEFAULT.equals(anyState);
      case StateDefPackage.MESSAGE_TRANSITION__RECEIVED_MESSAGES:
        return receivedMessages != null && !receivedMessages.isEmpty();
      case StateDefPackage.MESSAGE_TRANSITION__SENT_MESSAGES:
        return sentMessages != null && !sentMessages.isEmpty();
      case StateDefPackage.MESSAGE_TRANSITION__NEXT_STATE:
        return nextState != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", anyState: ");
    result.append(anyState);
    result.append(')');
    return result.toString();
  }

} //MessageTransitionImpl