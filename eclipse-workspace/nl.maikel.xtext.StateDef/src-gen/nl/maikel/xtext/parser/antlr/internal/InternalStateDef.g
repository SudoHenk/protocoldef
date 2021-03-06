/*
 * generated by Xtext 2.14.0
 */
grammar InternalStateDef;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package nl.sudohenk.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package nl.sudohenk.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.sudohenk.xtext.services.StateDefGrammarAccess;

}

@parser::members {

 	private StateDefGrammarAccess grammarAccess;

    public InternalStateDefParser(TokenStream input, StateDefGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "StateMachine";
   	}

   	@Override
   	protected StateDefGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleStateMachine
entryRuleStateMachine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateMachineRule()); }
	iv_ruleStateMachine=ruleStateMachine
	{ $current=$iv_ruleStateMachine.current; }
	EOF;

// Rule StateMachine
ruleStateMachine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='machine'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getMachineKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateMachineRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getStateMachineAccess().getUnorderedGroup_2());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 0);
					}
								({true}?=>(otherlv_3='{'
								{
									newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2_0_0());
								}
								(
									(
										{ 
										  getUnorderedGroupHelper().enter(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1());
										}
										(
											(
									(
										{getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 0)}?=>(
											{
												getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 0);
											}
														({true}?=>((
															{
																newCompositeNode(grammarAccess.getStateMachineAccess().getGlobalStructsMessageStructParserRuleCall_2_0_1_0_0());
															}
															lv_globalStructs_5_0=ruleMessageStruct
															{
																if ($current==null) {
																	$current = createModelElementForParent(grammarAccess.getStateMachineRule());
																}
																add(
																	$current,
																	"globalStructs",
																	lv_globalStructs_5_0,
																	"nl.sudohenk.xtext.StateDef.MessageStruct");
																afterParserOrEnumRuleCall();
															}
														)
														))+
											{ 
												getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1());
											}
										)
									)|
									(
										{getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 1)}?=>(
											{
												getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 1);
											}
														({true}?=>((
															{
																newCompositeNode(grammarAccess.getStateMachineAccess().getGlobalEnumsMessageEnumParserRuleCall_2_0_1_1_0());
															}
															lv_globalEnums_6_0=ruleMessageEnum
															{
																if ($current==null) {
																	$current = createModelElementForParent(grammarAccess.getStateMachineRule());
																}
																add(
																	$current,
																	"globalEnums",
																	lv_globalEnums_6_0,
																	"nl.sudohenk.xtext.StateDef.MessageEnum");
																afterParserOrEnumRuleCall();
															}
														)
														))+
											{ 
												getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1());
											}
										)
									)|
									(
										{getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 2)}?=>(
											{
												getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 2);
											}
														({true}?=>((
															{
																newCompositeNode(grammarAccess.getStateMachineAccess().getMessagesMessageParserRuleCall_2_0_1_2_0());
															}
															lv_messages_7_0=ruleMessage
															{
																if ($current==null) {
																	$current = createModelElementForParent(grammarAccess.getStateMachineRule());
																}
																add(
																	$current,
																	"messages",
																	lv_messages_7_0,
																	"nl.sudohenk.xtext.StateDef.Message");
																afterParserOrEnumRuleCall();
															}
														)
														))+
											{ 
												getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1());
											}
										)
									)
											)*
										)
									)
										{ 
										  getUnorderedGroupHelper().leave(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1());
										}
								)
								otherlv_8='initial'
								{
									newLeafNode(otherlv_8, grammarAccess.getStateMachineAccess().getInitialKeyword_2_0_2());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getStateMachineAccess().getInitStateStateParserRuleCall_2_0_3_0());
										}
										lv_initState_9_0=ruleState
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getStateMachineRule());
											}
											set(
												$current,
												"initState",
												lv_initState_9_0,
												"nl.sudohenk.xtext.StateDef.State");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_2());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 1);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_2_1_0());
									}
									lv_states_10_0=ruleState
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getStateMachineRule());
										}
										add(
											$current,
											"states",
											lv_states_10_0,
											"nl.sudohenk.xtext.StateDef.State");
										afterParserOrEnumRuleCall();
									}
								)
								))+
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_2());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 2);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsMessageTransitionParserRuleCall_2_2_0());
									}
									lv_transitions_11_0=ruleMessageTransition
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getStateMachineRule());
										}
										add(
											$current,
											"transitions",
											lv_transitions_11_0,
											"nl.sudohenk.xtext.StateDef.MessageTransition");
										afterParserOrEnumRuleCall();
									}
								)
								))+
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_2());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 3)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 3);
					}
								({true}?=>(otherlv_12='end'
								{
									newLeafNode(otherlv_12, grammarAccess.getStateMachineAccess().getEndKeyword_2_3_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getStateMachineAccess().getEndStateStateParserRuleCall_2_3_1_0());
										}
										lv_endState_13_0=ruleState
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getStateMachineRule());
											}
											set(
												$current,
												"endState",
												lv_endState_13_0,
												"nl.sudohenk.xtext.StateDef.State");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_14='}'
								{
									newLeafNode(otherlv_14, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_2_3_2());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_2());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getStateMachineAccess().getUnorderedGroup_2())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getStateMachineAccess().getUnorderedGroup_2());
				}
		)?
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='state'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleMessageTransition
entryRuleMessageTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMessageTransitionRule()); }
	iv_ruleMessageTransition=ruleMessageTransition
	{ $current=$iv_ruleMessageTransition.current; }
	EOF;

// Rule MessageTransition
ruleMessageTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='transition'
		{
			newLeafNode(otherlv_0, grammarAccess.getMessageTransitionAccess().getTransitionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMessageTransitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageTransitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='{'
			{
				newLeafNode(otherlv_2, grammarAccess.getMessageTransitionAccess().getLeftCurlyBracketKeyword_2_0());
			}
			otherlv_3='from'
			{
				newLeafNode(otherlv_3, grammarAccess.getMessageTransitionAccess().getFromKeyword_2_1());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getMessageTransitionAccess().getCurrentStateStateParserRuleCall_2_2_0_0());
						}
						lv_currentState_4_0=ruleState
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMessageTransitionRule());
							}
							set(
								$current,
								"currentState",
								lv_currentState_4_0,
								"nl.sudohenk.xtext.StateDef.State");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						lv_anyState_5_0='any'
						{
							newLeafNode(lv_anyState_5_0, grammarAccess.getMessageTransitionAccess().getAnyStateAnyKeyword_2_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMessageTransitionRule());
							}
							setWithLastConsumed($current, "anyState", lv_anyState_5_0, "any");
						}
					)
				)
			)
			(
				otherlv_6='received'
				{
					newLeafNode(otherlv_6, grammarAccess.getMessageTransitionAccess().getReceivedKeyword_2_3_0());
				}
				otherlv_7='messages'
				{
					newLeafNode(otherlv_7, grammarAccess.getMessageTransitionAccess().getMessagesKeyword_2_3_1());
				}
				(
					otherlv_8='{'
					{
						newLeafNode(otherlv_8, grammarAccess.getMessageTransitionAccess().getLeftCurlyBracketKeyword_2_3_2_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getMessageTransitionAccess().getReceivedMessagesMessageParserRuleCall_2_3_2_1_0());
							}
							lv_receivedMessages_9_0=ruleMessage
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getMessageTransitionRule());
								}
								add(
									$current,
									"receivedMessages",
									lv_receivedMessages_9_0,
									"nl.sudohenk.xtext.StateDef.Message");
								afterParserOrEnumRuleCall();
							}
						)
					)*
					otherlv_10='}'
					{
						newLeafNode(otherlv_10, grammarAccess.getMessageTransitionAccess().getRightCurlyBracketKeyword_2_3_2_2());
					}
				)
			)?
			(
				otherlv_11='sent'
				{
					newLeafNode(otherlv_11, grammarAccess.getMessageTransitionAccess().getSentKeyword_2_4_0());
				}
				otherlv_12='messages'
				{
					newLeafNode(otherlv_12, grammarAccess.getMessageTransitionAccess().getMessagesKeyword_2_4_1());
				}
				(
					otherlv_13='{'
					{
						newLeafNode(otherlv_13, grammarAccess.getMessageTransitionAccess().getLeftCurlyBracketKeyword_2_4_2_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getMessageTransitionAccess().getSentMessagesMessageParserRuleCall_2_4_2_1_0());
							}
							lv_sentMessages_14_0=ruleMessage
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getMessageTransitionRule());
								}
								add(
									$current,
									"sentMessages",
									lv_sentMessages_14_0,
									"nl.sudohenk.xtext.StateDef.Message");
								afterParserOrEnumRuleCall();
							}
						)
					)*
					otherlv_15='}'
					{
						newLeafNode(otherlv_15, grammarAccess.getMessageTransitionAccess().getRightCurlyBracketKeyword_2_4_2_2());
					}
				)
			)?
			(
				otherlv_16='go'
				{
					newLeafNode(otherlv_16, grammarAccess.getMessageTransitionAccess().getGoKeyword_2_5_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMessageTransitionAccess().getNextStateStateParserRuleCall_2_5_1_0());
						}
						lv_nextState_17_0=ruleState
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMessageTransitionRule());
							}
							set(
								$current,
								"nextState",
								lv_nextState_17_0,
								"nl.sudohenk.xtext.StateDef.State");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
			otherlv_18='}'
			{
				newLeafNode(otherlv_18, grammarAccess.getMessageTransitionAccess().getRightCurlyBracketKeyword_2_6());
			}
		)?
	)
;

// Entry rule entryRuleMessage
entryRuleMessage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMessageRule()); }
	iv_ruleMessage=ruleMessage
	{ $current=$iv_ruleMessage.current; }
	EOF;

// Rule Message
ruleMessage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='message'
		{
			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='struct'
			{
				newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getStructKeyword_2_0());
			}
			(
				otherlv_3='{'
				{
					newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMessageAccess().getStructEntriesMessageStructEntryParserRuleCall_2_1_1_0());
						}
						lv_structEntries_4_0=ruleMessageStructEntry
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMessageRule());
							}
							add(
								$current,
								"structEntries",
								lv_structEntries_4_0,
								"nl.sudohenk.xtext.StateDef.MessageStructEntry");
							afterParserOrEnumRuleCall();
						}
					)
				)+
				otherlv_5='}'
				{
					newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_2_1_2());
				}
			)
		)?
	)
;

// Entry rule entryRuleMessageStruct
entryRuleMessageStruct returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMessageStructRule()); }
	iv_ruleMessageStruct=ruleMessageStruct
	{ $current=$iv_ruleMessageStruct.current; }
	EOF;

// Rule MessageStruct
ruleMessageStruct returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='struct'
		{
			newLeafNode(otherlv_0, grammarAccess.getMessageStructAccess().getStructKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMessageStructAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageStructRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='{'
			{
				newLeafNode(otherlv_2, grammarAccess.getMessageStructAccess().getLeftCurlyBracketKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMessageStructAccess().getStructEntriesMessageStructEntryParserRuleCall_2_1_0());
					}
					lv_structEntries_3_0=ruleMessageStructEntry
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMessageStructRule());
						}
						add(
							$current,
							"structEntries",
							lv_structEntries_3_0,
							"nl.sudohenk.xtext.StateDef.MessageStructEntry");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_4='}'
			{
				newLeafNode(otherlv_4, grammarAccess.getMessageStructAccess().getRightCurlyBracketKeyword_2_2());
			}
		)?
	)
;

// Entry rule entryRuleMessageStructEntry
entryRuleMessageStructEntry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMessageStructEntryRule()); }
	iv_ruleMessageStructEntry=ruleMessageStructEntry
	{ $current=$iv_ruleMessageStructEntry.current; }
	EOF;

// Rule MessageStructEntry
ruleMessageStructEntry returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_dataType_0_0=RULE_DATATYPE
					{
						newLeafNode(lv_dataType_0_0, grammarAccess.getMessageStructEntryAccess().getDataTypeDATATYPETerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMessageStructEntryRule());
						}
						setWithLastConsumed(
							$current,
							"dataType",
							lv_dataType_0_0,
							"nl.sudohenk.xtext.StateDef.DATATYPE");
					}
				)
			)
			    |
			(
				(
					lv_refType_1_0=RULE_ID
					{
						newLeafNode(lv_refType_1_0, grammarAccess.getMessageStructEntryAccess().getRefTypeIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMessageStructEntryRule());
						}
						setWithLastConsumed(
							$current,
							"refType",
							lv_refType_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		(
			(
				lv_name_2_0=RULE_ENUMNAME
				{
					newLeafNode(lv_name_2_0, grammarAccess.getMessageStructEntryAccess().getNameENUMNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageStructEntryRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"nl.sudohenk.xtext.StateDef.ENUMNAME");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMessageStructEntryAccess().getByteRangeMessageByteRangeParserRuleCall_2_0_0());
					}
					lv_byteRange_3_0=ruleMessageByteRange
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMessageStructEntryRule());
						}
						set(
							$current,
							"byteRange",
							lv_byteRange_3_0,
							"nl.sudohenk.xtext.StateDef.MessageByteRange");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getMessageStructEntryAccess().getByteSizeMessageByteArrayParserRuleCall_2_1_0());
					}
					lv_byteSize_4_0=ruleMessageByteArray
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMessageStructEntryRule());
						}
						set(
							$current,
							"byteSize",
							lv_byteSize_4_0,
							"nl.sudohenk.xtext.StateDef.MessageByteArray");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='='
			{
				newLeafNode(otherlv_5, grammarAccess.getMessageStructEntryAccess().getEqualsSignKeyword_3_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getMessageStructEntryAccess().getDataAssignmentMessageStructureDatatypeParserRuleCall_3_1_0_0());
						}
						lv_dataAssignment_6_0=ruleMessageStructureDatatype
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMessageStructEntryRule());
							}
							add(
								$current,
								"dataAssignment",
								lv_dataAssignment_6_0,
								"nl.sudohenk.xtext.StateDef.MessageStructureDatatype");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_7=','
					{
						newLeafNode(otherlv_7, grammarAccess.getMessageStructEntryAccess().getCommaKeyword_3_1_1());
					}
				)?
			)+
		)?
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getMessageStructEntryAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleMessageByteRange
entryRuleMessageByteRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMessageByteRangeRule()); }
	iv_ruleMessageByteRange=ruleMessageByteRange
	{ $current=$iv_ruleMessageByteRange.current; }
	EOF;

// Rule MessageByteRange
ruleMessageByteRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<'
		{
			newLeafNode(otherlv_0, grammarAccess.getMessageByteRangeAccess().getLessThanSignKeyword_0());
		}
		(
			(
				lv_start_1_0=RULE_INT
				{
					newLeafNode(lv_start_1_0, grammarAccess.getMessageByteRangeAccess().getStartINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageByteRangeRule());
					}
					setWithLastConsumed(
						$current,
						"start",
						lv_start_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2='..'
		{
			newLeafNode(otherlv_2, grammarAccess.getMessageByteRangeAccess().getFullStopFullStopKeyword_2());
		}
		(
			(
				lv_end_3_0=RULE_INT
				{
					newLeafNode(lv_end_3_0, grammarAccess.getMessageByteRangeAccess().getEndINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageByteRangeRule());
					}
					setWithLastConsumed(
						$current,
						"end",
						lv_end_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4='>'
		{
			newLeafNode(otherlv_4, grammarAccess.getMessageByteRangeAccess().getGreaterThanSignKeyword_4());
		}
	)
;

// Entry rule entryRuleMessageByteArray
entryRuleMessageByteArray returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMessageByteArrayRule()); }
	iv_ruleMessageByteArray=ruleMessageByteArray
	{ $current=$iv_ruleMessageByteArray.current; }
	EOF;

// Rule MessageByteArray
ruleMessageByteArray returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getMessageByteArrayAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				lv_size_1_0=RULE_INT
				{
					newLeafNode(lv_size_1_0, grammarAccess.getMessageByteArrayAccess().getSizeINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageByteArrayRule());
					}
					setWithLastConsumed(
						$current,
						"size",
						lv_size_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2=']'
		{
			newLeafNode(otherlv_2, grammarAccess.getMessageByteArrayAccess().getRightSquareBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleMessageStructureStruct
entryRuleMessageStructureStruct returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMessageStructureStructRule()); }
	iv_ruleMessageStructureStruct=ruleMessageStructureStruct
	{ $current=$iv_ruleMessageStructureStruct.current; }
	EOF;

// Rule MessageStructureStruct
ruleMessageStructureStruct returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getMessageStructureStructAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMessageStructureStructAccess().getValuesMessageStructureDatatypeParserRuleCall_1_0_0());
					}
					lv_values_1_0=ruleMessageStructureDatatype
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMessageStructureStructRule());
						}
						add(
							$current,
							"values",
							lv_values_1_0,
							"nl.sudohenk.xtext.StateDef.MessageStructureDatatype");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getMessageStructureStructAccess().getCommaKeyword_1_1());
				}
			)?
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getMessageStructureStructAccess().getRightCurlyBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleMessageStructureDatatype
entryRuleMessageStructureDatatype returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMessageStructureDatatypeRule()); }
	iv_ruleMessageStructureDatatype=ruleMessageStructureDatatype
	{ $current=$iv_ruleMessageStructureDatatype.current; }
	EOF;

// Rule MessageStructureDatatype
ruleMessageStructureDatatype returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_hexVal_0_0=RULE_HEX
				{
					newLeafNode(lv_hexVal_0_0, grammarAccess.getMessageStructureDatatypeAccess().getHexValHEXTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageStructureDatatypeRule());
					}
					setWithLastConsumed(
						$current,
						"hexVal",
						lv_hexVal_0_0,
						"nl.sudohenk.xtext.StateDef.HEX");
				}
			)
		)
		    |
		(
			(
				lv_enumVal_1_0=RULE_ENUMNAME
				{
					newLeafNode(lv_enumVal_1_0, grammarAccess.getMessageStructureDatatypeAccess().getEnumValENUMNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageStructureDatatypeRule());
					}
					setWithLastConsumed(
						$current,
						"enumVal",
						lv_enumVal_1_0,
						"nl.sudohenk.xtext.StateDef.ENUMNAME");
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getMessageStructureDatatypeAccess().getStructValMessageStructureStructParserRuleCall_2_0());
				}
				lv_structVal_2_0=ruleMessageStructureStruct
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMessageStructureDatatypeRule());
					}
					set(
						$current,
						"structVal",
						lv_structVal_2_0,
						"nl.sudohenk.xtext.StateDef.MessageStructureStruct");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			otherlv_3='['
			{
				newLeafNode(otherlv_3, grammarAccess.getMessageStructureDatatypeAccess().getLeftSquareBracketKeyword_3_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getMessageStructureDatatypeAccess().getArrayValMessageStructureDatatypeParserRuleCall_3_1_0_0());
						}
						lv_arrayVal_4_0=ruleMessageStructureDatatype
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMessageStructureDatatypeRule());
							}
							add(
								$current,
								"arrayVal",
								lv_arrayVal_4_0,
								"nl.sudohenk.xtext.StateDef.MessageStructureDatatype");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_5=','
					{
						newLeafNode(otherlv_5, grammarAccess.getMessageStructureDatatypeAccess().getCommaKeyword_3_1_1());
					}
				)?
			)+
			otherlv_6=']'
			{
				newLeafNode(otherlv_6, grammarAccess.getMessageStructureDatatypeAccess().getRightSquareBracketKeyword_3_2());
			}
		)
	)
;

// Entry rule entryRuleMessageEnum
entryRuleMessageEnum returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMessageEnumRule()); }
	iv_ruleMessageEnum=ruleMessageEnum
	{ $current=$iv_ruleMessageEnum.current; }
	EOF;

// Rule MessageEnum
ruleMessageEnum returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='enum'
			{
				newLeafNode(otherlv_0, grammarAccess.getMessageEnumAccess().getEnumKeyword_0());
			}
		)?
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMessageEnumAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageEnumRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='{'
			{
				newLeafNode(otherlv_2, grammarAccess.getMessageEnumAccess().getLeftCurlyBracketKeyword_2_0());
			}
			(
				(
					(
						lv_names_3_0=RULE_ENUMNAME
						{
							newLeafNode(lv_names_3_0, grammarAccess.getMessageEnumAccess().getNamesENUMNAMETerminalRuleCall_2_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMessageEnumRule());
							}
							addWithLastConsumed(
								$current,
								"names",
								lv_names_3_0,
								"nl.sudohenk.xtext.StateDef.ENUMNAME");
						}
					)
				)
				otherlv_4='('
				{
					newLeafNode(otherlv_4, grammarAccess.getMessageEnumAccess().getLeftParenthesisKeyword_2_1_1());
				}
				(
					(
						lv_values_5_0=RULE_INT
						{
							newLeafNode(lv_values_5_0, grammarAccess.getMessageEnumAccess().getValuesINTTerminalRuleCall_2_1_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMessageEnumRule());
							}
							addWithLastConsumed(
								$current,
								"values",
								lv_values_5_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)
				otherlv_6=')'
				{
					newLeafNode(otherlv_6, grammarAccess.getMessageEnumAccess().getRightParenthesisKeyword_2_1_3());
				}
				(
					otherlv_7=','
					{
						newLeafNode(otherlv_7, grammarAccess.getMessageEnumAccess().getCommaKeyword_2_1_4());
					}
				)?
			)+
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getMessageEnumAccess().getRightCurlyBracketKeyword_2_2());
			}
		)?
	)
;

RULE_HEX : '0x' ('a'..'f'|'A'..'F'|'0'..'9')*;

RULE_DATATYPE : ('uint' ('8'|'16'|'24')|'opaque');

RULE_ENUMNAME : ('a'..'z'|'_')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
