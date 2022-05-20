package xtext.factoryLang.shortDSL.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.factoryLang.shortDSL.services.ShortDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShortDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "In_progress", "Complete", "Devices", "Foreach", "Logging", "Handle", "Pickup", "Empty", "Green", "Short", "Blue", "Drop", "Free", "Full", "Long", "Scan", "Test", "HyphenMinusHyphenMinusGreaterThanSign", "Dev", "Dsl", "Red", "Use", "Var", "ExclamationMarkEqualsSign", "HyphenMinusGreaterThanSign", "If", "LeftParenthesis", "RightParenthesis", "Comma", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "H", "M", "S", "LeftCurlyBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_BEGIN=42;
    public static final int Var=26;
    public static final int Devices=6;
    public static final int Full=17;
    public static final int LessThanSign=34;
    public static final int LeftParenthesis=30;
    public static final int Test=20;
    public static final int In_progress=4;
    public static final int Dsl=23;
    public static final int Short=13;
    public static final int Logging=8;
    public static final int GreaterThanSign=36;
    public static final int RULE_ID=44;
    public static final int RightParenthesis=31;
    public static final int Free=16;
    public static final int Handle=9;
    public static final int Drop=15;
    public static final int RULE_INT=45;
    public static final int Long=18;
    public static final int RULE_ML_COMMENT=47;
    public static final int Scan=19;
    public static final int If=29;
    public static final int RULE_END=43;
    public static final int Complete=5;
    public static final int H=37;
    public static final int RULE_STRING=46;
    public static final int M=38;
    public static final int RULE_SL_COMMENT=48;
    public static final int Comma=32;
    public static final int EqualsSign=35;
    public static final int Empty=11;
    public static final int S=39;
    public static final int Colon=33;
    public static final int RightCurlyBracket=41;
    public static final int EOF=-1;
    public static final int Pickup=10;
    public static final int Blue=14;
    public static final int RULE_WS=49;
    public static final int Use=25;
    public static final int LeftCurlyBracket=40;
    public static final int RULE_ANY_OTHER=50;
    public static final int Red=24;
    public static final int Dev=22;
    public static final int HyphenMinusHyphenMinusGreaterThanSign=21;
    public static final int Foreach=7;
    public static final int ExclamationMarkEqualsSign=27;
    public static final int HyphenMinusGreaterThanSign=28;
    public static final int Green=12;

    // delegates
    // delegators


        public InternalShortDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalShortDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalShortDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalShortDSLParser.g"; }



     	private ShortDSLGrammarAccess grammarAccess;

        public InternalShortDSLParser(TokenStream input, ShortDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ShortDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalShortDSLParser.g:58:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalShortDSLParser.g:58:46: (iv_ruleModel= ruleModel EOF )
            // InternalShortDSLParser.g:59:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalShortDSLParser.g:65:1: ruleModel returns [EObject current=null] : (otherlv_0= Use ( (lv_dslType_1_0= ruleDSLTypeValue ) ) otherlv_2= Dsl ( (lv_dslProgram_3_0= ruleDSLProgram ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dslType_1_0 = null;

        EObject lv_dslProgram_3_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:71:2: ( (otherlv_0= Use ( (lv_dslType_1_0= ruleDSLTypeValue ) ) otherlv_2= Dsl ( (lv_dslProgram_3_0= ruleDSLProgram ) ) ) )
            // InternalShortDSLParser.g:72:2: (otherlv_0= Use ( (lv_dslType_1_0= ruleDSLTypeValue ) ) otherlv_2= Dsl ( (lv_dslProgram_3_0= ruleDSLProgram ) ) )
            {
            // InternalShortDSLParser.g:72:2: (otherlv_0= Use ( (lv_dslType_1_0= ruleDSLTypeValue ) ) otherlv_2= Dsl ( (lv_dslProgram_3_0= ruleDSLProgram ) ) )
            // InternalShortDSLParser.g:73:3: otherlv_0= Use ( (lv_dslType_1_0= ruleDSLTypeValue ) ) otherlv_2= Dsl ( (lv_dslProgram_3_0= ruleDSLProgram ) )
            {
            otherlv_0=(Token)match(input,Use,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getUseKeyword_0());
            		
            // InternalShortDSLParser.g:77:3: ( (lv_dslType_1_0= ruleDSLTypeValue ) )
            // InternalShortDSLParser.g:78:4: (lv_dslType_1_0= ruleDSLTypeValue )
            {
            // InternalShortDSLParser.g:78:4: (lv_dslType_1_0= ruleDSLTypeValue )
            // InternalShortDSLParser.g:79:5: lv_dslType_1_0= ruleDSLTypeValue
            {

            					newCompositeNode(grammarAccess.getModelAccess().getDslTypeDSLTypeValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_dslType_1_0=ruleDSLTypeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"dslType",
            						lv_dslType_1_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.DSLTypeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Dsl,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getDslKeyword_2());
            		
            // InternalShortDSLParser.g:100:3: ( (lv_dslProgram_3_0= ruleDSLProgram ) )
            // InternalShortDSLParser.g:101:4: (lv_dslProgram_3_0= ruleDSLProgram )
            {
            // InternalShortDSLParser.g:101:4: (lv_dslProgram_3_0= ruleDSLProgram )
            // InternalShortDSLParser.g:102:5: lv_dslProgram_3_0= ruleDSLProgram
            {

            					newCompositeNode(grammarAccess.getModelAccess().getDslProgramDSLProgramParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_dslProgram_3_0=ruleDSLProgram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"dslProgram",
            						lv_dslProgram_3_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.DSLProgram");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDSLProgram"
    // InternalShortDSLParser.g:123:1: entryRuleDSLProgram returns [EObject current=null] : iv_ruleDSLProgram= ruleDSLProgram EOF ;
    public final EObject entryRuleDSLProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLProgram = null;


        try {
            // InternalShortDSLParser.g:123:51: (iv_ruleDSLProgram= ruleDSLProgram EOF )
            // InternalShortDSLParser.g:124:2: iv_ruleDSLProgram= ruleDSLProgram EOF
            {
             newCompositeNode(grammarAccess.getDSLProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLProgram=ruleDSLProgram();

            state._fsp--;

             current =iv_ruleDSLProgram; 
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
    // $ANTLR end "entryRuleDSLProgram"


    // $ANTLR start "ruleDSLProgram"
    // InternalShortDSLParser.g:130:1: ruleDSLProgram returns [EObject current=null] : (this_DSLLong_0= ruleDSLLong | this_DSLShort_1= ruleDSLShort ) ;
    public final EObject ruleDSLProgram() throws RecognitionException {
        EObject current = null;

        EObject this_DSLLong_0 = null;

        EObject this_DSLShort_1 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:136:2: ( (this_DSLLong_0= ruleDSLLong | this_DSLShort_1= ruleDSLShort ) )
            // InternalShortDSLParser.g:137:2: (this_DSLLong_0= ruleDSLLong | this_DSLShort_1= ruleDSLShort )
            {
            // InternalShortDSLParser.g:137:2: (this_DSLLong_0= ruleDSLLong | this_DSLShort_1= ruleDSLShort )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Test) ) {
                alt1=1;
            }
            else if ( (LA1_0==Devices) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalShortDSLParser.g:138:3: this_DSLLong_0= ruleDSLLong
                    {

                    			newCompositeNode(grammarAccess.getDSLProgramAccess().getDSLLongParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLLong_0=ruleDSLLong();

                    state._fsp--;


                    			current = this_DSLLong_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:147:3: this_DSLShort_1= ruleDSLShort
                    {

                    			newCompositeNode(grammarAccess.getDSLProgramAccess().getDSLShortParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLShort_1=ruleDSLShort();

                    state._fsp--;


                    			current = this_DSLShort_1;
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
    // $ANTLR end "ruleDSLProgram"


    // $ANTLR start "entryRuleDSLLong"
    // InternalShortDSLParser.g:159:1: entryRuleDSLLong returns [EObject current=null] : iv_ruleDSLLong= ruleDSLLong EOF ;
    public final EObject entryRuleDSLLong() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLLong = null;


        try {
            // InternalShortDSLParser.g:159:48: (iv_ruleDSLLong= ruleDSLLong EOF )
            // InternalShortDSLParser.g:160:2: iv_ruleDSLLong= ruleDSLLong EOF
            {
             newCompositeNode(grammarAccess.getDSLLongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLLong=ruleDSLLong();

            state._fsp--;

             current =iv_ruleDSLLong; 
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
    // $ANTLR end "entryRuleDSLLong"


    // $ANTLR start "ruleDSLLong"
    // InternalShortDSLParser.g:166:1: ruleDSLLong returns [EObject current=null] : ( () otherlv_1= Test ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDSLLong() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:172:2: ( ( () otherlv_1= Test ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:173:2: ( () otherlv_1= Test ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:173:2: ( () otherlv_1= Test ( (lv_name_2_0= RULE_ID ) ) )
            // InternalShortDSLParser.g:174:3: () otherlv_1= Test ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalShortDSLParser.g:174:3: ()
            // InternalShortDSLParser.g:175:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDSLLongAccess().getDSLLongAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Test,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDSLLongAccess().getTestKeyword_1());
            		
            // InternalShortDSLParser.g:185:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalShortDSLParser.g:186:4: (lv_name_2_0= RULE_ID )
            {
            // InternalShortDSLParser.g:186:4: (lv_name_2_0= RULE_ID )
            // InternalShortDSLParser.g:187:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDSLLongAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLLongRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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
    // $ANTLR end "ruleDSLLong"


    // $ANTLR start "entryRuleDSLShort"
    // InternalShortDSLParser.g:207:1: entryRuleDSLShort returns [EObject current=null] : iv_ruleDSLShort= ruleDSLShort EOF ;
    public final EObject entryRuleDSLShort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLShort = null;


        try {
            // InternalShortDSLParser.g:207:49: (iv_ruleDSLShort= ruleDSLShort EOF )
            // InternalShortDSLParser.g:208:2: iv_ruleDSLShort= ruleDSLShort EOF
            {
             newCompositeNode(grammarAccess.getDSLShortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLShort=ruleDSLShort();

            state._fsp--;

             current =iv_ruleDSLShort; 
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
    // $ANTLR end "entryRuleDSLShort"


    // $ANTLR start "ruleDSLShort"
    // InternalShortDSLParser.g:214:1: ruleDSLShort returns [EObject current=null] : ( () ( (lv_configuration_1_0= ruleConfigurationS ) ) ( (lv_diskHandlings_2_0= ruleDiskHandlingS ) )* ) ;
    public final EObject ruleDSLShort() throws RecognitionException {
        EObject current = null;

        EObject lv_configuration_1_0 = null;

        EObject lv_diskHandlings_2_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:220:2: ( ( () ( (lv_configuration_1_0= ruleConfigurationS ) ) ( (lv_diskHandlings_2_0= ruleDiskHandlingS ) )* ) )
            // InternalShortDSLParser.g:221:2: ( () ( (lv_configuration_1_0= ruleConfigurationS ) ) ( (lv_diskHandlings_2_0= ruleDiskHandlingS ) )* )
            {
            // InternalShortDSLParser.g:221:2: ( () ( (lv_configuration_1_0= ruleConfigurationS ) ) ( (lv_diskHandlings_2_0= ruleDiskHandlingS ) )* )
            // InternalShortDSLParser.g:222:3: () ( (lv_configuration_1_0= ruleConfigurationS ) ) ( (lv_diskHandlings_2_0= ruleDiskHandlingS ) )*
            {
            // InternalShortDSLParser.g:222:3: ()
            // InternalShortDSLParser.g:223:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDSLShortAccess().getDSLShortAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:229:3: ( (lv_configuration_1_0= ruleConfigurationS ) )
            // InternalShortDSLParser.g:230:4: (lv_configuration_1_0= ruleConfigurationS )
            {
            // InternalShortDSLParser.g:230:4: (lv_configuration_1_0= ruleConfigurationS )
            // InternalShortDSLParser.g:231:5: lv_configuration_1_0= ruleConfigurationS
            {

            					newCompositeNode(grammarAccess.getDSLShortAccess().getConfigurationConfigurationSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_configuration_1_0=ruleConfigurationS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDSLShortRule());
            					}
            					set(
            						current,
            						"configuration",
            						lv_configuration_1_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.ConfigurationS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:248:3: ( (lv_diskHandlings_2_0= ruleDiskHandlingS ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Handle) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalShortDSLParser.g:249:4: (lv_diskHandlings_2_0= ruleDiskHandlingS )
            	    {
            	    // InternalShortDSLParser.g:249:4: (lv_diskHandlings_2_0= ruleDiskHandlingS )
            	    // InternalShortDSLParser.g:250:5: lv_diskHandlings_2_0= ruleDiskHandlingS
            	    {

            	    					newCompositeNode(grammarAccess.getDSLShortAccess().getDiskHandlingsDiskHandlingSParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_diskHandlings_2_0=ruleDiskHandlingS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDSLShortRule());
            	    					}
            	    					add(
            	    						current,
            	    						"diskHandlings",
            	    						lv_diskHandlings_2_0,
            	    						"xtext.factoryLang.shortDSL.ShortDSL.DiskHandlingS");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleDSLShort"


    // $ANTLR start "entryRuleConfigurationS"
    // InternalShortDSLParser.g:271:1: entryRuleConfigurationS returns [EObject current=null] : iv_ruleConfigurationS= ruleConfigurationS EOF ;
    public final EObject entryRuleConfigurationS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationS = null;


        try {
            // InternalShortDSLParser.g:271:55: (iv_ruleConfigurationS= ruleConfigurationS EOF )
            // InternalShortDSLParser.g:272:2: iv_ruleConfigurationS= ruleConfigurationS EOF
            {
             newCompositeNode(grammarAccess.getConfigurationSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationS=ruleConfigurationS();

            state._fsp--;

             current =iv_ruleConfigurationS; 
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
    // $ANTLR end "entryRuleConfigurationS"


    // $ANTLR start "ruleConfigurationS"
    // InternalShortDSLParser.g:278:1: ruleConfigurationS returns [EObject current=null] : (otherlv_0= Devices otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_devices_3_0= ruleDeviceS ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleConfigurationS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        Token otherlv_5=null;
        EObject lv_devices_3_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:284:2: ( (otherlv_0= Devices otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_devices_3_0= ruleDeviceS ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket ) )
            // InternalShortDSLParser.g:285:2: (otherlv_0= Devices otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_devices_3_0= ruleDeviceS ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket )
            {
            // InternalShortDSLParser.g:285:2: (otherlv_0= Devices otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_devices_3_0= ruleDeviceS ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket )
            // InternalShortDSLParser.g:286:3: otherlv_0= Devices otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_devices_3_0= ruleDeviceS ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Devices,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationSAccess().getDevicesKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationSAccess().getLeftCurlyBracketKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getConfigurationSAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalShortDSLParser.g:298:3: ( (lv_devices_3_0= ruleDeviceS ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalShortDSLParser.g:299:4: (lv_devices_3_0= ruleDeviceS )
            	    {
            	    // InternalShortDSLParser.g:299:4: (lv_devices_3_0= ruleDeviceS )
            	    // InternalShortDSLParser.g:300:5: lv_devices_3_0= ruleDeviceS
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationSAccess().getDevicesDeviceSParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_devices_3_0=ruleDeviceS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigurationSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"devices",
            	    						lv_devices_3_0,
            	    						"xtext.factoryLang.shortDSL.ShortDSL.DeviceS");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            this_END_4=(Token)match(input,RULE_END,FOLLOW_11); 

            			newLeafNode(this_END_4, grammarAccess.getConfigurationSAccess().getENDTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getConfigurationSAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleConfigurationS"


    // $ANTLR start "entryRuleDeviceS"
    // InternalShortDSLParser.g:329:1: entryRuleDeviceS returns [EObject current=null] : iv_ruleDeviceS= ruleDeviceS EOF ;
    public final EObject entryRuleDeviceS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceS = null;


        try {
            // InternalShortDSLParser.g:329:48: (iv_ruleDeviceS= ruleDeviceS EOF )
            // InternalShortDSLParser.g:330:2: iv_ruleDeviceS= ruleDeviceS EOF
            {
             newCompositeNode(grammarAccess.getDeviceSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceS=ruleDeviceS();

            state._fsp--;

             current =iv_ruleDeviceS; 
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
    // $ANTLR end "entryRuleDeviceS"


    // $ANTLR start "ruleDeviceS"
    // InternalShortDSLParser.g:336:1: ruleDeviceS returns [EObject current=null] : (this_CraneS_0= ruleCraneS | this_DiskS_1= ruleDiskS | this_CameraS_2= ruleCameraS ) ;
    public final EObject ruleDeviceS() throws RecognitionException {
        EObject current = null;

        EObject this_CraneS_0 = null;

        EObject this_DiskS_1 = null;

        EObject this_CameraS_2 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:342:2: ( (this_CraneS_0= ruleCraneS | this_DiskS_1= ruleDiskS | this_CameraS_2= ruleCameraS ) )
            // InternalShortDSLParser.g:343:2: (this_CraneS_0= ruleCraneS | this_DiskS_1= ruleDiskS | this_CameraS_2= ruleCameraS )
            {
            // InternalShortDSLParser.g:343:2: (this_CraneS_0= ruleCraneS | this_DiskS_1= ruleDiskS | this_CameraS_2= ruleCameraS )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case Logging:
                    {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==Colon) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==RULE_BEGIN) ) {
                            int LA4_5 = input.LA(5);

                            if ( (LA4_5==RULE_ID) ) {
                                alt4=1;
                            }
                            else if ( (LA4_5==Green||LA4_5==Blue||LA4_5==Red) ) {
                                alt4=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case Colon:
                    {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==RULE_BEGIN) ) {
                        int LA4_5 = input.LA(4);

                        if ( (LA4_5==RULE_ID) ) {
                            alt4=1;
                        }
                        else if ( (LA4_5==Green||LA4_5==Blue||LA4_5==Red) ) {
                            alt4=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case LeftParenthesis:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalShortDSLParser.g:344:3: this_CraneS_0= ruleCraneS
                    {

                    			newCompositeNode(grammarAccess.getDeviceSAccess().getCraneSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CraneS_0=ruleCraneS();

                    state._fsp--;


                    			current = this_CraneS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:353:3: this_DiskS_1= ruleDiskS
                    {

                    			newCompositeNode(grammarAccess.getDeviceSAccess().getDiskSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiskS_1=ruleDiskS();

                    state._fsp--;


                    			current = this_DiskS_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:362:3: this_CameraS_2= ruleCameraS
                    {

                    			newCompositeNode(grammarAccess.getDeviceSAccess().getCameraSParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CameraS_2=ruleCameraS();

                    state._fsp--;


                    			current = this_CameraS_2;
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
    // $ANTLR end "ruleDeviceS"


    // $ANTLR start "entryRuleCraneS"
    // InternalShortDSLParser.g:374:1: entryRuleCraneS returns [EObject current=null] : iv_ruleCraneS= ruleCraneS EOF ;
    public final EObject entryRuleCraneS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCraneS = null;


        try {
            // InternalShortDSLParser.g:374:47: (iv_ruleCraneS= ruleCraneS EOF )
            // InternalShortDSLParser.g:375:2: iv_ruleCraneS= ruleCraneS EOF
            {
             newCompositeNode(grammarAccess.getCraneSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCraneS=ruleCraneS();

            state._fsp--;

             current =iv_ruleCraneS; 
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
    // $ANTLR end "entryRuleCraneS"


    // $ANTLR start "ruleCraneS"
    // InternalShortDSLParser.g:381:1: ruleCraneS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_logging_2_0= ruleLoggingS ) )? otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCraneZoneS ) )+ this_END_6= RULE_END ) ;
    public final EObject ruleCraneS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        EObject lv_logging_2_0 = null;

        EObject lv_targets_5_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:387:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_logging_2_0= ruleLoggingS ) )? otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCraneZoneS ) )+ this_END_6= RULE_END ) )
            // InternalShortDSLParser.g:388:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_logging_2_0= ruleLoggingS ) )? otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCraneZoneS ) )+ this_END_6= RULE_END )
            {
            // InternalShortDSLParser.g:388:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_logging_2_0= ruleLoggingS ) )? otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCraneZoneS ) )+ this_END_6= RULE_END )
            // InternalShortDSLParser.g:389:3: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_logging_2_0= ruleLoggingS ) )? otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCraneZoneS ) )+ this_END_6= RULE_END
            {
            // InternalShortDSLParser.g:389:3: ()
            // InternalShortDSLParser.g:390:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCraneSAccess().getCraneAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:396:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:397:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:397:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:398:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCraneSAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCraneSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalShortDSLParser.g:414:3: ( (lv_logging_2_0= ruleLoggingS ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Logging) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalShortDSLParser.g:415:4: (lv_logging_2_0= ruleLoggingS )
                    {
                    // InternalShortDSLParser.g:415:4: (lv_logging_2_0= ruleLoggingS )
                    // InternalShortDSLParser.g:416:5: lv_logging_2_0= ruleLoggingS
                    {

                    					newCompositeNode(grammarAccess.getCraneSAccess().getLoggingLoggingSParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_logging_2_0=ruleLoggingS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCraneSRule());
                    					}
                    					set(
                    						current,
                    						"logging",
                    						lv_logging_2_0,
                    						"xtext.factoryLang.shortDSL.ShortDSL.LoggingS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,Colon,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getCraneSAccess().getColonKeyword_3());
            		
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getCraneSAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalShortDSLParser.g:441:3: ( (lv_targets_5_0= ruleCraneZoneS ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalShortDSLParser.g:442:4: (lv_targets_5_0= ruleCraneZoneS )
            	    {
            	    // InternalShortDSLParser.g:442:4: (lv_targets_5_0= ruleCraneZoneS )
            	    // InternalShortDSLParser.g:443:5: lv_targets_5_0= ruleCraneZoneS
            	    {

            	    					newCompositeNode(grammarAccess.getCraneSAccess().getTargetsCraneZoneSParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_targets_5_0=ruleCraneZoneS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCraneSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"targets",
            	    						lv_targets_5_0,
            	    						"xtext.factoryLang.shortDSL.ShortDSL.CraneZoneS");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getCraneSAccess().getENDTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleCraneS"


    // $ANTLR start "entryRuleCraneZoneS"
    // InternalShortDSLParser.g:468:1: entryRuleCraneZoneS returns [EObject current=null] : iv_ruleCraneZoneS= ruleCraneZoneS EOF ;
    public final EObject entryRuleCraneZoneS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCraneZoneS = null;


        try {
            // InternalShortDSLParser.g:468:51: (iv_ruleCraneZoneS= ruleCraneZoneS EOF )
            // InternalShortDSLParser.g:469:2: iv_ruleCraneZoneS= ruleCraneZoneS EOF
            {
             newCompositeNode(grammarAccess.getCraneZoneSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCraneZoneS=ruleCraneZoneS();

            state._fsp--;

             current =iv_ruleCraneZoneS; 
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
    // $ANTLR end "entryRuleCraneZoneS"


    // $ANTLR start "ruleCraneZoneS"
    // InternalShortDSLParser.g:475:1: ruleCraneZoneS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_zoneValue_3_0= RULE_INT ) ) (otherlv_4= Comma )? ) ;
    public final EObject ruleCraneZoneS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_zoneValue_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:481:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_zoneValue_3_0= RULE_INT ) ) (otherlv_4= Comma )? ) )
            // InternalShortDSLParser.g:482:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_zoneValue_3_0= RULE_INT ) ) (otherlv_4= Comma )? )
            {
            // InternalShortDSLParser.g:482:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_zoneValue_3_0= RULE_INT ) ) (otherlv_4= Comma )? )
            // InternalShortDSLParser.g:483:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_zoneValue_3_0= RULE_INT ) ) (otherlv_4= Comma )?
            {
            // InternalShortDSLParser.g:483:3: ()
            // InternalShortDSLParser.g:484:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCraneZoneSAccess().getCraneZoneAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:490:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:491:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:491:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:492:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCraneZoneSAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCraneZoneSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCraneZoneSAccess().getColonKeyword_2());
            		
            // InternalShortDSLParser.g:512:3: ( (lv_zoneValue_3_0= RULE_INT ) )
            // InternalShortDSLParser.g:513:4: (lv_zoneValue_3_0= RULE_INT )
            {
            // InternalShortDSLParser.g:513:4: (lv_zoneValue_3_0= RULE_INT )
            // InternalShortDSLParser.g:514:5: lv_zoneValue_3_0= RULE_INT
            {
            lv_zoneValue_3_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_zoneValue_3_0, grammarAccess.getCraneZoneSAccess().getZoneValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCraneZoneSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"zoneValue",
            						lv_zoneValue_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalShortDSLParser.g:530:3: (otherlv_4= Comma )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Comma) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalShortDSLParser.g:531:4: otherlv_4= Comma
                    {
                    otherlv_4=(Token)match(input,Comma,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getCraneZoneSAccess().getCommaKeyword_4());
                    			

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
    // $ANTLR end "ruleCraneZoneS"


    // $ANTLR start "entryRuleDiskS"
    // InternalShortDSLParser.g:540:1: entryRuleDiskS returns [EObject current=null] : iv_ruleDiskS= ruleDiskS EOF ;
    public final EObject entryRuleDiskS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskS = null;


        try {
            // InternalShortDSLParser.g:540:46: (iv_ruleDiskS= ruleDiskS EOF )
            // InternalShortDSLParser.g:541:2: iv_ruleDiskS= ruleDiskS EOF
            {
             newCompositeNode(grammarAccess.getDiskSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskS=ruleDiskS();

            state._fsp--;

             current =iv_ruleDiskS; 
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
    // $ANTLR end "entryRuleDiskS"


    // $ANTLR start "ruleDiskS"
    // InternalShortDSLParser.g:547:1: ruleDiskS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_nSlots_3_0= RULE_INT ) ) otherlv_4= RightParenthesis ( (lv_logging_5_0= ruleLoggingS ) )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_targets_8_0= ruleDiskZoneS ) )+ this_END_9= RULE_END ) ;
    public final EObject ruleDiskS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_nSlots_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        EObject lv_logging_5_0 = null;

        EObject lv_targets_8_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:553:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_nSlots_3_0= RULE_INT ) ) otherlv_4= RightParenthesis ( (lv_logging_5_0= ruleLoggingS ) )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_targets_8_0= ruleDiskZoneS ) )+ this_END_9= RULE_END ) )
            // InternalShortDSLParser.g:554:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_nSlots_3_0= RULE_INT ) ) otherlv_4= RightParenthesis ( (lv_logging_5_0= ruleLoggingS ) )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_targets_8_0= ruleDiskZoneS ) )+ this_END_9= RULE_END )
            {
            // InternalShortDSLParser.g:554:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_nSlots_3_0= RULE_INT ) ) otherlv_4= RightParenthesis ( (lv_logging_5_0= ruleLoggingS ) )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_targets_8_0= ruleDiskZoneS ) )+ this_END_9= RULE_END )
            // InternalShortDSLParser.g:555:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_nSlots_3_0= RULE_INT ) ) otherlv_4= RightParenthesis ( (lv_logging_5_0= ruleLoggingS ) )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_targets_8_0= ruleDiskZoneS ) )+ this_END_9= RULE_END
            {
            // InternalShortDSLParser.g:555:3: ()
            // InternalShortDSLParser.g:556:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiskSAccess().getDiskAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:562:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:563:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:563:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:564:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDiskSAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getDiskSAccess().getLeftParenthesisKeyword_2());
            		
            // InternalShortDSLParser.g:584:3: ( (lv_nSlots_3_0= RULE_INT ) )
            // InternalShortDSLParser.g:585:4: (lv_nSlots_3_0= RULE_INT )
            {
            // InternalShortDSLParser.g:585:4: (lv_nSlots_3_0= RULE_INT )
            // InternalShortDSLParser.g:586:5: lv_nSlots_3_0= RULE_INT
            {
            lv_nSlots_3_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_nSlots_3_0, grammarAccess.getDiskSAccess().getNSlotsINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nSlots",
            						lv_nSlots_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getDiskSAccess().getRightParenthesisKeyword_4());
            		
            // InternalShortDSLParser.g:606:3: ( (lv_logging_5_0= ruleLoggingS ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Logging) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalShortDSLParser.g:607:4: (lv_logging_5_0= ruleLoggingS )
                    {
                    // InternalShortDSLParser.g:607:4: (lv_logging_5_0= ruleLoggingS )
                    // InternalShortDSLParser.g:608:5: lv_logging_5_0= ruleLoggingS
                    {

                    					newCompositeNode(grammarAccess.getDiskSAccess().getLoggingLoggingSParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_logging_5_0=ruleLoggingS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDiskSRule());
                    					}
                    					set(
                    						current,
                    						"logging",
                    						lv_logging_5_0,
                    						"xtext.factoryLang.shortDSL.ShortDSL.LoggingS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,Colon,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getDiskSAccess().getColonKeyword_6());
            		
            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            			newLeafNode(this_BEGIN_7, grammarAccess.getDiskSAccess().getBEGINTerminalRuleCall_7());
            		
            // InternalShortDSLParser.g:633:3: ( (lv_targets_8_0= ruleDiskZoneS ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalShortDSLParser.g:634:4: (lv_targets_8_0= ruleDiskZoneS )
            	    {
            	    // InternalShortDSLParser.g:634:4: (lv_targets_8_0= ruleDiskZoneS )
            	    // InternalShortDSLParser.g:635:5: lv_targets_8_0= ruleDiskZoneS
            	    {

            	    					newCompositeNode(grammarAccess.getDiskSAccess().getTargetsDiskZoneSParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_targets_8_0=ruleDiskZoneS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiskSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"targets",
            	    						lv_targets_8_0,
            	    						"xtext.factoryLang.shortDSL.ShortDSL.DiskZoneS");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            this_END_9=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_9, grammarAccess.getDiskSAccess().getENDTerminalRuleCall_9());
            		

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
    // $ANTLR end "ruleDiskS"


    // $ANTLR start "entryRuleDiskZoneS"
    // InternalShortDSLParser.g:660:1: entryRuleDiskZoneS returns [EObject current=null] : iv_ruleDiskZoneS= ruleDiskZoneS EOF ;
    public final EObject entryRuleDiskZoneS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskZoneS = null;


        try {
            // InternalShortDSLParser.g:660:50: (iv_ruleDiskZoneS= ruleDiskZoneS EOF )
            // InternalShortDSLParser.g:661:2: iv_ruleDiskZoneS= ruleDiskZoneS EOF
            {
             newCompositeNode(grammarAccess.getDiskZoneSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskZoneS=ruleDiskZoneS();

            state._fsp--;

             current =iv_ruleDiskZoneS; 
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
    // $ANTLR end "entryRuleDiskZoneS"


    // $ANTLR start "ruleDiskZoneS"
    // InternalShortDSLParser.g:667:1: ruleDiskZoneS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_slot_3_0= RULE_INT ) ) (otherlv_4= Comma )? ) ;
    public final EObject ruleDiskZoneS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_slot_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:673:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_slot_3_0= RULE_INT ) ) (otherlv_4= Comma )? ) )
            // InternalShortDSLParser.g:674:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_slot_3_0= RULE_INT ) ) (otherlv_4= Comma )? )
            {
            // InternalShortDSLParser.g:674:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_slot_3_0= RULE_INT ) ) (otherlv_4= Comma )? )
            // InternalShortDSLParser.g:675:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_slot_3_0= RULE_INT ) ) (otherlv_4= Comma )?
            {
            // InternalShortDSLParser.g:675:3: ()
            // InternalShortDSLParser.g:676:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiskZoneSAccess().getDiskZoneAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:682:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:683:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:683:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:684:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDiskZoneSAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskZoneSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getDiskZoneSAccess().getColonKeyword_2());
            		
            // InternalShortDSLParser.g:704:3: ( (lv_slot_3_0= RULE_INT ) )
            // InternalShortDSLParser.g:705:4: (lv_slot_3_0= RULE_INT )
            {
            // InternalShortDSLParser.g:705:4: (lv_slot_3_0= RULE_INT )
            // InternalShortDSLParser.g:706:5: lv_slot_3_0= RULE_INT
            {
            lv_slot_3_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_slot_3_0, grammarAccess.getDiskZoneSAccess().getSlotINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskZoneSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"slot",
            						lv_slot_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalShortDSLParser.g:722:3: (otherlv_4= Comma )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Comma) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalShortDSLParser.g:723:4: otherlv_4= Comma
                    {
                    otherlv_4=(Token)match(input,Comma,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDiskZoneSAccess().getCommaKeyword_4());
                    			

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
    // $ANTLR end "ruleDiskZoneS"


    // $ANTLR start "entryRuleCameraS"
    // InternalShortDSLParser.g:732:1: entryRuleCameraS returns [EObject current=null] : iv_ruleCameraS= ruleCameraS EOF ;
    public final EObject entryRuleCameraS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCameraS = null;


        try {
            // InternalShortDSLParser.g:732:48: (iv_ruleCameraS= ruleCameraS EOF )
            // InternalShortDSLParser.g:733:2: iv_ruleCameraS= ruleCameraS EOF
            {
             newCompositeNode(grammarAccess.getCameraSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCameraS=ruleCameraS();

            state._fsp--;

             current =iv_ruleCameraS; 
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
    // $ANTLR end "entryRuleCameraS"


    // $ANTLR start "ruleCameraS"
    // InternalShortDSLParser.g:739:1: ruleCameraS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_logging_2_0= ruleLoggingS ) )? otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCameraColorS ) )+ this_END_6= RULE_END ) ;
    public final EObject ruleCameraS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        EObject lv_logging_2_0 = null;

        EObject lv_targets_5_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:745:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_logging_2_0= ruleLoggingS ) )? otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCameraColorS ) )+ this_END_6= RULE_END ) )
            // InternalShortDSLParser.g:746:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_logging_2_0= ruleLoggingS ) )? otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCameraColorS ) )+ this_END_6= RULE_END )
            {
            // InternalShortDSLParser.g:746:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_logging_2_0= ruleLoggingS ) )? otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCameraColorS ) )+ this_END_6= RULE_END )
            // InternalShortDSLParser.g:747:3: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_logging_2_0= ruleLoggingS ) )? otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_targets_5_0= ruleCameraColorS ) )+ this_END_6= RULE_END
            {
            // InternalShortDSLParser.g:747:3: ()
            // InternalShortDSLParser.g:748:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCameraSAccess().getCameraAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:754:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:755:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:755:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:756:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCameraSAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCameraSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalShortDSLParser.g:772:3: ( (lv_logging_2_0= ruleLoggingS ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Logging) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalShortDSLParser.g:773:4: (lv_logging_2_0= ruleLoggingS )
                    {
                    // InternalShortDSLParser.g:773:4: (lv_logging_2_0= ruleLoggingS )
                    // InternalShortDSLParser.g:774:5: lv_logging_2_0= ruleLoggingS
                    {

                    					newCompositeNode(grammarAccess.getCameraSAccess().getLoggingLoggingSParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_logging_2_0=ruleLoggingS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCameraSRule());
                    					}
                    					set(
                    						current,
                    						"logging",
                    						lv_logging_2_0,
                    						"xtext.factoryLang.shortDSL.ShortDSL.LoggingS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,Colon,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getCameraSAccess().getColonKeyword_3());
            		
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getCameraSAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalShortDSLParser.g:799:3: ( (lv_targets_5_0= ruleCameraColorS ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Green||LA12_0==Blue||LA12_0==Red) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalShortDSLParser.g:800:4: (lv_targets_5_0= ruleCameraColorS )
            	    {
            	    // InternalShortDSLParser.g:800:4: (lv_targets_5_0= ruleCameraColorS )
            	    // InternalShortDSLParser.g:801:5: lv_targets_5_0= ruleCameraColorS
            	    {

            	    					newCompositeNode(grammarAccess.getCameraSAccess().getTargetsCameraColorSParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_targets_5_0=ruleCameraColorS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCameraSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"targets",
            	    						lv_targets_5_0,
            	    						"xtext.factoryLang.shortDSL.ShortDSL.CameraColorS");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getCameraSAccess().getENDTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleCameraS"


    // $ANTLR start "entryRuleCameraColorS"
    // InternalShortDSLParser.g:826:1: entryRuleCameraColorS returns [EObject current=null] : iv_ruleCameraColorS= ruleCameraColorS EOF ;
    public final EObject entryRuleCameraColorS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCameraColorS = null;


        try {
            // InternalShortDSLParser.g:826:53: (iv_ruleCameraColorS= ruleCameraColorS EOF )
            // InternalShortDSLParser.g:827:2: iv_ruleCameraColorS= ruleCameraColorS EOF
            {
             newCompositeNode(grammarAccess.getCameraColorSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCameraColorS=ruleCameraColorS();

            state._fsp--;

             current =iv_ruleCameraColorS; 
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
    // $ANTLR end "entryRuleCameraColorS"


    // $ANTLR start "ruleCameraColorS"
    // InternalShortDSLParser.g:833:1: ruleCameraColorS returns [EObject current=null] : ( () ( (lv_color_1_0= ruleCOLOR_S ) ) (otherlv_2= Comma )? ) ;
    public final EObject ruleCameraColorS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_color_1_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:839:2: ( ( () ( (lv_color_1_0= ruleCOLOR_S ) ) (otherlv_2= Comma )? ) )
            // InternalShortDSLParser.g:840:2: ( () ( (lv_color_1_0= ruleCOLOR_S ) ) (otherlv_2= Comma )? )
            {
            // InternalShortDSLParser.g:840:2: ( () ( (lv_color_1_0= ruleCOLOR_S ) ) (otherlv_2= Comma )? )
            // InternalShortDSLParser.g:841:3: () ( (lv_color_1_0= ruleCOLOR_S ) ) (otherlv_2= Comma )?
            {
            // InternalShortDSLParser.g:841:3: ()
            // InternalShortDSLParser.g:842:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCameraColorSAccess().getCameraColorAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:848:3: ( (lv_color_1_0= ruleCOLOR_S ) )
            // InternalShortDSLParser.g:849:4: (lv_color_1_0= ruleCOLOR_S )
            {
            // InternalShortDSLParser.g:849:4: (lv_color_1_0= ruleCOLOR_S )
            // InternalShortDSLParser.g:850:5: lv_color_1_0= ruleCOLOR_S
            {

            					newCompositeNode(grammarAccess.getCameraColorSAccess().getColorCOLOR_SEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_color_1_0=ruleCOLOR_S();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCameraColorSRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_1_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.COLOR_S");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:867:3: (otherlv_2= Comma )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Comma) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalShortDSLParser.g:868:4: otherlv_2= Comma
                    {
                    otherlv_2=(Token)match(input,Comma,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getCameraColorSAccess().getCommaKeyword_2());
                    			

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
    // $ANTLR end "ruleCameraColorS"


    // $ANTLR start "entryRuleLoggingS"
    // InternalShortDSLParser.g:877:1: entryRuleLoggingS returns [EObject current=null] : iv_ruleLoggingS= ruleLoggingS EOF ;
    public final EObject entryRuleLoggingS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoggingS = null;


        try {
            // InternalShortDSLParser.g:877:49: (iv_ruleLoggingS= ruleLoggingS EOF )
            // InternalShortDSLParser.g:878:2: iv_ruleLoggingS= ruleLoggingS EOF
            {
             newCompositeNode(grammarAccess.getLoggingSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoggingS=ruleLoggingS();

            state._fsp--;

             current =iv_ruleLoggingS; 
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
    // $ANTLR end "entryRuleLoggingS"


    // $ANTLR start "ruleLoggingS"
    // InternalShortDSLParser.g:884:1: ruleLoggingS returns [EObject current=null] : ( () otherlv_1= Logging ) ;
    public final EObject ruleLoggingS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:890:2: ( ( () otherlv_1= Logging ) )
            // InternalShortDSLParser.g:891:2: ( () otherlv_1= Logging )
            {
            // InternalShortDSLParser.g:891:2: ( () otherlv_1= Logging )
            // InternalShortDSLParser.g:892:3: () otherlv_1= Logging
            {
            // InternalShortDSLParser.g:892:3: ()
            // InternalShortDSLParser.g:893:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoggingSAccess().getLoggingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Logging,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLoggingSAccess().getLoggingKeyword_1());
            		

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
    // $ANTLR end "ruleLoggingS"


    // $ANTLR start "entryRuleDiskHandlingS"
    // InternalShortDSLParser.g:907:1: entryRuleDiskHandlingS returns [EObject current=null] : iv_ruleDiskHandlingS= ruleDiskHandlingS EOF ;
    public final EObject entryRuleDiskHandlingS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskHandlingS = null;


        try {
            // InternalShortDSLParser.g:907:54: (iv_ruleDiskHandlingS= ruleDiskHandlingS EOF )
            // InternalShortDSLParser.g:908:2: iv_ruleDiskHandlingS= ruleDiskHandlingS EOF
            {
             newCompositeNode(grammarAccess.getDiskHandlingSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskHandlingS=ruleDiskHandlingS();

            state._fsp--;

             current =iv_ruleDiskHandlingS; 
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
    // $ANTLR end "entryRuleDiskHandlingS"


    // $ANTLR start "ruleDiskHandlingS"
    // InternalShortDSLParser.g:914:1: ruleDiskHandlingS returns [EObject current=null] : (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftCurlyBracket this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatementS ) )+ this_END_5= RULE_END otherlv_6= RightCurlyBracket ) ;
    public final EObject ruleDiskHandlingS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        Token otherlv_6=null;
        EObject lv_statements_4_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:920:2: ( (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftCurlyBracket this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatementS ) )+ this_END_5= RULE_END otherlv_6= RightCurlyBracket ) )
            // InternalShortDSLParser.g:921:2: (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftCurlyBracket this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatementS ) )+ this_END_5= RULE_END otherlv_6= RightCurlyBracket )
            {
            // InternalShortDSLParser.g:921:2: (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftCurlyBracket this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatementS ) )+ this_END_5= RULE_END otherlv_6= RightCurlyBracket )
            // InternalShortDSLParser.g:922:3: otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftCurlyBracket this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatementS ) )+ this_END_5= RULE_END otherlv_6= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Handle,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDiskHandlingSAccess().getHandleKeyword_0());
            		
            // InternalShortDSLParser.g:926:3: ( (otherlv_1= RULE_ID ) )
            // InternalShortDSLParser.g:927:4: (otherlv_1= RULE_ID )
            {
            // InternalShortDSLParser.g:927:4: (otherlv_1= RULE_ID )
            // InternalShortDSLParser.g:928:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskHandlingSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_1, grammarAccess.getDiskHandlingSAccess().getDiskDiskCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDiskHandlingSAccess().getLeftCurlyBracketKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getDiskHandlingSAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalShortDSLParser.g:947:3: ( (lv_statements_4_0= ruleStatementS ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=In_progress && LA14_0<=Complete)||LA14_0==Foreach||LA14_0==Pickup||(LA14_0>=Drop && LA14_0<=Free)||LA14_0==If||LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalShortDSLParser.g:948:4: (lv_statements_4_0= ruleStatementS )
            	    {
            	    // InternalShortDSLParser.g:948:4: (lv_statements_4_0= ruleStatementS )
            	    // InternalShortDSLParser.g:949:5: lv_statements_4_0= ruleStatementS
            	    {

            	    					newCompositeNode(grammarAccess.getDiskHandlingSAccess().getStatementsStatementSParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_statements_4_0=ruleStatementS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiskHandlingSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_4_0,
            	    						"xtext.factoryLang.shortDSL.ShortDSL.StatementS");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_11); 

            			newLeafNode(this_END_5, grammarAccess.getDiskHandlingSAccess().getENDTerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDiskHandlingSAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDiskHandlingS"


    // $ANTLR start "entryRuleStatementS"
    // InternalShortDSLParser.g:978:1: entryRuleStatementS returns [EObject current=null] : iv_ruleStatementS= ruleStatementS EOF ;
    public final EObject entryRuleStatementS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementS = null;


        try {
            // InternalShortDSLParser.g:978:51: (iv_ruleStatementS= ruleStatementS EOF )
            // InternalShortDSLParser.g:979:2: iv_ruleStatementS= ruleStatementS EOF
            {
             newCompositeNode(grammarAccess.getStatementSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatementS=ruleStatementS();

            state._fsp--;

             current =iv_ruleStatementS; 
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
    // $ANTLR end "entryRuleStatementS"


    // $ANTLR start "ruleStatementS"
    // InternalShortDSLParser.g:985:1: ruleStatementS returns [EObject current=null] : (this_LoopS_0= ruleLoopS | this_MoveS_1= ruleMoveS | this_CraneActionS_2= ruleCraneActionS | this_ConditionS_3= ruleConditionS | this_MarkS_4= ruleMarkS ) ;
    public final EObject ruleStatementS() throws RecognitionException {
        EObject current = null;

        EObject this_LoopS_0 = null;

        EObject this_MoveS_1 = null;

        EObject this_CraneActionS_2 = null;

        EObject this_ConditionS_3 = null;

        EObject this_MarkS_4 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:991:2: ( (this_LoopS_0= ruleLoopS | this_MoveS_1= ruleMoveS | this_CraneActionS_2= ruleCraneActionS | this_ConditionS_3= ruleConditionS | this_MarkS_4= ruleMarkS ) )
            // InternalShortDSLParser.g:992:2: (this_LoopS_0= ruleLoopS | this_MoveS_1= ruleMoveS | this_CraneActionS_2= ruleCraneActionS | this_ConditionS_3= ruleConditionS | this_MarkS_4= ruleMarkS )
            {
            // InternalShortDSLParser.g:992:2: (this_LoopS_0= ruleLoopS | this_MoveS_1= ruleMoveS | this_CraneActionS_2= ruleCraneActionS | this_ConditionS_3= ruleConditionS | this_MarkS_4= ruleMarkS )
            int alt15=5;
            switch ( input.LA(1) ) {
            case Foreach:
                {
                alt15=1;
                }
                break;
            case RULE_ID:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==Pickup||LA15_2==Drop||LA15_2==HyphenMinusHyphenMinusGreaterThanSign||LA15_2==HyphenMinusGreaterThanSign) ) {
                    alt15=2;
                }
                else if ( (LA15_2==Scan||LA15_2==LeftParenthesis) ) {
                    alt15=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case In_progress:
            case Complete:
            case Free:
                {
                alt15=2;
                }
                break;
            case Pickup:
            case Drop:
                {
                alt15=3;
                }
                break;
            case If:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalShortDSLParser.g:993:3: this_LoopS_0= ruleLoopS
                    {

                    			newCompositeNode(grammarAccess.getStatementSAccess().getLoopSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoopS_0=ruleLoopS();

                    state._fsp--;


                    			current = this_LoopS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1002:3: this_MoveS_1= ruleMoveS
                    {

                    			newCompositeNode(grammarAccess.getStatementSAccess().getMoveSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveS_1=ruleMoveS();

                    state._fsp--;


                    			current = this_MoveS_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1011:3: this_CraneActionS_2= ruleCraneActionS
                    {

                    			newCompositeNode(grammarAccess.getStatementSAccess().getCraneActionSParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CraneActionS_2=ruleCraneActionS();

                    state._fsp--;


                    			current = this_CraneActionS_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalShortDSLParser.g:1020:3: this_ConditionS_3= ruleConditionS
                    {

                    			newCompositeNode(grammarAccess.getStatementSAccess().getConditionSParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionS_3=ruleConditionS();

                    state._fsp--;


                    			current = this_ConditionS_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalShortDSLParser.g:1029:3: this_MarkS_4= ruleMarkS
                    {

                    			newCompositeNode(grammarAccess.getStatementSAccess().getMarkSParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MarkS_4=ruleMarkS();

                    state._fsp--;


                    			current = this_MarkS_4;
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
    // $ANTLR end "ruleStatementS"


    // $ANTLR start "entryRuleLoopS"
    // InternalShortDSLParser.g:1041:1: entryRuleLoopS returns [EObject current=null] : iv_ruleLoopS= ruleLoopS EOF ;
    public final EObject entryRuleLoopS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopS = null;


        try {
            // InternalShortDSLParser.g:1041:46: (iv_ruleLoopS= ruleLoopS EOF )
            // InternalShortDSLParser.g:1042:2: iv_ruleLoopS= ruleLoopS EOF
            {
             newCompositeNode(grammarAccess.getLoopSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoopS=ruleLoopS();

            state._fsp--;

             current =iv_ruleLoopS; 
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
    // $ANTLR end "entryRuleLoopS"


    // $ANTLR start "ruleLoopS"
    // InternalShortDSLParser.g:1048:1: ruleLoopS returns [EObject current=null] : ( () otherlv_1= Foreach ( (lv_variable_2_0= ruleLocalVariableS ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_slotState_4_0= ruleDiskSlotStateValueS ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END ) ;
    public final EObject ruleLoopS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        EObject lv_variable_2_0 = null;

        Enumerator lv_comparisonOperator_3_0 = null;

        EObject lv_slotState_4_0 = null;

        EObject lv_statements_7_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1054:2: ( ( () otherlv_1= Foreach ( (lv_variable_2_0= ruleLocalVariableS ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_slotState_4_0= ruleDiskSlotStateValueS ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END ) )
            // InternalShortDSLParser.g:1055:2: ( () otherlv_1= Foreach ( (lv_variable_2_0= ruleLocalVariableS ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_slotState_4_0= ruleDiskSlotStateValueS ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END )
            {
            // InternalShortDSLParser.g:1055:2: ( () otherlv_1= Foreach ( (lv_variable_2_0= ruleLocalVariableS ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_slotState_4_0= ruleDiskSlotStateValueS ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END )
            // InternalShortDSLParser.g:1056:3: () otherlv_1= Foreach ( (lv_variable_2_0= ruleLocalVariableS ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_slotState_4_0= ruleDiskSlotStateValueS ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END
            {
            // InternalShortDSLParser.g:1056:3: ()
            // InternalShortDSLParser.g:1057:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopSAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Foreach,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopSAccess().getForeachKeyword_1());
            		
            // InternalShortDSLParser.g:1067:3: ( (lv_variable_2_0= ruleLocalVariableS ) )
            // InternalShortDSLParser.g:1068:4: (lv_variable_2_0= ruleLocalVariableS )
            {
            // InternalShortDSLParser.g:1068:4: (lv_variable_2_0= ruleLocalVariableS )
            // InternalShortDSLParser.g:1069:5: lv_variable_2_0= ruleLocalVariableS
            {

            					newCompositeNode(grammarAccess.getLoopSAccess().getVariableLocalVariableSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_variable_2_0=ruleLocalVariableS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopSRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_2_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.LocalVariableS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:1086:3: ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:1087:4: (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:1087:4: (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:1088:5: lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S
            {

            					newCompositeNode(grammarAccess.getLoopSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_comparisonOperator_3_0=ruleCOMPARISON_OPERATOR_S();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopSRule());
            					}
            					set(
            						current,
            						"comparisonOperator",
            						lv_comparisonOperator_3_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.COMPARISON_OPERATOR_S");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:1105:3: ( (lv_slotState_4_0= ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:1106:4: (lv_slotState_4_0= ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:1106:4: (lv_slotState_4_0= ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:1107:5: lv_slotState_4_0= ruleDiskSlotStateValueS
            {

            					newCompositeNode(grammarAccess.getLoopSAccess().getSlotStateDiskSlotStateValueSParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_slotState_4_0=ruleDiskSlotStateValueS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopSRule());
            					}
            					set(
            						current,
            						"slotState",
            						lv_slotState_4_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.DiskSlotStateValueS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,Colon,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getLoopSAccess().getColonKeyword_5());
            		
            this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_21); 

            			newLeafNode(this_BEGIN_6, grammarAccess.getLoopSAccess().getBEGINTerminalRuleCall_6());
            		
            // InternalShortDSLParser.g:1132:3: ( (lv_statements_7_0= ruleStatementS ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=In_progress && LA16_0<=Complete)||LA16_0==Foreach||LA16_0==Pickup||(LA16_0>=Drop && LA16_0<=Free)||LA16_0==If||LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalShortDSLParser.g:1133:4: (lv_statements_7_0= ruleStatementS )
            	    {
            	    // InternalShortDSLParser.g:1133:4: (lv_statements_7_0= ruleStatementS )
            	    // InternalShortDSLParser.g:1134:5: lv_statements_7_0= ruleStatementS
            	    {

            	    					newCompositeNode(grammarAccess.getLoopSAccess().getStatementsStatementSParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_statements_7_0=ruleStatementS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoopSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_7_0,
            	    						"xtext.factoryLang.shortDSL.ShortDSL.StatementS");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getLoopSAccess().getENDTerminalRuleCall_8());
            		

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
    // $ANTLR end "ruleLoopS"


    // $ANTLR start "entryRuleMoveS"
    // InternalShortDSLParser.g:1159:1: entryRuleMoveS returns [EObject current=null] : iv_ruleMoveS= ruleMoveS EOF ;
    public final EObject entryRuleMoveS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveS = null;


        try {
            // InternalShortDSLParser.g:1159:46: (iv_ruleMoveS= ruleMoveS EOF )
            // InternalShortDSLParser.g:1160:2: iv_ruleMoveS= ruleMoveS EOF
            {
             newCompositeNode(grammarAccess.getMoveSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveS=ruleMoveS();

            state._fsp--;

             current =iv_ruleMoveS; 
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
    // $ANTLR end "entryRuleMoveS"


    // $ANTLR start "ruleMoveS"
    // InternalShortDSLParser.g:1166:1: ruleMoveS returns [EObject current=null] : (this_MoveDiskS_0= ruleMoveDiskS | this_MoveAnySlotS_1= ruleMoveAnySlotS | this_MoveCraneS_2= ruleMoveCraneS ) ;
    public final EObject ruleMoveS() throws RecognitionException {
        EObject current = null;

        EObject this_MoveDiskS_0 = null;

        EObject this_MoveAnySlotS_1 = null;

        EObject this_MoveCraneS_2 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1172:2: ( (this_MoveDiskS_0= ruleMoveDiskS | this_MoveAnySlotS_1= ruleMoveAnySlotS | this_MoveCraneS_2= ruleMoveCraneS ) )
            // InternalShortDSLParser.g:1173:2: (this_MoveDiskS_0= ruleMoveDiskS | this_MoveAnySlotS_1= ruleMoveAnySlotS | this_MoveCraneS_2= ruleMoveCraneS )
            {
            // InternalShortDSLParser.g:1173:2: (this_MoveDiskS_0= ruleMoveDiskS | this_MoveAnySlotS_1= ruleMoveAnySlotS | this_MoveCraneS_2= ruleMoveCraneS )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==Pickup||LA17_1==Drop) ) {
                    alt17=3;
                }
                else if ( (LA17_1==HyphenMinusHyphenMinusGreaterThanSign||LA17_1==HyphenMinusGreaterThanSign) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA17_0>=In_progress && LA17_0<=Complete)||LA17_0==Free) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalShortDSLParser.g:1174:3: this_MoveDiskS_0= ruleMoveDiskS
                    {

                    			newCompositeNode(grammarAccess.getMoveSAccess().getMoveDiskSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveDiskS_0=ruleMoveDiskS();

                    state._fsp--;


                    			current = this_MoveDiskS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1183:3: this_MoveAnySlotS_1= ruleMoveAnySlotS
                    {

                    			newCompositeNode(grammarAccess.getMoveSAccess().getMoveAnySlotSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveAnySlotS_1=ruleMoveAnySlotS();

                    state._fsp--;


                    			current = this_MoveAnySlotS_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1192:3: this_MoveCraneS_2= ruleMoveCraneS
                    {

                    			newCompositeNode(grammarAccess.getMoveSAccess().getMoveCraneSParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveCraneS_2=ruleMoveCraneS();

                    state._fsp--;


                    			current = this_MoveCraneS_2;
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
    // $ANTLR end "ruleMoveS"


    // $ANTLR start "entryRuleMoveDiskS"
    // InternalShortDSLParser.g:1204:1: entryRuleMoveDiskS returns [EObject current=null] : iv_ruleMoveDiskS= ruleMoveDiskS EOF ;
    public final EObject entryRuleMoveDiskS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveDiskS = null;


        try {
            // InternalShortDSLParser.g:1204:50: (iv_ruleMoveDiskS= ruleMoveDiskS EOF )
            // InternalShortDSLParser.g:1205:2: iv_ruleMoveDiskS= ruleMoveDiskS EOF
            {
             newCompositeNode(grammarAccess.getMoveDiskSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveDiskS=ruleMoveDiskS();

            state._fsp--;

             current =iv_ruleMoveDiskS; 
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
    // $ANTLR end "entryRuleMoveDiskS"


    // $ANTLR start "ruleMoveDiskS"
    // InternalShortDSLParser.g:1211:1: ruleMoveDiskS returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleMoveDiskS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:1217:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_4= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:1218:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:1218:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_4= RULE_ID ) ) )
            // InternalShortDSLParser.g:1219:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_4= RULE_ID ) )
            {
            // InternalShortDSLParser.g:1219:3: ()
            // InternalShortDSLParser.g:1220:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveDiskSAccess().getMoveDiskAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1226:3: ( (otherlv_1= RULE_ID ) )
            // InternalShortDSLParser.g:1227:4: (otherlv_1= RULE_ID )
            {
            // InternalShortDSLParser.g:1227:4: (otherlv_1= RULE_ID )
            // InternalShortDSLParser.g:1228:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveDiskSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_1, grammarAccess.getMoveDiskSAccess().getSlotLocalVariableCrossReference_1_0());
            				

            }


            }

            // InternalShortDSLParser.g:1239:3: (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==HyphenMinusGreaterThanSign) ) {
                alt18=1;
            }
            else if ( (LA18_0==HyphenMinusHyphenMinusGreaterThanSign) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalShortDSLParser.g:1240:4: otherlv_2= HyphenMinusGreaterThanSign
                    {
                    otherlv_2=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getMoveDiskSAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1245:4: otherlv_3= HyphenMinusHyphenMinusGreaterThanSign
                    {
                    otherlv_3=(Token)match(input,HyphenMinusHyphenMinusGreaterThanSign,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoveDiskSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalShortDSLParser.g:1250:3: ( (otherlv_4= RULE_ID ) )
            // InternalShortDSLParser.g:1251:4: (otherlv_4= RULE_ID )
            {
            // InternalShortDSLParser.g:1251:4: (otherlv_4= RULE_ID )
            // InternalShortDSLParser.g:1252:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveDiskSRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getMoveDiskSAccess().getZoneDiskZoneCrossReference_3_0());
            				

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
    // $ANTLR end "ruleMoveDiskS"


    // $ANTLR start "entryRuleMoveAnySlotS"
    // InternalShortDSLParser.g:1267:1: entryRuleMoveAnySlotS returns [EObject current=null] : iv_ruleMoveAnySlotS= ruleMoveAnySlotS EOF ;
    public final EObject entryRuleMoveAnySlotS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveAnySlotS = null;


        try {
            // InternalShortDSLParser.g:1267:53: (iv_ruleMoveAnySlotS= ruleMoveAnySlotS EOF )
            // InternalShortDSLParser.g:1268:2: iv_ruleMoveAnySlotS= ruleMoveAnySlotS EOF
            {
             newCompositeNode(grammarAccess.getMoveAnySlotSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveAnySlotS=ruleMoveAnySlotS();

            state._fsp--;

             current =iv_ruleMoveAnySlotS; 
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
    // $ANTLR end "entryRuleMoveAnySlotS"


    // $ANTLR start "ruleMoveAnySlotS"
    // InternalShortDSLParser.g:1274:1: ruleMoveAnySlotS returns [EObject current=null] : ( () ( (lv_state_1_0= ruleDiskSlotStateValueS ) ) ( (lv_anySlot_2_0= ruleLocalVariableS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleMoveAnySlotS() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_state_1_0 = null;

        EObject lv_anySlot_2_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1280:2: ( ( () ( (lv_state_1_0= ruleDiskSlotStateValueS ) ) ( (lv_anySlot_2_0= ruleLocalVariableS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:1281:2: ( () ( (lv_state_1_0= ruleDiskSlotStateValueS ) ) ( (lv_anySlot_2_0= ruleLocalVariableS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:1281:2: ( () ( (lv_state_1_0= ruleDiskSlotStateValueS ) ) ( (lv_anySlot_2_0= ruleLocalVariableS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) )
            // InternalShortDSLParser.g:1282:3: () ( (lv_state_1_0= ruleDiskSlotStateValueS ) ) ( (lv_anySlot_2_0= ruleLocalVariableS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) )
            {
            // InternalShortDSLParser.g:1282:3: ()
            // InternalShortDSLParser.g:1283:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveAnySlotSAccess().getMoveAnySlotAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1289:3: ( (lv_state_1_0= ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:1290:4: (lv_state_1_0= ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:1290:4: (lv_state_1_0= ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:1291:5: lv_state_1_0= ruleDiskSlotStateValueS
            {

            					newCompositeNode(grammarAccess.getMoveAnySlotSAccess().getStateDiskSlotStateValueSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_state_1_0=ruleDiskSlotStateValueS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveAnySlotSRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_1_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.DiskSlotStateValueS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:1308:3: ( (lv_anySlot_2_0= ruleLocalVariableS ) )
            // InternalShortDSLParser.g:1309:4: (lv_anySlot_2_0= ruleLocalVariableS )
            {
            // InternalShortDSLParser.g:1309:4: (lv_anySlot_2_0= ruleLocalVariableS )
            // InternalShortDSLParser.g:1310:5: lv_anySlot_2_0= ruleLocalVariableS
            {

            					newCompositeNode(grammarAccess.getMoveAnySlotSAccess().getAnySlotLocalVariableSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_anySlot_2_0=ruleLocalVariableS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveAnySlotSRule());
            					}
            					set(
            						current,
            						"anySlot",
            						lv_anySlot_2_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.LocalVariableS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:1327:3: (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==HyphenMinusGreaterThanSign) ) {
                alt19=1;
            }
            else if ( (LA19_0==HyphenMinusHyphenMinusGreaterThanSign) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalShortDSLParser.g:1328:4: otherlv_3= HyphenMinusGreaterThanSign
                    {
                    otherlv_3=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoveAnySlotSAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1333:4: otherlv_4= HyphenMinusHyphenMinusGreaterThanSign
                    {
                    otherlv_4=(Token)match(input,HyphenMinusHyphenMinusGreaterThanSign,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getMoveAnySlotSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalShortDSLParser.g:1338:3: ( (otherlv_5= RULE_ID ) )
            // InternalShortDSLParser.g:1339:4: (otherlv_5= RULE_ID )
            {
            // InternalShortDSLParser.g:1339:4: (otherlv_5= RULE_ID )
            // InternalShortDSLParser.g:1340:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveAnySlotSRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getMoveAnySlotSAccess().getZoneDiskZoneCrossReference_4_0());
            				

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
    // $ANTLR end "ruleMoveAnySlotS"


    // $ANTLR start "entryRuleMoveCraneS"
    // InternalShortDSLParser.g:1355:1: entryRuleMoveCraneS returns [EObject current=null] : iv_ruleMoveCraneS= ruleMoveCraneS EOF ;
    public final EObject entryRuleMoveCraneS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveCraneS = null;


        try {
            // InternalShortDSLParser.g:1355:51: (iv_ruleMoveCraneS= ruleMoveCraneS EOF )
            // InternalShortDSLParser.g:1356:2: iv_ruleMoveCraneS= ruleMoveCraneS EOF
            {
             newCompositeNode(grammarAccess.getMoveCraneSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveCraneS=ruleMoveCraneS();

            state._fsp--;

             current =iv_ruleMoveCraneS; 
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
    // $ANTLR end "entryRuleMoveCraneS"


    // $ANTLR start "ruleMoveCraneS"
    // InternalShortDSLParser.g:1362:1: ruleMoveCraneS returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_action_2_0= ruleCraneActionS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleMoveCraneS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_action_2_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1368:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_action_2_0= ruleCraneActionS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:1369:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_action_2_0= ruleCraneActionS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:1369:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_action_2_0= ruleCraneActionS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) )
            // InternalShortDSLParser.g:1370:3: () ( (otherlv_1= RULE_ID ) ) ( (lv_action_2_0= ruleCraneActionS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) )
            {
            // InternalShortDSLParser.g:1370:3: ()
            // InternalShortDSLParser.g:1371:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveCraneSAccess().getMoveCraneAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1377:3: ( (otherlv_1= RULE_ID ) )
            // InternalShortDSLParser.g:1378:4: (otherlv_1= RULE_ID )
            {
            // InternalShortDSLParser.g:1378:4: (otherlv_1= RULE_ID )
            // InternalShortDSLParser.g:1379:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveCraneSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_1, grammarAccess.getMoveCraneSAccess().getCraneCraneCrossReference_1_0());
            				

            }


            }

            // InternalShortDSLParser.g:1390:3: ( (lv_action_2_0= ruleCraneActionS ) )
            // InternalShortDSLParser.g:1391:4: (lv_action_2_0= ruleCraneActionS )
            {
            // InternalShortDSLParser.g:1391:4: (lv_action_2_0= ruleCraneActionS )
            // InternalShortDSLParser.g:1392:5: lv_action_2_0= ruleCraneActionS
            {

            					newCompositeNode(grammarAccess.getMoveCraneSAccess().getActionCraneActionSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_action_2_0=ruleCraneActionS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveCraneSRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_2_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.CraneActionS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:1409:3: (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==HyphenMinusGreaterThanSign) ) {
                alt20=1;
            }
            else if ( (LA20_0==HyphenMinusHyphenMinusGreaterThanSign) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalShortDSLParser.g:1410:4: otherlv_3= HyphenMinusGreaterThanSign
                    {
                    otherlv_3=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoveCraneSAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1415:4: otherlv_4= HyphenMinusHyphenMinusGreaterThanSign
                    {
                    otherlv_4=(Token)match(input,HyphenMinusHyphenMinusGreaterThanSign,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getMoveCraneSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalShortDSLParser.g:1420:3: ( (otherlv_5= RULE_ID ) )
            // InternalShortDSLParser.g:1421:4: (otherlv_5= RULE_ID )
            {
            // InternalShortDSLParser.g:1421:4: (otherlv_5= RULE_ID )
            // InternalShortDSLParser.g:1422:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveCraneSRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getMoveCraneSAccess().getZoneCraneZoneCrossReference_4_0());
            				

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
    // $ANTLR end "ruleMoveCraneS"


    // $ANTLR start "entryRuleCraneActionS"
    // InternalShortDSLParser.g:1437:1: entryRuleCraneActionS returns [EObject current=null] : iv_ruleCraneActionS= ruleCraneActionS EOF ;
    public final EObject entryRuleCraneActionS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCraneActionS = null;


        try {
            // InternalShortDSLParser.g:1437:53: (iv_ruleCraneActionS= ruleCraneActionS EOF )
            // InternalShortDSLParser.g:1438:2: iv_ruleCraneActionS= ruleCraneActionS EOF
            {
             newCompositeNode(grammarAccess.getCraneActionSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCraneActionS=ruleCraneActionS();

            state._fsp--;

             current =iv_ruleCraneActionS; 
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
    // $ANTLR end "entryRuleCraneActionS"


    // $ANTLR start "ruleCraneActionS"
    // InternalShortDSLParser.g:1444:1: ruleCraneActionS returns [EObject current=null] : ( () (otherlv_1= Pickup | otherlv_2= Drop ) ) ;
    public final EObject ruleCraneActionS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:1450:2: ( ( () (otherlv_1= Pickup | otherlv_2= Drop ) ) )
            // InternalShortDSLParser.g:1451:2: ( () (otherlv_1= Pickup | otherlv_2= Drop ) )
            {
            // InternalShortDSLParser.g:1451:2: ( () (otherlv_1= Pickup | otherlv_2= Drop ) )
            // InternalShortDSLParser.g:1452:3: () (otherlv_1= Pickup | otherlv_2= Drop )
            {
            // InternalShortDSLParser.g:1452:3: ()
            // InternalShortDSLParser.g:1453:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCraneActionSAccess().getCraneActionAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1459:3: (otherlv_1= Pickup | otherlv_2= Drop )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Pickup) ) {
                alt21=1;
            }
            else if ( (LA21_0==Drop) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalShortDSLParser.g:1460:4: otherlv_1= Pickup
                    {
                    otherlv_1=(Token)match(input,Pickup,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getCraneActionSAccess().getPickupKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1465:4: otherlv_2= Drop
                    {
                    otherlv_2=(Token)match(input,Drop,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getCraneActionSAccess().getDropKeyword_1_1());
                    			

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
    // $ANTLR end "ruleCraneActionS"


    // $ANTLR start "entryRuleConditionS"
    // InternalShortDSLParser.g:1474:1: entryRuleConditionS returns [EObject current=null] : iv_ruleConditionS= ruleConditionS EOF ;
    public final EObject entryRuleConditionS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionS = null;


        try {
            // InternalShortDSLParser.g:1474:51: (iv_ruleConditionS= ruleConditionS EOF )
            // InternalShortDSLParser.g:1475:2: iv_ruleConditionS= ruleConditionS EOF
            {
             newCompositeNode(grammarAccess.getConditionSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionS=ruleConditionS();

            state._fsp--;

             current =iv_ruleConditionS; 
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
    // $ANTLR end "entryRuleConditionS"


    // $ANTLR start "ruleConditionS"
    // InternalShortDSLParser.g:1481:1: ruleConditionS returns [EObject current=null] : (this_ConditionVariableS_0= ruleConditionVariableS | this_ConditionDeviceS_1= ruleConditionDeviceS ) ;
    public final EObject ruleConditionS() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionVariableS_0 = null;

        EObject this_ConditionDeviceS_1 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1487:2: ( (this_ConditionVariableS_0= ruleConditionVariableS | this_ConditionDeviceS_1= ruleConditionDeviceS ) )
            // InternalShortDSLParser.g:1488:2: (this_ConditionVariableS_0= ruleConditionVariableS | this_ConditionDeviceS_1= ruleConditionDeviceS )
            {
            // InternalShortDSLParser.g:1488:2: (this_ConditionVariableS_0= ruleConditionVariableS | this_ConditionDeviceS_1= ruleConditionDeviceS )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==If) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==Dev) ) {
                    alt22=2;
                }
                else if ( (LA22_1==Var) ) {
                    alt22=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalShortDSLParser.g:1489:3: this_ConditionVariableS_0= ruleConditionVariableS
                    {

                    			newCompositeNode(grammarAccess.getConditionSAccess().getConditionVariableSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionVariableS_0=ruleConditionVariableS();

                    state._fsp--;


                    			current = this_ConditionVariableS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1498:3: this_ConditionDeviceS_1= ruleConditionDeviceS
                    {

                    			newCompositeNode(grammarAccess.getConditionSAccess().getConditionDeviceSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionDeviceS_1=ruleConditionDeviceS();

                    state._fsp--;


                    			current = this_ConditionDeviceS_1;
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
    // $ANTLR end "ruleConditionS"


    // $ANTLR start "entryRuleConditionVariableS"
    // InternalShortDSLParser.g:1510:1: entryRuleConditionVariableS returns [EObject current=null] : iv_ruleConditionVariableS= ruleConditionVariableS EOF ;
    public final EObject entryRuleConditionVariableS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionVariableS = null;


        try {
            // InternalShortDSLParser.g:1510:59: (iv_ruleConditionVariableS= ruleConditionVariableS EOF )
            // InternalShortDSLParser.g:1511:2: iv_ruleConditionVariableS= ruleConditionVariableS EOF
            {
             newCompositeNode(grammarAccess.getConditionVariableSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionVariableS=ruleConditionVariableS();

            state._fsp--;

             current =iv_ruleConditionVariableS; 
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
    // $ANTLR end "entryRuleConditionVariableS"


    // $ANTLR start "ruleConditionVariableS"
    // InternalShortDSLParser.g:1517:1: ruleConditionVariableS returns [EObject current=null] : ( () otherlv_1= If otherlv_2= Var ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_variableValue_5_0= ruleVariableValueS ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END ) ;
    public final EObject ruleConditionVariableS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Enumerator lv_comparisonOperatorVariable_4_0 = null;

        EObject lv_variableValue_5_0 = null;

        EObject lv_statements_8_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1523:2: ( ( () otherlv_1= If otherlv_2= Var ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_variableValue_5_0= ruleVariableValueS ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END ) )
            // InternalShortDSLParser.g:1524:2: ( () otherlv_1= If otherlv_2= Var ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_variableValue_5_0= ruleVariableValueS ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END )
            {
            // InternalShortDSLParser.g:1524:2: ( () otherlv_1= If otherlv_2= Var ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_variableValue_5_0= ruleVariableValueS ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END )
            // InternalShortDSLParser.g:1525:3: () otherlv_1= If otherlv_2= Var ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_variableValue_5_0= ruleVariableValueS ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END
            {
            // InternalShortDSLParser.g:1525:3: ()
            // InternalShortDSLParser.g:1526:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionVariableSAccess().getConditionVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,If,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionVariableSAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,Var,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionVariableSAccess().getVarKeyword_2());
            		
            // InternalShortDSLParser.g:1540:3: ( (otherlv_3= RULE_ID ) )
            // InternalShortDSLParser.g:1541:4: (otherlv_3= RULE_ID )
            {
            // InternalShortDSLParser.g:1541:4: (otherlv_3= RULE_ID )
            // InternalShortDSLParser.g:1542:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionVariableSRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_3, grammarAccess.getConditionVariableSAccess().getVariableVariableSCrossReference_3_0());
            				

            }


            }

            // InternalShortDSLParser.g:1553:3: ( (lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:1554:4: (lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:1554:4: (lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:1555:5: lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S
            {

            					newCompositeNode(grammarAccess.getConditionVariableSAccess().getComparisonOperatorVariableCOMPARISON_OPERATOR_SEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_comparisonOperatorVariable_4_0=ruleCOMPARISON_OPERATOR_S();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionVariableSRule());
            					}
            					set(
            						current,
            						"comparisonOperatorVariable",
            						lv_comparisonOperatorVariable_4_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.COMPARISON_OPERATOR_S");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:1572:3: ( (lv_variableValue_5_0= ruleVariableValueS ) )
            // InternalShortDSLParser.g:1573:4: (lv_variableValue_5_0= ruleVariableValueS )
            {
            // InternalShortDSLParser.g:1573:4: (lv_variableValue_5_0= ruleVariableValueS )
            // InternalShortDSLParser.g:1574:5: lv_variableValue_5_0= ruleVariableValueS
            {

            					newCompositeNode(grammarAccess.getConditionVariableSAccess().getVariableValueVariableValueSParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_variableValue_5_0=ruleVariableValueS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionVariableSRule());
            					}
            					set(
            						current,
            						"variableValue",
            						lv_variableValue_5_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.VariableValueS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,Colon,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionVariableSAccess().getColonKeyword_6());
            		
            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_21); 

            			newLeafNode(this_BEGIN_7, grammarAccess.getConditionVariableSAccess().getBEGINTerminalRuleCall_7());
            		
            // InternalShortDSLParser.g:1599:3: ( (lv_statements_8_0= ruleStatementS ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=In_progress && LA23_0<=Complete)||LA23_0==Foreach||LA23_0==Pickup||(LA23_0>=Drop && LA23_0<=Free)||LA23_0==If||LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalShortDSLParser.g:1600:4: (lv_statements_8_0= ruleStatementS )
            	    {
            	    // InternalShortDSLParser.g:1600:4: (lv_statements_8_0= ruleStatementS )
            	    // InternalShortDSLParser.g:1601:5: lv_statements_8_0= ruleStatementS
            	    {

            	    					newCompositeNode(grammarAccess.getConditionVariableSAccess().getStatementsStatementSParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_statements_8_0=ruleStatementS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionVariableSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_8_0,
            	    						"xtext.factoryLang.shortDSL.ShortDSL.StatementS");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            this_END_9=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_9, grammarAccess.getConditionVariableSAccess().getENDTerminalRuleCall_9());
            		

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
    // $ANTLR end "ruleConditionVariableS"


    // $ANTLR start "entryRuleConditionDeviceS"
    // InternalShortDSLParser.g:1626:1: entryRuleConditionDeviceS returns [EObject current=null] : iv_ruleConditionDeviceS= ruleConditionDeviceS EOF ;
    public final EObject entryRuleConditionDeviceS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionDeviceS = null;


        try {
            // InternalShortDSLParser.g:1626:57: (iv_ruleConditionDeviceS= ruleConditionDeviceS EOF )
            // InternalShortDSLParser.g:1627:2: iv_ruleConditionDeviceS= ruleConditionDeviceS EOF
            {
             newCompositeNode(grammarAccess.getConditionDeviceSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionDeviceS=ruleConditionDeviceS();

            state._fsp--;

             current =iv_ruleConditionDeviceS; 
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
    // $ANTLR end "entryRuleConditionDeviceS"


    // $ANTLR start "ruleConditionDeviceS"
    // InternalShortDSLParser.g:1633:1: ruleConditionDeviceS returns [EObject current=null] : ( () otherlv_1= If otherlv_2= Dev ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_deviceValue_5_0= ruleDeviceValueS ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END ) ;
    public final EObject ruleConditionDeviceS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Enumerator lv_comparisonOperatorDevice_4_0 = null;

        EObject lv_deviceValue_5_0 = null;

        EObject lv_statements_8_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1639:2: ( ( () otherlv_1= If otherlv_2= Dev ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_deviceValue_5_0= ruleDeviceValueS ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END ) )
            // InternalShortDSLParser.g:1640:2: ( () otherlv_1= If otherlv_2= Dev ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_deviceValue_5_0= ruleDeviceValueS ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END )
            {
            // InternalShortDSLParser.g:1640:2: ( () otherlv_1= If otherlv_2= Dev ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_deviceValue_5_0= ruleDeviceValueS ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END )
            // InternalShortDSLParser.g:1641:3: () otherlv_1= If otherlv_2= Dev ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_deviceValue_5_0= ruleDeviceValueS ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END
            {
            // InternalShortDSLParser.g:1641:3: ()
            // InternalShortDSLParser.g:1642:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionDeviceSAccess().getConditionDeviceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,If,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionDeviceSAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,Dev,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionDeviceSAccess().getDevKeyword_2());
            		
            // InternalShortDSLParser.g:1656:3: ( (otherlv_3= RULE_ID ) )
            // InternalShortDSLParser.g:1657:4: (otherlv_3= RULE_ID )
            {
            // InternalShortDSLParser.g:1657:4: (otherlv_3= RULE_ID )
            // InternalShortDSLParser.g:1658:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionDeviceSRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_3, grammarAccess.getConditionDeviceSAccess().getDeviceDeviceSCrossReference_3_0());
            				

            }


            }

            // InternalShortDSLParser.g:1669:3: ( (lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:1670:4: (lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:1670:4: (lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:1671:5: lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S
            {

            					newCompositeNode(grammarAccess.getConditionDeviceSAccess().getComparisonOperatorDeviceCOMPARISON_OPERATOR_SEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
            lv_comparisonOperatorDevice_4_0=ruleCOMPARISON_OPERATOR_S();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionDeviceSRule());
            					}
            					set(
            						current,
            						"comparisonOperatorDevice",
            						lv_comparisonOperatorDevice_4_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.COMPARISON_OPERATOR_S");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:1688:3: ( (lv_deviceValue_5_0= ruleDeviceValueS ) )
            // InternalShortDSLParser.g:1689:4: (lv_deviceValue_5_0= ruleDeviceValueS )
            {
            // InternalShortDSLParser.g:1689:4: (lv_deviceValue_5_0= ruleDeviceValueS )
            // InternalShortDSLParser.g:1690:5: lv_deviceValue_5_0= ruleDeviceValueS
            {

            					newCompositeNode(grammarAccess.getConditionDeviceSAccess().getDeviceValueDeviceValueSParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_deviceValue_5_0=ruleDeviceValueS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionDeviceSRule());
            					}
            					set(
            						current,
            						"deviceValue",
            						lv_deviceValue_5_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.DeviceValueS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,Colon,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionDeviceSAccess().getColonKeyword_6());
            		
            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_21); 

            			newLeafNode(this_BEGIN_7, grammarAccess.getConditionDeviceSAccess().getBEGINTerminalRuleCall_7());
            		
            // InternalShortDSLParser.g:1715:3: ( (lv_statements_8_0= ruleStatementS ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=In_progress && LA24_0<=Complete)||LA24_0==Foreach||LA24_0==Pickup||(LA24_0>=Drop && LA24_0<=Free)||LA24_0==If||LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalShortDSLParser.g:1716:4: (lv_statements_8_0= ruleStatementS )
            	    {
            	    // InternalShortDSLParser.g:1716:4: (lv_statements_8_0= ruleStatementS )
            	    // InternalShortDSLParser.g:1717:5: lv_statements_8_0= ruleStatementS
            	    {

            	    					newCompositeNode(grammarAccess.getConditionDeviceSAccess().getStatementsStatementSParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_statements_8_0=ruleStatementS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionDeviceSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_8_0,
            	    						"xtext.factoryLang.shortDSL.ShortDSL.StatementS");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            this_END_9=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_9, grammarAccess.getConditionDeviceSAccess().getENDTerminalRuleCall_9());
            		

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
    // $ANTLR end "ruleConditionDeviceS"


    // $ANTLR start "entryRuleMarkS"
    // InternalShortDSLParser.g:1742:1: entryRuleMarkS returns [EObject current=null] : iv_ruleMarkS= ruleMarkS EOF ;
    public final EObject entryRuleMarkS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkS = null;


        try {
            // InternalShortDSLParser.g:1742:46: (iv_ruleMarkS= ruleMarkS EOF )
            // InternalShortDSLParser.g:1743:2: iv_ruleMarkS= ruleMarkS EOF
            {
             newCompositeNode(grammarAccess.getMarkSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarkS=ruleMarkS();

            state._fsp--;

             current =iv_ruleMarkS; 
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
    // $ANTLR end "entryRuleMarkS"


    // $ANTLR start "ruleMarkS"
    // InternalShortDSLParser.g:1749:1: ruleMarkS returns [EObject current=null] : (this_MarkVariableValueS_0= ruleMarkVariableValueS | this_MarkCameraValueS_1= ruleMarkCameraValueS ) ;
    public final EObject ruleMarkS() throws RecognitionException {
        EObject current = null;

        EObject this_MarkVariableValueS_0 = null;

        EObject this_MarkCameraValueS_1 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1755:2: ( (this_MarkVariableValueS_0= ruleMarkVariableValueS | this_MarkCameraValueS_1= ruleMarkCameraValueS ) )
            // InternalShortDSLParser.g:1756:2: (this_MarkVariableValueS_0= ruleMarkVariableValueS | this_MarkCameraValueS_1= ruleMarkCameraValueS )
            {
            // InternalShortDSLParser.g:1756:2: (this_MarkVariableValueS_0= ruleMarkVariableValueS | this_MarkCameraValueS_1= ruleMarkCameraValueS )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==Scan) ) {
                    alt25=2;
                }
                else if ( (LA25_1==LeftParenthesis) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalShortDSLParser.g:1757:3: this_MarkVariableValueS_0= ruleMarkVariableValueS
                    {

                    			newCompositeNode(grammarAccess.getMarkSAccess().getMarkVariableValueSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MarkVariableValueS_0=ruleMarkVariableValueS();

                    state._fsp--;


                    			current = this_MarkVariableValueS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1766:3: this_MarkCameraValueS_1= ruleMarkCameraValueS
                    {

                    			newCompositeNode(grammarAccess.getMarkSAccess().getMarkCameraValueSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MarkCameraValueS_1=ruleMarkCameraValueS();

                    state._fsp--;


                    			current = this_MarkCameraValueS_1;
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
    // $ANTLR end "ruleMarkS"


    // $ANTLR start "entryRuleMarkVariableValueS"
    // InternalShortDSLParser.g:1778:1: entryRuleMarkVariableValueS returns [EObject current=null] : iv_ruleMarkVariableValueS= ruleMarkVariableValueS EOF ;
    public final EObject entryRuleMarkVariableValueS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkVariableValueS = null;


        try {
            // InternalShortDSLParser.g:1778:59: (iv_ruleMarkVariableValueS= ruleMarkVariableValueS EOF )
            // InternalShortDSLParser.g:1779:2: iv_ruleMarkVariableValueS= ruleMarkVariableValueS EOF
            {
             newCompositeNode(grammarAccess.getMarkVariableValueSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarkVariableValueS=ruleMarkVariableValueS();

            state._fsp--;

             current =iv_ruleMarkVariableValueS; 
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
    // $ANTLR end "entryRuleMarkVariableValueS"


    // $ANTLR start "ruleMarkVariableValueS"
    // InternalShortDSLParser.g:1785:1: ruleMarkVariableValueS returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_value_3_0= ruleValueSlotS ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTIME_UNIT_S ) ) )? otherlv_7= RightParenthesis ) ;
    public final EObject ruleMarkVariableValueS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_time_5_0=null;
        Token otherlv_7=null;
        EObject lv_value_3_0 = null;

        Enumerator lv_unit_6_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1791:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_value_3_0= ruleValueSlotS ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTIME_UNIT_S ) ) )? otherlv_7= RightParenthesis ) )
            // InternalShortDSLParser.g:1792:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_value_3_0= ruleValueSlotS ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTIME_UNIT_S ) ) )? otherlv_7= RightParenthesis )
            {
            // InternalShortDSLParser.g:1792:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_value_3_0= ruleValueSlotS ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTIME_UNIT_S ) ) )? otherlv_7= RightParenthesis )
            // InternalShortDSLParser.g:1793:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_value_3_0= ruleValueSlotS ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTIME_UNIT_S ) ) )? otherlv_7= RightParenthesis
            {
            // InternalShortDSLParser.g:1793:3: ()
            // InternalShortDSLParser.g:1794:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarkVariableValueSAccess().getMarkVariableValueAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1800:3: ( (otherlv_1= RULE_ID ) )
            // InternalShortDSLParser.g:1801:4: (otherlv_1= RULE_ID )
            {
            // InternalShortDSLParser.g:1801:4: (otherlv_1= RULE_ID )
            // InternalShortDSLParser.g:1802:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMarkVariableValueSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_1, grammarAccess.getMarkVariableValueSAccess().getVariableVariableSCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getMarkVariableValueSAccess().getLeftParenthesisKeyword_2());
            		
            // InternalShortDSLParser.g:1817:3: ( (lv_value_3_0= ruleValueSlotS ) )
            // InternalShortDSLParser.g:1818:4: (lv_value_3_0= ruleValueSlotS )
            {
            // InternalShortDSLParser.g:1818:4: (lv_value_3_0= ruleValueSlotS )
            // InternalShortDSLParser.g:1819:5: lv_value_3_0= ruleValueSlotS
            {

            					newCompositeNode(grammarAccess.getMarkVariableValueSAccess().getValueValueSlotSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_value_3_0=ruleValueSlotS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMarkVariableValueSRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.ValueSlotS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:1836:3: (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTIME_UNIT_S ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Comma) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalShortDSLParser.g:1837:4: otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTIME_UNIT_S ) )
                    {
                    otherlv_4=(Token)match(input,Comma,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getMarkVariableValueSAccess().getCommaKeyword_4_0());
                    			
                    // InternalShortDSLParser.g:1841:4: ( (lv_time_5_0= RULE_INT ) )
                    // InternalShortDSLParser.g:1842:5: (lv_time_5_0= RULE_INT )
                    {
                    // InternalShortDSLParser.g:1842:5: (lv_time_5_0= RULE_INT )
                    // InternalShortDSLParser.g:1843:6: lv_time_5_0= RULE_INT
                    {
                    lv_time_5_0=(Token)match(input,RULE_INT,FOLLOW_32); 

                    						newLeafNode(lv_time_5_0, grammarAccess.getMarkVariableValueSAccess().getTimeINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMarkVariableValueSRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"time",
                    							lv_time_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalShortDSLParser.g:1859:4: ( (lv_unit_6_0= ruleTIME_UNIT_S ) )
                    // InternalShortDSLParser.g:1860:5: (lv_unit_6_0= ruleTIME_UNIT_S )
                    {
                    // InternalShortDSLParser.g:1860:5: (lv_unit_6_0= ruleTIME_UNIT_S )
                    // InternalShortDSLParser.g:1861:6: lv_unit_6_0= ruleTIME_UNIT_S
                    {

                    						newCompositeNode(grammarAccess.getMarkVariableValueSAccess().getUnitTIME_UNIT_SEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_unit_6_0=ruleTIME_UNIT_S();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarkVariableValueSRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_6_0,
                    							"xtext.factoryLang.shortDSL.ShortDSL.TIME_UNIT_S");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMarkVariableValueSAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleMarkVariableValueS"


    // $ANTLR start "entryRuleMarkCameraValueS"
    // InternalShortDSLParser.g:1887:1: entryRuleMarkCameraValueS returns [EObject current=null] : iv_ruleMarkCameraValueS= ruleMarkCameraValueS EOF ;
    public final EObject entryRuleMarkCameraValueS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkCameraValueS = null;


        try {
            // InternalShortDSLParser.g:1887:57: (iv_ruleMarkCameraValueS= ruleMarkCameraValueS EOF )
            // InternalShortDSLParser.g:1888:2: iv_ruleMarkCameraValueS= ruleMarkCameraValueS EOF
            {
             newCompositeNode(grammarAccess.getMarkCameraValueSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarkCameraValueS=ruleMarkCameraValueS();

            state._fsp--;

             current =iv_ruleMarkCameraValueS; 
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
    // $ANTLR end "entryRuleMarkCameraValueS"


    // $ANTLR start "ruleMarkCameraValueS"
    // InternalShortDSLParser.g:1894:1: ruleMarkCameraValueS returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Scan ( (lv_variable_3_0= ruleLocalVariableS ) ) ) ;
    public final EObject ruleMarkCameraValueS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1900:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Scan ( (lv_variable_3_0= ruleLocalVariableS ) ) ) )
            // InternalShortDSLParser.g:1901:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Scan ( (lv_variable_3_0= ruleLocalVariableS ) ) )
            {
            // InternalShortDSLParser.g:1901:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Scan ( (lv_variable_3_0= ruleLocalVariableS ) ) )
            // InternalShortDSLParser.g:1902:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Scan ( (lv_variable_3_0= ruleLocalVariableS ) )
            {
            // InternalShortDSLParser.g:1902:3: ()
            // InternalShortDSLParser.g:1903:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarkCameraValueSAccess().getMarkCameraValueAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1909:3: ( (otherlv_1= RULE_ID ) )
            // InternalShortDSLParser.g:1910:4: (otherlv_1= RULE_ID )
            {
            // InternalShortDSLParser.g:1910:4: (otherlv_1= RULE_ID )
            // InternalShortDSLParser.g:1911:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMarkCameraValueSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_1, grammarAccess.getMarkCameraValueSAccess().getCameraCameraCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,Scan,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMarkCameraValueSAccess().getScanKeyword_2());
            		
            // InternalShortDSLParser.g:1926:3: ( (lv_variable_3_0= ruleLocalVariableS ) )
            // InternalShortDSLParser.g:1927:4: (lv_variable_3_0= ruleLocalVariableS )
            {
            // InternalShortDSLParser.g:1927:4: (lv_variable_3_0= ruleLocalVariableS )
            // InternalShortDSLParser.g:1928:5: lv_variable_3_0= ruleLocalVariableS
            {

            					newCompositeNode(grammarAccess.getMarkCameraValueSAccess().getVariableLocalVariableSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_variable_3_0=ruleLocalVariableS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMarkCameraValueSRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_3_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.LocalVariableS");
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
    // $ANTLR end "ruleMarkCameraValueS"


    // $ANTLR start "entryRuleLocalVariableS"
    // InternalShortDSLParser.g:1949:1: entryRuleLocalVariableS returns [EObject current=null] : iv_ruleLocalVariableS= ruleLocalVariableS EOF ;
    public final EObject entryRuleLocalVariableS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableS = null;


        try {
            // InternalShortDSLParser.g:1949:55: (iv_ruleLocalVariableS= ruleLocalVariableS EOF )
            // InternalShortDSLParser.g:1950:2: iv_ruleLocalVariableS= ruleLocalVariableS EOF
            {
             newCompositeNode(grammarAccess.getLocalVariableSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalVariableS=ruleLocalVariableS();

            state._fsp--;

             current =iv_ruleLocalVariableS; 
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
    // $ANTLR end "entryRuleLocalVariableS"


    // $ANTLR start "ruleLocalVariableS"
    // InternalShortDSLParser.g:1956:1: ruleLocalVariableS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLocalVariableS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:1962:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:1963:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:1963:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalShortDSLParser.g:1964:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalShortDSLParser.g:1964:3: ()
            // InternalShortDSLParser.g:1965:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocalVariableSAccess().getLocalVariableAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1971:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:1972:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:1972:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:1973:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLocalVariableSAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalVariableSRule());
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
    // $ANTLR end "ruleLocalVariableS"


    // $ANTLR start "entryRuleGlobalVariableS"
    // InternalShortDSLParser.g:1993:1: entryRuleGlobalVariableS returns [EObject current=null] : iv_ruleGlobalVariableS= ruleGlobalVariableS EOF ;
    public final EObject entryRuleGlobalVariableS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalVariableS = null;


        try {
            // InternalShortDSLParser.g:1993:56: (iv_ruleGlobalVariableS= ruleGlobalVariableS EOF )
            // InternalShortDSLParser.g:1994:2: iv_ruleGlobalVariableS= ruleGlobalVariableS EOF
            {
             newCompositeNode(grammarAccess.getGlobalVariableSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalVariableS=ruleGlobalVariableS();

            state._fsp--;

             current =iv_ruleGlobalVariableS; 
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
    // $ANTLR end "entryRuleGlobalVariableS"


    // $ANTLR start "ruleGlobalVariableS"
    // InternalShortDSLParser.g:2000:1: ruleGlobalVariableS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGlobalVariableS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:2006:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:2007:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:2007:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalShortDSLParser.g:2008:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalShortDSLParser.g:2008:3: ()
            // InternalShortDSLParser.g:2009:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalVariableSAccess().getGlobalVariableAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:2015:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:2016:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:2016:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:2017:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGlobalVariableSAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalVariableSRule());
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
    // $ANTLR end "ruleGlobalVariableS"


    // $ANTLR start "entryRuleVariableValueS"
    // InternalShortDSLParser.g:2037:1: entryRuleVariableValueS returns [EObject current=null] : iv_ruleVariableValueS= ruleVariableValueS EOF ;
    public final EObject entryRuleVariableValueS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValueS = null;


        try {
            // InternalShortDSLParser.g:2037:55: (iv_ruleVariableValueS= ruleVariableValueS EOF )
            // InternalShortDSLParser.g:2038:2: iv_ruleVariableValueS= ruleVariableValueS EOF
            {
             newCompositeNode(grammarAccess.getVariableValueSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableValueS=ruleVariableValueS();

            state._fsp--;

             current =iv_ruleVariableValueS; 
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
    // $ANTLR end "entryRuleVariableValueS"


    // $ANTLR start "ruleVariableValueS"
    // InternalShortDSLParser.g:2044:1: ruleVariableValueS returns [EObject current=null] : ( ( (lv_value_0_0= ruleDiskSlotStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) | ( (lv_value_2_0= ruleNumberS ) ) | ( (lv_value_3_0= ruleDiskStateValueS ) ) | ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleVariableValueS() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:2050:2: ( ( ( (lv_value_0_0= ruleDiskSlotStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) | ( (lv_value_2_0= ruleNumberS ) ) | ( (lv_value_3_0= ruleDiskStateValueS ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:2051:2: ( ( (lv_value_0_0= ruleDiskSlotStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) | ( (lv_value_2_0= ruleNumberS ) ) | ( (lv_value_3_0= ruleDiskStateValueS ) ) | ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:2051:2: ( ( (lv_value_0_0= ruleDiskSlotStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) | ( (lv_value_2_0= ruleNumberS ) ) | ( (lv_value_3_0= ruleDiskStateValueS ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case In_progress:
            case Complete:
            case Free:
                {
                alt27=1;
                }
                break;
            case Green:
            case Blue:
            case Red:
                {
                alt27=2;
                }
                break;
            case RULE_INT:
                {
                alt27=3;
                }
                break;
            case Empty:
            case Full:
                {
                alt27=4;
                }
                break;
            case RULE_ID:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalShortDSLParser.g:2052:3: ( (lv_value_0_0= ruleDiskSlotStateValueS ) )
                    {
                    // InternalShortDSLParser.g:2052:3: ( (lv_value_0_0= ruleDiskSlotStateValueS ) )
                    // InternalShortDSLParser.g:2053:4: (lv_value_0_0= ruleDiskSlotStateValueS )
                    {
                    // InternalShortDSLParser.g:2053:4: (lv_value_0_0= ruleDiskSlotStateValueS )
                    // InternalShortDSLParser.g:2054:5: lv_value_0_0= ruleDiskSlotStateValueS
                    {

                    					newCompositeNode(grammarAccess.getVariableValueSAccess().getValueDiskSlotStateValueSParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleDiskSlotStateValueS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableValueSRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"xtext.factoryLang.shortDSL.ShortDSL.DiskSlotStateValueS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2072:3: ( (lv_value_1_0= ruleColorValueS ) )
                    {
                    // InternalShortDSLParser.g:2072:3: ( (lv_value_1_0= ruleColorValueS ) )
                    // InternalShortDSLParser.g:2073:4: (lv_value_1_0= ruleColorValueS )
                    {
                    // InternalShortDSLParser.g:2073:4: (lv_value_1_0= ruleColorValueS )
                    // InternalShortDSLParser.g:2074:5: lv_value_1_0= ruleColorValueS
                    {

                    					newCompositeNode(grammarAccess.getVariableValueSAccess().getValueColorValueSParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleColorValueS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableValueSRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"xtext.factoryLang.shortDSL.ShortDSL.ColorValueS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:2092:3: ( (lv_value_2_0= ruleNumberS ) )
                    {
                    // InternalShortDSLParser.g:2092:3: ( (lv_value_2_0= ruleNumberS ) )
                    // InternalShortDSLParser.g:2093:4: (lv_value_2_0= ruleNumberS )
                    {
                    // InternalShortDSLParser.g:2093:4: (lv_value_2_0= ruleNumberS )
                    // InternalShortDSLParser.g:2094:5: lv_value_2_0= ruleNumberS
                    {

                    					newCompositeNode(grammarAccess.getVariableValueSAccess().getValueNumberSParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleNumberS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableValueSRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"xtext.factoryLang.shortDSL.ShortDSL.NumberS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalShortDSLParser.g:2112:3: ( (lv_value_3_0= ruleDiskStateValueS ) )
                    {
                    // InternalShortDSLParser.g:2112:3: ( (lv_value_3_0= ruleDiskStateValueS ) )
                    // InternalShortDSLParser.g:2113:4: (lv_value_3_0= ruleDiskStateValueS )
                    {
                    // InternalShortDSLParser.g:2113:4: (lv_value_3_0= ruleDiskStateValueS )
                    // InternalShortDSLParser.g:2114:5: lv_value_3_0= ruleDiskStateValueS
                    {

                    					newCompositeNode(grammarAccess.getVariableValueSAccess().getValueDiskStateValueSParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleDiskStateValueS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableValueSRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"xtext.factoryLang.shortDSL.ShortDSL.DiskStateValueS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalShortDSLParser.g:2132:3: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalShortDSLParser.g:2132:3: ( (otherlv_4= RULE_ID ) )
                    // InternalShortDSLParser.g:2133:4: (otherlv_4= RULE_ID )
                    {
                    // InternalShortDSLParser.g:2133:4: (otherlv_4= RULE_ID )
                    // InternalShortDSLParser.g:2134:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableValueSRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getVariableValueSAccess().getRefVariableSCrossReference_4_0());
                    				

                    }


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
    // $ANTLR end "ruleVariableValueS"


    // $ANTLR start "entryRuleDeviceValueS"
    // InternalShortDSLParser.g:2149:1: entryRuleDeviceValueS returns [EObject current=null] : iv_ruleDeviceValueS= ruleDeviceValueS EOF ;
    public final EObject entryRuleDeviceValueS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceValueS = null;


        try {
            // InternalShortDSLParser.g:2149:53: (iv_ruleDeviceValueS= ruleDeviceValueS EOF )
            // InternalShortDSLParser.g:2150:2: iv_ruleDeviceValueS= ruleDeviceValueS EOF
            {
             newCompositeNode(grammarAccess.getDeviceValueSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceValueS=ruleDeviceValueS();

            state._fsp--;

             current =iv_ruleDeviceValueS; 
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
    // $ANTLR end "entryRuleDeviceValueS"


    // $ANTLR start "ruleDeviceValueS"
    // InternalShortDSLParser.g:2156:1: ruleDeviceValueS returns [EObject current=null] : ( ( (lv_value_0_0= ruleDiskStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDeviceValueS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:2162:2: ( ( ( (lv_value_0_0= ruleDiskStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:2163:2: ( ( (lv_value_0_0= ruleDiskStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:2163:2: ( ( (lv_value_0_0= ruleDiskStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case Empty:
            case Full:
                {
                alt28=1;
                }
                break;
            case Green:
            case Blue:
            case Red:
                {
                alt28=2;
                }
                break;
            case RULE_ID:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalShortDSLParser.g:2164:3: ( (lv_value_0_0= ruleDiskStateValueS ) )
                    {
                    // InternalShortDSLParser.g:2164:3: ( (lv_value_0_0= ruleDiskStateValueS ) )
                    // InternalShortDSLParser.g:2165:4: (lv_value_0_0= ruleDiskStateValueS )
                    {
                    // InternalShortDSLParser.g:2165:4: (lv_value_0_0= ruleDiskStateValueS )
                    // InternalShortDSLParser.g:2166:5: lv_value_0_0= ruleDiskStateValueS
                    {

                    					newCompositeNode(grammarAccess.getDeviceValueSAccess().getValueDiskStateValueSParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleDiskStateValueS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeviceValueSRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"xtext.factoryLang.shortDSL.ShortDSL.DiskStateValueS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2184:3: ( (lv_value_1_0= ruleColorValueS ) )
                    {
                    // InternalShortDSLParser.g:2184:3: ( (lv_value_1_0= ruleColorValueS ) )
                    // InternalShortDSLParser.g:2185:4: (lv_value_1_0= ruleColorValueS )
                    {
                    // InternalShortDSLParser.g:2185:4: (lv_value_1_0= ruleColorValueS )
                    // InternalShortDSLParser.g:2186:5: lv_value_1_0= ruleColorValueS
                    {

                    					newCompositeNode(grammarAccess.getDeviceValueSAccess().getValueColorValueSParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleColorValueS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeviceValueSRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"xtext.factoryLang.shortDSL.ShortDSL.ColorValueS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:2204:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalShortDSLParser.g:2204:3: ( (otherlv_2= RULE_ID ) )
                    // InternalShortDSLParser.g:2205:4: (otherlv_2= RULE_ID )
                    {
                    // InternalShortDSLParser.g:2205:4: (otherlv_2= RULE_ID )
                    // InternalShortDSLParser.g:2206:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDeviceValueSRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getDeviceValueSAccess().getConfigurationValueConfigurationValueSCrossReference_2_0());
                    				

                    }


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
    // $ANTLR end "ruleDeviceValueS"


    // $ANTLR start "entryRuleValueSlotS"
    // InternalShortDSLParser.g:2221:1: entryRuleValueSlotS returns [EObject current=null] : iv_ruleValueSlotS= ruleValueSlotS EOF ;
    public final EObject entryRuleValueSlotS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSlotS = null;


        try {
            // InternalShortDSLParser.g:2221:51: (iv_ruleValueSlotS= ruleValueSlotS EOF )
            // InternalShortDSLParser.g:2222:2: iv_ruleValueSlotS= ruleValueSlotS EOF
            {
             newCompositeNode(grammarAccess.getValueSlotSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueSlotS=ruleValueSlotS();

            state._fsp--;

             current =iv_ruleValueSlotS; 
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
    // $ANTLR end "entryRuleValueSlotS"


    // $ANTLR start "ruleValueSlotS"
    // InternalShortDSLParser.g:2228:1: ruleValueSlotS returns [EObject current=null] : ( ( (lv_value_0_0= ruleDiskSlotStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) ) ;
    public final EObject ruleValueSlotS() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:2234:2: ( ( ( (lv_value_0_0= ruleDiskSlotStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) ) )
            // InternalShortDSLParser.g:2235:2: ( ( (lv_value_0_0= ruleDiskSlotStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) )
            {
            // InternalShortDSLParser.g:2235:2: ( ( (lv_value_0_0= ruleDiskSlotStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=In_progress && LA29_0<=Complete)||LA29_0==Free) ) {
                alt29=1;
            }
            else if ( (LA29_0==Green||LA29_0==Blue||LA29_0==Red) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalShortDSLParser.g:2236:3: ( (lv_value_0_0= ruleDiskSlotStateValueS ) )
                    {
                    // InternalShortDSLParser.g:2236:3: ( (lv_value_0_0= ruleDiskSlotStateValueS ) )
                    // InternalShortDSLParser.g:2237:4: (lv_value_0_0= ruleDiskSlotStateValueS )
                    {
                    // InternalShortDSLParser.g:2237:4: (lv_value_0_0= ruleDiskSlotStateValueS )
                    // InternalShortDSLParser.g:2238:5: lv_value_0_0= ruleDiskSlotStateValueS
                    {

                    					newCompositeNode(grammarAccess.getValueSlotSAccess().getValueDiskSlotStateValueSParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleDiskSlotStateValueS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueSlotSRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"xtext.factoryLang.shortDSL.ShortDSL.DiskSlotStateValueS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2256:3: ( (lv_value_1_0= ruleColorValueS ) )
                    {
                    // InternalShortDSLParser.g:2256:3: ( (lv_value_1_0= ruleColorValueS ) )
                    // InternalShortDSLParser.g:2257:4: (lv_value_1_0= ruleColorValueS )
                    {
                    // InternalShortDSLParser.g:2257:4: (lv_value_1_0= ruleColorValueS )
                    // InternalShortDSLParser.g:2258:5: lv_value_1_0= ruleColorValueS
                    {

                    					newCompositeNode(grammarAccess.getValueSlotSAccess().getValueColorValueSParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleColorValueS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueSlotSRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"xtext.factoryLang.shortDSL.ShortDSL.ColorValueS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleValueSlotS"


    // $ANTLR start "entryRuleDSLTypeValue"
    // InternalShortDSLParser.g:2279:1: entryRuleDSLTypeValue returns [EObject current=null] : iv_ruleDSLTypeValue= ruleDSLTypeValue EOF ;
    public final EObject entryRuleDSLTypeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLTypeValue = null;


        try {
            // InternalShortDSLParser.g:2279:53: (iv_ruleDSLTypeValue= ruleDSLTypeValue EOF )
            // InternalShortDSLParser.g:2280:2: iv_ruleDSLTypeValue= ruleDSLTypeValue EOF
            {
             newCompositeNode(grammarAccess.getDSLTypeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLTypeValue=ruleDSLTypeValue();

            state._fsp--;

             current =iv_ruleDSLTypeValue; 
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
    // $ANTLR end "entryRuleDSLTypeValue"


    // $ANTLR start "ruleDSLTypeValue"
    // InternalShortDSLParser.g:2286:1: ruleDSLTypeValue returns [EObject current=null] : ( (lv_value_0_0= ruleDSL_TYPE_ENUM ) ) ;
    public final EObject ruleDSLTypeValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:2292:2: ( ( (lv_value_0_0= ruleDSL_TYPE_ENUM ) ) )
            // InternalShortDSLParser.g:2293:2: ( (lv_value_0_0= ruleDSL_TYPE_ENUM ) )
            {
            // InternalShortDSLParser.g:2293:2: ( (lv_value_0_0= ruleDSL_TYPE_ENUM ) )
            // InternalShortDSLParser.g:2294:3: (lv_value_0_0= ruleDSL_TYPE_ENUM )
            {
            // InternalShortDSLParser.g:2294:3: (lv_value_0_0= ruleDSL_TYPE_ENUM )
            // InternalShortDSLParser.g:2295:4: lv_value_0_0= ruleDSL_TYPE_ENUM
            {

            				newCompositeNode(grammarAccess.getDSLTypeValueAccess().getValueDSL_TYPE_ENUMEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDSL_TYPE_ENUM();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDSLTypeValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"xtext.factoryLang.shortDSL.ShortDSL.DSL_TYPE_ENUM");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleDSLTypeValue"


    // $ANTLR start "entryRuleDiskStateValueS"
    // InternalShortDSLParser.g:2315:1: entryRuleDiskStateValueS returns [EObject current=null] : iv_ruleDiskStateValueS= ruleDiskStateValueS EOF ;
    public final EObject entryRuleDiskStateValueS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskStateValueS = null;


        try {
            // InternalShortDSLParser.g:2315:56: (iv_ruleDiskStateValueS= ruleDiskStateValueS EOF )
            // InternalShortDSLParser.g:2316:2: iv_ruleDiskStateValueS= ruleDiskStateValueS EOF
            {
             newCompositeNode(grammarAccess.getDiskStateValueSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskStateValueS=ruleDiskStateValueS();

            state._fsp--;

             current =iv_ruleDiskStateValueS; 
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
    // $ANTLR end "entryRuleDiskStateValueS"


    // $ANTLR start "ruleDiskStateValueS"
    // InternalShortDSLParser.g:2322:1: ruleDiskStateValueS returns [EObject current=null] : ( (lv_value_0_0= ruleDISK_STATES_S ) ) ;
    public final EObject ruleDiskStateValueS() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:2328:2: ( ( (lv_value_0_0= ruleDISK_STATES_S ) ) )
            // InternalShortDSLParser.g:2329:2: ( (lv_value_0_0= ruleDISK_STATES_S ) )
            {
            // InternalShortDSLParser.g:2329:2: ( (lv_value_0_0= ruleDISK_STATES_S ) )
            // InternalShortDSLParser.g:2330:3: (lv_value_0_0= ruleDISK_STATES_S )
            {
            // InternalShortDSLParser.g:2330:3: (lv_value_0_0= ruleDISK_STATES_S )
            // InternalShortDSLParser.g:2331:4: lv_value_0_0= ruleDISK_STATES_S
            {

            				newCompositeNode(grammarAccess.getDiskStateValueSAccess().getValueDISK_STATES_SEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDISK_STATES_S();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDiskStateValueSRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"xtext.factoryLang.shortDSL.ShortDSL.DISK_STATES_S");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleDiskStateValueS"


    // $ANTLR start "entryRuleDiskSlotStateValueS"
    // InternalShortDSLParser.g:2351:1: entryRuleDiskSlotStateValueS returns [EObject current=null] : iv_ruleDiskSlotStateValueS= ruleDiskSlotStateValueS EOF ;
    public final EObject entryRuleDiskSlotStateValueS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskSlotStateValueS = null;


        try {
            // InternalShortDSLParser.g:2351:60: (iv_ruleDiskSlotStateValueS= ruleDiskSlotStateValueS EOF )
            // InternalShortDSLParser.g:2352:2: iv_ruleDiskSlotStateValueS= ruleDiskSlotStateValueS EOF
            {
             newCompositeNode(grammarAccess.getDiskSlotStateValueSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskSlotStateValueS=ruleDiskSlotStateValueS();

            state._fsp--;

             current =iv_ruleDiskSlotStateValueS; 
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
    // $ANTLR end "entryRuleDiskSlotStateValueS"


    // $ANTLR start "ruleDiskSlotStateValueS"
    // InternalShortDSLParser.g:2358:1: ruleDiskSlotStateValueS returns [EObject current=null] : ( (lv_value_0_0= ruleDISK_SLOT_STATES_S ) ) ;
    public final EObject ruleDiskSlotStateValueS() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:2364:2: ( ( (lv_value_0_0= ruleDISK_SLOT_STATES_S ) ) )
            // InternalShortDSLParser.g:2365:2: ( (lv_value_0_0= ruleDISK_SLOT_STATES_S ) )
            {
            // InternalShortDSLParser.g:2365:2: ( (lv_value_0_0= ruleDISK_SLOT_STATES_S ) )
            // InternalShortDSLParser.g:2366:3: (lv_value_0_0= ruleDISK_SLOT_STATES_S )
            {
            // InternalShortDSLParser.g:2366:3: (lv_value_0_0= ruleDISK_SLOT_STATES_S )
            // InternalShortDSLParser.g:2367:4: lv_value_0_0= ruleDISK_SLOT_STATES_S
            {

            				newCompositeNode(grammarAccess.getDiskSlotStateValueSAccess().getValueDISK_SLOT_STATES_SEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDISK_SLOT_STATES_S();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDiskSlotStateValueSRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"xtext.factoryLang.shortDSL.ShortDSL.DISK_SLOT_STATES_S");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleDiskSlotStateValueS"


    // $ANTLR start "entryRuleColorValueS"
    // InternalShortDSLParser.g:2387:1: entryRuleColorValueS returns [EObject current=null] : iv_ruleColorValueS= ruleColorValueS EOF ;
    public final EObject entryRuleColorValueS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorValueS = null;


        try {
            // InternalShortDSLParser.g:2387:52: (iv_ruleColorValueS= ruleColorValueS EOF )
            // InternalShortDSLParser.g:2388:2: iv_ruleColorValueS= ruleColorValueS EOF
            {
             newCompositeNode(grammarAccess.getColorValueSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorValueS=ruleColorValueS();

            state._fsp--;

             current =iv_ruleColorValueS; 
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
    // $ANTLR end "entryRuleColorValueS"


    // $ANTLR start "ruleColorValueS"
    // InternalShortDSLParser.g:2394:1: ruleColorValueS returns [EObject current=null] : ( (lv_value_0_0= ruleCOLOR_S ) ) ;
    public final EObject ruleColorValueS() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:2400:2: ( ( (lv_value_0_0= ruleCOLOR_S ) ) )
            // InternalShortDSLParser.g:2401:2: ( (lv_value_0_0= ruleCOLOR_S ) )
            {
            // InternalShortDSLParser.g:2401:2: ( (lv_value_0_0= ruleCOLOR_S ) )
            // InternalShortDSLParser.g:2402:3: (lv_value_0_0= ruleCOLOR_S )
            {
            // InternalShortDSLParser.g:2402:3: (lv_value_0_0= ruleCOLOR_S )
            // InternalShortDSLParser.g:2403:4: lv_value_0_0= ruleCOLOR_S
            {

            				newCompositeNode(grammarAccess.getColorValueSAccess().getValueCOLOR_SEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleCOLOR_S();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getColorValueSRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"xtext.factoryLang.shortDSL.ShortDSL.COLOR_S");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleColorValueS"


    // $ANTLR start "entryRuleNumberS"
    // InternalShortDSLParser.g:2423:1: entryRuleNumberS returns [EObject current=null] : iv_ruleNumberS= ruleNumberS EOF ;
    public final EObject entryRuleNumberS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberS = null;


        try {
            // InternalShortDSLParser.g:2423:48: (iv_ruleNumberS= ruleNumberS EOF )
            // InternalShortDSLParser.g:2424:2: iv_ruleNumberS= ruleNumberS EOF
            {
             newCompositeNode(grammarAccess.getNumberSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberS=ruleNumberS();

            state._fsp--;

             current =iv_ruleNumberS; 
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
    // $ANTLR end "entryRuleNumberS"


    // $ANTLR start "ruleNumberS"
    // InternalShortDSLParser.g:2430:1: ruleNumberS returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberS() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:2436:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalShortDSLParser.g:2437:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalShortDSLParser.g:2437:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalShortDSLParser.g:2438:3: (lv_value_0_0= RULE_INT )
            {
            // InternalShortDSLParser.g:2438:3: (lv_value_0_0= RULE_INT )
            // InternalShortDSLParser.g:2439:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberSAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberSRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleNumberS"


    // $ANTLR start "ruleDSL_TYPE_ENUM"
    // InternalShortDSLParser.g:2458:1: ruleDSL_TYPE_ENUM returns [Enumerator current=null] : ( (enumLiteral_0= Long ) | (enumLiteral_1= Short ) ) ;
    public final Enumerator ruleDSL_TYPE_ENUM() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:2464:2: ( ( (enumLiteral_0= Long ) | (enumLiteral_1= Short ) ) )
            // InternalShortDSLParser.g:2465:2: ( (enumLiteral_0= Long ) | (enumLiteral_1= Short ) )
            {
            // InternalShortDSLParser.g:2465:2: ( (enumLiteral_0= Long ) | (enumLiteral_1= Short ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Long) ) {
                alt30=1;
            }
            else if ( (LA30_0==Short) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalShortDSLParser.g:2466:3: (enumLiteral_0= Long )
                    {
                    // InternalShortDSLParser.g:2466:3: (enumLiteral_0= Long )
                    // InternalShortDSLParser.g:2467:4: enumLiteral_0= Long
                    {
                    enumLiteral_0=(Token)match(input,Long,FOLLOW_2); 

                    				current = grammarAccess.getDSL_TYPE_ENUMAccess().getLONGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDSL_TYPE_ENUMAccess().getLONGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2474:3: (enumLiteral_1= Short )
                    {
                    // InternalShortDSLParser.g:2474:3: (enumLiteral_1= Short )
                    // InternalShortDSLParser.g:2475:4: enumLiteral_1= Short
                    {
                    enumLiteral_1=(Token)match(input,Short,FOLLOW_2); 

                    				current = grammarAccess.getDSL_TYPE_ENUMAccess().getSHORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDSL_TYPE_ENUMAccess().getSHORTEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleDSL_TYPE_ENUM"


    // $ANTLR start "ruleCOMPARISON_OPERATOR_S"
    // InternalShortDSLParser.g:2485:1: ruleCOMPARISON_OPERATOR_S returns [Enumerator current=null] : ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) ) ;
    public final Enumerator ruleCOMPARISON_OPERATOR_S() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:2491:2: ( ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) ) )
            // InternalShortDSLParser.g:2492:2: ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) )
            {
            // InternalShortDSLParser.g:2492:2: ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case EqualsSign:
                {
                alt31=1;
                }
                break;
            case LessThanSign:
                {
                alt31=2;
                }
                break;
            case GreaterThanSign:
                {
                alt31=3;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalShortDSLParser.g:2493:3: (enumLiteral_0= EqualsSign )
                    {
                    // InternalShortDSLParser.g:2493:3: (enumLiteral_0= EqualsSign )
                    // InternalShortDSLParser.g:2494:4: enumLiteral_0= EqualsSign
                    {
                    enumLiteral_0=(Token)match(input,EqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPERATOR_SAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOMPARISON_OPERATOR_SAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2501:3: (enumLiteral_1= LessThanSign )
                    {
                    // InternalShortDSLParser.g:2501:3: (enumLiteral_1= LessThanSign )
                    // InternalShortDSLParser.g:2502:4: enumLiteral_1= LessThanSign
                    {
                    enumLiteral_1=(Token)match(input,LessThanSign,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPERATOR_SAccess().getLESS_THANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOMPARISON_OPERATOR_SAccess().getLESS_THANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:2509:3: (enumLiteral_2= GreaterThanSign )
                    {
                    // InternalShortDSLParser.g:2509:3: (enumLiteral_2= GreaterThanSign )
                    // InternalShortDSLParser.g:2510:4: enumLiteral_2= GreaterThanSign
                    {
                    enumLiteral_2=(Token)match(input,GreaterThanSign,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPERATOR_SAccess().getGREATER_THANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOMPARISON_OPERATOR_SAccess().getGREATER_THANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalShortDSLParser.g:2517:3: (enumLiteral_3= ExclamationMarkEqualsSign )
                    {
                    // InternalShortDSLParser.g:2517:3: (enumLiteral_3= ExclamationMarkEqualsSign )
                    // InternalShortDSLParser.g:2518:4: enumLiteral_3= ExclamationMarkEqualsSign
                    {
                    enumLiteral_3=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPERATOR_SAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCOMPARISON_OPERATOR_SAccess().getNOTEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleCOMPARISON_OPERATOR_S"


    // $ANTLR start "ruleCOLOR_S"
    // InternalShortDSLParser.g:2528:1: ruleCOLOR_S returns [Enumerator current=null] : ( (enumLiteral_0= Red ) | (enumLiteral_1= Green ) | (enumLiteral_2= Blue ) ) ;
    public final Enumerator ruleCOLOR_S() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:2534:2: ( ( (enumLiteral_0= Red ) | (enumLiteral_1= Green ) | (enumLiteral_2= Blue ) ) )
            // InternalShortDSLParser.g:2535:2: ( (enumLiteral_0= Red ) | (enumLiteral_1= Green ) | (enumLiteral_2= Blue ) )
            {
            // InternalShortDSLParser.g:2535:2: ( (enumLiteral_0= Red ) | (enumLiteral_1= Green ) | (enumLiteral_2= Blue ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case Red:
                {
                alt32=1;
                }
                break;
            case Green:
                {
                alt32=2;
                }
                break;
            case Blue:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalShortDSLParser.g:2536:3: (enumLiteral_0= Red )
                    {
                    // InternalShortDSLParser.g:2536:3: (enumLiteral_0= Red )
                    // InternalShortDSLParser.g:2537:4: enumLiteral_0= Red
                    {
                    enumLiteral_0=(Token)match(input,Red,FOLLOW_2); 

                    				current = grammarAccess.getCOLOR_SAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOLOR_SAccess().getREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2544:3: (enumLiteral_1= Green )
                    {
                    // InternalShortDSLParser.g:2544:3: (enumLiteral_1= Green )
                    // InternalShortDSLParser.g:2545:4: enumLiteral_1= Green
                    {
                    enumLiteral_1=(Token)match(input,Green,FOLLOW_2); 

                    				current = grammarAccess.getCOLOR_SAccess().getGREENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOLOR_SAccess().getGREENEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:2552:3: (enumLiteral_2= Blue )
                    {
                    // InternalShortDSLParser.g:2552:3: (enumLiteral_2= Blue )
                    // InternalShortDSLParser.g:2553:4: enumLiteral_2= Blue
                    {
                    enumLiteral_2=(Token)match(input,Blue,FOLLOW_2); 

                    				current = grammarAccess.getCOLOR_SAccess().getBLUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOLOR_SAccess().getBLUEEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleCOLOR_S"


    // $ANTLR start "ruleDISK_SLOT_STATES_S"
    // InternalShortDSLParser.g:2563:1: ruleDISK_SLOT_STATES_S returns [Enumerator current=null] : ( (enumLiteral_0= Free ) | (enumLiteral_1= In_progress ) | (enumLiteral_2= Complete ) ) ;
    public final Enumerator ruleDISK_SLOT_STATES_S() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:2569:2: ( ( (enumLiteral_0= Free ) | (enumLiteral_1= In_progress ) | (enumLiteral_2= Complete ) ) )
            // InternalShortDSLParser.g:2570:2: ( (enumLiteral_0= Free ) | (enumLiteral_1= In_progress ) | (enumLiteral_2= Complete ) )
            {
            // InternalShortDSLParser.g:2570:2: ( (enumLiteral_0= Free ) | (enumLiteral_1= In_progress ) | (enumLiteral_2= Complete ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case Free:
                {
                alt33=1;
                }
                break;
            case In_progress:
                {
                alt33=2;
                }
                break;
            case Complete:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalShortDSLParser.g:2571:3: (enumLiteral_0= Free )
                    {
                    // InternalShortDSLParser.g:2571:3: (enumLiteral_0= Free )
                    // InternalShortDSLParser.g:2572:4: enumLiteral_0= Free
                    {
                    enumLiteral_0=(Token)match(input,Free,FOLLOW_2); 

                    				current = grammarAccess.getDISK_SLOT_STATES_SAccess().getFREEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDISK_SLOT_STATES_SAccess().getFREEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2579:3: (enumLiteral_1= In_progress )
                    {
                    // InternalShortDSLParser.g:2579:3: (enumLiteral_1= In_progress )
                    // InternalShortDSLParser.g:2580:4: enumLiteral_1= In_progress
                    {
                    enumLiteral_1=(Token)match(input,In_progress,FOLLOW_2); 

                    				current = grammarAccess.getDISK_SLOT_STATES_SAccess().getIN_PROGRESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDISK_SLOT_STATES_SAccess().getIN_PROGRESSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:2587:3: (enumLiteral_2= Complete )
                    {
                    // InternalShortDSLParser.g:2587:3: (enumLiteral_2= Complete )
                    // InternalShortDSLParser.g:2588:4: enumLiteral_2= Complete
                    {
                    enumLiteral_2=(Token)match(input,Complete,FOLLOW_2); 

                    				current = grammarAccess.getDISK_SLOT_STATES_SAccess().getCOMPLETEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDISK_SLOT_STATES_SAccess().getCOMPLETEEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleDISK_SLOT_STATES_S"


    // $ANTLR start "ruleDISK_STATES_S"
    // InternalShortDSLParser.g:2598:1: ruleDISK_STATES_S returns [Enumerator current=null] : ( (enumLiteral_0= Full ) | (enumLiteral_1= Empty ) ) ;
    public final Enumerator ruleDISK_STATES_S() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:2604:2: ( ( (enumLiteral_0= Full ) | (enumLiteral_1= Empty ) ) )
            // InternalShortDSLParser.g:2605:2: ( (enumLiteral_0= Full ) | (enumLiteral_1= Empty ) )
            {
            // InternalShortDSLParser.g:2605:2: ( (enumLiteral_0= Full ) | (enumLiteral_1= Empty ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Full) ) {
                alt34=1;
            }
            else if ( (LA34_0==Empty) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalShortDSLParser.g:2606:3: (enumLiteral_0= Full )
                    {
                    // InternalShortDSLParser.g:2606:3: (enumLiteral_0= Full )
                    // InternalShortDSLParser.g:2607:4: enumLiteral_0= Full
                    {
                    enumLiteral_0=(Token)match(input,Full,FOLLOW_2); 

                    				current = grammarAccess.getDISK_STATES_SAccess().getFULLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDISK_STATES_SAccess().getFULLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2614:3: (enumLiteral_1= Empty )
                    {
                    // InternalShortDSLParser.g:2614:3: (enumLiteral_1= Empty )
                    // InternalShortDSLParser.g:2615:4: enumLiteral_1= Empty
                    {
                    enumLiteral_1=(Token)match(input,Empty,FOLLOW_2); 

                    				current = grammarAccess.getDISK_STATES_SAccess().getEMPTYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDISK_STATES_SAccess().getEMPTYEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleDISK_STATES_S"


    // $ANTLR start "ruleTIME_UNIT_S"
    // InternalShortDSLParser.g:2625:1: ruleTIME_UNIT_S returns [Enumerator current=null] : ( (enumLiteral_0= S ) | (enumLiteral_1= M ) | (enumLiteral_2= H ) ) ;
    public final Enumerator ruleTIME_UNIT_S() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:2631:2: ( ( (enumLiteral_0= S ) | (enumLiteral_1= M ) | (enumLiteral_2= H ) ) )
            // InternalShortDSLParser.g:2632:2: ( (enumLiteral_0= S ) | (enumLiteral_1= M ) | (enumLiteral_2= H ) )
            {
            // InternalShortDSLParser.g:2632:2: ( (enumLiteral_0= S ) | (enumLiteral_1= M ) | (enumLiteral_2= H ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case S:
                {
                alt35=1;
                }
                break;
            case M:
                {
                alt35=2;
                }
                break;
            case H:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalShortDSLParser.g:2633:3: (enumLiteral_0= S )
                    {
                    // InternalShortDSLParser.g:2633:3: (enumLiteral_0= S )
                    // InternalShortDSLParser.g:2634:4: enumLiteral_0= S
                    {
                    enumLiteral_0=(Token)match(input,S,FOLLOW_2); 

                    				current = grammarAccess.getTIME_UNIT_SAccess().getSECONDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTIME_UNIT_SAccess().getSECONDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2641:3: (enumLiteral_1= M )
                    {
                    // InternalShortDSLParser.g:2641:3: (enumLiteral_1= M )
                    // InternalShortDSLParser.g:2642:4: enumLiteral_1= M
                    {
                    enumLiteral_1=(Token)match(input,M,FOLLOW_2); 

                    				current = grammarAccess.getTIME_UNIT_SAccess().getMINUTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTIME_UNIT_SAccess().getMINUTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:2649:3: (enumLiteral_2= H )
                    {
                    // InternalShortDSLParser.g:2649:3: (enumLiteral_2= H )
                    // InternalShortDSLParser.g:2650:4: enumLiteral_2= H
                    {
                    enumLiteral_2=(Token)match(input,H,FOLLOW_2); 

                    				current = grammarAccess.getTIME_UNIT_SAccess().getHOUREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTIME_UNIT_SAccess().getHOUREnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTIME_UNIT_S"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001005000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080001005000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00001000200184B0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001800200184B0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001C08000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000300001035830L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100001025800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001015030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000080000L});

}