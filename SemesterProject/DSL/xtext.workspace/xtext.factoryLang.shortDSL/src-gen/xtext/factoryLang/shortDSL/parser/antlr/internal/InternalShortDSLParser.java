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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "In_progress", "Complete", "Devices", "Foreach", "Handle", "Pickup", "Vacant", "Empty", "Green", "Short", "Blue", "Drop", "Full", "Long", "Scan", "Test", "HyphenMinusHyphenMinusGreaterThanSign", "Dev", "Dsl", "Red", "Use", "Var", "ExclamationMarkEqualsSign", "HyphenMinusGreaterThanSign", "If", "LeftParenthesis", "RightParenthesis", "Comma", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "H", "M", "S", "LeftCurlyBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_BEGIN=41;
    public static final int Var=25;
    public static final int Devices=6;
    public static final int Full=16;
    public static final int LessThanSign=33;
    public static final int LeftParenthesis=29;
    public static final int Test=19;
    public static final int In_progress=4;
    public static final int Dsl=22;
    public static final int Short=13;
    public static final int GreaterThanSign=35;
    public static final int RULE_ID=43;
    public static final int RightParenthesis=30;
    public static final int Vacant=10;
    public static final int Handle=8;
    public static final int Drop=15;
    public static final int RULE_INT=44;
    public static final int Long=17;
    public static final int RULE_ML_COMMENT=46;
    public static final int Scan=18;
    public static final int If=28;
    public static final int RULE_END=42;
    public static final int Complete=5;
    public static final int H=36;
    public static final int RULE_STRING=45;
    public static final int M=37;
    public static final int RULE_SL_COMMENT=47;
    public static final int Comma=31;
    public static final int EqualsSign=34;
    public static final int Empty=11;
    public static final int S=38;
    public static final int Colon=32;
    public static final int RightCurlyBracket=40;
    public static final int EOF=-1;
    public static final int Pickup=9;
    public static final int Blue=14;
    public static final int RULE_WS=48;
    public static final int Use=24;
    public static final int LeftCurlyBracket=39;
    public static final int RULE_ANY_OTHER=49;
    public static final int Red=23;
    public static final int Dev=21;
    public static final int HyphenMinusHyphenMinusGreaterThanSign=20;
    public static final int Foreach=7;
    public static final int ExclamationMarkEqualsSign=26;
    public static final int HyphenMinusGreaterThanSign=27;
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
    // InternalShortDSLParser.g:65:1: ruleModel returns [EObject current=null] : (otherlv_0= Use ( (otherlv_1= Long otherlv_2= Dsl ( (lv_type_3_0= ruleDSL_Long ) ) ) | (otherlv_4= Short otherlv_5= Dsl ( (lv_type_6_0= ruleDSL_Short ) ) ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_type_3_0 = null;

        EObject lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:71:2: ( (otherlv_0= Use ( (otherlv_1= Long otherlv_2= Dsl ( (lv_type_3_0= ruleDSL_Long ) ) ) | (otherlv_4= Short otherlv_5= Dsl ( (lv_type_6_0= ruleDSL_Short ) ) ) ) ) )
            // InternalShortDSLParser.g:72:2: (otherlv_0= Use ( (otherlv_1= Long otherlv_2= Dsl ( (lv_type_3_0= ruleDSL_Long ) ) ) | (otherlv_4= Short otherlv_5= Dsl ( (lv_type_6_0= ruleDSL_Short ) ) ) ) )
            {
            // InternalShortDSLParser.g:72:2: (otherlv_0= Use ( (otherlv_1= Long otherlv_2= Dsl ( (lv_type_3_0= ruleDSL_Long ) ) ) | (otherlv_4= Short otherlv_5= Dsl ( (lv_type_6_0= ruleDSL_Short ) ) ) ) )
            // InternalShortDSLParser.g:73:3: otherlv_0= Use ( (otherlv_1= Long otherlv_2= Dsl ( (lv_type_3_0= ruleDSL_Long ) ) ) | (otherlv_4= Short otherlv_5= Dsl ( (lv_type_6_0= ruleDSL_Short ) ) ) )
            {
            otherlv_0=(Token)match(input,Use,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getUseKeyword_0());
            		
            // InternalShortDSLParser.g:77:3: ( (otherlv_1= Long otherlv_2= Dsl ( (lv_type_3_0= ruleDSL_Long ) ) ) | (otherlv_4= Short otherlv_5= Dsl ( (lv_type_6_0= ruleDSL_Short ) ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Long) ) {
                alt1=1;
            }
            else if ( (LA1_0==Short) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalShortDSLParser.g:78:4: (otherlv_1= Long otherlv_2= Dsl ( (lv_type_3_0= ruleDSL_Long ) ) )
                    {
                    // InternalShortDSLParser.g:78:4: (otherlv_1= Long otherlv_2= Dsl ( (lv_type_3_0= ruleDSL_Long ) ) )
                    // InternalShortDSLParser.g:79:5: otherlv_1= Long otherlv_2= Dsl ( (lv_type_3_0= ruleDSL_Long ) )
                    {
                    otherlv_1=(Token)match(input,Long,FOLLOW_4); 

                    					newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLongKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,Dsl,FOLLOW_5); 

                    					newLeafNode(otherlv_2, grammarAccess.getModelAccess().getDslKeyword_1_0_1());
                    				
                    // InternalShortDSLParser.g:87:5: ( (lv_type_3_0= ruleDSL_Long ) )
                    // InternalShortDSLParser.g:88:6: (lv_type_3_0= ruleDSL_Long )
                    {
                    // InternalShortDSLParser.g:88:6: (lv_type_3_0= ruleDSL_Long )
                    // InternalShortDSLParser.g:89:7: lv_type_3_0= ruleDSL_Long
                    {

                    							newCompositeNode(grammarAccess.getModelAccess().getTypeDSL_LongParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_type_3_0=ruleDSL_Long();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getModelRule());
                    							}
                    							set(
                    								current,
                    								"type",
                    								lv_type_3_0,
                    								"xtext.factoryLang.shortDSL.ShortDSL.DSL_Long");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:108:4: (otherlv_4= Short otherlv_5= Dsl ( (lv_type_6_0= ruleDSL_Short ) ) )
                    {
                    // InternalShortDSLParser.g:108:4: (otherlv_4= Short otherlv_5= Dsl ( (lv_type_6_0= ruleDSL_Short ) ) )
                    // InternalShortDSLParser.g:109:5: otherlv_4= Short otherlv_5= Dsl ( (lv_type_6_0= ruleDSL_Short ) )
                    {
                    otherlv_4=(Token)match(input,Short,FOLLOW_4); 

                    					newLeafNode(otherlv_4, grammarAccess.getModelAccess().getShortKeyword_1_1_0());
                    				
                    otherlv_5=(Token)match(input,Dsl,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getModelAccess().getDslKeyword_1_1_1());
                    				
                    // InternalShortDSLParser.g:117:5: ( (lv_type_6_0= ruleDSL_Short ) )
                    // InternalShortDSLParser.g:118:6: (lv_type_6_0= ruleDSL_Short )
                    {
                    // InternalShortDSLParser.g:118:6: (lv_type_6_0= ruleDSL_Short )
                    // InternalShortDSLParser.g:119:7: lv_type_6_0= ruleDSL_Short
                    {

                    							newCompositeNode(grammarAccess.getModelAccess().getTypeDSL_ShortParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_type_6_0=ruleDSL_Short();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getModelRule());
                    							}
                    							set(
                    								current,
                    								"type",
                    								lv_type_6_0,
                    								"xtext.factoryLang.shortDSL.ShortDSL.DSL_Short");
                    							afterParserOrEnumRuleCall();
                    						

                    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDSL_Long"
    // InternalShortDSLParser.g:142:1: entryRuleDSL_Long returns [EObject current=null] : iv_ruleDSL_Long= ruleDSL_Long EOF ;
    public final EObject entryRuleDSL_Long() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_Long = null;


        try {
            // InternalShortDSLParser.g:142:49: (iv_ruleDSL_Long= ruleDSL_Long EOF )
            // InternalShortDSLParser.g:143:2: iv_ruleDSL_Long= ruleDSL_Long EOF
            {
             newCompositeNode(grammarAccess.getDSL_LongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSL_Long=ruleDSL_Long();

            state._fsp--;

             current =iv_ruleDSL_Long; 
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
    // $ANTLR end "entryRuleDSL_Long"


    // $ANTLR start "ruleDSL_Long"
    // InternalShortDSLParser.g:149:1: ruleDSL_Long returns [EObject current=null] : (otherlv_0= Test ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDSL_Long() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:155:2: ( (otherlv_0= Test ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:156:2: (otherlv_0= Test ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:156:2: (otherlv_0= Test ( (lv_name_1_0= RULE_ID ) ) )
            // InternalShortDSLParser.g:157:3: otherlv_0= Test ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Test,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSL_LongAccess().getTestKeyword_0());
            		
            // InternalShortDSLParser.g:161:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:162:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:162:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:163:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSL_LongAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSL_LongRule());
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
    // $ANTLR end "ruleDSL_Long"


    // $ANTLR start "entryRuleDSL_Short"
    // InternalShortDSLParser.g:183:1: entryRuleDSL_Short returns [EObject current=null] : iv_ruleDSL_Short= ruleDSL_Short EOF ;
    public final EObject entryRuleDSL_Short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_Short = null;


        try {
            // InternalShortDSLParser.g:183:50: (iv_ruleDSL_Short= ruleDSL_Short EOF )
            // InternalShortDSLParser.g:184:2: iv_ruleDSL_Short= ruleDSL_Short EOF
            {
             newCompositeNode(grammarAccess.getDSL_ShortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSL_Short=ruleDSL_Short();

            state._fsp--;

             current =iv_ruleDSL_Short; 
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
    // $ANTLR end "entryRuleDSL_Short"


    // $ANTLR start "ruleDSL_Short"
    // InternalShortDSLParser.g:190:1: ruleDSL_Short returns [EObject current=null] : ( () ( (lv_configuration_1_0= ruleConfigurationS ) ) ( (lv_diskHandlings_2_0= ruleDiskHandlingS ) )* ) ;
    public final EObject ruleDSL_Short() throws RecognitionException {
        EObject current = null;

        EObject lv_configuration_1_0 = null;

        EObject lv_diskHandlings_2_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:196:2: ( ( () ( (lv_configuration_1_0= ruleConfigurationS ) ) ( (lv_diskHandlings_2_0= ruleDiskHandlingS ) )* ) )
            // InternalShortDSLParser.g:197:2: ( () ( (lv_configuration_1_0= ruleConfigurationS ) ) ( (lv_diskHandlings_2_0= ruleDiskHandlingS ) )* )
            {
            // InternalShortDSLParser.g:197:2: ( () ( (lv_configuration_1_0= ruleConfigurationS ) ) ( (lv_diskHandlings_2_0= ruleDiskHandlingS ) )* )
            // InternalShortDSLParser.g:198:3: () ( (lv_configuration_1_0= ruleConfigurationS ) ) ( (lv_diskHandlings_2_0= ruleDiskHandlingS ) )*
            {
            // InternalShortDSLParser.g:198:3: ()
            // InternalShortDSLParser.g:199:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDSL_ShortAccess().getDSLShortAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:205:3: ( (lv_configuration_1_0= ruleConfigurationS ) )
            // InternalShortDSLParser.g:206:4: (lv_configuration_1_0= ruleConfigurationS )
            {
            // InternalShortDSLParser.g:206:4: (lv_configuration_1_0= ruleConfigurationS )
            // InternalShortDSLParser.g:207:5: lv_configuration_1_0= ruleConfigurationS
            {

            					newCompositeNode(grammarAccess.getDSL_ShortAccess().getConfigurationConfigurationSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_configuration_1_0=ruleConfigurationS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDSL_ShortRule());
            					}
            					set(
            						current,
            						"configuration",
            						lv_configuration_1_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.ConfigurationS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:224:3: ( (lv_diskHandlings_2_0= ruleDiskHandlingS ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Handle) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalShortDSLParser.g:225:4: (lv_diskHandlings_2_0= ruleDiskHandlingS )
            	    {
            	    // InternalShortDSLParser.g:225:4: (lv_diskHandlings_2_0= ruleDiskHandlingS )
            	    // InternalShortDSLParser.g:226:5: lv_diskHandlings_2_0= ruleDiskHandlingS
            	    {

            	    					newCompositeNode(grammarAccess.getDSL_ShortAccess().getDiskHandlingsDiskHandlingSParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_diskHandlings_2_0=ruleDiskHandlingS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDSL_ShortRule());
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
    // $ANTLR end "ruleDSL_Short"


    // $ANTLR start "entryRuleConfigurationS"
    // InternalShortDSLParser.g:247:1: entryRuleConfigurationS returns [EObject current=null] : iv_ruleConfigurationS= ruleConfigurationS EOF ;
    public final EObject entryRuleConfigurationS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationS = null;


        try {
            // InternalShortDSLParser.g:247:55: (iv_ruleConfigurationS= ruleConfigurationS EOF )
            // InternalShortDSLParser.g:248:2: iv_ruleConfigurationS= ruleConfigurationS EOF
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
    // InternalShortDSLParser.g:254:1: ruleConfigurationS returns [EObject current=null] : (otherlv_0= Devices otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_devices_3_0= ruleDeviceS ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket ) ;
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
            // InternalShortDSLParser.g:260:2: ( (otherlv_0= Devices otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_devices_3_0= ruleDeviceS ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket ) )
            // InternalShortDSLParser.g:261:2: (otherlv_0= Devices otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_devices_3_0= ruleDeviceS ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket )
            {
            // InternalShortDSLParser.g:261:2: (otherlv_0= Devices otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_devices_3_0= ruleDeviceS ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket )
            // InternalShortDSLParser.g:262:3: otherlv_0= Devices otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_devices_3_0= ruleDeviceS ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Devices,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationSAccess().getDevicesKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationSAccess().getLeftCurlyBracketKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getConfigurationSAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalShortDSLParser.g:274:3: ( (lv_devices_3_0= ruleDeviceS ) )+
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
            	    // InternalShortDSLParser.g:275:4: (lv_devices_3_0= ruleDeviceS )
            	    {
            	    // InternalShortDSLParser.g:275:4: (lv_devices_3_0= ruleDeviceS )
            	    // InternalShortDSLParser.g:276:5: lv_devices_3_0= ruleDeviceS
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationSAccess().getDevicesDeviceSParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
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

            this_END_4=(Token)match(input,RULE_END,FOLLOW_12); 

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
    // InternalShortDSLParser.g:305:1: entryRuleDeviceS returns [EObject current=null] : iv_ruleDeviceS= ruleDeviceS EOF ;
    public final EObject entryRuleDeviceS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceS = null;


        try {
            // InternalShortDSLParser.g:305:48: (iv_ruleDeviceS= ruleDeviceS EOF )
            // InternalShortDSLParser.g:306:2: iv_ruleDeviceS= ruleDeviceS EOF
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
    // InternalShortDSLParser.g:312:1: ruleDeviceS returns [EObject current=null] : (this_CraneS_0= ruleCraneS | this_DiskS_1= ruleDiskS | this_CameraS_2= ruleCameraS ) ;
    public final EObject ruleDeviceS() throws RecognitionException {
        EObject current = null;

        EObject this_CraneS_0 = null;

        EObject this_DiskS_1 = null;

        EObject this_CameraS_2 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:318:2: ( (this_CraneS_0= ruleCraneS | this_DiskS_1= ruleDiskS | this_CameraS_2= ruleCameraS ) )
            // InternalShortDSLParser.g:319:2: (this_CraneS_0= ruleCraneS | this_DiskS_1= ruleDiskS | this_CameraS_2= ruleCameraS )
            {
            // InternalShortDSLParser.g:319:2: (this_CraneS_0= ruleCraneS | this_DiskS_1= ruleDiskS | this_CameraS_2= ruleCameraS )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==Colon) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==RULE_BEGIN) ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==Green||LA4_4==Blue||LA4_4==Red) ) {
                            alt4=3;
                        }
                        else if ( (LA4_4==RULE_ID) ) {
                            alt4=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_1==LeftParenthesis) ) {
                    alt4=2;
                }
                else {
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
                    // InternalShortDSLParser.g:320:3: this_CraneS_0= ruleCraneS
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
                    // InternalShortDSLParser.g:329:3: this_DiskS_1= ruleDiskS
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
                    // InternalShortDSLParser.g:338:3: this_CameraS_2= ruleCameraS
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
    // InternalShortDSLParser.g:350:1: entryRuleCraneS returns [EObject current=null] : iv_ruleCraneS= ruleCraneS EOF ;
    public final EObject entryRuleCraneS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCraneS = null;


        try {
            // InternalShortDSLParser.g:350:47: (iv_ruleCraneS= ruleCraneS EOF )
            // InternalShortDSLParser.g:351:2: iv_ruleCraneS= ruleCraneS EOF
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
    // InternalShortDSLParser.g:357:1: ruleCraneS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_targets_4_0= ruleCraneZoneS ) )+ this_END_5= RULE_END ) ;
    public final EObject ruleCraneS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_targets_4_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:363:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_targets_4_0= ruleCraneZoneS ) )+ this_END_5= RULE_END ) )
            // InternalShortDSLParser.g:364:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_targets_4_0= ruleCraneZoneS ) )+ this_END_5= RULE_END )
            {
            // InternalShortDSLParser.g:364:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_targets_4_0= ruleCraneZoneS ) )+ this_END_5= RULE_END )
            // InternalShortDSLParser.g:365:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_targets_4_0= ruleCraneZoneS ) )+ this_END_5= RULE_END
            {
            // InternalShortDSLParser.g:365:3: ()
            // InternalShortDSLParser.g:366:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCraneSAccess().getCraneAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:372:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:373:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:373:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:374:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getCraneSAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getCraneSAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalShortDSLParser.g:398:3: ( (lv_targets_4_0= ruleCraneZoneS ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalShortDSLParser.g:399:4: (lv_targets_4_0= ruleCraneZoneS )
            	    {
            	    // InternalShortDSLParser.g:399:4: (lv_targets_4_0= ruleCraneZoneS )
            	    // InternalShortDSLParser.g:400:5: lv_targets_4_0= ruleCraneZoneS
            	    {

            	    					newCompositeNode(grammarAccess.getCraneSAccess().getTargetsCraneZoneSParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_targets_4_0=ruleCraneZoneS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCraneSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"targets",
            	    						lv_targets_4_0,
            	    						"xtext.factoryLang.shortDSL.ShortDSL.CraneZoneS");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getCraneSAccess().getENDTerminalRuleCall_5());
            		

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
    // InternalShortDSLParser.g:425:1: entryRuleCraneZoneS returns [EObject current=null] : iv_ruleCraneZoneS= ruleCraneZoneS EOF ;
    public final EObject entryRuleCraneZoneS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCraneZoneS = null;


        try {
            // InternalShortDSLParser.g:425:51: (iv_ruleCraneZoneS= ruleCraneZoneS EOF )
            // InternalShortDSLParser.g:426:2: iv_ruleCraneZoneS= ruleCraneZoneS EOF
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
    // InternalShortDSLParser.g:432:1: ruleCraneZoneS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_zoneValue_3_0= RULE_INT ) ) (otherlv_4= Comma )? ) ;
    public final EObject ruleCraneZoneS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_zoneValue_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:438:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_zoneValue_3_0= RULE_INT ) ) (otherlv_4= Comma )? ) )
            // InternalShortDSLParser.g:439:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_zoneValue_3_0= RULE_INT ) ) (otherlv_4= Comma )? )
            {
            // InternalShortDSLParser.g:439:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_zoneValue_3_0= RULE_INT ) ) (otherlv_4= Comma )? )
            // InternalShortDSLParser.g:440:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_zoneValue_3_0= RULE_INT ) ) (otherlv_4= Comma )?
            {
            // InternalShortDSLParser.g:440:3: ()
            // InternalShortDSLParser.g:441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCraneZoneSAccess().getCraneZoneAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:447:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:448:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:448:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:449:5: lv_name_1_0= RULE_ID
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
            		
            // InternalShortDSLParser.g:469:3: ( (lv_zoneValue_3_0= RULE_INT ) )
            // InternalShortDSLParser.g:470:4: (lv_zoneValue_3_0= RULE_INT )
            {
            // InternalShortDSLParser.g:470:4: (lv_zoneValue_3_0= RULE_INT )
            // InternalShortDSLParser.g:471:5: lv_zoneValue_3_0= RULE_INT
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

            // InternalShortDSLParser.g:487:3: (otherlv_4= Comma )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Comma) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalShortDSLParser.g:488:4: otherlv_4= Comma
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
    // InternalShortDSLParser.g:497:1: entryRuleDiskS returns [EObject current=null] : iv_ruleDiskS= ruleDiskS EOF ;
    public final EObject entryRuleDiskS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskS = null;


        try {
            // InternalShortDSLParser.g:497:46: (iv_ruleDiskS= ruleDiskS EOF )
            // InternalShortDSLParser.g:498:2: iv_ruleDiskS= ruleDiskS EOF
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
    // InternalShortDSLParser.g:504:1: ruleDiskS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_nSlots_3_0= RULE_INT ) ) otherlv_4= RightParenthesis otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_targets_7_0= ruleDiskZoneS ) )+ this_END_8= RULE_END ) ;
    public final EObject ruleDiskS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_nSlots_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        EObject lv_targets_7_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:510:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_nSlots_3_0= RULE_INT ) ) otherlv_4= RightParenthesis otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_targets_7_0= ruleDiskZoneS ) )+ this_END_8= RULE_END ) )
            // InternalShortDSLParser.g:511:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_nSlots_3_0= RULE_INT ) ) otherlv_4= RightParenthesis otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_targets_7_0= ruleDiskZoneS ) )+ this_END_8= RULE_END )
            {
            // InternalShortDSLParser.g:511:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_nSlots_3_0= RULE_INT ) ) otherlv_4= RightParenthesis otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_targets_7_0= ruleDiskZoneS ) )+ this_END_8= RULE_END )
            // InternalShortDSLParser.g:512:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_nSlots_3_0= RULE_INT ) ) otherlv_4= RightParenthesis otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_targets_7_0= ruleDiskZoneS ) )+ this_END_8= RULE_END
            {
            // InternalShortDSLParser.g:512:3: ()
            // InternalShortDSLParser.g:513:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiskSAccess().getDiskAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:519:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:520:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:520:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:521:5: lv_name_1_0= RULE_ID
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
            		
            // InternalShortDSLParser.g:541:3: ( (lv_nSlots_3_0= RULE_INT ) )
            // InternalShortDSLParser.g:542:4: (lv_nSlots_3_0= RULE_INT )
            {
            // InternalShortDSLParser.g:542:4: (lv_nSlots_3_0= RULE_INT )
            // InternalShortDSLParser.g:543:5: lv_nSlots_3_0= RULE_INT
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

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getDiskSAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getDiskSAccess().getColonKeyword_5());
            		
            this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            			newLeafNode(this_BEGIN_6, grammarAccess.getDiskSAccess().getBEGINTerminalRuleCall_6());
            		
            // InternalShortDSLParser.g:571:3: ( (lv_targets_7_0= ruleDiskZoneS ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalShortDSLParser.g:572:4: (lv_targets_7_0= ruleDiskZoneS )
            	    {
            	    // InternalShortDSLParser.g:572:4: (lv_targets_7_0= ruleDiskZoneS )
            	    // InternalShortDSLParser.g:573:5: lv_targets_7_0= ruleDiskZoneS
            	    {

            	    					newCompositeNode(grammarAccess.getDiskSAccess().getTargetsDiskZoneSParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_targets_7_0=ruleDiskZoneS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiskSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"targets",
            	    						lv_targets_7_0,
            	    						"xtext.factoryLang.shortDSL.ShortDSL.DiskZoneS");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getDiskSAccess().getENDTerminalRuleCall_8());
            		

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
    // InternalShortDSLParser.g:598:1: entryRuleDiskZoneS returns [EObject current=null] : iv_ruleDiskZoneS= ruleDiskZoneS EOF ;
    public final EObject entryRuleDiskZoneS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskZoneS = null;


        try {
            // InternalShortDSLParser.g:598:50: (iv_ruleDiskZoneS= ruleDiskZoneS EOF )
            // InternalShortDSLParser.g:599:2: iv_ruleDiskZoneS= ruleDiskZoneS EOF
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
    // InternalShortDSLParser.g:605:1: ruleDiskZoneS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_slot_3_0= RULE_INT ) ) (otherlv_4= Comma )? ) ;
    public final EObject ruleDiskZoneS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_slot_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:611:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_slot_3_0= RULE_INT ) ) (otherlv_4= Comma )? ) )
            // InternalShortDSLParser.g:612:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_slot_3_0= RULE_INT ) ) (otherlv_4= Comma )? )
            {
            // InternalShortDSLParser.g:612:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_slot_3_0= RULE_INT ) ) (otherlv_4= Comma )? )
            // InternalShortDSLParser.g:613:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_slot_3_0= RULE_INT ) ) (otherlv_4= Comma )?
            {
            // InternalShortDSLParser.g:613:3: ()
            // InternalShortDSLParser.g:614:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiskZoneSAccess().getDiskZoneAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:620:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:621:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:621:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:622:5: lv_name_1_0= RULE_ID
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
            		
            // InternalShortDSLParser.g:642:3: ( (lv_slot_3_0= RULE_INT ) )
            // InternalShortDSLParser.g:643:4: (lv_slot_3_0= RULE_INT )
            {
            // InternalShortDSLParser.g:643:4: (lv_slot_3_0= RULE_INT )
            // InternalShortDSLParser.g:644:5: lv_slot_3_0= RULE_INT
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

            // InternalShortDSLParser.g:660:3: (otherlv_4= Comma )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Comma) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalShortDSLParser.g:661:4: otherlv_4= Comma
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
    // InternalShortDSLParser.g:670:1: entryRuleCameraS returns [EObject current=null] : iv_ruleCameraS= ruleCameraS EOF ;
    public final EObject entryRuleCameraS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCameraS = null;


        try {
            // InternalShortDSLParser.g:670:48: (iv_ruleCameraS= ruleCameraS EOF )
            // InternalShortDSLParser.g:671:2: iv_ruleCameraS= ruleCameraS EOF
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
    // InternalShortDSLParser.g:677:1: ruleCameraS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_targets_4_0= ruleCameraColorS ) )+ this_END_5= RULE_END ) ;
    public final EObject ruleCameraS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_targets_4_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:683:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_targets_4_0= ruleCameraColorS ) )+ this_END_5= RULE_END ) )
            // InternalShortDSLParser.g:684:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_targets_4_0= ruleCameraColorS ) )+ this_END_5= RULE_END )
            {
            // InternalShortDSLParser.g:684:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_targets_4_0= ruleCameraColorS ) )+ this_END_5= RULE_END )
            // InternalShortDSLParser.g:685:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_targets_4_0= ruleCameraColorS ) )+ this_END_5= RULE_END
            {
            // InternalShortDSLParser.g:685:3: ()
            // InternalShortDSLParser.g:686:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCameraSAccess().getCameraAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:692:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:693:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:693:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:694:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getCameraSAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getCameraSAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalShortDSLParser.g:718:3: ( (lv_targets_4_0= ruleCameraColorS ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Green||LA9_0==Blue||LA9_0==Red) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalShortDSLParser.g:719:4: (lv_targets_4_0= ruleCameraColorS )
            	    {
            	    // InternalShortDSLParser.g:719:4: (lv_targets_4_0= ruleCameraColorS )
            	    // InternalShortDSLParser.g:720:5: lv_targets_4_0= ruleCameraColorS
            	    {

            	    					newCompositeNode(grammarAccess.getCameraSAccess().getTargetsCameraColorSParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_targets_4_0=ruleCameraColorS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCameraSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"targets",
            	    						lv_targets_4_0,
            	    						"xtext.factoryLang.shortDSL.ShortDSL.CameraColorS");
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

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getCameraSAccess().getENDTerminalRuleCall_5());
            		

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
    // InternalShortDSLParser.g:745:1: entryRuleCameraColorS returns [EObject current=null] : iv_ruleCameraColorS= ruleCameraColorS EOF ;
    public final EObject entryRuleCameraColorS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCameraColorS = null;


        try {
            // InternalShortDSLParser.g:745:53: (iv_ruleCameraColorS= ruleCameraColorS EOF )
            // InternalShortDSLParser.g:746:2: iv_ruleCameraColorS= ruleCameraColorS EOF
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
    // InternalShortDSLParser.g:752:1: ruleCameraColorS returns [EObject current=null] : ( () ( (lv_color_1_0= ruleCOLOR_S ) ) (otherlv_2= Comma )? ) ;
    public final EObject ruleCameraColorS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_color_1_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:758:2: ( ( () ( (lv_color_1_0= ruleCOLOR_S ) ) (otherlv_2= Comma )? ) )
            // InternalShortDSLParser.g:759:2: ( () ( (lv_color_1_0= ruleCOLOR_S ) ) (otherlv_2= Comma )? )
            {
            // InternalShortDSLParser.g:759:2: ( () ( (lv_color_1_0= ruleCOLOR_S ) ) (otherlv_2= Comma )? )
            // InternalShortDSLParser.g:760:3: () ( (lv_color_1_0= ruleCOLOR_S ) ) (otherlv_2= Comma )?
            {
            // InternalShortDSLParser.g:760:3: ()
            // InternalShortDSLParser.g:761:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCameraColorSAccess().getCameraColorAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:767:3: ( (lv_color_1_0= ruleCOLOR_S ) )
            // InternalShortDSLParser.g:768:4: (lv_color_1_0= ruleCOLOR_S )
            {
            // InternalShortDSLParser.g:768:4: (lv_color_1_0= ruleCOLOR_S )
            // InternalShortDSLParser.g:769:5: lv_color_1_0= ruleCOLOR_S
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

            // InternalShortDSLParser.g:786:3: (otherlv_2= Comma )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Comma) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalShortDSLParser.g:787:4: otherlv_2= Comma
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


    // $ANTLR start "entryRuleDiskHandlingS"
    // InternalShortDSLParser.g:796:1: entryRuleDiskHandlingS returns [EObject current=null] : iv_ruleDiskHandlingS= ruleDiskHandlingS EOF ;
    public final EObject entryRuleDiskHandlingS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskHandlingS = null;


        try {
            // InternalShortDSLParser.g:796:54: (iv_ruleDiskHandlingS= ruleDiskHandlingS EOF )
            // InternalShortDSLParser.g:797:2: iv_ruleDiskHandlingS= ruleDiskHandlingS EOF
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
    // InternalShortDSLParser.g:803:1: ruleDiskHandlingS returns [EObject current=null] : (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftCurlyBracket this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatementS ) )+ this_END_5= RULE_END otherlv_6= RightCurlyBracket ) ;
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
            // InternalShortDSLParser.g:809:2: ( (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftCurlyBracket this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatementS ) )+ this_END_5= RULE_END otherlv_6= RightCurlyBracket ) )
            // InternalShortDSLParser.g:810:2: (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftCurlyBracket this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatementS ) )+ this_END_5= RULE_END otherlv_6= RightCurlyBracket )
            {
            // InternalShortDSLParser.g:810:2: (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftCurlyBracket this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatementS ) )+ this_END_5= RULE_END otherlv_6= RightCurlyBracket )
            // InternalShortDSLParser.g:811:3: otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftCurlyBracket this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatementS ) )+ this_END_5= RULE_END otherlv_6= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Handle,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDiskHandlingSAccess().getHandleKeyword_0());
            		
            // InternalShortDSLParser.g:815:3: ( (otherlv_1= RULE_ID ) )
            // InternalShortDSLParser.g:816:4: (otherlv_1= RULE_ID )
            {
            // InternalShortDSLParser.g:816:4: (otherlv_1= RULE_ID )
            // InternalShortDSLParser.g:817:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskHandlingSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_1, grammarAccess.getDiskHandlingSAccess().getDiskDiskCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDiskHandlingSAccess().getLeftCurlyBracketKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getDiskHandlingSAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalShortDSLParser.g:836:3: ( (lv_statements_4_0= ruleStatementS ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=In_progress && LA11_0<=Complete)||LA11_0==Foreach||(LA11_0>=Pickup && LA11_0<=Vacant)||LA11_0==Drop||LA11_0==If||LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalShortDSLParser.g:837:4: (lv_statements_4_0= ruleStatementS )
            	    {
            	    // InternalShortDSLParser.g:837:4: (lv_statements_4_0= ruleStatementS )
            	    // InternalShortDSLParser.g:838:5: lv_statements_4_0= ruleStatementS
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_12); 

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
    // InternalShortDSLParser.g:867:1: entryRuleStatementS returns [EObject current=null] : iv_ruleStatementS= ruleStatementS EOF ;
    public final EObject entryRuleStatementS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementS = null;


        try {
            // InternalShortDSLParser.g:867:51: (iv_ruleStatementS= ruleStatementS EOF )
            // InternalShortDSLParser.g:868:2: iv_ruleStatementS= ruleStatementS EOF
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
    // InternalShortDSLParser.g:874:1: ruleStatementS returns [EObject current=null] : (this_LoopS_0= ruleLoopS | this_MoveS_1= ruleMoveS | this_CraneActionS_2= ruleCraneActionS | this_ConditionS_3= ruleConditionS | this_MarkS_4= ruleMarkS ) ;
    public final EObject ruleStatementS() throws RecognitionException {
        EObject current = null;

        EObject this_LoopS_0 = null;

        EObject this_MoveS_1 = null;

        EObject this_CraneActionS_2 = null;

        EObject this_ConditionS_3 = null;

        EObject this_MarkS_4 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:880:2: ( (this_LoopS_0= ruleLoopS | this_MoveS_1= ruleMoveS | this_CraneActionS_2= ruleCraneActionS | this_ConditionS_3= ruleConditionS | this_MarkS_4= ruleMarkS ) )
            // InternalShortDSLParser.g:881:2: (this_LoopS_0= ruleLoopS | this_MoveS_1= ruleMoveS | this_CraneActionS_2= ruleCraneActionS | this_ConditionS_3= ruleConditionS | this_MarkS_4= ruleMarkS )
            {
            // InternalShortDSLParser.g:881:2: (this_LoopS_0= ruleLoopS | this_MoveS_1= ruleMoveS | this_CraneActionS_2= ruleCraneActionS | this_ConditionS_3= ruleConditionS | this_MarkS_4= ruleMarkS )
            int alt12=5;
            switch ( input.LA(1) ) {
            case Foreach:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==Scan||LA12_2==LeftParenthesis) ) {
                    alt12=5;
                }
                else if ( (LA12_2==Pickup||LA12_2==Drop||LA12_2==HyphenMinusHyphenMinusGreaterThanSign||LA12_2==HyphenMinusGreaterThanSign) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case In_progress:
            case Complete:
            case Vacant:
                {
                alt12=2;
                }
                break;
            case Pickup:
            case Drop:
                {
                alt12=3;
                }
                break;
            case If:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalShortDSLParser.g:882:3: this_LoopS_0= ruleLoopS
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
                    // InternalShortDSLParser.g:891:3: this_MoveS_1= ruleMoveS
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
                    // InternalShortDSLParser.g:900:3: this_CraneActionS_2= ruleCraneActionS
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
                    // InternalShortDSLParser.g:909:3: this_ConditionS_3= ruleConditionS
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
                    // InternalShortDSLParser.g:918:3: this_MarkS_4= ruleMarkS
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
    // InternalShortDSLParser.g:930:1: entryRuleLoopS returns [EObject current=null] : iv_ruleLoopS= ruleLoopS EOF ;
    public final EObject entryRuleLoopS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopS = null;


        try {
            // InternalShortDSLParser.g:930:46: (iv_ruleLoopS= ruleLoopS EOF )
            // InternalShortDSLParser.g:931:2: iv_ruleLoopS= ruleLoopS EOF
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
    // InternalShortDSLParser.g:937:1: ruleLoopS returns [EObject current=null] : ( () otherlv_1= Foreach ( (lv_variable_2_0= ruleLocalVariableS ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_slotState_4_0= ruleDiskSlotStateValueS ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END ) ;
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
            // InternalShortDSLParser.g:943:2: ( ( () otherlv_1= Foreach ( (lv_variable_2_0= ruleLocalVariableS ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_slotState_4_0= ruleDiskSlotStateValueS ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END ) )
            // InternalShortDSLParser.g:944:2: ( () otherlv_1= Foreach ( (lv_variable_2_0= ruleLocalVariableS ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_slotState_4_0= ruleDiskSlotStateValueS ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END )
            {
            // InternalShortDSLParser.g:944:2: ( () otherlv_1= Foreach ( (lv_variable_2_0= ruleLocalVariableS ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_slotState_4_0= ruleDiskSlotStateValueS ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END )
            // InternalShortDSLParser.g:945:3: () otherlv_1= Foreach ( (lv_variable_2_0= ruleLocalVariableS ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_slotState_4_0= ruleDiskSlotStateValueS ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END
            {
            // InternalShortDSLParser.g:945:3: ()
            // InternalShortDSLParser.g:946:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopSAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Foreach,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopSAccess().getForeachKeyword_1());
            		
            // InternalShortDSLParser.g:956:3: ( (lv_variable_2_0= ruleLocalVariableS ) )
            // InternalShortDSLParser.g:957:4: (lv_variable_2_0= ruleLocalVariableS )
            {
            // InternalShortDSLParser.g:957:4: (lv_variable_2_0= ruleLocalVariableS )
            // InternalShortDSLParser.g:958:5: lv_variable_2_0= ruleLocalVariableS
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

            // InternalShortDSLParser.g:975:3: ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:976:4: (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:976:4: (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:977:5: lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S
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

            // InternalShortDSLParser.g:994:3: ( (lv_slotState_4_0= ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:995:4: (lv_slotState_4_0= ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:995:4: (lv_slotState_4_0= ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:996:5: lv_slotState_4_0= ruleDiskSlotStateValueS
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

            otherlv_5=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getLoopSAccess().getColonKeyword_5());
            		
            this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_21); 

            			newLeafNode(this_BEGIN_6, grammarAccess.getLoopSAccess().getBEGINTerminalRuleCall_6());
            		
            // InternalShortDSLParser.g:1021:3: ( (lv_statements_7_0= ruleStatementS ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=In_progress && LA13_0<=Complete)||LA13_0==Foreach||(LA13_0>=Pickup && LA13_0<=Vacant)||LA13_0==Drop||LA13_0==If||LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalShortDSLParser.g:1022:4: (lv_statements_7_0= ruleStatementS )
            	    {
            	    // InternalShortDSLParser.g:1022:4: (lv_statements_7_0= ruleStatementS )
            	    // InternalShortDSLParser.g:1023:5: lv_statements_7_0= ruleStatementS
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
            	    break loop13;
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
    // InternalShortDSLParser.g:1048:1: entryRuleMoveS returns [EObject current=null] : iv_ruleMoveS= ruleMoveS EOF ;
    public final EObject entryRuleMoveS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveS = null;


        try {
            // InternalShortDSLParser.g:1048:46: (iv_ruleMoveS= ruleMoveS EOF )
            // InternalShortDSLParser.g:1049:2: iv_ruleMoveS= ruleMoveS EOF
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
    // InternalShortDSLParser.g:1055:1: ruleMoveS returns [EObject current=null] : (this_MoveDiskS_0= ruleMoveDiskS | this_MoveAnySlotS_1= ruleMoveAnySlotS | this_MoveCraneS_2= ruleMoveCraneS ) ;
    public final EObject ruleMoveS() throws RecognitionException {
        EObject current = null;

        EObject this_MoveDiskS_0 = null;

        EObject this_MoveAnySlotS_1 = null;

        EObject this_MoveCraneS_2 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1061:2: ( (this_MoveDiskS_0= ruleMoveDiskS | this_MoveAnySlotS_1= ruleMoveAnySlotS | this_MoveCraneS_2= ruleMoveCraneS ) )
            // InternalShortDSLParser.g:1062:2: (this_MoveDiskS_0= ruleMoveDiskS | this_MoveAnySlotS_1= ruleMoveAnySlotS | this_MoveCraneS_2= ruleMoveCraneS )
            {
            // InternalShortDSLParser.g:1062:2: (this_MoveDiskS_0= ruleMoveDiskS | this_MoveAnySlotS_1= ruleMoveAnySlotS | this_MoveCraneS_2= ruleMoveCraneS )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==Pickup||LA14_1==Drop) ) {
                    alt14=3;
                }
                else if ( (LA14_1==HyphenMinusHyphenMinusGreaterThanSign||LA14_1==HyphenMinusGreaterThanSign) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA14_0>=In_progress && LA14_0<=Complete)||LA14_0==Vacant) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalShortDSLParser.g:1063:3: this_MoveDiskS_0= ruleMoveDiskS
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
                    // InternalShortDSLParser.g:1072:3: this_MoveAnySlotS_1= ruleMoveAnySlotS
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
                    // InternalShortDSLParser.g:1081:3: this_MoveCraneS_2= ruleMoveCraneS
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
    // InternalShortDSLParser.g:1093:1: entryRuleMoveDiskS returns [EObject current=null] : iv_ruleMoveDiskS= ruleMoveDiskS EOF ;
    public final EObject entryRuleMoveDiskS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveDiskS = null;


        try {
            // InternalShortDSLParser.g:1093:50: (iv_ruleMoveDiskS= ruleMoveDiskS EOF )
            // InternalShortDSLParser.g:1094:2: iv_ruleMoveDiskS= ruleMoveDiskS EOF
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
    // InternalShortDSLParser.g:1100:1: ruleMoveDiskS returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleMoveDiskS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:1106:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_4= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:1107:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:1107:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_4= RULE_ID ) ) )
            // InternalShortDSLParser.g:1108:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_4= RULE_ID ) )
            {
            // InternalShortDSLParser.g:1108:3: ()
            // InternalShortDSLParser.g:1109:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveDiskSAccess().getMoveDiskAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1115:3: ( (otherlv_1= RULE_ID ) )
            // InternalShortDSLParser.g:1116:4: (otherlv_1= RULE_ID )
            {
            // InternalShortDSLParser.g:1116:4: (otherlv_1= RULE_ID )
            // InternalShortDSLParser.g:1117:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveDiskSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_1, grammarAccess.getMoveDiskSAccess().getSlotLocalVariableCrossReference_1_0());
            				

            }


            }

            // InternalShortDSLParser.g:1128:3: (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==HyphenMinusGreaterThanSign) ) {
                alt15=1;
            }
            else if ( (LA15_0==HyphenMinusHyphenMinusGreaterThanSign) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalShortDSLParser.g:1129:4: otherlv_2= HyphenMinusGreaterThanSign
                    {
                    otherlv_2=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getMoveDiskSAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1134:4: otherlv_3= HyphenMinusHyphenMinusGreaterThanSign
                    {
                    otherlv_3=(Token)match(input,HyphenMinusHyphenMinusGreaterThanSign,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoveDiskSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalShortDSLParser.g:1139:3: ( (otherlv_4= RULE_ID ) )
            // InternalShortDSLParser.g:1140:4: (otherlv_4= RULE_ID )
            {
            // InternalShortDSLParser.g:1140:4: (otherlv_4= RULE_ID )
            // InternalShortDSLParser.g:1141:5: otherlv_4= RULE_ID
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
    // InternalShortDSLParser.g:1156:1: entryRuleMoveAnySlotS returns [EObject current=null] : iv_ruleMoveAnySlotS= ruleMoveAnySlotS EOF ;
    public final EObject entryRuleMoveAnySlotS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveAnySlotS = null;


        try {
            // InternalShortDSLParser.g:1156:53: (iv_ruleMoveAnySlotS= ruleMoveAnySlotS EOF )
            // InternalShortDSLParser.g:1157:2: iv_ruleMoveAnySlotS= ruleMoveAnySlotS EOF
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
    // InternalShortDSLParser.g:1163:1: ruleMoveAnySlotS returns [EObject current=null] : ( () ( (lv_state_1_0= ruleDiskSlotStateValueS ) ) ( (lv_anySlot_2_0= ruleLocalVariableS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleMoveAnySlotS() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_state_1_0 = null;

        EObject lv_anySlot_2_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1169:2: ( ( () ( (lv_state_1_0= ruleDiskSlotStateValueS ) ) ( (lv_anySlot_2_0= ruleLocalVariableS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:1170:2: ( () ( (lv_state_1_0= ruleDiskSlotStateValueS ) ) ( (lv_anySlot_2_0= ruleLocalVariableS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:1170:2: ( () ( (lv_state_1_0= ruleDiskSlotStateValueS ) ) ( (lv_anySlot_2_0= ruleLocalVariableS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) )
            // InternalShortDSLParser.g:1171:3: () ( (lv_state_1_0= ruleDiskSlotStateValueS ) ) ( (lv_anySlot_2_0= ruleLocalVariableS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) )
            {
            // InternalShortDSLParser.g:1171:3: ()
            // InternalShortDSLParser.g:1172:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveAnySlotSAccess().getMoveAnySlotAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1178:3: ( (lv_state_1_0= ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:1179:4: (lv_state_1_0= ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:1179:4: (lv_state_1_0= ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:1180:5: lv_state_1_0= ruleDiskSlotStateValueS
            {

            					newCompositeNode(grammarAccess.getMoveAnySlotSAccess().getStateDiskSlotStateValueSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalShortDSLParser.g:1197:3: ( (lv_anySlot_2_0= ruleLocalVariableS ) )
            // InternalShortDSLParser.g:1198:4: (lv_anySlot_2_0= ruleLocalVariableS )
            {
            // InternalShortDSLParser.g:1198:4: (lv_anySlot_2_0= ruleLocalVariableS )
            // InternalShortDSLParser.g:1199:5: lv_anySlot_2_0= ruleLocalVariableS
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

            // InternalShortDSLParser.g:1216:3: (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==HyphenMinusGreaterThanSign) ) {
                alt16=1;
            }
            else if ( (LA16_0==HyphenMinusHyphenMinusGreaterThanSign) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalShortDSLParser.g:1217:4: otherlv_3= HyphenMinusGreaterThanSign
                    {
                    otherlv_3=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoveAnySlotSAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1222:4: otherlv_4= HyphenMinusHyphenMinusGreaterThanSign
                    {
                    otherlv_4=(Token)match(input,HyphenMinusHyphenMinusGreaterThanSign,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getMoveAnySlotSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalShortDSLParser.g:1227:3: ( (otherlv_5= RULE_ID ) )
            // InternalShortDSLParser.g:1228:4: (otherlv_5= RULE_ID )
            {
            // InternalShortDSLParser.g:1228:4: (otherlv_5= RULE_ID )
            // InternalShortDSLParser.g:1229:5: otherlv_5= RULE_ID
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
    // InternalShortDSLParser.g:1244:1: entryRuleMoveCraneS returns [EObject current=null] : iv_ruleMoveCraneS= ruleMoveCraneS EOF ;
    public final EObject entryRuleMoveCraneS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveCraneS = null;


        try {
            // InternalShortDSLParser.g:1244:51: (iv_ruleMoveCraneS= ruleMoveCraneS EOF )
            // InternalShortDSLParser.g:1245:2: iv_ruleMoveCraneS= ruleMoveCraneS EOF
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
    // InternalShortDSLParser.g:1251:1: ruleMoveCraneS returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_action_2_0= ruleCraneActionS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleMoveCraneS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_action_2_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1257:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_action_2_0= ruleCraneActionS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:1258:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_action_2_0= ruleCraneActionS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:1258:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_action_2_0= ruleCraneActionS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) )
            // InternalShortDSLParser.g:1259:3: () ( (otherlv_1= RULE_ID ) ) ( (lv_action_2_0= ruleCraneActionS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) )
            {
            // InternalShortDSLParser.g:1259:3: ()
            // InternalShortDSLParser.g:1260:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveCraneSAccess().getMoveCraneAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1266:3: ( (otherlv_1= RULE_ID ) )
            // InternalShortDSLParser.g:1267:4: (otherlv_1= RULE_ID )
            {
            // InternalShortDSLParser.g:1267:4: (otherlv_1= RULE_ID )
            // InternalShortDSLParser.g:1268:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveCraneSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_1, grammarAccess.getMoveCraneSAccess().getCraneCraneCrossReference_1_0());
            				

            }


            }

            // InternalShortDSLParser.g:1279:3: ( (lv_action_2_0= ruleCraneActionS ) )
            // InternalShortDSLParser.g:1280:4: (lv_action_2_0= ruleCraneActionS )
            {
            // InternalShortDSLParser.g:1280:4: (lv_action_2_0= ruleCraneActionS )
            // InternalShortDSLParser.g:1281:5: lv_action_2_0= ruleCraneActionS
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

            // InternalShortDSLParser.g:1298:3: (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==HyphenMinusGreaterThanSign) ) {
                alt17=1;
            }
            else if ( (LA17_0==HyphenMinusHyphenMinusGreaterThanSign) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalShortDSLParser.g:1299:4: otherlv_3= HyphenMinusGreaterThanSign
                    {
                    otherlv_3=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoveCraneSAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1304:4: otherlv_4= HyphenMinusHyphenMinusGreaterThanSign
                    {
                    otherlv_4=(Token)match(input,HyphenMinusHyphenMinusGreaterThanSign,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getMoveCraneSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalShortDSLParser.g:1309:3: ( (otherlv_5= RULE_ID ) )
            // InternalShortDSLParser.g:1310:4: (otherlv_5= RULE_ID )
            {
            // InternalShortDSLParser.g:1310:4: (otherlv_5= RULE_ID )
            // InternalShortDSLParser.g:1311:5: otherlv_5= RULE_ID
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
    // InternalShortDSLParser.g:1326:1: entryRuleCraneActionS returns [EObject current=null] : iv_ruleCraneActionS= ruleCraneActionS EOF ;
    public final EObject entryRuleCraneActionS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCraneActionS = null;


        try {
            // InternalShortDSLParser.g:1326:53: (iv_ruleCraneActionS= ruleCraneActionS EOF )
            // InternalShortDSLParser.g:1327:2: iv_ruleCraneActionS= ruleCraneActionS EOF
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
    // InternalShortDSLParser.g:1333:1: ruleCraneActionS returns [EObject current=null] : ( () (otherlv_1= Pickup | otherlv_2= Drop ) ) ;
    public final EObject ruleCraneActionS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:1339:2: ( ( () (otherlv_1= Pickup | otherlv_2= Drop ) ) )
            // InternalShortDSLParser.g:1340:2: ( () (otherlv_1= Pickup | otherlv_2= Drop ) )
            {
            // InternalShortDSLParser.g:1340:2: ( () (otherlv_1= Pickup | otherlv_2= Drop ) )
            // InternalShortDSLParser.g:1341:3: () (otherlv_1= Pickup | otherlv_2= Drop )
            {
            // InternalShortDSLParser.g:1341:3: ()
            // InternalShortDSLParser.g:1342:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCraneActionSAccess().getCraneActionAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1348:3: (otherlv_1= Pickup | otherlv_2= Drop )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Pickup) ) {
                alt18=1;
            }
            else if ( (LA18_0==Drop) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalShortDSLParser.g:1349:4: otherlv_1= Pickup
                    {
                    otherlv_1=(Token)match(input,Pickup,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getCraneActionSAccess().getPickupKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1354:4: otherlv_2= Drop
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
    // InternalShortDSLParser.g:1363:1: entryRuleConditionS returns [EObject current=null] : iv_ruleConditionS= ruleConditionS EOF ;
    public final EObject entryRuleConditionS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionS = null;


        try {
            // InternalShortDSLParser.g:1363:51: (iv_ruleConditionS= ruleConditionS EOF )
            // InternalShortDSLParser.g:1364:2: iv_ruleConditionS= ruleConditionS EOF
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
    // InternalShortDSLParser.g:1370:1: ruleConditionS returns [EObject current=null] : (this_ConditionVariableS_0= ruleConditionVariableS | this_ConditionDeviceS_1= ruleConditionDeviceS ) ;
    public final EObject ruleConditionS() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionVariableS_0 = null;

        EObject this_ConditionDeviceS_1 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1376:2: ( (this_ConditionVariableS_0= ruleConditionVariableS | this_ConditionDeviceS_1= ruleConditionDeviceS ) )
            // InternalShortDSLParser.g:1377:2: (this_ConditionVariableS_0= ruleConditionVariableS | this_ConditionDeviceS_1= ruleConditionDeviceS )
            {
            // InternalShortDSLParser.g:1377:2: (this_ConditionVariableS_0= ruleConditionVariableS | this_ConditionDeviceS_1= ruleConditionDeviceS )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==If) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==Dev) ) {
                    alt19=2;
                }
                else if ( (LA19_1==Var) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalShortDSLParser.g:1378:3: this_ConditionVariableS_0= ruleConditionVariableS
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
                    // InternalShortDSLParser.g:1387:3: this_ConditionDeviceS_1= ruleConditionDeviceS
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
    // InternalShortDSLParser.g:1399:1: entryRuleConditionVariableS returns [EObject current=null] : iv_ruleConditionVariableS= ruleConditionVariableS EOF ;
    public final EObject entryRuleConditionVariableS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionVariableS = null;


        try {
            // InternalShortDSLParser.g:1399:59: (iv_ruleConditionVariableS= ruleConditionVariableS EOF )
            // InternalShortDSLParser.g:1400:2: iv_ruleConditionVariableS= ruleConditionVariableS EOF
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
    // InternalShortDSLParser.g:1406:1: ruleConditionVariableS returns [EObject current=null] : ( () otherlv_1= If otherlv_2= Var ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_variableValue_5_0= ruleVariableValue ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END ) ;
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
            // InternalShortDSLParser.g:1412:2: ( ( () otherlv_1= If otherlv_2= Var ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_variableValue_5_0= ruleVariableValue ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END ) )
            // InternalShortDSLParser.g:1413:2: ( () otherlv_1= If otherlv_2= Var ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_variableValue_5_0= ruleVariableValue ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END )
            {
            // InternalShortDSLParser.g:1413:2: ( () otherlv_1= If otherlv_2= Var ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_variableValue_5_0= ruleVariableValue ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END )
            // InternalShortDSLParser.g:1414:3: () otherlv_1= If otherlv_2= Var ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_variableValue_5_0= ruleVariableValue ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END
            {
            // InternalShortDSLParser.g:1414:3: ()
            // InternalShortDSLParser.g:1415:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionVariableSAccess().getConditionVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,If,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionVariableSAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,Var,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionVariableSAccess().getVarKeyword_2());
            		
            // InternalShortDSLParser.g:1429:3: ( (otherlv_3= RULE_ID ) )
            // InternalShortDSLParser.g:1430:4: (otherlv_3= RULE_ID )
            {
            // InternalShortDSLParser.g:1430:4: (otherlv_3= RULE_ID )
            // InternalShortDSLParser.g:1431:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionVariableSRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_3, grammarAccess.getConditionVariableSAccess().getVariableVariableSCrossReference_3_0());
            				

            }


            }

            // InternalShortDSLParser.g:1442:3: ( (lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:1443:4: (lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:1443:4: (lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:1444:5: lv_comparisonOperatorVariable_4_0= ruleCOMPARISON_OPERATOR_S
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

            // InternalShortDSLParser.g:1461:3: ( (lv_variableValue_5_0= ruleVariableValue ) )
            // InternalShortDSLParser.g:1462:4: (lv_variableValue_5_0= ruleVariableValue )
            {
            // InternalShortDSLParser.g:1462:4: (lv_variableValue_5_0= ruleVariableValue )
            // InternalShortDSLParser.g:1463:5: lv_variableValue_5_0= ruleVariableValue
            {

            					newCompositeNode(grammarAccess.getConditionVariableSAccess().getVariableValueVariableValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_variableValue_5_0=ruleVariableValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionVariableSRule());
            					}
            					set(
            						current,
            						"variableValue",
            						lv_variableValue_5_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.VariableValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionVariableSAccess().getColonKeyword_6());
            		
            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_21); 

            			newLeafNode(this_BEGIN_7, grammarAccess.getConditionVariableSAccess().getBEGINTerminalRuleCall_7());
            		
            // InternalShortDSLParser.g:1488:3: ( (lv_statements_8_0= ruleStatementS ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=In_progress && LA20_0<=Complete)||LA20_0==Foreach||(LA20_0>=Pickup && LA20_0<=Vacant)||LA20_0==Drop||LA20_0==If||LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalShortDSLParser.g:1489:4: (lv_statements_8_0= ruleStatementS )
            	    {
            	    // InternalShortDSLParser.g:1489:4: (lv_statements_8_0= ruleStatementS )
            	    // InternalShortDSLParser.g:1490:5: lv_statements_8_0= ruleStatementS
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
            	    break loop20;
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
    // InternalShortDSLParser.g:1515:1: entryRuleConditionDeviceS returns [EObject current=null] : iv_ruleConditionDeviceS= ruleConditionDeviceS EOF ;
    public final EObject entryRuleConditionDeviceS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionDeviceS = null;


        try {
            // InternalShortDSLParser.g:1515:57: (iv_ruleConditionDeviceS= ruleConditionDeviceS EOF )
            // InternalShortDSLParser.g:1516:2: iv_ruleConditionDeviceS= ruleConditionDeviceS EOF
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
    // InternalShortDSLParser.g:1522:1: ruleConditionDeviceS returns [EObject current=null] : ( () otherlv_1= If otherlv_2= Dev ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_deviceValue_5_0= ruleDeviceValue ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END ) ;
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
            // InternalShortDSLParser.g:1528:2: ( ( () otherlv_1= If otherlv_2= Dev ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_deviceValue_5_0= ruleDeviceValue ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END ) )
            // InternalShortDSLParser.g:1529:2: ( () otherlv_1= If otherlv_2= Dev ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_deviceValue_5_0= ruleDeviceValue ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END )
            {
            // InternalShortDSLParser.g:1529:2: ( () otherlv_1= If otherlv_2= Dev ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_deviceValue_5_0= ruleDeviceValue ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END )
            // InternalShortDSLParser.g:1530:3: () otherlv_1= If otherlv_2= Dev ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_deviceValue_5_0= ruleDeviceValue ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END
            {
            // InternalShortDSLParser.g:1530:3: ()
            // InternalShortDSLParser.g:1531:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionDeviceSAccess().getConditionDeviceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,If,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionDeviceSAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,Dev,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionDeviceSAccess().getDevKeyword_2());
            		
            // InternalShortDSLParser.g:1545:3: ( (otherlv_3= RULE_ID ) )
            // InternalShortDSLParser.g:1546:4: (otherlv_3= RULE_ID )
            {
            // InternalShortDSLParser.g:1546:4: (otherlv_3= RULE_ID )
            // InternalShortDSLParser.g:1547:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionDeviceSRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_3, grammarAccess.getConditionDeviceSAccess().getDeviceDeviceSCrossReference_3_0());
            				

            }


            }

            // InternalShortDSLParser.g:1558:3: ( (lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:1559:4: (lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:1559:4: (lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:1560:5: lv_comparisonOperatorDevice_4_0= ruleCOMPARISON_OPERATOR_S
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

            // InternalShortDSLParser.g:1577:3: ( (lv_deviceValue_5_0= ruleDeviceValue ) )
            // InternalShortDSLParser.g:1578:4: (lv_deviceValue_5_0= ruleDeviceValue )
            {
            // InternalShortDSLParser.g:1578:4: (lv_deviceValue_5_0= ruleDeviceValue )
            // InternalShortDSLParser.g:1579:5: lv_deviceValue_5_0= ruleDeviceValue
            {

            					newCompositeNode(grammarAccess.getConditionDeviceSAccess().getDeviceValueDeviceValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_deviceValue_5_0=ruleDeviceValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionDeviceSRule());
            					}
            					set(
            						current,
            						"deviceValue",
            						lv_deviceValue_5_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.DeviceValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionDeviceSAccess().getColonKeyword_6());
            		
            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_21); 

            			newLeafNode(this_BEGIN_7, grammarAccess.getConditionDeviceSAccess().getBEGINTerminalRuleCall_7());
            		
            // InternalShortDSLParser.g:1604:3: ( (lv_statements_8_0= ruleStatementS ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=In_progress && LA21_0<=Complete)||LA21_0==Foreach||(LA21_0>=Pickup && LA21_0<=Vacant)||LA21_0==Drop||LA21_0==If||LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalShortDSLParser.g:1605:4: (lv_statements_8_0= ruleStatementS )
            	    {
            	    // InternalShortDSLParser.g:1605:4: (lv_statements_8_0= ruleStatementS )
            	    // InternalShortDSLParser.g:1606:5: lv_statements_8_0= ruleStatementS
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
            	    break loop21;
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
    // InternalShortDSLParser.g:1631:1: entryRuleMarkS returns [EObject current=null] : iv_ruleMarkS= ruleMarkS EOF ;
    public final EObject entryRuleMarkS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkS = null;


        try {
            // InternalShortDSLParser.g:1631:46: (iv_ruleMarkS= ruleMarkS EOF )
            // InternalShortDSLParser.g:1632:2: iv_ruleMarkS= ruleMarkS EOF
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
    // InternalShortDSLParser.g:1638:1: ruleMarkS returns [EObject current=null] : (this_MarkVariableValueS_0= ruleMarkVariableValueS | this_MarkCameraValueS_1= ruleMarkCameraValueS ) ;
    public final EObject ruleMarkS() throws RecognitionException {
        EObject current = null;

        EObject this_MarkVariableValueS_0 = null;

        EObject this_MarkCameraValueS_1 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1644:2: ( (this_MarkVariableValueS_0= ruleMarkVariableValueS | this_MarkCameraValueS_1= ruleMarkCameraValueS ) )
            // InternalShortDSLParser.g:1645:2: (this_MarkVariableValueS_0= ruleMarkVariableValueS | this_MarkCameraValueS_1= ruleMarkCameraValueS )
            {
            // InternalShortDSLParser.g:1645:2: (this_MarkVariableValueS_0= ruleMarkVariableValueS | this_MarkCameraValueS_1= ruleMarkCameraValueS )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==LeftParenthesis) ) {
                    alt22=1;
                }
                else if ( (LA22_1==Scan) ) {
                    alt22=2;
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
                    // InternalShortDSLParser.g:1646:3: this_MarkVariableValueS_0= ruleMarkVariableValueS
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
                    // InternalShortDSLParser.g:1655:3: this_MarkCameraValueS_1= ruleMarkCameraValueS
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
    // InternalShortDSLParser.g:1667:1: entryRuleMarkVariableValueS returns [EObject current=null] : iv_ruleMarkVariableValueS= ruleMarkVariableValueS EOF ;
    public final EObject entryRuleMarkVariableValueS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkVariableValueS = null;


        try {
            // InternalShortDSLParser.g:1667:59: (iv_ruleMarkVariableValueS= ruleMarkVariableValueS EOF )
            // InternalShortDSLParser.g:1668:2: iv_ruleMarkVariableValueS= ruleMarkVariableValueS EOF
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
    // InternalShortDSLParser.g:1674:1: ruleMarkVariableValueS returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_value_3_0= ruleValueSlot ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTIME_UNIT ) ) )? otherlv_7= RightParenthesis ) ;
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
            // InternalShortDSLParser.g:1680:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_value_3_0= ruleValueSlot ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTIME_UNIT ) ) )? otherlv_7= RightParenthesis ) )
            // InternalShortDSLParser.g:1681:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_value_3_0= ruleValueSlot ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTIME_UNIT ) ) )? otherlv_7= RightParenthesis )
            {
            // InternalShortDSLParser.g:1681:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_value_3_0= ruleValueSlot ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTIME_UNIT ) ) )? otherlv_7= RightParenthesis )
            // InternalShortDSLParser.g:1682:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_value_3_0= ruleValueSlot ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTIME_UNIT ) ) )? otherlv_7= RightParenthesis
            {
            // InternalShortDSLParser.g:1682:3: ()
            // InternalShortDSLParser.g:1683:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarkVariableValueSAccess().getMarkVariableValueAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1689:3: ( (otherlv_1= RULE_ID ) )
            // InternalShortDSLParser.g:1690:4: (otherlv_1= RULE_ID )
            {
            // InternalShortDSLParser.g:1690:4: (otherlv_1= RULE_ID )
            // InternalShortDSLParser.g:1691:5: otherlv_1= RULE_ID
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
            		
            // InternalShortDSLParser.g:1706:3: ( (lv_value_3_0= ruleValueSlot ) )
            // InternalShortDSLParser.g:1707:4: (lv_value_3_0= ruleValueSlot )
            {
            // InternalShortDSLParser.g:1707:4: (lv_value_3_0= ruleValueSlot )
            // InternalShortDSLParser.g:1708:5: lv_value_3_0= ruleValueSlot
            {

            					newCompositeNode(grammarAccess.getMarkVariableValueSAccess().getValueValueSlotParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_value_3_0=ruleValueSlot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMarkVariableValueSRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.ValueSlot");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:1725:3: (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTIME_UNIT ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Comma) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalShortDSLParser.g:1726:4: otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTIME_UNIT ) )
                    {
                    otherlv_4=(Token)match(input,Comma,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getMarkVariableValueSAccess().getCommaKeyword_4_0());
                    			
                    // InternalShortDSLParser.g:1730:4: ( (lv_time_5_0= RULE_INT ) )
                    // InternalShortDSLParser.g:1731:5: (lv_time_5_0= RULE_INT )
                    {
                    // InternalShortDSLParser.g:1731:5: (lv_time_5_0= RULE_INT )
                    // InternalShortDSLParser.g:1732:6: lv_time_5_0= RULE_INT
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

                    // InternalShortDSLParser.g:1748:4: ( (lv_unit_6_0= ruleTIME_UNIT ) )
                    // InternalShortDSLParser.g:1749:5: (lv_unit_6_0= ruleTIME_UNIT )
                    {
                    // InternalShortDSLParser.g:1749:5: (lv_unit_6_0= ruleTIME_UNIT )
                    // InternalShortDSLParser.g:1750:6: lv_unit_6_0= ruleTIME_UNIT
                    {

                    						newCompositeNode(grammarAccess.getMarkVariableValueSAccess().getUnitTIME_UNITEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_unit_6_0=ruleTIME_UNIT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarkVariableValueSRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_6_0,
                    							"xtext.factoryLang.shortDSL.ShortDSL.TIME_UNIT");
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
    // InternalShortDSLParser.g:1776:1: entryRuleMarkCameraValueS returns [EObject current=null] : iv_ruleMarkCameraValueS= ruleMarkCameraValueS EOF ;
    public final EObject entryRuleMarkCameraValueS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkCameraValueS = null;


        try {
            // InternalShortDSLParser.g:1776:57: (iv_ruleMarkCameraValueS= ruleMarkCameraValueS EOF )
            // InternalShortDSLParser.g:1777:2: iv_ruleMarkCameraValueS= ruleMarkCameraValueS EOF
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
    // InternalShortDSLParser.g:1783:1: ruleMarkCameraValueS returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Scan ( (lv_variable_3_0= ruleLocalVariableS ) ) ) ;
    public final EObject ruleMarkCameraValueS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1789:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Scan ( (lv_variable_3_0= ruleLocalVariableS ) ) ) )
            // InternalShortDSLParser.g:1790:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Scan ( (lv_variable_3_0= ruleLocalVariableS ) ) )
            {
            // InternalShortDSLParser.g:1790:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Scan ( (lv_variable_3_0= ruleLocalVariableS ) ) )
            // InternalShortDSLParser.g:1791:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Scan ( (lv_variable_3_0= ruleLocalVariableS ) )
            {
            // InternalShortDSLParser.g:1791:3: ()
            // InternalShortDSLParser.g:1792:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarkCameraValueSAccess().getMarkCameraValueAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1798:3: ( (otherlv_1= RULE_ID ) )
            // InternalShortDSLParser.g:1799:4: (otherlv_1= RULE_ID )
            {
            // InternalShortDSLParser.g:1799:4: (otherlv_1= RULE_ID )
            // InternalShortDSLParser.g:1800:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMarkCameraValueSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_1, grammarAccess.getMarkCameraValueSAccess().getCameraCameraCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,Scan,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMarkCameraValueSAccess().getScanKeyword_2());
            		
            // InternalShortDSLParser.g:1815:3: ( (lv_variable_3_0= ruleLocalVariableS ) )
            // InternalShortDSLParser.g:1816:4: (lv_variable_3_0= ruleLocalVariableS )
            {
            // InternalShortDSLParser.g:1816:4: (lv_variable_3_0= ruleLocalVariableS )
            // InternalShortDSLParser.g:1817:5: lv_variable_3_0= ruleLocalVariableS
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
    // InternalShortDSLParser.g:1838:1: entryRuleLocalVariableS returns [EObject current=null] : iv_ruleLocalVariableS= ruleLocalVariableS EOF ;
    public final EObject entryRuleLocalVariableS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableS = null;


        try {
            // InternalShortDSLParser.g:1838:55: (iv_ruleLocalVariableS= ruleLocalVariableS EOF )
            // InternalShortDSLParser.g:1839:2: iv_ruleLocalVariableS= ruleLocalVariableS EOF
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
    // InternalShortDSLParser.g:1845:1: ruleLocalVariableS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLocalVariableS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:1851:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:1852:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:1852:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalShortDSLParser.g:1853:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalShortDSLParser.g:1853:3: ()
            // InternalShortDSLParser.g:1854:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocalVariableSAccess().getLocalVariableAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1860:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:1861:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:1861:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:1862:5: lv_name_1_0= RULE_ID
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
    // InternalShortDSLParser.g:1882:1: entryRuleGlobalVariableS returns [EObject current=null] : iv_ruleGlobalVariableS= ruleGlobalVariableS EOF ;
    public final EObject entryRuleGlobalVariableS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalVariableS = null;


        try {
            // InternalShortDSLParser.g:1882:56: (iv_ruleGlobalVariableS= ruleGlobalVariableS EOF )
            // InternalShortDSLParser.g:1883:2: iv_ruleGlobalVariableS= ruleGlobalVariableS EOF
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
    // InternalShortDSLParser.g:1889:1: ruleGlobalVariableS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGlobalVariableS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:1895:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:1896:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:1896:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalShortDSLParser.g:1897:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalShortDSLParser.g:1897:3: ()
            // InternalShortDSLParser.g:1898:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalVariableSAccess().getGlobalVariableAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1904:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:1905:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:1905:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:1906:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleVariableValue"
    // InternalShortDSLParser.g:1926:1: entryRuleVariableValue returns [EObject current=null] : iv_ruleVariableValue= ruleVariableValue EOF ;
    public final EObject entryRuleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue = null;


        try {
            // InternalShortDSLParser.g:1926:54: (iv_ruleVariableValue= ruleVariableValue EOF )
            // InternalShortDSLParser.g:1927:2: iv_ruleVariableValue= ruleVariableValue EOF
            {
             newCompositeNode(grammarAccess.getVariableValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableValue=ruleVariableValue();

            state._fsp--;

             current =iv_ruleVariableValue; 
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
    // $ANTLR end "entryRuleVariableValue"


    // $ANTLR start "ruleVariableValue"
    // InternalShortDSLParser.g:1933:1: ruleVariableValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleDiskSlotStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) | ( (lv_value_2_0= ruleNumberS ) ) | ( (lv_value_3_0= ruleDiskStateValueS ) ) | ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1939:2: ( ( ( (lv_value_0_0= ruleDiskSlotStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) | ( (lv_value_2_0= ruleNumberS ) ) | ( (lv_value_3_0= ruleDiskStateValueS ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:1940:2: ( ( (lv_value_0_0= ruleDiskSlotStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) | ( (lv_value_2_0= ruleNumberS ) ) | ( (lv_value_3_0= ruleDiskStateValueS ) ) | ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:1940:2: ( ( (lv_value_0_0= ruleDiskSlotStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) | ( (lv_value_2_0= ruleNumberS ) ) | ( (lv_value_3_0= ruleDiskStateValueS ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt24=5;
            switch ( input.LA(1) ) {
            case In_progress:
            case Complete:
            case Vacant:
                {
                alt24=1;
                }
                break;
            case Green:
            case Blue:
            case Red:
                {
                alt24=2;
                }
                break;
            case RULE_INT:
                {
                alt24=3;
                }
                break;
            case Empty:
            case Full:
                {
                alt24=4;
                }
                break;
            case RULE_ID:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalShortDSLParser.g:1941:3: ( (lv_value_0_0= ruleDiskSlotStateValueS ) )
                    {
                    // InternalShortDSLParser.g:1941:3: ( (lv_value_0_0= ruleDiskSlotStateValueS ) )
                    // InternalShortDSLParser.g:1942:4: (lv_value_0_0= ruleDiskSlotStateValueS )
                    {
                    // InternalShortDSLParser.g:1942:4: (lv_value_0_0= ruleDiskSlotStateValueS )
                    // InternalShortDSLParser.g:1943:5: lv_value_0_0= ruleDiskSlotStateValueS
                    {

                    					newCompositeNode(grammarAccess.getVariableValueAccess().getValueDiskSlotStateValueSParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleDiskSlotStateValueS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableValueRule());
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
                    // InternalShortDSLParser.g:1961:3: ( (lv_value_1_0= ruleColorValueS ) )
                    {
                    // InternalShortDSLParser.g:1961:3: ( (lv_value_1_0= ruleColorValueS ) )
                    // InternalShortDSLParser.g:1962:4: (lv_value_1_0= ruleColorValueS )
                    {
                    // InternalShortDSLParser.g:1962:4: (lv_value_1_0= ruleColorValueS )
                    // InternalShortDSLParser.g:1963:5: lv_value_1_0= ruleColorValueS
                    {

                    					newCompositeNode(grammarAccess.getVariableValueAccess().getValueColorValueSParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleColorValueS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableValueRule());
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
                    // InternalShortDSLParser.g:1981:3: ( (lv_value_2_0= ruleNumberS ) )
                    {
                    // InternalShortDSLParser.g:1981:3: ( (lv_value_2_0= ruleNumberS ) )
                    // InternalShortDSLParser.g:1982:4: (lv_value_2_0= ruleNumberS )
                    {
                    // InternalShortDSLParser.g:1982:4: (lv_value_2_0= ruleNumberS )
                    // InternalShortDSLParser.g:1983:5: lv_value_2_0= ruleNumberS
                    {

                    					newCompositeNode(grammarAccess.getVariableValueAccess().getValueNumberSParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleNumberS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableValueRule());
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
                    // InternalShortDSLParser.g:2001:3: ( (lv_value_3_0= ruleDiskStateValueS ) )
                    {
                    // InternalShortDSLParser.g:2001:3: ( (lv_value_3_0= ruleDiskStateValueS ) )
                    // InternalShortDSLParser.g:2002:4: (lv_value_3_0= ruleDiskStateValueS )
                    {
                    // InternalShortDSLParser.g:2002:4: (lv_value_3_0= ruleDiskStateValueS )
                    // InternalShortDSLParser.g:2003:5: lv_value_3_0= ruleDiskStateValueS
                    {

                    					newCompositeNode(grammarAccess.getVariableValueAccess().getValueDiskStateValueSParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleDiskStateValueS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableValueRule());
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
                    // InternalShortDSLParser.g:2021:3: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalShortDSLParser.g:2021:3: ( (otherlv_4= RULE_ID ) )
                    // InternalShortDSLParser.g:2022:4: (otherlv_4= RULE_ID )
                    {
                    // InternalShortDSLParser.g:2022:4: (otherlv_4= RULE_ID )
                    // InternalShortDSLParser.g:2023:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableValueRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getVariableValueAccess().getRefVariableSCrossReference_4_0());
                    				

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
    // $ANTLR end "ruleVariableValue"


    // $ANTLR start "entryRuleDeviceValue"
    // InternalShortDSLParser.g:2038:1: entryRuleDeviceValue returns [EObject current=null] : iv_ruleDeviceValue= ruleDeviceValue EOF ;
    public final EObject entryRuleDeviceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceValue = null;


        try {
            // InternalShortDSLParser.g:2038:52: (iv_ruleDeviceValue= ruleDeviceValue EOF )
            // InternalShortDSLParser.g:2039:2: iv_ruleDeviceValue= ruleDeviceValue EOF
            {
             newCompositeNode(grammarAccess.getDeviceValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceValue=ruleDeviceValue();

            state._fsp--;

             current =iv_ruleDeviceValue; 
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
    // $ANTLR end "entryRuleDeviceValue"


    // $ANTLR start "ruleDeviceValue"
    // InternalShortDSLParser.g:2045:1: ruleDeviceValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleDiskStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDeviceValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:2051:2: ( ( ( (lv_value_0_0= ruleDiskStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:2052:2: ( ( (lv_value_0_0= ruleDiskStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:2052:2: ( ( (lv_value_0_0= ruleDiskStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case Empty:
            case Full:
                {
                alt25=1;
                }
                break;
            case Green:
            case Blue:
            case Red:
                {
                alt25=2;
                }
                break;
            case RULE_ID:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalShortDSLParser.g:2053:3: ( (lv_value_0_0= ruleDiskStateValueS ) )
                    {
                    // InternalShortDSLParser.g:2053:3: ( (lv_value_0_0= ruleDiskStateValueS ) )
                    // InternalShortDSLParser.g:2054:4: (lv_value_0_0= ruleDiskStateValueS )
                    {
                    // InternalShortDSLParser.g:2054:4: (lv_value_0_0= ruleDiskStateValueS )
                    // InternalShortDSLParser.g:2055:5: lv_value_0_0= ruleDiskStateValueS
                    {

                    					newCompositeNode(grammarAccess.getDeviceValueAccess().getValueDiskStateValueSParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleDiskStateValueS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeviceValueRule());
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
                    // InternalShortDSLParser.g:2073:3: ( (lv_value_1_0= ruleColorValueS ) )
                    {
                    // InternalShortDSLParser.g:2073:3: ( (lv_value_1_0= ruleColorValueS ) )
                    // InternalShortDSLParser.g:2074:4: (lv_value_1_0= ruleColorValueS )
                    {
                    // InternalShortDSLParser.g:2074:4: (lv_value_1_0= ruleColorValueS )
                    // InternalShortDSLParser.g:2075:5: lv_value_1_0= ruleColorValueS
                    {

                    					newCompositeNode(grammarAccess.getDeviceValueAccess().getValueColorValueSParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleColorValueS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeviceValueRule());
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
                    // InternalShortDSLParser.g:2093:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalShortDSLParser.g:2093:3: ( (otherlv_2= RULE_ID ) )
                    // InternalShortDSLParser.g:2094:4: (otherlv_2= RULE_ID )
                    {
                    // InternalShortDSLParser.g:2094:4: (otherlv_2= RULE_ID )
                    // InternalShortDSLParser.g:2095:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDeviceValueRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getDeviceValueAccess().getConfigurationValueConfigurationValueSCrossReference_2_0());
                    				

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
    // $ANTLR end "ruleDeviceValue"


    // $ANTLR start "entryRuleValueSlot"
    // InternalShortDSLParser.g:2110:1: entryRuleValueSlot returns [EObject current=null] : iv_ruleValueSlot= ruleValueSlot EOF ;
    public final EObject entryRuleValueSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSlot = null;


        try {
            // InternalShortDSLParser.g:2110:50: (iv_ruleValueSlot= ruleValueSlot EOF )
            // InternalShortDSLParser.g:2111:2: iv_ruleValueSlot= ruleValueSlot EOF
            {
             newCompositeNode(grammarAccess.getValueSlotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueSlot=ruleValueSlot();

            state._fsp--;

             current =iv_ruleValueSlot; 
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
    // $ANTLR end "entryRuleValueSlot"


    // $ANTLR start "ruleValueSlot"
    // InternalShortDSLParser.g:2117:1: ruleValueSlot returns [EObject current=null] : ( ( (lv_value_0_0= ruleDiskSlotStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) ) ;
    public final EObject ruleValueSlot() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:2123:2: ( ( ( (lv_value_0_0= ruleDiskSlotStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) ) )
            // InternalShortDSLParser.g:2124:2: ( ( (lv_value_0_0= ruleDiskSlotStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) )
            {
            // InternalShortDSLParser.g:2124:2: ( ( (lv_value_0_0= ruleDiskSlotStateValueS ) ) | ( (lv_value_1_0= ruleColorValueS ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=In_progress && LA26_0<=Complete)||LA26_0==Vacant) ) {
                alt26=1;
            }
            else if ( (LA26_0==Green||LA26_0==Blue||LA26_0==Red) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalShortDSLParser.g:2125:3: ( (lv_value_0_0= ruleDiskSlotStateValueS ) )
                    {
                    // InternalShortDSLParser.g:2125:3: ( (lv_value_0_0= ruleDiskSlotStateValueS ) )
                    // InternalShortDSLParser.g:2126:4: (lv_value_0_0= ruleDiskSlotStateValueS )
                    {
                    // InternalShortDSLParser.g:2126:4: (lv_value_0_0= ruleDiskSlotStateValueS )
                    // InternalShortDSLParser.g:2127:5: lv_value_0_0= ruleDiskSlotStateValueS
                    {

                    					newCompositeNode(grammarAccess.getValueSlotAccess().getValueDiskSlotStateValueSParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleDiskSlotStateValueS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueSlotRule());
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
                    // InternalShortDSLParser.g:2145:3: ( (lv_value_1_0= ruleColorValueS ) )
                    {
                    // InternalShortDSLParser.g:2145:3: ( (lv_value_1_0= ruleColorValueS ) )
                    // InternalShortDSLParser.g:2146:4: (lv_value_1_0= ruleColorValueS )
                    {
                    // InternalShortDSLParser.g:2146:4: (lv_value_1_0= ruleColorValueS )
                    // InternalShortDSLParser.g:2147:5: lv_value_1_0= ruleColorValueS
                    {

                    					newCompositeNode(grammarAccess.getValueSlotAccess().getValueColorValueSParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleColorValueS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueSlotRule());
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
    // $ANTLR end "ruleValueSlot"


    // $ANTLR start "entryRuleDiskStateValueS"
    // InternalShortDSLParser.g:2168:1: entryRuleDiskStateValueS returns [EObject current=null] : iv_ruleDiskStateValueS= ruleDiskStateValueS EOF ;
    public final EObject entryRuleDiskStateValueS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskStateValueS = null;


        try {
            // InternalShortDSLParser.g:2168:56: (iv_ruleDiskStateValueS= ruleDiskStateValueS EOF )
            // InternalShortDSLParser.g:2169:2: iv_ruleDiskStateValueS= ruleDiskStateValueS EOF
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
    // InternalShortDSLParser.g:2175:1: ruleDiskStateValueS returns [EObject current=null] : ( (lv_value_0_0= ruleDISK_STATES_S ) ) ;
    public final EObject ruleDiskStateValueS() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:2181:2: ( ( (lv_value_0_0= ruleDISK_STATES_S ) ) )
            // InternalShortDSLParser.g:2182:2: ( (lv_value_0_0= ruleDISK_STATES_S ) )
            {
            // InternalShortDSLParser.g:2182:2: ( (lv_value_0_0= ruleDISK_STATES_S ) )
            // InternalShortDSLParser.g:2183:3: (lv_value_0_0= ruleDISK_STATES_S )
            {
            // InternalShortDSLParser.g:2183:3: (lv_value_0_0= ruleDISK_STATES_S )
            // InternalShortDSLParser.g:2184:4: lv_value_0_0= ruleDISK_STATES_S
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
    // InternalShortDSLParser.g:2204:1: entryRuleDiskSlotStateValueS returns [EObject current=null] : iv_ruleDiskSlotStateValueS= ruleDiskSlotStateValueS EOF ;
    public final EObject entryRuleDiskSlotStateValueS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskSlotStateValueS = null;


        try {
            // InternalShortDSLParser.g:2204:60: (iv_ruleDiskSlotStateValueS= ruleDiskSlotStateValueS EOF )
            // InternalShortDSLParser.g:2205:2: iv_ruleDiskSlotStateValueS= ruleDiskSlotStateValueS EOF
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
    // InternalShortDSLParser.g:2211:1: ruleDiskSlotStateValueS returns [EObject current=null] : ( (lv_value_0_0= ruleDISK_SLOT_STATES_S ) ) ;
    public final EObject ruleDiskSlotStateValueS() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:2217:2: ( ( (lv_value_0_0= ruleDISK_SLOT_STATES_S ) ) )
            // InternalShortDSLParser.g:2218:2: ( (lv_value_0_0= ruleDISK_SLOT_STATES_S ) )
            {
            // InternalShortDSLParser.g:2218:2: ( (lv_value_0_0= ruleDISK_SLOT_STATES_S ) )
            // InternalShortDSLParser.g:2219:3: (lv_value_0_0= ruleDISK_SLOT_STATES_S )
            {
            // InternalShortDSLParser.g:2219:3: (lv_value_0_0= ruleDISK_SLOT_STATES_S )
            // InternalShortDSLParser.g:2220:4: lv_value_0_0= ruleDISK_SLOT_STATES_S
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
    // InternalShortDSLParser.g:2240:1: entryRuleColorValueS returns [EObject current=null] : iv_ruleColorValueS= ruleColorValueS EOF ;
    public final EObject entryRuleColorValueS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorValueS = null;


        try {
            // InternalShortDSLParser.g:2240:52: (iv_ruleColorValueS= ruleColorValueS EOF )
            // InternalShortDSLParser.g:2241:2: iv_ruleColorValueS= ruleColorValueS EOF
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
    // InternalShortDSLParser.g:2247:1: ruleColorValueS returns [EObject current=null] : ( (lv_value_0_0= ruleCOLOR_S ) ) ;
    public final EObject ruleColorValueS() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:2253:2: ( ( (lv_value_0_0= ruleCOLOR_S ) ) )
            // InternalShortDSLParser.g:2254:2: ( (lv_value_0_0= ruleCOLOR_S ) )
            {
            // InternalShortDSLParser.g:2254:2: ( (lv_value_0_0= ruleCOLOR_S ) )
            // InternalShortDSLParser.g:2255:3: (lv_value_0_0= ruleCOLOR_S )
            {
            // InternalShortDSLParser.g:2255:3: (lv_value_0_0= ruleCOLOR_S )
            // InternalShortDSLParser.g:2256:4: lv_value_0_0= ruleCOLOR_S
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
    // InternalShortDSLParser.g:2276:1: entryRuleNumberS returns [EObject current=null] : iv_ruleNumberS= ruleNumberS EOF ;
    public final EObject entryRuleNumberS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberS = null;


        try {
            // InternalShortDSLParser.g:2276:48: (iv_ruleNumberS= ruleNumberS EOF )
            // InternalShortDSLParser.g:2277:2: iv_ruleNumberS= ruleNumberS EOF
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
    // InternalShortDSLParser.g:2283:1: ruleNumberS returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberS() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:2289:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalShortDSLParser.g:2290:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalShortDSLParser.g:2290:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalShortDSLParser.g:2291:3: (lv_value_0_0= RULE_INT )
            {
            // InternalShortDSLParser.g:2291:3: (lv_value_0_0= RULE_INT )
            // InternalShortDSLParser.g:2292:4: lv_value_0_0= RULE_INT
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


    // $ANTLR start "ruleCOMPARISON_OPERATOR_S"
    // InternalShortDSLParser.g:2311:1: ruleCOMPARISON_OPERATOR_S returns [Enumerator current=null] : ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) ) ;
    public final Enumerator ruleCOMPARISON_OPERATOR_S() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:2317:2: ( ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) ) )
            // InternalShortDSLParser.g:2318:2: ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) )
            {
            // InternalShortDSLParser.g:2318:2: ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case EqualsSign:
                {
                alt27=1;
                }
                break;
            case LessThanSign:
                {
                alt27=2;
                }
                break;
            case GreaterThanSign:
                {
                alt27=3;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalShortDSLParser.g:2319:3: (enumLiteral_0= EqualsSign )
                    {
                    // InternalShortDSLParser.g:2319:3: (enumLiteral_0= EqualsSign )
                    // InternalShortDSLParser.g:2320:4: enumLiteral_0= EqualsSign
                    {
                    enumLiteral_0=(Token)match(input,EqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPERATOR_SAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOMPARISON_OPERATOR_SAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2327:3: (enumLiteral_1= LessThanSign )
                    {
                    // InternalShortDSLParser.g:2327:3: (enumLiteral_1= LessThanSign )
                    // InternalShortDSLParser.g:2328:4: enumLiteral_1= LessThanSign
                    {
                    enumLiteral_1=(Token)match(input,LessThanSign,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPERATOR_SAccess().getLESS_THANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOMPARISON_OPERATOR_SAccess().getLESS_THANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:2335:3: (enumLiteral_2= GreaterThanSign )
                    {
                    // InternalShortDSLParser.g:2335:3: (enumLiteral_2= GreaterThanSign )
                    // InternalShortDSLParser.g:2336:4: enumLiteral_2= GreaterThanSign
                    {
                    enumLiteral_2=(Token)match(input,GreaterThanSign,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPERATOR_SAccess().getGREATER_THANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOMPARISON_OPERATOR_SAccess().getGREATER_THANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalShortDSLParser.g:2343:3: (enumLiteral_3= ExclamationMarkEqualsSign )
                    {
                    // InternalShortDSLParser.g:2343:3: (enumLiteral_3= ExclamationMarkEqualsSign )
                    // InternalShortDSLParser.g:2344:4: enumLiteral_3= ExclamationMarkEqualsSign
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
    // InternalShortDSLParser.g:2354:1: ruleCOLOR_S returns [Enumerator current=null] : ( (enumLiteral_0= Red ) | (enumLiteral_1= Green ) | (enumLiteral_2= Blue ) ) ;
    public final Enumerator ruleCOLOR_S() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:2360:2: ( ( (enumLiteral_0= Red ) | (enumLiteral_1= Green ) | (enumLiteral_2= Blue ) ) )
            // InternalShortDSLParser.g:2361:2: ( (enumLiteral_0= Red ) | (enumLiteral_1= Green ) | (enumLiteral_2= Blue ) )
            {
            // InternalShortDSLParser.g:2361:2: ( (enumLiteral_0= Red ) | (enumLiteral_1= Green ) | (enumLiteral_2= Blue ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case Red:
                {
                alt28=1;
                }
                break;
            case Green:
                {
                alt28=2;
                }
                break;
            case Blue:
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
                    // InternalShortDSLParser.g:2362:3: (enumLiteral_0= Red )
                    {
                    // InternalShortDSLParser.g:2362:3: (enumLiteral_0= Red )
                    // InternalShortDSLParser.g:2363:4: enumLiteral_0= Red
                    {
                    enumLiteral_0=(Token)match(input,Red,FOLLOW_2); 

                    				current = grammarAccess.getCOLOR_SAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOLOR_SAccess().getREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2370:3: (enumLiteral_1= Green )
                    {
                    // InternalShortDSLParser.g:2370:3: (enumLiteral_1= Green )
                    // InternalShortDSLParser.g:2371:4: enumLiteral_1= Green
                    {
                    enumLiteral_1=(Token)match(input,Green,FOLLOW_2); 

                    				current = grammarAccess.getCOLOR_SAccess().getGREENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOLOR_SAccess().getGREENEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:2378:3: (enumLiteral_2= Blue )
                    {
                    // InternalShortDSLParser.g:2378:3: (enumLiteral_2= Blue )
                    // InternalShortDSLParser.g:2379:4: enumLiteral_2= Blue
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
    // InternalShortDSLParser.g:2389:1: ruleDISK_SLOT_STATES_S returns [Enumerator current=null] : ( (enumLiteral_0= Vacant ) | (enumLiteral_1= In_progress ) | (enumLiteral_2= Complete ) ) ;
    public final Enumerator ruleDISK_SLOT_STATES_S() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:2395:2: ( ( (enumLiteral_0= Vacant ) | (enumLiteral_1= In_progress ) | (enumLiteral_2= Complete ) ) )
            // InternalShortDSLParser.g:2396:2: ( (enumLiteral_0= Vacant ) | (enumLiteral_1= In_progress ) | (enumLiteral_2= Complete ) )
            {
            // InternalShortDSLParser.g:2396:2: ( (enumLiteral_0= Vacant ) | (enumLiteral_1= In_progress ) | (enumLiteral_2= Complete ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case Vacant:
                {
                alt29=1;
                }
                break;
            case In_progress:
                {
                alt29=2;
                }
                break;
            case Complete:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalShortDSLParser.g:2397:3: (enumLiteral_0= Vacant )
                    {
                    // InternalShortDSLParser.g:2397:3: (enumLiteral_0= Vacant )
                    // InternalShortDSLParser.g:2398:4: enumLiteral_0= Vacant
                    {
                    enumLiteral_0=(Token)match(input,Vacant,FOLLOW_2); 

                    				current = grammarAccess.getDISK_SLOT_STATES_SAccess().getFREEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDISK_SLOT_STATES_SAccess().getFREEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2405:3: (enumLiteral_1= In_progress )
                    {
                    // InternalShortDSLParser.g:2405:3: (enumLiteral_1= In_progress )
                    // InternalShortDSLParser.g:2406:4: enumLiteral_1= In_progress
                    {
                    enumLiteral_1=(Token)match(input,In_progress,FOLLOW_2); 

                    				current = grammarAccess.getDISK_SLOT_STATES_SAccess().getIN_PROGRESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDISK_SLOT_STATES_SAccess().getIN_PROGRESSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:2413:3: (enumLiteral_2= Complete )
                    {
                    // InternalShortDSLParser.g:2413:3: (enumLiteral_2= Complete )
                    // InternalShortDSLParser.g:2414:4: enumLiteral_2= Complete
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
    // InternalShortDSLParser.g:2424:1: ruleDISK_STATES_S returns [Enumerator current=null] : ( (enumLiteral_0= Full ) | (enumLiteral_1= Empty ) ) ;
    public final Enumerator ruleDISK_STATES_S() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:2430:2: ( ( (enumLiteral_0= Full ) | (enumLiteral_1= Empty ) ) )
            // InternalShortDSLParser.g:2431:2: ( (enumLiteral_0= Full ) | (enumLiteral_1= Empty ) )
            {
            // InternalShortDSLParser.g:2431:2: ( (enumLiteral_0= Full ) | (enumLiteral_1= Empty ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Full) ) {
                alt30=1;
            }
            else if ( (LA30_0==Empty) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalShortDSLParser.g:2432:3: (enumLiteral_0= Full )
                    {
                    // InternalShortDSLParser.g:2432:3: (enumLiteral_0= Full )
                    // InternalShortDSLParser.g:2433:4: enumLiteral_0= Full
                    {
                    enumLiteral_0=(Token)match(input,Full,FOLLOW_2); 

                    				current = grammarAccess.getDISK_STATES_SAccess().getFULLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDISK_STATES_SAccess().getFULLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2440:3: (enumLiteral_1= Empty )
                    {
                    // InternalShortDSLParser.g:2440:3: (enumLiteral_1= Empty )
                    // InternalShortDSLParser.g:2441:4: enumLiteral_1= Empty
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


    // $ANTLR start "ruleTIME_UNIT"
    // InternalShortDSLParser.g:2451:1: ruleTIME_UNIT returns [Enumerator current=null] : ( (enumLiteral_0= S ) | (enumLiteral_1= M ) | (enumLiteral_2= H ) ) ;
    public final Enumerator ruleTIME_UNIT() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:2457:2: ( ( (enumLiteral_0= S ) | (enumLiteral_1= M ) | (enumLiteral_2= H ) ) )
            // InternalShortDSLParser.g:2458:2: ( (enumLiteral_0= S ) | (enumLiteral_1= M ) | (enumLiteral_2= H ) )
            {
            // InternalShortDSLParser.g:2458:2: ( (enumLiteral_0= S ) | (enumLiteral_1= M ) | (enumLiteral_2= H ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case S:
                {
                alt31=1;
                }
                break;
            case M:
                {
                alt31=2;
                }
                break;
            case H:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalShortDSLParser.g:2459:3: (enumLiteral_0= S )
                    {
                    // InternalShortDSLParser.g:2459:3: (enumLiteral_0= S )
                    // InternalShortDSLParser.g:2460:4: enumLiteral_0= S
                    {
                    enumLiteral_0=(Token)match(input,S,FOLLOW_2); 

                    				current = grammarAccess.getTIME_UNITAccess().getSECONDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTIME_UNITAccess().getSECONDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2467:3: (enumLiteral_1= M )
                    {
                    // InternalShortDSLParser.g:2467:3: (enumLiteral_1= M )
                    // InternalShortDSLParser.g:2468:4: enumLiteral_1= M
                    {
                    enumLiteral_1=(Token)match(input,M,FOLLOW_2); 

                    				current = grammarAccess.getTIME_UNITAccess().getMINUTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTIME_UNITAccess().getMINUTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:2475:3: (enumLiteral_2= H )
                    {
                    // InternalShortDSLParser.g:2475:3: (enumLiteral_2= H )
                    // InternalShortDSLParser.g:2476:4: enumLiteral_2= H
                    {
                    enumLiteral_2=(Token)match(input,H,FOLLOW_2); 

                    				current = grammarAccess.getTIME_UNITAccess().getHOUREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTIME_UNITAccess().getHOUREnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTIME_UNIT"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000805000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000805000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000800100086B0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000C00100086B0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000E04000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000180000815C30L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000815800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000805430L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000040000L});

}