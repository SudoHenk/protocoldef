package nl.sudohenk.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import nl.sudohenk.xtext.services.StateDefGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalStateDefParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DATATYPE", "RULE_ENUMNAME", "RULE_INT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'{'", "'initial'", "'end'", "'}'", "'state'", "'transition'", "'from'", "'received'", "'messages'", "'sent'", "'go'", "'message'", "'struct'", "';'", "'='", "','", "'<'", "'..'", "'>'", "'['", "']'", "'enum'", "'('", "')'", "'any'"
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

    	public void setGrammarAccess(StateDefGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleStateMachine"
    // InternalStateDef.g:53:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // InternalStateDef.g:54:1: ( ruleStateMachine EOF )
            // InternalStateDef.g:55:1: ruleStateMachine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStateMachine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStateDef.g:62:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:66:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // InternalStateDef.g:67:2: ( ( rule__StateMachine__Group__0 ) )
            {
            // InternalStateDef.g:67:2: ( ( rule__StateMachine__Group__0 ) )
            // InternalStateDef.g:68:3: ( rule__StateMachine__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getGroup()); 
            }
            // InternalStateDef.g:69:3: ( rule__StateMachine__Group__0 )
            // InternalStateDef.g:69:4: rule__StateMachine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // InternalStateDef.g:78:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalStateDef.g:79:1: ( ruleState EOF )
            // InternalStateDef.g:80:1: ruleState EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateDef.g:87:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:91:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalStateDef.g:92:2: ( ( rule__State__Group__0 ) )
            {
            // InternalStateDef.g:92:2: ( ( rule__State__Group__0 ) )
            // InternalStateDef.g:93:3: ( rule__State__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getGroup()); 
            }
            // InternalStateDef.g:94:3: ( rule__State__Group__0 )
            // InternalStateDef.g:94:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleMessageTransition"
    // InternalStateDef.g:103:1: entryRuleMessageTransition : ruleMessageTransition EOF ;
    public final void entryRuleMessageTransition() throws RecognitionException {
        try {
            // InternalStateDef.g:104:1: ( ruleMessageTransition EOF )
            // InternalStateDef.g:105:1: ruleMessageTransition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMessageTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageTransition"


    // $ANTLR start "ruleMessageTransition"
    // InternalStateDef.g:112:1: ruleMessageTransition : ( ( rule__MessageTransition__Group__0 ) ) ;
    public final void ruleMessageTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:116:2: ( ( ( rule__MessageTransition__Group__0 ) ) )
            // InternalStateDef.g:117:2: ( ( rule__MessageTransition__Group__0 ) )
            {
            // InternalStateDef.g:117:2: ( ( rule__MessageTransition__Group__0 ) )
            // InternalStateDef.g:118:3: ( rule__MessageTransition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getGroup()); 
            }
            // InternalStateDef.g:119:3: ( rule__MessageTransition__Group__0 )
            // InternalStateDef.g:119:4: rule__MessageTransition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageTransition"


    // $ANTLR start "entryRuleMessage"
    // InternalStateDef.g:128:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalStateDef.g:129:1: ( ruleMessage EOF )
            // InternalStateDef.g:130:1: ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalStateDef.g:137:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:141:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalStateDef.g:142:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalStateDef.g:142:2: ( ( rule__Message__Group__0 ) )
            // InternalStateDef.g:143:3: ( rule__Message__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getGroup()); 
            }
            // InternalStateDef.g:144:3: ( rule__Message__Group__0 )
            // InternalStateDef.g:144:4: rule__Message__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMessageStruct"
    // InternalStateDef.g:153:1: entryRuleMessageStruct : ruleMessageStruct EOF ;
    public final void entryRuleMessageStruct() throws RecognitionException {
        try {
            // InternalStateDef.g:154:1: ( ruleMessageStruct EOF )
            // InternalStateDef.g:155:1: ruleMessageStruct EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMessageStruct();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageStruct"


    // $ANTLR start "ruleMessageStruct"
    // InternalStateDef.g:162:1: ruleMessageStruct : ( ( rule__MessageStruct__Group__0 ) ) ;
    public final void ruleMessageStruct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:166:2: ( ( ( rule__MessageStruct__Group__0 ) ) )
            // InternalStateDef.g:167:2: ( ( rule__MessageStruct__Group__0 ) )
            {
            // InternalStateDef.g:167:2: ( ( rule__MessageStruct__Group__0 ) )
            // InternalStateDef.g:168:3: ( rule__MessageStruct__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructAccess().getGroup()); 
            }
            // InternalStateDef.g:169:3: ( rule__MessageStruct__Group__0 )
            // InternalStateDef.g:169:4: rule__MessageStruct__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageStruct__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageStruct"


    // $ANTLR start "entryRuleMessageStructEntry"
    // InternalStateDef.g:178:1: entryRuleMessageStructEntry : ruleMessageStructEntry EOF ;
    public final void entryRuleMessageStructEntry() throws RecognitionException {
        try {
            // InternalStateDef.g:179:1: ( ruleMessageStructEntry EOF )
            // InternalStateDef.g:180:1: ruleMessageStructEntry EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMessageStructEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageStructEntry"


    // $ANTLR start "ruleMessageStructEntry"
    // InternalStateDef.g:187:1: ruleMessageStructEntry : ( ( rule__MessageStructEntry__Group__0 ) ) ;
    public final void ruleMessageStructEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:191:2: ( ( ( rule__MessageStructEntry__Group__0 ) ) )
            // InternalStateDef.g:192:2: ( ( rule__MessageStructEntry__Group__0 ) )
            {
            // InternalStateDef.g:192:2: ( ( rule__MessageStructEntry__Group__0 ) )
            // InternalStateDef.g:193:3: ( rule__MessageStructEntry__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getGroup()); 
            }
            // InternalStateDef.g:194:3: ( rule__MessageStructEntry__Group__0 )
            // InternalStateDef.g:194:4: rule__MessageStructEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageStructEntry__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageStructEntry"


    // $ANTLR start "entryRuleMessageByteRange"
    // InternalStateDef.g:203:1: entryRuleMessageByteRange : ruleMessageByteRange EOF ;
    public final void entryRuleMessageByteRange() throws RecognitionException {
        try {
            // InternalStateDef.g:204:1: ( ruleMessageByteRange EOF )
            // InternalStateDef.g:205:1: ruleMessageByteRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageByteRangeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMessageByteRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageByteRangeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageByteRange"


    // $ANTLR start "ruleMessageByteRange"
    // InternalStateDef.g:212:1: ruleMessageByteRange : ( ( rule__MessageByteRange__Group__0 ) ) ;
    public final void ruleMessageByteRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:216:2: ( ( ( rule__MessageByteRange__Group__0 ) ) )
            // InternalStateDef.g:217:2: ( ( rule__MessageByteRange__Group__0 ) )
            {
            // InternalStateDef.g:217:2: ( ( rule__MessageByteRange__Group__0 ) )
            // InternalStateDef.g:218:3: ( rule__MessageByteRange__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageByteRangeAccess().getGroup()); 
            }
            // InternalStateDef.g:219:3: ( rule__MessageByteRange__Group__0 )
            // InternalStateDef.g:219:4: rule__MessageByteRange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageByteRange__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageByteRangeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageByteRange"


    // $ANTLR start "entryRuleMessageByteArray"
    // InternalStateDef.g:228:1: entryRuleMessageByteArray : ruleMessageByteArray EOF ;
    public final void entryRuleMessageByteArray() throws RecognitionException {
        try {
            // InternalStateDef.g:229:1: ( ruleMessageByteArray EOF )
            // InternalStateDef.g:230:1: ruleMessageByteArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageByteArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMessageByteArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageByteArrayRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageByteArray"


    // $ANTLR start "ruleMessageByteArray"
    // InternalStateDef.g:237:1: ruleMessageByteArray : ( ( rule__MessageByteArray__Group__0 ) ) ;
    public final void ruleMessageByteArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:241:2: ( ( ( rule__MessageByteArray__Group__0 ) ) )
            // InternalStateDef.g:242:2: ( ( rule__MessageByteArray__Group__0 ) )
            {
            // InternalStateDef.g:242:2: ( ( rule__MessageByteArray__Group__0 ) )
            // InternalStateDef.g:243:3: ( rule__MessageByteArray__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageByteArrayAccess().getGroup()); 
            }
            // InternalStateDef.g:244:3: ( rule__MessageByteArray__Group__0 )
            // InternalStateDef.g:244:4: rule__MessageByteArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageByteArray__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageByteArrayAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageByteArray"


    // $ANTLR start "entryRuleMessageStructureStruct"
    // InternalStateDef.g:253:1: entryRuleMessageStructureStruct : ruleMessageStructureStruct EOF ;
    public final void entryRuleMessageStructureStruct() throws RecognitionException {
        try {
            // InternalStateDef.g:254:1: ( ruleMessageStructureStruct EOF )
            // InternalStateDef.g:255:1: ruleMessageStructureStruct EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureStructRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMessageStructureStruct();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureStructRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageStructureStruct"


    // $ANTLR start "ruleMessageStructureStruct"
    // InternalStateDef.g:262:1: ruleMessageStructureStruct : ( ( rule__MessageStructureStruct__Group__0 ) ) ;
    public final void ruleMessageStructureStruct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:266:2: ( ( ( rule__MessageStructureStruct__Group__0 ) ) )
            // InternalStateDef.g:267:2: ( ( rule__MessageStructureStruct__Group__0 ) )
            {
            // InternalStateDef.g:267:2: ( ( rule__MessageStructureStruct__Group__0 ) )
            // InternalStateDef.g:268:3: ( rule__MessageStructureStruct__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureStructAccess().getGroup()); 
            }
            // InternalStateDef.g:269:3: ( rule__MessageStructureStruct__Group__0 )
            // InternalStateDef.g:269:4: rule__MessageStructureStruct__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageStructureStruct__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureStructAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageStructureStruct"


    // $ANTLR start "entryRuleMessageStructureDatatype"
    // InternalStateDef.g:278:1: entryRuleMessageStructureDatatype : ruleMessageStructureDatatype EOF ;
    public final void entryRuleMessageStructureDatatype() throws RecognitionException {
        try {
            // InternalStateDef.g:279:1: ( ruleMessageStructureDatatype EOF )
            // InternalStateDef.g:280:1: ruleMessageStructureDatatype EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureDatatypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMessageStructureDatatype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureDatatypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageStructureDatatype"


    // $ANTLR start "ruleMessageStructureDatatype"
    // InternalStateDef.g:287:1: ruleMessageStructureDatatype : ( ( rule__MessageStructureDatatype__Alternatives ) ) ;
    public final void ruleMessageStructureDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:291:2: ( ( ( rule__MessageStructureDatatype__Alternatives ) ) )
            // InternalStateDef.g:292:2: ( ( rule__MessageStructureDatatype__Alternatives ) )
            {
            // InternalStateDef.g:292:2: ( ( rule__MessageStructureDatatype__Alternatives ) )
            // InternalStateDef.g:293:3: ( rule__MessageStructureDatatype__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureDatatypeAccess().getAlternatives()); 
            }
            // InternalStateDef.g:294:3: ( rule__MessageStructureDatatype__Alternatives )
            // InternalStateDef.g:294:4: rule__MessageStructureDatatype__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MessageStructureDatatype__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureDatatypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageStructureDatatype"


    // $ANTLR start "entryRuleMessageEnum"
    // InternalStateDef.g:303:1: entryRuleMessageEnum : ruleMessageEnum EOF ;
    public final void entryRuleMessageEnum() throws RecognitionException {
        try {
            // InternalStateDef.g:304:1: ( ruleMessageEnum EOF )
            // InternalStateDef.g:305:1: ruleMessageEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMessageEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageEnum"


    // $ANTLR start "ruleMessageEnum"
    // InternalStateDef.g:312:1: ruleMessageEnum : ( ( rule__MessageEnum__Group__0 ) ) ;
    public final void ruleMessageEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:316:2: ( ( ( rule__MessageEnum__Group__0 ) ) )
            // InternalStateDef.g:317:2: ( ( rule__MessageEnum__Group__0 ) )
            {
            // InternalStateDef.g:317:2: ( ( rule__MessageEnum__Group__0 ) )
            // InternalStateDef.g:318:3: ( rule__MessageEnum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumAccess().getGroup()); 
            }
            // InternalStateDef.g:319:3: ( rule__MessageEnum__Group__0 )
            // InternalStateDef.g:319:4: rule__MessageEnum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageEnum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageEnum"


    // $ANTLR start "rule__MessageTransition__Alternatives_2_2"
    // InternalStateDef.g:327:1: rule__MessageTransition__Alternatives_2_2 : ( ( ( rule__MessageTransition__CurrentStateAssignment_2_2_0 ) ) | ( ( rule__MessageTransition__AnyStateAssignment_2_2_1 ) ) );
    public final void rule__MessageTransition__Alternatives_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:331:1: ( ( ( rule__MessageTransition__CurrentStateAssignment_2_2_0 ) ) | ( ( rule__MessageTransition__AnyStateAssignment_2_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==39) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalStateDef.g:332:2: ( ( rule__MessageTransition__CurrentStateAssignment_2_2_0 ) )
                    {
                    // InternalStateDef.g:332:2: ( ( rule__MessageTransition__CurrentStateAssignment_2_2_0 ) )
                    // InternalStateDef.g:333:3: ( rule__MessageTransition__CurrentStateAssignment_2_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageTransitionAccess().getCurrentStateAssignment_2_2_0()); 
                    }
                    // InternalStateDef.g:334:3: ( rule__MessageTransition__CurrentStateAssignment_2_2_0 )
                    // InternalStateDef.g:334:4: rule__MessageTransition__CurrentStateAssignment_2_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageTransition__CurrentStateAssignment_2_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageTransitionAccess().getCurrentStateAssignment_2_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStateDef.g:338:2: ( ( rule__MessageTransition__AnyStateAssignment_2_2_1 ) )
                    {
                    // InternalStateDef.g:338:2: ( ( rule__MessageTransition__AnyStateAssignment_2_2_1 ) )
                    // InternalStateDef.g:339:3: ( rule__MessageTransition__AnyStateAssignment_2_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageTransitionAccess().getAnyStateAssignment_2_2_1()); 
                    }
                    // InternalStateDef.g:340:3: ( rule__MessageTransition__AnyStateAssignment_2_2_1 )
                    // InternalStateDef.g:340:4: rule__MessageTransition__AnyStateAssignment_2_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageTransition__AnyStateAssignment_2_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageTransitionAccess().getAnyStateAssignment_2_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Alternatives_2_2"


    // $ANTLR start "rule__MessageStructEntry__Alternatives_0"
    // InternalStateDef.g:348:1: rule__MessageStructEntry__Alternatives_0 : ( ( ( rule__MessageStructEntry__DataTypeAssignment_0_0 ) ) | ( ( rule__MessageStructEntry__RefTypeAssignment_0_1 ) ) );
    public final void rule__MessageStructEntry__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:352:1: ( ( ( rule__MessageStructEntry__DataTypeAssignment_0_0 ) ) | ( ( rule__MessageStructEntry__RefTypeAssignment_0_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DATATYPE) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalStateDef.g:353:2: ( ( rule__MessageStructEntry__DataTypeAssignment_0_0 ) )
                    {
                    // InternalStateDef.g:353:2: ( ( rule__MessageStructEntry__DataTypeAssignment_0_0 ) )
                    // InternalStateDef.g:354:3: ( rule__MessageStructEntry__DataTypeAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageStructEntryAccess().getDataTypeAssignment_0_0()); 
                    }
                    // InternalStateDef.g:355:3: ( rule__MessageStructEntry__DataTypeAssignment_0_0 )
                    // InternalStateDef.g:355:4: rule__MessageStructEntry__DataTypeAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageStructEntry__DataTypeAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageStructEntryAccess().getDataTypeAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStateDef.g:359:2: ( ( rule__MessageStructEntry__RefTypeAssignment_0_1 ) )
                    {
                    // InternalStateDef.g:359:2: ( ( rule__MessageStructEntry__RefTypeAssignment_0_1 ) )
                    // InternalStateDef.g:360:3: ( rule__MessageStructEntry__RefTypeAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageStructEntryAccess().getRefTypeAssignment_0_1()); 
                    }
                    // InternalStateDef.g:361:3: ( rule__MessageStructEntry__RefTypeAssignment_0_1 )
                    // InternalStateDef.g:361:4: rule__MessageStructEntry__RefTypeAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageStructEntry__RefTypeAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageStructEntryAccess().getRefTypeAssignment_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Alternatives_0"


    // $ANTLR start "rule__MessageStructEntry__Alternatives_2"
    // InternalStateDef.g:369:1: rule__MessageStructEntry__Alternatives_2 : ( ( ( rule__MessageStructEntry__ByteRangeAssignment_2_0 ) ) | ( ( rule__MessageStructEntry__ByteSizeAssignment_2_1 ) ) );
    public final void rule__MessageStructEntry__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:373:1: ( ( ( rule__MessageStructEntry__ByteRangeAssignment_2_0 ) ) | ( ( rule__MessageStructEntry__ByteSizeAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==34) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalStateDef.g:374:2: ( ( rule__MessageStructEntry__ByteRangeAssignment_2_0 ) )
                    {
                    // InternalStateDef.g:374:2: ( ( rule__MessageStructEntry__ByteRangeAssignment_2_0 ) )
                    // InternalStateDef.g:375:3: ( rule__MessageStructEntry__ByteRangeAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageStructEntryAccess().getByteRangeAssignment_2_0()); 
                    }
                    // InternalStateDef.g:376:3: ( rule__MessageStructEntry__ByteRangeAssignment_2_0 )
                    // InternalStateDef.g:376:4: rule__MessageStructEntry__ByteRangeAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageStructEntry__ByteRangeAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageStructEntryAccess().getByteRangeAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStateDef.g:380:2: ( ( rule__MessageStructEntry__ByteSizeAssignment_2_1 ) )
                    {
                    // InternalStateDef.g:380:2: ( ( rule__MessageStructEntry__ByteSizeAssignment_2_1 ) )
                    // InternalStateDef.g:381:3: ( rule__MessageStructEntry__ByteSizeAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageStructEntryAccess().getByteSizeAssignment_2_1()); 
                    }
                    // InternalStateDef.g:382:3: ( rule__MessageStructEntry__ByteSizeAssignment_2_1 )
                    // InternalStateDef.g:382:4: rule__MessageStructEntry__ByteSizeAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageStructEntry__ByteSizeAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageStructEntryAccess().getByteSizeAssignment_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Alternatives_2"


    // $ANTLR start "rule__MessageStructureDatatype__Alternatives"
    // InternalStateDef.g:390:1: rule__MessageStructureDatatype__Alternatives : ( ( ( rule__MessageStructureDatatype__HexValAssignment_0 ) ) | ( ( rule__MessageStructureDatatype__EnumValAssignment_1 ) ) | ( ( rule__MessageStructureDatatype__StructValAssignment_2 ) ) | ( ( rule__MessageStructureDatatype__Group_3__0 ) ) );
    public final void rule__MessageStructureDatatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:394:1: ( ( ( rule__MessageStructureDatatype__HexValAssignment_0 ) ) | ( ( rule__MessageStructureDatatype__EnumValAssignment_1 ) ) | ( ( rule__MessageStructureDatatype__StructValAssignment_2 ) ) | ( ( rule__MessageStructureDatatype__Group_3__0 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_HEX:
                {
                alt4=1;
                }
                break;
            case RULE_ENUMNAME:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 34:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalStateDef.g:395:2: ( ( rule__MessageStructureDatatype__HexValAssignment_0 ) )
                    {
                    // InternalStateDef.g:395:2: ( ( rule__MessageStructureDatatype__HexValAssignment_0 ) )
                    // InternalStateDef.g:396:3: ( rule__MessageStructureDatatype__HexValAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageStructureDatatypeAccess().getHexValAssignment_0()); 
                    }
                    // InternalStateDef.g:397:3: ( rule__MessageStructureDatatype__HexValAssignment_0 )
                    // InternalStateDef.g:397:4: rule__MessageStructureDatatype__HexValAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageStructureDatatype__HexValAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageStructureDatatypeAccess().getHexValAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStateDef.g:401:2: ( ( rule__MessageStructureDatatype__EnumValAssignment_1 ) )
                    {
                    // InternalStateDef.g:401:2: ( ( rule__MessageStructureDatatype__EnumValAssignment_1 ) )
                    // InternalStateDef.g:402:3: ( rule__MessageStructureDatatype__EnumValAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageStructureDatatypeAccess().getEnumValAssignment_1()); 
                    }
                    // InternalStateDef.g:403:3: ( rule__MessageStructureDatatype__EnumValAssignment_1 )
                    // InternalStateDef.g:403:4: rule__MessageStructureDatatype__EnumValAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageStructureDatatype__EnumValAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageStructureDatatypeAccess().getEnumValAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStateDef.g:407:2: ( ( rule__MessageStructureDatatype__StructValAssignment_2 ) )
                    {
                    // InternalStateDef.g:407:2: ( ( rule__MessageStructureDatatype__StructValAssignment_2 ) )
                    // InternalStateDef.g:408:3: ( rule__MessageStructureDatatype__StructValAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageStructureDatatypeAccess().getStructValAssignment_2()); 
                    }
                    // InternalStateDef.g:409:3: ( rule__MessageStructureDatatype__StructValAssignment_2 )
                    // InternalStateDef.g:409:4: rule__MessageStructureDatatype__StructValAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageStructureDatatype__StructValAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageStructureDatatypeAccess().getStructValAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalStateDef.g:413:2: ( ( rule__MessageStructureDatatype__Group_3__0 ) )
                    {
                    // InternalStateDef.g:413:2: ( ( rule__MessageStructureDatatype__Group_3__0 ) )
                    // InternalStateDef.g:414:3: ( rule__MessageStructureDatatype__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageStructureDatatypeAccess().getGroup_3()); 
                    }
                    // InternalStateDef.g:415:3: ( rule__MessageStructureDatatype__Group_3__0 )
                    // InternalStateDef.g:415:4: rule__MessageStructureDatatype__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageStructureDatatype__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageStructureDatatypeAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureDatatype__Alternatives"


    // $ANTLR start "rule__StateMachine__Group__0"
    // InternalStateDef.g:423:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:427:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // InternalStateDef.g:428:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0"


    // $ANTLR start "rule__StateMachine__Group__0__Impl"
    // InternalStateDef.g:435:1: rule__StateMachine__Group__0__Impl : ( 'machine' ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:439:1: ( ( 'machine' ) )
            // InternalStateDef.g:440:1: ( 'machine' )
            {
            // InternalStateDef.g:440:1: ( 'machine' )
            // InternalStateDef.g:441:2: 'machine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getMachineKeyword_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getMachineKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0__Impl"


    // $ANTLR start "rule__StateMachine__Group__1"
    // InternalStateDef.g:450:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:454:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // InternalStateDef.g:455:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1"


    // $ANTLR start "rule__StateMachine__Group__1__Impl"
    // InternalStateDef.g:462:1: rule__StateMachine__Group__1__Impl : ( ( rule__StateMachine__NameAssignment_1 ) ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:466:1: ( ( ( rule__StateMachine__NameAssignment_1 ) ) )
            // InternalStateDef.g:467:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            {
            // InternalStateDef.g:467:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            // InternalStateDef.g:468:2: ( rule__StateMachine__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 
            }
            // InternalStateDef.g:469:2: ( rule__StateMachine__NameAssignment_1 )
            // InternalStateDef.g:469:3: rule__StateMachine__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__2"
    // InternalStateDef.g:477:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:481:1: ( rule__StateMachine__Group__2__Impl )
            // InternalStateDef.g:482:2: rule__StateMachine__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2"


    // $ANTLR start "rule__StateMachine__Group__2__Impl"
    // InternalStateDef.g:488:1: rule__StateMachine__Group__2__Impl : ( ( rule__StateMachine__UnorderedGroup_2 )? ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:492:1: ( ( ( rule__StateMachine__UnorderedGroup_2 )? ) )
            // InternalStateDef.g:493:1: ( ( rule__StateMachine__UnorderedGroup_2 )? )
            {
            // InternalStateDef.g:493:1: ( ( rule__StateMachine__UnorderedGroup_2 )? )
            // InternalStateDef.g:494:2: ( rule__StateMachine__UnorderedGroup_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getUnorderedGroup_2()); 
            }
            // InternalStateDef.g:495:2: ( rule__StateMachine__UnorderedGroup_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( LA5_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 0) ) {
                alt5=1;
            }
            else if ( LA5_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 1) ) {
                alt5=1;
            }
            else if ( LA5_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 2) ) {
                alt5=1;
            }
            else if ( LA5_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 3) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStateDef.g:495:3: rule__StateMachine__UnorderedGroup_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__UnorderedGroup_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getUnorderedGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__Group_2_0__0"
    // InternalStateDef.g:504:1: rule__StateMachine__Group_2_0__0 : rule__StateMachine__Group_2_0__0__Impl rule__StateMachine__Group_2_0__1 ;
    public final void rule__StateMachine__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:508:1: ( rule__StateMachine__Group_2_0__0__Impl rule__StateMachine__Group_2_0__1 )
            // InternalStateDef.g:509:2: rule__StateMachine__Group_2_0__0__Impl rule__StateMachine__Group_2_0__1
            {
            pushFollow(FOLLOW_5);
            rule__StateMachine__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2_0__0"


    // $ANTLR start "rule__StateMachine__Group_2_0__0__Impl"
    // InternalStateDef.g:516:1: rule__StateMachine__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:520:1: ( ( '{' ) )
            // InternalStateDef.g:521:1: ( '{' )
            {
            // InternalStateDef.g:521:1: ( '{' )
            // InternalStateDef.g:522:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2_0__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_2_0__1"
    // InternalStateDef.g:531:1: rule__StateMachine__Group_2_0__1 : rule__StateMachine__Group_2_0__1__Impl rule__StateMachine__Group_2_0__2 ;
    public final void rule__StateMachine__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:535:1: ( rule__StateMachine__Group_2_0__1__Impl rule__StateMachine__Group_2_0__2 )
            // InternalStateDef.g:536:2: rule__StateMachine__Group_2_0__1__Impl rule__StateMachine__Group_2_0__2
            {
            pushFollow(FOLLOW_6);
            rule__StateMachine__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_2_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2_0__1"


    // $ANTLR start "rule__StateMachine__Group_2_0__1__Impl"
    // InternalStateDef.g:543:1: rule__StateMachine__Group_2_0__1__Impl : ( ( rule__StateMachine__UnorderedGroup_2_0_1 ) ) ;
    public final void rule__StateMachine__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:547:1: ( ( ( rule__StateMachine__UnorderedGroup_2_0_1 ) ) )
            // InternalStateDef.g:548:1: ( ( rule__StateMachine__UnorderedGroup_2_0_1 ) )
            {
            // InternalStateDef.g:548:1: ( ( rule__StateMachine__UnorderedGroup_2_0_1 ) )
            // InternalStateDef.g:549:2: ( rule__StateMachine__UnorderedGroup_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1()); 
            }
            // InternalStateDef.g:550:2: ( rule__StateMachine__UnorderedGroup_2_0_1 )
            // InternalStateDef.g:550:3: rule__StateMachine__UnorderedGroup_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__UnorderedGroup_2_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2_0__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_2_0__2"
    // InternalStateDef.g:558:1: rule__StateMachine__Group_2_0__2 : rule__StateMachine__Group_2_0__2__Impl rule__StateMachine__Group_2_0__3 ;
    public final void rule__StateMachine__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:562:1: ( rule__StateMachine__Group_2_0__2__Impl rule__StateMachine__Group_2_0__3 )
            // InternalStateDef.g:563:2: rule__StateMachine__Group_2_0__2__Impl rule__StateMachine__Group_2_0__3
            {
            pushFollow(FOLLOW_7);
            rule__StateMachine__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_2_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2_0__2"


    // $ANTLR start "rule__StateMachine__Group_2_0__2__Impl"
    // InternalStateDef.g:570:1: rule__StateMachine__Group_2_0__2__Impl : ( 'initial' ) ;
    public final void rule__StateMachine__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:574:1: ( ( 'initial' ) )
            // InternalStateDef.g:575:1: ( 'initial' )
            {
            // InternalStateDef.g:575:1: ( 'initial' )
            // InternalStateDef.g:576:2: 'initial'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getInitialKeyword_2_0_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getInitialKeyword_2_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2_0__2__Impl"


    // $ANTLR start "rule__StateMachine__Group_2_0__3"
    // InternalStateDef.g:585:1: rule__StateMachine__Group_2_0__3 : rule__StateMachine__Group_2_0__3__Impl ;
    public final void rule__StateMachine__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:589:1: ( rule__StateMachine__Group_2_0__3__Impl )
            // InternalStateDef.g:590:2: rule__StateMachine__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_2_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2_0__3"


    // $ANTLR start "rule__StateMachine__Group_2_0__3__Impl"
    // InternalStateDef.g:596:1: rule__StateMachine__Group_2_0__3__Impl : ( ( rule__StateMachine__InitStateAssignment_2_0_3 ) ) ;
    public final void rule__StateMachine__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:600:1: ( ( ( rule__StateMachine__InitStateAssignment_2_0_3 ) ) )
            // InternalStateDef.g:601:1: ( ( rule__StateMachine__InitStateAssignment_2_0_3 ) )
            {
            // InternalStateDef.g:601:1: ( ( rule__StateMachine__InitStateAssignment_2_0_3 ) )
            // InternalStateDef.g:602:2: ( rule__StateMachine__InitStateAssignment_2_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getInitStateAssignment_2_0_3()); 
            }
            // InternalStateDef.g:603:2: ( rule__StateMachine__InitStateAssignment_2_0_3 )
            // InternalStateDef.g:603:3: rule__StateMachine__InitStateAssignment_2_0_3
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__InitStateAssignment_2_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getInitStateAssignment_2_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2_0__3__Impl"


    // $ANTLR start "rule__StateMachine__Group_2_3__0"
    // InternalStateDef.g:612:1: rule__StateMachine__Group_2_3__0 : rule__StateMachine__Group_2_3__0__Impl rule__StateMachine__Group_2_3__1 ;
    public final void rule__StateMachine__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:616:1: ( rule__StateMachine__Group_2_3__0__Impl rule__StateMachine__Group_2_3__1 )
            // InternalStateDef.g:617:2: rule__StateMachine__Group_2_3__0__Impl rule__StateMachine__Group_2_3__1
            {
            pushFollow(FOLLOW_7);
            rule__StateMachine__Group_2_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_2_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2_3__0"


    // $ANTLR start "rule__StateMachine__Group_2_3__0__Impl"
    // InternalStateDef.g:624:1: rule__StateMachine__Group_2_3__0__Impl : ( 'end' ) ;
    public final void rule__StateMachine__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:628:1: ( ( 'end' ) )
            // InternalStateDef.g:629:1: ( 'end' )
            {
            // InternalStateDef.g:629:1: ( 'end' )
            // InternalStateDef.g:630:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getEndKeyword_2_3_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getEndKeyword_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2_3__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_2_3__1"
    // InternalStateDef.g:639:1: rule__StateMachine__Group_2_3__1 : rule__StateMachine__Group_2_3__1__Impl rule__StateMachine__Group_2_3__2 ;
    public final void rule__StateMachine__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:643:1: ( rule__StateMachine__Group_2_3__1__Impl rule__StateMachine__Group_2_3__2 )
            // InternalStateDef.g:644:2: rule__StateMachine__Group_2_3__1__Impl rule__StateMachine__Group_2_3__2
            {
            pushFollow(FOLLOW_8);
            rule__StateMachine__Group_2_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_2_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2_3__1"


    // $ANTLR start "rule__StateMachine__Group_2_3__1__Impl"
    // InternalStateDef.g:651:1: rule__StateMachine__Group_2_3__1__Impl : ( ( rule__StateMachine__EndStateAssignment_2_3_1 ) ) ;
    public final void rule__StateMachine__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:655:1: ( ( ( rule__StateMachine__EndStateAssignment_2_3_1 ) ) )
            // InternalStateDef.g:656:1: ( ( rule__StateMachine__EndStateAssignment_2_3_1 ) )
            {
            // InternalStateDef.g:656:1: ( ( rule__StateMachine__EndStateAssignment_2_3_1 ) )
            // InternalStateDef.g:657:2: ( rule__StateMachine__EndStateAssignment_2_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getEndStateAssignment_2_3_1()); 
            }
            // InternalStateDef.g:658:2: ( rule__StateMachine__EndStateAssignment_2_3_1 )
            // InternalStateDef.g:658:3: rule__StateMachine__EndStateAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__EndStateAssignment_2_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getEndStateAssignment_2_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2_3__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_2_3__2"
    // InternalStateDef.g:666:1: rule__StateMachine__Group_2_3__2 : rule__StateMachine__Group_2_3__2__Impl ;
    public final void rule__StateMachine__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:670:1: ( rule__StateMachine__Group_2_3__2__Impl )
            // InternalStateDef.g:671:2: rule__StateMachine__Group_2_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_2_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2_3__2"


    // $ANTLR start "rule__StateMachine__Group_2_3__2__Impl"
    // InternalStateDef.g:677:1: rule__StateMachine__Group_2_3__2__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:681:1: ( ( '}' ) )
            // InternalStateDef.g:682:1: ( '}' )
            {
            // InternalStateDef.g:682:1: ( '}' )
            // InternalStateDef.g:683:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_2_3_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_2_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2_3__2__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalStateDef.g:693:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:697:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalStateDef.g:698:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalStateDef.g:705:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:709:1: ( ( 'state' ) )
            // InternalStateDef.g:710:1: ( 'state' )
            {
            // InternalStateDef.g:710:1: ( 'state' )
            // InternalStateDef.g:711:2: 'state'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalStateDef.g:720:1: rule__State__Group__1 : rule__State__Group__1__Impl ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:724:1: ( rule__State__Group__1__Impl )
            // InternalStateDef.g:725:2: rule__State__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalStateDef.g:731:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:735:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalStateDef.g:736:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalStateDef.g:736:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalStateDef.g:737:2: ( rule__State__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            }
            // InternalStateDef.g:738:2: ( rule__State__NameAssignment_1 )
            // InternalStateDef.g:738:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__MessageTransition__Group__0"
    // InternalStateDef.g:747:1: rule__MessageTransition__Group__0 : rule__MessageTransition__Group__0__Impl rule__MessageTransition__Group__1 ;
    public final void rule__MessageTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:751:1: ( rule__MessageTransition__Group__0__Impl rule__MessageTransition__Group__1 )
            // InternalStateDef.g:752:2: rule__MessageTransition__Group__0__Impl rule__MessageTransition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MessageTransition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group__0"


    // $ANTLR start "rule__MessageTransition__Group__0__Impl"
    // InternalStateDef.g:759:1: rule__MessageTransition__Group__0__Impl : ( 'transition' ) ;
    public final void rule__MessageTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:763:1: ( ( 'transition' ) )
            // InternalStateDef.g:764:1: ( 'transition' )
            {
            // InternalStateDef.g:764:1: ( 'transition' )
            // InternalStateDef.g:765:2: 'transition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getTransitionKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getTransitionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group__0__Impl"


    // $ANTLR start "rule__MessageTransition__Group__1"
    // InternalStateDef.g:774:1: rule__MessageTransition__Group__1 : rule__MessageTransition__Group__1__Impl rule__MessageTransition__Group__2 ;
    public final void rule__MessageTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:778:1: ( rule__MessageTransition__Group__1__Impl rule__MessageTransition__Group__2 )
            // InternalStateDef.g:779:2: rule__MessageTransition__Group__1__Impl rule__MessageTransition__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MessageTransition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group__1"


    // $ANTLR start "rule__MessageTransition__Group__1__Impl"
    // InternalStateDef.g:786:1: rule__MessageTransition__Group__1__Impl : ( ( rule__MessageTransition__NameAssignment_1 ) ) ;
    public final void rule__MessageTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:790:1: ( ( ( rule__MessageTransition__NameAssignment_1 ) ) )
            // InternalStateDef.g:791:1: ( ( rule__MessageTransition__NameAssignment_1 ) )
            {
            // InternalStateDef.g:791:1: ( ( rule__MessageTransition__NameAssignment_1 ) )
            // InternalStateDef.g:792:2: ( rule__MessageTransition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getNameAssignment_1()); 
            }
            // InternalStateDef.g:793:2: ( rule__MessageTransition__NameAssignment_1 )
            // InternalStateDef.g:793:3: rule__MessageTransition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MessageTransition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group__1__Impl"


    // $ANTLR start "rule__MessageTransition__Group__2"
    // InternalStateDef.g:801:1: rule__MessageTransition__Group__2 : rule__MessageTransition__Group__2__Impl ;
    public final void rule__MessageTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:805:1: ( rule__MessageTransition__Group__2__Impl )
            // InternalStateDef.g:806:2: rule__MessageTransition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group__2"


    // $ANTLR start "rule__MessageTransition__Group__2__Impl"
    // InternalStateDef.g:812:1: rule__MessageTransition__Group__2__Impl : ( ( rule__MessageTransition__Group_2__0 )? ) ;
    public final void rule__MessageTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:816:1: ( ( ( rule__MessageTransition__Group_2__0 )? ) )
            // InternalStateDef.g:817:1: ( ( rule__MessageTransition__Group_2__0 )? )
            {
            // InternalStateDef.g:817:1: ( ( rule__MessageTransition__Group_2__0 )? )
            // InternalStateDef.g:818:2: ( rule__MessageTransition__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getGroup_2()); 
            }
            // InternalStateDef.g:819:2: ( rule__MessageTransition__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==21) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalStateDef.g:819:3: rule__MessageTransition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageTransition__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group__2__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2__0"
    // InternalStateDef.g:828:1: rule__MessageTransition__Group_2__0 : rule__MessageTransition__Group_2__0__Impl rule__MessageTransition__Group_2__1 ;
    public final void rule__MessageTransition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:832:1: ( rule__MessageTransition__Group_2__0__Impl rule__MessageTransition__Group_2__1 )
            // InternalStateDef.g:833:2: rule__MessageTransition__Group_2__0__Impl rule__MessageTransition__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__MessageTransition__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2__0"


    // $ANTLR start "rule__MessageTransition__Group_2__0__Impl"
    // InternalStateDef.g:840:1: rule__MessageTransition__Group_2__0__Impl : ( '{' ) ;
    public final void rule__MessageTransition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:844:1: ( ( '{' ) )
            // InternalStateDef.g:845:1: ( '{' )
            {
            // InternalStateDef.g:845:1: ( '{' )
            // InternalStateDef.g:846:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getLeftCurlyBracketKeyword_2_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getLeftCurlyBracketKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2__0__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2__1"
    // InternalStateDef.g:855:1: rule__MessageTransition__Group_2__1 : rule__MessageTransition__Group_2__1__Impl rule__MessageTransition__Group_2__2 ;
    public final void rule__MessageTransition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:859:1: ( rule__MessageTransition__Group_2__1__Impl rule__MessageTransition__Group_2__2 )
            // InternalStateDef.g:860:2: rule__MessageTransition__Group_2__1__Impl rule__MessageTransition__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__MessageTransition__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2__1"


    // $ANTLR start "rule__MessageTransition__Group_2__1__Impl"
    // InternalStateDef.g:867:1: rule__MessageTransition__Group_2__1__Impl : ( 'from' ) ;
    public final void rule__MessageTransition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:871:1: ( ( 'from' ) )
            // InternalStateDef.g:872:1: ( 'from' )
            {
            // InternalStateDef.g:872:1: ( 'from' )
            // InternalStateDef.g:873:2: 'from'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getFromKeyword_2_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getFromKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2__1__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2__2"
    // InternalStateDef.g:882:1: rule__MessageTransition__Group_2__2 : rule__MessageTransition__Group_2__2__Impl rule__MessageTransition__Group_2__3 ;
    public final void rule__MessageTransition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:886:1: ( rule__MessageTransition__Group_2__2__Impl rule__MessageTransition__Group_2__3 )
            // InternalStateDef.g:887:2: rule__MessageTransition__Group_2__2__Impl rule__MessageTransition__Group_2__3
            {
            pushFollow(FOLLOW_12);
            rule__MessageTransition__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2__2"


    // $ANTLR start "rule__MessageTransition__Group_2__2__Impl"
    // InternalStateDef.g:894:1: rule__MessageTransition__Group_2__2__Impl : ( ( rule__MessageTransition__Alternatives_2_2 ) ) ;
    public final void rule__MessageTransition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:898:1: ( ( ( rule__MessageTransition__Alternatives_2_2 ) ) )
            // InternalStateDef.g:899:1: ( ( rule__MessageTransition__Alternatives_2_2 ) )
            {
            // InternalStateDef.g:899:1: ( ( rule__MessageTransition__Alternatives_2_2 ) )
            // InternalStateDef.g:900:2: ( rule__MessageTransition__Alternatives_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getAlternatives_2_2()); 
            }
            // InternalStateDef.g:901:2: ( rule__MessageTransition__Alternatives_2_2 )
            // InternalStateDef.g:901:3: rule__MessageTransition__Alternatives_2_2
            {
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Alternatives_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getAlternatives_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2__2__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2__3"
    // InternalStateDef.g:909:1: rule__MessageTransition__Group_2__3 : rule__MessageTransition__Group_2__3__Impl rule__MessageTransition__Group_2__4 ;
    public final void rule__MessageTransition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:913:1: ( rule__MessageTransition__Group_2__3__Impl rule__MessageTransition__Group_2__4 )
            // InternalStateDef.g:914:2: rule__MessageTransition__Group_2__3__Impl rule__MessageTransition__Group_2__4
            {
            pushFollow(FOLLOW_12);
            rule__MessageTransition__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2__3"


    // $ANTLR start "rule__MessageTransition__Group_2__3__Impl"
    // InternalStateDef.g:921:1: rule__MessageTransition__Group_2__3__Impl : ( ( rule__MessageTransition__Group_2_3__0 )? ) ;
    public final void rule__MessageTransition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:925:1: ( ( ( rule__MessageTransition__Group_2_3__0 )? ) )
            // InternalStateDef.g:926:1: ( ( rule__MessageTransition__Group_2_3__0 )? )
            {
            // InternalStateDef.g:926:1: ( ( rule__MessageTransition__Group_2_3__0 )? )
            // InternalStateDef.g:927:2: ( rule__MessageTransition__Group_2_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getGroup_2_3()); 
            }
            // InternalStateDef.g:928:2: ( rule__MessageTransition__Group_2_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalStateDef.g:928:3: rule__MessageTransition__Group_2_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageTransition__Group_2_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getGroup_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2__3__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2__4"
    // InternalStateDef.g:936:1: rule__MessageTransition__Group_2__4 : rule__MessageTransition__Group_2__4__Impl rule__MessageTransition__Group_2__5 ;
    public final void rule__MessageTransition__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:940:1: ( rule__MessageTransition__Group_2__4__Impl rule__MessageTransition__Group_2__5 )
            // InternalStateDef.g:941:2: rule__MessageTransition__Group_2__4__Impl rule__MessageTransition__Group_2__5
            {
            pushFollow(FOLLOW_12);
            rule__MessageTransition__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2__4"


    // $ANTLR start "rule__MessageTransition__Group_2__4__Impl"
    // InternalStateDef.g:948:1: rule__MessageTransition__Group_2__4__Impl : ( ( rule__MessageTransition__Group_2_4__0 )? ) ;
    public final void rule__MessageTransition__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:952:1: ( ( ( rule__MessageTransition__Group_2_4__0 )? ) )
            // InternalStateDef.g:953:1: ( ( rule__MessageTransition__Group_2_4__0 )? )
            {
            // InternalStateDef.g:953:1: ( ( rule__MessageTransition__Group_2_4__0 )? )
            // InternalStateDef.g:954:2: ( rule__MessageTransition__Group_2_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getGroup_2_4()); 
            }
            // InternalStateDef.g:955:2: ( rule__MessageTransition__Group_2_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStateDef.g:955:3: rule__MessageTransition__Group_2_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageTransition__Group_2_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getGroup_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2__4__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2__5"
    // InternalStateDef.g:963:1: rule__MessageTransition__Group_2__5 : rule__MessageTransition__Group_2__5__Impl rule__MessageTransition__Group_2__6 ;
    public final void rule__MessageTransition__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:967:1: ( rule__MessageTransition__Group_2__5__Impl rule__MessageTransition__Group_2__6 )
            // InternalStateDef.g:968:2: rule__MessageTransition__Group_2__5__Impl rule__MessageTransition__Group_2__6
            {
            pushFollow(FOLLOW_12);
            rule__MessageTransition__Group_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2__5"


    // $ANTLR start "rule__MessageTransition__Group_2__5__Impl"
    // InternalStateDef.g:975:1: rule__MessageTransition__Group_2__5__Impl : ( ( rule__MessageTransition__Group_2_5__0 )? ) ;
    public final void rule__MessageTransition__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:979:1: ( ( ( rule__MessageTransition__Group_2_5__0 )? ) )
            // InternalStateDef.g:980:1: ( ( rule__MessageTransition__Group_2_5__0 )? )
            {
            // InternalStateDef.g:980:1: ( ( rule__MessageTransition__Group_2_5__0 )? )
            // InternalStateDef.g:981:2: ( rule__MessageTransition__Group_2_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getGroup_2_5()); 
            }
            // InternalStateDef.g:982:2: ( rule__MessageTransition__Group_2_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStateDef.g:982:3: rule__MessageTransition__Group_2_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageTransition__Group_2_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getGroup_2_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2__5__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2__6"
    // InternalStateDef.g:990:1: rule__MessageTransition__Group_2__6 : rule__MessageTransition__Group_2__6__Impl ;
    public final void rule__MessageTransition__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:994:1: ( rule__MessageTransition__Group_2__6__Impl )
            // InternalStateDef.g:995:2: rule__MessageTransition__Group_2__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2__6"


    // $ANTLR start "rule__MessageTransition__Group_2__6__Impl"
    // InternalStateDef.g:1001:1: rule__MessageTransition__Group_2__6__Impl : ( '}' ) ;
    public final void rule__MessageTransition__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1005:1: ( ( '}' ) )
            // InternalStateDef.g:1006:1: ( '}' )
            {
            // InternalStateDef.g:1006:1: ( '}' )
            // InternalStateDef.g:1007:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getRightCurlyBracketKeyword_2_6()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getRightCurlyBracketKeyword_2_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2__6__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2_3__0"
    // InternalStateDef.g:1017:1: rule__MessageTransition__Group_2_3__0 : rule__MessageTransition__Group_2_3__0__Impl rule__MessageTransition__Group_2_3__1 ;
    public final void rule__MessageTransition__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1021:1: ( rule__MessageTransition__Group_2_3__0__Impl rule__MessageTransition__Group_2_3__1 )
            // InternalStateDef.g:1022:2: rule__MessageTransition__Group_2_3__0__Impl rule__MessageTransition__Group_2_3__1
            {
            pushFollow(FOLLOW_13);
            rule__MessageTransition__Group_2_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_3__0"


    // $ANTLR start "rule__MessageTransition__Group_2_3__0__Impl"
    // InternalStateDef.g:1029:1: rule__MessageTransition__Group_2_3__0__Impl : ( 'received' ) ;
    public final void rule__MessageTransition__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1033:1: ( ( 'received' ) )
            // InternalStateDef.g:1034:1: ( 'received' )
            {
            // InternalStateDef.g:1034:1: ( 'received' )
            // InternalStateDef.g:1035:2: 'received'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getReceivedKeyword_2_3_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getReceivedKeyword_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_3__0__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2_3__1"
    // InternalStateDef.g:1044:1: rule__MessageTransition__Group_2_3__1 : rule__MessageTransition__Group_2_3__1__Impl rule__MessageTransition__Group_2_3__2 ;
    public final void rule__MessageTransition__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1048:1: ( rule__MessageTransition__Group_2_3__1__Impl rule__MessageTransition__Group_2_3__2 )
            // InternalStateDef.g:1049:2: rule__MessageTransition__Group_2_3__1__Impl rule__MessageTransition__Group_2_3__2
            {
            pushFollow(FOLLOW_9);
            rule__MessageTransition__Group_2_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_3__1"


    // $ANTLR start "rule__MessageTransition__Group_2_3__1__Impl"
    // InternalStateDef.g:1056:1: rule__MessageTransition__Group_2_3__1__Impl : ( 'messages' ) ;
    public final void rule__MessageTransition__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1060:1: ( ( 'messages' ) )
            // InternalStateDef.g:1061:1: ( 'messages' )
            {
            // InternalStateDef.g:1061:1: ( 'messages' )
            // InternalStateDef.g:1062:2: 'messages'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getMessagesKeyword_2_3_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getMessagesKeyword_2_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_3__1__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2_3__2"
    // InternalStateDef.g:1071:1: rule__MessageTransition__Group_2_3__2 : rule__MessageTransition__Group_2_3__2__Impl ;
    public final void rule__MessageTransition__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1075:1: ( rule__MessageTransition__Group_2_3__2__Impl )
            // InternalStateDef.g:1076:2: rule__MessageTransition__Group_2_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_3__2"


    // $ANTLR start "rule__MessageTransition__Group_2_3__2__Impl"
    // InternalStateDef.g:1082:1: rule__MessageTransition__Group_2_3__2__Impl : ( ( rule__MessageTransition__Group_2_3_2__0 ) ) ;
    public final void rule__MessageTransition__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1086:1: ( ( ( rule__MessageTransition__Group_2_3_2__0 ) ) )
            // InternalStateDef.g:1087:1: ( ( rule__MessageTransition__Group_2_3_2__0 ) )
            {
            // InternalStateDef.g:1087:1: ( ( rule__MessageTransition__Group_2_3_2__0 ) )
            // InternalStateDef.g:1088:2: ( rule__MessageTransition__Group_2_3_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getGroup_2_3_2()); 
            }
            // InternalStateDef.g:1089:2: ( rule__MessageTransition__Group_2_3_2__0 )
            // InternalStateDef.g:1089:3: rule__MessageTransition__Group_2_3_2__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2_3_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getGroup_2_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_3__2__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2_3_2__0"
    // InternalStateDef.g:1098:1: rule__MessageTransition__Group_2_3_2__0 : rule__MessageTransition__Group_2_3_2__0__Impl rule__MessageTransition__Group_2_3_2__1 ;
    public final void rule__MessageTransition__Group_2_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1102:1: ( rule__MessageTransition__Group_2_3_2__0__Impl rule__MessageTransition__Group_2_3_2__1 )
            // InternalStateDef.g:1103:2: rule__MessageTransition__Group_2_3_2__0__Impl rule__MessageTransition__Group_2_3_2__1
            {
            pushFollow(FOLLOW_14);
            rule__MessageTransition__Group_2_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_3_2__0"


    // $ANTLR start "rule__MessageTransition__Group_2_3_2__0__Impl"
    // InternalStateDef.g:1110:1: rule__MessageTransition__Group_2_3_2__0__Impl : ( '{' ) ;
    public final void rule__MessageTransition__Group_2_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1114:1: ( ( '{' ) )
            // InternalStateDef.g:1115:1: ( '{' )
            {
            // InternalStateDef.g:1115:1: ( '{' )
            // InternalStateDef.g:1116:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getLeftCurlyBracketKeyword_2_3_2_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getLeftCurlyBracketKeyword_2_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_3_2__0__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2_3_2__1"
    // InternalStateDef.g:1125:1: rule__MessageTransition__Group_2_3_2__1 : rule__MessageTransition__Group_2_3_2__1__Impl rule__MessageTransition__Group_2_3_2__2 ;
    public final void rule__MessageTransition__Group_2_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1129:1: ( rule__MessageTransition__Group_2_3_2__1__Impl rule__MessageTransition__Group_2_3_2__2 )
            // InternalStateDef.g:1130:2: rule__MessageTransition__Group_2_3_2__1__Impl rule__MessageTransition__Group_2_3_2__2
            {
            pushFollow(FOLLOW_14);
            rule__MessageTransition__Group_2_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2_3_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_3_2__1"


    // $ANTLR start "rule__MessageTransition__Group_2_3_2__1__Impl"
    // InternalStateDef.g:1137:1: rule__MessageTransition__Group_2_3_2__1__Impl : ( ( rule__MessageTransition__ReceivedMessagesAssignment_2_3_2_1 )* ) ;
    public final void rule__MessageTransition__Group_2_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1141:1: ( ( ( rule__MessageTransition__ReceivedMessagesAssignment_2_3_2_1 )* ) )
            // InternalStateDef.g:1142:1: ( ( rule__MessageTransition__ReceivedMessagesAssignment_2_3_2_1 )* )
            {
            // InternalStateDef.g:1142:1: ( ( rule__MessageTransition__ReceivedMessagesAssignment_2_3_2_1 )* )
            // InternalStateDef.g:1143:2: ( rule__MessageTransition__ReceivedMessagesAssignment_2_3_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getReceivedMessagesAssignment_2_3_2_1()); 
            }
            // InternalStateDef.g:1144:2: ( rule__MessageTransition__ReceivedMessagesAssignment_2_3_2_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalStateDef.g:1144:3: rule__MessageTransition__ReceivedMessagesAssignment_2_3_2_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__MessageTransition__ReceivedMessagesAssignment_2_3_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getReceivedMessagesAssignment_2_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_3_2__1__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2_3_2__2"
    // InternalStateDef.g:1152:1: rule__MessageTransition__Group_2_3_2__2 : rule__MessageTransition__Group_2_3_2__2__Impl ;
    public final void rule__MessageTransition__Group_2_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1156:1: ( rule__MessageTransition__Group_2_3_2__2__Impl )
            // InternalStateDef.g:1157:2: rule__MessageTransition__Group_2_3_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2_3_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_3_2__2"


    // $ANTLR start "rule__MessageTransition__Group_2_3_2__2__Impl"
    // InternalStateDef.g:1163:1: rule__MessageTransition__Group_2_3_2__2__Impl : ( '}' ) ;
    public final void rule__MessageTransition__Group_2_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1167:1: ( ( '}' ) )
            // InternalStateDef.g:1168:1: ( '}' )
            {
            // InternalStateDef.g:1168:1: ( '}' )
            // InternalStateDef.g:1169:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getRightCurlyBracketKeyword_2_3_2_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getRightCurlyBracketKeyword_2_3_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_3_2__2__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2_4__0"
    // InternalStateDef.g:1179:1: rule__MessageTransition__Group_2_4__0 : rule__MessageTransition__Group_2_4__0__Impl rule__MessageTransition__Group_2_4__1 ;
    public final void rule__MessageTransition__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1183:1: ( rule__MessageTransition__Group_2_4__0__Impl rule__MessageTransition__Group_2_4__1 )
            // InternalStateDef.g:1184:2: rule__MessageTransition__Group_2_4__0__Impl rule__MessageTransition__Group_2_4__1
            {
            pushFollow(FOLLOW_13);
            rule__MessageTransition__Group_2_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_4__0"


    // $ANTLR start "rule__MessageTransition__Group_2_4__0__Impl"
    // InternalStateDef.g:1191:1: rule__MessageTransition__Group_2_4__0__Impl : ( 'sent' ) ;
    public final void rule__MessageTransition__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1195:1: ( ( 'sent' ) )
            // InternalStateDef.g:1196:1: ( 'sent' )
            {
            // InternalStateDef.g:1196:1: ( 'sent' )
            // InternalStateDef.g:1197:2: 'sent'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getSentKeyword_2_4_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getSentKeyword_2_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_4__0__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2_4__1"
    // InternalStateDef.g:1206:1: rule__MessageTransition__Group_2_4__1 : rule__MessageTransition__Group_2_4__1__Impl rule__MessageTransition__Group_2_4__2 ;
    public final void rule__MessageTransition__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1210:1: ( rule__MessageTransition__Group_2_4__1__Impl rule__MessageTransition__Group_2_4__2 )
            // InternalStateDef.g:1211:2: rule__MessageTransition__Group_2_4__1__Impl rule__MessageTransition__Group_2_4__2
            {
            pushFollow(FOLLOW_9);
            rule__MessageTransition__Group_2_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_4__1"


    // $ANTLR start "rule__MessageTransition__Group_2_4__1__Impl"
    // InternalStateDef.g:1218:1: rule__MessageTransition__Group_2_4__1__Impl : ( 'messages' ) ;
    public final void rule__MessageTransition__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1222:1: ( ( 'messages' ) )
            // InternalStateDef.g:1223:1: ( 'messages' )
            {
            // InternalStateDef.g:1223:1: ( 'messages' )
            // InternalStateDef.g:1224:2: 'messages'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getMessagesKeyword_2_4_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getMessagesKeyword_2_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_4__1__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2_4__2"
    // InternalStateDef.g:1233:1: rule__MessageTransition__Group_2_4__2 : rule__MessageTransition__Group_2_4__2__Impl ;
    public final void rule__MessageTransition__Group_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1237:1: ( rule__MessageTransition__Group_2_4__2__Impl )
            // InternalStateDef.g:1238:2: rule__MessageTransition__Group_2_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_4__2"


    // $ANTLR start "rule__MessageTransition__Group_2_4__2__Impl"
    // InternalStateDef.g:1244:1: rule__MessageTransition__Group_2_4__2__Impl : ( ( rule__MessageTransition__Group_2_4_2__0 ) ) ;
    public final void rule__MessageTransition__Group_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1248:1: ( ( ( rule__MessageTransition__Group_2_4_2__0 ) ) )
            // InternalStateDef.g:1249:1: ( ( rule__MessageTransition__Group_2_4_2__0 ) )
            {
            // InternalStateDef.g:1249:1: ( ( rule__MessageTransition__Group_2_4_2__0 ) )
            // InternalStateDef.g:1250:2: ( rule__MessageTransition__Group_2_4_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getGroup_2_4_2()); 
            }
            // InternalStateDef.g:1251:2: ( rule__MessageTransition__Group_2_4_2__0 )
            // InternalStateDef.g:1251:3: rule__MessageTransition__Group_2_4_2__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2_4_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getGroup_2_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_4__2__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2_4_2__0"
    // InternalStateDef.g:1260:1: rule__MessageTransition__Group_2_4_2__0 : rule__MessageTransition__Group_2_4_2__0__Impl rule__MessageTransition__Group_2_4_2__1 ;
    public final void rule__MessageTransition__Group_2_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1264:1: ( rule__MessageTransition__Group_2_4_2__0__Impl rule__MessageTransition__Group_2_4_2__1 )
            // InternalStateDef.g:1265:2: rule__MessageTransition__Group_2_4_2__0__Impl rule__MessageTransition__Group_2_4_2__1
            {
            pushFollow(FOLLOW_14);
            rule__MessageTransition__Group_2_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_4_2__0"


    // $ANTLR start "rule__MessageTransition__Group_2_4_2__0__Impl"
    // InternalStateDef.g:1272:1: rule__MessageTransition__Group_2_4_2__0__Impl : ( '{' ) ;
    public final void rule__MessageTransition__Group_2_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1276:1: ( ( '{' ) )
            // InternalStateDef.g:1277:1: ( '{' )
            {
            // InternalStateDef.g:1277:1: ( '{' )
            // InternalStateDef.g:1278:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getLeftCurlyBracketKeyword_2_4_2_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getLeftCurlyBracketKeyword_2_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_4_2__0__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2_4_2__1"
    // InternalStateDef.g:1287:1: rule__MessageTransition__Group_2_4_2__1 : rule__MessageTransition__Group_2_4_2__1__Impl rule__MessageTransition__Group_2_4_2__2 ;
    public final void rule__MessageTransition__Group_2_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1291:1: ( rule__MessageTransition__Group_2_4_2__1__Impl rule__MessageTransition__Group_2_4_2__2 )
            // InternalStateDef.g:1292:2: rule__MessageTransition__Group_2_4_2__1__Impl rule__MessageTransition__Group_2_4_2__2
            {
            pushFollow(FOLLOW_14);
            rule__MessageTransition__Group_2_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2_4_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_4_2__1"


    // $ANTLR start "rule__MessageTransition__Group_2_4_2__1__Impl"
    // InternalStateDef.g:1299:1: rule__MessageTransition__Group_2_4_2__1__Impl : ( ( rule__MessageTransition__SentMessagesAssignment_2_4_2_1 )* ) ;
    public final void rule__MessageTransition__Group_2_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1303:1: ( ( ( rule__MessageTransition__SentMessagesAssignment_2_4_2_1 )* ) )
            // InternalStateDef.g:1304:1: ( ( rule__MessageTransition__SentMessagesAssignment_2_4_2_1 )* )
            {
            // InternalStateDef.g:1304:1: ( ( rule__MessageTransition__SentMessagesAssignment_2_4_2_1 )* )
            // InternalStateDef.g:1305:2: ( rule__MessageTransition__SentMessagesAssignment_2_4_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getSentMessagesAssignment_2_4_2_1()); 
            }
            // InternalStateDef.g:1306:2: ( rule__MessageTransition__SentMessagesAssignment_2_4_2_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalStateDef.g:1306:3: rule__MessageTransition__SentMessagesAssignment_2_4_2_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__MessageTransition__SentMessagesAssignment_2_4_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getSentMessagesAssignment_2_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_4_2__1__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2_4_2__2"
    // InternalStateDef.g:1314:1: rule__MessageTransition__Group_2_4_2__2 : rule__MessageTransition__Group_2_4_2__2__Impl ;
    public final void rule__MessageTransition__Group_2_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1318:1: ( rule__MessageTransition__Group_2_4_2__2__Impl )
            // InternalStateDef.g:1319:2: rule__MessageTransition__Group_2_4_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2_4_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_4_2__2"


    // $ANTLR start "rule__MessageTransition__Group_2_4_2__2__Impl"
    // InternalStateDef.g:1325:1: rule__MessageTransition__Group_2_4_2__2__Impl : ( '}' ) ;
    public final void rule__MessageTransition__Group_2_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1329:1: ( ( '}' ) )
            // InternalStateDef.g:1330:1: ( '}' )
            {
            // InternalStateDef.g:1330:1: ( '}' )
            // InternalStateDef.g:1331:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getRightCurlyBracketKeyword_2_4_2_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getRightCurlyBracketKeyword_2_4_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_4_2__2__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2_5__0"
    // InternalStateDef.g:1341:1: rule__MessageTransition__Group_2_5__0 : rule__MessageTransition__Group_2_5__0__Impl rule__MessageTransition__Group_2_5__1 ;
    public final void rule__MessageTransition__Group_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1345:1: ( rule__MessageTransition__Group_2_5__0__Impl rule__MessageTransition__Group_2_5__1 )
            // InternalStateDef.g:1346:2: rule__MessageTransition__Group_2_5__0__Impl rule__MessageTransition__Group_2_5__1
            {
            pushFollow(FOLLOW_7);
            rule__MessageTransition__Group_2_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_5__0"


    // $ANTLR start "rule__MessageTransition__Group_2_5__0__Impl"
    // InternalStateDef.g:1353:1: rule__MessageTransition__Group_2_5__0__Impl : ( 'go' ) ;
    public final void rule__MessageTransition__Group_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1357:1: ( ( 'go' ) )
            // InternalStateDef.g:1358:1: ( 'go' )
            {
            // InternalStateDef.g:1358:1: ( 'go' )
            // InternalStateDef.g:1359:2: 'go'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getGoKeyword_2_5_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getGoKeyword_2_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_5__0__Impl"


    // $ANTLR start "rule__MessageTransition__Group_2_5__1"
    // InternalStateDef.g:1368:1: rule__MessageTransition__Group_2_5__1 : rule__MessageTransition__Group_2_5__1__Impl ;
    public final void rule__MessageTransition__Group_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1372:1: ( rule__MessageTransition__Group_2_5__1__Impl )
            // InternalStateDef.g:1373:2: rule__MessageTransition__Group_2_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageTransition__Group_2_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_5__1"


    // $ANTLR start "rule__MessageTransition__Group_2_5__1__Impl"
    // InternalStateDef.g:1379:1: rule__MessageTransition__Group_2_5__1__Impl : ( ( rule__MessageTransition__NextStateAssignment_2_5_1 ) ) ;
    public final void rule__MessageTransition__Group_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1383:1: ( ( ( rule__MessageTransition__NextStateAssignment_2_5_1 ) ) )
            // InternalStateDef.g:1384:1: ( ( rule__MessageTransition__NextStateAssignment_2_5_1 ) )
            {
            // InternalStateDef.g:1384:1: ( ( rule__MessageTransition__NextStateAssignment_2_5_1 ) )
            // InternalStateDef.g:1385:2: ( rule__MessageTransition__NextStateAssignment_2_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getNextStateAssignment_2_5_1()); 
            }
            // InternalStateDef.g:1386:2: ( rule__MessageTransition__NextStateAssignment_2_5_1 )
            // InternalStateDef.g:1386:3: rule__MessageTransition__NextStateAssignment_2_5_1
            {
            pushFollow(FOLLOW_2);
            rule__MessageTransition__NextStateAssignment_2_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getNextStateAssignment_2_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__Group_2_5__1__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // InternalStateDef.g:1395:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1399:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalStateDef.g:1400:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Message__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Message__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // InternalStateDef.g:1407:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1411:1: ( ( 'message' ) )
            // InternalStateDef.g:1412:1: ( 'message' )
            {
            // InternalStateDef.g:1412:1: ( 'message' )
            // InternalStateDef.g:1413:2: 'message'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getMessageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // InternalStateDef.g:1422:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1426:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalStateDef.g:1427:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Message__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Message__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // InternalStateDef.g:1434:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1438:1: ( ( ( rule__Message__NameAssignment_1 ) ) )
            // InternalStateDef.g:1439:1: ( ( rule__Message__NameAssignment_1 ) )
            {
            // InternalStateDef.g:1439:1: ( ( rule__Message__NameAssignment_1 ) )
            // InternalStateDef.g:1440:2: ( rule__Message__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            }
            // InternalStateDef.g:1441:2: ( rule__Message__NameAssignment_1 )
            // InternalStateDef.g:1441:3: rule__Message__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Message__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__2"
    // InternalStateDef.g:1449:1: rule__Message__Group__2 : rule__Message__Group__2__Impl ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1453:1: ( rule__Message__Group__2__Impl )
            // InternalStateDef.g:1454:2: rule__Message__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2"


    // $ANTLR start "rule__Message__Group__2__Impl"
    // InternalStateDef.g:1460:1: rule__Message__Group__2__Impl : ( ( rule__Message__Group_2__0 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1464:1: ( ( ( rule__Message__Group_2__0 )? ) )
            // InternalStateDef.g:1465:1: ( ( rule__Message__Group_2__0 )? )
            {
            // InternalStateDef.g:1465:1: ( ( rule__Message__Group_2__0 )? )
            // InternalStateDef.g:1466:2: ( rule__Message__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getGroup_2()); 
            }
            // InternalStateDef.g:1467:2: ( rule__Message__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==15) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalStateDef.g:1467:3: rule__Message__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2__Impl"


    // $ANTLR start "rule__Message__Group_2__0"
    // InternalStateDef.g:1476:1: rule__Message__Group_2__0 : rule__Message__Group_2__0__Impl rule__Message__Group_2__1 ;
    public final void rule__Message__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1480:1: ( rule__Message__Group_2__0__Impl rule__Message__Group_2__1 )
            // InternalStateDef.g:1481:2: rule__Message__Group_2__0__Impl rule__Message__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Message__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Message__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__0"


    // $ANTLR start "rule__Message__Group_2__0__Impl"
    // InternalStateDef.g:1488:1: rule__Message__Group_2__0__Impl : ( 'struct' ) ;
    public final void rule__Message__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1492:1: ( ( 'struct' ) )
            // InternalStateDef.g:1493:1: ( 'struct' )
            {
            // InternalStateDef.g:1493:1: ( 'struct' )
            // InternalStateDef.g:1494:2: 'struct'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getStructKeyword_2_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getStructKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__0__Impl"


    // $ANTLR start "rule__Message__Group_2__1"
    // InternalStateDef.g:1503:1: rule__Message__Group_2__1 : rule__Message__Group_2__1__Impl ;
    public final void rule__Message__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1507:1: ( rule__Message__Group_2__1__Impl )
            // InternalStateDef.g:1508:2: rule__Message__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__1"


    // $ANTLR start "rule__Message__Group_2__1__Impl"
    // InternalStateDef.g:1514:1: rule__Message__Group_2__1__Impl : ( ( rule__Message__Group_2_1__0 ) ) ;
    public final void rule__Message__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1518:1: ( ( ( rule__Message__Group_2_1__0 ) ) )
            // InternalStateDef.g:1519:1: ( ( rule__Message__Group_2_1__0 ) )
            {
            // InternalStateDef.g:1519:1: ( ( rule__Message__Group_2_1__0 ) )
            // InternalStateDef.g:1520:2: ( rule__Message__Group_2_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getGroup_2_1()); 
            }
            // InternalStateDef.g:1521:2: ( rule__Message__Group_2_1__0 )
            // InternalStateDef.g:1521:3: rule__Message__Group_2_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group_2_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__1__Impl"


    // $ANTLR start "rule__Message__Group_2_1__0"
    // InternalStateDef.g:1530:1: rule__Message__Group_2_1__0 : rule__Message__Group_2_1__0__Impl rule__Message__Group_2_1__1 ;
    public final void rule__Message__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1534:1: ( rule__Message__Group_2_1__0__Impl rule__Message__Group_2_1__1 )
            // InternalStateDef.g:1535:2: rule__Message__Group_2_1__0__Impl rule__Message__Group_2_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Message__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Message__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2_1__0"


    // $ANTLR start "rule__Message__Group_2_1__0__Impl"
    // InternalStateDef.g:1542:1: rule__Message__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__Message__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1546:1: ( ( '{' ) )
            // InternalStateDef.g:1547:1: ( '{' )
            {
            // InternalStateDef.g:1547:1: ( '{' )
            // InternalStateDef.g:1548:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2_1__0__Impl"


    // $ANTLR start "rule__Message__Group_2_1__1"
    // InternalStateDef.g:1557:1: rule__Message__Group_2_1__1 : rule__Message__Group_2_1__1__Impl rule__Message__Group_2_1__2 ;
    public final void rule__Message__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1561:1: ( rule__Message__Group_2_1__1__Impl rule__Message__Group_2_1__2 )
            // InternalStateDef.g:1562:2: rule__Message__Group_2_1__1__Impl rule__Message__Group_2_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Message__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Message__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2_1__1"


    // $ANTLR start "rule__Message__Group_2_1__1__Impl"
    // InternalStateDef.g:1569:1: rule__Message__Group_2_1__1__Impl : ( ( ( rule__Message__StructEntriesAssignment_2_1_1 ) ) ( ( rule__Message__StructEntriesAssignment_2_1_1 )* ) ) ;
    public final void rule__Message__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1573:1: ( ( ( ( rule__Message__StructEntriesAssignment_2_1_1 ) ) ( ( rule__Message__StructEntriesAssignment_2_1_1 )* ) ) )
            // InternalStateDef.g:1574:1: ( ( ( rule__Message__StructEntriesAssignment_2_1_1 ) ) ( ( rule__Message__StructEntriesAssignment_2_1_1 )* ) )
            {
            // InternalStateDef.g:1574:1: ( ( ( rule__Message__StructEntriesAssignment_2_1_1 ) ) ( ( rule__Message__StructEntriesAssignment_2_1_1 )* ) )
            // InternalStateDef.g:1575:2: ( ( rule__Message__StructEntriesAssignment_2_1_1 ) ) ( ( rule__Message__StructEntriesAssignment_2_1_1 )* )
            {
            // InternalStateDef.g:1575:2: ( ( rule__Message__StructEntriesAssignment_2_1_1 ) )
            // InternalStateDef.g:1576:3: ( rule__Message__StructEntriesAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getStructEntriesAssignment_2_1_1()); 
            }
            // InternalStateDef.g:1577:3: ( rule__Message__StructEntriesAssignment_2_1_1 )
            // InternalStateDef.g:1577:4: rule__Message__StructEntriesAssignment_2_1_1
            {
            pushFollow(FOLLOW_18);
            rule__Message__StructEntriesAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getStructEntriesAssignment_2_1_1()); 
            }

            }

            // InternalStateDef.g:1580:2: ( ( rule__Message__StructEntriesAssignment_2_1_1 )* )
            // InternalStateDef.g:1581:3: ( rule__Message__StructEntriesAssignment_2_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getStructEntriesAssignment_2_1_1()); 
            }
            // InternalStateDef.g:1582:3: ( rule__Message__StructEntriesAssignment_2_1_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_DATATYPE)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalStateDef.g:1582:4: rule__Message__StructEntriesAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Message__StructEntriesAssignment_2_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getStructEntriesAssignment_2_1_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2_1__1__Impl"


    // $ANTLR start "rule__Message__Group_2_1__2"
    // InternalStateDef.g:1591:1: rule__Message__Group_2_1__2 : rule__Message__Group_2_1__2__Impl ;
    public final void rule__Message__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1595:1: ( rule__Message__Group_2_1__2__Impl )
            // InternalStateDef.g:1596:2: rule__Message__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2_1__2"


    // $ANTLR start "rule__Message__Group_2_1__2__Impl"
    // InternalStateDef.g:1602:1: rule__Message__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__Message__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1606:1: ( ( '}' ) )
            // InternalStateDef.g:1607:1: ( '}' )
            {
            // InternalStateDef.g:1607:1: ( '}' )
            // InternalStateDef.g:1608:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_2_1_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2_1__2__Impl"


    // $ANTLR start "rule__MessageStruct__Group__0"
    // InternalStateDef.g:1618:1: rule__MessageStruct__Group__0 : rule__MessageStruct__Group__0__Impl rule__MessageStruct__Group__1 ;
    public final void rule__MessageStruct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1622:1: ( rule__MessageStruct__Group__0__Impl rule__MessageStruct__Group__1 )
            // InternalStateDef.g:1623:2: rule__MessageStruct__Group__0__Impl rule__MessageStruct__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MessageStruct__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageStruct__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStruct__Group__0"


    // $ANTLR start "rule__MessageStruct__Group__0__Impl"
    // InternalStateDef.g:1630:1: rule__MessageStruct__Group__0__Impl : ( 'struct' ) ;
    public final void rule__MessageStruct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1634:1: ( ( 'struct' ) )
            // InternalStateDef.g:1635:1: ( 'struct' )
            {
            // InternalStateDef.g:1635:1: ( 'struct' )
            // InternalStateDef.g:1636:2: 'struct'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructAccess().getStructKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructAccess().getStructKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStruct__Group__0__Impl"


    // $ANTLR start "rule__MessageStruct__Group__1"
    // InternalStateDef.g:1645:1: rule__MessageStruct__Group__1 : rule__MessageStruct__Group__1__Impl rule__MessageStruct__Group__2 ;
    public final void rule__MessageStruct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1649:1: ( rule__MessageStruct__Group__1__Impl rule__MessageStruct__Group__2 )
            // InternalStateDef.g:1650:2: rule__MessageStruct__Group__1__Impl rule__MessageStruct__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MessageStruct__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageStruct__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStruct__Group__1"


    // $ANTLR start "rule__MessageStruct__Group__1__Impl"
    // InternalStateDef.g:1657:1: rule__MessageStruct__Group__1__Impl : ( ( rule__MessageStruct__NameAssignment_1 ) ) ;
    public final void rule__MessageStruct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1661:1: ( ( ( rule__MessageStruct__NameAssignment_1 ) ) )
            // InternalStateDef.g:1662:1: ( ( rule__MessageStruct__NameAssignment_1 ) )
            {
            // InternalStateDef.g:1662:1: ( ( rule__MessageStruct__NameAssignment_1 ) )
            // InternalStateDef.g:1663:2: ( rule__MessageStruct__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructAccess().getNameAssignment_1()); 
            }
            // InternalStateDef.g:1664:2: ( rule__MessageStruct__NameAssignment_1 )
            // InternalStateDef.g:1664:3: rule__MessageStruct__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MessageStruct__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStruct__Group__1__Impl"


    // $ANTLR start "rule__MessageStruct__Group__2"
    // InternalStateDef.g:1672:1: rule__MessageStruct__Group__2 : rule__MessageStruct__Group__2__Impl ;
    public final void rule__MessageStruct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1676:1: ( rule__MessageStruct__Group__2__Impl )
            // InternalStateDef.g:1677:2: rule__MessageStruct__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageStruct__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStruct__Group__2"


    // $ANTLR start "rule__MessageStruct__Group__2__Impl"
    // InternalStateDef.g:1683:1: rule__MessageStruct__Group__2__Impl : ( ( rule__MessageStruct__Group_2__0 )? ) ;
    public final void rule__MessageStruct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1687:1: ( ( ( rule__MessageStruct__Group_2__0 )? ) )
            // InternalStateDef.g:1688:1: ( ( rule__MessageStruct__Group_2__0 )? )
            {
            // InternalStateDef.g:1688:1: ( ( rule__MessageStruct__Group_2__0 )? )
            // InternalStateDef.g:1689:2: ( rule__MessageStruct__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructAccess().getGroup_2()); 
            }
            // InternalStateDef.g:1690:2: ( rule__MessageStruct__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalStateDef.g:1690:3: rule__MessageStruct__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageStruct__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStruct__Group__2__Impl"


    // $ANTLR start "rule__MessageStruct__Group_2__0"
    // InternalStateDef.g:1699:1: rule__MessageStruct__Group_2__0 : rule__MessageStruct__Group_2__0__Impl rule__MessageStruct__Group_2__1 ;
    public final void rule__MessageStruct__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1703:1: ( rule__MessageStruct__Group_2__0__Impl rule__MessageStruct__Group_2__1 )
            // InternalStateDef.g:1704:2: rule__MessageStruct__Group_2__0__Impl rule__MessageStruct__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__MessageStruct__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageStruct__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStruct__Group_2__0"


    // $ANTLR start "rule__MessageStruct__Group_2__0__Impl"
    // InternalStateDef.g:1711:1: rule__MessageStruct__Group_2__0__Impl : ( '{' ) ;
    public final void rule__MessageStruct__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1715:1: ( ( '{' ) )
            // InternalStateDef.g:1716:1: ( '{' )
            {
            // InternalStateDef.g:1716:1: ( '{' )
            // InternalStateDef.g:1717:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructAccess().getLeftCurlyBracketKeyword_2_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructAccess().getLeftCurlyBracketKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStruct__Group_2__0__Impl"


    // $ANTLR start "rule__MessageStruct__Group_2__1"
    // InternalStateDef.g:1726:1: rule__MessageStruct__Group_2__1 : rule__MessageStruct__Group_2__1__Impl rule__MessageStruct__Group_2__2 ;
    public final void rule__MessageStruct__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1730:1: ( rule__MessageStruct__Group_2__1__Impl rule__MessageStruct__Group_2__2 )
            // InternalStateDef.g:1731:2: rule__MessageStruct__Group_2__1__Impl rule__MessageStruct__Group_2__2
            {
            pushFollow(FOLLOW_19);
            rule__MessageStruct__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageStruct__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStruct__Group_2__1"


    // $ANTLR start "rule__MessageStruct__Group_2__1__Impl"
    // InternalStateDef.g:1738:1: rule__MessageStruct__Group_2__1__Impl : ( ( rule__MessageStruct__StructEntriesAssignment_2_1 )* ) ;
    public final void rule__MessageStruct__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1742:1: ( ( ( rule__MessageStruct__StructEntriesAssignment_2_1 )* ) )
            // InternalStateDef.g:1743:1: ( ( rule__MessageStruct__StructEntriesAssignment_2_1 )* )
            {
            // InternalStateDef.g:1743:1: ( ( rule__MessageStruct__StructEntriesAssignment_2_1 )* )
            // InternalStateDef.g:1744:2: ( rule__MessageStruct__StructEntriesAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructAccess().getStructEntriesAssignment_2_1()); 
            }
            // InternalStateDef.g:1745:2: ( rule__MessageStruct__StructEntriesAssignment_2_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_DATATYPE)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalStateDef.g:1745:3: rule__MessageStruct__StructEntriesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__MessageStruct__StructEntriesAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructAccess().getStructEntriesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStruct__Group_2__1__Impl"


    // $ANTLR start "rule__MessageStruct__Group_2__2"
    // InternalStateDef.g:1753:1: rule__MessageStruct__Group_2__2 : rule__MessageStruct__Group_2__2__Impl ;
    public final void rule__MessageStruct__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1757:1: ( rule__MessageStruct__Group_2__2__Impl )
            // InternalStateDef.g:1758:2: rule__MessageStruct__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageStruct__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStruct__Group_2__2"


    // $ANTLR start "rule__MessageStruct__Group_2__2__Impl"
    // InternalStateDef.g:1764:1: rule__MessageStruct__Group_2__2__Impl : ( '}' ) ;
    public final void rule__MessageStruct__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1768:1: ( ( '}' ) )
            // InternalStateDef.g:1769:1: ( '}' )
            {
            // InternalStateDef.g:1769:1: ( '}' )
            // InternalStateDef.g:1770:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructAccess().getRightCurlyBracketKeyword_2_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructAccess().getRightCurlyBracketKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStruct__Group_2__2__Impl"


    // $ANTLR start "rule__MessageStructEntry__Group__0"
    // InternalStateDef.g:1780:1: rule__MessageStructEntry__Group__0 : rule__MessageStructEntry__Group__0__Impl rule__MessageStructEntry__Group__1 ;
    public final void rule__MessageStructEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1784:1: ( rule__MessageStructEntry__Group__0__Impl rule__MessageStructEntry__Group__1 )
            // InternalStateDef.g:1785:2: rule__MessageStructEntry__Group__0__Impl rule__MessageStructEntry__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MessageStructEntry__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageStructEntry__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group__0"


    // $ANTLR start "rule__MessageStructEntry__Group__0__Impl"
    // InternalStateDef.g:1792:1: rule__MessageStructEntry__Group__0__Impl : ( ( rule__MessageStructEntry__Alternatives_0 ) ) ;
    public final void rule__MessageStructEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1796:1: ( ( ( rule__MessageStructEntry__Alternatives_0 ) ) )
            // InternalStateDef.g:1797:1: ( ( rule__MessageStructEntry__Alternatives_0 ) )
            {
            // InternalStateDef.g:1797:1: ( ( rule__MessageStructEntry__Alternatives_0 ) )
            // InternalStateDef.g:1798:2: ( rule__MessageStructEntry__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getAlternatives_0()); 
            }
            // InternalStateDef.g:1799:2: ( rule__MessageStructEntry__Alternatives_0 )
            // InternalStateDef.g:1799:3: rule__MessageStructEntry__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__MessageStructEntry__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group__0__Impl"


    // $ANTLR start "rule__MessageStructEntry__Group__1"
    // InternalStateDef.g:1807:1: rule__MessageStructEntry__Group__1 : rule__MessageStructEntry__Group__1__Impl rule__MessageStructEntry__Group__2 ;
    public final void rule__MessageStructEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1811:1: ( rule__MessageStructEntry__Group__1__Impl rule__MessageStructEntry__Group__2 )
            // InternalStateDef.g:1812:2: rule__MessageStructEntry__Group__1__Impl rule__MessageStructEntry__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__MessageStructEntry__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageStructEntry__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group__1"


    // $ANTLR start "rule__MessageStructEntry__Group__1__Impl"
    // InternalStateDef.g:1819:1: rule__MessageStructEntry__Group__1__Impl : ( ( rule__MessageStructEntry__NameAssignment_1 ) ) ;
    public final void rule__MessageStructEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1823:1: ( ( ( rule__MessageStructEntry__NameAssignment_1 ) ) )
            // InternalStateDef.g:1824:1: ( ( rule__MessageStructEntry__NameAssignment_1 ) )
            {
            // InternalStateDef.g:1824:1: ( ( rule__MessageStructEntry__NameAssignment_1 ) )
            // InternalStateDef.g:1825:2: ( rule__MessageStructEntry__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getNameAssignment_1()); 
            }
            // InternalStateDef.g:1826:2: ( rule__MessageStructEntry__NameAssignment_1 )
            // InternalStateDef.g:1826:3: rule__MessageStructEntry__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MessageStructEntry__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group__1__Impl"


    // $ANTLR start "rule__MessageStructEntry__Group__2"
    // InternalStateDef.g:1834:1: rule__MessageStructEntry__Group__2 : rule__MessageStructEntry__Group__2__Impl rule__MessageStructEntry__Group__3 ;
    public final void rule__MessageStructEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1838:1: ( rule__MessageStructEntry__Group__2__Impl rule__MessageStructEntry__Group__3 )
            // InternalStateDef.g:1839:2: rule__MessageStructEntry__Group__2__Impl rule__MessageStructEntry__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__MessageStructEntry__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageStructEntry__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group__2"


    // $ANTLR start "rule__MessageStructEntry__Group__2__Impl"
    // InternalStateDef.g:1846:1: rule__MessageStructEntry__Group__2__Impl : ( ( rule__MessageStructEntry__Alternatives_2 )? ) ;
    public final void rule__MessageStructEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1850:1: ( ( ( rule__MessageStructEntry__Alternatives_2 )? ) )
            // InternalStateDef.g:1851:1: ( ( rule__MessageStructEntry__Alternatives_2 )? )
            {
            // InternalStateDef.g:1851:1: ( ( rule__MessageStructEntry__Alternatives_2 )? )
            // InternalStateDef.g:1852:2: ( rule__MessageStructEntry__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getAlternatives_2()); 
            }
            // InternalStateDef.g:1853:2: ( rule__MessageStructEntry__Alternatives_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31||LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalStateDef.g:1853:3: rule__MessageStructEntry__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageStructEntry__Alternatives_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group__2__Impl"


    // $ANTLR start "rule__MessageStructEntry__Group__3"
    // InternalStateDef.g:1861:1: rule__MessageStructEntry__Group__3 : rule__MessageStructEntry__Group__3__Impl rule__MessageStructEntry__Group__4 ;
    public final void rule__MessageStructEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1865:1: ( rule__MessageStructEntry__Group__3__Impl rule__MessageStructEntry__Group__4 )
            // InternalStateDef.g:1866:2: rule__MessageStructEntry__Group__3__Impl rule__MessageStructEntry__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__MessageStructEntry__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageStructEntry__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group__3"


    // $ANTLR start "rule__MessageStructEntry__Group__3__Impl"
    // InternalStateDef.g:1873:1: rule__MessageStructEntry__Group__3__Impl : ( ( rule__MessageStructEntry__Group_3__0 )? ) ;
    public final void rule__MessageStructEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1877:1: ( ( ( rule__MessageStructEntry__Group_3__0 )? ) )
            // InternalStateDef.g:1878:1: ( ( rule__MessageStructEntry__Group_3__0 )? )
            {
            // InternalStateDef.g:1878:1: ( ( rule__MessageStructEntry__Group_3__0 )? )
            // InternalStateDef.g:1879:2: ( rule__MessageStructEntry__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getGroup_3()); 
            }
            // InternalStateDef.g:1880:2: ( rule__MessageStructEntry__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalStateDef.g:1880:3: rule__MessageStructEntry__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageStructEntry__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group__3__Impl"


    // $ANTLR start "rule__MessageStructEntry__Group__4"
    // InternalStateDef.g:1888:1: rule__MessageStructEntry__Group__4 : rule__MessageStructEntry__Group__4__Impl ;
    public final void rule__MessageStructEntry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1892:1: ( rule__MessageStructEntry__Group__4__Impl )
            // InternalStateDef.g:1893:2: rule__MessageStructEntry__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageStructEntry__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group__4"


    // $ANTLR start "rule__MessageStructEntry__Group__4__Impl"
    // InternalStateDef.g:1899:1: rule__MessageStructEntry__Group__4__Impl : ( ';' ) ;
    public final void rule__MessageStructEntry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1903:1: ( ( ';' ) )
            // InternalStateDef.g:1904:1: ( ';' )
            {
            // InternalStateDef.g:1904:1: ( ';' )
            // InternalStateDef.g:1905:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getSemicolonKeyword_4()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group__4__Impl"


    // $ANTLR start "rule__MessageStructEntry__Group_3__0"
    // InternalStateDef.g:1915:1: rule__MessageStructEntry__Group_3__0 : rule__MessageStructEntry__Group_3__0__Impl rule__MessageStructEntry__Group_3__1 ;
    public final void rule__MessageStructEntry__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1919:1: ( rule__MessageStructEntry__Group_3__0__Impl rule__MessageStructEntry__Group_3__1 )
            // InternalStateDef.g:1920:2: rule__MessageStructEntry__Group_3__0__Impl rule__MessageStructEntry__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__MessageStructEntry__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageStructEntry__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group_3__0"


    // $ANTLR start "rule__MessageStructEntry__Group_3__0__Impl"
    // InternalStateDef.g:1927:1: rule__MessageStructEntry__Group_3__0__Impl : ( '=' ) ;
    public final void rule__MessageStructEntry__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1931:1: ( ( '=' ) )
            // InternalStateDef.g:1932:1: ( '=' )
            {
            // InternalStateDef.g:1932:1: ( '=' )
            // InternalStateDef.g:1933:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getEqualsSignKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getEqualsSignKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group_3__0__Impl"


    // $ANTLR start "rule__MessageStructEntry__Group_3__1"
    // InternalStateDef.g:1942:1: rule__MessageStructEntry__Group_3__1 : rule__MessageStructEntry__Group_3__1__Impl ;
    public final void rule__MessageStructEntry__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1946:1: ( rule__MessageStructEntry__Group_3__1__Impl )
            // InternalStateDef.g:1947:2: rule__MessageStructEntry__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageStructEntry__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group_3__1"


    // $ANTLR start "rule__MessageStructEntry__Group_3__1__Impl"
    // InternalStateDef.g:1953:1: rule__MessageStructEntry__Group_3__1__Impl : ( ( ( rule__MessageStructEntry__Group_3_1__0 ) ) ( ( rule__MessageStructEntry__Group_3_1__0 )* ) ) ;
    public final void rule__MessageStructEntry__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1957:1: ( ( ( ( rule__MessageStructEntry__Group_3_1__0 ) ) ( ( rule__MessageStructEntry__Group_3_1__0 )* ) ) )
            // InternalStateDef.g:1958:1: ( ( ( rule__MessageStructEntry__Group_3_1__0 ) ) ( ( rule__MessageStructEntry__Group_3_1__0 )* ) )
            {
            // InternalStateDef.g:1958:1: ( ( ( rule__MessageStructEntry__Group_3_1__0 ) ) ( ( rule__MessageStructEntry__Group_3_1__0 )* ) )
            // InternalStateDef.g:1959:2: ( ( rule__MessageStructEntry__Group_3_1__0 ) ) ( ( rule__MessageStructEntry__Group_3_1__0 )* )
            {
            // InternalStateDef.g:1959:2: ( ( rule__MessageStructEntry__Group_3_1__0 ) )
            // InternalStateDef.g:1960:3: ( rule__MessageStructEntry__Group_3_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getGroup_3_1()); 
            }
            // InternalStateDef.g:1961:3: ( rule__MessageStructEntry__Group_3_1__0 )
            // InternalStateDef.g:1961:4: rule__MessageStructEntry__Group_3_1__0
            {
            pushFollow(FOLLOW_23);
            rule__MessageStructEntry__Group_3_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getGroup_3_1()); 
            }

            }

            // InternalStateDef.g:1964:2: ( ( rule__MessageStructEntry__Group_3_1__0 )* )
            // InternalStateDef.g:1965:3: ( rule__MessageStructEntry__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getGroup_3_1()); 
            }
            // InternalStateDef.g:1966:3: ( rule__MessageStructEntry__Group_3_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ENUMNAME||LA18_0==RULE_HEX||LA18_0==15||LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalStateDef.g:1966:4: rule__MessageStructEntry__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__MessageStructEntry__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getGroup_3_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group_3__1__Impl"


    // $ANTLR start "rule__MessageStructEntry__Group_3_1__0"
    // InternalStateDef.g:1976:1: rule__MessageStructEntry__Group_3_1__0 : rule__MessageStructEntry__Group_3_1__0__Impl rule__MessageStructEntry__Group_3_1__1 ;
    public final void rule__MessageStructEntry__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1980:1: ( rule__MessageStructEntry__Group_3_1__0__Impl rule__MessageStructEntry__Group_3_1__1 )
            // InternalStateDef.g:1981:2: rule__MessageStructEntry__Group_3_1__0__Impl rule__MessageStructEntry__Group_3_1__1
            {
            pushFollow(FOLLOW_24);
            rule__MessageStructEntry__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageStructEntry__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group_3_1__0"


    // $ANTLR start "rule__MessageStructEntry__Group_3_1__0__Impl"
    // InternalStateDef.g:1988:1: rule__MessageStructEntry__Group_3_1__0__Impl : ( ( rule__MessageStructEntry__DataAssignmentAssignment_3_1_0 ) ) ;
    public final void rule__MessageStructEntry__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:1992:1: ( ( ( rule__MessageStructEntry__DataAssignmentAssignment_3_1_0 ) ) )
            // InternalStateDef.g:1993:1: ( ( rule__MessageStructEntry__DataAssignmentAssignment_3_1_0 ) )
            {
            // InternalStateDef.g:1993:1: ( ( rule__MessageStructEntry__DataAssignmentAssignment_3_1_0 ) )
            // InternalStateDef.g:1994:2: ( rule__MessageStructEntry__DataAssignmentAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getDataAssignmentAssignment_3_1_0()); 
            }
            // InternalStateDef.g:1995:2: ( rule__MessageStructEntry__DataAssignmentAssignment_3_1_0 )
            // InternalStateDef.g:1995:3: rule__MessageStructEntry__DataAssignmentAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MessageStructEntry__DataAssignmentAssignment_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getDataAssignmentAssignment_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group_3_1__0__Impl"


    // $ANTLR start "rule__MessageStructEntry__Group_3_1__1"
    // InternalStateDef.g:2003:1: rule__MessageStructEntry__Group_3_1__1 : rule__MessageStructEntry__Group_3_1__1__Impl ;
    public final void rule__MessageStructEntry__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2007:1: ( rule__MessageStructEntry__Group_3_1__1__Impl )
            // InternalStateDef.g:2008:2: rule__MessageStructEntry__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageStructEntry__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group_3_1__1"


    // $ANTLR start "rule__MessageStructEntry__Group_3_1__1__Impl"
    // InternalStateDef.g:2014:1: rule__MessageStructEntry__Group_3_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__MessageStructEntry__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2018:1: ( ( ( ',' )? ) )
            // InternalStateDef.g:2019:1: ( ( ',' )? )
            {
            // InternalStateDef.g:2019:1: ( ( ',' )? )
            // InternalStateDef.g:2020:2: ( ',' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getCommaKeyword_3_1_1()); 
            }
            // InternalStateDef.g:2021:2: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalStateDef.g:2021:3: ','
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getCommaKeyword_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__Group_3_1__1__Impl"


    // $ANTLR start "rule__MessageByteRange__Group__0"
    // InternalStateDef.g:2030:1: rule__MessageByteRange__Group__0 : rule__MessageByteRange__Group__0__Impl rule__MessageByteRange__Group__1 ;
    public final void rule__MessageByteRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2034:1: ( rule__MessageByteRange__Group__0__Impl rule__MessageByteRange__Group__1 )
            // InternalStateDef.g:2035:2: rule__MessageByteRange__Group__0__Impl rule__MessageByteRange__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__MessageByteRange__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageByteRange__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteRange__Group__0"


    // $ANTLR start "rule__MessageByteRange__Group__0__Impl"
    // InternalStateDef.g:2042:1: rule__MessageByteRange__Group__0__Impl : ( '<' ) ;
    public final void rule__MessageByteRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2046:1: ( ( '<' ) )
            // InternalStateDef.g:2047:1: ( '<' )
            {
            // InternalStateDef.g:2047:1: ( '<' )
            // InternalStateDef.g:2048:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageByteRangeAccess().getLessThanSignKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageByteRangeAccess().getLessThanSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteRange__Group__0__Impl"


    // $ANTLR start "rule__MessageByteRange__Group__1"
    // InternalStateDef.g:2057:1: rule__MessageByteRange__Group__1 : rule__MessageByteRange__Group__1__Impl rule__MessageByteRange__Group__2 ;
    public final void rule__MessageByteRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2061:1: ( rule__MessageByteRange__Group__1__Impl rule__MessageByteRange__Group__2 )
            // InternalStateDef.g:2062:2: rule__MessageByteRange__Group__1__Impl rule__MessageByteRange__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__MessageByteRange__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageByteRange__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteRange__Group__1"


    // $ANTLR start "rule__MessageByteRange__Group__1__Impl"
    // InternalStateDef.g:2069:1: rule__MessageByteRange__Group__1__Impl : ( ( rule__MessageByteRange__StartAssignment_1 ) ) ;
    public final void rule__MessageByteRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2073:1: ( ( ( rule__MessageByteRange__StartAssignment_1 ) ) )
            // InternalStateDef.g:2074:1: ( ( rule__MessageByteRange__StartAssignment_1 ) )
            {
            // InternalStateDef.g:2074:1: ( ( rule__MessageByteRange__StartAssignment_1 ) )
            // InternalStateDef.g:2075:2: ( rule__MessageByteRange__StartAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageByteRangeAccess().getStartAssignment_1()); 
            }
            // InternalStateDef.g:2076:2: ( rule__MessageByteRange__StartAssignment_1 )
            // InternalStateDef.g:2076:3: rule__MessageByteRange__StartAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MessageByteRange__StartAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageByteRangeAccess().getStartAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteRange__Group__1__Impl"


    // $ANTLR start "rule__MessageByteRange__Group__2"
    // InternalStateDef.g:2084:1: rule__MessageByteRange__Group__2 : rule__MessageByteRange__Group__2__Impl rule__MessageByteRange__Group__3 ;
    public final void rule__MessageByteRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2088:1: ( rule__MessageByteRange__Group__2__Impl rule__MessageByteRange__Group__3 )
            // InternalStateDef.g:2089:2: rule__MessageByteRange__Group__2__Impl rule__MessageByteRange__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__MessageByteRange__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageByteRange__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteRange__Group__2"


    // $ANTLR start "rule__MessageByteRange__Group__2__Impl"
    // InternalStateDef.g:2096:1: rule__MessageByteRange__Group__2__Impl : ( '..' ) ;
    public final void rule__MessageByteRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2100:1: ( ( '..' ) )
            // InternalStateDef.g:2101:1: ( '..' )
            {
            // InternalStateDef.g:2101:1: ( '..' )
            // InternalStateDef.g:2102:2: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageByteRangeAccess().getFullStopFullStopKeyword_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageByteRangeAccess().getFullStopFullStopKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteRange__Group__2__Impl"


    // $ANTLR start "rule__MessageByteRange__Group__3"
    // InternalStateDef.g:2111:1: rule__MessageByteRange__Group__3 : rule__MessageByteRange__Group__3__Impl rule__MessageByteRange__Group__4 ;
    public final void rule__MessageByteRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2115:1: ( rule__MessageByteRange__Group__3__Impl rule__MessageByteRange__Group__4 )
            // InternalStateDef.g:2116:2: rule__MessageByteRange__Group__3__Impl rule__MessageByteRange__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__MessageByteRange__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageByteRange__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteRange__Group__3"


    // $ANTLR start "rule__MessageByteRange__Group__3__Impl"
    // InternalStateDef.g:2123:1: rule__MessageByteRange__Group__3__Impl : ( ( rule__MessageByteRange__EndAssignment_3 ) ) ;
    public final void rule__MessageByteRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2127:1: ( ( ( rule__MessageByteRange__EndAssignment_3 ) ) )
            // InternalStateDef.g:2128:1: ( ( rule__MessageByteRange__EndAssignment_3 ) )
            {
            // InternalStateDef.g:2128:1: ( ( rule__MessageByteRange__EndAssignment_3 ) )
            // InternalStateDef.g:2129:2: ( rule__MessageByteRange__EndAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageByteRangeAccess().getEndAssignment_3()); 
            }
            // InternalStateDef.g:2130:2: ( rule__MessageByteRange__EndAssignment_3 )
            // InternalStateDef.g:2130:3: rule__MessageByteRange__EndAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MessageByteRange__EndAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageByteRangeAccess().getEndAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteRange__Group__3__Impl"


    // $ANTLR start "rule__MessageByteRange__Group__4"
    // InternalStateDef.g:2138:1: rule__MessageByteRange__Group__4 : rule__MessageByteRange__Group__4__Impl ;
    public final void rule__MessageByteRange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2142:1: ( rule__MessageByteRange__Group__4__Impl )
            // InternalStateDef.g:2143:2: rule__MessageByteRange__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageByteRange__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteRange__Group__4"


    // $ANTLR start "rule__MessageByteRange__Group__4__Impl"
    // InternalStateDef.g:2149:1: rule__MessageByteRange__Group__4__Impl : ( '>' ) ;
    public final void rule__MessageByteRange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2153:1: ( ( '>' ) )
            // InternalStateDef.g:2154:1: ( '>' )
            {
            // InternalStateDef.g:2154:1: ( '>' )
            // InternalStateDef.g:2155:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageByteRangeAccess().getGreaterThanSignKeyword_4()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageByteRangeAccess().getGreaterThanSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteRange__Group__4__Impl"


    // $ANTLR start "rule__MessageByteArray__Group__0"
    // InternalStateDef.g:2165:1: rule__MessageByteArray__Group__0 : rule__MessageByteArray__Group__0__Impl rule__MessageByteArray__Group__1 ;
    public final void rule__MessageByteArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2169:1: ( rule__MessageByteArray__Group__0__Impl rule__MessageByteArray__Group__1 )
            // InternalStateDef.g:2170:2: rule__MessageByteArray__Group__0__Impl rule__MessageByteArray__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__MessageByteArray__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageByteArray__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteArray__Group__0"


    // $ANTLR start "rule__MessageByteArray__Group__0__Impl"
    // InternalStateDef.g:2177:1: rule__MessageByteArray__Group__0__Impl : ( '[' ) ;
    public final void rule__MessageByteArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2181:1: ( ( '[' ) )
            // InternalStateDef.g:2182:1: ( '[' )
            {
            // InternalStateDef.g:2182:1: ( '[' )
            // InternalStateDef.g:2183:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageByteArrayAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageByteArrayAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteArray__Group__0__Impl"


    // $ANTLR start "rule__MessageByteArray__Group__1"
    // InternalStateDef.g:2192:1: rule__MessageByteArray__Group__1 : rule__MessageByteArray__Group__1__Impl rule__MessageByteArray__Group__2 ;
    public final void rule__MessageByteArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2196:1: ( rule__MessageByteArray__Group__1__Impl rule__MessageByteArray__Group__2 )
            // InternalStateDef.g:2197:2: rule__MessageByteArray__Group__1__Impl rule__MessageByteArray__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__MessageByteArray__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageByteArray__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteArray__Group__1"


    // $ANTLR start "rule__MessageByteArray__Group__1__Impl"
    // InternalStateDef.g:2204:1: rule__MessageByteArray__Group__1__Impl : ( ( rule__MessageByteArray__SizeAssignment_1 ) ) ;
    public final void rule__MessageByteArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2208:1: ( ( ( rule__MessageByteArray__SizeAssignment_1 ) ) )
            // InternalStateDef.g:2209:1: ( ( rule__MessageByteArray__SizeAssignment_1 ) )
            {
            // InternalStateDef.g:2209:1: ( ( rule__MessageByteArray__SizeAssignment_1 ) )
            // InternalStateDef.g:2210:2: ( rule__MessageByteArray__SizeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageByteArrayAccess().getSizeAssignment_1()); 
            }
            // InternalStateDef.g:2211:2: ( rule__MessageByteArray__SizeAssignment_1 )
            // InternalStateDef.g:2211:3: rule__MessageByteArray__SizeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MessageByteArray__SizeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageByteArrayAccess().getSizeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteArray__Group__1__Impl"


    // $ANTLR start "rule__MessageByteArray__Group__2"
    // InternalStateDef.g:2219:1: rule__MessageByteArray__Group__2 : rule__MessageByteArray__Group__2__Impl ;
    public final void rule__MessageByteArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2223:1: ( rule__MessageByteArray__Group__2__Impl )
            // InternalStateDef.g:2224:2: rule__MessageByteArray__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageByteArray__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteArray__Group__2"


    // $ANTLR start "rule__MessageByteArray__Group__2__Impl"
    // InternalStateDef.g:2230:1: rule__MessageByteArray__Group__2__Impl : ( ']' ) ;
    public final void rule__MessageByteArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2234:1: ( ( ']' ) )
            // InternalStateDef.g:2235:1: ( ']' )
            {
            // InternalStateDef.g:2235:1: ( ']' )
            // InternalStateDef.g:2236:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageByteArrayAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageByteArrayAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteArray__Group__2__Impl"


    // $ANTLR start "rule__MessageStructureStruct__Group__0"
    // InternalStateDef.g:2246:1: rule__MessageStructureStruct__Group__0 : rule__MessageStructureStruct__Group__0__Impl rule__MessageStructureStruct__Group__1 ;
    public final void rule__MessageStructureStruct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2250:1: ( rule__MessageStructureStruct__Group__0__Impl rule__MessageStructureStruct__Group__1 )
            // InternalStateDef.g:2251:2: rule__MessageStructureStruct__Group__0__Impl rule__MessageStructureStruct__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__MessageStructureStruct__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageStructureStruct__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureStruct__Group__0"


    // $ANTLR start "rule__MessageStructureStruct__Group__0__Impl"
    // InternalStateDef.g:2258:1: rule__MessageStructureStruct__Group__0__Impl : ( '{' ) ;
    public final void rule__MessageStructureStruct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2262:1: ( ( '{' ) )
            // InternalStateDef.g:2263:1: ( '{' )
            {
            // InternalStateDef.g:2263:1: ( '{' )
            // InternalStateDef.g:2264:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureStructAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureStructAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureStruct__Group__0__Impl"


    // $ANTLR start "rule__MessageStructureStruct__Group__1"
    // InternalStateDef.g:2273:1: rule__MessageStructureStruct__Group__1 : rule__MessageStructureStruct__Group__1__Impl rule__MessageStructureStruct__Group__2 ;
    public final void rule__MessageStructureStruct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2277:1: ( rule__MessageStructureStruct__Group__1__Impl rule__MessageStructureStruct__Group__2 )
            // InternalStateDef.g:2278:2: rule__MessageStructureStruct__Group__1__Impl rule__MessageStructureStruct__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__MessageStructureStruct__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageStructureStruct__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureStruct__Group__1"


    // $ANTLR start "rule__MessageStructureStruct__Group__1__Impl"
    // InternalStateDef.g:2285:1: rule__MessageStructureStruct__Group__1__Impl : ( ( ( rule__MessageStructureStruct__Group_1__0 ) ) ( ( rule__MessageStructureStruct__Group_1__0 )* ) ) ;
    public final void rule__MessageStructureStruct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2289:1: ( ( ( ( rule__MessageStructureStruct__Group_1__0 ) ) ( ( rule__MessageStructureStruct__Group_1__0 )* ) ) )
            // InternalStateDef.g:2290:1: ( ( ( rule__MessageStructureStruct__Group_1__0 ) ) ( ( rule__MessageStructureStruct__Group_1__0 )* ) )
            {
            // InternalStateDef.g:2290:1: ( ( ( rule__MessageStructureStruct__Group_1__0 ) ) ( ( rule__MessageStructureStruct__Group_1__0 )* ) )
            // InternalStateDef.g:2291:2: ( ( rule__MessageStructureStruct__Group_1__0 ) ) ( ( rule__MessageStructureStruct__Group_1__0 )* )
            {
            // InternalStateDef.g:2291:2: ( ( rule__MessageStructureStruct__Group_1__0 ) )
            // InternalStateDef.g:2292:3: ( rule__MessageStructureStruct__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureStructAccess().getGroup_1()); 
            }
            // InternalStateDef.g:2293:3: ( rule__MessageStructureStruct__Group_1__0 )
            // InternalStateDef.g:2293:4: rule__MessageStructureStruct__Group_1__0
            {
            pushFollow(FOLLOW_23);
            rule__MessageStructureStruct__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureStructAccess().getGroup_1()); 
            }

            }

            // InternalStateDef.g:2296:2: ( ( rule__MessageStructureStruct__Group_1__0 )* )
            // InternalStateDef.g:2297:3: ( rule__MessageStructureStruct__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureStructAccess().getGroup_1()); 
            }
            // InternalStateDef.g:2298:3: ( rule__MessageStructureStruct__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ENUMNAME||LA20_0==RULE_HEX||LA20_0==15||LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalStateDef.g:2298:4: rule__MessageStructureStruct__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__MessageStructureStruct__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureStructAccess().getGroup_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureStruct__Group__1__Impl"


    // $ANTLR start "rule__MessageStructureStruct__Group__2"
    // InternalStateDef.g:2307:1: rule__MessageStructureStruct__Group__2 : rule__MessageStructureStruct__Group__2__Impl ;
    public final void rule__MessageStructureStruct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2311:1: ( rule__MessageStructureStruct__Group__2__Impl )
            // InternalStateDef.g:2312:2: rule__MessageStructureStruct__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageStructureStruct__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureStruct__Group__2"


    // $ANTLR start "rule__MessageStructureStruct__Group__2__Impl"
    // InternalStateDef.g:2318:1: rule__MessageStructureStruct__Group__2__Impl : ( '}' ) ;
    public final void rule__MessageStructureStruct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2322:1: ( ( '}' ) )
            // InternalStateDef.g:2323:1: ( '}' )
            {
            // InternalStateDef.g:2323:1: ( '}' )
            // InternalStateDef.g:2324:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureStructAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureStructAccess().getRightCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureStruct__Group__2__Impl"


    // $ANTLR start "rule__MessageStructureStruct__Group_1__0"
    // InternalStateDef.g:2334:1: rule__MessageStructureStruct__Group_1__0 : rule__MessageStructureStruct__Group_1__0__Impl rule__MessageStructureStruct__Group_1__1 ;
    public final void rule__MessageStructureStruct__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2338:1: ( rule__MessageStructureStruct__Group_1__0__Impl rule__MessageStructureStruct__Group_1__1 )
            // InternalStateDef.g:2339:2: rule__MessageStructureStruct__Group_1__0__Impl rule__MessageStructureStruct__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__MessageStructureStruct__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageStructureStruct__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureStruct__Group_1__0"


    // $ANTLR start "rule__MessageStructureStruct__Group_1__0__Impl"
    // InternalStateDef.g:2346:1: rule__MessageStructureStruct__Group_1__0__Impl : ( ( rule__MessageStructureStruct__ValuesAssignment_1_0 ) ) ;
    public final void rule__MessageStructureStruct__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2350:1: ( ( ( rule__MessageStructureStruct__ValuesAssignment_1_0 ) ) )
            // InternalStateDef.g:2351:1: ( ( rule__MessageStructureStruct__ValuesAssignment_1_0 ) )
            {
            // InternalStateDef.g:2351:1: ( ( rule__MessageStructureStruct__ValuesAssignment_1_0 ) )
            // InternalStateDef.g:2352:2: ( rule__MessageStructureStruct__ValuesAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureStructAccess().getValuesAssignment_1_0()); 
            }
            // InternalStateDef.g:2353:2: ( rule__MessageStructureStruct__ValuesAssignment_1_0 )
            // InternalStateDef.g:2353:3: rule__MessageStructureStruct__ValuesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MessageStructureStruct__ValuesAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureStructAccess().getValuesAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureStruct__Group_1__0__Impl"


    // $ANTLR start "rule__MessageStructureStruct__Group_1__1"
    // InternalStateDef.g:2361:1: rule__MessageStructureStruct__Group_1__1 : rule__MessageStructureStruct__Group_1__1__Impl ;
    public final void rule__MessageStructureStruct__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2365:1: ( rule__MessageStructureStruct__Group_1__1__Impl )
            // InternalStateDef.g:2366:2: rule__MessageStructureStruct__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageStructureStruct__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureStruct__Group_1__1"


    // $ANTLR start "rule__MessageStructureStruct__Group_1__1__Impl"
    // InternalStateDef.g:2372:1: rule__MessageStructureStruct__Group_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__MessageStructureStruct__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2376:1: ( ( ( ',' )? ) )
            // InternalStateDef.g:2377:1: ( ( ',' )? )
            {
            // InternalStateDef.g:2377:1: ( ( ',' )? )
            // InternalStateDef.g:2378:2: ( ',' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureStructAccess().getCommaKeyword_1_1()); 
            }
            // InternalStateDef.g:2379:2: ( ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalStateDef.g:2379:3: ','
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureStructAccess().getCommaKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureStruct__Group_1__1__Impl"


    // $ANTLR start "rule__MessageStructureDatatype__Group_3__0"
    // InternalStateDef.g:2388:1: rule__MessageStructureDatatype__Group_3__0 : rule__MessageStructureDatatype__Group_3__0__Impl rule__MessageStructureDatatype__Group_3__1 ;
    public final void rule__MessageStructureDatatype__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2392:1: ( rule__MessageStructureDatatype__Group_3__0__Impl rule__MessageStructureDatatype__Group_3__1 )
            // InternalStateDef.g:2393:2: rule__MessageStructureDatatype__Group_3__0__Impl rule__MessageStructureDatatype__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__MessageStructureDatatype__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageStructureDatatype__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureDatatype__Group_3__0"


    // $ANTLR start "rule__MessageStructureDatatype__Group_3__0__Impl"
    // InternalStateDef.g:2400:1: rule__MessageStructureDatatype__Group_3__0__Impl : ( '[' ) ;
    public final void rule__MessageStructureDatatype__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2404:1: ( ( '[' ) )
            // InternalStateDef.g:2405:1: ( '[' )
            {
            // InternalStateDef.g:2405:1: ( '[' )
            // InternalStateDef.g:2406:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureDatatypeAccess().getLeftSquareBracketKeyword_3_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureDatatypeAccess().getLeftSquareBracketKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureDatatype__Group_3__0__Impl"


    // $ANTLR start "rule__MessageStructureDatatype__Group_3__1"
    // InternalStateDef.g:2415:1: rule__MessageStructureDatatype__Group_3__1 : rule__MessageStructureDatatype__Group_3__1__Impl rule__MessageStructureDatatype__Group_3__2 ;
    public final void rule__MessageStructureDatatype__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2419:1: ( rule__MessageStructureDatatype__Group_3__1__Impl rule__MessageStructureDatatype__Group_3__2 )
            // InternalStateDef.g:2420:2: rule__MessageStructureDatatype__Group_3__1__Impl rule__MessageStructureDatatype__Group_3__2
            {
            pushFollow(FOLLOW_28);
            rule__MessageStructureDatatype__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageStructureDatatype__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureDatatype__Group_3__1"


    // $ANTLR start "rule__MessageStructureDatatype__Group_3__1__Impl"
    // InternalStateDef.g:2427:1: rule__MessageStructureDatatype__Group_3__1__Impl : ( ( ( rule__MessageStructureDatatype__Group_3_1__0 ) ) ( ( rule__MessageStructureDatatype__Group_3_1__0 )* ) ) ;
    public final void rule__MessageStructureDatatype__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2431:1: ( ( ( ( rule__MessageStructureDatatype__Group_3_1__0 ) ) ( ( rule__MessageStructureDatatype__Group_3_1__0 )* ) ) )
            // InternalStateDef.g:2432:1: ( ( ( rule__MessageStructureDatatype__Group_3_1__0 ) ) ( ( rule__MessageStructureDatatype__Group_3_1__0 )* ) )
            {
            // InternalStateDef.g:2432:1: ( ( ( rule__MessageStructureDatatype__Group_3_1__0 ) ) ( ( rule__MessageStructureDatatype__Group_3_1__0 )* ) )
            // InternalStateDef.g:2433:2: ( ( rule__MessageStructureDatatype__Group_3_1__0 ) ) ( ( rule__MessageStructureDatatype__Group_3_1__0 )* )
            {
            // InternalStateDef.g:2433:2: ( ( rule__MessageStructureDatatype__Group_3_1__0 ) )
            // InternalStateDef.g:2434:3: ( rule__MessageStructureDatatype__Group_3_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureDatatypeAccess().getGroup_3_1()); 
            }
            // InternalStateDef.g:2435:3: ( rule__MessageStructureDatatype__Group_3_1__0 )
            // InternalStateDef.g:2435:4: rule__MessageStructureDatatype__Group_3_1__0
            {
            pushFollow(FOLLOW_23);
            rule__MessageStructureDatatype__Group_3_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureDatatypeAccess().getGroup_3_1()); 
            }

            }

            // InternalStateDef.g:2438:2: ( ( rule__MessageStructureDatatype__Group_3_1__0 )* )
            // InternalStateDef.g:2439:3: ( rule__MessageStructureDatatype__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureDatatypeAccess().getGroup_3_1()); 
            }
            // InternalStateDef.g:2440:3: ( rule__MessageStructureDatatype__Group_3_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ENUMNAME||LA22_0==RULE_HEX||LA22_0==15||LA22_0==34) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalStateDef.g:2440:4: rule__MessageStructureDatatype__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__MessageStructureDatatype__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureDatatypeAccess().getGroup_3_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureDatatype__Group_3__1__Impl"


    // $ANTLR start "rule__MessageStructureDatatype__Group_3__2"
    // InternalStateDef.g:2449:1: rule__MessageStructureDatatype__Group_3__2 : rule__MessageStructureDatatype__Group_3__2__Impl ;
    public final void rule__MessageStructureDatatype__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2453:1: ( rule__MessageStructureDatatype__Group_3__2__Impl )
            // InternalStateDef.g:2454:2: rule__MessageStructureDatatype__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageStructureDatatype__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureDatatype__Group_3__2"


    // $ANTLR start "rule__MessageStructureDatatype__Group_3__2__Impl"
    // InternalStateDef.g:2460:1: rule__MessageStructureDatatype__Group_3__2__Impl : ( ']' ) ;
    public final void rule__MessageStructureDatatype__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2464:1: ( ( ']' ) )
            // InternalStateDef.g:2465:1: ( ']' )
            {
            // InternalStateDef.g:2465:1: ( ']' )
            // InternalStateDef.g:2466:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureDatatypeAccess().getRightSquareBracketKeyword_3_2()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureDatatypeAccess().getRightSquareBracketKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureDatatype__Group_3__2__Impl"


    // $ANTLR start "rule__MessageStructureDatatype__Group_3_1__0"
    // InternalStateDef.g:2476:1: rule__MessageStructureDatatype__Group_3_1__0 : rule__MessageStructureDatatype__Group_3_1__0__Impl rule__MessageStructureDatatype__Group_3_1__1 ;
    public final void rule__MessageStructureDatatype__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2480:1: ( rule__MessageStructureDatatype__Group_3_1__0__Impl rule__MessageStructureDatatype__Group_3_1__1 )
            // InternalStateDef.g:2481:2: rule__MessageStructureDatatype__Group_3_1__0__Impl rule__MessageStructureDatatype__Group_3_1__1
            {
            pushFollow(FOLLOW_24);
            rule__MessageStructureDatatype__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageStructureDatatype__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureDatatype__Group_3_1__0"


    // $ANTLR start "rule__MessageStructureDatatype__Group_3_1__0__Impl"
    // InternalStateDef.g:2488:1: rule__MessageStructureDatatype__Group_3_1__0__Impl : ( ( rule__MessageStructureDatatype__ArrayValAssignment_3_1_0 ) ) ;
    public final void rule__MessageStructureDatatype__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2492:1: ( ( ( rule__MessageStructureDatatype__ArrayValAssignment_3_1_0 ) ) )
            // InternalStateDef.g:2493:1: ( ( rule__MessageStructureDatatype__ArrayValAssignment_3_1_0 ) )
            {
            // InternalStateDef.g:2493:1: ( ( rule__MessageStructureDatatype__ArrayValAssignment_3_1_0 ) )
            // InternalStateDef.g:2494:2: ( rule__MessageStructureDatatype__ArrayValAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureDatatypeAccess().getArrayValAssignment_3_1_0()); 
            }
            // InternalStateDef.g:2495:2: ( rule__MessageStructureDatatype__ArrayValAssignment_3_1_0 )
            // InternalStateDef.g:2495:3: rule__MessageStructureDatatype__ArrayValAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MessageStructureDatatype__ArrayValAssignment_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureDatatypeAccess().getArrayValAssignment_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureDatatype__Group_3_1__0__Impl"


    // $ANTLR start "rule__MessageStructureDatatype__Group_3_1__1"
    // InternalStateDef.g:2503:1: rule__MessageStructureDatatype__Group_3_1__1 : rule__MessageStructureDatatype__Group_3_1__1__Impl ;
    public final void rule__MessageStructureDatatype__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2507:1: ( rule__MessageStructureDatatype__Group_3_1__1__Impl )
            // InternalStateDef.g:2508:2: rule__MessageStructureDatatype__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageStructureDatatype__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureDatatype__Group_3_1__1"


    // $ANTLR start "rule__MessageStructureDatatype__Group_3_1__1__Impl"
    // InternalStateDef.g:2514:1: rule__MessageStructureDatatype__Group_3_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__MessageStructureDatatype__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2518:1: ( ( ( ',' )? ) )
            // InternalStateDef.g:2519:1: ( ( ',' )? )
            {
            // InternalStateDef.g:2519:1: ( ( ',' )? )
            // InternalStateDef.g:2520:2: ( ',' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureDatatypeAccess().getCommaKeyword_3_1_1()); 
            }
            // InternalStateDef.g:2521:2: ( ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalStateDef.g:2521:3: ','
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureDatatypeAccess().getCommaKeyword_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureDatatype__Group_3_1__1__Impl"


    // $ANTLR start "rule__MessageEnum__Group__0"
    // InternalStateDef.g:2530:1: rule__MessageEnum__Group__0 : rule__MessageEnum__Group__0__Impl rule__MessageEnum__Group__1 ;
    public final void rule__MessageEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2534:1: ( rule__MessageEnum__Group__0__Impl rule__MessageEnum__Group__1 )
            // InternalStateDef.g:2535:2: rule__MessageEnum__Group__0__Impl rule__MessageEnum__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__MessageEnum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageEnum__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group__0"


    // $ANTLR start "rule__MessageEnum__Group__0__Impl"
    // InternalStateDef.g:2542:1: rule__MessageEnum__Group__0__Impl : ( ( 'enum' )? ) ;
    public final void rule__MessageEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2546:1: ( ( ( 'enum' )? ) )
            // InternalStateDef.g:2547:1: ( ( 'enum' )? )
            {
            // InternalStateDef.g:2547:1: ( ( 'enum' )? )
            // InternalStateDef.g:2548:2: ( 'enum' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumAccess().getEnumKeyword_0()); 
            }
            // InternalStateDef.g:2549:2: ( 'enum' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalStateDef.g:2549:3: 'enum'
                    {
                    match(input,36,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumAccess().getEnumKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group__0__Impl"


    // $ANTLR start "rule__MessageEnum__Group__1"
    // InternalStateDef.g:2557:1: rule__MessageEnum__Group__1 : rule__MessageEnum__Group__1__Impl rule__MessageEnum__Group__2 ;
    public final void rule__MessageEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2561:1: ( rule__MessageEnum__Group__1__Impl rule__MessageEnum__Group__2 )
            // InternalStateDef.g:2562:2: rule__MessageEnum__Group__1__Impl rule__MessageEnum__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MessageEnum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageEnum__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group__1"


    // $ANTLR start "rule__MessageEnum__Group__1__Impl"
    // InternalStateDef.g:2569:1: rule__MessageEnum__Group__1__Impl : ( ( rule__MessageEnum__NameAssignment_1 ) ) ;
    public final void rule__MessageEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2573:1: ( ( ( rule__MessageEnum__NameAssignment_1 ) ) )
            // InternalStateDef.g:2574:1: ( ( rule__MessageEnum__NameAssignment_1 ) )
            {
            // InternalStateDef.g:2574:1: ( ( rule__MessageEnum__NameAssignment_1 ) )
            // InternalStateDef.g:2575:2: ( rule__MessageEnum__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumAccess().getNameAssignment_1()); 
            }
            // InternalStateDef.g:2576:2: ( rule__MessageEnum__NameAssignment_1 )
            // InternalStateDef.g:2576:3: rule__MessageEnum__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MessageEnum__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group__1__Impl"


    // $ANTLR start "rule__MessageEnum__Group__2"
    // InternalStateDef.g:2584:1: rule__MessageEnum__Group__2 : rule__MessageEnum__Group__2__Impl ;
    public final void rule__MessageEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2588:1: ( rule__MessageEnum__Group__2__Impl )
            // InternalStateDef.g:2589:2: rule__MessageEnum__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageEnum__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group__2"


    // $ANTLR start "rule__MessageEnum__Group__2__Impl"
    // InternalStateDef.g:2595:1: rule__MessageEnum__Group__2__Impl : ( ( rule__MessageEnum__Group_2__0 )? ) ;
    public final void rule__MessageEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2599:1: ( ( ( rule__MessageEnum__Group_2__0 )? ) )
            // InternalStateDef.g:2600:1: ( ( rule__MessageEnum__Group_2__0 )? )
            {
            // InternalStateDef.g:2600:1: ( ( rule__MessageEnum__Group_2__0 )? )
            // InternalStateDef.g:2601:2: ( rule__MessageEnum__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumAccess().getGroup_2()); 
            }
            // InternalStateDef.g:2602:2: ( rule__MessageEnum__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==15) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalStateDef.g:2602:3: rule__MessageEnum__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageEnum__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group__2__Impl"


    // $ANTLR start "rule__MessageEnum__Group_2__0"
    // InternalStateDef.g:2611:1: rule__MessageEnum__Group_2__0 : rule__MessageEnum__Group_2__0__Impl rule__MessageEnum__Group_2__1 ;
    public final void rule__MessageEnum__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2615:1: ( rule__MessageEnum__Group_2__0__Impl rule__MessageEnum__Group_2__1 )
            // InternalStateDef.g:2616:2: rule__MessageEnum__Group_2__0__Impl rule__MessageEnum__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__MessageEnum__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageEnum__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group_2__0"


    // $ANTLR start "rule__MessageEnum__Group_2__0__Impl"
    // InternalStateDef.g:2623:1: rule__MessageEnum__Group_2__0__Impl : ( '{' ) ;
    public final void rule__MessageEnum__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2627:1: ( ( '{' ) )
            // InternalStateDef.g:2628:1: ( '{' )
            {
            // InternalStateDef.g:2628:1: ( '{' )
            // InternalStateDef.g:2629:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumAccess().getLeftCurlyBracketKeyword_2_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumAccess().getLeftCurlyBracketKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group_2__0__Impl"


    // $ANTLR start "rule__MessageEnum__Group_2__1"
    // InternalStateDef.g:2638:1: rule__MessageEnum__Group_2__1 : rule__MessageEnum__Group_2__1__Impl rule__MessageEnum__Group_2__2 ;
    public final void rule__MessageEnum__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2642:1: ( rule__MessageEnum__Group_2__1__Impl rule__MessageEnum__Group_2__2 )
            // InternalStateDef.g:2643:2: rule__MessageEnum__Group_2__1__Impl rule__MessageEnum__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__MessageEnum__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageEnum__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group_2__1"


    // $ANTLR start "rule__MessageEnum__Group_2__1__Impl"
    // InternalStateDef.g:2650:1: rule__MessageEnum__Group_2__1__Impl : ( ( ( rule__MessageEnum__Group_2_1__0 ) ) ( ( rule__MessageEnum__Group_2_1__0 )* ) ) ;
    public final void rule__MessageEnum__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2654:1: ( ( ( ( rule__MessageEnum__Group_2_1__0 ) ) ( ( rule__MessageEnum__Group_2_1__0 )* ) ) )
            // InternalStateDef.g:2655:1: ( ( ( rule__MessageEnum__Group_2_1__0 ) ) ( ( rule__MessageEnum__Group_2_1__0 )* ) )
            {
            // InternalStateDef.g:2655:1: ( ( ( rule__MessageEnum__Group_2_1__0 ) ) ( ( rule__MessageEnum__Group_2_1__0 )* ) )
            // InternalStateDef.g:2656:2: ( ( rule__MessageEnum__Group_2_1__0 ) ) ( ( rule__MessageEnum__Group_2_1__0 )* )
            {
            // InternalStateDef.g:2656:2: ( ( rule__MessageEnum__Group_2_1__0 ) )
            // InternalStateDef.g:2657:3: ( rule__MessageEnum__Group_2_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumAccess().getGroup_2_1()); 
            }
            // InternalStateDef.g:2658:3: ( rule__MessageEnum__Group_2_1__0 )
            // InternalStateDef.g:2658:4: rule__MessageEnum__Group_2_1__0
            {
            pushFollow(FOLLOW_30);
            rule__MessageEnum__Group_2_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumAccess().getGroup_2_1()); 
            }

            }

            // InternalStateDef.g:2661:2: ( ( rule__MessageEnum__Group_2_1__0 )* )
            // InternalStateDef.g:2662:3: ( rule__MessageEnum__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumAccess().getGroup_2_1()); 
            }
            // InternalStateDef.g:2663:3: ( rule__MessageEnum__Group_2_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ENUMNAME) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalStateDef.g:2663:4: rule__MessageEnum__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__MessageEnum__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumAccess().getGroup_2_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group_2__1__Impl"


    // $ANTLR start "rule__MessageEnum__Group_2__2"
    // InternalStateDef.g:2672:1: rule__MessageEnum__Group_2__2 : rule__MessageEnum__Group_2__2__Impl ;
    public final void rule__MessageEnum__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2676:1: ( rule__MessageEnum__Group_2__2__Impl )
            // InternalStateDef.g:2677:2: rule__MessageEnum__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageEnum__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group_2__2"


    // $ANTLR start "rule__MessageEnum__Group_2__2__Impl"
    // InternalStateDef.g:2683:1: rule__MessageEnum__Group_2__2__Impl : ( '}' ) ;
    public final void rule__MessageEnum__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2687:1: ( ( '}' ) )
            // InternalStateDef.g:2688:1: ( '}' )
            {
            // InternalStateDef.g:2688:1: ( '}' )
            // InternalStateDef.g:2689:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumAccess().getRightCurlyBracketKeyword_2_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumAccess().getRightCurlyBracketKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group_2__2__Impl"


    // $ANTLR start "rule__MessageEnum__Group_2_1__0"
    // InternalStateDef.g:2699:1: rule__MessageEnum__Group_2_1__0 : rule__MessageEnum__Group_2_1__0__Impl rule__MessageEnum__Group_2_1__1 ;
    public final void rule__MessageEnum__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2703:1: ( rule__MessageEnum__Group_2_1__0__Impl rule__MessageEnum__Group_2_1__1 )
            // InternalStateDef.g:2704:2: rule__MessageEnum__Group_2_1__0__Impl rule__MessageEnum__Group_2_1__1
            {
            pushFollow(FOLLOW_31);
            rule__MessageEnum__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageEnum__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group_2_1__0"


    // $ANTLR start "rule__MessageEnum__Group_2_1__0__Impl"
    // InternalStateDef.g:2711:1: rule__MessageEnum__Group_2_1__0__Impl : ( ( rule__MessageEnum__NamesAssignment_2_1_0 ) ) ;
    public final void rule__MessageEnum__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2715:1: ( ( ( rule__MessageEnum__NamesAssignment_2_1_0 ) ) )
            // InternalStateDef.g:2716:1: ( ( rule__MessageEnum__NamesAssignment_2_1_0 ) )
            {
            // InternalStateDef.g:2716:1: ( ( rule__MessageEnum__NamesAssignment_2_1_0 ) )
            // InternalStateDef.g:2717:2: ( rule__MessageEnum__NamesAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumAccess().getNamesAssignment_2_1_0()); 
            }
            // InternalStateDef.g:2718:2: ( rule__MessageEnum__NamesAssignment_2_1_0 )
            // InternalStateDef.g:2718:3: rule__MessageEnum__NamesAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MessageEnum__NamesAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumAccess().getNamesAssignment_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group_2_1__0__Impl"


    // $ANTLR start "rule__MessageEnum__Group_2_1__1"
    // InternalStateDef.g:2726:1: rule__MessageEnum__Group_2_1__1 : rule__MessageEnum__Group_2_1__1__Impl rule__MessageEnum__Group_2_1__2 ;
    public final void rule__MessageEnum__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2730:1: ( rule__MessageEnum__Group_2_1__1__Impl rule__MessageEnum__Group_2_1__2 )
            // InternalStateDef.g:2731:2: rule__MessageEnum__Group_2_1__1__Impl rule__MessageEnum__Group_2_1__2
            {
            pushFollow(FOLLOW_25);
            rule__MessageEnum__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageEnum__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group_2_1__1"


    // $ANTLR start "rule__MessageEnum__Group_2_1__1__Impl"
    // InternalStateDef.g:2738:1: rule__MessageEnum__Group_2_1__1__Impl : ( '(' ) ;
    public final void rule__MessageEnum__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2742:1: ( ( '(' ) )
            // InternalStateDef.g:2743:1: ( '(' )
            {
            // InternalStateDef.g:2743:1: ( '(' )
            // InternalStateDef.g:2744:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumAccess().getLeftParenthesisKeyword_2_1_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumAccess().getLeftParenthesisKeyword_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group_2_1__1__Impl"


    // $ANTLR start "rule__MessageEnum__Group_2_1__2"
    // InternalStateDef.g:2753:1: rule__MessageEnum__Group_2_1__2 : rule__MessageEnum__Group_2_1__2__Impl rule__MessageEnum__Group_2_1__3 ;
    public final void rule__MessageEnum__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2757:1: ( rule__MessageEnum__Group_2_1__2__Impl rule__MessageEnum__Group_2_1__3 )
            // InternalStateDef.g:2758:2: rule__MessageEnum__Group_2_1__2__Impl rule__MessageEnum__Group_2_1__3
            {
            pushFollow(FOLLOW_32);
            rule__MessageEnum__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageEnum__Group_2_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group_2_1__2"


    // $ANTLR start "rule__MessageEnum__Group_2_1__2__Impl"
    // InternalStateDef.g:2765:1: rule__MessageEnum__Group_2_1__2__Impl : ( ( rule__MessageEnum__ValuesAssignment_2_1_2 ) ) ;
    public final void rule__MessageEnum__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2769:1: ( ( ( rule__MessageEnum__ValuesAssignment_2_1_2 ) ) )
            // InternalStateDef.g:2770:1: ( ( rule__MessageEnum__ValuesAssignment_2_1_2 ) )
            {
            // InternalStateDef.g:2770:1: ( ( rule__MessageEnum__ValuesAssignment_2_1_2 ) )
            // InternalStateDef.g:2771:2: ( rule__MessageEnum__ValuesAssignment_2_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumAccess().getValuesAssignment_2_1_2()); 
            }
            // InternalStateDef.g:2772:2: ( rule__MessageEnum__ValuesAssignment_2_1_2 )
            // InternalStateDef.g:2772:3: rule__MessageEnum__ValuesAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MessageEnum__ValuesAssignment_2_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumAccess().getValuesAssignment_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group_2_1__2__Impl"


    // $ANTLR start "rule__MessageEnum__Group_2_1__3"
    // InternalStateDef.g:2780:1: rule__MessageEnum__Group_2_1__3 : rule__MessageEnum__Group_2_1__3__Impl rule__MessageEnum__Group_2_1__4 ;
    public final void rule__MessageEnum__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2784:1: ( rule__MessageEnum__Group_2_1__3__Impl rule__MessageEnum__Group_2_1__4 )
            // InternalStateDef.g:2785:2: rule__MessageEnum__Group_2_1__3__Impl rule__MessageEnum__Group_2_1__4
            {
            pushFollow(FOLLOW_24);
            rule__MessageEnum__Group_2_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MessageEnum__Group_2_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group_2_1__3"


    // $ANTLR start "rule__MessageEnum__Group_2_1__3__Impl"
    // InternalStateDef.g:2792:1: rule__MessageEnum__Group_2_1__3__Impl : ( ')' ) ;
    public final void rule__MessageEnum__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2796:1: ( ( ')' ) )
            // InternalStateDef.g:2797:1: ( ')' )
            {
            // InternalStateDef.g:2797:1: ( ')' )
            // InternalStateDef.g:2798:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumAccess().getRightParenthesisKeyword_2_1_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumAccess().getRightParenthesisKeyword_2_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group_2_1__3__Impl"


    // $ANTLR start "rule__MessageEnum__Group_2_1__4"
    // InternalStateDef.g:2807:1: rule__MessageEnum__Group_2_1__4 : rule__MessageEnum__Group_2_1__4__Impl ;
    public final void rule__MessageEnum__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2811:1: ( rule__MessageEnum__Group_2_1__4__Impl )
            // InternalStateDef.g:2812:2: rule__MessageEnum__Group_2_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageEnum__Group_2_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group_2_1__4"


    // $ANTLR start "rule__MessageEnum__Group_2_1__4__Impl"
    // InternalStateDef.g:2818:1: rule__MessageEnum__Group_2_1__4__Impl : ( ( ',' )? ) ;
    public final void rule__MessageEnum__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2822:1: ( ( ( ',' )? ) )
            // InternalStateDef.g:2823:1: ( ( ',' )? )
            {
            // InternalStateDef.g:2823:1: ( ( ',' )? )
            // InternalStateDef.g:2824:2: ( ',' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumAccess().getCommaKeyword_2_1_4()); 
            }
            // InternalStateDef.g:2825:2: ( ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalStateDef.g:2825:3: ','
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumAccess().getCommaKeyword_2_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__Group_2_1__4__Impl"


    // $ANTLR start "rule__StateMachine__UnorderedGroup_2"
    // InternalStateDef.g:2834:1: rule__StateMachine__UnorderedGroup_2 : rule__StateMachine__UnorderedGroup_2__0 {...}?;
    public final void rule__StateMachine__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getStateMachineAccess().getUnorderedGroup_2());
        	
        try {
            // InternalStateDef.g:2839:1: ( rule__StateMachine__UnorderedGroup_2__0 {...}?)
            // InternalStateDef.g:2840:2: rule__StateMachine__UnorderedGroup_2__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__UnorderedGroup_2__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStateMachineAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__StateMachine__UnorderedGroup_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getStateMachineAccess().getUnorderedGroup_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getStateMachineAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__UnorderedGroup_2"


    // $ANTLR start "rule__StateMachine__UnorderedGroup_2__Impl"
    // InternalStateDef.g:2848:1: rule__StateMachine__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__StateMachine__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__StateMachine__StatesAssignment_2_1 ) ) ( ( ( rule__StateMachine__StatesAssignment_2_1 )=> rule__StateMachine__StatesAssignment_2_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__StateMachine__TransitionsAssignment_2_2 ) ) ( ( ( rule__StateMachine__TransitionsAssignment_2_2 )=> rule__StateMachine__TransitionsAssignment_2_2 )* ) ) ) ) | ({...}? => ( ( ( rule__StateMachine__Group_2_3__0 ) ) ) ) ) ;
    public final void rule__StateMachine__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalStateDef.g:2853:1: ( ( ({...}? => ( ( ( rule__StateMachine__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__StateMachine__StatesAssignment_2_1 ) ) ( ( ( rule__StateMachine__StatesAssignment_2_1 )=> rule__StateMachine__StatesAssignment_2_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__StateMachine__TransitionsAssignment_2_2 ) ) ( ( ( rule__StateMachine__TransitionsAssignment_2_2 )=> rule__StateMachine__TransitionsAssignment_2_2 )* ) ) ) ) | ({...}? => ( ( ( rule__StateMachine__Group_2_3__0 ) ) ) ) ) )
            // InternalStateDef.g:2854:3: ( ({...}? => ( ( ( rule__StateMachine__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__StateMachine__StatesAssignment_2_1 ) ) ( ( ( rule__StateMachine__StatesAssignment_2_1 )=> rule__StateMachine__StatesAssignment_2_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__StateMachine__TransitionsAssignment_2_2 ) ) ( ( ( rule__StateMachine__TransitionsAssignment_2_2 )=> rule__StateMachine__TransitionsAssignment_2_2 )* ) ) ) ) | ({...}? => ( ( ( rule__StateMachine__Group_2_3__0 ) ) ) ) )
            {
            // InternalStateDef.g:2854:3: ( ({...}? => ( ( ( rule__StateMachine__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__StateMachine__StatesAssignment_2_1 ) ) ( ( ( rule__StateMachine__StatesAssignment_2_1 )=> rule__StateMachine__StatesAssignment_2_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__StateMachine__TransitionsAssignment_2_2 ) ) ( ( ( rule__StateMachine__TransitionsAssignment_2_2 )=> rule__StateMachine__TransitionsAssignment_2_2 )* ) ) ) ) | ({...}? => ( ( ( rule__StateMachine__Group_2_3__0 ) ) ) ) )
            int alt30=4;
            int LA30_0 = input.LA(1);

            if ( LA30_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 1) ) {
                alt30=2;
            }
            else if ( LA30_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 2) ) {
                alt30=3;
            }
            else if ( LA30_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 3) ) {
                alt30=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalStateDef.g:2855:3: ({...}? => ( ( ( rule__StateMachine__Group_2_0__0 ) ) ) )
                    {
                    // InternalStateDef.g:2855:3: ({...}? => ( ( ( rule__StateMachine__Group_2_0__0 ) ) ) )
                    // InternalStateDef.g:2856:4: {...}? => ( ( ( rule__StateMachine__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__StateMachine__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalStateDef.g:2856:108: ( ( ( rule__StateMachine__Group_2_0__0 ) ) )
                    // InternalStateDef.g:2857:5: ( ( rule__StateMachine__Group_2_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 0);
                    selected = true;
                    // InternalStateDef.g:2863:5: ( ( rule__StateMachine__Group_2_0__0 ) )
                    // InternalStateDef.g:2864:6: ( rule__StateMachine__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateMachineAccess().getGroup_2_0()); 
                    }
                    // InternalStateDef.g:2865:6: ( rule__StateMachine__Group_2_0__0 )
                    // InternalStateDef.g:2865:7: rule__StateMachine__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateMachineAccess().getGroup_2_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateDef.g:2870:3: ({...}? => ( ( ( ( rule__StateMachine__StatesAssignment_2_1 ) ) ( ( ( rule__StateMachine__StatesAssignment_2_1 )=> rule__StateMachine__StatesAssignment_2_1 )* ) ) ) )
                    {
                    // InternalStateDef.g:2870:3: ({...}? => ( ( ( ( rule__StateMachine__StatesAssignment_2_1 ) ) ( ( ( rule__StateMachine__StatesAssignment_2_1 )=> rule__StateMachine__StatesAssignment_2_1 )* ) ) ) )
                    // InternalStateDef.g:2871:4: {...}? => ( ( ( ( rule__StateMachine__StatesAssignment_2_1 ) ) ( ( ( rule__StateMachine__StatesAssignment_2_1 )=> rule__StateMachine__StatesAssignment_2_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__StateMachine__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalStateDef.g:2871:108: ( ( ( ( rule__StateMachine__StatesAssignment_2_1 ) ) ( ( ( rule__StateMachine__StatesAssignment_2_1 )=> rule__StateMachine__StatesAssignment_2_1 )* ) ) )
                    // InternalStateDef.g:2872:5: ( ( ( rule__StateMachine__StatesAssignment_2_1 ) ) ( ( ( rule__StateMachine__StatesAssignment_2_1 )=> rule__StateMachine__StatesAssignment_2_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 1);
                    selected = true;
                    // InternalStateDef.g:2878:5: ( ( ( rule__StateMachine__StatesAssignment_2_1 ) ) ( ( ( rule__StateMachine__StatesAssignment_2_1 )=> rule__StateMachine__StatesAssignment_2_1 )* ) )
                    // InternalStateDef.g:2879:6: ( ( rule__StateMachine__StatesAssignment_2_1 ) ) ( ( ( rule__StateMachine__StatesAssignment_2_1 )=> rule__StateMachine__StatesAssignment_2_1 )* )
                    {
                    // InternalStateDef.g:2879:6: ( ( rule__StateMachine__StatesAssignment_2_1 ) )
                    // InternalStateDef.g:2880:7: ( rule__StateMachine__StatesAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateMachineAccess().getStatesAssignment_2_1()); 
                    }
                    // InternalStateDef.g:2881:7: ( rule__StateMachine__StatesAssignment_2_1 )
                    // InternalStateDef.g:2881:8: rule__StateMachine__StatesAssignment_2_1
                    {
                    pushFollow(FOLLOW_33);
                    rule__StateMachine__StatesAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateMachineAccess().getStatesAssignment_2_1()); 
                    }

                    }

                    // InternalStateDef.g:2884:6: ( ( ( rule__StateMachine__StatesAssignment_2_1 )=> rule__StateMachine__StatesAssignment_2_1 )* )
                    // InternalStateDef.g:2885:7: ( ( rule__StateMachine__StatesAssignment_2_1 )=> rule__StateMachine__StatesAssignment_2_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateMachineAccess().getStatesAssignment_2_1()); 
                    }
                    // InternalStateDef.g:2886:7: ( ( rule__StateMachine__StatesAssignment_2_1 )=> rule__StateMachine__StatesAssignment_2_1 )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==19) ) {
                            int LA28_2 = input.LA(2);

                            if ( (LA28_2==RULE_ID) ) {
                                int LA28_3 = input.LA(3);

                                if ( (synpred1_InternalStateDef()) ) {
                                    alt28=1;
                                }


                            }


                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalStateDef.g:2886:8: ( rule__StateMachine__StatesAssignment_2_1 )=> rule__StateMachine__StatesAssignment_2_1
                    	    {
                    	    pushFollow(FOLLOW_33);
                    	    rule__StateMachine__StatesAssignment_2_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateMachineAccess().getStatesAssignment_2_1()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalStateDef.g:2892:3: ({...}? => ( ( ( ( rule__StateMachine__TransitionsAssignment_2_2 ) ) ( ( ( rule__StateMachine__TransitionsAssignment_2_2 )=> rule__StateMachine__TransitionsAssignment_2_2 )* ) ) ) )
                    {
                    // InternalStateDef.g:2892:3: ({...}? => ( ( ( ( rule__StateMachine__TransitionsAssignment_2_2 ) ) ( ( ( rule__StateMachine__TransitionsAssignment_2_2 )=> rule__StateMachine__TransitionsAssignment_2_2 )* ) ) ) )
                    // InternalStateDef.g:2893:4: {...}? => ( ( ( ( rule__StateMachine__TransitionsAssignment_2_2 ) ) ( ( ( rule__StateMachine__TransitionsAssignment_2_2 )=> rule__StateMachine__TransitionsAssignment_2_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__StateMachine__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 2)");
                    }
                    // InternalStateDef.g:2893:108: ( ( ( ( rule__StateMachine__TransitionsAssignment_2_2 ) ) ( ( ( rule__StateMachine__TransitionsAssignment_2_2 )=> rule__StateMachine__TransitionsAssignment_2_2 )* ) ) )
                    // InternalStateDef.g:2894:5: ( ( ( rule__StateMachine__TransitionsAssignment_2_2 ) ) ( ( ( rule__StateMachine__TransitionsAssignment_2_2 )=> rule__StateMachine__TransitionsAssignment_2_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 2);
                    selected = true;
                    // InternalStateDef.g:2900:5: ( ( ( rule__StateMachine__TransitionsAssignment_2_2 ) ) ( ( ( rule__StateMachine__TransitionsAssignment_2_2 )=> rule__StateMachine__TransitionsAssignment_2_2 )* ) )
                    // InternalStateDef.g:2901:6: ( ( rule__StateMachine__TransitionsAssignment_2_2 ) ) ( ( ( rule__StateMachine__TransitionsAssignment_2_2 )=> rule__StateMachine__TransitionsAssignment_2_2 )* )
                    {
                    // InternalStateDef.g:2901:6: ( ( rule__StateMachine__TransitionsAssignment_2_2 ) )
                    // InternalStateDef.g:2902:7: ( rule__StateMachine__TransitionsAssignment_2_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_2_2()); 
                    }
                    // InternalStateDef.g:2903:7: ( rule__StateMachine__TransitionsAssignment_2_2 )
                    // InternalStateDef.g:2903:8: rule__StateMachine__TransitionsAssignment_2_2
                    {
                    pushFollow(FOLLOW_34);
                    rule__StateMachine__TransitionsAssignment_2_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_2_2()); 
                    }

                    }

                    // InternalStateDef.g:2906:6: ( ( ( rule__StateMachine__TransitionsAssignment_2_2 )=> rule__StateMachine__TransitionsAssignment_2_2 )* )
                    // InternalStateDef.g:2907:7: ( ( rule__StateMachine__TransitionsAssignment_2_2 )=> rule__StateMachine__TransitionsAssignment_2_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_2_2()); 
                    }
                    // InternalStateDef.g:2908:7: ( ( rule__StateMachine__TransitionsAssignment_2_2 )=> rule__StateMachine__TransitionsAssignment_2_2 )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==20) ) {
                            int LA29_2 = input.LA(2);

                            if ( (LA29_2==RULE_ID) ) {
                                int LA29_3 = input.LA(3);

                                if ( (synpred2_InternalStateDef()) ) {
                                    alt29=1;
                                }


                            }


                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalStateDef.g:2908:8: ( rule__StateMachine__TransitionsAssignment_2_2 )=> rule__StateMachine__TransitionsAssignment_2_2
                    	    {
                    	    pushFollow(FOLLOW_34);
                    	    rule__StateMachine__TransitionsAssignment_2_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_2_2()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalStateDef.g:2914:3: ({...}? => ( ( ( rule__StateMachine__Group_2_3__0 ) ) ) )
                    {
                    // InternalStateDef.g:2914:3: ({...}? => ( ( ( rule__StateMachine__Group_2_3__0 ) ) ) )
                    // InternalStateDef.g:2915:4: {...}? => ( ( ( rule__StateMachine__Group_2_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__StateMachine__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 3)");
                    }
                    // InternalStateDef.g:2915:108: ( ( ( rule__StateMachine__Group_2_3__0 ) ) )
                    // InternalStateDef.g:2916:5: ( ( rule__StateMachine__Group_2_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 3);
                    selected = true;
                    // InternalStateDef.g:2922:5: ( ( rule__StateMachine__Group_2_3__0 ) )
                    // InternalStateDef.g:2923:6: ( rule__StateMachine__Group_2_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateMachineAccess().getGroup_2_3()); 
                    }
                    // InternalStateDef.g:2924:6: ( rule__StateMachine__Group_2_3__0 )
                    // InternalStateDef.g:2924:7: rule__StateMachine__Group_2_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__Group_2_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateMachineAccess().getGroup_2_3()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__StateMachine__UnorderedGroup_2__0"
    // InternalStateDef.g:2937:1: rule__StateMachine__UnorderedGroup_2__0 : rule__StateMachine__UnorderedGroup_2__Impl ( rule__StateMachine__UnorderedGroup_2__1 )? ;
    public final void rule__StateMachine__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2941:1: ( rule__StateMachine__UnorderedGroup_2__Impl ( rule__StateMachine__UnorderedGroup_2__1 )? )
            // InternalStateDef.g:2942:2: rule__StateMachine__UnorderedGroup_2__Impl ( rule__StateMachine__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_35);
            rule__StateMachine__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalStateDef.g:2943:2: ( rule__StateMachine__UnorderedGroup_2__1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 1) ) {
                alt31=1;
            }
            else if ( LA31_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 2) ) {
                alt31=1;
            }
            else if ( LA31_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 3) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalStateDef.g:2943:2: rule__StateMachine__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__UnorderedGroup_2__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__UnorderedGroup_2__0"


    // $ANTLR start "rule__StateMachine__UnorderedGroup_2__1"
    // InternalStateDef.g:2949:1: rule__StateMachine__UnorderedGroup_2__1 : rule__StateMachine__UnorderedGroup_2__Impl ( rule__StateMachine__UnorderedGroup_2__2 )? ;
    public final void rule__StateMachine__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2953:1: ( rule__StateMachine__UnorderedGroup_2__Impl ( rule__StateMachine__UnorderedGroup_2__2 )? )
            // InternalStateDef.g:2954:2: rule__StateMachine__UnorderedGroup_2__Impl ( rule__StateMachine__UnorderedGroup_2__2 )?
            {
            pushFollow(FOLLOW_35);
            rule__StateMachine__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalStateDef.g:2955:2: ( rule__StateMachine__UnorderedGroup_2__2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 1) ) {
                alt32=1;
            }
            else if ( LA32_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 2) ) {
                alt32=1;
            }
            else if ( LA32_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 3) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalStateDef.g:2955:2: rule__StateMachine__UnorderedGroup_2__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__UnorderedGroup_2__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__UnorderedGroup_2__1"


    // $ANTLR start "rule__StateMachine__UnorderedGroup_2__2"
    // InternalStateDef.g:2961:1: rule__StateMachine__UnorderedGroup_2__2 : rule__StateMachine__UnorderedGroup_2__Impl ( rule__StateMachine__UnorderedGroup_2__3 )? ;
    public final void rule__StateMachine__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2965:1: ( rule__StateMachine__UnorderedGroup_2__Impl ( rule__StateMachine__UnorderedGroup_2__3 )? )
            // InternalStateDef.g:2966:2: rule__StateMachine__UnorderedGroup_2__Impl ( rule__StateMachine__UnorderedGroup_2__3 )?
            {
            pushFollow(FOLLOW_35);
            rule__StateMachine__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalStateDef.g:2967:2: ( rule__StateMachine__UnorderedGroup_2__3 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( LA33_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 1) ) {
                alt33=1;
            }
            else if ( LA33_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 2) ) {
                alt33=1;
            }
            else if ( LA33_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2(), 3) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalStateDef.g:2967:2: rule__StateMachine__UnorderedGroup_2__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__UnorderedGroup_2__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__UnorderedGroup_2__2"


    // $ANTLR start "rule__StateMachine__UnorderedGroup_2__3"
    // InternalStateDef.g:2973:1: rule__StateMachine__UnorderedGroup_2__3 : rule__StateMachine__UnorderedGroup_2__Impl ;
    public final void rule__StateMachine__UnorderedGroup_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:2977:1: ( rule__StateMachine__UnorderedGroup_2__Impl )
            // InternalStateDef.g:2978:2: rule__StateMachine__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__UnorderedGroup_2__3"


    // $ANTLR start "rule__StateMachine__UnorderedGroup_2_0_1"
    // InternalStateDef.g:2985:1: rule__StateMachine__UnorderedGroup_2_0_1 : ( rule__StateMachine__UnorderedGroup_2_0_1__0 )? ;
    public final void rule__StateMachine__UnorderedGroup_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1());
        	
        try {
            // InternalStateDef.g:2990:1: ( ( rule__StateMachine__UnorderedGroup_2_0_1__0 )? )
            // InternalStateDef.g:2991:2: ( rule__StateMachine__UnorderedGroup_2_0_1__0 )?
            {
            // InternalStateDef.g:2991:2: ( rule__StateMachine__UnorderedGroup_2_0_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( LA34_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 0) ) {
                alt34=1;
            }
            else if ( ( LA34_0 == RULE_ID || LA34_0 == 36 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 1) ) {
                alt34=1;
            }
            else if ( LA34_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 2) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalStateDef.g:2991:2: rule__StateMachine__UnorderedGroup_2_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__UnorderedGroup_2_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__UnorderedGroup_2_0_1"


    // $ANTLR start "rule__StateMachine__UnorderedGroup_2_0_1__Impl"
    // InternalStateDef.g:2999:1: rule__StateMachine__UnorderedGroup_2_0_1__Impl : ( ({...}? => ( ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 ) ) ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )=> rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 ) ) ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )=> rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 ) ) ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 )=> rule__StateMachine__MessagesAssignment_2_0_1_2 )* ) ) ) ) ) ;
    public final void rule__StateMachine__UnorderedGroup_2_0_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalStateDef.g:3004:1: ( ( ({...}? => ( ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 ) ) ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )=> rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 ) ) ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )=> rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 ) ) ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 )=> rule__StateMachine__MessagesAssignment_2_0_1_2 )* ) ) ) ) ) )
            // InternalStateDef.g:3005:3: ( ({...}? => ( ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 ) ) ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )=> rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 ) ) ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )=> rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 ) ) ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 )=> rule__StateMachine__MessagesAssignment_2_0_1_2 )* ) ) ) ) )
            {
            // InternalStateDef.g:3005:3: ( ({...}? => ( ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 ) ) ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )=> rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 ) ) ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )=> rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 ) ) ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 )=> rule__StateMachine__MessagesAssignment_2_0_1_2 )* ) ) ) ) )
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( LA38_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 0) ) {
                alt38=1;
            }
            else if ( ( LA38_0 == RULE_ID || LA38_0 == 36 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 1) ) {
                alt38=2;
            }
            else if ( LA38_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 2) ) {
                alt38=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalStateDef.g:3006:3: ({...}? => ( ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 ) ) ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )=> rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )* ) ) ) )
                    {
                    // InternalStateDef.g:3006:3: ({...}? => ( ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 ) ) ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )=> rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )* ) ) ) )
                    // InternalStateDef.g:3007:4: {...}? => ( ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 ) ) ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )=> rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__StateMachine__UnorderedGroup_2_0_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 0)");
                    }
                    // InternalStateDef.g:3007:112: ( ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 ) ) ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )=> rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )* ) ) )
                    // InternalStateDef.g:3008:5: ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 ) ) ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )=> rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 0);
                    selected = true;
                    // InternalStateDef.g:3014:5: ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 ) ) ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )=> rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )* ) )
                    // InternalStateDef.g:3015:6: ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 ) ) ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )=> rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )* )
                    {
                    // InternalStateDef.g:3015:6: ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 ) )
                    // InternalStateDef.g:3016:7: ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateMachineAccess().getGlobalStructsAssignment_2_0_1_0()); 
                    }
                    // InternalStateDef.g:3017:7: ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )
                    // InternalStateDef.g:3017:8: rule__StateMachine__GlobalStructsAssignment_2_0_1_0
                    {
                    pushFollow(FOLLOW_36);
                    rule__StateMachine__GlobalStructsAssignment_2_0_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateMachineAccess().getGlobalStructsAssignment_2_0_1_0()); 
                    }

                    }

                    // InternalStateDef.g:3020:6: ( ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )=> rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )* )
                    // InternalStateDef.g:3021:7: ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )=> rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateMachineAccess().getGlobalStructsAssignment_2_0_1_0()); 
                    }
                    // InternalStateDef.g:3022:7: ( ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )=> rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==27) ) {
                            int LA35_1 = input.LA(2);

                            if ( (LA35_1==RULE_ID) ) {
                                int LA35_3 = input.LA(3);

                                if ( (synpred3_InternalStateDef()) ) {
                                    alt35=1;
                                }


                            }


                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalStateDef.g:3022:8: ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )=> rule__StateMachine__GlobalStructsAssignment_2_0_1_0
                    	    {
                    	    pushFollow(FOLLOW_36);
                    	    rule__StateMachine__GlobalStructsAssignment_2_0_1_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateMachineAccess().getGlobalStructsAssignment_2_0_1_0()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateDef.g:3028:3: ({...}? => ( ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 ) ) ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )=> rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )* ) ) ) )
                    {
                    // InternalStateDef.g:3028:3: ({...}? => ( ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 ) ) ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )=> rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )* ) ) ) )
                    // InternalStateDef.g:3029:4: {...}? => ( ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 ) ) ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )=> rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__StateMachine__UnorderedGroup_2_0_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 1)");
                    }
                    // InternalStateDef.g:3029:112: ( ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 ) ) ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )=> rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )* ) ) )
                    // InternalStateDef.g:3030:5: ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 ) ) ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )=> rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 1);
                    selected = true;
                    // InternalStateDef.g:3036:5: ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 ) ) ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )=> rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )* ) )
                    // InternalStateDef.g:3037:6: ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 ) ) ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )=> rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )* )
                    {
                    // InternalStateDef.g:3037:6: ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 ) )
                    // InternalStateDef.g:3038:7: ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateMachineAccess().getGlobalEnumsAssignment_2_0_1_1()); 
                    }
                    // InternalStateDef.g:3039:7: ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )
                    // InternalStateDef.g:3039:8: rule__StateMachine__GlobalEnumsAssignment_2_0_1_1
                    {
                    pushFollow(FOLLOW_37);
                    rule__StateMachine__GlobalEnumsAssignment_2_0_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateMachineAccess().getGlobalEnumsAssignment_2_0_1_1()); 
                    }

                    }

                    // InternalStateDef.g:3042:6: ( ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )=> rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )* )
                    // InternalStateDef.g:3043:7: ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )=> rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateMachineAccess().getGlobalEnumsAssignment_2_0_1_1()); 
                    }
                    // InternalStateDef.g:3044:7: ( ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )=> rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==36) ) {
                            int LA36_2 = input.LA(2);

                            if ( (LA36_2==RULE_ID) ) {
                                int LA36_3 = input.LA(3);

                                if ( (synpred4_InternalStateDef()) ) {
                                    alt36=1;
                                }


                            }


                        }
                        else if ( (LA36_0==RULE_ID) ) {
                            int LA36_3 = input.LA(2);

                            if ( (synpred4_InternalStateDef()) ) {
                                alt36=1;
                            }


                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalStateDef.g:3044:8: ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )=> rule__StateMachine__GlobalEnumsAssignment_2_0_1_1
                    	    {
                    	    pushFollow(FOLLOW_37);
                    	    rule__StateMachine__GlobalEnumsAssignment_2_0_1_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateMachineAccess().getGlobalEnumsAssignment_2_0_1_1()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalStateDef.g:3050:3: ({...}? => ( ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 ) ) ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 )=> rule__StateMachine__MessagesAssignment_2_0_1_2 )* ) ) ) )
                    {
                    // InternalStateDef.g:3050:3: ({...}? => ( ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 ) ) ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 )=> rule__StateMachine__MessagesAssignment_2_0_1_2 )* ) ) ) )
                    // InternalStateDef.g:3051:4: {...}? => ( ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 ) ) ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 )=> rule__StateMachine__MessagesAssignment_2_0_1_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__StateMachine__UnorderedGroup_2_0_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 2)");
                    }
                    // InternalStateDef.g:3051:112: ( ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 ) ) ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 )=> rule__StateMachine__MessagesAssignment_2_0_1_2 )* ) ) )
                    // InternalStateDef.g:3052:5: ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 ) ) ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 )=> rule__StateMachine__MessagesAssignment_2_0_1_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 2);
                    selected = true;
                    // InternalStateDef.g:3058:5: ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 ) ) ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 )=> rule__StateMachine__MessagesAssignment_2_0_1_2 )* ) )
                    // InternalStateDef.g:3059:6: ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 ) ) ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 )=> rule__StateMachine__MessagesAssignment_2_0_1_2 )* )
                    {
                    // InternalStateDef.g:3059:6: ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 ) )
                    // InternalStateDef.g:3060:7: ( rule__StateMachine__MessagesAssignment_2_0_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateMachineAccess().getMessagesAssignment_2_0_1_2()); 
                    }
                    // InternalStateDef.g:3061:7: ( rule__StateMachine__MessagesAssignment_2_0_1_2 )
                    // InternalStateDef.g:3061:8: rule__StateMachine__MessagesAssignment_2_0_1_2
                    {
                    pushFollow(FOLLOW_15);
                    rule__StateMachine__MessagesAssignment_2_0_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateMachineAccess().getMessagesAssignment_2_0_1_2()); 
                    }

                    }

                    // InternalStateDef.g:3064:6: ( ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 )=> rule__StateMachine__MessagesAssignment_2_0_1_2 )* )
                    // InternalStateDef.g:3065:7: ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 )=> rule__StateMachine__MessagesAssignment_2_0_1_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateMachineAccess().getMessagesAssignment_2_0_1_2()); 
                    }
                    // InternalStateDef.g:3066:7: ( ( rule__StateMachine__MessagesAssignment_2_0_1_2 )=> rule__StateMachine__MessagesAssignment_2_0_1_2 )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==26) ) {
                            int LA37_2 = input.LA(2);

                            if ( (LA37_2==RULE_ID) ) {
                                int LA37_3 = input.LA(3);

                                if ( (synpred5_InternalStateDef()) ) {
                                    alt37=1;
                                }


                            }


                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalStateDef.g:3066:8: ( rule__StateMachine__MessagesAssignment_2_0_1_2 )=> rule__StateMachine__MessagesAssignment_2_0_1_2
                    	    {
                    	    pushFollow(FOLLOW_15);
                    	    rule__StateMachine__MessagesAssignment_2_0_1_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateMachineAccess().getMessagesAssignment_2_0_1_2()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__UnorderedGroup_2_0_1__Impl"


    // $ANTLR start "rule__StateMachine__UnorderedGroup_2_0_1__0"
    // InternalStateDef.g:3080:1: rule__StateMachine__UnorderedGroup_2_0_1__0 : rule__StateMachine__UnorderedGroup_2_0_1__Impl ( rule__StateMachine__UnorderedGroup_2_0_1__1 )? ;
    public final void rule__StateMachine__UnorderedGroup_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3084:1: ( rule__StateMachine__UnorderedGroup_2_0_1__Impl ( rule__StateMachine__UnorderedGroup_2_0_1__1 )? )
            // InternalStateDef.g:3085:2: rule__StateMachine__UnorderedGroup_2_0_1__Impl ( rule__StateMachine__UnorderedGroup_2_0_1__1 )?
            {
            pushFollow(FOLLOW_15);
            rule__StateMachine__UnorderedGroup_2_0_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalStateDef.g:3086:2: ( rule__StateMachine__UnorderedGroup_2_0_1__1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( LA39_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 0) ) {
                alt39=1;
            }
            else if ( ( LA39_0 == RULE_ID || LA39_0 == 36 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 1) ) {
                alt39=1;
            }
            else if ( LA39_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 2) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalStateDef.g:3086:2: rule__StateMachine__UnorderedGroup_2_0_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__UnorderedGroup_2_0_1__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__UnorderedGroup_2_0_1__0"


    // $ANTLR start "rule__StateMachine__UnorderedGroup_2_0_1__1"
    // InternalStateDef.g:3092:1: rule__StateMachine__UnorderedGroup_2_0_1__1 : rule__StateMachine__UnorderedGroup_2_0_1__Impl ( rule__StateMachine__UnorderedGroup_2_0_1__2 )? ;
    public final void rule__StateMachine__UnorderedGroup_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3096:1: ( rule__StateMachine__UnorderedGroup_2_0_1__Impl ( rule__StateMachine__UnorderedGroup_2_0_1__2 )? )
            // InternalStateDef.g:3097:2: rule__StateMachine__UnorderedGroup_2_0_1__Impl ( rule__StateMachine__UnorderedGroup_2_0_1__2 )?
            {
            pushFollow(FOLLOW_15);
            rule__StateMachine__UnorderedGroup_2_0_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalStateDef.g:3098:2: ( rule__StateMachine__UnorderedGroup_2_0_1__2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 0) ) {
                alt40=1;
            }
            else if ( ( LA40_0 == RULE_ID || LA40_0 == 36 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 1) ) {
                alt40=1;
            }
            else if ( LA40_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_2_0_1(), 2) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalStateDef.g:3098:2: rule__StateMachine__UnorderedGroup_2_0_1__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__UnorderedGroup_2_0_1__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__UnorderedGroup_2_0_1__1"


    // $ANTLR start "rule__StateMachine__UnorderedGroup_2_0_1__2"
    // InternalStateDef.g:3104:1: rule__StateMachine__UnorderedGroup_2_0_1__2 : rule__StateMachine__UnorderedGroup_2_0_1__Impl ;
    public final void rule__StateMachine__UnorderedGroup_2_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3108:1: ( rule__StateMachine__UnorderedGroup_2_0_1__Impl )
            // InternalStateDef.g:3109:2: rule__StateMachine__UnorderedGroup_2_0_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__UnorderedGroup_2_0_1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__UnorderedGroup_2_0_1__2"


    // $ANTLR start "rule__StateMachine__NameAssignment_1"
    // InternalStateDef.g:3116:1: rule__StateMachine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StateMachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3120:1: ( ( RULE_ID ) )
            // InternalStateDef.g:3121:2: ( RULE_ID )
            {
            // InternalStateDef.g:3121:2: ( RULE_ID )
            // InternalStateDef.g:3122:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__NameAssignment_1"


    // $ANTLR start "rule__StateMachine__GlobalStructsAssignment_2_0_1_0"
    // InternalStateDef.g:3131:1: rule__StateMachine__GlobalStructsAssignment_2_0_1_0 : ( ruleMessageStruct ) ;
    public final void rule__StateMachine__GlobalStructsAssignment_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3135:1: ( ( ruleMessageStruct ) )
            // InternalStateDef.g:3136:2: ( ruleMessageStruct )
            {
            // InternalStateDef.g:3136:2: ( ruleMessageStruct )
            // InternalStateDef.g:3137:3: ruleMessageStruct
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getGlobalStructsMessageStructParserRuleCall_2_0_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMessageStruct();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getGlobalStructsMessageStructParserRuleCall_2_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__GlobalStructsAssignment_2_0_1_0"


    // $ANTLR start "rule__StateMachine__GlobalEnumsAssignment_2_0_1_1"
    // InternalStateDef.g:3146:1: rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 : ( ruleMessageEnum ) ;
    public final void rule__StateMachine__GlobalEnumsAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3150:1: ( ( ruleMessageEnum ) )
            // InternalStateDef.g:3151:2: ( ruleMessageEnum )
            {
            // InternalStateDef.g:3151:2: ( ruleMessageEnum )
            // InternalStateDef.g:3152:3: ruleMessageEnum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getGlobalEnumsMessageEnumParserRuleCall_2_0_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMessageEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getGlobalEnumsMessageEnumParserRuleCall_2_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__GlobalEnumsAssignment_2_0_1_1"


    // $ANTLR start "rule__StateMachine__MessagesAssignment_2_0_1_2"
    // InternalStateDef.g:3161:1: rule__StateMachine__MessagesAssignment_2_0_1_2 : ( ruleMessage ) ;
    public final void rule__StateMachine__MessagesAssignment_2_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3165:1: ( ( ruleMessage ) )
            // InternalStateDef.g:3166:2: ( ruleMessage )
            {
            // InternalStateDef.g:3166:2: ( ruleMessage )
            // InternalStateDef.g:3167:3: ruleMessage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getMessagesMessageParserRuleCall_2_0_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getMessagesMessageParserRuleCall_2_0_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__MessagesAssignment_2_0_1_2"


    // $ANTLR start "rule__StateMachine__InitStateAssignment_2_0_3"
    // InternalStateDef.g:3176:1: rule__StateMachine__InitStateAssignment_2_0_3 : ( ruleState ) ;
    public final void rule__StateMachine__InitStateAssignment_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3180:1: ( ( ruleState ) )
            // InternalStateDef.g:3181:2: ( ruleState )
            {
            // InternalStateDef.g:3181:2: ( ruleState )
            // InternalStateDef.g:3182:3: ruleState
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getInitStateStateParserRuleCall_2_0_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getInitStateStateParserRuleCall_2_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__InitStateAssignment_2_0_3"


    // $ANTLR start "rule__StateMachine__StatesAssignment_2_1"
    // InternalStateDef.g:3191:1: rule__StateMachine__StatesAssignment_2_1 : ( ruleState ) ;
    public final void rule__StateMachine__StatesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3195:1: ( ( ruleState ) )
            // InternalStateDef.g:3196:2: ( ruleState )
            {
            // InternalStateDef.g:3196:2: ( ruleState )
            // InternalStateDef.g:3197:3: ruleState
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StatesAssignment_2_1"


    // $ANTLR start "rule__StateMachine__TransitionsAssignment_2_2"
    // InternalStateDef.g:3206:1: rule__StateMachine__TransitionsAssignment_2_2 : ( ruleMessageTransition ) ;
    public final void rule__StateMachine__TransitionsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3210:1: ( ( ruleMessageTransition ) )
            // InternalStateDef.g:3211:2: ( ruleMessageTransition )
            {
            // InternalStateDef.g:3211:2: ( ruleMessageTransition )
            // InternalStateDef.g:3212:3: ruleMessageTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getTransitionsMessageTransitionParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMessageTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getTransitionsMessageTransitionParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__TransitionsAssignment_2_2"


    // $ANTLR start "rule__StateMachine__EndStateAssignment_2_3_1"
    // InternalStateDef.g:3221:1: rule__StateMachine__EndStateAssignment_2_3_1 : ( ruleState ) ;
    public final void rule__StateMachine__EndStateAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3225:1: ( ( ruleState ) )
            // InternalStateDef.g:3226:2: ( ruleState )
            {
            // InternalStateDef.g:3226:2: ( ruleState )
            // InternalStateDef.g:3227:3: ruleState
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getEndStateStateParserRuleCall_2_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getEndStateStateParserRuleCall_2_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__EndStateAssignment_2_3_1"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalStateDef.g:3236:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3240:1: ( ( RULE_ID ) )
            // InternalStateDef.g:3241:2: ( RULE_ID )
            {
            // InternalStateDef.g:3241:2: ( RULE_ID )
            // InternalStateDef.g:3242:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__MessageTransition__NameAssignment_1"
    // InternalStateDef.g:3251:1: rule__MessageTransition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MessageTransition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3255:1: ( ( RULE_ID ) )
            // InternalStateDef.g:3256:2: ( RULE_ID )
            {
            // InternalStateDef.g:3256:2: ( RULE_ID )
            // InternalStateDef.g:3257:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__NameAssignment_1"


    // $ANTLR start "rule__MessageTransition__CurrentStateAssignment_2_2_0"
    // InternalStateDef.g:3266:1: rule__MessageTransition__CurrentStateAssignment_2_2_0 : ( ruleState ) ;
    public final void rule__MessageTransition__CurrentStateAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3270:1: ( ( ruleState ) )
            // InternalStateDef.g:3271:2: ( ruleState )
            {
            // InternalStateDef.g:3271:2: ( ruleState )
            // InternalStateDef.g:3272:3: ruleState
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getCurrentStateStateParserRuleCall_2_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getCurrentStateStateParserRuleCall_2_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__CurrentStateAssignment_2_2_0"


    // $ANTLR start "rule__MessageTransition__AnyStateAssignment_2_2_1"
    // InternalStateDef.g:3281:1: rule__MessageTransition__AnyStateAssignment_2_2_1 : ( ( 'any' ) ) ;
    public final void rule__MessageTransition__AnyStateAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3285:1: ( ( ( 'any' ) ) )
            // InternalStateDef.g:3286:2: ( ( 'any' ) )
            {
            // InternalStateDef.g:3286:2: ( ( 'any' ) )
            // InternalStateDef.g:3287:3: ( 'any' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getAnyStateAnyKeyword_2_2_1_0()); 
            }
            // InternalStateDef.g:3288:3: ( 'any' )
            // InternalStateDef.g:3289:4: 'any'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getAnyStateAnyKeyword_2_2_1_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getAnyStateAnyKeyword_2_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getAnyStateAnyKeyword_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__AnyStateAssignment_2_2_1"


    // $ANTLR start "rule__MessageTransition__ReceivedMessagesAssignment_2_3_2_1"
    // InternalStateDef.g:3300:1: rule__MessageTransition__ReceivedMessagesAssignment_2_3_2_1 : ( ruleMessage ) ;
    public final void rule__MessageTransition__ReceivedMessagesAssignment_2_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3304:1: ( ( ruleMessage ) )
            // InternalStateDef.g:3305:2: ( ruleMessage )
            {
            // InternalStateDef.g:3305:2: ( ruleMessage )
            // InternalStateDef.g:3306:3: ruleMessage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getReceivedMessagesMessageParserRuleCall_2_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getReceivedMessagesMessageParserRuleCall_2_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__ReceivedMessagesAssignment_2_3_2_1"


    // $ANTLR start "rule__MessageTransition__SentMessagesAssignment_2_4_2_1"
    // InternalStateDef.g:3315:1: rule__MessageTransition__SentMessagesAssignment_2_4_2_1 : ( ruleMessage ) ;
    public final void rule__MessageTransition__SentMessagesAssignment_2_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3319:1: ( ( ruleMessage ) )
            // InternalStateDef.g:3320:2: ( ruleMessage )
            {
            // InternalStateDef.g:3320:2: ( ruleMessage )
            // InternalStateDef.g:3321:3: ruleMessage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getSentMessagesMessageParserRuleCall_2_4_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getSentMessagesMessageParserRuleCall_2_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__SentMessagesAssignment_2_4_2_1"


    // $ANTLR start "rule__MessageTransition__NextStateAssignment_2_5_1"
    // InternalStateDef.g:3330:1: rule__MessageTransition__NextStateAssignment_2_5_1 : ( ruleState ) ;
    public final void rule__MessageTransition__NextStateAssignment_2_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3334:1: ( ( ruleState ) )
            // InternalStateDef.g:3335:2: ( ruleState )
            {
            // InternalStateDef.g:3335:2: ( ruleState )
            // InternalStateDef.g:3336:3: ruleState
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageTransitionAccess().getNextStateStateParserRuleCall_2_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageTransitionAccess().getNextStateStateParserRuleCall_2_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageTransition__NextStateAssignment_2_5_1"


    // $ANTLR start "rule__Message__NameAssignment_1"
    // InternalStateDef.g:3345:1: rule__Message__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3349:1: ( ( RULE_ID ) )
            // InternalStateDef.g:3350:2: ( RULE_ID )
            {
            // InternalStateDef.g:3350:2: ( RULE_ID )
            // InternalStateDef.g:3351:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__NameAssignment_1"


    // $ANTLR start "rule__Message__StructEntriesAssignment_2_1_1"
    // InternalStateDef.g:3360:1: rule__Message__StructEntriesAssignment_2_1_1 : ( ruleMessageStructEntry ) ;
    public final void rule__Message__StructEntriesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3364:1: ( ( ruleMessageStructEntry ) )
            // InternalStateDef.g:3365:2: ( ruleMessageStructEntry )
            {
            // InternalStateDef.g:3365:2: ( ruleMessageStructEntry )
            // InternalStateDef.g:3366:3: ruleMessageStructEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getStructEntriesMessageStructEntryParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMessageStructEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getStructEntriesMessageStructEntryParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__StructEntriesAssignment_2_1_1"


    // $ANTLR start "rule__MessageStruct__NameAssignment_1"
    // InternalStateDef.g:3375:1: rule__MessageStruct__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MessageStruct__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3379:1: ( ( RULE_ID ) )
            // InternalStateDef.g:3380:2: ( RULE_ID )
            {
            // InternalStateDef.g:3380:2: ( RULE_ID )
            // InternalStateDef.g:3381:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStruct__NameAssignment_1"


    // $ANTLR start "rule__MessageStruct__StructEntriesAssignment_2_1"
    // InternalStateDef.g:3390:1: rule__MessageStruct__StructEntriesAssignment_2_1 : ( ruleMessageStructEntry ) ;
    public final void rule__MessageStruct__StructEntriesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3394:1: ( ( ruleMessageStructEntry ) )
            // InternalStateDef.g:3395:2: ( ruleMessageStructEntry )
            {
            // InternalStateDef.g:3395:2: ( ruleMessageStructEntry )
            // InternalStateDef.g:3396:3: ruleMessageStructEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructAccess().getStructEntriesMessageStructEntryParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMessageStructEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructAccess().getStructEntriesMessageStructEntryParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStruct__StructEntriesAssignment_2_1"


    // $ANTLR start "rule__MessageStructEntry__DataTypeAssignment_0_0"
    // InternalStateDef.g:3405:1: rule__MessageStructEntry__DataTypeAssignment_0_0 : ( RULE_DATATYPE ) ;
    public final void rule__MessageStructEntry__DataTypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3409:1: ( ( RULE_DATATYPE ) )
            // InternalStateDef.g:3410:2: ( RULE_DATATYPE )
            {
            // InternalStateDef.g:3410:2: ( RULE_DATATYPE )
            // InternalStateDef.g:3411:3: RULE_DATATYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getDataTypeDATATYPETerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_DATATYPE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getDataTypeDATATYPETerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__DataTypeAssignment_0_0"


    // $ANTLR start "rule__MessageStructEntry__RefTypeAssignment_0_1"
    // InternalStateDef.g:3420:1: rule__MessageStructEntry__RefTypeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__MessageStructEntry__RefTypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3424:1: ( ( RULE_ID ) )
            // InternalStateDef.g:3425:2: ( RULE_ID )
            {
            // InternalStateDef.g:3425:2: ( RULE_ID )
            // InternalStateDef.g:3426:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getRefTypeIDTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getRefTypeIDTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__RefTypeAssignment_0_1"


    // $ANTLR start "rule__MessageStructEntry__NameAssignment_1"
    // InternalStateDef.g:3435:1: rule__MessageStructEntry__NameAssignment_1 : ( RULE_ENUMNAME ) ;
    public final void rule__MessageStructEntry__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3439:1: ( ( RULE_ENUMNAME ) )
            // InternalStateDef.g:3440:2: ( RULE_ENUMNAME )
            {
            // InternalStateDef.g:3440:2: ( RULE_ENUMNAME )
            // InternalStateDef.g:3441:3: RULE_ENUMNAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getNameENUMNAMETerminalRuleCall_1_0()); 
            }
            match(input,RULE_ENUMNAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getNameENUMNAMETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__NameAssignment_1"


    // $ANTLR start "rule__MessageStructEntry__ByteRangeAssignment_2_0"
    // InternalStateDef.g:3450:1: rule__MessageStructEntry__ByteRangeAssignment_2_0 : ( ruleMessageByteRange ) ;
    public final void rule__MessageStructEntry__ByteRangeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3454:1: ( ( ruleMessageByteRange ) )
            // InternalStateDef.g:3455:2: ( ruleMessageByteRange )
            {
            // InternalStateDef.g:3455:2: ( ruleMessageByteRange )
            // InternalStateDef.g:3456:3: ruleMessageByteRange
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getByteRangeMessageByteRangeParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMessageByteRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getByteRangeMessageByteRangeParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__ByteRangeAssignment_2_0"


    // $ANTLR start "rule__MessageStructEntry__ByteSizeAssignment_2_1"
    // InternalStateDef.g:3465:1: rule__MessageStructEntry__ByteSizeAssignment_2_1 : ( ruleMessageByteArray ) ;
    public final void rule__MessageStructEntry__ByteSizeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3469:1: ( ( ruleMessageByteArray ) )
            // InternalStateDef.g:3470:2: ( ruleMessageByteArray )
            {
            // InternalStateDef.g:3470:2: ( ruleMessageByteArray )
            // InternalStateDef.g:3471:3: ruleMessageByteArray
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getByteSizeMessageByteArrayParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMessageByteArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getByteSizeMessageByteArrayParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__ByteSizeAssignment_2_1"


    // $ANTLR start "rule__MessageStructEntry__DataAssignmentAssignment_3_1_0"
    // InternalStateDef.g:3480:1: rule__MessageStructEntry__DataAssignmentAssignment_3_1_0 : ( ruleMessageStructureDatatype ) ;
    public final void rule__MessageStructEntry__DataAssignmentAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3484:1: ( ( ruleMessageStructureDatatype ) )
            // InternalStateDef.g:3485:2: ( ruleMessageStructureDatatype )
            {
            // InternalStateDef.g:3485:2: ( ruleMessageStructureDatatype )
            // InternalStateDef.g:3486:3: ruleMessageStructureDatatype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructEntryAccess().getDataAssignmentMessageStructureDatatypeParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMessageStructureDatatype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructEntryAccess().getDataAssignmentMessageStructureDatatypeParserRuleCall_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructEntry__DataAssignmentAssignment_3_1_0"


    // $ANTLR start "rule__MessageByteRange__StartAssignment_1"
    // InternalStateDef.g:3495:1: rule__MessageByteRange__StartAssignment_1 : ( RULE_INT ) ;
    public final void rule__MessageByteRange__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3499:1: ( ( RULE_INT ) )
            // InternalStateDef.g:3500:2: ( RULE_INT )
            {
            // InternalStateDef.g:3500:2: ( RULE_INT )
            // InternalStateDef.g:3501:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageByteRangeAccess().getStartINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageByteRangeAccess().getStartINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteRange__StartAssignment_1"


    // $ANTLR start "rule__MessageByteRange__EndAssignment_3"
    // InternalStateDef.g:3510:1: rule__MessageByteRange__EndAssignment_3 : ( RULE_INT ) ;
    public final void rule__MessageByteRange__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3514:1: ( ( RULE_INT ) )
            // InternalStateDef.g:3515:2: ( RULE_INT )
            {
            // InternalStateDef.g:3515:2: ( RULE_INT )
            // InternalStateDef.g:3516:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageByteRangeAccess().getEndINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageByteRangeAccess().getEndINTTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteRange__EndAssignment_3"


    // $ANTLR start "rule__MessageByteArray__SizeAssignment_1"
    // InternalStateDef.g:3525:1: rule__MessageByteArray__SizeAssignment_1 : ( RULE_INT ) ;
    public final void rule__MessageByteArray__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3529:1: ( ( RULE_INT ) )
            // InternalStateDef.g:3530:2: ( RULE_INT )
            {
            // InternalStateDef.g:3530:2: ( RULE_INT )
            // InternalStateDef.g:3531:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageByteArrayAccess().getSizeINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageByteArrayAccess().getSizeINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageByteArray__SizeAssignment_1"


    // $ANTLR start "rule__MessageStructureStruct__ValuesAssignment_1_0"
    // InternalStateDef.g:3540:1: rule__MessageStructureStruct__ValuesAssignment_1_0 : ( ruleMessageStructureDatatype ) ;
    public final void rule__MessageStructureStruct__ValuesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3544:1: ( ( ruleMessageStructureDatatype ) )
            // InternalStateDef.g:3545:2: ( ruleMessageStructureDatatype )
            {
            // InternalStateDef.g:3545:2: ( ruleMessageStructureDatatype )
            // InternalStateDef.g:3546:3: ruleMessageStructureDatatype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureStructAccess().getValuesMessageStructureDatatypeParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMessageStructureDatatype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureStructAccess().getValuesMessageStructureDatatypeParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureStruct__ValuesAssignment_1_0"


    // $ANTLR start "rule__MessageStructureDatatype__HexValAssignment_0"
    // InternalStateDef.g:3555:1: rule__MessageStructureDatatype__HexValAssignment_0 : ( RULE_HEX ) ;
    public final void rule__MessageStructureDatatype__HexValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3559:1: ( ( RULE_HEX ) )
            // InternalStateDef.g:3560:2: ( RULE_HEX )
            {
            // InternalStateDef.g:3560:2: ( RULE_HEX )
            // InternalStateDef.g:3561:3: RULE_HEX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureDatatypeAccess().getHexValHEXTerminalRuleCall_0_0()); 
            }
            match(input,RULE_HEX,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureDatatypeAccess().getHexValHEXTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureDatatype__HexValAssignment_0"


    // $ANTLR start "rule__MessageStructureDatatype__EnumValAssignment_1"
    // InternalStateDef.g:3570:1: rule__MessageStructureDatatype__EnumValAssignment_1 : ( RULE_ENUMNAME ) ;
    public final void rule__MessageStructureDatatype__EnumValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3574:1: ( ( RULE_ENUMNAME ) )
            // InternalStateDef.g:3575:2: ( RULE_ENUMNAME )
            {
            // InternalStateDef.g:3575:2: ( RULE_ENUMNAME )
            // InternalStateDef.g:3576:3: RULE_ENUMNAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureDatatypeAccess().getEnumValENUMNAMETerminalRuleCall_1_0()); 
            }
            match(input,RULE_ENUMNAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureDatatypeAccess().getEnumValENUMNAMETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureDatatype__EnumValAssignment_1"


    // $ANTLR start "rule__MessageStructureDatatype__StructValAssignment_2"
    // InternalStateDef.g:3585:1: rule__MessageStructureDatatype__StructValAssignment_2 : ( ruleMessageStructureStruct ) ;
    public final void rule__MessageStructureDatatype__StructValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3589:1: ( ( ruleMessageStructureStruct ) )
            // InternalStateDef.g:3590:2: ( ruleMessageStructureStruct )
            {
            // InternalStateDef.g:3590:2: ( ruleMessageStructureStruct )
            // InternalStateDef.g:3591:3: ruleMessageStructureStruct
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureDatatypeAccess().getStructValMessageStructureStructParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMessageStructureStruct();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureDatatypeAccess().getStructValMessageStructureStructParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureDatatype__StructValAssignment_2"


    // $ANTLR start "rule__MessageStructureDatatype__ArrayValAssignment_3_1_0"
    // InternalStateDef.g:3600:1: rule__MessageStructureDatatype__ArrayValAssignment_3_1_0 : ( ruleMessageStructureDatatype ) ;
    public final void rule__MessageStructureDatatype__ArrayValAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3604:1: ( ( ruleMessageStructureDatatype ) )
            // InternalStateDef.g:3605:2: ( ruleMessageStructureDatatype )
            {
            // InternalStateDef.g:3605:2: ( ruleMessageStructureDatatype )
            // InternalStateDef.g:3606:3: ruleMessageStructureDatatype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageStructureDatatypeAccess().getArrayValMessageStructureDatatypeParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMessageStructureDatatype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageStructureDatatypeAccess().getArrayValMessageStructureDatatypeParserRuleCall_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageStructureDatatype__ArrayValAssignment_3_1_0"


    // $ANTLR start "rule__MessageEnum__NameAssignment_1"
    // InternalStateDef.g:3615:1: rule__MessageEnum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MessageEnum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3619:1: ( ( RULE_ID ) )
            // InternalStateDef.g:3620:2: ( RULE_ID )
            {
            // InternalStateDef.g:3620:2: ( RULE_ID )
            // InternalStateDef.g:3621:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__NameAssignment_1"


    // $ANTLR start "rule__MessageEnum__NamesAssignment_2_1_0"
    // InternalStateDef.g:3630:1: rule__MessageEnum__NamesAssignment_2_1_0 : ( RULE_ENUMNAME ) ;
    public final void rule__MessageEnum__NamesAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3634:1: ( ( RULE_ENUMNAME ) )
            // InternalStateDef.g:3635:2: ( RULE_ENUMNAME )
            {
            // InternalStateDef.g:3635:2: ( RULE_ENUMNAME )
            // InternalStateDef.g:3636:3: RULE_ENUMNAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumAccess().getNamesENUMNAMETerminalRuleCall_2_1_0_0()); 
            }
            match(input,RULE_ENUMNAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumAccess().getNamesENUMNAMETerminalRuleCall_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__NamesAssignment_2_1_0"


    // $ANTLR start "rule__MessageEnum__ValuesAssignment_2_1_2"
    // InternalStateDef.g:3645:1: rule__MessageEnum__ValuesAssignment_2_1_2 : ( RULE_INT ) ;
    public final void rule__MessageEnum__ValuesAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDef.g:3649:1: ( ( RULE_INT ) )
            // InternalStateDef.g:3650:2: ( RULE_INT )
            {
            // InternalStateDef.g:3650:2: ( RULE_INT )
            // InternalStateDef.g:3651:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEnumAccess().getValuesINTTerminalRuleCall_2_1_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEnumAccess().getValuesINTTerminalRuleCall_2_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEnum__ValuesAssignment_2_1_2"

    // $ANTLR start synpred1_InternalStateDef
    public final void synpred1_InternalStateDef_fragment() throws RecognitionException {   
        // InternalStateDef.g:2886:8: ( rule__StateMachine__StatesAssignment_2_1 )
        // InternalStateDef.g:2886:9: rule__StateMachine__StatesAssignment_2_1
        {
        pushFollow(FOLLOW_2);
        rule__StateMachine__StatesAssignment_2_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalStateDef

    // $ANTLR start synpred2_InternalStateDef
    public final void synpred2_InternalStateDef_fragment() throws RecognitionException {   
        // InternalStateDef.g:2908:8: ( rule__StateMachine__TransitionsAssignment_2_2 )
        // InternalStateDef.g:2908:9: rule__StateMachine__TransitionsAssignment_2_2
        {
        pushFollow(FOLLOW_2);
        rule__StateMachine__TransitionsAssignment_2_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalStateDef

    // $ANTLR start synpred3_InternalStateDef
    public final void synpred3_InternalStateDef_fragment() throws RecognitionException {   
        // InternalStateDef.g:3022:8: ( rule__StateMachine__GlobalStructsAssignment_2_0_1_0 )
        // InternalStateDef.g:3022:9: rule__StateMachine__GlobalStructsAssignment_2_0_1_0
        {
        pushFollow(FOLLOW_2);
        rule__StateMachine__GlobalStructsAssignment_2_0_1_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalStateDef

    // $ANTLR start synpred4_InternalStateDef
    public final void synpred4_InternalStateDef_fragment() throws RecognitionException {   
        // InternalStateDef.g:3044:8: ( rule__StateMachine__GlobalEnumsAssignment_2_0_1_1 )
        // InternalStateDef.g:3044:9: rule__StateMachine__GlobalEnumsAssignment_2_0_1_1
        {
        pushFollow(FOLLOW_2);
        rule__StateMachine__GlobalEnumsAssignment_2_0_1_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalStateDef

    // $ANTLR start synpred5_InternalStateDef
    public final void synpred5_InternalStateDef_fragment() throws RecognitionException {   
        // InternalStateDef.g:3066:8: ( rule__StateMachine__MessagesAssignment_2_0_1_2 )
        // InternalStateDef.g:3066:9: rule__StateMachine__MessagesAssignment_2_0_1_2
        {
        pushFollow(FOLLOW_2);
        rule__StateMachine__MessagesAssignment_2_0_1_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalStateDef

    // Delegated rules

    public final boolean synpred1_InternalStateDef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalStateDef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalStateDef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalStateDef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalStateDef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalStateDef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalStateDef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalStateDef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalStateDef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalStateDef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001A8000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000100C000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003440000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000100C040010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000100C000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000004B0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400008140L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400008142L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000001A8002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000012L});

}
