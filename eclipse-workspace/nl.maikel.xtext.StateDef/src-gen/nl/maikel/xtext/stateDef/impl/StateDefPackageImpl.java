/**
 * generated by Xtext 2.14.0
 */
package nl.sudohenk.xtext.stateDef.impl;

import nl.sudohenk.xtext.stateDef.Message;
import nl.sudohenk.xtext.stateDef.MessageByteArray;
import nl.sudohenk.xtext.stateDef.MessageByteRange;
import nl.sudohenk.xtext.stateDef.MessageEnum;
import nl.sudohenk.xtext.stateDef.MessageStruct;
import nl.sudohenk.xtext.stateDef.MessageStructEntry;
import nl.sudohenk.xtext.stateDef.MessageStructureDatatype;
import nl.sudohenk.xtext.stateDef.MessageStructureStruct;
import nl.sudohenk.xtext.stateDef.MessageTransition;
import nl.sudohenk.xtext.stateDef.State;
import nl.sudohenk.xtext.stateDef.StateDefFactory;
import nl.sudohenk.xtext.stateDef.StateDefPackage;
import nl.sudohenk.xtext.stateDef.StateMachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateDefPackageImpl extends EPackageImpl implements StateDefPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateMachineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageTransitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageStructEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageStructEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageByteRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageByteArrayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageStructureStructEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageStructureDatatypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageEnumEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see nl.sudohenk.xtext.stateDef.StateDefPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private StateDefPackageImpl()
  {
    super(eNS_URI, StateDefFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link StateDefPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static StateDefPackage init()
  {
    if (isInited) return (StateDefPackage)EPackage.Registry.INSTANCE.getEPackage(StateDefPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredStateDefPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    StateDefPackageImpl theStateDefPackage = registeredStateDefPackage instanceof StateDefPackageImpl ? (StateDefPackageImpl)registeredStateDefPackage : new StateDefPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theStateDefPackage.createPackageContents();

    // Initialize created meta-data
    theStateDefPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theStateDefPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(StateDefPackage.eNS_URI, theStateDefPackage);
    return theStateDefPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateMachine()
  {
    return stateMachineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateMachine_Name()
  {
    return (EAttribute)stateMachineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateMachine_GlobalStructs()
  {
    return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateMachine_GlobalEnums()
  {
    return (EReference)stateMachineEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateMachine_Messages()
  {
    return (EReference)stateMachineEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateMachine_InitState()
  {
    return (EReference)stateMachineEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateMachine_States()
  {
    return (EReference)stateMachineEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateMachine_Transitions()
  {
    return (EReference)stateMachineEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateMachine_EndState()
  {
    return (EReference)stateMachineEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getState()
  {
    return stateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_Name()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageTransition()
  {
    return messageTransitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageTransition_Name()
  {
    return (EAttribute)messageTransitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageTransition_CurrentState()
  {
    return (EReference)messageTransitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageTransition_AnyState()
  {
    return (EAttribute)messageTransitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageTransition_ReceivedMessages()
  {
    return (EReference)messageTransitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageTransition_SentMessages()
  {
    return (EReference)messageTransitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageTransition_NextState()
  {
    return (EReference)messageTransitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessage()
  {
    return messageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessage_Name()
  {
    return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessage_StructEntries()
  {
    return (EReference)messageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageStruct()
  {
    return messageStructEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageStruct_Name()
  {
    return (EAttribute)messageStructEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageStruct_StructEntries()
  {
    return (EReference)messageStructEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageStructEntry()
  {
    return messageStructEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageStructEntry_DataType()
  {
    return (EAttribute)messageStructEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageStructEntry_RefType()
  {
    return (EAttribute)messageStructEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageStructEntry_Name()
  {
    return (EAttribute)messageStructEntryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageStructEntry_ByteRange()
  {
    return (EReference)messageStructEntryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageStructEntry_ByteSize()
  {
    return (EReference)messageStructEntryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageStructEntry_DataAssignment()
  {
    return (EReference)messageStructEntryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageByteRange()
  {
    return messageByteRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageByteRange_Start()
  {
    return (EAttribute)messageByteRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageByteRange_End()
  {
    return (EAttribute)messageByteRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageByteArray()
  {
    return messageByteArrayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageByteArray_Size()
  {
    return (EAttribute)messageByteArrayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageStructureStruct()
  {
    return messageStructureStructEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageStructureStruct_Values()
  {
    return (EReference)messageStructureStructEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageStructureDatatype()
  {
    return messageStructureDatatypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageStructureDatatype_HexVal()
  {
    return (EAttribute)messageStructureDatatypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageStructureDatatype_EnumVal()
  {
    return (EAttribute)messageStructureDatatypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageStructureDatatype_StructVal()
  {
    return (EReference)messageStructureDatatypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageStructureDatatype_ArrayVal()
  {
    return (EReference)messageStructureDatatypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageEnum()
  {
    return messageEnumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageEnum_Name()
  {
    return (EAttribute)messageEnumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageEnum_Names()
  {
    return (EAttribute)messageEnumEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageEnum_Values()
  {
    return (EAttribute)messageEnumEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDefFactory getStateDefFactory()
  {
    return (StateDefFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    stateMachineEClass = createEClass(STATE_MACHINE);
    createEAttribute(stateMachineEClass, STATE_MACHINE__NAME);
    createEReference(stateMachineEClass, STATE_MACHINE__GLOBAL_STRUCTS);
    createEReference(stateMachineEClass, STATE_MACHINE__GLOBAL_ENUMS);
    createEReference(stateMachineEClass, STATE_MACHINE__MESSAGES);
    createEReference(stateMachineEClass, STATE_MACHINE__INIT_STATE);
    createEReference(stateMachineEClass, STATE_MACHINE__STATES);
    createEReference(stateMachineEClass, STATE_MACHINE__TRANSITIONS);
    createEReference(stateMachineEClass, STATE_MACHINE__END_STATE);

    stateEClass = createEClass(STATE);
    createEAttribute(stateEClass, STATE__NAME);

    messageTransitionEClass = createEClass(MESSAGE_TRANSITION);
    createEAttribute(messageTransitionEClass, MESSAGE_TRANSITION__NAME);
    createEReference(messageTransitionEClass, MESSAGE_TRANSITION__CURRENT_STATE);
    createEAttribute(messageTransitionEClass, MESSAGE_TRANSITION__ANY_STATE);
    createEReference(messageTransitionEClass, MESSAGE_TRANSITION__RECEIVED_MESSAGES);
    createEReference(messageTransitionEClass, MESSAGE_TRANSITION__SENT_MESSAGES);
    createEReference(messageTransitionEClass, MESSAGE_TRANSITION__NEXT_STATE);

    messageEClass = createEClass(MESSAGE);
    createEAttribute(messageEClass, MESSAGE__NAME);
    createEReference(messageEClass, MESSAGE__STRUCT_ENTRIES);

    messageStructEClass = createEClass(MESSAGE_STRUCT);
    createEAttribute(messageStructEClass, MESSAGE_STRUCT__NAME);
    createEReference(messageStructEClass, MESSAGE_STRUCT__STRUCT_ENTRIES);

    messageStructEntryEClass = createEClass(MESSAGE_STRUCT_ENTRY);
    createEAttribute(messageStructEntryEClass, MESSAGE_STRUCT_ENTRY__DATA_TYPE);
    createEAttribute(messageStructEntryEClass, MESSAGE_STRUCT_ENTRY__REF_TYPE);
    createEAttribute(messageStructEntryEClass, MESSAGE_STRUCT_ENTRY__NAME);
    createEReference(messageStructEntryEClass, MESSAGE_STRUCT_ENTRY__BYTE_RANGE);
    createEReference(messageStructEntryEClass, MESSAGE_STRUCT_ENTRY__BYTE_SIZE);
    createEReference(messageStructEntryEClass, MESSAGE_STRUCT_ENTRY__DATA_ASSIGNMENT);

    messageByteRangeEClass = createEClass(MESSAGE_BYTE_RANGE);
    createEAttribute(messageByteRangeEClass, MESSAGE_BYTE_RANGE__START);
    createEAttribute(messageByteRangeEClass, MESSAGE_BYTE_RANGE__END);

    messageByteArrayEClass = createEClass(MESSAGE_BYTE_ARRAY);
    createEAttribute(messageByteArrayEClass, MESSAGE_BYTE_ARRAY__SIZE);

    messageStructureStructEClass = createEClass(MESSAGE_STRUCTURE_STRUCT);
    createEReference(messageStructureStructEClass, MESSAGE_STRUCTURE_STRUCT__VALUES);

    messageStructureDatatypeEClass = createEClass(MESSAGE_STRUCTURE_DATATYPE);
    createEAttribute(messageStructureDatatypeEClass, MESSAGE_STRUCTURE_DATATYPE__HEX_VAL);
    createEAttribute(messageStructureDatatypeEClass, MESSAGE_STRUCTURE_DATATYPE__ENUM_VAL);
    createEReference(messageStructureDatatypeEClass, MESSAGE_STRUCTURE_DATATYPE__STRUCT_VAL);
    createEReference(messageStructureDatatypeEClass, MESSAGE_STRUCTURE_DATATYPE__ARRAY_VAL);

    messageEnumEClass = createEClass(MESSAGE_ENUM);
    createEAttribute(messageEnumEClass, MESSAGE_ENUM__NAME);
    createEAttribute(messageEnumEClass, MESSAGE_ENUM__NAMES);
    createEAttribute(messageEnumEClass, MESSAGE_ENUM__VALUES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateMachine_Name(), ecorePackage.getEString(), "name", null, 0, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateMachine_GlobalStructs(), this.getMessageStruct(), null, "globalStructs", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateMachine_GlobalEnums(), this.getMessageEnum(), null, "globalEnums", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateMachine_Messages(), this.getMessage(), null, "messages", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateMachine_InitState(), this.getState(), null, "initState", null, 0, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateMachine_States(), this.getState(), null, "states", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateMachine_Transitions(), this.getMessageTransition(), null, "transitions", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateMachine_EndState(), this.getState(), null, "endState", null, 0, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageTransitionEClass, MessageTransition.class, "MessageTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessageTransition_Name(), ecorePackage.getEString(), "name", null, 0, 1, MessageTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageTransition_CurrentState(), this.getState(), null, "currentState", null, 0, 1, MessageTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMessageTransition_AnyState(), ecorePackage.getEString(), "anyState", null, 0, 1, MessageTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageTransition_ReceivedMessages(), this.getMessage(), null, "receivedMessages", null, 0, -1, MessageTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageTransition_SentMessages(), this.getMessage(), null, "sentMessages", null, 0, -1, MessageTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageTransition_NextState(), this.getState(), null, "nextState", null, 0, 1, MessageTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessage_StructEntries(), this.getMessageStructEntry(), null, "structEntries", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageStructEClass, MessageStruct.class, "MessageStruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessageStruct_Name(), ecorePackage.getEString(), "name", null, 0, 1, MessageStruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageStruct_StructEntries(), this.getMessageStructEntry(), null, "structEntries", null, 0, -1, MessageStruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageStructEntryEClass, MessageStructEntry.class, "MessageStructEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessageStructEntry_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, MessageStructEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMessageStructEntry_RefType(), ecorePackage.getEString(), "refType", null, 0, 1, MessageStructEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMessageStructEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, MessageStructEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageStructEntry_ByteRange(), this.getMessageByteRange(), null, "byteRange", null, 0, 1, MessageStructEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageStructEntry_ByteSize(), this.getMessageByteArray(), null, "byteSize", null, 0, 1, MessageStructEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageStructEntry_DataAssignment(), this.getMessageStructureDatatype(), null, "dataAssignment", null, 0, -1, MessageStructEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageByteRangeEClass, MessageByteRange.class, "MessageByteRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessageByteRange_Start(), ecorePackage.getEInt(), "start", null, 0, 1, MessageByteRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMessageByteRange_End(), ecorePackage.getEInt(), "end", null, 0, 1, MessageByteRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageByteArrayEClass, MessageByteArray.class, "MessageByteArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessageByteArray_Size(), ecorePackage.getEInt(), "size", null, 0, 1, MessageByteArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageStructureStructEClass, MessageStructureStruct.class, "MessageStructureStruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMessageStructureStruct_Values(), this.getMessageStructureDatatype(), null, "values", null, 0, -1, MessageStructureStruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageStructureDatatypeEClass, MessageStructureDatatype.class, "MessageStructureDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessageStructureDatatype_HexVal(), ecorePackage.getEString(), "hexVal", null, 0, 1, MessageStructureDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMessageStructureDatatype_EnumVal(), ecorePackage.getEString(), "enumVal", null, 0, 1, MessageStructureDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageStructureDatatype_StructVal(), this.getMessageStructureStruct(), null, "structVal", null, 0, 1, MessageStructureDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageStructureDatatype_ArrayVal(), this.getMessageStructureDatatype(), null, "arrayVal", null, 0, -1, MessageStructureDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageEnumEClass, MessageEnum.class, "MessageEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessageEnum_Name(), ecorePackage.getEString(), "name", null, 0, 1, MessageEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMessageEnum_Names(), ecorePackage.getEString(), "names", null, 0, -1, MessageEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMessageEnum_Values(), ecorePackage.getEInt(), "values", null, 0, -1, MessageEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //StateDefPackageImpl
