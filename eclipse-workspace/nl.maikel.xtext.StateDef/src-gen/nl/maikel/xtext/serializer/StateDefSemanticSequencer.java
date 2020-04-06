/*
 * generated by Xtext 2.14.0
 */
package nl.sudohenk.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import nl.sudohenk.xtext.services.StateDefGrammarAccess;
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
import nl.sudohenk.xtext.stateDef.StateDefPackage;
import nl.sudohenk.xtext.stateDef.StateMachine;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class StateDefSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StateDefGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == StateDefPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case StateDefPackage.MESSAGE:
				sequence_Message(context, (Message) semanticObject); 
				return; 
			case StateDefPackage.MESSAGE_BYTE_ARRAY:
				sequence_MessageByteArray(context, (MessageByteArray) semanticObject); 
				return; 
			case StateDefPackage.MESSAGE_BYTE_RANGE:
				sequence_MessageByteRange(context, (MessageByteRange) semanticObject); 
				return; 
			case StateDefPackage.MESSAGE_ENUM:
				sequence_MessageEnum(context, (MessageEnum) semanticObject); 
				return; 
			case StateDefPackage.MESSAGE_STRUCT:
				sequence_MessageStruct(context, (MessageStruct) semanticObject); 
				return; 
			case StateDefPackage.MESSAGE_STRUCT_ENTRY:
				sequence_MessageStructEntry(context, (MessageStructEntry) semanticObject); 
				return; 
			case StateDefPackage.MESSAGE_STRUCTURE_DATATYPE:
				sequence_MessageStructureDatatype(context, (MessageStructureDatatype) semanticObject); 
				return; 
			case StateDefPackage.MESSAGE_STRUCTURE_STRUCT:
				sequence_MessageStructureStruct(context, (MessageStructureStruct) semanticObject); 
				return; 
			case StateDefPackage.MESSAGE_TRANSITION:
				sequence_MessageTransition(context, (MessageTransition) semanticObject); 
				return; 
			case StateDefPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case StateDefPackage.STATE_MACHINE:
				sequence_StateMachine(context, (StateMachine) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     MessageByteArray returns MessageByteArray
	 *
	 * Constraint:
	 *     size=INT
	 */
	protected void sequence_MessageByteArray(ISerializationContext context, MessageByteArray semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateDefPackage.Literals.MESSAGE_BYTE_ARRAY__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateDefPackage.Literals.MESSAGE_BYTE_ARRAY__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMessageByteArrayAccess().getSizeINTTerminalRuleCall_1_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MessageByteRange returns MessageByteRange
	 *
	 * Constraint:
	 *     (start=INT end=INT)
	 */
	protected void sequence_MessageByteRange(ISerializationContext context, MessageByteRange semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateDefPackage.Literals.MESSAGE_BYTE_RANGE__START) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateDefPackage.Literals.MESSAGE_BYTE_RANGE__START));
			if (transientValues.isValueTransient(semanticObject, StateDefPackage.Literals.MESSAGE_BYTE_RANGE__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateDefPackage.Literals.MESSAGE_BYTE_RANGE__END));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMessageByteRangeAccess().getStartINTTerminalRuleCall_1_0(), semanticObject.getStart());
		feeder.accept(grammarAccess.getMessageByteRangeAccess().getEndINTTerminalRuleCall_3_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MessageEnum returns MessageEnum
	 *
	 * Constraint:
	 *     (name=ID (names+=ENUMNAME values+=INT)*)
	 */
	protected void sequence_MessageEnum(ISerializationContext context, MessageEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageStructEntry returns MessageStructEntry
	 *
	 * Constraint:
	 *     (
	 *         (dataType=DATATYPE | refType=ID) 
	 *         name=ENUMNAME 
	 *         (byteRange=MessageByteRange | byteSize=MessageByteArray)? 
	 *         dataAssignment+=MessageStructureDatatype*
	 *     )
	 */
	protected void sequence_MessageStructEntry(ISerializationContext context, MessageStructEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageStruct returns MessageStruct
	 *
	 * Constraint:
	 *     (name=ID structEntries+=MessageStructEntry*)
	 */
	protected void sequence_MessageStruct(ISerializationContext context, MessageStruct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageStructureDatatype returns MessageStructureDatatype
	 *
	 * Constraint:
	 *     (hexVal=HEX | enumVal=ENUMNAME | structVal=MessageStructureStruct | arrayVal+=MessageStructureDatatype+)
	 */
	protected void sequence_MessageStructureDatatype(ISerializationContext context, MessageStructureDatatype semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageStructureStruct returns MessageStructureStruct
	 *
	 * Constraint:
	 *     values+=MessageStructureDatatype+
	 */
	protected void sequence_MessageStructureStruct(ISerializationContext context, MessageStructureStruct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageTransition returns MessageTransition
	 *
	 * Constraint:
	 *     (name=ID ((currentState=State | anyState='any') receivedMessages+=Message* sentMessages+=Message* nextState=State?)?)
	 */
	protected void sequence_MessageTransition(ISerializationContext context, MessageTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Message returns Message
	 *
	 * Constraint:
	 *     (name=ID structEntries+=MessageStructEntry*)
	 */
	protected void sequence_Message(ISerializationContext context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateMachine returns StateMachine
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             (states+=State | transitions+=MessageTransition | endState=State)? 
	 *             (globalStructs+=MessageStruct? ((globalEnums+=MessageEnum | messages+=Message)? globalStructs+=MessageStruct?)* initState=State)?
	 *         )+
	 *     )
	 */
	protected void sequence_StateMachine(ISerializationContext context, StateMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateDefPackage.Literals.STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateDefPackage.Literals.STATE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
