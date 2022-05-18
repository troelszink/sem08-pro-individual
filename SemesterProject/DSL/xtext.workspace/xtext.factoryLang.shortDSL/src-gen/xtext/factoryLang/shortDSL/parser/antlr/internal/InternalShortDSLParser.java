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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "In_progress", "Complete", "Devices", "Foreach", "Pickup", "Empty", "Green", "Short", "Blue", "Drop", "Free", "Full", "Long", "Test", "HyphenMinusHyphenMinusGreaterThanSign", "Dsl", "Red", "Use", "ExclamationMarkEqualsSign", "HyphenMinusGreaterThanSign", "If", "LeftParenthesis", "RightParenthesis", "Comma", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "LeftCurlyBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=35;
    public static final int RULE_BEGIN=34;
    public static final int Complete=5;
    public static final int RULE_STRING=38;
    public static final int Devices=6;
    public static final int Full=15;
    public static final int LessThanSign=29;
    public static final int RULE_SL_COMMENT=40;
    public static final int Comma=27;
    public static final int EqualsSign=30;
    public static final int Empty=9;
    public static final int LeftParenthesis=25;
    public static final int Test=17;
    public static final int In_progress=4;
    public static final int Colon=28;
    public static final int RightCurlyBracket=33;
    public static final int Dsl=19;
    public static final int EOF=-1;
    public static final int Short=11;
    public static final int GreaterThanSign=31;
    public static final int RULE_ID=36;
    public static final int Pickup=8;
    public static final int Blue=12;
    public static final int RULE_WS=41;
    public static final int Use=21;
    public static final int RightParenthesis=26;
    public static final int LeftCurlyBracket=32;
    public static final int RULE_ANY_OTHER=42;
    public static final int Free=14;
    public static final int Drop=13;
    public static final int Red=20;
    public static final int HyphenMinusHyphenMinusGreaterThanSign=18;
    public static final int RULE_INT=37;
    public static final int Long=16;
    public static final int RULE_ML_COMMENT=39;
    public static final int Foreach=7;
    public static final int ExclamationMarkEqualsSign=22;
    public static final int HyphenMinusGreaterThanSign=23;
    public static final int If=24;
    public static final int Green=10;

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

                if ( (LA2_0==RULE_ID) ) {
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

                if ( (LA4_1==LeftParenthesis) ) {
                    alt4=2;
                }
                else if ( (LA4_1==Colon) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==RULE_BEGIN) ) {
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
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
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
    // InternalShortDSLParser.g:357:1: ruleCraneS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_positions_4_0= ruleCraneZoneS ) )+ this_END_5= RULE_END ) ;
    public final EObject ruleCraneS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_positions_4_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:363:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_positions_4_0= ruleCraneZoneS ) )+ this_END_5= RULE_END ) )
            // InternalShortDSLParser.g:364:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_positions_4_0= ruleCraneZoneS ) )+ this_END_5= RULE_END )
            {
            // InternalShortDSLParser.g:364:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_positions_4_0= ruleCraneZoneS ) )+ this_END_5= RULE_END )
            // InternalShortDSLParser.g:365:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_positions_4_0= ruleCraneZoneS ) )+ this_END_5= RULE_END
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
            		
            // InternalShortDSLParser.g:398:3: ( (lv_positions_4_0= ruleCraneZoneS ) )+
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
            	    // InternalShortDSLParser.g:399:4: (lv_positions_4_0= ruleCraneZoneS )
            	    {
            	    // InternalShortDSLParser.g:399:4: (lv_positions_4_0= ruleCraneZoneS )
            	    // InternalShortDSLParser.g:400:5: lv_positions_4_0= ruleCraneZoneS
            	    {

            	    					newCompositeNode(grammarAccess.getCraneSAccess().getPositionsCraneZoneSParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_positions_4_0=ruleCraneZoneS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCraneSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"positions",
            	    						lv_positions_4_0,
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
    // InternalShortDSLParser.g:504:1: ruleDiskS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_nSlots_3_0= RULE_INT ) ) otherlv_4= RightParenthesis otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_zones_7_0= ruleDiskZoneS ) )+ this_END_8= RULE_END ) ;
    public final EObject ruleDiskS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_nSlots_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        EObject lv_zones_7_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:510:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_nSlots_3_0= RULE_INT ) ) otherlv_4= RightParenthesis otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_zones_7_0= ruleDiskZoneS ) )+ this_END_8= RULE_END ) )
            // InternalShortDSLParser.g:511:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_nSlots_3_0= RULE_INT ) ) otherlv_4= RightParenthesis otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_zones_7_0= ruleDiskZoneS ) )+ this_END_8= RULE_END )
            {
            // InternalShortDSLParser.g:511:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_nSlots_3_0= RULE_INT ) ) otherlv_4= RightParenthesis otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_zones_7_0= ruleDiskZoneS ) )+ this_END_8= RULE_END )
            // InternalShortDSLParser.g:512:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_nSlots_3_0= RULE_INT ) ) otherlv_4= RightParenthesis otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_zones_7_0= ruleDiskZoneS ) )+ this_END_8= RULE_END
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
            		
            // InternalShortDSLParser.g:571:3: ( (lv_zones_7_0= ruleDiskZoneS ) )+
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
            	    // InternalShortDSLParser.g:572:4: (lv_zones_7_0= ruleDiskZoneS )
            	    {
            	    // InternalShortDSLParser.g:572:4: (lv_zones_7_0= ruleDiskZoneS )
            	    // InternalShortDSLParser.g:573:5: lv_zones_7_0= ruleDiskZoneS
            	    {

            	    					newCompositeNode(grammarAccess.getDiskSAccess().getZonesDiskZoneSParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_zones_7_0=ruleDiskZoneS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiskSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"zones",
            	    						lv_zones_7_0,
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
    // InternalShortDSLParser.g:677:1: ruleCameraS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_colors_4_0= ruleCameraColorS ) )+ this_END_5= RULE_END ) ;
    public final EObject ruleCameraS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_colors_4_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:683:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_colors_4_0= ruleCameraColorS ) )+ this_END_5= RULE_END ) )
            // InternalShortDSLParser.g:684:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_colors_4_0= ruleCameraColorS ) )+ this_END_5= RULE_END )
            {
            // InternalShortDSLParser.g:684:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_colors_4_0= ruleCameraColorS ) )+ this_END_5= RULE_END )
            // InternalShortDSLParser.g:685:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_colors_4_0= ruleCameraColorS ) )+ this_END_5= RULE_END
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
            		
            // InternalShortDSLParser.g:718:3: ( (lv_colors_4_0= ruleCameraColorS ) )+
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
            	    // InternalShortDSLParser.g:719:4: (lv_colors_4_0= ruleCameraColorS )
            	    {
            	    // InternalShortDSLParser.g:719:4: (lv_colors_4_0= ruleCameraColorS )
            	    // InternalShortDSLParser.g:720:5: lv_colors_4_0= ruleCameraColorS
            	    {

            	    					newCompositeNode(grammarAccess.getCameraSAccess().getColorsCameraColorSParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_colors_4_0=ruleCameraColorS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCameraSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"colors",
            	    						lv_colors_4_0,
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
    // InternalShortDSLParser.g:803:1: ruleDiskHandlingS returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatementS ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleDiskHandlingS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        Token otherlv_5=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:809:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatementS ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket ) )
            // InternalShortDSLParser.g:810:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatementS ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket )
            {
            // InternalShortDSLParser.g:810:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatementS ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket )
            // InternalShortDSLParser.g:811:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatementS ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket
            {
            // InternalShortDSLParser.g:811:3: ( (otherlv_0= RULE_ID ) )
            // InternalShortDSLParser.g:812:4: (otherlv_0= RULE_ID )
            {
            // InternalShortDSLParser.g:812:4: (otherlv_0= RULE_ID )
            // InternalShortDSLParser.g:813:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskHandlingSRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getDiskHandlingSAccess().getDiskDiskCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDiskHandlingSAccess().getLeftCurlyBracketKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getDiskHandlingSAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalShortDSLParser.g:832:3: ( (lv_statements_3_0= ruleStatementS ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=Foreach && LA11_0<=Pickup)||LA11_0==Drop||LA11_0==If||LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalShortDSLParser.g:833:4: (lv_statements_3_0= ruleStatementS )
            	    {
            	    // InternalShortDSLParser.g:833:4: (lv_statements_3_0= ruleStatementS )
            	    // InternalShortDSLParser.g:834:5: lv_statements_3_0= ruleStatementS
            	    {

            	    					newCompositeNode(grammarAccess.getDiskHandlingSAccess().getStatementsStatementSParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_statements_3_0=ruleStatementS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiskHandlingSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
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

            this_END_4=(Token)match(input,RULE_END,FOLLOW_12); 

            			newLeafNode(this_END_4, grammarAccess.getDiskHandlingSAccess().getENDTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDiskHandlingSAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalShortDSLParser.g:863:1: entryRuleStatementS returns [EObject current=null] : iv_ruleStatementS= ruleStatementS EOF ;
    public final EObject entryRuleStatementS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementS = null;


        try {
            // InternalShortDSLParser.g:863:51: (iv_ruleStatementS= ruleStatementS EOF )
            // InternalShortDSLParser.g:864:2: iv_ruleStatementS= ruleStatementS EOF
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
    // InternalShortDSLParser.g:870:1: ruleStatementS returns [EObject current=null] : (this_LoopS_0= ruleLoopS | this_MoveS_1= ruleMoveS | this_ActionS_2= ruleActionS | this_ConditionS_3= ruleConditionS | this_MarkS_4= ruleMarkS ) ;
    public final EObject ruleStatementS() throws RecognitionException {
        EObject current = null;

        EObject this_LoopS_0 = null;

        EObject this_MoveS_1 = null;

        EObject this_ActionS_2 = null;

        EObject this_ConditionS_3 = null;

        EObject this_MarkS_4 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:876:2: ( (this_LoopS_0= ruleLoopS | this_MoveS_1= ruleMoveS | this_ActionS_2= ruleActionS | this_ConditionS_3= ruleConditionS | this_MarkS_4= ruleMarkS ) )
            // InternalShortDSLParser.g:877:2: (this_LoopS_0= ruleLoopS | this_MoveS_1= ruleMoveS | this_ActionS_2= ruleActionS | this_ConditionS_3= ruleConditionS | this_MarkS_4= ruleMarkS )
            {
            // InternalShortDSLParser.g:877:2: (this_LoopS_0= ruleLoopS | this_MoveS_1= ruleMoveS | this_ActionS_2= ruleActionS | this_ConditionS_3= ruleConditionS | this_MarkS_4= ruleMarkS )
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

                if ( (LA12_2==Pickup||LA12_2==Drop||LA12_2==HyphenMinusHyphenMinusGreaterThanSign||LA12_2==HyphenMinusGreaterThanSign) ) {
                    alt12=2;
                }
                else if ( (LA12_2==LeftParenthesis) ) {
                    alt12=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
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
                    // InternalShortDSLParser.g:878:3: this_LoopS_0= ruleLoopS
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
                    // InternalShortDSLParser.g:887:3: this_MoveS_1= ruleMoveS
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
                    // InternalShortDSLParser.g:896:3: this_ActionS_2= ruleActionS
                    {

                    			newCompositeNode(grammarAccess.getStatementSAccess().getActionSParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionS_2=ruleActionS();

                    state._fsp--;


                    			current = this_ActionS_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalShortDSLParser.g:905:3: this_ConditionS_3= ruleConditionS
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
                    // InternalShortDSLParser.g:914:3: this_MarkS_4= ruleMarkS
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
    // InternalShortDSLParser.g:926:1: entryRuleLoopS returns [EObject current=null] : iv_ruleLoopS= ruleLoopS EOF ;
    public final EObject entryRuleLoopS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopS = null;


        try {
            // InternalShortDSLParser.g:926:46: (iv_ruleLoopS= ruleLoopS EOF )
            // InternalShortDSLParser.g:927:2: iv_ruleLoopS= ruleLoopS EOF
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
    // InternalShortDSLParser.g:933:1: ruleLoopS returns [EObject current=null] : ( () otherlv_1= Foreach ( (lv_variable_2_0= ruleLocalVariableS ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_slotState_4_0= ruleDISK_SLOT_STATES_S ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END ) ;
    public final EObject ruleLoopS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        EObject lv_variable_2_0 = null;

        Enumerator lv_comparisonOperator_3_0 = null;

        Enumerator lv_slotState_4_0 = null;

        EObject lv_statements_7_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:939:2: ( ( () otherlv_1= Foreach ( (lv_variable_2_0= ruleLocalVariableS ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_slotState_4_0= ruleDISK_SLOT_STATES_S ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END ) )
            // InternalShortDSLParser.g:940:2: ( () otherlv_1= Foreach ( (lv_variable_2_0= ruleLocalVariableS ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_slotState_4_0= ruleDISK_SLOT_STATES_S ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END )
            {
            // InternalShortDSLParser.g:940:2: ( () otherlv_1= Foreach ( (lv_variable_2_0= ruleLocalVariableS ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_slotState_4_0= ruleDISK_SLOT_STATES_S ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END )
            // InternalShortDSLParser.g:941:3: () otherlv_1= Foreach ( (lv_variable_2_0= ruleLocalVariableS ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_slotState_4_0= ruleDISK_SLOT_STATES_S ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END
            {
            // InternalShortDSLParser.g:941:3: ()
            // InternalShortDSLParser.g:942:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopSAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Foreach,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopSAccess().getForeachKeyword_1());
            		
            // InternalShortDSLParser.g:952:3: ( (lv_variable_2_0= ruleLocalVariableS ) )
            // InternalShortDSLParser.g:953:4: (lv_variable_2_0= ruleLocalVariableS )
            {
            // InternalShortDSLParser.g:953:4: (lv_variable_2_0= ruleLocalVariableS )
            // InternalShortDSLParser.g:954:5: lv_variable_2_0= ruleLocalVariableS
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

            // InternalShortDSLParser.g:971:3: ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:972:4: (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:972:4: (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:973:5: lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S
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

            // InternalShortDSLParser.g:990:3: ( (lv_slotState_4_0= ruleDISK_SLOT_STATES_S ) )
            // InternalShortDSLParser.g:991:4: (lv_slotState_4_0= ruleDISK_SLOT_STATES_S )
            {
            // InternalShortDSLParser.g:991:4: (lv_slotState_4_0= ruleDISK_SLOT_STATES_S )
            // InternalShortDSLParser.g:992:5: lv_slotState_4_0= ruleDISK_SLOT_STATES_S
            {

            					newCompositeNode(grammarAccess.getLoopSAccess().getSlotStateDISK_SLOT_STATES_SEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_slotState_4_0=ruleDISK_SLOT_STATES_S();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopSRule());
            					}
            					set(
            						current,
            						"slotState",
            						lv_slotState_4_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.DISK_SLOT_STATES_S");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getLoopSAccess().getColonKeyword_5());
            		
            this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_21); 

            			newLeafNode(this_BEGIN_6, grammarAccess.getLoopSAccess().getBEGINTerminalRuleCall_6());
            		
            // InternalShortDSLParser.g:1017:3: ( (lv_statements_7_0= ruleStatementS ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=Foreach && LA13_0<=Pickup)||LA13_0==Drop||LA13_0==If||LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalShortDSLParser.g:1018:4: (lv_statements_7_0= ruleStatementS )
            	    {
            	    // InternalShortDSLParser.g:1018:4: (lv_statements_7_0= ruleStatementS )
            	    // InternalShortDSLParser.g:1019:5: lv_statements_7_0= ruleStatementS
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
    // InternalShortDSLParser.g:1044:1: entryRuleMoveS returns [EObject current=null] : iv_ruleMoveS= ruleMoveS EOF ;
    public final EObject entryRuleMoveS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveS = null;


        try {
            // InternalShortDSLParser.g:1044:46: (iv_ruleMoveS= ruleMoveS EOF )
            // InternalShortDSLParser.g:1045:2: iv_ruleMoveS= ruleMoveS EOF
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
    // InternalShortDSLParser.g:1051:1: ruleMoveS returns [EObject current=null] : (this_MoveDiskS_0= ruleMoveDiskS | this_MoveCraneS_1= ruleMoveCraneS ) ;
    public final EObject ruleMoveS() throws RecognitionException {
        EObject current = null;

        EObject this_MoveDiskS_0 = null;

        EObject this_MoveCraneS_1 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1057:2: ( (this_MoveDiskS_0= ruleMoveDiskS | this_MoveCraneS_1= ruleMoveCraneS ) )
            // InternalShortDSLParser.g:1058:2: (this_MoveDiskS_0= ruleMoveDiskS | this_MoveCraneS_1= ruleMoveCraneS )
            {
            // InternalShortDSLParser.g:1058:2: (this_MoveDiskS_0= ruleMoveDiskS | this_MoveCraneS_1= ruleMoveCraneS )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==HyphenMinusHyphenMinusGreaterThanSign||LA14_1==HyphenMinusGreaterThanSign) ) {
                    alt14=1;
                }
                else if ( (LA14_1==Pickup||LA14_1==Drop) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalShortDSLParser.g:1059:3: this_MoveDiskS_0= ruleMoveDiskS
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
                    // InternalShortDSLParser.g:1068:3: this_MoveCraneS_1= ruleMoveCraneS
                    {

                    			newCompositeNode(grammarAccess.getMoveSAccess().getMoveCraneSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveCraneS_1=ruleMoveCraneS();

                    state._fsp--;


                    			current = this_MoveCraneS_1;
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
    // InternalShortDSLParser.g:1080:1: entryRuleMoveDiskS returns [EObject current=null] : iv_ruleMoveDiskS= ruleMoveDiskS EOF ;
    public final EObject entryRuleMoveDiskS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveDiskS = null;


        try {
            // InternalShortDSLParser.g:1080:50: (iv_ruleMoveDiskS= ruleMoveDiskS EOF )
            // InternalShortDSLParser.g:1081:2: iv_ruleMoveDiskS= ruleMoveDiskS EOF
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
    // InternalShortDSLParser.g:1087:1: ruleMoveDiskS returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleMoveDiskS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:1093:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_4= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:1094:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:1094:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_4= RULE_ID ) ) )
            // InternalShortDSLParser.g:1095:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_4= RULE_ID ) )
            {
            // InternalShortDSLParser.g:1095:3: ()
            // InternalShortDSLParser.g:1096:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveDiskSAccess().getMoveDiskAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1102:3: ( (otherlv_1= RULE_ID ) )
            // InternalShortDSLParser.g:1103:4: (otherlv_1= RULE_ID )
            {
            // InternalShortDSLParser.g:1103:4: (otherlv_1= RULE_ID )
            // InternalShortDSLParser.g:1104:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveDiskSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_1, grammarAccess.getMoveDiskSAccess().getSlotVariableCrossReference_1_0());
            				

            }


            }

            // InternalShortDSLParser.g:1115:3: (otherlv_2= HyphenMinusGreaterThanSign | otherlv_3= HyphenMinusHyphenMinusGreaterThanSign )
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
                    // InternalShortDSLParser.g:1116:4: otherlv_2= HyphenMinusGreaterThanSign
                    {
                    otherlv_2=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getMoveDiskSAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1121:4: otherlv_3= HyphenMinusHyphenMinusGreaterThanSign
                    {
                    otherlv_3=(Token)match(input,HyphenMinusHyphenMinusGreaterThanSign,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoveDiskSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalShortDSLParser.g:1126:3: ( (otherlv_4= RULE_ID ) )
            // InternalShortDSLParser.g:1127:4: (otherlv_4= RULE_ID )
            {
            // InternalShortDSLParser.g:1127:4: (otherlv_4= RULE_ID )
            // InternalShortDSLParser.g:1128:5: otherlv_4= RULE_ID
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


    // $ANTLR start "entryRuleMoveCraneS"
    // InternalShortDSLParser.g:1143:1: entryRuleMoveCraneS returns [EObject current=null] : iv_ruleMoveCraneS= ruleMoveCraneS EOF ;
    public final EObject entryRuleMoveCraneS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveCraneS = null;


        try {
            // InternalShortDSLParser.g:1143:51: (iv_ruleMoveCraneS= ruleMoveCraneS EOF )
            // InternalShortDSLParser.g:1144:2: iv_ruleMoveCraneS= ruleMoveCraneS EOF
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
    // InternalShortDSLParser.g:1150:1: ruleMoveCraneS returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_action_2_0= ruleActionS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleMoveCraneS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_action_2_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1156:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_action_2_0= ruleActionS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:1157:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_action_2_0= ruleActionS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:1157:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_action_2_0= ruleActionS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) ) )
            // InternalShortDSLParser.g:1158:3: () ( (otherlv_1= RULE_ID ) ) ( (lv_action_2_0= ruleActionS ) ) (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign ) ( (otherlv_5= RULE_ID ) )
            {
            // InternalShortDSLParser.g:1158:3: ()
            // InternalShortDSLParser.g:1159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveCraneSAccess().getMoveCraneAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1165:3: ( (otherlv_1= RULE_ID ) )
            // InternalShortDSLParser.g:1166:4: (otherlv_1= RULE_ID )
            {
            // InternalShortDSLParser.g:1166:4: (otherlv_1= RULE_ID )
            // InternalShortDSLParser.g:1167:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveCraneSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_1, grammarAccess.getMoveCraneSAccess().getCraneCraneCrossReference_1_0());
            				

            }


            }

            // InternalShortDSLParser.g:1178:3: ( (lv_action_2_0= ruleActionS ) )
            // InternalShortDSLParser.g:1179:4: (lv_action_2_0= ruleActionS )
            {
            // InternalShortDSLParser.g:1179:4: (lv_action_2_0= ruleActionS )
            // InternalShortDSLParser.g:1180:5: lv_action_2_0= ruleActionS
            {

            					newCompositeNode(grammarAccess.getMoveCraneSAccess().getActionActionSParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_action_2_0=ruleActionS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveCraneSRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_2_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.ActionS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:1197:3: (otherlv_3= HyphenMinusGreaterThanSign | otherlv_4= HyphenMinusHyphenMinusGreaterThanSign )
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
                    // InternalShortDSLParser.g:1198:4: otherlv_3= HyphenMinusGreaterThanSign
                    {
                    otherlv_3=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoveCraneSAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1203:4: otherlv_4= HyphenMinusHyphenMinusGreaterThanSign
                    {
                    otherlv_4=(Token)match(input,HyphenMinusHyphenMinusGreaterThanSign,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getMoveCraneSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalShortDSLParser.g:1208:3: ( (otherlv_5= RULE_ID ) )
            // InternalShortDSLParser.g:1209:4: (otherlv_5= RULE_ID )
            {
            // InternalShortDSLParser.g:1209:4: (otherlv_5= RULE_ID )
            // InternalShortDSLParser.g:1210:5: otherlv_5= RULE_ID
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


    // $ANTLR start "entryRuleActionS"
    // InternalShortDSLParser.g:1225:1: entryRuleActionS returns [EObject current=null] : iv_ruleActionS= ruleActionS EOF ;
    public final EObject entryRuleActionS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionS = null;


        try {
            // InternalShortDSLParser.g:1225:48: (iv_ruleActionS= ruleActionS EOF )
            // InternalShortDSLParser.g:1226:2: iv_ruleActionS= ruleActionS EOF
            {
             newCompositeNode(grammarAccess.getActionSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionS=ruleActionS();

            state._fsp--;

             current =iv_ruleActionS; 
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
    // $ANTLR end "entryRuleActionS"


    // $ANTLR start "ruleActionS"
    // InternalShortDSLParser.g:1232:1: ruleActionS returns [EObject current=null] : ( () (otherlv_1= Pickup | otherlv_2= Drop ) ) ;
    public final EObject ruleActionS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:1238:2: ( ( () (otherlv_1= Pickup | otherlv_2= Drop ) ) )
            // InternalShortDSLParser.g:1239:2: ( () (otherlv_1= Pickup | otherlv_2= Drop ) )
            {
            // InternalShortDSLParser.g:1239:2: ( () (otherlv_1= Pickup | otherlv_2= Drop ) )
            // InternalShortDSLParser.g:1240:3: () (otherlv_1= Pickup | otherlv_2= Drop )
            {
            // InternalShortDSLParser.g:1240:3: ()
            // InternalShortDSLParser.g:1241:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionSAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1247:3: (otherlv_1= Pickup | otherlv_2= Drop )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Pickup) ) {
                alt17=1;
            }
            else if ( (LA17_0==Drop) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalShortDSLParser.g:1248:4: otherlv_1= Pickup
                    {
                    otherlv_1=(Token)match(input,Pickup,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getActionSAccess().getPickupKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1253:4: otherlv_2= Drop
                    {
                    otherlv_2=(Token)match(input,Drop,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionSAccess().getDropKeyword_1_1());
                    			

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
    // $ANTLR end "ruleActionS"


    // $ANTLR start "entryRuleConditionS"
    // InternalShortDSLParser.g:1262:1: entryRuleConditionS returns [EObject current=null] : iv_ruleConditionS= ruleConditionS EOF ;
    public final EObject entryRuleConditionS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionS = null;


        try {
            // InternalShortDSLParser.g:1262:51: (iv_ruleConditionS= ruleConditionS EOF )
            // InternalShortDSLParser.g:1263:2: iv_ruleConditionS= ruleConditionS EOF
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
    // InternalShortDSLParser.g:1269:1: ruleConditionS returns [EObject current=null] : (this_ConditionVariableS_0= ruleConditionVariableS | this_ConditionDeviceS_1= ruleConditionDeviceS ) ;
    public final EObject ruleConditionS() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionVariableS_0 = null;

        EObject this_ConditionDeviceS_1 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1275:2: ( (this_ConditionVariableS_0= ruleConditionVariableS | this_ConditionDeviceS_1= ruleConditionDeviceS ) )
            // InternalShortDSLParser.g:1276:2: (this_ConditionVariableS_0= ruleConditionVariableS | this_ConditionDeviceS_1= ruleConditionDeviceS )
            {
            // InternalShortDSLParser.g:1276:2: (this_ConditionVariableS_0= ruleConditionVariableS | this_ConditionDeviceS_1= ruleConditionDeviceS )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==If) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_ID) ) {
                    alt18=2;
                }
                else if ( (LA18_1==Test) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalShortDSLParser.g:1277:3: this_ConditionVariableS_0= ruleConditionVariableS
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
                    // InternalShortDSLParser.g:1286:3: this_ConditionDeviceS_1= ruleConditionDeviceS
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
    // InternalShortDSLParser.g:1298:1: entryRuleConditionVariableS returns [EObject current=null] : iv_ruleConditionVariableS= ruleConditionVariableS EOF ;
    public final EObject entryRuleConditionVariableS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionVariableS = null;


        try {
            // InternalShortDSLParser.g:1298:59: (iv_ruleConditionVariableS= ruleConditionVariableS EOF )
            // InternalShortDSLParser.g:1299:2: iv_ruleConditionVariableS= ruleConditionVariableS EOF
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
    // InternalShortDSLParser.g:1305:1: ruleConditionVariableS returns [EObject current=null] : ( () otherlv_1= If otherlv_2= Test ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperator_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_value_5_0= ruleValue ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END ) ;
    public final EObject ruleConditionVariableS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Enumerator lv_comparisonOperator_4_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_statements_8_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1311:2: ( ( () otherlv_1= If otherlv_2= Test ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperator_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_value_5_0= ruleValue ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END ) )
            // InternalShortDSLParser.g:1312:2: ( () otherlv_1= If otherlv_2= Test ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperator_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_value_5_0= ruleValue ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END )
            {
            // InternalShortDSLParser.g:1312:2: ( () otherlv_1= If otherlv_2= Test ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperator_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_value_5_0= ruleValue ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END )
            // InternalShortDSLParser.g:1313:3: () otherlv_1= If otherlv_2= Test ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonOperator_4_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_value_5_0= ruleValue ) ) otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_statements_8_0= ruleStatementS ) )* this_END_9= RULE_END
            {
            // InternalShortDSLParser.g:1313:3: ()
            // InternalShortDSLParser.g:1314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionVariableSAccess().getConditionVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,If,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionVariableSAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,Test,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionVariableSAccess().getTestKeyword_2());
            		
            // InternalShortDSLParser.g:1328:3: ( (otherlv_3= RULE_ID ) )
            // InternalShortDSLParser.g:1329:4: (otherlv_3= RULE_ID )
            {
            // InternalShortDSLParser.g:1329:4: (otherlv_3= RULE_ID )
            // InternalShortDSLParser.g:1330:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionVariableSRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_3, grammarAccess.getConditionVariableSAccess().getVariableVariableCrossReference_3_0());
            				

            }


            }

            // InternalShortDSLParser.g:1341:3: ( (lv_comparisonOperator_4_0= ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:1342:4: (lv_comparisonOperator_4_0= ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:1342:4: (lv_comparisonOperator_4_0= ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:1343:5: lv_comparisonOperator_4_0= ruleCOMPARISON_OPERATOR_S
            {

            					newCompositeNode(grammarAccess.getConditionVariableSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
            lv_comparisonOperator_4_0=ruleCOMPARISON_OPERATOR_S();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionVariableSRule());
            					}
            					set(
            						current,
            						"comparisonOperator",
            						lv_comparisonOperator_4_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.COMPARISON_OPERATOR_S");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:1360:3: ( (lv_value_5_0= ruleValue ) )
            // InternalShortDSLParser.g:1361:4: (lv_value_5_0= ruleValue )
            {
            // InternalShortDSLParser.g:1361:4: (lv_value_5_0= ruleValue )
            // InternalShortDSLParser.g:1362:5: lv_value_5_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getConditionVariableSAccess().getValueValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_value_5_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionVariableSRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionVariableSAccess().getColonKeyword_6());
            		
            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_21); 

            			newLeafNode(this_BEGIN_7, grammarAccess.getConditionVariableSAccess().getBEGINTerminalRuleCall_7());
            		
            // InternalShortDSLParser.g:1387:3: ( (lv_statements_8_0= ruleStatementS ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=Foreach && LA19_0<=Pickup)||LA19_0==Drop||LA19_0==If||LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalShortDSLParser.g:1388:4: (lv_statements_8_0= ruleStatementS )
            	    {
            	    // InternalShortDSLParser.g:1388:4: (lv_statements_8_0= ruleStatementS )
            	    // InternalShortDSLParser.g:1389:5: lv_statements_8_0= ruleStatementS
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
            	    break loop19;
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
    // InternalShortDSLParser.g:1414:1: entryRuleConditionDeviceS returns [EObject current=null] : iv_ruleConditionDeviceS= ruleConditionDeviceS EOF ;
    public final EObject entryRuleConditionDeviceS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionDeviceS = null;


        try {
            // InternalShortDSLParser.g:1414:57: (iv_ruleConditionDeviceS= ruleConditionDeviceS EOF )
            // InternalShortDSLParser.g:1415:2: iv_ruleConditionDeviceS= ruleConditionDeviceS EOF
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
    // InternalShortDSLParser.g:1421:1: ruleConditionDeviceS returns [EObject current=null] : ( () otherlv_1= If ( (otherlv_2= RULE_ID ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_value_4_0= ruleValue ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END ) ;
    public final EObject ruleConditionDeviceS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        Enumerator lv_comparisonOperator_3_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_statements_7_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1427:2: ( ( () otherlv_1= If ( (otherlv_2= RULE_ID ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_value_4_0= ruleValue ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END ) )
            // InternalShortDSLParser.g:1428:2: ( () otherlv_1= If ( (otherlv_2= RULE_ID ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_value_4_0= ruleValue ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END )
            {
            // InternalShortDSLParser.g:1428:2: ( () otherlv_1= If ( (otherlv_2= RULE_ID ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_value_4_0= ruleValue ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END )
            // InternalShortDSLParser.g:1429:3: () otherlv_1= If ( (otherlv_2= RULE_ID ) ) ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) ) ( (lv_value_4_0= ruleValue ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatementS ) )* this_END_8= RULE_END
            {
            // InternalShortDSLParser.g:1429:3: ()
            // InternalShortDSLParser.g:1430:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionDeviceSAccess().getConditionDeviceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,If,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionDeviceSAccess().getIfKeyword_1());
            		
            // InternalShortDSLParser.g:1440:3: ( (otherlv_2= RULE_ID ) )
            // InternalShortDSLParser.g:1441:4: (otherlv_2= RULE_ID )
            {
            // InternalShortDSLParser.g:1441:4: (otherlv_2= RULE_ID )
            // InternalShortDSLParser.g:1442:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionDeviceSRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getConditionDeviceSAccess().getDeviceDeviceSCrossReference_2_0());
            				

            }


            }

            // InternalShortDSLParser.g:1453:3: ( (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:1454:4: (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:1454:4: (lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:1455:5: lv_comparisonOperator_3_0= ruleCOMPARISON_OPERATOR_S
            {

            					newCompositeNode(grammarAccess.getConditionDeviceSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_comparisonOperator_3_0=ruleCOMPARISON_OPERATOR_S();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionDeviceSRule());
            					}
            					set(
            						current,
            						"comparisonOperator",
            						lv_comparisonOperator_3_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.COMPARISON_OPERATOR_S");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:1472:3: ( (lv_value_4_0= ruleValue ) )
            // InternalShortDSLParser.g:1473:4: (lv_value_4_0= ruleValue )
            {
            // InternalShortDSLParser.g:1473:4: (lv_value_4_0= ruleValue )
            // InternalShortDSLParser.g:1474:5: lv_value_4_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getConditionDeviceSAccess().getValueValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_value_4_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionDeviceSRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionDeviceSAccess().getColonKeyword_5());
            		
            this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_21); 

            			newLeafNode(this_BEGIN_6, grammarAccess.getConditionDeviceSAccess().getBEGINTerminalRuleCall_6());
            		
            // InternalShortDSLParser.g:1499:3: ( (lv_statements_7_0= ruleStatementS ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=Foreach && LA20_0<=Pickup)||LA20_0==Drop||LA20_0==If||LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalShortDSLParser.g:1500:4: (lv_statements_7_0= ruleStatementS )
            	    {
            	    // InternalShortDSLParser.g:1500:4: (lv_statements_7_0= ruleStatementS )
            	    // InternalShortDSLParser.g:1501:5: lv_statements_7_0= ruleStatementS
            	    {

            	    					newCompositeNode(grammarAccess.getConditionDeviceSAccess().getStatementsStatementSParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_statements_7_0=ruleStatementS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionDeviceSRule());
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
            	    break loop20;
                }
            } while (true);

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getConditionDeviceSAccess().getENDTerminalRuleCall_8());
            		

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
    // InternalShortDSLParser.g:1526:1: entryRuleMarkS returns [EObject current=null] : iv_ruleMarkS= ruleMarkS EOF ;
    public final EObject entryRuleMarkS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkS = null;


        try {
            // InternalShortDSLParser.g:1526:46: (iv_ruleMarkS= ruleMarkS EOF )
            // InternalShortDSLParser.g:1527:2: iv_ruleMarkS= ruleMarkS EOF
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
    // InternalShortDSLParser.g:1533:1: ruleMarkS returns [EObject current=null] : (this_MarkVariableS_0= ruleMarkVariableS | this_MarkValueS_1= ruleMarkValueS ) ;
    public final EObject ruleMarkS() throws RecognitionException {
        EObject current = null;

        EObject this_MarkVariableS_0 = null;

        EObject this_MarkValueS_1 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1539:2: ( (this_MarkVariableS_0= ruleMarkVariableS | this_MarkValueS_1= ruleMarkValueS ) )
            // InternalShortDSLParser.g:1540:2: (this_MarkVariableS_0= ruleMarkVariableS | this_MarkValueS_1= ruleMarkValueS )
            {
            // InternalShortDSLParser.g:1540:2: (this_MarkVariableS_0= ruleMarkVariableS | this_MarkValueS_1= ruleMarkValueS )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==LeftParenthesis) ) {
                    int LA21_2 = input.LA(3);

                    if ( ((LA21_2>=In_progress && LA21_2<=Complete)||(LA21_2>=Empty && LA21_2<=Green)||LA21_2==Blue||(LA21_2>=Free && LA21_2<=Full)||LA21_2==Red||LA21_2==RULE_INT) ) {
                        alt21=2;
                    }
                    else if ( (LA21_2==RULE_ID) ) {
                        int LA21_4 = input.LA(4);

                        if ( (LA21_4==Comma) ) {
                            int LA21_5 = input.LA(5);

                            if ( (LA21_5==RULE_INT) ) {
                                int LA21_7 = input.LA(6);

                                if ( (LA21_7==RightParenthesis) ) {
                                    alt21=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 21, 7, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 21, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA21_4==RightParenthesis) ) {
                            alt21=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalShortDSLParser.g:1541:3: this_MarkVariableS_0= ruleMarkVariableS
                    {

                    			newCompositeNode(grammarAccess.getMarkSAccess().getMarkVariableSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MarkVariableS_0=ruleMarkVariableS();

                    state._fsp--;


                    			current = this_MarkVariableS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1550:3: this_MarkValueS_1= ruleMarkValueS
                    {

                    			newCompositeNode(grammarAccess.getMarkSAccess().getMarkValueSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MarkValueS_1=ruleMarkValueS();

                    state._fsp--;


                    			current = this_MarkValueS_1;
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


    // $ANTLR start "entryRuleMarkVariableS"
    // InternalShortDSLParser.g:1562:1: entryRuleMarkVariableS returns [EObject current=null] : iv_ruleMarkVariableS= ruleMarkVariableS EOF ;
    public final EObject entryRuleMarkVariableS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkVariableS = null;


        try {
            // InternalShortDSLParser.g:1562:54: (iv_ruleMarkVariableS= ruleMarkVariableS EOF )
            // InternalShortDSLParser.g:1563:2: iv_ruleMarkVariableS= ruleMarkVariableS EOF
            {
             newCompositeNode(grammarAccess.getMarkVariableSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarkVariableS=ruleMarkVariableS();

            state._fsp--;

             current =iv_ruleMarkVariableS; 
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
    // $ANTLR end "entryRuleMarkVariableS"


    // $ANTLR start "ruleMarkVariableS"
    // InternalShortDSLParser.g:1569:1: ruleMarkVariableS returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_variable_3_0= ruleGlobalVariableS ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) )? otherlv_6= RightParenthesis ) ;
    public final EObject ruleMarkVariableS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_time_5_0=null;
        Token otherlv_6=null;
        EObject lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1575:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_variable_3_0= ruleGlobalVariableS ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) )? otherlv_6= RightParenthesis ) )
            // InternalShortDSLParser.g:1576:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_variable_3_0= ruleGlobalVariableS ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) )? otherlv_6= RightParenthesis )
            {
            // InternalShortDSLParser.g:1576:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_variable_3_0= ruleGlobalVariableS ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) )? otherlv_6= RightParenthesis )
            // InternalShortDSLParser.g:1577:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_variable_3_0= ruleGlobalVariableS ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) )? otherlv_6= RightParenthesis
            {
            // InternalShortDSLParser.g:1577:3: ()
            // InternalShortDSLParser.g:1578:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarkVariableSAccess().getMarkVariableAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1584:3: ( (otherlv_1= RULE_ID ) )
            // InternalShortDSLParser.g:1585:4: (otherlv_1= RULE_ID )
            {
            // InternalShortDSLParser.g:1585:4: (otherlv_1= RULE_ID )
            // InternalShortDSLParser.g:1586:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMarkVariableSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_1, grammarAccess.getMarkVariableSAccess().getDeviceDeviceSCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMarkVariableSAccess().getLeftParenthesisKeyword_2());
            		
            // InternalShortDSLParser.g:1601:3: ( (lv_variable_3_0= ruleGlobalVariableS ) )
            // InternalShortDSLParser.g:1602:4: (lv_variable_3_0= ruleGlobalVariableS )
            {
            // InternalShortDSLParser.g:1602:4: (lv_variable_3_0= ruleGlobalVariableS )
            // InternalShortDSLParser.g:1603:5: lv_variable_3_0= ruleGlobalVariableS
            {

            					newCompositeNode(grammarAccess.getMarkVariableSAccess().getVariableGlobalVariableSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_variable_3_0=ruleGlobalVariableS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMarkVariableSRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_3_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.GlobalVariableS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:1620:3: (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Comma) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalShortDSLParser.g:1621:4: otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,Comma,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getMarkVariableSAccess().getCommaKeyword_4_0());
                    			
                    // InternalShortDSLParser.g:1625:4: ( (lv_time_5_0= RULE_INT ) )
                    // InternalShortDSLParser.g:1626:5: (lv_time_5_0= RULE_INT )
                    {
                    // InternalShortDSLParser.g:1626:5: (lv_time_5_0= RULE_INT )
                    // InternalShortDSLParser.g:1627:6: lv_time_5_0= RULE_INT
                    {
                    lv_time_5_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                    						newLeafNode(lv_time_5_0, grammarAccess.getMarkVariableSAccess().getTimeINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMarkVariableSRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"time",
                    							lv_time_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMarkVariableSAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleMarkVariableS"


    // $ANTLR start "entryRuleMarkValueS"
    // InternalShortDSLParser.g:1652:1: entryRuleMarkValueS returns [EObject current=null] : iv_ruleMarkValueS= ruleMarkValueS EOF ;
    public final EObject entryRuleMarkValueS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkValueS = null;


        try {
            // InternalShortDSLParser.g:1652:51: (iv_ruleMarkValueS= ruleMarkValueS EOF )
            // InternalShortDSLParser.g:1653:2: iv_ruleMarkValueS= ruleMarkValueS EOF
            {
             newCompositeNode(grammarAccess.getMarkValueSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarkValueS=ruleMarkValueS();

            state._fsp--;

             current =iv_ruleMarkValueS; 
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
    // $ANTLR end "entryRuleMarkValueS"


    // $ANTLR start "ruleMarkValueS"
    // InternalShortDSLParser.g:1659:1: ruleMarkValueS returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_value_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) )? otherlv_6= RightParenthesis ) ;
    public final EObject ruleMarkValueS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_time_5_0=null;
        Token otherlv_6=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1665:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_value_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) )? otherlv_6= RightParenthesis ) )
            // InternalShortDSLParser.g:1666:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_value_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) )? otherlv_6= RightParenthesis )
            {
            // InternalShortDSLParser.g:1666:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_value_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) )? otherlv_6= RightParenthesis )
            // InternalShortDSLParser.g:1667:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_value_3_0= ruleValue ) ) (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) )? otherlv_6= RightParenthesis
            {
            // InternalShortDSLParser.g:1667:3: ()
            // InternalShortDSLParser.g:1668:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarkValueSAccess().getMarkValueAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1674:3: ( (otherlv_1= RULE_ID ) )
            // InternalShortDSLParser.g:1675:4: (otherlv_1= RULE_ID )
            {
            // InternalShortDSLParser.g:1675:4: (otherlv_1= RULE_ID )
            // InternalShortDSLParser.g:1676:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMarkValueSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_1, grammarAccess.getMarkValueSAccess().getVariableLocalVariableCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getMarkValueSAccess().getLeftParenthesisKeyword_2());
            		
            // InternalShortDSLParser.g:1691:3: ( (lv_value_3_0= ruleValue ) )
            // InternalShortDSLParser.g:1692:4: (lv_value_3_0= ruleValue )
            {
            // InternalShortDSLParser.g:1692:4: (lv_value_3_0= ruleValue )
            // InternalShortDSLParser.g:1693:5: lv_value_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getMarkValueSAccess().getValueValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_value_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMarkValueSRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:1710:3: (otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Comma) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalShortDSLParser.g:1711:4: otherlv_4= Comma ( (lv_time_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,Comma,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getMarkValueSAccess().getCommaKeyword_4_0());
                    			
                    // InternalShortDSLParser.g:1715:4: ( (lv_time_5_0= RULE_INT ) )
                    // InternalShortDSLParser.g:1716:5: (lv_time_5_0= RULE_INT )
                    {
                    // InternalShortDSLParser.g:1716:5: (lv_time_5_0= RULE_INT )
                    // InternalShortDSLParser.g:1717:6: lv_time_5_0= RULE_INT
                    {
                    lv_time_5_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                    						newLeafNode(lv_time_5_0, grammarAccess.getMarkValueSAccess().getTimeINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMarkValueSRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"time",
                    							lv_time_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMarkValueSAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleMarkValueS"


    // $ANTLR start "entryRuleLocalVariableS"
    // InternalShortDSLParser.g:1742:1: entryRuleLocalVariableS returns [EObject current=null] : iv_ruleLocalVariableS= ruleLocalVariableS EOF ;
    public final EObject entryRuleLocalVariableS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableS = null;


        try {
            // InternalShortDSLParser.g:1742:55: (iv_ruleLocalVariableS= ruleLocalVariableS EOF )
            // InternalShortDSLParser.g:1743:2: iv_ruleLocalVariableS= ruleLocalVariableS EOF
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
    // InternalShortDSLParser.g:1749:1: ruleLocalVariableS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLocalVariableS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:1755:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:1756:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:1756:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalShortDSLParser.g:1757:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalShortDSLParser.g:1757:3: ()
            // InternalShortDSLParser.g:1758:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocalVariableSAccess().getLocalVariableAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1764:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:1765:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:1765:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:1766:5: lv_name_1_0= RULE_ID
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
    // InternalShortDSLParser.g:1786:1: entryRuleGlobalVariableS returns [EObject current=null] : iv_ruleGlobalVariableS= ruleGlobalVariableS EOF ;
    public final EObject entryRuleGlobalVariableS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalVariableS = null;


        try {
            // InternalShortDSLParser.g:1786:56: (iv_ruleGlobalVariableS= ruleGlobalVariableS EOF )
            // InternalShortDSLParser.g:1787:2: iv_ruleGlobalVariableS= ruleGlobalVariableS EOF
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
    // InternalShortDSLParser.g:1793:1: ruleGlobalVariableS returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGlobalVariableS() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:1799:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:1800:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:1800:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalShortDSLParser.g:1801:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalShortDSLParser.g:1801:3: ()
            // InternalShortDSLParser.g:1802:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalVariableSAccess().getGlobalVariableAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:1808:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:1809:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:1809:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:1810:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleValue"
    // InternalShortDSLParser.g:1830:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalShortDSLParser.g:1830:46: (iv_ruleValue= ruleValue EOF )
            // InternalShortDSLParser.g:1831:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalShortDSLParser.g:1837:1: ruleValue returns [EObject current=null] : ( ( (lv_valueDiskSlotState_0_0= ruleDISK_SLOT_STATES_S ) ) | ( (lv_valueDiskState_1_0= ruleDISK_STATES_S ) ) | ( (lv_valueColor_2_0= ruleCOLOR_S ) ) | ( (lv_valueInt_3_0= RULE_INT ) ) | ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_valueInt_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_valueDiskSlotState_0_0 = null;

        Enumerator lv_valueDiskState_1_0 = null;

        Enumerator lv_valueColor_2_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:1843:2: ( ( ( (lv_valueDiskSlotState_0_0= ruleDISK_SLOT_STATES_S ) ) | ( (lv_valueDiskState_1_0= ruleDISK_STATES_S ) ) | ( (lv_valueColor_2_0= ruleCOLOR_S ) ) | ( (lv_valueInt_3_0= RULE_INT ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:1844:2: ( ( (lv_valueDiskSlotState_0_0= ruleDISK_SLOT_STATES_S ) ) | ( (lv_valueDiskState_1_0= ruleDISK_STATES_S ) ) | ( (lv_valueColor_2_0= ruleCOLOR_S ) ) | ( (lv_valueInt_3_0= RULE_INT ) ) | ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:1844:2: ( ( (lv_valueDiskSlotState_0_0= ruleDISK_SLOT_STATES_S ) ) | ( (lv_valueDiskState_1_0= ruleDISK_STATES_S ) ) | ( (lv_valueColor_2_0= ruleCOLOR_S ) ) | ( (lv_valueInt_3_0= RULE_INT ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt24=5;
            switch ( input.LA(1) ) {
            case In_progress:
            case Complete:
            case Free:
                {
                alt24=1;
                }
                break;
            case Empty:
            case Full:
                {
                alt24=2;
                }
                break;
            case Green:
            case Blue:
            case Red:
                {
                alt24=3;
                }
                break;
            case RULE_INT:
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
                    // InternalShortDSLParser.g:1845:3: ( (lv_valueDiskSlotState_0_0= ruleDISK_SLOT_STATES_S ) )
                    {
                    // InternalShortDSLParser.g:1845:3: ( (lv_valueDiskSlotState_0_0= ruleDISK_SLOT_STATES_S ) )
                    // InternalShortDSLParser.g:1846:4: (lv_valueDiskSlotState_0_0= ruleDISK_SLOT_STATES_S )
                    {
                    // InternalShortDSLParser.g:1846:4: (lv_valueDiskSlotState_0_0= ruleDISK_SLOT_STATES_S )
                    // InternalShortDSLParser.g:1847:5: lv_valueDiskSlotState_0_0= ruleDISK_SLOT_STATES_S
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getValueDiskSlotStateDISK_SLOT_STATES_SEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_valueDiskSlotState_0_0=ruleDISK_SLOT_STATES_S();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"valueDiskSlotState",
                    						lv_valueDiskSlotState_0_0,
                    						"xtext.factoryLang.shortDSL.ShortDSL.DISK_SLOT_STATES_S");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1865:3: ( (lv_valueDiskState_1_0= ruleDISK_STATES_S ) )
                    {
                    // InternalShortDSLParser.g:1865:3: ( (lv_valueDiskState_1_0= ruleDISK_STATES_S ) )
                    // InternalShortDSLParser.g:1866:4: (lv_valueDiskState_1_0= ruleDISK_STATES_S )
                    {
                    // InternalShortDSLParser.g:1866:4: (lv_valueDiskState_1_0= ruleDISK_STATES_S )
                    // InternalShortDSLParser.g:1867:5: lv_valueDiskState_1_0= ruleDISK_STATES_S
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getValueDiskStateDISK_STATES_SEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_valueDiskState_1_0=ruleDISK_STATES_S();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"valueDiskState",
                    						lv_valueDiskState_1_0,
                    						"xtext.factoryLang.shortDSL.ShortDSL.DISK_STATES_S");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1885:3: ( (lv_valueColor_2_0= ruleCOLOR_S ) )
                    {
                    // InternalShortDSLParser.g:1885:3: ( (lv_valueColor_2_0= ruleCOLOR_S ) )
                    // InternalShortDSLParser.g:1886:4: (lv_valueColor_2_0= ruleCOLOR_S )
                    {
                    // InternalShortDSLParser.g:1886:4: (lv_valueColor_2_0= ruleCOLOR_S )
                    // InternalShortDSLParser.g:1887:5: lv_valueColor_2_0= ruleCOLOR_S
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getValueColorCOLOR_SEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_valueColor_2_0=ruleCOLOR_S();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"valueColor",
                    						lv_valueColor_2_0,
                    						"xtext.factoryLang.shortDSL.ShortDSL.COLOR_S");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalShortDSLParser.g:1905:3: ( (lv_valueInt_3_0= RULE_INT ) )
                    {
                    // InternalShortDSLParser.g:1905:3: ( (lv_valueInt_3_0= RULE_INT ) )
                    // InternalShortDSLParser.g:1906:4: (lv_valueInt_3_0= RULE_INT )
                    {
                    // InternalShortDSLParser.g:1906:4: (lv_valueInt_3_0= RULE_INT )
                    // InternalShortDSLParser.g:1907:5: lv_valueInt_3_0= RULE_INT
                    {
                    lv_valueInt_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_valueInt_3_0, grammarAccess.getValueAccess().getValueIntINTTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"valueInt",
                    						lv_valueInt_3_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalShortDSLParser.g:1924:3: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalShortDSLParser.g:1924:3: ( (otherlv_4= RULE_ID ) )
                    // InternalShortDSLParser.g:1925:4: (otherlv_4= RULE_ID )
                    {
                    // InternalShortDSLParser.g:1925:4: (otherlv_4= RULE_ID )
                    // InternalShortDSLParser.g:1926:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getValueAccess().getVariableVariableCrossReference_4_0());
                    				

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "ruleCOMPARISON_OPERATOR_S"
    // InternalShortDSLParser.g:1941:1: ruleCOMPARISON_OPERATOR_S returns [Enumerator current=null] : ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) ) ;
    public final Enumerator ruleCOMPARISON_OPERATOR_S() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:1947:2: ( ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) ) )
            // InternalShortDSLParser.g:1948:2: ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) )
            {
            // InternalShortDSLParser.g:1948:2: ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case EqualsSign:
                {
                alt25=1;
                }
                break;
            case LessThanSign:
                {
                alt25=2;
                }
                break;
            case GreaterThanSign:
                {
                alt25=3;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalShortDSLParser.g:1949:3: (enumLiteral_0= EqualsSign )
                    {
                    // InternalShortDSLParser.g:1949:3: (enumLiteral_0= EqualsSign )
                    // InternalShortDSLParser.g:1950:4: enumLiteral_0= EqualsSign
                    {
                    enumLiteral_0=(Token)match(input,EqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPERATOR_SAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOMPARISON_OPERATOR_SAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1957:3: (enumLiteral_1= LessThanSign )
                    {
                    // InternalShortDSLParser.g:1957:3: (enumLiteral_1= LessThanSign )
                    // InternalShortDSLParser.g:1958:4: enumLiteral_1= LessThanSign
                    {
                    enumLiteral_1=(Token)match(input,LessThanSign,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPERATOR_SAccess().getLESS_THANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOMPARISON_OPERATOR_SAccess().getLESS_THANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1965:3: (enumLiteral_2= GreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1965:3: (enumLiteral_2= GreaterThanSign )
                    // InternalShortDSLParser.g:1966:4: enumLiteral_2= GreaterThanSign
                    {
                    enumLiteral_2=(Token)match(input,GreaterThanSign,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPERATOR_SAccess().getGREATER_THANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOMPARISON_OPERATOR_SAccess().getGREATER_THANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalShortDSLParser.g:1973:3: (enumLiteral_3= ExclamationMarkEqualsSign )
                    {
                    // InternalShortDSLParser.g:1973:3: (enumLiteral_3= ExclamationMarkEqualsSign )
                    // InternalShortDSLParser.g:1974:4: enumLiteral_3= ExclamationMarkEqualsSign
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
    // InternalShortDSLParser.g:1984:1: ruleCOLOR_S returns [Enumerator current=null] : ( (enumLiteral_0= Red ) | (enumLiteral_1= Green ) | (enumLiteral_2= Blue ) ) ;
    public final Enumerator ruleCOLOR_S() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:1990:2: ( ( (enumLiteral_0= Red ) | (enumLiteral_1= Green ) | (enumLiteral_2= Blue ) ) )
            // InternalShortDSLParser.g:1991:2: ( (enumLiteral_0= Red ) | (enumLiteral_1= Green ) | (enumLiteral_2= Blue ) )
            {
            // InternalShortDSLParser.g:1991:2: ( (enumLiteral_0= Red ) | (enumLiteral_1= Green ) | (enumLiteral_2= Blue ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case Red:
                {
                alt26=1;
                }
                break;
            case Green:
                {
                alt26=2;
                }
                break;
            case Blue:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalShortDSLParser.g:1992:3: (enumLiteral_0= Red )
                    {
                    // InternalShortDSLParser.g:1992:3: (enumLiteral_0= Red )
                    // InternalShortDSLParser.g:1993:4: enumLiteral_0= Red
                    {
                    enumLiteral_0=(Token)match(input,Red,FOLLOW_2); 

                    				current = grammarAccess.getCOLOR_SAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOLOR_SAccess().getREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2000:3: (enumLiteral_1= Green )
                    {
                    // InternalShortDSLParser.g:2000:3: (enumLiteral_1= Green )
                    // InternalShortDSLParser.g:2001:4: enumLiteral_1= Green
                    {
                    enumLiteral_1=(Token)match(input,Green,FOLLOW_2); 

                    				current = grammarAccess.getCOLOR_SAccess().getGREENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOLOR_SAccess().getGREENEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:2008:3: (enumLiteral_2= Blue )
                    {
                    // InternalShortDSLParser.g:2008:3: (enumLiteral_2= Blue )
                    // InternalShortDSLParser.g:2009:4: enumLiteral_2= Blue
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
    // InternalShortDSLParser.g:2019:1: ruleDISK_SLOT_STATES_S returns [Enumerator current=null] : ( (enumLiteral_0= Free ) | (enumLiteral_1= In_progress ) | (enumLiteral_2= Complete ) ) ;
    public final Enumerator ruleDISK_SLOT_STATES_S() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:2025:2: ( ( (enumLiteral_0= Free ) | (enumLiteral_1= In_progress ) | (enumLiteral_2= Complete ) ) )
            // InternalShortDSLParser.g:2026:2: ( (enumLiteral_0= Free ) | (enumLiteral_1= In_progress ) | (enumLiteral_2= Complete ) )
            {
            // InternalShortDSLParser.g:2026:2: ( (enumLiteral_0= Free ) | (enumLiteral_1= In_progress ) | (enumLiteral_2= Complete ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case Free:
                {
                alt27=1;
                }
                break;
            case In_progress:
                {
                alt27=2;
                }
                break;
            case Complete:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalShortDSLParser.g:2027:3: (enumLiteral_0= Free )
                    {
                    // InternalShortDSLParser.g:2027:3: (enumLiteral_0= Free )
                    // InternalShortDSLParser.g:2028:4: enumLiteral_0= Free
                    {
                    enumLiteral_0=(Token)match(input,Free,FOLLOW_2); 

                    				current = grammarAccess.getDISK_SLOT_STATES_SAccess().getFREEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDISK_SLOT_STATES_SAccess().getFREEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2035:3: (enumLiteral_1= In_progress )
                    {
                    // InternalShortDSLParser.g:2035:3: (enumLiteral_1= In_progress )
                    // InternalShortDSLParser.g:2036:4: enumLiteral_1= In_progress
                    {
                    enumLiteral_1=(Token)match(input,In_progress,FOLLOW_2); 

                    				current = grammarAccess.getDISK_SLOT_STATES_SAccess().getIN_PROGRESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDISK_SLOT_STATES_SAccess().getIN_PROGRESSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:2043:3: (enumLiteral_2= Complete )
                    {
                    // InternalShortDSLParser.g:2043:3: (enumLiteral_2= Complete )
                    // InternalShortDSLParser.g:2044:4: enumLiteral_2= Complete
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
    // InternalShortDSLParser.g:2054:1: ruleDISK_STATES_S returns [Enumerator current=null] : ( (enumLiteral_0= Full ) | (enumLiteral_1= Empty ) ) ;
    public final Enumerator ruleDISK_STATES_S() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:2060:2: ( ( (enumLiteral_0= Full ) | (enumLiteral_1= Empty ) ) )
            // InternalShortDSLParser.g:2061:2: ( (enumLiteral_0= Full ) | (enumLiteral_1= Empty ) )
            {
            // InternalShortDSLParser.g:2061:2: ( (enumLiteral_0= Full ) | (enumLiteral_1= Empty ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Full) ) {
                alt28=1;
            }
            else if ( (LA28_0==Empty) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalShortDSLParser.g:2062:3: (enumLiteral_0= Full )
                    {
                    // InternalShortDSLParser.g:2062:3: (enumLiteral_0= Full )
                    // InternalShortDSLParser.g:2063:4: enumLiteral_0= Full
                    {
                    enumLiteral_0=(Token)match(input,Full,FOLLOW_2); 

                    				current = grammarAccess.getDISK_STATES_SAccess().getFULLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDISK_STATES_SAccess().getFULLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:2070:3: (enumLiteral_1= Empty )
                    {
                    // InternalShortDSLParser.g:2070:3: (enumLiteral_1= Empty )
                    // InternalShortDSLParser.g:2071:4: enumLiteral_1= Empty
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000101400L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800101400L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001001002180L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001801002180L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000E0400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000300010D630L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000C000000L});

}