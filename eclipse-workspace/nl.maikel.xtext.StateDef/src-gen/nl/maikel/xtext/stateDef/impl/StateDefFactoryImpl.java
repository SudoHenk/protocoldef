/**
 * generated by Xtext 2.14.0
 */
package nl.sudohenk.xtext.stateDef.impl;

import nl.sudohenk.xtext.stateDef.*;

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
public class StateDefFactoryImpl extends EFactoryImpl implements StateDefFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StateDefFactory init()
  {
    try
    {
      StateDefFactory theStateDefFactory = (StateDefFactory)EPackage.Registry.INSTANCE.getEFactory(StateDefPackage.eNS_URI);
      if (theStateDefFactory != null)
      {
        return theStateDefFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new StateDefFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDefFactoryImpl()
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
      case StateDefPackage.STATE_MACHINE: return createStateMachine();
      case StateDefPackage.STATE: return createState();
      case StateDefPackage.MESSAGE_TRANSITION: return createMessageTransition();
      case StateDefPackage.MESSAGE: return createMessage();
      case StateDefPackage.MESSAGE_STRUCT: return createMessageStruct();
      case StateDefPackage.MESSAGE_STRUCT_ENTRY: return createMessageStructEntry();
      case StateDefPackage.MESSAGE_BYTE_RANGE: return createMessageByteRange();
      case StateDefPackage.MESSAGE_BYTE_ARRAY: return createMessageByteArray();
      case StateDefPackage.MESSAGE_STRUCTURE_STRUCT: return createMessageStructureStruct();
      case StateDefPackage.MESSAGE_STRUCTURE_DATATYPE: return createMessageStructureDatatype();
      case StateDefPackage.MESSAGE_ENUM: return createMessageEnum();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachine createStateMachine()
  {
    StateMachineImpl stateMachine = new StateMachineImpl();
    return stateMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageTransition createMessageTransition()
  {
    MessageTransitionImpl messageTransition = new MessageTransitionImpl();
    return messageTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageStruct createMessageStruct()
  {
    MessageStructImpl messageStruct = new MessageStructImpl();
    return messageStruct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageStructEntry createMessageStructEntry()
  {
    MessageStructEntryImpl messageStructEntry = new MessageStructEntryImpl();
    return messageStructEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageByteRange createMessageByteRange()
  {
    MessageByteRangeImpl messageByteRange = new MessageByteRangeImpl();
    return messageByteRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageByteArray createMessageByteArray()
  {
    MessageByteArrayImpl messageByteArray = new MessageByteArrayImpl();
    return messageByteArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageStructureStruct createMessageStructureStruct()
  {
    MessageStructureStructImpl messageStructureStruct = new MessageStructureStructImpl();
    return messageStructureStruct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageStructureDatatype createMessageStructureDatatype()
  {
    MessageStructureDatatypeImpl messageStructureDatatype = new MessageStructureDatatypeImpl();
    return messageStructureDatatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageEnum createMessageEnum()
  {
    MessageEnumImpl messageEnum = new MessageEnumImpl();
    return messageEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDefPackage getStateDefPackage()
  {
    return (StateDefPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static StateDefPackage getPackage()
  {
    return StateDefPackage.eINSTANCE;
  }

} //StateDefFactoryImpl
