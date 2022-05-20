package xtext.factoryLang.shortDSL.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

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
import xtext.factoryLang.shortDSL.services.ShortDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShortDSLParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LessThanSign", "'<'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("H", "'h'");
    		tokenNameToValue.put("M", "'m'");
    		tokenNameToValue.put("S", "'s'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("ExclamationMarkEqualsSign", "'!='");
    		tokenNameToValue.put("HyphenMinusGreaterThanSign", "'->'");
    		tokenNameToValue.put("If", "'if'");
    		tokenNameToValue.put("HyphenMinusHyphenMinusGreaterThanSign", "'-->'");
    		tokenNameToValue.put("Dev", "'dev'");
    		tokenNameToValue.put("Dsl", "'dsl'");
    		tokenNameToValue.put("Red", "'red'");
    		tokenNameToValue.put("Use", "'use'");
    		tokenNameToValue.put("Var", "'var'");
    		tokenNameToValue.put("Blue", "'blue'");
    		tokenNameToValue.put("Drop", "'drop'");
    		tokenNameToValue.put("Full", "'full'");
    		tokenNameToValue.put("Long", "'long'");
    		tokenNameToValue.put("Scan", "'scan'");
    		tokenNameToValue.put("Test", "'test'");
    		tokenNameToValue.put("Empty", "'empty'");
    		tokenNameToValue.put("Green", "'green'");
    		tokenNameToValue.put("Short", "'short'");
    		tokenNameToValue.put("Handle", "'handle'");
    		tokenNameToValue.put("Pickup", "'pickup'");
    		tokenNameToValue.put("Vacant", "'vacant'");
    		tokenNameToValue.put("Devices", "'devices'");
    		tokenNameToValue.put("Foreach", "'foreach'");
    		tokenNameToValue.put("Complete", "'complete'");
    		tokenNameToValue.put("In_progress", "'in_progress'");
    	}

    	public void setGrammarAccess(ShortDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalShortDSLParser.g:92:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:93:1: ( ruleModel EOF )
            // InternalShortDSLParser.g:94:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalShortDSLParser.g:101:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:105:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalShortDSLParser.g:106:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalShortDSLParser.g:106:2: ( ( rule__Model__Group__0 ) )
            // InternalShortDSLParser.g:107:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalShortDSLParser.g:108:3: ( rule__Model__Group__0 )
            // InternalShortDSLParser.g:108:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDSL_Long"
    // InternalShortDSLParser.g:117:1: entryRuleDSL_Long : ruleDSL_Long EOF ;
    public final void entryRuleDSL_Long() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:118:1: ( ruleDSL_Long EOF )
            // InternalShortDSLParser.g:119:1: ruleDSL_Long EOF
            {
             before(grammarAccess.getDSL_LongRule()); 
            pushFollow(FOLLOW_1);
            ruleDSL_Long();

            state._fsp--;

             after(grammarAccess.getDSL_LongRule()); 
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
    // $ANTLR end "entryRuleDSL_Long"


    // $ANTLR start "ruleDSL_Long"
    // InternalShortDSLParser.g:126:1: ruleDSL_Long : ( ( rule__DSL_Long__Group__0 ) ) ;
    public final void ruleDSL_Long() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:130:2: ( ( ( rule__DSL_Long__Group__0 ) ) )
            // InternalShortDSLParser.g:131:2: ( ( rule__DSL_Long__Group__0 ) )
            {
            // InternalShortDSLParser.g:131:2: ( ( rule__DSL_Long__Group__0 ) )
            // InternalShortDSLParser.g:132:3: ( rule__DSL_Long__Group__0 )
            {
             before(grammarAccess.getDSL_LongAccess().getGroup()); 
            // InternalShortDSLParser.g:133:3: ( rule__DSL_Long__Group__0 )
            // InternalShortDSLParser.g:133:4: rule__DSL_Long__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSL_Long__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSL_LongAccess().getGroup()); 

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
    // $ANTLR end "ruleDSL_Long"


    // $ANTLR start "entryRuleDSL_Short"
    // InternalShortDSLParser.g:142:1: entryRuleDSL_Short : ruleDSL_Short EOF ;
    public final void entryRuleDSL_Short() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:143:1: ( ruleDSL_Short EOF )
            // InternalShortDSLParser.g:144:1: ruleDSL_Short EOF
            {
             before(grammarAccess.getDSL_ShortRule()); 
            pushFollow(FOLLOW_1);
            ruleDSL_Short();

            state._fsp--;

             after(grammarAccess.getDSL_ShortRule()); 
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
    // $ANTLR end "entryRuleDSL_Short"


    // $ANTLR start "ruleDSL_Short"
    // InternalShortDSLParser.g:151:1: ruleDSL_Short : ( ( rule__DSL_Short__Group__0 ) ) ;
    public final void ruleDSL_Short() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:155:2: ( ( ( rule__DSL_Short__Group__0 ) ) )
            // InternalShortDSLParser.g:156:2: ( ( rule__DSL_Short__Group__0 ) )
            {
            // InternalShortDSLParser.g:156:2: ( ( rule__DSL_Short__Group__0 ) )
            // InternalShortDSLParser.g:157:3: ( rule__DSL_Short__Group__0 )
            {
             before(grammarAccess.getDSL_ShortAccess().getGroup()); 
            // InternalShortDSLParser.g:158:3: ( rule__DSL_Short__Group__0 )
            // InternalShortDSLParser.g:158:4: rule__DSL_Short__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSL_Short__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSL_ShortAccess().getGroup()); 

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
    // $ANTLR end "ruleDSL_Short"


    // $ANTLR start "entryRuleConfigurationS"
    // InternalShortDSLParser.g:167:1: entryRuleConfigurationS : ruleConfigurationS EOF ;
    public final void entryRuleConfigurationS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:168:1: ( ruleConfigurationS EOF )
            // InternalShortDSLParser.g:169:1: ruleConfigurationS EOF
            {
             before(grammarAccess.getConfigurationSRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigurationS();

            state._fsp--;

             after(grammarAccess.getConfigurationSRule()); 
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
    // $ANTLR end "entryRuleConfigurationS"


    // $ANTLR start "ruleConfigurationS"
    // InternalShortDSLParser.g:176:1: ruleConfigurationS : ( ( rule__ConfigurationS__Group__0 ) ) ;
    public final void ruleConfigurationS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:180:2: ( ( ( rule__ConfigurationS__Group__0 ) ) )
            // InternalShortDSLParser.g:181:2: ( ( rule__ConfigurationS__Group__0 ) )
            {
            // InternalShortDSLParser.g:181:2: ( ( rule__ConfigurationS__Group__0 ) )
            // InternalShortDSLParser.g:182:3: ( rule__ConfigurationS__Group__0 )
            {
             before(grammarAccess.getConfigurationSAccess().getGroup()); 
            // InternalShortDSLParser.g:183:3: ( rule__ConfigurationS__Group__0 )
            // InternalShortDSLParser.g:183:4: rule__ConfigurationS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationSAccess().getGroup()); 

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
    // $ANTLR end "ruleConfigurationS"


    // $ANTLR start "entryRuleDeviceS"
    // InternalShortDSLParser.g:192:1: entryRuleDeviceS : ruleDeviceS EOF ;
    public final void entryRuleDeviceS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:193:1: ( ruleDeviceS EOF )
            // InternalShortDSLParser.g:194:1: ruleDeviceS EOF
            {
             before(grammarAccess.getDeviceSRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceS();

            state._fsp--;

             after(grammarAccess.getDeviceSRule()); 
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
    // $ANTLR end "entryRuleDeviceS"


    // $ANTLR start "ruleDeviceS"
    // InternalShortDSLParser.g:201:1: ruleDeviceS : ( ( rule__DeviceS__Alternatives ) ) ;
    public final void ruleDeviceS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:205:2: ( ( ( rule__DeviceS__Alternatives ) ) )
            // InternalShortDSLParser.g:206:2: ( ( rule__DeviceS__Alternatives ) )
            {
            // InternalShortDSLParser.g:206:2: ( ( rule__DeviceS__Alternatives ) )
            // InternalShortDSLParser.g:207:3: ( rule__DeviceS__Alternatives )
            {
             before(grammarAccess.getDeviceSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:208:3: ( rule__DeviceS__Alternatives )
            // InternalShortDSLParser.g:208:4: rule__DeviceS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DeviceS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeviceSAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDeviceS"


    // $ANTLR start "entryRuleCraneS"
    // InternalShortDSLParser.g:217:1: entryRuleCraneS : ruleCraneS EOF ;
    public final void entryRuleCraneS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:218:1: ( ruleCraneS EOF )
            // InternalShortDSLParser.g:219:1: ruleCraneS EOF
            {
             before(grammarAccess.getCraneSRule()); 
            pushFollow(FOLLOW_1);
            ruleCraneS();

            state._fsp--;

             after(grammarAccess.getCraneSRule()); 
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
    // $ANTLR end "entryRuleCraneS"


    // $ANTLR start "ruleCraneS"
    // InternalShortDSLParser.g:226:1: ruleCraneS : ( ( rule__CraneS__Group__0 ) ) ;
    public final void ruleCraneS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:230:2: ( ( ( rule__CraneS__Group__0 ) ) )
            // InternalShortDSLParser.g:231:2: ( ( rule__CraneS__Group__0 ) )
            {
            // InternalShortDSLParser.g:231:2: ( ( rule__CraneS__Group__0 ) )
            // InternalShortDSLParser.g:232:3: ( rule__CraneS__Group__0 )
            {
             before(grammarAccess.getCraneSAccess().getGroup()); 
            // InternalShortDSLParser.g:233:3: ( rule__CraneS__Group__0 )
            // InternalShortDSLParser.g:233:4: rule__CraneS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CraneS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCraneSAccess().getGroup()); 

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
    // $ANTLR end "ruleCraneS"


    // $ANTLR start "entryRuleCraneZoneS"
    // InternalShortDSLParser.g:242:1: entryRuleCraneZoneS : ruleCraneZoneS EOF ;
    public final void entryRuleCraneZoneS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:243:1: ( ruleCraneZoneS EOF )
            // InternalShortDSLParser.g:244:1: ruleCraneZoneS EOF
            {
             before(grammarAccess.getCraneZoneSRule()); 
            pushFollow(FOLLOW_1);
            ruleCraneZoneS();

            state._fsp--;

             after(grammarAccess.getCraneZoneSRule()); 
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
    // $ANTLR end "entryRuleCraneZoneS"


    // $ANTLR start "ruleCraneZoneS"
    // InternalShortDSLParser.g:251:1: ruleCraneZoneS : ( ( rule__CraneZoneS__Group__0 ) ) ;
    public final void ruleCraneZoneS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:255:2: ( ( ( rule__CraneZoneS__Group__0 ) ) )
            // InternalShortDSLParser.g:256:2: ( ( rule__CraneZoneS__Group__0 ) )
            {
            // InternalShortDSLParser.g:256:2: ( ( rule__CraneZoneS__Group__0 ) )
            // InternalShortDSLParser.g:257:3: ( rule__CraneZoneS__Group__0 )
            {
             before(grammarAccess.getCraneZoneSAccess().getGroup()); 
            // InternalShortDSLParser.g:258:3: ( rule__CraneZoneS__Group__0 )
            // InternalShortDSLParser.g:258:4: rule__CraneZoneS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CraneZoneS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCraneZoneSAccess().getGroup()); 

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
    // $ANTLR end "ruleCraneZoneS"


    // $ANTLR start "entryRuleDiskS"
    // InternalShortDSLParser.g:267:1: entryRuleDiskS : ruleDiskS EOF ;
    public final void entryRuleDiskS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:268:1: ( ruleDiskS EOF )
            // InternalShortDSLParser.g:269:1: ruleDiskS EOF
            {
             before(grammarAccess.getDiskSRule()); 
            pushFollow(FOLLOW_1);
            ruleDiskS();

            state._fsp--;

             after(grammarAccess.getDiskSRule()); 
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
    // $ANTLR end "entryRuleDiskS"


    // $ANTLR start "ruleDiskS"
    // InternalShortDSLParser.g:276:1: ruleDiskS : ( ( rule__DiskS__Group__0 ) ) ;
    public final void ruleDiskS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:280:2: ( ( ( rule__DiskS__Group__0 ) ) )
            // InternalShortDSLParser.g:281:2: ( ( rule__DiskS__Group__0 ) )
            {
            // InternalShortDSLParser.g:281:2: ( ( rule__DiskS__Group__0 ) )
            // InternalShortDSLParser.g:282:3: ( rule__DiskS__Group__0 )
            {
             before(grammarAccess.getDiskSAccess().getGroup()); 
            // InternalShortDSLParser.g:283:3: ( rule__DiskS__Group__0 )
            // InternalShortDSLParser.g:283:4: rule__DiskS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DiskS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiskSAccess().getGroup()); 

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
    // $ANTLR end "ruleDiskS"


    // $ANTLR start "entryRuleDiskZoneS"
    // InternalShortDSLParser.g:292:1: entryRuleDiskZoneS : ruleDiskZoneS EOF ;
    public final void entryRuleDiskZoneS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:293:1: ( ruleDiskZoneS EOF )
            // InternalShortDSLParser.g:294:1: ruleDiskZoneS EOF
            {
             before(grammarAccess.getDiskZoneSRule()); 
            pushFollow(FOLLOW_1);
            ruleDiskZoneS();

            state._fsp--;

             after(grammarAccess.getDiskZoneSRule()); 
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
    // $ANTLR end "entryRuleDiskZoneS"


    // $ANTLR start "ruleDiskZoneS"
    // InternalShortDSLParser.g:301:1: ruleDiskZoneS : ( ( rule__DiskZoneS__Group__0 ) ) ;
    public final void ruleDiskZoneS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:305:2: ( ( ( rule__DiskZoneS__Group__0 ) ) )
            // InternalShortDSLParser.g:306:2: ( ( rule__DiskZoneS__Group__0 ) )
            {
            // InternalShortDSLParser.g:306:2: ( ( rule__DiskZoneS__Group__0 ) )
            // InternalShortDSLParser.g:307:3: ( rule__DiskZoneS__Group__0 )
            {
             before(grammarAccess.getDiskZoneSAccess().getGroup()); 
            // InternalShortDSLParser.g:308:3: ( rule__DiskZoneS__Group__0 )
            // InternalShortDSLParser.g:308:4: rule__DiskZoneS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DiskZoneS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiskZoneSAccess().getGroup()); 

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
    // $ANTLR end "ruleDiskZoneS"


    // $ANTLR start "entryRuleCameraS"
    // InternalShortDSLParser.g:317:1: entryRuleCameraS : ruleCameraS EOF ;
    public final void entryRuleCameraS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:318:1: ( ruleCameraS EOF )
            // InternalShortDSLParser.g:319:1: ruleCameraS EOF
            {
             before(grammarAccess.getCameraSRule()); 
            pushFollow(FOLLOW_1);
            ruleCameraS();

            state._fsp--;

             after(grammarAccess.getCameraSRule()); 
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
    // $ANTLR end "entryRuleCameraS"


    // $ANTLR start "ruleCameraS"
    // InternalShortDSLParser.g:326:1: ruleCameraS : ( ( rule__CameraS__Group__0 ) ) ;
    public final void ruleCameraS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:330:2: ( ( ( rule__CameraS__Group__0 ) ) )
            // InternalShortDSLParser.g:331:2: ( ( rule__CameraS__Group__0 ) )
            {
            // InternalShortDSLParser.g:331:2: ( ( rule__CameraS__Group__0 ) )
            // InternalShortDSLParser.g:332:3: ( rule__CameraS__Group__0 )
            {
             before(grammarAccess.getCameraSAccess().getGroup()); 
            // InternalShortDSLParser.g:333:3: ( rule__CameraS__Group__0 )
            // InternalShortDSLParser.g:333:4: rule__CameraS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CameraS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCameraSAccess().getGroup()); 

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
    // $ANTLR end "ruleCameraS"


    // $ANTLR start "entryRuleCameraColorS"
    // InternalShortDSLParser.g:342:1: entryRuleCameraColorS : ruleCameraColorS EOF ;
    public final void entryRuleCameraColorS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:343:1: ( ruleCameraColorS EOF )
            // InternalShortDSLParser.g:344:1: ruleCameraColorS EOF
            {
             before(grammarAccess.getCameraColorSRule()); 
            pushFollow(FOLLOW_1);
            ruleCameraColorS();

            state._fsp--;

             after(grammarAccess.getCameraColorSRule()); 
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
    // $ANTLR end "entryRuleCameraColorS"


    // $ANTLR start "ruleCameraColorS"
    // InternalShortDSLParser.g:351:1: ruleCameraColorS : ( ( rule__CameraColorS__Group__0 ) ) ;
    public final void ruleCameraColorS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:355:2: ( ( ( rule__CameraColorS__Group__0 ) ) )
            // InternalShortDSLParser.g:356:2: ( ( rule__CameraColorS__Group__0 ) )
            {
            // InternalShortDSLParser.g:356:2: ( ( rule__CameraColorS__Group__0 ) )
            // InternalShortDSLParser.g:357:3: ( rule__CameraColorS__Group__0 )
            {
             before(grammarAccess.getCameraColorSAccess().getGroup()); 
            // InternalShortDSLParser.g:358:3: ( rule__CameraColorS__Group__0 )
            // InternalShortDSLParser.g:358:4: rule__CameraColorS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CameraColorS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCameraColorSAccess().getGroup()); 

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
    // $ANTLR end "ruleCameraColorS"


    // $ANTLR start "entryRuleDiskHandlingS"
    // InternalShortDSLParser.g:367:1: entryRuleDiskHandlingS : ruleDiskHandlingS EOF ;
    public final void entryRuleDiskHandlingS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:368:1: ( ruleDiskHandlingS EOF )
            // InternalShortDSLParser.g:369:1: ruleDiskHandlingS EOF
            {
             before(grammarAccess.getDiskHandlingSRule()); 
            pushFollow(FOLLOW_1);
            ruleDiskHandlingS();

            state._fsp--;

             after(grammarAccess.getDiskHandlingSRule()); 
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
    // $ANTLR end "entryRuleDiskHandlingS"


    // $ANTLR start "ruleDiskHandlingS"
    // InternalShortDSLParser.g:376:1: ruleDiskHandlingS : ( ( rule__DiskHandlingS__Group__0 ) ) ;
    public final void ruleDiskHandlingS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:380:2: ( ( ( rule__DiskHandlingS__Group__0 ) ) )
            // InternalShortDSLParser.g:381:2: ( ( rule__DiskHandlingS__Group__0 ) )
            {
            // InternalShortDSLParser.g:381:2: ( ( rule__DiskHandlingS__Group__0 ) )
            // InternalShortDSLParser.g:382:3: ( rule__DiskHandlingS__Group__0 )
            {
             before(grammarAccess.getDiskHandlingSAccess().getGroup()); 
            // InternalShortDSLParser.g:383:3: ( rule__DiskHandlingS__Group__0 )
            // InternalShortDSLParser.g:383:4: rule__DiskHandlingS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DiskHandlingS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiskHandlingSAccess().getGroup()); 

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
    // $ANTLR end "ruleDiskHandlingS"


    // $ANTLR start "entryRuleStatementS"
    // InternalShortDSLParser.g:392:1: entryRuleStatementS : ruleStatementS EOF ;
    public final void entryRuleStatementS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:393:1: ( ruleStatementS EOF )
            // InternalShortDSLParser.g:394:1: ruleStatementS EOF
            {
             before(grammarAccess.getStatementSRule()); 
            pushFollow(FOLLOW_1);
            ruleStatementS();

            state._fsp--;

             after(grammarAccess.getStatementSRule()); 
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
    // $ANTLR end "entryRuleStatementS"


    // $ANTLR start "ruleStatementS"
    // InternalShortDSLParser.g:401:1: ruleStatementS : ( ( rule__StatementS__Alternatives ) ) ;
    public final void ruleStatementS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:405:2: ( ( ( rule__StatementS__Alternatives ) ) )
            // InternalShortDSLParser.g:406:2: ( ( rule__StatementS__Alternatives ) )
            {
            // InternalShortDSLParser.g:406:2: ( ( rule__StatementS__Alternatives ) )
            // InternalShortDSLParser.g:407:3: ( rule__StatementS__Alternatives )
            {
             before(grammarAccess.getStatementSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:408:3: ( rule__StatementS__Alternatives )
            // InternalShortDSLParser.g:408:4: rule__StatementS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StatementS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementSAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatementS"


    // $ANTLR start "entryRuleLoopS"
    // InternalShortDSLParser.g:417:1: entryRuleLoopS : ruleLoopS EOF ;
    public final void entryRuleLoopS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:418:1: ( ruleLoopS EOF )
            // InternalShortDSLParser.g:419:1: ruleLoopS EOF
            {
             before(grammarAccess.getLoopSRule()); 
            pushFollow(FOLLOW_1);
            ruleLoopS();

            state._fsp--;

             after(grammarAccess.getLoopSRule()); 
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
    // $ANTLR end "entryRuleLoopS"


    // $ANTLR start "ruleLoopS"
    // InternalShortDSLParser.g:426:1: ruleLoopS : ( ( rule__LoopS__Group__0 ) ) ;
    public final void ruleLoopS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:430:2: ( ( ( rule__LoopS__Group__0 ) ) )
            // InternalShortDSLParser.g:431:2: ( ( rule__LoopS__Group__0 ) )
            {
            // InternalShortDSLParser.g:431:2: ( ( rule__LoopS__Group__0 ) )
            // InternalShortDSLParser.g:432:3: ( rule__LoopS__Group__0 )
            {
             before(grammarAccess.getLoopSAccess().getGroup()); 
            // InternalShortDSLParser.g:433:3: ( rule__LoopS__Group__0 )
            // InternalShortDSLParser.g:433:4: rule__LoopS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoopS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopSAccess().getGroup()); 

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
    // $ANTLR end "ruleLoopS"


    // $ANTLR start "entryRuleMoveS"
    // InternalShortDSLParser.g:442:1: entryRuleMoveS : ruleMoveS EOF ;
    public final void entryRuleMoveS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:443:1: ( ruleMoveS EOF )
            // InternalShortDSLParser.g:444:1: ruleMoveS EOF
            {
             before(grammarAccess.getMoveSRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveS();

            state._fsp--;

             after(grammarAccess.getMoveSRule()); 
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
    // $ANTLR end "entryRuleMoveS"


    // $ANTLR start "ruleMoveS"
    // InternalShortDSLParser.g:451:1: ruleMoveS : ( ( rule__MoveS__Alternatives ) ) ;
    public final void ruleMoveS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:455:2: ( ( ( rule__MoveS__Alternatives ) ) )
            // InternalShortDSLParser.g:456:2: ( ( rule__MoveS__Alternatives ) )
            {
            // InternalShortDSLParser.g:456:2: ( ( rule__MoveS__Alternatives ) )
            // InternalShortDSLParser.g:457:3: ( rule__MoveS__Alternatives )
            {
             before(grammarAccess.getMoveSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:458:3: ( rule__MoveS__Alternatives )
            // InternalShortDSLParser.g:458:4: rule__MoveS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MoveS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMoveSAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMoveS"


    // $ANTLR start "entryRuleMoveDiskS"
    // InternalShortDSLParser.g:467:1: entryRuleMoveDiskS : ruleMoveDiskS EOF ;
    public final void entryRuleMoveDiskS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:468:1: ( ruleMoveDiskS EOF )
            // InternalShortDSLParser.g:469:1: ruleMoveDiskS EOF
            {
             before(grammarAccess.getMoveDiskSRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveDiskS();

            state._fsp--;

             after(grammarAccess.getMoveDiskSRule()); 
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
    // $ANTLR end "entryRuleMoveDiskS"


    // $ANTLR start "ruleMoveDiskS"
    // InternalShortDSLParser.g:476:1: ruleMoveDiskS : ( ( rule__MoveDiskS__Group__0 ) ) ;
    public final void ruleMoveDiskS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:480:2: ( ( ( rule__MoveDiskS__Group__0 ) ) )
            // InternalShortDSLParser.g:481:2: ( ( rule__MoveDiskS__Group__0 ) )
            {
            // InternalShortDSLParser.g:481:2: ( ( rule__MoveDiskS__Group__0 ) )
            // InternalShortDSLParser.g:482:3: ( rule__MoveDiskS__Group__0 )
            {
             before(grammarAccess.getMoveDiskSAccess().getGroup()); 
            // InternalShortDSLParser.g:483:3: ( rule__MoveDiskS__Group__0 )
            // InternalShortDSLParser.g:483:4: rule__MoveDiskS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveDiskS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveDiskSAccess().getGroup()); 

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
    // $ANTLR end "ruleMoveDiskS"


    // $ANTLR start "entryRuleMoveAnySlotS"
    // InternalShortDSLParser.g:492:1: entryRuleMoveAnySlotS : ruleMoveAnySlotS EOF ;
    public final void entryRuleMoveAnySlotS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:493:1: ( ruleMoveAnySlotS EOF )
            // InternalShortDSLParser.g:494:1: ruleMoveAnySlotS EOF
            {
             before(grammarAccess.getMoveAnySlotSRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveAnySlotS();

            state._fsp--;

             after(grammarAccess.getMoveAnySlotSRule()); 
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
    // $ANTLR end "entryRuleMoveAnySlotS"


    // $ANTLR start "ruleMoveAnySlotS"
    // InternalShortDSLParser.g:501:1: ruleMoveAnySlotS : ( ( rule__MoveAnySlotS__Group__0 ) ) ;
    public final void ruleMoveAnySlotS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:505:2: ( ( ( rule__MoveAnySlotS__Group__0 ) ) )
            // InternalShortDSLParser.g:506:2: ( ( rule__MoveAnySlotS__Group__0 ) )
            {
            // InternalShortDSLParser.g:506:2: ( ( rule__MoveAnySlotS__Group__0 ) )
            // InternalShortDSLParser.g:507:3: ( rule__MoveAnySlotS__Group__0 )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getGroup()); 
            // InternalShortDSLParser.g:508:3: ( rule__MoveAnySlotS__Group__0 )
            // InternalShortDSLParser.g:508:4: rule__MoveAnySlotS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveAnySlotS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAnySlotSAccess().getGroup()); 

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
    // $ANTLR end "ruleMoveAnySlotS"


    // $ANTLR start "entryRuleMoveCraneS"
    // InternalShortDSLParser.g:517:1: entryRuleMoveCraneS : ruleMoveCraneS EOF ;
    public final void entryRuleMoveCraneS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:518:1: ( ruleMoveCraneS EOF )
            // InternalShortDSLParser.g:519:1: ruleMoveCraneS EOF
            {
             before(grammarAccess.getMoveCraneSRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveCraneS();

            state._fsp--;

             after(grammarAccess.getMoveCraneSRule()); 
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
    // $ANTLR end "entryRuleMoveCraneS"


    // $ANTLR start "ruleMoveCraneS"
    // InternalShortDSLParser.g:526:1: ruleMoveCraneS : ( ( rule__MoveCraneS__Group__0 ) ) ;
    public final void ruleMoveCraneS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:530:2: ( ( ( rule__MoveCraneS__Group__0 ) ) )
            // InternalShortDSLParser.g:531:2: ( ( rule__MoveCraneS__Group__0 ) )
            {
            // InternalShortDSLParser.g:531:2: ( ( rule__MoveCraneS__Group__0 ) )
            // InternalShortDSLParser.g:532:3: ( rule__MoveCraneS__Group__0 )
            {
             before(grammarAccess.getMoveCraneSAccess().getGroup()); 
            // InternalShortDSLParser.g:533:3: ( rule__MoveCraneS__Group__0 )
            // InternalShortDSLParser.g:533:4: rule__MoveCraneS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveCraneS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveCraneSAccess().getGroup()); 

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
    // $ANTLR end "ruleMoveCraneS"


    // $ANTLR start "entryRuleCraneActionS"
    // InternalShortDSLParser.g:542:1: entryRuleCraneActionS : ruleCraneActionS EOF ;
    public final void entryRuleCraneActionS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:543:1: ( ruleCraneActionS EOF )
            // InternalShortDSLParser.g:544:1: ruleCraneActionS EOF
            {
             before(grammarAccess.getCraneActionSRule()); 
            pushFollow(FOLLOW_1);
            ruleCraneActionS();

            state._fsp--;

             after(grammarAccess.getCraneActionSRule()); 
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
    // $ANTLR end "entryRuleCraneActionS"


    // $ANTLR start "ruleCraneActionS"
    // InternalShortDSLParser.g:551:1: ruleCraneActionS : ( ( rule__CraneActionS__Group__0 ) ) ;
    public final void ruleCraneActionS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:555:2: ( ( ( rule__CraneActionS__Group__0 ) ) )
            // InternalShortDSLParser.g:556:2: ( ( rule__CraneActionS__Group__0 ) )
            {
            // InternalShortDSLParser.g:556:2: ( ( rule__CraneActionS__Group__0 ) )
            // InternalShortDSLParser.g:557:3: ( rule__CraneActionS__Group__0 )
            {
             before(grammarAccess.getCraneActionSAccess().getGroup()); 
            // InternalShortDSLParser.g:558:3: ( rule__CraneActionS__Group__0 )
            // InternalShortDSLParser.g:558:4: rule__CraneActionS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CraneActionS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCraneActionSAccess().getGroup()); 

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
    // $ANTLR end "ruleCraneActionS"


    // $ANTLR start "entryRuleConditionS"
    // InternalShortDSLParser.g:567:1: entryRuleConditionS : ruleConditionS EOF ;
    public final void entryRuleConditionS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:568:1: ( ruleConditionS EOF )
            // InternalShortDSLParser.g:569:1: ruleConditionS EOF
            {
             before(grammarAccess.getConditionSRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionS();

            state._fsp--;

             after(grammarAccess.getConditionSRule()); 
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
    // $ANTLR end "entryRuleConditionS"


    // $ANTLR start "ruleConditionS"
    // InternalShortDSLParser.g:576:1: ruleConditionS : ( ( rule__ConditionS__Alternatives ) ) ;
    public final void ruleConditionS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:580:2: ( ( ( rule__ConditionS__Alternatives ) ) )
            // InternalShortDSLParser.g:581:2: ( ( rule__ConditionS__Alternatives ) )
            {
            // InternalShortDSLParser.g:581:2: ( ( rule__ConditionS__Alternatives ) )
            // InternalShortDSLParser.g:582:3: ( rule__ConditionS__Alternatives )
            {
             before(grammarAccess.getConditionSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:583:3: ( rule__ConditionS__Alternatives )
            // InternalShortDSLParser.g:583:4: rule__ConditionS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConditionS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionSAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConditionS"


    // $ANTLR start "entryRuleConditionVariableS"
    // InternalShortDSLParser.g:592:1: entryRuleConditionVariableS : ruleConditionVariableS EOF ;
    public final void entryRuleConditionVariableS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:593:1: ( ruleConditionVariableS EOF )
            // InternalShortDSLParser.g:594:1: ruleConditionVariableS EOF
            {
             before(grammarAccess.getConditionVariableSRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionVariableS();

            state._fsp--;

             after(grammarAccess.getConditionVariableSRule()); 
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
    // $ANTLR end "entryRuleConditionVariableS"


    // $ANTLR start "ruleConditionVariableS"
    // InternalShortDSLParser.g:601:1: ruleConditionVariableS : ( ( rule__ConditionVariableS__Group__0 ) ) ;
    public final void ruleConditionVariableS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:605:2: ( ( ( rule__ConditionVariableS__Group__0 ) ) )
            // InternalShortDSLParser.g:606:2: ( ( rule__ConditionVariableS__Group__0 ) )
            {
            // InternalShortDSLParser.g:606:2: ( ( rule__ConditionVariableS__Group__0 ) )
            // InternalShortDSLParser.g:607:3: ( rule__ConditionVariableS__Group__0 )
            {
             before(grammarAccess.getConditionVariableSAccess().getGroup()); 
            // InternalShortDSLParser.g:608:3: ( rule__ConditionVariableS__Group__0 )
            // InternalShortDSLParser.g:608:4: rule__ConditionVariableS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionVariableS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionVariableSAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionVariableS"


    // $ANTLR start "entryRuleConditionDeviceS"
    // InternalShortDSLParser.g:617:1: entryRuleConditionDeviceS : ruleConditionDeviceS EOF ;
    public final void entryRuleConditionDeviceS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:618:1: ( ruleConditionDeviceS EOF )
            // InternalShortDSLParser.g:619:1: ruleConditionDeviceS EOF
            {
             before(grammarAccess.getConditionDeviceSRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionDeviceS();

            state._fsp--;

             after(grammarAccess.getConditionDeviceSRule()); 
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
    // $ANTLR end "entryRuleConditionDeviceS"


    // $ANTLR start "ruleConditionDeviceS"
    // InternalShortDSLParser.g:626:1: ruleConditionDeviceS : ( ( rule__ConditionDeviceS__Group__0 ) ) ;
    public final void ruleConditionDeviceS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:630:2: ( ( ( rule__ConditionDeviceS__Group__0 ) ) )
            // InternalShortDSLParser.g:631:2: ( ( rule__ConditionDeviceS__Group__0 ) )
            {
            // InternalShortDSLParser.g:631:2: ( ( rule__ConditionDeviceS__Group__0 ) )
            // InternalShortDSLParser.g:632:3: ( rule__ConditionDeviceS__Group__0 )
            {
             before(grammarAccess.getConditionDeviceSAccess().getGroup()); 
            // InternalShortDSLParser.g:633:3: ( rule__ConditionDeviceS__Group__0 )
            // InternalShortDSLParser.g:633:4: rule__ConditionDeviceS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionDeviceSAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionDeviceS"


    // $ANTLR start "entryRuleMarkS"
    // InternalShortDSLParser.g:642:1: entryRuleMarkS : ruleMarkS EOF ;
    public final void entryRuleMarkS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:643:1: ( ruleMarkS EOF )
            // InternalShortDSLParser.g:644:1: ruleMarkS EOF
            {
             before(grammarAccess.getMarkSRule()); 
            pushFollow(FOLLOW_1);
            ruleMarkS();

            state._fsp--;

             after(grammarAccess.getMarkSRule()); 
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
    // $ANTLR end "entryRuleMarkS"


    // $ANTLR start "ruleMarkS"
    // InternalShortDSLParser.g:651:1: ruleMarkS : ( ( rule__MarkS__Alternatives ) ) ;
    public final void ruleMarkS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:655:2: ( ( ( rule__MarkS__Alternatives ) ) )
            // InternalShortDSLParser.g:656:2: ( ( rule__MarkS__Alternatives ) )
            {
            // InternalShortDSLParser.g:656:2: ( ( rule__MarkS__Alternatives ) )
            // InternalShortDSLParser.g:657:3: ( rule__MarkS__Alternatives )
            {
             before(grammarAccess.getMarkSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:658:3: ( rule__MarkS__Alternatives )
            // InternalShortDSLParser.g:658:4: rule__MarkS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MarkS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMarkSAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMarkS"


    // $ANTLR start "entryRuleMarkVariableValueS"
    // InternalShortDSLParser.g:667:1: entryRuleMarkVariableValueS : ruleMarkVariableValueS EOF ;
    public final void entryRuleMarkVariableValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:668:1: ( ruleMarkVariableValueS EOF )
            // InternalShortDSLParser.g:669:1: ruleMarkVariableValueS EOF
            {
             before(grammarAccess.getMarkVariableValueSRule()); 
            pushFollow(FOLLOW_1);
            ruleMarkVariableValueS();

            state._fsp--;

             after(grammarAccess.getMarkVariableValueSRule()); 
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
    // $ANTLR end "entryRuleMarkVariableValueS"


    // $ANTLR start "ruleMarkVariableValueS"
    // InternalShortDSLParser.g:676:1: ruleMarkVariableValueS : ( ( rule__MarkVariableValueS__Group__0 ) ) ;
    public final void ruleMarkVariableValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:680:2: ( ( ( rule__MarkVariableValueS__Group__0 ) ) )
            // InternalShortDSLParser.g:681:2: ( ( rule__MarkVariableValueS__Group__0 ) )
            {
            // InternalShortDSLParser.g:681:2: ( ( rule__MarkVariableValueS__Group__0 ) )
            // InternalShortDSLParser.g:682:3: ( rule__MarkVariableValueS__Group__0 )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getGroup()); 
            // InternalShortDSLParser.g:683:3: ( rule__MarkVariableValueS__Group__0 )
            // InternalShortDSLParser.g:683:4: rule__MarkVariableValueS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MarkVariableValueS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMarkVariableValueSAccess().getGroup()); 

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
    // $ANTLR end "ruleMarkVariableValueS"


    // $ANTLR start "entryRuleMarkCameraValueS"
    // InternalShortDSLParser.g:692:1: entryRuleMarkCameraValueS : ruleMarkCameraValueS EOF ;
    public final void entryRuleMarkCameraValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:693:1: ( ruleMarkCameraValueS EOF )
            // InternalShortDSLParser.g:694:1: ruleMarkCameraValueS EOF
            {
             before(grammarAccess.getMarkCameraValueSRule()); 
            pushFollow(FOLLOW_1);
            ruleMarkCameraValueS();

            state._fsp--;

             after(grammarAccess.getMarkCameraValueSRule()); 
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
    // $ANTLR end "entryRuleMarkCameraValueS"


    // $ANTLR start "ruleMarkCameraValueS"
    // InternalShortDSLParser.g:701:1: ruleMarkCameraValueS : ( ( rule__MarkCameraValueS__Group__0 ) ) ;
    public final void ruleMarkCameraValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:705:2: ( ( ( rule__MarkCameraValueS__Group__0 ) ) )
            // InternalShortDSLParser.g:706:2: ( ( rule__MarkCameraValueS__Group__0 ) )
            {
            // InternalShortDSLParser.g:706:2: ( ( rule__MarkCameraValueS__Group__0 ) )
            // InternalShortDSLParser.g:707:3: ( rule__MarkCameraValueS__Group__0 )
            {
             before(grammarAccess.getMarkCameraValueSAccess().getGroup()); 
            // InternalShortDSLParser.g:708:3: ( rule__MarkCameraValueS__Group__0 )
            // InternalShortDSLParser.g:708:4: rule__MarkCameraValueS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MarkCameraValueS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMarkCameraValueSAccess().getGroup()); 

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
    // $ANTLR end "ruleMarkCameraValueS"


    // $ANTLR start "entryRuleLocalVariableS"
    // InternalShortDSLParser.g:717:1: entryRuleLocalVariableS : ruleLocalVariableS EOF ;
    public final void entryRuleLocalVariableS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:718:1: ( ruleLocalVariableS EOF )
            // InternalShortDSLParser.g:719:1: ruleLocalVariableS EOF
            {
             before(grammarAccess.getLocalVariableSRule()); 
            pushFollow(FOLLOW_1);
            ruleLocalVariableS();

            state._fsp--;

             after(grammarAccess.getLocalVariableSRule()); 
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
    // $ANTLR end "entryRuleLocalVariableS"


    // $ANTLR start "ruleLocalVariableS"
    // InternalShortDSLParser.g:726:1: ruleLocalVariableS : ( ( rule__LocalVariableS__Group__0 ) ) ;
    public final void ruleLocalVariableS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:730:2: ( ( ( rule__LocalVariableS__Group__0 ) ) )
            // InternalShortDSLParser.g:731:2: ( ( rule__LocalVariableS__Group__0 ) )
            {
            // InternalShortDSLParser.g:731:2: ( ( rule__LocalVariableS__Group__0 ) )
            // InternalShortDSLParser.g:732:3: ( rule__LocalVariableS__Group__0 )
            {
             before(grammarAccess.getLocalVariableSAccess().getGroup()); 
            // InternalShortDSLParser.g:733:3: ( rule__LocalVariableS__Group__0 )
            // InternalShortDSLParser.g:733:4: rule__LocalVariableS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalVariableS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalVariableSAccess().getGroup()); 

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
    // $ANTLR end "ruleLocalVariableS"


    // $ANTLR start "entryRuleGlobalVariableS"
    // InternalShortDSLParser.g:742:1: entryRuleGlobalVariableS : ruleGlobalVariableS EOF ;
    public final void entryRuleGlobalVariableS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:743:1: ( ruleGlobalVariableS EOF )
            // InternalShortDSLParser.g:744:1: ruleGlobalVariableS EOF
            {
             before(grammarAccess.getGlobalVariableSRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalVariableS();

            state._fsp--;

             after(grammarAccess.getGlobalVariableSRule()); 
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
    // $ANTLR end "entryRuleGlobalVariableS"


    // $ANTLR start "ruleGlobalVariableS"
    // InternalShortDSLParser.g:751:1: ruleGlobalVariableS : ( ( rule__GlobalVariableS__Group__0 ) ) ;
    public final void ruleGlobalVariableS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:755:2: ( ( ( rule__GlobalVariableS__Group__0 ) ) )
            // InternalShortDSLParser.g:756:2: ( ( rule__GlobalVariableS__Group__0 ) )
            {
            // InternalShortDSLParser.g:756:2: ( ( rule__GlobalVariableS__Group__0 ) )
            // InternalShortDSLParser.g:757:3: ( rule__GlobalVariableS__Group__0 )
            {
             before(grammarAccess.getGlobalVariableSAccess().getGroup()); 
            // InternalShortDSLParser.g:758:3: ( rule__GlobalVariableS__Group__0 )
            // InternalShortDSLParser.g:758:4: rule__GlobalVariableS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalVariableS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalVariableSAccess().getGroup()); 

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
    // $ANTLR end "ruleGlobalVariableS"


    // $ANTLR start "entryRuleVariableValue"
    // InternalShortDSLParser.g:767:1: entryRuleVariableValue : ruleVariableValue EOF ;
    public final void entryRuleVariableValue() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:768:1: ( ruleVariableValue EOF )
            // InternalShortDSLParser.g:769:1: ruleVariableValue EOF
            {
             before(grammarAccess.getVariableValueRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableValue();

            state._fsp--;

             after(grammarAccess.getVariableValueRule()); 
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
    // $ANTLR end "entryRuleVariableValue"


    // $ANTLR start "ruleVariableValue"
    // InternalShortDSLParser.g:776:1: ruleVariableValue : ( ( rule__VariableValue__Alternatives ) ) ;
    public final void ruleVariableValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:780:2: ( ( ( rule__VariableValue__Alternatives ) ) )
            // InternalShortDSLParser.g:781:2: ( ( rule__VariableValue__Alternatives ) )
            {
            // InternalShortDSLParser.g:781:2: ( ( rule__VariableValue__Alternatives ) )
            // InternalShortDSLParser.g:782:3: ( rule__VariableValue__Alternatives )
            {
             before(grammarAccess.getVariableValueAccess().getAlternatives()); 
            // InternalShortDSLParser.g:783:3: ( rule__VariableValue__Alternatives )
            // InternalShortDSLParser.g:783:4: rule__VariableValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVariableValue"


    // $ANTLR start "entryRuleDeviceValue"
    // InternalShortDSLParser.g:792:1: entryRuleDeviceValue : ruleDeviceValue EOF ;
    public final void entryRuleDeviceValue() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:793:1: ( ruleDeviceValue EOF )
            // InternalShortDSLParser.g:794:1: ruleDeviceValue EOF
            {
             before(grammarAccess.getDeviceValueRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceValue();

            state._fsp--;

             after(grammarAccess.getDeviceValueRule()); 
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
    // $ANTLR end "entryRuleDeviceValue"


    // $ANTLR start "ruleDeviceValue"
    // InternalShortDSLParser.g:801:1: ruleDeviceValue : ( ( rule__DeviceValue__Alternatives ) ) ;
    public final void ruleDeviceValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:805:2: ( ( ( rule__DeviceValue__Alternatives ) ) )
            // InternalShortDSLParser.g:806:2: ( ( rule__DeviceValue__Alternatives ) )
            {
            // InternalShortDSLParser.g:806:2: ( ( rule__DeviceValue__Alternatives ) )
            // InternalShortDSLParser.g:807:3: ( rule__DeviceValue__Alternatives )
            {
             before(grammarAccess.getDeviceValueAccess().getAlternatives()); 
            // InternalShortDSLParser.g:808:3: ( rule__DeviceValue__Alternatives )
            // InternalShortDSLParser.g:808:4: rule__DeviceValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DeviceValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeviceValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDeviceValue"


    // $ANTLR start "entryRuleValueSlot"
    // InternalShortDSLParser.g:817:1: entryRuleValueSlot : ruleValueSlot EOF ;
    public final void entryRuleValueSlot() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:818:1: ( ruleValueSlot EOF )
            // InternalShortDSLParser.g:819:1: ruleValueSlot EOF
            {
             before(grammarAccess.getValueSlotRule()); 
            pushFollow(FOLLOW_1);
            ruleValueSlot();

            state._fsp--;

             after(grammarAccess.getValueSlotRule()); 
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
    // $ANTLR end "entryRuleValueSlot"


    // $ANTLR start "ruleValueSlot"
    // InternalShortDSLParser.g:826:1: ruleValueSlot : ( ( rule__ValueSlot__Alternatives ) ) ;
    public final void ruleValueSlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:830:2: ( ( ( rule__ValueSlot__Alternatives ) ) )
            // InternalShortDSLParser.g:831:2: ( ( rule__ValueSlot__Alternatives ) )
            {
            // InternalShortDSLParser.g:831:2: ( ( rule__ValueSlot__Alternatives ) )
            // InternalShortDSLParser.g:832:3: ( rule__ValueSlot__Alternatives )
            {
             before(grammarAccess.getValueSlotAccess().getAlternatives()); 
            // InternalShortDSLParser.g:833:3: ( rule__ValueSlot__Alternatives )
            // InternalShortDSLParser.g:833:4: rule__ValueSlot__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValueSlot__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueSlotAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValueSlot"


    // $ANTLR start "entryRuleDiskStateValueS"
    // InternalShortDSLParser.g:842:1: entryRuleDiskStateValueS : ruleDiskStateValueS EOF ;
    public final void entryRuleDiskStateValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:843:1: ( ruleDiskStateValueS EOF )
            // InternalShortDSLParser.g:844:1: ruleDiskStateValueS EOF
            {
             before(grammarAccess.getDiskStateValueSRule()); 
            pushFollow(FOLLOW_1);
            ruleDiskStateValueS();

            state._fsp--;

             after(grammarAccess.getDiskStateValueSRule()); 
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
    // $ANTLR end "entryRuleDiskStateValueS"


    // $ANTLR start "ruleDiskStateValueS"
    // InternalShortDSLParser.g:851:1: ruleDiskStateValueS : ( ( rule__DiskStateValueS__ValueAssignment ) ) ;
    public final void ruleDiskStateValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:855:2: ( ( ( rule__DiskStateValueS__ValueAssignment ) ) )
            // InternalShortDSLParser.g:856:2: ( ( rule__DiskStateValueS__ValueAssignment ) )
            {
            // InternalShortDSLParser.g:856:2: ( ( rule__DiskStateValueS__ValueAssignment ) )
            // InternalShortDSLParser.g:857:3: ( rule__DiskStateValueS__ValueAssignment )
            {
             before(grammarAccess.getDiskStateValueSAccess().getValueAssignment()); 
            // InternalShortDSLParser.g:858:3: ( rule__DiskStateValueS__ValueAssignment )
            // InternalShortDSLParser.g:858:4: rule__DiskStateValueS__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DiskStateValueS__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDiskStateValueSAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleDiskStateValueS"


    // $ANTLR start "entryRuleDiskSlotStateValueS"
    // InternalShortDSLParser.g:867:1: entryRuleDiskSlotStateValueS : ruleDiskSlotStateValueS EOF ;
    public final void entryRuleDiskSlotStateValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:868:1: ( ruleDiskSlotStateValueS EOF )
            // InternalShortDSLParser.g:869:1: ruleDiskSlotStateValueS EOF
            {
             before(grammarAccess.getDiskSlotStateValueSRule()); 
            pushFollow(FOLLOW_1);
            ruleDiskSlotStateValueS();

            state._fsp--;

             after(grammarAccess.getDiskSlotStateValueSRule()); 
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
    // $ANTLR end "entryRuleDiskSlotStateValueS"


    // $ANTLR start "ruleDiskSlotStateValueS"
    // InternalShortDSLParser.g:876:1: ruleDiskSlotStateValueS : ( ( rule__DiskSlotStateValueS__ValueAssignment ) ) ;
    public final void ruleDiskSlotStateValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:880:2: ( ( ( rule__DiskSlotStateValueS__ValueAssignment ) ) )
            // InternalShortDSLParser.g:881:2: ( ( rule__DiskSlotStateValueS__ValueAssignment ) )
            {
            // InternalShortDSLParser.g:881:2: ( ( rule__DiskSlotStateValueS__ValueAssignment ) )
            // InternalShortDSLParser.g:882:3: ( rule__DiskSlotStateValueS__ValueAssignment )
            {
             before(grammarAccess.getDiskSlotStateValueSAccess().getValueAssignment()); 
            // InternalShortDSLParser.g:883:3: ( rule__DiskSlotStateValueS__ValueAssignment )
            // InternalShortDSLParser.g:883:4: rule__DiskSlotStateValueS__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DiskSlotStateValueS__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDiskSlotStateValueSAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleDiskSlotStateValueS"


    // $ANTLR start "entryRuleColorValueS"
    // InternalShortDSLParser.g:892:1: entryRuleColorValueS : ruleColorValueS EOF ;
    public final void entryRuleColorValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:893:1: ( ruleColorValueS EOF )
            // InternalShortDSLParser.g:894:1: ruleColorValueS EOF
            {
             before(grammarAccess.getColorValueSRule()); 
            pushFollow(FOLLOW_1);
            ruleColorValueS();

            state._fsp--;

             after(grammarAccess.getColorValueSRule()); 
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
    // $ANTLR end "entryRuleColorValueS"


    // $ANTLR start "ruleColorValueS"
    // InternalShortDSLParser.g:901:1: ruleColorValueS : ( ( rule__ColorValueS__ValueAssignment ) ) ;
    public final void ruleColorValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:905:2: ( ( ( rule__ColorValueS__ValueAssignment ) ) )
            // InternalShortDSLParser.g:906:2: ( ( rule__ColorValueS__ValueAssignment ) )
            {
            // InternalShortDSLParser.g:906:2: ( ( rule__ColorValueS__ValueAssignment ) )
            // InternalShortDSLParser.g:907:3: ( rule__ColorValueS__ValueAssignment )
            {
             before(grammarAccess.getColorValueSAccess().getValueAssignment()); 
            // InternalShortDSLParser.g:908:3: ( rule__ColorValueS__ValueAssignment )
            // InternalShortDSLParser.g:908:4: rule__ColorValueS__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ColorValueS__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColorValueSAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleColorValueS"


    // $ANTLR start "entryRuleNumberS"
    // InternalShortDSLParser.g:917:1: entryRuleNumberS : ruleNumberS EOF ;
    public final void entryRuleNumberS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:918:1: ( ruleNumberS EOF )
            // InternalShortDSLParser.g:919:1: ruleNumberS EOF
            {
             before(grammarAccess.getNumberSRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberS();

            state._fsp--;

             after(grammarAccess.getNumberSRule()); 
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
    // $ANTLR end "entryRuleNumberS"


    // $ANTLR start "ruleNumberS"
    // InternalShortDSLParser.g:926:1: ruleNumberS : ( ( rule__NumberS__ValueAssignment ) ) ;
    public final void ruleNumberS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:930:2: ( ( ( rule__NumberS__ValueAssignment ) ) )
            // InternalShortDSLParser.g:931:2: ( ( rule__NumberS__ValueAssignment ) )
            {
            // InternalShortDSLParser.g:931:2: ( ( rule__NumberS__ValueAssignment ) )
            // InternalShortDSLParser.g:932:3: ( rule__NumberS__ValueAssignment )
            {
             before(grammarAccess.getNumberSAccess().getValueAssignment()); 
            // InternalShortDSLParser.g:933:3: ( rule__NumberS__ValueAssignment )
            // InternalShortDSLParser.g:933:4: rule__NumberS__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberS__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberSAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleNumberS"


    // $ANTLR start "ruleCOMPARISON_OPERATOR_S"
    // InternalShortDSLParser.g:942:1: ruleCOMPARISON_OPERATOR_S : ( ( rule__COMPARISON_OPERATOR_S__Alternatives ) ) ;
    public final void ruleCOMPARISON_OPERATOR_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:946:1: ( ( ( rule__COMPARISON_OPERATOR_S__Alternatives ) ) )
            // InternalShortDSLParser.g:947:2: ( ( rule__COMPARISON_OPERATOR_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:947:2: ( ( rule__COMPARISON_OPERATOR_S__Alternatives ) )
            // InternalShortDSLParser.g:948:3: ( rule__COMPARISON_OPERATOR_S__Alternatives )
            {
             before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:949:3: ( rule__COMPARISON_OPERATOR_S__Alternatives )
            // InternalShortDSLParser.g:949:4: rule__COMPARISON_OPERATOR_S__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__COMPARISON_OPERATOR_S__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCOMPARISON_OPERATOR_S"


    // $ANTLR start "ruleCOLOR_S"
    // InternalShortDSLParser.g:958:1: ruleCOLOR_S : ( ( rule__COLOR_S__Alternatives ) ) ;
    public final void ruleCOLOR_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:962:1: ( ( ( rule__COLOR_S__Alternatives ) ) )
            // InternalShortDSLParser.g:963:2: ( ( rule__COLOR_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:963:2: ( ( rule__COLOR_S__Alternatives ) )
            // InternalShortDSLParser.g:964:3: ( rule__COLOR_S__Alternatives )
            {
             before(grammarAccess.getCOLOR_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:965:3: ( rule__COLOR_S__Alternatives )
            // InternalShortDSLParser.g:965:4: rule__COLOR_S__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__COLOR_S__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCOLOR_SAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCOLOR_S"


    // $ANTLR start "ruleDISK_SLOT_STATES_S"
    // InternalShortDSLParser.g:974:1: ruleDISK_SLOT_STATES_S : ( ( rule__DISK_SLOT_STATES_S__Alternatives ) ) ;
    public final void ruleDISK_SLOT_STATES_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:978:1: ( ( ( rule__DISK_SLOT_STATES_S__Alternatives ) ) )
            // InternalShortDSLParser.g:979:2: ( ( rule__DISK_SLOT_STATES_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:979:2: ( ( rule__DISK_SLOT_STATES_S__Alternatives ) )
            // InternalShortDSLParser.g:980:3: ( rule__DISK_SLOT_STATES_S__Alternatives )
            {
             before(grammarAccess.getDISK_SLOT_STATES_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:981:3: ( rule__DISK_SLOT_STATES_S__Alternatives )
            // InternalShortDSLParser.g:981:4: rule__DISK_SLOT_STATES_S__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DISK_SLOT_STATES_S__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDISK_SLOT_STATES_SAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDISK_SLOT_STATES_S"


    // $ANTLR start "ruleDISK_STATES_S"
    // InternalShortDSLParser.g:990:1: ruleDISK_STATES_S : ( ( rule__DISK_STATES_S__Alternatives ) ) ;
    public final void ruleDISK_STATES_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:994:1: ( ( ( rule__DISK_STATES_S__Alternatives ) ) )
            // InternalShortDSLParser.g:995:2: ( ( rule__DISK_STATES_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:995:2: ( ( rule__DISK_STATES_S__Alternatives ) )
            // InternalShortDSLParser.g:996:3: ( rule__DISK_STATES_S__Alternatives )
            {
             before(grammarAccess.getDISK_STATES_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:997:3: ( rule__DISK_STATES_S__Alternatives )
            // InternalShortDSLParser.g:997:4: rule__DISK_STATES_S__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DISK_STATES_S__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDISK_STATES_SAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDISK_STATES_S"


    // $ANTLR start "ruleTIME_UNIT"
    // InternalShortDSLParser.g:1006:1: ruleTIME_UNIT : ( ( rule__TIME_UNIT__Alternatives ) ) ;
    public final void ruleTIME_UNIT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1010:1: ( ( ( rule__TIME_UNIT__Alternatives ) ) )
            // InternalShortDSLParser.g:1011:2: ( ( rule__TIME_UNIT__Alternatives ) )
            {
            // InternalShortDSLParser.g:1011:2: ( ( rule__TIME_UNIT__Alternatives ) )
            // InternalShortDSLParser.g:1012:3: ( rule__TIME_UNIT__Alternatives )
            {
             before(grammarAccess.getTIME_UNITAccess().getAlternatives()); 
            // InternalShortDSLParser.g:1013:3: ( rule__TIME_UNIT__Alternatives )
            // InternalShortDSLParser.g:1013:4: rule__TIME_UNIT__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TIME_UNIT__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTIME_UNITAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTIME_UNIT"


    // $ANTLR start "rule__Model__Alternatives_1"
    // InternalShortDSLParser.g:1021:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__Group_1_0__0 ) ) | ( ( rule__Model__Group_1_1__0 ) ) );
    public final void rule__Model__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1025:1: ( ( ( rule__Model__Group_1_0__0 ) ) | ( ( rule__Model__Group_1_1__0 ) ) )
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
                    // InternalShortDSLParser.g:1026:2: ( ( rule__Model__Group_1_0__0 ) )
                    {
                    // InternalShortDSLParser.g:1026:2: ( ( rule__Model__Group_1_0__0 ) )
                    // InternalShortDSLParser.g:1027:3: ( rule__Model__Group_1_0__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_1_0()); 
                    // InternalShortDSLParser.g:1028:3: ( rule__Model__Group_1_0__0 )
                    // InternalShortDSLParser.g:1028:4: rule__Model__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1032:2: ( ( rule__Model__Group_1_1__0 ) )
                    {
                    // InternalShortDSLParser.g:1032:2: ( ( rule__Model__Group_1_1__0 ) )
                    // InternalShortDSLParser.g:1033:3: ( rule__Model__Group_1_1__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_1_1()); 
                    // InternalShortDSLParser.g:1034:3: ( rule__Model__Group_1_1__0 )
                    // InternalShortDSLParser.g:1034:4: rule__Model__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Model__Alternatives_1"


    // $ANTLR start "rule__DeviceS__Alternatives"
    // InternalShortDSLParser.g:1042:1: rule__DeviceS__Alternatives : ( ( ruleCraneS ) | ( ruleDiskS ) | ( ruleCameraS ) );
    public final void rule__DeviceS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1046:1: ( ( ruleCraneS ) | ( ruleDiskS ) | ( ruleCameraS ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==Colon) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==RULE_BEGIN) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==Green||LA2_4==Blue||LA2_4==Red) ) {
                            alt2=3;
                        }
                        else if ( (LA2_4==RULE_ID) ) {
                            alt2=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_1==LeftParenthesis) ) {
                    alt2=2;
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
                    // InternalShortDSLParser.g:1047:2: ( ruleCraneS )
                    {
                    // InternalShortDSLParser.g:1047:2: ( ruleCraneS )
                    // InternalShortDSLParser.g:1048:3: ruleCraneS
                    {
                     before(grammarAccess.getDeviceSAccess().getCraneSParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCraneS();

                    state._fsp--;

                     after(grammarAccess.getDeviceSAccess().getCraneSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1053:2: ( ruleDiskS )
                    {
                    // InternalShortDSLParser.g:1053:2: ( ruleDiskS )
                    // InternalShortDSLParser.g:1054:3: ruleDiskS
                    {
                     before(grammarAccess.getDeviceSAccess().getDiskSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDiskS();

                    state._fsp--;

                     after(grammarAccess.getDeviceSAccess().getDiskSParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1059:2: ( ruleCameraS )
                    {
                    // InternalShortDSLParser.g:1059:2: ( ruleCameraS )
                    // InternalShortDSLParser.g:1060:3: ruleCameraS
                    {
                     before(grammarAccess.getDeviceSAccess().getCameraSParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCameraS();

                    state._fsp--;

                     after(grammarAccess.getDeviceSAccess().getCameraSParserRuleCall_2()); 

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
    // $ANTLR end "rule__DeviceS__Alternatives"


    // $ANTLR start "rule__StatementS__Alternatives"
    // InternalShortDSLParser.g:1069:1: rule__StatementS__Alternatives : ( ( ruleLoopS ) | ( ruleMoveS ) | ( ruleCraneActionS ) | ( ruleConditionS ) | ( ruleMarkS ) );
    public final void rule__StatementS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1073:1: ( ( ruleLoopS ) | ( ruleMoveS ) | ( ruleCraneActionS ) | ( ruleConditionS ) | ( ruleMarkS ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case Foreach:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==Pickup||LA3_2==Drop||LA3_2==HyphenMinusHyphenMinusGreaterThanSign||LA3_2==HyphenMinusGreaterThanSign) ) {
                    alt3=2;
                }
                else if ( (LA3_2==Scan||LA3_2==LeftParenthesis) ) {
                    alt3=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case In_progress:
            case Complete:
            case Vacant:
                {
                alt3=2;
                }
                break;
            case Pickup:
            case Drop:
                {
                alt3=3;
                }
                break;
            case If:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalShortDSLParser.g:1074:2: ( ruleLoopS )
                    {
                    // InternalShortDSLParser.g:1074:2: ( ruleLoopS )
                    // InternalShortDSLParser.g:1075:3: ruleLoopS
                    {
                     before(grammarAccess.getStatementSAccess().getLoopSParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLoopS();

                    state._fsp--;

                     after(grammarAccess.getStatementSAccess().getLoopSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1080:2: ( ruleMoveS )
                    {
                    // InternalShortDSLParser.g:1080:2: ( ruleMoveS )
                    // InternalShortDSLParser.g:1081:3: ruleMoveS
                    {
                     before(grammarAccess.getStatementSAccess().getMoveSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveS();

                    state._fsp--;

                     after(grammarAccess.getStatementSAccess().getMoveSParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1086:2: ( ruleCraneActionS )
                    {
                    // InternalShortDSLParser.g:1086:2: ( ruleCraneActionS )
                    // InternalShortDSLParser.g:1087:3: ruleCraneActionS
                    {
                     before(grammarAccess.getStatementSAccess().getCraneActionSParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCraneActionS();

                    state._fsp--;

                     after(grammarAccess.getStatementSAccess().getCraneActionSParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalShortDSLParser.g:1092:2: ( ruleConditionS )
                    {
                    // InternalShortDSLParser.g:1092:2: ( ruleConditionS )
                    // InternalShortDSLParser.g:1093:3: ruleConditionS
                    {
                     before(grammarAccess.getStatementSAccess().getConditionSParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleConditionS();

                    state._fsp--;

                     after(grammarAccess.getStatementSAccess().getConditionSParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalShortDSLParser.g:1098:2: ( ruleMarkS )
                    {
                    // InternalShortDSLParser.g:1098:2: ( ruleMarkS )
                    // InternalShortDSLParser.g:1099:3: ruleMarkS
                    {
                     before(grammarAccess.getStatementSAccess().getMarkSParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMarkS();

                    state._fsp--;

                     after(grammarAccess.getStatementSAccess().getMarkSParserRuleCall_4()); 

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
    // $ANTLR end "rule__StatementS__Alternatives"


    // $ANTLR start "rule__MoveS__Alternatives"
    // InternalShortDSLParser.g:1108:1: rule__MoveS__Alternatives : ( ( ruleMoveDiskS ) | ( ruleMoveAnySlotS ) | ( ruleMoveCraneS ) );
    public final void rule__MoveS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1112:1: ( ( ruleMoveDiskS ) | ( ruleMoveAnySlotS ) | ( ruleMoveCraneS ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==Pickup||LA4_1==Drop) ) {
                    alt4=3;
                }
                else if ( (LA4_1==HyphenMinusHyphenMinusGreaterThanSign||LA4_1==HyphenMinusGreaterThanSign) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA4_0>=In_progress && LA4_0<=Complete)||LA4_0==Vacant) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalShortDSLParser.g:1113:2: ( ruleMoveDiskS )
                    {
                    // InternalShortDSLParser.g:1113:2: ( ruleMoveDiskS )
                    // InternalShortDSLParser.g:1114:3: ruleMoveDiskS
                    {
                     before(grammarAccess.getMoveSAccess().getMoveDiskSParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveDiskS();

                    state._fsp--;

                     after(grammarAccess.getMoveSAccess().getMoveDiskSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1119:2: ( ruleMoveAnySlotS )
                    {
                    // InternalShortDSLParser.g:1119:2: ( ruleMoveAnySlotS )
                    // InternalShortDSLParser.g:1120:3: ruleMoveAnySlotS
                    {
                     before(grammarAccess.getMoveSAccess().getMoveAnySlotSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveAnySlotS();

                    state._fsp--;

                     after(grammarAccess.getMoveSAccess().getMoveAnySlotSParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1125:2: ( ruleMoveCraneS )
                    {
                    // InternalShortDSLParser.g:1125:2: ( ruleMoveCraneS )
                    // InternalShortDSLParser.g:1126:3: ruleMoveCraneS
                    {
                     before(grammarAccess.getMoveSAccess().getMoveCraneSParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveCraneS();

                    state._fsp--;

                     after(grammarAccess.getMoveSAccess().getMoveCraneSParserRuleCall_2()); 

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
    // $ANTLR end "rule__MoveS__Alternatives"


    // $ANTLR start "rule__MoveDiskS__Alternatives_2"
    // InternalShortDSLParser.g:1135:1: rule__MoveDiskS__Alternatives_2 : ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) );
    public final void rule__MoveDiskS__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1139:1: ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==HyphenMinusGreaterThanSign) ) {
                alt5=1;
            }
            else if ( (LA5_0==HyphenMinusHyphenMinusGreaterThanSign) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalShortDSLParser.g:1140:2: ( HyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1140:2: ( HyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1141:3: HyphenMinusGreaterThanSign
                    {
                     before(grammarAccess.getMoveDiskSAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 
                    match(input,HyphenMinusGreaterThanSign,FOLLOW_2); 
                     after(grammarAccess.getMoveDiskSAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1146:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1146:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1147:3: HyphenMinusHyphenMinusGreaterThanSign
                    {
                     before(grammarAccess.getMoveDiskSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_2_1()); 
                    match(input,HyphenMinusHyphenMinusGreaterThanSign,FOLLOW_2); 
                     after(grammarAccess.getMoveDiskSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_2_1()); 

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
    // $ANTLR end "rule__MoveDiskS__Alternatives_2"


    // $ANTLR start "rule__MoveAnySlotS__Alternatives_3"
    // InternalShortDSLParser.g:1156:1: rule__MoveAnySlotS__Alternatives_3 : ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) );
    public final void rule__MoveAnySlotS__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1160:1: ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==HyphenMinusGreaterThanSign) ) {
                alt6=1;
            }
            else if ( (LA6_0==HyphenMinusHyphenMinusGreaterThanSign) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalShortDSLParser.g:1161:2: ( HyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1161:2: ( HyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1162:3: HyphenMinusGreaterThanSign
                    {
                     before(grammarAccess.getMoveAnySlotSAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
                    match(input,HyphenMinusGreaterThanSign,FOLLOW_2); 
                     after(grammarAccess.getMoveAnySlotSAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1167:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1167:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1168:3: HyphenMinusHyphenMinusGreaterThanSign
                    {
                     before(grammarAccess.getMoveAnySlotSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3_1()); 
                    match(input,HyphenMinusHyphenMinusGreaterThanSign,FOLLOW_2); 
                     after(grammarAccess.getMoveAnySlotSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3_1()); 

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
    // $ANTLR end "rule__MoveAnySlotS__Alternatives_3"


    // $ANTLR start "rule__MoveCraneS__Alternatives_3"
    // InternalShortDSLParser.g:1177:1: rule__MoveCraneS__Alternatives_3 : ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) );
    public final void rule__MoveCraneS__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1181:1: ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==HyphenMinusGreaterThanSign) ) {
                alt7=1;
            }
            else if ( (LA7_0==HyphenMinusHyphenMinusGreaterThanSign) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalShortDSLParser.g:1182:2: ( HyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1182:2: ( HyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1183:3: HyphenMinusGreaterThanSign
                    {
                     before(grammarAccess.getMoveCraneSAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
                    match(input,HyphenMinusGreaterThanSign,FOLLOW_2); 
                     after(grammarAccess.getMoveCraneSAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1188:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1188:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1189:3: HyphenMinusHyphenMinusGreaterThanSign
                    {
                     before(grammarAccess.getMoveCraneSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3_1()); 
                    match(input,HyphenMinusHyphenMinusGreaterThanSign,FOLLOW_2); 
                     after(grammarAccess.getMoveCraneSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3_1()); 

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
    // $ANTLR end "rule__MoveCraneS__Alternatives_3"


    // $ANTLR start "rule__CraneActionS__Alternatives_1"
    // InternalShortDSLParser.g:1198:1: rule__CraneActionS__Alternatives_1 : ( ( Pickup ) | ( Drop ) );
    public final void rule__CraneActionS__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1202:1: ( ( Pickup ) | ( Drop ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Pickup) ) {
                alt8=1;
            }
            else if ( (LA8_0==Drop) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalShortDSLParser.g:1203:2: ( Pickup )
                    {
                    // InternalShortDSLParser.g:1203:2: ( Pickup )
                    // InternalShortDSLParser.g:1204:3: Pickup
                    {
                     before(grammarAccess.getCraneActionSAccess().getPickupKeyword_1_0()); 
                    match(input,Pickup,FOLLOW_2); 
                     after(grammarAccess.getCraneActionSAccess().getPickupKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1209:2: ( Drop )
                    {
                    // InternalShortDSLParser.g:1209:2: ( Drop )
                    // InternalShortDSLParser.g:1210:3: Drop
                    {
                     before(grammarAccess.getCraneActionSAccess().getDropKeyword_1_1()); 
                    match(input,Drop,FOLLOW_2); 
                     after(grammarAccess.getCraneActionSAccess().getDropKeyword_1_1()); 

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
    // $ANTLR end "rule__CraneActionS__Alternatives_1"


    // $ANTLR start "rule__ConditionS__Alternatives"
    // InternalShortDSLParser.g:1219:1: rule__ConditionS__Alternatives : ( ( ruleConditionVariableS ) | ( ruleConditionDeviceS ) );
    public final void rule__ConditionS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1223:1: ( ( ruleConditionVariableS ) | ( ruleConditionDeviceS ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==If) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==Var) ) {
                    alt9=1;
                }
                else if ( (LA9_1==Dev) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalShortDSLParser.g:1224:2: ( ruleConditionVariableS )
                    {
                    // InternalShortDSLParser.g:1224:2: ( ruleConditionVariableS )
                    // InternalShortDSLParser.g:1225:3: ruleConditionVariableS
                    {
                     before(grammarAccess.getConditionSAccess().getConditionVariableSParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConditionVariableS();

                    state._fsp--;

                     after(grammarAccess.getConditionSAccess().getConditionVariableSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1230:2: ( ruleConditionDeviceS )
                    {
                    // InternalShortDSLParser.g:1230:2: ( ruleConditionDeviceS )
                    // InternalShortDSLParser.g:1231:3: ruleConditionDeviceS
                    {
                     before(grammarAccess.getConditionSAccess().getConditionDeviceSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConditionDeviceS();

                    state._fsp--;

                     after(grammarAccess.getConditionSAccess().getConditionDeviceSParserRuleCall_1()); 

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
    // $ANTLR end "rule__ConditionS__Alternatives"


    // $ANTLR start "rule__MarkS__Alternatives"
    // InternalShortDSLParser.g:1240:1: rule__MarkS__Alternatives : ( ( ruleMarkVariableValueS ) | ( ruleMarkCameraValueS ) );
    public final void rule__MarkS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1244:1: ( ( ruleMarkVariableValueS ) | ( ruleMarkCameraValueS ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==Scan) ) {
                    alt10=2;
                }
                else if ( (LA10_1==LeftParenthesis) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalShortDSLParser.g:1245:2: ( ruleMarkVariableValueS )
                    {
                    // InternalShortDSLParser.g:1245:2: ( ruleMarkVariableValueS )
                    // InternalShortDSLParser.g:1246:3: ruleMarkVariableValueS
                    {
                     before(grammarAccess.getMarkSAccess().getMarkVariableValueSParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMarkVariableValueS();

                    state._fsp--;

                     after(grammarAccess.getMarkSAccess().getMarkVariableValueSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1251:2: ( ruleMarkCameraValueS )
                    {
                    // InternalShortDSLParser.g:1251:2: ( ruleMarkCameraValueS )
                    // InternalShortDSLParser.g:1252:3: ruleMarkCameraValueS
                    {
                     before(grammarAccess.getMarkSAccess().getMarkCameraValueSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMarkCameraValueS();

                    state._fsp--;

                     after(grammarAccess.getMarkSAccess().getMarkCameraValueSParserRuleCall_1()); 

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
    // $ANTLR end "rule__MarkS__Alternatives"


    // $ANTLR start "rule__VariableValue__Alternatives"
    // InternalShortDSLParser.g:1261:1: rule__VariableValue__Alternatives : ( ( ( rule__VariableValue__ValueAssignment_0 ) ) | ( ( rule__VariableValue__ValueAssignment_1 ) ) | ( ( rule__VariableValue__ValueAssignment_2 ) ) | ( ( rule__VariableValue__ValueAssignment_3 ) ) | ( ( rule__VariableValue__RefAssignment_4 ) ) );
    public final void rule__VariableValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1265:1: ( ( ( rule__VariableValue__ValueAssignment_0 ) ) | ( ( rule__VariableValue__ValueAssignment_1 ) ) | ( ( rule__VariableValue__ValueAssignment_2 ) ) | ( ( rule__VariableValue__ValueAssignment_3 ) ) | ( ( rule__VariableValue__RefAssignment_4 ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case In_progress:
            case Complete:
            case Vacant:
                {
                alt11=1;
                }
                break;
            case Green:
            case Blue:
            case Red:
                {
                alt11=2;
                }
                break;
            case RULE_INT:
                {
                alt11=3;
                }
                break;
            case Empty:
            case Full:
                {
                alt11=4;
                }
                break;
            case RULE_ID:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalShortDSLParser.g:1266:2: ( ( rule__VariableValue__ValueAssignment_0 ) )
                    {
                    // InternalShortDSLParser.g:1266:2: ( ( rule__VariableValue__ValueAssignment_0 ) )
                    // InternalShortDSLParser.g:1267:3: ( rule__VariableValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getVariableValueAccess().getValueAssignment_0()); 
                    // InternalShortDSLParser.g:1268:3: ( rule__VariableValue__ValueAssignment_0 )
                    // InternalShortDSLParser.g:1268:4: rule__VariableValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableValue__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1272:2: ( ( rule__VariableValue__ValueAssignment_1 ) )
                    {
                    // InternalShortDSLParser.g:1272:2: ( ( rule__VariableValue__ValueAssignment_1 ) )
                    // InternalShortDSLParser.g:1273:3: ( rule__VariableValue__ValueAssignment_1 )
                    {
                     before(grammarAccess.getVariableValueAccess().getValueAssignment_1()); 
                    // InternalShortDSLParser.g:1274:3: ( rule__VariableValue__ValueAssignment_1 )
                    // InternalShortDSLParser.g:1274:4: rule__VariableValue__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableValue__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableValueAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1278:2: ( ( rule__VariableValue__ValueAssignment_2 ) )
                    {
                    // InternalShortDSLParser.g:1278:2: ( ( rule__VariableValue__ValueAssignment_2 ) )
                    // InternalShortDSLParser.g:1279:3: ( rule__VariableValue__ValueAssignment_2 )
                    {
                     before(grammarAccess.getVariableValueAccess().getValueAssignment_2()); 
                    // InternalShortDSLParser.g:1280:3: ( rule__VariableValue__ValueAssignment_2 )
                    // InternalShortDSLParser.g:1280:4: rule__VariableValue__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableValue__ValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableValueAccess().getValueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalShortDSLParser.g:1284:2: ( ( rule__VariableValue__ValueAssignment_3 ) )
                    {
                    // InternalShortDSLParser.g:1284:2: ( ( rule__VariableValue__ValueAssignment_3 ) )
                    // InternalShortDSLParser.g:1285:3: ( rule__VariableValue__ValueAssignment_3 )
                    {
                     before(grammarAccess.getVariableValueAccess().getValueAssignment_3()); 
                    // InternalShortDSLParser.g:1286:3: ( rule__VariableValue__ValueAssignment_3 )
                    // InternalShortDSLParser.g:1286:4: rule__VariableValue__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableValue__ValueAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableValueAccess().getValueAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalShortDSLParser.g:1290:2: ( ( rule__VariableValue__RefAssignment_4 ) )
                    {
                    // InternalShortDSLParser.g:1290:2: ( ( rule__VariableValue__RefAssignment_4 ) )
                    // InternalShortDSLParser.g:1291:3: ( rule__VariableValue__RefAssignment_4 )
                    {
                     before(grammarAccess.getVariableValueAccess().getRefAssignment_4()); 
                    // InternalShortDSLParser.g:1292:3: ( rule__VariableValue__RefAssignment_4 )
                    // InternalShortDSLParser.g:1292:4: rule__VariableValue__RefAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableValue__RefAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableValueAccess().getRefAssignment_4()); 

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
    // $ANTLR end "rule__VariableValue__Alternatives"


    // $ANTLR start "rule__DeviceValue__Alternatives"
    // InternalShortDSLParser.g:1300:1: rule__DeviceValue__Alternatives : ( ( ( rule__DeviceValue__ValueAssignment_0 ) ) | ( ( rule__DeviceValue__ValueAssignment_1 ) ) | ( ( rule__DeviceValue__ConfigurationValueAssignment_2 ) ) );
    public final void rule__DeviceValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1304:1: ( ( ( rule__DeviceValue__ValueAssignment_0 ) ) | ( ( rule__DeviceValue__ValueAssignment_1 ) ) | ( ( rule__DeviceValue__ConfigurationValueAssignment_2 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case Empty:
            case Full:
                {
                alt12=1;
                }
                break;
            case Green:
            case Blue:
            case Red:
                {
                alt12=2;
                }
                break;
            case RULE_ID:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalShortDSLParser.g:1305:2: ( ( rule__DeviceValue__ValueAssignment_0 ) )
                    {
                    // InternalShortDSLParser.g:1305:2: ( ( rule__DeviceValue__ValueAssignment_0 ) )
                    // InternalShortDSLParser.g:1306:3: ( rule__DeviceValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getDeviceValueAccess().getValueAssignment_0()); 
                    // InternalShortDSLParser.g:1307:3: ( rule__DeviceValue__ValueAssignment_0 )
                    // InternalShortDSLParser.g:1307:4: rule__DeviceValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeviceValue__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeviceValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1311:2: ( ( rule__DeviceValue__ValueAssignment_1 ) )
                    {
                    // InternalShortDSLParser.g:1311:2: ( ( rule__DeviceValue__ValueAssignment_1 ) )
                    // InternalShortDSLParser.g:1312:3: ( rule__DeviceValue__ValueAssignment_1 )
                    {
                     before(grammarAccess.getDeviceValueAccess().getValueAssignment_1()); 
                    // InternalShortDSLParser.g:1313:3: ( rule__DeviceValue__ValueAssignment_1 )
                    // InternalShortDSLParser.g:1313:4: rule__DeviceValue__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeviceValue__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeviceValueAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1317:2: ( ( rule__DeviceValue__ConfigurationValueAssignment_2 ) )
                    {
                    // InternalShortDSLParser.g:1317:2: ( ( rule__DeviceValue__ConfigurationValueAssignment_2 ) )
                    // InternalShortDSLParser.g:1318:3: ( rule__DeviceValue__ConfigurationValueAssignment_2 )
                    {
                     before(grammarAccess.getDeviceValueAccess().getConfigurationValueAssignment_2()); 
                    // InternalShortDSLParser.g:1319:3: ( rule__DeviceValue__ConfigurationValueAssignment_2 )
                    // InternalShortDSLParser.g:1319:4: rule__DeviceValue__ConfigurationValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeviceValue__ConfigurationValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeviceValueAccess().getConfigurationValueAssignment_2()); 

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
    // $ANTLR end "rule__DeviceValue__Alternatives"


    // $ANTLR start "rule__ValueSlot__Alternatives"
    // InternalShortDSLParser.g:1327:1: rule__ValueSlot__Alternatives : ( ( ( rule__ValueSlot__ValueAssignment_0 ) ) | ( ( rule__ValueSlot__ValueAssignment_1 ) ) );
    public final void rule__ValueSlot__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1331:1: ( ( ( rule__ValueSlot__ValueAssignment_0 ) ) | ( ( rule__ValueSlot__ValueAssignment_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=In_progress && LA13_0<=Complete)||LA13_0==Vacant) ) {
                alt13=1;
            }
            else if ( (LA13_0==Green||LA13_0==Blue||LA13_0==Red) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalShortDSLParser.g:1332:2: ( ( rule__ValueSlot__ValueAssignment_0 ) )
                    {
                    // InternalShortDSLParser.g:1332:2: ( ( rule__ValueSlot__ValueAssignment_0 ) )
                    // InternalShortDSLParser.g:1333:3: ( rule__ValueSlot__ValueAssignment_0 )
                    {
                     before(grammarAccess.getValueSlotAccess().getValueAssignment_0()); 
                    // InternalShortDSLParser.g:1334:3: ( rule__ValueSlot__ValueAssignment_0 )
                    // InternalShortDSLParser.g:1334:4: rule__ValueSlot__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValueSlot__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueSlotAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1338:2: ( ( rule__ValueSlot__ValueAssignment_1 ) )
                    {
                    // InternalShortDSLParser.g:1338:2: ( ( rule__ValueSlot__ValueAssignment_1 ) )
                    // InternalShortDSLParser.g:1339:3: ( rule__ValueSlot__ValueAssignment_1 )
                    {
                     before(grammarAccess.getValueSlotAccess().getValueAssignment_1()); 
                    // InternalShortDSLParser.g:1340:3: ( rule__ValueSlot__ValueAssignment_1 )
                    // InternalShortDSLParser.g:1340:4: rule__ValueSlot__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValueSlot__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueSlotAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__ValueSlot__Alternatives"


    // $ANTLR start "rule__COMPARISON_OPERATOR_S__Alternatives"
    // InternalShortDSLParser.g:1348:1: rule__COMPARISON_OPERATOR_S__Alternatives : ( ( ( EqualsSign ) ) | ( ( LessThanSign ) ) | ( ( GreaterThanSign ) ) | ( ( ExclamationMarkEqualsSign ) ) );
    public final void rule__COMPARISON_OPERATOR_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1352:1: ( ( ( EqualsSign ) ) | ( ( LessThanSign ) ) | ( ( GreaterThanSign ) ) | ( ( ExclamationMarkEqualsSign ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case EqualsSign:
                {
                alt14=1;
                }
                break;
            case LessThanSign:
                {
                alt14=2;
                }
                break;
            case GreaterThanSign:
                {
                alt14=3;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalShortDSLParser.g:1353:2: ( ( EqualsSign ) )
                    {
                    // InternalShortDSLParser.g:1353:2: ( ( EqualsSign ) )
                    // InternalShortDSLParser.g:1354:3: ( EqualsSign )
                    {
                     before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1355:3: ( EqualsSign )
                    // InternalShortDSLParser.g:1355:4: EqualsSign
                    {
                    match(input,EqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1359:2: ( ( LessThanSign ) )
                    {
                    // InternalShortDSLParser.g:1359:2: ( ( LessThanSign ) )
                    // InternalShortDSLParser.g:1360:3: ( LessThanSign )
                    {
                     before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getLESS_THANEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1361:3: ( LessThanSign )
                    // InternalShortDSLParser.g:1361:4: LessThanSign
                    {
                    match(input,LessThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getLESS_THANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1365:2: ( ( GreaterThanSign ) )
                    {
                    // InternalShortDSLParser.g:1365:2: ( ( GreaterThanSign ) )
                    // InternalShortDSLParser.g:1366:3: ( GreaterThanSign )
                    {
                     before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getGREATER_THANEnumLiteralDeclaration_2()); 
                    // InternalShortDSLParser.g:1367:3: ( GreaterThanSign )
                    // InternalShortDSLParser.g:1367:4: GreaterThanSign
                    {
                    match(input,GreaterThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getGREATER_THANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalShortDSLParser.g:1371:2: ( ( ExclamationMarkEqualsSign ) )
                    {
                    // InternalShortDSLParser.g:1371:2: ( ( ExclamationMarkEqualsSign ) )
                    // InternalShortDSLParser.g:1372:3: ( ExclamationMarkEqualsSign )
                    {
                     before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getNOTEnumLiteralDeclaration_3()); 
                    // InternalShortDSLParser.g:1373:3: ( ExclamationMarkEqualsSign )
                    // InternalShortDSLParser.g:1373:4: ExclamationMarkEqualsSign
                    {
                    match(input,ExclamationMarkEqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getNOTEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__COMPARISON_OPERATOR_S__Alternatives"


    // $ANTLR start "rule__COLOR_S__Alternatives"
    // InternalShortDSLParser.g:1381:1: rule__COLOR_S__Alternatives : ( ( ( Red ) ) | ( ( Green ) ) | ( ( Blue ) ) );
    public final void rule__COLOR_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1385:1: ( ( ( Red ) ) | ( ( Green ) ) | ( ( Blue ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case Red:
                {
                alt15=1;
                }
                break;
            case Green:
                {
                alt15=2;
                }
                break;
            case Blue:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalShortDSLParser.g:1386:2: ( ( Red ) )
                    {
                    // InternalShortDSLParser.g:1386:2: ( ( Red ) )
                    // InternalShortDSLParser.g:1387:3: ( Red )
                    {
                     before(grammarAccess.getCOLOR_SAccess().getREDEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1388:3: ( Red )
                    // InternalShortDSLParser.g:1388:4: Red
                    {
                    match(input,Red,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOLOR_SAccess().getREDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1392:2: ( ( Green ) )
                    {
                    // InternalShortDSLParser.g:1392:2: ( ( Green ) )
                    // InternalShortDSLParser.g:1393:3: ( Green )
                    {
                     before(grammarAccess.getCOLOR_SAccess().getGREENEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1394:3: ( Green )
                    // InternalShortDSLParser.g:1394:4: Green
                    {
                    match(input,Green,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOLOR_SAccess().getGREENEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1398:2: ( ( Blue ) )
                    {
                    // InternalShortDSLParser.g:1398:2: ( ( Blue ) )
                    // InternalShortDSLParser.g:1399:3: ( Blue )
                    {
                     before(grammarAccess.getCOLOR_SAccess().getBLUEEnumLiteralDeclaration_2()); 
                    // InternalShortDSLParser.g:1400:3: ( Blue )
                    // InternalShortDSLParser.g:1400:4: Blue
                    {
                    match(input,Blue,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOLOR_SAccess().getBLUEEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__COLOR_S__Alternatives"


    // $ANTLR start "rule__DISK_SLOT_STATES_S__Alternatives"
    // InternalShortDSLParser.g:1408:1: rule__DISK_SLOT_STATES_S__Alternatives : ( ( ( Vacant ) ) | ( ( In_progress ) ) | ( ( Complete ) ) );
    public final void rule__DISK_SLOT_STATES_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1412:1: ( ( ( Vacant ) ) | ( ( In_progress ) ) | ( ( Complete ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case Vacant:
                {
                alt16=1;
                }
                break;
            case In_progress:
                {
                alt16=2;
                }
                break;
            case Complete:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalShortDSLParser.g:1413:2: ( ( Vacant ) )
                    {
                    // InternalShortDSLParser.g:1413:2: ( ( Vacant ) )
                    // InternalShortDSLParser.g:1414:3: ( Vacant )
                    {
                     before(grammarAccess.getDISK_SLOT_STATES_SAccess().getFREEEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1415:3: ( Vacant )
                    // InternalShortDSLParser.g:1415:4: Vacant
                    {
                    match(input,Vacant,FOLLOW_2); 

                    }

                     after(grammarAccess.getDISK_SLOT_STATES_SAccess().getFREEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1419:2: ( ( In_progress ) )
                    {
                    // InternalShortDSLParser.g:1419:2: ( ( In_progress ) )
                    // InternalShortDSLParser.g:1420:3: ( In_progress )
                    {
                     before(grammarAccess.getDISK_SLOT_STATES_SAccess().getIN_PROGRESSEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1421:3: ( In_progress )
                    // InternalShortDSLParser.g:1421:4: In_progress
                    {
                    match(input,In_progress,FOLLOW_2); 

                    }

                     after(grammarAccess.getDISK_SLOT_STATES_SAccess().getIN_PROGRESSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1425:2: ( ( Complete ) )
                    {
                    // InternalShortDSLParser.g:1425:2: ( ( Complete ) )
                    // InternalShortDSLParser.g:1426:3: ( Complete )
                    {
                     before(grammarAccess.getDISK_SLOT_STATES_SAccess().getCOMPLETEEnumLiteralDeclaration_2()); 
                    // InternalShortDSLParser.g:1427:3: ( Complete )
                    // InternalShortDSLParser.g:1427:4: Complete
                    {
                    match(input,Complete,FOLLOW_2); 

                    }

                     after(grammarAccess.getDISK_SLOT_STATES_SAccess().getCOMPLETEEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__DISK_SLOT_STATES_S__Alternatives"


    // $ANTLR start "rule__DISK_STATES_S__Alternatives"
    // InternalShortDSLParser.g:1435:1: rule__DISK_STATES_S__Alternatives : ( ( ( Full ) ) | ( ( Empty ) ) );
    public final void rule__DISK_STATES_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1439:1: ( ( ( Full ) ) | ( ( Empty ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Full) ) {
                alt17=1;
            }
            else if ( (LA17_0==Empty) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalShortDSLParser.g:1440:2: ( ( Full ) )
                    {
                    // InternalShortDSLParser.g:1440:2: ( ( Full ) )
                    // InternalShortDSLParser.g:1441:3: ( Full )
                    {
                     before(grammarAccess.getDISK_STATES_SAccess().getFULLEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1442:3: ( Full )
                    // InternalShortDSLParser.g:1442:4: Full
                    {
                    match(input,Full,FOLLOW_2); 

                    }

                     after(grammarAccess.getDISK_STATES_SAccess().getFULLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1446:2: ( ( Empty ) )
                    {
                    // InternalShortDSLParser.g:1446:2: ( ( Empty ) )
                    // InternalShortDSLParser.g:1447:3: ( Empty )
                    {
                     before(grammarAccess.getDISK_STATES_SAccess().getEMPTYEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1448:3: ( Empty )
                    // InternalShortDSLParser.g:1448:4: Empty
                    {
                    match(input,Empty,FOLLOW_2); 

                    }

                     after(grammarAccess.getDISK_STATES_SAccess().getEMPTYEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__DISK_STATES_S__Alternatives"


    // $ANTLR start "rule__TIME_UNIT__Alternatives"
    // InternalShortDSLParser.g:1456:1: rule__TIME_UNIT__Alternatives : ( ( ( S ) ) | ( ( M ) ) | ( ( H ) ) );
    public final void rule__TIME_UNIT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1460:1: ( ( ( S ) ) | ( ( M ) ) | ( ( H ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case S:
                {
                alt18=1;
                }
                break;
            case M:
                {
                alt18=2;
                }
                break;
            case H:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalShortDSLParser.g:1461:2: ( ( S ) )
                    {
                    // InternalShortDSLParser.g:1461:2: ( ( S ) )
                    // InternalShortDSLParser.g:1462:3: ( S )
                    {
                     before(grammarAccess.getTIME_UNITAccess().getSECONDEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1463:3: ( S )
                    // InternalShortDSLParser.g:1463:4: S
                    {
                    match(input,S,FOLLOW_2); 

                    }

                     after(grammarAccess.getTIME_UNITAccess().getSECONDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1467:2: ( ( M ) )
                    {
                    // InternalShortDSLParser.g:1467:2: ( ( M ) )
                    // InternalShortDSLParser.g:1468:3: ( M )
                    {
                     before(grammarAccess.getTIME_UNITAccess().getMINUTEEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1469:3: ( M )
                    // InternalShortDSLParser.g:1469:4: M
                    {
                    match(input,M,FOLLOW_2); 

                    }

                     after(grammarAccess.getTIME_UNITAccess().getMINUTEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1473:2: ( ( H ) )
                    {
                    // InternalShortDSLParser.g:1473:2: ( ( H ) )
                    // InternalShortDSLParser.g:1474:3: ( H )
                    {
                     before(grammarAccess.getTIME_UNITAccess().getHOUREnumLiteralDeclaration_2()); 
                    // InternalShortDSLParser.g:1475:3: ( H )
                    // InternalShortDSLParser.g:1475:4: H
                    {
                    match(input,H,FOLLOW_2); 

                    }

                     after(grammarAccess.getTIME_UNITAccess().getHOUREnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TIME_UNIT__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalShortDSLParser.g:1483:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1487:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalShortDSLParser.g:1488:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalShortDSLParser.g:1495:1: rule__Model__Group__0__Impl : ( Use ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1499:1: ( ( Use ) )
            // InternalShortDSLParser.g:1500:1: ( Use )
            {
            // InternalShortDSLParser.g:1500:1: ( Use )
            // InternalShortDSLParser.g:1501:2: Use
            {
             before(grammarAccess.getModelAccess().getUseKeyword_0()); 
            match(input,Use,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getUseKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalShortDSLParser.g:1510:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1514:1: ( rule__Model__Group__1__Impl )
            // InternalShortDSLParser.g:1515:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalShortDSLParser.g:1521:1: rule__Model__Group__1__Impl : ( ( rule__Model__Alternatives_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1525:1: ( ( ( rule__Model__Alternatives_1 ) ) )
            // InternalShortDSLParser.g:1526:1: ( ( rule__Model__Alternatives_1 ) )
            {
            // InternalShortDSLParser.g:1526:1: ( ( rule__Model__Alternatives_1 ) )
            // InternalShortDSLParser.g:1527:2: ( rule__Model__Alternatives_1 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_1()); 
            // InternalShortDSLParser.g:1528:2: ( rule__Model__Alternatives_1 )
            // InternalShortDSLParser.g:1528:3: rule__Model__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group_1_0__0"
    // InternalShortDSLParser.g:1537:1: rule__Model__Group_1_0__0 : rule__Model__Group_1_0__0__Impl rule__Model__Group_1_0__1 ;
    public final void rule__Model__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1541:1: ( rule__Model__Group_1_0__0__Impl rule__Model__Group_1_0__1 )
            // InternalShortDSLParser.g:1542:2: rule__Model__Group_1_0__0__Impl rule__Model__Group_1_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_1_0__1();

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
    // $ANTLR end "rule__Model__Group_1_0__0"


    // $ANTLR start "rule__Model__Group_1_0__0__Impl"
    // InternalShortDSLParser.g:1549:1: rule__Model__Group_1_0__0__Impl : ( Long ) ;
    public final void rule__Model__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1553:1: ( ( Long ) )
            // InternalShortDSLParser.g:1554:1: ( Long )
            {
            // InternalShortDSLParser.g:1554:1: ( Long )
            // InternalShortDSLParser.g:1555:2: Long
            {
             before(grammarAccess.getModelAccess().getLongKeyword_1_0_0()); 
            match(input,Long,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLongKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Model__Group_1_0__0__Impl"


    // $ANTLR start "rule__Model__Group_1_0__1"
    // InternalShortDSLParser.g:1564:1: rule__Model__Group_1_0__1 : rule__Model__Group_1_0__1__Impl rule__Model__Group_1_0__2 ;
    public final void rule__Model__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1568:1: ( rule__Model__Group_1_0__1__Impl rule__Model__Group_1_0__2 )
            // InternalShortDSLParser.g:1569:2: rule__Model__Group_1_0__1__Impl rule__Model__Group_1_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_1_0__2();

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
    // $ANTLR end "rule__Model__Group_1_0__1"


    // $ANTLR start "rule__Model__Group_1_0__1__Impl"
    // InternalShortDSLParser.g:1576:1: rule__Model__Group_1_0__1__Impl : ( Dsl ) ;
    public final void rule__Model__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1580:1: ( ( Dsl ) )
            // InternalShortDSLParser.g:1581:1: ( Dsl )
            {
            // InternalShortDSLParser.g:1581:1: ( Dsl )
            // InternalShortDSLParser.g:1582:2: Dsl
            {
             before(grammarAccess.getModelAccess().getDslKeyword_1_0_1()); 
            match(input,Dsl,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getDslKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Model__Group_1_0__1__Impl"


    // $ANTLR start "rule__Model__Group_1_0__2"
    // InternalShortDSLParser.g:1591:1: rule__Model__Group_1_0__2 : rule__Model__Group_1_0__2__Impl ;
    public final void rule__Model__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1595:1: ( rule__Model__Group_1_0__2__Impl )
            // InternalShortDSLParser.g:1596:2: rule__Model__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__Model__Group_1_0__2"


    // $ANTLR start "rule__Model__Group_1_0__2__Impl"
    // InternalShortDSLParser.g:1602:1: rule__Model__Group_1_0__2__Impl : ( ( rule__Model__TypeAssignment_1_0_2 ) ) ;
    public final void rule__Model__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1606:1: ( ( ( rule__Model__TypeAssignment_1_0_2 ) ) )
            // InternalShortDSLParser.g:1607:1: ( ( rule__Model__TypeAssignment_1_0_2 ) )
            {
            // InternalShortDSLParser.g:1607:1: ( ( rule__Model__TypeAssignment_1_0_2 ) )
            // InternalShortDSLParser.g:1608:2: ( rule__Model__TypeAssignment_1_0_2 )
            {
             before(grammarAccess.getModelAccess().getTypeAssignment_1_0_2()); 
            // InternalShortDSLParser.g:1609:2: ( rule__Model__TypeAssignment_1_0_2 )
            // InternalShortDSLParser.g:1609:3: rule__Model__TypeAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__TypeAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTypeAssignment_1_0_2()); 

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
    // $ANTLR end "rule__Model__Group_1_0__2__Impl"


    // $ANTLR start "rule__Model__Group_1_1__0"
    // InternalShortDSLParser.g:1618:1: rule__Model__Group_1_1__0 : rule__Model__Group_1_1__0__Impl rule__Model__Group_1_1__1 ;
    public final void rule__Model__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1622:1: ( rule__Model__Group_1_1__0__Impl rule__Model__Group_1_1__1 )
            // InternalShortDSLParser.g:1623:2: rule__Model__Group_1_1__0__Impl rule__Model__Group_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_1_1__1();

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
    // $ANTLR end "rule__Model__Group_1_1__0"


    // $ANTLR start "rule__Model__Group_1_1__0__Impl"
    // InternalShortDSLParser.g:1630:1: rule__Model__Group_1_1__0__Impl : ( Short ) ;
    public final void rule__Model__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1634:1: ( ( Short ) )
            // InternalShortDSLParser.g:1635:1: ( Short )
            {
            // InternalShortDSLParser.g:1635:1: ( Short )
            // InternalShortDSLParser.g:1636:2: Short
            {
             before(grammarAccess.getModelAccess().getShortKeyword_1_1_0()); 
            match(input,Short,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getShortKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Model__Group_1_1__0__Impl"


    // $ANTLR start "rule__Model__Group_1_1__1"
    // InternalShortDSLParser.g:1645:1: rule__Model__Group_1_1__1 : rule__Model__Group_1_1__1__Impl rule__Model__Group_1_1__2 ;
    public final void rule__Model__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1649:1: ( rule__Model__Group_1_1__1__Impl rule__Model__Group_1_1__2 )
            // InternalShortDSLParser.g:1650:2: rule__Model__Group_1_1__1__Impl rule__Model__Group_1_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_1_1__2();

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
    // $ANTLR end "rule__Model__Group_1_1__1"


    // $ANTLR start "rule__Model__Group_1_1__1__Impl"
    // InternalShortDSLParser.g:1657:1: rule__Model__Group_1_1__1__Impl : ( Dsl ) ;
    public final void rule__Model__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1661:1: ( ( Dsl ) )
            // InternalShortDSLParser.g:1662:1: ( Dsl )
            {
            // InternalShortDSLParser.g:1662:1: ( Dsl )
            // InternalShortDSLParser.g:1663:2: Dsl
            {
             before(grammarAccess.getModelAccess().getDslKeyword_1_1_1()); 
            match(input,Dsl,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getDslKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Model__Group_1_1__1__Impl"


    // $ANTLR start "rule__Model__Group_1_1__2"
    // InternalShortDSLParser.g:1672:1: rule__Model__Group_1_1__2 : rule__Model__Group_1_1__2__Impl ;
    public final void rule__Model__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1676:1: ( rule__Model__Group_1_1__2__Impl )
            // InternalShortDSLParser.g:1677:2: rule__Model__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Model__Group_1_1__2"


    // $ANTLR start "rule__Model__Group_1_1__2__Impl"
    // InternalShortDSLParser.g:1683:1: rule__Model__Group_1_1__2__Impl : ( ( rule__Model__TypeAssignment_1_1_2 ) ) ;
    public final void rule__Model__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1687:1: ( ( ( rule__Model__TypeAssignment_1_1_2 ) ) )
            // InternalShortDSLParser.g:1688:1: ( ( rule__Model__TypeAssignment_1_1_2 ) )
            {
            // InternalShortDSLParser.g:1688:1: ( ( rule__Model__TypeAssignment_1_1_2 ) )
            // InternalShortDSLParser.g:1689:2: ( rule__Model__TypeAssignment_1_1_2 )
            {
             before(grammarAccess.getModelAccess().getTypeAssignment_1_1_2()); 
            // InternalShortDSLParser.g:1690:2: ( rule__Model__TypeAssignment_1_1_2 )
            // InternalShortDSLParser.g:1690:3: rule__Model__TypeAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__TypeAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTypeAssignment_1_1_2()); 

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
    // $ANTLR end "rule__Model__Group_1_1__2__Impl"


    // $ANTLR start "rule__DSL_Long__Group__0"
    // InternalShortDSLParser.g:1699:1: rule__DSL_Long__Group__0 : rule__DSL_Long__Group__0__Impl rule__DSL_Long__Group__1 ;
    public final void rule__DSL_Long__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1703:1: ( rule__DSL_Long__Group__0__Impl rule__DSL_Long__Group__1 )
            // InternalShortDSLParser.g:1704:2: rule__DSL_Long__Group__0__Impl rule__DSL_Long__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DSL_Long__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSL_Long__Group__1();

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
    // $ANTLR end "rule__DSL_Long__Group__0"


    // $ANTLR start "rule__DSL_Long__Group__0__Impl"
    // InternalShortDSLParser.g:1711:1: rule__DSL_Long__Group__0__Impl : ( Test ) ;
    public final void rule__DSL_Long__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1715:1: ( ( Test ) )
            // InternalShortDSLParser.g:1716:1: ( Test )
            {
            // InternalShortDSLParser.g:1716:1: ( Test )
            // InternalShortDSLParser.g:1717:2: Test
            {
             before(grammarAccess.getDSL_LongAccess().getTestKeyword_0()); 
            match(input,Test,FOLLOW_2); 
             after(grammarAccess.getDSL_LongAccess().getTestKeyword_0()); 

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
    // $ANTLR end "rule__DSL_Long__Group__0__Impl"


    // $ANTLR start "rule__DSL_Long__Group__1"
    // InternalShortDSLParser.g:1726:1: rule__DSL_Long__Group__1 : rule__DSL_Long__Group__1__Impl ;
    public final void rule__DSL_Long__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1730:1: ( rule__DSL_Long__Group__1__Impl )
            // InternalShortDSLParser.g:1731:2: rule__DSL_Long__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSL_Long__Group__1__Impl();

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
    // $ANTLR end "rule__DSL_Long__Group__1"


    // $ANTLR start "rule__DSL_Long__Group__1__Impl"
    // InternalShortDSLParser.g:1737:1: rule__DSL_Long__Group__1__Impl : ( ( rule__DSL_Long__NameAssignment_1 ) ) ;
    public final void rule__DSL_Long__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1741:1: ( ( ( rule__DSL_Long__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:1742:1: ( ( rule__DSL_Long__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:1742:1: ( ( rule__DSL_Long__NameAssignment_1 ) )
            // InternalShortDSLParser.g:1743:2: ( rule__DSL_Long__NameAssignment_1 )
            {
             before(grammarAccess.getDSL_LongAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:1744:2: ( rule__DSL_Long__NameAssignment_1 )
            // InternalShortDSLParser.g:1744:3: rule__DSL_Long__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSL_Long__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSL_LongAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DSL_Long__Group__1__Impl"


    // $ANTLR start "rule__DSL_Short__Group__0"
    // InternalShortDSLParser.g:1753:1: rule__DSL_Short__Group__0 : rule__DSL_Short__Group__0__Impl rule__DSL_Short__Group__1 ;
    public final void rule__DSL_Short__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1757:1: ( rule__DSL_Short__Group__0__Impl rule__DSL_Short__Group__1 )
            // InternalShortDSLParser.g:1758:2: rule__DSL_Short__Group__0__Impl rule__DSL_Short__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DSL_Short__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSL_Short__Group__1();

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
    // $ANTLR end "rule__DSL_Short__Group__0"


    // $ANTLR start "rule__DSL_Short__Group__0__Impl"
    // InternalShortDSLParser.g:1765:1: rule__DSL_Short__Group__0__Impl : ( () ) ;
    public final void rule__DSL_Short__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1769:1: ( ( () ) )
            // InternalShortDSLParser.g:1770:1: ( () )
            {
            // InternalShortDSLParser.g:1770:1: ( () )
            // InternalShortDSLParser.g:1771:2: ()
            {
             before(grammarAccess.getDSL_ShortAccess().getDSLShortAction_0()); 
            // InternalShortDSLParser.g:1772:2: ()
            // InternalShortDSLParser.g:1772:3: 
            {
            }

             after(grammarAccess.getDSL_ShortAccess().getDSLShortAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSL_Short__Group__0__Impl"


    // $ANTLR start "rule__DSL_Short__Group__1"
    // InternalShortDSLParser.g:1780:1: rule__DSL_Short__Group__1 : rule__DSL_Short__Group__1__Impl rule__DSL_Short__Group__2 ;
    public final void rule__DSL_Short__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1784:1: ( rule__DSL_Short__Group__1__Impl rule__DSL_Short__Group__2 )
            // InternalShortDSLParser.g:1785:2: rule__DSL_Short__Group__1__Impl rule__DSL_Short__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DSL_Short__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSL_Short__Group__2();

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
    // $ANTLR end "rule__DSL_Short__Group__1"


    // $ANTLR start "rule__DSL_Short__Group__1__Impl"
    // InternalShortDSLParser.g:1792:1: rule__DSL_Short__Group__1__Impl : ( ( rule__DSL_Short__ConfigurationAssignment_1 ) ) ;
    public final void rule__DSL_Short__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1796:1: ( ( ( rule__DSL_Short__ConfigurationAssignment_1 ) ) )
            // InternalShortDSLParser.g:1797:1: ( ( rule__DSL_Short__ConfigurationAssignment_1 ) )
            {
            // InternalShortDSLParser.g:1797:1: ( ( rule__DSL_Short__ConfigurationAssignment_1 ) )
            // InternalShortDSLParser.g:1798:2: ( rule__DSL_Short__ConfigurationAssignment_1 )
            {
             before(grammarAccess.getDSL_ShortAccess().getConfigurationAssignment_1()); 
            // InternalShortDSLParser.g:1799:2: ( rule__DSL_Short__ConfigurationAssignment_1 )
            // InternalShortDSLParser.g:1799:3: rule__DSL_Short__ConfigurationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSL_Short__ConfigurationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSL_ShortAccess().getConfigurationAssignment_1()); 

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
    // $ANTLR end "rule__DSL_Short__Group__1__Impl"


    // $ANTLR start "rule__DSL_Short__Group__2"
    // InternalShortDSLParser.g:1807:1: rule__DSL_Short__Group__2 : rule__DSL_Short__Group__2__Impl ;
    public final void rule__DSL_Short__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1811:1: ( rule__DSL_Short__Group__2__Impl )
            // InternalShortDSLParser.g:1812:2: rule__DSL_Short__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSL_Short__Group__2__Impl();

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
    // $ANTLR end "rule__DSL_Short__Group__2"


    // $ANTLR start "rule__DSL_Short__Group__2__Impl"
    // InternalShortDSLParser.g:1818:1: rule__DSL_Short__Group__2__Impl : ( ( rule__DSL_Short__DiskHandlingsAssignment_2 )* ) ;
    public final void rule__DSL_Short__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1822:1: ( ( ( rule__DSL_Short__DiskHandlingsAssignment_2 )* ) )
            // InternalShortDSLParser.g:1823:1: ( ( rule__DSL_Short__DiskHandlingsAssignment_2 )* )
            {
            // InternalShortDSLParser.g:1823:1: ( ( rule__DSL_Short__DiskHandlingsAssignment_2 )* )
            // InternalShortDSLParser.g:1824:2: ( rule__DSL_Short__DiskHandlingsAssignment_2 )*
            {
             before(grammarAccess.getDSL_ShortAccess().getDiskHandlingsAssignment_2()); 
            // InternalShortDSLParser.g:1825:2: ( rule__DSL_Short__DiskHandlingsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Handle) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalShortDSLParser.g:1825:3: rule__DSL_Short__DiskHandlingsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DSL_Short__DiskHandlingsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDSL_ShortAccess().getDiskHandlingsAssignment_2()); 

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
    // $ANTLR end "rule__DSL_Short__Group__2__Impl"


    // $ANTLR start "rule__ConfigurationS__Group__0"
    // InternalShortDSLParser.g:1834:1: rule__ConfigurationS__Group__0 : rule__ConfigurationS__Group__0__Impl rule__ConfigurationS__Group__1 ;
    public final void rule__ConfigurationS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1838:1: ( rule__ConfigurationS__Group__0__Impl rule__ConfigurationS__Group__1 )
            // InternalShortDSLParser.g:1839:2: rule__ConfigurationS__Group__0__Impl rule__ConfigurationS__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ConfigurationS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigurationS__Group__1();

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
    // $ANTLR end "rule__ConfigurationS__Group__0"


    // $ANTLR start "rule__ConfigurationS__Group__0__Impl"
    // InternalShortDSLParser.g:1846:1: rule__ConfigurationS__Group__0__Impl : ( Devices ) ;
    public final void rule__ConfigurationS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1850:1: ( ( Devices ) )
            // InternalShortDSLParser.g:1851:1: ( Devices )
            {
            // InternalShortDSLParser.g:1851:1: ( Devices )
            // InternalShortDSLParser.g:1852:2: Devices
            {
             before(grammarAccess.getConfigurationSAccess().getDevicesKeyword_0()); 
            match(input,Devices,FOLLOW_2); 
             after(grammarAccess.getConfigurationSAccess().getDevicesKeyword_0()); 

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
    // $ANTLR end "rule__ConfigurationS__Group__0__Impl"


    // $ANTLR start "rule__ConfigurationS__Group__1"
    // InternalShortDSLParser.g:1861:1: rule__ConfigurationS__Group__1 : rule__ConfigurationS__Group__1__Impl rule__ConfigurationS__Group__2 ;
    public final void rule__ConfigurationS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1865:1: ( rule__ConfigurationS__Group__1__Impl rule__ConfigurationS__Group__2 )
            // InternalShortDSLParser.g:1866:2: rule__ConfigurationS__Group__1__Impl rule__ConfigurationS__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ConfigurationS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigurationS__Group__2();

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
    // $ANTLR end "rule__ConfigurationS__Group__1"


    // $ANTLR start "rule__ConfigurationS__Group__1__Impl"
    // InternalShortDSLParser.g:1873:1: rule__ConfigurationS__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ConfigurationS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1877:1: ( ( LeftCurlyBracket ) )
            // InternalShortDSLParser.g:1878:1: ( LeftCurlyBracket )
            {
            // InternalShortDSLParser.g:1878:1: ( LeftCurlyBracket )
            // InternalShortDSLParser.g:1879:2: LeftCurlyBracket
            {
             before(grammarAccess.getConfigurationSAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getConfigurationSAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ConfigurationS__Group__1__Impl"


    // $ANTLR start "rule__ConfigurationS__Group__2"
    // InternalShortDSLParser.g:1888:1: rule__ConfigurationS__Group__2 : rule__ConfigurationS__Group__2__Impl rule__ConfigurationS__Group__3 ;
    public final void rule__ConfigurationS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1892:1: ( rule__ConfigurationS__Group__2__Impl rule__ConfigurationS__Group__3 )
            // InternalShortDSLParser.g:1893:2: rule__ConfigurationS__Group__2__Impl rule__ConfigurationS__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ConfigurationS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigurationS__Group__3();

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
    // $ANTLR end "rule__ConfigurationS__Group__2"


    // $ANTLR start "rule__ConfigurationS__Group__2__Impl"
    // InternalShortDSLParser.g:1900:1: rule__ConfigurationS__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ConfigurationS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1904:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:1905:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:1905:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:1906:2: RULE_BEGIN
            {
             before(grammarAccess.getConfigurationSAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getConfigurationSAccess().getBEGINTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__ConfigurationS__Group__2__Impl"


    // $ANTLR start "rule__ConfigurationS__Group__3"
    // InternalShortDSLParser.g:1915:1: rule__ConfigurationS__Group__3 : rule__ConfigurationS__Group__3__Impl rule__ConfigurationS__Group__4 ;
    public final void rule__ConfigurationS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1919:1: ( rule__ConfigurationS__Group__3__Impl rule__ConfigurationS__Group__4 )
            // InternalShortDSLParser.g:1920:2: rule__ConfigurationS__Group__3__Impl rule__ConfigurationS__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ConfigurationS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigurationS__Group__4();

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
    // $ANTLR end "rule__ConfigurationS__Group__3"


    // $ANTLR start "rule__ConfigurationS__Group__3__Impl"
    // InternalShortDSLParser.g:1927:1: rule__ConfigurationS__Group__3__Impl : ( ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* ) ) ;
    public final void rule__ConfigurationS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1931:1: ( ( ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* ) ) )
            // InternalShortDSLParser.g:1932:1: ( ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* ) )
            {
            // InternalShortDSLParser.g:1932:1: ( ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* ) )
            // InternalShortDSLParser.g:1933:2: ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* )
            {
            // InternalShortDSLParser.g:1933:2: ( ( rule__ConfigurationS__DevicesAssignment_3 ) )
            // InternalShortDSLParser.g:1934:3: ( rule__ConfigurationS__DevicesAssignment_3 )
            {
             before(grammarAccess.getConfigurationSAccess().getDevicesAssignment_3()); 
            // InternalShortDSLParser.g:1935:3: ( rule__ConfigurationS__DevicesAssignment_3 )
            // InternalShortDSLParser.g:1935:4: rule__ConfigurationS__DevicesAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__ConfigurationS__DevicesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationSAccess().getDevicesAssignment_3()); 

            }

            // InternalShortDSLParser.g:1938:2: ( ( rule__ConfigurationS__DevicesAssignment_3 )* )
            // InternalShortDSLParser.g:1939:3: ( rule__ConfigurationS__DevicesAssignment_3 )*
            {
             before(grammarAccess.getConfigurationSAccess().getDevicesAssignment_3()); 
            // InternalShortDSLParser.g:1940:3: ( rule__ConfigurationS__DevicesAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalShortDSLParser.g:1940:4: rule__ConfigurationS__DevicesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ConfigurationS__DevicesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getConfigurationSAccess().getDevicesAssignment_3()); 

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
    // $ANTLR end "rule__ConfigurationS__Group__3__Impl"


    // $ANTLR start "rule__ConfigurationS__Group__4"
    // InternalShortDSLParser.g:1949:1: rule__ConfigurationS__Group__4 : rule__ConfigurationS__Group__4__Impl rule__ConfigurationS__Group__5 ;
    public final void rule__ConfigurationS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1953:1: ( rule__ConfigurationS__Group__4__Impl rule__ConfigurationS__Group__5 )
            // InternalShortDSLParser.g:1954:2: rule__ConfigurationS__Group__4__Impl rule__ConfigurationS__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ConfigurationS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigurationS__Group__5();

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
    // $ANTLR end "rule__ConfigurationS__Group__4"


    // $ANTLR start "rule__ConfigurationS__Group__4__Impl"
    // InternalShortDSLParser.g:1961:1: rule__ConfigurationS__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ConfigurationS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1965:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:1966:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:1966:1: ( RULE_END )
            // InternalShortDSLParser.g:1967:2: RULE_END
            {
             before(grammarAccess.getConfigurationSAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getConfigurationSAccess().getENDTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__ConfigurationS__Group__4__Impl"


    // $ANTLR start "rule__ConfigurationS__Group__5"
    // InternalShortDSLParser.g:1976:1: rule__ConfigurationS__Group__5 : rule__ConfigurationS__Group__5__Impl ;
    public final void rule__ConfigurationS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1980:1: ( rule__ConfigurationS__Group__5__Impl )
            // InternalShortDSLParser.g:1981:2: rule__ConfigurationS__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationS__Group__5__Impl();

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
    // $ANTLR end "rule__ConfigurationS__Group__5"


    // $ANTLR start "rule__ConfigurationS__Group__5__Impl"
    // InternalShortDSLParser.g:1987:1: rule__ConfigurationS__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__ConfigurationS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1991:1: ( ( RightCurlyBracket ) )
            // InternalShortDSLParser.g:1992:1: ( RightCurlyBracket )
            {
            // InternalShortDSLParser.g:1992:1: ( RightCurlyBracket )
            // InternalShortDSLParser.g:1993:2: RightCurlyBracket
            {
             before(grammarAccess.getConfigurationSAccess().getRightCurlyBracketKeyword_5()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getConfigurationSAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ConfigurationS__Group__5__Impl"


    // $ANTLR start "rule__CraneS__Group__0"
    // InternalShortDSLParser.g:2003:1: rule__CraneS__Group__0 : rule__CraneS__Group__0__Impl rule__CraneS__Group__1 ;
    public final void rule__CraneS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2007:1: ( rule__CraneS__Group__0__Impl rule__CraneS__Group__1 )
            // InternalShortDSLParser.g:2008:2: rule__CraneS__Group__0__Impl rule__CraneS__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CraneS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CraneS__Group__1();

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
    // $ANTLR end "rule__CraneS__Group__0"


    // $ANTLR start "rule__CraneS__Group__0__Impl"
    // InternalShortDSLParser.g:2015:1: rule__CraneS__Group__0__Impl : ( () ) ;
    public final void rule__CraneS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2019:1: ( ( () ) )
            // InternalShortDSLParser.g:2020:1: ( () )
            {
            // InternalShortDSLParser.g:2020:1: ( () )
            // InternalShortDSLParser.g:2021:2: ()
            {
             before(grammarAccess.getCraneSAccess().getCraneAction_0()); 
            // InternalShortDSLParser.g:2022:2: ()
            // InternalShortDSLParser.g:2022:3: 
            {
            }

             after(grammarAccess.getCraneSAccess().getCraneAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CraneS__Group__0__Impl"


    // $ANTLR start "rule__CraneS__Group__1"
    // InternalShortDSLParser.g:2030:1: rule__CraneS__Group__1 : rule__CraneS__Group__1__Impl rule__CraneS__Group__2 ;
    public final void rule__CraneS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2034:1: ( rule__CraneS__Group__1__Impl rule__CraneS__Group__2 )
            // InternalShortDSLParser.g:2035:2: rule__CraneS__Group__1__Impl rule__CraneS__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__CraneS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CraneS__Group__2();

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
    // $ANTLR end "rule__CraneS__Group__1"


    // $ANTLR start "rule__CraneS__Group__1__Impl"
    // InternalShortDSLParser.g:2042:1: rule__CraneS__Group__1__Impl : ( ( rule__CraneS__NameAssignment_1 ) ) ;
    public final void rule__CraneS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2046:1: ( ( ( rule__CraneS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2047:1: ( ( rule__CraneS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2047:1: ( ( rule__CraneS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2048:2: ( rule__CraneS__NameAssignment_1 )
            {
             before(grammarAccess.getCraneSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2049:2: ( rule__CraneS__NameAssignment_1 )
            // InternalShortDSLParser.g:2049:3: rule__CraneS__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CraneS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCraneSAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CraneS__Group__1__Impl"


    // $ANTLR start "rule__CraneS__Group__2"
    // InternalShortDSLParser.g:2057:1: rule__CraneS__Group__2 : rule__CraneS__Group__2__Impl rule__CraneS__Group__3 ;
    public final void rule__CraneS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2061:1: ( rule__CraneS__Group__2__Impl rule__CraneS__Group__3 )
            // InternalShortDSLParser.g:2062:2: rule__CraneS__Group__2__Impl rule__CraneS__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__CraneS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CraneS__Group__3();

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
    // $ANTLR end "rule__CraneS__Group__2"


    // $ANTLR start "rule__CraneS__Group__2__Impl"
    // InternalShortDSLParser.g:2069:1: rule__CraneS__Group__2__Impl : ( Colon ) ;
    public final void rule__CraneS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2073:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2074:1: ( Colon )
            {
            // InternalShortDSLParser.g:2074:1: ( Colon )
            // InternalShortDSLParser.g:2075:2: Colon
            {
             before(grammarAccess.getCraneSAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCraneSAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__CraneS__Group__2__Impl"


    // $ANTLR start "rule__CraneS__Group__3"
    // InternalShortDSLParser.g:2084:1: rule__CraneS__Group__3 : rule__CraneS__Group__3__Impl rule__CraneS__Group__4 ;
    public final void rule__CraneS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2088:1: ( rule__CraneS__Group__3__Impl rule__CraneS__Group__4 )
            // InternalShortDSLParser.g:2089:2: rule__CraneS__Group__3__Impl rule__CraneS__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__CraneS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CraneS__Group__4();

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
    // $ANTLR end "rule__CraneS__Group__3"


    // $ANTLR start "rule__CraneS__Group__3__Impl"
    // InternalShortDSLParser.g:2096:1: rule__CraneS__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__CraneS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2100:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:2101:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:2101:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:2102:2: RULE_BEGIN
            {
             before(grammarAccess.getCraneSAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getCraneSAccess().getBEGINTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__CraneS__Group__3__Impl"


    // $ANTLR start "rule__CraneS__Group__4"
    // InternalShortDSLParser.g:2111:1: rule__CraneS__Group__4 : rule__CraneS__Group__4__Impl rule__CraneS__Group__5 ;
    public final void rule__CraneS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2115:1: ( rule__CraneS__Group__4__Impl rule__CraneS__Group__5 )
            // InternalShortDSLParser.g:2116:2: rule__CraneS__Group__4__Impl rule__CraneS__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__CraneS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CraneS__Group__5();

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
    // $ANTLR end "rule__CraneS__Group__4"


    // $ANTLR start "rule__CraneS__Group__4__Impl"
    // InternalShortDSLParser.g:2123:1: rule__CraneS__Group__4__Impl : ( ( ( rule__CraneS__TargetsAssignment_4 ) ) ( ( rule__CraneS__TargetsAssignment_4 )* ) ) ;
    public final void rule__CraneS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2127:1: ( ( ( ( rule__CraneS__TargetsAssignment_4 ) ) ( ( rule__CraneS__TargetsAssignment_4 )* ) ) )
            // InternalShortDSLParser.g:2128:1: ( ( ( rule__CraneS__TargetsAssignment_4 ) ) ( ( rule__CraneS__TargetsAssignment_4 )* ) )
            {
            // InternalShortDSLParser.g:2128:1: ( ( ( rule__CraneS__TargetsAssignment_4 ) ) ( ( rule__CraneS__TargetsAssignment_4 )* ) )
            // InternalShortDSLParser.g:2129:2: ( ( rule__CraneS__TargetsAssignment_4 ) ) ( ( rule__CraneS__TargetsAssignment_4 )* )
            {
            // InternalShortDSLParser.g:2129:2: ( ( rule__CraneS__TargetsAssignment_4 ) )
            // InternalShortDSLParser.g:2130:3: ( rule__CraneS__TargetsAssignment_4 )
            {
             before(grammarAccess.getCraneSAccess().getTargetsAssignment_4()); 
            // InternalShortDSLParser.g:2131:3: ( rule__CraneS__TargetsAssignment_4 )
            // InternalShortDSLParser.g:2131:4: rule__CraneS__TargetsAssignment_4
            {
            pushFollow(FOLLOW_13);
            rule__CraneS__TargetsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCraneSAccess().getTargetsAssignment_4()); 

            }

            // InternalShortDSLParser.g:2134:2: ( ( rule__CraneS__TargetsAssignment_4 )* )
            // InternalShortDSLParser.g:2135:3: ( rule__CraneS__TargetsAssignment_4 )*
            {
             before(grammarAccess.getCraneSAccess().getTargetsAssignment_4()); 
            // InternalShortDSLParser.g:2136:3: ( rule__CraneS__TargetsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalShortDSLParser.g:2136:4: rule__CraneS__TargetsAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__CraneS__TargetsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getCraneSAccess().getTargetsAssignment_4()); 

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
    // $ANTLR end "rule__CraneS__Group__4__Impl"


    // $ANTLR start "rule__CraneS__Group__5"
    // InternalShortDSLParser.g:2145:1: rule__CraneS__Group__5 : rule__CraneS__Group__5__Impl ;
    public final void rule__CraneS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2149:1: ( rule__CraneS__Group__5__Impl )
            // InternalShortDSLParser.g:2150:2: rule__CraneS__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CraneS__Group__5__Impl();

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
    // $ANTLR end "rule__CraneS__Group__5"


    // $ANTLR start "rule__CraneS__Group__5__Impl"
    // InternalShortDSLParser.g:2156:1: rule__CraneS__Group__5__Impl : ( RULE_END ) ;
    public final void rule__CraneS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2160:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:2161:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:2161:1: ( RULE_END )
            // InternalShortDSLParser.g:2162:2: RULE_END
            {
             before(grammarAccess.getCraneSAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getCraneSAccess().getENDTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__CraneS__Group__5__Impl"


    // $ANTLR start "rule__CraneZoneS__Group__0"
    // InternalShortDSLParser.g:2172:1: rule__CraneZoneS__Group__0 : rule__CraneZoneS__Group__0__Impl rule__CraneZoneS__Group__1 ;
    public final void rule__CraneZoneS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2176:1: ( rule__CraneZoneS__Group__0__Impl rule__CraneZoneS__Group__1 )
            // InternalShortDSLParser.g:2177:2: rule__CraneZoneS__Group__0__Impl rule__CraneZoneS__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CraneZoneS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CraneZoneS__Group__1();

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
    // $ANTLR end "rule__CraneZoneS__Group__0"


    // $ANTLR start "rule__CraneZoneS__Group__0__Impl"
    // InternalShortDSLParser.g:2184:1: rule__CraneZoneS__Group__0__Impl : ( () ) ;
    public final void rule__CraneZoneS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2188:1: ( ( () ) )
            // InternalShortDSLParser.g:2189:1: ( () )
            {
            // InternalShortDSLParser.g:2189:1: ( () )
            // InternalShortDSLParser.g:2190:2: ()
            {
             before(grammarAccess.getCraneZoneSAccess().getCraneZoneAction_0()); 
            // InternalShortDSLParser.g:2191:2: ()
            // InternalShortDSLParser.g:2191:3: 
            {
            }

             after(grammarAccess.getCraneZoneSAccess().getCraneZoneAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CraneZoneS__Group__0__Impl"


    // $ANTLR start "rule__CraneZoneS__Group__1"
    // InternalShortDSLParser.g:2199:1: rule__CraneZoneS__Group__1 : rule__CraneZoneS__Group__1__Impl rule__CraneZoneS__Group__2 ;
    public final void rule__CraneZoneS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2203:1: ( rule__CraneZoneS__Group__1__Impl rule__CraneZoneS__Group__2 )
            // InternalShortDSLParser.g:2204:2: rule__CraneZoneS__Group__1__Impl rule__CraneZoneS__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__CraneZoneS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CraneZoneS__Group__2();

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
    // $ANTLR end "rule__CraneZoneS__Group__1"


    // $ANTLR start "rule__CraneZoneS__Group__1__Impl"
    // InternalShortDSLParser.g:2211:1: rule__CraneZoneS__Group__1__Impl : ( ( rule__CraneZoneS__NameAssignment_1 ) ) ;
    public final void rule__CraneZoneS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2215:1: ( ( ( rule__CraneZoneS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2216:1: ( ( rule__CraneZoneS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2216:1: ( ( rule__CraneZoneS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2217:2: ( rule__CraneZoneS__NameAssignment_1 )
            {
             before(grammarAccess.getCraneZoneSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2218:2: ( rule__CraneZoneS__NameAssignment_1 )
            // InternalShortDSLParser.g:2218:3: rule__CraneZoneS__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CraneZoneS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCraneZoneSAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CraneZoneS__Group__1__Impl"


    // $ANTLR start "rule__CraneZoneS__Group__2"
    // InternalShortDSLParser.g:2226:1: rule__CraneZoneS__Group__2 : rule__CraneZoneS__Group__2__Impl rule__CraneZoneS__Group__3 ;
    public final void rule__CraneZoneS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2230:1: ( rule__CraneZoneS__Group__2__Impl rule__CraneZoneS__Group__3 )
            // InternalShortDSLParser.g:2231:2: rule__CraneZoneS__Group__2__Impl rule__CraneZoneS__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__CraneZoneS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CraneZoneS__Group__3();

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
    // $ANTLR end "rule__CraneZoneS__Group__2"


    // $ANTLR start "rule__CraneZoneS__Group__2__Impl"
    // InternalShortDSLParser.g:2238:1: rule__CraneZoneS__Group__2__Impl : ( Colon ) ;
    public final void rule__CraneZoneS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2242:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2243:1: ( Colon )
            {
            // InternalShortDSLParser.g:2243:1: ( Colon )
            // InternalShortDSLParser.g:2244:2: Colon
            {
             before(grammarAccess.getCraneZoneSAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCraneZoneSAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__CraneZoneS__Group__2__Impl"


    // $ANTLR start "rule__CraneZoneS__Group__3"
    // InternalShortDSLParser.g:2253:1: rule__CraneZoneS__Group__3 : rule__CraneZoneS__Group__3__Impl rule__CraneZoneS__Group__4 ;
    public final void rule__CraneZoneS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2257:1: ( rule__CraneZoneS__Group__3__Impl rule__CraneZoneS__Group__4 )
            // InternalShortDSLParser.g:2258:2: rule__CraneZoneS__Group__3__Impl rule__CraneZoneS__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__CraneZoneS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CraneZoneS__Group__4();

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
    // $ANTLR end "rule__CraneZoneS__Group__3"


    // $ANTLR start "rule__CraneZoneS__Group__3__Impl"
    // InternalShortDSLParser.g:2265:1: rule__CraneZoneS__Group__3__Impl : ( ( rule__CraneZoneS__ZoneValueAssignment_3 ) ) ;
    public final void rule__CraneZoneS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2269:1: ( ( ( rule__CraneZoneS__ZoneValueAssignment_3 ) ) )
            // InternalShortDSLParser.g:2270:1: ( ( rule__CraneZoneS__ZoneValueAssignment_3 ) )
            {
            // InternalShortDSLParser.g:2270:1: ( ( rule__CraneZoneS__ZoneValueAssignment_3 ) )
            // InternalShortDSLParser.g:2271:2: ( rule__CraneZoneS__ZoneValueAssignment_3 )
            {
             before(grammarAccess.getCraneZoneSAccess().getZoneValueAssignment_3()); 
            // InternalShortDSLParser.g:2272:2: ( rule__CraneZoneS__ZoneValueAssignment_3 )
            // InternalShortDSLParser.g:2272:3: rule__CraneZoneS__ZoneValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CraneZoneS__ZoneValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCraneZoneSAccess().getZoneValueAssignment_3()); 

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
    // $ANTLR end "rule__CraneZoneS__Group__3__Impl"


    // $ANTLR start "rule__CraneZoneS__Group__4"
    // InternalShortDSLParser.g:2280:1: rule__CraneZoneS__Group__4 : rule__CraneZoneS__Group__4__Impl ;
    public final void rule__CraneZoneS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2284:1: ( rule__CraneZoneS__Group__4__Impl )
            // InternalShortDSLParser.g:2285:2: rule__CraneZoneS__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CraneZoneS__Group__4__Impl();

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
    // $ANTLR end "rule__CraneZoneS__Group__4"


    // $ANTLR start "rule__CraneZoneS__Group__4__Impl"
    // InternalShortDSLParser.g:2291:1: rule__CraneZoneS__Group__4__Impl : ( ( Comma )? ) ;
    public final void rule__CraneZoneS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2295:1: ( ( ( Comma )? ) )
            // InternalShortDSLParser.g:2296:1: ( ( Comma )? )
            {
            // InternalShortDSLParser.g:2296:1: ( ( Comma )? )
            // InternalShortDSLParser.g:2297:2: ( Comma )?
            {
             before(grammarAccess.getCraneZoneSAccess().getCommaKeyword_4()); 
            // InternalShortDSLParser.g:2298:2: ( Comma )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Comma) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalShortDSLParser.g:2298:3: Comma
                    {
                    match(input,Comma,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCraneZoneSAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__CraneZoneS__Group__4__Impl"


    // $ANTLR start "rule__DiskS__Group__0"
    // InternalShortDSLParser.g:2307:1: rule__DiskS__Group__0 : rule__DiskS__Group__0__Impl rule__DiskS__Group__1 ;
    public final void rule__DiskS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2311:1: ( rule__DiskS__Group__0__Impl rule__DiskS__Group__1 )
            // InternalShortDSLParser.g:2312:2: rule__DiskS__Group__0__Impl rule__DiskS__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DiskS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskS__Group__1();

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
    // $ANTLR end "rule__DiskS__Group__0"


    // $ANTLR start "rule__DiskS__Group__0__Impl"
    // InternalShortDSLParser.g:2319:1: rule__DiskS__Group__0__Impl : ( () ) ;
    public final void rule__DiskS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2323:1: ( ( () ) )
            // InternalShortDSLParser.g:2324:1: ( () )
            {
            // InternalShortDSLParser.g:2324:1: ( () )
            // InternalShortDSLParser.g:2325:2: ()
            {
             before(grammarAccess.getDiskSAccess().getDiskAction_0()); 
            // InternalShortDSLParser.g:2326:2: ()
            // InternalShortDSLParser.g:2326:3: 
            {
            }

             after(grammarAccess.getDiskSAccess().getDiskAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskS__Group__0__Impl"


    // $ANTLR start "rule__DiskS__Group__1"
    // InternalShortDSLParser.g:2334:1: rule__DiskS__Group__1 : rule__DiskS__Group__1__Impl rule__DiskS__Group__2 ;
    public final void rule__DiskS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2338:1: ( rule__DiskS__Group__1__Impl rule__DiskS__Group__2 )
            // InternalShortDSLParser.g:2339:2: rule__DiskS__Group__1__Impl rule__DiskS__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__DiskS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskS__Group__2();

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
    // $ANTLR end "rule__DiskS__Group__1"


    // $ANTLR start "rule__DiskS__Group__1__Impl"
    // InternalShortDSLParser.g:2346:1: rule__DiskS__Group__1__Impl : ( ( rule__DiskS__NameAssignment_1 ) ) ;
    public final void rule__DiskS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2350:1: ( ( ( rule__DiskS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2351:1: ( ( rule__DiskS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2351:1: ( ( rule__DiskS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2352:2: ( rule__DiskS__NameAssignment_1 )
            {
             before(grammarAccess.getDiskSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2353:2: ( rule__DiskS__NameAssignment_1 )
            // InternalShortDSLParser.g:2353:3: rule__DiskS__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DiskS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiskSAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DiskS__Group__1__Impl"


    // $ANTLR start "rule__DiskS__Group__2"
    // InternalShortDSLParser.g:2361:1: rule__DiskS__Group__2 : rule__DiskS__Group__2__Impl rule__DiskS__Group__3 ;
    public final void rule__DiskS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2365:1: ( rule__DiskS__Group__2__Impl rule__DiskS__Group__3 )
            // InternalShortDSLParser.g:2366:2: rule__DiskS__Group__2__Impl rule__DiskS__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__DiskS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskS__Group__3();

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
    // $ANTLR end "rule__DiskS__Group__2"


    // $ANTLR start "rule__DiskS__Group__2__Impl"
    // InternalShortDSLParser.g:2373:1: rule__DiskS__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__DiskS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2377:1: ( ( LeftParenthesis ) )
            // InternalShortDSLParser.g:2378:1: ( LeftParenthesis )
            {
            // InternalShortDSLParser.g:2378:1: ( LeftParenthesis )
            // InternalShortDSLParser.g:2379:2: LeftParenthesis
            {
             before(grammarAccess.getDiskSAccess().getLeftParenthesisKeyword_2()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getDiskSAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__DiskS__Group__2__Impl"


    // $ANTLR start "rule__DiskS__Group__3"
    // InternalShortDSLParser.g:2388:1: rule__DiskS__Group__3 : rule__DiskS__Group__3__Impl rule__DiskS__Group__4 ;
    public final void rule__DiskS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2392:1: ( rule__DiskS__Group__3__Impl rule__DiskS__Group__4 )
            // InternalShortDSLParser.g:2393:2: rule__DiskS__Group__3__Impl rule__DiskS__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__DiskS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskS__Group__4();

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
    // $ANTLR end "rule__DiskS__Group__3"


    // $ANTLR start "rule__DiskS__Group__3__Impl"
    // InternalShortDSLParser.g:2400:1: rule__DiskS__Group__3__Impl : ( ( rule__DiskS__NSlotsAssignment_3 ) ) ;
    public final void rule__DiskS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2404:1: ( ( ( rule__DiskS__NSlotsAssignment_3 ) ) )
            // InternalShortDSLParser.g:2405:1: ( ( rule__DiskS__NSlotsAssignment_3 ) )
            {
            // InternalShortDSLParser.g:2405:1: ( ( rule__DiskS__NSlotsAssignment_3 ) )
            // InternalShortDSLParser.g:2406:2: ( rule__DiskS__NSlotsAssignment_3 )
            {
             before(grammarAccess.getDiskSAccess().getNSlotsAssignment_3()); 
            // InternalShortDSLParser.g:2407:2: ( rule__DiskS__NSlotsAssignment_3 )
            // InternalShortDSLParser.g:2407:3: rule__DiskS__NSlotsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DiskS__NSlotsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDiskSAccess().getNSlotsAssignment_3()); 

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
    // $ANTLR end "rule__DiskS__Group__3__Impl"


    // $ANTLR start "rule__DiskS__Group__4"
    // InternalShortDSLParser.g:2415:1: rule__DiskS__Group__4 : rule__DiskS__Group__4__Impl rule__DiskS__Group__5 ;
    public final void rule__DiskS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2419:1: ( rule__DiskS__Group__4__Impl rule__DiskS__Group__5 )
            // InternalShortDSLParser.g:2420:2: rule__DiskS__Group__4__Impl rule__DiskS__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__DiskS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskS__Group__5();

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
    // $ANTLR end "rule__DiskS__Group__4"


    // $ANTLR start "rule__DiskS__Group__4__Impl"
    // InternalShortDSLParser.g:2427:1: rule__DiskS__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__DiskS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2431:1: ( ( RightParenthesis ) )
            // InternalShortDSLParser.g:2432:1: ( RightParenthesis )
            {
            // InternalShortDSLParser.g:2432:1: ( RightParenthesis )
            // InternalShortDSLParser.g:2433:2: RightParenthesis
            {
             before(grammarAccess.getDiskSAccess().getRightParenthesisKeyword_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getDiskSAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__DiskS__Group__4__Impl"


    // $ANTLR start "rule__DiskS__Group__5"
    // InternalShortDSLParser.g:2442:1: rule__DiskS__Group__5 : rule__DiskS__Group__5__Impl rule__DiskS__Group__6 ;
    public final void rule__DiskS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2446:1: ( rule__DiskS__Group__5__Impl rule__DiskS__Group__6 )
            // InternalShortDSLParser.g:2447:2: rule__DiskS__Group__5__Impl rule__DiskS__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__DiskS__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskS__Group__6();

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
    // $ANTLR end "rule__DiskS__Group__5"


    // $ANTLR start "rule__DiskS__Group__5__Impl"
    // InternalShortDSLParser.g:2454:1: rule__DiskS__Group__5__Impl : ( Colon ) ;
    public final void rule__DiskS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2458:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2459:1: ( Colon )
            {
            // InternalShortDSLParser.g:2459:1: ( Colon )
            // InternalShortDSLParser.g:2460:2: Colon
            {
             before(grammarAccess.getDiskSAccess().getColonKeyword_5()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getDiskSAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__DiskS__Group__5__Impl"


    // $ANTLR start "rule__DiskS__Group__6"
    // InternalShortDSLParser.g:2469:1: rule__DiskS__Group__6 : rule__DiskS__Group__6__Impl rule__DiskS__Group__7 ;
    public final void rule__DiskS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2473:1: ( rule__DiskS__Group__6__Impl rule__DiskS__Group__7 )
            // InternalShortDSLParser.g:2474:2: rule__DiskS__Group__6__Impl rule__DiskS__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__DiskS__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskS__Group__7();

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
    // $ANTLR end "rule__DiskS__Group__6"


    // $ANTLR start "rule__DiskS__Group__6__Impl"
    // InternalShortDSLParser.g:2481:1: rule__DiskS__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__DiskS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2485:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:2486:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:2486:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:2487:2: RULE_BEGIN
            {
             before(grammarAccess.getDiskSAccess().getBEGINTerminalRuleCall_6()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getDiskSAccess().getBEGINTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__DiskS__Group__6__Impl"


    // $ANTLR start "rule__DiskS__Group__7"
    // InternalShortDSLParser.g:2496:1: rule__DiskS__Group__7 : rule__DiskS__Group__7__Impl rule__DiskS__Group__8 ;
    public final void rule__DiskS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2500:1: ( rule__DiskS__Group__7__Impl rule__DiskS__Group__8 )
            // InternalShortDSLParser.g:2501:2: rule__DiskS__Group__7__Impl rule__DiskS__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__DiskS__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskS__Group__8();

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
    // $ANTLR end "rule__DiskS__Group__7"


    // $ANTLR start "rule__DiskS__Group__7__Impl"
    // InternalShortDSLParser.g:2508:1: rule__DiskS__Group__7__Impl : ( ( ( rule__DiskS__TargetsAssignment_7 ) ) ( ( rule__DiskS__TargetsAssignment_7 )* ) ) ;
    public final void rule__DiskS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2512:1: ( ( ( ( rule__DiskS__TargetsAssignment_7 ) ) ( ( rule__DiskS__TargetsAssignment_7 )* ) ) )
            // InternalShortDSLParser.g:2513:1: ( ( ( rule__DiskS__TargetsAssignment_7 ) ) ( ( rule__DiskS__TargetsAssignment_7 )* ) )
            {
            // InternalShortDSLParser.g:2513:1: ( ( ( rule__DiskS__TargetsAssignment_7 ) ) ( ( rule__DiskS__TargetsAssignment_7 )* ) )
            // InternalShortDSLParser.g:2514:2: ( ( rule__DiskS__TargetsAssignment_7 ) ) ( ( rule__DiskS__TargetsAssignment_7 )* )
            {
            // InternalShortDSLParser.g:2514:2: ( ( rule__DiskS__TargetsAssignment_7 ) )
            // InternalShortDSLParser.g:2515:3: ( rule__DiskS__TargetsAssignment_7 )
            {
             before(grammarAccess.getDiskSAccess().getTargetsAssignment_7()); 
            // InternalShortDSLParser.g:2516:3: ( rule__DiskS__TargetsAssignment_7 )
            // InternalShortDSLParser.g:2516:4: rule__DiskS__TargetsAssignment_7
            {
            pushFollow(FOLLOW_13);
            rule__DiskS__TargetsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDiskSAccess().getTargetsAssignment_7()); 

            }

            // InternalShortDSLParser.g:2519:2: ( ( rule__DiskS__TargetsAssignment_7 )* )
            // InternalShortDSLParser.g:2520:3: ( rule__DiskS__TargetsAssignment_7 )*
            {
             before(grammarAccess.getDiskSAccess().getTargetsAssignment_7()); 
            // InternalShortDSLParser.g:2521:3: ( rule__DiskS__TargetsAssignment_7 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalShortDSLParser.g:2521:4: rule__DiskS__TargetsAssignment_7
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DiskS__TargetsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getDiskSAccess().getTargetsAssignment_7()); 

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
    // $ANTLR end "rule__DiskS__Group__7__Impl"


    // $ANTLR start "rule__DiskS__Group__8"
    // InternalShortDSLParser.g:2530:1: rule__DiskS__Group__8 : rule__DiskS__Group__8__Impl ;
    public final void rule__DiskS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2534:1: ( rule__DiskS__Group__8__Impl )
            // InternalShortDSLParser.g:2535:2: rule__DiskS__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiskS__Group__8__Impl();

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
    // $ANTLR end "rule__DiskS__Group__8"


    // $ANTLR start "rule__DiskS__Group__8__Impl"
    // InternalShortDSLParser.g:2541:1: rule__DiskS__Group__8__Impl : ( RULE_END ) ;
    public final void rule__DiskS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2545:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:2546:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:2546:1: ( RULE_END )
            // InternalShortDSLParser.g:2547:2: RULE_END
            {
             before(grammarAccess.getDiskSAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getDiskSAccess().getENDTerminalRuleCall_8()); 

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
    // $ANTLR end "rule__DiskS__Group__8__Impl"


    // $ANTLR start "rule__DiskZoneS__Group__0"
    // InternalShortDSLParser.g:2557:1: rule__DiskZoneS__Group__0 : rule__DiskZoneS__Group__0__Impl rule__DiskZoneS__Group__1 ;
    public final void rule__DiskZoneS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2561:1: ( rule__DiskZoneS__Group__0__Impl rule__DiskZoneS__Group__1 )
            // InternalShortDSLParser.g:2562:2: rule__DiskZoneS__Group__0__Impl rule__DiskZoneS__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DiskZoneS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskZoneS__Group__1();

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
    // $ANTLR end "rule__DiskZoneS__Group__0"


    // $ANTLR start "rule__DiskZoneS__Group__0__Impl"
    // InternalShortDSLParser.g:2569:1: rule__DiskZoneS__Group__0__Impl : ( () ) ;
    public final void rule__DiskZoneS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2573:1: ( ( () ) )
            // InternalShortDSLParser.g:2574:1: ( () )
            {
            // InternalShortDSLParser.g:2574:1: ( () )
            // InternalShortDSLParser.g:2575:2: ()
            {
             before(grammarAccess.getDiskZoneSAccess().getDiskZoneAction_0()); 
            // InternalShortDSLParser.g:2576:2: ()
            // InternalShortDSLParser.g:2576:3: 
            {
            }

             after(grammarAccess.getDiskZoneSAccess().getDiskZoneAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskZoneS__Group__0__Impl"


    // $ANTLR start "rule__DiskZoneS__Group__1"
    // InternalShortDSLParser.g:2584:1: rule__DiskZoneS__Group__1 : rule__DiskZoneS__Group__1__Impl rule__DiskZoneS__Group__2 ;
    public final void rule__DiskZoneS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2588:1: ( rule__DiskZoneS__Group__1__Impl rule__DiskZoneS__Group__2 )
            // InternalShortDSLParser.g:2589:2: rule__DiskZoneS__Group__1__Impl rule__DiskZoneS__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__DiskZoneS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskZoneS__Group__2();

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
    // $ANTLR end "rule__DiskZoneS__Group__1"


    // $ANTLR start "rule__DiskZoneS__Group__1__Impl"
    // InternalShortDSLParser.g:2596:1: rule__DiskZoneS__Group__1__Impl : ( ( rule__DiskZoneS__NameAssignment_1 ) ) ;
    public final void rule__DiskZoneS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2600:1: ( ( ( rule__DiskZoneS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2601:1: ( ( rule__DiskZoneS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2601:1: ( ( rule__DiskZoneS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2602:2: ( rule__DiskZoneS__NameAssignment_1 )
            {
             before(grammarAccess.getDiskZoneSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2603:2: ( rule__DiskZoneS__NameAssignment_1 )
            // InternalShortDSLParser.g:2603:3: rule__DiskZoneS__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DiskZoneS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiskZoneSAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DiskZoneS__Group__1__Impl"


    // $ANTLR start "rule__DiskZoneS__Group__2"
    // InternalShortDSLParser.g:2611:1: rule__DiskZoneS__Group__2 : rule__DiskZoneS__Group__2__Impl rule__DiskZoneS__Group__3 ;
    public final void rule__DiskZoneS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2615:1: ( rule__DiskZoneS__Group__2__Impl rule__DiskZoneS__Group__3 )
            // InternalShortDSLParser.g:2616:2: rule__DiskZoneS__Group__2__Impl rule__DiskZoneS__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__DiskZoneS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskZoneS__Group__3();

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
    // $ANTLR end "rule__DiskZoneS__Group__2"


    // $ANTLR start "rule__DiskZoneS__Group__2__Impl"
    // InternalShortDSLParser.g:2623:1: rule__DiskZoneS__Group__2__Impl : ( Colon ) ;
    public final void rule__DiskZoneS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2627:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2628:1: ( Colon )
            {
            // InternalShortDSLParser.g:2628:1: ( Colon )
            // InternalShortDSLParser.g:2629:2: Colon
            {
             before(grammarAccess.getDiskZoneSAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getDiskZoneSAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__DiskZoneS__Group__2__Impl"


    // $ANTLR start "rule__DiskZoneS__Group__3"
    // InternalShortDSLParser.g:2638:1: rule__DiskZoneS__Group__3 : rule__DiskZoneS__Group__3__Impl rule__DiskZoneS__Group__4 ;
    public final void rule__DiskZoneS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2642:1: ( rule__DiskZoneS__Group__3__Impl rule__DiskZoneS__Group__4 )
            // InternalShortDSLParser.g:2643:2: rule__DiskZoneS__Group__3__Impl rule__DiskZoneS__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__DiskZoneS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskZoneS__Group__4();

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
    // $ANTLR end "rule__DiskZoneS__Group__3"


    // $ANTLR start "rule__DiskZoneS__Group__3__Impl"
    // InternalShortDSLParser.g:2650:1: rule__DiskZoneS__Group__3__Impl : ( ( rule__DiskZoneS__SlotAssignment_3 ) ) ;
    public final void rule__DiskZoneS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2654:1: ( ( ( rule__DiskZoneS__SlotAssignment_3 ) ) )
            // InternalShortDSLParser.g:2655:1: ( ( rule__DiskZoneS__SlotAssignment_3 ) )
            {
            // InternalShortDSLParser.g:2655:1: ( ( rule__DiskZoneS__SlotAssignment_3 ) )
            // InternalShortDSLParser.g:2656:2: ( rule__DiskZoneS__SlotAssignment_3 )
            {
             before(grammarAccess.getDiskZoneSAccess().getSlotAssignment_3()); 
            // InternalShortDSLParser.g:2657:2: ( rule__DiskZoneS__SlotAssignment_3 )
            // InternalShortDSLParser.g:2657:3: rule__DiskZoneS__SlotAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DiskZoneS__SlotAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDiskZoneSAccess().getSlotAssignment_3()); 

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
    // $ANTLR end "rule__DiskZoneS__Group__3__Impl"


    // $ANTLR start "rule__DiskZoneS__Group__4"
    // InternalShortDSLParser.g:2665:1: rule__DiskZoneS__Group__4 : rule__DiskZoneS__Group__4__Impl ;
    public final void rule__DiskZoneS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2669:1: ( rule__DiskZoneS__Group__4__Impl )
            // InternalShortDSLParser.g:2670:2: rule__DiskZoneS__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiskZoneS__Group__4__Impl();

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
    // $ANTLR end "rule__DiskZoneS__Group__4"


    // $ANTLR start "rule__DiskZoneS__Group__4__Impl"
    // InternalShortDSLParser.g:2676:1: rule__DiskZoneS__Group__4__Impl : ( ( Comma )? ) ;
    public final void rule__DiskZoneS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2680:1: ( ( ( Comma )? ) )
            // InternalShortDSLParser.g:2681:1: ( ( Comma )? )
            {
            // InternalShortDSLParser.g:2681:1: ( ( Comma )? )
            // InternalShortDSLParser.g:2682:2: ( Comma )?
            {
             before(grammarAccess.getDiskZoneSAccess().getCommaKeyword_4()); 
            // InternalShortDSLParser.g:2683:2: ( Comma )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Comma) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalShortDSLParser.g:2683:3: Comma
                    {
                    match(input,Comma,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDiskZoneSAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__DiskZoneS__Group__4__Impl"


    // $ANTLR start "rule__CameraS__Group__0"
    // InternalShortDSLParser.g:2692:1: rule__CameraS__Group__0 : rule__CameraS__Group__0__Impl rule__CameraS__Group__1 ;
    public final void rule__CameraS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2696:1: ( rule__CameraS__Group__0__Impl rule__CameraS__Group__1 )
            // InternalShortDSLParser.g:2697:2: rule__CameraS__Group__0__Impl rule__CameraS__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CameraS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CameraS__Group__1();

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
    // $ANTLR end "rule__CameraS__Group__0"


    // $ANTLR start "rule__CameraS__Group__0__Impl"
    // InternalShortDSLParser.g:2704:1: rule__CameraS__Group__0__Impl : ( () ) ;
    public final void rule__CameraS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2708:1: ( ( () ) )
            // InternalShortDSLParser.g:2709:1: ( () )
            {
            // InternalShortDSLParser.g:2709:1: ( () )
            // InternalShortDSLParser.g:2710:2: ()
            {
             before(grammarAccess.getCameraSAccess().getCameraAction_0()); 
            // InternalShortDSLParser.g:2711:2: ()
            // InternalShortDSLParser.g:2711:3: 
            {
            }

             after(grammarAccess.getCameraSAccess().getCameraAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraS__Group__0__Impl"


    // $ANTLR start "rule__CameraS__Group__1"
    // InternalShortDSLParser.g:2719:1: rule__CameraS__Group__1 : rule__CameraS__Group__1__Impl rule__CameraS__Group__2 ;
    public final void rule__CameraS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2723:1: ( rule__CameraS__Group__1__Impl rule__CameraS__Group__2 )
            // InternalShortDSLParser.g:2724:2: rule__CameraS__Group__1__Impl rule__CameraS__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__CameraS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CameraS__Group__2();

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
    // $ANTLR end "rule__CameraS__Group__1"


    // $ANTLR start "rule__CameraS__Group__1__Impl"
    // InternalShortDSLParser.g:2731:1: rule__CameraS__Group__1__Impl : ( ( rule__CameraS__NameAssignment_1 ) ) ;
    public final void rule__CameraS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2735:1: ( ( ( rule__CameraS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2736:1: ( ( rule__CameraS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2736:1: ( ( rule__CameraS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2737:2: ( rule__CameraS__NameAssignment_1 )
            {
             before(grammarAccess.getCameraSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2738:2: ( rule__CameraS__NameAssignment_1 )
            // InternalShortDSLParser.g:2738:3: rule__CameraS__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CameraS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCameraSAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CameraS__Group__1__Impl"


    // $ANTLR start "rule__CameraS__Group__2"
    // InternalShortDSLParser.g:2746:1: rule__CameraS__Group__2 : rule__CameraS__Group__2__Impl rule__CameraS__Group__3 ;
    public final void rule__CameraS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2750:1: ( rule__CameraS__Group__2__Impl rule__CameraS__Group__3 )
            // InternalShortDSLParser.g:2751:2: rule__CameraS__Group__2__Impl rule__CameraS__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__CameraS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CameraS__Group__3();

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
    // $ANTLR end "rule__CameraS__Group__2"


    // $ANTLR start "rule__CameraS__Group__2__Impl"
    // InternalShortDSLParser.g:2758:1: rule__CameraS__Group__2__Impl : ( Colon ) ;
    public final void rule__CameraS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2762:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2763:1: ( Colon )
            {
            // InternalShortDSLParser.g:2763:1: ( Colon )
            // InternalShortDSLParser.g:2764:2: Colon
            {
             before(grammarAccess.getCameraSAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCameraSAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__CameraS__Group__2__Impl"


    // $ANTLR start "rule__CameraS__Group__3"
    // InternalShortDSLParser.g:2773:1: rule__CameraS__Group__3 : rule__CameraS__Group__3__Impl rule__CameraS__Group__4 ;
    public final void rule__CameraS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2777:1: ( rule__CameraS__Group__3__Impl rule__CameraS__Group__4 )
            // InternalShortDSLParser.g:2778:2: rule__CameraS__Group__3__Impl rule__CameraS__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__CameraS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CameraS__Group__4();

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
    // $ANTLR end "rule__CameraS__Group__3"


    // $ANTLR start "rule__CameraS__Group__3__Impl"
    // InternalShortDSLParser.g:2785:1: rule__CameraS__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__CameraS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2789:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:2790:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:2790:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:2791:2: RULE_BEGIN
            {
             before(grammarAccess.getCameraSAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getCameraSAccess().getBEGINTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__CameraS__Group__3__Impl"


    // $ANTLR start "rule__CameraS__Group__4"
    // InternalShortDSLParser.g:2800:1: rule__CameraS__Group__4 : rule__CameraS__Group__4__Impl rule__CameraS__Group__5 ;
    public final void rule__CameraS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2804:1: ( rule__CameraS__Group__4__Impl rule__CameraS__Group__5 )
            // InternalShortDSLParser.g:2805:2: rule__CameraS__Group__4__Impl rule__CameraS__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__CameraS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CameraS__Group__5();

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
    // $ANTLR end "rule__CameraS__Group__4"


    // $ANTLR start "rule__CameraS__Group__4__Impl"
    // InternalShortDSLParser.g:2812:1: rule__CameraS__Group__4__Impl : ( ( ( rule__CameraS__TargetsAssignment_4 ) ) ( ( rule__CameraS__TargetsAssignment_4 )* ) ) ;
    public final void rule__CameraS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2816:1: ( ( ( ( rule__CameraS__TargetsAssignment_4 ) ) ( ( rule__CameraS__TargetsAssignment_4 )* ) ) )
            // InternalShortDSLParser.g:2817:1: ( ( ( rule__CameraS__TargetsAssignment_4 ) ) ( ( rule__CameraS__TargetsAssignment_4 )* ) )
            {
            // InternalShortDSLParser.g:2817:1: ( ( ( rule__CameraS__TargetsAssignment_4 ) ) ( ( rule__CameraS__TargetsAssignment_4 )* ) )
            // InternalShortDSLParser.g:2818:2: ( ( rule__CameraS__TargetsAssignment_4 ) ) ( ( rule__CameraS__TargetsAssignment_4 )* )
            {
            // InternalShortDSLParser.g:2818:2: ( ( rule__CameraS__TargetsAssignment_4 ) )
            // InternalShortDSLParser.g:2819:3: ( rule__CameraS__TargetsAssignment_4 )
            {
             before(grammarAccess.getCameraSAccess().getTargetsAssignment_4()); 
            // InternalShortDSLParser.g:2820:3: ( rule__CameraS__TargetsAssignment_4 )
            // InternalShortDSLParser.g:2820:4: rule__CameraS__TargetsAssignment_4
            {
            pushFollow(FOLLOW_21);
            rule__CameraS__TargetsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCameraSAccess().getTargetsAssignment_4()); 

            }

            // InternalShortDSLParser.g:2823:2: ( ( rule__CameraS__TargetsAssignment_4 )* )
            // InternalShortDSLParser.g:2824:3: ( rule__CameraS__TargetsAssignment_4 )*
            {
             before(grammarAccess.getCameraSAccess().getTargetsAssignment_4()); 
            // InternalShortDSLParser.g:2825:3: ( rule__CameraS__TargetsAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Green||LA25_0==Blue||LA25_0==Red) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalShortDSLParser.g:2825:4: rule__CameraS__TargetsAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__CameraS__TargetsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getCameraSAccess().getTargetsAssignment_4()); 

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
    // $ANTLR end "rule__CameraS__Group__4__Impl"


    // $ANTLR start "rule__CameraS__Group__5"
    // InternalShortDSLParser.g:2834:1: rule__CameraS__Group__5 : rule__CameraS__Group__5__Impl ;
    public final void rule__CameraS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2838:1: ( rule__CameraS__Group__5__Impl )
            // InternalShortDSLParser.g:2839:2: rule__CameraS__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CameraS__Group__5__Impl();

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
    // $ANTLR end "rule__CameraS__Group__5"


    // $ANTLR start "rule__CameraS__Group__5__Impl"
    // InternalShortDSLParser.g:2845:1: rule__CameraS__Group__5__Impl : ( RULE_END ) ;
    public final void rule__CameraS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2849:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:2850:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:2850:1: ( RULE_END )
            // InternalShortDSLParser.g:2851:2: RULE_END
            {
             before(grammarAccess.getCameraSAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getCameraSAccess().getENDTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__CameraS__Group__5__Impl"


    // $ANTLR start "rule__CameraColorS__Group__0"
    // InternalShortDSLParser.g:2861:1: rule__CameraColorS__Group__0 : rule__CameraColorS__Group__0__Impl rule__CameraColorS__Group__1 ;
    public final void rule__CameraColorS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2865:1: ( rule__CameraColorS__Group__0__Impl rule__CameraColorS__Group__1 )
            // InternalShortDSLParser.g:2866:2: rule__CameraColorS__Group__0__Impl rule__CameraColorS__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__CameraColorS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CameraColorS__Group__1();

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
    // $ANTLR end "rule__CameraColorS__Group__0"


    // $ANTLR start "rule__CameraColorS__Group__0__Impl"
    // InternalShortDSLParser.g:2873:1: rule__CameraColorS__Group__0__Impl : ( () ) ;
    public final void rule__CameraColorS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2877:1: ( ( () ) )
            // InternalShortDSLParser.g:2878:1: ( () )
            {
            // InternalShortDSLParser.g:2878:1: ( () )
            // InternalShortDSLParser.g:2879:2: ()
            {
             before(grammarAccess.getCameraColorSAccess().getCameraColorAction_0()); 
            // InternalShortDSLParser.g:2880:2: ()
            // InternalShortDSLParser.g:2880:3: 
            {
            }

             after(grammarAccess.getCameraColorSAccess().getCameraColorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraColorS__Group__0__Impl"


    // $ANTLR start "rule__CameraColorS__Group__1"
    // InternalShortDSLParser.g:2888:1: rule__CameraColorS__Group__1 : rule__CameraColorS__Group__1__Impl rule__CameraColorS__Group__2 ;
    public final void rule__CameraColorS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2892:1: ( rule__CameraColorS__Group__1__Impl rule__CameraColorS__Group__2 )
            // InternalShortDSLParser.g:2893:2: rule__CameraColorS__Group__1__Impl rule__CameraColorS__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__CameraColorS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CameraColorS__Group__2();

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
    // $ANTLR end "rule__CameraColorS__Group__1"


    // $ANTLR start "rule__CameraColorS__Group__1__Impl"
    // InternalShortDSLParser.g:2900:1: rule__CameraColorS__Group__1__Impl : ( ( rule__CameraColorS__ColorAssignment_1 ) ) ;
    public final void rule__CameraColorS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2904:1: ( ( ( rule__CameraColorS__ColorAssignment_1 ) ) )
            // InternalShortDSLParser.g:2905:1: ( ( rule__CameraColorS__ColorAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2905:1: ( ( rule__CameraColorS__ColorAssignment_1 ) )
            // InternalShortDSLParser.g:2906:2: ( rule__CameraColorS__ColorAssignment_1 )
            {
             before(grammarAccess.getCameraColorSAccess().getColorAssignment_1()); 
            // InternalShortDSLParser.g:2907:2: ( rule__CameraColorS__ColorAssignment_1 )
            // InternalShortDSLParser.g:2907:3: rule__CameraColorS__ColorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CameraColorS__ColorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCameraColorSAccess().getColorAssignment_1()); 

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
    // $ANTLR end "rule__CameraColorS__Group__1__Impl"


    // $ANTLR start "rule__CameraColorS__Group__2"
    // InternalShortDSLParser.g:2915:1: rule__CameraColorS__Group__2 : rule__CameraColorS__Group__2__Impl ;
    public final void rule__CameraColorS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2919:1: ( rule__CameraColorS__Group__2__Impl )
            // InternalShortDSLParser.g:2920:2: rule__CameraColorS__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CameraColorS__Group__2__Impl();

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
    // $ANTLR end "rule__CameraColorS__Group__2"


    // $ANTLR start "rule__CameraColorS__Group__2__Impl"
    // InternalShortDSLParser.g:2926:1: rule__CameraColorS__Group__2__Impl : ( ( Comma )? ) ;
    public final void rule__CameraColorS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2930:1: ( ( ( Comma )? ) )
            // InternalShortDSLParser.g:2931:1: ( ( Comma )? )
            {
            // InternalShortDSLParser.g:2931:1: ( ( Comma )? )
            // InternalShortDSLParser.g:2932:2: ( Comma )?
            {
             before(grammarAccess.getCameraColorSAccess().getCommaKeyword_2()); 
            // InternalShortDSLParser.g:2933:2: ( Comma )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Comma) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalShortDSLParser.g:2933:3: Comma
                    {
                    match(input,Comma,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCameraColorSAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__CameraColorS__Group__2__Impl"


    // $ANTLR start "rule__DiskHandlingS__Group__0"
    // InternalShortDSLParser.g:2942:1: rule__DiskHandlingS__Group__0 : rule__DiskHandlingS__Group__0__Impl rule__DiskHandlingS__Group__1 ;
    public final void rule__DiskHandlingS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2946:1: ( rule__DiskHandlingS__Group__0__Impl rule__DiskHandlingS__Group__1 )
            // InternalShortDSLParser.g:2947:2: rule__DiskHandlingS__Group__0__Impl rule__DiskHandlingS__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DiskHandlingS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskHandlingS__Group__1();

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
    // $ANTLR end "rule__DiskHandlingS__Group__0"


    // $ANTLR start "rule__DiskHandlingS__Group__0__Impl"
    // InternalShortDSLParser.g:2954:1: rule__DiskHandlingS__Group__0__Impl : ( Handle ) ;
    public final void rule__DiskHandlingS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2958:1: ( ( Handle ) )
            // InternalShortDSLParser.g:2959:1: ( Handle )
            {
            // InternalShortDSLParser.g:2959:1: ( Handle )
            // InternalShortDSLParser.g:2960:2: Handle
            {
             before(grammarAccess.getDiskHandlingSAccess().getHandleKeyword_0()); 
            match(input,Handle,FOLLOW_2); 
             after(grammarAccess.getDiskHandlingSAccess().getHandleKeyword_0()); 

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
    // $ANTLR end "rule__DiskHandlingS__Group__0__Impl"


    // $ANTLR start "rule__DiskHandlingS__Group__1"
    // InternalShortDSLParser.g:2969:1: rule__DiskHandlingS__Group__1 : rule__DiskHandlingS__Group__1__Impl rule__DiskHandlingS__Group__2 ;
    public final void rule__DiskHandlingS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2973:1: ( rule__DiskHandlingS__Group__1__Impl rule__DiskHandlingS__Group__2 )
            // InternalShortDSLParser.g:2974:2: rule__DiskHandlingS__Group__1__Impl rule__DiskHandlingS__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DiskHandlingS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskHandlingS__Group__2();

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
    // $ANTLR end "rule__DiskHandlingS__Group__1"


    // $ANTLR start "rule__DiskHandlingS__Group__1__Impl"
    // InternalShortDSLParser.g:2981:1: rule__DiskHandlingS__Group__1__Impl : ( ( rule__DiskHandlingS__DiskAssignment_1 ) ) ;
    public final void rule__DiskHandlingS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2985:1: ( ( ( rule__DiskHandlingS__DiskAssignment_1 ) ) )
            // InternalShortDSLParser.g:2986:1: ( ( rule__DiskHandlingS__DiskAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2986:1: ( ( rule__DiskHandlingS__DiskAssignment_1 ) )
            // InternalShortDSLParser.g:2987:2: ( rule__DiskHandlingS__DiskAssignment_1 )
            {
             before(grammarAccess.getDiskHandlingSAccess().getDiskAssignment_1()); 
            // InternalShortDSLParser.g:2988:2: ( rule__DiskHandlingS__DiskAssignment_1 )
            // InternalShortDSLParser.g:2988:3: rule__DiskHandlingS__DiskAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DiskHandlingS__DiskAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiskHandlingSAccess().getDiskAssignment_1()); 

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
    // $ANTLR end "rule__DiskHandlingS__Group__1__Impl"


    // $ANTLR start "rule__DiskHandlingS__Group__2"
    // InternalShortDSLParser.g:2996:1: rule__DiskHandlingS__Group__2 : rule__DiskHandlingS__Group__2__Impl rule__DiskHandlingS__Group__3 ;
    public final void rule__DiskHandlingS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3000:1: ( rule__DiskHandlingS__Group__2__Impl rule__DiskHandlingS__Group__3 )
            // InternalShortDSLParser.g:3001:2: rule__DiskHandlingS__Group__2__Impl rule__DiskHandlingS__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__DiskHandlingS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskHandlingS__Group__3();

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
    // $ANTLR end "rule__DiskHandlingS__Group__2"


    // $ANTLR start "rule__DiskHandlingS__Group__2__Impl"
    // InternalShortDSLParser.g:3008:1: rule__DiskHandlingS__Group__2__Impl : ( LeftCurlyBracket ) ;
    public final void rule__DiskHandlingS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3012:1: ( ( LeftCurlyBracket ) )
            // InternalShortDSLParser.g:3013:1: ( LeftCurlyBracket )
            {
            // InternalShortDSLParser.g:3013:1: ( LeftCurlyBracket )
            // InternalShortDSLParser.g:3014:2: LeftCurlyBracket
            {
             before(grammarAccess.getDiskHandlingSAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getDiskHandlingSAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DiskHandlingS__Group__2__Impl"


    // $ANTLR start "rule__DiskHandlingS__Group__3"
    // InternalShortDSLParser.g:3023:1: rule__DiskHandlingS__Group__3 : rule__DiskHandlingS__Group__3__Impl rule__DiskHandlingS__Group__4 ;
    public final void rule__DiskHandlingS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3027:1: ( rule__DiskHandlingS__Group__3__Impl rule__DiskHandlingS__Group__4 )
            // InternalShortDSLParser.g:3028:2: rule__DiskHandlingS__Group__3__Impl rule__DiskHandlingS__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__DiskHandlingS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskHandlingS__Group__4();

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
    // $ANTLR end "rule__DiskHandlingS__Group__3"


    // $ANTLR start "rule__DiskHandlingS__Group__3__Impl"
    // InternalShortDSLParser.g:3035:1: rule__DiskHandlingS__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__DiskHandlingS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3039:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:3040:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:3040:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:3041:2: RULE_BEGIN
            {
             before(grammarAccess.getDiskHandlingSAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getDiskHandlingSAccess().getBEGINTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__DiskHandlingS__Group__3__Impl"


    // $ANTLR start "rule__DiskHandlingS__Group__4"
    // InternalShortDSLParser.g:3050:1: rule__DiskHandlingS__Group__4 : rule__DiskHandlingS__Group__4__Impl rule__DiskHandlingS__Group__5 ;
    public final void rule__DiskHandlingS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3054:1: ( rule__DiskHandlingS__Group__4__Impl rule__DiskHandlingS__Group__5 )
            // InternalShortDSLParser.g:3055:2: rule__DiskHandlingS__Group__4__Impl rule__DiskHandlingS__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__DiskHandlingS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskHandlingS__Group__5();

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
    // $ANTLR end "rule__DiskHandlingS__Group__4"


    // $ANTLR start "rule__DiskHandlingS__Group__4__Impl"
    // InternalShortDSLParser.g:3062:1: rule__DiskHandlingS__Group__4__Impl : ( ( ( rule__DiskHandlingS__StatementsAssignment_4 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_4 )* ) ) ;
    public final void rule__DiskHandlingS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3066:1: ( ( ( ( rule__DiskHandlingS__StatementsAssignment_4 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_4 )* ) ) )
            // InternalShortDSLParser.g:3067:1: ( ( ( rule__DiskHandlingS__StatementsAssignment_4 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_4 )* ) )
            {
            // InternalShortDSLParser.g:3067:1: ( ( ( rule__DiskHandlingS__StatementsAssignment_4 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_4 )* ) )
            // InternalShortDSLParser.g:3068:2: ( ( rule__DiskHandlingS__StatementsAssignment_4 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_4 )* )
            {
            // InternalShortDSLParser.g:3068:2: ( ( rule__DiskHandlingS__StatementsAssignment_4 ) )
            // InternalShortDSLParser.g:3069:3: ( rule__DiskHandlingS__StatementsAssignment_4 )
            {
             before(grammarAccess.getDiskHandlingSAccess().getStatementsAssignment_4()); 
            // InternalShortDSLParser.g:3070:3: ( rule__DiskHandlingS__StatementsAssignment_4 )
            // InternalShortDSLParser.g:3070:4: rule__DiskHandlingS__StatementsAssignment_4
            {
            pushFollow(FOLLOW_23);
            rule__DiskHandlingS__StatementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDiskHandlingSAccess().getStatementsAssignment_4()); 

            }

            // InternalShortDSLParser.g:3073:2: ( ( rule__DiskHandlingS__StatementsAssignment_4 )* )
            // InternalShortDSLParser.g:3074:3: ( rule__DiskHandlingS__StatementsAssignment_4 )*
            {
             before(grammarAccess.getDiskHandlingSAccess().getStatementsAssignment_4()); 
            // InternalShortDSLParser.g:3075:3: ( rule__DiskHandlingS__StatementsAssignment_4 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=In_progress && LA27_0<=Complete)||LA27_0==Foreach||(LA27_0>=Pickup && LA27_0<=Vacant)||LA27_0==Drop||LA27_0==If||LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalShortDSLParser.g:3075:4: rule__DiskHandlingS__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__DiskHandlingS__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getDiskHandlingSAccess().getStatementsAssignment_4()); 

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
    // $ANTLR end "rule__DiskHandlingS__Group__4__Impl"


    // $ANTLR start "rule__DiskHandlingS__Group__5"
    // InternalShortDSLParser.g:3084:1: rule__DiskHandlingS__Group__5 : rule__DiskHandlingS__Group__5__Impl rule__DiskHandlingS__Group__6 ;
    public final void rule__DiskHandlingS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3088:1: ( rule__DiskHandlingS__Group__5__Impl rule__DiskHandlingS__Group__6 )
            // InternalShortDSLParser.g:3089:2: rule__DiskHandlingS__Group__5__Impl rule__DiskHandlingS__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__DiskHandlingS__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskHandlingS__Group__6();

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
    // $ANTLR end "rule__DiskHandlingS__Group__5"


    // $ANTLR start "rule__DiskHandlingS__Group__5__Impl"
    // InternalShortDSLParser.g:3096:1: rule__DiskHandlingS__Group__5__Impl : ( RULE_END ) ;
    public final void rule__DiskHandlingS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3100:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:3101:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:3101:1: ( RULE_END )
            // InternalShortDSLParser.g:3102:2: RULE_END
            {
             before(grammarAccess.getDiskHandlingSAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getDiskHandlingSAccess().getENDTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__DiskHandlingS__Group__5__Impl"


    // $ANTLR start "rule__DiskHandlingS__Group__6"
    // InternalShortDSLParser.g:3111:1: rule__DiskHandlingS__Group__6 : rule__DiskHandlingS__Group__6__Impl ;
    public final void rule__DiskHandlingS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3115:1: ( rule__DiskHandlingS__Group__6__Impl )
            // InternalShortDSLParser.g:3116:2: rule__DiskHandlingS__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiskHandlingS__Group__6__Impl();

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
    // $ANTLR end "rule__DiskHandlingS__Group__6"


    // $ANTLR start "rule__DiskHandlingS__Group__6__Impl"
    // InternalShortDSLParser.g:3122:1: rule__DiskHandlingS__Group__6__Impl : ( RightCurlyBracket ) ;
    public final void rule__DiskHandlingS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3126:1: ( ( RightCurlyBracket ) )
            // InternalShortDSLParser.g:3127:1: ( RightCurlyBracket )
            {
            // InternalShortDSLParser.g:3127:1: ( RightCurlyBracket )
            // InternalShortDSLParser.g:3128:2: RightCurlyBracket
            {
             before(grammarAccess.getDiskHandlingSAccess().getRightCurlyBracketKeyword_6()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getDiskHandlingSAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__DiskHandlingS__Group__6__Impl"


    // $ANTLR start "rule__LoopS__Group__0"
    // InternalShortDSLParser.g:3138:1: rule__LoopS__Group__0 : rule__LoopS__Group__0__Impl rule__LoopS__Group__1 ;
    public final void rule__LoopS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3142:1: ( rule__LoopS__Group__0__Impl rule__LoopS__Group__1 )
            // InternalShortDSLParser.g:3143:2: rule__LoopS__Group__0__Impl rule__LoopS__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__LoopS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopS__Group__1();

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
    // $ANTLR end "rule__LoopS__Group__0"


    // $ANTLR start "rule__LoopS__Group__0__Impl"
    // InternalShortDSLParser.g:3150:1: rule__LoopS__Group__0__Impl : ( () ) ;
    public final void rule__LoopS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3154:1: ( ( () ) )
            // InternalShortDSLParser.g:3155:1: ( () )
            {
            // InternalShortDSLParser.g:3155:1: ( () )
            // InternalShortDSLParser.g:3156:2: ()
            {
             before(grammarAccess.getLoopSAccess().getLoopAction_0()); 
            // InternalShortDSLParser.g:3157:2: ()
            // InternalShortDSLParser.g:3157:3: 
            {
            }

             after(grammarAccess.getLoopSAccess().getLoopAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopS__Group__0__Impl"


    // $ANTLR start "rule__LoopS__Group__1"
    // InternalShortDSLParser.g:3165:1: rule__LoopS__Group__1 : rule__LoopS__Group__1__Impl rule__LoopS__Group__2 ;
    public final void rule__LoopS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3169:1: ( rule__LoopS__Group__1__Impl rule__LoopS__Group__2 )
            // InternalShortDSLParser.g:3170:2: rule__LoopS__Group__1__Impl rule__LoopS__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__LoopS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopS__Group__2();

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
    // $ANTLR end "rule__LoopS__Group__1"


    // $ANTLR start "rule__LoopS__Group__1__Impl"
    // InternalShortDSLParser.g:3177:1: rule__LoopS__Group__1__Impl : ( Foreach ) ;
    public final void rule__LoopS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3181:1: ( ( Foreach ) )
            // InternalShortDSLParser.g:3182:1: ( Foreach )
            {
            // InternalShortDSLParser.g:3182:1: ( Foreach )
            // InternalShortDSLParser.g:3183:2: Foreach
            {
             before(grammarAccess.getLoopSAccess().getForeachKeyword_1()); 
            match(input,Foreach,FOLLOW_2); 
             after(grammarAccess.getLoopSAccess().getForeachKeyword_1()); 

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
    // $ANTLR end "rule__LoopS__Group__1__Impl"


    // $ANTLR start "rule__LoopS__Group__2"
    // InternalShortDSLParser.g:3192:1: rule__LoopS__Group__2 : rule__LoopS__Group__2__Impl rule__LoopS__Group__3 ;
    public final void rule__LoopS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3196:1: ( rule__LoopS__Group__2__Impl rule__LoopS__Group__3 )
            // InternalShortDSLParser.g:3197:2: rule__LoopS__Group__2__Impl rule__LoopS__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__LoopS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopS__Group__3();

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
    // $ANTLR end "rule__LoopS__Group__2"


    // $ANTLR start "rule__LoopS__Group__2__Impl"
    // InternalShortDSLParser.g:3204:1: rule__LoopS__Group__2__Impl : ( ( rule__LoopS__VariableAssignment_2 ) ) ;
    public final void rule__LoopS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3208:1: ( ( ( rule__LoopS__VariableAssignment_2 ) ) )
            // InternalShortDSLParser.g:3209:1: ( ( rule__LoopS__VariableAssignment_2 ) )
            {
            // InternalShortDSLParser.g:3209:1: ( ( rule__LoopS__VariableAssignment_2 ) )
            // InternalShortDSLParser.g:3210:2: ( rule__LoopS__VariableAssignment_2 )
            {
             before(grammarAccess.getLoopSAccess().getVariableAssignment_2()); 
            // InternalShortDSLParser.g:3211:2: ( rule__LoopS__VariableAssignment_2 )
            // InternalShortDSLParser.g:3211:3: rule__LoopS__VariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LoopS__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopSAccess().getVariableAssignment_2()); 

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
    // $ANTLR end "rule__LoopS__Group__2__Impl"


    // $ANTLR start "rule__LoopS__Group__3"
    // InternalShortDSLParser.g:3219:1: rule__LoopS__Group__3 : rule__LoopS__Group__3__Impl rule__LoopS__Group__4 ;
    public final void rule__LoopS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3223:1: ( rule__LoopS__Group__3__Impl rule__LoopS__Group__4 )
            // InternalShortDSLParser.g:3224:2: rule__LoopS__Group__3__Impl rule__LoopS__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__LoopS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopS__Group__4();

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
    // $ANTLR end "rule__LoopS__Group__3"


    // $ANTLR start "rule__LoopS__Group__3__Impl"
    // InternalShortDSLParser.g:3231:1: rule__LoopS__Group__3__Impl : ( ( rule__LoopS__ComparisonOperatorAssignment_3 ) ) ;
    public final void rule__LoopS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3235:1: ( ( ( rule__LoopS__ComparisonOperatorAssignment_3 ) ) )
            // InternalShortDSLParser.g:3236:1: ( ( rule__LoopS__ComparisonOperatorAssignment_3 ) )
            {
            // InternalShortDSLParser.g:3236:1: ( ( rule__LoopS__ComparisonOperatorAssignment_3 ) )
            // InternalShortDSLParser.g:3237:2: ( rule__LoopS__ComparisonOperatorAssignment_3 )
            {
             before(grammarAccess.getLoopSAccess().getComparisonOperatorAssignment_3()); 
            // InternalShortDSLParser.g:3238:2: ( rule__LoopS__ComparisonOperatorAssignment_3 )
            // InternalShortDSLParser.g:3238:3: rule__LoopS__ComparisonOperatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LoopS__ComparisonOperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLoopSAccess().getComparisonOperatorAssignment_3()); 

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
    // $ANTLR end "rule__LoopS__Group__3__Impl"


    // $ANTLR start "rule__LoopS__Group__4"
    // InternalShortDSLParser.g:3246:1: rule__LoopS__Group__4 : rule__LoopS__Group__4__Impl rule__LoopS__Group__5 ;
    public final void rule__LoopS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3250:1: ( rule__LoopS__Group__4__Impl rule__LoopS__Group__5 )
            // InternalShortDSLParser.g:3251:2: rule__LoopS__Group__4__Impl rule__LoopS__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__LoopS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopS__Group__5();

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
    // $ANTLR end "rule__LoopS__Group__4"


    // $ANTLR start "rule__LoopS__Group__4__Impl"
    // InternalShortDSLParser.g:3258:1: rule__LoopS__Group__4__Impl : ( ( rule__LoopS__SlotStateAssignment_4 ) ) ;
    public final void rule__LoopS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3262:1: ( ( ( rule__LoopS__SlotStateAssignment_4 ) ) )
            // InternalShortDSLParser.g:3263:1: ( ( rule__LoopS__SlotStateAssignment_4 ) )
            {
            // InternalShortDSLParser.g:3263:1: ( ( rule__LoopS__SlotStateAssignment_4 ) )
            // InternalShortDSLParser.g:3264:2: ( rule__LoopS__SlotStateAssignment_4 )
            {
             before(grammarAccess.getLoopSAccess().getSlotStateAssignment_4()); 
            // InternalShortDSLParser.g:3265:2: ( rule__LoopS__SlotStateAssignment_4 )
            // InternalShortDSLParser.g:3265:3: rule__LoopS__SlotStateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LoopS__SlotStateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLoopSAccess().getSlotStateAssignment_4()); 

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
    // $ANTLR end "rule__LoopS__Group__4__Impl"


    // $ANTLR start "rule__LoopS__Group__5"
    // InternalShortDSLParser.g:3273:1: rule__LoopS__Group__5 : rule__LoopS__Group__5__Impl rule__LoopS__Group__6 ;
    public final void rule__LoopS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3277:1: ( rule__LoopS__Group__5__Impl rule__LoopS__Group__6 )
            // InternalShortDSLParser.g:3278:2: rule__LoopS__Group__5__Impl rule__LoopS__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__LoopS__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopS__Group__6();

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
    // $ANTLR end "rule__LoopS__Group__5"


    // $ANTLR start "rule__LoopS__Group__5__Impl"
    // InternalShortDSLParser.g:3285:1: rule__LoopS__Group__5__Impl : ( Colon ) ;
    public final void rule__LoopS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3289:1: ( ( Colon ) )
            // InternalShortDSLParser.g:3290:1: ( Colon )
            {
            // InternalShortDSLParser.g:3290:1: ( Colon )
            // InternalShortDSLParser.g:3291:2: Colon
            {
             before(grammarAccess.getLoopSAccess().getColonKeyword_5()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getLoopSAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__LoopS__Group__5__Impl"


    // $ANTLR start "rule__LoopS__Group__6"
    // InternalShortDSLParser.g:3300:1: rule__LoopS__Group__6 : rule__LoopS__Group__6__Impl rule__LoopS__Group__7 ;
    public final void rule__LoopS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3304:1: ( rule__LoopS__Group__6__Impl rule__LoopS__Group__7 )
            // InternalShortDSLParser.g:3305:2: rule__LoopS__Group__6__Impl rule__LoopS__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__LoopS__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopS__Group__7();

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
    // $ANTLR end "rule__LoopS__Group__6"


    // $ANTLR start "rule__LoopS__Group__6__Impl"
    // InternalShortDSLParser.g:3312:1: rule__LoopS__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__LoopS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3316:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:3317:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:3317:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:3318:2: RULE_BEGIN
            {
             before(grammarAccess.getLoopSAccess().getBEGINTerminalRuleCall_6()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getLoopSAccess().getBEGINTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__LoopS__Group__6__Impl"


    // $ANTLR start "rule__LoopS__Group__7"
    // InternalShortDSLParser.g:3327:1: rule__LoopS__Group__7 : rule__LoopS__Group__7__Impl rule__LoopS__Group__8 ;
    public final void rule__LoopS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3331:1: ( rule__LoopS__Group__7__Impl rule__LoopS__Group__8 )
            // InternalShortDSLParser.g:3332:2: rule__LoopS__Group__7__Impl rule__LoopS__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__LoopS__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopS__Group__8();

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
    // $ANTLR end "rule__LoopS__Group__7"


    // $ANTLR start "rule__LoopS__Group__7__Impl"
    // InternalShortDSLParser.g:3339:1: rule__LoopS__Group__7__Impl : ( ( rule__LoopS__StatementsAssignment_7 )* ) ;
    public final void rule__LoopS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3343:1: ( ( ( rule__LoopS__StatementsAssignment_7 )* ) )
            // InternalShortDSLParser.g:3344:1: ( ( rule__LoopS__StatementsAssignment_7 )* )
            {
            // InternalShortDSLParser.g:3344:1: ( ( rule__LoopS__StatementsAssignment_7 )* )
            // InternalShortDSLParser.g:3345:2: ( rule__LoopS__StatementsAssignment_7 )*
            {
             before(grammarAccess.getLoopSAccess().getStatementsAssignment_7()); 
            // InternalShortDSLParser.g:3346:2: ( rule__LoopS__StatementsAssignment_7 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=In_progress && LA28_0<=Complete)||LA28_0==Foreach||(LA28_0>=Pickup && LA28_0<=Vacant)||LA28_0==Drop||LA28_0==If||LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalShortDSLParser.g:3346:3: rule__LoopS__StatementsAssignment_7
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__LoopS__StatementsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getLoopSAccess().getStatementsAssignment_7()); 

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
    // $ANTLR end "rule__LoopS__Group__7__Impl"


    // $ANTLR start "rule__LoopS__Group__8"
    // InternalShortDSLParser.g:3354:1: rule__LoopS__Group__8 : rule__LoopS__Group__8__Impl ;
    public final void rule__LoopS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3358:1: ( rule__LoopS__Group__8__Impl )
            // InternalShortDSLParser.g:3359:2: rule__LoopS__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopS__Group__8__Impl();

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
    // $ANTLR end "rule__LoopS__Group__8"


    // $ANTLR start "rule__LoopS__Group__8__Impl"
    // InternalShortDSLParser.g:3365:1: rule__LoopS__Group__8__Impl : ( RULE_END ) ;
    public final void rule__LoopS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3369:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:3370:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:3370:1: ( RULE_END )
            // InternalShortDSLParser.g:3371:2: RULE_END
            {
             before(grammarAccess.getLoopSAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getLoopSAccess().getENDTerminalRuleCall_8()); 

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
    // $ANTLR end "rule__LoopS__Group__8__Impl"


    // $ANTLR start "rule__MoveDiskS__Group__0"
    // InternalShortDSLParser.g:3381:1: rule__MoveDiskS__Group__0 : rule__MoveDiskS__Group__0__Impl rule__MoveDiskS__Group__1 ;
    public final void rule__MoveDiskS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3385:1: ( rule__MoveDiskS__Group__0__Impl rule__MoveDiskS__Group__1 )
            // InternalShortDSLParser.g:3386:2: rule__MoveDiskS__Group__0__Impl rule__MoveDiskS__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MoveDiskS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveDiskS__Group__1();

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
    // $ANTLR end "rule__MoveDiskS__Group__0"


    // $ANTLR start "rule__MoveDiskS__Group__0__Impl"
    // InternalShortDSLParser.g:3393:1: rule__MoveDiskS__Group__0__Impl : ( () ) ;
    public final void rule__MoveDiskS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3397:1: ( ( () ) )
            // InternalShortDSLParser.g:3398:1: ( () )
            {
            // InternalShortDSLParser.g:3398:1: ( () )
            // InternalShortDSLParser.g:3399:2: ()
            {
             before(grammarAccess.getMoveDiskSAccess().getMoveDiskAction_0()); 
            // InternalShortDSLParser.g:3400:2: ()
            // InternalShortDSLParser.g:3400:3: 
            {
            }

             after(grammarAccess.getMoveDiskSAccess().getMoveDiskAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveDiskS__Group__0__Impl"


    // $ANTLR start "rule__MoveDiskS__Group__1"
    // InternalShortDSLParser.g:3408:1: rule__MoveDiskS__Group__1 : rule__MoveDiskS__Group__1__Impl rule__MoveDiskS__Group__2 ;
    public final void rule__MoveDiskS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3412:1: ( rule__MoveDiskS__Group__1__Impl rule__MoveDiskS__Group__2 )
            // InternalShortDSLParser.g:3413:2: rule__MoveDiskS__Group__1__Impl rule__MoveDiskS__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__MoveDiskS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveDiskS__Group__2();

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
    // $ANTLR end "rule__MoveDiskS__Group__1"


    // $ANTLR start "rule__MoveDiskS__Group__1__Impl"
    // InternalShortDSLParser.g:3420:1: rule__MoveDiskS__Group__1__Impl : ( ( rule__MoveDiskS__SlotAssignment_1 ) ) ;
    public final void rule__MoveDiskS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3424:1: ( ( ( rule__MoveDiskS__SlotAssignment_1 ) ) )
            // InternalShortDSLParser.g:3425:1: ( ( rule__MoveDiskS__SlotAssignment_1 ) )
            {
            // InternalShortDSLParser.g:3425:1: ( ( rule__MoveDiskS__SlotAssignment_1 ) )
            // InternalShortDSLParser.g:3426:2: ( rule__MoveDiskS__SlotAssignment_1 )
            {
             before(grammarAccess.getMoveDiskSAccess().getSlotAssignment_1()); 
            // InternalShortDSLParser.g:3427:2: ( rule__MoveDiskS__SlotAssignment_1 )
            // InternalShortDSLParser.g:3427:3: rule__MoveDiskS__SlotAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveDiskS__SlotAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveDiskSAccess().getSlotAssignment_1()); 

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
    // $ANTLR end "rule__MoveDiskS__Group__1__Impl"


    // $ANTLR start "rule__MoveDiskS__Group__2"
    // InternalShortDSLParser.g:3435:1: rule__MoveDiskS__Group__2 : rule__MoveDiskS__Group__2__Impl rule__MoveDiskS__Group__3 ;
    public final void rule__MoveDiskS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3439:1: ( rule__MoveDiskS__Group__2__Impl rule__MoveDiskS__Group__3 )
            // InternalShortDSLParser.g:3440:2: rule__MoveDiskS__Group__2__Impl rule__MoveDiskS__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__MoveDiskS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveDiskS__Group__3();

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
    // $ANTLR end "rule__MoveDiskS__Group__2"


    // $ANTLR start "rule__MoveDiskS__Group__2__Impl"
    // InternalShortDSLParser.g:3447:1: rule__MoveDiskS__Group__2__Impl : ( ( rule__MoveDiskS__Alternatives_2 ) ) ;
    public final void rule__MoveDiskS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3451:1: ( ( ( rule__MoveDiskS__Alternatives_2 ) ) )
            // InternalShortDSLParser.g:3452:1: ( ( rule__MoveDiskS__Alternatives_2 ) )
            {
            // InternalShortDSLParser.g:3452:1: ( ( rule__MoveDiskS__Alternatives_2 ) )
            // InternalShortDSLParser.g:3453:2: ( rule__MoveDiskS__Alternatives_2 )
            {
             before(grammarAccess.getMoveDiskSAccess().getAlternatives_2()); 
            // InternalShortDSLParser.g:3454:2: ( rule__MoveDiskS__Alternatives_2 )
            // InternalShortDSLParser.g:3454:3: rule__MoveDiskS__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__MoveDiskS__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveDiskSAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__MoveDiskS__Group__2__Impl"


    // $ANTLR start "rule__MoveDiskS__Group__3"
    // InternalShortDSLParser.g:3462:1: rule__MoveDiskS__Group__3 : rule__MoveDiskS__Group__3__Impl ;
    public final void rule__MoveDiskS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3466:1: ( rule__MoveDiskS__Group__3__Impl )
            // InternalShortDSLParser.g:3467:2: rule__MoveDiskS__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveDiskS__Group__3__Impl();

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
    // $ANTLR end "rule__MoveDiskS__Group__3"


    // $ANTLR start "rule__MoveDiskS__Group__3__Impl"
    // InternalShortDSLParser.g:3473:1: rule__MoveDiskS__Group__3__Impl : ( ( rule__MoveDiskS__ZoneAssignment_3 ) ) ;
    public final void rule__MoveDiskS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3477:1: ( ( ( rule__MoveDiskS__ZoneAssignment_3 ) ) )
            // InternalShortDSLParser.g:3478:1: ( ( rule__MoveDiskS__ZoneAssignment_3 ) )
            {
            // InternalShortDSLParser.g:3478:1: ( ( rule__MoveDiskS__ZoneAssignment_3 ) )
            // InternalShortDSLParser.g:3479:2: ( rule__MoveDiskS__ZoneAssignment_3 )
            {
             before(grammarAccess.getMoveDiskSAccess().getZoneAssignment_3()); 
            // InternalShortDSLParser.g:3480:2: ( rule__MoveDiskS__ZoneAssignment_3 )
            // InternalShortDSLParser.g:3480:3: rule__MoveDiskS__ZoneAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MoveDiskS__ZoneAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMoveDiskSAccess().getZoneAssignment_3()); 

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
    // $ANTLR end "rule__MoveDiskS__Group__3__Impl"


    // $ANTLR start "rule__MoveAnySlotS__Group__0"
    // InternalShortDSLParser.g:3489:1: rule__MoveAnySlotS__Group__0 : rule__MoveAnySlotS__Group__0__Impl rule__MoveAnySlotS__Group__1 ;
    public final void rule__MoveAnySlotS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3493:1: ( rule__MoveAnySlotS__Group__0__Impl rule__MoveAnySlotS__Group__1 )
            // InternalShortDSLParser.g:3494:2: rule__MoveAnySlotS__Group__0__Impl rule__MoveAnySlotS__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__MoveAnySlotS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveAnySlotS__Group__1();

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
    // $ANTLR end "rule__MoveAnySlotS__Group__0"


    // $ANTLR start "rule__MoveAnySlotS__Group__0__Impl"
    // InternalShortDSLParser.g:3501:1: rule__MoveAnySlotS__Group__0__Impl : ( () ) ;
    public final void rule__MoveAnySlotS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3505:1: ( ( () ) )
            // InternalShortDSLParser.g:3506:1: ( () )
            {
            // InternalShortDSLParser.g:3506:1: ( () )
            // InternalShortDSLParser.g:3507:2: ()
            {
             before(grammarAccess.getMoveAnySlotSAccess().getMoveAnySlotAction_0()); 
            // InternalShortDSLParser.g:3508:2: ()
            // InternalShortDSLParser.g:3508:3: 
            {
            }

             after(grammarAccess.getMoveAnySlotSAccess().getMoveAnySlotAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAnySlotS__Group__0__Impl"


    // $ANTLR start "rule__MoveAnySlotS__Group__1"
    // InternalShortDSLParser.g:3516:1: rule__MoveAnySlotS__Group__1 : rule__MoveAnySlotS__Group__1__Impl rule__MoveAnySlotS__Group__2 ;
    public final void rule__MoveAnySlotS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3520:1: ( rule__MoveAnySlotS__Group__1__Impl rule__MoveAnySlotS__Group__2 )
            // InternalShortDSLParser.g:3521:2: rule__MoveAnySlotS__Group__1__Impl rule__MoveAnySlotS__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__MoveAnySlotS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveAnySlotS__Group__2();

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
    // $ANTLR end "rule__MoveAnySlotS__Group__1"


    // $ANTLR start "rule__MoveAnySlotS__Group__1__Impl"
    // InternalShortDSLParser.g:3528:1: rule__MoveAnySlotS__Group__1__Impl : ( ( rule__MoveAnySlotS__StateAssignment_1 ) ) ;
    public final void rule__MoveAnySlotS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3532:1: ( ( ( rule__MoveAnySlotS__StateAssignment_1 ) ) )
            // InternalShortDSLParser.g:3533:1: ( ( rule__MoveAnySlotS__StateAssignment_1 ) )
            {
            // InternalShortDSLParser.g:3533:1: ( ( rule__MoveAnySlotS__StateAssignment_1 ) )
            // InternalShortDSLParser.g:3534:2: ( rule__MoveAnySlotS__StateAssignment_1 )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getStateAssignment_1()); 
            // InternalShortDSLParser.g:3535:2: ( rule__MoveAnySlotS__StateAssignment_1 )
            // InternalShortDSLParser.g:3535:3: rule__MoveAnySlotS__StateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveAnySlotS__StateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAnySlotSAccess().getStateAssignment_1()); 

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
    // $ANTLR end "rule__MoveAnySlotS__Group__1__Impl"


    // $ANTLR start "rule__MoveAnySlotS__Group__2"
    // InternalShortDSLParser.g:3543:1: rule__MoveAnySlotS__Group__2 : rule__MoveAnySlotS__Group__2__Impl rule__MoveAnySlotS__Group__3 ;
    public final void rule__MoveAnySlotS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3547:1: ( rule__MoveAnySlotS__Group__2__Impl rule__MoveAnySlotS__Group__3 )
            // InternalShortDSLParser.g:3548:2: rule__MoveAnySlotS__Group__2__Impl rule__MoveAnySlotS__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__MoveAnySlotS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveAnySlotS__Group__3();

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
    // $ANTLR end "rule__MoveAnySlotS__Group__2"


    // $ANTLR start "rule__MoveAnySlotS__Group__2__Impl"
    // InternalShortDSLParser.g:3555:1: rule__MoveAnySlotS__Group__2__Impl : ( ( rule__MoveAnySlotS__AnySlotAssignment_2 ) ) ;
    public final void rule__MoveAnySlotS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3559:1: ( ( ( rule__MoveAnySlotS__AnySlotAssignment_2 ) ) )
            // InternalShortDSLParser.g:3560:1: ( ( rule__MoveAnySlotS__AnySlotAssignment_2 ) )
            {
            // InternalShortDSLParser.g:3560:1: ( ( rule__MoveAnySlotS__AnySlotAssignment_2 ) )
            // InternalShortDSLParser.g:3561:2: ( rule__MoveAnySlotS__AnySlotAssignment_2 )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getAnySlotAssignment_2()); 
            // InternalShortDSLParser.g:3562:2: ( rule__MoveAnySlotS__AnySlotAssignment_2 )
            // InternalShortDSLParser.g:3562:3: rule__MoveAnySlotS__AnySlotAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MoveAnySlotS__AnySlotAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveAnySlotSAccess().getAnySlotAssignment_2()); 

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
    // $ANTLR end "rule__MoveAnySlotS__Group__2__Impl"


    // $ANTLR start "rule__MoveAnySlotS__Group__3"
    // InternalShortDSLParser.g:3570:1: rule__MoveAnySlotS__Group__3 : rule__MoveAnySlotS__Group__3__Impl rule__MoveAnySlotS__Group__4 ;
    public final void rule__MoveAnySlotS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3574:1: ( rule__MoveAnySlotS__Group__3__Impl rule__MoveAnySlotS__Group__4 )
            // InternalShortDSLParser.g:3575:2: rule__MoveAnySlotS__Group__3__Impl rule__MoveAnySlotS__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__MoveAnySlotS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveAnySlotS__Group__4();

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
    // $ANTLR end "rule__MoveAnySlotS__Group__3"


    // $ANTLR start "rule__MoveAnySlotS__Group__3__Impl"
    // InternalShortDSLParser.g:3582:1: rule__MoveAnySlotS__Group__3__Impl : ( ( rule__MoveAnySlotS__Alternatives_3 ) ) ;
    public final void rule__MoveAnySlotS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3586:1: ( ( ( rule__MoveAnySlotS__Alternatives_3 ) ) )
            // InternalShortDSLParser.g:3587:1: ( ( rule__MoveAnySlotS__Alternatives_3 ) )
            {
            // InternalShortDSLParser.g:3587:1: ( ( rule__MoveAnySlotS__Alternatives_3 ) )
            // InternalShortDSLParser.g:3588:2: ( rule__MoveAnySlotS__Alternatives_3 )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getAlternatives_3()); 
            // InternalShortDSLParser.g:3589:2: ( rule__MoveAnySlotS__Alternatives_3 )
            // InternalShortDSLParser.g:3589:3: rule__MoveAnySlotS__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__MoveAnySlotS__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getMoveAnySlotSAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__MoveAnySlotS__Group__3__Impl"


    // $ANTLR start "rule__MoveAnySlotS__Group__4"
    // InternalShortDSLParser.g:3597:1: rule__MoveAnySlotS__Group__4 : rule__MoveAnySlotS__Group__4__Impl ;
    public final void rule__MoveAnySlotS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3601:1: ( rule__MoveAnySlotS__Group__4__Impl )
            // InternalShortDSLParser.g:3602:2: rule__MoveAnySlotS__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveAnySlotS__Group__4__Impl();

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
    // $ANTLR end "rule__MoveAnySlotS__Group__4"


    // $ANTLR start "rule__MoveAnySlotS__Group__4__Impl"
    // InternalShortDSLParser.g:3608:1: rule__MoveAnySlotS__Group__4__Impl : ( ( rule__MoveAnySlotS__ZoneAssignment_4 ) ) ;
    public final void rule__MoveAnySlotS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3612:1: ( ( ( rule__MoveAnySlotS__ZoneAssignment_4 ) ) )
            // InternalShortDSLParser.g:3613:1: ( ( rule__MoveAnySlotS__ZoneAssignment_4 ) )
            {
            // InternalShortDSLParser.g:3613:1: ( ( rule__MoveAnySlotS__ZoneAssignment_4 ) )
            // InternalShortDSLParser.g:3614:2: ( rule__MoveAnySlotS__ZoneAssignment_4 )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getZoneAssignment_4()); 
            // InternalShortDSLParser.g:3615:2: ( rule__MoveAnySlotS__ZoneAssignment_4 )
            // InternalShortDSLParser.g:3615:3: rule__MoveAnySlotS__ZoneAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MoveAnySlotS__ZoneAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMoveAnySlotSAccess().getZoneAssignment_4()); 

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
    // $ANTLR end "rule__MoveAnySlotS__Group__4__Impl"


    // $ANTLR start "rule__MoveCraneS__Group__0"
    // InternalShortDSLParser.g:3624:1: rule__MoveCraneS__Group__0 : rule__MoveCraneS__Group__0__Impl rule__MoveCraneS__Group__1 ;
    public final void rule__MoveCraneS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3628:1: ( rule__MoveCraneS__Group__0__Impl rule__MoveCraneS__Group__1 )
            // InternalShortDSLParser.g:3629:2: rule__MoveCraneS__Group__0__Impl rule__MoveCraneS__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__MoveCraneS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveCraneS__Group__1();

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
    // $ANTLR end "rule__MoveCraneS__Group__0"


    // $ANTLR start "rule__MoveCraneS__Group__0__Impl"
    // InternalShortDSLParser.g:3636:1: rule__MoveCraneS__Group__0__Impl : ( () ) ;
    public final void rule__MoveCraneS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3640:1: ( ( () ) )
            // InternalShortDSLParser.g:3641:1: ( () )
            {
            // InternalShortDSLParser.g:3641:1: ( () )
            // InternalShortDSLParser.g:3642:2: ()
            {
             before(grammarAccess.getMoveCraneSAccess().getMoveCraneAction_0()); 
            // InternalShortDSLParser.g:3643:2: ()
            // InternalShortDSLParser.g:3643:3: 
            {
            }

             after(grammarAccess.getMoveCraneSAccess().getMoveCraneAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveCraneS__Group__0__Impl"


    // $ANTLR start "rule__MoveCraneS__Group__1"
    // InternalShortDSLParser.g:3651:1: rule__MoveCraneS__Group__1 : rule__MoveCraneS__Group__1__Impl rule__MoveCraneS__Group__2 ;
    public final void rule__MoveCraneS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3655:1: ( rule__MoveCraneS__Group__1__Impl rule__MoveCraneS__Group__2 )
            // InternalShortDSLParser.g:3656:2: rule__MoveCraneS__Group__1__Impl rule__MoveCraneS__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__MoveCraneS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveCraneS__Group__2();

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
    // $ANTLR end "rule__MoveCraneS__Group__1"


    // $ANTLR start "rule__MoveCraneS__Group__1__Impl"
    // InternalShortDSLParser.g:3663:1: rule__MoveCraneS__Group__1__Impl : ( ( rule__MoveCraneS__CraneAssignment_1 ) ) ;
    public final void rule__MoveCraneS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3667:1: ( ( ( rule__MoveCraneS__CraneAssignment_1 ) ) )
            // InternalShortDSLParser.g:3668:1: ( ( rule__MoveCraneS__CraneAssignment_1 ) )
            {
            // InternalShortDSLParser.g:3668:1: ( ( rule__MoveCraneS__CraneAssignment_1 ) )
            // InternalShortDSLParser.g:3669:2: ( rule__MoveCraneS__CraneAssignment_1 )
            {
             before(grammarAccess.getMoveCraneSAccess().getCraneAssignment_1()); 
            // InternalShortDSLParser.g:3670:2: ( rule__MoveCraneS__CraneAssignment_1 )
            // InternalShortDSLParser.g:3670:3: rule__MoveCraneS__CraneAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveCraneS__CraneAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveCraneSAccess().getCraneAssignment_1()); 

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
    // $ANTLR end "rule__MoveCraneS__Group__1__Impl"


    // $ANTLR start "rule__MoveCraneS__Group__2"
    // InternalShortDSLParser.g:3678:1: rule__MoveCraneS__Group__2 : rule__MoveCraneS__Group__2__Impl rule__MoveCraneS__Group__3 ;
    public final void rule__MoveCraneS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3682:1: ( rule__MoveCraneS__Group__2__Impl rule__MoveCraneS__Group__3 )
            // InternalShortDSLParser.g:3683:2: rule__MoveCraneS__Group__2__Impl rule__MoveCraneS__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__MoveCraneS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveCraneS__Group__3();

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
    // $ANTLR end "rule__MoveCraneS__Group__2"


    // $ANTLR start "rule__MoveCraneS__Group__2__Impl"
    // InternalShortDSLParser.g:3690:1: rule__MoveCraneS__Group__2__Impl : ( ( rule__MoveCraneS__ActionAssignment_2 ) ) ;
    public final void rule__MoveCraneS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3694:1: ( ( ( rule__MoveCraneS__ActionAssignment_2 ) ) )
            // InternalShortDSLParser.g:3695:1: ( ( rule__MoveCraneS__ActionAssignment_2 ) )
            {
            // InternalShortDSLParser.g:3695:1: ( ( rule__MoveCraneS__ActionAssignment_2 ) )
            // InternalShortDSLParser.g:3696:2: ( rule__MoveCraneS__ActionAssignment_2 )
            {
             before(grammarAccess.getMoveCraneSAccess().getActionAssignment_2()); 
            // InternalShortDSLParser.g:3697:2: ( rule__MoveCraneS__ActionAssignment_2 )
            // InternalShortDSLParser.g:3697:3: rule__MoveCraneS__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MoveCraneS__ActionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveCraneSAccess().getActionAssignment_2()); 

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
    // $ANTLR end "rule__MoveCraneS__Group__2__Impl"


    // $ANTLR start "rule__MoveCraneS__Group__3"
    // InternalShortDSLParser.g:3705:1: rule__MoveCraneS__Group__3 : rule__MoveCraneS__Group__3__Impl rule__MoveCraneS__Group__4 ;
    public final void rule__MoveCraneS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3709:1: ( rule__MoveCraneS__Group__3__Impl rule__MoveCraneS__Group__4 )
            // InternalShortDSLParser.g:3710:2: rule__MoveCraneS__Group__3__Impl rule__MoveCraneS__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__MoveCraneS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveCraneS__Group__4();

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
    // $ANTLR end "rule__MoveCraneS__Group__3"


    // $ANTLR start "rule__MoveCraneS__Group__3__Impl"
    // InternalShortDSLParser.g:3717:1: rule__MoveCraneS__Group__3__Impl : ( ( rule__MoveCraneS__Alternatives_3 ) ) ;
    public final void rule__MoveCraneS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3721:1: ( ( ( rule__MoveCraneS__Alternatives_3 ) ) )
            // InternalShortDSLParser.g:3722:1: ( ( rule__MoveCraneS__Alternatives_3 ) )
            {
            // InternalShortDSLParser.g:3722:1: ( ( rule__MoveCraneS__Alternatives_3 ) )
            // InternalShortDSLParser.g:3723:2: ( rule__MoveCraneS__Alternatives_3 )
            {
             before(grammarAccess.getMoveCraneSAccess().getAlternatives_3()); 
            // InternalShortDSLParser.g:3724:2: ( rule__MoveCraneS__Alternatives_3 )
            // InternalShortDSLParser.g:3724:3: rule__MoveCraneS__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__MoveCraneS__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getMoveCraneSAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__MoveCraneS__Group__3__Impl"


    // $ANTLR start "rule__MoveCraneS__Group__4"
    // InternalShortDSLParser.g:3732:1: rule__MoveCraneS__Group__4 : rule__MoveCraneS__Group__4__Impl ;
    public final void rule__MoveCraneS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3736:1: ( rule__MoveCraneS__Group__4__Impl )
            // InternalShortDSLParser.g:3737:2: rule__MoveCraneS__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveCraneS__Group__4__Impl();

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
    // $ANTLR end "rule__MoveCraneS__Group__4"


    // $ANTLR start "rule__MoveCraneS__Group__4__Impl"
    // InternalShortDSLParser.g:3743:1: rule__MoveCraneS__Group__4__Impl : ( ( rule__MoveCraneS__ZoneAssignment_4 ) ) ;
    public final void rule__MoveCraneS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3747:1: ( ( ( rule__MoveCraneS__ZoneAssignment_4 ) ) )
            // InternalShortDSLParser.g:3748:1: ( ( rule__MoveCraneS__ZoneAssignment_4 ) )
            {
            // InternalShortDSLParser.g:3748:1: ( ( rule__MoveCraneS__ZoneAssignment_4 ) )
            // InternalShortDSLParser.g:3749:2: ( rule__MoveCraneS__ZoneAssignment_4 )
            {
             before(grammarAccess.getMoveCraneSAccess().getZoneAssignment_4()); 
            // InternalShortDSLParser.g:3750:2: ( rule__MoveCraneS__ZoneAssignment_4 )
            // InternalShortDSLParser.g:3750:3: rule__MoveCraneS__ZoneAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MoveCraneS__ZoneAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMoveCraneSAccess().getZoneAssignment_4()); 

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
    // $ANTLR end "rule__MoveCraneS__Group__4__Impl"


    // $ANTLR start "rule__CraneActionS__Group__0"
    // InternalShortDSLParser.g:3759:1: rule__CraneActionS__Group__0 : rule__CraneActionS__Group__0__Impl rule__CraneActionS__Group__1 ;
    public final void rule__CraneActionS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3763:1: ( rule__CraneActionS__Group__0__Impl rule__CraneActionS__Group__1 )
            // InternalShortDSLParser.g:3764:2: rule__CraneActionS__Group__0__Impl rule__CraneActionS__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__CraneActionS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CraneActionS__Group__1();

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
    // $ANTLR end "rule__CraneActionS__Group__0"


    // $ANTLR start "rule__CraneActionS__Group__0__Impl"
    // InternalShortDSLParser.g:3771:1: rule__CraneActionS__Group__0__Impl : ( () ) ;
    public final void rule__CraneActionS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3775:1: ( ( () ) )
            // InternalShortDSLParser.g:3776:1: ( () )
            {
            // InternalShortDSLParser.g:3776:1: ( () )
            // InternalShortDSLParser.g:3777:2: ()
            {
             before(grammarAccess.getCraneActionSAccess().getCraneActionAction_0()); 
            // InternalShortDSLParser.g:3778:2: ()
            // InternalShortDSLParser.g:3778:3: 
            {
            }

             after(grammarAccess.getCraneActionSAccess().getCraneActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CraneActionS__Group__0__Impl"


    // $ANTLR start "rule__CraneActionS__Group__1"
    // InternalShortDSLParser.g:3786:1: rule__CraneActionS__Group__1 : rule__CraneActionS__Group__1__Impl ;
    public final void rule__CraneActionS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3790:1: ( rule__CraneActionS__Group__1__Impl )
            // InternalShortDSLParser.g:3791:2: rule__CraneActionS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CraneActionS__Group__1__Impl();

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
    // $ANTLR end "rule__CraneActionS__Group__1"


    // $ANTLR start "rule__CraneActionS__Group__1__Impl"
    // InternalShortDSLParser.g:3797:1: rule__CraneActionS__Group__1__Impl : ( ( rule__CraneActionS__Alternatives_1 ) ) ;
    public final void rule__CraneActionS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3801:1: ( ( ( rule__CraneActionS__Alternatives_1 ) ) )
            // InternalShortDSLParser.g:3802:1: ( ( rule__CraneActionS__Alternatives_1 ) )
            {
            // InternalShortDSLParser.g:3802:1: ( ( rule__CraneActionS__Alternatives_1 ) )
            // InternalShortDSLParser.g:3803:2: ( rule__CraneActionS__Alternatives_1 )
            {
             before(grammarAccess.getCraneActionSAccess().getAlternatives_1()); 
            // InternalShortDSLParser.g:3804:2: ( rule__CraneActionS__Alternatives_1 )
            // InternalShortDSLParser.g:3804:3: rule__CraneActionS__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__CraneActionS__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCraneActionSAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__CraneActionS__Group__1__Impl"


    // $ANTLR start "rule__ConditionVariableS__Group__0"
    // InternalShortDSLParser.g:3813:1: rule__ConditionVariableS__Group__0 : rule__ConditionVariableS__Group__0__Impl rule__ConditionVariableS__Group__1 ;
    public final void rule__ConditionVariableS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3817:1: ( rule__ConditionVariableS__Group__0__Impl rule__ConditionVariableS__Group__1 )
            // InternalShortDSLParser.g:3818:2: rule__ConditionVariableS__Group__0__Impl rule__ConditionVariableS__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ConditionVariableS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionVariableS__Group__1();

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
    // $ANTLR end "rule__ConditionVariableS__Group__0"


    // $ANTLR start "rule__ConditionVariableS__Group__0__Impl"
    // InternalShortDSLParser.g:3825:1: rule__ConditionVariableS__Group__0__Impl : ( () ) ;
    public final void rule__ConditionVariableS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3829:1: ( ( () ) )
            // InternalShortDSLParser.g:3830:1: ( () )
            {
            // InternalShortDSLParser.g:3830:1: ( () )
            // InternalShortDSLParser.g:3831:2: ()
            {
             before(grammarAccess.getConditionVariableSAccess().getConditionVariableAction_0()); 
            // InternalShortDSLParser.g:3832:2: ()
            // InternalShortDSLParser.g:3832:3: 
            {
            }

             after(grammarAccess.getConditionVariableSAccess().getConditionVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionVariableS__Group__0__Impl"


    // $ANTLR start "rule__ConditionVariableS__Group__1"
    // InternalShortDSLParser.g:3840:1: rule__ConditionVariableS__Group__1 : rule__ConditionVariableS__Group__1__Impl rule__ConditionVariableS__Group__2 ;
    public final void rule__ConditionVariableS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3844:1: ( rule__ConditionVariableS__Group__1__Impl rule__ConditionVariableS__Group__2 )
            // InternalShortDSLParser.g:3845:2: rule__ConditionVariableS__Group__1__Impl rule__ConditionVariableS__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__ConditionVariableS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionVariableS__Group__2();

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
    // $ANTLR end "rule__ConditionVariableS__Group__1"


    // $ANTLR start "rule__ConditionVariableS__Group__1__Impl"
    // InternalShortDSLParser.g:3852:1: rule__ConditionVariableS__Group__1__Impl : ( If ) ;
    public final void rule__ConditionVariableS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3856:1: ( ( If ) )
            // InternalShortDSLParser.g:3857:1: ( If )
            {
            // InternalShortDSLParser.g:3857:1: ( If )
            // InternalShortDSLParser.g:3858:2: If
            {
             before(grammarAccess.getConditionVariableSAccess().getIfKeyword_1()); 
            match(input,If,FOLLOW_2); 
             after(grammarAccess.getConditionVariableSAccess().getIfKeyword_1()); 

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
    // $ANTLR end "rule__ConditionVariableS__Group__1__Impl"


    // $ANTLR start "rule__ConditionVariableS__Group__2"
    // InternalShortDSLParser.g:3867:1: rule__ConditionVariableS__Group__2 : rule__ConditionVariableS__Group__2__Impl rule__ConditionVariableS__Group__3 ;
    public final void rule__ConditionVariableS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3871:1: ( rule__ConditionVariableS__Group__2__Impl rule__ConditionVariableS__Group__3 )
            // InternalShortDSLParser.g:3872:2: rule__ConditionVariableS__Group__2__Impl rule__ConditionVariableS__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ConditionVariableS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionVariableS__Group__3();

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
    // $ANTLR end "rule__ConditionVariableS__Group__2"


    // $ANTLR start "rule__ConditionVariableS__Group__2__Impl"
    // InternalShortDSLParser.g:3879:1: rule__ConditionVariableS__Group__2__Impl : ( Var ) ;
    public final void rule__ConditionVariableS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3883:1: ( ( Var ) )
            // InternalShortDSLParser.g:3884:1: ( Var )
            {
            // InternalShortDSLParser.g:3884:1: ( Var )
            // InternalShortDSLParser.g:3885:2: Var
            {
             before(grammarAccess.getConditionVariableSAccess().getVarKeyword_2()); 
            match(input,Var,FOLLOW_2); 
             after(grammarAccess.getConditionVariableSAccess().getVarKeyword_2()); 

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
    // $ANTLR end "rule__ConditionVariableS__Group__2__Impl"


    // $ANTLR start "rule__ConditionVariableS__Group__3"
    // InternalShortDSLParser.g:3894:1: rule__ConditionVariableS__Group__3 : rule__ConditionVariableS__Group__3__Impl rule__ConditionVariableS__Group__4 ;
    public final void rule__ConditionVariableS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3898:1: ( rule__ConditionVariableS__Group__3__Impl rule__ConditionVariableS__Group__4 )
            // InternalShortDSLParser.g:3899:2: rule__ConditionVariableS__Group__3__Impl rule__ConditionVariableS__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__ConditionVariableS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionVariableS__Group__4();

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
    // $ANTLR end "rule__ConditionVariableS__Group__3"


    // $ANTLR start "rule__ConditionVariableS__Group__3__Impl"
    // InternalShortDSLParser.g:3906:1: rule__ConditionVariableS__Group__3__Impl : ( ( rule__ConditionVariableS__VariableAssignment_3 ) ) ;
    public final void rule__ConditionVariableS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3910:1: ( ( ( rule__ConditionVariableS__VariableAssignment_3 ) ) )
            // InternalShortDSLParser.g:3911:1: ( ( rule__ConditionVariableS__VariableAssignment_3 ) )
            {
            // InternalShortDSLParser.g:3911:1: ( ( rule__ConditionVariableS__VariableAssignment_3 ) )
            // InternalShortDSLParser.g:3912:2: ( rule__ConditionVariableS__VariableAssignment_3 )
            {
             before(grammarAccess.getConditionVariableSAccess().getVariableAssignment_3()); 
            // InternalShortDSLParser.g:3913:2: ( rule__ConditionVariableS__VariableAssignment_3 )
            // InternalShortDSLParser.g:3913:3: rule__ConditionVariableS__VariableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConditionVariableS__VariableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionVariableSAccess().getVariableAssignment_3()); 

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
    // $ANTLR end "rule__ConditionVariableS__Group__3__Impl"


    // $ANTLR start "rule__ConditionVariableS__Group__4"
    // InternalShortDSLParser.g:3921:1: rule__ConditionVariableS__Group__4 : rule__ConditionVariableS__Group__4__Impl rule__ConditionVariableS__Group__5 ;
    public final void rule__ConditionVariableS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3925:1: ( rule__ConditionVariableS__Group__4__Impl rule__ConditionVariableS__Group__5 )
            // InternalShortDSLParser.g:3926:2: rule__ConditionVariableS__Group__4__Impl rule__ConditionVariableS__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__ConditionVariableS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionVariableS__Group__5();

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
    // $ANTLR end "rule__ConditionVariableS__Group__4"


    // $ANTLR start "rule__ConditionVariableS__Group__4__Impl"
    // InternalShortDSLParser.g:3933:1: rule__ConditionVariableS__Group__4__Impl : ( ( rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4 ) ) ;
    public final void rule__ConditionVariableS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3937:1: ( ( ( rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4 ) ) )
            // InternalShortDSLParser.g:3938:1: ( ( rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4 ) )
            {
            // InternalShortDSLParser.g:3938:1: ( ( rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4 ) )
            // InternalShortDSLParser.g:3939:2: ( rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4 )
            {
             before(grammarAccess.getConditionVariableSAccess().getComparisonOperatorVariableAssignment_4()); 
            // InternalShortDSLParser.g:3940:2: ( rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4 )
            // InternalShortDSLParser.g:3940:3: rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionVariableSAccess().getComparisonOperatorVariableAssignment_4()); 

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
    // $ANTLR end "rule__ConditionVariableS__Group__4__Impl"


    // $ANTLR start "rule__ConditionVariableS__Group__5"
    // InternalShortDSLParser.g:3948:1: rule__ConditionVariableS__Group__5 : rule__ConditionVariableS__Group__5__Impl rule__ConditionVariableS__Group__6 ;
    public final void rule__ConditionVariableS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3952:1: ( rule__ConditionVariableS__Group__5__Impl rule__ConditionVariableS__Group__6 )
            // InternalShortDSLParser.g:3953:2: rule__ConditionVariableS__Group__5__Impl rule__ConditionVariableS__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__ConditionVariableS__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionVariableS__Group__6();

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
    // $ANTLR end "rule__ConditionVariableS__Group__5"


    // $ANTLR start "rule__ConditionVariableS__Group__5__Impl"
    // InternalShortDSLParser.g:3960:1: rule__ConditionVariableS__Group__5__Impl : ( ( rule__ConditionVariableS__VariableValueAssignment_5 ) ) ;
    public final void rule__ConditionVariableS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3964:1: ( ( ( rule__ConditionVariableS__VariableValueAssignment_5 ) ) )
            // InternalShortDSLParser.g:3965:1: ( ( rule__ConditionVariableS__VariableValueAssignment_5 ) )
            {
            // InternalShortDSLParser.g:3965:1: ( ( rule__ConditionVariableS__VariableValueAssignment_5 ) )
            // InternalShortDSLParser.g:3966:2: ( rule__ConditionVariableS__VariableValueAssignment_5 )
            {
             before(grammarAccess.getConditionVariableSAccess().getVariableValueAssignment_5()); 
            // InternalShortDSLParser.g:3967:2: ( rule__ConditionVariableS__VariableValueAssignment_5 )
            // InternalShortDSLParser.g:3967:3: rule__ConditionVariableS__VariableValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ConditionVariableS__VariableValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConditionVariableSAccess().getVariableValueAssignment_5()); 

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
    // $ANTLR end "rule__ConditionVariableS__Group__5__Impl"


    // $ANTLR start "rule__ConditionVariableS__Group__6"
    // InternalShortDSLParser.g:3975:1: rule__ConditionVariableS__Group__6 : rule__ConditionVariableS__Group__6__Impl rule__ConditionVariableS__Group__7 ;
    public final void rule__ConditionVariableS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3979:1: ( rule__ConditionVariableS__Group__6__Impl rule__ConditionVariableS__Group__7 )
            // InternalShortDSLParser.g:3980:2: rule__ConditionVariableS__Group__6__Impl rule__ConditionVariableS__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__ConditionVariableS__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionVariableS__Group__7();

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
    // $ANTLR end "rule__ConditionVariableS__Group__6"


    // $ANTLR start "rule__ConditionVariableS__Group__6__Impl"
    // InternalShortDSLParser.g:3987:1: rule__ConditionVariableS__Group__6__Impl : ( Colon ) ;
    public final void rule__ConditionVariableS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3991:1: ( ( Colon ) )
            // InternalShortDSLParser.g:3992:1: ( Colon )
            {
            // InternalShortDSLParser.g:3992:1: ( Colon )
            // InternalShortDSLParser.g:3993:2: Colon
            {
             before(grammarAccess.getConditionVariableSAccess().getColonKeyword_6()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getConditionVariableSAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__ConditionVariableS__Group__6__Impl"


    // $ANTLR start "rule__ConditionVariableS__Group__7"
    // InternalShortDSLParser.g:4002:1: rule__ConditionVariableS__Group__7 : rule__ConditionVariableS__Group__7__Impl rule__ConditionVariableS__Group__8 ;
    public final void rule__ConditionVariableS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4006:1: ( rule__ConditionVariableS__Group__7__Impl rule__ConditionVariableS__Group__8 )
            // InternalShortDSLParser.g:4007:2: rule__ConditionVariableS__Group__7__Impl rule__ConditionVariableS__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__ConditionVariableS__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionVariableS__Group__8();

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
    // $ANTLR end "rule__ConditionVariableS__Group__7"


    // $ANTLR start "rule__ConditionVariableS__Group__7__Impl"
    // InternalShortDSLParser.g:4014:1: rule__ConditionVariableS__Group__7__Impl : ( RULE_BEGIN ) ;
    public final void rule__ConditionVariableS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4018:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:4019:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:4019:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:4020:2: RULE_BEGIN
            {
             before(grammarAccess.getConditionVariableSAccess().getBEGINTerminalRuleCall_7()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getConditionVariableSAccess().getBEGINTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__ConditionVariableS__Group__7__Impl"


    // $ANTLR start "rule__ConditionVariableS__Group__8"
    // InternalShortDSLParser.g:4029:1: rule__ConditionVariableS__Group__8 : rule__ConditionVariableS__Group__8__Impl rule__ConditionVariableS__Group__9 ;
    public final void rule__ConditionVariableS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4033:1: ( rule__ConditionVariableS__Group__8__Impl rule__ConditionVariableS__Group__9 )
            // InternalShortDSLParser.g:4034:2: rule__ConditionVariableS__Group__8__Impl rule__ConditionVariableS__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__ConditionVariableS__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionVariableS__Group__9();

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
    // $ANTLR end "rule__ConditionVariableS__Group__8"


    // $ANTLR start "rule__ConditionVariableS__Group__8__Impl"
    // InternalShortDSLParser.g:4041:1: rule__ConditionVariableS__Group__8__Impl : ( ( rule__ConditionVariableS__StatementsAssignment_8 )* ) ;
    public final void rule__ConditionVariableS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4045:1: ( ( ( rule__ConditionVariableS__StatementsAssignment_8 )* ) )
            // InternalShortDSLParser.g:4046:1: ( ( rule__ConditionVariableS__StatementsAssignment_8 )* )
            {
            // InternalShortDSLParser.g:4046:1: ( ( rule__ConditionVariableS__StatementsAssignment_8 )* )
            // InternalShortDSLParser.g:4047:2: ( rule__ConditionVariableS__StatementsAssignment_8 )*
            {
             before(grammarAccess.getConditionVariableSAccess().getStatementsAssignment_8()); 
            // InternalShortDSLParser.g:4048:2: ( rule__ConditionVariableS__StatementsAssignment_8 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=In_progress && LA29_0<=Complete)||LA29_0==Foreach||(LA29_0>=Pickup && LA29_0<=Vacant)||LA29_0==Drop||LA29_0==If||LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalShortDSLParser.g:4048:3: rule__ConditionVariableS__StatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ConditionVariableS__StatementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getConditionVariableSAccess().getStatementsAssignment_8()); 

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
    // $ANTLR end "rule__ConditionVariableS__Group__8__Impl"


    // $ANTLR start "rule__ConditionVariableS__Group__9"
    // InternalShortDSLParser.g:4056:1: rule__ConditionVariableS__Group__9 : rule__ConditionVariableS__Group__9__Impl ;
    public final void rule__ConditionVariableS__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4060:1: ( rule__ConditionVariableS__Group__9__Impl )
            // InternalShortDSLParser.g:4061:2: rule__ConditionVariableS__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionVariableS__Group__9__Impl();

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
    // $ANTLR end "rule__ConditionVariableS__Group__9"


    // $ANTLR start "rule__ConditionVariableS__Group__9__Impl"
    // InternalShortDSLParser.g:4067:1: rule__ConditionVariableS__Group__9__Impl : ( RULE_END ) ;
    public final void rule__ConditionVariableS__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4071:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:4072:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:4072:1: ( RULE_END )
            // InternalShortDSLParser.g:4073:2: RULE_END
            {
             before(grammarAccess.getConditionVariableSAccess().getENDTerminalRuleCall_9()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getConditionVariableSAccess().getENDTerminalRuleCall_9()); 

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
    // $ANTLR end "rule__ConditionVariableS__Group__9__Impl"


    // $ANTLR start "rule__ConditionDeviceS__Group__0"
    // InternalShortDSLParser.g:4083:1: rule__ConditionDeviceS__Group__0 : rule__ConditionDeviceS__Group__0__Impl rule__ConditionDeviceS__Group__1 ;
    public final void rule__ConditionDeviceS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4087:1: ( rule__ConditionDeviceS__Group__0__Impl rule__ConditionDeviceS__Group__1 )
            // InternalShortDSLParser.g:4088:2: rule__ConditionDeviceS__Group__0__Impl rule__ConditionDeviceS__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ConditionDeviceS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__Group__1();

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
    // $ANTLR end "rule__ConditionDeviceS__Group__0"


    // $ANTLR start "rule__ConditionDeviceS__Group__0__Impl"
    // InternalShortDSLParser.g:4095:1: rule__ConditionDeviceS__Group__0__Impl : ( () ) ;
    public final void rule__ConditionDeviceS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4099:1: ( ( () ) )
            // InternalShortDSLParser.g:4100:1: ( () )
            {
            // InternalShortDSLParser.g:4100:1: ( () )
            // InternalShortDSLParser.g:4101:2: ()
            {
             before(grammarAccess.getConditionDeviceSAccess().getConditionDeviceAction_0()); 
            // InternalShortDSLParser.g:4102:2: ()
            // InternalShortDSLParser.g:4102:3: 
            {
            }

             after(grammarAccess.getConditionDeviceSAccess().getConditionDeviceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionDeviceS__Group__0__Impl"


    // $ANTLR start "rule__ConditionDeviceS__Group__1"
    // InternalShortDSLParser.g:4110:1: rule__ConditionDeviceS__Group__1 : rule__ConditionDeviceS__Group__1__Impl rule__ConditionDeviceS__Group__2 ;
    public final void rule__ConditionDeviceS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4114:1: ( rule__ConditionDeviceS__Group__1__Impl rule__ConditionDeviceS__Group__2 )
            // InternalShortDSLParser.g:4115:2: rule__ConditionDeviceS__Group__1__Impl rule__ConditionDeviceS__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__ConditionDeviceS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__Group__2();

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
    // $ANTLR end "rule__ConditionDeviceS__Group__1"


    // $ANTLR start "rule__ConditionDeviceS__Group__1__Impl"
    // InternalShortDSLParser.g:4122:1: rule__ConditionDeviceS__Group__1__Impl : ( If ) ;
    public final void rule__ConditionDeviceS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4126:1: ( ( If ) )
            // InternalShortDSLParser.g:4127:1: ( If )
            {
            // InternalShortDSLParser.g:4127:1: ( If )
            // InternalShortDSLParser.g:4128:2: If
            {
             before(grammarAccess.getConditionDeviceSAccess().getIfKeyword_1()); 
            match(input,If,FOLLOW_2); 
             after(grammarAccess.getConditionDeviceSAccess().getIfKeyword_1()); 

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
    // $ANTLR end "rule__ConditionDeviceS__Group__1__Impl"


    // $ANTLR start "rule__ConditionDeviceS__Group__2"
    // InternalShortDSLParser.g:4137:1: rule__ConditionDeviceS__Group__2 : rule__ConditionDeviceS__Group__2__Impl rule__ConditionDeviceS__Group__3 ;
    public final void rule__ConditionDeviceS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4141:1: ( rule__ConditionDeviceS__Group__2__Impl rule__ConditionDeviceS__Group__3 )
            // InternalShortDSLParser.g:4142:2: rule__ConditionDeviceS__Group__2__Impl rule__ConditionDeviceS__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ConditionDeviceS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__Group__3();

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
    // $ANTLR end "rule__ConditionDeviceS__Group__2"


    // $ANTLR start "rule__ConditionDeviceS__Group__2__Impl"
    // InternalShortDSLParser.g:4149:1: rule__ConditionDeviceS__Group__2__Impl : ( Dev ) ;
    public final void rule__ConditionDeviceS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4153:1: ( ( Dev ) )
            // InternalShortDSLParser.g:4154:1: ( Dev )
            {
            // InternalShortDSLParser.g:4154:1: ( Dev )
            // InternalShortDSLParser.g:4155:2: Dev
            {
             before(grammarAccess.getConditionDeviceSAccess().getDevKeyword_2()); 
            match(input,Dev,FOLLOW_2); 
             after(grammarAccess.getConditionDeviceSAccess().getDevKeyword_2()); 

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
    // $ANTLR end "rule__ConditionDeviceS__Group__2__Impl"


    // $ANTLR start "rule__ConditionDeviceS__Group__3"
    // InternalShortDSLParser.g:4164:1: rule__ConditionDeviceS__Group__3 : rule__ConditionDeviceS__Group__3__Impl rule__ConditionDeviceS__Group__4 ;
    public final void rule__ConditionDeviceS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4168:1: ( rule__ConditionDeviceS__Group__3__Impl rule__ConditionDeviceS__Group__4 )
            // InternalShortDSLParser.g:4169:2: rule__ConditionDeviceS__Group__3__Impl rule__ConditionDeviceS__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__ConditionDeviceS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__Group__4();

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
    // $ANTLR end "rule__ConditionDeviceS__Group__3"


    // $ANTLR start "rule__ConditionDeviceS__Group__3__Impl"
    // InternalShortDSLParser.g:4176:1: rule__ConditionDeviceS__Group__3__Impl : ( ( rule__ConditionDeviceS__DeviceAssignment_3 ) ) ;
    public final void rule__ConditionDeviceS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4180:1: ( ( ( rule__ConditionDeviceS__DeviceAssignment_3 ) ) )
            // InternalShortDSLParser.g:4181:1: ( ( rule__ConditionDeviceS__DeviceAssignment_3 ) )
            {
            // InternalShortDSLParser.g:4181:1: ( ( rule__ConditionDeviceS__DeviceAssignment_3 ) )
            // InternalShortDSLParser.g:4182:2: ( rule__ConditionDeviceS__DeviceAssignment_3 )
            {
             before(grammarAccess.getConditionDeviceSAccess().getDeviceAssignment_3()); 
            // InternalShortDSLParser.g:4183:2: ( rule__ConditionDeviceS__DeviceAssignment_3 )
            // InternalShortDSLParser.g:4183:3: rule__ConditionDeviceS__DeviceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__DeviceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionDeviceSAccess().getDeviceAssignment_3()); 

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
    // $ANTLR end "rule__ConditionDeviceS__Group__3__Impl"


    // $ANTLR start "rule__ConditionDeviceS__Group__4"
    // InternalShortDSLParser.g:4191:1: rule__ConditionDeviceS__Group__4 : rule__ConditionDeviceS__Group__4__Impl rule__ConditionDeviceS__Group__5 ;
    public final void rule__ConditionDeviceS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4195:1: ( rule__ConditionDeviceS__Group__4__Impl rule__ConditionDeviceS__Group__5 )
            // InternalShortDSLParser.g:4196:2: rule__ConditionDeviceS__Group__4__Impl rule__ConditionDeviceS__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__ConditionDeviceS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__Group__5();

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
    // $ANTLR end "rule__ConditionDeviceS__Group__4"


    // $ANTLR start "rule__ConditionDeviceS__Group__4__Impl"
    // InternalShortDSLParser.g:4203:1: rule__ConditionDeviceS__Group__4__Impl : ( ( rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4 ) ) ;
    public final void rule__ConditionDeviceS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4207:1: ( ( ( rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4 ) ) )
            // InternalShortDSLParser.g:4208:1: ( ( rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4 ) )
            {
            // InternalShortDSLParser.g:4208:1: ( ( rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4 ) )
            // InternalShortDSLParser.g:4209:2: ( rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4 )
            {
             before(grammarAccess.getConditionDeviceSAccess().getComparisonOperatorDeviceAssignment_4()); 
            // InternalShortDSLParser.g:4210:2: ( rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4 )
            // InternalShortDSLParser.g:4210:3: rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionDeviceSAccess().getComparisonOperatorDeviceAssignment_4()); 

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
    // $ANTLR end "rule__ConditionDeviceS__Group__4__Impl"


    // $ANTLR start "rule__ConditionDeviceS__Group__5"
    // InternalShortDSLParser.g:4218:1: rule__ConditionDeviceS__Group__5 : rule__ConditionDeviceS__Group__5__Impl rule__ConditionDeviceS__Group__6 ;
    public final void rule__ConditionDeviceS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4222:1: ( rule__ConditionDeviceS__Group__5__Impl rule__ConditionDeviceS__Group__6 )
            // InternalShortDSLParser.g:4223:2: rule__ConditionDeviceS__Group__5__Impl rule__ConditionDeviceS__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__ConditionDeviceS__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__Group__6();

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
    // $ANTLR end "rule__ConditionDeviceS__Group__5"


    // $ANTLR start "rule__ConditionDeviceS__Group__5__Impl"
    // InternalShortDSLParser.g:4230:1: rule__ConditionDeviceS__Group__5__Impl : ( ( rule__ConditionDeviceS__DeviceValueAssignment_5 ) ) ;
    public final void rule__ConditionDeviceS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4234:1: ( ( ( rule__ConditionDeviceS__DeviceValueAssignment_5 ) ) )
            // InternalShortDSLParser.g:4235:1: ( ( rule__ConditionDeviceS__DeviceValueAssignment_5 ) )
            {
            // InternalShortDSLParser.g:4235:1: ( ( rule__ConditionDeviceS__DeviceValueAssignment_5 ) )
            // InternalShortDSLParser.g:4236:2: ( rule__ConditionDeviceS__DeviceValueAssignment_5 )
            {
             before(grammarAccess.getConditionDeviceSAccess().getDeviceValueAssignment_5()); 
            // InternalShortDSLParser.g:4237:2: ( rule__ConditionDeviceS__DeviceValueAssignment_5 )
            // InternalShortDSLParser.g:4237:3: rule__ConditionDeviceS__DeviceValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__DeviceValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConditionDeviceSAccess().getDeviceValueAssignment_5()); 

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
    // $ANTLR end "rule__ConditionDeviceS__Group__5__Impl"


    // $ANTLR start "rule__ConditionDeviceS__Group__6"
    // InternalShortDSLParser.g:4245:1: rule__ConditionDeviceS__Group__6 : rule__ConditionDeviceS__Group__6__Impl rule__ConditionDeviceS__Group__7 ;
    public final void rule__ConditionDeviceS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4249:1: ( rule__ConditionDeviceS__Group__6__Impl rule__ConditionDeviceS__Group__7 )
            // InternalShortDSLParser.g:4250:2: rule__ConditionDeviceS__Group__6__Impl rule__ConditionDeviceS__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__ConditionDeviceS__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__Group__7();

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
    // $ANTLR end "rule__ConditionDeviceS__Group__6"


    // $ANTLR start "rule__ConditionDeviceS__Group__6__Impl"
    // InternalShortDSLParser.g:4257:1: rule__ConditionDeviceS__Group__6__Impl : ( Colon ) ;
    public final void rule__ConditionDeviceS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4261:1: ( ( Colon ) )
            // InternalShortDSLParser.g:4262:1: ( Colon )
            {
            // InternalShortDSLParser.g:4262:1: ( Colon )
            // InternalShortDSLParser.g:4263:2: Colon
            {
             before(grammarAccess.getConditionDeviceSAccess().getColonKeyword_6()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getConditionDeviceSAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__ConditionDeviceS__Group__6__Impl"


    // $ANTLR start "rule__ConditionDeviceS__Group__7"
    // InternalShortDSLParser.g:4272:1: rule__ConditionDeviceS__Group__7 : rule__ConditionDeviceS__Group__7__Impl rule__ConditionDeviceS__Group__8 ;
    public final void rule__ConditionDeviceS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4276:1: ( rule__ConditionDeviceS__Group__7__Impl rule__ConditionDeviceS__Group__8 )
            // InternalShortDSLParser.g:4277:2: rule__ConditionDeviceS__Group__7__Impl rule__ConditionDeviceS__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__ConditionDeviceS__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__Group__8();

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
    // $ANTLR end "rule__ConditionDeviceS__Group__7"


    // $ANTLR start "rule__ConditionDeviceS__Group__7__Impl"
    // InternalShortDSLParser.g:4284:1: rule__ConditionDeviceS__Group__7__Impl : ( RULE_BEGIN ) ;
    public final void rule__ConditionDeviceS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4288:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:4289:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:4289:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:4290:2: RULE_BEGIN
            {
             before(grammarAccess.getConditionDeviceSAccess().getBEGINTerminalRuleCall_7()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getConditionDeviceSAccess().getBEGINTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__ConditionDeviceS__Group__7__Impl"


    // $ANTLR start "rule__ConditionDeviceS__Group__8"
    // InternalShortDSLParser.g:4299:1: rule__ConditionDeviceS__Group__8 : rule__ConditionDeviceS__Group__8__Impl rule__ConditionDeviceS__Group__9 ;
    public final void rule__ConditionDeviceS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4303:1: ( rule__ConditionDeviceS__Group__8__Impl rule__ConditionDeviceS__Group__9 )
            // InternalShortDSLParser.g:4304:2: rule__ConditionDeviceS__Group__8__Impl rule__ConditionDeviceS__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__ConditionDeviceS__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__Group__9();

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
    // $ANTLR end "rule__ConditionDeviceS__Group__8"


    // $ANTLR start "rule__ConditionDeviceS__Group__8__Impl"
    // InternalShortDSLParser.g:4311:1: rule__ConditionDeviceS__Group__8__Impl : ( ( rule__ConditionDeviceS__StatementsAssignment_8 )* ) ;
    public final void rule__ConditionDeviceS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4315:1: ( ( ( rule__ConditionDeviceS__StatementsAssignment_8 )* ) )
            // InternalShortDSLParser.g:4316:1: ( ( rule__ConditionDeviceS__StatementsAssignment_8 )* )
            {
            // InternalShortDSLParser.g:4316:1: ( ( rule__ConditionDeviceS__StatementsAssignment_8 )* )
            // InternalShortDSLParser.g:4317:2: ( rule__ConditionDeviceS__StatementsAssignment_8 )*
            {
             before(grammarAccess.getConditionDeviceSAccess().getStatementsAssignment_8()); 
            // InternalShortDSLParser.g:4318:2: ( rule__ConditionDeviceS__StatementsAssignment_8 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=In_progress && LA30_0<=Complete)||LA30_0==Foreach||(LA30_0>=Pickup && LA30_0<=Vacant)||LA30_0==Drop||LA30_0==If||LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalShortDSLParser.g:4318:3: rule__ConditionDeviceS__StatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ConditionDeviceS__StatementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getConditionDeviceSAccess().getStatementsAssignment_8()); 

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
    // $ANTLR end "rule__ConditionDeviceS__Group__8__Impl"


    // $ANTLR start "rule__ConditionDeviceS__Group__9"
    // InternalShortDSLParser.g:4326:1: rule__ConditionDeviceS__Group__9 : rule__ConditionDeviceS__Group__9__Impl ;
    public final void rule__ConditionDeviceS__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4330:1: ( rule__ConditionDeviceS__Group__9__Impl )
            // InternalShortDSLParser.g:4331:2: rule__ConditionDeviceS__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__Group__9__Impl();

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
    // $ANTLR end "rule__ConditionDeviceS__Group__9"


    // $ANTLR start "rule__ConditionDeviceS__Group__9__Impl"
    // InternalShortDSLParser.g:4337:1: rule__ConditionDeviceS__Group__9__Impl : ( RULE_END ) ;
    public final void rule__ConditionDeviceS__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4341:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:4342:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:4342:1: ( RULE_END )
            // InternalShortDSLParser.g:4343:2: RULE_END
            {
             before(grammarAccess.getConditionDeviceSAccess().getENDTerminalRuleCall_9()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getConditionDeviceSAccess().getENDTerminalRuleCall_9()); 

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
    // $ANTLR end "rule__ConditionDeviceS__Group__9__Impl"


    // $ANTLR start "rule__MarkVariableValueS__Group__0"
    // InternalShortDSLParser.g:4353:1: rule__MarkVariableValueS__Group__0 : rule__MarkVariableValueS__Group__0__Impl rule__MarkVariableValueS__Group__1 ;
    public final void rule__MarkVariableValueS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4357:1: ( rule__MarkVariableValueS__Group__0__Impl rule__MarkVariableValueS__Group__1 )
            // InternalShortDSLParser.g:4358:2: rule__MarkVariableValueS__Group__0__Impl rule__MarkVariableValueS__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MarkVariableValueS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkVariableValueS__Group__1();

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
    // $ANTLR end "rule__MarkVariableValueS__Group__0"


    // $ANTLR start "rule__MarkVariableValueS__Group__0__Impl"
    // InternalShortDSLParser.g:4365:1: rule__MarkVariableValueS__Group__0__Impl : ( () ) ;
    public final void rule__MarkVariableValueS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4369:1: ( ( () ) )
            // InternalShortDSLParser.g:4370:1: ( () )
            {
            // InternalShortDSLParser.g:4370:1: ( () )
            // InternalShortDSLParser.g:4371:2: ()
            {
             before(grammarAccess.getMarkVariableValueSAccess().getMarkVariableValueAction_0()); 
            // InternalShortDSLParser.g:4372:2: ()
            // InternalShortDSLParser.g:4372:3: 
            {
            }

             after(grammarAccess.getMarkVariableValueSAccess().getMarkVariableValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableValueS__Group__0__Impl"


    // $ANTLR start "rule__MarkVariableValueS__Group__1"
    // InternalShortDSLParser.g:4380:1: rule__MarkVariableValueS__Group__1 : rule__MarkVariableValueS__Group__1__Impl rule__MarkVariableValueS__Group__2 ;
    public final void rule__MarkVariableValueS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4384:1: ( rule__MarkVariableValueS__Group__1__Impl rule__MarkVariableValueS__Group__2 )
            // InternalShortDSLParser.g:4385:2: rule__MarkVariableValueS__Group__1__Impl rule__MarkVariableValueS__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__MarkVariableValueS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkVariableValueS__Group__2();

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
    // $ANTLR end "rule__MarkVariableValueS__Group__1"


    // $ANTLR start "rule__MarkVariableValueS__Group__1__Impl"
    // InternalShortDSLParser.g:4392:1: rule__MarkVariableValueS__Group__1__Impl : ( ( rule__MarkVariableValueS__VariableAssignment_1 ) ) ;
    public final void rule__MarkVariableValueS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4396:1: ( ( ( rule__MarkVariableValueS__VariableAssignment_1 ) ) )
            // InternalShortDSLParser.g:4397:1: ( ( rule__MarkVariableValueS__VariableAssignment_1 ) )
            {
            // InternalShortDSLParser.g:4397:1: ( ( rule__MarkVariableValueS__VariableAssignment_1 ) )
            // InternalShortDSLParser.g:4398:2: ( rule__MarkVariableValueS__VariableAssignment_1 )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getVariableAssignment_1()); 
            // InternalShortDSLParser.g:4399:2: ( rule__MarkVariableValueS__VariableAssignment_1 )
            // InternalShortDSLParser.g:4399:3: rule__MarkVariableValueS__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MarkVariableValueS__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMarkVariableValueSAccess().getVariableAssignment_1()); 

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
    // $ANTLR end "rule__MarkVariableValueS__Group__1__Impl"


    // $ANTLR start "rule__MarkVariableValueS__Group__2"
    // InternalShortDSLParser.g:4407:1: rule__MarkVariableValueS__Group__2 : rule__MarkVariableValueS__Group__2__Impl rule__MarkVariableValueS__Group__3 ;
    public final void rule__MarkVariableValueS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4411:1: ( rule__MarkVariableValueS__Group__2__Impl rule__MarkVariableValueS__Group__3 )
            // InternalShortDSLParser.g:4412:2: rule__MarkVariableValueS__Group__2__Impl rule__MarkVariableValueS__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__MarkVariableValueS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkVariableValueS__Group__3();

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
    // $ANTLR end "rule__MarkVariableValueS__Group__2"


    // $ANTLR start "rule__MarkVariableValueS__Group__2__Impl"
    // InternalShortDSLParser.g:4419:1: rule__MarkVariableValueS__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__MarkVariableValueS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4423:1: ( ( LeftParenthesis ) )
            // InternalShortDSLParser.g:4424:1: ( LeftParenthesis )
            {
            // InternalShortDSLParser.g:4424:1: ( LeftParenthesis )
            // InternalShortDSLParser.g:4425:2: LeftParenthesis
            {
             before(grammarAccess.getMarkVariableValueSAccess().getLeftParenthesisKeyword_2()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getMarkVariableValueSAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__MarkVariableValueS__Group__2__Impl"


    // $ANTLR start "rule__MarkVariableValueS__Group__3"
    // InternalShortDSLParser.g:4434:1: rule__MarkVariableValueS__Group__3 : rule__MarkVariableValueS__Group__3__Impl rule__MarkVariableValueS__Group__4 ;
    public final void rule__MarkVariableValueS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4438:1: ( rule__MarkVariableValueS__Group__3__Impl rule__MarkVariableValueS__Group__4 )
            // InternalShortDSLParser.g:4439:2: rule__MarkVariableValueS__Group__3__Impl rule__MarkVariableValueS__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__MarkVariableValueS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkVariableValueS__Group__4();

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
    // $ANTLR end "rule__MarkVariableValueS__Group__3"


    // $ANTLR start "rule__MarkVariableValueS__Group__3__Impl"
    // InternalShortDSLParser.g:4446:1: rule__MarkVariableValueS__Group__3__Impl : ( ( rule__MarkVariableValueS__ValueAssignment_3 ) ) ;
    public final void rule__MarkVariableValueS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4450:1: ( ( ( rule__MarkVariableValueS__ValueAssignment_3 ) ) )
            // InternalShortDSLParser.g:4451:1: ( ( rule__MarkVariableValueS__ValueAssignment_3 ) )
            {
            // InternalShortDSLParser.g:4451:1: ( ( rule__MarkVariableValueS__ValueAssignment_3 ) )
            // InternalShortDSLParser.g:4452:2: ( rule__MarkVariableValueS__ValueAssignment_3 )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getValueAssignment_3()); 
            // InternalShortDSLParser.g:4453:2: ( rule__MarkVariableValueS__ValueAssignment_3 )
            // InternalShortDSLParser.g:4453:3: rule__MarkVariableValueS__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MarkVariableValueS__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMarkVariableValueSAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__MarkVariableValueS__Group__3__Impl"


    // $ANTLR start "rule__MarkVariableValueS__Group__4"
    // InternalShortDSLParser.g:4461:1: rule__MarkVariableValueS__Group__4 : rule__MarkVariableValueS__Group__4__Impl rule__MarkVariableValueS__Group__5 ;
    public final void rule__MarkVariableValueS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4465:1: ( rule__MarkVariableValueS__Group__4__Impl rule__MarkVariableValueS__Group__5 )
            // InternalShortDSLParser.g:4466:2: rule__MarkVariableValueS__Group__4__Impl rule__MarkVariableValueS__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__MarkVariableValueS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkVariableValueS__Group__5();

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
    // $ANTLR end "rule__MarkVariableValueS__Group__4"


    // $ANTLR start "rule__MarkVariableValueS__Group__4__Impl"
    // InternalShortDSLParser.g:4473:1: rule__MarkVariableValueS__Group__4__Impl : ( ( rule__MarkVariableValueS__Group_4__0 )? ) ;
    public final void rule__MarkVariableValueS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4477:1: ( ( ( rule__MarkVariableValueS__Group_4__0 )? ) )
            // InternalShortDSLParser.g:4478:1: ( ( rule__MarkVariableValueS__Group_4__0 )? )
            {
            // InternalShortDSLParser.g:4478:1: ( ( rule__MarkVariableValueS__Group_4__0 )? )
            // InternalShortDSLParser.g:4479:2: ( rule__MarkVariableValueS__Group_4__0 )?
            {
             before(grammarAccess.getMarkVariableValueSAccess().getGroup_4()); 
            // InternalShortDSLParser.g:4480:2: ( rule__MarkVariableValueS__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Comma) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalShortDSLParser.g:4480:3: rule__MarkVariableValueS__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MarkVariableValueS__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMarkVariableValueSAccess().getGroup_4()); 

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
    // $ANTLR end "rule__MarkVariableValueS__Group__4__Impl"


    // $ANTLR start "rule__MarkVariableValueS__Group__5"
    // InternalShortDSLParser.g:4488:1: rule__MarkVariableValueS__Group__5 : rule__MarkVariableValueS__Group__5__Impl ;
    public final void rule__MarkVariableValueS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4492:1: ( rule__MarkVariableValueS__Group__5__Impl )
            // InternalShortDSLParser.g:4493:2: rule__MarkVariableValueS__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MarkVariableValueS__Group__5__Impl();

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
    // $ANTLR end "rule__MarkVariableValueS__Group__5"


    // $ANTLR start "rule__MarkVariableValueS__Group__5__Impl"
    // InternalShortDSLParser.g:4499:1: rule__MarkVariableValueS__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__MarkVariableValueS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4503:1: ( ( RightParenthesis ) )
            // InternalShortDSLParser.g:4504:1: ( RightParenthesis )
            {
            // InternalShortDSLParser.g:4504:1: ( RightParenthesis )
            // InternalShortDSLParser.g:4505:2: RightParenthesis
            {
             before(grammarAccess.getMarkVariableValueSAccess().getRightParenthesisKeyword_5()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getMarkVariableValueSAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__MarkVariableValueS__Group__5__Impl"


    // $ANTLR start "rule__MarkVariableValueS__Group_4__0"
    // InternalShortDSLParser.g:4515:1: rule__MarkVariableValueS__Group_4__0 : rule__MarkVariableValueS__Group_4__0__Impl rule__MarkVariableValueS__Group_4__1 ;
    public final void rule__MarkVariableValueS__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4519:1: ( rule__MarkVariableValueS__Group_4__0__Impl rule__MarkVariableValueS__Group_4__1 )
            // InternalShortDSLParser.g:4520:2: rule__MarkVariableValueS__Group_4__0__Impl rule__MarkVariableValueS__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__MarkVariableValueS__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkVariableValueS__Group_4__1();

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
    // $ANTLR end "rule__MarkVariableValueS__Group_4__0"


    // $ANTLR start "rule__MarkVariableValueS__Group_4__0__Impl"
    // InternalShortDSLParser.g:4527:1: rule__MarkVariableValueS__Group_4__0__Impl : ( Comma ) ;
    public final void rule__MarkVariableValueS__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4531:1: ( ( Comma ) )
            // InternalShortDSLParser.g:4532:1: ( Comma )
            {
            // InternalShortDSLParser.g:4532:1: ( Comma )
            // InternalShortDSLParser.g:4533:2: Comma
            {
             before(grammarAccess.getMarkVariableValueSAccess().getCommaKeyword_4_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getMarkVariableValueSAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__MarkVariableValueS__Group_4__0__Impl"


    // $ANTLR start "rule__MarkVariableValueS__Group_4__1"
    // InternalShortDSLParser.g:4542:1: rule__MarkVariableValueS__Group_4__1 : rule__MarkVariableValueS__Group_4__1__Impl rule__MarkVariableValueS__Group_4__2 ;
    public final void rule__MarkVariableValueS__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4546:1: ( rule__MarkVariableValueS__Group_4__1__Impl rule__MarkVariableValueS__Group_4__2 )
            // InternalShortDSLParser.g:4547:2: rule__MarkVariableValueS__Group_4__1__Impl rule__MarkVariableValueS__Group_4__2
            {
            pushFollow(FOLLOW_38);
            rule__MarkVariableValueS__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkVariableValueS__Group_4__2();

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
    // $ANTLR end "rule__MarkVariableValueS__Group_4__1"


    // $ANTLR start "rule__MarkVariableValueS__Group_4__1__Impl"
    // InternalShortDSLParser.g:4554:1: rule__MarkVariableValueS__Group_4__1__Impl : ( ( rule__MarkVariableValueS__TimeAssignment_4_1 ) ) ;
    public final void rule__MarkVariableValueS__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4558:1: ( ( ( rule__MarkVariableValueS__TimeAssignment_4_1 ) ) )
            // InternalShortDSLParser.g:4559:1: ( ( rule__MarkVariableValueS__TimeAssignment_4_1 ) )
            {
            // InternalShortDSLParser.g:4559:1: ( ( rule__MarkVariableValueS__TimeAssignment_4_1 ) )
            // InternalShortDSLParser.g:4560:2: ( rule__MarkVariableValueS__TimeAssignment_4_1 )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getTimeAssignment_4_1()); 
            // InternalShortDSLParser.g:4561:2: ( rule__MarkVariableValueS__TimeAssignment_4_1 )
            // InternalShortDSLParser.g:4561:3: rule__MarkVariableValueS__TimeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MarkVariableValueS__TimeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMarkVariableValueSAccess().getTimeAssignment_4_1()); 

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
    // $ANTLR end "rule__MarkVariableValueS__Group_4__1__Impl"


    // $ANTLR start "rule__MarkVariableValueS__Group_4__2"
    // InternalShortDSLParser.g:4569:1: rule__MarkVariableValueS__Group_4__2 : rule__MarkVariableValueS__Group_4__2__Impl ;
    public final void rule__MarkVariableValueS__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4573:1: ( rule__MarkVariableValueS__Group_4__2__Impl )
            // InternalShortDSLParser.g:4574:2: rule__MarkVariableValueS__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MarkVariableValueS__Group_4__2__Impl();

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
    // $ANTLR end "rule__MarkVariableValueS__Group_4__2"


    // $ANTLR start "rule__MarkVariableValueS__Group_4__2__Impl"
    // InternalShortDSLParser.g:4580:1: rule__MarkVariableValueS__Group_4__2__Impl : ( ( rule__MarkVariableValueS__UnitAssignment_4_2 ) ) ;
    public final void rule__MarkVariableValueS__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4584:1: ( ( ( rule__MarkVariableValueS__UnitAssignment_4_2 ) ) )
            // InternalShortDSLParser.g:4585:1: ( ( rule__MarkVariableValueS__UnitAssignment_4_2 ) )
            {
            // InternalShortDSLParser.g:4585:1: ( ( rule__MarkVariableValueS__UnitAssignment_4_2 ) )
            // InternalShortDSLParser.g:4586:2: ( rule__MarkVariableValueS__UnitAssignment_4_2 )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getUnitAssignment_4_2()); 
            // InternalShortDSLParser.g:4587:2: ( rule__MarkVariableValueS__UnitAssignment_4_2 )
            // InternalShortDSLParser.g:4587:3: rule__MarkVariableValueS__UnitAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__MarkVariableValueS__UnitAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMarkVariableValueSAccess().getUnitAssignment_4_2()); 

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
    // $ANTLR end "rule__MarkVariableValueS__Group_4__2__Impl"


    // $ANTLR start "rule__MarkCameraValueS__Group__0"
    // InternalShortDSLParser.g:4596:1: rule__MarkCameraValueS__Group__0 : rule__MarkCameraValueS__Group__0__Impl rule__MarkCameraValueS__Group__1 ;
    public final void rule__MarkCameraValueS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4600:1: ( rule__MarkCameraValueS__Group__0__Impl rule__MarkCameraValueS__Group__1 )
            // InternalShortDSLParser.g:4601:2: rule__MarkCameraValueS__Group__0__Impl rule__MarkCameraValueS__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__MarkCameraValueS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkCameraValueS__Group__1();

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
    // $ANTLR end "rule__MarkCameraValueS__Group__0"


    // $ANTLR start "rule__MarkCameraValueS__Group__0__Impl"
    // InternalShortDSLParser.g:4608:1: rule__MarkCameraValueS__Group__0__Impl : ( () ) ;
    public final void rule__MarkCameraValueS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4612:1: ( ( () ) )
            // InternalShortDSLParser.g:4613:1: ( () )
            {
            // InternalShortDSLParser.g:4613:1: ( () )
            // InternalShortDSLParser.g:4614:2: ()
            {
             before(grammarAccess.getMarkCameraValueSAccess().getMarkCameraValueAction_0()); 
            // InternalShortDSLParser.g:4615:2: ()
            // InternalShortDSLParser.g:4615:3: 
            {
            }

             after(grammarAccess.getMarkCameraValueSAccess().getMarkCameraValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkCameraValueS__Group__0__Impl"


    // $ANTLR start "rule__MarkCameraValueS__Group__1"
    // InternalShortDSLParser.g:4623:1: rule__MarkCameraValueS__Group__1 : rule__MarkCameraValueS__Group__1__Impl rule__MarkCameraValueS__Group__2 ;
    public final void rule__MarkCameraValueS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4627:1: ( rule__MarkCameraValueS__Group__1__Impl rule__MarkCameraValueS__Group__2 )
            // InternalShortDSLParser.g:4628:2: rule__MarkCameraValueS__Group__1__Impl rule__MarkCameraValueS__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__MarkCameraValueS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkCameraValueS__Group__2();

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
    // $ANTLR end "rule__MarkCameraValueS__Group__1"


    // $ANTLR start "rule__MarkCameraValueS__Group__1__Impl"
    // InternalShortDSLParser.g:4635:1: rule__MarkCameraValueS__Group__1__Impl : ( ( rule__MarkCameraValueS__CameraAssignment_1 ) ) ;
    public final void rule__MarkCameraValueS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4639:1: ( ( ( rule__MarkCameraValueS__CameraAssignment_1 ) ) )
            // InternalShortDSLParser.g:4640:1: ( ( rule__MarkCameraValueS__CameraAssignment_1 ) )
            {
            // InternalShortDSLParser.g:4640:1: ( ( rule__MarkCameraValueS__CameraAssignment_1 ) )
            // InternalShortDSLParser.g:4641:2: ( rule__MarkCameraValueS__CameraAssignment_1 )
            {
             before(grammarAccess.getMarkCameraValueSAccess().getCameraAssignment_1()); 
            // InternalShortDSLParser.g:4642:2: ( rule__MarkCameraValueS__CameraAssignment_1 )
            // InternalShortDSLParser.g:4642:3: rule__MarkCameraValueS__CameraAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MarkCameraValueS__CameraAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMarkCameraValueSAccess().getCameraAssignment_1()); 

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
    // $ANTLR end "rule__MarkCameraValueS__Group__1__Impl"


    // $ANTLR start "rule__MarkCameraValueS__Group__2"
    // InternalShortDSLParser.g:4650:1: rule__MarkCameraValueS__Group__2 : rule__MarkCameraValueS__Group__2__Impl rule__MarkCameraValueS__Group__3 ;
    public final void rule__MarkCameraValueS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4654:1: ( rule__MarkCameraValueS__Group__2__Impl rule__MarkCameraValueS__Group__3 )
            // InternalShortDSLParser.g:4655:2: rule__MarkCameraValueS__Group__2__Impl rule__MarkCameraValueS__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__MarkCameraValueS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkCameraValueS__Group__3();

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
    // $ANTLR end "rule__MarkCameraValueS__Group__2"


    // $ANTLR start "rule__MarkCameraValueS__Group__2__Impl"
    // InternalShortDSLParser.g:4662:1: rule__MarkCameraValueS__Group__2__Impl : ( Scan ) ;
    public final void rule__MarkCameraValueS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4666:1: ( ( Scan ) )
            // InternalShortDSLParser.g:4667:1: ( Scan )
            {
            // InternalShortDSLParser.g:4667:1: ( Scan )
            // InternalShortDSLParser.g:4668:2: Scan
            {
             before(grammarAccess.getMarkCameraValueSAccess().getScanKeyword_2()); 
            match(input,Scan,FOLLOW_2); 
             after(grammarAccess.getMarkCameraValueSAccess().getScanKeyword_2()); 

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
    // $ANTLR end "rule__MarkCameraValueS__Group__2__Impl"


    // $ANTLR start "rule__MarkCameraValueS__Group__3"
    // InternalShortDSLParser.g:4677:1: rule__MarkCameraValueS__Group__3 : rule__MarkCameraValueS__Group__3__Impl ;
    public final void rule__MarkCameraValueS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4681:1: ( rule__MarkCameraValueS__Group__3__Impl )
            // InternalShortDSLParser.g:4682:2: rule__MarkCameraValueS__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MarkCameraValueS__Group__3__Impl();

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
    // $ANTLR end "rule__MarkCameraValueS__Group__3"


    // $ANTLR start "rule__MarkCameraValueS__Group__3__Impl"
    // InternalShortDSLParser.g:4688:1: rule__MarkCameraValueS__Group__3__Impl : ( ( rule__MarkCameraValueS__VariableAssignment_3 ) ) ;
    public final void rule__MarkCameraValueS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4692:1: ( ( ( rule__MarkCameraValueS__VariableAssignment_3 ) ) )
            // InternalShortDSLParser.g:4693:1: ( ( rule__MarkCameraValueS__VariableAssignment_3 ) )
            {
            // InternalShortDSLParser.g:4693:1: ( ( rule__MarkCameraValueS__VariableAssignment_3 ) )
            // InternalShortDSLParser.g:4694:2: ( rule__MarkCameraValueS__VariableAssignment_3 )
            {
             before(grammarAccess.getMarkCameraValueSAccess().getVariableAssignment_3()); 
            // InternalShortDSLParser.g:4695:2: ( rule__MarkCameraValueS__VariableAssignment_3 )
            // InternalShortDSLParser.g:4695:3: rule__MarkCameraValueS__VariableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MarkCameraValueS__VariableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMarkCameraValueSAccess().getVariableAssignment_3()); 

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
    // $ANTLR end "rule__MarkCameraValueS__Group__3__Impl"


    // $ANTLR start "rule__LocalVariableS__Group__0"
    // InternalShortDSLParser.g:4704:1: rule__LocalVariableS__Group__0 : rule__LocalVariableS__Group__0__Impl rule__LocalVariableS__Group__1 ;
    public final void rule__LocalVariableS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4708:1: ( rule__LocalVariableS__Group__0__Impl rule__LocalVariableS__Group__1 )
            // InternalShortDSLParser.g:4709:2: rule__LocalVariableS__Group__0__Impl rule__LocalVariableS__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LocalVariableS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalVariableS__Group__1();

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
    // $ANTLR end "rule__LocalVariableS__Group__0"


    // $ANTLR start "rule__LocalVariableS__Group__0__Impl"
    // InternalShortDSLParser.g:4716:1: rule__LocalVariableS__Group__0__Impl : ( () ) ;
    public final void rule__LocalVariableS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4720:1: ( ( () ) )
            // InternalShortDSLParser.g:4721:1: ( () )
            {
            // InternalShortDSLParser.g:4721:1: ( () )
            // InternalShortDSLParser.g:4722:2: ()
            {
             before(grammarAccess.getLocalVariableSAccess().getLocalVariableAction_0()); 
            // InternalShortDSLParser.g:4723:2: ()
            // InternalShortDSLParser.g:4723:3: 
            {
            }

             after(grammarAccess.getLocalVariableSAccess().getLocalVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableS__Group__0__Impl"


    // $ANTLR start "rule__LocalVariableS__Group__1"
    // InternalShortDSLParser.g:4731:1: rule__LocalVariableS__Group__1 : rule__LocalVariableS__Group__1__Impl ;
    public final void rule__LocalVariableS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4735:1: ( rule__LocalVariableS__Group__1__Impl )
            // InternalShortDSLParser.g:4736:2: rule__LocalVariableS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalVariableS__Group__1__Impl();

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
    // $ANTLR end "rule__LocalVariableS__Group__1"


    // $ANTLR start "rule__LocalVariableS__Group__1__Impl"
    // InternalShortDSLParser.g:4742:1: rule__LocalVariableS__Group__1__Impl : ( ( rule__LocalVariableS__NameAssignment_1 ) ) ;
    public final void rule__LocalVariableS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4746:1: ( ( ( rule__LocalVariableS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:4747:1: ( ( rule__LocalVariableS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:4747:1: ( ( rule__LocalVariableS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:4748:2: ( rule__LocalVariableS__NameAssignment_1 )
            {
             before(grammarAccess.getLocalVariableSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:4749:2: ( rule__LocalVariableS__NameAssignment_1 )
            // InternalShortDSLParser.g:4749:3: rule__LocalVariableS__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalVariableS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalVariableSAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__LocalVariableS__Group__1__Impl"


    // $ANTLR start "rule__GlobalVariableS__Group__0"
    // InternalShortDSLParser.g:4758:1: rule__GlobalVariableS__Group__0 : rule__GlobalVariableS__Group__0__Impl rule__GlobalVariableS__Group__1 ;
    public final void rule__GlobalVariableS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4762:1: ( rule__GlobalVariableS__Group__0__Impl rule__GlobalVariableS__Group__1 )
            // InternalShortDSLParser.g:4763:2: rule__GlobalVariableS__Group__0__Impl rule__GlobalVariableS__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__GlobalVariableS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalVariableS__Group__1();

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
    // $ANTLR end "rule__GlobalVariableS__Group__0"


    // $ANTLR start "rule__GlobalVariableS__Group__0__Impl"
    // InternalShortDSLParser.g:4770:1: rule__GlobalVariableS__Group__0__Impl : ( () ) ;
    public final void rule__GlobalVariableS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4774:1: ( ( () ) )
            // InternalShortDSLParser.g:4775:1: ( () )
            {
            // InternalShortDSLParser.g:4775:1: ( () )
            // InternalShortDSLParser.g:4776:2: ()
            {
             before(grammarAccess.getGlobalVariableSAccess().getGlobalVariableAction_0()); 
            // InternalShortDSLParser.g:4777:2: ()
            // InternalShortDSLParser.g:4777:3: 
            {
            }

             after(grammarAccess.getGlobalVariableSAccess().getGlobalVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVariableS__Group__0__Impl"


    // $ANTLR start "rule__GlobalVariableS__Group__1"
    // InternalShortDSLParser.g:4785:1: rule__GlobalVariableS__Group__1 : rule__GlobalVariableS__Group__1__Impl ;
    public final void rule__GlobalVariableS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4789:1: ( rule__GlobalVariableS__Group__1__Impl )
            // InternalShortDSLParser.g:4790:2: rule__GlobalVariableS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalVariableS__Group__1__Impl();

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
    // $ANTLR end "rule__GlobalVariableS__Group__1"


    // $ANTLR start "rule__GlobalVariableS__Group__1__Impl"
    // InternalShortDSLParser.g:4796:1: rule__GlobalVariableS__Group__1__Impl : ( ( rule__GlobalVariableS__NameAssignment_1 ) ) ;
    public final void rule__GlobalVariableS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4800:1: ( ( ( rule__GlobalVariableS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:4801:1: ( ( rule__GlobalVariableS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:4801:1: ( ( rule__GlobalVariableS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:4802:2: ( rule__GlobalVariableS__NameAssignment_1 )
            {
             before(grammarAccess.getGlobalVariableSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:4803:2: ( rule__GlobalVariableS__NameAssignment_1 )
            // InternalShortDSLParser.g:4803:3: rule__GlobalVariableS__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalVariableS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalVariableSAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__GlobalVariableS__Group__1__Impl"


    // $ANTLR start "rule__Model__TypeAssignment_1_0_2"
    // InternalShortDSLParser.g:4812:1: rule__Model__TypeAssignment_1_0_2 : ( ruleDSL_Long ) ;
    public final void rule__Model__TypeAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4816:1: ( ( ruleDSL_Long ) )
            // InternalShortDSLParser.g:4817:2: ( ruleDSL_Long )
            {
            // InternalShortDSLParser.g:4817:2: ( ruleDSL_Long )
            // InternalShortDSLParser.g:4818:3: ruleDSL_Long
            {
             before(grammarAccess.getModelAccess().getTypeDSL_LongParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDSL_Long();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypeDSL_LongParserRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__Model__TypeAssignment_1_0_2"


    // $ANTLR start "rule__Model__TypeAssignment_1_1_2"
    // InternalShortDSLParser.g:4827:1: rule__Model__TypeAssignment_1_1_2 : ( ruleDSL_Short ) ;
    public final void rule__Model__TypeAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4831:1: ( ( ruleDSL_Short ) )
            // InternalShortDSLParser.g:4832:2: ( ruleDSL_Short )
            {
            // InternalShortDSLParser.g:4832:2: ( ruleDSL_Short )
            // InternalShortDSLParser.g:4833:3: ruleDSL_Short
            {
             before(grammarAccess.getModelAccess().getTypeDSL_ShortParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDSL_Short();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypeDSL_ShortParserRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__Model__TypeAssignment_1_1_2"


    // $ANTLR start "rule__DSL_Long__NameAssignment_1"
    // InternalShortDSLParser.g:4842:1: rule__DSL_Long__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSL_Long__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4846:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4847:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:4847:2: ( RULE_ID )
            // InternalShortDSLParser.g:4848:3: RULE_ID
            {
             before(grammarAccess.getDSL_LongAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSL_LongAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DSL_Long__NameAssignment_1"


    // $ANTLR start "rule__DSL_Short__ConfigurationAssignment_1"
    // InternalShortDSLParser.g:4857:1: rule__DSL_Short__ConfigurationAssignment_1 : ( ruleConfigurationS ) ;
    public final void rule__DSL_Short__ConfigurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4861:1: ( ( ruleConfigurationS ) )
            // InternalShortDSLParser.g:4862:2: ( ruleConfigurationS )
            {
            // InternalShortDSLParser.g:4862:2: ( ruleConfigurationS )
            // InternalShortDSLParser.g:4863:3: ruleConfigurationS
            {
             before(grammarAccess.getDSL_ShortAccess().getConfigurationConfigurationSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigurationS();

            state._fsp--;

             after(grammarAccess.getDSL_ShortAccess().getConfigurationConfigurationSParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DSL_Short__ConfigurationAssignment_1"


    // $ANTLR start "rule__DSL_Short__DiskHandlingsAssignment_2"
    // InternalShortDSLParser.g:4872:1: rule__DSL_Short__DiskHandlingsAssignment_2 : ( ruleDiskHandlingS ) ;
    public final void rule__DSL_Short__DiskHandlingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4876:1: ( ( ruleDiskHandlingS ) )
            // InternalShortDSLParser.g:4877:2: ( ruleDiskHandlingS )
            {
            // InternalShortDSLParser.g:4877:2: ( ruleDiskHandlingS )
            // InternalShortDSLParser.g:4878:3: ruleDiskHandlingS
            {
             before(grammarAccess.getDSL_ShortAccess().getDiskHandlingsDiskHandlingSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskHandlingS();

            state._fsp--;

             after(grammarAccess.getDSL_ShortAccess().getDiskHandlingsDiskHandlingSParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DSL_Short__DiskHandlingsAssignment_2"


    // $ANTLR start "rule__ConfigurationS__DevicesAssignment_3"
    // InternalShortDSLParser.g:4887:1: rule__ConfigurationS__DevicesAssignment_3 : ( ruleDeviceS ) ;
    public final void rule__ConfigurationS__DevicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4891:1: ( ( ruleDeviceS ) )
            // InternalShortDSLParser.g:4892:2: ( ruleDeviceS )
            {
            // InternalShortDSLParser.g:4892:2: ( ruleDeviceS )
            // InternalShortDSLParser.g:4893:3: ruleDeviceS
            {
             before(grammarAccess.getConfigurationSAccess().getDevicesDeviceSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceS();

            state._fsp--;

             after(grammarAccess.getConfigurationSAccess().getDevicesDeviceSParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ConfigurationS__DevicesAssignment_3"


    // $ANTLR start "rule__CraneS__NameAssignment_1"
    // InternalShortDSLParser.g:4902:1: rule__CraneS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CraneS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4906:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4907:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:4907:2: ( RULE_ID )
            // InternalShortDSLParser.g:4908:3: RULE_ID
            {
             before(grammarAccess.getCraneSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCraneSAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__CraneS__NameAssignment_1"


    // $ANTLR start "rule__CraneS__TargetsAssignment_4"
    // InternalShortDSLParser.g:4917:1: rule__CraneS__TargetsAssignment_4 : ( ruleCraneZoneS ) ;
    public final void rule__CraneS__TargetsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4921:1: ( ( ruleCraneZoneS ) )
            // InternalShortDSLParser.g:4922:2: ( ruleCraneZoneS )
            {
            // InternalShortDSLParser.g:4922:2: ( ruleCraneZoneS )
            // InternalShortDSLParser.g:4923:3: ruleCraneZoneS
            {
             before(grammarAccess.getCraneSAccess().getTargetsCraneZoneSParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCraneZoneS();

            state._fsp--;

             after(grammarAccess.getCraneSAccess().getTargetsCraneZoneSParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__CraneS__TargetsAssignment_4"


    // $ANTLR start "rule__CraneZoneS__NameAssignment_1"
    // InternalShortDSLParser.g:4932:1: rule__CraneZoneS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CraneZoneS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4936:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4937:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:4937:2: ( RULE_ID )
            // InternalShortDSLParser.g:4938:3: RULE_ID
            {
             before(grammarAccess.getCraneZoneSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCraneZoneSAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__CraneZoneS__NameAssignment_1"


    // $ANTLR start "rule__CraneZoneS__ZoneValueAssignment_3"
    // InternalShortDSLParser.g:4947:1: rule__CraneZoneS__ZoneValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__CraneZoneS__ZoneValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4951:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:4952:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:4952:2: ( RULE_INT )
            // InternalShortDSLParser.g:4953:3: RULE_INT
            {
             before(grammarAccess.getCraneZoneSAccess().getZoneValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCraneZoneSAccess().getZoneValueINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__CraneZoneS__ZoneValueAssignment_3"


    // $ANTLR start "rule__DiskS__NameAssignment_1"
    // InternalShortDSLParser.g:4962:1: rule__DiskS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DiskS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4966:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4967:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:4967:2: ( RULE_ID )
            // InternalShortDSLParser.g:4968:3: RULE_ID
            {
             before(grammarAccess.getDiskSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDiskSAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DiskS__NameAssignment_1"


    // $ANTLR start "rule__DiskS__NSlotsAssignment_3"
    // InternalShortDSLParser.g:4977:1: rule__DiskS__NSlotsAssignment_3 : ( RULE_INT ) ;
    public final void rule__DiskS__NSlotsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4981:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:4982:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:4982:2: ( RULE_INT )
            // InternalShortDSLParser.g:4983:3: RULE_INT
            {
             before(grammarAccess.getDiskSAccess().getNSlotsINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDiskSAccess().getNSlotsINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__DiskS__NSlotsAssignment_3"


    // $ANTLR start "rule__DiskS__TargetsAssignment_7"
    // InternalShortDSLParser.g:4992:1: rule__DiskS__TargetsAssignment_7 : ( ruleDiskZoneS ) ;
    public final void rule__DiskS__TargetsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4996:1: ( ( ruleDiskZoneS ) )
            // InternalShortDSLParser.g:4997:2: ( ruleDiskZoneS )
            {
            // InternalShortDSLParser.g:4997:2: ( ruleDiskZoneS )
            // InternalShortDSLParser.g:4998:3: ruleDiskZoneS
            {
             before(grammarAccess.getDiskSAccess().getTargetsDiskZoneSParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskZoneS();

            state._fsp--;

             after(grammarAccess.getDiskSAccess().getTargetsDiskZoneSParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__DiskS__TargetsAssignment_7"


    // $ANTLR start "rule__DiskZoneS__NameAssignment_1"
    // InternalShortDSLParser.g:5007:1: rule__DiskZoneS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DiskZoneS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5011:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5012:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5012:2: ( RULE_ID )
            // InternalShortDSLParser.g:5013:3: RULE_ID
            {
             before(grammarAccess.getDiskZoneSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDiskZoneSAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DiskZoneS__NameAssignment_1"


    // $ANTLR start "rule__DiskZoneS__SlotAssignment_3"
    // InternalShortDSLParser.g:5022:1: rule__DiskZoneS__SlotAssignment_3 : ( RULE_INT ) ;
    public final void rule__DiskZoneS__SlotAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5026:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:5027:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:5027:2: ( RULE_INT )
            // InternalShortDSLParser.g:5028:3: RULE_INT
            {
             before(grammarAccess.getDiskZoneSAccess().getSlotINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDiskZoneSAccess().getSlotINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__DiskZoneS__SlotAssignment_3"


    // $ANTLR start "rule__CameraS__NameAssignment_1"
    // InternalShortDSLParser.g:5037:1: rule__CameraS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CameraS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5041:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5042:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5042:2: ( RULE_ID )
            // InternalShortDSLParser.g:5043:3: RULE_ID
            {
             before(grammarAccess.getCameraSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCameraSAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__CameraS__NameAssignment_1"


    // $ANTLR start "rule__CameraS__TargetsAssignment_4"
    // InternalShortDSLParser.g:5052:1: rule__CameraS__TargetsAssignment_4 : ( ruleCameraColorS ) ;
    public final void rule__CameraS__TargetsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5056:1: ( ( ruleCameraColorS ) )
            // InternalShortDSLParser.g:5057:2: ( ruleCameraColorS )
            {
            // InternalShortDSLParser.g:5057:2: ( ruleCameraColorS )
            // InternalShortDSLParser.g:5058:3: ruleCameraColorS
            {
             before(grammarAccess.getCameraSAccess().getTargetsCameraColorSParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCameraColorS();

            state._fsp--;

             after(grammarAccess.getCameraSAccess().getTargetsCameraColorSParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__CameraS__TargetsAssignment_4"


    // $ANTLR start "rule__CameraColorS__ColorAssignment_1"
    // InternalShortDSLParser.g:5067:1: rule__CameraColorS__ColorAssignment_1 : ( ruleCOLOR_S ) ;
    public final void rule__CameraColorS__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5071:1: ( ( ruleCOLOR_S ) )
            // InternalShortDSLParser.g:5072:2: ( ruleCOLOR_S )
            {
            // InternalShortDSLParser.g:5072:2: ( ruleCOLOR_S )
            // InternalShortDSLParser.g:5073:3: ruleCOLOR_S
            {
             before(grammarAccess.getCameraColorSAccess().getColorCOLOR_SEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCOLOR_S();

            state._fsp--;

             after(grammarAccess.getCameraColorSAccess().getColorCOLOR_SEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__CameraColorS__ColorAssignment_1"


    // $ANTLR start "rule__DiskHandlingS__DiskAssignment_1"
    // InternalShortDSLParser.g:5082:1: rule__DiskHandlingS__DiskAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DiskHandlingS__DiskAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5086:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5087:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5087:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5088:3: ( RULE_ID )
            {
             before(grammarAccess.getDiskHandlingSAccess().getDiskDiskCrossReference_1_0()); 
            // InternalShortDSLParser.g:5089:3: ( RULE_ID )
            // InternalShortDSLParser.g:5090:4: RULE_ID
            {
             before(grammarAccess.getDiskHandlingSAccess().getDiskDiskIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDiskHandlingSAccess().getDiskDiskIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDiskHandlingSAccess().getDiskDiskCrossReference_1_0()); 

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
    // $ANTLR end "rule__DiskHandlingS__DiskAssignment_1"


    // $ANTLR start "rule__DiskHandlingS__StatementsAssignment_4"
    // InternalShortDSLParser.g:5101:1: rule__DiskHandlingS__StatementsAssignment_4 : ( ruleStatementS ) ;
    public final void rule__DiskHandlingS__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5105:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:5106:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:5106:2: ( ruleStatementS )
            // InternalShortDSLParser.g:5107:3: ruleStatementS
            {
             before(grammarAccess.getDiskHandlingSAccess().getStatementsStatementSParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementS();

            state._fsp--;

             after(grammarAccess.getDiskHandlingSAccess().getStatementsStatementSParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__DiskHandlingS__StatementsAssignment_4"


    // $ANTLR start "rule__LoopS__VariableAssignment_2"
    // InternalShortDSLParser.g:5116:1: rule__LoopS__VariableAssignment_2 : ( ruleLocalVariableS ) ;
    public final void rule__LoopS__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5120:1: ( ( ruleLocalVariableS ) )
            // InternalShortDSLParser.g:5121:2: ( ruleLocalVariableS )
            {
            // InternalShortDSLParser.g:5121:2: ( ruleLocalVariableS )
            // InternalShortDSLParser.g:5122:3: ruleLocalVariableS
            {
             before(grammarAccess.getLoopSAccess().getVariableLocalVariableSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalVariableS();

            state._fsp--;

             after(grammarAccess.getLoopSAccess().getVariableLocalVariableSParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LoopS__VariableAssignment_2"


    // $ANTLR start "rule__LoopS__ComparisonOperatorAssignment_3"
    // InternalShortDSLParser.g:5131:1: rule__LoopS__ComparisonOperatorAssignment_3 : ( ruleCOMPARISON_OPERATOR_S ) ;
    public final void rule__LoopS__ComparisonOperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5135:1: ( ( ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:5136:2: ( ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:5136:2: ( ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:5137:3: ruleCOMPARISON_OPERATOR_S
            {
             before(grammarAccess.getLoopSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMPARISON_OPERATOR_S();

            state._fsp--;

             after(grammarAccess.getLoopSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__LoopS__ComparisonOperatorAssignment_3"


    // $ANTLR start "rule__LoopS__SlotStateAssignment_4"
    // InternalShortDSLParser.g:5146:1: rule__LoopS__SlotStateAssignment_4 : ( ruleDiskSlotStateValueS ) ;
    public final void rule__LoopS__SlotStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5150:1: ( ( ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:5151:2: ( ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:5151:2: ( ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:5152:3: ruleDiskSlotStateValueS
            {
             before(grammarAccess.getLoopSAccess().getSlotStateDiskSlotStateValueSParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskSlotStateValueS();

            state._fsp--;

             after(grammarAccess.getLoopSAccess().getSlotStateDiskSlotStateValueSParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__LoopS__SlotStateAssignment_4"


    // $ANTLR start "rule__LoopS__StatementsAssignment_7"
    // InternalShortDSLParser.g:5161:1: rule__LoopS__StatementsAssignment_7 : ( ruleStatementS ) ;
    public final void rule__LoopS__StatementsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5165:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:5166:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:5166:2: ( ruleStatementS )
            // InternalShortDSLParser.g:5167:3: ruleStatementS
            {
             before(grammarAccess.getLoopSAccess().getStatementsStatementSParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementS();

            state._fsp--;

             after(grammarAccess.getLoopSAccess().getStatementsStatementSParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__LoopS__StatementsAssignment_7"


    // $ANTLR start "rule__MoveDiskS__SlotAssignment_1"
    // InternalShortDSLParser.g:5176:1: rule__MoveDiskS__SlotAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MoveDiskS__SlotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5180:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5181:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5181:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5182:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveDiskSAccess().getSlotLocalVariableCrossReference_1_0()); 
            // InternalShortDSLParser.g:5183:3: ( RULE_ID )
            // InternalShortDSLParser.g:5184:4: RULE_ID
            {
             before(grammarAccess.getMoveDiskSAccess().getSlotLocalVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMoveDiskSAccess().getSlotLocalVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMoveDiskSAccess().getSlotLocalVariableCrossReference_1_0()); 

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
    // $ANTLR end "rule__MoveDiskS__SlotAssignment_1"


    // $ANTLR start "rule__MoveDiskS__ZoneAssignment_3"
    // InternalShortDSLParser.g:5195:1: rule__MoveDiskS__ZoneAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MoveDiskS__ZoneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5199:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5200:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5200:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5201:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveDiskSAccess().getZoneDiskZoneCrossReference_3_0()); 
            // InternalShortDSLParser.g:5202:3: ( RULE_ID )
            // InternalShortDSLParser.g:5203:4: RULE_ID
            {
             before(grammarAccess.getMoveDiskSAccess().getZoneDiskZoneIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMoveDiskSAccess().getZoneDiskZoneIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMoveDiskSAccess().getZoneDiskZoneCrossReference_3_0()); 

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
    // $ANTLR end "rule__MoveDiskS__ZoneAssignment_3"


    // $ANTLR start "rule__MoveAnySlotS__StateAssignment_1"
    // InternalShortDSLParser.g:5214:1: rule__MoveAnySlotS__StateAssignment_1 : ( ruleDiskSlotStateValueS ) ;
    public final void rule__MoveAnySlotS__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5218:1: ( ( ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:5219:2: ( ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:5219:2: ( ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:5220:3: ruleDiskSlotStateValueS
            {
             before(grammarAccess.getMoveAnySlotSAccess().getStateDiskSlotStateValueSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskSlotStateValueS();

            state._fsp--;

             after(grammarAccess.getMoveAnySlotSAccess().getStateDiskSlotStateValueSParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MoveAnySlotS__StateAssignment_1"


    // $ANTLR start "rule__MoveAnySlotS__AnySlotAssignment_2"
    // InternalShortDSLParser.g:5229:1: rule__MoveAnySlotS__AnySlotAssignment_2 : ( ruleLocalVariableS ) ;
    public final void rule__MoveAnySlotS__AnySlotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5233:1: ( ( ruleLocalVariableS ) )
            // InternalShortDSLParser.g:5234:2: ( ruleLocalVariableS )
            {
            // InternalShortDSLParser.g:5234:2: ( ruleLocalVariableS )
            // InternalShortDSLParser.g:5235:3: ruleLocalVariableS
            {
             before(grammarAccess.getMoveAnySlotSAccess().getAnySlotLocalVariableSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalVariableS();

            state._fsp--;

             after(grammarAccess.getMoveAnySlotSAccess().getAnySlotLocalVariableSParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MoveAnySlotS__AnySlotAssignment_2"


    // $ANTLR start "rule__MoveAnySlotS__ZoneAssignment_4"
    // InternalShortDSLParser.g:5244:1: rule__MoveAnySlotS__ZoneAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__MoveAnySlotS__ZoneAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5248:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5249:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5249:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5250:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getZoneDiskZoneCrossReference_4_0()); 
            // InternalShortDSLParser.g:5251:3: ( RULE_ID )
            // InternalShortDSLParser.g:5252:4: RULE_ID
            {
             before(grammarAccess.getMoveAnySlotSAccess().getZoneDiskZoneIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMoveAnySlotSAccess().getZoneDiskZoneIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMoveAnySlotSAccess().getZoneDiskZoneCrossReference_4_0()); 

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
    // $ANTLR end "rule__MoveAnySlotS__ZoneAssignment_4"


    // $ANTLR start "rule__MoveCraneS__CraneAssignment_1"
    // InternalShortDSLParser.g:5263:1: rule__MoveCraneS__CraneAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MoveCraneS__CraneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5267:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5268:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5268:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5269:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveCraneSAccess().getCraneCraneCrossReference_1_0()); 
            // InternalShortDSLParser.g:5270:3: ( RULE_ID )
            // InternalShortDSLParser.g:5271:4: RULE_ID
            {
             before(grammarAccess.getMoveCraneSAccess().getCraneCraneIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMoveCraneSAccess().getCraneCraneIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMoveCraneSAccess().getCraneCraneCrossReference_1_0()); 

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
    // $ANTLR end "rule__MoveCraneS__CraneAssignment_1"


    // $ANTLR start "rule__MoveCraneS__ActionAssignment_2"
    // InternalShortDSLParser.g:5282:1: rule__MoveCraneS__ActionAssignment_2 : ( ruleCraneActionS ) ;
    public final void rule__MoveCraneS__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5286:1: ( ( ruleCraneActionS ) )
            // InternalShortDSLParser.g:5287:2: ( ruleCraneActionS )
            {
            // InternalShortDSLParser.g:5287:2: ( ruleCraneActionS )
            // InternalShortDSLParser.g:5288:3: ruleCraneActionS
            {
             before(grammarAccess.getMoveCraneSAccess().getActionCraneActionSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCraneActionS();

            state._fsp--;

             after(grammarAccess.getMoveCraneSAccess().getActionCraneActionSParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MoveCraneS__ActionAssignment_2"


    // $ANTLR start "rule__MoveCraneS__ZoneAssignment_4"
    // InternalShortDSLParser.g:5297:1: rule__MoveCraneS__ZoneAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__MoveCraneS__ZoneAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5301:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5302:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5302:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5303:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveCraneSAccess().getZoneCraneZoneCrossReference_4_0()); 
            // InternalShortDSLParser.g:5304:3: ( RULE_ID )
            // InternalShortDSLParser.g:5305:4: RULE_ID
            {
             before(grammarAccess.getMoveCraneSAccess().getZoneCraneZoneIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMoveCraneSAccess().getZoneCraneZoneIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMoveCraneSAccess().getZoneCraneZoneCrossReference_4_0()); 

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
    // $ANTLR end "rule__MoveCraneS__ZoneAssignment_4"


    // $ANTLR start "rule__ConditionVariableS__VariableAssignment_3"
    // InternalShortDSLParser.g:5316:1: rule__ConditionVariableS__VariableAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionVariableS__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5320:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5321:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5321:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5322:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionVariableSAccess().getVariableVariableSCrossReference_3_0()); 
            // InternalShortDSLParser.g:5323:3: ( RULE_ID )
            // InternalShortDSLParser.g:5324:4: RULE_ID
            {
             before(grammarAccess.getConditionVariableSAccess().getVariableVariableSIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionVariableSAccess().getVariableVariableSIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getConditionVariableSAccess().getVariableVariableSCrossReference_3_0()); 

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
    // $ANTLR end "rule__ConditionVariableS__VariableAssignment_3"


    // $ANTLR start "rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4"
    // InternalShortDSLParser.g:5335:1: rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4 : ( ruleCOMPARISON_OPERATOR_S ) ;
    public final void rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5339:1: ( ( ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:5340:2: ( ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:5340:2: ( ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:5341:3: ruleCOMPARISON_OPERATOR_S
            {
             before(grammarAccess.getConditionVariableSAccess().getComparisonOperatorVariableCOMPARISON_OPERATOR_SEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMPARISON_OPERATOR_S();

            state._fsp--;

             after(grammarAccess.getConditionVariableSAccess().getComparisonOperatorVariableCOMPARISON_OPERATOR_SEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4"


    // $ANTLR start "rule__ConditionVariableS__VariableValueAssignment_5"
    // InternalShortDSLParser.g:5350:1: rule__ConditionVariableS__VariableValueAssignment_5 : ( ruleVariableValue ) ;
    public final void rule__ConditionVariableS__VariableValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5354:1: ( ( ruleVariableValue ) )
            // InternalShortDSLParser.g:5355:2: ( ruleVariableValue )
            {
            // InternalShortDSLParser.g:5355:2: ( ruleVariableValue )
            // InternalShortDSLParser.g:5356:3: ruleVariableValue
            {
             before(grammarAccess.getConditionVariableSAccess().getVariableValueVariableValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableValue();

            state._fsp--;

             after(grammarAccess.getConditionVariableSAccess().getVariableValueVariableValueParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ConditionVariableS__VariableValueAssignment_5"


    // $ANTLR start "rule__ConditionVariableS__StatementsAssignment_8"
    // InternalShortDSLParser.g:5365:1: rule__ConditionVariableS__StatementsAssignment_8 : ( ruleStatementS ) ;
    public final void rule__ConditionVariableS__StatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5369:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:5370:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:5370:2: ( ruleStatementS )
            // InternalShortDSLParser.g:5371:3: ruleStatementS
            {
             before(grammarAccess.getConditionVariableSAccess().getStatementsStatementSParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementS();

            state._fsp--;

             after(grammarAccess.getConditionVariableSAccess().getStatementsStatementSParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__ConditionVariableS__StatementsAssignment_8"


    // $ANTLR start "rule__ConditionDeviceS__DeviceAssignment_3"
    // InternalShortDSLParser.g:5380:1: rule__ConditionDeviceS__DeviceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionDeviceS__DeviceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5384:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5385:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5385:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5386:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionDeviceSAccess().getDeviceDeviceSCrossReference_3_0()); 
            // InternalShortDSLParser.g:5387:3: ( RULE_ID )
            // InternalShortDSLParser.g:5388:4: RULE_ID
            {
             before(grammarAccess.getConditionDeviceSAccess().getDeviceDeviceSIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionDeviceSAccess().getDeviceDeviceSIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getConditionDeviceSAccess().getDeviceDeviceSCrossReference_3_0()); 

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
    // $ANTLR end "rule__ConditionDeviceS__DeviceAssignment_3"


    // $ANTLR start "rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4"
    // InternalShortDSLParser.g:5399:1: rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4 : ( ruleCOMPARISON_OPERATOR_S ) ;
    public final void rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5403:1: ( ( ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:5404:2: ( ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:5404:2: ( ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:5405:3: ruleCOMPARISON_OPERATOR_S
            {
             before(grammarAccess.getConditionDeviceSAccess().getComparisonOperatorDeviceCOMPARISON_OPERATOR_SEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMPARISON_OPERATOR_S();

            state._fsp--;

             after(grammarAccess.getConditionDeviceSAccess().getComparisonOperatorDeviceCOMPARISON_OPERATOR_SEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4"


    // $ANTLR start "rule__ConditionDeviceS__DeviceValueAssignment_5"
    // InternalShortDSLParser.g:5414:1: rule__ConditionDeviceS__DeviceValueAssignment_5 : ( ruleDeviceValue ) ;
    public final void rule__ConditionDeviceS__DeviceValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5418:1: ( ( ruleDeviceValue ) )
            // InternalShortDSLParser.g:5419:2: ( ruleDeviceValue )
            {
            // InternalShortDSLParser.g:5419:2: ( ruleDeviceValue )
            // InternalShortDSLParser.g:5420:3: ruleDeviceValue
            {
             before(grammarAccess.getConditionDeviceSAccess().getDeviceValueDeviceValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceValue();

            state._fsp--;

             after(grammarAccess.getConditionDeviceSAccess().getDeviceValueDeviceValueParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ConditionDeviceS__DeviceValueAssignment_5"


    // $ANTLR start "rule__ConditionDeviceS__StatementsAssignment_8"
    // InternalShortDSLParser.g:5429:1: rule__ConditionDeviceS__StatementsAssignment_8 : ( ruleStatementS ) ;
    public final void rule__ConditionDeviceS__StatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5433:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:5434:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:5434:2: ( ruleStatementS )
            // InternalShortDSLParser.g:5435:3: ruleStatementS
            {
             before(grammarAccess.getConditionDeviceSAccess().getStatementsStatementSParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementS();

            state._fsp--;

             after(grammarAccess.getConditionDeviceSAccess().getStatementsStatementSParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__ConditionDeviceS__StatementsAssignment_8"


    // $ANTLR start "rule__MarkVariableValueS__VariableAssignment_1"
    // InternalShortDSLParser.g:5444:1: rule__MarkVariableValueS__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MarkVariableValueS__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5448:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5449:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5449:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5450:3: ( RULE_ID )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getVariableVariableSCrossReference_1_0()); 
            // InternalShortDSLParser.g:5451:3: ( RULE_ID )
            // InternalShortDSLParser.g:5452:4: RULE_ID
            {
             before(grammarAccess.getMarkVariableValueSAccess().getVariableVariableSIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMarkVariableValueSAccess().getVariableVariableSIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMarkVariableValueSAccess().getVariableVariableSCrossReference_1_0()); 

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
    // $ANTLR end "rule__MarkVariableValueS__VariableAssignment_1"


    // $ANTLR start "rule__MarkVariableValueS__ValueAssignment_3"
    // InternalShortDSLParser.g:5463:1: rule__MarkVariableValueS__ValueAssignment_3 : ( ruleValueSlot ) ;
    public final void rule__MarkVariableValueS__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5467:1: ( ( ruleValueSlot ) )
            // InternalShortDSLParser.g:5468:2: ( ruleValueSlot )
            {
            // InternalShortDSLParser.g:5468:2: ( ruleValueSlot )
            // InternalShortDSLParser.g:5469:3: ruleValueSlot
            {
             before(grammarAccess.getMarkVariableValueSAccess().getValueValueSlotParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValueSlot();

            state._fsp--;

             after(grammarAccess.getMarkVariableValueSAccess().getValueValueSlotParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MarkVariableValueS__ValueAssignment_3"


    // $ANTLR start "rule__MarkVariableValueS__TimeAssignment_4_1"
    // InternalShortDSLParser.g:5478:1: rule__MarkVariableValueS__TimeAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__MarkVariableValueS__TimeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5482:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:5483:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:5483:2: ( RULE_INT )
            // InternalShortDSLParser.g:5484:3: RULE_INT
            {
             before(grammarAccess.getMarkVariableValueSAccess().getTimeINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMarkVariableValueSAccess().getTimeINTTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__MarkVariableValueS__TimeAssignment_4_1"


    // $ANTLR start "rule__MarkVariableValueS__UnitAssignment_4_2"
    // InternalShortDSLParser.g:5493:1: rule__MarkVariableValueS__UnitAssignment_4_2 : ( ruleTIME_UNIT ) ;
    public final void rule__MarkVariableValueS__UnitAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5497:1: ( ( ruleTIME_UNIT ) )
            // InternalShortDSLParser.g:5498:2: ( ruleTIME_UNIT )
            {
            // InternalShortDSLParser.g:5498:2: ( ruleTIME_UNIT )
            // InternalShortDSLParser.g:5499:3: ruleTIME_UNIT
            {
             before(grammarAccess.getMarkVariableValueSAccess().getUnitTIME_UNITEnumRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTIME_UNIT();

            state._fsp--;

             after(grammarAccess.getMarkVariableValueSAccess().getUnitTIME_UNITEnumRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__MarkVariableValueS__UnitAssignment_4_2"


    // $ANTLR start "rule__MarkCameraValueS__CameraAssignment_1"
    // InternalShortDSLParser.g:5508:1: rule__MarkCameraValueS__CameraAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MarkCameraValueS__CameraAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5512:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5513:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5513:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5514:3: ( RULE_ID )
            {
             before(grammarAccess.getMarkCameraValueSAccess().getCameraCameraCrossReference_1_0()); 
            // InternalShortDSLParser.g:5515:3: ( RULE_ID )
            // InternalShortDSLParser.g:5516:4: RULE_ID
            {
             before(grammarAccess.getMarkCameraValueSAccess().getCameraCameraIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMarkCameraValueSAccess().getCameraCameraIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMarkCameraValueSAccess().getCameraCameraCrossReference_1_0()); 

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
    // $ANTLR end "rule__MarkCameraValueS__CameraAssignment_1"


    // $ANTLR start "rule__MarkCameraValueS__VariableAssignment_3"
    // InternalShortDSLParser.g:5527:1: rule__MarkCameraValueS__VariableAssignment_3 : ( ruleLocalVariableS ) ;
    public final void rule__MarkCameraValueS__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5531:1: ( ( ruleLocalVariableS ) )
            // InternalShortDSLParser.g:5532:2: ( ruleLocalVariableS )
            {
            // InternalShortDSLParser.g:5532:2: ( ruleLocalVariableS )
            // InternalShortDSLParser.g:5533:3: ruleLocalVariableS
            {
             before(grammarAccess.getMarkCameraValueSAccess().getVariableLocalVariableSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalVariableS();

            state._fsp--;

             after(grammarAccess.getMarkCameraValueSAccess().getVariableLocalVariableSParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MarkCameraValueS__VariableAssignment_3"


    // $ANTLR start "rule__LocalVariableS__NameAssignment_1"
    // InternalShortDSLParser.g:5542:1: rule__LocalVariableS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LocalVariableS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5546:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5547:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5547:2: ( RULE_ID )
            // InternalShortDSLParser.g:5548:3: RULE_ID
            {
             before(grammarAccess.getLocalVariableSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocalVariableSAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__LocalVariableS__NameAssignment_1"


    // $ANTLR start "rule__GlobalVariableS__NameAssignment_1"
    // InternalShortDSLParser.g:5557:1: rule__GlobalVariableS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GlobalVariableS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5561:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5562:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5562:2: ( RULE_ID )
            // InternalShortDSLParser.g:5563:3: RULE_ID
            {
             before(grammarAccess.getGlobalVariableSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGlobalVariableSAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__GlobalVariableS__NameAssignment_1"


    // $ANTLR start "rule__VariableValue__ValueAssignment_0"
    // InternalShortDSLParser.g:5572:1: rule__VariableValue__ValueAssignment_0 : ( ruleDiskSlotStateValueS ) ;
    public final void rule__VariableValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5576:1: ( ( ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:5577:2: ( ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:5577:2: ( ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:5578:3: ruleDiskSlotStateValueS
            {
             before(grammarAccess.getVariableValueAccess().getValueDiskSlotStateValueSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskSlotStateValueS();

            state._fsp--;

             after(grammarAccess.getVariableValueAccess().getValueDiskSlotStateValueSParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__VariableValue__ValueAssignment_0"


    // $ANTLR start "rule__VariableValue__ValueAssignment_1"
    // InternalShortDSLParser.g:5587:1: rule__VariableValue__ValueAssignment_1 : ( ruleColorValueS ) ;
    public final void rule__VariableValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5591:1: ( ( ruleColorValueS ) )
            // InternalShortDSLParser.g:5592:2: ( ruleColorValueS )
            {
            // InternalShortDSLParser.g:5592:2: ( ruleColorValueS )
            // InternalShortDSLParser.g:5593:3: ruleColorValueS
            {
             before(grammarAccess.getVariableValueAccess().getValueColorValueSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColorValueS();

            state._fsp--;

             after(grammarAccess.getVariableValueAccess().getValueColorValueSParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__VariableValue__ValueAssignment_1"


    // $ANTLR start "rule__VariableValue__ValueAssignment_2"
    // InternalShortDSLParser.g:5602:1: rule__VariableValue__ValueAssignment_2 : ( ruleNumberS ) ;
    public final void rule__VariableValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5606:1: ( ( ruleNumberS ) )
            // InternalShortDSLParser.g:5607:2: ( ruleNumberS )
            {
            // InternalShortDSLParser.g:5607:2: ( ruleNumberS )
            // InternalShortDSLParser.g:5608:3: ruleNumberS
            {
             before(grammarAccess.getVariableValueAccess().getValueNumberSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberS();

            state._fsp--;

             after(grammarAccess.getVariableValueAccess().getValueNumberSParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__VariableValue__ValueAssignment_2"


    // $ANTLR start "rule__VariableValue__ValueAssignment_3"
    // InternalShortDSLParser.g:5617:1: rule__VariableValue__ValueAssignment_3 : ( ruleDiskStateValueS ) ;
    public final void rule__VariableValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5621:1: ( ( ruleDiskStateValueS ) )
            // InternalShortDSLParser.g:5622:2: ( ruleDiskStateValueS )
            {
            // InternalShortDSLParser.g:5622:2: ( ruleDiskStateValueS )
            // InternalShortDSLParser.g:5623:3: ruleDiskStateValueS
            {
             before(grammarAccess.getVariableValueAccess().getValueDiskStateValueSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskStateValueS();

            state._fsp--;

             after(grammarAccess.getVariableValueAccess().getValueDiskStateValueSParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__VariableValue__ValueAssignment_3"


    // $ANTLR start "rule__VariableValue__RefAssignment_4"
    // InternalShortDSLParser.g:5632:1: rule__VariableValue__RefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__VariableValue__RefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5636:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5637:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5637:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5638:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableValueAccess().getRefVariableSCrossReference_4_0()); 
            // InternalShortDSLParser.g:5639:3: ( RULE_ID )
            // InternalShortDSLParser.g:5640:4: RULE_ID
            {
             before(grammarAccess.getVariableValueAccess().getRefVariableSIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableValueAccess().getRefVariableSIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getVariableValueAccess().getRefVariableSCrossReference_4_0()); 

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
    // $ANTLR end "rule__VariableValue__RefAssignment_4"


    // $ANTLR start "rule__DeviceValue__ValueAssignment_0"
    // InternalShortDSLParser.g:5651:1: rule__DeviceValue__ValueAssignment_0 : ( ruleDiskStateValueS ) ;
    public final void rule__DeviceValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5655:1: ( ( ruleDiskStateValueS ) )
            // InternalShortDSLParser.g:5656:2: ( ruleDiskStateValueS )
            {
            // InternalShortDSLParser.g:5656:2: ( ruleDiskStateValueS )
            // InternalShortDSLParser.g:5657:3: ruleDiskStateValueS
            {
             before(grammarAccess.getDeviceValueAccess().getValueDiskStateValueSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskStateValueS();

            state._fsp--;

             after(grammarAccess.getDeviceValueAccess().getValueDiskStateValueSParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DeviceValue__ValueAssignment_0"


    // $ANTLR start "rule__DeviceValue__ValueAssignment_1"
    // InternalShortDSLParser.g:5666:1: rule__DeviceValue__ValueAssignment_1 : ( ruleColorValueS ) ;
    public final void rule__DeviceValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5670:1: ( ( ruleColorValueS ) )
            // InternalShortDSLParser.g:5671:2: ( ruleColorValueS )
            {
            // InternalShortDSLParser.g:5671:2: ( ruleColorValueS )
            // InternalShortDSLParser.g:5672:3: ruleColorValueS
            {
             before(grammarAccess.getDeviceValueAccess().getValueColorValueSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColorValueS();

            state._fsp--;

             after(grammarAccess.getDeviceValueAccess().getValueColorValueSParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DeviceValue__ValueAssignment_1"


    // $ANTLR start "rule__DeviceValue__ConfigurationValueAssignment_2"
    // InternalShortDSLParser.g:5681:1: rule__DeviceValue__ConfigurationValueAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DeviceValue__ConfigurationValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5685:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5686:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5686:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5687:3: ( RULE_ID )
            {
             before(grammarAccess.getDeviceValueAccess().getConfigurationValueConfigurationValueSCrossReference_2_0()); 
            // InternalShortDSLParser.g:5688:3: ( RULE_ID )
            // InternalShortDSLParser.g:5689:4: RULE_ID
            {
             before(grammarAccess.getDeviceValueAccess().getConfigurationValueConfigurationValueSIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceValueAccess().getConfigurationValueConfigurationValueSIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDeviceValueAccess().getConfigurationValueConfigurationValueSCrossReference_2_0()); 

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
    // $ANTLR end "rule__DeviceValue__ConfigurationValueAssignment_2"


    // $ANTLR start "rule__ValueSlot__ValueAssignment_0"
    // InternalShortDSLParser.g:5700:1: rule__ValueSlot__ValueAssignment_0 : ( ruleDiskSlotStateValueS ) ;
    public final void rule__ValueSlot__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5704:1: ( ( ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:5705:2: ( ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:5705:2: ( ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:5706:3: ruleDiskSlotStateValueS
            {
             before(grammarAccess.getValueSlotAccess().getValueDiskSlotStateValueSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskSlotStateValueS();

            state._fsp--;

             after(grammarAccess.getValueSlotAccess().getValueDiskSlotStateValueSParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ValueSlot__ValueAssignment_0"


    // $ANTLR start "rule__ValueSlot__ValueAssignment_1"
    // InternalShortDSLParser.g:5715:1: rule__ValueSlot__ValueAssignment_1 : ( ruleColorValueS ) ;
    public final void rule__ValueSlot__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5719:1: ( ( ruleColorValueS ) )
            // InternalShortDSLParser.g:5720:2: ( ruleColorValueS )
            {
            // InternalShortDSLParser.g:5720:2: ( ruleColorValueS )
            // InternalShortDSLParser.g:5721:3: ruleColorValueS
            {
             before(grammarAccess.getValueSlotAccess().getValueColorValueSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColorValueS();

            state._fsp--;

             after(grammarAccess.getValueSlotAccess().getValueColorValueSParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ValueSlot__ValueAssignment_1"


    // $ANTLR start "rule__DiskStateValueS__ValueAssignment"
    // InternalShortDSLParser.g:5730:1: rule__DiskStateValueS__ValueAssignment : ( ruleDISK_STATES_S ) ;
    public final void rule__DiskStateValueS__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5734:1: ( ( ruleDISK_STATES_S ) )
            // InternalShortDSLParser.g:5735:2: ( ruleDISK_STATES_S )
            {
            // InternalShortDSLParser.g:5735:2: ( ruleDISK_STATES_S )
            // InternalShortDSLParser.g:5736:3: ruleDISK_STATES_S
            {
             before(grammarAccess.getDiskStateValueSAccess().getValueDISK_STATES_SEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDISK_STATES_S();

            state._fsp--;

             after(grammarAccess.getDiskStateValueSAccess().getValueDISK_STATES_SEnumRuleCall_0()); 

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
    // $ANTLR end "rule__DiskStateValueS__ValueAssignment"


    // $ANTLR start "rule__DiskSlotStateValueS__ValueAssignment"
    // InternalShortDSLParser.g:5745:1: rule__DiskSlotStateValueS__ValueAssignment : ( ruleDISK_SLOT_STATES_S ) ;
    public final void rule__DiskSlotStateValueS__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5749:1: ( ( ruleDISK_SLOT_STATES_S ) )
            // InternalShortDSLParser.g:5750:2: ( ruleDISK_SLOT_STATES_S )
            {
            // InternalShortDSLParser.g:5750:2: ( ruleDISK_SLOT_STATES_S )
            // InternalShortDSLParser.g:5751:3: ruleDISK_SLOT_STATES_S
            {
             before(grammarAccess.getDiskSlotStateValueSAccess().getValueDISK_SLOT_STATES_SEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDISK_SLOT_STATES_S();

            state._fsp--;

             after(grammarAccess.getDiskSlotStateValueSAccess().getValueDISK_SLOT_STATES_SEnumRuleCall_0()); 

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
    // $ANTLR end "rule__DiskSlotStateValueS__ValueAssignment"


    // $ANTLR start "rule__ColorValueS__ValueAssignment"
    // InternalShortDSLParser.g:5760:1: rule__ColorValueS__ValueAssignment : ( ruleCOLOR_S ) ;
    public final void rule__ColorValueS__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5764:1: ( ( ruleCOLOR_S ) )
            // InternalShortDSLParser.g:5765:2: ( ruleCOLOR_S )
            {
            // InternalShortDSLParser.g:5765:2: ( ruleCOLOR_S )
            // InternalShortDSLParser.g:5766:3: ruleCOLOR_S
            {
             before(grammarAccess.getColorValueSAccess().getValueCOLOR_SEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCOLOR_S();

            state._fsp--;

             after(grammarAccess.getColorValueSAccess().getValueCOLOR_SEnumRuleCall_0()); 

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
    // $ANTLR end "rule__ColorValueS__ValueAssignment"


    // $ANTLR start "rule__NumberS__ValueAssignment"
    // InternalShortDSLParser.g:5775:1: rule__NumberS__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberS__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5779:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:5780:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:5780:2: ( RULE_INT )
            // InternalShortDSLParser.g:5781:3: RULE_INT
            {
             before(grammarAccess.getNumberSAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberSAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__NumberS__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000805000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000805002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000800100086B0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000800100086B2L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000E04000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000C00100086B0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000430L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000180000815C30L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000815800L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000805430L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000040000L});

}