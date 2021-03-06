/*
 * generated by Xtext 2.14.0
 */
package nl.sudohenk.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import nl.sudohenk.xtext.services.StateDefGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class StateDefSyntacticSequencer extends AbstractSyntacticSequencer {

	protected StateDefGrammarAccess grammarAccess;
	protected AbstractElementAlias match_MessageEnum_CommaKeyword_2_1_4_q;
	protected AbstractElementAlias match_MessageEnum_EnumKeyword_0_q;
	protected AbstractElementAlias match_MessageStructEntry_CommaKeyword_3_1_1_q;
	protected AbstractElementAlias match_MessageStruct___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_MessageStructureDatatype_CommaKeyword_3_1_1_q;
	protected AbstractElementAlias match_MessageStructureStruct_CommaKeyword_1_1_q;
	protected AbstractElementAlias match_MessageTransition___ReceivedKeyword_2_3_0_MessagesKeyword_2_3_1_LeftCurlyBracketKeyword_2_3_2_0_RightCurlyBracketKeyword_2_3_2_2__q;
	protected AbstractElementAlias match_MessageTransition___SentKeyword_2_4_0_MessagesKeyword_2_4_1_LeftCurlyBracketKeyword_2_4_2_0_RightCurlyBracketKeyword_2_4_2_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (StateDefGrammarAccess) access;
		match_MessageEnum_CommaKeyword_2_1_4_q = new TokenAlias(false, true, grammarAccess.getMessageEnumAccess().getCommaKeyword_2_1_4());
		match_MessageEnum_EnumKeyword_0_q = new TokenAlias(false, true, grammarAccess.getMessageEnumAccess().getEnumKeyword_0());
		match_MessageStructEntry_CommaKeyword_3_1_1_q = new TokenAlias(false, true, grammarAccess.getMessageStructEntryAccess().getCommaKeyword_3_1_1());
		match_MessageStruct___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMessageStructAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getMessageStructAccess().getRightCurlyBracketKeyword_2_2()));
		match_MessageStructureDatatype_CommaKeyword_3_1_1_q = new TokenAlias(false, true, grammarAccess.getMessageStructureDatatypeAccess().getCommaKeyword_3_1_1());
		match_MessageStructureStruct_CommaKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getMessageStructureStructAccess().getCommaKeyword_1_1());
		match_MessageTransition___ReceivedKeyword_2_3_0_MessagesKeyword_2_3_1_LeftCurlyBracketKeyword_2_3_2_0_RightCurlyBracketKeyword_2_3_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMessageTransitionAccess().getReceivedKeyword_2_3_0()), new TokenAlias(false, false, grammarAccess.getMessageTransitionAccess().getMessagesKeyword_2_3_1()), new TokenAlias(false, false, grammarAccess.getMessageTransitionAccess().getLeftCurlyBracketKeyword_2_3_2_0()), new TokenAlias(false, false, grammarAccess.getMessageTransitionAccess().getRightCurlyBracketKeyword_2_3_2_2()));
		match_MessageTransition___SentKeyword_2_4_0_MessagesKeyword_2_4_1_LeftCurlyBracketKeyword_2_4_2_0_RightCurlyBracketKeyword_2_4_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMessageTransitionAccess().getSentKeyword_2_4_0()), new TokenAlias(false, false, grammarAccess.getMessageTransitionAccess().getMessagesKeyword_2_4_1()), new TokenAlias(false, false, grammarAccess.getMessageTransitionAccess().getLeftCurlyBracketKeyword_2_4_2_0()), new TokenAlias(false, false, grammarAccess.getMessageTransitionAccess().getRightCurlyBracketKeyword_2_4_2_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_MessageEnum_CommaKeyword_2_1_4_q.equals(syntax))
				emit_MessageEnum_CommaKeyword_2_1_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MessageEnum_EnumKeyword_0_q.equals(syntax))
				emit_MessageEnum_EnumKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MessageStructEntry_CommaKeyword_3_1_1_q.equals(syntax))
				emit_MessageStructEntry_CommaKeyword_3_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MessageStruct___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_MessageStruct___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MessageStructureDatatype_CommaKeyword_3_1_1_q.equals(syntax))
				emit_MessageStructureDatatype_CommaKeyword_3_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MessageStructureStruct_CommaKeyword_1_1_q.equals(syntax))
				emit_MessageStructureStruct_CommaKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MessageTransition___ReceivedKeyword_2_3_0_MessagesKeyword_2_3_1_LeftCurlyBracketKeyword_2_3_2_0_RightCurlyBracketKeyword_2_3_2_2__q.equals(syntax))
				emit_MessageTransition___ReceivedKeyword_2_3_0_MessagesKeyword_2_3_1_LeftCurlyBracketKeyword_2_3_2_0_RightCurlyBracketKeyword_2_3_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MessageTransition___SentKeyword_2_4_0_MessagesKeyword_2_4_1_LeftCurlyBracketKeyword_2_4_2_0_RightCurlyBracketKeyword_2_4_2_2__q.equals(syntax))
				emit_MessageTransition___SentKeyword_2_4_0_MessagesKeyword_2_4_1_LeftCurlyBracketKeyword_2_4_2_0_RightCurlyBracketKeyword_2_4_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     values+=INT ')' (ambiguity) '}' (rule end)
	 *     values+=INT ')' (ambiguity) names+=ENUMNAME
	 */
	protected void emit_MessageEnum_CommaKeyword_2_1_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'enum'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_MessageEnum_EnumKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     dataAssignment+=MessageStructureDatatype (ambiguity) ';' (rule end)
	 *     dataAssignment+=MessageStructureDatatype (ambiguity) dataAssignment+=MessageStructureDatatype
	 */
	protected void emit_MessageStructEntry_CommaKeyword_3_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_MessageStruct___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     arrayVal+=MessageStructureDatatype (ambiguity) ']' (rule end)
	 *     arrayVal+=MessageStructureDatatype (ambiguity) arrayVal+=MessageStructureDatatype
	 */
	protected void emit_MessageStructureDatatype_CommaKeyword_3_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     values+=MessageStructureDatatype (ambiguity) '}' (rule end)
	 *     values+=MessageStructureDatatype (ambiguity) values+=MessageStructureDatatype
	 */
	protected void emit_MessageStructureStruct_CommaKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('received' 'messages' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     anyState='any' (ambiguity) 'sent' 'messages' '{' sentMessages+=Message
	 *     anyState='any' (ambiguity) ('sent' 'messages' '{' '}')? 'go' nextState=State
	 *     anyState='any' (ambiguity) ('sent' 'messages' '{' '}')? '}' (rule end)
	 *     currentState=State (ambiguity) 'sent' 'messages' '{' sentMessages+=Message
	 *     currentState=State (ambiguity) ('sent' 'messages' '{' '}')? 'go' nextState=State
	 *     currentState=State (ambiguity) ('sent' 'messages' '{' '}')? '}' (rule end)
	 */
	protected void emit_MessageTransition___ReceivedKeyword_2_3_0_MessagesKeyword_2_3_1_LeftCurlyBracketKeyword_2_3_2_0_RightCurlyBracketKeyword_2_3_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('sent' 'messages' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     anyState='any' ('received' 'messages' '{' '}')? (ambiguity) 'go' nextState=State
	 *     anyState='any' ('received' 'messages' '{' '}')? (ambiguity) '}' (rule end)
	 *     currentState=State ('received' 'messages' '{' '}')? (ambiguity) 'go' nextState=State
	 *     currentState=State ('received' 'messages' '{' '}')? (ambiguity) '}' (rule end)
	 *     receivedMessages+=Message '}' (ambiguity) 'go' nextState=State
	 *     receivedMessages+=Message '}' (ambiguity) '}' (rule end)
	 */
	protected void emit_MessageTransition___SentKeyword_2_4_0_MessagesKeyword_2_4_1_LeftCurlyBracketKeyword_2_4_2_0_RightCurlyBracketKeyword_2_4_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
