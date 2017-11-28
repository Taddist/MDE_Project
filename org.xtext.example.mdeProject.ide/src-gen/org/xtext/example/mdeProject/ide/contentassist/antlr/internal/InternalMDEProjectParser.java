package org.xtext.example.mdeProject.ide.contentassist.antlr.internal;

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
import org.xtext.example.mdeProject.services.MDEProjectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMDEProjectParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Load'", "'Do'", "'{'", "'}'", "';'", "'Add'", "'Delete'", "'Modify'", "'newValueName'", "'newValueType'", "'Eclass'", "':'", "'['", "']'", "'relatedTo'", "'boundEclass'", "'boundRelatedTo'", "'typeRelation'", "'('", "')'", "','", "'Eattribute'", "'from'", "'type'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMDEProjectParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMDEProjectParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMDEProjectParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMDEProject.g"; }


    	private MDEProjectGrammarAccess grammarAccess;

    	public void setGrammarAccess(MDEProjectGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleLoad"
    // InternalMDEProject.g:53:1: entryRuleLoad : ruleLoad EOF ;
    public final void entryRuleLoad() throws RecognitionException {
        try {
            // InternalMDEProject.g:54:1: ( ruleLoad EOF )
            // InternalMDEProject.g:55:1: ruleLoad EOF
            {
             before(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_1);
            ruleLoad();

            state._fsp--;

             after(grammarAccess.getLoadRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // InternalMDEProject.g:62:1: ruleLoad : ( ( rule__Load__Group__0 ) ) ;
    public final void ruleLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:66:2: ( ( ( rule__Load__Group__0 ) ) )
            // InternalMDEProject.g:67:2: ( ( rule__Load__Group__0 ) )
            {
            // InternalMDEProject.g:67:2: ( ( rule__Load__Group__0 ) )
            // InternalMDEProject.g:68:3: ( rule__Load__Group__0 )
            {
             before(grammarAccess.getLoadAccess().getGroup()); 
            // InternalMDEProject.g:69:3: ( rule__Load__Group__0 )
            // InternalMDEProject.g:69:4: rule__Load__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Load__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getGroup()); 

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
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRuleQueryExpression"
    // InternalMDEProject.g:78:1: entryRuleQueryExpression : ruleQueryExpression EOF ;
    public final void entryRuleQueryExpression() throws RecognitionException {
        try {
            // InternalMDEProject.g:79:1: ( ruleQueryExpression EOF )
            // InternalMDEProject.g:80:1: ruleQueryExpression EOF
            {
             before(grammarAccess.getQueryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryExpression();

            state._fsp--;

             after(grammarAccess.getQueryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQueryExpression"


    // $ANTLR start "ruleQueryExpression"
    // InternalMDEProject.g:87:1: ruleQueryExpression : ( ( rule__QueryExpression__Alternatives ) ) ;
    public final void ruleQueryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:91:2: ( ( ( rule__QueryExpression__Alternatives ) ) )
            // InternalMDEProject.g:92:2: ( ( rule__QueryExpression__Alternatives ) )
            {
            // InternalMDEProject.g:92:2: ( ( rule__QueryExpression__Alternatives ) )
            // InternalMDEProject.g:93:3: ( rule__QueryExpression__Alternatives )
            {
             before(grammarAccess.getQueryExpressionAccess().getAlternatives()); 
            // InternalMDEProject.g:94:3: ( rule__QueryExpression__Alternatives )
            // InternalMDEProject.g:94:4: rule__QueryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QueryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQueryExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQueryExpression"


    // $ANTLR start "entryRuleKeyword"
    // InternalMDEProject.g:103:1: entryRuleKeyword : ruleKeyword EOF ;
    public final void entryRuleKeyword() throws RecognitionException {
        try {
            // InternalMDEProject.g:104:1: ( ruleKeyword EOF )
            // InternalMDEProject.g:105:1: ruleKeyword EOF
            {
             before(grammarAccess.getKeywordRule()); 
            pushFollow(FOLLOW_1);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getKeywordRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // InternalMDEProject.g:112:1: ruleKeyword : ( ( rule__Keyword__Alternatives ) ) ;
    public final void ruleKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:116:2: ( ( ( rule__Keyword__Alternatives ) ) )
            // InternalMDEProject.g:117:2: ( ( rule__Keyword__Alternatives ) )
            {
            // InternalMDEProject.g:117:2: ( ( rule__Keyword__Alternatives ) )
            // InternalMDEProject.g:118:3: ( rule__Keyword__Alternatives )
            {
             before(grammarAccess.getKeywordAccess().getAlternatives()); 
            // InternalMDEProject.g:119:3: ( rule__Keyword__Alternatives )
            // InternalMDEProject.g:119:4: rule__Keyword__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Keyword__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKeywordAccess().getAlternatives()); 

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
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleEString"
    // InternalMDEProject.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMDEProject.g:129:1: ( ruleEString EOF )
            // InternalMDEProject.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMDEProject.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMDEProject.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMDEProject.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalMDEProject.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMDEProject.g:144:3: ( rule__EString__Alternatives )
            // InternalMDEProject.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAdd"
    // InternalMDEProject.g:153:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalMDEProject.g:154:1: ( ruleAdd EOF )
            // InternalMDEProject.g:155:1: ruleAdd EOF
            {
             before(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalMDEProject.g:162:1: ruleAdd : ( ( rule__Add__Group__0 ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:166:2: ( ( ( rule__Add__Group__0 ) ) )
            // InternalMDEProject.g:167:2: ( ( rule__Add__Group__0 ) )
            {
            // InternalMDEProject.g:167:2: ( ( rule__Add__Group__0 ) )
            // InternalMDEProject.g:168:3: ( rule__Add__Group__0 )
            {
             before(grammarAccess.getAddAccess().getGroup()); 
            // InternalMDEProject.g:169:3: ( rule__Add__Group__0 )
            // InternalMDEProject.g:169:4: rule__Add__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getGroup()); 

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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleDelete"
    // InternalMDEProject.g:178:1: entryRuleDelete : ruleDelete EOF ;
    public final void entryRuleDelete() throws RecognitionException {
        try {
            // InternalMDEProject.g:179:1: ( ruleDelete EOF )
            // InternalMDEProject.g:180:1: ruleDelete EOF
            {
             before(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            ruleDelete();

            state._fsp--;

             after(grammarAccess.getDeleteRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalMDEProject.g:187:1: ruleDelete : ( ( rule__Delete__Group__0 ) ) ;
    public final void ruleDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:191:2: ( ( ( rule__Delete__Group__0 ) ) )
            // InternalMDEProject.g:192:2: ( ( rule__Delete__Group__0 ) )
            {
            // InternalMDEProject.g:192:2: ( ( rule__Delete__Group__0 ) )
            // InternalMDEProject.g:193:3: ( rule__Delete__Group__0 )
            {
             before(grammarAccess.getDeleteAccess().getGroup()); 
            // InternalMDEProject.g:194:3: ( rule__Delete__Group__0 )
            // InternalMDEProject.g:194:4: rule__Delete__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getGroup()); 

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
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleModify"
    // InternalMDEProject.g:203:1: entryRuleModify : ruleModify EOF ;
    public final void entryRuleModify() throws RecognitionException {
        try {
            // InternalMDEProject.g:204:1: ( ruleModify EOF )
            // InternalMDEProject.g:205:1: ruleModify EOF
            {
             before(grammarAccess.getModifyRule()); 
            pushFollow(FOLLOW_1);
            ruleModify();

            state._fsp--;

             after(grammarAccess.getModifyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModify"


    // $ANTLR start "ruleModify"
    // InternalMDEProject.g:212:1: ruleModify : ( ( rule__Modify__Group__0 ) ) ;
    public final void ruleModify() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:216:2: ( ( ( rule__Modify__Group__0 ) ) )
            // InternalMDEProject.g:217:2: ( ( rule__Modify__Group__0 ) )
            {
            // InternalMDEProject.g:217:2: ( ( rule__Modify__Group__0 ) )
            // InternalMDEProject.g:218:3: ( rule__Modify__Group__0 )
            {
             before(grammarAccess.getModifyAccess().getGroup()); 
            // InternalMDEProject.g:219:3: ( rule__Modify__Group__0 )
            // InternalMDEProject.g:219:4: rule__Modify__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Modify__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModifyAccess().getGroup()); 

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
    // $ANTLR end "ruleModify"


    // $ANTLR start "entryRuleEclass"
    // InternalMDEProject.g:228:1: entryRuleEclass : ruleEclass EOF ;
    public final void entryRuleEclass() throws RecognitionException {
        try {
            // InternalMDEProject.g:229:1: ( ruleEclass EOF )
            // InternalMDEProject.g:230:1: ruleEclass EOF
            {
             before(grammarAccess.getEclassRule()); 
            pushFollow(FOLLOW_1);
            ruleEclass();

            state._fsp--;

             after(grammarAccess.getEclassRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEclass"


    // $ANTLR start "ruleEclass"
    // InternalMDEProject.g:237:1: ruleEclass : ( ( rule__Eclass__Group__0 ) ) ;
    public final void ruleEclass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:241:2: ( ( ( rule__Eclass__Group__0 ) ) )
            // InternalMDEProject.g:242:2: ( ( rule__Eclass__Group__0 ) )
            {
            // InternalMDEProject.g:242:2: ( ( rule__Eclass__Group__0 ) )
            // InternalMDEProject.g:243:3: ( rule__Eclass__Group__0 )
            {
             before(grammarAccess.getEclassAccess().getGroup()); 
            // InternalMDEProject.g:244:3: ( rule__Eclass__Group__0 )
            // InternalMDEProject.g:244:4: rule__Eclass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEclassAccess().getGroup()); 

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
    // $ANTLR end "ruleEclass"


    // $ANTLR start "entryRuleEattribute"
    // InternalMDEProject.g:253:1: entryRuleEattribute : ruleEattribute EOF ;
    public final void entryRuleEattribute() throws RecognitionException {
        try {
            // InternalMDEProject.g:254:1: ( ruleEattribute EOF )
            // InternalMDEProject.g:255:1: ruleEattribute EOF
            {
             before(grammarAccess.getEattributeRule()); 
            pushFollow(FOLLOW_1);
            ruleEattribute();

            state._fsp--;

             after(grammarAccess.getEattributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEattribute"


    // $ANTLR start "ruleEattribute"
    // InternalMDEProject.g:262:1: ruleEattribute : ( ( rule__Eattribute__Group__0 ) ) ;
    public final void ruleEattribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:266:2: ( ( ( rule__Eattribute__Group__0 ) ) )
            // InternalMDEProject.g:267:2: ( ( rule__Eattribute__Group__0 ) )
            {
            // InternalMDEProject.g:267:2: ( ( rule__Eattribute__Group__0 ) )
            // InternalMDEProject.g:268:3: ( rule__Eattribute__Group__0 )
            {
             before(grammarAccess.getEattributeAccess().getGroup()); 
            // InternalMDEProject.g:269:3: ( rule__Eattribute__Group__0 )
            // InternalMDEProject.g:269:4: rule__Eattribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Eattribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEattributeAccess().getGroup()); 

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
    // $ANTLR end "ruleEattribute"


    // $ANTLR start "rule__QueryExpression__Alternatives"
    // InternalMDEProject.g:277:1: rule__QueryExpression__Alternatives : ( ( ruleAdd ) | ( ruleDelete ) | ( ruleModify ) );
    public final void rule__QueryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:281:1: ( ( ruleAdd ) | ( ruleDelete ) | ( ruleModify ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMDEProject.g:282:2: ( ruleAdd )
                    {
                    // InternalMDEProject.g:282:2: ( ruleAdd )
                    // InternalMDEProject.g:283:3: ruleAdd
                    {
                     before(grammarAccess.getQueryExpressionAccess().getAddParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAdd();

                    state._fsp--;

                     after(grammarAccess.getQueryExpressionAccess().getAddParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMDEProject.g:288:2: ( ruleDelete )
                    {
                    // InternalMDEProject.g:288:2: ( ruleDelete )
                    // InternalMDEProject.g:289:3: ruleDelete
                    {
                     before(grammarAccess.getQueryExpressionAccess().getDeleteParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDelete();

                    state._fsp--;

                     after(grammarAccess.getQueryExpressionAccess().getDeleteParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMDEProject.g:294:2: ( ruleModify )
                    {
                    // InternalMDEProject.g:294:2: ( ruleModify )
                    // InternalMDEProject.g:295:3: ruleModify
                    {
                     before(grammarAccess.getQueryExpressionAccess().getModifyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleModify();

                    state._fsp--;

                     after(grammarAccess.getQueryExpressionAccess().getModifyParserRuleCall_2()); 

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
    // $ANTLR end "rule__QueryExpression__Alternatives"


    // $ANTLR start "rule__Keyword__Alternatives"
    // InternalMDEProject.g:304:1: rule__Keyword__Alternatives : ( ( ruleEclass ) | ( ruleEattribute ) );
    public final void rule__Keyword__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:308:1: ( ( ruleEclass ) | ( ruleEattribute ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==32) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMDEProject.g:309:2: ( ruleEclass )
                    {
                    // InternalMDEProject.g:309:2: ( ruleEclass )
                    // InternalMDEProject.g:310:3: ruleEclass
                    {
                     before(grammarAccess.getKeywordAccess().getEclassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEclass();

                    state._fsp--;

                     after(grammarAccess.getKeywordAccess().getEclassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMDEProject.g:315:2: ( ruleEattribute )
                    {
                    // InternalMDEProject.g:315:2: ( ruleEattribute )
                    // InternalMDEProject.g:316:3: ruleEattribute
                    {
                     before(grammarAccess.getKeywordAccess().getEattributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEattribute();

                    state._fsp--;

                     after(grammarAccess.getKeywordAccess().getEattributeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Keyword__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMDEProject.g:325:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:329:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMDEProject.g:330:2: ( RULE_STRING )
                    {
                    // InternalMDEProject.g:330:2: ( RULE_STRING )
                    // InternalMDEProject.g:331:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMDEProject.g:336:2: ( RULE_ID )
                    {
                    // InternalMDEProject.g:336:2: ( RULE_ID )
                    // InternalMDEProject.g:337:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Load__Group__0"
    // InternalMDEProject.g:346:1: rule__Load__Group__0 : rule__Load__Group__0__Impl rule__Load__Group__1 ;
    public final void rule__Load__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:350:1: ( rule__Load__Group__0__Impl rule__Load__Group__1 )
            // InternalMDEProject.g:351:2: rule__Load__Group__0__Impl rule__Load__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Load__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Load__Group__0"


    // $ANTLR start "rule__Load__Group__0__Impl"
    // InternalMDEProject.g:358:1: rule__Load__Group__0__Impl : ( 'Load' ) ;
    public final void rule__Load__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:362:1: ( ( 'Load' ) )
            // InternalMDEProject.g:363:1: ( 'Load' )
            {
            // InternalMDEProject.g:363:1: ( 'Load' )
            // InternalMDEProject.g:364:2: 'Load'
            {
             before(grammarAccess.getLoadAccess().getLoadKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getLoadKeyword_0()); 

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
    // $ANTLR end "rule__Load__Group__0__Impl"


    // $ANTLR start "rule__Load__Group__1"
    // InternalMDEProject.g:373:1: rule__Load__Group__1 : rule__Load__Group__1__Impl rule__Load__Group__2 ;
    public final void rule__Load__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:377:1: ( rule__Load__Group__1__Impl rule__Load__Group__2 )
            // InternalMDEProject.g:378:2: rule__Load__Group__1__Impl rule__Load__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Load__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Load__Group__1"


    // $ANTLR start "rule__Load__Group__1__Impl"
    // InternalMDEProject.g:385:1: rule__Load__Group__1__Impl : ( ( rule__Load__NameAssignment_1 ) ) ;
    public final void rule__Load__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:389:1: ( ( ( rule__Load__NameAssignment_1 ) ) )
            // InternalMDEProject.g:390:1: ( ( rule__Load__NameAssignment_1 ) )
            {
            // InternalMDEProject.g:390:1: ( ( rule__Load__NameAssignment_1 ) )
            // InternalMDEProject.g:391:2: ( rule__Load__NameAssignment_1 )
            {
             before(grammarAccess.getLoadAccess().getNameAssignment_1()); 
            // InternalMDEProject.g:392:2: ( rule__Load__NameAssignment_1 )
            // InternalMDEProject.g:392:3: rule__Load__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Load__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Load__Group__1__Impl"


    // $ANTLR start "rule__Load__Group__2"
    // InternalMDEProject.g:400:1: rule__Load__Group__2 : rule__Load__Group__2__Impl rule__Load__Group__3 ;
    public final void rule__Load__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:404:1: ( rule__Load__Group__2__Impl rule__Load__Group__3 )
            // InternalMDEProject.g:405:2: rule__Load__Group__2__Impl rule__Load__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Load__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Load__Group__2"


    // $ANTLR start "rule__Load__Group__2__Impl"
    // InternalMDEProject.g:412:1: rule__Load__Group__2__Impl : ( 'Do' ) ;
    public final void rule__Load__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:416:1: ( ( 'Do' ) )
            // InternalMDEProject.g:417:1: ( 'Do' )
            {
            // InternalMDEProject.g:417:1: ( 'Do' )
            // InternalMDEProject.g:418:2: 'Do'
            {
             before(grammarAccess.getLoadAccess().getDoKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getDoKeyword_2()); 

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
    // $ANTLR end "rule__Load__Group__2__Impl"


    // $ANTLR start "rule__Load__Group__3"
    // InternalMDEProject.g:427:1: rule__Load__Group__3 : rule__Load__Group__3__Impl rule__Load__Group__4 ;
    public final void rule__Load__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:431:1: ( rule__Load__Group__3__Impl rule__Load__Group__4 )
            // InternalMDEProject.g:432:2: rule__Load__Group__3__Impl rule__Load__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Load__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Load__Group__3"


    // $ANTLR start "rule__Load__Group__3__Impl"
    // InternalMDEProject.g:439:1: rule__Load__Group__3__Impl : ( '{' ) ;
    public final void rule__Load__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:443:1: ( ( '{' ) )
            // InternalMDEProject.g:444:1: ( '{' )
            {
            // InternalMDEProject.g:444:1: ( '{' )
            // InternalMDEProject.g:445:2: '{'
            {
             before(grammarAccess.getLoadAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Load__Group__3__Impl"


    // $ANTLR start "rule__Load__Group__4"
    // InternalMDEProject.g:454:1: rule__Load__Group__4 : rule__Load__Group__4__Impl rule__Load__Group__5 ;
    public final void rule__Load__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:458:1: ( rule__Load__Group__4__Impl rule__Load__Group__5 )
            // InternalMDEProject.g:459:2: rule__Load__Group__4__Impl rule__Load__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Load__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Load__Group__4"


    // $ANTLR start "rule__Load__Group__4__Impl"
    // InternalMDEProject.g:466:1: rule__Load__Group__4__Impl : ( ( rule__Load__ActionsAssignment_4 ) ) ;
    public final void rule__Load__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:470:1: ( ( ( rule__Load__ActionsAssignment_4 ) ) )
            // InternalMDEProject.g:471:1: ( ( rule__Load__ActionsAssignment_4 ) )
            {
            // InternalMDEProject.g:471:1: ( ( rule__Load__ActionsAssignment_4 ) )
            // InternalMDEProject.g:472:2: ( rule__Load__ActionsAssignment_4 )
            {
             before(grammarAccess.getLoadAccess().getActionsAssignment_4()); 
            // InternalMDEProject.g:473:2: ( rule__Load__ActionsAssignment_4 )
            // InternalMDEProject.g:473:3: rule__Load__ActionsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Load__ActionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getActionsAssignment_4()); 

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
    // $ANTLR end "rule__Load__Group__4__Impl"


    // $ANTLR start "rule__Load__Group__5"
    // InternalMDEProject.g:481:1: rule__Load__Group__5 : rule__Load__Group__5__Impl rule__Load__Group__6 ;
    public final void rule__Load__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:485:1: ( rule__Load__Group__5__Impl rule__Load__Group__6 )
            // InternalMDEProject.g:486:2: rule__Load__Group__5__Impl rule__Load__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Load__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__Load__Group__5"


    // $ANTLR start "rule__Load__Group__5__Impl"
    // InternalMDEProject.g:493:1: rule__Load__Group__5__Impl : ( ( rule__Load__Group_5__0 )* ) ;
    public final void rule__Load__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:497:1: ( ( ( rule__Load__Group_5__0 )* ) )
            // InternalMDEProject.g:498:1: ( ( rule__Load__Group_5__0 )* )
            {
            // InternalMDEProject.g:498:1: ( ( rule__Load__Group_5__0 )* )
            // InternalMDEProject.g:499:2: ( rule__Load__Group_5__0 )*
            {
             before(grammarAccess.getLoadAccess().getGroup_5()); 
            // InternalMDEProject.g:500:2: ( rule__Load__Group_5__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMDEProject.g:500:3: rule__Load__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Load__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getLoadAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Load__Group__5__Impl"


    // $ANTLR start "rule__Load__Group__6"
    // InternalMDEProject.g:508:1: rule__Load__Group__6 : rule__Load__Group__6__Impl ;
    public final void rule__Load__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:512:1: ( rule__Load__Group__6__Impl )
            // InternalMDEProject.g:513:2: rule__Load__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Load__Group__6__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Load__Group__6"


    // $ANTLR start "rule__Load__Group__6__Impl"
    // InternalMDEProject.g:519:1: rule__Load__Group__6__Impl : ( '}' ) ;
    public final void rule__Load__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:523:1: ( ( '}' ) )
            // InternalMDEProject.g:524:1: ( '}' )
            {
            // InternalMDEProject.g:524:1: ( '}' )
            // InternalMDEProject.g:525:2: '}'
            {
             before(grammarAccess.getLoadAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Load__Group__6__Impl"


    // $ANTLR start "rule__Load__Group_5__0"
    // InternalMDEProject.g:535:1: rule__Load__Group_5__0 : rule__Load__Group_5__0__Impl rule__Load__Group_5__1 ;
    public final void rule__Load__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:539:1: ( rule__Load__Group_5__0__Impl rule__Load__Group_5__1 )
            // InternalMDEProject.g:540:2: rule__Load__Group_5__0__Impl rule__Load__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Load__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group_5__1();

            state._fsp--;


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
    // $ANTLR end "rule__Load__Group_5__0"


    // $ANTLR start "rule__Load__Group_5__0__Impl"
    // InternalMDEProject.g:547:1: rule__Load__Group_5__0__Impl : ( ';' ) ;
    public final void rule__Load__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:551:1: ( ( ';' ) )
            // InternalMDEProject.g:552:1: ( ';' )
            {
            // InternalMDEProject.g:552:1: ( ';' )
            // InternalMDEProject.g:553:2: ';'
            {
             before(grammarAccess.getLoadAccess().getSemicolonKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getSemicolonKeyword_5_0()); 

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
    // $ANTLR end "rule__Load__Group_5__0__Impl"


    // $ANTLR start "rule__Load__Group_5__1"
    // InternalMDEProject.g:562:1: rule__Load__Group_5__1 : rule__Load__Group_5__1__Impl ;
    public final void rule__Load__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:566:1: ( rule__Load__Group_5__1__Impl )
            // InternalMDEProject.g:567:2: rule__Load__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Load__Group_5__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Load__Group_5__1"


    // $ANTLR start "rule__Load__Group_5__1__Impl"
    // InternalMDEProject.g:573:1: rule__Load__Group_5__1__Impl : ( ( rule__Load__ActionsAssignment_5_1 ) ) ;
    public final void rule__Load__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:577:1: ( ( ( rule__Load__ActionsAssignment_5_1 ) ) )
            // InternalMDEProject.g:578:1: ( ( rule__Load__ActionsAssignment_5_1 ) )
            {
            // InternalMDEProject.g:578:1: ( ( rule__Load__ActionsAssignment_5_1 ) )
            // InternalMDEProject.g:579:2: ( rule__Load__ActionsAssignment_5_1 )
            {
             before(grammarAccess.getLoadAccess().getActionsAssignment_5_1()); 
            // InternalMDEProject.g:580:2: ( rule__Load__ActionsAssignment_5_1 )
            // InternalMDEProject.g:580:3: rule__Load__ActionsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Load__ActionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getActionsAssignment_5_1()); 

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
    // $ANTLR end "rule__Load__Group_5__1__Impl"


    // $ANTLR start "rule__Add__Group__0"
    // InternalMDEProject.g:589:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:593:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalMDEProject.g:594:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Add__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Add__Group__0"


    // $ANTLR start "rule__Add__Group__0__Impl"
    // InternalMDEProject.g:601:1: rule__Add__Group__0__Impl : ( 'Add' ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:605:1: ( ( 'Add' ) )
            // InternalMDEProject.g:606:1: ( 'Add' )
            {
            // InternalMDEProject.g:606:1: ( 'Add' )
            // InternalMDEProject.g:607:2: 'Add'
            {
             before(grammarAccess.getAddAccess().getAddKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getAddKeyword_0()); 

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
    // $ANTLR end "rule__Add__Group__0__Impl"


    // $ANTLR start "rule__Add__Group__1"
    // InternalMDEProject.g:616:1: rule__Add__Group__1 : rule__Add__Group__1__Impl ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:620:1: ( rule__Add__Group__1__Impl )
            // InternalMDEProject.g:621:2: rule__Add__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Add__Group__1"


    // $ANTLR start "rule__Add__Group__1__Impl"
    // InternalMDEProject.g:627:1: rule__Add__Group__1__Impl : ( ( rule__Add__SpecificationAssignment_1 ) ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:631:1: ( ( ( rule__Add__SpecificationAssignment_1 ) ) )
            // InternalMDEProject.g:632:1: ( ( rule__Add__SpecificationAssignment_1 ) )
            {
            // InternalMDEProject.g:632:1: ( ( rule__Add__SpecificationAssignment_1 ) )
            // InternalMDEProject.g:633:2: ( rule__Add__SpecificationAssignment_1 )
            {
             before(grammarAccess.getAddAccess().getSpecificationAssignment_1()); 
            // InternalMDEProject.g:634:2: ( rule__Add__SpecificationAssignment_1 )
            // InternalMDEProject.g:634:3: rule__Add__SpecificationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Add__SpecificationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getSpecificationAssignment_1()); 

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
    // $ANTLR end "rule__Add__Group__1__Impl"


    // $ANTLR start "rule__Delete__Group__0"
    // InternalMDEProject.g:643:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:647:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalMDEProject.g:648:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Delete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Delete__Group__0"


    // $ANTLR start "rule__Delete__Group__0__Impl"
    // InternalMDEProject.g:655:1: rule__Delete__Group__0__Impl : ( 'Delete' ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:659:1: ( ( 'Delete' ) )
            // InternalMDEProject.g:660:1: ( 'Delete' )
            {
            // InternalMDEProject.g:660:1: ( 'Delete' )
            // InternalMDEProject.g:661:2: 'Delete'
            {
             before(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); 

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
    // $ANTLR end "rule__Delete__Group__0__Impl"


    // $ANTLR start "rule__Delete__Group__1"
    // InternalMDEProject.g:670:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:674:1: ( rule__Delete__Group__1__Impl )
            // InternalMDEProject.g:675:2: rule__Delete__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Delete__Group__1"


    // $ANTLR start "rule__Delete__Group__1__Impl"
    // InternalMDEProject.g:681:1: rule__Delete__Group__1__Impl : ( ( rule__Delete__SpecificationAssignment_1 ) ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:685:1: ( ( ( rule__Delete__SpecificationAssignment_1 ) ) )
            // InternalMDEProject.g:686:1: ( ( rule__Delete__SpecificationAssignment_1 ) )
            {
            // InternalMDEProject.g:686:1: ( ( rule__Delete__SpecificationAssignment_1 ) )
            // InternalMDEProject.g:687:2: ( rule__Delete__SpecificationAssignment_1 )
            {
             before(grammarAccess.getDeleteAccess().getSpecificationAssignment_1()); 
            // InternalMDEProject.g:688:2: ( rule__Delete__SpecificationAssignment_1 )
            // InternalMDEProject.g:688:3: rule__Delete__SpecificationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Delete__SpecificationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getSpecificationAssignment_1()); 

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
    // $ANTLR end "rule__Delete__Group__1__Impl"


    // $ANTLR start "rule__Modify__Group__0"
    // InternalMDEProject.g:697:1: rule__Modify__Group__0 : rule__Modify__Group__0__Impl rule__Modify__Group__1 ;
    public final void rule__Modify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:701:1: ( rule__Modify__Group__0__Impl rule__Modify__Group__1 )
            // InternalMDEProject.g:702:2: rule__Modify__Group__0__Impl rule__Modify__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Modify__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modify__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Modify__Group__0"


    // $ANTLR start "rule__Modify__Group__0__Impl"
    // InternalMDEProject.g:709:1: rule__Modify__Group__0__Impl : ( 'Modify' ) ;
    public final void rule__Modify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:713:1: ( ( 'Modify' ) )
            // InternalMDEProject.g:714:1: ( 'Modify' )
            {
            // InternalMDEProject.g:714:1: ( 'Modify' )
            // InternalMDEProject.g:715:2: 'Modify'
            {
             before(grammarAccess.getModifyAccess().getModifyKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModifyAccess().getModifyKeyword_0()); 

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
    // $ANTLR end "rule__Modify__Group__0__Impl"


    // $ANTLR start "rule__Modify__Group__1"
    // InternalMDEProject.g:724:1: rule__Modify__Group__1 : rule__Modify__Group__1__Impl rule__Modify__Group__2 ;
    public final void rule__Modify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:728:1: ( rule__Modify__Group__1__Impl rule__Modify__Group__2 )
            // InternalMDEProject.g:729:2: rule__Modify__Group__1__Impl rule__Modify__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Modify__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modify__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Modify__Group__1"


    // $ANTLR start "rule__Modify__Group__1__Impl"
    // InternalMDEProject.g:736:1: rule__Modify__Group__1__Impl : ( ( rule__Modify__SpecificationAssignment_1 ) ) ;
    public final void rule__Modify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:740:1: ( ( ( rule__Modify__SpecificationAssignment_1 ) ) )
            // InternalMDEProject.g:741:1: ( ( rule__Modify__SpecificationAssignment_1 ) )
            {
            // InternalMDEProject.g:741:1: ( ( rule__Modify__SpecificationAssignment_1 ) )
            // InternalMDEProject.g:742:2: ( rule__Modify__SpecificationAssignment_1 )
            {
             before(grammarAccess.getModifyAccess().getSpecificationAssignment_1()); 
            // InternalMDEProject.g:743:2: ( rule__Modify__SpecificationAssignment_1 )
            // InternalMDEProject.g:743:3: rule__Modify__SpecificationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Modify__SpecificationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModifyAccess().getSpecificationAssignment_1()); 

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
    // $ANTLR end "rule__Modify__Group__1__Impl"


    // $ANTLR start "rule__Modify__Group__2"
    // InternalMDEProject.g:751:1: rule__Modify__Group__2 : rule__Modify__Group__2__Impl rule__Modify__Group__3 ;
    public final void rule__Modify__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:755:1: ( rule__Modify__Group__2__Impl rule__Modify__Group__3 )
            // InternalMDEProject.g:756:2: rule__Modify__Group__2__Impl rule__Modify__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Modify__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modify__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Modify__Group__2"


    // $ANTLR start "rule__Modify__Group__2__Impl"
    // InternalMDEProject.g:763:1: rule__Modify__Group__2__Impl : ( ( rule__Modify__Group_2__0 )? ) ;
    public final void rule__Modify__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:767:1: ( ( ( rule__Modify__Group_2__0 )? ) )
            // InternalMDEProject.g:768:1: ( ( rule__Modify__Group_2__0 )? )
            {
            // InternalMDEProject.g:768:1: ( ( rule__Modify__Group_2__0 )? )
            // InternalMDEProject.g:769:2: ( rule__Modify__Group_2__0 )?
            {
             before(grammarAccess.getModifyAccess().getGroup_2()); 
            // InternalMDEProject.g:770:2: ( rule__Modify__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMDEProject.g:770:3: rule__Modify__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modify__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModifyAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Modify__Group__2__Impl"


    // $ANTLR start "rule__Modify__Group__3"
    // InternalMDEProject.g:778:1: rule__Modify__Group__3 : rule__Modify__Group__3__Impl ;
    public final void rule__Modify__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:782:1: ( rule__Modify__Group__3__Impl )
            // InternalMDEProject.g:783:2: rule__Modify__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modify__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Modify__Group__3"


    // $ANTLR start "rule__Modify__Group__3__Impl"
    // InternalMDEProject.g:789:1: rule__Modify__Group__3__Impl : ( ( rule__Modify__Group_3__0 )? ) ;
    public final void rule__Modify__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:793:1: ( ( ( rule__Modify__Group_3__0 )? ) )
            // InternalMDEProject.g:794:1: ( ( rule__Modify__Group_3__0 )? )
            {
            // InternalMDEProject.g:794:1: ( ( rule__Modify__Group_3__0 )? )
            // InternalMDEProject.g:795:2: ( rule__Modify__Group_3__0 )?
            {
             before(grammarAccess.getModifyAccess().getGroup_3()); 
            // InternalMDEProject.g:796:2: ( rule__Modify__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMDEProject.g:796:3: rule__Modify__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modify__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModifyAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Modify__Group__3__Impl"


    // $ANTLR start "rule__Modify__Group_2__0"
    // InternalMDEProject.g:805:1: rule__Modify__Group_2__0 : rule__Modify__Group_2__0__Impl rule__Modify__Group_2__1 ;
    public final void rule__Modify__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:809:1: ( rule__Modify__Group_2__0__Impl rule__Modify__Group_2__1 )
            // InternalMDEProject.g:810:2: rule__Modify__Group_2__0__Impl rule__Modify__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Modify__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modify__Group_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__Modify__Group_2__0"


    // $ANTLR start "rule__Modify__Group_2__0__Impl"
    // InternalMDEProject.g:817:1: rule__Modify__Group_2__0__Impl : ( 'newValueName' ) ;
    public final void rule__Modify__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:821:1: ( ( 'newValueName' ) )
            // InternalMDEProject.g:822:1: ( 'newValueName' )
            {
            // InternalMDEProject.g:822:1: ( 'newValueName' )
            // InternalMDEProject.g:823:2: 'newValueName'
            {
             before(grammarAccess.getModifyAccess().getNewValueNameKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getModifyAccess().getNewValueNameKeyword_2_0()); 

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
    // $ANTLR end "rule__Modify__Group_2__0__Impl"


    // $ANTLR start "rule__Modify__Group_2__1"
    // InternalMDEProject.g:832:1: rule__Modify__Group_2__1 : rule__Modify__Group_2__1__Impl ;
    public final void rule__Modify__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:836:1: ( rule__Modify__Group_2__1__Impl )
            // InternalMDEProject.g:837:2: rule__Modify__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modify__Group_2__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Modify__Group_2__1"


    // $ANTLR start "rule__Modify__Group_2__1__Impl"
    // InternalMDEProject.g:843:1: rule__Modify__Group_2__1__Impl : ( ( rule__Modify__NewValueNameAssignment_2_1 ) ) ;
    public final void rule__Modify__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:847:1: ( ( ( rule__Modify__NewValueNameAssignment_2_1 ) ) )
            // InternalMDEProject.g:848:1: ( ( rule__Modify__NewValueNameAssignment_2_1 ) )
            {
            // InternalMDEProject.g:848:1: ( ( rule__Modify__NewValueNameAssignment_2_1 ) )
            // InternalMDEProject.g:849:2: ( rule__Modify__NewValueNameAssignment_2_1 )
            {
             before(grammarAccess.getModifyAccess().getNewValueNameAssignment_2_1()); 
            // InternalMDEProject.g:850:2: ( rule__Modify__NewValueNameAssignment_2_1 )
            // InternalMDEProject.g:850:3: rule__Modify__NewValueNameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Modify__NewValueNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModifyAccess().getNewValueNameAssignment_2_1()); 

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
    // $ANTLR end "rule__Modify__Group_2__1__Impl"


    // $ANTLR start "rule__Modify__Group_3__0"
    // InternalMDEProject.g:859:1: rule__Modify__Group_3__0 : rule__Modify__Group_3__0__Impl rule__Modify__Group_3__1 ;
    public final void rule__Modify__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:863:1: ( rule__Modify__Group_3__0__Impl rule__Modify__Group_3__1 )
            // InternalMDEProject.g:864:2: rule__Modify__Group_3__0__Impl rule__Modify__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Modify__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modify__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__Modify__Group_3__0"


    // $ANTLR start "rule__Modify__Group_3__0__Impl"
    // InternalMDEProject.g:871:1: rule__Modify__Group_3__0__Impl : ( 'newValueType' ) ;
    public final void rule__Modify__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:875:1: ( ( 'newValueType' ) )
            // InternalMDEProject.g:876:1: ( 'newValueType' )
            {
            // InternalMDEProject.g:876:1: ( 'newValueType' )
            // InternalMDEProject.g:877:2: 'newValueType'
            {
             before(grammarAccess.getModifyAccess().getNewValueTypeKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModifyAccess().getNewValueTypeKeyword_3_0()); 

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
    // $ANTLR end "rule__Modify__Group_3__0__Impl"


    // $ANTLR start "rule__Modify__Group_3__1"
    // InternalMDEProject.g:886:1: rule__Modify__Group_3__1 : rule__Modify__Group_3__1__Impl ;
    public final void rule__Modify__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:890:1: ( rule__Modify__Group_3__1__Impl )
            // InternalMDEProject.g:891:2: rule__Modify__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modify__Group_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Modify__Group_3__1"


    // $ANTLR start "rule__Modify__Group_3__1__Impl"
    // InternalMDEProject.g:897:1: rule__Modify__Group_3__1__Impl : ( ( rule__Modify__NewValueTypeAssignment_3_1 ) ) ;
    public final void rule__Modify__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:901:1: ( ( ( rule__Modify__NewValueTypeAssignment_3_1 ) ) )
            // InternalMDEProject.g:902:1: ( ( rule__Modify__NewValueTypeAssignment_3_1 ) )
            {
            // InternalMDEProject.g:902:1: ( ( rule__Modify__NewValueTypeAssignment_3_1 ) )
            // InternalMDEProject.g:903:2: ( rule__Modify__NewValueTypeAssignment_3_1 )
            {
             before(grammarAccess.getModifyAccess().getNewValueTypeAssignment_3_1()); 
            // InternalMDEProject.g:904:2: ( rule__Modify__NewValueTypeAssignment_3_1 )
            // InternalMDEProject.g:904:3: rule__Modify__NewValueTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Modify__NewValueTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModifyAccess().getNewValueTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__Modify__Group_3__1__Impl"


    // $ANTLR start "rule__Eclass__Group__0"
    // InternalMDEProject.g:913:1: rule__Eclass__Group__0 : rule__Eclass__Group__0__Impl rule__Eclass__Group__1 ;
    public final void rule__Eclass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:917:1: ( rule__Eclass__Group__0__Impl rule__Eclass__Group__1 )
            // InternalMDEProject.g:918:2: rule__Eclass__Group__0__Impl rule__Eclass__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Eclass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group__0"


    // $ANTLR start "rule__Eclass__Group__0__Impl"
    // InternalMDEProject.g:925:1: rule__Eclass__Group__0__Impl : ( () ) ;
    public final void rule__Eclass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:929:1: ( ( () ) )
            // InternalMDEProject.g:930:1: ( () )
            {
            // InternalMDEProject.g:930:1: ( () )
            // InternalMDEProject.g:931:2: ()
            {
             before(grammarAccess.getEclassAccess().getEclassAction_0()); 
            // InternalMDEProject.g:932:2: ()
            // InternalMDEProject.g:932:3: 
            {
            }

             after(grammarAccess.getEclassAccess().getEclassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eclass__Group__0__Impl"


    // $ANTLR start "rule__Eclass__Group__1"
    // InternalMDEProject.g:940:1: rule__Eclass__Group__1 : rule__Eclass__Group__1__Impl rule__Eclass__Group__2 ;
    public final void rule__Eclass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:944:1: ( rule__Eclass__Group__1__Impl rule__Eclass__Group__2 )
            // InternalMDEProject.g:945:2: rule__Eclass__Group__1__Impl rule__Eclass__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Eclass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group__1"


    // $ANTLR start "rule__Eclass__Group__1__Impl"
    // InternalMDEProject.g:952:1: rule__Eclass__Group__1__Impl : ( 'Eclass' ) ;
    public final void rule__Eclass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:956:1: ( ( 'Eclass' ) )
            // InternalMDEProject.g:957:1: ( 'Eclass' )
            {
            // InternalMDEProject.g:957:1: ( 'Eclass' )
            // InternalMDEProject.g:958:2: 'Eclass'
            {
             before(grammarAccess.getEclassAccess().getEclassKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEclassAccess().getEclassKeyword_1()); 

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
    // $ANTLR end "rule__Eclass__Group__1__Impl"


    // $ANTLR start "rule__Eclass__Group__2"
    // InternalMDEProject.g:967:1: rule__Eclass__Group__2 : rule__Eclass__Group__2__Impl rule__Eclass__Group__3 ;
    public final void rule__Eclass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:971:1: ( rule__Eclass__Group__2__Impl rule__Eclass__Group__3 )
            // InternalMDEProject.g:972:2: rule__Eclass__Group__2__Impl rule__Eclass__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Eclass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group__2"


    // $ANTLR start "rule__Eclass__Group__2__Impl"
    // InternalMDEProject.g:979:1: rule__Eclass__Group__2__Impl : ( ( rule__Eclass__NameAssignment_2 ) ) ;
    public final void rule__Eclass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:983:1: ( ( ( rule__Eclass__NameAssignment_2 ) ) )
            // InternalMDEProject.g:984:1: ( ( rule__Eclass__NameAssignment_2 ) )
            {
            // InternalMDEProject.g:984:1: ( ( rule__Eclass__NameAssignment_2 ) )
            // InternalMDEProject.g:985:2: ( rule__Eclass__NameAssignment_2 )
            {
             before(grammarAccess.getEclassAccess().getNameAssignment_2()); 
            // InternalMDEProject.g:986:2: ( rule__Eclass__NameAssignment_2 )
            // InternalMDEProject.g:986:3: rule__Eclass__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEclassAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Eclass__Group__2__Impl"


    // $ANTLR start "rule__Eclass__Group__3"
    // InternalMDEProject.g:994:1: rule__Eclass__Group__3 : rule__Eclass__Group__3__Impl rule__Eclass__Group__4 ;
    public final void rule__Eclass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:998:1: ( rule__Eclass__Group__3__Impl rule__Eclass__Group__4 )
            // InternalMDEProject.g:999:2: rule__Eclass__Group__3__Impl rule__Eclass__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Eclass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group__3"


    // $ANTLR start "rule__Eclass__Group__3__Impl"
    // InternalMDEProject.g:1006:1: rule__Eclass__Group__3__Impl : ( ( rule__Eclass__Group_3__0 )? ) ;
    public final void rule__Eclass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1010:1: ( ( ( rule__Eclass__Group_3__0 )? ) )
            // InternalMDEProject.g:1011:1: ( ( rule__Eclass__Group_3__0 )? )
            {
            // InternalMDEProject.g:1011:1: ( ( rule__Eclass__Group_3__0 )? )
            // InternalMDEProject.g:1012:2: ( rule__Eclass__Group_3__0 )?
            {
             before(grammarAccess.getEclassAccess().getGroup_3()); 
            // InternalMDEProject.g:1013:2: ( rule__Eclass__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMDEProject.g:1013:3: rule__Eclass__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Eclass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEclassAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Eclass__Group__3__Impl"


    // $ANTLR start "rule__Eclass__Group__4"
    // InternalMDEProject.g:1021:1: rule__Eclass__Group__4 : rule__Eclass__Group__4__Impl rule__Eclass__Group__5 ;
    public final void rule__Eclass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1025:1: ( rule__Eclass__Group__4__Impl rule__Eclass__Group__5 )
            // InternalMDEProject.g:1026:2: rule__Eclass__Group__4__Impl rule__Eclass__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Eclass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group__4"


    // $ANTLR start "rule__Eclass__Group__4__Impl"
    // InternalMDEProject.g:1033:1: rule__Eclass__Group__4__Impl : ( ( rule__Eclass__Group_4__0 )? ) ;
    public final void rule__Eclass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1037:1: ( ( ( rule__Eclass__Group_4__0 )? ) )
            // InternalMDEProject.g:1038:1: ( ( rule__Eclass__Group_4__0 )? )
            {
            // InternalMDEProject.g:1038:1: ( ( rule__Eclass__Group_4__0 )? )
            // InternalMDEProject.g:1039:2: ( rule__Eclass__Group_4__0 )?
            {
             before(grammarAccess.getEclassAccess().getGroup_4()); 
            // InternalMDEProject.g:1040:2: ( rule__Eclass__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMDEProject.g:1040:3: rule__Eclass__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Eclass__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEclassAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Eclass__Group__4__Impl"


    // $ANTLR start "rule__Eclass__Group__5"
    // InternalMDEProject.g:1048:1: rule__Eclass__Group__5 : rule__Eclass__Group__5__Impl ;
    public final void rule__Eclass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1052:1: ( rule__Eclass__Group__5__Impl )
            // InternalMDEProject.g:1053:2: rule__Eclass__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__Group__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group__5"


    // $ANTLR start "rule__Eclass__Group__5__Impl"
    // InternalMDEProject.g:1059:1: rule__Eclass__Group__5__Impl : ( ( rule__Eclass__Group_5__0 )? ) ;
    public final void rule__Eclass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1063:1: ( ( ( rule__Eclass__Group_5__0 )? ) )
            // InternalMDEProject.g:1064:1: ( ( rule__Eclass__Group_5__0 )? )
            {
            // InternalMDEProject.g:1064:1: ( ( rule__Eclass__Group_5__0 )? )
            // InternalMDEProject.g:1065:2: ( rule__Eclass__Group_5__0 )?
            {
             before(grammarAccess.getEclassAccess().getGroup_5()); 
            // InternalMDEProject.g:1066:2: ( rule__Eclass__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMDEProject.g:1066:3: rule__Eclass__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Eclass__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEclassAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Eclass__Group__5__Impl"


    // $ANTLR start "rule__Eclass__Group_3__0"
    // InternalMDEProject.g:1075:1: rule__Eclass__Group_3__0 : rule__Eclass__Group_3__0__Impl rule__Eclass__Group_3__1 ;
    public final void rule__Eclass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1079:1: ( rule__Eclass__Group_3__0__Impl rule__Eclass__Group_3__1 )
            // InternalMDEProject.g:1080:2: rule__Eclass__Group_3__0__Impl rule__Eclass__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Eclass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_3__0"


    // $ANTLR start "rule__Eclass__Group_3__0__Impl"
    // InternalMDEProject.g:1087:1: rule__Eclass__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Eclass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1091:1: ( ( ':' ) )
            // InternalMDEProject.g:1092:1: ( ':' )
            {
            // InternalMDEProject.g:1092:1: ( ':' )
            // InternalMDEProject.g:1093:2: ':'
            {
             before(grammarAccess.getEclassAccess().getColonKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEclassAccess().getColonKeyword_3_0()); 

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
    // $ANTLR end "rule__Eclass__Group_3__0__Impl"


    // $ANTLR start "rule__Eclass__Group_3__1"
    // InternalMDEProject.g:1102:1: rule__Eclass__Group_3__1 : rule__Eclass__Group_3__1__Impl ;
    public final void rule__Eclass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1106:1: ( rule__Eclass__Group_3__1__Impl )
            // InternalMDEProject.g:1107:2: rule__Eclass__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__Group_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_3__1"


    // $ANTLR start "rule__Eclass__Group_3__1__Impl"
    // InternalMDEProject.g:1113:1: rule__Eclass__Group_3__1__Impl : ( ( rule__Eclass__TypeAssignment_3_1 ) ) ;
    public final void rule__Eclass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1117:1: ( ( ( rule__Eclass__TypeAssignment_3_1 ) ) )
            // InternalMDEProject.g:1118:1: ( ( rule__Eclass__TypeAssignment_3_1 ) )
            {
            // InternalMDEProject.g:1118:1: ( ( rule__Eclass__TypeAssignment_3_1 ) )
            // InternalMDEProject.g:1119:2: ( rule__Eclass__TypeAssignment_3_1 )
            {
             before(grammarAccess.getEclassAccess().getTypeAssignment_3_1()); 
            // InternalMDEProject.g:1120:2: ( rule__Eclass__TypeAssignment_3_1 )
            // InternalMDEProject.g:1120:3: rule__Eclass__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEclassAccess().getTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__Eclass__Group_3__1__Impl"


    // $ANTLR start "rule__Eclass__Group_4__0"
    // InternalMDEProject.g:1129:1: rule__Eclass__Group_4__0 : rule__Eclass__Group_4__0__Impl rule__Eclass__Group_4__1 ;
    public final void rule__Eclass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1133:1: ( rule__Eclass__Group_4__0__Impl rule__Eclass__Group_4__1 )
            // InternalMDEProject.g:1134:2: rule__Eclass__Group_4__0__Impl rule__Eclass__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Eclass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_4__0"


    // $ANTLR start "rule__Eclass__Group_4__0__Impl"
    // InternalMDEProject.g:1141:1: rule__Eclass__Group_4__0__Impl : ( '[' ) ;
    public final void rule__Eclass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1145:1: ( ( '[' ) )
            // InternalMDEProject.g:1146:1: ( '[' )
            {
            // InternalMDEProject.g:1146:1: ( '[' )
            // InternalMDEProject.g:1147:2: '['
            {
             before(grammarAccess.getEclassAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEclassAccess().getLeftSquareBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__Eclass__Group_4__0__Impl"


    // $ANTLR start "rule__Eclass__Group_4__1"
    // InternalMDEProject.g:1156:1: rule__Eclass__Group_4__1 : rule__Eclass__Group_4__1__Impl rule__Eclass__Group_4__2 ;
    public final void rule__Eclass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1160:1: ( rule__Eclass__Group_4__1__Impl rule__Eclass__Group_4__2 )
            // InternalMDEProject.g:1161:2: rule__Eclass__Group_4__1__Impl rule__Eclass__Group_4__2
            {
            pushFollow(FOLLOW_13);
            rule__Eclass__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group_4__2();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_4__1"


    // $ANTLR start "rule__Eclass__Group_4__1__Impl"
    // InternalMDEProject.g:1168:1: rule__Eclass__Group_4__1__Impl : ( ( rule__Eclass__Group_4_1__0 )? ) ;
    public final void rule__Eclass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1172:1: ( ( ( rule__Eclass__Group_4_1__0 )? ) )
            // InternalMDEProject.g:1173:1: ( ( rule__Eclass__Group_4_1__0 )? )
            {
            // InternalMDEProject.g:1173:1: ( ( rule__Eclass__Group_4_1__0 )? )
            // InternalMDEProject.g:1174:2: ( rule__Eclass__Group_4_1__0 )?
            {
             before(grammarAccess.getEclassAccess().getGroup_4_1()); 
            // InternalMDEProject.g:1175:2: ( rule__Eclass__Group_4_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMDEProject.g:1175:3: rule__Eclass__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Eclass__Group_4_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEclassAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__Eclass__Group_4__1__Impl"


    // $ANTLR start "rule__Eclass__Group_4__2"
    // InternalMDEProject.g:1183:1: rule__Eclass__Group_4__2 : rule__Eclass__Group_4__2__Impl rule__Eclass__Group_4__3 ;
    public final void rule__Eclass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1187:1: ( rule__Eclass__Group_4__2__Impl rule__Eclass__Group_4__3 )
            // InternalMDEProject.g:1188:2: rule__Eclass__Group_4__2__Impl rule__Eclass__Group_4__3
            {
            pushFollow(FOLLOW_13);
            rule__Eclass__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group_4__3();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_4__2"


    // $ANTLR start "rule__Eclass__Group_4__2__Impl"
    // InternalMDEProject.g:1195:1: rule__Eclass__Group_4__2__Impl : ( ( rule__Eclass__Group_4_2__0 )? ) ;
    public final void rule__Eclass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1199:1: ( ( ( rule__Eclass__Group_4_2__0 )? ) )
            // InternalMDEProject.g:1200:1: ( ( rule__Eclass__Group_4_2__0 )? )
            {
            // InternalMDEProject.g:1200:1: ( ( rule__Eclass__Group_4_2__0 )? )
            // InternalMDEProject.g:1201:2: ( rule__Eclass__Group_4_2__0 )?
            {
             before(grammarAccess.getEclassAccess().getGroup_4_2()); 
            // InternalMDEProject.g:1202:2: ( rule__Eclass__Group_4_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMDEProject.g:1202:3: rule__Eclass__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Eclass__Group_4_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEclassAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__Eclass__Group_4__2__Impl"


    // $ANTLR start "rule__Eclass__Group_4__3"
    // InternalMDEProject.g:1210:1: rule__Eclass__Group_4__3 : rule__Eclass__Group_4__3__Impl rule__Eclass__Group_4__4 ;
    public final void rule__Eclass__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1214:1: ( rule__Eclass__Group_4__3__Impl rule__Eclass__Group_4__4 )
            // InternalMDEProject.g:1215:2: rule__Eclass__Group_4__3__Impl rule__Eclass__Group_4__4
            {
            pushFollow(FOLLOW_13);
            rule__Eclass__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group_4__4();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_4__3"


    // $ANTLR start "rule__Eclass__Group_4__3__Impl"
    // InternalMDEProject.g:1222:1: rule__Eclass__Group_4__3__Impl : ( ( rule__Eclass__Group_4_3__0 )? ) ;
    public final void rule__Eclass__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1226:1: ( ( ( rule__Eclass__Group_4_3__0 )? ) )
            // InternalMDEProject.g:1227:1: ( ( rule__Eclass__Group_4_3__0 )? )
            {
            // InternalMDEProject.g:1227:1: ( ( rule__Eclass__Group_4_3__0 )? )
            // InternalMDEProject.g:1228:2: ( rule__Eclass__Group_4_3__0 )?
            {
             before(grammarAccess.getEclassAccess().getGroup_4_3()); 
            // InternalMDEProject.g:1229:2: ( rule__Eclass__Group_4_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMDEProject.g:1229:3: rule__Eclass__Group_4_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Eclass__Group_4_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEclassAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Eclass__Group_4__3__Impl"


    // $ANTLR start "rule__Eclass__Group_4__4"
    // InternalMDEProject.g:1237:1: rule__Eclass__Group_4__4 : rule__Eclass__Group_4__4__Impl rule__Eclass__Group_4__5 ;
    public final void rule__Eclass__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1241:1: ( rule__Eclass__Group_4__4__Impl rule__Eclass__Group_4__5 )
            // InternalMDEProject.g:1242:2: rule__Eclass__Group_4__4__Impl rule__Eclass__Group_4__5
            {
            pushFollow(FOLLOW_13);
            rule__Eclass__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group_4__5();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_4__4"


    // $ANTLR start "rule__Eclass__Group_4__4__Impl"
    // InternalMDEProject.g:1249:1: rule__Eclass__Group_4__4__Impl : ( ( rule__Eclass__Group_4_4__0 )? ) ;
    public final void rule__Eclass__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1253:1: ( ( ( rule__Eclass__Group_4_4__0 )? ) )
            // InternalMDEProject.g:1254:1: ( ( rule__Eclass__Group_4_4__0 )? )
            {
            // InternalMDEProject.g:1254:1: ( ( rule__Eclass__Group_4_4__0 )? )
            // InternalMDEProject.g:1255:2: ( rule__Eclass__Group_4_4__0 )?
            {
             before(grammarAccess.getEclassAccess().getGroup_4_4()); 
            // InternalMDEProject.g:1256:2: ( rule__Eclass__Group_4_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMDEProject.g:1256:3: rule__Eclass__Group_4_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Eclass__Group_4_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEclassAccess().getGroup_4_4()); 

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
    // $ANTLR end "rule__Eclass__Group_4__4__Impl"


    // $ANTLR start "rule__Eclass__Group_4__5"
    // InternalMDEProject.g:1264:1: rule__Eclass__Group_4__5 : rule__Eclass__Group_4__5__Impl ;
    public final void rule__Eclass__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1268:1: ( rule__Eclass__Group_4__5__Impl )
            // InternalMDEProject.g:1269:2: rule__Eclass__Group_4__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__Group_4__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_4__5"


    // $ANTLR start "rule__Eclass__Group_4__5__Impl"
    // InternalMDEProject.g:1275:1: rule__Eclass__Group_4__5__Impl : ( ']' ) ;
    public final void rule__Eclass__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1279:1: ( ( ']' ) )
            // InternalMDEProject.g:1280:1: ( ']' )
            {
            // InternalMDEProject.g:1280:1: ( ']' )
            // InternalMDEProject.g:1281:2: ']'
            {
             before(grammarAccess.getEclassAccess().getRightSquareBracketKeyword_4_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEclassAccess().getRightSquareBracketKeyword_4_5()); 

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
    // $ANTLR end "rule__Eclass__Group_4__5__Impl"


    // $ANTLR start "rule__Eclass__Group_4_1__0"
    // InternalMDEProject.g:1291:1: rule__Eclass__Group_4_1__0 : rule__Eclass__Group_4_1__0__Impl rule__Eclass__Group_4_1__1 ;
    public final void rule__Eclass__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1295:1: ( rule__Eclass__Group_4_1__0__Impl rule__Eclass__Group_4_1__1 )
            // InternalMDEProject.g:1296:2: rule__Eclass__Group_4_1__0__Impl rule__Eclass__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Eclass__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group_4_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_4_1__0"


    // $ANTLR start "rule__Eclass__Group_4_1__0__Impl"
    // InternalMDEProject.g:1303:1: rule__Eclass__Group_4_1__0__Impl : ( 'relatedTo' ) ;
    public final void rule__Eclass__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1307:1: ( ( 'relatedTo' ) )
            // InternalMDEProject.g:1308:1: ( 'relatedTo' )
            {
            // InternalMDEProject.g:1308:1: ( 'relatedTo' )
            // InternalMDEProject.g:1309:2: 'relatedTo'
            {
             before(grammarAccess.getEclassAccess().getRelatedToKeyword_4_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEclassAccess().getRelatedToKeyword_4_1_0()); 

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
    // $ANTLR end "rule__Eclass__Group_4_1__0__Impl"


    // $ANTLR start "rule__Eclass__Group_4_1__1"
    // InternalMDEProject.g:1318:1: rule__Eclass__Group_4_1__1 : rule__Eclass__Group_4_1__1__Impl ;
    public final void rule__Eclass__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1322:1: ( rule__Eclass__Group_4_1__1__Impl )
            // InternalMDEProject.g:1323:2: rule__Eclass__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__Group_4_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_4_1__1"


    // $ANTLR start "rule__Eclass__Group_4_1__1__Impl"
    // InternalMDEProject.g:1329:1: rule__Eclass__Group_4_1__1__Impl : ( ( rule__Eclass__RelatedToAssignment_4_1_1 ) ) ;
    public final void rule__Eclass__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1333:1: ( ( ( rule__Eclass__RelatedToAssignment_4_1_1 ) ) )
            // InternalMDEProject.g:1334:1: ( ( rule__Eclass__RelatedToAssignment_4_1_1 ) )
            {
            // InternalMDEProject.g:1334:1: ( ( rule__Eclass__RelatedToAssignment_4_1_1 ) )
            // InternalMDEProject.g:1335:2: ( rule__Eclass__RelatedToAssignment_4_1_1 )
            {
             before(grammarAccess.getEclassAccess().getRelatedToAssignment_4_1_1()); 
            // InternalMDEProject.g:1336:2: ( rule__Eclass__RelatedToAssignment_4_1_1 )
            // InternalMDEProject.g:1336:3: rule__Eclass__RelatedToAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__RelatedToAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEclassAccess().getRelatedToAssignment_4_1_1()); 

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
    // $ANTLR end "rule__Eclass__Group_4_1__1__Impl"


    // $ANTLR start "rule__Eclass__Group_4_2__0"
    // InternalMDEProject.g:1345:1: rule__Eclass__Group_4_2__0 : rule__Eclass__Group_4_2__0__Impl rule__Eclass__Group_4_2__1 ;
    public final void rule__Eclass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1349:1: ( rule__Eclass__Group_4_2__0__Impl rule__Eclass__Group_4_2__1 )
            // InternalMDEProject.g:1350:2: rule__Eclass__Group_4_2__0__Impl rule__Eclass__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Eclass__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group_4_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_4_2__0"


    // $ANTLR start "rule__Eclass__Group_4_2__0__Impl"
    // InternalMDEProject.g:1357:1: rule__Eclass__Group_4_2__0__Impl : ( 'boundEclass' ) ;
    public final void rule__Eclass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1361:1: ( ( 'boundEclass' ) )
            // InternalMDEProject.g:1362:1: ( 'boundEclass' )
            {
            // InternalMDEProject.g:1362:1: ( 'boundEclass' )
            // InternalMDEProject.g:1363:2: 'boundEclass'
            {
             before(grammarAccess.getEclassAccess().getBoundEclassKeyword_4_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEclassAccess().getBoundEclassKeyword_4_2_0()); 

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
    // $ANTLR end "rule__Eclass__Group_4_2__0__Impl"


    // $ANTLR start "rule__Eclass__Group_4_2__1"
    // InternalMDEProject.g:1372:1: rule__Eclass__Group_4_2__1 : rule__Eclass__Group_4_2__1__Impl ;
    public final void rule__Eclass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1376:1: ( rule__Eclass__Group_4_2__1__Impl )
            // InternalMDEProject.g:1377:2: rule__Eclass__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__Group_4_2__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_4_2__1"


    // $ANTLR start "rule__Eclass__Group_4_2__1__Impl"
    // InternalMDEProject.g:1383:1: rule__Eclass__Group_4_2__1__Impl : ( ( rule__Eclass__BoundEclassAssignment_4_2_1 ) ) ;
    public final void rule__Eclass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1387:1: ( ( ( rule__Eclass__BoundEclassAssignment_4_2_1 ) ) )
            // InternalMDEProject.g:1388:1: ( ( rule__Eclass__BoundEclassAssignment_4_2_1 ) )
            {
            // InternalMDEProject.g:1388:1: ( ( rule__Eclass__BoundEclassAssignment_4_2_1 ) )
            // InternalMDEProject.g:1389:2: ( rule__Eclass__BoundEclassAssignment_4_2_1 )
            {
             before(grammarAccess.getEclassAccess().getBoundEclassAssignment_4_2_1()); 
            // InternalMDEProject.g:1390:2: ( rule__Eclass__BoundEclassAssignment_4_2_1 )
            // InternalMDEProject.g:1390:3: rule__Eclass__BoundEclassAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__BoundEclassAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEclassAccess().getBoundEclassAssignment_4_2_1()); 

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
    // $ANTLR end "rule__Eclass__Group_4_2__1__Impl"


    // $ANTLR start "rule__Eclass__Group_4_3__0"
    // InternalMDEProject.g:1399:1: rule__Eclass__Group_4_3__0 : rule__Eclass__Group_4_3__0__Impl rule__Eclass__Group_4_3__1 ;
    public final void rule__Eclass__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1403:1: ( rule__Eclass__Group_4_3__0__Impl rule__Eclass__Group_4_3__1 )
            // InternalMDEProject.g:1404:2: rule__Eclass__Group_4_3__0__Impl rule__Eclass__Group_4_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Eclass__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group_4_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_4_3__0"


    // $ANTLR start "rule__Eclass__Group_4_3__0__Impl"
    // InternalMDEProject.g:1411:1: rule__Eclass__Group_4_3__0__Impl : ( 'boundRelatedTo' ) ;
    public final void rule__Eclass__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1415:1: ( ( 'boundRelatedTo' ) )
            // InternalMDEProject.g:1416:1: ( 'boundRelatedTo' )
            {
            // InternalMDEProject.g:1416:1: ( 'boundRelatedTo' )
            // InternalMDEProject.g:1417:2: 'boundRelatedTo'
            {
             before(grammarAccess.getEclassAccess().getBoundRelatedToKeyword_4_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEclassAccess().getBoundRelatedToKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Eclass__Group_4_3__0__Impl"


    // $ANTLR start "rule__Eclass__Group_4_3__1"
    // InternalMDEProject.g:1426:1: rule__Eclass__Group_4_3__1 : rule__Eclass__Group_4_3__1__Impl ;
    public final void rule__Eclass__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1430:1: ( rule__Eclass__Group_4_3__1__Impl )
            // InternalMDEProject.g:1431:2: rule__Eclass__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__Group_4_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_4_3__1"


    // $ANTLR start "rule__Eclass__Group_4_3__1__Impl"
    // InternalMDEProject.g:1437:1: rule__Eclass__Group_4_3__1__Impl : ( ( rule__Eclass__BoundRelatedToAssignment_4_3_1 ) ) ;
    public final void rule__Eclass__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1441:1: ( ( ( rule__Eclass__BoundRelatedToAssignment_4_3_1 ) ) )
            // InternalMDEProject.g:1442:1: ( ( rule__Eclass__BoundRelatedToAssignment_4_3_1 ) )
            {
            // InternalMDEProject.g:1442:1: ( ( rule__Eclass__BoundRelatedToAssignment_4_3_1 ) )
            // InternalMDEProject.g:1443:2: ( rule__Eclass__BoundRelatedToAssignment_4_3_1 )
            {
             before(grammarAccess.getEclassAccess().getBoundRelatedToAssignment_4_3_1()); 
            // InternalMDEProject.g:1444:2: ( rule__Eclass__BoundRelatedToAssignment_4_3_1 )
            // InternalMDEProject.g:1444:3: rule__Eclass__BoundRelatedToAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__BoundRelatedToAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEclassAccess().getBoundRelatedToAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Eclass__Group_4_3__1__Impl"


    // $ANTLR start "rule__Eclass__Group_4_4__0"
    // InternalMDEProject.g:1453:1: rule__Eclass__Group_4_4__0 : rule__Eclass__Group_4_4__0__Impl rule__Eclass__Group_4_4__1 ;
    public final void rule__Eclass__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1457:1: ( rule__Eclass__Group_4_4__0__Impl rule__Eclass__Group_4_4__1 )
            // InternalMDEProject.g:1458:2: rule__Eclass__Group_4_4__0__Impl rule__Eclass__Group_4_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Eclass__Group_4_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group_4_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_4_4__0"


    // $ANTLR start "rule__Eclass__Group_4_4__0__Impl"
    // InternalMDEProject.g:1465:1: rule__Eclass__Group_4_4__0__Impl : ( 'typeRelation' ) ;
    public final void rule__Eclass__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1469:1: ( ( 'typeRelation' ) )
            // InternalMDEProject.g:1470:1: ( 'typeRelation' )
            {
            // InternalMDEProject.g:1470:1: ( 'typeRelation' )
            // InternalMDEProject.g:1471:2: 'typeRelation'
            {
             before(grammarAccess.getEclassAccess().getTypeRelationKeyword_4_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEclassAccess().getTypeRelationKeyword_4_4_0()); 

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
    // $ANTLR end "rule__Eclass__Group_4_4__0__Impl"


    // $ANTLR start "rule__Eclass__Group_4_4__1"
    // InternalMDEProject.g:1480:1: rule__Eclass__Group_4_4__1 : rule__Eclass__Group_4_4__1__Impl ;
    public final void rule__Eclass__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1484:1: ( rule__Eclass__Group_4_4__1__Impl )
            // InternalMDEProject.g:1485:2: rule__Eclass__Group_4_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__Group_4_4__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_4_4__1"


    // $ANTLR start "rule__Eclass__Group_4_4__1__Impl"
    // InternalMDEProject.g:1491:1: rule__Eclass__Group_4_4__1__Impl : ( ( rule__Eclass__TypeRelationAssignment_4_4_1 ) ) ;
    public final void rule__Eclass__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1495:1: ( ( ( rule__Eclass__TypeRelationAssignment_4_4_1 ) ) )
            // InternalMDEProject.g:1496:1: ( ( rule__Eclass__TypeRelationAssignment_4_4_1 ) )
            {
            // InternalMDEProject.g:1496:1: ( ( rule__Eclass__TypeRelationAssignment_4_4_1 ) )
            // InternalMDEProject.g:1497:2: ( rule__Eclass__TypeRelationAssignment_4_4_1 )
            {
             before(grammarAccess.getEclassAccess().getTypeRelationAssignment_4_4_1()); 
            // InternalMDEProject.g:1498:2: ( rule__Eclass__TypeRelationAssignment_4_4_1 )
            // InternalMDEProject.g:1498:3: rule__Eclass__TypeRelationAssignment_4_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__TypeRelationAssignment_4_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEclassAccess().getTypeRelationAssignment_4_4_1()); 

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
    // $ANTLR end "rule__Eclass__Group_4_4__1__Impl"


    // $ANTLR start "rule__Eclass__Group_5__0"
    // InternalMDEProject.g:1507:1: rule__Eclass__Group_5__0 : rule__Eclass__Group_5__0__Impl rule__Eclass__Group_5__1 ;
    public final void rule__Eclass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1511:1: ( rule__Eclass__Group_5__0__Impl rule__Eclass__Group_5__1 )
            // InternalMDEProject.g:1512:2: rule__Eclass__Group_5__0__Impl rule__Eclass__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Eclass__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group_5__1();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_5__0"


    // $ANTLR start "rule__Eclass__Group_5__0__Impl"
    // InternalMDEProject.g:1519:1: rule__Eclass__Group_5__0__Impl : ( '(' ) ;
    public final void rule__Eclass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1523:1: ( ( '(' ) )
            // InternalMDEProject.g:1524:1: ( '(' )
            {
            // InternalMDEProject.g:1524:1: ( '(' )
            // InternalMDEProject.g:1525:2: '('
            {
             before(grammarAccess.getEclassAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEclassAccess().getLeftParenthesisKeyword_5_0()); 

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
    // $ANTLR end "rule__Eclass__Group_5__0__Impl"


    // $ANTLR start "rule__Eclass__Group_5__1"
    // InternalMDEProject.g:1534:1: rule__Eclass__Group_5__1 : rule__Eclass__Group_5__1__Impl rule__Eclass__Group_5__2 ;
    public final void rule__Eclass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1538:1: ( rule__Eclass__Group_5__1__Impl rule__Eclass__Group_5__2 )
            // InternalMDEProject.g:1539:2: rule__Eclass__Group_5__1__Impl rule__Eclass__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__Eclass__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group_5__2();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_5__1"


    // $ANTLR start "rule__Eclass__Group_5__1__Impl"
    // InternalMDEProject.g:1546:1: rule__Eclass__Group_5__1__Impl : ( ( rule__Eclass__ColumnsAssignment_5_1 ) ) ;
    public final void rule__Eclass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1550:1: ( ( ( rule__Eclass__ColumnsAssignment_5_1 ) ) )
            // InternalMDEProject.g:1551:1: ( ( rule__Eclass__ColumnsAssignment_5_1 ) )
            {
            // InternalMDEProject.g:1551:1: ( ( rule__Eclass__ColumnsAssignment_5_1 ) )
            // InternalMDEProject.g:1552:2: ( rule__Eclass__ColumnsAssignment_5_1 )
            {
             before(grammarAccess.getEclassAccess().getColumnsAssignment_5_1()); 
            // InternalMDEProject.g:1553:2: ( rule__Eclass__ColumnsAssignment_5_1 )
            // InternalMDEProject.g:1553:3: rule__Eclass__ColumnsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__ColumnsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEclassAccess().getColumnsAssignment_5_1()); 

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
    // $ANTLR end "rule__Eclass__Group_5__1__Impl"


    // $ANTLR start "rule__Eclass__Group_5__2"
    // InternalMDEProject.g:1561:1: rule__Eclass__Group_5__2 : rule__Eclass__Group_5__2__Impl rule__Eclass__Group_5__3 ;
    public final void rule__Eclass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1565:1: ( rule__Eclass__Group_5__2__Impl rule__Eclass__Group_5__3 )
            // InternalMDEProject.g:1566:2: rule__Eclass__Group_5__2__Impl rule__Eclass__Group_5__3
            {
            pushFollow(FOLLOW_14);
            rule__Eclass__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group_5__3();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_5__2"


    // $ANTLR start "rule__Eclass__Group_5__2__Impl"
    // InternalMDEProject.g:1573:1: rule__Eclass__Group_5__2__Impl : ( ( rule__Eclass__Group_5_2__0 )* ) ;
    public final void rule__Eclass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1577:1: ( ( ( rule__Eclass__Group_5_2__0 )* ) )
            // InternalMDEProject.g:1578:1: ( ( rule__Eclass__Group_5_2__0 )* )
            {
            // InternalMDEProject.g:1578:1: ( ( rule__Eclass__Group_5_2__0 )* )
            // InternalMDEProject.g:1579:2: ( rule__Eclass__Group_5_2__0 )*
            {
             before(grammarAccess.getEclassAccess().getGroup_5_2()); 
            // InternalMDEProject.g:1580:2: ( rule__Eclass__Group_5_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMDEProject.g:1580:3: rule__Eclass__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Eclass__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getEclassAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__Eclass__Group_5__2__Impl"


    // $ANTLR start "rule__Eclass__Group_5__3"
    // InternalMDEProject.g:1588:1: rule__Eclass__Group_5__3 : rule__Eclass__Group_5__3__Impl ;
    public final void rule__Eclass__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1592:1: ( rule__Eclass__Group_5__3__Impl )
            // InternalMDEProject.g:1593:2: rule__Eclass__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__Group_5__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_5__3"


    // $ANTLR start "rule__Eclass__Group_5__3__Impl"
    // InternalMDEProject.g:1599:1: rule__Eclass__Group_5__3__Impl : ( ')' ) ;
    public final void rule__Eclass__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1603:1: ( ( ')' ) )
            // InternalMDEProject.g:1604:1: ( ')' )
            {
            // InternalMDEProject.g:1604:1: ( ')' )
            // InternalMDEProject.g:1605:2: ')'
            {
             before(grammarAccess.getEclassAccess().getRightParenthesisKeyword_5_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEclassAccess().getRightParenthesisKeyword_5_3()); 

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
    // $ANTLR end "rule__Eclass__Group_5__3__Impl"


    // $ANTLR start "rule__Eclass__Group_5_2__0"
    // InternalMDEProject.g:1615:1: rule__Eclass__Group_5_2__0 : rule__Eclass__Group_5_2__0__Impl rule__Eclass__Group_5_2__1 ;
    public final void rule__Eclass__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1619:1: ( rule__Eclass__Group_5_2__0__Impl rule__Eclass__Group_5_2__1 )
            // InternalMDEProject.g:1620:2: rule__Eclass__Group_5_2__0__Impl rule__Eclass__Group_5_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Eclass__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eclass__Group_5_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_5_2__0"


    // $ANTLR start "rule__Eclass__Group_5_2__0__Impl"
    // InternalMDEProject.g:1627:1: rule__Eclass__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Eclass__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1631:1: ( ( ',' ) )
            // InternalMDEProject.g:1632:1: ( ',' )
            {
            // InternalMDEProject.g:1632:1: ( ',' )
            // InternalMDEProject.g:1633:2: ','
            {
             before(grammarAccess.getEclassAccess().getCommaKeyword_5_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEclassAccess().getCommaKeyword_5_2_0()); 

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
    // $ANTLR end "rule__Eclass__Group_5_2__0__Impl"


    // $ANTLR start "rule__Eclass__Group_5_2__1"
    // InternalMDEProject.g:1642:1: rule__Eclass__Group_5_2__1 : rule__Eclass__Group_5_2__1__Impl ;
    public final void rule__Eclass__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1646:1: ( rule__Eclass__Group_5_2__1__Impl )
            // InternalMDEProject.g:1647:2: rule__Eclass__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__Group_5_2__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Eclass__Group_5_2__1"


    // $ANTLR start "rule__Eclass__Group_5_2__1__Impl"
    // InternalMDEProject.g:1653:1: rule__Eclass__Group_5_2__1__Impl : ( ( rule__Eclass__ColumnsAssignment_5_2_1 ) ) ;
    public final void rule__Eclass__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1657:1: ( ( ( rule__Eclass__ColumnsAssignment_5_2_1 ) ) )
            // InternalMDEProject.g:1658:1: ( ( rule__Eclass__ColumnsAssignment_5_2_1 ) )
            {
            // InternalMDEProject.g:1658:1: ( ( rule__Eclass__ColumnsAssignment_5_2_1 ) )
            // InternalMDEProject.g:1659:2: ( rule__Eclass__ColumnsAssignment_5_2_1 )
            {
             before(grammarAccess.getEclassAccess().getColumnsAssignment_5_2_1()); 
            // InternalMDEProject.g:1660:2: ( rule__Eclass__ColumnsAssignment_5_2_1 )
            // InternalMDEProject.g:1660:3: rule__Eclass__ColumnsAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Eclass__ColumnsAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEclassAccess().getColumnsAssignment_5_2_1()); 

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
    // $ANTLR end "rule__Eclass__Group_5_2__1__Impl"


    // $ANTLR start "rule__Eattribute__Group__0"
    // InternalMDEProject.g:1669:1: rule__Eattribute__Group__0 : rule__Eattribute__Group__0__Impl rule__Eattribute__Group__1 ;
    public final void rule__Eattribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1673:1: ( rule__Eattribute__Group__0__Impl rule__Eattribute__Group__1 )
            // InternalMDEProject.g:1674:2: rule__Eattribute__Group__0__Impl rule__Eattribute__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Eattribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eattribute__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Eattribute__Group__0"


    // $ANTLR start "rule__Eattribute__Group__0__Impl"
    // InternalMDEProject.g:1681:1: rule__Eattribute__Group__0__Impl : ( () ) ;
    public final void rule__Eattribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1685:1: ( ( () ) )
            // InternalMDEProject.g:1686:1: ( () )
            {
            // InternalMDEProject.g:1686:1: ( () )
            // InternalMDEProject.g:1687:2: ()
            {
             before(grammarAccess.getEattributeAccess().getEattributeAction_0()); 
            // InternalMDEProject.g:1688:2: ()
            // InternalMDEProject.g:1688:3: 
            {
            }

             after(grammarAccess.getEattributeAccess().getEattributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eattribute__Group__0__Impl"


    // $ANTLR start "rule__Eattribute__Group__1"
    // InternalMDEProject.g:1696:1: rule__Eattribute__Group__1 : rule__Eattribute__Group__1__Impl rule__Eattribute__Group__2 ;
    public final void rule__Eattribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1700:1: ( rule__Eattribute__Group__1__Impl rule__Eattribute__Group__2 )
            // InternalMDEProject.g:1701:2: rule__Eattribute__Group__1__Impl rule__Eattribute__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Eattribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eattribute__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Eattribute__Group__1"


    // $ANTLR start "rule__Eattribute__Group__1__Impl"
    // InternalMDEProject.g:1708:1: rule__Eattribute__Group__1__Impl : ( 'Eattribute' ) ;
    public final void rule__Eattribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1712:1: ( ( 'Eattribute' ) )
            // InternalMDEProject.g:1713:1: ( 'Eattribute' )
            {
            // InternalMDEProject.g:1713:1: ( 'Eattribute' )
            // InternalMDEProject.g:1714:2: 'Eattribute'
            {
             before(grammarAccess.getEattributeAccess().getEattributeKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEattributeAccess().getEattributeKeyword_1()); 

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
    // $ANTLR end "rule__Eattribute__Group__1__Impl"


    // $ANTLR start "rule__Eattribute__Group__2"
    // InternalMDEProject.g:1723:1: rule__Eattribute__Group__2 : rule__Eattribute__Group__2__Impl rule__Eattribute__Group__3 ;
    public final void rule__Eattribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1727:1: ( rule__Eattribute__Group__2__Impl rule__Eattribute__Group__3 )
            // InternalMDEProject.g:1728:2: rule__Eattribute__Group__2__Impl rule__Eattribute__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Eattribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eattribute__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Eattribute__Group__2"


    // $ANTLR start "rule__Eattribute__Group__2__Impl"
    // InternalMDEProject.g:1735:1: rule__Eattribute__Group__2__Impl : ( ( rule__Eattribute__NameAssignment_2 ) ) ;
    public final void rule__Eattribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1739:1: ( ( ( rule__Eattribute__NameAssignment_2 ) ) )
            // InternalMDEProject.g:1740:1: ( ( rule__Eattribute__NameAssignment_2 ) )
            {
            // InternalMDEProject.g:1740:1: ( ( rule__Eattribute__NameAssignment_2 ) )
            // InternalMDEProject.g:1741:2: ( rule__Eattribute__NameAssignment_2 )
            {
             before(grammarAccess.getEattributeAccess().getNameAssignment_2()); 
            // InternalMDEProject.g:1742:2: ( rule__Eattribute__NameAssignment_2 )
            // InternalMDEProject.g:1742:3: rule__Eattribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Eattribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEattributeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Eattribute__Group__2__Impl"


    // $ANTLR start "rule__Eattribute__Group__3"
    // InternalMDEProject.g:1750:1: rule__Eattribute__Group__3 : rule__Eattribute__Group__3__Impl rule__Eattribute__Group__4 ;
    public final void rule__Eattribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1754:1: ( rule__Eattribute__Group__3__Impl rule__Eattribute__Group__4 )
            // InternalMDEProject.g:1755:2: rule__Eattribute__Group__3__Impl rule__Eattribute__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Eattribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eattribute__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Eattribute__Group__3"


    // $ANTLR start "rule__Eattribute__Group__3__Impl"
    // InternalMDEProject.g:1762:1: rule__Eattribute__Group__3__Impl : ( ( rule__Eattribute__Group_3__0 )? ) ;
    public final void rule__Eattribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1766:1: ( ( ( rule__Eattribute__Group_3__0 )? ) )
            // InternalMDEProject.g:1767:1: ( ( rule__Eattribute__Group_3__0 )? )
            {
            // InternalMDEProject.g:1767:1: ( ( rule__Eattribute__Group_3__0 )? )
            // InternalMDEProject.g:1768:2: ( rule__Eattribute__Group_3__0 )?
            {
             before(grammarAccess.getEattributeAccess().getGroup_3()); 
            // InternalMDEProject.g:1769:2: ( rule__Eattribute__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMDEProject.g:1769:3: rule__Eattribute__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Eattribute__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEattributeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Eattribute__Group__3__Impl"


    // $ANTLR start "rule__Eattribute__Group__4"
    // InternalMDEProject.g:1777:1: rule__Eattribute__Group__4 : rule__Eattribute__Group__4__Impl ;
    public final void rule__Eattribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1781:1: ( rule__Eattribute__Group__4__Impl )
            // InternalMDEProject.g:1782:2: rule__Eattribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eattribute__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Eattribute__Group__4"


    // $ANTLR start "rule__Eattribute__Group__4__Impl"
    // InternalMDEProject.g:1788:1: rule__Eattribute__Group__4__Impl : ( ( rule__Eattribute__Group_4__0 )? ) ;
    public final void rule__Eattribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1792:1: ( ( ( rule__Eattribute__Group_4__0 )? ) )
            // InternalMDEProject.g:1793:1: ( ( rule__Eattribute__Group_4__0 )? )
            {
            // InternalMDEProject.g:1793:1: ( ( rule__Eattribute__Group_4__0 )? )
            // InternalMDEProject.g:1794:2: ( rule__Eattribute__Group_4__0 )?
            {
             before(grammarAccess.getEattributeAccess().getGroup_4()); 
            // InternalMDEProject.g:1795:2: ( rule__Eattribute__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMDEProject.g:1795:3: rule__Eattribute__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Eattribute__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEattributeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Eattribute__Group__4__Impl"


    // $ANTLR start "rule__Eattribute__Group_3__0"
    // InternalMDEProject.g:1804:1: rule__Eattribute__Group_3__0 : rule__Eattribute__Group_3__0__Impl rule__Eattribute__Group_3__1 ;
    public final void rule__Eattribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1808:1: ( rule__Eattribute__Group_3__0__Impl rule__Eattribute__Group_3__1 )
            // InternalMDEProject.g:1809:2: rule__Eattribute__Group_3__0__Impl rule__Eattribute__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Eattribute__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eattribute__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__Eattribute__Group_3__0"


    // $ANTLR start "rule__Eattribute__Group_3__0__Impl"
    // InternalMDEProject.g:1816:1: rule__Eattribute__Group_3__0__Impl : ( 'from' ) ;
    public final void rule__Eattribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1820:1: ( ( 'from' ) )
            // InternalMDEProject.g:1821:1: ( 'from' )
            {
            // InternalMDEProject.g:1821:1: ( 'from' )
            // InternalMDEProject.g:1822:2: 'from'
            {
             before(grammarAccess.getEattributeAccess().getFromKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEattributeAccess().getFromKeyword_3_0()); 

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
    // $ANTLR end "rule__Eattribute__Group_3__0__Impl"


    // $ANTLR start "rule__Eattribute__Group_3__1"
    // InternalMDEProject.g:1831:1: rule__Eattribute__Group_3__1 : rule__Eattribute__Group_3__1__Impl ;
    public final void rule__Eattribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1835:1: ( rule__Eattribute__Group_3__1__Impl )
            // InternalMDEProject.g:1836:2: rule__Eattribute__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eattribute__Group_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Eattribute__Group_3__1"


    // $ANTLR start "rule__Eattribute__Group_3__1__Impl"
    // InternalMDEProject.g:1842:1: rule__Eattribute__Group_3__1__Impl : ( ( rule__Eattribute__FromAssignment_3_1 ) ) ;
    public final void rule__Eattribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1846:1: ( ( ( rule__Eattribute__FromAssignment_3_1 ) ) )
            // InternalMDEProject.g:1847:1: ( ( rule__Eattribute__FromAssignment_3_1 ) )
            {
            // InternalMDEProject.g:1847:1: ( ( rule__Eattribute__FromAssignment_3_1 ) )
            // InternalMDEProject.g:1848:2: ( rule__Eattribute__FromAssignment_3_1 )
            {
             before(grammarAccess.getEattributeAccess().getFromAssignment_3_1()); 
            // InternalMDEProject.g:1849:2: ( rule__Eattribute__FromAssignment_3_1 )
            // InternalMDEProject.g:1849:3: rule__Eattribute__FromAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Eattribute__FromAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEattributeAccess().getFromAssignment_3_1()); 

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
    // $ANTLR end "rule__Eattribute__Group_3__1__Impl"


    // $ANTLR start "rule__Eattribute__Group_4__0"
    // InternalMDEProject.g:1858:1: rule__Eattribute__Group_4__0 : rule__Eattribute__Group_4__0__Impl rule__Eattribute__Group_4__1 ;
    public final void rule__Eattribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1862:1: ( rule__Eattribute__Group_4__0__Impl rule__Eattribute__Group_4__1 )
            // InternalMDEProject.g:1863:2: rule__Eattribute__Group_4__0__Impl rule__Eattribute__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Eattribute__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eattribute__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__Eattribute__Group_4__0"


    // $ANTLR start "rule__Eattribute__Group_4__0__Impl"
    // InternalMDEProject.g:1870:1: rule__Eattribute__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Eattribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1874:1: ( ( 'type' ) )
            // InternalMDEProject.g:1875:1: ( 'type' )
            {
            // InternalMDEProject.g:1875:1: ( 'type' )
            // InternalMDEProject.g:1876:2: 'type'
            {
             before(grammarAccess.getEattributeAccess().getTypeKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEattributeAccess().getTypeKeyword_4_0()); 

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
    // $ANTLR end "rule__Eattribute__Group_4__0__Impl"


    // $ANTLR start "rule__Eattribute__Group_4__1"
    // InternalMDEProject.g:1885:1: rule__Eattribute__Group_4__1 : rule__Eattribute__Group_4__1__Impl ;
    public final void rule__Eattribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1889:1: ( rule__Eattribute__Group_4__1__Impl )
            // InternalMDEProject.g:1890:2: rule__Eattribute__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eattribute__Group_4__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Eattribute__Group_4__1"


    // $ANTLR start "rule__Eattribute__Group_4__1__Impl"
    // InternalMDEProject.g:1896:1: rule__Eattribute__Group_4__1__Impl : ( ( rule__Eattribute__TypeAssignment_4_1 ) ) ;
    public final void rule__Eattribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1900:1: ( ( ( rule__Eattribute__TypeAssignment_4_1 ) ) )
            // InternalMDEProject.g:1901:1: ( ( rule__Eattribute__TypeAssignment_4_1 ) )
            {
            // InternalMDEProject.g:1901:1: ( ( rule__Eattribute__TypeAssignment_4_1 ) )
            // InternalMDEProject.g:1902:2: ( rule__Eattribute__TypeAssignment_4_1 )
            {
             before(grammarAccess.getEattributeAccess().getTypeAssignment_4_1()); 
            // InternalMDEProject.g:1903:2: ( rule__Eattribute__TypeAssignment_4_1 )
            // InternalMDEProject.g:1903:3: rule__Eattribute__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Eattribute__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEattributeAccess().getTypeAssignment_4_1()); 

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
    // $ANTLR end "rule__Eattribute__Group_4__1__Impl"


    // $ANTLR start "rule__Load__NameAssignment_1"
    // InternalMDEProject.g:1912:1: rule__Load__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Load__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1916:1: ( ( ruleEString ) )
            // InternalMDEProject.g:1917:2: ( ruleEString )
            {
            // InternalMDEProject.g:1917:2: ( ruleEString )
            // InternalMDEProject.g:1918:3: ruleEString
            {
             before(grammarAccess.getLoadAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoadAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Load__NameAssignment_1"


    // $ANTLR start "rule__Load__ActionsAssignment_4"
    // InternalMDEProject.g:1927:1: rule__Load__ActionsAssignment_4 : ( ruleQueryExpression ) ;
    public final void rule__Load__ActionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1931:1: ( ( ruleQueryExpression ) )
            // InternalMDEProject.g:1932:2: ( ruleQueryExpression )
            {
            // InternalMDEProject.g:1932:2: ( ruleQueryExpression )
            // InternalMDEProject.g:1933:3: ruleQueryExpression
            {
             before(grammarAccess.getLoadAccess().getActionsQueryExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryExpression();

            state._fsp--;

             after(grammarAccess.getLoadAccess().getActionsQueryExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Load__ActionsAssignment_4"


    // $ANTLR start "rule__Load__ActionsAssignment_5_1"
    // InternalMDEProject.g:1942:1: rule__Load__ActionsAssignment_5_1 : ( ruleQueryExpression ) ;
    public final void rule__Load__ActionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1946:1: ( ( ruleQueryExpression ) )
            // InternalMDEProject.g:1947:2: ( ruleQueryExpression )
            {
            // InternalMDEProject.g:1947:2: ( ruleQueryExpression )
            // InternalMDEProject.g:1948:3: ruleQueryExpression
            {
             before(grammarAccess.getLoadAccess().getActionsQueryExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryExpression();

            state._fsp--;

             after(grammarAccess.getLoadAccess().getActionsQueryExpressionParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Load__ActionsAssignment_5_1"


    // $ANTLR start "rule__Add__SpecificationAssignment_1"
    // InternalMDEProject.g:1957:1: rule__Add__SpecificationAssignment_1 : ( ruleKeyword ) ;
    public final void rule__Add__SpecificationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1961:1: ( ( ruleKeyword ) )
            // InternalMDEProject.g:1962:2: ( ruleKeyword )
            {
            // InternalMDEProject.g:1962:2: ( ruleKeyword )
            // InternalMDEProject.g:1963:3: ruleKeyword
            {
             before(grammarAccess.getAddAccess().getSpecificationKeywordParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getAddAccess().getSpecificationKeywordParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Add__SpecificationAssignment_1"


    // $ANTLR start "rule__Delete__SpecificationAssignment_1"
    // InternalMDEProject.g:1972:1: rule__Delete__SpecificationAssignment_1 : ( ruleKeyword ) ;
    public final void rule__Delete__SpecificationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1976:1: ( ( ruleKeyword ) )
            // InternalMDEProject.g:1977:2: ( ruleKeyword )
            {
            // InternalMDEProject.g:1977:2: ( ruleKeyword )
            // InternalMDEProject.g:1978:3: ruleKeyword
            {
             before(grammarAccess.getDeleteAccess().getSpecificationKeywordParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getSpecificationKeywordParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Delete__SpecificationAssignment_1"


    // $ANTLR start "rule__Modify__SpecificationAssignment_1"
    // InternalMDEProject.g:1987:1: rule__Modify__SpecificationAssignment_1 : ( ruleKeyword ) ;
    public final void rule__Modify__SpecificationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:1991:1: ( ( ruleKeyword ) )
            // InternalMDEProject.g:1992:2: ( ruleKeyword )
            {
            // InternalMDEProject.g:1992:2: ( ruleKeyword )
            // InternalMDEProject.g:1993:3: ruleKeyword
            {
             before(grammarAccess.getModifyAccess().getSpecificationKeywordParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getModifyAccess().getSpecificationKeywordParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Modify__SpecificationAssignment_1"


    // $ANTLR start "rule__Modify__NewValueNameAssignment_2_1"
    // InternalMDEProject.g:2002:1: rule__Modify__NewValueNameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Modify__NewValueNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:2006:1: ( ( ruleEString ) )
            // InternalMDEProject.g:2007:2: ( ruleEString )
            {
            // InternalMDEProject.g:2007:2: ( ruleEString )
            // InternalMDEProject.g:2008:3: ruleEString
            {
             before(grammarAccess.getModifyAccess().getNewValueNameEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModifyAccess().getNewValueNameEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Modify__NewValueNameAssignment_2_1"


    // $ANTLR start "rule__Modify__NewValueTypeAssignment_3_1"
    // InternalMDEProject.g:2017:1: rule__Modify__NewValueTypeAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Modify__NewValueTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:2021:1: ( ( ruleEString ) )
            // InternalMDEProject.g:2022:2: ( ruleEString )
            {
            // InternalMDEProject.g:2022:2: ( ruleEString )
            // InternalMDEProject.g:2023:3: ruleEString
            {
             before(grammarAccess.getModifyAccess().getNewValueTypeEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModifyAccess().getNewValueTypeEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Modify__NewValueTypeAssignment_3_1"


    // $ANTLR start "rule__Eclass__NameAssignment_2"
    // InternalMDEProject.g:2032:1: rule__Eclass__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Eclass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:2036:1: ( ( ruleEString ) )
            // InternalMDEProject.g:2037:2: ( ruleEString )
            {
            // InternalMDEProject.g:2037:2: ( ruleEString )
            // InternalMDEProject.g:2038:3: ruleEString
            {
             before(grammarAccess.getEclassAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEclassAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Eclass__NameAssignment_2"


    // $ANTLR start "rule__Eclass__TypeAssignment_3_1"
    // InternalMDEProject.g:2047:1: rule__Eclass__TypeAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Eclass__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:2051:1: ( ( ruleEString ) )
            // InternalMDEProject.g:2052:2: ( ruleEString )
            {
            // InternalMDEProject.g:2052:2: ( ruleEString )
            // InternalMDEProject.g:2053:3: ruleEString
            {
             before(grammarAccess.getEclassAccess().getTypeEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEclassAccess().getTypeEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Eclass__TypeAssignment_3_1"


    // $ANTLR start "rule__Eclass__RelatedToAssignment_4_1_1"
    // InternalMDEProject.g:2062:1: rule__Eclass__RelatedToAssignment_4_1_1 : ( ruleEString ) ;
    public final void rule__Eclass__RelatedToAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:2066:1: ( ( ruleEString ) )
            // InternalMDEProject.g:2067:2: ( ruleEString )
            {
            // InternalMDEProject.g:2067:2: ( ruleEString )
            // InternalMDEProject.g:2068:3: ruleEString
            {
             before(grammarAccess.getEclassAccess().getRelatedToEStringParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEclassAccess().getRelatedToEStringParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__Eclass__RelatedToAssignment_4_1_1"


    // $ANTLR start "rule__Eclass__BoundEclassAssignment_4_2_1"
    // InternalMDEProject.g:2077:1: rule__Eclass__BoundEclassAssignment_4_2_1 : ( ruleEString ) ;
    public final void rule__Eclass__BoundEclassAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:2081:1: ( ( ruleEString ) )
            // InternalMDEProject.g:2082:2: ( ruleEString )
            {
            // InternalMDEProject.g:2082:2: ( ruleEString )
            // InternalMDEProject.g:2083:3: ruleEString
            {
             before(grammarAccess.getEclassAccess().getBoundEclassEStringParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEclassAccess().getBoundEclassEStringParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__Eclass__BoundEclassAssignment_4_2_1"


    // $ANTLR start "rule__Eclass__BoundRelatedToAssignment_4_3_1"
    // InternalMDEProject.g:2092:1: rule__Eclass__BoundRelatedToAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__Eclass__BoundRelatedToAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:2096:1: ( ( ruleEString ) )
            // InternalMDEProject.g:2097:2: ( ruleEString )
            {
            // InternalMDEProject.g:2097:2: ( ruleEString )
            // InternalMDEProject.g:2098:3: ruleEString
            {
             before(grammarAccess.getEclassAccess().getBoundRelatedToEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEclassAccess().getBoundRelatedToEStringParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Eclass__BoundRelatedToAssignment_4_3_1"


    // $ANTLR start "rule__Eclass__TypeRelationAssignment_4_4_1"
    // InternalMDEProject.g:2107:1: rule__Eclass__TypeRelationAssignment_4_4_1 : ( ruleEString ) ;
    public final void rule__Eclass__TypeRelationAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:2111:1: ( ( ruleEString ) )
            // InternalMDEProject.g:2112:2: ( ruleEString )
            {
            // InternalMDEProject.g:2112:2: ( ruleEString )
            // InternalMDEProject.g:2113:3: ruleEString
            {
             before(grammarAccess.getEclassAccess().getTypeRelationEStringParserRuleCall_4_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEclassAccess().getTypeRelationEStringParserRuleCall_4_4_1_0()); 

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
    // $ANTLR end "rule__Eclass__TypeRelationAssignment_4_4_1"


    // $ANTLR start "rule__Eclass__ColumnsAssignment_5_1"
    // InternalMDEProject.g:2122:1: rule__Eclass__ColumnsAssignment_5_1 : ( ruleEattribute ) ;
    public final void rule__Eclass__ColumnsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:2126:1: ( ( ruleEattribute ) )
            // InternalMDEProject.g:2127:2: ( ruleEattribute )
            {
            // InternalMDEProject.g:2127:2: ( ruleEattribute )
            // InternalMDEProject.g:2128:3: ruleEattribute
            {
             before(grammarAccess.getEclassAccess().getColumnsEattributeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEattribute();

            state._fsp--;

             after(grammarAccess.getEclassAccess().getColumnsEattributeParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Eclass__ColumnsAssignment_5_1"


    // $ANTLR start "rule__Eclass__ColumnsAssignment_5_2_1"
    // InternalMDEProject.g:2137:1: rule__Eclass__ColumnsAssignment_5_2_1 : ( ruleEattribute ) ;
    public final void rule__Eclass__ColumnsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:2141:1: ( ( ruleEattribute ) )
            // InternalMDEProject.g:2142:2: ( ruleEattribute )
            {
            // InternalMDEProject.g:2142:2: ( ruleEattribute )
            // InternalMDEProject.g:2143:3: ruleEattribute
            {
             before(grammarAccess.getEclassAccess().getColumnsEattributeParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEattribute();

            state._fsp--;

             after(grammarAccess.getEclassAccess().getColumnsEattributeParserRuleCall_5_2_1_0()); 

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
    // $ANTLR end "rule__Eclass__ColumnsAssignment_5_2_1"


    // $ANTLR start "rule__Eattribute__NameAssignment_2"
    // InternalMDEProject.g:2152:1: rule__Eattribute__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Eattribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:2156:1: ( ( ruleEString ) )
            // InternalMDEProject.g:2157:2: ( ruleEString )
            {
            // InternalMDEProject.g:2157:2: ( ruleEString )
            // InternalMDEProject.g:2158:3: ruleEString
            {
             before(grammarAccess.getEattributeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEattributeAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Eattribute__NameAssignment_2"


    // $ANTLR start "rule__Eattribute__FromAssignment_3_1"
    // InternalMDEProject.g:2167:1: rule__Eattribute__FromAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Eattribute__FromAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:2171:1: ( ( ruleEString ) )
            // InternalMDEProject.g:2172:2: ( ruleEString )
            {
            // InternalMDEProject.g:2172:2: ( ruleEString )
            // InternalMDEProject.g:2173:3: ruleEString
            {
             before(grammarAccess.getEattributeAccess().getFromEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEattributeAccess().getFromEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Eattribute__FromAssignment_3_1"


    // $ANTLR start "rule__Eattribute__TypeAssignment_4_1"
    // InternalMDEProject.g:2182:1: rule__Eattribute__TypeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Eattribute__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMDEProject.g:2186:1: ( ( ruleEString ) )
            // InternalMDEProject.g:2187:2: ( ruleEString )
            {
            // InternalMDEProject.g:2187:2: ( ruleEString )
            // InternalMDEProject.g:2188:3: ruleEString
            {
             before(grammarAccess.getEattributeAccess().getTypeEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEattributeAccess().getTypeEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Eattribute__TypeAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000600000000L});

}