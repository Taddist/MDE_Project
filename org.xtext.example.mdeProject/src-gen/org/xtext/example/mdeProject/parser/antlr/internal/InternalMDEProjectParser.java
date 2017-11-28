package org.xtext.example.mdeProject.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mdeProject.services.MDEProjectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMDEProjectParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Load'", "'Do'", "'{'", "';'", "'}'", "'Add'", "'Delete'", "'Modify'", "'newValueName'", "'newValueType'", "'Eclass'", "':'", "'['", "'relatedTo'", "'boundEclass'", "'boundRelatedTo'", "'typeRelation'", "']'", "'('", "','", "')'", "'Eattribute'", "'from'", "'type'"
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

        public InternalMDEProjectParser(TokenStream input, MDEProjectGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Load";
       	}

       	@Override
       	protected MDEProjectGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLoad"
    // InternalMDEProject.g:64:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalMDEProject.g:64:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalMDEProject.g:65:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
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
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // InternalMDEProject.g:71:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'Load' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Do' otherlv_3= '{' ( (lv_actions_4_0= ruleQueryExpression ) ) (otherlv_5= ';' ( (lv_actions_6_0= ruleQueryExpression ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_actions_4_0 = null;

        EObject lv_actions_6_0 = null;



        	enterRule();

        try {
            // InternalMDEProject.g:77:2: ( (otherlv_0= 'Load' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Do' otherlv_3= '{' ( (lv_actions_4_0= ruleQueryExpression ) ) (otherlv_5= ';' ( (lv_actions_6_0= ruleQueryExpression ) ) )* otherlv_7= '}' ) )
            // InternalMDEProject.g:78:2: (otherlv_0= 'Load' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Do' otherlv_3= '{' ( (lv_actions_4_0= ruleQueryExpression ) ) (otherlv_5= ';' ( (lv_actions_6_0= ruleQueryExpression ) ) )* otherlv_7= '}' )
            {
            // InternalMDEProject.g:78:2: (otherlv_0= 'Load' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Do' otherlv_3= '{' ( (lv_actions_4_0= ruleQueryExpression ) ) (otherlv_5= ';' ( (lv_actions_6_0= ruleQueryExpression ) ) )* otherlv_7= '}' )
            // InternalMDEProject.g:79:3: otherlv_0= 'Load' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Do' otherlv_3= '{' ( (lv_actions_4_0= ruleQueryExpression ) ) (otherlv_5= ';' ( (lv_actions_6_0= ruleQueryExpression ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0());
            		
            // InternalMDEProject.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMDEProject.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalMDEProject.g:84:4: (lv_name_1_0= ruleEString )
            // InternalMDEProject.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoadAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mdeProject.MDEProject.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getDoKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMDEProject.g:110:3: ( (lv_actions_4_0= ruleQueryExpression ) )
            // InternalMDEProject.g:111:4: (lv_actions_4_0= ruleQueryExpression )
            {
            // InternalMDEProject.g:111:4: (lv_actions_4_0= ruleQueryExpression )
            // InternalMDEProject.g:112:5: lv_actions_4_0= ruleQueryExpression
            {

            					newCompositeNode(grammarAccess.getLoadAccess().getActionsQueryExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_actions_4_0=ruleQueryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_4_0,
            						"org.xtext.example.mdeProject.MDEProject.QueryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMDEProject.g:129:3: (otherlv_5= ';' ( (lv_actions_6_0= ruleQueryExpression ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMDEProject.g:130:4: otherlv_5= ';' ( (lv_actions_6_0= ruleQueryExpression ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getLoadAccess().getSemicolonKeyword_5_0());
            	    			
            	    // InternalMDEProject.g:134:4: ( (lv_actions_6_0= ruleQueryExpression ) )
            	    // InternalMDEProject.g:135:5: (lv_actions_6_0= ruleQueryExpression )
            	    {
            	    // InternalMDEProject.g:135:5: (lv_actions_6_0= ruleQueryExpression )
            	    // InternalMDEProject.g:136:6: lv_actions_6_0= ruleQueryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getLoadAccess().getActionsQueryExpressionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_actions_6_0=ruleQueryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLoadRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_6_0,
            	    							"org.xtext.example.mdeProject.MDEProject.QueryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLoadAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRuleQueryExpression"
    // InternalMDEProject.g:162:1: entryRuleQueryExpression returns [EObject current=null] : iv_ruleQueryExpression= ruleQueryExpression EOF ;
    public final EObject entryRuleQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryExpression = null;


        try {
            // InternalMDEProject.g:162:56: (iv_ruleQueryExpression= ruleQueryExpression EOF )
            // InternalMDEProject.g:163:2: iv_ruleQueryExpression= ruleQueryExpression EOF
            {
             newCompositeNode(grammarAccess.getQueryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryExpression=ruleQueryExpression();

            state._fsp--;

             current =iv_ruleQueryExpression; 
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
    // $ANTLR end "entryRuleQueryExpression"


    // $ANTLR start "ruleQueryExpression"
    // InternalMDEProject.g:169:1: ruleQueryExpression returns [EObject current=null] : (this_Add_0= ruleAdd | this_Delete_1= ruleDelete | this_Modify_2= ruleModify ) ;
    public final EObject ruleQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Add_0 = null;

        EObject this_Delete_1 = null;

        EObject this_Modify_2 = null;



        	enterRule();

        try {
            // InternalMDEProject.g:175:2: ( (this_Add_0= ruleAdd | this_Delete_1= ruleDelete | this_Modify_2= ruleModify ) )
            // InternalMDEProject.g:176:2: (this_Add_0= ruleAdd | this_Delete_1= ruleDelete | this_Modify_2= ruleModify )
            {
            // InternalMDEProject.g:176:2: (this_Add_0= ruleAdd | this_Delete_1= ruleDelete | this_Modify_2= ruleModify )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMDEProject.g:177:3: this_Add_0= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getQueryExpressionAccess().getAddParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_0=ruleAdd();

                    state._fsp--;


                    			current = this_Add_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMDEProject.g:186:3: this_Delete_1= ruleDelete
                    {

                    			newCompositeNode(grammarAccess.getQueryExpressionAccess().getDeleteParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Delete_1=ruleDelete();

                    state._fsp--;


                    			current = this_Delete_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMDEProject.g:195:3: this_Modify_2= ruleModify
                    {

                    			newCompositeNode(grammarAccess.getQueryExpressionAccess().getModifyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Modify_2=ruleModify();

                    state._fsp--;


                    			current = this_Modify_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleQueryExpression"


    // $ANTLR start "entryRuleKeyword"
    // InternalMDEProject.g:207:1: entryRuleKeyword returns [EObject current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final EObject entryRuleKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyword = null;


        try {
            // InternalMDEProject.g:207:48: (iv_ruleKeyword= ruleKeyword EOF )
            // InternalMDEProject.g:208:2: iv_ruleKeyword= ruleKeyword EOF
            {
             newCompositeNode(grammarAccess.getKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyword=ruleKeyword();

            state._fsp--;

             current =iv_ruleKeyword; 
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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // InternalMDEProject.g:214:1: ruleKeyword returns [EObject current=null] : (this_Eclass_0= ruleEclass | this_Eattribute_1= ruleEattribute ) ;
    public final EObject ruleKeyword() throws RecognitionException {
        EObject current = null;

        EObject this_Eclass_0 = null;

        EObject this_Eattribute_1 = null;



        	enterRule();

        try {
            // InternalMDEProject.g:220:2: ( (this_Eclass_0= ruleEclass | this_Eattribute_1= ruleEattribute ) )
            // InternalMDEProject.g:221:2: (this_Eclass_0= ruleEclass | this_Eattribute_1= ruleEattribute )
            {
            // InternalMDEProject.g:221:2: (this_Eclass_0= ruleEclass | this_Eattribute_1= ruleEattribute )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMDEProject.g:222:3: this_Eclass_0= ruleEclass
                    {

                    			newCompositeNode(grammarAccess.getKeywordAccess().getEclassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Eclass_0=ruleEclass();

                    state._fsp--;


                    			current = this_Eclass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMDEProject.g:231:3: this_Eattribute_1= ruleEattribute
                    {

                    			newCompositeNode(grammarAccess.getKeywordAccess().getEattributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Eattribute_1=ruleEattribute();

                    state._fsp--;


                    			current = this_Eattribute_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleEString"
    // InternalMDEProject.g:243:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMDEProject.g:243:47: (iv_ruleEString= ruleEString EOF )
            // InternalMDEProject.g:244:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMDEProject.g:250:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMDEProject.g:256:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMDEProject.g:257:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMDEProject.g:257:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMDEProject.g:258:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMDEProject.g:266:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAdd"
    // InternalMDEProject.g:277:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalMDEProject.g:277:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalMDEProject.g:278:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalMDEProject.g:284:1: ruleAdd returns [EObject current=null] : (otherlv_0= 'Add' ( (lv_specification_1_0= ruleKeyword ) ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specification_1_0 = null;



        	enterRule();

        try {
            // InternalMDEProject.g:290:2: ( (otherlv_0= 'Add' ( (lv_specification_1_0= ruleKeyword ) ) ) )
            // InternalMDEProject.g:291:2: (otherlv_0= 'Add' ( (lv_specification_1_0= ruleKeyword ) ) )
            {
            // InternalMDEProject.g:291:2: (otherlv_0= 'Add' ( (lv_specification_1_0= ruleKeyword ) ) )
            // InternalMDEProject.g:292:3: otherlv_0= 'Add' ( (lv_specification_1_0= ruleKeyword ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0());
            		
            // InternalMDEProject.g:296:3: ( (lv_specification_1_0= ruleKeyword ) )
            // InternalMDEProject.g:297:4: (lv_specification_1_0= ruleKeyword )
            {
            // InternalMDEProject.g:297:4: (lv_specification_1_0= ruleKeyword )
            // InternalMDEProject.g:298:5: lv_specification_1_0= ruleKeyword
            {

            					newCompositeNode(grammarAccess.getAddAccess().getSpecificationKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_specification_1_0=ruleKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"specification",
            						lv_specification_1_0,
            						"org.xtext.example.mdeProject.MDEProject.Keyword");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleDelete"
    // InternalMDEProject.g:319:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalMDEProject.g:319:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalMDEProject.g:320:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
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
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalMDEProject.g:326:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'Delete' ( (lv_specification_1_0= ruleKeyword ) ) ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specification_1_0 = null;



        	enterRule();

        try {
            // InternalMDEProject.g:332:2: ( (otherlv_0= 'Delete' ( (lv_specification_1_0= ruleKeyword ) ) ) )
            // InternalMDEProject.g:333:2: (otherlv_0= 'Delete' ( (lv_specification_1_0= ruleKeyword ) ) )
            {
            // InternalMDEProject.g:333:2: (otherlv_0= 'Delete' ( (lv_specification_1_0= ruleKeyword ) ) )
            // InternalMDEProject.g:334:3: otherlv_0= 'Delete' ( (lv_specification_1_0= ruleKeyword ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDeleteKeyword_0());
            		
            // InternalMDEProject.g:338:3: ( (lv_specification_1_0= ruleKeyword ) )
            // InternalMDEProject.g:339:4: (lv_specification_1_0= ruleKeyword )
            {
            // InternalMDEProject.g:339:4: (lv_specification_1_0= ruleKeyword )
            // InternalMDEProject.g:340:5: lv_specification_1_0= ruleKeyword
            {

            					newCompositeNode(grammarAccess.getDeleteAccess().getSpecificationKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_specification_1_0=ruleKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteRule());
            					}
            					set(
            						current,
            						"specification",
            						lv_specification_1_0,
            						"org.xtext.example.mdeProject.MDEProject.Keyword");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleModify"
    // InternalMDEProject.g:361:1: entryRuleModify returns [EObject current=null] : iv_ruleModify= ruleModify EOF ;
    public final EObject entryRuleModify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModify = null;


        try {
            // InternalMDEProject.g:361:47: (iv_ruleModify= ruleModify EOF )
            // InternalMDEProject.g:362:2: iv_ruleModify= ruleModify EOF
            {
             newCompositeNode(grammarAccess.getModifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModify=ruleModify();

            state._fsp--;

             current =iv_ruleModify; 
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
    // $ANTLR end "entryRuleModify"


    // $ANTLR start "ruleModify"
    // InternalMDEProject.g:368:1: ruleModify returns [EObject current=null] : (otherlv_0= 'Modify' ( (lv_specification_1_0= ruleKeyword ) ) (otherlv_2= 'newValueName' ( (lv_newValueName_3_0= ruleEString ) ) )? (otherlv_4= 'newValueType' ( (lv_newValueType_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleModify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_specification_1_0 = null;

        AntlrDatatypeRuleToken lv_newValueName_3_0 = null;

        AntlrDatatypeRuleToken lv_newValueType_5_0 = null;



        	enterRule();

        try {
            // InternalMDEProject.g:374:2: ( (otherlv_0= 'Modify' ( (lv_specification_1_0= ruleKeyword ) ) (otherlv_2= 'newValueName' ( (lv_newValueName_3_0= ruleEString ) ) )? (otherlv_4= 'newValueType' ( (lv_newValueType_5_0= ruleEString ) ) )? ) )
            // InternalMDEProject.g:375:2: (otherlv_0= 'Modify' ( (lv_specification_1_0= ruleKeyword ) ) (otherlv_2= 'newValueName' ( (lv_newValueName_3_0= ruleEString ) ) )? (otherlv_4= 'newValueType' ( (lv_newValueType_5_0= ruleEString ) ) )? )
            {
            // InternalMDEProject.g:375:2: (otherlv_0= 'Modify' ( (lv_specification_1_0= ruleKeyword ) ) (otherlv_2= 'newValueName' ( (lv_newValueName_3_0= ruleEString ) ) )? (otherlv_4= 'newValueType' ( (lv_newValueType_5_0= ruleEString ) ) )? )
            // InternalMDEProject.g:376:3: otherlv_0= 'Modify' ( (lv_specification_1_0= ruleKeyword ) ) (otherlv_2= 'newValueName' ( (lv_newValueName_3_0= ruleEString ) ) )? (otherlv_4= 'newValueType' ( (lv_newValueType_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getModifyAccess().getModifyKeyword_0());
            		
            // InternalMDEProject.g:380:3: ( (lv_specification_1_0= ruleKeyword ) )
            // InternalMDEProject.g:381:4: (lv_specification_1_0= ruleKeyword )
            {
            // InternalMDEProject.g:381:4: (lv_specification_1_0= ruleKeyword )
            // InternalMDEProject.g:382:5: lv_specification_1_0= ruleKeyword
            {

            					newCompositeNode(grammarAccess.getModifyAccess().getSpecificationKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_specification_1_0=ruleKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifyRule());
            					}
            					set(
            						current,
            						"specification",
            						lv_specification_1_0,
            						"org.xtext.example.mdeProject.MDEProject.Keyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMDEProject.g:399:3: (otherlv_2= 'newValueName' ( (lv_newValueName_3_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMDEProject.g:400:4: otherlv_2= 'newValueName' ( (lv_newValueName_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getModifyAccess().getNewValueNameKeyword_2_0());
                    			
                    // InternalMDEProject.g:404:4: ( (lv_newValueName_3_0= ruleEString ) )
                    // InternalMDEProject.g:405:5: (lv_newValueName_3_0= ruleEString )
                    {
                    // InternalMDEProject.g:405:5: (lv_newValueName_3_0= ruleEString )
                    // InternalMDEProject.g:406:6: lv_newValueName_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getModifyAccess().getNewValueNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_newValueName_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModifyRule());
                    						}
                    						set(
                    							current,
                    							"newValueName",
                    							lv_newValueName_3_0,
                    							"org.xtext.example.mdeProject.MDEProject.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMDEProject.g:424:3: (otherlv_4= 'newValueType' ( (lv_newValueType_5_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMDEProject.g:425:4: otherlv_4= 'newValueType' ( (lv_newValueType_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getModifyAccess().getNewValueTypeKeyword_3_0());
                    			
                    // InternalMDEProject.g:429:4: ( (lv_newValueType_5_0= ruleEString ) )
                    // InternalMDEProject.g:430:5: (lv_newValueType_5_0= ruleEString )
                    {
                    // InternalMDEProject.g:430:5: (lv_newValueType_5_0= ruleEString )
                    // InternalMDEProject.g:431:6: lv_newValueType_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getModifyAccess().getNewValueTypeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_newValueType_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModifyRule());
                    						}
                    						set(
                    							current,
                    							"newValueType",
                    							lv_newValueType_5_0,
                    							"org.xtext.example.mdeProject.MDEProject.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleModify"


    // $ANTLR start "entryRuleEclass"
    // InternalMDEProject.g:453:1: entryRuleEclass returns [EObject current=null] : iv_ruleEclass= ruleEclass EOF ;
    public final EObject entryRuleEclass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclass = null;


        try {
            // InternalMDEProject.g:453:47: (iv_ruleEclass= ruleEclass EOF )
            // InternalMDEProject.g:454:2: iv_ruleEclass= ruleEclass EOF
            {
             newCompositeNode(grammarAccess.getEclassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEclass=ruleEclass();

            state._fsp--;

             current =iv_ruleEclass; 
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
    // $ANTLR end "entryRuleEclass"


    // $ANTLR start "ruleEclass"
    // InternalMDEProject.g:460:1: ruleEclass returns [EObject current=null] : ( () otherlv_1= 'Eclass' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= '[' (otherlv_6= 'relatedTo' ( (lv_relatedTo_7_0= ruleEString ) ) )? (otherlv_8= 'boundEclass' ( (lv_boundEclass_9_0= ruleEString ) ) )? (otherlv_10= 'boundRelatedTo' ( (lv_boundRelatedTo_11_0= ruleEString ) ) )? (otherlv_12= 'typeRelation' ( (lv_typeRelation_13_0= ruleEString ) ) )? otherlv_14= ']' )? (otherlv_15= '(' ( (lv_columns_16_0= ruleEattribute ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleEattribute ) ) )* otherlv_19= ')' )? ) ;
    public final EObject ruleEclass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_relatedTo_7_0 = null;

        AntlrDatatypeRuleToken lv_boundEclass_9_0 = null;

        AntlrDatatypeRuleToken lv_boundRelatedTo_11_0 = null;

        AntlrDatatypeRuleToken lv_typeRelation_13_0 = null;

        EObject lv_columns_16_0 = null;

        EObject lv_columns_18_0 = null;



        	enterRule();

        try {
            // InternalMDEProject.g:466:2: ( ( () otherlv_1= 'Eclass' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= '[' (otherlv_6= 'relatedTo' ( (lv_relatedTo_7_0= ruleEString ) ) )? (otherlv_8= 'boundEclass' ( (lv_boundEclass_9_0= ruleEString ) ) )? (otherlv_10= 'boundRelatedTo' ( (lv_boundRelatedTo_11_0= ruleEString ) ) )? (otherlv_12= 'typeRelation' ( (lv_typeRelation_13_0= ruleEString ) ) )? otherlv_14= ']' )? (otherlv_15= '(' ( (lv_columns_16_0= ruleEattribute ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleEattribute ) ) )* otherlv_19= ')' )? ) )
            // InternalMDEProject.g:467:2: ( () otherlv_1= 'Eclass' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= '[' (otherlv_6= 'relatedTo' ( (lv_relatedTo_7_0= ruleEString ) ) )? (otherlv_8= 'boundEclass' ( (lv_boundEclass_9_0= ruleEString ) ) )? (otherlv_10= 'boundRelatedTo' ( (lv_boundRelatedTo_11_0= ruleEString ) ) )? (otherlv_12= 'typeRelation' ( (lv_typeRelation_13_0= ruleEString ) ) )? otherlv_14= ']' )? (otherlv_15= '(' ( (lv_columns_16_0= ruleEattribute ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleEattribute ) ) )* otherlv_19= ')' )? )
            {
            // InternalMDEProject.g:467:2: ( () otherlv_1= 'Eclass' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= '[' (otherlv_6= 'relatedTo' ( (lv_relatedTo_7_0= ruleEString ) ) )? (otherlv_8= 'boundEclass' ( (lv_boundEclass_9_0= ruleEString ) ) )? (otherlv_10= 'boundRelatedTo' ( (lv_boundRelatedTo_11_0= ruleEString ) ) )? (otherlv_12= 'typeRelation' ( (lv_typeRelation_13_0= ruleEString ) ) )? otherlv_14= ']' )? (otherlv_15= '(' ( (lv_columns_16_0= ruleEattribute ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleEattribute ) ) )* otherlv_19= ')' )? )
            // InternalMDEProject.g:468:3: () otherlv_1= 'Eclass' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= '[' (otherlv_6= 'relatedTo' ( (lv_relatedTo_7_0= ruleEString ) ) )? (otherlv_8= 'boundEclass' ( (lv_boundEclass_9_0= ruleEString ) ) )? (otherlv_10= 'boundRelatedTo' ( (lv_boundRelatedTo_11_0= ruleEString ) ) )? (otherlv_12= 'typeRelation' ( (lv_typeRelation_13_0= ruleEString ) ) )? otherlv_14= ']' )? (otherlv_15= '(' ( (lv_columns_16_0= ruleEattribute ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleEattribute ) ) )* otherlv_19= ')' )?
            {
            // InternalMDEProject.g:468:3: ()
            // InternalMDEProject.g:469:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEclassAccess().getEclassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEclassAccess().getEclassKeyword_1());
            		
            // InternalMDEProject.g:479:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMDEProject.g:480:4: (lv_name_2_0= ruleEString )
            {
            // InternalMDEProject.g:480:4: (lv_name_2_0= ruleEString )
            // InternalMDEProject.g:481:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEclassAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEclassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mdeProject.MDEProject.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMDEProject.g:498:3: (otherlv_3= ':' ( (lv_type_4_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMDEProject.g:499:4: otherlv_3= ':' ( (lv_type_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEclassAccess().getColonKeyword_3_0());
                    			
                    // InternalMDEProject.g:503:4: ( (lv_type_4_0= ruleEString ) )
                    // InternalMDEProject.g:504:5: (lv_type_4_0= ruleEString )
                    {
                    // InternalMDEProject.g:504:5: (lv_type_4_0= ruleEString )
                    // InternalMDEProject.g:505:6: lv_type_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEclassAccess().getTypeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_type_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEclassRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.xtext.example.mdeProject.MDEProject.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMDEProject.g:523:3: (otherlv_5= '[' (otherlv_6= 'relatedTo' ( (lv_relatedTo_7_0= ruleEString ) ) )? (otherlv_8= 'boundEclass' ( (lv_boundEclass_9_0= ruleEString ) ) )? (otherlv_10= 'boundRelatedTo' ( (lv_boundRelatedTo_11_0= ruleEString ) ) )? (otherlv_12= 'typeRelation' ( (lv_typeRelation_13_0= ruleEString ) ) )? otherlv_14= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMDEProject.g:524:4: otherlv_5= '[' (otherlv_6= 'relatedTo' ( (lv_relatedTo_7_0= ruleEString ) ) )? (otherlv_8= 'boundEclass' ( (lv_boundEclass_9_0= ruleEString ) ) )? (otherlv_10= 'boundRelatedTo' ( (lv_boundRelatedTo_11_0= ruleEString ) ) )? (otherlv_12= 'typeRelation' ( (lv_typeRelation_13_0= ruleEString ) ) )? otherlv_14= ']'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getEclassAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalMDEProject.g:528:4: (otherlv_6= 'relatedTo' ( (lv_relatedTo_7_0= ruleEString ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==24) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMDEProject.g:529:5: otherlv_6= 'relatedTo' ( (lv_relatedTo_7_0= ruleEString ) )
                            {
                            otherlv_6=(Token)match(input,24,FOLLOW_3); 

                            					newLeafNode(otherlv_6, grammarAccess.getEclassAccess().getRelatedToKeyword_4_1_0());
                            				
                            // InternalMDEProject.g:533:5: ( (lv_relatedTo_7_0= ruleEString ) )
                            // InternalMDEProject.g:534:6: (lv_relatedTo_7_0= ruleEString )
                            {
                            // InternalMDEProject.g:534:6: (lv_relatedTo_7_0= ruleEString )
                            // InternalMDEProject.g:535:7: lv_relatedTo_7_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getEclassAccess().getRelatedToEStringParserRuleCall_4_1_1_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_relatedTo_7_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEclassRule());
                            							}
                            							set(
                            								current,
                            								"relatedTo",
                            								lv_relatedTo_7_0,
                            								"org.xtext.example.mdeProject.MDEProject.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalMDEProject.g:553:4: (otherlv_8= 'boundEclass' ( (lv_boundEclass_9_0= ruleEString ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==25) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMDEProject.g:554:5: otherlv_8= 'boundEclass' ( (lv_boundEclass_9_0= ruleEString ) )
                            {
                            otherlv_8=(Token)match(input,25,FOLLOW_3); 

                            					newLeafNode(otherlv_8, grammarAccess.getEclassAccess().getBoundEclassKeyword_4_2_0());
                            				
                            // InternalMDEProject.g:558:5: ( (lv_boundEclass_9_0= ruleEString ) )
                            // InternalMDEProject.g:559:6: (lv_boundEclass_9_0= ruleEString )
                            {
                            // InternalMDEProject.g:559:6: (lv_boundEclass_9_0= ruleEString )
                            // InternalMDEProject.g:560:7: lv_boundEclass_9_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getEclassAccess().getBoundEclassEStringParserRuleCall_4_2_1_0());
                            						
                            pushFollow(FOLLOW_15);
                            lv_boundEclass_9_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEclassRule());
                            							}
                            							set(
                            								current,
                            								"boundEclass",
                            								lv_boundEclass_9_0,
                            								"org.xtext.example.mdeProject.MDEProject.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalMDEProject.g:578:4: (otherlv_10= 'boundRelatedTo' ( (lv_boundRelatedTo_11_0= ruleEString ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==26) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMDEProject.g:579:5: otherlv_10= 'boundRelatedTo' ( (lv_boundRelatedTo_11_0= ruleEString ) )
                            {
                            otherlv_10=(Token)match(input,26,FOLLOW_3); 

                            					newLeafNode(otherlv_10, grammarAccess.getEclassAccess().getBoundRelatedToKeyword_4_3_0());
                            				
                            // InternalMDEProject.g:583:5: ( (lv_boundRelatedTo_11_0= ruleEString ) )
                            // InternalMDEProject.g:584:6: (lv_boundRelatedTo_11_0= ruleEString )
                            {
                            // InternalMDEProject.g:584:6: (lv_boundRelatedTo_11_0= ruleEString )
                            // InternalMDEProject.g:585:7: lv_boundRelatedTo_11_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getEclassAccess().getBoundRelatedToEStringParserRuleCall_4_3_1_0());
                            						
                            pushFollow(FOLLOW_16);
                            lv_boundRelatedTo_11_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEclassRule());
                            							}
                            							set(
                            								current,
                            								"boundRelatedTo",
                            								lv_boundRelatedTo_11_0,
                            								"org.xtext.example.mdeProject.MDEProject.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalMDEProject.g:603:4: (otherlv_12= 'typeRelation' ( (lv_typeRelation_13_0= ruleEString ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==27) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMDEProject.g:604:5: otherlv_12= 'typeRelation' ( (lv_typeRelation_13_0= ruleEString ) )
                            {
                            otherlv_12=(Token)match(input,27,FOLLOW_3); 

                            					newLeafNode(otherlv_12, grammarAccess.getEclassAccess().getTypeRelationKeyword_4_4_0());
                            				
                            // InternalMDEProject.g:608:5: ( (lv_typeRelation_13_0= ruleEString ) )
                            // InternalMDEProject.g:609:6: (lv_typeRelation_13_0= ruleEString )
                            {
                            // InternalMDEProject.g:609:6: (lv_typeRelation_13_0= ruleEString )
                            // InternalMDEProject.g:610:7: lv_typeRelation_13_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getEclassAccess().getTypeRelationEStringParserRuleCall_4_4_1_0());
                            						
                            pushFollow(FOLLOW_17);
                            lv_typeRelation_13_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEclassRule());
                            							}
                            							set(
                            								current,
                            								"typeRelation",
                            								lv_typeRelation_13_0,
                            								"org.xtext.example.mdeProject.MDEProject.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_14, grammarAccess.getEclassAccess().getRightSquareBracketKeyword_4_5());
                    			

                    }
                    break;

            }

            // InternalMDEProject.g:633:3: (otherlv_15= '(' ( (lv_columns_16_0= ruleEattribute ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleEattribute ) ) )* otherlv_19= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMDEProject.g:634:4: otherlv_15= '(' ( (lv_columns_16_0= ruleEattribute ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleEattribute ) ) )* otherlv_19= ')'
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getEclassAccess().getLeftParenthesisKeyword_5_0());
                    			
                    // InternalMDEProject.g:638:4: ( (lv_columns_16_0= ruleEattribute ) )
                    // InternalMDEProject.g:639:5: (lv_columns_16_0= ruleEattribute )
                    {
                    // InternalMDEProject.g:639:5: (lv_columns_16_0= ruleEattribute )
                    // InternalMDEProject.g:640:6: lv_columns_16_0= ruleEattribute
                    {

                    						newCompositeNode(grammarAccess.getEclassAccess().getColumnsEattributeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_columns_16_0=ruleEattribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEclassRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_16_0,
                    							"org.xtext.example.mdeProject.MDEProject.Eattribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMDEProject.g:657:4: (otherlv_17= ',' ( (lv_columns_18_0= ruleEattribute ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==30) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMDEProject.g:658:5: otherlv_17= ',' ( (lv_columns_18_0= ruleEattribute ) )
                    	    {
                    	    otherlv_17=(Token)match(input,30,FOLLOW_8); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEclassAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMDEProject.g:662:5: ( (lv_columns_18_0= ruleEattribute ) )
                    	    // InternalMDEProject.g:663:6: (lv_columns_18_0= ruleEattribute )
                    	    {
                    	    // InternalMDEProject.g:663:6: (lv_columns_18_0= ruleEattribute )
                    	    // InternalMDEProject.g:664:7: lv_columns_18_0= ruleEattribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getEclassAccess().getColumnsEattributeParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_columns_18_0=ruleEattribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEclassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columns",
                    	    								lv_columns_18_0,
                    	    								"org.xtext.example.mdeProject.MDEProject.Eattribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getEclassAccess().getRightParenthesisKeyword_5_3());
                    			

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
    // $ANTLR end "ruleEclass"


    // $ANTLR start "entryRuleEattribute"
    // InternalMDEProject.g:691:1: entryRuleEattribute returns [EObject current=null] : iv_ruleEattribute= ruleEattribute EOF ;
    public final EObject entryRuleEattribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEattribute = null;


        try {
            // InternalMDEProject.g:691:51: (iv_ruleEattribute= ruleEattribute EOF )
            // InternalMDEProject.g:692:2: iv_ruleEattribute= ruleEattribute EOF
            {
             newCompositeNode(grammarAccess.getEattributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEattribute=ruleEattribute();

            state._fsp--;

             current =iv_ruleEattribute; 
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
    // $ANTLR end "entryRuleEattribute"


    // $ANTLR start "ruleEattribute"
    // InternalMDEProject.g:698:1: ruleEattribute returns [EObject current=null] : ( () otherlv_1= 'Eattribute' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'from' ( (lv_from_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )? ) ;
    public final EObject ruleEattribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_from_4_0 = null;

        AntlrDatatypeRuleToken lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalMDEProject.g:704:2: ( ( () otherlv_1= 'Eattribute' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'from' ( (lv_from_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )? ) )
            // InternalMDEProject.g:705:2: ( () otherlv_1= 'Eattribute' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'from' ( (lv_from_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )? )
            {
            // InternalMDEProject.g:705:2: ( () otherlv_1= 'Eattribute' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'from' ( (lv_from_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )? )
            // InternalMDEProject.g:706:3: () otherlv_1= 'Eattribute' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'from' ( (lv_from_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )?
            {
            // InternalMDEProject.g:706:3: ()
            // InternalMDEProject.g:707:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEattributeAccess().getEattributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEattributeAccess().getEattributeKeyword_1());
            		
            // InternalMDEProject.g:717:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMDEProject.g:718:4: (lv_name_2_0= ruleEString )
            {
            // InternalMDEProject.g:718:4: (lv_name_2_0= ruleEString )
            // InternalMDEProject.g:719:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEattributeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEattributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mdeProject.MDEProject.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMDEProject.g:736:3: (otherlv_3= 'from' ( (lv_from_4_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMDEProject.g:737:4: otherlv_3= 'from' ( (lv_from_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEattributeAccess().getFromKeyword_3_0());
                    			
                    // InternalMDEProject.g:741:4: ( (lv_from_4_0= ruleEString ) )
                    // InternalMDEProject.g:742:5: (lv_from_4_0= ruleEString )
                    {
                    // InternalMDEProject.g:742:5: (lv_from_4_0= ruleEString )
                    // InternalMDEProject.g:743:6: lv_from_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEattributeAccess().getFromEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_from_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEattributeRule());
                    						}
                    						set(
                    							current,
                    							"from",
                    							lv_from_4_0,
                    							"org.xtext.example.mdeProject.MDEProject.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMDEProject.g:761:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMDEProject.g:762:4: otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEattributeAccess().getTypeKeyword_4_0());
                    			
                    // InternalMDEProject.g:766:4: ( (lv_type_6_0= ruleEString ) )
                    // InternalMDEProject.g:767:5: (lv_type_6_0= ruleEString )
                    {
                    // InternalMDEProject.g:767:5: (lv_type_6_0= ruleEString )
                    // InternalMDEProject.g:768:6: lv_type_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEattributeAccess().getTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEattributeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.xtext.example.mdeProject.MDEProject.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleEattribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020C00002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000002L});

}