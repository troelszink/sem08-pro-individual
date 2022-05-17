package xtext.factoryLang.shortDSL.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Devices", "Test", "Dsl", "Use", "LeftParenthesis", "RightParenthesis", "Comma", "Colon", "LeftCurlyBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=15;
    public static final int RULE_BEGIN=14;
    public static final int RULE_STRING=18;
    public static final int Devices=4;
    public static final int RULE_SL_COMMENT=20;
    public static final int Comma=10;
    public static final int LeftParenthesis=8;
    public static final int Test=5;
    public static final int Colon=11;
    public static final int RightCurlyBracket=13;
    public static final int Dsl=6;
    public static final int EOF=-1;
    public static final int RULE_ID=16;
    public static final int RULE_WS=21;
    public static final int Use=7;
    public static final int RightParenthesis=9;
    public static final int LeftCurlyBracket=12;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_INT=17;
    public static final int RULE_ML_COMMENT=19;

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
    // InternalShortDSLParser.g:57:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalShortDSLParser.g:57:46: (iv_ruleModel= ruleModel EOF )
            // InternalShortDSLParser.g:58:2: iv_ruleModel= ruleModel EOF
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
    // InternalShortDSLParser.g:64:1: ruleModel returns [EObject current=null] : (otherlv_0= Use otherlv_1= Dsl ( (lv_type_2_0= ruleDSL_Short ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:70:2: ( (otherlv_0= Use otherlv_1= Dsl ( (lv_type_2_0= ruleDSL_Short ) ) ) )
            // InternalShortDSLParser.g:71:2: (otherlv_0= Use otherlv_1= Dsl ( (lv_type_2_0= ruleDSL_Short ) ) )
            {
            // InternalShortDSLParser.g:71:2: (otherlv_0= Use otherlv_1= Dsl ( (lv_type_2_0= ruleDSL_Short ) ) )
            // InternalShortDSLParser.g:72:3: otherlv_0= Use otherlv_1= Dsl ( (lv_type_2_0= ruleDSL_Short ) )
            {
            otherlv_0=(Token)match(input,Use,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getUseKeyword_0());
            		
            otherlv_1=(Token)match(input,Dsl,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getDslKeyword_1());
            		
            // InternalShortDSLParser.g:80:3: ( (lv_type_2_0= ruleDSL_Short ) )
            // InternalShortDSLParser.g:81:4: (lv_type_2_0= ruleDSL_Short )
            {
            // InternalShortDSLParser.g:81:4: (lv_type_2_0= ruleDSL_Short )
            // InternalShortDSLParser.g:82:5: lv_type_2_0= ruleDSL_Short
            {

            					newCompositeNode(grammarAccess.getModelAccess().getTypeDSL_ShortParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleDSL_Short();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.DSL_Short");
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


    // $ANTLR start "entryRuleDSL_Short"
    // InternalShortDSLParser.g:103:1: entryRuleDSL_Short returns [EObject current=null] : iv_ruleDSL_Short= ruleDSL_Short EOF ;
    public final EObject entryRuleDSL_Short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_Short = null;


        try {
            // InternalShortDSLParser.g:103:50: (iv_ruleDSL_Short= ruleDSL_Short EOF )
            // InternalShortDSLParser.g:104:2: iv_ruleDSL_Short= ruleDSL_Short EOF
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
    // InternalShortDSLParser.g:110:1: ruleDSL_Short returns [EObject current=null] : ( () ( (lv_configuration_1_0= ruleConfiguration_Short ) ) ( (lv_deviceHandlings_2_0= ruleDeviceHandling_Short ) ) ) ;
    public final EObject ruleDSL_Short() throws RecognitionException {
        EObject current = null;

        EObject lv_configuration_1_0 = null;

        EObject lv_deviceHandlings_2_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:116:2: ( ( () ( (lv_configuration_1_0= ruleConfiguration_Short ) ) ( (lv_deviceHandlings_2_0= ruleDeviceHandling_Short ) ) ) )
            // InternalShortDSLParser.g:117:2: ( () ( (lv_configuration_1_0= ruleConfiguration_Short ) ) ( (lv_deviceHandlings_2_0= ruleDeviceHandling_Short ) ) )
            {
            // InternalShortDSLParser.g:117:2: ( () ( (lv_configuration_1_0= ruleConfiguration_Short ) ) ( (lv_deviceHandlings_2_0= ruleDeviceHandling_Short ) ) )
            // InternalShortDSLParser.g:118:3: () ( (lv_configuration_1_0= ruleConfiguration_Short ) ) ( (lv_deviceHandlings_2_0= ruleDeviceHandling_Short ) )
            {
            // InternalShortDSLParser.g:118:3: ()
            // InternalShortDSLParser.g:119:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDSL_ShortAccess().getDSLShortAction_0(),
            					current);
            			

            }

            // InternalShortDSLParser.g:125:3: ( (lv_configuration_1_0= ruleConfiguration_Short ) )
            // InternalShortDSLParser.g:126:4: (lv_configuration_1_0= ruleConfiguration_Short )
            {
            // InternalShortDSLParser.g:126:4: (lv_configuration_1_0= ruleConfiguration_Short )
            // InternalShortDSLParser.g:127:5: lv_configuration_1_0= ruleConfiguration_Short
            {

            					newCompositeNode(grammarAccess.getDSL_ShortAccess().getConfigurationConfiguration_ShortParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_configuration_1_0=ruleConfiguration_Short();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDSL_ShortRule());
            					}
            					set(
            						current,
            						"configuration",
            						lv_configuration_1_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.Configuration_Short");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShortDSLParser.g:144:3: ( (lv_deviceHandlings_2_0= ruleDeviceHandling_Short ) )
            // InternalShortDSLParser.g:145:4: (lv_deviceHandlings_2_0= ruleDeviceHandling_Short )
            {
            // InternalShortDSLParser.g:145:4: (lv_deviceHandlings_2_0= ruleDeviceHandling_Short )
            // InternalShortDSLParser.g:146:5: lv_deviceHandlings_2_0= ruleDeviceHandling_Short
            {

            					newCompositeNode(grammarAccess.getDSL_ShortAccess().getDeviceHandlingsDeviceHandling_ShortParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_deviceHandlings_2_0=ruleDeviceHandling_Short();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDSL_ShortRule());
            					}
            					add(
            						current,
            						"deviceHandlings",
            						lv_deviceHandlings_2_0,
            						"xtext.factoryLang.shortDSL.ShortDSL.DeviceHandling_Short");
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
    // $ANTLR end "ruleDSL_Short"


    // $ANTLR start "entryRuleConfiguration_Short"
    // InternalShortDSLParser.g:167:1: entryRuleConfiguration_Short returns [EObject current=null] : iv_ruleConfiguration_Short= ruleConfiguration_Short EOF ;
    public final EObject entryRuleConfiguration_Short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration_Short = null;


        try {
            // InternalShortDSLParser.g:167:60: (iv_ruleConfiguration_Short= ruleConfiguration_Short EOF )
            // InternalShortDSLParser.g:168:2: iv_ruleConfiguration_Short= ruleConfiguration_Short EOF
            {
             newCompositeNode(grammarAccess.getConfiguration_ShortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration_Short=ruleConfiguration_Short();

            state._fsp--;

             current =iv_ruleConfiguration_Short; 
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
    // $ANTLR end "entryRuleConfiguration_Short"


    // $ANTLR start "ruleConfiguration_Short"
    // InternalShortDSLParser.g:174:1: ruleConfiguration_Short returns [EObject current=null] : (otherlv_0= Devices otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_devices_3_0= ruleDevice_Short ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleConfiguration_Short() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        Token otherlv_5=null;
        EObject lv_devices_3_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:180:2: ( (otherlv_0= Devices otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_devices_3_0= ruleDevice_Short ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket ) )
            // InternalShortDSLParser.g:181:2: (otherlv_0= Devices otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_devices_3_0= ruleDevice_Short ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket )
            {
            // InternalShortDSLParser.g:181:2: (otherlv_0= Devices otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_devices_3_0= ruleDevice_Short ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket )
            // InternalShortDSLParser.g:182:3: otherlv_0= Devices otherlv_1= LeftCurlyBracket this_BEGIN_2= RULE_BEGIN ( (lv_devices_3_0= ruleDevice_Short ) )+ this_END_4= RULE_END otherlv_5= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Devices,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConfiguration_ShortAccess().getDevicesKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getConfiguration_ShortAccess().getLeftCurlyBracketKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getConfiguration_ShortAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalShortDSLParser.g:194:3: ( (lv_devices_3_0= ruleDevice_Short ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalShortDSLParser.g:195:4: (lv_devices_3_0= ruleDevice_Short )
            	    {
            	    // InternalShortDSLParser.g:195:4: (lv_devices_3_0= ruleDevice_Short )
            	    // InternalShortDSLParser.g:196:5: lv_devices_3_0= ruleDevice_Short
            	    {

            	    					newCompositeNode(grammarAccess.getConfiguration_ShortAccess().getDevicesDevice_ShortParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_devices_3_0=ruleDevice_Short();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfiguration_ShortRule());
            	    					}
            	    					add(
            	    						current,
            	    						"devices",
            	    						lv_devices_3_0,
            	    						"xtext.factoryLang.shortDSL.ShortDSL.Device_Short");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            this_END_4=(Token)match(input,RULE_END,FOLLOW_10); 

            			newLeafNode(this_END_4, grammarAccess.getConfiguration_ShortAccess().getENDTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getConfiguration_ShortAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleConfiguration_Short"


    // $ANTLR start "entryRuleDevice_Short"
    // InternalShortDSLParser.g:225:1: entryRuleDevice_Short returns [EObject current=null] : iv_ruleDevice_Short= ruleDevice_Short EOF ;
    public final EObject entryRuleDevice_Short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice_Short = null;


        try {
            // InternalShortDSLParser.g:225:53: (iv_ruleDevice_Short= ruleDevice_Short EOF )
            // InternalShortDSLParser.g:226:2: iv_ruleDevice_Short= ruleDevice_Short EOF
            {
             newCompositeNode(grammarAccess.getDevice_ShortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice_Short=ruleDevice_Short();

            state._fsp--;

             current =iv_ruleDevice_Short; 
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
    // $ANTLR end "entryRuleDevice_Short"


    // $ANTLR start "ruleDevice_Short"
    // InternalShortDSLParser.g:232:1: ruleDevice_Short returns [EObject current=null] : (this_Crane_Short_0= ruleCrane_Short | this_Disk_Short_1= ruleDisk_Short | this_Camera_Short_2= ruleCamera_Short ) ;
    public final EObject ruleDevice_Short() throws RecognitionException {
        EObject current = null;

        EObject this_Crane_Short_0 = null;

        EObject this_Disk_Short_1 = null;

        EObject this_Camera_Short_2 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:238:2: ( (this_Crane_Short_0= ruleCrane_Short | this_Disk_Short_1= ruleDisk_Short | this_Camera_Short_2= ruleCamera_Short ) )
            // InternalShortDSLParser.g:239:2: (this_Crane_Short_0= ruleCrane_Short | this_Disk_Short_1= ruleDisk_Short | this_Camera_Short_2= ruleCamera_Short )
            {
            // InternalShortDSLParser.g:239:2: (this_Crane_Short_0= ruleCrane_Short | this_Disk_Short_1= ruleDisk_Short | this_Camera_Short_2= ruleCamera_Short )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==LeftParenthesis) ) {
                    alt2=2;
                }
                else if ( (LA2_1==Colon) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==RULE_BEGIN) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==RULE_ID) ) {
                            int LA2_5 = input.LA(5);

                            if ( (LA2_5==Comma||(LA2_5>=RULE_END && LA2_5<=RULE_ID)) ) {
                                alt2=3;
                            }
                            else if ( (LA2_5==Colon) ) {
                                alt2=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalShortDSLParser.g:240:3: this_Crane_Short_0= ruleCrane_Short
                    {

                    			newCompositeNode(grammarAccess.getDevice_ShortAccess().getCrane_ShortParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Crane_Short_0=ruleCrane_Short();

                    state._fsp--;


                    			current = this_Crane_Short_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:249:3: this_Disk_Short_1= ruleDisk_Short
                    {

                    			newCompositeNode(grammarAccess.getDevice_ShortAccess().getDisk_ShortParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Disk_Short_1=ruleDisk_Short();

                    state._fsp--;


                    			current = this_Disk_Short_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:258:3: this_Camera_Short_2= ruleCamera_Short
                    {

                    			newCompositeNode(grammarAccess.getDevice_ShortAccess().getCamera_ShortParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Camera_Short_2=ruleCamera_Short();

                    state._fsp--;


                    			current = this_Camera_Short_2;
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
    // $ANTLR end "ruleDevice_Short"


    // $ANTLR start "entryRuleCrane_Short"
    // InternalShortDSLParser.g:270:1: entryRuleCrane_Short returns [EObject current=null] : iv_ruleCrane_Short= ruleCrane_Short EOF ;
    public final EObject entryRuleCrane_Short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrane_Short = null;


        try {
            // InternalShortDSLParser.g:270:52: (iv_ruleCrane_Short= ruleCrane_Short EOF )
            // InternalShortDSLParser.g:271:2: iv_ruleCrane_Short= ruleCrane_Short EOF
            {
             newCompositeNode(grammarAccess.getCrane_ShortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrane_Short=ruleCrane_Short();

            state._fsp--;

             current =iv_ruleCrane_Short; 
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
    // $ANTLR end "entryRuleCrane_Short"


    // $ANTLR start "ruleCrane_Short"
    // InternalShortDSLParser.g:277:1: ruleCrane_Short returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_positions_3_0= ruleCranePosition_Short ) )+ this_END_4= RULE_END ) ;
    public final EObject ruleCrane_Short() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_positions_3_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:283:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_positions_3_0= ruleCranePosition_Short ) )+ this_END_4= RULE_END ) )
            // InternalShortDSLParser.g:284:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_positions_3_0= ruleCranePosition_Short ) )+ this_END_4= RULE_END )
            {
            // InternalShortDSLParser.g:284:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_positions_3_0= ruleCranePosition_Short ) )+ this_END_4= RULE_END )
            // InternalShortDSLParser.g:285:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_positions_3_0= ruleCranePosition_Short ) )+ this_END_4= RULE_END
            {
            // InternalShortDSLParser.g:285:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalShortDSLParser.g:286:4: (lv_name_0_0= RULE_ID )
            {
            // InternalShortDSLParser.g:286:4: (lv_name_0_0= RULE_ID )
            // InternalShortDSLParser.g:287:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCrane_ShortAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCrane_ShortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCrane_ShortAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getCrane_ShortAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalShortDSLParser.g:311:3: ( (lv_positions_3_0= ruleCranePosition_Short ) )+
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
            	    // InternalShortDSLParser.g:312:4: (lv_positions_3_0= ruleCranePosition_Short )
            	    {
            	    // InternalShortDSLParser.g:312:4: (lv_positions_3_0= ruleCranePosition_Short )
            	    // InternalShortDSLParser.g:313:5: lv_positions_3_0= ruleCranePosition_Short
            	    {

            	    					newCompositeNode(grammarAccess.getCrane_ShortAccess().getPositionsCranePosition_ShortParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_positions_3_0=ruleCranePosition_Short();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCrane_ShortRule());
            	    					}
            	    					add(
            	    						current,
            	    						"positions",
            	    						lv_positions_3_0,
            	    						"xtext.factoryLang.shortDSL.ShortDSL.CranePosition_Short");
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

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getCrane_ShortAccess().getENDTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleCrane_Short"


    // $ANTLR start "entryRuleCranePosition_Short"
    // InternalShortDSLParser.g:338:1: entryRuleCranePosition_Short returns [EObject current=null] : iv_ruleCranePosition_Short= ruleCranePosition_Short EOF ;
    public final EObject entryRuleCranePosition_Short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCranePosition_Short = null;


        try {
            // InternalShortDSLParser.g:338:60: (iv_ruleCranePosition_Short= ruleCranePosition_Short EOF )
            // InternalShortDSLParser.g:339:2: iv_ruleCranePosition_Short= ruleCranePosition_Short EOF
            {
             newCompositeNode(grammarAccess.getCranePosition_ShortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCranePosition_Short=ruleCranePosition_Short();

            state._fsp--;

             current =iv_ruleCranePosition_Short; 
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
    // $ANTLR end "entryRuleCranePosition_Short"


    // $ANTLR start "ruleCranePosition_Short"
    // InternalShortDSLParser.g:345:1: ruleCranePosition_Short returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_position_2_0= RULE_INT ) ) (otherlv_3= Comma )? ) ;
    public final EObject ruleCranePosition_Short() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_position_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:351:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_position_2_0= RULE_INT ) ) (otherlv_3= Comma )? ) )
            // InternalShortDSLParser.g:352:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_position_2_0= RULE_INT ) ) (otherlv_3= Comma )? )
            {
            // InternalShortDSLParser.g:352:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_position_2_0= RULE_INT ) ) (otherlv_3= Comma )? )
            // InternalShortDSLParser.g:353:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_position_2_0= RULE_INT ) ) (otherlv_3= Comma )?
            {
            // InternalShortDSLParser.g:353:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalShortDSLParser.g:354:4: (lv_name_0_0= RULE_ID )
            {
            // InternalShortDSLParser.g:354:4: (lv_name_0_0= RULE_ID )
            // InternalShortDSLParser.g:355:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCranePosition_ShortAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCranePosition_ShortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getCranePosition_ShortAccess().getColonKeyword_1());
            		
            // InternalShortDSLParser.g:375:3: ( (lv_position_2_0= RULE_INT ) )
            // InternalShortDSLParser.g:376:4: (lv_position_2_0= RULE_INT )
            {
            // InternalShortDSLParser.g:376:4: (lv_position_2_0= RULE_INT )
            // InternalShortDSLParser.g:377:5: lv_position_2_0= RULE_INT
            {
            lv_position_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_position_2_0, grammarAccess.getCranePosition_ShortAccess().getPositionINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCranePosition_ShortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"position",
            						lv_position_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalShortDSLParser.g:393:3: (otherlv_3= Comma )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Comma) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalShortDSLParser.g:394:4: otherlv_3= Comma
                    {
                    otherlv_3=(Token)match(input,Comma,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getCranePosition_ShortAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleCranePosition_Short"


    // $ANTLR start "entryRuleDisk_Short"
    // InternalShortDSLParser.g:403:1: entryRuleDisk_Short returns [EObject current=null] : iv_ruleDisk_Short= ruleDisk_Short EOF ;
    public final EObject entryRuleDisk_Short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisk_Short = null;


        try {
            // InternalShortDSLParser.g:403:51: (iv_ruleDisk_Short= ruleDisk_Short EOF )
            // InternalShortDSLParser.g:404:2: iv_ruleDisk_Short= ruleDisk_Short EOF
            {
             newCompositeNode(grammarAccess.getDisk_ShortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisk_Short=ruleDisk_Short();

            state._fsp--;

             current =iv_ruleDisk_Short; 
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
    // $ANTLR end "entryRuleDisk_Short"


    // $ANTLR start "ruleDisk_Short"
    // InternalShortDSLParser.g:410:1: ruleDisk_Short returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_nSlots_2_0= RULE_INT ) ) otherlv_3= RightParenthesis otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_zones_6_0= ruleDiskZone_Short ) )+ this_END_7= RULE_END ) ;
    public final EObject ruleDisk_Short() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_nSlots_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        EObject lv_zones_6_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:416:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_nSlots_2_0= RULE_INT ) ) otherlv_3= RightParenthesis otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_zones_6_0= ruleDiskZone_Short ) )+ this_END_7= RULE_END ) )
            // InternalShortDSLParser.g:417:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_nSlots_2_0= RULE_INT ) ) otherlv_3= RightParenthesis otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_zones_6_0= ruleDiskZone_Short ) )+ this_END_7= RULE_END )
            {
            // InternalShortDSLParser.g:417:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_nSlots_2_0= RULE_INT ) ) otherlv_3= RightParenthesis otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_zones_6_0= ruleDiskZone_Short ) )+ this_END_7= RULE_END )
            // InternalShortDSLParser.g:418:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_nSlots_2_0= RULE_INT ) ) otherlv_3= RightParenthesis otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_zones_6_0= ruleDiskZone_Short ) )+ this_END_7= RULE_END
            {
            // InternalShortDSLParser.g:418:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalShortDSLParser.g:419:4: (lv_name_0_0= RULE_ID )
            {
            // InternalShortDSLParser.g:419:4: (lv_name_0_0= RULE_ID )
            // InternalShortDSLParser.g:420:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDisk_ShortAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDisk_ShortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDisk_ShortAccess().getLeftParenthesisKeyword_1());
            		
            // InternalShortDSLParser.g:440:3: ( (lv_nSlots_2_0= RULE_INT ) )
            // InternalShortDSLParser.g:441:4: (lv_nSlots_2_0= RULE_INT )
            {
            // InternalShortDSLParser.g:441:4: (lv_nSlots_2_0= RULE_INT )
            // InternalShortDSLParser.g:442:5: lv_nSlots_2_0= RULE_INT
            {
            lv_nSlots_2_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_nSlots_2_0, grammarAccess.getDisk_ShortAccess().getNSlotsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDisk_ShortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nSlots",
            						lv_nSlots_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getDisk_ShortAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getDisk_ShortAccess().getColonKeyword_4());
            		
            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

            			newLeafNode(this_BEGIN_5, grammarAccess.getDisk_ShortAccess().getBEGINTerminalRuleCall_5());
            		
            // InternalShortDSLParser.g:470:3: ( (lv_zones_6_0= ruleDiskZone_Short ) )+
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
            	    // InternalShortDSLParser.g:471:4: (lv_zones_6_0= ruleDiskZone_Short )
            	    {
            	    // InternalShortDSLParser.g:471:4: (lv_zones_6_0= ruleDiskZone_Short )
            	    // InternalShortDSLParser.g:472:5: lv_zones_6_0= ruleDiskZone_Short
            	    {

            	    					newCompositeNode(grammarAccess.getDisk_ShortAccess().getZonesDiskZone_ShortParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_zones_6_0=ruleDiskZone_Short();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDisk_ShortRule());
            	    					}
            	    					add(
            	    						current,
            	    						"zones",
            	    						lv_zones_6_0,
            	    						"xtext.factoryLang.shortDSL.ShortDSL.DiskZone_Short");
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

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_7, grammarAccess.getDisk_ShortAccess().getENDTerminalRuleCall_7());
            		

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
    // $ANTLR end "ruleDisk_Short"


    // $ANTLR start "entryRuleDiskZone_Short"
    // InternalShortDSLParser.g:497:1: entryRuleDiskZone_Short returns [EObject current=null] : iv_ruleDiskZone_Short= ruleDiskZone_Short EOF ;
    public final EObject entryRuleDiskZone_Short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskZone_Short = null;


        try {
            // InternalShortDSLParser.g:497:55: (iv_ruleDiskZone_Short= ruleDiskZone_Short EOF )
            // InternalShortDSLParser.g:498:2: iv_ruleDiskZone_Short= ruleDiskZone_Short EOF
            {
             newCompositeNode(grammarAccess.getDiskZone_ShortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiskZone_Short=ruleDiskZone_Short();

            state._fsp--;

             current =iv_ruleDiskZone_Short; 
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
    // $ANTLR end "entryRuleDiskZone_Short"


    // $ANTLR start "ruleDiskZone_Short"
    // InternalShortDSLParser.g:504:1: ruleDiskZone_Short returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_slot_2_0= RULE_INT ) ) (otherlv_3= Comma )? ) ;
    public final EObject ruleDiskZone_Short() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_slot_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:510:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_slot_2_0= RULE_INT ) ) (otherlv_3= Comma )? ) )
            // InternalShortDSLParser.g:511:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_slot_2_0= RULE_INT ) ) (otherlv_3= Comma )? )
            {
            // InternalShortDSLParser.g:511:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_slot_2_0= RULE_INT ) ) (otherlv_3= Comma )? )
            // InternalShortDSLParser.g:512:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_slot_2_0= RULE_INT ) ) (otherlv_3= Comma )?
            {
            // InternalShortDSLParser.g:512:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalShortDSLParser.g:513:4: (lv_name_0_0= RULE_ID )
            {
            // InternalShortDSLParser.g:513:4: (lv_name_0_0= RULE_ID )
            // InternalShortDSLParser.g:514:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDiskZone_ShortAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskZone_ShortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDiskZone_ShortAccess().getColonKeyword_1());
            		
            // InternalShortDSLParser.g:534:3: ( (lv_slot_2_0= RULE_INT ) )
            // InternalShortDSLParser.g:535:4: (lv_slot_2_0= RULE_INT )
            {
            // InternalShortDSLParser.g:535:4: (lv_slot_2_0= RULE_INT )
            // InternalShortDSLParser.g:536:5: lv_slot_2_0= RULE_INT
            {
            lv_slot_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_slot_2_0, grammarAccess.getDiskZone_ShortAccess().getSlotINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiskZone_ShortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"slot",
            						lv_slot_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalShortDSLParser.g:552:3: (otherlv_3= Comma )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Comma) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalShortDSLParser.g:553:4: otherlv_3= Comma
                    {
                    otherlv_3=(Token)match(input,Comma,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDiskZone_ShortAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleDiskZone_Short"


    // $ANTLR start "entryRuleCamera_Short"
    // InternalShortDSLParser.g:562:1: entryRuleCamera_Short returns [EObject current=null] : iv_ruleCamera_Short= ruleCamera_Short EOF ;
    public final EObject entryRuleCamera_Short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCamera_Short = null;


        try {
            // InternalShortDSLParser.g:562:53: (iv_ruleCamera_Short= ruleCamera_Short EOF )
            // InternalShortDSLParser.g:563:2: iv_ruleCamera_Short= ruleCamera_Short EOF
            {
             newCompositeNode(grammarAccess.getCamera_ShortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCamera_Short=ruleCamera_Short();

            state._fsp--;

             current =iv_ruleCamera_Short; 
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
    // $ANTLR end "entryRuleCamera_Short"


    // $ANTLR start "ruleCamera_Short"
    // InternalShortDSLParser.g:569:1: ruleCamera_Short returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_colors_3_0= ruleCameraColor_Short ) )+ this_END_4= RULE_END ) ;
    public final EObject ruleCamera_Short() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_colors_3_0 = null;



        	enterRule();

        try {
            // InternalShortDSLParser.g:575:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_colors_3_0= ruleCameraColor_Short ) )+ this_END_4= RULE_END ) )
            // InternalShortDSLParser.g:576:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_colors_3_0= ruleCameraColor_Short ) )+ this_END_4= RULE_END )
            {
            // InternalShortDSLParser.g:576:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_colors_3_0= ruleCameraColor_Short ) )+ this_END_4= RULE_END )
            // InternalShortDSLParser.g:577:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_colors_3_0= ruleCameraColor_Short ) )+ this_END_4= RULE_END
            {
            // InternalShortDSLParser.g:577:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalShortDSLParser.g:578:4: (lv_name_0_0= RULE_ID )
            {
            // InternalShortDSLParser.g:578:4: (lv_name_0_0= RULE_ID )
            // InternalShortDSLParser.g:579:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCamera_ShortAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCamera_ShortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCamera_ShortAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getCamera_ShortAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalShortDSLParser.g:603:3: ( (lv_colors_3_0= ruleCameraColor_Short ) )+
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
            	    // InternalShortDSLParser.g:604:4: (lv_colors_3_0= ruleCameraColor_Short )
            	    {
            	    // InternalShortDSLParser.g:604:4: (lv_colors_3_0= ruleCameraColor_Short )
            	    // InternalShortDSLParser.g:605:5: lv_colors_3_0= ruleCameraColor_Short
            	    {

            	    					newCompositeNode(grammarAccess.getCamera_ShortAccess().getColorsCameraColor_ShortParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_colors_3_0=ruleCameraColor_Short();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCamera_ShortRule());
            	    					}
            	    					add(
            	    						current,
            	    						"colors",
            	    						lv_colors_3_0,
            	    						"xtext.factoryLang.shortDSL.ShortDSL.CameraColor_Short");
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

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getCamera_ShortAccess().getENDTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleCamera_Short"


    // $ANTLR start "entryRuleCameraColor_Short"
    // InternalShortDSLParser.g:630:1: entryRuleCameraColor_Short returns [EObject current=null] : iv_ruleCameraColor_Short= ruleCameraColor_Short EOF ;
    public final EObject entryRuleCameraColor_Short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCameraColor_Short = null;


        try {
            // InternalShortDSLParser.g:630:58: (iv_ruleCameraColor_Short= ruleCameraColor_Short EOF )
            // InternalShortDSLParser.g:631:2: iv_ruleCameraColor_Short= ruleCameraColor_Short EOF
            {
             newCompositeNode(grammarAccess.getCameraColor_ShortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCameraColor_Short=ruleCameraColor_Short();

            state._fsp--;

             current =iv_ruleCameraColor_Short; 
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
    // $ANTLR end "entryRuleCameraColor_Short"


    // $ANTLR start "ruleCameraColor_Short"
    // InternalShortDSLParser.g:637:1: ruleCameraColor_Short returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Comma )? ) ;
    public final EObject ruleCameraColor_Short() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:643:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Comma )? ) )
            // InternalShortDSLParser.g:644:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Comma )? )
            {
            // InternalShortDSLParser.g:644:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Comma )? )
            // InternalShortDSLParser.g:645:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Comma )?
            {
            // InternalShortDSLParser.g:645:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalShortDSLParser.g:646:4: (lv_name_0_0= RULE_ID )
            {
            // InternalShortDSLParser.g:646:4: (lv_name_0_0= RULE_ID )
            // InternalShortDSLParser.g:647:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCameraColor_ShortAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCameraColor_ShortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalShortDSLParser.g:663:3: (otherlv_1= Comma )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Comma) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalShortDSLParser.g:664:4: otherlv_1= Comma
                    {
                    otherlv_1=(Token)match(input,Comma,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getCameraColor_ShortAccess().getCommaKeyword_1());
                    			

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
    // $ANTLR end "ruleCameraColor_Short"


    // $ANTLR start "entryRuleDeviceHandling_Short"
    // InternalShortDSLParser.g:673:1: entryRuleDeviceHandling_Short returns [EObject current=null] : iv_ruleDeviceHandling_Short= ruleDeviceHandling_Short EOF ;
    public final EObject entryRuleDeviceHandling_Short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceHandling_Short = null;


        try {
            // InternalShortDSLParser.g:673:61: (iv_ruleDeviceHandling_Short= ruleDeviceHandling_Short EOF )
            // InternalShortDSLParser.g:674:2: iv_ruleDeviceHandling_Short= ruleDeviceHandling_Short EOF
            {
             newCompositeNode(grammarAccess.getDeviceHandling_ShortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceHandling_Short=ruleDeviceHandling_Short();

            state._fsp--;

             current =iv_ruleDeviceHandling_Short; 
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
    // $ANTLR end "entryRuleDeviceHandling_Short"


    // $ANTLR start "ruleDeviceHandling_Short"
    // InternalShortDSLParser.g:680:1: ruleDeviceHandling_Short returns [EObject current=null] : (otherlv_0= Test ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDeviceHandling_Short() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalShortDSLParser.g:686:2: ( (otherlv_0= Test ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalShortDSLParser.g:687:2: (otherlv_0= Test ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalShortDSLParser.g:687:2: (otherlv_0= Test ( (lv_name_1_0= RULE_ID ) ) )
            // InternalShortDSLParser.g:688:3: otherlv_0= Test ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Test,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceHandling_ShortAccess().getTestKeyword_0());
            		
            // InternalShortDSLParser.g:692:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShortDSLParser.g:693:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShortDSLParser.g:693:4: (lv_name_1_0= RULE_ID )
            // InternalShortDSLParser.g:694:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDeviceHandling_ShortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceHandling_ShortRule());
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
    // $ANTLR end "ruleDeviceHandling_Short"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000200L});

}