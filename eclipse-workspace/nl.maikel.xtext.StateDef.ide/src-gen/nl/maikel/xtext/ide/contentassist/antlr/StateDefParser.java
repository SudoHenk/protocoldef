/*
 * generated by Xtext 2.14.0
 */
package nl.sudohenk.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import nl.sudohenk.xtext.ide.contentassist.antlr.internal.InternalStateDefParser;
import nl.sudohenk.xtext.services.StateDefGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class StateDefParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(StateDefGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, StateDefGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMessageTransitionAccess().getAlternatives_2_2(), "rule__MessageTransition__Alternatives_2_2");
			builder.put(grammarAccess.getMessageStructEntryAccess().getAlternatives_0(), "rule__MessageStructEntry__Alternatives_0");
			builder.put(grammarAccess.getMessageStructEntryAccess().getAlternatives_2(), "rule__MessageStructEntry__Alternatives_2");
			builder.put(grammarAccess.getMessageStructureDatatypeAccess().getAlternatives(), "rule__MessageStructureDatatype__Alternatives");
			builder.put(grammarAccess.getStateMachineAccess().getGroup(), "rule__StateMachine__Group__0");
			builder.put(grammarAccess.getStateMachineAccess().getGroup_2_0(), "rule__StateMachine__Group_2_0__0");
			builder.put(grammarAccess.getStateMachineAccess().getGroup_2_3(), "rule__StateMachine__Group_2_3__0");
			builder.put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
			builder.put(grammarAccess.getMessageTransitionAccess().getGroup(), "rule__MessageTransition__Group__0");
			builder.put(grammarAccess.getMessageTransitionAccess().getGroup_2(), "rule__MessageTransition__Group_2__0");
			builder.put(grammarAccess.getMessageTransitionAccess().getGroup_2_3(), "rule__MessageTransition__Group_2_3__0");
			builder.put(grammarAccess.getMessageTransitionAccess().getGroup_2_3_2(), "rule__MessageTransition__Group_2_3_2__0");
			builder.put(grammarAccess.getMessageTransitionAccess().getGroup_2_4(), "rule__MessageTransition__Group_2_4__0");
			builder.put(grammarAccess.getMessageTransitionAccess().getGroup_2_4_2(), "rule__MessageTransition__Group_2_4_2__0");
			builder.put(grammarAccess.getMessageTransitionAccess().getGroup_2_5(), "rule__MessageTransition__Group_2_5__0");
			builder.put(grammarAccess.getMessageAccess().getGroup(), "rule__Message__Group__0");
			builder.put(grammarAccess.getMessageAccess().getGroup_2(), "rule__Message__Group_2__0");
			builder.put(grammarAccess.getMessageAccess().getGroup_2_1(), "rule__Message__Group_2_1__0");
			builder.put(grammarAccess.getMessageStructAccess().getGroup(), "rule__MessageStruct__Group__0");
			builder.put(grammarAccess.getMessageStructAccess().getGroup_2(), "rule__MessageStruct__Group_2__0");
			builder.put(grammarAccess.getMessageStructEntryAccess().getGroup(), "rule__MessageStructEntry__Group__0");
			builder.put(grammarAccess.getMessageStructEntryAccess().getGroup_3(), "rule__MessageStructEntry__Group_3__0");
			builder.put(grammarAccess.getMessageStructEntryAccess().getGroup_3_1(), "rule__MessageStructEntry__Group_3_1__0");
			builder.put(grammarAccess.getMessageByteRangeAccess().getGroup(), "rule__MessageByteRange__Group__0");
			builder.put(grammarAccess.getMessageByteArrayAccess().getGroup(), "rule__MessageByteArray__Group__0");
			builder.put(grammarAccess.getMessageStructureStructAccess().getGroup(), "rule__MessageStructureStruct__Group__0");
			builder.put(grammarAccess.getMessageStructureStructAccess().getGroup_1(), "rule__MessageStructureStruct__Group_1__0");
			builder.put(grammarAccess.getMessageStructureDatatypeAccess().getGroup_3(), "rule__MessageStructureDatatype__Group_3__0");
			builder.put(grammarAccess.getMessageStructureDatatypeAccess().getGroup_3_1(), "rule__MessageStructureDatatype__Group_3_1__0");
			builder.put(grammarAccess.getMessageEnumAccess().getGroup(), "rule__MessageEnum__Group__0");
			builder.put(grammarAccess.getMessageEnumAccess().getGroup_2(), "rule__MessageEnum__Group_2__0");
			builder.put(grammarAccess.getMessageEnumAccess().getGroup_2_1(), "rule__MessageEnum__Group_2_1__0");
			builder.put(grammarAccess.getStateMachineAccess().getNameAssignment_1(), "rule__StateMachine__NameAssignment_1");
			builder.put(grammarAccess.getStateMachineAccess().getGlobalStructsAssignment_2_0_1_0(), "rule__StateMachine__GlobalStructsAssignment_2_0_1_0");
			builder.put(grammarAccess.getStateMachineAccess().getGlobalEnumsAssignment_2_0_1_1(), "rule__StateMachine__GlobalEnumsAssignment_2_0_1_1");
			builder.put(grammarAccess.getStateMachineAccess().getMessagesAssignment_2_0_1_2(), "rule__StateMachine__MessagesAssignment_2_0_1_2");
			builder.put(grammarAccess.getStateMachineAccess().getInitStateAssignment_2_0_3(), "rule__StateMachine__InitStateAssignment_2_0_3");
			builder.put(grammarAccess.getStateMachineAccess().getStatesAssignment_2_1(), "rule__StateMachine__StatesAssignment_2_1");
			builder.put(grammarAccess.getStateMachineAccess().getTransitionsAssignment_2_2(), "rule__StateMachine__TransitionsAssignment_2_2");
			builder.put(grammarAccess.getStateMachineAccess().getEndStateAssignment_2_3_1(), "rule__StateMachine__EndStateAssignment_2_3_1");
			builder.put(grammarAccess.getStateAccess().getNameAssignment_1(), "rule__State__NameAssignment_1");
			builder.put(grammarAccess.getMessageTransitionAccess().getNameAssignment_1(), "rule__MessageTransition__NameAssignment_1");
			builder.put(grammarAccess.getMessageTransitionAccess().getCurrentStateAssignment_2_2_0(), "rule__MessageTransition__CurrentStateAssignment_2_2_0");
			builder.put(grammarAccess.getMessageTransitionAccess().getAnyStateAssignment_2_2_1(), "rule__MessageTransition__AnyStateAssignment_2_2_1");
			builder.put(grammarAccess.getMessageTransitionAccess().getReceivedMessagesAssignment_2_3_2_1(), "rule__MessageTransition__ReceivedMessagesAssignment_2_3_2_1");
			builder.put(grammarAccess.getMessageTransitionAccess().getSentMessagesAssignment_2_4_2_1(), "rule__MessageTransition__SentMessagesAssignment_2_4_2_1");
			builder.put(grammarAccess.getMessageTransitionAccess().getNextStateAssignment_2_5_1(), "rule__MessageTransition__NextStateAssignment_2_5_1");
			builder.put(grammarAccess.getMessageAccess().getNameAssignment_1(), "rule__Message__NameAssignment_1");
			builder.put(grammarAccess.getMessageAccess().getStructEntriesAssignment_2_1_1(), "rule__Message__StructEntriesAssignment_2_1_1");
			builder.put(grammarAccess.getMessageStructAccess().getNameAssignment_1(), "rule__MessageStruct__NameAssignment_1");
			builder.put(grammarAccess.getMessageStructAccess().getStructEntriesAssignment_2_1(), "rule__MessageStruct__StructEntriesAssignment_2_1");
			builder.put(grammarAccess.getMessageStructEntryAccess().getDataTypeAssignment_0_0(), "rule__MessageStructEntry__DataTypeAssignment_0_0");
			builder.put(grammarAccess.getMessageStructEntryAccess().getRefTypeAssignment_0_1(), "rule__MessageStructEntry__RefTypeAssignment_0_1");
			builder.put(grammarAccess.getMessageStructEntryAccess().getNameAssignment_1(), "rule__MessageStructEntry__NameAssignment_1");
			builder.put(grammarAccess.getMessageStructEntryAccess().getByteRangeAssignment_2_0(), "rule__MessageStructEntry__ByteRangeAssignment_2_0");
			builder.put(grammarAccess.getMessageStructEntryAccess().getByteSizeAssignment_2_1(), "rule__MessageStructEntry__ByteSizeAssignment_2_1");
			builder.put(grammarAccess.getMessageStructEntryAccess().getDataAssignmentAssignment_3_1_0(), "rule__MessageStructEntry__DataAssignmentAssignment_3_1_0");
			builder.put(grammarAccess.getMessageByteRangeAccess().getStartAssignment_1(), "rule__MessageByteRange__StartAssignment_1");
			builder.put(grammarAccess.getMessageByteRangeAccess().getEndAssignment_3(), "rule__MessageByteRange__EndAssignment_3");
			builder.put(grammarAccess.getMessageByteArrayAccess().getSizeAssignment_1(), "rule__MessageByteArray__SizeAssignment_1");
			builder.put(grammarAccess.getMessageStructureStructAccess().getValuesAssignment_1_0(), "rule__MessageStructureStruct__ValuesAssignment_1_0");
			builder.put(grammarAccess.getMessageStructureDatatypeAccess().getHexValAssignment_0(), "rule__MessageStructureDatatype__HexValAssignment_0");
			builder.put(grammarAccess.getMessageStructureDatatypeAccess().getEnumValAssignment_1(), "rule__MessageStructureDatatype__EnumValAssignment_1");
			builder.put(grammarAccess.getMessageStructureDatatypeAccess().getStructValAssignment_2(), "rule__MessageStructureDatatype__StructValAssignment_2");
			builder.put(grammarAccess.getMessageStructureDatatypeAccess().getArrayValAssignment_3_1_0(), "rule__MessageStructureDatatype__ArrayValAssignment_3_1_0");
			builder.put(grammarAccess.getMessageEnumAccess().getNameAssignment_1(), "rule__MessageEnum__NameAssignment_1");
			builder.put(grammarAccess.getMessageEnumAccess().getNamesAssignment_2_1_0(), "rule__MessageEnum__NamesAssignment_2_1_0");
			builder.put(grammarAccess.getMessageEnumAccess().getValuesAssignment_2_1_2(), "rule__MessageEnum__ValuesAssignment_2_1_2");
			builder.put(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), "rule__StateMachine__UnorderedGroup_2");
			builder.put(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), "rule__StateMachine__UnorderedGroup_2_0_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private StateDefGrammarAccess grammarAccess;

	@Override
	protected InternalStateDefParser createParser() {
		InternalStateDefParser result = new InternalStateDefParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public StateDefGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(StateDefGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
