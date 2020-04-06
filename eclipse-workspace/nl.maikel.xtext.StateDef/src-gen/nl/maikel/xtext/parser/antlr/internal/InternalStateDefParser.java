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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateDefParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DATATYPE", "RULE_ENUMNAME", "RULE_INT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'{'", "'initial'", "'end'", "'}'", "'state'", "'transition'", "'from'", "'any'", "'received'", "'messages'", "'sent'", "'go'", "'message'", "'struct'", "'='", "','", "';'", "'<'", "'..'", "'>'", "'['", "']'", "'enum'", "'('", "')'"
    };
    public static final int RULE_HEX=8;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ENUMNAME=6;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_DATATYPE=5;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalStateDefParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateDefParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateDefParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateDef.g"; }



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




    // $ANTLR start "entryRuleStateMachine"
    // InternalStateDef.g:64:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalStateDef.g:64:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalStateDef.g:65:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStateDef.g:71:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) ) ) ) )+ {...}?) ) )? ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_globalStructs_5_0 = null;

        EObject lv_globalEnums_6_0 = null;

        EObject lv_messages_7_0 = null;

        EObject lv_initState_9_0 = null;

        EObject lv_states_10_0 = null;

        EObject lv_transitions_11_0 = null;

        EObject lv_endState_13_0 = null;



        	enterRule();

        try {
            // InternalStateDef.g:77:2: ( (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) ) ) ) )+ {...}?) ) )? ) )
            // InternalStateDef.g:78:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) ) ) ) )+ {...}?) ) )? )
            {
            // InternalStateDef.g:78:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) ) ) ) )+ {...}?) ) )? )
            // InternalStateDef.g:79:3: otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) ) ) ) )+ {...}?) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getMachineKeyword_0());
            		
            // InternalStateDef.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateDef.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateDef.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalStateDef.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateDef.g:101:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) ) ) ) )+ {...}?) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15||LA8_0==17||(LA8_0>=19 && LA8_0<=20)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStateDef.g:102:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) ) ) ) )+ {...}?) )
                    {
                    // InternalStateDef.g:102:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) ) ) ) )+ {...}?) )
                    // InternalStateDef.g:103:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) ) ) ) )+ {...}?)
                    {
                     
                    				  getUnorderedGroupHelper().enter(grammarAccess.getStateMachineAccess().getUnorderedGroup_2());
                    				
                    // InternalStateDef.g:106:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) ) ) ) )+ {...}?)
                    // InternalStateDef.g:107:6: ( ({...}? => ( ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) ) ) ) )+ {...}?
                    {
                    // InternalStateDef.g:107:6: ( ({...}? => ( ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleState ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) ) ) ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=5;
                        int LA7_0 = input.LA(1);

                        if ( LA7_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 0) ) {
                            alt7=1;
                        }
                        else if ( LA7_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 1) ) {
                            alt7=2;
                        }
                        else if ( LA7_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 2) ) {
                            alt7=3;
                        }
                        else if ( LA7_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 3) ) {
                            alt7=4;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalStateDef.g:108:4: ({...}? => ( ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) ) ) )
                    	    {
                    	    // InternalStateDef.g:108:4: ({...}? => ( ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) ) ) )
                    	    // InternalStateDef.g:109:5: {...}? => ( ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleStateMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 0)");
                    	    }
                    	    // InternalStateDef.g:109:109: ( ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) ) )
                    	    // InternalStateDef.g:110:6: ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 0);
                    	    					
                    	    // InternalStateDef.g:113:9: ({...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) ) )
                    	    // InternalStateDef.g:113:10: {...}? => (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStateMachine", "true");
                    	    }
                    	    // InternalStateDef.g:113:19: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) ) )
                    	    // InternalStateDef.g:113:20: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) ) otherlv_8= 'initial' ( (lv_initState_9_0= ruleState ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_5); 

                    	    									newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2_0_0());
                    	    								
                    	    // InternalStateDef.g:117:9: ( ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) ) )
                    	    // InternalStateDef.g:118:10: ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) )
                    	    {
                    	    // InternalStateDef.g:118:10: ( ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* ) )
                    	    // InternalStateDef.g:119:11: ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* )
                    	    {
                    	     
                    	    										  getUnorderedGroupHelper().enter(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1());
                    	    										
                    	    // InternalStateDef.g:122:11: ( ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )* )
                    	    // InternalStateDef.g:123:12: ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )*
                    	    {
                    	    // InternalStateDef.g:123:12: ( ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) ) )*
                    	    loop4:
                    	    do {
                    	        int alt4=4;
                    	        int LA4_0 = input.LA(1);

                    	        if ( LA4_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 0) ) {
                    	            alt4=1;
                    	        }
                    	        else if ( ( LA4_0 == RULE_ID || LA4_0 == 37 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 1) ) {
                    	            alt4=2;
                    	        }
                    	        else if ( LA4_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 2) ) {
                    	            alt4=3;
                    	        }


                    	        switch (alt4) {
                    	    	case 1 :
                    	    	    // InternalStateDef.g:124:10: ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) )
                    	    	    {
                    	    	    // InternalStateDef.g:124:10: ({...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ ) )
                    	    	    // InternalStateDef.g:125:11: {...}? => ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ )
                    	    	    {
                    	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 0) ) {
                    	    	        throw new FailedPredicateException(input, "ruleStateMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 0)");
                    	    	    }
                    	    	    // InternalStateDef.g:125:119: ( ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+ )
                    	    	    // InternalStateDef.g:126:12: ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+
                    	    	    {

                    	    	    												getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 0);
                    	    	    											
                    	    	    // InternalStateDef.g:129:15: ({...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) ) )+
                    	    	    int cnt1=0;
                    	    	    loop1:
                    	    	    do {
                    	    	        int alt1=2;
                    	    	        int LA1_0 = input.LA(1);

                    	    	        if ( (LA1_0==28) ) {
                    	    	            int LA1_2 = input.LA(2);

                    	    	            if ( ((true)) ) {
                    	    	                alt1=1;
                    	    	            }


                    	    	        }


                    	    	        switch (alt1) {
                    	    	    	case 1 :
                    	    	    	    // InternalStateDef.g:129:16: {...}? => ( (lv_globalStructs_5_0= ruleMessageStruct ) )
                    	    	    	    {
                    	    	    	    if ( !((true)) ) {
                    	    	    	        throw new FailedPredicateException(input, "ruleStateMachine", "true");
                    	    	    	    }
                    	    	    	    // InternalStateDef.g:129:25: ( (lv_globalStructs_5_0= ruleMessageStruct ) )
                    	    	    	    // InternalStateDef.g:129:26: (lv_globalStructs_5_0= ruleMessageStruct )
                    	    	    	    {
                    	    	    	    // InternalStateDef.g:129:26: (lv_globalStructs_5_0= ruleMessageStruct )
                    	    	    	    // InternalStateDef.g:130:16: lv_globalStructs_5_0= ruleMessageStruct
                    	    	    	    {

                    	    	    	    																newCompositeNode(grammarAccess.getStateMachineAccess().getGlobalStructsMessageStructParserRuleCall_2_0_1_0_0());
                    	    	    	    															
                    	    	    	    pushFollow(FOLLOW_5);
                    	    	    	    lv_globalStructs_5_0=ruleMessageStruct();

                    	    	    	    state._fsp--;


                    	    	    	    																if (current==null) {
                    	    	    	    																	current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	    	    																}
                    	    	    	    																add(
                    	    	    	    																	current,
                    	    	    	    																	"globalStructs",
                    	    	    	    																	lv_globalStructs_5_0,
                    	    	    	    																	"nl.sudohenk.xtext.StateDef.MessageStruct");
                    	    	    	    																afterParserOrEnumRuleCall();
                    	    	    	    															

                    	    	    	    }


                    	    	    	    }


                    	    	    	    }
                    	    	    	    break;

                    	    	    	default :
                    	    	    	    if ( cnt1 >= 1 ) break loop1;
                    	    	                EarlyExitException eee =
                    	    	                    new EarlyExitException(1, input);
                    	    	                throw eee;
                    	    	        }
                    	    	        cnt1++;
                    	    	    } while (true);

                    	    	     
                    	    	    												getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1());
                    	    	    											

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // InternalStateDef.g:152:10: ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) )
                    	    	    {
                    	    	    // InternalStateDef.g:152:10: ({...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ ) )
                    	    	    // InternalStateDef.g:153:11: {...}? => ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ )
                    	    	    {
                    	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 1) ) {
                    	    	        throw new FailedPredicateException(input, "ruleStateMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 1)");
                    	    	    }
                    	    	    // InternalStateDef.g:153:119: ( ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+ )
                    	    	    // InternalStateDef.g:154:12: ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+
                    	    	    {

                    	    	    												getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 1);
                    	    	    											
                    	    	    // InternalStateDef.g:157:15: ({...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) ) )+
                    	    	    int cnt2=0;
                    	    	    loop2:
                    	    	    do {
                    	    	        int alt2=2;
                    	    	        int LA2_0 = input.LA(1);

                    	    	        if ( (LA2_0==37) ) {
                    	    	            int LA2_2 = input.LA(2);

                    	    	            if ( ((true)) ) {
                    	    	                alt2=1;
                    	    	            }


                    	    	        }
                    	    	        else if ( (LA2_0==RULE_ID) ) {
                    	    	            int LA2_3 = input.LA(2);

                    	    	            if ( ((true)) ) {
                    	    	                alt2=1;
                    	    	            }


                    	    	        }


                    	    	        switch (alt2) {
                    	    	    	case 1 :
                    	    	    	    // InternalStateDef.g:157:16: {...}? => ( (lv_globalEnums_6_0= ruleMessageEnum ) )
                    	    	    	    {
                    	    	    	    if ( !((true)) ) {
                    	    	    	        throw new FailedPredicateException(input, "ruleStateMachine", "true");
                    	    	    	    }
                    	    	    	    // InternalStateDef.g:157:25: ( (lv_globalEnums_6_0= ruleMessageEnum ) )
                    	    	    	    // InternalStateDef.g:157:26: (lv_globalEnums_6_0= ruleMessageEnum )
                    	    	    	    {
                    	    	    	    // InternalStateDef.g:157:26: (lv_globalEnums_6_0= ruleMessageEnum )
                    	    	    	    // InternalStateDef.g:158:16: lv_globalEnums_6_0= ruleMessageEnum
                    	    	    	    {

                    	    	    	    																newCompositeNode(grammarAccess.getStateMachineAccess().getGlobalEnumsMessageEnumParserRuleCall_2_0_1_1_0());
                    	    	    	    															
                    	    	    	    pushFollow(FOLLOW_5);
                    	    	    	    lv_globalEnums_6_0=ruleMessageEnum();

                    	    	    	    state._fsp--;


                    	    	    	    																if (current==null) {
                    	    	    	    																	current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	    	    																}
                    	    	    	    																add(
                    	    	    	    																	current,
                    	    	    	    																	"globalEnums",
                    	    	    	    																	lv_globalEnums_6_0,
                    	    	    	    																	"nl.sudohenk.xtext.StateDef.MessageEnum");
                    	    	    	    																afterParserOrEnumRuleCall();
                    	    	    	    															

                    	    	    	    }


                    	    	    	    }


                    	    	    	    }
                    	    	    	    break;

                    	    	    	default :
                    	    	    	    if ( cnt2 >= 1 ) break loop2;
                    	    	                EarlyExitException eee =
                    	    	                    new EarlyExitException(2, input);
                    	    	                throw eee;
                    	    	        }
                    	    	        cnt2++;
                    	    	    } while (true);

                    	    	     
                    	    	    												getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1());
                    	    	    											

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;
                    	    	case 3 :
                    	    	    // InternalStateDef.g:180:10: ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) )
                    	    	    {
                    	    	    // InternalStateDef.g:180:10: ({...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ ) )
                    	    	    // InternalStateDef.g:181:11: {...}? => ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ )
                    	    	    {
                    	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 2) ) {
                    	    	        throw new FailedPredicateException(input, "ruleStateMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 2)");
                    	    	    }
                    	    	    // InternalStateDef.g:181:119: ( ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+ )
                    	    	    // InternalStateDef.g:182:12: ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+
                    	    	    {

                    	    	    												getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 2);
                    	    	    											
                    	    	    // InternalStateDef.g:185:15: ({...}? => ( (lv_messages_7_0= ruleMessage ) ) )+
                    	    	    int cnt3=0;
                    	    	    loop3:
                    	    	    do {
                    	    	        int alt3=2;
                    	    	        int LA3_0 = input.LA(1);

                    	    	        if ( (LA3_0==27) ) {
                    	    	            int LA3_2 = input.LA(2);

                    	    	            if ( ((true)) ) {
                    	    	                alt3=1;
                    	    	            }


                    	    	        }


                    	    	        switch (alt3) {
                    	    	    	case 1 :
                    	    	    	    // InternalStateDef.g:185:16: {...}? => ( (lv_messages_7_0= ruleMessage ) )
                    	    	    	    {
                    	    	    	    if ( !((true)) ) {
                    	    	    	        throw new FailedPredicateException(input, "ruleStateMachine", "true");
                    	    	    	    }
                    	    	    	    // InternalStateDef.g:185:25: ( (lv_messages_7_0= ruleMessage ) )
                    	    	    	    // InternalStateDef.g:185:26: (lv_messages_7_0= ruleMessage )
                    	    	    	    {
                    	    	    	    // InternalStateDef.g:185:26: (lv_messages_7_0= ruleMessage )
                    	    	    	    // InternalStateDef.g:186:16: lv_messages_7_0= ruleMessage
                    	    	    	    {

                    	    	    	    																newCompositeNode(grammarAccess.getStateMachineAccess().getMessagesMessageParserRuleCall_2_0_1_2_0());
                    	    	    	    															
                    	    	    	    pushFollow(FOLLOW_5);
                    	    	    	    lv_messages_7_0=ruleMessage();

                    	    	    	    state._fsp--;


                    	    	    	    																if (current==null) {
                    	    	    	    																	current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	    	    																}
                    	    	    	    																add(
                    	    	    	    																	current,
                    	    	    	    																	"messages",
                    	    	    	    																	lv_messages_7_0,
                    	    	    	    																	"nl.sudohenk.xtext.StateDef.Message");
                    	    	    	    																afterParserOrEnumRuleCall();
                    	    	    	    															

                    	    	    	    }


                    	    	    	    }


                    	    	    	    }
                    	    	    	    break;

                    	    	    	default :
                    	    	    	    if ( cnt3 >= 1 ) break loop3;
                    	    	                EarlyExitException eee =
                    	    	                    new EarlyExitException(3, input);
                    	    	                throw eee;
                    	    	        }
                    	    	        cnt3++;
                    	    	    } while (true);

                    	    	     
                    	    	    												getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1());
                    	    	    											

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop4;
                    	        }
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    										  getUnorderedGroupHelper().leave(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1());
                    	    										

                    	    }

                    	    otherlv_8=(Token)match(input,16,FOLLOW_6); 

                    	    									newLeafNode(otherlv_8, grammarAccess.getStateMachineAccess().getInitialKeyword_2_0_2());
                    	    								
                    	    // InternalStateDef.g:219:9: ( (lv_initState_9_0= ruleState ) )
                    	    // InternalStateDef.g:220:10: (lv_initState_9_0= ruleState )
                    	    {
                    	    // InternalStateDef.g:220:10: (lv_initState_9_0= ruleState )
                    	    // InternalStateDef.g:221:11: lv_initState_9_0= ruleState
                    	    {

                    	    											newCompositeNode(grammarAccess.getStateMachineAccess().getInitStateStateParserRuleCall_2_0_3_0());
                    	    										
                    	    pushFollow(FOLLOW_4);
                    	    lv_initState_9_0=ruleState();

                    	    state._fsp--;


                    	    											if (current==null) {
                    	    												current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    											}
                    	    											set(
                    	    												current,
                    	    												"initState",
                    	    												lv_initState_9_0,
                    	    												"nl.sudohenk.xtext.StateDef.State");
                    	    											afterParserOrEnumRuleCall();
                    	    										

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_2());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalStateDef.g:244:4: ({...}? => ( ({...}? => ( (lv_states_10_0= ruleState ) ) )+ ) )
                    	    {
                    	    // InternalStateDef.g:244:4: ({...}? => ( ({...}? => ( (lv_states_10_0= ruleState ) ) )+ ) )
                    	    // InternalStateDef.g:245:5: {...}? => ( ({...}? => ( (lv_states_10_0= ruleState ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleStateMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 1)");
                    	    }
                    	    // InternalStateDef.g:245:109: ( ({...}? => ( (lv_states_10_0= ruleState ) ) )+ )
                    	    // InternalStateDef.g:246:6: ({...}? => ( (lv_states_10_0= ruleState ) ) )+
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 1);
                    	    					
                    	    // InternalStateDef.g:249:9: ({...}? => ( (lv_states_10_0= ruleState ) ) )+
                    	    int cnt5=0;
                    	    loop5:
                    	    do {
                    	        int alt5=2;
                    	        int LA5_0 = input.LA(1);

                    	        if ( (LA5_0==19) ) {
                    	            int LA5_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt5=1;
                    	            }


                    	        }


                    	        switch (alt5) {
                    	    	case 1 :
                    	    	    // InternalStateDef.g:249:10: {...}? => ( (lv_states_10_0= ruleState ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleStateMachine", "true");
                    	    	    }
                    	    	    // InternalStateDef.g:249:19: ( (lv_states_10_0= ruleState ) )
                    	    	    // InternalStateDef.g:249:20: (lv_states_10_0= ruleState )
                    	    	    {
                    	    	    // InternalStateDef.g:249:20: (lv_states_10_0= ruleState )
                    	    	    // InternalStateDef.g:250:10: lv_states_10_0= ruleState
                    	    	    {

                    	    	    										newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_2_1_0());
                    	    	    									
                    	    	    pushFollow(FOLLOW_4);
                    	    	    lv_states_10_0=ruleState();

                    	    	    state._fsp--;


                    	    	    										if (current==null) {
                    	    	    											current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	    										}
                    	    	    										add(
                    	    	    											current,
                    	    	    											"states",
                    	    	    											lv_states_10_0,
                    	    	    											"nl.sudohenk.xtext.StateDef.State");
                    	    	    										afterParserOrEnumRuleCall();
                    	    	    									

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt5 >= 1 ) break loop5;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(5, input);
                    	                throw eee;
                    	        }
                    	        cnt5++;
                    	    } while (true);

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_2());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalStateDef.g:272:4: ({...}? => ( ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+ ) )
                    	    {
                    	    // InternalStateDef.g:272:4: ({...}? => ( ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+ ) )
                    	    // InternalStateDef.g:273:5: {...}? => ( ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleStateMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 2)");
                    	    }
                    	    // InternalStateDef.g:273:109: ( ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+ )
                    	    // InternalStateDef.g:274:6: ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 2);
                    	    					
                    	    // InternalStateDef.g:277:9: ({...}? => ( (lv_transitions_11_0= ruleMessageTransition ) ) )+
                    	    int cnt6=0;
                    	    loop6:
                    	    do {
                    	        int alt6=2;
                    	        int LA6_0 = input.LA(1);

                    	        if ( (LA6_0==20) ) {
                    	            int LA6_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt6=1;
                    	            }


                    	        }


                    	        switch (alt6) {
                    	    	case 1 :
                    	    	    // InternalStateDef.g:277:10: {...}? => ( (lv_transitions_11_0= ruleMessageTransition ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleStateMachine", "true");
                    	    	    }
                    	    	    // InternalStateDef.g:277:19: ( (lv_transitions_11_0= ruleMessageTransition ) )
                    	    	    // InternalStateDef.g:277:20: (lv_transitions_11_0= ruleMessageTransition )
                    	    	    {
                    	    	    // InternalStateDef.g:277:20: (lv_transitions_11_0= ruleMessageTransition )
                    	    	    // InternalStateDef.g:278:10: lv_transitions_11_0= ruleMessageTransition
                    	    	    {

                    	    	    										newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsMessageTransitionParserRuleCall_2_2_0());
                    	    	    									
                    	    	    pushFollow(FOLLOW_4);
                    	    	    lv_transitions_11_0=ruleMessageTransition();

                    	    	    state._fsp--;


                    	    	    										if (current==null) {
                    	    	    											current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	    										}
                    	    	    										add(
                    	    	    											current,
                    	    	    											"transitions",
                    	    	    											lv_transitions_11_0,
                    	    	    											"nl.sudohenk.xtext.StateDef.MessageTransition");
                    	    	    										afterParserOrEnumRuleCall();
                    	    	    									

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt6 >= 1 ) break loop6;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(6, input);
                    	                throw eee;
                    	        }
                    	        cnt6++;
                    	    } while (true);

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_2());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalStateDef.g:300:4: ({...}? => ( ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) ) ) )
                    	    {
                    	    // InternalStateDef.g:300:4: ({...}? => ( ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) ) ) )
                    	    // InternalStateDef.g:301:5: {...}? => ( ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleStateMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 3)");
                    	    }
                    	    // InternalStateDef.g:301:109: ( ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) ) )
                    	    // InternalStateDef.g:302:6: ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 3);
                    	    					
                    	    // InternalStateDef.g:305:9: ({...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' ) )
                    	    // InternalStateDef.g:305:10: {...}? => (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStateMachine", "true");
                    	    }
                    	    // InternalStateDef.g:305:19: (otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}' )
                    	    // InternalStateDef.g:305:20: otherlv_12= 'end' ( (lv_endState_13_0= ruleState ) ) otherlv_14= '}'
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_6); 

                    	    									newLeafNode(otherlv_12, grammarAccess.getStateMachineAccess().getEndKeyword_2_3_0());
                    	    								
                    	    // InternalStateDef.g:309:9: ( (lv_endState_13_0= ruleState ) )
                    	    // InternalStateDef.g:310:10: (lv_endState_13_0= ruleState )
                    	    {
                    	    // InternalStateDef.g:310:10: (lv_endState_13_0= ruleState )
                    	    // InternalStateDef.g:311:11: lv_endState_13_0= ruleState
                    	    {

                    	    											newCompositeNode(grammarAccess.getStateMachineAccess().getEndStateStateParserRuleCall_2_3_1_0());
                    	    										
                    	    pushFollow(FOLLOW_7);
                    	    lv_endState_13_0=ruleState();

                    	    state._fsp--;


                    	    											if (current==null) {
                    	    												current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    											}
                    	    											set(
                    	    												current,
                    	    												"endState",
                    	    												lv_endState_13_0,
                    	    												"nl.sudohenk.xtext.StateDef.State");
                    	    											afterParserOrEnumRuleCall();
                    	    										

                    	    }


                    	    }

                    	    otherlv_14=(Token)match(input,18,FOLLOW_4); 

                    	    									newLeafNode(otherlv_14, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_2_3_2());
                    	    								

                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_2());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStateMachineAccess().getUnorderedGroup_2()) ) {
                        throw new FailedPredicateException(input, "ruleStateMachine", "getUnorderedGroupHelper().canLeave(grammarAccess.getStateMachineAccess().getUnorderedGroup_2())");
                    }

                    }


                    }

                     
                    				  getUnorderedGroupHelper().leave(grammarAccess.getStateMachineAccess().getUnorderedGroup_2());
                    				

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // InternalStateDef.g:350:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateDef.g:350:46: (iv_ruleState= ruleState EOF )
            // InternalStateDef.g:351:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateDef.g:357:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalStateDef.g:363:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalStateDef.g:364:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalStateDef.g:364:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalStateDef.g:365:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalStateDef.g:369:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateDef.g:370:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateDef.g:370:4: (lv_name_1_0= RULE_ID )
            // InternalStateDef.g:371:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleMessageTransition"
    // InternalStateDef.g:391:1: entryRuleMessageTransition returns [EObject current=null] : iv_ruleMessageTransition= ruleMessageTransition EOF ;
    public final EObject entryRuleMessageTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageTransition = null;


        try {
            // InternalStateDef.g:391:58: (iv_ruleMessageTransition= ruleMessageTransition EOF )
            // InternalStateDef.g:392:2: iv_ruleMessageTransition= ruleMessageTransition EOF
            {
             newCompositeNode(grammarAccess.getMessageTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageTransition=ruleMessageTransition();

            state._fsp--;

             current =iv_ruleMessageTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageTransition"


    // $ANTLR start "ruleMessageTransition"
    // InternalStateDef.g:398:1: ruleMessageTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'from' ( ( (lv_currentState_4_0= ruleState ) ) | ( (lv_anyState_5_0= 'any' ) ) ) (otherlv_6= 'received' otherlv_7= 'messages' (otherlv_8= '{' ( (lv_receivedMessages_9_0= ruleMessage ) )* otherlv_10= '}' ) )? (otherlv_11= 'sent' otherlv_12= 'messages' (otherlv_13= '{' ( (lv_sentMessages_14_0= ruleMessage ) )* otherlv_15= '}' ) )? (otherlv_16= 'go' ( (lv_nextState_17_0= ruleState ) ) )? otherlv_18= '}' )? ) ;
    public final EObject ruleMessageTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_anyState_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_currentState_4_0 = null;

        EObject lv_receivedMessages_9_0 = null;

        EObject lv_sentMessages_14_0 = null;

        EObject lv_nextState_17_0 = null;



        	enterRule();

        try {
            // InternalStateDef.g:404:2: ( (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'from' ( ( (lv_currentState_4_0= ruleState ) ) | ( (lv_anyState_5_0= 'any' ) ) ) (otherlv_6= 'received' otherlv_7= 'messages' (otherlv_8= '{' ( (lv_receivedMessages_9_0= ruleMessage ) )* otherlv_10= '}' ) )? (otherlv_11= 'sent' otherlv_12= 'messages' (otherlv_13= '{' ( (lv_sentMessages_14_0= ruleMessage ) )* otherlv_15= '}' ) )? (otherlv_16= 'go' ( (lv_nextState_17_0= ruleState ) ) )? otherlv_18= '}' )? ) )
            // InternalStateDef.g:405:2: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'from' ( ( (lv_currentState_4_0= ruleState ) ) | ( (lv_anyState_5_0= 'any' ) ) ) (otherlv_6= 'received' otherlv_7= 'messages' (otherlv_8= '{' ( (lv_receivedMessages_9_0= ruleMessage ) )* otherlv_10= '}' ) )? (otherlv_11= 'sent' otherlv_12= 'messages' (otherlv_13= '{' ( (lv_sentMessages_14_0= ruleMessage ) )* otherlv_15= '}' ) )? (otherlv_16= 'go' ( (lv_nextState_17_0= ruleState ) ) )? otherlv_18= '}' )? )
            {
            // InternalStateDef.g:405:2: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'from' ( ( (lv_currentState_4_0= ruleState ) ) | ( (lv_anyState_5_0= 'any' ) ) ) (otherlv_6= 'received' otherlv_7= 'messages' (otherlv_8= '{' ( (lv_receivedMessages_9_0= ruleMessage ) )* otherlv_10= '}' ) )? (otherlv_11= 'sent' otherlv_12= 'messages' (otherlv_13= '{' ( (lv_sentMessages_14_0= ruleMessage ) )* otherlv_15= '}' ) )? (otherlv_16= 'go' ( (lv_nextState_17_0= ruleState ) ) )? otherlv_18= '}' )? )
            // InternalStateDef.g:406:3: otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'from' ( ( (lv_currentState_4_0= ruleState ) ) | ( (lv_anyState_5_0= 'any' ) ) ) (otherlv_6= 'received' otherlv_7= 'messages' (otherlv_8= '{' ( (lv_receivedMessages_9_0= ruleMessage ) )* otherlv_10= '}' ) )? (otherlv_11= 'sent' otherlv_12= 'messages' (otherlv_13= '{' ( (lv_sentMessages_14_0= ruleMessage ) )* otherlv_15= '}' ) )? (otherlv_16= 'go' ( (lv_nextState_17_0= ruleState ) ) )? otherlv_18= '}' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageTransitionAccess().getTransitionKeyword_0());
            		
            // InternalStateDef.g:410:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateDef.g:411:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateDef.g:411:4: (lv_name_1_0= RULE_ID )
            // InternalStateDef.g:412:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMessageTransitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageTransitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateDef.g:428:3: (otherlv_2= '{' otherlv_3= 'from' ( ( (lv_currentState_4_0= ruleState ) ) | ( (lv_anyState_5_0= 'any' ) ) ) (otherlv_6= 'received' otherlv_7= 'messages' (otherlv_8= '{' ( (lv_receivedMessages_9_0= ruleMessage ) )* otherlv_10= '}' ) )? (otherlv_11= 'sent' otherlv_12= 'messages' (otherlv_13= '{' ( (lv_sentMessages_14_0= ruleMessage ) )* otherlv_15= '}' ) )? (otherlv_16= 'go' ( (lv_nextState_17_0= ruleState ) ) )? otherlv_18= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==21) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalStateDef.g:429:4: otherlv_2= '{' otherlv_3= 'from' ( ( (lv_currentState_4_0= ruleState ) ) | ( (lv_anyState_5_0= 'any' ) ) ) (otherlv_6= 'received' otherlv_7= 'messages' (otherlv_8= '{' ( (lv_receivedMessages_9_0= ruleMessage ) )* otherlv_10= '}' ) )? (otherlv_11= 'sent' otherlv_12= 'messages' (otherlv_13= '{' ( (lv_sentMessages_14_0= ruleMessage ) )* otherlv_15= '}' ) )? (otherlv_16= 'go' ( (lv_nextState_17_0= ruleState ) ) )? otherlv_18= '}'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getMessageTransitionAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getMessageTransitionAccess().getFromKeyword_2_1());
                    			
                    // InternalStateDef.g:437:4: ( ( (lv_currentState_4_0= ruleState ) ) | ( (lv_anyState_5_0= 'any' ) ) )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==19) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==22) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalStateDef.g:438:5: ( (lv_currentState_4_0= ruleState ) )
                            {
                            // InternalStateDef.g:438:5: ( (lv_currentState_4_0= ruleState ) )
                            // InternalStateDef.g:439:6: (lv_currentState_4_0= ruleState )
                            {
                            // InternalStateDef.g:439:6: (lv_currentState_4_0= ruleState )
                            // InternalStateDef.g:440:7: lv_currentState_4_0= ruleState
                            {

                            							newCompositeNode(grammarAccess.getMessageTransitionAccess().getCurrentStateStateParserRuleCall_2_2_0_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_currentState_4_0=ruleState();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMessageTransitionRule());
                            							}
                            							set(
                            								current,
                            								"currentState",
                            								lv_currentState_4_0,
                            								"nl.sudohenk.xtext.StateDef.State");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalStateDef.g:458:5: ( (lv_anyState_5_0= 'any' ) )
                            {
                            // InternalStateDef.g:458:5: ( (lv_anyState_5_0= 'any' ) )
                            // InternalStateDef.g:459:6: (lv_anyState_5_0= 'any' )
                            {
                            // InternalStateDef.g:459:6: (lv_anyState_5_0= 'any' )
                            // InternalStateDef.g:460:7: lv_anyState_5_0= 'any'
                            {
                            lv_anyState_5_0=(Token)match(input,22,FOLLOW_11); 

                            							newLeafNode(lv_anyState_5_0, grammarAccess.getMessageTransitionAccess().getAnyStateAnyKeyword_2_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMessageTransitionRule());
                            							}
                            							setWithLastConsumed(current, "anyState", lv_anyState_5_0, "any");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalStateDef.g:473:4: (otherlv_6= 'received' otherlv_7= 'messages' (otherlv_8= '{' ( (lv_receivedMessages_9_0= ruleMessage ) )* otherlv_10= '}' ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==23) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalStateDef.g:474:5: otherlv_6= 'received' otherlv_7= 'messages' (otherlv_8= '{' ( (lv_receivedMessages_9_0= ruleMessage ) )* otherlv_10= '}' )
                            {
                            otherlv_6=(Token)match(input,23,FOLLOW_12); 

                            					newLeafNode(otherlv_6, grammarAccess.getMessageTransitionAccess().getReceivedKeyword_2_3_0());
                            				
                            otherlv_7=(Token)match(input,24,FOLLOW_13); 

                            					newLeafNode(otherlv_7, grammarAccess.getMessageTransitionAccess().getMessagesKeyword_2_3_1());
                            				
                            // InternalStateDef.g:482:5: (otherlv_8= '{' ( (lv_receivedMessages_9_0= ruleMessage ) )* otherlv_10= '}' )
                            // InternalStateDef.g:483:6: otherlv_8= '{' ( (lv_receivedMessages_9_0= ruleMessage ) )* otherlv_10= '}'
                            {
                            otherlv_8=(Token)match(input,15,FOLLOW_14); 

                            						newLeafNode(otherlv_8, grammarAccess.getMessageTransitionAccess().getLeftCurlyBracketKeyword_2_3_2_0());
                            					
                            // InternalStateDef.g:487:6: ( (lv_receivedMessages_9_0= ruleMessage ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==27) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalStateDef.g:488:7: (lv_receivedMessages_9_0= ruleMessage )
                            	    {
                            	    // InternalStateDef.g:488:7: (lv_receivedMessages_9_0= ruleMessage )
                            	    // InternalStateDef.g:489:8: lv_receivedMessages_9_0= ruleMessage
                            	    {

                            	    								newCompositeNode(grammarAccess.getMessageTransitionAccess().getReceivedMessagesMessageParserRuleCall_2_3_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_14);
                            	    lv_receivedMessages_9_0=ruleMessage();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMessageTransitionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"receivedMessages",
                            	    									lv_receivedMessages_9_0,
                            	    									"nl.sudohenk.xtext.StateDef.Message");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,18,FOLLOW_15); 

                            						newLeafNode(otherlv_10, grammarAccess.getMessageTransitionAccess().getRightCurlyBracketKeyword_2_3_2_2());
                            					

                            }


                            }
                            break;

                    }

                    // InternalStateDef.g:512:4: (otherlv_11= 'sent' otherlv_12= 'messages' (otherlv_13= '{' ( (lv_sentMessages_14_0= ruleMessage ) )* otherlv_15= '}' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==25) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalStateDef.g:513:5: otherlv_11= 'sent' otherlv_12= 'messages' (otherlv_13= '{' ( (lv_sentMessages_14_0= ruleMessage ) )* otherlv_15= '}' )
                            {
                            otherlv_11=(Token)match(input,25,FOLLOW_12); 

                            					newLeafNode(otherlv_11, grammarAccess.getMessageTransitionAccess().getSentKeyword_2_4_0());
                            				
                            otherlv_12=(Token)match(input,24,FOLLOW_13); 

                            					newLeafNode(otherlv_12, grammarAccess.getMessageTransitionAccess().getMessagesKeyword_2_4_1());
                            				
                            // InternalStateDef.g:521:5: (otherlv_13= '{' ( (lv_sentMessages_14_0= ruleMessage ) )* otherlv_15= '}' )
                            // InternalStateDef.g:522:6: otherlv_13= '{' ( (lv_sentMessages_14_0= ruleMessage ) )* otherlv_15= '}'
                            {
                            otherlv_13=(Token)match(input,15,FOLLOW_14); 

                            						newLeafNode(otherlv_13, grammarAccess.getMessageTransitionAccess().getLeftCurlyBracketKeyword_2_4_2_0());
                            					
                            // InternalStateDef.g:526:6: ( (lv_sentMessages_14_0= ruleMessage ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==27) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // InternalStateDef.g:527:7: (lv_sentMessages_14_0= ruleMessage )
                            	    {
                            	    // InternalStateDef.g:527:7: (lv_sentMessages_14_0= ruleMessage )
                            	    // InternalStateDef.g:528:8: lv_sentMessages_14_0= ruleMessage
                            	    {

                            	    								newCompositeNode(grammarAccess.getMessageTransitionAccess().getSentMessagesMessageParserRuleCall_2_4_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_14);
                            	    lv_sentMessages_14_0=ruleMessage();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMessageTransitionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"sentMessages",
                            	    									lv_sentMessages_14_0,
                            	    									"nl.sudohenk.xtext.StateDef.Message");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop12;
                                }
                            } while (true);

                            otherlv_15=(Token)match(input,18,FOLLOW_16); 

                            						newLeafNode(otherlv_15, grammarAccess.getMessageTransitionAccess().getRightCurlyBracketKeyword_2_4_2_2());
                            					

                            }


                            }
                            break;

                    }

                    // InternalStateDef.g:551:4: (otherlv_16= 'go' ( (lv_nextState_17_0= ruleState ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==26) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalStateDef.g:552:5: otherlv_16= 'go' ( (lv_nextState_17_0= ruleState ) )
                            {
                            otherlv_16=(Token)match(input,26,FOLLOW_6); 

                            					newLeafNode(otherlv_16, grammarAccess.getMessageTransitionAccess().getGoKeyword_2_5_0());
                            				
                            // InternalStateDef.g:556:5: ( (lv_nextState_17_0= ruleState ) )
                            // InternalStateDef.g:557:6: (lv_nextState_17_0= ruleState )
                            {
                            // InternalStateDef.g:557:6: (lv_nextState_17_0= ruleState )
                            // InternalStateDef.g:558:7: lv_nextState_17_0= ruleState
                            {

                            							newCompositeNode(grammarAccess.getMessageTransitionAccess().getNextStateStateParserRuleCall_2_5_1_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_nextState_17_0=ruleState();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMessageTransitionRule());
                            							}
                            							set(
                            								current,
                            								"nextState",
                            								lv_nextState_17_0,
                            								"nl.sudohenk.xtext.StateDef.State");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getMessageTransitionAccess().getRightCurlyBracketKeyword_2_6());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageTransition"


    // $ANTLR start "entryRuleMessage"
    // InternalStateDef.g:585:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalStateDef.g:585:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalStateDef.g:586:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalStateDef.g:592:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'struct' (otherlv_3= '{' ( (lv_structEntries_4_0= ruleMessageStructEntry ) )+ otherlv_5= '}' ) )? ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_structEntries_4_0 = null;



        	enterRule();

        try {
            // InternalStateDef.g:598:2: ( (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'struct' (otherlv_3= '{' ( (lv_structEntries_4_0= ruleMessageStructEntry ) )+ otherlv_5= '}' ) )? ) )
            // InternalStateDef.g:599:2: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'struct' (otherlv_3= '{' ( (lv_structEntries_4_0= ruleMessageStructEntry ) )+ otherlv_5= '}' ) )? )
            {
            // InternalStateDef.g:599:2: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'struct' (otherlv_3= '{' ( (lv_structEntries_4_0= ruleMessageStructEntry ) )+ otherlv_5= '}' ) )? )
            // InternalStateDef.g:600:3: otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'struct' (otherlv_3= '{' ( (lv_structEntries_4_0= ruleMessageStructEntry ) )+ otherlv_5= '}' ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
            		
            // InternalStateDef.g:604:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateDef.g:605:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateDef.g:605:4: (lv_name_1_0= RULE_ID )
            // InternalStateDef.g:606:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateDef.g:622:3: (otherlv_2= 'struct' (otherlv_3= '{' ( (lv_structEntries_4_0= ruleMessageStructEntry ) )+ otherlv_5= '}' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==15) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalStateDef.g:623:4: otherlv_2= 'struct' (otherlv_3= '{' ( (lv_structEntries_4_0= ruleMessageStructEntry ) )+ otherlv_5= '}' )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getStructKeyword_2_0());
                    			
                    // InternalStateDef.g:627:4: (otherlv_3= '{' ( (lv_structEntries_4_0= ruleMessageStructEntry ) )+ otherlv_5= '}' )
                    // InternalStateDef.g:628:5: otherlv_3= '{' ( (lv_structEntries_4_0= ruleMessageStructEntry ) )+ otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_18); 

                    					newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalStateDef.g:632:5: ( (lv_structEntries_4_0= ruleMessageStructEntry ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_DATATYPE)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalStateDef.g:633:6: (lv_structEntries_4_0= ruleMessageStructEntry )
                    	    {
                    	    // InternalStateDef.g:633:6: (lv_structEntries_4_0= ruleMessageStructEntry )
                    	    // InternalStateDef.g:634:7: lv_structEntries_4_0= ruleMessageStructEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getMessageAccess().getStructEntriesMessageStructEntryParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_structEntries_4_0=ruleMessageStructEntry();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMessageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"structEntries",
                    	    								lv_structEntries_4_0,
                    	    								"nl.sudohenk.xtext.StateDef.MessageStructEntry");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_2_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMessageStruct"
    // InternalStateDef.g:661:1: entryRuleMessageStruct returns [EObject current=null] : iv_ruleMessageStruct= ruleMessageStruct EOF ;
    public final EObject entryRuleMessageStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageStruct = null;


        try {
            // InternalStateDef.g:661:54: (iv_ruleMessageStruct= ruleMessageStruct EOF )
            // InternalStateDef.g:662:2: iv_ruleMessageStruct= ruleMessageStruct EOF
            {
             newCompositeNode(grammarAccess.getMessageStructRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageStruct=ruleMessageStruct();

            state._fsp--;

             current =iv_ruleMessageStruct; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageStruct"


    // $ANTLR start "ruleMessageStruct"
    // InternalStateDef.g:668:1: ruleMessageStruct returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_structEntries_3_0= ruleMessageStructEntry ) )* otherlv_4= '}' )? ) ;
    public final EObject ruleMessageStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_structEntries_3_0 = null;



        	enterRule();

        try {
            // InternalStateDef.g:674:2: ( (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_structEntries_3_0= ruleMessageStructEntry ) )* otherlv_4= '}' )? ) )
            // InternalStateDef.g:675:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_structEntries_3_0= ruleMessageStructEntry ) )* otherlv_4= '}' )? )
            {
            // InternalStateDef.g:675:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_structEntries_3_0= ruleMessageStructEntry ) )* otherlv_4= '}' )? )
            // InternalStateDef.g:676:3: otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_structEntries_3_0= ruleMessageStructEntry ) )* otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageStructAccess().getStructKeyword_0());
            		
            // InternalStateDef.g:680:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateDef.g:681:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateDef.g:681:4: (lv_name_1_0= RULE_ID )
            // InternalStateDef.g:682:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMessageStructAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageStructRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateDef.g:698:3: (otherlv_2= '{' ( (lv_structEntries_3_0= ruleMessageStructEntry ) )* otherlv_4= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalStateDef.g:699:4: otherlv_2= '{' ( (lv_structEntries_3_0= ruleMessageStructEntry ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getMessageStructAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalStateDef.g:703:4: ( (lv_structEntries_3_0= ruleMessageStructEntry ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_DATATYPE)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalStateDef.g:704:5: (lv_structEntries_3_0= ruleMessageStructEntry )
                    	    {
                    	    // InternalStateDef.g:704:5: (lv_structEntries_3_0= ruleMessageStructEntry )
                    	    // InternalStateDef.g:705:6: lv_structEntries_3_0= ruleMessageStructEntry
                    	    {

                    	    						newCompositeNode(grammarAccess.getMessageStructAccess().getStructEntriesMessageStructEntryParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_structEntries_3_0=ruleMessageStructEntry();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMessageStructRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"structEntries",
                    	    							lv_structEntries_3_0,
                    	    							"nl.sudohenk.xtext.StateDef.MessageStructEntry");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getMessageStructAccess().getRightCurlyBracketKeyword_2_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageStruct"


    // $ANTLR start "entryRuleMessageStructEntry"
    // InternalStateDef.g:731:1: entryRuleMessageStructEntry returns [EObject current=null] : iv_ruleMessageStructEntry= ruleMessageStructEntry EOF ;
    public final EObject entryRuleMessageStructEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageStructEntry = null;


        try {
            // InternalStateDef.g:731:59: (iv_ruleMessageStructEntry= ruleMessageStructEntry EOF )
            // InternalStateDef.g:732:2: iv_ruleMessageStructEntry= ruleMessageStructEntry EOF
            {
             newCompositeNode(grammarAccess.getMessageStructEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageStructEntry=ruleMessageStructEntry();

            state._fsp--;

             current =iv_ruleMessageStructEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageStructEntry"


    // $ANTLR start "ruleMessageStructEntry"
    // InternalStateDef.g:738:1: ruleMessageStructEntry returns [EObject current=null] : ( ( ( (lv_dataType_0_0= RULE_DATATYPE ) ) | ( (lv_refType_1_0= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ENUMNAME ) ) ( ( (lv_byteRange_3_0= ruleMessageByteRange ) ) | ( (lv_byteSize_4_0= ruleMessageByteArray ) ) )? (otherlv_5= '=' ( ( (lv_dataAssignment_6_0= ruleMessageStructureDatatype ) ) (otherlv_7= ',' )? )+ )? otherlv_8= ';' ) ;
    public final EObject ruleMessageStructEntry() throws RecognitionException {
        EObject current = null;

        Token lv_dataType_0_0=null;
        Token lv_refType_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_byteRange_3_0 = null;

        EObject lv_byteSize_4_0 = null;

        EObject lv_dataAssignment_6_0 = null;



        	enterRule();

        try {
            // InternalStateDef.g:744:2: ( ( ( ( (lv_dataType_0_0= RULE_DATATYPE ) ) | ( (lv_refType_1_0= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ENUMNAME ) ) ( ( (lv_byteRange_3_0= ruleMessageByteRange ) ) | ( (lv_byteSize_4_0= ruleMessageByteArray ) ) )? (otherlv_5= '=' ( ( (lv_dataAssignment_6_0= ruleMessageStructureDatatype ) ) (otherlv_7= ',' )? )+ )? otherlv_8= ';' ) )
            // InternalStateDef.g:745:2: ( ( ( (lv_dataType_0_0= RULE_DATATYPE ) ) | ( (lv_refType_1_0= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ENUMNAME ) ) ( ( (lv_byteRange_3_0= ruleMessageByteRange ) ) | ( (lv_byteSize_4_0= ruleMessageByteArray ) ) )? (otherlv_5= '=' ( ( (lv_dataAssignment_6_0= ruleMessageStructureDatatype ) ) (otherlv_7= ',' )? )+ )? otherlv_8= ';' )
            {
            // InternalStateDef.g:745:2: ( ( ( (lv_dataType_0_0= RULE_DATATYPE ) ) | ( (lv_refType_1_0= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ENUMNAME ) ) ( ( (lv_byteRange_3_0= ruleMessageByteRange ) ) | ( (lv_byteSize_4_0= ruleMessageByteArray ) ) )? (otherlv_5= '=' ( ( (lv_dataAssignment_6_0= ruleMessageStructureDatatype ) ) (otherlv_7= ',' )? )+ )? otherlv_8= ';' )
            // InternalStateDef.g:746:3: ( ( (lv_dataType_0_0= RULE_DATATYPE ) ) | ( (lv_refType_1_0= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ENUMNAME ) ) ( ( (lv_byteRange_3_0= ruleMessageByteRange ) ) | ( (lv_byteSize_4_0= ruleMessageByteArray ) ) )? (otherlv_5= '=' ( ( (lv_dataAssignment_6_0= ruleMessageStructureDatatype ) ) (otherlv_7= ',' )? )+ )? otherlv_8= ';'
            {
            // InternalStateDef.g:746:3: ( ( (lv_dataType_0_0= RULE_DATATYPE ) ) | ( (lv_refType_1_0= RULE_ID ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DATATYPE) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalStateDef.g:747:4: ( (lv_dataType_0_0= RULE_DATATYPE ) )
                    {
                    // InternalStateDef.g:747:4: ( (lv_dataType_0_0= RULE_DATATYPE ) )
                    // InternalStateDef.g:748:5: (lv_dataType_0_0= RULE_DATATYPE )
                    {
                    // InternalStateDef.g:748:5: (lv_dataType_0_0= RULE_DATATYPE )
                    // InternalStateDef.g:749:6: lv_dataType_0_0= RULE_DATATYPE
                    {
                    lv_dataType_0_0=(Token)match(input,RULE_DATATYPE,FOLLOW_20); 

                    						newLeafNode(lv_dataType_0_0, grammarAccess.getMessageStructEntryAccess().getDataTypeDATATYPETerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageStructEntryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"dataType",
                    							lv_dataType_0_0,
                    							"nl.sudohenk.xtext.StateDef.DATATYPE");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateDef.g:766:4: ( (lv_refType_1_0= RULE_ID ) )
                    {
                    // InternalStateDef.g:766:4: ( (lv_refType_1_0= RULE_ID ) )
                    // InternalStateDef.g:767:5: (lv_refType_1_0= RULE_ID )
                    {
                    // InternalStateDef.g:767:5: (lv_refType_1_0= RULE_ID )
                    // InternalStateDef.g:768:6: lv_refType_1_0= RULE_ID
                    {
                    lv_refType_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(lv_refType_1_0, grammarAccess.getMessageStructEntryAccess().getRefTypeIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageStructEntryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"refType",
                    							lv_refType_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStateDef.g:785:3: ( (lv_name_2_0= RULE_ENUMNAME ) )
            // InternalStateDef.g:786:4: (lv_name_2_0= RULE_ENUMNAME )
            {
            // InternalStateDef.g:786:4: (lv_name_2_0= RULE_ENUMNAME )
            // InternalStateDef.g:787:5: lv_name_2_0= RULE_ENUMNAME
            {
            lv_name_2_0=(Token)match(input,RULE_ENUMNAME,FOLLOW_21); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMessageStructEntryAccess().getNameENUMNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageStructEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"nl.sudohenk.xtext.StateDef.ENUMNAME");
            				

            }


            }

            // InternalStateDef.g:803:3: ( ( (lv_byteRange_3_0= ruleMessageByteRange ) ) | ( (lv_byteSize_4_0= ruleMessageByteArray ) ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            else if ( (LA21_0==35) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // InternalStateDef.g:804:4: ( (lv_byteRange_3_0= ruleMessageByteRange ) )
                    {
                    // InternalStateDef.g:804:4: ( (lv_byteRange_3_0= ruleMessageByteRange ) )
                    // InternalStateDef.g:805:5: (lv_byteRange_3_0= ruleMessageByteRange )
                    {
                    // InternalStateDef.g:805:5: (lv_byteRange_3_0= ruleMessageByteRange )
                    // InternalStateDef.g:806:6: lv_byteRange_3_0= ruleMessageByteRange
                    {

                    						newCompositeNode(grammarAccess.getMessageStructEntryAccess().getByteRangeMessageByteRangeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_byteRange_3_0=ruleMessageByteRange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageStructEntryRule());
                    						}
                    						set(
                    							current,
                    							"byteRange",
                    							lv_byteRange_3_0,
                    							"nl.sudohenk.xtext.StateDef.MessageByteRange");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateDef.g:824:4: ( (lv_byteSize_4_0= ruleMessageByteArray ) )
                    {
                    // InternalStateDef.g:824:4: ( (lv_byteSize_4_0= ruleMessageByteArray ) )
                    // InternalStateDef.g:825:5: (lv_byteSize_4_0= ruleMessageByteArray )
                    {
                    // InternalStateDef.g:825:5: (lv_byteSize_4_0= ruleMessageByteArray )
                    // InternalStateDef.g:826:6: lv_byteSize_4_0= ruleMessageByteArray
                    {

                    						newCompositeNode(grammarAccess.getMessageStructEntryAccess().getByteSizeMessageByteArrayParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_byteSize_4_0=ruleMessageByteArray();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageStructEntryRule());
                    						}
                    						set(
                    							current,
                    							"byteSize",
                    							lv_byteSize_4_0,
                    							"nl.sudohenk.xtext.StateDef.MessageByteArray");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStateDef.g:844:3: (otherlv_5= '=' ( ( (lv_dataAssignment_6_0= ruleMessageStructureDatatype ) ) (otherlv_7= ',' )? )+ )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalStateDef.g:845:4: otherlv_5= '=' ( ( (lv_dataAssignment_6_0= ruleMessageStructureDatatype ) ) (otherlv_7= ',' )? )+
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getMessageStructEntryAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalStateDef.g:849:4: ( ( (lv_dataAssignment_6_0= ruleMessageStructureDatatype ) ) (otherlv_7= ',' )? )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ENUMNAME||LA23_0==RULE_HEX||LA23_0==15||LA23_0==35) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalStateDef.g:850:5: ( (lv_dataAssignment_6_0= ruleMessageStructureDatatype ) ) (otherlv_7= ',' )?
                    	    {
                    	    // InternalStateDef.g:850:5: ( (lv_dataAssignment_6_0= ruleMessageStructureDatatype ) )
                    	    // InternalStateDef.g:851:6: (lv_dataAssignment_6_0= ruleMessageStructureDatatype )
                    	    {
                    	    // InternalStateDef.g:851:6: (lv_dataAssignment_6_0= ruleMessageStructureDatatype )
                    	    // InternalStateDef.g:852:7: lv_dataAssignment_6_0= ruleMessageStructureDatatype
                    	    {

                    	    							newCompositeNode(grammarAccess.getMessageStructEntryAccess().getDataAssignmentMessageStructureDatatypeParserRuleCall_3_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_dataAssignment_6_0=ruleMessageStructureDatatype();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMessageStructEntryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dataAssignment",
                    	    								lv_dataAssignment_6_0,
                    	    								"nl.sudohenk.xtext.StateDef.MessageStructureDatatype");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalStateDef.g:869:5: (otherlv_7= ',' )?
                    	    int alt22=2;
                    	    int LA22_0 = input.LA(1);

                    	    if ( (LA22_0==30) ) {
                    	        alt22=1;
                    	    }
                    	    switch (alt22) {
                    	        case 1 :
                    	            // InternalStateDef.g:870:6: otherlv_7= ','
                    	            {
                    	            otherlv_7=(Token)match(input,30,FOLLOW_25); 

                    	            						newLeafNode(otherlv_7, grammarAccess.getMessageStructEntryAccess().getCommaKeyword_3_1_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMessageStructEntryAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageStructEntry"


    // $ANTLR start "entryRuleMessageByteRange"
    // InternalStateDef.g:885:1: entryRuleMessageByteRange returns [EObject current=null] : iv_ruleMessageByteRange= ruleMessageByteRange EOF ;
    public final EObject entryRuleMessageByteRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageByteRange = null;


        try {
            // InternalStateDef.g:885:57: (iv_ruleMessageByteRange= ruleMessageByteRange EOF )
            // InternalStateDef.g:886:2: iv_ruleMessageByteRange= ruleMessageByteRange EOF
            {
             newCompositeNode(grammarAccess.getMessageByteRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageByteRange=ruleMessageByteRange();

            state._fsp--;

             current =iv_ruleMessageByteRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageByteRange"


    // $ANTLR start "ruleMessageByteRange"
    // InternalStateDef.g:892:1: ruleMessageByteRange returns [EObject current=null] : (otherlv_0= '<' ( (lv_start_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) otherlv_4= '>' ) ;
    public final EObject ruleMessageByteRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_start_1_0=null;
        Token otherlv_2=null;
        Token lv_end_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStateDef.g:898:2: ( (otherlv_0= '<' ( (lv_start_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) otherlv_4= '>' ) )
            // InternalStateDef.g:899:2: (otherlv_0= '<' ( (lv_start_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) otherlv_4= '>' )
            {
            // InternalStateDef.g:899:2: (otherlv_0= '<' ( (lv_start_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) otherlv_4= '>' )
            // InternalStateDef.g:900:3: otherlv_0= '<' ( (lv_start_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageByteRangeAccess().getLessThanSignKeyword_0());
            		
            // InternalStateDef.g:904:3: ( (lv_start_1_0= RULE_INT ) )
            // InternalStateDef.g:905:4: (lv_start_1_0= RULE_INT )
            {
            // InternalStateDef.g:905:4: (lv_start_1_0= RULE_INT )
            // InternalStateDef.g:906:5: lv_start_1_0= RULE_INT
            {
            lv_start_1_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_start_1_0, grammarAccess.getMessageByteRangeAccess().getStartINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageByteRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getMessageByteRangeAccess().getFullStopFullStopKeyword_2());
            		
            // InternalStateDef.g:926:3: ( (lv_end_3_0= RULE_INT ) )
            // InternalStateDef.g:927:4: (lv_end_3_0= RULE_INT )
            {
            // InternalStateDef.g:927:4: (lv_end_3_0= RULE_INT )
            // InternalStateDef.g:928:5: lv_end_3_0= RULE_INT
            {
            lv_end_3_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_end_3_0, grammarAccess.getMessageByteRangeAccess().getEndINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageByteRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMessageByteRangeAccess().getGreaterThanSignKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageByteRange"


    // $ANTLR start "entryRuleMessageByteArray"
    // InternalStateDef.g:952:1: entryRuleMessageByteArray returns [EObject current=null] : iv_ruleMessageByteArray= ruleMessageByteArray EOF ;
    public final EObject entryRuleMessageByteArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageByteArray = null;


        try {
            // InternalStateDef.g:952:57: (iv_ruleMessageByteArray= ruleMessageByteArray EOF )
            // InternalStateDef.g:953:2: iv_ruleMessageByteArray= ruleMessageByteArray EOF
            {
             newCompositeNode(grammarAccess.getMessageByteArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageByteArray=ruleMessageByteArray();

            state._fsp--;

             current =iv_ruleMessageByteArray; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageByteArray"


    // $ANTLR start "ruleMessageByteArray"
    // InternalStateDef.g:959:1: ruleMessageByteArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_size_1_0= RULE_INT ) ) otherlv_2= ']' ) ;
    public final EObject ruleMessageByteArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_size_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStateDef.g:965:2: ( (otherlv_0= '[' ( (lv_size_1_0= RULE_INT ) ) otherlv_2= ']' ) )
            // InternalStateDef.g:966:2: (otherlv_0= '[' ( (lv_size_1_0= RULE_INT ) ) otherlv_2= ']' )
            {
            // InternalStateDef.g:966:2: (otherlv_0= '[' ( (lv_size_1_0= RULE_INT ) ) otherlv_2= ']' )
            // InternalStateDef.g:967:3: otherlv_0= '[' ( (lv_size_1_0= RULE_INT ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageByteArrayAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalStateDef.g:971:3: ( (lv_size_1_0= RULE_INT ) )
            // InternalStateDef.g:972:4: (lv_size_1_0= RULE_INT )
            {
            // InternalStateDef.g:972:4: (lv_size_1_0= RULE_INT )
            // InternalStateDef.g:973:5: lv_size_1_0= RULE_INT
            {
            lv_size_1_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_size_1_0, grammarAccess.getMessageByteArrayAccess().getSizeINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageByteArrayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMessageByteArrayAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageByteArray"


    // $ANTLR start "entryRuleMessageStructureStruct"
    // InternalStateDef.g:997:1: entryRuleMessageStructureStruct returns [EObject current=null] : iv_ruleMessageStructureStruct= ruleMessageStructureStruct EOF ;
    public final EObject entryRuleMessageStructureStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageStructureStruct = null;


        try {
            // InternalStateDef.g:997:63: (iv_ruleMessageStructureStruct= ruleMessageStructureStruct EOF )
            // InternalStateDef.g:998:2: iv_ruleMessageStructureStruct= ruleMessageStructureStruct EOF
            {
             newCompositeNode(grammarAccess.getMessageStructureStructRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageStructureStruct=ruleMessageStructureStruct();

            state._fsp--;

             current =iv_ruleMessageStructureStruct; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageStructureStruct"


    // $ANTLR start "ruleMessageStructureStruct"
    // InternalStateDef.g:1004:1: ruleMessageStructureStruct returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_values_1_0= ruleMessageStructureDatatype ) ) (otherlv_2= ',' )? )+ otherlv_3= '}' ) ;
    public final EObject ruleMessageStructureStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_values_1_0 = null;



        	enterRule();

        try {
            // InternalStateDef.g:1010:2: ( (otherlv_0= '{' ( ( (lv_values_1_0= ruleMessageStructureDatatype ) ) (otherlv_2= ',' )? )+ otherlv_3= '}' ) )
            // InternalStateDef.g:1011:2: (otherlv_0= '{' ( ( (lv_values_1_0= ruleMessageStructureDatatype ) ) (otherlv_2= ',' )? )+ otherlv_3= '}' )
            {
            // InternalStateDef.g:1011:2: (otherlv_0= '{' ( ( (lv_values_1_0= ruleMessageStructureDatatype ) ) (otherlv_2= ',' )? )+ otherlv_3= '}' )
            // InternalStateDef.g:1012:3: otherlv_0= '{' ( ( (lv_values_1_0= ruleMessageStructureDatatype ) ) (otherlv_2= ',' )? )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageStructureStructAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalStateDef.g:1016:3: ( ( (lv_values_1_0= ruleMessageStructureDatatype ) ) (otherlv_2= ',' )? )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ENUMNAME||LA26_0==RULE_HEX||LA26_0==15||LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalStateDef.g:1017:4: ( (lv_values_1_0= ruleMessageStructureDatatype ) ) (otherlv_2= ',' )?
            	    {
            	    // InternalStateDef.g:1017:4: ( (lv_values_1_0= ruleMessageStructureDatatype ) )
            	    // InternalStateDef.g:1018:5: (lv_values_1_0= ruleMessageStructureDatatype )
            	    {
            	    // InternalStateDef.g:1018:5: (lv_values_1_0= ruleMessageStructureDatatype )
            	    // InternalStateDef.g:1019:6: lv_values_1_0= ruleMessageStructureDatatype
            	    {

            	    						newCompositeNode(grammarAccess.getMessageStructureStructAccess().getValuesMessageStructureDatatypeParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_values_1_0=ruleMessageStructureDatatype();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMessageStructureStructRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_1_0,
            	    							"nl.sudohenk.xtext.StateDef.MessageStructureDatatype");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalStateDef.g:1036:4: (otherlv_2= ',' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==30) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalStateDef.g:1037:5: otherlv_2= ','
            	            {
            	            otherlv_2=(Token)match(input,30,FOLLOW_31); 

            	            					newLeafNode(otherlv_2, grammarAccess.getMessageStructureStructAccess().getCommaKeyword_1_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageStructureStructAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageStructureStruct"


    // $ANTLR start "entryRuleMessageStructureDatatype"
    // InternalStateDef.g:1051:1: entryRuleMessageStructureDatatype returns [EObject current=null] : iv_ruleMessageStructureDatatype= ruleMessageStructureDatatype EOF ;
    public final EObject entryRuleMessageStructureDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageStructureDatatype = null;


        try {
            // InternalStateDef.g:1051:65: (iv_ruleMessageStructureDatatype= ruleMessageStructureDatatype EOF )
            // InternalStateDef.g:1052:2: iv_ruleMessageStructureDatatype= ruleMessageStructureDatatype EOF
            {
             newCompositeNode(grammarAccess.getMessageStructureDatatypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageStructureDatatype=ruleMessageStructureDatatype();

            state._fsp--;

             current =iv_ruleMessageStructureDatatype; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageStructureDatatype"


    // $ANTLR start "ruleMessageStructureDatatype"
    // InternalStateDef.g:1058:1: ruleMessageStructureDatatype returns [EObject current=null] : ( ( (lv_hexVal_0_0= RULE_HEX ) ) | ( (lv_enumVal_1_0= RULE_ENUMNAME ) ) | ( (lv_structVal_2_0= ruleMessageStructureStruct ) ) | (otherlv_3= '[' ( ( (lv_arrayVal_4_0= ruleMessageStructureDatatype ) ) (otherlv_5= ',' )? )+ otherlv_6= ']' ) ) ;
    public final EObject ruleMessageStructureDatatype() throws RecognitionException {
        EObject current = null;

        Token lv_hexVal_0_0=null;
        Token lv_enumVal_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_structVal_2_0 = null;

        EObject lv_arrayVal_4_0 = null;



        	enterRule();

        try {
            // InternalStateDef.g:1064:2: ( ( ( (lv_hexVal_0_0= RULE_HEX ) ) | ( (lv_enumVal_1_0= RULE_ENUMNAME ) ) | ( (lv_structVal_2_0= ruleMessageStructureStruct ) ) | (otherlv_3= '[' ( ( (lv_arrayVal_4_0= ruleMessageStructureDatatype ) ) (otherlv_5= ',' )? )+ otherlv_6= ']' ) ) )
            // InternalStateDef.g:1065:2: ( ( (lv_hexVal_0_0= RULE_HEX ) ) | ( (lv_enumVal_1_0= RULE_ENUMNAME ) ) | ( (lv_structVal_2_0= ruleMessageStructureStruct ) ) | (otherlv_3= '[' ( ( (lv_arrayVal_4_0= ruleMessageStructureDatatype ) ) (otherlv_5= ',' )? )+ otherlv_6= ']' ) )
            {
            // InternalStateDef.g:1065:2: ( ( (lv_hexVal_0_0= RULE_HEX ) ) | ( (lv_enumVal_1_0= RULE_ENUMNAME ) ) | ( (lv_structVal_2_0= ruleMessageStructureStruct ) ) | (otherlv_3= '[' ( ( (lv_arrayVal_4_0= ruleMessageStructureDatatype ) ) (otherlv_5= ',' )? )+ otherlv_6= ']' ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case RULE_HEX:
                {
                alt29=1;
                }
                break;
            case RULE_ENUMNAME:
                {
                alt29=2;
                }
                break;
            case 15:
                {
                alt29=3;
                }
                break;
            case 35:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalStateDef.g:1066:3: ( (lv_hexVal_0_0= RULE_HEX ) )
                    {
                    // InternalStateDef.g:1066:3: ( (lv_hexVal_0_0= RULE_HEX ) )
                    // InternalStateDef.g:1067:4: (lv_hexVal_0_0= RULE_HEX )
                    {
                    // InternalStateDef.g:1067:4: (lv_hexVal_0_0= RULE_HEX )
                    // InternalStateDef.g:1068:5: lv_hexVal_0_0= RULE_HEX
                    {
                    lv_hexVal_0_0=(Token)match(input,RULE_HEX,FOLLOW_2); 

                    					newLeafNode(lv_hexVal_0_0, grammarAccess.getMessageStructureDatatypeAccess().getHexValHEXTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageStructureDatatypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"hexVal",
                    						lv_hexVal_0_0,
                    						"nl.sudohenk.xtext.StateDef.HEX");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateDef.g:1085:3: ( (lv_enumVal_1_0= RULE_ENUMNAME ) )
                    {
                    // InternalStateDef.g:1085:3: ( (lv_enumVal_1_0= RULE_ENUMNAME ) )
                    // InternalStateDef.g:1086:4: (lv_enumVal_1_0= RULE_ENUMNAME )
                    {
                    // InternalStateDef.g:1086:4: (lv_enumVal_1_0= RULE_ENUMNAME )
                    // InternalStateDef.g:1087:5: lv_enumVal_1_0= RULE_ENUMNAME
                    {
                    lv_enumVal_1_0=(Token)match(input,RULE_ENUMNAME,FOLLOW_2); 

                    					newLeafNode(lv_enumVal_1_0, grammarAccess.getMessageStructureDatatypeAccess().getEnumValENUMNAMETerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageStructureDatatypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"enumVal",
                    						lv_enumVal_1_0,
                    						"nl.sudohenk.xtext.StateDef.ENUMNAME");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalStateDef.g:1104:3: ( (lv_structVal_2_0= ruleMessageStructureStruct ) )
                    {
                    // InternalStateDef.g:1104:3: ( (lv_structVal_2_0= ruleMessageStructureStruct ) )
                    // InternalStateDef.g:1105:4: (lv_structVal_2_0= ruleMessageStructureStruct )
                    {
                    // InternalStateDef.g:1105:4: (lv_structVal_2_0= ruleMessageStructureStruct )
                    // InternalStateDef.g:1106:5: lv_structVal_2_0= ruleMessageStructureStruct
                    {

                    					newCompositeNode(grammarAccess.getMessageStructureDatatypeAccess().getStructValMessageStructureStructParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_structVal_2_0=ruleMessageStructureStruct();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMessageStructureDatatypeRule());
                    					}
                    					set(
                    						current,
                    						"structVal",
                    						lv_structVal_2_0,
                    						"nl.sudohenk.xtext.StateDef.MessageStructureStruct");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalStateDef.g:1124:3: (otherlv_3= '[' ( ( (lv_arrayVal_4_0= ruleMessageStructureDatatype ) ) (otherlv_5= ',' )? )+ otherlv_6= ']' )
                    {
                    // InternalStateDef.g:1124:3: (otherlv_3= '[' ( ( (lv_arrayVal_4_0= ruleMessageStructureDatatype ) ) (otherlv_5= ',' )? )+ otherlv_6= ']' )
                    // InternalStateDef.g:1125:4: otherlv_3= '[' ( ( (lv_arrayVal_4_0= ruleMessageStructureDatatype ) ) (otherlv_5= ',' )? )+ otherlv_6= ']'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getMessageStructureDatatypeAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalStateDef.g:1129:4: ( ( (lv_arrayVal_4_0= ruleMessageStructureDatatype ) ) (otherlv_5= ',' )? )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_ENUMNAME||LA28_0==RULE_HEX||LA28_0==15||LA28_0==35) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalStateDef.g:1130:5: ( (lv_arrayVal_4_0= ruleMessageStructureDatatype ) ) (otherlv_5= ',' )?
                    	    {
                    	    // InternalStateDef.g:1130:5: ( (lv_arrayVal_4_0= ruleMessageStructureDatatype ) )
                    	    // InternalStateDef.g:1131:6: (lv_arrayVal_4_0= ruleMessageStructureDatatype )
                    	    {
                    	    // InternalStateDef.g:1131:6: (lv_arrayVal_4_0= ruleMessageStructureDatatype )
                    	    // InternalStateDef.g:1132:7: lv_arrayVal_4_0= ruleMessageStructureDatatype
                    	    {

                    	    							newCompositeNode(grammarAccess.getMessageStructureDatatypeAccess().getArrayValMessageStructureDatatypeParserRuleCall_3_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_arrayVal_4_0=ruleMessageStructureDatatype();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMessageStructureDatatypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arrayVal",
                    	    								lv_arrayVal_4_0,
                    	    								"nl.sudohenk.xtext.StateDef.MessageStructureDatatype");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalStateDef.g:1149:5: (otherlv_5= ',' )?
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==30) ) {
                    	        alt27=1;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // InternalStateDef.g:1150:6: otherlv_5= ','
                    	            {
                    	            otherlv_5=(Token)match(input,30,FOLLOW_33); 

                    	            						newLeafNode(otherlv_5, grammarAccess.getMessageStructureDatatypeAccess().getCommaKeyword_3_1_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    otherlv_6=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getMessageStructureDatatypeAccess().getRightSquareBracketKeyword_3_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageStructureDatatype"


    // $ANTLR start "entryRuleMessageEnum"
    // InternalStateDef.g:1165:1: entryRuleMessageEnum returns [EObject current=null] : iv_ruleMessageEnum= ruleMessageEnum EOF ;
    public final EObject entryRuleMessageEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageEnum = null;


        try {
            // InternalStateDef.g:1165:52: (iv_ruleMessageEnum= ruleMessageEnum EOF )
            // InternalStateDef.g:1166:2: iv_ruleMessageEnum= ruleMessageEnum EOF
            {
             newCompositeNode(grammarAccess.getMessageEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageEnum=ruleMessageEnum();

            state._fsp--;

             current =iv_ruleMessageEnum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageEnum"


    // $ANTLR start "ruleMessageEnum"
    // InternalStateDef.g:1172:1: ruleMessageEnum returns [EObject current=null] : ( (otherlv_0= 'enum' )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_names_3_0= RULE_ENUMNAME ) ) otherlv_4= '(' ( (lv_values_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= ',' )? )+ otherlv_8= '}' )? ) ;
    public final EObject ruleMessageEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_names_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalStateDef.g:1178:2: ( ( (otherlv_0= 'enum' )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_names_3_0= RULE_ENUMNAME ) ) otherlv_4= '(' ( (lv_values_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= ',' )? )+ otherlv_8= '}' )? ) )
            // InternalStateDef.g:1179:2: ( (otherlv_0= 'enum' )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_names_3_0= RULE_ENUMNAME ) ) otherlv_4= '(' ( (lv_values_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= ',' )? )+ otherlv_8= '}' )? )
            {
            // InternalStateDef.g:1179:2: ( (otherlv_0= 'enum' )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_names_3_0= RULE_ENUMNAME ) ) otherlv_4= '(' ( (lv_values_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= ',' )? )+ otherlv_8= '}' )? )
            // InternalStateDef.g:1180:3: (otherlv_0= 'enum' )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_names_3_0= RULE_ENUMNAME ) ) otherlv_4= '(' ( (lv_values_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= ',' )? )+ otherlv_8= '}' )?
            {
            // InternalStateDef.g:1180:3: (otherlv_0= 'enum' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalStateDef.g:1181:4: otherlv_0= 'enum'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getMessageEnumAccess().getEnumKeyword_0());
                    			

                    }
                    break;

            }

            // InternalStateDef.g:1186:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateDef.g:1187:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateDef.g:1187:4: (lv_name_1_0= RULE_ID )
            // InternalStateDef.g:1188:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMessageEnumAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageEnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateDef.g:1204:3: (otherlv_2= '{' ( ( (lv_names_3_0= RULE_ENUMNAME ) ) otherlv_4= '(' ( (lv_values_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= ',' )? )+ otherlv_8= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==15) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalStateDef.g:1205:4: otherlv_2= '{' ( ( (lv_names_3_0= RULE_ENUMNAME ) ) otherlv_4= '(' ( (lv_values_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= ',' )? )+ otherlv_8= '}'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getMessageEnumAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalStateDef.g:1209:4: ( ( (lv_names_3_0= RULE_ENUMNAME ) ) otherlv_4= '(' ( (lv_values_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= ',' )? )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_ENUMNAME) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalStateDef.g:1210:5: ( (lv_names_3_0= RULE_ENUMNAME ) ) otherlv_4= '(' ( (lv_values_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= ',' )?
                    	    {
                    	    // InternalStateDef.g:1210:5: ( (lv_names_3_0= RULE_ENUMNAME ) )
                    	    // InternalStateDef.g:1211:6: (lv_names_3_0= RULE_ENUMNAME )
                    	    {
                    	    // InternalStateDef.g:1211:6: (lv_names_3_0= RULE_ENUMNAME )
                    	    // InternalStateDef.g:1212:7: lv_names_3_0= RULE_ENUMNAME
                    	    {
                    	    lv_names_3_0=(Token)match(input,RULE_ENUMNAME,FOLLOW_34); 

                    	    							newLeafNode(lv_names_3_0, grammarAccess.getMessageEnumAccess().getNamesENUMNAMETerminalRuleCall_2_1_0_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMessageEnumRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"names",
                    	    								lv_names_3_0,
                    	    								"nl.sudohenk.xtext.StateDef.ENUMNAME");
                    	    						

                    	    }


                    	    }

                    	    otherlv_4=(Token)match(input,38,FOLLOW_26); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMessageEnumAccess().getLeftParenthesisKeyword_2_1_1());
                    	    				
                    	    // InternalStateDef.g:1232:5: ( (lv_values_5_0= RULE_INT ) )
                    	    // InternalStateDef.g:1233:6: (lv_values_5_0= RULE_INT )
                    	    {
                    	    // InternalStateDef.g:1233:6: (lv_values_5_0= RULE_INT )
                    	    // InternalStateDef.g:1234:7: lv_values_5_0= RULE_INT
                    	    {
                    	    lv_values_5_0=(Token)match(input,RULE_INT,FOLLOW_35); 

                    	    							newLeafNode(lv_values_5_0, grammarAccess.getMessageEnumAccess().getValuesINTTerminalRuleCall_2_1_2_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMessageEnumRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"values",
                    	    								lv_values_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.INT");
                    	    						

                    	    }


                    	    }

                    	    otherlv_6=(Token)match(input,39,FOLLOW_36); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getMessageEnumAccess().getRightParenthesisKeyword_2_1_3());
                    	    				
                    	    // InternalStateDef.g:1254:5: (otherlv_7= ',' )?
                    	    int alt31=2;
                    	    int LA31_0 = input.LA(1);

                    	    if ( (LA31_0==30) ) {
                    	        alt31=1;
                    	    }
                    	    switch (alt31) {
                    	        case 1 :
                    	            // InternalStateDef.g:1255:6: otherlv_7= ','
                    	            {
                    	            otherlv_7=(Token)match(input,30,FOLLOW_37); 

                    	            						newLeafNode(otherlv_7, grammarAccess.getMessageEnumAccess().getCommaKeyword_2_1_4());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    otherlv_8=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getMessageEnumAccess().getRightCurlyBracketKeyword_2_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001A8002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002018010010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000006840000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002018040010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000006040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000009A0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800008140L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000008C0008140L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000880008140L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000840048140L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800048140L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001840008140L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001800008140L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040040040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000040040L});

}
