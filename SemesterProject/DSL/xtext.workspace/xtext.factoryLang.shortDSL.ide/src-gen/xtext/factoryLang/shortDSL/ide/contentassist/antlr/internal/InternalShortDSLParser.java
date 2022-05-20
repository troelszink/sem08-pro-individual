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
    		tokenNameToValue.put("Free", "'free'");
    		tokenNameToValue.put("Full", "'full'");
    		tokenNameToValue.put("Long", "'long'");
    		tokenNameToValue.put("Scan", "'scan'");
    		tokenNameToValue.put("Test", "'test'");
    		tokenNameToValue.put("Empty", "'empty'");
    		tokenNameToValue.put("Green", "'green'");
    		tokenNameToValue.put("Short", "'short'");
    		tokenNameToValue.put("Handle", "'handle'");
    		tokenNameToValue.put("Pickup", "'pickup'");
    		tokenNameToValue.put("Devices", "'devices'");
    		tokenNameToValue.put("Foreach", "'foreach'");
    		tokenNameToValue.put("Logging", "'logging'");
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
    // InternalShortDSLParser.g:93:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:94:1: ( ruleModel EOF )
            // InternalShortDSLParser.g:95:1: ruleModel EOF
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
    // InternalShortDSLParser.g:102:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:106:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalShortDSLParser.g:107:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalShortDSLParser.g:107:2: ( ( rule__Model__Group__0 ) )
            // InternalShortDSLParser.g:108:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalShortDSLParser.g:109:3: ( rule__Model__Group__0 )
            // InternalShortDSLParser.g:109:4: rule__Model__Group__0
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


    // $ANTLR start "entryRuleDSLProgram"
    // InternalShortDSLParser.g:118:1: entryRuleDSLProgram : ruleDSLProgram EOF ;
    public final void entryRuleDSLProgram() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:119:1: ( ruleDSLProgram EOF )
            // InternalShortDSLParser.g:120:1: ruleDSLProgram EOF
            {
             before(grammarAccess.getDSLProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLProgram();

            state._fsp--;

             after(grammarAccess.getDSLProgramRule()); 
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
    // $ANTLR end "entryRuleDSLProgram"


    // $ANTLR start "ruleDSLProgram"
    // InternalShortDSLParser.g:127:1: ruleDSLProgram : ( ( rule__DSLProgram__Alternatives ) ) ;
    public final void ruleDSLProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:131:2: ( ( ( rule__DSLProgram__Alternatives ) ) )
            // InternalShortDSLParser.g:132:2: ( ( rule__DSLProgram__Alternatives ) )
            {
            // InternalShortDSLParser.g:132:2: ( ( rule__DSLProgram__Alternatives ) )
            // InternalShortDSLParser.g:133:3: ( rule__DSLProgram__Alternatives )
            {
             before(grammarAccess.getDSLProgramAccess().getAlternatives()); 
            // InternalShortDSLParser.g:134:3: ( rule__DSLProgram__Alternatives )
            // InternalShortDSLParser.g:134:4: rule__DSLProgram__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DSLProgram__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDSLProgramAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLProgram"


    // $ANTLR start "entryRuleDSLLong"
    // InternalShortDSLParser.g:143:1: entryRuleDSLLong : ruleDSLLong EOF ;
    public final void entryRuleDSLLong() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:144:1: ( ruleDSLLong EOF )
            // InternalShortDSLParser.g:145:1: ruleDSLLong EOF
            {
             before(grammarAccess.getDSLLongRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLLong();

            state._fsp--;

             after(grammarAccess.getDSLLongRule()); 
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
    // $ANTLR end "entryRuleDSLLong"


    // $ANTLR start "ruleDSLLong"
    // InternalShortDSLParser.g:152:1: ruleDSLLong : ( ( rule__DSLLong__Group__0 ) ) ;
    public final void ruleDSLLong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:156:2: ( ( ( rule__DSLLong__Group__0 ) ) )
            // InternalShortDSLParser.g:157:2: ( ( rule__DSLLong__Group__0 ) )
            {
            // InternalShortDSLParser.g:157:2: ( ( rule__DSLLong__Group__0 ) )
            // InternalShortDSLParser.g:158:3: ( rule__DSLLong__Group__0 )
            {
             before(grammarAccess.getDSLLongAccess().getGroup()); 
            // InternalShortDSLParser.g:159:3: ( rule__DSLLong__Group__0 )
            // InternalShortDSLParser.g:159:4: rule__DSLLong__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLLong__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLLongAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLLong"


    // $ANTLR start "entryRuleDSLShort"
    // InternalShortDSLParser.g:168:1: entryRuleDSLShort : ruleDSLShort EOF ;
    public final void entryRuleDSLShort() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:169:1: ( ruleDSLShort EOF )
            // InternalShortDSLParser.g:170:1: ruleDSLShort EOF
            {
             before(grammarAccess.getDSLShortRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLShort();

            state._fsp--;

             after(grammarAccess.getDSLShortRule()); 
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
    // $ANTLR end "entryRuleDSLShort"


    // $ANTLR start "ruleDSLShort"
    // InternalShortDSLParser.g:177:1: ruleDSLShort : ( ( rule__DSLShort__Group__0 ) ) ;
    public final void ruleDSLShort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:181:2: ( ( ( rule__DSLShort__Group__0 ) ) )
            // InternalShortDSLParser.g:182:2: ( ( rule__DSLShort__Group__0 ) )
            {
            // InternalShortDSLParser.g:182:2: ( ( rule__DSLShort__Group__0 ) )
            // InternalShortDSLParser.g:183:3: ( rule__DSLShort__Group__0 )
            {
             before(grammarAccess.getDSLShortAccess().getGroup()); 
            // InternalShortDSLParser.g:184:3: ( rule__DSLShort__Group__0 )
            // InternalShortDSLParser.g:184:4: rule__DSLShort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLShort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLShortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLShort"


    // $ANTLR start "entryRuleConfigurationS"
    // InternalShortDSLParser.g:193:1: entryRuleConfigurationS : ruleConfigurationS EOF ;
    public final void entryRuleConfigurationS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:194:1: ( ruleConfigurationS EOF )
            // InternalShortDSLParser.g:195:1: ruleConfigurationS EOF
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
    // InternalShortDSLParser.g:202:1: ruleConfigurationS : ( ( rule__ConfigurationS__Group__0 ) ) ;
    public final void ruleConfigurationS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:206:2: ( ( ( rule__ConfigurationS__Group__0 ) ) )
            // InternalShortDSLParser.g:207:2: ( ( rule__ConfigurationS__Group__0 ) )
            {
            // InternalShortDSLParser.g:207:2: ( ( rule__ConfigurationS__Group__0 ) )
            // InternalShortDSLParser.g:208:3: ( rule__ConfigurationS__Group__0 )
            {
             before(grammarAccess.getConfigurationSAccess().getGroup()); 
            // InternalShortDSLParser.g:209:3: ( rule__ConfigurationS__Group__0 )
            // InternalShortDSLParser.g:209:4: rule__ConfigurationS__Group__0
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
    // InternalShortDSLParser.g:218:1: entryRuleDeviceS : ruleDeviceS EOF ;
    public final void entryRuleDeviceS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:219:1: ( ruleDeviceS EOF )
            // InternalShortDSLParser.g:220:1: ruleDeviceS EOF
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
    // InternalShortDSLParser.g:227:1: ruleDeviceS : ( ( rule__DeviceS__Alternatives ) ) ;
    public final void ruleDeviceS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:231:2: ( ( ( rule__DeviceS__Alternatives ) ) )
            // InternalShortDSLParser.g:232:2: ( ( rule__DeviceS__Alternatives ) )
            {
            // InternalShortDSLParser.g:232:2: ( ( rule__DeviceS__Alternatives ) )
            // InternalShortDSLParser.g:233:3: ( rule__DeviceS__Alternatives )
            {
             before(grammarAccess.getDeviceSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:234:3: ( rule__DeviceS__Alternatives )
            // InternalShortDSLParser.g:234:4: rule__DeviceS__Alternatives
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
    // InternalShortDSLParser.g:243:1: entryRuleCraneS : ruleCraneS EOF ;
    public final void entryRuleCraneS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:244:1: ( ruleCraneS EOF )
            // InternalShortDSLParser.g:245:1: ruleCraneS EOF
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
    // InternalShortDSLParser.g:252:1: ruleCraneS : ( ( rule__CraneS__Group__0 ) ) ;
    public final void ruleCraneS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:256:2: ( ( ( rule__CraneS__Group__0 ) ) )
            // InternalShortDSLParser.g:257:2: ( ( rule__CraneS__Group__0 ) )
            {
            // InternalShortDSLParser.g:257:2: ( ( rule__CraneS__Group__0 ) )
            // InternalShortDSLParser.g:258:3: ( rule__CraneS__Group__0 )
            {
             before(grammarAccess.getCraneSAccess().getGroup()); 
            // InternalShortDSLParser.g:259:3: ( rule__CraneS__Group__0 )
            // InternalShortDSLParser.g:259:4: rule__CraneS__Group__0
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
    // InternalShortDSLParser.g:268:1: entryRuleCraneZoneS : ruleCraneZoneS EOF ;
    public final void entryRuleCraneZoneS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:269:1: ( ruleCraneZoneS EOF )
            // InternalShortDSLParser.g:270:1: ruleCraneZoneS EOF
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
    // InternalShortDSLParser.g:277:1: ruleCraneZoneS : ( ( rule__CraneZoneS__Group__0 ) ) ;
    public final void ruleCraneZoneS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:281:2: ( ( ( rule__CraneZoneS__Group__0 ) ) )
            // InternalShortDSLParser.g:282:2: ( ( rule__CraneZoneS__Group__0 ) )
            {
            // InternalShortDSLParser.g:282:2: ( ( rule__CraneZoneS__Group__0 ) )
            // InternalShortDSLParser.g:283:3: ( rule__CraneZoneS__Group__0 )
            {
             before(grammarAccess.getCraneZoneSAccess().getGroup()); 
            // InternalShortDSLParser.g:284:3: ( rule__CraneZoneS__Group__0 )
            // InternalShortDSLParser.g:284:4: rule__CraneZoneS__Group__0
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
    // InternalShortDSLParser.g:293:1: entryRuleDiskS : ruleDiskS EOF ;
    public final void entryRuleDiskS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:294:1: ( ruleDiskS EOF )
            // InternalShortDSLParser.g:295:1: ruleDiskS EOF
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
    // InternalShortDSLParser.g:302:1: ruleDiskS : ( ( rule__DiskS__Group__0 ) ) ;
    public final void ruleDiskS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:306:2: ( ( ( rule__DiskS__Group__0 ) ) )
            // InternalShortDSLParser.g:307:2: ( ( rule__DiskS__Group__0 ) )
            {
            // InternalShortDSLParser.g:307:2: ( ( rule__DiskS__Group__0 ) )
            // InternalShortDSLParser.g:308:3: ( rule__DiskS__Group__0 )
            {
             before(grammarAccess.getDiskSAccess().getGroup()); 
            // InternalShortDSLParser.g:309:3: ( rule__DiskS__Group__0 )
            // InternalShortDSLParser.g:309:4: rule__DiskS__Group__0
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
    // InternalShortDSLParser.g:318:1: entryRuleDiskZoneS : ruleDiskZoneS EOF ;
    public final void entryRuleDiskZoneS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:319:1: ( ruleDiskZoneS EOF )
            // InternalShortDSLParser.g:320:1: ruleDiskZoneS EOF
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
    // InternalShortDSLParser.g:327:1: ruleDiskZoneS : ( ( rule__DiskZoneS__Group__0 ) ) ;
    public final void ruleDiskZoneS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:331:2: ( ( ( rule__DiskZoneS__Group__0 ) ) )
            // InternalShortDSLParser.g:332:2: ( ( rule__DiskZoneS__Group__0 ) )
            {
            // InternalShortDSLParser.g:332:2: ( ( rule__DiskZoneS__Group__0 ) )
            // InternalShortDSLParser.g:333:3: ( rule__DiskZoneS__Group__0 )
            {
             before(grammarAccess.getDiskZoneSAccess().getGroup()); 
            // InternalShortDSLParser.g:334:3: ( rule__DiskZoneS__Group__0 )
            // InternalShortDSLParser.g:334:4: rule__DiskZoneS__Group__0
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
    // InternalShortDSLParser.g:343:1: entryRuleCameraS : ruleCameraS EOF ;
    public final void entryRuleCameraS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:344:1: ( ruleCameraS EOF )
            // InternalShortDSLParser.g:345:1: ruleCameraS EOF
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
    // InternalShortDSLParser.g:352:1: ruleCameraS : ( ( rule__CameraS__Group__0 ) ) ;
    public final void ruleCameraS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:356:2: ( ( ( rule__CameraS__Group__0 ) ) )
            // InternalShortDSLParser.g:357:2: ( ( rule__CameraS__Group__0 ) )
            {
            // InternalShortDSLParser.g:357:2: ( ( rule__CameraS__Group__0 ) )
            // InternalShortDSLParser.g:358:3: ( rule__CameraS__Group__0 )
            {
             before(grammarAccess.getCameraSAccess().getGroup()); 
            // InternalShortDSLParser.g:359:3: ( rule__CameraS__Group__0 )
            // InternalShortDSLParser.g:359:4: rule__CameraS__Group__0
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
    // InternalShortDSLParser.g:368:1: entryRuleCameraColorS : ruleCameraColorS EOF ;
    public final void entryRuleCameraColorS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:369:1: ( ruleCameraColorS EOF )
            // InternalShortDSLParser.g:370:1: ruleCameraColorS EOF
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
    // InternalShortDSLParser.g:377:1: ruleCameraColorS : ( ( rule__CameraColorS__Group__0 ) ) ;
    public final void ruleCameraColorS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:381:2: ( ( ( rule__CameraColorS__Group__0 ) ) )
            // InternalShortDSLParser.g:382:2: ( ( rule__CameraColorS__Group__0 ) )
            {
            // InternalShortDSLParser.g:382:2: ( ( rule__CameraColorS__Group__0 ) )
            // InternalShortDSLParser.g:383:3: ( rule__CameraColorS__Group__0 )
            {
             before(grammarAccess.getCameraColorSAccess().getGroup()); 
            // InternalShortDSLParser.g:384:3: ( rule__CameraColorS__Group__0 )
            // InternalShortDSLParser.g:384:4: rule__CameraColorS__Group__0
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


    // $ANTLR start "entryRuleLoggingS"
    // InternalShortDSLParser.g:393:1: entryRuleLoggingS : ruleLoggingS EOF ;
    public final void entryRuleLoggingS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:394:1: ( ruleLoggingS EOF )
            // InternalShortDSLParser.g:395:1: ruleLoggingS EOF
            {
             before(grammarAccess.getLoggingSRule()); 
            pushFollow(FOLLOW_1);
            ruleLoggingS();

            state._fsp--;

             after(grammarAccess.getLoggingSRule()); 
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
    // $ANTLR end "entryRuleLoggingS"


    // $ANTLR start "ruleLoggingS"
    // InternalShortDSLParser.g:402:1: ruleLoggingS : ( ( rule__LoggingS__Group__0 ) ) ;
    public final void ruleLoggingS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:406:2: ( ( ( rule__LoggingS__Group__0 ) ) )
            // InternalShortDSLParser.g:407:2: ( ( rule__LoggingS__Group__0 ) )
            {
            // InternalShortDSLParser.g:407:2: ( ( rule__LoggingS__Group__0 ) )
            // InternalShortDSLParser.g:408:3: ( rule__LoggingS__Group__0 )
            {
             before(grammarAccess.getLoggingSAccess().getGroup()); 
            // InternalShortDSLParser.g:409:3: ( rule__LoggingS__Group__0 )
            // InternalShortDSLParser.g:409:4: rule__LoggingS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoggingS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoggingSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoggingS"


    // $ANTLR start "entryRuleDiskHandlingS"
    // InternalShortDSLParser.g:418:1: entryRuleDiskHandlingS : ruleDiskHandlingS EOF ;
    public final void entryRuleDiskHandlingS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:419:1: ( ruleDiskHandlingS EOF )
            // InternalShortDSLParser.g:420:1: ruleDiskHandlingS EOF
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
    // InternalShortDSLParser.g:427:1: ruleDiskHandlingS : ( ( rule__DiskHandlingS__Group__0 ) ) ;
    public final void ruleDiskHandlingS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:431:2: ( ( ( rule__DiskHandlingS__Group__0 ) ) )
            // InternalShortDSLParser.g:432:2: ( ( rule__DiskHandlingS__Group__0 ) )
            {
            // InternalShortDSLParser.g:432:2: ( ( rule__DiskHandlingS__Group__0 ) )
            // InternalShortDSLParser.g:433:3: ( rule__DiskHandlingS__Group__0 )
            {
             before(grammarAccess.getDiskHandlingSAccess().getGroup()); 
            // InternalShortDSLParser.g:434:3: ( rule__DiskHandlingS__Group__0 )
            // InternalShortDSLParser.g:434:4: rule__DiskHandlingS__Group__0
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
    // InternalShortDSLParser.g:443:1: entryRuleStatementS : ruleStatementS EOF ;
    public final void entryRuleStatementS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:444:1: ( ruleStatementS EOF )
            // InternalShortDSLParser.g:445:1: ruleStatementS EOF
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
    // InternalShortDSLParser.g:452:1: ruleStatementS : ( ( rule__StatementS__Alternatives ) ) ;
    public final void ruleStatementS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:456:2: ( ( ( rule__StatementS__Alternatives ) ) )
            // InternalShortDSLParser.g:457:2: ( ( rule__StatementS__Alternatives ) )
            {
            // InternalShortDSLParser.g:457:2: ( ( rule__StatementS__Alternatives ) )
            // InternalShortDSLParser.g:458:3: ( rule__StatementS__Alternatives )
            {
             before(grammarAccess.getStatementSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:459:3: ( rule__StatementS__Alternatives )
            // InternalShortDSLParser.g:459:4: rule__StatementS__Alternatives
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
    // InternalShortDSLParser.g:468:1: entryRuleLoopS : ruleLoopS EOF ;
    public final void entryRuleLoopS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:469:1: ( ruleLoopS EOF )
            // InternalShortDSLParser.g:470:1: ruleLoopS EOF
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
    // InternalShortDSLParser.g:477:1: ruleLoopS : ( ( rule__LoopS__Group__0 ) ) ;
    public final void ruleLoopS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:481:2: ( ( ( rule__LoopS__Group__0 ) ) )
            // InternalShortDSLParser.g:482:2: ( ( rule__LoopS__Group__0 ) )
            {
            // InternalShortDSLParser.g:482:2: ( ( rule__LoopS__Group__0 ) )
            // InternalShortDSLParser.g:483:3: ( rule__LoopS__Group__0 )
            {
             before(grammarAccess.getLoopSAccess().getGroup()); 
            // InternalShortDSLParser.g:484:3: ( rule__LoopS__Group__0 )
            // InternalShortDSLParser.g:484:4: rule__LoopS__Group__0
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
    // InternalShortDSLParser.g:493:1: entryRuleMoveS : ruleMoveS EOF ;
    public final void entryRuleMoveS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:494:1: ( ruleMoveS EOF )
            // InternalShortDSLParser.g:495:1: ruleMoveS EOF
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
    // InternalShortDSLParser.g:502:1: ruleMoveS : ( ( rule__MoveS__Alternatives ) ) ;
    public final void ruleMoveS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:506:2: ( ( ( rule__MoveS__Alternatives ) ) )
            // InternalShortDSLParser.g:507:2: ( ( rule__MoveS__Alternatives ) )
            {
            // InternalShortDSLParser.g:507:2: ( ( rule__MoveS__Alternatives ) )
            // InternalShortDSLParser.g:508:3: ( rule__MoveS__Alternatives )
            {
             before(grammarAccess.getMoveSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:509:3: ( rule__MoveS__Alternatives )
            // InternalShortDSLParser.g:509:4: rule__MoveS__Alternatives
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
    // InternalShortDSLParser.g:518:1: entryRuleMoveDiskS : ruleMoveDiskS EOF ;
    public final void entryRuleMoveDiskS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:519:1: ( ruleMoveDiskS EOF )
            // InternalShortDSLParser.g:520:1: ruleMoveDiskS EOF
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
    // InternalShortDSLParser.g:527:1: ruleMoveDiskS : ( ( rule__MoveDiskS__Group__0 ) ) ;
    public final void ruleMoveDiskS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:531:2: ( ( ( rule__MoveDiskS__Group__0 ) ) )
            // InternalShortDSLParser.g:532:2: ( ( rule__MoveDiskS__Group__0 ) )
            {
            // InternalShortDSLParser.g:532:2: ( ( rule__MoveDiskS__Group__0 ) )
            // InternalShortDSLParser.g:533:3: ( rule__MoveDiskS__Group__0 )
            {
             before(grammarAccess.getMoveDiskSAccess().getGroup()); 
            // InternalShortDSLParser.g:534:3: ( rule__MoveDiskS__Group__0 )
            // InternalShortDSLParser.g:534:4: rule__MoveDiskS__Group__0
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
    // InternalShortDSLParser.g:543:1: entryRuleMoveAnySlotS : ruleMoveAnySlotS EOF ;
    public final void entryRuleMoveAnySlotS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:544:1: ( ruleMoveAnySlotS EOF )
            // InternalShortDSLParser.g:545:1: ruleMoveAnySlotS EOF
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
    // InternalShortDSLParser.g:552:1: ruleMoveAnySlotS : ( ( rule__MoveAnySlotS__Group__0 ) ) ;
    public final void ruleMoveAnySlotS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:556:2: ( ( ( rule__MoveAnySlotS__Group__0 ) ) )
            // InternalShortDSLParser.g:557:2: ( ( rule__MoveAnySlotS__Group__0 ) )
            {
            // InternalShortDSLParser.g:557:2: ( ( rule__MoveAnySlotS__Group__0 ) )
            // InternalShortDSLParser.g:558:3: ( rule__MoveAnySlotS__Group__0 )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getGroup()); 
            // InternalShortDSLParser.g:559:3: ( rule__MoveAnySlotS__Group__0 )
            // InternalShortDSLParser.g:559:4: rule__MoveAnySlotS__Group__0
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
    // InternalShortDSLParser.g:568:1: entryRuleMoveCraneS : ruleMoveCraneS EOF ;
    public final void entryRuleMoveCraneS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:569:1: ( ruleMoveCraneS EOF )
            // InternalShortDSLParser.g:570:1: ruleMoveCraneS EOF
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
    // InternalShortDSLParser.g:577:1: ruleMoveCraneS : ( ( rule__MoveCraneS__Group__0 ) ) ;
    public final void ruleMoveCraneS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:581:2: ( ( ( rule__MoveCraneS__Group__0 ) ) )
            // InternalShortDSLParser.g:582:2: ( ( rule__MoveCraneS__Group__0 ) )
            {
            // InternalShortDSLParser.g:582:2: ( ( rule__MoveCraneS__Group__0 ) )
            // InternalShortDSLParser.g:583:3: ( rule__MoveCraneS__Group__0 )
            {
             before(grammarAccess.getMoveCraneSAccess().getGroup()); 
            // InternalShortDSLParser.g:584:3: ( rule__MoveCraneS__Group__0 )
            // InternalShortDSLParser.g:584:4: rule__MoveCraneS__Group__0
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
    // InternalShortDSLParser.g:593:1: entryRuleCraneActionS : ruleCraneActionS EOF ;
    public final void entryRuleCraneActionS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:594:1: ( ruleCraneActionS EOF )
            // InternalShortDSLParser.g:595:1: ruleCraneActionS EOF
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
    // InternalShortDSLParser.g:602:1: ruleCraneActionS : ( ( rule__CraneActionS__Group__0 ) ) ;
    public final void ruleCraneActionS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:606:2: ( ( ( rule__CraneActionS__Group__0 ) ) )
            // InternalShortDSLParser.g:607:2: ( ( rule__CraneActionS__Group__0 ) )
            {
            // InternalShortDSLParser.g:607:2: ( ( rule__CraneActionS__Group__0 ) )
            // InternalShortDSLParser.g:608:3: ( rule__CraneActionS__Group__0 )
            {
             before(grammarAccess.getCraneActionSAccess().getGroup()); 
            // InternalShortDSLParser.g:609:3: ( rule__CraneActionS__Group__0 )
            // InternalShortDSLParser.g:609:4: rule__CraneActionS__Group__0
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
    // InternalShortDSLParser.g:618:1: entryRuleConditionS : ruleConditionS EOF ;
    public final void entryRuleConditionS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:619:1: ( ruleConditionS EOF )
            // InternalShortDSLParser.g:620:1: ruleConditionS EOF
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
    // InternalShortDSLParser.g:627:1: ruleConditionS : ( ( rule__ConditionS__Alternatives ) ) ;
    public final void ruleConditionS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:631:2: ( ( ( rule__ConditionS__Alternatives ) ) )
            // InternalShortDSLParser.g:632:2: ( ( rule__ConditionS__Alternatives ) )
            {
            // InternalShortDSLParser.g:632:2: ( ( rule__ConditionS__Alternatives ) )
            // InternalShortDSLParser.g:633:3: ( rule__ConditionS__Alternatives )
            {
             before(grammarAccess.getConditionSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:634:3: ( rule__ConditionS__Alternatives )
            // InternalShortDSLParser.g:634:4: rule__ConditionS__Alternatives
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
    // InternalShortDSLParser.g:643:1: entryRuleConditionVariableS : ruleConditionVariableS EOF ;
    public final void entryRuleConditionVariableS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:644:1: ( ruleConditionVariableS EOF )
            // InternalShortDSLParser.g:645:1: ruleConditionVariableS EOF
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
    // InternalShortDSLParser.g:652:1: ruleConditionVariableS : ( ( rule__ConditionVariableS__Group__0 ) ) ;
    public final void ruleConditionVariableS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:656:2: ( ( ( rule__ConditionVariableS__Group__0 ) ) )
            // InternalShortDSLParser.g:657:2: ( ( rule__ConditionVariableS__Group__0 ) )
            {
            // InternalShortDSLParser.g:657:2: ( ( rule__ConditionVariableS__Group__0 ) )
            // InternalShortDSLParser.g:658:3: ( rule__ConditionVariableS__Group__0 )
            {
             before(grammarAccess.getConditionVariableSAccess().getGroup()); 
            // InternalShortDSLParser.g:659:3: ( rule__ConditionVariableS__Group__0 )
            // InternalShortDSLParser.g:659:4: rule__ConditionVariableS__Group__0
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
    // InternalShortDSLParser.g:668:1: entryRuleConditionDeviceS : ruleConditionDeviceS EOF ;
    public final void entryRuleConditionDeviceS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:669:1: ( ruleConditionDeviceS EOF )
            // InternalShortDSLParser.g:670:1: ruleConditionDeviceS EOF
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
    // InternalShortDSLParser.g:677:1: ruleConditionDeviceS : ( ( rule__ConditionDeviceS__Group__0 ) ) ;
    public final void ruleConditionDeviceS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:681:2: ( ( ( rule__ConditionDeviceS__Group__0 ) ) )
            // InternalShortDSLParser.g:682:2: ( ( rule__ConditionDeviceS__Group__0 ) )
            {
            // InternalShortDSLParser.g:682:2: ( ( rule__ConditionDeviceS__Group__0 ) )
            // InternalShortDSLParser.g:683:3: ( rule__ConditionDeviceS__Group__0 )
            {
             before(grammarAccess.getConditionDeviceSAccess().getGroup()); 
            // InternalShortDSLParser.g:684:3: ( rule__ConditionDeviceS__Group__0 )
            // InternalShortDSLParser.g:684:4: rule__ConditionDeviceS__Group__0
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
    // InternalShortDSLParser.g:693:1: entryRuleMarkS : ruleMarkS EOF ;
    public final void entryRuleMarkS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:694:1: ( ruleMarkS EOF )
            // InternalShortDSLParser.g:695:1: ruleMarkS EOF
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
    // InternalShortDSLParser.g:702:1: ruleMarkS : ( ( rule__MarkS__Alternatives ) ) ;
    public final void ruleMarkS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:706:2: ( ( ( rule__MarkS__Alternatives ) ) )
            // InternalShortDSLParser.g:707:2: ( ( rule__MarkS__Alternatives ) )
            {
            // InternalShortDSLParser.g:707:2: ( ( rule__MarkS__Alternatives ) )
            // InternalShortDSLParser.g:708:3: ( rule__MarkS__Alternatives )
            {
             before(grammarAccess.getMarkSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:709:3: ( rule__MarkS__Alternatives )
            // InternalShortDSLParser.g:709:4: rule__MarkS__Alternatives
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
    // InternalShortDSLParser.g:718:1: entryRuleMarkVariableValueS : ruleMarkVariableValueS EOF ;
    public final void entryRuleMarkVariableValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:719:1: ( ruleMarkVariableValueS EOF )
            // InternalShortDSLParser.g:720:1: ruleMarkVariableValueS EOF
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
    // InternalShortDSLParser.g:727:1: ruleMarkVariableValueS : ( ( rule__MarkVariableValueS__Group__0 ) ) ;
    public final void ruleMarkVariableValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:731:2: ( ( ( rule__MarkVariableValueS__Group__0 ) ) )
            // InternalShortDSLParser.g:732:2: ( ( rule__MarkVariableValueS__Group__0 ) )
            {
            // InternalShortDSLParser.g:732:2: ( ( rule__MarkVariableValueS__Group__0 ) )
            // InternalShortDSLParser.g:733:3: ( rule__MarkVariableValueS__Group__0 )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getGroup()); 
            // InternalShortDSLParser.g:734:3: ( rule__MarkVariableValueS__Group__0 )
            // InternalShortDSLParser.g:734:4: rule__MarkVariableValueS__Group__0
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
    // InternalShortDSLParser.g:743:1: entryRuleMarkCameraValueS : ruleMarkCameraValueS EOF ;
    public final void entryRuleMarkCameraValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:744:1: ( ruleMarkCameraValueS EOF )
            // InternalShortDSLParser.g:745:1: ruleMarkCameraValueS EOF
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
    // InternalShortDSLParser.g:752:1: ruleMarkCameraValueS : ( ( rule__MarkCameraValueS__Group__0 ) ) ;
    public final void ruleMarkCameraValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:756:2: ( ( ( rule__MarkCameraValueS__Group__0 ) ) )
            // InternalShortDSLParser.g:757:2: ( ( rule__MarkCameraValueS__Group__0 ) )
            {
            // InternalShortDSLParser.g:757:2: ( ( rule__MarkCameraValueS__Group__0 ) )
            // InternalShortDSLParser.g:758:3: ( rule__MarkCameraValueS__Group__0 )
            {
             before(grammarAccess.getMarkCameraValueSAccess().getGroup()); 
            // InternalShortDSLParser.g:759:3: ( rule__MarkCameraValueS__Group__0 )
            // InternalShortDSLParser.g:759:4: rule__MarkCameraValueS__Group__0
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
    // InternalShortDSLParser.g:768:1: entryRuleLocalVariableS : ruleLocalVariableS EOF ;
    public final void entryRuleLocalVariableS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:769:1: ( ruleLocalVariableS EOF )
            // InternalShortDSLParser.g:770:1: ruleLocalVariableS EOF
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
    // InternalShortDSLParser.g:777:1: ruleLocalVariableS : ( ( rule__LocalVariableS__Group__0 ) ) ;
    public final void ruleLocalVariableS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:781:2: ( ( ( rule__LocalVariableS__Group__0 ) ) )
            // InternalShortDSLParser.g:782:2: ( ( rule__LocalVariableS__Group__0 ) )
            {
            // InternalShortDSLParser.g:782:2: ( ( rule__LocalVariableS__Group__0 ) )
            // InternalShortDSLParser.g:783:3: ( rule__LocalVariableS__Group__0 )
            {
             before(grammarAccess.getLocalVariableSAccess().getGroup()); 
            // InternalShortDSLParser.g:784:3: ( rule__LocalVariableS__Group__0 )
            // InternalShortDSLParser.g:784:4: rule__LocalVariableS__Group__0
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
    // InternalShortDSLParser.g:793:1: entryRuleGlobalVariableS : ruleGlobalVariableS EOF ;
    public final void entryRuleGlobalVariableS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:794:1: ( ruleGlobalVariableS EOF )
            // InternalShortDSLParser.g:795:1: ruleGlobalVariableS EOF
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
    // InternalShortDSLParser.g:802:1: ruleGlobalVariableS : ( ( rule__GlobalVariableS__Group__0 ) ) ;
    public final void ruleGlobalVariableS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:806:2: ( ( ( rule__GlobalVariableS__Group__0 ) ) )
            // InternalShortDSLParser.g:807:2: ( ( rule__GlobalVariableS__Group__0 ) )
            {
            // InternalShortDSLParser.g:807:2: ( ( rule__GlobalVariableS__Group__0 ) )
            // InternalShortDSLParser.g:808:3: ( rule__GlobalVariableS__Group__0 )
            {
             before(grammarAccess.getGlobalVariableSAccess().getGroup()); 
            // InternalShortDSLParser.g:809:3: ( rule__GlobalVariableS__Group__0 )
            // InternalShortDSLParser.g:809:4: rule__GlobalVariableS__Group__0
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


    // $ANTLR start "entryRuleVariableValueS"
    // InternalShortDSLParser.g:818:1: entryRuleVariableValueS : ruleVariableValueS EOF ;
    public final void entryRuleVariableValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:819:1: ( ruleVariableValueS EOF )
            // InternalShortDSLParser.g:820:1: ruleVariableValueS EOF
            {
             before(grammarAccess.getVariableValueSRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableValueS();

            state._fsp--;

             after(grammarAccess.getVariableValueSRule()); 
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
    // $ANTLR end "entryRuleVariableValueS"


    // $ANTLR start "ruleVariableValueS"
    // InternalShortDSLParser.g:827:1: ruleVariableValueS : ( ( rule__VariableValueS__Alternatives ) ) ;
    public final void ruleVariableValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:831:2: ( ( ( rule__VariableValueS__Alternatives ) ) )
            // InternalShortDSLParser.g:832:2: ( ( rule__VariableValueS__Alternatives ) )
            {
            // InternalShortDSLParser.g:832:2: ( ( rule__VariableValueS__Alternatives ) )
            // InternalShortDSLParser.g:833:3: ( rule__VariableValueS__Alternatives )
            {
             before(grammarAccess.getVariableValueSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:834:3: ( rule__VariableValueS__Alternatives )
            // InternalShortDSLParser.g:834:4: rule__VariableValueS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableValueS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableValueSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableValueS"


    // $ANTLR start "entryRuleDeviceValueS"
    // InternalShortDSLParser.g:843:1: entryRuleDeviceValueS : ruleDeviceValueS EOF ;
    public final void entryRuleDeviceValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:844:1: ( ruleDeviceValueS EOF )
            // InternalShortDSLParser.g:845:1: ruleDeviceValueS EOF
            {
             before(grammarAccess.getDeviceValueSRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceValueS();

            state._fsp--;

             after(grammarAccess.getDeviceValueSRule()); 
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
    // $ANTLR end "entryRuleDeviceValueS"


    // $ANTLR start "ruleDeviceValueS"
    // InternalShortDSLParser.g:852:1: ruleDeviceValueS : ( ( rule__DeviceValueS__Alternatives ) ) ;
    public final void ruleDeviceValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:856:2: ( ( ( rule__DeviceValueS__Alternatives ) ) )
            // InternalShortDSLParser.g:857:2: ( ( rule__DeviceValueS__Alternatives ) )
            {
            // InternalShortDSLParser.g:857:2: ( ( rule__DeviceValueS__Alternatives ) )
            // InternalShortDSLParser.g:858:3: ( rule__DeviceValueS__Alternatives )
            {
             before(grammarAccess.getDeviceValueSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:859:3: ( rule__DeviceValueS__Alternatives )
            // InternalShortDSLParser.g:859:4: rule__DeviceValueS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DeviceValueS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeviceValueSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceValueS"


    // $ANTLR start "entryRuleValueSlotS"
    // InternalShortDSLParser.g:868:1: entryRuleValueSlotS : ruleValueSlotS EOF ;
    public final void entryRuleValueSlotS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:869:1: ( ruleValueSlotS EOF )
            // InternalShortDSLParser.g:870:1: ruleValueSlotS EOF
            {
             before(grammarAccess.getValueSlotSRule()); 
            pushFollow(FOLLOW_1);
            ruleValueSlotS();

            state._fsp--;

             after(grammarAccess.getValueSlotSRule()); 
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
    // $ANTLR end "entryRuleValueSlotS"


    // $ANTLR start "ruleValueSlotS"
    // InternalShortDSLParser.g:877:1: ruleValueSlotS : ( ( rule__ValueSlotS__Alternatives ) ) ;
    public final void ruleValueSlotS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:881:2: ( ( ( rule__ValueSlotS__Alternatives ) ) )
            // InternalShortDSLParser.g:882:2: ( ( rule__ValueSlotS__Alternatives ) )
            {
            // InternalShortDSLParser.g:882:2: ( ( rule__ValueSlotS__Alternatives ) )
            // InternalShortDSLParser.g:883:3: ( rule__ValueSlotS__Alternatives )
            {
             before(grammarAccess.getValueSlotSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:884:3: ( rule__ValueSlotS__Alternatives )
            // InternalShortDSLParser.g:884:4: rule__ValueSlotS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValueSlotS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueSlotSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueSlotS"


    // $ANTLR start "entryRuleDSLTypeValue"
    // InternalShortDSLParser.g:893:1: entryRuleDSLTypeValue : ruleDSLTypeValue EOF ;
    public final void entryRuleDSLTypeValue() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:894:1: ( ruleDSLTypeValue EOF )
            // InternalShortDSLParser.g:895:1: ruleDSLTypeValue EOF
            {
             before(grammarAccess.getDSLTypeValueRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLTypeValue();

            state._fsp--;

             after(grammarAccess.getDSLTypeValueRule()); 
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
    // $ANTLR end "entryRuleDSLTypeValue"


    // $ANTLR start "ruleDSLTypeValue"
    // InternalShortDSLParser.g:902:1: ruleDSLTypeValue : ( ( rule__DSLTypeValue__ValueAssignment ) ) ;
    public final void ruleDSLTypeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:906:2: ( ( ( rule__DSLTypeValue__ValueAssignment ) ) )
            // InternalShortDSLParser.g:907:2: ( ( rule__DSLTypeValue__ValueAssignment ) )
            {
            // InternalShortDSLParser.g:907:2: ( ( rule__DSLTypeValue__ValueAssignment ) )
            // InternalShortDSLParser.g:908:3: ( rule__DSLTypeValue__ValueAssignment )
            {
             before(grammarAccess.getDSLTypeValueAccess().getValueAssignment()); 
            // InternalShortDSLParser.g:909:3: ( rule__DSLTypeValue__ValueAssignment )
            // InternalShortDSLParser.g:909:4: rule__DSLTypeValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DSLTypeValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDSLTypeValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLTypeValue"


    // $ANTLR start "entryRuleDiskStateValueS"
    // InternalShortDSLParser.g:918:1: entryRuleDiskStateValueS : ruleDiskStateValueS EOF ;
    public final void entryRuleDiskStateValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:919:1: ( ruleDiskStateValueS EOF )
            // InternalShortDSLParser.g:920:1: ruleDiskStateValueS EOF
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
    // InternalShortDSLParser.g:927:1: ruleDiskStateValueS : ( ( rule__DiskStateValueS__ValueAssignment ) ) ;
    public final void ruleDiskStateValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:931:2: ( ( ( rule__DiskStateValueS__ValueAssignment ) ) )
            // InternalShortDSLParser.g:932:2: ( ( rule__DiskStateValueS__ValueAssignment ) )
            {
            // InternalShortDSLParser.g:932:2: ( ( rule__DiskStateValueS__ValueAssignment ) )
            // InternalShortDSLParser.g:933:3: ( rule__DiskStateValueS__ValueAssignment )
            {
             before(grammarAccess.getDiskStateValueSAccess().getValueAssignment()); 
            // InternalShortDSLParser.g:934:3: ( rule__DiskStateValueS__ValueAssignment )
            // InternalShortDSLParser.g:934:4: rule__DiskStateValueS__ValueAssignment
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
    // InternalShortDSLParser.g:943:1: entryRuleDiskSlotStateValueS : ruleDiskSlotStateValueS EOF ;
    public final void entryRuleDiskSlotStateValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:944:1: ( ruleDiskSlotStateValueS EOF )
            // InternalShortDSLParser.g:945:1: ruleDiskSlotStateValueS EOF
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
    // InternalShortDSLParser.g:952:1: ruleDiskSlotStateValueS : ( ( rule__DiskSlotStateValueS__ValueAssignment ) ) ;
    public final void ruleDiskSlotStateValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:956:2: ( ( ( rule__DiskSlotStateValueS__ValueAssignment ) ) )
            // InternalShortDSLParser.g:957:2: ( ( rule__DiskSlotStateValueS__ValueAssignment ) )
            {
            // InternalShortDSLParser.g:957:2: ( ( rule__DiskSlotStateValueS__ValueAssignment ) )
            // InternalShortDSLParser.g:958:3: ( rule__DiskSlotStateValueS__ValueAssignment )
            {
             before(grammarAccess.getDiskSlotStateValueSAccess().getValueAssignment()); 
            // InternalShortDSLParser.g:959:3: ( rule__DiskSlotStateValueS__ValueAssignment )
            // InternalShortDSLParser.g:959:4: rule__DiskSlotStateValueS__ValueAssignment
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
    // InternalShortDSLParser.g:968:1: entryRuleColorValueS : ruleColorValueS EOF ;
    public final void entryRuleColorValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:969:1: ( ruleColorValueS EOF )
            // InternalShortDSLParser.g:970:1: ruleColorValueS EOF
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
    // InternalShortDSLParser.g:977:1: ruleColorValueS : ( ( rule__ColorValueS__ValueAssignment ) ) ;
    public final void ruleColorValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:981:2: ( ( ( rule__ColorValueS__ValueAssignment ) ) )
            // InternalShortDSLParser.g:982:2: ( ( rule__ColorValueS__ValueAssignment ) )
            {
            // InternalShortDSLParser.g:982:2: ( ( rule__ColorValueS__ValueAssignment ) )
            // InternalShortDSLParser.g:983:3: ( rule__ColorValueS__ValueAssignment )
            {
             before(grammarAccess.getColorValueSAccess().getValueAssignment()); 
            // InternalShortDSLParser.g:984:3: ( rule__ColorValueS__ValueAssignment )
            // InternalShortDSLParser.g:984:4: rule__ColorValueS__ValueAssignment
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
    // InternalShortDSLParser.g:993:1: entryRuleNumberS : ruleNumberS EOF ;
    public final void entryRuleNumberS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:994:1: ( ruleNumberS EOF )
            // InternalShortDSLParser.g:995:1: ruleNumberS EOF
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
    // InternalShortDSLParser.g:1002:1: ruleNumberS : ( ( rule__NumberS__ValueAssignment ) ) ;
    public final void ruleNumberS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1006:2: ( ( ( rule__NumberS__ValueAssignment ) ) )
            // InternalShortDSLParser.g:1007:2: ( ( rule__NumberS__ValueAssignment ) )
            {
            // InternalShortDSLParser.g:1007:2: ( ( rule__NumberS__ValueAssignment ) )
            // InternalShortDSLParser.g:1008:3: ( rule__NumberS__ValueAssignment )
            {
             before(grammarAccess.getNumberSAccess().getValueAssignment()); 
            // InternalShortDSLParser.g:1009:3: ( rule__NumberS__ValueAssignment )
            // InternalShortDSLParser.g:1009:4: rule__NumberS__ValueAssignment
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


    // $ANTLR start "ruleDSL_TYPE_ENUM"
    // InternalShortDSLParser.g:1018:1: ruleDSL_TYPE_ENUM : ( ( rule__DSL_TYPE_ENUM__Alternatives ) ) ;
    public final void ruleDSL_TYPE_ENUM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1022:1: ( ( ( rule__DSL_TYPE_ENUM__Alternatives ) ) )
            // InternalShortDSLParser.g:1023:2: ( ( rule__DSL_TYPE_ENUM__Alternatives ) )
            {
            // InternalShortDSLParser.g:1023:2: ( ( rule__DSL_TYPE_ENUM__Alternatives ) )
            // InternalShortDSLParser.g:1024:3: ( rule__DSL_TYPE_ENUM__Alternatives )
            {
             before(grammarAccess.getDSL_TYPE_ENUMAccess().getAlternatives()); 
            // InternalShortDSLParser.g:1025:3: ( rule__DSL_TYPE_ENUM__Alternatives )
            // InternalShortDSLParser.g:1025:4: rule__DSL_TYPE_ENUM__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DSL_TYPE_ENUM__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDSL_TYPE_ENUMAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSL_TYPE_ENUM"


    // $ANTLR start "ruleCOMPARISON_OPERATOR_S"
    // InternalShortDSLParser.g:1034:1: ruleCOMPARISON_OPERATOR_S : ( ( rule__COMPARISON_OPERATOR_S__Alternatives ) ) ;
    public final void ruleCOMPARISON_OPERATOR_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1038:1: ( ( ( rule__COMPARISON_OPERATOR_S__Alternatives ) ) )
            // InternalShortDSLParser.g:1039:2: ( ( rule__COMPARISON_OPERATOR_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:1039:2: ( ( rule__COMPARISON_OPERATOR_S__Alternatives ) )
            // InternalShortDSLParser.g:1040:3: ( rule__COMPARISON_OPERATOR_S__Alternatives )
            {
             before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:1041:3: ( rule__COMPARISON_OPERATOR_S__Alternatives )
            // InternalShortDSLParser.g:1041:4: rule__COMPARISON_OPERATOR_S__Alternatives
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
    // InternalShortDSLParser.g:1050:1: ruleCOLOR_S : ( ( rule__COLOR_S__Alternatives ) ) ;
    public final void ruleCOLOR_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1054:1: ( ( ( rule__COLOR_S__Alternatives ) ) )
            // InternalShortDSLParser.g:1055:2: ( ( rule__COLOR_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:1055:2: ( ( rule__COLOR_S__Alternatives ) )
            // InternalShortDSLParser.g:1056:3: ( rule__COLOR_S__Alternatives )
            {
             before(grammarAccess.getCOLOR_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:1057:3: ( rule__COLOR_S__Alternatives )
            // InternalShortDSLParser.g:1057:4: rule__COLOR_S__Alternatives
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
    // InternalShortDSLParser.g:1066:1: ruleDISK_SLOT_STATES_S : ( ( rule__DISK_SLOT_STATES_S__Alternatives ) ) ;
    public final void ruleDISK_SLOT_STATES_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1070:1: ( ( ( rule__DISK_SLOT_STATES_S__Alternatives ) ) )
            // InternalShortDSLParser.g:1071:2: ( ( rule__DISK_SLOT_STATES_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:1071:2: ( ( rule__DISK_SLOT_STATES_S__Alternatives ) )
            // InternalShortDSLParser.g:1072:3: ( rule__DISK_SLOT_STATES_S__Alternatives )
            {
             before(grammarAccess.getDISK_SLOT_STATES_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:1073:3: ( rule__DISK_SLOT_STATES_S__Alternatives )
            // InternalShortDSLParser.g:1073:4: rule__DISK_SLOT_STATES_S__Alternatives
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
    // InternalShortDSLParser.g:1082:1: ruleDISK_STATES_S : ( ( rule__DISK_STATES_S__Alternatives ) ) ;
    public final void ruleDISK_STATES_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1086:1: ( ( ( rule__DISK_STATES_S__Alternatives ) ) )
            // InternalShortDSLParser.g:1087:2: ( ( rule__DISK_STATES_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:1087:2: ( ( rule__DISK_STATES_S__Alternatives ) )
            // InternalShortDSLParser.g:1088:3: ( rule__DISK_STATES_S__Alternatives )
            {
             before(grammarAccess.getDISK_STATES_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:1089:3: ( rule__DISK_STATES_S__Alternatives )
            // InternalShortDSLParser.g:1089:4: rule__DISK_STATES_S__Alternatives
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


    // $ANTLR start "ruleTIME_UNIT_S"
    // InternalShortDSLParser.g:1098:1: ruleTIME_UNIT_S : ( ( rule__TIME_UNIT_S__Alternatives ) ) ;
    public final void ruleTIME_UNIT_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1102:1: ( ( ( rule__TIME_UNIT_S__Alternatives ) ) )
            // InternalShortDSLParser.g:1103:2: ( ( rule__TIME_UNIT_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:1103:2: ( ( rule__TIME_UNIT_S__Alternatives ) )
            // InternalShortDSLParser.g:1104:3: ( rule__TIME_UNIT_S__Alternatives )
            {
             before(grammarAccess.getTIME_UNIT_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:1105:3: ( rule__TIME_UNIT_S__Alternatives )
            // InternalShortDSLParser.g:1105:4: rule__TIME_UNIT_S__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TIME_UNIT_S__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTIME_UNIT_SAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTIME_UNIT_S"


    // $ANTLR start "rule__DSLProgram__Alternatives"
    // InternalShortDSLParser.g:1113:1: rule__DSLProgram__Alternatives : ( ( ruleDSLLong ) | ( ruleDSLShort ) );
    public final void rule__DSLProgram__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1117:1: ( ( ruleDSLLong ) | ( ruleDSLShort ) )
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
                    // InternalShortDSLParser.g:1118:2: ( ruleDSLLong )
                    {
                    // InternalShortDSLParser.g:1118:2: ( ruleDSLLong )
                    // InternalShortDSLParser.g:1119:3: ruleDSLLong
                    {
                     before(grammarAccess.getDSLProgramAccess().getDSLLongParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLLong();

                    state._fsp--;

                     after(grammarAccess.getDSLProgramAccess().getDSLLongParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1124:2: ( ruleDSLShort )
                    {
                    // InternalShortDSLParser.g:1124:2: ( ruleDSLShort )
                    // InternalShortDSLParser.g:1125:3: ruleDSLShort
                    {
                     before(grammarAccess.getDSLProgramAccess().getDSLShortParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLShort();

                    state._fsp--;

                     after(grammarAccess.getDSLProgramAccess().getDSLShortParserRuleCall_1()); 

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
    // $ANTLR end "rule__DSLProgram__Alternatives"


    // $ANTLR start "rule__DeviceS__Alternatives"
    // InternalShortDSLParser.g:1134:1: rule__DeviceS__Alternatives : ( ( ruleCraneS ) | ( ruleDiskS ) | ( ruleCameraS ) );
    public final void rule__DeviceS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1138:1: ( ( ruleCraneS ) | ( ruleDiskS ) | ( ruleCameraS ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case Logging:
                    {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==Colon) ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3==RULE_BEGIN) ) {
                            int LA2_5 = input.LA(5);

                            if ( (LA2_5==RULE_ID) ) {
                                alt2=1;
                            }
                            else if ( (LA2_5==Green||LA2_5==Blue||LA2_5==Red) ) {
                                alt2=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 5, input);

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
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case Colon:
                    {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==RULE_BEGIN) ) {
                        int LA2_5 = input.LA(4);

                        if ( (LA2_5==RULE_ID) ) {
                            alt2=1;
                        }
                        else if ( (LA2_5==Green||LA2_5==Blue||LA2_5==Red) ) {
                            alt2=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case LeftParenthesis:
                    {
                    alt2=2;
                    }
                    break;
                default:
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
                    // InternalShortDSLParser.g:1139:2: ( ruleCraneS )
                    {
                    // InternalShortDSLParser.g:1139:2: ( ruleCraneS )
                    // InternalShortDSLParser.g:1140:3: ruleCraneS
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
                    // InternalShortDSLParser.g:1145:2: ( ruleDiskS )
                    {
                    // InternalShortDSLParser.g:1145:2: ( ruleDiskS )
                    // InternalShortDSLParser.g:1146:3: ruleDiskS
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
                    // InternalShortDSLParser.g:1151:2: ( ruleCameraS )
                    {
                    // InternalShortDSLParser.g:1151:2: ( ruleCameraS )
                    // InternalShortDSLParser.g:1152:3: ruleCameraS
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
    // InternalShortDSLParser.g:1161:1: rule__StatementS__Alternatives : ( ( ruleLoopS ) | ( ruleMoveS ) | ( ruleCraneActionS ) | ( ruleConditionS ) | ( ruleMarkS ) );
    public final void rule__StatementS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1165:1: ( ( ruleLoopS ) | ( ruleMoveS ) | ( ruleCraneActionS ) | ( ruleConditionS ) | ( ruleMarkS ) )
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
            case Free:
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
                    // InternalShortDSLParser.g:1166:2: ( ruleLoopS )
                    {
                    // InternalShortDSLParser.g:1166:2: ( ruleLoopS )
                    // InternalShortDSLParser.g:1167:3: ruleLoopS
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
                    // InternalShortDSLParser.g:1172:2: ( ruleMoveS )
                    {
                    // InternalShortDSLParser.g:1172:2: ( ruleMoveS )
                    // InternalShortDSLParser.g:1173:3: ruleMoveS
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
                    // InternalShortDSLParser.g:1178:2: ( ruleCraneActionS )
                    {
                    // InternalShortDSLParser.g:1178:2: ( ruleCraneActionS )
                    // InternalShortDSLParser.g:1179:3: ruleCraneActionS
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
                    // InternalShortDSLParser.g:1184:2: ( ruleConditionS )
                    {
                    // InternalShortDSLParser.g:1184:2: ( ruleConditionS )
                    // InternalShortDSLParser.g:1185:3: ruleConditionS
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
                    // InternalShortDSLParser.g:1190:2: ( ruleMarkS )
                    {
                    // InternalShortDSLParser.g:1190:2: ( ruleMarkS )
                    // InternalShortDSLParser.g:1191:3: ruleMarkS
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
    // InternalShortDSLParser.g:1200:1: rule__MoveS__Alternatives : ( ( ruleMoveDiskS ) | ( ruleMoveAnySlotS ) | ( ruleMoveCraneS ) );
    public final void rule__MoveS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1204:1: ( ( ruleMoveDiskS ) | ( ruleMoveAnySlotS ) | ( ruleMoveCraneS ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==HyphenMinusHyphenMinusGreaterThanSign||LA4_1==HyphenMinusGreaterThanSign) ) {
                    alt4=1;
                }
                else if ( (LA4_1==Pickup||LA4_1==Drop) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA4_0>=In_progress && LA4_0<=Complete)||LA4_0==Free) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalShortDSLParser.g:1205:2: ( ruleMoveDiskS )
                    {
                    // InternalShortDSLParser.g:1205:2: ( ruleMoveDiskS )
                    // InternalShortDSLParser.g:1206:3: ruleMoveDiskS
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
                    // InternalShortDSLParser.g:1211:2: ( ruleMoveAnySlotS )
                    {
                    // InternalShortDSLParser.g:1211:2: ( ruleMoveAnySlotS )
                    // InternalShortDSLParser.g:1212:3: ruleMoveAnySlotS
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
                    // InternalShortDSLParser.g:1217:2: ( ruleMoveCraneS )
                    {
                    // InternalShortDSLParser.g:1217:2: ( ruleMoveCraneS )
                    // InternalShortDSLParser.g:1218:3: ruleMoveCraneS
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
    // InternalShortDSLParser.g:1227:1: rule__MoveDiskS__Alternatives_2 : ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) );
    public final void rule__MoveDiskS__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1231:1: ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) )
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
                    // InternalShortDSLParser.g:1232:2: ( HyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1232:2: ( HyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1233:3: HyphenMinusGreaterThanSign
                    {
                     before(grammarAccess.getMoveDiskSAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 
                    match(input,HyphenMinusGreaterThanSign,FOLLOW_2); 
                     after(grammarAccess.getMoveDiskSAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1238:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1238:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1239:3: HyphenMinusHyphenMinusGreaterThanSign
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
    // InternalShortDSLParser.g:1248:1: rule__MoveAnySlotS__Alternatives_3 : ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) );
    public final void rule__MoveAnySlotS__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1252:1: ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) )
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
                    // InternalShortDSLParser.g:1253:2: ( HyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1253:2: ( HyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1254:3: HyphenMinusGreaterThanSign
                    {
                     before(grammarAccess.getMoveAnySlotSAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
                    match(input,HyphenMinusGreaterThanSign,FOLLOW_2); 
                     after(grammarAccess.getMoveAnySlotSAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1259:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1259:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1260:3: HyphenMinusHyphenMinusGreaterThanSign
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
    // InternalShortDSLParser.g:1269:1: rule__MoveCraneS__Alternatives_3 : ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) );
    public final void rule__MoveCraneS__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1273:1: ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) )
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
                    // InternalShortDSLParser.g:1274:2: ( HyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1274:2: ( HyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1275:3: HyphenMinusGreaterThanSign
                    {
                     before(grammarAccess.getMoveCraneSAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
                    match(input,HyphenMinusGreaterThanSign,FOLLOW_2); 
                     after(grammarAccess.getMoveCraneSAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1280:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1280:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1281:3: HyphenMinusHyphenMinusGreaterThanSign
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
    // InternalShortDSLParser.g:1290:1: rule__CraneActionS__Alternatives_1 : ( ( Pickup ) | ( Drop ) );
    public final void rule__CraneActionS__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1294:1: ( ( Pickup ) | ( Drop ) )
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
                    // InternalShortDSLParser.g:1295:2: ( Pickup )
                    {
                    // InternalShortDSLParser.g:1295:2: ( Pickup )
                    // InternalShortDSLParser.g:1296:3: Pickup
                    {
                     before(grammarAccess.getCraneActionSAccess().getPickupKeyword_1_0()); 
                    match(input,Pickup,FOLLOW_2); 
                     after(grammarAccess.getCraneActionSAccess().getPickupKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1301:2: ( Drop )
                    {
                    // InternalShortDSLParser.g:1301:2: ( Drop )
                    // InternalShortDSLParser.g:1302:3: Drop
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
    // InternalShortDSLParser.g:1311:1: rule__ConditionS__Alternatives : ( ( ruleConditionVariableS ) | ( ruleConditionDeviceS ) );
    public final void rule__ConditionS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1315:1: ( ( ruleConditionVariableS ) | ( ruleConditionDeviceS ) )
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
                    // InternalShortDSLParser.g:1316:2: ( ruleConditionVariableS )
                    {
                    // InternalShortDSLParser.g:1316:2: ( ruleConditionVariableS )
                    // InternalShortDSLParser.g:1317:3: ruleConditionVariableS
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
                    // InternalShortDSLParser.g:1322:2: ( ruleConditionDeviceS )
                    {
                    // InternalShortDSLParser.g:1322:2: ( ruleConditionDeviceS )
                    // InternalShortDSLParser.g:1323:3: ruleConditionDeviceS
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
    // InternalShortDSLParser.g:1332:1: rule__MarkS__Alternatives : ( ( ruleMarkVariableValueS ) | ( ruleMarkCameraValueS ) );
    public final void rule__MarkS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1336:1: ( ( ruleMarkVariableValueS ) | ( ruleMarkCameraValueS ) )
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
                    // InternalShortDSLParser.g:1337:2: ( ruleMarkVariableValueS )
                    {
                    // InternalShortDSLParser.g:1337:2: ( ruleMarkVariableValueS )
                    // InternalShortDSLParser.g:1338:3: ruleMarkVariableValueS
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
                    // InternalShortDSLParser.g:1343:2: ( ruleMarkCameraValueS )
                    {
                    // InternalShortDSLParser.g:1343:2: ( ruleMarkCameraValueS )
                    // InternalShortDSLParser.g:1344:3: ruleMarkCameraValueS
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


    // $ANTLR start "rule__VariableValueS__Alternatives"
    // InternalShortDSLParser.g:1353:1: rule__VariableValueS__Alternatives : ( ( ( rule__VariableValueS__ValueAssignment_0 ) ) | ( ( rule__VariableValueS__ValueAssignment_1 ) ) | ( ( rule__VariableValueS__ValueAssignment_2 ) ) | ( ( rule__VariableValueS__ValueAssignment_3 ) ) | ( ( rule__VariableValueS__RefAssignment_4 ) ) );
    public final void rule__VariableValueS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1357:1: ( ( ( rule__VariableValueS__ValueAssignment_0 ) ) | ( ( rule__VariableValueS__ValueAssignment_1 ) ) | ( ( rule__VariableValueS__ValueAssignment_2 ) ) | ( ( rule__VariableValueS__ValueAssignment_3 ) ) | ( ( rule__VariableValueS__RefAssignment_4 ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case In_progress:
            case Complete:
            case Free:
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
                    // InternalShortDSLParser.g:1358:2: ( ( rule__VariableValueS__ValueAssignment_0 ) )
                    {
                    // InternalShortDSLParser.g:1358:2: ( ( rule__VariableValueS__ValueAssignment_0 ) )
                    // InternalShortDSLParser.g:1359:3: ( rule__VariableValueS__ValueAssignment_0 )
                    {
                     before(grammarAccess.getVariableValueSAccess().getValueAssignment_0()); 
                    // InternalShortDSLParser.g:1360:3: ( rule__VariableValueS__ValueAssignment_0 )
                    // InternalShortDSLParser.g:1360:4: rule__VariableValueS__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableValueS__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableValueSAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1364:2: ( ( rule__VariableValueS__ValueAssignment_1 ) )
                    {
                    // InternalShortDSLParser.g:1364:2: ( ( rule__VariableValueS__ValueAssignment_1 ) )
                    // InternalShortDSLParser.g:1365:3: ( rule__VariableValueS__ValueAssignment_1 )
                    {
                     before(grammarAccess.getVariableValueSAccess().getValueAssignment_1()); 
                    // InternalShortDSLParser.g:1366:3: ( rule__VariableValueS__ValueAssignment_1 )
                    // InternalShortDSLParser.g:1366:4: rule__VariableValueS__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableValueS__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableValueSAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1370:2: ( ( rule__VariableValueS__ValueAssignment_2 ) )
                    {
                    // InternalShortDSLParser.g:1370:2: ( ( rule__VariableValueS__ValueAssignment_2 ) )
                    // InternalShortDSLParser.g:1371:3: ( rule__VariableValueS__ValueAssignment_2 )
                    {
                     before(grammarAccess.getVariableValueSAccess().getValueAssignment_2()); 
                    // InternalShortDSLParser.g:1372:3: ( rule__VariableValueS__ValueAssignment_2 )
                    // InternalShortDSLParser.g:1372:4: rule__VariableValueS__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableValueS__ValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableValueSAccess().getValueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalShortDSLParser.g:1376:2: ( ( rule__VariableValueS__ValueAssignment_3 ) )
                    {
                    // InternalShortDSLParser.g:1376:2: ( ( rule__VariableValueS__ValueAssignment_3 ) )
                    // InternalShortDSLParser.g:1377:3: ( rule__VariableValueS__ValueAssignment_3 )
                    {
                     before(grammarAccess.getVariableValueSAccess().getValueAssignment_3()); 
                    // InternalShortDSLParser.g:1378:3: ( rule__VariableValueS__ValueAssignment_3 )
                    // InternalShortDSLParser.g:1378:4: rule__VariableValueS__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableValueS__ValueAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableValueSAccess().getValueAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalShortDSLParser.g:1382:2: ( ( rule__VariableValueS__RefAssignment_4 ) )
                    {
                    // InternalShortDSLParser.g:1382:2: ( ( rule__VariableValueS__RefAssignment_4 ) )
                    // InternalShortDSLParser.g:1383:3: ( rule__VariableValueS__RefAssignment_4 )
                    {
                     before(grammarAccess.getVariableValueSAccess().getRefAssignment_4()); 
                    // InternalShortDSLParser.g:1384:3: ( rule__VariableValueS__RefAssignment_4 )
                    // InternalShortDSLParser.g:1384:4: rule__VariableValueS__RefAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableValueS__RefAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableValueSAccess().getRefAssignment_4()); 

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
    // $ANTLR end "rule__VariableValueS__Alternatives"


    // $ANTLR start "rule__DeviceValueS__Alternatives"
    // InternalShortDSLParser.g:1392:1: rule__DeviceValueS__Alternatives : ( ( ( rule__DeviceValueS__ValueAssignment_0 ) ) | ( ( rule__DeviceValueS__ValueAssignment_1 ) ) | ( ( rule__DeviceValueS__ConfigurationValueAssignment_2 ) ) );
    public final void rule__DeviceValueS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1396:1: ( ( ( rule__DeviceValueS__ValueAssignment_0 ) ) | ( ( rule__DeviceValueS__ValueAssignment_1 ) ) | ( ( rule__DeviceValueS__ConfigurationValueAssignment_2 ) ) )
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
                    // InternalShortDSLParser.g:1397:2: ( ( rule__DeviceValueS__ValueAssignment_0 ) )
                    {
                    // InternalShortDSLParser.g:1397:2: ( ( rule__DeviceValueS__ValueAssignment_0 ) )
                    // InternalShortDSLParser.g:1398:3: ( rule__DeviceValueS__ValueAssignment_0 )
                    {
                     before(grammarAccess.getDeviceValueSAccess().getValueAssignment_0()); 
                    // InternalShortDSLParser.g:1399:3: ( rule__DeviceValueS__ValueAssignment_0 )
                    // InternalShortDSLParser.g:1399:4: rule__DeviceValueS__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeviceValueS__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeviceValueSAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1403:2: ( ( rule__DeviceValueS__ValueAssignment_1 ) )
                    {
                    // InternalShortDSLParser.g:1403:2: ( ( rule__DeviceValueS__ValueAssignment_1 ) )
                    // InternalShortDSLParser.g:1404:3: ( rule__DeviceValueS__ValueAssignment_1 )
                    {
                     before(grammarAccess.getDeviceValueSAccess().getValueAssignment_1()); 
                    // InternalShortDSLParser.g:1405:3: ( rule__DeviceValueS__ValueAssignment_1 )
                    // InternalShortDSLParser.g:1405:4: rule__DeviceValueS__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeviceValueS__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeviceValueSAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1409:2: ( ( rule__DeviceValueS__ConfigurationValueAssignment_2 ) )
                    {
                    // InternalShortDSLParser.g:1409:2: ( ( rule__DeviceValueS__ConfigurationValueAssignment_2 ) )
                    // InternalShortDSLParser.g:1410:3: ( rule__DeviceValueS__ConfigurationValueAssignment_2 )
                    {
                     before(grammarAccess.getDeviceValueSAccess().getConfigurationValueAssignment_2()); 
                    // InternalShortDSLParser.g:1411:3: ( rule__DeviceValueS__ConfigurationValueAssignment_2 )
                    // InternalShortDSLParser.g:1411:4: rule__DeviceValueS__ConfigurationValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeviceValueS__ConfigurationValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeviceValueSAccess().getConfigurationValueAssignment_2()); 

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
    // $ANTLR end "rule__DeviceValueS__Alternatives"


    // $ANTLR start "rule__ValueSlotS__Alternatives"
    // InternalShortDSLParser.g:1419:1: rule__ValueSlotS__Alternatives : ( ( ( rule__ValueSlotS__ValueAssignment_0 ) ) | ( ( rule__ValueSlotS__ValueAssignment_1 ) ) );
    public final void rule__ValueSlotS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1423:1: ( ( ( rule__ValueSlotS__ValueAssignment_0 ) ) | ( ( rule__ValueSlotS__ValueAssignment_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=In_progress && LA13_0<=Complete)||LA13_0==Free) ) {
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
                    // InternalShortDSLParser.g:1424:2: ( ( rule__ValueSlotS__ValueAssignment_0 ) )
                    {
                    // InternalShortDSLParser.g:1424:2: ( ( rule__ValueSlotS__ValueAssignment_0 ) )
                    // InternalShortDSLParser.g:1425:3: ( rule__ValueSlotS__ValueAssignment_0 )
                    {
                     before(grammarAccess.getValueSlotSAccess().getValueAssignment_0()); 
                    // InternalShortDSLParser.g:1426:3: ( rule__ValueSlotS__ValueAssignment_0 )
                    // InternalShortDSLParser.g:1426:4: rule__ValueSlotS__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValueSlotS__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueSlotSAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1430:2: ( ( rule__ValueSlotS__ValueAssignment_1 ) )
                    {
                    // InternalShortDSLParser.g:1430:2: ( ( rule__ValueSlotS__ValueAssignment_1 ) )
                    // InternalShortDSLParser.g:1431:3: ( rule__ValueSlotS__ValueAssignment_1 )
                    {
                     before(grammarAccess.getValueSlotSAccess().getValueAssignment_1()); 
                    // InternalShortDSLParser.g:1432:3: ( rule__ValueSlotS__ValueAssignment_1 )
                    // InternalShortDSLParser.g:1432:4: rule__ValueSlotS__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValueSlotS__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueSlotSAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__ValueSlotS__Alternatives"


    // $ANTLR start "rule__DSL_TYPE_ENUM__Alternatives"
    // InternalShortDSLParser.g:1440:1: rule__DSL_TYPE_ENUM__Alternatives : ( ( ( Long ) ) | ( ( Short ) ) );
    public final void rule__DSL_TYPE_ENUM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1444:1: ( ( ( Long ) ) | ( ( Short ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Long) ) {
                alt14=1;
            }
            else if ( (LA14_0==Short) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalShortDSLParser.g:1445:2: ( ( Long ) )
                    {
                    // InternalShortDSLParser.g:1445:2: ( ( Long ) )
                    // InternalShortDSLParser.g:1446:3: ( Long )
                    {
                     before(grammarAccess.getDSL_TYPE_ENUMAccess().getLONGEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1447:3: ( Long )
                    // InternalShortDSLParser.g:1447:4: Long
                    {
                    match(input,Long,FOLLOW_2); 

                    }

                     after(grammarAccess.getDSL_TYPE_ENUMAccess().getLONGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1451:2: ( ( Short ) )
                    {
                    // InternalShortDSLParser.g:1451:2: ( ( Short ) )
                    // InternalShortDSLParser.g:1452:3: ( Short )
                    {
                     before(grammarAccess.getDSL_TYPE_ENUMAccess().getSHORTEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1453:3: ( Short )
                    // InternalShortDSLParser.g:1453:4: Short
                    {
                    match(input,Short,FOLLOW_2); 

                    }

                     after(grammarAccess.getDSL_TYPE_ENUMAccess().getSHORTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__DSL_TYPE_ENUM__Alternatives"


    // $ANTLR start "rule__COMPARISON_OPERATOR_S__Alternatives"
    // InternalShortDSLParser.g:1461:1: rule__COMPARISON_OPERATOR_S__Alternatives : ( ( ( EqualsSign ) ) | ( ( LessThanSign ) ) | ( ( GreaterThanSign ) ) | ( ( ExclamationMarkEqualsSign ) ) );
    public final void rule__COMPARISON_OPERATOR_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1465:1: ( ( ( EqualsSign ) ) | ( ( LessThanSign ) ) | ( ( GreaterThanSign ) ) | ( ( ExclamationMarkEqualsSign ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case EqualsSign:
                {
                alt15=1;
                }
                break;
            case LessThanSign:
                {
                alt15=2;
                }
                break;
            case GreaterThanSign:
                {
                alt15=3;
                }
                break;
            case ExclamationMarkEqualsSign:
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
                    // InternalShortDSLParser.g:1466:2: ( ( EqualsSign ) )
                    {
                    // InternalShortDSLParser.g:1466:2: ( ( EqualsSign ) )
                    // InternalShortDSLParser.g:1467:3: ( EqualsSign )
                    {
                     before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1468:3: ( EqualsSign )
                    // InternalShortDSLParser.g:1468:4: EqualsSign
                    {
                    match(input,EqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1472:2: ( ( LessThanSign ) )
                    {
                    // InternalShortDSLParser.g:1472:2: ( ( LessThanSign ) )
                    // InternalShortDSLParser.g:1473:3: ( LessThanSign )
                    {
                     before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getLESS_THANEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1474:3: ( LessThanSign )
                    // InternalShortDSLParser.g:1474:4: LessThanSign
                    {
                    match(input,LessThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getLESS_THANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1478:2: ( ( GreaterThanSign ) )
                    {
                    // InternalShortDSLParser.g:1478:2: ( ( GreaterThanSign ) )
                    // InternalShortDSLParser.g:1479:3: ( GreaterThanSign )
                    {
                     before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getGREATER_THANEnumLiteralDeclaration_2()); 
                    // InternalShortDSLParser.g:1480:3: ( GreaterThanSign )
                    // InternalShortDSLParser.g:1480:4: GreaterThanSign
                    {
                    match(input,GreaterThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getGREATER_THANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalShortDSLParser.g:1484:2: ( ( ExclamationMarkEqualsSign ) )
                    {
                    // InternalShortDSLParser.g:1484:2: ( ( ExclamationMarkEqualsSign ) )
                    // InternalShortDSLParser.g:1485:3: ( ExclamationMarkEqualsSign )
                    {
                     before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getNOTEnumLiteralDeclaration_3()); 
                    // InternalShortDSLParser.g:1486:3: ( ExclamationMarkEqualsSign )
                    // InternalShortDSLParser.g:1486:4: ExclamationMarkEqualsSign
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
    // InternalShortDSLParser.g:1494:1: rule__COLOR_S__Alternatives : ( ( ( Red ) ) | ( ( Green ) ) | ( ( Blue ) ) );
    public final void rule__COLOR_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1498:1: ( ( ( Red ) ) | ( ( Green ) ) | ( ( Blue ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case Red:
                {
                alt16=1;
                }
                break;
            case Green:
                {
                alt16=2;
                }
                break;
            case Blue:
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
                    // InternalShortDSLParser.g:1499:2: ( ( Red ) )
                    {
                    // InternalShortDSLParser.g:1499:2: ( ( Red ) )
                    // InternalShortDSLParser.g:1500:3: ( Red )
                    {
                     before(grammarAccess.getCOLOR_SAccess().getREDEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1501:3: ( Red )
                    // InternalShortDSLParser.g:1501:4: Red
                    {
                    match(input,Red,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOLOR_SAccess().getREDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1505:2: ( ( Green ) )
                    {
                    // InternalShortDSLParser.g:1505:2: ( ( Green ) )
                    // InternalShortDSLParser.g:1506:3: ( Green )
                    {
                     before(grammarAccess.getCOLOR_SAccess().getGREENEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1507:3: ( Green )
                    // InternalShortDSLParser.g:1507:4: Green
                    {
                    match(input,Green,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOLOR_SAccess().getGREENEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1511:2: ( ( Blue ) )
                    {
                    // InternalShortDSLParser.g:1511:2: ( ( Blue ) )
                    // InternalShortDSLParser.g:1512:3: ( Blue )
                    {
                     before(grammarAccess.getCOLOR_SAccess().getBLUEEnumLiteralDeclaration_2()); 
                    // InternalShortDSLParser.g:1513:3: ( Blue )
                    // InternalShortDSLParser.g:1513:4: Blue
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
    // InternalShortDSLParser.g:1521:1: rule__DISK_SLOT_STATES_S__Alternatives : ( ( ( Free ) ) | ( ( In_progress ) ) | ( ( Complete ) ) );
    public final void rule__DISK_SLOT_STATES_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1525:1: ( ( ( Free ) ) | ( ( In_progress ) ) | ( ( Complete ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case Free:
                {
                alt17=1;
                }
                break;
            case In_progress:
                {
                alt17=2;
                }
                break;
            case Complete:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalShortDSLParser.g:1526:2: ( ( Free ) )
                    {
                    // InternalShortDSLParser.g:1526:2: ( ( Free ) )
                    // InternalShortDSLParser.g:1527:3: ( Free )
                    {
                     before(grammarAccess.getDISK_SLOT_STATES_SAccess().getFREEEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1528:3: ( Free )
                    // InternalShortDSLParser.g:1528:4: Free
                    {
                    match(input,Free,FOLLOW_2); 

                    }

                     after(grammarAccess.getDISK_SLOT_STATES_SAccess().getFREEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1532:2: ( ( In_progress ) )
                    {
                    // InternalShortDSLParser.g:1532:2: ( ( In_progress ) )
                    // InternalShortDSLParser.g:1533:3: ( In_progress )
                    {
                     before(grammarAccess.getDISK_SLOT_STATES_SAccess().getIN_PROGRESSEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1534:3: ( In_progress )
                    // InternalShortDSLParser.g:1534:4: In_progress
                    {
                    match(input,In_progress,FOLLOW_2); 

                    }

                     after(grammarAccess.getDISK_SLOT_STATES_SAccess().getIN_PROGRESSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1538:2: ( ( Complete ) )
                    {
                    // InternalShortDSLParser.g:1538:2: ( ( Complete ) )
                    // InternalShortDSLParser.g:1539:3: ( Complete )
                    {
                     before(grammarAccess.getDISK_SLOT_STATES_SAccess().getCOMPLETEEnumLiteralDeclaration_2()); 
                    // InternalShortDSLParser.g:1540:3: ( Complete )
                    // InternalShortDSLParser.g:1540:4: Complete
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
    // InternalShortDSLParser.g:1548:1: rule__DISK_STATES_S__Alternatives : ( ( ( Full ) ) | ( ( Empty ) ) );
    public final void rule__DISK_STATES_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1552:1: ( ( ( Full ) ) | ( ( Empty ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Full) ) {
                alt18=1;
            }
            else if ( (LA18_0==Empty) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalShortDSLParser.g:1553:2: ( ( Full ) )
                    {
                    // InternalShortDSLParser.g:1553:2: ( ( Full ) )
                    // InternalShortDSLParser.g:1554:3: ( Full )
                    {
                     before(grammarAccess.getDISK_STATES_SAccess().getFULLEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1555:3: ( Full )
                    // InternalShortDSLParser.g:1555:4: Full
                    {
                    match(input,Full,FOLLOW_2); 

                    }

                     after(grammarAccess.getDISK_STATES_SAccess().getFULLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1559:2: ( ( Empty ) )
                    {
                    // InternalShortDSLParser.g:1559:2: ( ( Empty ) )
                    // InternalShortDSLParser.g:1560:3: ( Empty )
                    {
                     before(grammarAccess.getDISK_STATES_SAccess().getEMPTYEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1561:3: ( Empty )
                    // InternalShortDSLParser.g:1561:4: Empty
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


    // $ANTLR start "rule__TIME_UNIT_S__Alternatives"
    // InternalShortDSLParser.g:1569:1: rule__TIME_UNIT_S__Alternatives : ( ( ( S ) ) | ( ( M ) ) | ( ( H ) ) );
    public final void rule__TIME_UNIT_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1573:1: ( ( ( S ) ) | ( ( M ) ) | ( ( H ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case S:
                {
                alt19=1;
                }
                break;
            case M:
                {
                alt19=2;
                }
                break;
            case H:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalShortDSLParser.g:1574:2: ( ( S ) )
                    {
                    // InternalShortDSLParser.g:1574:2: ( ( S ) )
                    // InternalShortDSLParser.g:1575:3: ( S )
                    {
                     before(grammarAccess.getTIME_UNIT_SAccess().getSECONDEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1576:3: ( S )
                    // InternalShortDSLParser.g:1576:4: S
                    {
                    match(input,S,FOLLOW_2); 

                    }

                     after(grammarAccess.getTIME_UNIT_SAccess().getSECONDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1580:2: ( ( M ) )
                    {
                    // InternalShortDSLParser.g:1580:2: ( ( M ) )
                    // InternalShortDSLParser.g:1581:3: ( M )
                    {
                     before(grammarAccess.getTIME_UNIT_SAccess().getMINUTEEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1582:3: ( M )
                    // InternalShortDSLParser.g:1582:4: M
                    {
                    match(input,M,FOLLOW_2); 

                    }

                     after(grammarAccess.getTIME_UNIT_SAccess().getMINUTEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1586:2: ( ( H ) )
                    {
                    // InternalShortDSLParser.g:1586:2: ( ( H ) )
                    // InternalShortDSLParser.g:1587:3: ( H )
                    {
                     before(grammarAccess.getTIME_UNIT_SAccess().getHOUREnumLiteralDeclaration_2()); 
                    // InternalShortDSLParser.g:1588:3: ( H )
                    // InternalShortDSLParser.g:1588:4: H
                    {
                    match(input,H,FOLLOW_2); 

                    }

                     after(grammarAccess.getTIME_UNIT_SAccess().getHOUREnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TIME_UNIT_S__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalShortDSLParser.g:1596:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1600:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalShortDSLParser.g:1601:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalShortDSLParser.g:1608:1: rule__Model__Group__0__Impl : ( Use ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1612:1: ( ( Use ) )
            // InternalShortDSLParser.g:1613:1: ( Use )
            {
            // InternalShortDSLParser.g:1613:1: ( Use )
            // InternalShortDSLParser.g:1614:2: Use
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
    // InternalShortDSLParser.g:1623:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1627:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalShortDSLParser.g:1628:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // InternalShortDSLParser.g:1635:1: rule__Model__Group__1__Impl : ( ( rule__Model__DslTypeAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1639:1: ( ( ( rule__Model__DslTypeAssignment_1 ) ) )
            // InternalShortDSLParser.g:1640:1: ( ( rule__Model__DslTypeAssignment_1 ) )
            {
            // InternalShortDSLParser.g:1640:1: ( ( rule__Model__DslTypeAssignment_1 ) )
            // InternalShortDSLParser.g:1641:2: ( rule__Model__DslTypeAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getDslTypeAssignment_1()); 
            // InternalShortDSLParser.g:1642:2: ( rule__Model__DslTypeAssignment_1 )
            // InternalShortDSLParser.g:1642:3: rule__Model__DslTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__DslTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDslTypeAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__Group__2"
    // InternalShortDSLParser.g:1650:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1654:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalShortDSLParser.g:1655:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalShortDSLParser.g:1662:1: rule__Model__Group__2__Impl : ( Dsl ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1666:1: ( ( Dsl ) )
            // InternalShortDSLParser.g:1667:1: ( Dsl )
            {
            // InternalShortDSLParser.g:1667:1: ( Dsl )
            // InternalShortDSLParser.g:1668:2: Dsl
            {
             before(grammarAccess.getModelAccess().getDslKeyword_2()); 
            match(input,Dsl,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getDslKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalShortDSLParser.g:1677:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1681:1: ( rule__Model__Group__3__Impl )
            // InternalShortDSLParser.g:1682:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalShortDSLParser.g:1688:1: rule__Model__Group__3__Impl : ( ( rule__Model__DslProgramAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1692:1: ( ( ( rule__Model__DslProgramAssignment_3 ) ) )
            // InternalShortDSLParser.g:1693:1: ( ( rule__Model__DslProgramAssignment_3 ) )
            {
            // InternalShortDSLParser.g:1693:1: ( ( rule__Model__DslProgramAssignment_3 ) )
            // InternalShortDSLParser.g:1694:2: ( rule__Model__DslProgramAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getDslProgramAssignment_3()); 
            // InternalShortDSLParser.g:1695:2: ( rule__Model__DslProgramAssignment_3 )
            // InternalShortDSLParser.g:1695:3: rule__Model__DslProgramAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__DslProgramAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDslProgramAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__DSLLong__Group__0"
    // InternalShortDSLParser.g:1704:1: rule__DSLLong__Group__0 : rule__DSLLong__Group__0__Impl rule__DSLLong__Group__1 ;
    public final void rule__DSLLong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1708:1: ( rule__DSLLong__Group__0__Impl rule__DSLLong__Group__1 )
            // InternalShortDSLParser.g:1709:2: rule__DSLLong__Group__0__Impl rule__DSLLong__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DSLLong__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLLong__Group__1();

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
    // $ANTLR end "rule__DSLLong__Group__0"


    // $ANTLR start "rule__DSLLong__Group__0__Impl"
    // InternalShortDSLParser.g:1716:1: rule__DSLLong__Group__0__Impl : ( () ) ;
    public final void rule__DSLLong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1720:1: ( ( () ) )
            // InternalShortDSLParser.g:1721:1: ( () )
            {
            // InternalShortDSLParser.g:1721:1: ( () )
            // InternalShortDSLParser.g:1722:2: ()
            {
             before(grammarAccess.getDSLLongAccess().getDSLLongAction_0()); 
            // InternalShortDSLParser.g:1723:2: ()
            // InternalShortDSLParser.g:1723:3: 
            {
            }

             after(grammarAccess.getDSLLongAccess().getDSLLongAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLLong__Group__0__Impl"


    // $ANTLR start "rule__DSLLong__Group__1"
    // InternalShortDSLParser.g:1731:1: rule__DSLLong__Group__1 : rule__DSLLong__Group__1__Impl rule__DSLLong__Group__2 ;
    public final void rule__DSLLong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1735:1: ( rule__DSLLong__Group__1__Impl rule__DSLLong__Group__2 )
            // InternalShortDSLParser.g:1736:2: rule__DSLLong__Group__1__Impl rule__DSLLong__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__DSLLong__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLLong__Group__2();

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
    // $ANTLR end "rule__DSLLong__Group__1"


    // $ANTLR start "rule__DSLLong__Group__1__Impl"
    // InternalShortDSLParser.g:1743:1: rule__DSLLong__Group__1__Impl : ( Test ) ;
    public final void rule__DSLLong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1747:1: ( ( Test ) )
            // InternalShortDSLParser.g:1748:1: ( Test )
            {
            // InternalShortDSLParser.g:1748:1: ( Test )
            // InternalShortDSLParser.g:1749:2: Test
            {
             before(grammarAccess.getDSLLongAccess().getTestKeyword_1()); 
            match(input,Test,FOLLOW_2); 
             after(grammarAccess.getDSLLongAccess().getTestKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLLong__Group__1__Impl"


    // $ANTLR start "rule__DSLLong__Group__2"
    // InternalShortDSLParser.g:1758:1: rule__DSLLong__Group__2 : rule__DSLLong__Group__2__Impl ;
    public final void rule__DSLLong__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1762:1: ( rule__DSLLong__Group__2__Impl )
            // InternalShortDSLParser.g:1763:2: rule__DSLLong__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLLong__Group__2__Impl();

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
    // $ANTLR end "rule__DSLLong__Group__2"


    // $ANTLR start "rule__DSLLong__Group__2__Impl"
    // InternalShortDSLParser.g:1769:1: rule__DSLLong__Group__2__Impl : ( ( rule__DSLLong__NameAssignment_2 ) ) ;
    public final void rule__DSLLong__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1773:1: ( ( ( rule__DSLLong__NameAssignment_2 ) ) )
            // InternalShortDSLParser.g:1774:1: ( ( rule__DSLLong__NameAssignment_2 ) )
            {
            // InternalShortDSLParser.g:1774:1: ( ( rule__DSLLong__NameAssignment_2 ) )
            // InternalShortDSLParser.g:1775:2: ( rule__DSLLong__NameAssignment_2 )
            {
             before(grammarAccess.getDSLLongAccess().getNameAssignment_2()); 
            // InternalShortDSLParser.g:1776:2: ( rule__DSLLong__NameAssignment_2 )
            // InternalShortDSLParser.g:1776:3: rule__DSLLong__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DSLLong__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDSLLongAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLLong__Group__2__Impl"


    // $ANTLR start "rule__DSLShort__Group__0"
    // InternalShortDSLParser.g:1785:1: rule__DSLShort__Group__0 : rule__DSLShort__Group__0__Impl rule__DSLShort__Group__1 ;
    public final void rule__DSLShort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1789:1: ( rule__DSLShort__Group__0__Impl rule__DSLShort__Group__1 )
            // InternalShortDSLParser.g:1790:2: rule__DSLShort__Group__0__Impl rule__DSLShort__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DSLShort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLShort__Group__1();

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
    // $ANTLR end "rule__DSLShort__Group__0"


    // $ANTLR start "rule__DSLShort__Group__0__Impl"
    // InternalShortDSLParser.g:1797:1: rule__DSLShort__Group__0__Impl : ( () ) ;
    public final void rule__DSLShort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1801:1: ( ( () ) )
            // InternalShortDSLParser.g:1802:1: ( () )
            {
            // InternalShortDSLParser.g:1802:1: ( () )
            // InternalShortDSLParser.g:1803:2: ()
            {
             before(grammarAccess.getDSLShortAccess().getDSLShortAction_0()); 
            // InternalShortDSLParser.g:1804:2: ()
            // InternalShortDSLParser.g:1804:3: 
            {
            }

             after(grammarAccess.getDSLShortAccess().getDSLShortAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLShort__Group__0__Impl"


    // $ANTLR start "rule__DSLShort__Group__1"
    // InternalShortDSLParser.g:1812:1: rule__DSLShort__Group__1 : rule__DSLShort__Group__1__Impl rule__DSLShort__Group__2 ;
    public final void rule__DSLShort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1816:1: ( rule__DSLShort__Group__1__Impl rule__DSLShort__Group__2 )
            // InternalShortDSLParser.g:1817:2: rule__DSLShort__Group__1__Impl rule__DSLShort__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DSLShort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLShort__Group__2();

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
    // $ANTLR end "rule__DSLShort__Group__1"


    // $ANTLR start "rule__DSLShort__Group__1__Impl"
    // InternalShortDSLParser.g:1824:1: rule__DSLShort__Group__1__Impl : ( ( rule__DSLShort__ConfigurationAssignment_1 ) ) ;
    public final void rule__DSLShort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1828:1: ( ( ( rule__DSLShort__ConfigurationAssignment_1 ) ) )
            // InternalShortDSLParser.g:1829:1: ( ( rule__DSLShort__ConfigurationAssignment_1 ) )
            {
            // InternalShortDSLParser.g:1829:1: ( ( rule__DSLShort__ConfigurationAssignment_1 ) )
            // InternalShortDSLParser.g:1830:2: ( rule__DSLShort__ConfigurationAssignment_1 )
            {
             before(grammarAccess.getDSLShortAccess().getConfigurationAssignment_1()); 
            // InternalShortDSLParser.g:1831:2: ( rule__DSLShort__ConfigurationAssignment_1 )
            // InternalShortDSLParser.g:1831:3: rule__DSLShort__ConfigurationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLShort__ConfigurationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLShortAccess().getConfigurationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLShort__Group__1__Impl"


    // $ANTLR start "rule__DSLShort__Group__2"
    // InternalShortDSLParser.g:1839:1: rule__DSLShort__Group__2 : rule__DSLShort__Group__2__Impl ;
    public final void rule__DSLShort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1843:1: ( rule__DSLShort__Group__2__Impl )
            // InternalShortDSLParser.g:1844:2: rule__DSLShort__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLShort__Group__2__Impl();

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
    // $ANTLR end "rule__DSLShort__Group__2"


    // $ANTLR start "rule__DSLShort__Group__2__Impl"
    // InternalShortDSLParser.g:1850:1: rule__DSLShort__Group__2__Impl : ( ( rule__DSLShort__DiskHandlingsAssignment_2 )* ) ;
    public final void rule__DSLShort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1854:1: ( ( ( rule__DSLShort__DiskHandlingsAssignment_2 )* ) )
            // InternalShortDSLParser.g:1855:1: ( ( rule__DSLShort__DiskHandlingsAssignment_2 )* )
            {
            // InternalShortDSLParser.g:1855:1: ( ( rule__DSLShort__DiskHandlingsAssignment_2 )* )
            // InternalShortDSLParser.g:1856:2: ( rule__DSLShort__DiskHandlingsAssignment_2 )*
            {
             before(grammarAccess.getDSLShortAccess().getDiskHandlingsAssignment_2()); 
            // InternalShortDSLParser.g:1857:2: ( rule__DSLShort__DiskHandlingsAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Handle) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalShortDSLParser.g:1857:3: rule__DSLShort__DiskHandlingsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DSLShort__DiskHandlingsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getDSLShortAccess().getDiskHandlingsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLShort__Group__2__Impl"


    // $ANTLR start "rule__ConfigurationS__Group__0"
    // InternalShortDSLParser.g:1866:1: rule__ConfigurationS__Group__0 : rule__ConfigurationS__Group__0__Impl rule__ConfigurationS__Group__1 ;
    public final void rule__ConfigurationS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1870:1: ( rule__ConfigurationS__Group__0__Impl rule__ConfigurationS__Group__1 )
            // InternalShortDSLParser.g:1871:2: rule__ConfigurationS__Group__0__Impl rule__ConfigurationS__Group__1
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
    // InternalShortDSLParser.g:1878:1: rule__ConfigurationS__Group__0__Impl : ( Devices ) ;
    public final void rule__ConfigurationS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1882:1: ( ( Devices ) )
            // InternalShortDSLParser.g:1883:1: ( Devices )
            {
            // InternalShortDSLParser.g:1883:1: ( Devices )
            // InternalShortDSLParser.g:1884:2: Devices
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
    // InternalShortDSLParser.g:1893:1: rule__ConfigurationS__Group__1 : rule__ConfigurationS__Group__1__Impl rule__ConfigurationS__Group__2 ;
    public final void rule__ConfigurationS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1897:1: ( rule__ConfigurationS__Group__1__Impl rule__ConfigurationS__Group__2 )
            // InternalShortDSLParser.g:1898:2: rule__ConfigurationS__Group__1__Impl rule__ConfigurationS__Group__2
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
    // InternalShortDSLParser.g:1905:1: rule__ConfigurationS__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ConfigurationS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1909:1: ( ( LeftCurlyBracket ) )
            // InternalShortDSLParser.g:1910:1: ( LeftCurlyBracket )
            {
            // InternalShortDSLParser.g:1910:1: ( LeftCurlyBracket )
            // InternalShortDSLParser.g:1911:2: LeftCurlyBracket
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
    // InternalShortDSLParser.g:1920:1: rule__ConfigurationS__Group__2 : rule__ConfigurationS__Group__2__Impl rule__ConfigurationS__Group__3 ;
    public final void rule__ConfigurationS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1924:1: ( rule__ConfigurationS__Group__2__Impl rule__ConfigurationS__Group__3 )
            // InternalShortDSLParser.g:1925:2: rule__ConfigurationS__Group__2__Impl rule__ConfigurationS__Group__3
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
    // InternalShortDSLParser.g:1932:1: rule__ConfigurationS__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ConfigurationS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1936:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:1937:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:1937:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:1938:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:1947:1: rule__ConfigurationS__Group__3 : rule__ConfigurationS__Group__3__Impl rule__ConfigurationS__Group__4 ;
    public final void rule__ConfigurationS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1951:1: ( rule__ConfigurationS__Group__3__Impl rule__ConfigurationS__Group__4 )
            // InternalShortDSLParser.g:1952:2: rule__ConfigurationS__Group__3__Impl rule__ConfigurationS__Group__4
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
    // InternalShortDSLParser.g:1959:1: rule__ConfigurationS__Group__3__Impl : ( ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* ) ) ;
    public final void rule__ConfigurationS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1963:1: ( ( ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* ) ) )
            // InternalShortDSLParser.g:1964:1: ( ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* ) )
            {
            // InternalShortDSLParser.g:1964:1: ( ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* ) )
            // InternalShortDSLParser.g:1965:2: ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* )
            {
            // InternalShortDSLParser.g:1965:2: ( ( rule__ConfigurationS__DevicesAssignment_3 ) )
            // InternalShortDSLParser.g:1966:3: ( rule__ConfigurationS__DevicesAssignment_3 )
            {
             before(grammarAccess.getConfigurationSAccess().getDevicesAssignment_3()); 
            // InternalShortDSLParser.g:1967:3: ( rule__ConfigurationS__DevicesAssignment_3 )
            // InternalShortDSLParser.g:1967:4: rule__ConfigurationS__DevicesAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__ConfigurationS__DevicesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationSAccess().getDevicesAssignment_3()); 

            }

            // InternalShortDSLParser.g:1970:2: ( ( rule__ConfigurationS__DevicesAssignment_3 )* )
            // InternalShortDSLParser.g:1971:3: ( rule__ConfigurationS__DevicesAssignment_3 )*
            {
             before(grammarAccess.getConfigurationSAccess().getDevicesAssignment_3()); 
            // InternalShortDSLParser.g:1972:3: ( rule__ConfigurationS__DevicesAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalShortDSLParser.g:1972:4: rule__ConfigurationS__DevicesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ConfigurationS__DevicesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalShortDSLParser.g:1981:1: rule__ConfigurationS__Group__4 : rule__ConfigurationS__Group__4__Impl rule__ConfigurationS__Group__5 ;
    public final void rule__ConfigurationS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1985:1: ( rule__ConfigurationS__Group__4__Impl rule__ConfigurationS__Group__5 )
            // InternalShortDSLParser.g:1986:2: rule__ConfigurationS__Group__4__Impl rule__ConfigurationS__Group__5
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
    // InternalShortDSLParser.g:1993:1: rule__ConfigurationS__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ConfigurationS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1997:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:1998:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:1998:1: ( RULE_END )
            // InternalShortDSLParser.g:1999:2: RULE_END
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
    // InternalShortDSLParser.g:2008:1: rule__ConfigurationS__Group__5 : rule__ConfigurationS__Group__5__Impl ;
    public final void rule__ConfigurationS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2012:1: ( rule__ConfigurationS__Group__5__Impl )
            // InternalShortDSLParser.g:2013:2: rule__ConfigurationS__Group__5__Impl
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
    // InternalShortDSLParser.g:2019:1: rule__ConfigurationS__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__ConfigurationS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2023:1: ( ( RightCurlyBracket ) )
            // InternalShortDSLParser.g:2024:1: ( RightCurlyBracket )
            {
            // InternalShortDSLParser.g:2024:1: ( RightCurlyBracket )
            // InternalShortDSLParser.g:2025:2: RightCurlyBracket
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
    // InternalShortDSLParser.g:2035:1: rule__CraneS__Group__0 : rule__CraneS__Group__0__Impl rule__CraneS__Group__1 ;
    public final void rule__CraneS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2039:1: ( rule__CraneS__Group__0__Impl rule__CraneS__Group__1 )
            // InternalShortDSLParser.g:2040:2: rule__CraneS__Group__0__Impl rule__CraneS__Group__1
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
    // InternalShortDSLParser.g:2047:1: rule__CraneS__Group__0__Impl : ( () ) ;
    public final void rule__CraneS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2051:1: ( ( () ) )
            // InternalShortDSLParser.g:2052:1: ( () )
            {
            // InternalShortDSLParser.g:2052:1: ( () )
            // InternalShortDSLParser.g:2053:2: ()
            {
             before(grammarAccess.getCraneSAccess().getCraneAction_0()); 
            // InternalShortDSLParser.g:2054:2: ()
            // InternalShortDSLParser.g:2054:3: 
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
    // InternalShortDSLParser.g:2062:1: rule__CraneS__Group__1 : rule__CraneS__Group__1__Impl rule__CraneS__Group__2 ;
    public final void rule__CraneS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2066:1: ( rule__CraneS__Group__1__Impl rule__CraneS__Group__2 )
            // InternalShortDSLParser.g:2067:2: rule__CraneS__Group__1__Impl rule__CraneS__Group__2
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
    // InternalShortDSLParser.g:2074:1: rule__CraneS__Group__1__Impl : ( ( rule__CraneS__NameAssignment_1 ) ) ;
    public final void rule__CraneS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2078:1: ( ( ( rule__CraneS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2079:1: ( ( rule__CraneS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2079:1: ( ( rule__CraneS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2080:2: ( rule__CraneS__NameAssignment_1 )
            {
             before(grammarAccess.getCraneSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2081:2: ( rule__CraneS__NameAssignment_1 )
            // InternalShortDSLParser.g:2081:3: rule__CraneS__NameAssignment_1
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
    // InternalShortDSLParser.g:2089:1: rule__CraneS__Group__2 : rule__CraneS__Group__2__Impl rule__CraneS__Group__3 ;
    public final void rule__CraneS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2093:1: ( rule__CraneS__Group__2__Impl rule__CraneS__Group__3 )
            // InternalShortDSLParser.g:2094:2: rule__CraneS__Group__2__Impl rule__CraneS__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalShortDSLParser.g:2101:1: rule__CraneS__Group__2__Impl : ( ( rule__CraneS__LoggingAssignment_2 )? ) ;
    public final void rule__CraneS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2105:1: ( ( ( rule__CraneS__LoggingAssignment_2 )? ) )
            // InternalShortDSLParser.g:2106:1: ( ( rule__CraneS__LoggingAssignment_2 )? )
            {
            // InternalShortDSLParser.g:2106:1: ( ( rule__CraneS__LoggingAssignment_2 )? )
            // InternalShortDSLParser.g:2107:2: ( rule__CraneS__LoggingAssignment_2 )?
            {
             before(grammarAccess.getCraneSAccess().getLoggingAssignment_2()); 
            // InternalShortDSLParser.g:2108:2: ( rule__CraneS__LoggingAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Logging) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalShortDSLParser.g:2108:3: rule__CraneS__LoggingAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CraneS__LoggingAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCraneSAccess().getLoggingAssignment_2()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:2116:1: rule__CraneS__Group__3 : rule__CraneS__Group__3__Impl rule__CraneS__Group__4 ;
    public final void rule__CraneS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2120:1: ( rule__CraneS__Group__3__Impl rule__CraneS__Group__4 )
            // InternalShortDSLParser.g:2121:2: rule__CraneS__Group__3__Impl rule__CraneS__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalShortDSLParser.g:2128:1: rule__CraneS__Group__3__Impl : ( Colon ) ;
    public final void rule__CraneS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2132:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2133:1: ( Colon )
            {
            // InternalShortDSLParser.g:2133:1: ( Colon )
            // InternalShortDSLParser.g:2134:2: Colon
            {
             before(grammarAccess.getCraneSAccess().getColonKeyword_3()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCraneSAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:2143:1: rule__CraneS__Group__4 : rule__CraneS__Group__4__Impl rule__CraneS__Group__5 ;
    public final void rule__CraneS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2147:1: ( rule__CraneS__Group__4__Impl rule__CraneS__Group__5 )
            // InternalShortDSLParser.g:2148:2: rule__CraneS__Group__4__Impl rule__CraneS__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalShortDSLParser.g:2155:1: rule__CraneS__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__CraneS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2159:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:2160:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:2160:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:2161:2: RULE_BEGIN
            {
             before(grammarAccess.getCraneSAccess().getBEGINTerminalRuleCall_4()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getCraneSAccess().getBEGINTerminalRuleCall_4()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:2170:1: rule__CraneS__Group__5 : rule__CraneS__Group__5__Impl rule__CraneS__Group__6 ;
    public final void rule__CraneS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2174:1: ( rule__CraneS__Group__5__Impl rule__CraneS__Group__6 )
            // InternalShortDSLParser.g:2175:2: rule__CraneS__Group__5__Impl rule__CraneS__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__CraneS__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CraneS__Group__6();

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
    // InternalShortDSLParser.g:2182:1: rule__CraneS__Group__5__Impl : ( ( ( rule__CraneS__TargetsAssignment_5 ) ) ( ( rule__CraneS__TargetsAssignment_5 )* ) ) ;
    public final void rule__CraneS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2186:1: ( ( ( ( rule__CraneS__TargetsAssignment_5 ) ) ( ( rule__CraneS__TargetsAssignment_5 )* ) ) )
            // InternalShortDSLParser.g:2187:1: ( ( ( rule__CraneS__TargetsAssignment_5 ) ) ( ( rule__CraneS__TargetsAssignment_5 )* ) )
            {
            // InternalShortDSLParser.g:2187:1: ( ( ( rule__CraneS__TargetsAssignment_5 ) ) ( ( rule__CraneS__TargetsAssignment_5 )* ) )
            // InternalShortDSLParser.g:2188:2: ( ( rule__CraneS__TargetsAssignment_5 ) ) ( ( rule__CraneS__TargetsAssignment_5 )* )
            {
            // InternalShortDSLParser.g:2188:2: ( ( rule__CraneS__TargetsAssignment_5 ) )
            // InternalShortDSLParser.g:2189:3: ( rule__CraneS__TargetsAssignment_5 )
            {
             before(grammarAccess.getCraneSAccess().getTargetsAssignment_5()); 
            // InternalShortDSLParser.g:2190:3: ( rule__CraneS__TargetsAssignment_5 )
            // InternalShortDSLParser.g:2190:4: rule__CraneS__TargetsAssignment_5
            {
            pushFollow(FOLLOW_13);
            rule__CraneS__TargetsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCraneSAccess().getTargetsAssignment_5()); 

            }

            // InternalShortDSLParser.g:2193:2: ( ( rule__CraneS__TargetsAssignment_5 )* )
            // InternalShortDSLParser.g:2194:3: ( rule__CraneS__TargetsAssignment_5 )*
            {
             before(grammarAccess.getCraneSAccess().getTargetsAssignment_5()); 
            // InternalShortDSLParser.g:2195:3: ( rule__CraneS__TargetsAssignment_5 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalShortDSLParser.g:2195:4: rule__CraneS__TargetsAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__CraneS__TargetsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getCraneSAccess().getTargetsAssignment_5()); 

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
    // $ANTLR end "rule__CraneS__Group__5__Impl"


    // $ANTLR start "rule__CraneS__Group__6"
    // InternalShortDSLParser.g:2204:1: rule__CraneS__Group__6 : rule__CraneS__Group__6__Impl ;
    public final void rule__CraneS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2208:1: ( rule__CraneS__Group__6__Impl )
            // InternalShortDSLParser.g:2209:2: rule__CraneS__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CraneS__Group__6__Impl();

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
    // $ANTLR end "rule__CraneS__Group__6"


    // $ANTLR start "rule__CraneS__Group__6__Impl"
    // InternalShortDSLParser.g:2215:1: rule__CraneS__Group__6__Impl : ( RULE_END ) ;
    public final void rule__CraneS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2219:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:2220:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:2220:1: ( RULE_END )
            // InternalShortDSLParser.g:2221:2: RULE_END
            {
             before(grammarAccess.getCraneSAccess().getENDTerminalRuleCall_6()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getCraneSAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CraneS__Group__6__Impl"


    // $ANTLR start "rule__CraneZoneS__Group__0"
    // InternalShortDSLParser.g:2231:1: rule__CraneZoneS__Group__0 : rule__CraneZoneS__Group__0__Impl rule__CraneZoneS__Group__1 ;
    public final void rule__CraneZoneS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2235:1: ( rule__CraneZoneS__Group__0__Impl rule__CraneZoneS__Group__1 )
            // InternalShortDSLParser.g:2236:2: rule__CraneZoneS__Group__0__Impl rule__CraneZoneS__Group__1
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
    // InternalShortDSLParser.g:2243:1: rule__CraneZoneS__Group__0__Impl : ( () ) ;
    public final void rule__CraneZoneS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2247:1: ( ( () ) )
            // InternalShortDSLParser.g:2248:1: ( () )
            {
            // InternalShortDSLParser.g:2248:1: ( () )
            // InternalShortDSLParser.g:2249:2: ()
            {
             before(grammarAccess.getCraneZoneSAccess().getCraneZoneAction_0()); 
            // InternalShortDSLParser.g:2250:2: ()
            // InternalShortDSLParser.g:2250:3: 
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
    // InternalShortDSLParser.g:2258:1: rule__CraneZoneS__Group__1 : rule__CraneZoneS__Group__1__Impl rule__CraneZoneS__Group__2 ;
    public final void rule__CraneZoneS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2262:1: ( rule__CraneZoneS__Group__1__Impl rule__CraneZoneS__Group__2 )
            // InternalShortDSLParser.g:2263:2: rule__CraneZoneS__Group__1__Impl rule__CraneZoneS__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalShortDSLParser.g:2270:1: rule__CraneZoneS__Group__1__Impl : ( ( rule__CraneZoneS__NameAssignment_1 ) ) ;
    public final void rule__CraneZoneS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2274:1: ( ( ( rule__CraneZoneS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2275:1: ( ( rule__CraneZoneS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2275:1: ( ( rule__CraneZoneS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2276:2: ( rule__CraneZoneS__NameAssignment_1 )
            {
             before(grammarAccess.getCraneZoneSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2277:2: ( rule__CraneZoneS__NameAssignment_1 )
            // InternalShortDSLParser.g:2277:3: rule__CraneZoneS__NameAssignment_1
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
    // InternalShortDSLParser.g:2285:1: rule__CraneZoneS__Group__2 : rule__CraneZoneS__Group__2__Impl rule__CraneZoneS__Group__3 ;
    public final void rule__CraneZoneS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2289:1: ( rule__CraneZoneS__Group__2__Impl rule__CraneZoneS__Group__3 )
            // InternalShortDSLParser.g:2290:2: rule__CraneZoneS__Group__2__Impl rule__CraneZoneS__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalShortDSLParser.g:2297:1: rule__CraneZoneS__Group__2__Impl : ( Colon ) ;
    public final void rule__CraneZoneS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2301:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2302:1: ( Colon )
            {
            // InternalShortDSLParser.g:2302:1: ( Colon )
            // InternalShortDSLParser.g:2303:2: Colon
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
    // InternalShortDSLParser.g:2312:1: rule__CraneZoneS__Group__3 : rule__CraneZoneS__Group__3__Impl rule__CraneZoneS__Group__4 ;
    public final void rule__CraneZoneS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2316:1: ( rule__CraneZoneS__Group__3__Impl rule__CraneZoneS__Group__4 )
            // InternalShortDSLParser.g:2317:2: rule__CraneZoneS__Group__3__Impl rule__CraneZoneS__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalShortDSLParser.g:2324:1: rule__CraneZoneS__Group__3__Impl : ( ( rule__CraneZoneS__ZoneValueAssignment_3 ) ) ;
    public final void rule__CraneZoneS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2328:1: ( ( ( rule__CraneZoneS__ZoneValueAssignment_3 ) ) )
            // InternalShortDSLParser.g:2329:1: ( ( rule__CraneZoneS__ZoneValueAssignment_3 ) )
            {
            // InternalShortDSLParser.g:2329:1: ( ( rule__CraneZoneS__ZoneValueAssignment_3 ) )
            // InternalShortDSLParser.g:2330:2: ( rule__CraneZoneS__ZoneValueAssignment_3 )
            {
             before(grammarAccess.getCraneZoneSAccess().getZoneValueAssignment_3()); 
            // InternalShortDSLParser.g:2331:2: ( rule__CraneZoneS__ZoneValueAssignment_3 )
            // InternalShortDSLParser.g:2331:3: rule__CraneZoneS__ZoneValueAssignment_3
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
    // InternalShortDSLParser.g:2339:1: rule__CraneZoneS__Group__4 : rule__CraneZoneS__Group__4__Impl ;
    public final void rule__CraneZoneS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2343:1: ( rule__CraneZoneS__Group__4__Impl )
            // InternalShortDSLParser.g:2344:2: rule__CraneZoneS__Group__4__Impl
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
    // InternalShortDSLParser.g:2350:1: rule__CraneZoneS__Group__4__Impl : ( ( Comma )? ) ;
    public final void rule__CraneZoneS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2354:1: ( ( ( Comma )? ) )
            // InternalShortDSLParser.g:2355:1: ( ( Comma )? )
            {
            // InternalShortDSLParser.g:2355:1: ( ( Comma )? )
            // InternalShortDSLParser.g:2356:2: ( Comma )?
            {
             before(grammarAccess.getCraneZoneSAccess().getCommaKeyword_4()); 
            // InternalShortDSLParser.g:2357:2: ( Comma )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Comma) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalShortDSLParser.g:2357:3: Comma
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
    // InternalShortDSLParser.g:2366:1: rule__DiskS__Group__0 : rule__DiskS__Group__0__Impl rule__DiskS__Group__1 ;
    public final void rule__DiskS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2370:1: ( rule__DiskS__Group__0__Impl rule__DiskS__Group__1 )
            // InternalShortDSLParser.g:2371:2: rule__DiskS__Group__0__Impl rule__DiskS__Group__1
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
    // InternalShortDSLParser.g:2378:1: rule__DiskS__Group__0__Impl : ( () ) ;
    public final void rule__DiskS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2382:1: ( ( () ) )
            // InternalShortDSLParser.g:2383:1: ( () )
            {
            // InternalShortDSLParser.g:2383:1: ( () )
            // InternalShortDSLParser.g:2384:2: ()
            {
             before(grammarAccess.getDiskSAccess().getDiskAction_0()); 
            // InternalShortDSLParser.g:2385:2: ()
            // InternalShortDSLParser.g:2385:3: 
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
    // InternalShortDSLParser.g:2393:1: rule__DiskS__Group__1 : rule__DiskS__Group__1__Impl rule__DiskS__Group__2 ;
    public final void rule__DiskS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2397:1: ( rule__DiskS__Group__1__Impl rule__DiskS__Group__2 )
            // InternalShortDSLParser.g:2398:2: rule__DiskS__Group__1__Impl rule__DiskS__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalShortDSLParser.g:2405:1: rule__DiskS__Group__1__Impl : ( ( rule__DiskS__NameAssignment_1 ) ) ;
    public final void rule__DiskS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2409:1: ( ( ( rule__DiskS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2410:1: ( ( rule__DiskS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2410:1: ( ( rule__DiskS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2411:2: ( rule__DiskS__NameAssignment_1 )
            {
             before(grammarAccess.getDiskSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2412:2: ( rule__DiskS__NameAssignment_1 )
            // InternalShortDSLParser.g:2412:3: rule__DiskS__NameAssignment_1
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
    // InternalShortDSLParser.g:2420:1: rule__DiskS__Group__2 : rule__DiskS__Group__2__Impl rule__DiskS__Group__3 ;
    public final void rule__DiskS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2424:1: ( rule__DiskS__Group__2__Impl rule__DiskS__Group__3 )
            // InternalShortDSLParser.g:2425:2: rule__DiskS__Group__2__Impl rule__DiskS__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalShortDSLParser.g:2432:1: rule__DiskS__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__DiskS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2436:1: ( ( LeftParenthesis ) )
            // InternalShortDSLParser.g:2437:1: ( LeftParenthesis )
            {
            // InternalShortDSLParser.g:2437:1: ( LeftParenthesis )
            // InternalShortDSLParser.g:2438:2: LeftParenthesis
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
    // InternalShortDSLParser.g:2447:1: rule__DiskS__Group__3 : rule__DiskS__Group__3__Impl rule__DiskS__Group__4 ;
    public final void rule__DiskS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2451:1: ( rule__DiskS__Group__3__Impl rule__DiskS__Group__4 )
            // InternalShortDSLParser.g:2452:2: rule__DiskS__Group__3__Impl rule__DiskS__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalShortDSLParser.g:2459:1: rule__DiskS__Group__3__Impl : ( ( rule__DiskS__NSlotsAssignment_3 ) ) ;
    public final void rule__DiskS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2463:1: ( ( ( rule__DiskS__NSlotsAssignment_3 ) ) )
            // InternalShortDSLParser.g:2464:1: ( ( rule__DiskS__NSlotsAssignment_3 ) )
            {
            // InternalShortDSLParser.g:2464:1: ( ( rule__DiskS__NSlotsAssignment_3 ) )
            // InternalShortDSLParser.g:2465:2: ( rule__DiskS__NSlotsAssignment_3 )
            {
             before(grammarAccess.getDiskSAccess().getNSlotsAssignment_3()); 
            // InternalShortDSLParser.g:2466:2: ( rule__DiskS__NSlotsAssignment_3 )
            // InternalShortDSLParser.g:2466:3: rule__DiskS__NSlotsAssignment_3
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
    // InternalShortDSLParser.g:2474:1: rule__DiskS__Group__4 : rule__DiskS__Group__4__Impl rule__DiskS__Group__5 ;
    public final void rule__DiskS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2478:1: ( rule__DiskS__Group__4__Impl rule__DiskS__Group__5 )
            // InternalShortDSLParser.g:2479:2: rule__DiskS__Group__4__Impl rule__DiskS__Group__5
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
    // InternalShortDSLParser.g:2486:1: rule__DiskS__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__DiskS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2490:1: ( ( RightParenthesis ) )
            // InternalShortDSLParser.g:2491:1: ( RightParenthesis )
            {
            // InternalShortDSLParser.g:2491:1: ( RightParenthesis )
            // InternalShortDSLParser.g:2492:2: RightParenthesis
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
    // InternalShortDSLParser.g:2501:1: rule__DiskS__Group__5 : rule__DiskS__Group__5__Impl rule__DiskS__Group__6 ;
    public final void rule__DiskS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2505:1: ( rule__DiskS__Group__5__Impl rule__DiskS__Group__6 )
            // InternalShortDSLParser.g:2506:2: rule__DiskS__Group__5__Impl rule__DiskS__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalShortDSLParser.g:2513:1: rule__DiskS__Group__5__Impl : ( ( rule__DiskS__LoggingAssignment_5 )? ) ;
    public final void rule__DiskS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2517:1: ( ( ( rule__DiskS__LoggingAssignment_5 )? ) )
            // InternalShortDSLParser.g:2518:1: ( ( rule__DiskS__LoggingAssignment_5 )? )
            {
            // InternalShortDSLParser.g:2518:1: ( ( rule__DiskS__LoggingAssignment_5 )? )
            // InternalShortDSLParser.g:2519:2: ( rule__DiskS__LoggingAssignment_5 )?
            {
             before(grammarAccess.getDiskSAccess().getLoggingAssignment_5()); 
            // InternalShortDSLParser.g:2520:2: ( rule__DiskS__LoggingAssignment_5 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Logging) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalShortDSLParser.g:2520:3: rule__DiskS__LoggingAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__DiskS__LoggingAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiskSAccess().getLoggingAssignment_5()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:2528:1: rule__DiskS__Group__6 : rule__DiskS__Group__6__Impl rule__DiskS__Group__7 ;
    public final void rule__DiskS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2532:1: ( rule__DiskS__Group__6__Impl rule__DiskS__Group__7 )
            // InternalShortDSLParser.g:2533:2: rule__DiskS__Group__6__Impl rule__DiskS__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalShortDSLParser.g:2540:1: rule__DiskS__Group__6__Impl : ( Colon ) ;
    public final void rule__DiskS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2544:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2545:1: ( Colon )
            {
            // InternalShortDSLParser.g:2545:1: ( Colon )
            // InternalShortDSLParser.g:2546:2: Colon
            {
             before(grammarAccess.getDiskSAccess().getColonKeyword_6()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getDiskSAccess().getColonKeyword_6()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:2555:1: rule__DiskS__Group__7 : rule__DiskS__Group__7__Impl rule__DiskS__Group__8 ;
    public final void rule__DiskS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2559:1: ( rule__DiskS__Group__7__Impl rule__DiskS__Group__8 )
            // InternalShortDSLParser.g:2560:2: rule__DiskS__Group__7__Impl rule__DiskS__Group__8
            {
            pushFollow(FOLLOW_7);
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
    // InternalShortDSLParser.g:2567:1: rule__DiskS__Group__7__Impl : ( RULE_BEGIN ) ;
    public final void rule__DiskS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2571:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:2572:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:2572:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:2573:2: RULE_BEGIN
            {
             before(grammarAccess.getDiskSAccess().getBEGINTerminalRuleCall_7()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getDiskSAccess().getBEGINTerminalRuleCall_7()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:2582:1: rule__DiskS__Group__8 : rule__DiskS__Group__8__Impl rule__DiskS__Group__9 ;
    public final void rule__DiskS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2586:1: ( rule__DiskS__Group__8__Impl rule__DiskS__Group__9 )
            // InternalShortDSLParser.g:2587:2: rule__DiskS__Group__8__Impl rule__DiskS__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__DiskS__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskS__Group__9();

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
    // InternalShortDSLParser.g:2594:1: rule__DiskS__Group__8__Impl : ( ( ( rule__DiskS__TargetsAssignment_8 ) ) ( ( rule__DiskS__TargetsAssignment_8 )* ) ) ;
    public final void rule__DiskS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2598:1: ( ( ( ( rule__DiskS__TargetsAssignment_8 ) ) ( ( rule__DiskS__TargetsAssignment_8 )* ) ) )
            // InternalShortDSLParser.g:2599:1: ( ( ( rule__DiskS__TargetsAssignment_8 ) ) ( ( rule__DiskS__TargetsAssignment_8 )* ) )
            {
            // InternalShortDSLParser.g:2599:1: ( ( ( rule__DiskS__TargetsAssignment_8 ) ) ( ( rule__DiskS__TargetsAssignment_8 )* ) )
            // InternalShortDSLParser.g:2600:2: ( ( rule__DiskS__TargetsAssignment_8 ) ) ( ( rule__DiskS__TargetsAssignment_8 )* )
            {
            // InternalShortDSLParser.g:2600:2: ( ( rule__DiskS__TargetsAssignment_8 ) )
            // InternalShortDSLParser.g:2601:3: ( rule__DiskS__TargetsAssignment_8 )
            {
             before(grammarAccess.getDiskSAccess().getTargetsAssignment_8()); 
            // InternalShortDSLParser.g:2602:3: ( rule__DiskS__TargetsAssignment_8 )
            // InternalShortDSLParser.g:2602:4: rule__DiskS__TargetsAssignment_8
            {
            pushFollow(FOLLOW_13);
            rule__DiskS__TargetsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDiskSAccess().getTargetsAssignment_8()); 

            }

            // InternalShortDSLParser.g:2605:2: ( ( rule__DiskS__TargetsAssignment_8 )* )
            // InternalShortDSLParser.g:2606:3: ( rule__DiskS__TargetsAssignment_8 )*
            {
             before(grammarAccess.getDiskSAccess().getTargetsAssignment_8()); 
            // InternalShortDSLParser.g:2607:3: ( rule__DiskS__TargetsAssignment_8 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalShortDSLParser.g:2607:4: rule__DiskS__TargetsAssignment_8
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DiskS__TargetsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getDiskSAccess().getTargetsAssignment_8()); 

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
    // $ANTLR end "rule__DiskS__Group__8__Impl"


    // $ANTLR start "rule__DiskS__Group__9"
    // InternalShortDSLParser.g:2616:1: rule__DiskS__Group__9 : rule__DiskS__Group__9__Impl ;
    public final void rule__DiskS__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2620:1: ( rule__DiskS__Group__9__Impl )
            // InternalShortDSLParser.g:2621:2: rule__DiskS__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiskS__Group__9__Impl();

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
    // $ANTLR end "rule__DiskS__Group__9"


    // $ANTLR start "rule__DiskS__Group__9__Impl"
    // InternalShortDSLParser.g:2627:1: rule__DiskS__Group__9__Impl : ( RULE_END ) ;
    public final void rule__DiskS__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2631:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:2632:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:2632:1: ( RULE_END )
            // InternalShortDSLParser.g:2633:2: RULE_END
            {
             before(grammarAccess.getDiskSAccess().getENDTerminalRuleCall_9()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getDiskSAccess().getENDTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskS__Group__9__Impl"


    // $ANTLR start "rule__DiskZoneS__Group__0"
    // InternalShortDSLParser.g:2643:1: rule__DiskZoneS__Group__0 : rule__DiskZoneS__Group__0__Impl rule__DiskZoneS__Group__1 ;
    public final void rule__DiskZoneS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2647:1: ( rule__DiskZoneS__Group__0__Impl rule__DiskZoneS__Group__1 )
            // InternalShortDSLParser.g:2648:2: rule__DiskZoneS__Group__0__Impl rule__DiskZoneS__Group__1
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
    // InternalShortDSLParser.g:2655:1: rule__DiskZoneS__Group__0__Impl : ( () ) ;
    public final void rule__DiskZoneS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2659:1: ( ( () ) )
            // InternalShortDSLParser.g:2660:1: ( () )
            {
            // InternalShortDSLParser.g:2660:1: ( () )
            // InternalShortDSLParser.g:2661:2: ()
            {
             before(grammarAccess.getDiskZoneSAccess().getDiskZoneAction_0()); 
            // InternalShortDSLParser.g:2662:2: ()
            // InternalShortDSLParser.g:2662:3: 
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
    // InternalShortDSLParser.g:2670:1: rule__DiskZoneS__Group__1 : rule__DiskZoneS__Group__1__Impl rule__DiskZoneS__Group__2 ;
    public final void rule__DiskZoneS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2674:1: ( rule__DiskZoneS__Group__1__Impl rule__DiskZoneS__Group__2 )
            // InternalShortDSLParser.g:2675:2: rule__DiskZoneS__Group__1__Impl rule__DiskZoneS__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalShortDSLParser.g:2682:1: rule__DiskZoneS__Group__1__Impl : ( ( rule__DiskZoneS__NameAssignment_1 ) ) ;
    public final void rule__DiskZoneS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2686:1: ( ( ( rule__DiskZoneS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2687:1: ( ( rule__DiskZoneS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2687:1: ( ( rule__DiskZoneS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2688:2: ( rule__DiskZoneS__NameAssignment_1 )
            {
             before(grammarAccess.getDiskZoneSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2689:2: ( rule__DiskZoneS__NameAssignment_1 )
            // InternalShortDSLParser.g:2689:3: rule__DiskZoneS__NameAssignment_1
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
    // InternalShortDSLParser.g:2697:1: rule__DiskZoneS__Group__2 : rule__DiskZoneS__Group__2__Impl rule__DiskZoneS__Group__3 ;
    public final void rule__DiskZoneS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2701:1: ( rule__DiskZoneS__Group__2__Impl rule__DiskZoneS__Group__3 )
            // InternalShortDSLParser.g:2702:2: rule__DiskZoneS__Group__2__Impl rule__DiskZoneS__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalShortDSLParser.g:2709:1: rule__DiskZoneS__Group__2__Impl : ( Colon ) ;
    public final void rule__DiskZoneS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2713:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2714:1: ( Colon )
            {
            // InternalShortDSLParser.g:2714:1: ( Colon )
            // InternalShortDSLParser.g:2715:2: Colon
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
    // InternalShortDSLParser.g:2724:1: rule__DiskZoneS__Group__3 : rule__DiskZoneS__Group__3__Impl rule__DiskZoneS__Group__4 ;
    public final void rule__DiskZoneS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2728:1: ( rule__DiskZoneS__Group__3__Impl rule__DiskZoneS__Group__4 )
            // InternalShortDSLParser.g:2729:2: rule__DiskZoneS__Group__3__Impl rule__DiskZoneS__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalShortDSLParser.g:2736:1: rule__DiskZoneS__Group__3__Impl : ( ( rule__DiskZoneS__SlotAssignment_3 ) ) ;
    public final void rule__DiskZoneS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2740:1: ( ( ( rule__DiskZoneS__SlotAssignment_3 ) ) )
            // InternalShortDSLParser.g:2741:1: ( ( rule__DiskZoneS__SlotAssignment_3 ) )
            {
            // InternalShortDSLParser.g:2741:1: ( ( rule__DiskZoneS__SlotAssignment_3 ) )
            // InternalShortDSLParser.g:2742:2: ( rule__DiskZoneS__SlotAssignment_3 )
            {
             before(grammarAccess.getDiskZoneSAccess().getSlotAssignment_3()); 
            // InternalShortDSLParser.g:2743:2: ( rule__DiskZoneS__SlotAssignment_3 )
            // InternalShortDSLParser.g:2743:3: rule__DiskZoneS__SlotAssignment_3
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
    // InternalShortDSLParser.g:2751:1: rule__DiskZoneS__Group__4 : rule__DiskZoneS__Group__4__Impl ;
    public final void rule__DiskZoneS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2755:1: ( rule__DiskZoneS__Group__4__Impl )
            // InternalShortDSLParser.g:2756:2: rule__DiskZoneS__Group__4__Impl
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
    // InternalShortDSLParser.g:2762:1: rule__DiskZoneS__Group__4__Impl : ( ( Comma )? ) ;
    public final void rule__DiskZoneS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2766:1: ( ( ( Comma )? ) )
            // InternalShortDSLParser.g:2767:1: ( ( Comma )? )
            {
            // InternalShortDSLParser.g:2767:1: ( ( Comma )? )
            // InternalShortDSLParser.g:2768:2: ( Comma )?
            {
             before(grammarAccess.getDiskZoneSAccess().getCommaKeyword_4()); 
            // InternalShortDSLParser.g:2769:2: ( Comma )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Comma) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalShortDSLParser.g:2769:3: Comma
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
    // InternalShortDSLParser.g:2778:1: rule__CameraS__Group__0 : rule__CameraS__Group__0__Impl rule__CameraS__Group__1 ;
    public final void rule__CameraS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2782:1: ( rule__CameraS__Group__0__Impl rule__CameraS__Group__1 )
            // InternalShortDSLParser.g:2783:2: rule__CameraS__Group__0__Impl rule__CameraS__Group__1
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
    // InternalShortDSLParser.g:2790:1: rule__CameraS__Group__0__Impl : ( () ) ;
    public final void rule__CameraS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2794:1: ( ( () ) )
            // InternalShortDSLParser.g:2795:1: ( () )
            {
            // InternalShortDSLParser.g:2795:1: ( () )
            // InternalShortDSLParser.g:2796:2: ()
            {
             before(grammarAccess.getCameraSAccess().getCameraAction_0()); 
            // InternalShortDSLParser.g:2797:2: ()
            // InternalShortDSLParser.g:2797:3: 
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
    // InternalShortDSLParser.g:2805:1: rule__CameraS__Group__1 : rule__CameraS__Group__1__Impl rule__CameraS__Group__2 ;
    public final void rule__CameraS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2809:1: ( rule__CameraS__Group__1__Impl rule__CameraS__Group__2 )
            // InternalShortDSLParser.g:2810:2: rule__CameraS__Group__1__Impl rule__CameraS__Group__2
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
    // InternalShortDSLParser.g:2817:1: rule__CameraS__Group__1__Impl : ( ( rule__CameraS__NameAssignment_1 ) ) ;
    public final void rule__CameraS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2821:1: ( ( ( rule__CameraS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2822:1: ( ( rule__CameraS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2822:1: ( ( rule__CameraS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2823:2: ( rule__CameraS__NameAssignment_1 )
            {
             before(grammarAccess.getCameraSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2824:2: ( rule__CameraS__NameAssignment_1 )
            // InternalShortDSLParser.g:2824:3: rule__CameraS__NameAssignment_1
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
    // InternalShortDSLParser.g:2832:1: rule__CameraS__Group__2 : rule__CameraS__Group__2__Impl rule__CameraS__Group__3 ;
    public final void rule__CameraS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2836:1: ( rule__CameraS__Group__2__Impl rule__CameraS__Group__3 )
            // InternalShortDSLParser.g:2837:2: rule__CameraS__Group__2__Impl rule__CameraS__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalShortDSLParser.g:2844:1: rule__CameraS__Group__2__Impl : ( ( rule__CameraS__LoggingAssignment_2 )? ) ;
    public final void rule__CameraS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2848:1: ( ( ( rule__CameraS__LoggingAssignment_2 )? ) )
            // InternalShortDSLParser.g:2849:1: ( ( rule__CameraS__LoggingAssignment_2 )? )
            {
            // InternalShortDSLParser.g:2849:1: ( ( rule__CameraS__LoggingAssignment_2 )? )
            // InternalShortDSLParser.g:2850:2: ( rule__CameraS__LoggingAssignment_2 )?
            {
             before(grammarAccess.getCameraSAccess().getLoggingAssignment_2()); 
            // InternalShortDSLParser.g:2851:2: ( rule__CameraS__LoggingAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Logging) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalShortDSLParser.g:2851:3: rule__CameraS__LoggingAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CameraS__LoggingAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCameraSAccess().getLoggingAssignment_2()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:2859:1: rule__CameraS__Group__3 : rule__CameraS__Group__3__Impl rule__CameraS__Group__4 ;
    public final void rule__CameraS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2863:1: ( rule__CameraS__Group__3__Impl rule__CameraS__Group__4 )
            // InternalShortDSLParser.g:2864:2: rule__CameraS__Group__3__Impl rule__CameraS__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalShortDSLParser.g:2871:1: rule__CameraS__Group__3__Impl : ( Colon ) ;
    public final void rule__CameraS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2875:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2876:1: ( Colon )
            {
            // InternalShortDSLParser.g:2876:1: ( Colon )
            // InternalShortDSLParser.g:2877:2: Colon
            {
             before(grammarAccess.getCameraSAccess().getColonKeyword_3()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCameraSAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:2886:1: rule__CameraS__Group__4 : rule__CameraS__Group__4__Impl rule__CameraS__Group__5 ;
    public final void rule__CameraS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2890:1: ( rule__CameraS__Group__4__Impl rule__CameraS__Group__5 )
            // InternalShortDSLParser.g:2891:2: rule__CameraS__Group__4__Impl rule__CameraS__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalShortDSLParser.g:2898:1: rule__CameraS__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__CameraS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2902:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:2903:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:2903:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:2904:2: RULE_BEGIN
            {
             before(grammarAccess.getCameraSAccess().getBEGINTerminalRuleCall_4()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getCameraSAccess().getBEGINTerminalRuleCall_4()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:2913:1: rule__CameraS__Group__5 : rule__CameraS__Group__5__Impl rule__CameraS__Group__6 ;
    public final void rule__CameraS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2917:1: ( rule__CameraS__Group__5__Impl rule__CameraS__Group__6 )
            // InternalShortDSLParser.g:2918:2: rule__CameraS__Group__5__Impl rule__CameraS__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__CameraS__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CameraS__Group__6();

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
    // InternalShortDSLParser.g:2925:1: rule__CameraS__Group__5__Impl : ( ( ( rule__CameraS__TargetsAssignment_5 ) ) ( ( rule__CameraS__TargetsAssignment_5 )* ) ) ;
    public final void rule__CameraS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2929:1: ( ( ( ( rule__CameraS__TargetsAssignment_5 ) ) ( ( rule__CameraS__TargetsAssignment_5 )* ) ) )
            // InternalShortDSLParser.g:2930:1: ( ( ( rule__CameraS__TargetsAssignment_5 ) ) ( ( rule__CameraS__TargetsAssignment_5 )* ) )
            {
            // InternalShortDSLParser.g:2930:1: ( ( ( rule__CameraS__TargetsAssignment_5 ) ) ( ( rule__CameraS__TargetsAssignment_5 )* ) )
            // InternalShortDSLParser.g:2931:2: ( ( rule__CameraS__TargetsAssignment_5 ) ) ( ( rule__CameraS__TargetsAssignment_5 )* )
            {
            // InternalShortDSLParser.g:2931:2: ( ( rule__CameraS__TargetsAssignment_5 ) )
            // InternalShortDSLParser.g:2932:3: ( rule__CameraS__TargetsAssignment_5 )
            {
             before(grammarAccess.getCameraSAccess().getTargetsAssignment_5()); 
            // InternalShortDSLParser.g:2933:3: ( rule__CameraS__TargetsAssignment_5 )
            // InternalShortDSLParser.g:2933:4: rule__CameraS__TargetsAssignment_5
            {
            pushFollow(FOLLOW_22);
            rule__CameraS__TargetsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCameraSAccess().getTargetsAssignment_5()); 

            }

            // InternalShortDSLParser.g:2936:2: ( ( rule__CameraS__TargetsAssignment_5 )* )
            // InternalShortDSLParser.g:2937:3: ( rule__CameraS__TargetsAssignment_5 )*
            {
             before(grammarAccess.getCameraSAccess().getTargetsAssignment_5()); 
            // InternalShortDSLParser.g:2938:3: ( rule__CameraS__TargetsAssignment_5 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Green||LA29_0==Blue||LA29_0==Red) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalShortDSLParser.g:2938:4: rule__CameraS__TargetsAssignment_5
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__CameraS__TargetsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getCameraSAccess().getTargetsAssignment_5()); 

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
    // $ANTLR end "rule__CameraS__Group__5__Impl"


    // $ANTLR start "rule__CameraS__Group__6"
    // InternalShortDSLParser.g:2947:1: rule__CameraS__Group__6 : rule__CameraS__Group__6__Impl ;
    public final void rule__CameraS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2951:1: ( rule__CameraS__Group__6__Impl )
            // InternalShortDSLParser.g:2952:2: rule__CameraS__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CameraS__Group__6__Impl();

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
    // $ANTLR end "rule__CameraS__Group__6"


    // $ANTLR start "rule__CameraS__Group__6__Impl"
    // InternalShortDSLParser.g:2958:1: rule__CameraS__Group__6__Impl : ( RULE_END ) ;
    public final void rule__CameraS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2962:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:2963:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:2963:1: ( RULE_END )
            // InternalShortDSLParser.g:2964:2: RULE_END
            {
             before(grammarAccess.getCameraSAccess().getENDTerminalRuleCall_6()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getCameraSAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraS__Group__6__Impl"


    // $ANTLR start "rule__CameraColorS__Group__0"
    // InternalShortDSLParser.g:2974:1: rule__CameraColorS__Group__0 : rule__CameraColorS__Group__0__Impl rule__CameraColorS__Group__1 ;
    public final void rule__CameraColorS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2978:1: ( rule__CameraColorS__Group__0__Impl rule__CameraColorS__Group__1 )
            // InternalShortDSLParser.g:2979:2: rule__CameraColorS__Group__0__Impl rule__CameraColorS__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalShortDSLParser.g:2986:1: rule__CameraColorS__Group__0__Impl : ( () ) ;
    public final void rule__CameraColorS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2990:1: ( ( () ) )
            // InternalShortDSLParser.g:2991:1: ( () )
            {
            // InternalShortDSLParser.g:2991:1: ( () )
            // InternalShortDSLParser.g:2992:2: ()
            {
             before(grammarAccess.getCameraColorSAccess().getCameraColorAction_0()); 
            // InternalShortDSLParser.g:2993:2: ()
            // InternalShortDSLParser.g:2993:3: 
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
    // InternalShortDSLParser.g:3001:1: rule__CameraColorS__Group__1 : rule__CameraColorS__Group__1__Impl rule__CameraColorS__Group__2 ;
    public final void rule__CameraColorS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3005:1: ( rule__CameraColorS__Group__1__Impl rule__CameraColorS__Group__2 )
            // InternalShortDSLParser.g:3006:2: rule__CameraColorS__Group__1__Impl rule__CameraColorS__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalShortDSLParser.g:3013:1: rule__CameraColorS__Group__1__Impl : ( ( rule__CameraColorS__ColorAssignment_1 ) ) ;
    public final void rule__CameraColorS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3017:1: ( ( ( rule__CameraColorS__ColorAssignment_1 ) ) )
            // InternalShortDSLParser.g:3018:1: ( ( rule__CameraColorS__ColorAssignment_1 ) )
            {
            // InternalShortDSLParser.g:3018:1: ( ( rule__CameraColorS__ColorAssignment_1 ) )
            // InternalShortDSLParser.g:3019:2: ( rule__CameraColorS__ColorAssignment_1 )
            {
             before(grammarAccess.getCameraColorSAccess().getColorAssignment_1()); 
            // InternalShortDSLParser.g:3020:2: ( rule__CameraColorS__ColorAssignment_1 )
            // InternalShortDSLParser.g:3020:3: rule__CameraColorS__ColorAssignment_1
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
    // InternalShortDSLParser.g:3028:1: rule__CameraColorS__Group__2 : rule__CameraColorS__Group__2__Impl ;
    public final void rule__CameraColorS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3032:1: ( rule__CameraColorS__Group__2__Impl )
            // InternalShortDSLParser.g:3033:2: rule__CameraColorS__Group__2__Impl
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
    // InternalShortDSLParser.g:3039:1: rule__CameraColorS__Group__2__Impl : ( ( Comma )? ) ;
    public final void rule__CameraColorS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3043:1: ( ( ( Comma )? ) )
            // InternalShortDSLParser.g:3044:1: ( ( Comma )? )
            {
            // InternalShortDSLParser.g:3044:1: ( ( Comma )? )
            // InternalShortDSLParser.g:3045:2: ( Comma )?
            {
             before(grammarAccess.getCameraColorSAccess().getCommaKeyword_2()); 
            // InternalShortDSLParser.g:3046:2: ( Comma )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Comma) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalShortDSLParser.g:3046:3: Comma
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


    // $ANTLR start "rule__LoggingS__Group__0"
    // InternalShortDSLParser.g:3055:1: rule__LoggingS__Group__0 : rule__LoggingS__Group__0__Impl rule__LoggingS__Group__1 ;
    public final void rule__LoggingS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3059:1: ( rule__LoggingS__Group__0__Impl rule__LoggingS__Group__1 )
            // InternalShortDSLParser.g:3060:2: rule__LoggingS__Group__0__Impl rule__LoggingS__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__LoggingS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoggingS__Group__1();

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
    // $ANTLR end "rule__LoggingS__Group__0"


    // $ANTLR start "rule__LoggingS__Group__0__Impl"
    // InternalShortDSLParser.g:3067:1: rule__LoggingS__Group__0__Impl : ( () ) ;
    public final void rule__LoggingS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3071:1: ( ( () ) )
            // InternalShortDSLParser.g:3072:1: ( () )
            {
            // InternalShortDSLParser.g:3072:1: ( () )
            // InternalShortDSLParser.g:3073:2: ()
            {
             before(grammarAccess.getLoggingSAccess().getLoggingAction_0()); 
            // InternalShortDSLParser.g:3074:2: ()
            // InternalShortDSLParser.g:3074:3: 
            {
            }

             after(grammarAccess.getLoggingSAccess().getLoggingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggingS__Group__0__Impl"


    // $ANTLR start "rule__LoggingS__Group__1"
    // InternalShortDSLParser.g:3082:1: rule__LoggingS__Group__1 : rule__LoggingS__Group__1__Impl ;
    public final void rule__LoggingS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3086:1: ( rule__LoggingS__Group__1__Impl )
            // InternalShortDSLParser.g:3087:2: rule__LoggingS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoggingS__Group__1__Impl();

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
    // $ANTLR end "rule__LoggingS__Group__1"


    // $ANTLR start "rule__LoggingS__Group__1__Impl"
    // InternalShortDSLParser.g:3093:1: rule__LoggingS__Group__1__Impl : ( Logging ) ;
    public final void rule__LoggingS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3097:1: ( ( Logging ) )
            // InternalShortDSLParser.g:3098:1: ( Logging )
            {
            // InternalShortDSLParser.g:3098:1: ( Logging )
            // InternalShortDSLParser.g:3099:2: Logging
            {
             before(grammarAccess.getLoggingSAccess().getLoggingKeyword_1()); 
            match(input,Logging,FOLLOW_2); 
             after(grammarAccess.getLoggingSAccess().getLoggingKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggingS__Group__1__Impl"


    // $ANTLR start "rule__DiskHandlingS__Group__0"
    // InternalShortDSLParser.g:3109:1: rule__DiskHandlingS__Group__0 : rule__DiskHandlingS__Group__0__Impl rule__DiskHandlingS__Group__1 ;
    public final void rule__DiskHandlingS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3113:1: ( rule__DiskHandlingS__Group__0__Impl rule__DiskHandlingS__Group__1 )
            // InternalShortDSLParser.g:3114:2: rule__DiskHandlingS__Group__0__Impl rule__DiskHandlingS__Group__1
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
    // InternalShortDSLParser.g:3121:1: rule__DiskHandlingS__Group__0__Impl : ( Handle ) ;
    public final void rule__DiskHandlingS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3125:1: ( ( Handle ) )
            // InternalShortDSLParser.g:3126:1: ( Handle )
            {
            // InternalShortDSLParser.g:3126:1: ( Handle )
            // InternalShortDSLParser.g:3127:2: Handle
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
    // InternalShortDSLParser.g:3136:1: rule__DiskHandlingS__Group__1 : rule__DiskHandlingS__Group__1__Impl rule__DiskHandlingS__Group__2 ;
    public final void rule__DiskHandlingS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3140:1: ( rule__DiskHandlingS__Group__1__Impl rule__DiskHandlingS__Group__2 )
            // InternalShortDSLParser.g:3141:2: rule__DiskHandlingS__Group__1__Impl rule__DiskHandlingS__Group__2
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
    // InternalShortDSLParser.g:3148:1: rule__DiskHandlingS__Group__1__Impl : ( ( rule__DiskHandlingS__DiskAssignment_1 ) ) ;
    public final void rule__DiskHandlingS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3152:1: ( ( ( rule__DiskHandlingS__DiskAssignment_1 ) ) )
            // InternalShortDSLParser.g:3153:1: ( ( rule__DiskHandlingS__DiskAssignment_1 ) )
            {
            // InternalShortDSLParser.g:3153:1: ( ( rule__DiskHandlingS__DiskAssignment_1 ) )
            // InternalShortDSLParser.g:3154:2: ( rule__DiskHandlingS__DiskAssignment_1 )
            {
             before(grammarAccess.getDiskHandlingSAccess().getDiskAssignment_1()); 
            // InternalShortDSLParser.g:3155:2: ( rule__DiskHandlingS__DiskAssignment_1 )
            // InternalShortDSLParser.g:3155:3: rule__DiskHandlingS__DiskAssignment_1
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
    // InternalShortDSLParser.g:3163:1: rule__DiskHandlingS__Group__2 : rule__DiskHandlingS__Group__2__Impl rule__DiskHandlingS__Group__3 ;
    public final void rule__DiskHandlingS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3167:1: ( rule__DiskHandlingS__Group__2__Impl rule__DiskHandlingS__Group__3 )
            // InternalShortDSLParser.g:3168:2: rule__DiskHandlingS__Group__2__Impl rule__DiskHandlingS__Group__3
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
    // InternalShortDSLParser.g:3175:1: rule__DiskHandlingS__Group__2__Impl : ( LeftCurlyBracket ) ;
    public final void rule__DiskHandlingS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3179:1: ( ( LeftCurlyBracket ) )
            // InternalShortDSLParser.g:3180:1: ( LeftCurlyBracket )
            {
            // InternalShortDSLParser.g:3180:1: ( LeftCurlyBracket )
            // InternalShortDSLParser.g:3181:2: LeftCurlyBracket
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
    // InternalShortDSLParser.g:3190:1: rule__DiskHandlingS__Group__3 : rule__DiskHandlingS__Group__3__Impl rule__DiskHandlingS__Group__4 ;
    public final void rule__DiskHandlingS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3194:1: ( rule__DiskHandlingS__Group__3__Impl rule__DiskHandlingS__Group__4 )
            // InternalShortDSLParser.g:3195:2: rule__DiskHandlingS__Group__3__Impl rule__DiskHandlingS__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalShortDSLParser.g:3202:1: rule__DiskHandlingS__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__DiskHandlingS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3206:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:3207:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:3207:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:3208:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:3217:1: rule__DiskHandlingS__Group__4 : rule__DiskHandlingS__Group__4__Impl rule__DiskHandlingS__Group__5 ;
    public final void rule__DiskHandlingS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3221:1: ( rule__DiskHandlingS__Group__4__Impl rule__DiskHandlingS__Group__5 )
            // InternalShortDSLParser.g:3222:2: rule__DiskHandlingS__Group__4__Impl rule__DiskHandlingS__Group__5
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
    // InternalShortDSLParser.g:3229:1: rule__DiskHandlingS__Group__4__Impl : ( ( ( rule__DiskHandlingS__StatementsAssignment_4 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_4 )* ) ) ;
    public final void rule__DiskHandlingS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3233:1: ( ( ( ( rule__DiskHandlingS__StatementsAssignment_4 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_4 )* ) ) )
            // InternalShortDSLParser.g:3234:1: ( ( ( rule__DiskHandlingS__StatementsAssignment_4 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_4 )* ) )
            {
            // InternalShortDSLParser.g:3234:1: ( ( ( rule__DiskHandlingS__StatementsAssignment_4 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_4 )* ) )
            // InternalShortDSLParser.g:3235:2: ( ( rule__DiskHandlingS__StatementsAssignment_4 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_4 )* )
            {
            // InternalShortDSLParser.g:3235:2: ( ( rule__DiskHandlingS__StatementsAssignment_4 ) )
            // InternalShortDSLParser.g:3236:3: ( rule__DiskHandlingS__StatementsAssignment_4 )
            {
             before(grammarAccess.getDiskHandlingSAccess().getStatementsAssignment_4()); 
            // InternalShortDSLParser.g:3237:3: ( rule__DiskHandlingS__StatementsAssignment_4 )
            // InternalShortDSLParser.g:3237:4: rule__DiskHandlingS__StatementsAssignment_4
            {
            pushFollow(FOLLOW_25);
            rule__DiskHandlingS__StatementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDiskHandlingSAccess().getStatementsAssignment_4()); 

            }

            // InternalShortDSLParser.g:3240:2: ( ( rule__DiskHandlingS__StatementsAssignment_4 )* )
            // InternalShortDSLParser.g:3241:3: ( rule__DiskHandlingS__StatementsAssignment_4 )*
            {
             before(grammarAccess.getDiskHandlingSAccess().getStatementsAssignment_4()); 
            // InternalShortDSLParser.g:3242:3: ( rule__DiskHandlingS__StatementsAssignment_4 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=In_progress && LA31_0<=Complete)||LA31_0==Foreach||LA31_0==Pickup||(LA31_0>=Drop && LA31_0<=Free)||LA31_0==If||LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalShortDSLParser.g:3242:4: rule__DiskHandlingS__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__DiskHandlingS__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalShortDSLParser.g:3251:1: rule__DiskHandlingS__Group__5 : rule__DiskHandlingS__Group__5__Impl rule__DiskHandlingS__Group__6 ;
    public final void rule__DiskHandlingS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3255:1: ( rule__DiskHandlingS__Group__5__Impl rule__DiskHandlingS__Group__6 )
            // InternalShortDSLParser.g:3256:2: rule__DiskHandlingS__Group__5__Impl rule__DiskHandlingS__Group__6
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
    // InternalShortDSLParser.g:3263:1: rule__DiskHandlingS__Group__5__Impl : ( RULE_END ) ;
    public final void rule__DiskHandlingS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3267:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:3268:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:3268:1: ( RULE_END )
            // InternalShortDSLParser.g:3269:2: RULE_END
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
    // InternalShortDSLParser.g:3278:1: rule__DiskHandlingS__Group__6 : rule__DiskHandlingS__Group__6__Impl ;
    public final void rule__DiskHandlingS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3282:1: ( rule__DiskHandlingS__Group__6__Impl )
            // InternalShortDSLParser.g:3283:2: rule__DiskHandlingS__Group__6__Impl
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
    // InternalShortDSLParser.g:3289:1: rule__DiskHandlingS__Group__6__Impl : ( RightCurlyBracket ) ;
    public final void rule__DiskHandlingS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3293:1: ( ( RightCurlyBracket ) )
            // InternalShortDSLParser.g:3294:1: ( RightCurlyBracket )
            {
            // InternalShortDSLParser.g:3294:1: ( RightCurlyBracket )
            // InternalShortDSLParser.g:3295:2: RightCurlyBracket
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
    // InternalShortDSLParser.g:3305:1: rule__LoopS__Group__0 : rule__LoopS__Group__0__Impl rule__LoopS__Group__1 ;
    public final void rule__LoopS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3309:1: ( rule__LoopS__Group__0__Impl rule__LoopS__Group__1 )
            // InternalShortDSLParser.g:3310:2: rule__LoopS__Group__0__Impl rule__LoopS__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalShortDSLParser.g:3317:1: rule__LoopS__Group__0__Impl : ( () ) ;
    public final void rule__LoopS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3321:1: ( ( () ) )
            // InternalShortDSLParser.g:3322:1: ( () )
            {
            // InternalShortDSLParser.g:3322:1: ( () )
            // InternalShortDSLParser.g:3323:2: ()
            {
             before(grammarAccess.getLoopSAccess().getLoopAction_0()); 
            // InternalShortDSLParser.g:3324:2: ()
            // InternalShortDSLParser.g:3324:3: 
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
    // InternalShortDSLParser.g:3332:1: rule__LoopS__Group__1 : rule__LoopS__Group__1__Impl rule__LoopS__Group__2 ;
    public final void rule__LoopS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3336:1: ( rule__LoopS__Group__1__Impl rule__LoopS__Group__2 )
            // InternalShortDSLParser.g:3337:2: rule__LoopS__Group__1__Impl rule__LoopS__Group__2
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
    // InternalShortDSLParser.g:3344:1: rule__LoopS__Group__1__Impl : ( Foreach ) ;
    public final void rule__LoopS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3348:1: ( ( Foreach ) )
            // InternalShortDSLParser.g:3349:1: ( Foreach )
            {
            // InternalShortDSLParser.g:3349:1: ( Foreach )
            // InternalShortDSLParser.g:3350:2: Foreach
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
    // InternalShortDSLParser.g:3359:1: rule__LoopS__Group__2 : rule__LoopS__Group__2__Impl rule__LoopS__Group__3 ;
    public final void rule__LoopS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3363:1: ( rule__LoopS__Group__2__Impl rule__LoopS__Group__3 )
            // InternalShortDSLParser.g:3364:2: rule__LoopS__Group__2__Impl rule__LoopS__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalShortDSLParser.g:3371:1: rule__LoopS__Group__2__Impl : ( ( rule__LoopS__VariableAssignment_2 ) ) ;
    public final void rule__LoopS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3375:1: ( ( ( rule__LoopS__VariableAssignment_2 ) ) )
            // InternalShortDSLParser.g:3376:1: ( ( rule__LoopS__VariableAssignment_2 ) )
            {
            // InternalShortDSLParser.g:3376:1: ( ( rule__LoopS__VariableAssignment_2 ) )
            // InternalShortDSLParser.g:3377:2: ( rule__LoopS__VariableAssignment_2 )
            {
             before(grammarAccess.getLoopSAccess().getVariableAssignment_2()); 
            // InternalShortDSLParser.g:3378:2: ( rule__LoopS__VariableAssignment_2 )
            // InternalShortDSLParser.g:3378:3: rule__LoopS__VariableAssignment_2
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
    // InternalShortDSLParser.g:3386:1: rule__LoopS__Group__3 : rule__LoopS__Group__3__Impl rule__LoopS__Group__4 ;
    public final void rule__LoopS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3390:1: ( rule__LoopS__Group__3__Impl rule__LoopS__Group__4 )
            // InternalShortDSLParser.g:3391:2: rule__LoopS__Group__3__Impl rule__LoopS__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalShortDSLParser.g:3398:1: rule__LoopS__Group__3__Impl : ( ( rule__LoopS__ComparisonOperatorAssignment_3 ) ) ;
    public final void rule__LoopS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3402:1: ( ( ( rule__LoopS__ComparisonOperatorAssignment_3 ) ) )
            // InternalShortDSLParser.g:3403:1: ( ( rule__LoopS__ComparisonOperatorAssignment_3 ) )
            {
            // InternalShortDSLParser.g:3403:1: ( ( rule__LoopS__ComparisonOperatorAssignment_3 ) )
            // InternalShortDSLParser.g:3404:2: ( rule__LoopS__ComparisonOperatorAssignment_3 )
            {
             before(grammarAccess.getLoopSAccess().getComparisonOperatorAssignment_3()); 
            // InternalShortDSLParser.g:3405:2: ( rule__LoopS__ComparisonOperatorAssignment_3 )
            // InternalShortDSLParser.g:3405:3: rule__LoopS__ComparisonOperatorAssignment_3
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
    // InternalShortDSLParser.g:3413:1: rule__LoopS__Group__4 : rule__LoopS__Group__4__Impl rule__LoopS__Group__5 ;
    public final void rule__LoopS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3417:1: ( rule__LoopS__Group__4__Impl rule__LoopS__Group__5 )
            // InternalShortDSLParser.g:3418:2: rule__LoopS__Group__4__Impl rule__LoopS__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalShortDSLParser.g:3425:1: rule__LoopS__Group__4__Impl : ( ( rule__LoopS__SlotStateAssignment_4 ) ) ;
    public final void rule__LoopS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3429:1: ( ( ( rule__LoopS__SlotStateAssignment_4 ) ) )
            // InternalShortDSLParser.g:3430:1: ( ( rule__LoopS__SlotStateAssignment_4 ) )
            {
            // InternalShortDSLParser.g:3430:1: ( ( rule__LoopS__SlotStateAssignment_4 ) )
            // InternalShortDSLParser.g:3431:2: ( rule__LoopS__SlotStateAssignment_4 )
            {
             before(grammarAccess.getLoopSAccess().getSlotStateAssignment_4()); 
            // InternalShortDSLParser.g:3432:2: ( rule__LoopS__SlotStateAssignment_4 )
            // InternalShortDSLParser.g:3432:3: rule__LoopS__SlotStateAssignment_4
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
    // InternalShortDSLParser.g:3440:1: rule__LoopS__Group__5 : rule__LoopS__Group__5__Impl rule__LoopS__Group__6 ;
    public final void rule__LoopS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3444:1: ( rule__LoopS__Group__5__Impl rule__LoopS__Group__6 )
            // InternalShortDSLParser.g:3445:2: rule__LoopS__Group__5__Impl rule__LoopS__Group__6
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
    // InternalShortDSLParser.g:3452:1: rule__LoopS__Group__5__Impl : ( Colon ) ;
    public final void rule__LoopS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3456:1: ( ( Colon ) )
            // InternalShortDSLParser.g:3457:1: ( Colon )
            {
            // InternalShortDSLParser.g:3457:1: ( Colon )
            // InternalShortDSLParser.g:3458:2: Colon
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
    // InternalShortDSLParser.g:3467:1: rule__LoopS__Group__6 : rule__LoopS__Group__6__Impl rule__LoopS__Group__7 ;
    public final void rule__LoopS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3471:1: ( rule__LoopS__Group__6__Impl rule__LoopS__Group__7 )
            // InternalShortDSLParser.g:3472:2: rule__LoopS__Group__6__Impl rule__LoopS__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalShortDSLParser.g:3479:1: rule__LoopS__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__LoopS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3483:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:3484:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:3484:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:3485:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:3494:1: rule__LoopS__Group__7 : rule__LoopS__Group__7__Impl rule__LoopS__Group__8 ;
    public final void rule__LoopS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3498:1: ( rule__LoopS__Group__7__Impl rule__LoopS__Group__8 )
            // InternalShortDSLParser.g:3499:2: rule__LoopS__Group__7__Impl rule__LoopS__Group__8
            {
            pushFollow(FOLLOW_29);
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
    // InternalShortDSLParser.g:3506:1: rule__LoopS__Group__7__Impl : ( ( rule__LoopS__StatementsAssignment_7 )* ) ;
    public final void rule__LoopS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3510:1: ( ( ( rule__LoopS__StatementsAssignment_7 )* ) )
            // InternalShortDSLParser.g:3511:1: ( ( rule__LoopS__StatementsAssignment_7 )* )
            {
            // InternalShortDSLParser.g:3511:1: ( ( rule__LoopS__StatementsAssignment_7 )* )
            // InternalShortDSLParser.g:3512:2: ( rule__LoopS__StatementsAssignment_7 )*
            {
             before(grammarAccess.getLoopSAccess().getStatementsAssignment_7()); 
            // InternalShortDSLParser.g:3513:2: ( rule__LoopS__StatementsAssignment_7 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=In_progress && LA32_0<=Complete)||LA32_0==Foreach||LA32_0==Pickup||(LA32_0>=Drop && LA32_0<=Free)||LA32_0==If||LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalShortDSLParser.g:3513:3: rule__LoopS__StatementsAssignment_7
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__LoopS__StatementsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalShortDSLParser.g:3521:1: rule__LoopS__Group__8 : rule__LoopS__Group__8__Impl ;
    public final void rule__LoopS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3525:1: ( rule__LoopS__Group__8__Impl )
            // InternalShortDSLParser.g:3526:2: rule__LoopS__Group__8__Impl
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
    // InternalShortDSLParser.g:3532:1: rule__LoopS__Group__8__Impl : ( RULE_END ) ;
    public final void rule__LoopS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3536:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:3537:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:3537:1: ( RULE_END )
            // InternalShortDSLParser.g:3538:2: RULE_END
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
    // InternalShortDSLParser.g:3548:1: rule__MoveDiskS__Group__0 : rule__MoveDiskS__Group__0__Impl rule__MoveDiskS__Group__1 ;
    public final void rule__MoveDiskS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3552:1: ( rule__MoveDiskS__Group__0__Impl rule__MoveDiskS__Group__1 )
            // InternalShortDSLParser.g:3553:2: rule__MoveDiskS__Group__0__Impl rule__MoveDiskS__Group__1
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
    // InternalShortDSLParser.g:3560:1: rule__MoveDiskS__Group__0__Impl : ( () ) ;
    public final void rule__MoveDiskS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3564:1: ( ( () ) )
            // InternalShortDSLParser.g:3565:1: ( () )
            {
            // InternalShortDSLParser.g:3565:1: ( () )
            // InternalShortDSLParser.g:3566:2: ()
            {
             before(grammarAccess.getMoveDiskSAccess().getMoveDiskAction_0()); 
            // InternalShortDSLParser.g:3567:2: ()
            // InternalShortDSLParser.g:3567:3: 
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
    // InternalShortDSLParser.g:3575:1: rule__MoveDiskS__Group__1 : rule__MoveDiskS__Group__1__Impl rule__MoveDiskS__Group__2 ;
    public final void rule__MoveDiskS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3579:1: ( rule__MoveDiskS__Group__1__Impl rule__MoveDiskS__Group__2 )
            // InternalShortDSLParser.g:3580:2: rule__MoveDiskS__Group__1__Impl rule__MoveDiskS__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalShortDSLParser.g:3587:1: rule__MoveDiskS__Group__1__Impl : ( ( rule__MoveDiskS__SlotAssignment_1 ) ) ;
    public final void rule__MoveDiskS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3591:1: ( ( ( rule__MoveDiskS__SlotAssignment_1 ) ) )
            // InternalShortDSLParser.g:3592:1: ( ( rule__MoveDiskS__SlotAssignment_1 ) )
            {
            // InternalShortDSLParser.g:3592:1: ( ( rule__MoveDiskS__SlotAssignment_1 ) )
            // InternalShortDSLParser.g:3593:2: ( rule__MoveDiskS__SlotAssignment_1 )
            {
             before(grammarAccess.getMoveDiskSAccess().getSlotAssignment_1()); 
            // InternalShortDSLParser.g:3594:2: ( rule__MoveDiskS__SlotAssignment_1 )
            // InternalShortDSLParser.g:3594:3: rule__MoveDiskS__SlotAssignment_1
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
    // InternalShortDSLParser.g:3602:1: rule__MoveDiskS__Group__2 : rule__MoveDiskS__Group__2__Impl rule__MoveDiskS__Group__3 ;
    public final void rule__MoveDiskS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3606:1: ( rule__MoveDiskS__Group__2__Impl rule__MoveDiskS__Group__3 )
            // InternalShortDSLParser.g:3607:2: rule__MoveDiskS__Group__2__Impl rule__MoveDiskS__Group__3
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
    // InternalShortDSLParser.g:3614:1: rule__MoveDiskS__Group__2__Impl : ( ( rule__MoveDiskS__Alternatives_2 ) ) ;
    public final void rule__MoveDiskS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3618:1: ( ( ( rule__MoveDiskS__Alternatives_2 ) ) )
            // InternalShortDSLParser.g:3619:1: ( ( rule__MoveDiskS__Alternatives_2 ) )
            {
            // InternalShortDSLParser.g:3619:1: ( ( rule__MoveDiskS__Alternatives_2 ) )
            // InternalShortDSLParser.g:3620:2: ( rule__MoveDiskS__Alternatives_2 )
            {
             before(grammarAccess.getMoveDiskSAccess().getAlternatives_2()); 
            // InternalShortDSLParser.g:3621:2: ( rule__MoveDiskS__Alternatives_2 )
            // InternalShortDSLParser.g:3621:3: rule__MoveDiskS__Alternatives_2
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
    // InternalShortDSLParser.g:3629:1: rule__MoveDiskS__Group__3 : rule__MoveDiskS__Group__3__Impl ;
    public final void rule__MoveDiskS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3633:1: ( rule__MoveDiskS__Group__3__Impl )
            // InternalShortDSLParser.g:3634:2: rule__MoveDiskS__Group__3__Impl
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
    // InternalShortDSLParser.g:3640:1: rule__MoveDiskS__Group__3__Impl : ( ( rule__MoveDiskS__ZoneAssignment_3 ) ) ;
    public final void rule__MoveDiskS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3644:1: ( ( ( rule__MoveDiskS__ZoneAssignment_3 ) ) )
            // InternalShortDSLParser.g:3645:1: ( ( rule__MoveDiskS__ZoneAssignment_3 ) )
            {
            // InternalShortDSLParser.g:3645:1: ( ( rule__MoveDiskS__ZoneAssignment_3 ) )
            // InternalShortDSLParser.g:3646:2: ( rule__MoveDiskS__ZoneAssignment_3 )
            {
             before(grammarAccess.getMoveDiskSAccess().getZoneAssignment_3()); 
            // InternalShortDSLParser.g:3647:2: ( rule__MoveDiskS__ZoneAssignment_3 )
            // InternalShortDSLParser.g:3647:3: rule__MoveDiskS__ZoneAssignment_3
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
    // InternalShortDSLParser.g:3656:1: rule__MoveAnySlotS__Group__0 : rule__MoveAnySlotS__Group__0__Impl rule__MoveAnySlotS__Group__1 ;
    public final void rule__MoveAnySlotS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3660:1: ( rule__MoveAnySlotS__Group__0__Impl rule__MoveAnySlotS__Group__1 )
            // InternalShortDSLParser.g:3661:2: rule__MoveAnySlotS__Group__0__Impl rule__MoveAnySlotS__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalShortDSLParser.g:3668:1: rule__MoveAnySlotS__Group__0__Impl : ( () ) ;
    public final void rule__MoveAnySlotS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3672:1: ( ( () ) )
            // InternalShortDSLParser.g:3673:1: ( () )
            {
            // InternalShortDSLParser.g:3673:1: ( () )
            // InternalShortDSLParser.g:3674:2: ()
            {
             before(grammarAccess.getMoveAnySlotSAccess().getMoveAnySlotAction_0()); 
            // InternalShortDSLParser.g:3675:2: ()
            // InternalShortDSLParser.g:3675:3: 
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
    // InternalShortDSLParser.g:3683:1: rule__MoveAnySlotS__Group__1 : rule__MoveAnySlotS__Group__1__Impl rule__MoveAnySlotS__Group__2 ;
    public final void rule__MoveAnySlotS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3687:1: ( rule__MoveAnySlotS__Group__1__Impl rule__MoveAnySlotS__Group__2 )
            // InternalShortDSLParser.g:3688:2: rule__MoveAnySlotS__Group__1__Impl rule__MoveAnySlotS__Group__2
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
    // InternalShortDSLParser.g:3695:1: rule__MoveAnySlotS__Group__1__Impl : ( ( rule__MoveAnySlotS__StateAssignment_1 ) ) ;
    public final void rule__MoveAnySlotS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3699:1: ( ( ( rule__MoveAnySlotS__StateAssignment_1 ) ) )
            // InternalShortDSLParser.g:3700:1: ( ( rule__MoveAnySlotS__StateAssignment_1 ) )
            {
            // InternalShortDSLParser.g:3700:1: ( ( rule__MoveAnySlotS__StateAssignment_1 ) )
            // InternalShortDSLParser.g:3701:2: ( rule__MoveAnySlotS__StateAssignment_1 )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getStateAssignment_1()); 
            // InternalShortDSLParser.g:3702:2: ( rule__MoveAnySlotS__StateAssignment_1 )
            // InternalShortDSLParser.g:3702:3: rule__MoveAnySlotS__StateAssignment_1
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
    // InternalShortDSLParser.g:3710:1: rule__MoveAnySlotS__Group__2 : rule__MoveAnySlotS__Group__2__Impl rule__MoveAnySlotS__Group__3 ;
    public final void rule__MoveAnySlotS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3714:1: ( rule__MoveAnySlotS__Group__2__Impl rule__MoveAnySlotS__Group__3 )
            // InternalShortDSLParser.g:3715:2: rule__MoveAnySlotS__Group__2__Impl rule__MoveAnySlotS__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalShortDSLParser.g:3722:1: rule__MoveAnySlotS__Group__2__Impl : ( ( rule__MoveAnySlotS__AnySlotAssignment_2 ) ) ;
    public final void rule__MoveAnySlotS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3726:1: ( ( ( rule__MoveAnySlotS__AnySlotAssignment_2 ) ) )
            // InternalShortDSLParser.g:3727:1: ( ( rule__MoveAnySlotS__AnySlotAssignment_2 ) )
            {
            // InternalShortDSLParser.g:3727:1: ( ( rule__MoveAnySlotS__AnySlotAssignment_2 ) )
            // InternalShortDSLParser.g:3728:2: ( rule__MoveAnySlotS__AnySlotAssignment_2 )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getAnySlotAssignment_2()); 
            // InternalShortDSLParser.g:3729:2: ( rule__MoveAnySlotS__AnySlotAssignment_2 )
            // InternalShortDSLParser.g:3729:3: rule__MoveAnySlotS__AnySlotAssignment_2
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
    // InternalShortDSLParser.g:3737:1: rule__MoveAnySlotS__Group__3 : rule__MoveAnySlotS__Group__3__Impl rule__MoveAnySlotS__Group__4 ;
    public final void rule__MoveAnySlotS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3741:1: ( rule__MoveAnySlotS__Group__3__Impl rule__MoveAnySlotS__Group__4 )
            // InternalShortDSLParser.g:3742:2: rule__MoveAnySlotS__Group__3__Impl rule__MoveAnySlotS__Group__4
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
    // InternalShortDSLParser.g:3749:1: rule__MoveAnySlotS__Group__3__Impl : ( ( rule__MoveAnySlotS__Alternatives_3 ) ) ;
    public final void rule__MoveAnySlotS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3753:1: ( ( ( rule__MoveAnySlotS__Alternatives_3 ) ) )
            // InternalShortDSLParser.g:3754:1: ( ( rule__MoveAnySlotS__Alternatives_3 ) )
            {
            // InternalShortDSLParser.g:3754:1: ( ( rule__MoveAnySlotS__Alternatives_3 ) )
            // InternalShortDSLParser.g:3755:2: ( rule__MoveAnySlotS__Alternatives_3 )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getAlternatives_3()); 
            // InternalShortDSLParser.g:3756:2: ( rule__MoveAnySlotS__Alternatives_3 )
            // InternalShortDSLParser.g:3756:3: rule__MoveAnySlotS__Alternatives_3
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
    // InternalShortDSLParser.g:3764:1: rule__MoveAnySlotS__Group__4 : rule__MoveAnySlotS__Group__4__Impl ;
    public final void rule__MoveAnySlotS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3768:1: ( rule__MoveAnySlotS__Group__4__Impl )
            // InternalShortDSLParser.g:3769:2: rule__MoveAnySlotS__Group__4__Impl
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
    // InternalShortDSLParser.g:3775:1: rule__MoveAnySlotS__Group__4__Impl : ( ( rule__MoveAnySlotS__ZoneAssignment_4 ) ) ;
    public final void rule__MoveAnySlotS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3779:1: ( ( ( rule__MoveAnySlotS__ZoneAssignment_4 ) ) )
            // InternalShortDSLParser.g:3780:1: ( ( rule__MoveAnySlotS__ZoneAssignment_4 ) )
            {
            // InternalShortDSLParser.g:3780:1: ( ( rule__MoveAnySlotS__ZoneAssignment_4 ) )
            // InternalShortDSLParser.g:3781:2: ( rule__MoveAnySlotS__ZoneAssignment_4 )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getZoneAssignment_4()); 
            // InternalShortDSLParser.g:3782:2: ( rule__MoveAnySlotS__ZoneAssignment_4 )
            // InternalShortDSLParser.g:3782:3: rule__MoveAnySlotS__ZoneAssignment_4
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
    // InternalShortDSLParser.g:3791:1: rule__MoveCraneS__Group__0 : rule__MoveCraneS__Group__0__Impl rule__MoveCraneS__Group__1 ;
    public final void rule__MoveCraneS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3795:1: ( rule__MoveCraneS__Group__0__Impl rule__MoveCraneS__Group__1 )
            // InternalShortDSLParser.g:3796:2: rule__MoveCraneS__Group__0__Impl rule__MoveCraneS__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalShortDSLParser.g:3803:1: rule__MoveCraneS__Group__0__Impl : ( () ) ;
    public final void rule__MoveCraneS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3807:1: ( ( () ) )
            // InternalShortDSLParser.g:3808:1: ( () )
            {
            // InternalShortDSLParser.g:3808:1: ( () )
            // InternalShortDSLParser.g:3809:2: ()
            {
             before(grammarAccess.getMoveCraneSAccess().getMoveCraneAction_0()); 
            // InternalShortDSLParser.g:3810:2: ()
            // InternalShortDSLParser.g:3810:3: 
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
    // InternalShortDSLParser.g:3818:1: rule__MoveCraneS__Group__1 : rule__MoveCraneS__Group__1__Impl rule__MoveCraneS__Group__2 ;
    public final void rule__MoveCraneS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3822:1: ( rule__MoveCraneS__Group__1__Impl rule__MoveCraneS__Group__2 )
            // InternalShortDSLParser.g:3823:2: rule__MoveCraneS__Group__1__Impl rule__MoveCraneS__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalShortDSLParser.g:3830:1: rule__MoveCraneS__Group__1__Impl : ( ( rule__MoveCraneS__CraneAssignment_1 ) ) ;
    public final void rule__MoveCraneS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3834:1: ( ( ( rule__MoveCraneS__CraneAssignment_1 ) ) )
            // InternalShortDSLParser.g:3835:1: ( ( rule__MoveCraneS__CraneAssignment_1 ) )
            {
            // InternalShortDSLParser.g:3835:1: ( ( rule__MoveCraneS__CraneAssignment_1 ) )
            // InternalShortDSLParser.g:3836:2: ( rule__MoveCraneS__CraneAssignment_1 )
            {
             before(grammarAccess.getMoveCraneSAccess().getCraneAssignment_1()); 
            // InternalShortDSLParser.g:3837:2: ( rule__MoveCraneS__CraneAssignment_1 )
            // InternalShortDSLParser.g:3837:3: rule__MoveCraneS__CraneAssignment_1
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
    // InternalShortDSLParser.g:3845:1: rule__MoveCraneS__Group__2 : rule__MoveCraneS__Group__2__Impl rule__MoveCraneS__Group__3 ;
    public final void rule__MoveCraneS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3849:1: ( rule__MoveCraneS__Group__2__Impl rule__MoveCraneS__Group__3 )
            // InternalShortDSLParser.g:3850:2: rule__MoveCraneS__Group__2__Impl rule__MoveCraneS__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalShortDSLParser.g:3857:1: rule__MoveCraneS__Group__2__Impl : ( ( rule__MoveCraneS__ActionAssignment_2 ) ) ;
    public final void rule__MoveCraneS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3861:1: ( ( ( rule__MoveCraneS__ActionAssignment_2 ) ) )
            // InternalShortDSLParser.g:3862:1: ( ( rule__MoveCraneS__ActionAssignment_2 ) )
            {
            // InternalShortDSLParser.g:3862:1: ( ( rule__MoveCraneS__ActionAssignment_2 ) )
            // InternalShortDSLParser.g:3863:2: ( rule__MoveCraneS__ActionAssignment_2 )
            {
             before(grammarAccess.getMoveCraneSAccess().getActionAssignment_2()); 
            // InternalShortDSLParser.g:3864:2: ( rule__MoveCraneS__ActionAssignment_2 )
            // InternalShortDSLParser.g:3864:3: rule__MoveCraneS__ActionAssignment_2
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
    // InternalShortDSLParser.g:3872:1: rule__MoveCraneS__Group__3 : rule__MoveCraneS__Group__3__Impl rule__MoveCraneS__Group__4 ;
    public final void rule__MoveCraneS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3876:1: ( rule__MoveCraneS__Group__3__Impl rule__MoveCraneS__Group__4 )
            // InternalShortDSLParser.g:3877:2: rule__MoveCraneS__Group__3__Impl rule__MoveCraneS__Group__4
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
    // InternalShortDSLParser.g:3884:1: rule__MoveCraneS__Group__3__Impl : ( ( rule__MoveCraneS__Alternatives_3 ) ) ;
    public final void rule__MoveCraneS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3888:1: ( ( ( rule__MoveCraneS__Alternatives_3 ) ) )
            // InternalShortDSLParser.g:3889:1: ( ( rule__MoveCraneS__Alternatives_3 ) )
            {
            // InternalShortDSLParser.g:3889:1: ( ( rule__MoveCraneS__Alternatives_3 ) )
            // InternalShortDSLParser.g:3890:2: ( rule__MoveCraneS__Alternatives_3 )
            {
             before(grammarAccess.getMoveCraneSAccess().getAlternatives_3()); 
            // InternalShortDSLParser.g:3891:2: ( rule__MoveCraneS__Alternatives_3 )
            // InternalShortDSLParser.g:3891:3: rule__MoveCraneS__Alternatives_3
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
    // InternalShortDSLParser.g:3899:1: rule__MoveCraneS__Group__4 : rule__MoveCraneS__Group__4__Impl ;
    public final void rule__MoveCraneS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3903:1: ( rule__MoveCraneS__Group__4__Impl )
            // InternalShortDSLParser.g:3904:2: rule__MoveCraneS__Group__4__Impl
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
    // InternalShortDSLParser.g:3910:1: rule__MoveCraneS__Group__4__Impl : ( ( rule__MoveCraneS__ZoneAssignment_4 ) ) ;
    public final void rule__MoveCraneS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3914:1: ( ( ( rule__MoveCraneS__ZoneAssignment_4 ) ) )
            // InternalShortDSLParser.g:3915:1: ( ( rule__MoveCraneS__ZoneAssignment_4 ) )
            {
            // InternalShortDSLParser.g:3915:1: ( ( rule__MoveCraneS__ZoneAssignment_4 ) )
            // InternalShortDSLParser.g:3916:2: ( rule__MoveCraneS__ZoneAssignment_4 )
            {
             before(grammarAccess.getMoveCraneSAccess().getZoneAssignment_4()); 
            // InternalShortDSLParser.g:3917:2: ( rule__MoveCraneS__ZoneAssignment_4 )
            // InternalShortDSLParser.g:3917:3: rule__MoveCraneS__ZoneAssignment_4
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
    // InternalShortDSLParser.g:3926:1: rule__CraneActionS__Group__0 : rule__CraneActionS__Group__0__Impl rule__CraneActionS__Group__1 ;
    public final void rule__CraneActionS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3930:1: ( rule__CraneActionS__Group__0__Impl rule__CraneActionS__Group__1 )
            // InternalShortDSLParser.g:3931:2: rule__CraneActionS__Group__0__Impl rule__CraneActionS__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalShortDSLParser.g:3938:1: rule__CraneActionS__Group__0__Impl : ( () ) ;
    public final void rule__CraneActionS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3942:1: ( ( () ) )
            // InternalShortDSLParser.g:3943:1: ( () )
            {
            // InternalShortDSLParser.g:3943:1: ( () )
            // InternalShortDSLParser.g:3944:2: ()
            {
             before(grammarAccess.getCraneActionSAccess().getCraneActionAction_0()); 
            // InternalShortDSLParser.g:3945:2: ()
            // InternalShortDSLParser.g:3945:3: 
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
    // InternalShortDSLParser.g:3953:1: rule__CraneActionS__Group__1 : rule__CraneActionS__Group__1__Impl ;
    public final void rule__CraneActionS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3957:1: ( rule__CraneActionS__Group__1__Impl )
            // InternalShortDSLParser.g:3958:2: rule__CraneActionS__Group__1__Impl
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
    // InternalShortDSLParser.g:3964:1: rule__CraneActionS__Group__1__Impl : ( ( rule__CraneActionS__Alternatives_1 ) ) ;
    public final void rule__CraneActionS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3968:1: ( ( ( rule__CraneActionS__Alternatives_1 ) ) )
            // InternalShortDSLParser.g:3969:1: ( ( rule__CraneActionS__Alternatives_1 ) )
            {
            // InternalShortDSLParser.g:3969:1: ( ( rule__CraneActionS__Alternatives_1 ) )
            // InternalShortDSLParser.g:3970:2: ( rule__CraneActionS__Alternatives_1 )
            {
             before(grammarAccess.getCraneActionSAccess().getAlternatives_1()); 
            // InternalShortDSLParser.g:3971:2: ( rule__CraneActionS__Alternatives_1 )
            // InternalShortDSLParser.g:3971:3: rule__CraneActionS__Alternatives_1
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
    // InternalShortDSLParser.g:3980:1: rule__ConditionVariableS__Group__0 : rule__ConditionVariableS__Group__0__Impl rule__ConditionVariableS__Group__1 ;
    public final void rule__ConditionVariableS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3984:1: ( rule__ConditionVariableS__Group__0__Impl rule__ConditionVariableS__Group__1 )
            // InternalShortDSLParser.g:3985:2: rule__ConditionVariableS__Group__0__Impl rule__ConditionVariableS__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalShortDSLParser.g:3992:1: rule__ConditionVariableS__Group__0__Impl : ( () ) ;
    public final void rule__ConditionVariableS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3996:1: ( ( () ) )
            // InternalShortDSLParser.g:3997:1: ( () )
            {
            // InternalShortDSLParser.g:3997:1: ( () )
            // InternalShortDSLParser.g:3998:2: ()
            {
             before(grammarAccess.getConditionVariableSAccess().getConditionVariableAction_0()); 
            // InternalShortDSLParser.g:3999:2: ()
            // InternalShortDSLParser.g:3999:3: 
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
    // InternalShortDSLParser.g:4007:1: rule__ConditionVariableS__Group__1 : rule__ConditionVariableS__Group__1__Impl rule__ConditionVariableS__Group__2 ;
    public final void rule__ConditionVariableS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4011:1: ( rule__ConditionVariableS__Group__1__Impl rule__ConditionVariableS__Group__2 )
            // InternalShortDSLParser.g:4012:2: rule__ConditionVariableS__Group__1__Impl rule__ConditionVariableS__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalShortDSLParser.g:4019:1: rule__ConditionVariableS__Group__1__Impl : ( If ) ;
    public final void rule__ConditionVariableS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4023:1: ( ( If ) )
            // InternalShortDSLParser.g:4024:1: ( If )
            {
            // InternalShortDSLParser.g:4024:1: ( If )
            // InternalShortDSLParser.g:4025:2: If
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
    // InternalShortDSLParser.g:4034:1: rule__ConditionVariableS__Group__2 : rule__ConditionVariableS__Group__2__Impl rule__ConditionVariableS__Group__3 ;
    public final void rule__ConditionVariableS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4038:1: ( rule__ConditionVariableS__Group__2__Impl rule__ConditionVariableS__Group__3 )
            // InternalShortDSLParser.g:4039:2: rule__ConditionVariableS__Group__2__Impl rule__ConditionVariableS__Group__3
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
    // InternalShortDSLParser.g:4046:1: rule__ConditionVariableS__Group__2__Impl : ( Var ) ;
    public final void rule__ConditionVariableS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4050:1: ( ( Var ) )
            // InternalShortDSLParser.g:4051:1: ( Var )
            {
            // InternalShortDSLParser.g:4051:1: ( Var )
            // InternalShortDSLParser.g:4052:2: Var
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
    // InternalShortDSLParser.g:4061:1: rule__ConditionVariableS__Group__3 : rule__ConditionVariableS__Group__3__Impl rule__ConditionVariableS__Group__4 ;
    public final void rule__ConditionVariableS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4065:1: ( rule__ConditionVariableS__Group__3__Impl rule__ConditionVariableS__Group__4 )
            // InternalShortDSLParser.g:4066:2: rule__ConditionVariableS__Group__3__Impl rule__ConditionVariableS__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalShortDSLParser.g:4073:1: rule__ConditionVariableS__Group__3__Impl : ( ( rule__ConditionVariableS__VariableAssignment_3 ) ) ;
    public final void rule__ConditionVariableS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4077:1: ( ( ( rule__ConditionVariableS__VariableAssignment_3 ) ) )
            // InternalShortDSLParser.g:4078:1: ( ( rule__ConditionVariableS__VariableAssignment_3 ) )
            {
            // InternalShortDSLParser.g:4078:1: ( ( rule__ConditionVariableS__VariableAssignment_3 ) )
            // InternalShortDSLParser.g:4079:2: ( rule__ConditionVariableS__VariableAssignment_3 )
            {
             before(grammarAccess.getConditionVariableSAccess().getVariableAssignment_3()); 
            // InternalShortDSLParser.g:4080:2: ( rule__ConditionVariableS__VariableAssignment_3 )
            // InternalShortDSLParser.g:4080:3: rule__ConditionVariableS__VariableAssignment_3
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
    // InternalShortDSLParser.g:4088:1: rule__ConditionVariableS__Group__4 : rule__ConditionVariableS__Group__4__Impl rule__ConditionVariableS__Group__5 ;
    public final void rule__ConditionVariableS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4092:1: ( rule__ConditionVariableS__Group__4__Impl rule__ConditionVariableS__Group__5 )
            // InternalShortDSLParser.g:4093:2: rule__ConditionVariableS__Group__4__Impl rule__ConditionVariableS__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalShortDSLParser.g:4100:1: rule__ConditionVariableS__Group__4__Impl : ( ( rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4 ) ) ;
    public final void rule__ConditionVariableS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4104:1: ( ( ( rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4 ) ) )
            // InternalShortDSLParser.g:4105:1: ( ( rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4 ) )
            {
            // InternalShortDSLParser.g:4105:1: ( ( rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4 ) )
            // InternalShortDSLParser.g:4106:2: ( rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4 )
            {
             before(grammarAccess.getConditionVariableSAccess().getComparisonOperatorVariableAssignment_4()); 
            // InternalShortDSLParser.g:4107:2: ( rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4 )
            // InternalShortDSLParser.g:4107:3: rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4
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
    // InternalShortDSLParser.g:4115:1: rule__ConditionVariableS__Group__5 : rule__ConditionVariableS__Group__5__Impl rule__ConditionVariableS__Group__6 ;
    public final void rule__ConditionVariableS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4119:1: ( rule__ConditionVariableS__Group__5__Impl rule__ConditionVariableS__Group__6 )
            // InternalShortDSLParser.g:4120:2: rule__ConditionVariableS__Group__5__Impl rule__ConditionVariableS__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalShortDSLParser.g:4127:1: rule__ConditionVariableS__Group__5__Impl : ( ( rule__ConditionVariableS__VariableValueAssignment_5 ) ) ;
    public final void rule__ConditionVariableS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4131:1: ( ( ( rule__ConditionVariableS__VariableValueAssignment_5 ) ) )
            // InternalShortDSLParser.g:4132:1: ( ( rule__ConditionVariableS__VariableValueAssignment_5 ) )
            {
            // InternalShortDSLParser.g:4132:1: ( ( rule__ConditionVariableS__VariableValueAssignment_5 ) )
            // InternalShortDSLParser.g:4133:2: ( rule__ConditionVariableS__VariableValueAssignment_5 )
            {
             before(grammarAccess.getConditionVariableSAccess().getVariableValueAssignment_5()); 
            // InternalShortDSLParser.g:4134:2: ( rule__ConditionVariableS__VariableValueAssignment_5 )
            // InternalShortDSLParser.g:4134:3: rule__ConditionVariableS__VariableValueAssignment_5
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
    // InternalShortDSLParser.g:4142:1: rule__ConditionVariableS__Group__6 : rule__ConditionVariableS__Group__6__Impl rule__ConditionVariableS__Group__7 ;
    public final void rule__ConditionVariableS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4146:1: ( rule__ConditionVariableS__Group__6__Impl rule__ConditionVariableS__Group__7 )
            // InternalShortDSLParser.g:4147:2: rule__ConditionVariableS__Group__6__Impl rule__ConditionVariableS__Group__7
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
    // InternalShortDSLParser.g:4154:1: rule__ConditionVariableS__Group__6__Impl : ( Colon ) ;
    public final void rule__ConditionVariableS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4158:1: ( ( Colon ) )
            // InternalShortDSLParser.g:4159:1: ( Colon )
            {
            // InternalShortDSLParser.g:4159:1: ( Colon )
            // InternalShortDSLParser.g:4160:2: Colon
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
    // InternalShortDSLParser.g:4169:1: rule__ConditionVariableS__Group__7 : rule__ConditionVariableS__Group__7__Impl rule__ConditionVariableS__Group__8 ;
    public final void rule__ConditionVariableS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4173:1: ( rule__ConditionVariableS__Group__7__Impl rule__ConditionVariableS__Group__8 )
            // InternalShortDSLParser.g:4174:2: rule__ConditionVariableS__Group__7__Impl rule__ConditionVariableS__Group__8
            {
            pushFollow(FOLLOW_29);
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
    // InternalShortDSLParser.g:4181:1: rule__ConditionVariableS__Group__7__Impl : ( RULE_BEGIN ) ;
    public final void rule__ConditionVariableS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4185:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:4186:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:4186:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:4187:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:4196:1: rule__ConditionVariableS__Group__8 : rule__ConditionVariableS__Group__8__Impl rule__ConditionVariableS__Group__9 ;
    public final void rule__ConditionVariableS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4200:1: ( rule__ConditionVariableS__Group__8__Impl rule__ConditionVariableS__Group__9 )
            // InternalShortDSLParser.g:4201:2: rule__ConditionVariableS__Group__8__Impl rule__ConditionVariableS__Group__9
            {
            pushFollow(FOLLOW_29);
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
    // InternalShortDSLParser.g:4208:1: rule__ConditionVariableS__Group__8__Impl : ( ( rule__ConditionVariableS__StatementsAssignment_8 )* ) ;
    public final void rule__ConditionVariableS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4212:1: ( ( ( rule__ConditionVariableS__StatementsAssignment_8 )* ) )
            // InternalShortDSLParser.g:4213:1: ( ( rule__ConditionVariableS__StatementsAssignment_8 )* )
            {
            // InternalShortDSLParser.g:4213:1: ( ( rule__ConditionVariableS__StatementsAssignment_8 )* )
            // InternalShortDSLParser.g:4214:2: ( rule__ConditionVariableS__StatementsAssignment_8 )*
            {
             before(grammarAccess.getConditionVariableSAccess().getStatementsAssignment_8()); 
            // InternalShortDSLParser.g:4215:2: ( rule__ConditionVariableS__StatementsAssignment_8 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=In_progress && LA33_0<=Complete)||LA33_0==Foreach||LA33_0==Pickup||(LA33_0>=Drop && LA33_0<=Free)||LA33_0==If||LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalShortDSLParser.g:4215:3: rule__ConditionVariableS__StatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__ConditionVariableS__StatementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalShortDSLParser.g:4223:1: rule__ConditionVariableS__Group__9 : rule__ConditionVariableS__Group__9__Impl ;
    public final void rule__ConditionVariableS__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4227:1: ( rule__ConditionVariableS__Group__9__Impl )
            // InternalShortDSLParser.g:4228:2: rule__ConditionVariableS__Group__9__Impl
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
    // InternalShortDSLParser.g:4234:1: rule__ConditionVariableS__Group__9__Impl : ( RULE_END ) ;
    public final void rule__ConditionVariableS__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4238:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:4239:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:4239:1: ( RULE_END )
            // InternalShortDSLParser.g:4240:2: RULE_END
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
    // InternalShortDSLParser.g:4250:1: rule__ConditionDeviceS__Group__0 : rule__ConditionDeviceS__Group__0__Impl rule__ConditionDeviceS__Group__1 ;
    public final void rule__ConditionDeviceS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4254:1: ( rule__ConditionDeviceS__Group__0__Impl rule__ConditionDeviceS__Group__1 )
            // InternalShortDSLParser.g:4255:2: rule__ConditionDeviceS__Group__0__Impl rule__ConditionDeviceS__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalShortDSLParser.g:4262:1: rule__ConditionDeviceS__Group__0__Impl : ( () ) ;
    public final void rule__ConditionDeviceS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4266:1: ( ( () ) )
            // InternalShortDSLParser.g:4267:1: ( () )
            {
            // InternalShortDSLParser.g:4267:1: ( () )
            // InternalShortDSLParser.g:4268:2: ()
            {
             before(grammarAccess.getConditionDeviceSAccess().getConditionDeviceAction_0()); 
            // InternalShortDSLParser.g:4269:2: ()
            // InternalShortDSLParser.g:4269:3: 
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
    // InternalShortDSLParser.g:4277:1: rule__ConditionDeviceS__Group__1 : rule__ConditionDeviceS__Group__1__Impl rule__ConditionDeviceS__Group__2 ;
    public final void rule__ConditionDeviceS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4281:1: ( rule__ConditionDeviceS__Group__1__Impl rule__ConditionDeviceS__Group__2 )
            // InternalShortDSLParser.g:4282:2: rule__ConditionDeviceS__Group__1__Impl rule__ConditionDeviceS__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalShortDSLParser.g:4289:1: rule__ConditionDeviceS__Group__1__Impl : ( If ) ;
    public final void rule__ConditionDeviceS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4293:1: ( ( If ) )
            // InternalShortDSLParser.g:4294:1: ( If )
            {
            // InternalShortDSLParser.g:4294:1: ( If )
            // InternalShortDSLParser.g:4295:2: If
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
    // InternalShortDSLParser.g:4304:1: rule__ConditionDeviceS__Group__2 : rule__ConditionDeviceS__Group__2__Impl rule__ConditionDeviceS__Group__3 ;
    public final void rule__ConditionDeviceS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4308:1: ( rule__ConditionDeviceS__Group__2__Impl rule__ConditionDeviceS__Group__3 )
            // InternalShortDSLParser.g:4309:2: rule__ConditionDeviceS__Group__2__Impl rule__ConditionDeviceS__Group__3
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
    // InternalShortDSLParser.g:4316:1: rule__ConditionDeviceS__Group__2__Impl : ( Dev ) ;
    public final void rule__ConditionDeviceS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4320:1: ( ( Dev ) )
            // InternalShortDSLParser.g:4321:1: ( Dev )
            {
            // InternalShortDSLParser.g:4321:1: ( Dev )
            // InternalShortDSLParser.g:4322:2: Dev
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
    // InternalShortDSLParser.g:4331:1: rule__ConditionDeviceS__Group__3 : rule__ConditionDeviceS__Group__3__Impl rule__ConditionDeviceS__Group__4 ;
    public final void rule__ConditionDeviceS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4335:1: ( rule__ConditionDeviceS__Group__3__Impl rule__ConditionDeviceS__Group__4 )
            // InternalShortDSLParser.g:4336:2: rule__ConditionDeviceS__Group__3__Impl rule__ConditionDeviceS__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalShortDSLParser.g:4343:1: rule__ConditionDeviceS__Group__3__Impl : ( ( rule__ConditionDeviceS__DeviceAssignment_3 ) ) ;
    public final void rule__ConditionDeviceS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4347:1: ( ( ( rule__ConditionDeviceS__DeviceAssignment_3 ) ) )
            // InternalShortDSLParser.g:4348:1: ( ( rule__ConditionDeviceS__DeviceAssignment_3 ) )
            {
            // InternalShortDSLParser.g:4348:1: ( ( rule__ConditionDeviceS__DeviceAssignment_3 ) )
            // InternalShortDSLParser.g:4349:2: ( rule__ConditionDeviceS__DeviceAssignment_3 )
            {
             before(grammarAccess.getConditionDeviceSAccess().getDeviceAssignment_3()); 
            // InternalShortDSLParser.g:4350:2: ( rule__ConditionDeviceS__DeviceAssignment_3 )
            // InternalShortDSLParser.g:4350:3: rule__ConditionDeviceS__DeviceAssignment_3
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
    // InternalShortDSLParser.g:4358:1: rule__ConditionDeviceS__Group__4 : rule__ConditionDeviceS__Group__4__Impl rule__ConditionDeviceS__Group__5 ;
    public final void rule__ConditionDeviceS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4362:1: ( rule__ConditionDeviceS__Group__4__Impl rule__ConditionDeviceS__Group__5 )
            // InternalShortDSLParser.g:4363:2: rule__ConditionDeviceS__Group__4__Impl rule__ConditionDeviceS__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalShortDSLParser.g:4370:1: rule__ConditionDeviceS__Group__4__Impl : ( ( rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4 ) ) ;
    public final void rule__ConditionDeviceS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4374:1: ( ( ( rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4 ) ) )
            // InternalShortDSLParser.g:4375:1: ( ( rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4 ) )
            {
            // InternalShortDSLParser.g:4375:1: ( ( rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4 ) )
            // InternalShortDSLParser.g:4376:2: ( rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4 )
            {
             before(grammarAccess.getConditionDeviceSAccess().getComparisonOperatorDeviceAssignment_4()); 
            // InternalShortDSLParser.g:4377:2: ( rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4 )
            // InternalShortDSLParser.g:4377:3: rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4
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
    // InternalShortDSLParser.g:4385:1: rule__ConditionDeviceS__Group__5 : rule__ConditionDeviceS__Group__5__Impl rule__ConditionDeviceS__Group__6 ;
    public final void rule__ConditionDeviceS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4389:1: ( rule__ConditionDeviceS__Group__5__Impl rule__ConditionDeviceS__Group__6 )
            // InternalShortDSLParser.g:4390:2: rule__ConditionDeviceS__Group__5__Impl rule__ConditionDeviceS__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalShortDSLParser.g:4397:1: rule__ConditionDeviceS__Group__5__Impl : ( ( rule__ConditionDeviceS__DeviceValueAssignment_5 ) ) ;
    public final void rule__ConditionDeviceS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4401:1: ( ( ( rule__ConditionDeviceS__DeviceValueAssignment_5 ) ) )
            // InternalShortDSLParser.g:4402:1: ( ( rule__ConditionDeviceS__DeviceValueAssignment_5 ) )
            {
            // InternalShortDSLParser.g:4402:1: ( ( rule__ConditionDeviceS__DeviceValueAssignment_5 ) )
            // InternalShortDSLParser.g:4403:2: ( rule__ConditionDeviceS__DeviceValueAssignment_5 )
            {
             before(grammarAccess.getConditionDeviceSAccess().getDeviceValueAssignment_5()); 
            // InternalShortDSLParser.g:4404:2: ( rule__ConditionDeviceS__DeviceValueAssignment_5 )
            // InternalShortDSLParser.g:4404:3: rule__ConditionDeviceS__DeviceValueAssignment_5
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
    // InternalShortDSLParser.g:4412:1: rule__ConditionDeviceS__Group__6 : rule__ConditionDeviceS__Group__6__Impl rule__ConditionDeviceS__Group__7 ;
    public final void rule__ConditionDeviceS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4416:1: ( rule__ConditionDeviceS__Group__6__Impl rule__ConditionDeviceS__Group__7 )
            // InternalShortDSLParser.g:4417:2: rule__ConditionDeviceS__Group__6__Impl rule__ConditionDeviceS__Group__7
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
    // InternalShortDSLParser.g:4424:1: rule__ConditionDeviceS__Group__6__Impl : ( Colon ) ;
    public final void rule__ConditionDeviceS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4428:1: ( ( Colon ) )
            // InternalShortDSLParser.g:4429:1: ( Colon )
            {
            // InternalShortDSLParser.g:4429:1: ( Colon )
            // InternalShortDSLParser.g:4430:2: Colon
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
    // InternalShortDSLParser.g:4439:1: rule__ConditionDeviceS__Group__7 : rule__ConditionDeviceS__Group__7__Impl rule__ConditionDeviceS__Group__8 ;
    public final void rule__ConditionDeviceS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4443:1: ( rule__ConditionDeviceS__Group__7__Impl rule__ConditionDeviceS__Group__8 )
            // InternalShortDSLParser.g:4444:2: rule__ConditionDeviceS__Group__7__Impl rule__ConditionDeviceS__Group__8
            {
            pushFollow(FOLLOW_29);
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
    // InternalShortDSLParser.g:4451:1: rule__ConditionDeviceS__Group__7__Impl : ( RULE_BEGIN ) ;
    public final void rule__ConditionDeviceS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4455:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:4456:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:4456:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:4457:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:4466:1: rule__ConditionDeviceS__Group__8 : rule__ConditionDeviceS__Group__8__Impl rule__ConditionDeviceS__Group__9 ;
    public final void rule__ConditionDeviceS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4470:1: ( rule__ConditionDeviceS__Group__8__Impl rule__ConditionDeviceS__Group__9 )
            // InternalShortDSLParser.g:4471:2: rule__ConditionDeviceS__Group__8__Impl rule__ConditionDeviceS__Group__9
            {
            pushFollow(FOLLOW_29);
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
    // InternalShortDSLParser.g:4478:1: rule__ConditionDeviceS__Group__8__Impl : ( ( rule__ConditionDeviceS__StatementsAssignment_8 )* ) ;
    public final void rule__ConditionDeviceS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4482:1: ( ( ( rule__ConditionDeviceS__StatementsAssignment_8 )* ) )
            // InternalShortDSLParser.g:4483:1: ( ( rule__ConditionDeviceS__StatementsAssignment_8 )* )
            {
            // InternalShortDSLParser.g:4483:1: ( ( rule__ConditionDeviceS__StatementsAssignment_8 )* )
            // InternalShortDSLParser.g:4484:2: ( rule__ConditionDeviceS__StatementsAssignment_8 )*
            {
             before(grammarAccess.getConditionDeviceSAccess().getStatementsAssignment_8()); 
            // InternalShortDSLParser.g:4485:2: ( rule__ConditionDeviceS__StatementsAssignment_8 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=In_progress && LA34_0<=Complete)||LA34_0==Foreach||LA34_0==Pickup||(LA34_0>=Drop && LA34_0<=Free)||LA34_0==If||LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalShortDSLParser.g:4485:3: rule__ConditionDeviceS__StatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__ConditionDeviceS__StatementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalShortDSLParser.g:4493:1: rule__ConditionDeviceS__Group__9 : rule__ConditionDeviceS__Group__9__Impl ;
    public final void rule__ConditionDeviceS__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4497:1: ( rule__ConditionDeviceS__Group__9__Impl )
            // InternalShortDSLParser.g:4498:2: rule__ConditionDeviceS__Group__9__Impl
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
    // InternalShortDSLParser.g:4504:1: rule__ConditionDeviceS__Group__9__Impl : ( RULE_END ) ;
    public final void rule__ConditionDeviceS__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4508:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:4509:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:4509:1: ( RULE_END )
            // InternalShortDSLParser.g:4510:2: RULE_END
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
    // InternalShortDSLParser.g:4520:1: rule__MarkVariableValueS__Group__0 : rule__MarkVariableValueS__Group__0__Impl rule__MarkVariableValueS__Group__1 ;
    public final void rule__MarkVariableValueS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4524:1: ( rule__MarkVariableValueS__Group__0__Impl rule__MarkVariableValueS__Group__1 )
            // InternalShortDSLParser.g:4525:2: rule__MarkVariableValueS__Group__0__Impl rule__MarkVariableValueS__Group__1
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
    // InternalShortDSLParser.g:4532:1: rule__MarkVariableValueS__Group__0__Impl : ( () ) ;
    public final void rule__MarkVariableValueS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4536:1: ( ( () ) )
            // InternalShortDSLParser.g:4537:1: ( () )
            {
            // InternalShortDSLParser.g:4537:1: ( () )
            // InternalShortDSLParser.g:4538:2: ()
            {
             before(grammarAccess.getMarkVariableValueSAccess().getMarkVariableValueAction_0()); 
            // InternalShortDSLParser.g:4539:2: ()
            // InternalShortDSLParser.g:4539:3: 
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
    // InternalShortDSLParser.g:4547:1: rule__MarkVariableValueS__Group__1 : rule__MarkVariableValueS__Group__1__Impl rule__MarkVariableValueS__Group__2 ;
    public final void rule__MarkVariableValueS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4551:1: ( rule__MarkVariableValueS__Group__1__Impl rule__MarkVariableValueS__Group__2 )
            // InternalShortDSLParser.g:4552:2: rule__MarkVariableValueS__Group__1__Impl rule__MarkVariableValueS__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalShortDSLParser.g:4559:1: rule__MarkVariableValueS__Group__1__Impl : ( ( rule__MarkVariableValueS__VariableAssignment_1 ) ) ;
    public final void rule__MarkVariableValueS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4563:1: ( ( ( rule__MarkVariableValueS__VariableAssignment_1 ) ) )
            // InternalShortDSLParser.g:4564:1: ( ( rule__MarkVariableValueS__VariableAssignment_1 ) )
            {
            // InternalShortDSLParser.g:4564:1: ( ( rule__MarkVariableValueS__VariableAssignment_1 ) )
            // InternalShortDSLParser.g:4565:2: ( rule__MarkVariableValueS__VariableAssignment_1 )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getVariableAssignment_1()); 
            // InternalShortDSLParser.g:4566:2: ( rule__MarkVariableValueS__VariableAssignment_1 )
            // InternalShortDSLParser.g:4566:3: rule__MarkVariableValueS__VariableAssignment_1
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
    // InternalShortDSLParser.g:4574:1: rule__MarkVariableValueS__Group__2 : rule__MarkVariableValueS__Group__2__Impl rule__MarkVariableValueS__Group__3 ;
    public final void rule__MarkVariableValueS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4578:1: ( rule__MarkVariableValueS__Group__2__Impl rule__MarkVariableValueS__Group__3 )
            // InternalShortDSLParser.g:4579:2: rule__MarkVariableValueS__Group__2__Impl rule__MarkVariableValueS__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalShortDSLParser.g:4586:1: rule__MarkVariableValueS__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__MarkVariableValueS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4590:1: ( ( LeftParenthesis ) )
            // InternalShortDSLParser.g:4591:1: ( LeftParenthesis )
            {
            // InternalShortDSLParser.g:4591:1: ( LeftParenthesis )
            // InternalShortDSLParser.g:4592:2: LeftParenthesis
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
    // InternalShortDSLParser.g:4601:1: rule__MarkVariableValueS__Group__3 : rule__MarkVariableValueS__Group__3__Impl rule__MarkVariableValueS__Group__4 ;
    public final void rule__MarkVariableValueS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4605:1: ( rule__MarkVariableValueS__Group__3__Impl rule__MarkVariableValueS__Group__4 )
            // InternalShortDSLParser.g:4606:2: rule__MarkVariableValueS__Group__3__Impl rule__MarkVariableValueS__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalShortDSLParser.g:4613:1: rule__MarkVariableValueS__Group__3__Impl : ( ( rule__MarkVariableValueS__ValueAssignment_3 ) ) ;
    public final void rule__MarkVariableValueS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4617:1: ( ( ( rule__MarkVariableValueS__ValueAssignment_3 ) ) )
            // InternalShortDSLParser.g:4618:1: ( ( rule__MarkVariableValueS__ValueAssignment_3 ) )
            {
            // InternalShortDSLParser.g:4618:1: ( ( rule__MarkVariableValueS__ValueAssignment_3 ) )
            // InternalShortDSLParser.g:4619:2: ( rule__MarkVariableValueS__ValueAssignment_3 )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getValueAssignment_3()); 
            // InternalShortDSLParser.g:4620:2: ( rule__MarkVariableValueS__ValueAssignment_3 )
            // InternalShortDSLParser.g:4620:3: rule__MarkVariableValueS__ValueAssignment_3
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
    // InternalShortDSLParser.g:4628:1: rule__MarkVariableValueS__Group__4 : rule__MarkVariableValueS__Group__4__Impl rule__MarkVariableValueS__Group__5 ;
    public final void rule__MarkVariableValueS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4632:1: ( rule__MarkVariableValueS__Group__4__Impl rule__MarkVariableValueS__Group__5 )
            // InternalShortDSLParser.g:4633:2: rule__MarkVariableValueS__Group__4__Impl rule__MarkVariableValueS__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalShortDSLParser.g:4640:1: rule__MarkVariableValueS__Group__4__Impl : ( ( rule__MarkVariableValueS__Group_4__0 )? ) ;
    public final void rule__MarkVariableValueS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4644:1: ( ( ( rule__MarkVariableValueS__Group_4__0 )? ) )
            // InternalShortDSLParser.g:4645:1: ( ( rule__MarkVariableValueS__Group_4__0 )? )
            {
            // InternalShortDSLParser.g:4645:1: ( ( rule__MarkVariableValueS__Group_4__0 )? )
            // InternalShortDSLParser.g:4646:2: ( rule__MarkVariableValueS__Group_4__0 )?
            {
             before(grammarAccess.getMarkVariableValueSAccess().getGroup_4()); 
            // InternalShortDSLParser.g:4647:2: ( rule__MarkVariableValueS__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Comma) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalShortDSLParser.g:4647:3: rule__MarkVariableValueS__Group_4__0
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
    // InternalShortDSLParser.g:4655:1: rule__MarkVariableValueS__Group__5 : rule__MarkVariableValueS__Group__5__Impl ;
    public final void rule__MarkVariableValueS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4659:1: ( rule__MarkVariableValueS__Group__5__Impl )
            // InternalShortDSLParser.g:4660:2: rule__MarkVariableValueS__Group__5__Impl
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
    // InternalShortDSLParser.g:4666:1: rule__MarkVariableValueS__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__MarkVariableValueS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4670:1: ( ( RightParenthesis ) )
            // InternalShortDSLParser.g:4671:1: ( RightParenthesis )
            {
            // InternalShortDSLParser.g:4671:1: ( RightParenthesis )
            // InternalShortDSLParser.g:4672:2: RightParenthesis
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
    // InternalShortDSLParser.g:4682:1: rule__MarkVariableValueS__Group_4__0 : rule__MarkVariableValueS__Group_4__0__Impl rule__MarkVariableValueS__Group_4__1 ;
    public final void rule__MarkVariableValueS__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4686:1: ( rule__MarkVariableValueS__Group_4__0__Impl rule__MarkVariableValueS__Group_4__1 )
            // InternalShortDSLParser.g:4687:2: rule__MarkVariableValueS__Group_4__0__Impl rule__MarkVariableValueS__Group_4__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalShortDSLParser.g:4694:1: rule__MarkVariableValueS__Group_4__0__Impl : ( Comma ) ;
    public final void rule__MarkVariableValueS__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4698:1: ( ( Comma ) )
            // InternalShortDSLParser.g:4699:1: ( Comma )
            {
            // InternalShortDSLParser.g:4699:1: ( Comma )
            // InternalShortDSLParser.g:4700:2: Comma
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
    // InternalShortDSLParser.g:4709:1: rule__MarkVariableValueS__Group_4__1 : rule__MarkVariableValueS__Group_4__1__Impl rule__MarkVariableValueS__Group_4__2 ;
    public final void rule__MarkVariableValueS__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4713:1: ( rule__MarkVariableValueS__Group_4__1__Impl rule__MarkVariableValueS__Group_4__2 )
            // InternalShortDSLParser.g:4714:2: rule__MarkVariableValueS__Group_4__1__Impl rule__MarkVariableValueS__Group_4__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalShortDSLParser.g:4721:1: rule__MarkVariableValueS__Group_4__1__Impl : ( ( rule__MarkVariableValueS__TimeAssignment_4_1 ) ) ;
    public final void rule__MarkVariableValueS__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4725:1: ( ( ( rule__MarkVariableValueS__TimeAssignment_4_1 ) ) )
            // InternalShortDSLParser.g:4726:1: ( ( rule__MarkVariableValueS__TimeAssignment_4_1 ) )
            {
            // InternalShortDSLParser.g:4726:1: ( ( rule__MarkVariableValueS__TimeAssignment_4_1 ) )
            // InternalShortDSLParser.g:4727:2: ( rule__MarkVariableValueS__TimeAssignment_4_1 )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getTimeAssignment_4_1()); 
            // InternalShortDSLParser.g:4728:2: ( rule__MarkVariableValueS__TimeAssignment_4_1 )
            // InternalShortDSLParser.g:4728:3: rule__MarkVariableValueS__TimeAssignment_4_1
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
    // InternalShortDSLParser.g:4736:1: rule__MarkVariableValueS__Group_4__2 : rule__MarkVariableValueS__Group_4__2__Impl ;
    public final void rule__MarkVariableValueS__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4740:1: ( rule__MarkVariableValueS__Group_4__2__Impl )
            // InternalShortDSLParser.g:4741:2: rule__MarkVariableValueS__Group_4__2__Impl
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
    // InternalShortDSLParser.g:4747:1: rule__MarkVariableValueS__Group_4__2__Impl : ( ( rule__MarkVariableValueS__UnitAssignment_4_2 ) ) ;
    public final void rule__MarkVariableValueS__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4751:1: ( ( ( rule__MarkVariableValueS__UnitAssignment_4_2 ) ) )
            // InternalShortDSLParser.g:4752:1: ( ( rule__MarkVariableValueS__UnitAssignment_4_2 ) )
            {
            // InternalShortDSLParser.g:4752:1: ( ( rule__MarkVariableValueS__UnitAssignment_4_2 ) )
            // InternalShortDSLParser.g:4753:2: ( rule__MarkVariableValueS__UnitAssignment_4_2 )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getUnitAssignment_4_2()); 
            // InternalShortDSLParser.g:4754:2: ( rule__MarkVariableValueS__UnitAssignment_4_2 )
            // InternalShortDSLParser.g:4754:3: rule__MarkVariableValueS__UnitAssignment_4_2
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
    // InternalShortDSLParser.g:4763:1: rule__MarkCameraValueS__Group__0 : rule__MarkCameraValueS__Group__0__Impl rule__MarkCameraValueS__Group__1 ;
    public final void rule__MarkCameraValueS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4767:1: ( rule__MarkCameraValueS__Group__0__Impl rule__MarkCameraValueS__Group__1 )
            // InternalShortDSLParser.g:4768:2: rule__MarkCameraValueS__Group__0__Impl rule__MarkCameraValueS__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalShortDSLParser.g:4775:1: rule__MarkCameraValueS__Group__0__Impl : ( () ) ;
    public final void rule__MarkCameraValueS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4779:1: ( ( () ) )
            // InternalShortDSLParser.g:4780:1: ( () )
            {
            // InternalShortDSLParser.g:4780:1: ( () )
            // InternalShortDSLParser.g:4781:2: ()
            {
             before(grammarAccess.getMarkCameraValueSAccess().getMarkCameraValueAction_0()); 
            // InternalShortDSLParser.g:4782:2: ()
            // InternalShortDSLParser.g:4782:3: 
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
    // InternalShortDSLParser.g:4790:1: rule__MarkCameraValueS__Group__1 : rule__MarkCameraValueS__Group__1__Impl rule__MarkCameraValueS__Group__2 ;
    public final void rule__MarkCameraValueS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4794:1: ( rule__MarkCameraValueS__Group__1__Impl rule__MarkCameraValueS__Group__2 )
            // InternalShortDSLParser.g:4795:2: rule__MarkCameraValueS__Group__1__Impl rule__MarkCameraValueS__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalShortDSLParser.g:4802:1: rule__MarkCameraValueS__Group__1__Impl : ( ( rule__MarkCameraValueS__CameraAssignment_1 ) ) ;
    public final void rule__MarkCameraValueS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4806:1: ( ( ( rule__MarkCameraValueS__CameraAssignment_1 ) ) )
            // InternalShortDSLParser.g:4807:1: ( ( rule__MarkCameraValueS__CameraAssignment_1 ) )
            {
            // InternalShortDSLParser.g:4807:1: ( ( rule__MarkCameraValueS__CameraAssignment_1 ) )
            // InternalShortDSLParser.g:4808:2: ( rule__MarkCameraValueS__CameraAssignment_1 )
            {
             before(grammarAccess.getMarkCameraValueSAccess().getCameraAssignment_1()); 
            // InternalShortDSLParser.g:4809:2: ( rule__MarkCameraValueS__CameraAssignment_1 )
            // InternalShortDSLParser.g:4809:3: rule__MarkCameraValueS__CameraAssignment_1
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
    // InternalShortDSLParser.g:4817:1: rule__MarkCameraValueS__Group__2 : rule__MarkCameraValueS__Group__2__Impl rule__MarkCameraValueS__Group__3 ;
    public final void rule__MarkCameraValueS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4821:1: ( rule__MarkCameraValueS__Group__2__Impl rule__MarkCameraValueS__Group__3 )
            // InternalShortDSLParser.g:4822:2: rule__MarkCameraValueS__Group__2__Impl rule__MarkCameraValueS__Group__3
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
    // InternalShortDSLParser.g:4829:1: rule__MarkCameraValueS__Group__2__Impl : ( Scan ) ;
    public final void rule__MarkCameraValueS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4833:1: ( ( Scan ) )
            // InternalShortDSLParser.g:4834:1: ( Scan )
            {
            // InternalShortDSLParser.g:4834:1: ( Scan )
            // InternalShortDSLParser.g:4835:2: Scan
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
    // InternalShortDSLParser.g:4844:1: rule__MarkCameraValueS__Group__3 : rule__MarkCameraValueS__Group__3__Impl ;
    public final void rule__MarkCameraValueS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4848:1: ( rule__MarkCameraValueS__Group__3__Impl )
            // InternalShortDSLParser.g:4849:2: rule__MarkCameraValueS__Group__3__Impl
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
    // InternalShortDSLParser.g:4855:1: rule__MarkCameraValueS__Group__3__Impl : ( ( rule__MarkCameraValueS__VariableAssignment_3 ) ) ;
    public final void rule__MarkCameraValueS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4859:1: ( ( ( rule__MarkCameraValueS__VariableAssignment_3 ) ) )
            // InternalShortDSLParser.g:4860:1: ( ( rule__MarkCameraValueS__VariableAssignment_3 ) )
            {
            // InternalShortDSLParser.g:4860:1: ( ( rule__MarkCameraValueS__VariableAssignment_3 ) )
            // InternalShortDSLParser.g:4861:2: ( rule__MarkCameraValueS__VariableAssignment_3 )
            {
             before(grammarAccess.getMarkCameraValueSAccess().getVariableAssignment_3()); 
            // InternalShortDSLParser.g:4862:2: ( rule__MarkCameraValueS__VariableAssignment_3 )
            // InternalShortDSLParser.g:4862:3: rule__MarkCameraValueS__VariableAssignment_3
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
    // InternalShortDSLParser.g:4871:1: rule__LocalVariableS__Group__0 : rule__LocalVariableS__Group__0__Impl rule__LocalVariableS__Group__1 ;
    public final void rule__LocalVariableS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4875:1: ( rule__LocalVariableS__Group__0__Impl rule__LocalVariableS__Group__1 )
            // InternalShortDSLParser.g:4876:2: rule__LocalVariableS__Group__0__Impl rule__LocalVariableS__Group__1
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
    // InternalShortDSLParser.g:4883:1: rule__LocalVariableS__Group__0__Impl : ( () ) ;
    public final void rule__LocalVariableS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4887:1: ( ( () ) )
            // InternalShortDSLParser.g:4888:1: ( () )
            {
            // InternalShortDSLParser.g:4888:1: ( () )
            // InternalShortDSLParser.g:4889:2: ()
            {
             before(grammarAccess.getLocalVariableSAccess().getLocalVariableAction_0()); 
            // InternalShortDSLParser.g:4890:2: ()
            // InternalShortDSLParser.g:4890:3: 
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
    // InternalShortDSLParser.g:4898:1: rule__LocalVariableS__Group__1 : rule__LocalVariableS__Group__1__Impl ;
    public final void rule__LocalVariableS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4902:1: ( rule__LocalVariableS__Group__1__Impl )
            // InternalShortDSLParser.g:4903:2: rule__LocalVariableS__Group__1__Impl
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
    // InternalShortDSLParser.g:4909:1: rule__LocalVariableS__Group__1__Impl : ( ( rule__LocalVariableS__NameAssignment_1 ) ) ;
    public final void rule__LocalVariableS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4913:1: ( ( ( rule__LocalVariableS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:4914:1: ( ( rule__LocalVariableS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:4914:1: ( ( rule__LocalVariableS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:4915:2: ( rule__LocalVariableS__NameAssignment_1 )
            {
             before(grammarAccess.getLocalVariableSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:4916:2: ( rule__LocalVariableS__NameAssignment_1 )
            // InternalShortDSLParser.g:4916:3: rule__LocalVariableS__NameAssignment_1
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
    // InternalShortDSLParser.g:4925:1: rule__GlobalVariableS__Group__0 : rule__GlobalVariableS__Group__0__Impl rule__GlobalVariableS__Group__1 ;
    public final void rule__GlobalVariableS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4929:1: ( rule__GlobalVariableS__Group__0__Impl rule__GlobalVariableS__Group__1 )
            // InternalShortDSLParser.g:4930:2: rule__GlobalVariableS__Group__0__Impl rule__GlobalVariableS__Group__1
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
    // InternalShortDSLParser.g:4937:1: rule__GlobalVariableS__Group__0__Impl : ( () ) ;
    public final void rule__GlobalVariableS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4941:1: ( ( () ) )
            // InternalShortDSLParser.g:4942:1: ( () )
            {
            // InternalShortDSLParser.g:4942:1: ( () )
            // InternalShortDSLParser.g:4943:2: ()
            {
             before(grammarAccess.getGlobalVariableSAccess().getGlobalVariableAction_0()); 
            // InternalShortDSLParser.g:4944:2: ()
            // InternalShortDSLParser.g:4944:3: 
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
    // InternalShortDSLParser.g:4952:1: rule__GlobalVariableS__Group__1 : rule__GlobalVariableS__Group__1__Impl ;
    public final void rule__GlobalVariableS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4956:1: ( rule__GlobalVariableS__Group__1__Impl )
            // InternalShortDSLParser.g:4957:2: rule__GlobalVariableS__Group__1__Impl
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
    // InternalShortDSLParser.g:4963:1: rule__GlobalVariableS__Group__1__Impl : ( ( rule__GlobalVariableS__NameAssignment_1 ) ) ;
    public final void rule__GlobalVariableS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4967:1: ( ( ( rule__GlobalVariableS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:4968:1: ( ( rule__GlobalVariableS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:4968:1: ( ( rule__GlobalVariableS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:4969:2: ( rule__GlobalVariableS__NameAssignment_1 )
            {
             before(grammarAccess.getGlobalVariableSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:4970:2: ( rule__GlobalVariableS__NameAssignment_1 )
            // InternalShortDSLParser.g:4970:3: rule__GlobalVariableS__NameAssignment_1
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


    // $ANTLR start "rule__Model__DslTypeAssignment_1"
    // InternalShortDSLParser.g:4979:1: rule__Model__DslTypeAssignment_1 : ( ruleDSLTypeValue ) ;
    public final void rule__Model__DslTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4983:1: ( ( ruleDSLTypeValue ) )
            // InternalShortDSLParser.g:4984:2: ( ruleDSLTypeValue )
            {
            // InternalShortDSLParser.g:4984:2: ( ruleDSLTypeValue )
            // InternalShortDSLParser.g:4985:3: ruleDSLTypeValue
            {
             before(grammarAccess.getModelAccess().getDslTypeDSLTypeValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDSLTypeValue();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDslTypeDSLTypeValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DslTypeAssignment_1"


    // $ANTLR start "rule__Model__DslProgramAssignment_3"
    // InternalShortDSLParser.g:4994:1: rule__Model__DslProgramAssignment_3 : ( ruleDSLProgram ) ;
    public final void rule__Model__DslProgramAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4998:1: ( ( ruleDSLProgram ) )
            // InternalShortDSLParser.g:4999:2: ( ruleDSLProgram )
            {
            // InternalShortDSLParser.g:4999:2: ( ruleDSLProgram )
            // InternalShortDSLParser.g:5000:3: ruleDSLProgram
            {
             before(grammarAccess.getModelAccess().getDslProgramDSLProgramParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDSLProgram();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDslProgramDSLProgramParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DslProgramAssignment_3"


    // $ANTLR start "rule__DSLLong__NameAssignment_2"
    // InternalShortDSLParser.g:5009:1: rule__DSLLong__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DSLLong__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5013:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5014:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5014:2: ( RULE_ID )
            // InternalShortDSLParser.g:5015:3: RULE_ID
            {
             before(grammarAccess.getDSLLongAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLLongAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLLong__NameAssignment_2"


    // $ANTLR start "rule__DSLShort__ConfigurationAssignment_1"
    // InternalShortDSLParser.g:5024:1: rule__DSLShort__ConfigurationAssignment_1 : ( ruleConfigurationS ) ;
    public final void rule__DSLShort__ConfigurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5028:1: ( ( ruleConfigurationS ) )
            // InternalShortDSLParser.g:5029:2: ( ruleConfigurationS )
            {
            // InternalShortDSLParser.g:5029:2: ( ruleConfigurationS )
            // InternalShortDSLParser.g:5030:3: ruleConfigurationS
            {
             before(grammarAccess.getDSLShortAccess().getConfigurationConfigurationSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigurationS();

            state._fsp--;

             after(grammarAccess.getDSLShortAccess().getConfigurationConfigurationSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLShort__ConfigurationAssignment_1"


    // $ANTLR start "rule__DSLShort__DiskHandlingsAssignment_2"
    // InternalShortDSLParser.g:5039:1: rule__DSLShort__DiskHandlingsAssignment_2 : ( ruleDiskHandlingS ) ;
    public final void rule__DSLShort__DiskHandlingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5043:1: ( ( ruleDiskHandlingS ) )
            // InternalShortDSLParser.g:5044:2: ( ruleDiskHandlingS )
            {
            // InternalShortDSLParser.g:5044:2: ( ruleDiskHandlingS )
            // InternalShortDSLParser.g:5045:3: ruleDiskHandlingS
            {
             before(grammarAccess.getDSLShortAccess().getDiskHandlingsDiskHandlingSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskHandlingS();

            state._fsp--;

             after(grammarAccess.getDSLShortAccess().getDiskHandlingsDiskHandlingSParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLShort__DiskHandlingsAssignment_2"


    // $ANTLR start "rule__ConfigurationS__DevicesAssignment_3"
    // InternalShortDSLParser.g:5054:1: rule__ConfigurationS__DevicesAssignment_3 : ( ruleDeviceS ) ;
    public final void rule__ConfigurationS__DevicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5058:1: ( ( ruleDeviceS ) )
            // InternalShortDSLParser.g:5059:2: ( ruleDeviceS )
            {
            // InternalShortDSLParser.g:5059:2: ( ruleDeviceS )
            // InternalShortDSLParser.g:5060:3: ruleDeviceS
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
    // InternalShortDSLParser.g:5069:1: rule__CraneS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CraneS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5073:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5074:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5074:2: ( RULE_ID )
            // InternalShortDSLParser.g:5075:3: RULE_ID
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


    // $ANTLR start "rule__CraneS__LoggingAssignment_2"
    // InternalShortDSLParser.g:5084:1: rule__CraneS__LoggingAssignment_2 : ( ruleLoggingS ) ;
    public final void rule__CraneS__LoggingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5088:1: ( ( ruleLoggingS ) )
            // InternalShortDSLParser.g:5089:2: ( ruleLoggingS )
            {
            // InternalShortDSLParser.g:5089:2: ( ruleLoggingS )
            // InternalShortDSLParser.g:5090:3: ruleLoggingS
            {
             before(grammarAccess.getCraneSAccess().getLoggingLoggingSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLoggingS();

            state._fsp--;

             after(grammarAccess.getCraneSAccess().getLoggingLoggingSParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CraneS__LoggingAssignment_2"


    // $ANTLR start "rule__CraneS__TargetsAssignment_5"
    // InternalShortDSLParser.g:5099:1: rule__CraneS__TargetsAssignment_5 : ( ruleCraneZoneS ) ;
    public final void rule__CraneS__TargetsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5103:1: ( ( ruleCraneZoneS ) )
            // InternalShortDSLParser.g:5104:2: ( ruleCraneZoneS )
            {
            // InternalShortDSLParser.g:5104:2: ( ruleCraneZoneS )
            // InternalShortDSLParser.g:5105:3: ruleCraneZoneS
            {
             before(grammarAccess.getCraneSAccess().getTargetsCraneZoneSParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCraneZoneS();

            state._fsp--;

             after(grammarAccess.getCraneSAccess().getTargetsCraneZoneSParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CraneS__TargetsAssignment_5"


    // $ANTLR start "rule__CraneZoneS__NameAssignment_1"
    // InternalShortDSLParser.g:5114:1: rule__CraneZoneS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CraneZoneS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5118:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5119:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5119:2: ( RULE_ID )
            // InternalShortDSLParser.g:5120:3: RULE_ID
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
    // InternalShortDSLParser.g:5129:1: rule__CraneZoneS__ZoneValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__CraneZoneS__ZoneValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5133:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:5134:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:5134:2: ( RULE_INT )
            // InternalShortDSLParser.g:5135:3: RULE_INT
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
    // InternalShortDSLParser.g:5144:1: rule__DiskS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DiskS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5148:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5149:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5149:2: ( RULE_ID )
            // InternalShortDSLParser.g:5150:3: RULE_ID
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
    // InternalShortDSLParser.g:5159:1: rule__DiskS__NSlotsAssignment_3 : ( RULE_INT ) ;
    public final void rule__DiskS__NSlotsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5163:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:5164:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:5164:2: ( RULE_INT )
            // InternalShortDSLParser.g:5165:3: RULE_INT
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


    // $ANTLR start "rule__DiskS__LoggingAssignment_5"
    // InternalShortDSLParser.g:5174:1: rule__DiskS__LoggingAssignment_5 : ( ruleLoggingS ) ;
    public final void rule__DiskS__LoggingAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5178:1: ( ( ruleLoggingS ) )
            // InternalShortDSLParser.g:5179:2: ( ruleLoggingS )
            {
            // InternalShortDSLParser.g:5179:2: ( ruleLoggingS )
            // InternalShortDSLParser.g:5180:3: ruleLoggingS
            {
             before(grammarAccess.getDiskSAccess().getLoggingLoggingSParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLoggingS();

            state._fsp--;

             after(grammarAccess.getDiskSAccess().getLoggingLoggingSParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskS__LoggingAssignment_5"


    // $ANTLR start "rule__DiskS__TargetsAssignment_8"
    // InternalShortDSLParser.g:5189:1: rule__DiskS__TargetsAssignment_8 : ( ruleDiskZoneS ) ;
    public final void rule__DiskS__TargetsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5193:1: ( ( ruleDiskZoneS ) )
            // InternalShortDSLParser.g:5194:2: ( ruleDiskZoneS )
            {
            // InternalShortDSLParser.g:5194:2: ( ruleDiskZoneS )
            // InternalShortDSLParser.g:5195:3: ruleDiskZoneS
            {
             before(grammarAccess.getDiskSAccess().getTargetsDiskZoneSParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskZoneS();

            state._fsp--;

             after(grammarAccess.getDiskSAccess().getTargetsDiskZoneSParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskS__TargetsAssignment_8"


    // $ANTLR start "rule__DiskZoneS__NameAssignment_1"
    // InternalShortDSLParser.g:5204:1: rule__DiskZoneS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DiskZoneS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5208:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5209:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5209:2: ( RULE_ID )
            // InternalShortDSLParser.g:5210:3: RULE_ID
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
    // InternalShortDSLParser.g:5219:1: rule__DiskZoneS__SlotAssignment_3 : ( RULE_INT ) ;
    public final void rule__DiskZoneS__SlotAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5223:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:5224:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:5224:2: ( RULE_INT )
            // InternalShortDSLParser.g:5225:3: RULE_INT
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
    // InternalShortDSLParser.g:5234:1: rule__CameraS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CameraS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5238:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5239:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5239:2: ( RULE_ID )
            // InternalShortDSLParser.g:5240:3: RULE_ID
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


    // $ANTLR start "rule__CameraS__LoggingAssignment_2"
    // InternalShortDSLParser.g:5249:1: rule__CameraS__LoggingAssignment_2 : ( ruleLoggingS ) ;
    public final void rule__CameraS__LoggingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5253:1: ( ( ruleLoggingS ) )
            // InternalShortDSLParser.g:5254:2: ( ruleLoggingS )
            {
            // InternalShortDSLParser.g:5254:2: ( ruleLoggingS )
            // InternalShortDSLParser.g:5255:3: ruleLoggingS
            {
             before(grammarAccess.getCameraSAccess().getLoggingLoggingSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLoggingS();

            state._fsp--;

             after(grammarAccess.getCameraSAccess().getLoggingLoggingSParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraS__LoggingAssignment_2"


    // $ANTLR start "rule__CameraS__TargetsAssignment_5"
    // InternalShortDSLParser.g:5264:1: rule__CameraS__TargetsAssignment_5 : ( ruleCameraColorS ) ;
    public final void rule__CameraS__TargetsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5268:1: ( ( ruleCameraColorS ) )
            // InternalShortDSLParser.g:5269:2: ( ruleCameraColorS )
            {
            // InternalShortDSLParser.g:5269:2: ( ruleCameraColorS )
            // InternalShortDSLParser.g:5270:3: ruleCameraColorS
            {
             before(grammarAccess.getCameraSAccess().getTargetsCameraColorSParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCameraColorS();

            state._fsp--;

             after(grammarAccess.getCameraSAccess().getTargetsCameraColorSParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraS__TargetsAssignment_5"


    // $ANTLR start "rule__CameraColorS__ColorAssignment_1"
    // InternalShortDSLParser.g:5279:1: rule__CameraColorS__ColorAssignment_1 : ( ruleCOLOR_S ) ;
    public final void rule__CameraColorS__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5283:1: ( ( ruleCOLOR_S ) )
            // InternalShortDSLParser.g:5284:2: ( ruleCOLOR_S )
            {
            // InternalShortDSLParser.g:5284:2: ( ruleCOLOR_S )
            // InternalShortDSLParser.g:5285:3: ruleCOLOR_S
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
    // InternalShortDSLParser.g:5294:1: rule__DiskHandlingS__DiskAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DiskHandlingS__DiskAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5298:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5299:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5299:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5300:3: ( RULE_ID )
            {
             before(grammarAccess.getDiskHandlingSAccess().getDiskDiskCrossReference_1_0()); 
            // InternalShortDSLParser.g:5301:3: ( RULE_ID )
            // InternalShortDSLParser.g:5302:4: RULE_ID
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
    // InternalShortDSLParser.g:5313:1: rule__DiskHandlingS__StatementsAssignment_4 : ( ruleStatementS ) ;
    public final void rule__DiskHandlingS__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5317:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:5318:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:5318:2: ( ruleStatementS )
            // InternalShortDSLParser.g:5319:3: ruleStatementS
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
    // InternalShortDSLParser.g:5328:1: rule__LoopS__VariableAssignment_2 : ( ruleLocalVariableS ) ;
    public final void rule__LoopS__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5332:1: ( ( ruleLocalVariableS ) )
            // InternalShortDSLParser.g:5333:2: ( ruleLocalVariableS )
            {
            // InternalShortDSLParser.g:5333:2: ( ruleLocalVariableS )
            // InternalShortDSLParser.g:5334:3: ruleLocalVariableS
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
    // InternalShortDSLParser.g:5343:1: rule__LoopS__ComparisonOperatorAssignment_3 : ( ruleCOMPARISON_OPERATOR_S ) ;
    public final void rule__LoopS__ComparisonOperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5347:1: ( ( ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:5348:2: ( ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:5348:2: ( ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:5349:3: ruleCOMPARISON_OPERATOR_S
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
    // InternalShortDSLParser.g:5358:1: rule__LoopS__SlotStateAssignment_4 : ( ruleDiskSlotStateValueS ) ;
    public final void rule__LoopS__SlotStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5362:1: ( ( ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:5363:2: ( ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:5363:2: ( ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:5364:3: ruleDiskSlotStateValueS
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
    // InternalShortDSLParser.g:5373:1: rule__LoopS__StatementsAssignment_7 : ( ruleStatementS ) ;
    public final void rule__LoopS__StatementsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5377:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:5378:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:5378:2: ( ruleStatementS )
            // InternalShortDSLParser.g:5379:3: ruleStatementS
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
    // InternalShortDSLParser.g:5388:1: rule__MoveDiskS__SlotAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MoveDiskS__SlotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5392:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5393:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5393:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5394:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveDiskSAccess().getSlotLocalVariableCrossReference_1_0()); 
            // InternalShortDSLParser.g:5395:3: ( RULE_ID )
            // InternalShortDSLParser.g:5396:4: RULE_ID
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
    // InternalShortDSLParser.g:5407:1: rule__MoveDiskS__ZoneAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MoveDiskS__ZoneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5411:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5412:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5412:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5413:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveDiskSAccess().getZoneDiskZoneCrossReference_3_0()); 
            // InternalShortDSLParser.g:5414:3: ( RULE_ID )
            // InternalShortDSLParser.g:5415:4: RULE_ID
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
    // InternalShortDSLParser.g:5426:1: rule__MoveAnySlotS__StateAssignment_1 : ( ruleDiskSlotStateValueS ) ;
    public final void rule__MoveAnySlotS__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5430:1: ( ( ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:5431:2: ( ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:5431:2: ( ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:5432:3: ruleDiskSlotStateValueS
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
    // InternalShortDSLParser.g:5441:1: rule__MoveAnySlotS__AnySlotAssignment_2 : ( ruleLocalVariableS ) ;
    public final void rule__MoveAnySlotS__AnySlotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5445:1: ( ( ruleLocalVariableS ) )
            // InternalShortDSLParser.g:5446:2: ( ruleLocalVariableS )
            {
            // InternalShortDSLParser.g:5446:2: ( ruleLocalVariableS )
            // InternalShortDSLParser.g:5447:3: ruleLocalVariableS
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
    // InternalShortDSLParser.g:5456:1: rule__MoveAnySlotS__ZoneAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__MoveAnySlotS__ZoneAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5460:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5461:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5461:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5462:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getZoneDiskZoneCrossReference_4_0()); 
            // InternalShortDSLParser.g:5463:3: ( RULE_ID )
            // InternalShortDSLParser.g:5464:4: RULE_ID
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
    // InternalShortDSLParser.g:5475:1: rule__MoveCraneS__CraneAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MoveCraneS__CraneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5479:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5480:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5480:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5481:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveCraneSAccess().getCraneCraneCrossReference_1_0()); 
            // InternalShortDSLParser.g:5482:3: ( RULE_ID )
            // InternalShortDSLParser.g:5483:4: RULE_ID
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
    // InternalShortDSLParser.g:5494:1: rule__MoveCraneS__ActionAssignment_2 : ( ruleCraneActionS ) ;
    public final void rule__MoveCraneS__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5498:1: ( ( ruleCraneActionS ) )
            // InternalShortDSLParser.g:5499:2: ( ruleCraneActionS )
            {
            // InternalShortDSLParser.g:5499:2: ( ruleCraneActionS )
            // InternalShortDSLParser.g:5500:3: ruleCraneActionS
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
    // InternalShortDSLParser.g:5509:1: rule__MoveCraneS__ZoneAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__MoveCraneS__ZoneAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5513:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5514:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5514:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5515:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveCraneSAccess().getZoneCraneZoneCrossReference_4_0()); 
            // InternalShortDSLParser.g:5516:3: ( RULE_ID )
            // InternalShortDSLParser.g:5517:4: RULE_ID
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
    // InternalShortDSLParser.g:5528:1: rule__ConditionVariableS__VariableAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionVariableS__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5532:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5533:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5533:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5534:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionVariableSAccess().getVariableVariableSCrossReference_3_0()); 
            // InternalShortDSLParser.g:5535:3: ( RULE_ID )
            // InternalShortDSLParser.g:5536:4: RULE_ID
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
    // InternalShortDSLParser.g:5547:1: rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4 : ( ruleCOMPARISON_OPERATOR_S ) ;
    public final void rule__ConditionVariableS__ComparisonOperatorVariableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5551:1: ( ( ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:5552:2: ( ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:5552:2: ( ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:5553:3: ruleCOMPARISON_OPERATOR_S
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
    // InternalShortDSLParser.g:5562:1: rule__ConditionVariableS__VariableValueAssignment_5 : ( ruleVariableValueS ) ;
    public final void rule__ConditionVariableS__VariableValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5566:1: ( ( ruleVariableValueS ) )
            // InternalShortDSLParser.g:5567:2: ( ruleVariableValueS )
            {
            // InternalShortDSLParser.g:5567:2: ( ruleVariableValueS )
            // InternalShortDSLParser.g:5568:3: ruleVariableValueS
            {
             before(grammarAccess.getConditionVariableSAccess().getVariableValueVariableValueSParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableValueS();

            state._fsp--;

             after(grammarAccess.getConditionVariableSAccess().getVariableValueVariableValueSParserRuleCall_5_0()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:5577:1: rule__ConditionVariableS__StatementsAssignment_8 : ( ruleStatementS ) ;
    public final void rule__ConditionVariableS__StatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5581:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:5582:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:5582:2: ( ruleStatementS )
            // InternalShortDSLParser.g:5583:3: ruleStatementS
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
    // InternalShortDSLParser.g:5592:1: rule__ConditionDeviceS__DeviceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionDeviceS__DeviceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5596:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5597:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5597:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5598:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionDeviceSAccess().getDeviceDeviceSCrossReference_3_0()); 
            // InternalShortDSLParser.g:5599:3: ( RULE_ID )
            // InternalShortDSLParser.g:5600:4: RULE_ID
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
    // InternalShortDSLParser.g:5611:1: rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4 : ( ruleCOMPARISON_OPERATOR_S ) ;
    public final void rule__ConditionDeviceS__ComparisonOperatorDeviceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5615:1: ( ( ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:5616:2: ( ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:5616:2: ( ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:5617:3: ruleCOMPARISON_OPERATOR_S
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
    // InternalShortDSLParser.g:5626:1: rule__ConditionDeviceS__DeviceValueAssignment_5 : ( ruleDeviceValueS ) ;
    public final void rule__ConditionDeviceS__DeviceValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5630:1: ( ( ruleDeviceValueS ) )
            // InternalShortDSLParser.g:5631:2: ( ruleDeviceValueS )
            {
            // InternalShortDSLParser.g:5631:2: ( ruleDeviceValueS )
            // InternalShortDSLParser.g:5632:3: ruleDeviceValueS
            {
             before(grammarAccess.getConditionDeviceSAccess().getDeviceValueDeviceValueSParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceValueS();

            state._fsp--;

             after(grammarAccess.getConditionDeviceSAccess().getDeviceValueDeviceValueSParserRuleCall_5_0()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:5641:1: rule__ConditionDeviceS__StatementsAssignment_8 : ( ruleStatementS ) ;
    public final void rule__ConditionDeviceS__StatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5645:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:5646:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:5646:2: ( ruleStatementS )
            // InternalShortDSLParser.g:5647:3: ruleStatementS
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
    // InternalShortDSLParser.g:5656:1: rule__MarkVariableValueS__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MarkVariableValueS__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5660:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5661:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5661:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5662:3: ( RULE_ID )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getVariableVariableSCrossReference_1_0()); 
            // InternalShortDSLParser.g:5663:3: ( RULE_ID )
            // InternalShortDSLParser.g:5664:4: RULE_ID
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
    // InternalShortDSLParser.g:5675:1: rule__MarkVariableValueS__ValueAssignment_3 : ( ruleValueSlotS ) ;
    public final void rule__MarkVariableValueS__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5679:1: ( ( ruleValueSlotS ) )
            // InternalShortDSLParser.g:5680:2: ( ruleValueSlotS )
            {
            // InternalShortDSLParser.g:5680:2: ( ruleValueSlotS )
            // InternalShortDSLParser.g:5681:3: ruleValueSlotS
            {
             before(grammarAccess.getMarkVariableValueSAccess().getValueValueSlotSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValueSlotS();

            state._fsp--;

             after(grammarAccess.getMarkVariableValueSAccess().getValueValueSlotSParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:5690:1: rule__MarkVariableValueS__TimeAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__MarkVariableValueS__TimeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5694:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:5695:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:5695:2: ( RULE_INT )
            // InternalShortDSLParser.g:5696:3: RULE_INT
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
    // InternalShortDSLParser.g:5705:1: rule__MarkVariableValueS__UnitAssignment_4_2 : ( ruleTIME_UNIT_S ) ;
    public final void rule__MarkVariableValueS__UnitAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5709:1: ( ( ruleTIME_UNIT_S ) )
            // InternalShortDSLParser.g:5710:2: ( ruleTIME_UNIT_S )
            {
            // InternalShortDSLParser.g:5710:2: ( ruleTIME_UNIT_S )
            // InternalShortDSLParser.g:5711:3: ruleTIME_UNIT_S
            {
             before(grammarAccess.getMarkVariableValueSAccess().getUnitTIME_UNIT_SEnumRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTIME_UNIT_S();

            state._fsp--;

             after(grammarAccess.getMarkVariableValueSAccess().getUnitTIME_UNIT_SEnumRuleCall_4_2_0()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:5720:1: rule__MarkCameraValueS__CameraAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MarkCameraValueS__CameraAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5724:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5725:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5725:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5726:3: ( RULE_ID )
            {
             before(grammarAccess.getMarkCameraValueSAccess().getCameraCameraCrossReference_1_0()); 
            // InternalShortDSLParser.g:5727:3: ( RULE_ID )
            // InternalShortDSLParser.g:5728:4: RULE_ID
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
    // InternalShortDSLParser.g:5739:1: rule__MarkCameraValueS__VariableAssignment_3 : ( ruleLocalVariableS ) ;
    public final void rule__MarkCameraValueS__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5743:1: ( ( ruleLocalVariableS ) )
            // InternalShortDSLParser.g:5744:2: ( ruleLocalVariableS )
            {
            // InternalShortDSLParser.g:5744:2: ( ruleLocalVariableS )
            // InternalShortDSLParser.g:5745:3: ruleLocalVariableS
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
    // InternalShortDSLParser.g:5754:1: rule__LocalVariableS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LocalVariableS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5758:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5759:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5759:2: ( RULE_ID )
            // InternalShortDSLParser.g:5760:3: RULE_ID
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
    // InternalShortDSLParser.g:5769:1: rule__GlobalVariableS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GlobalVariableS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5773:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5774:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5774:2: ( RULE_ID )
            // InternalShortDSLParser.g:5775:3: RULE_ID
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


    // $ANTLR start "rule__VariableValueS__ValueAssignment_0"
    // InternalShortDSLParser.g:5784:1: rule__VariableValueS__ValueAssignment_0 : ( ruleDiskSlotStateValueS ) ;
    public final void rule__VariableValueS__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5788:1: ( ( ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:5789:2: ( ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:5789:2: ( ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:5790:3: ruleDiskSlotStateValueS
            {
             before(grammarAccess.getVariableValueSAccess().getValueDiskSlotStateValueSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskSlotStateValueS();

            state._fsp--;

             after(grammarAccess.getVariableValueSAccess().getValueDiskSlotStateValueSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValueS__ValueAssignment_0"


    // $ANTLR start "rule__VariableValueS__ValueAssignment_1"
    // InternalShortDSLParser.g:5799:1: rule__VariableValueS__ValueAssignment_1 : ( ruleColorValueS ) ;
    public final void rule__VariableValueS__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5803:1: ( ( ruleColorValueS ) )
            // InternalShortDSLParser.g:5804:2: ( ruleColorValueS )
            {
            // InternalShortDSLParser.g:5804:2: ( ruleColorValueS )
            // InternalShortDSLParser.g:5805:3: ruleColorValueS
            {
             before(grammarAccess.getVariableValueSAccess().getValueColorValueSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColorValueS();

            state._fsp--;

             after(grammarAccess.getVariableValueSAccess().getValueColorValueSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValueS__ValueAssignment_1"


    // $ANTLR start "rule__VariableValueS__ValueAssignment_2"
    // InternalShortDSLParser.g:5814:1: rule__VariableValueS__ValueAssignment_2 : ( ruleNumberS ) ;
    public final void rule__VariableValueS__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5818:1: ( ( ruleNumberS ) )
            // InternalShortDSLParser.g:5819:2: ( ruleNumberS )
            {
            // InternalShortDSLParser.g:5819:2: ( ruleNumberS )
            // InternalShortDSLParser.g:5820:3: ruleNumberS
            {
             before(grammarAccess.getVariableValueSAccess().getValueNumberSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberS();

            state._fsp--;

             after(grammarAccess.getVariableValueSAccess().getValueNumberSParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValueS__ValueAssignment_2"


    // $ANTLR start "rule__VariableValueS__ValueAssignment_3"
    // InternalShortDSLParser.g:5829:1: rule__VariableValueS__ValueAssignment_3 : ( ruleDiskStateValueS ) ;
    public final void rule__VariableValueS__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5833:1: ( ( ruleDiskStateValueS ) )
            // InternalShortDSLParser.g:5834:2: ( ruleDiskStateValueS )
            {
            // InternalShortDSLParser.g:5834:2: ( ruleDiskStateValueS )
            // InternalShortDSLParser.g:5835:3: ruleDiskStateValueS
            {
             before(grammarAccess.getVariableValueSAccess().getValueDiskStateValueSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskStateValueS();

            state._fsp--;

             after(grammarAccess.getVariableValueSAccess().getValueDiskStateValueSParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValueS__ValueAssignment_3"


    // $ANTLR start "rule__VariableValueS__RefAssignment_4"
    // InternalShortDSLParser.g:5844:1: rule__VariableValueS__RefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__VariableValueS__RefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5848:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5849:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5849:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5850:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableValueSAccess().getRefVariableSCrossReference_4_0()); 
            // InternalShortDSLParser.g:5851:3: ( RULE_ID )
            // InternalShortDSLParser.g:5852:4: RULE_ID
            {
             before(grammarAccess.getVariableValueSAccess().getRefVariableSIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableValueSAccess().getRefVariableSIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getVariableValueSAccess().getRefVariableSCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValueS__RefAssignment_4"


    // $ANTLR start "rule__DeviceValueS__ValueAssignment_0"
    // InternalShortDSLParser.g:5863:1: rule__DeviceValueS__ValueAssignment_0 : ( ruleDiskStateValueS ) ;
    public final void rule__DeviceValueS__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5867:1: ( ( ruleDiskStateValueS ) )
            // InternalShortDSLParser.g:5868:2: ( ruleDiskStateValueS )
            {
            // InternalShortDSLParser.g:5868:2: ( ruleDiskStateValueS )
            // InternalShortDSLParser.g:5869:3: ruleDiskStateValueS
            {
             before(grammarAccess.getDeviceValueSAccess().getValueDiskStateValueSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskStateValueS();

            state._fsp--;

             after(grammarAccess.getDeviceValueSAccess().getValueDiskStateValueSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceValueS__ValueAssignment_0"


    // $ANTLR start "rule__DeviceValueS__ValueAssignment_1"
    // InternalShortDSLParser.g:5878:1: rule__DeviceValueS__ValueAssignment_1 : ( ruleColorValueS ) ;
    public final void rule__DeviceValueS__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5882:1: ( ( ruleColorValueS ) )
            // InternalShortDSLParser.g:5883:2: ( ruleColorValueS )
            {
            // InternalShortDSLParser.g:5883:2: ( ruleColorValueS )
            // InternalShortDSLParser.g:5884:3: ruleColorValueS
            {
             before(grammarAccess.getDeviceValueSAccess().getValueColorValueSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColorValueS();

            state._fsp--;

             after(grammarAccess.getDeviceValueSAccess().getValueColorValueSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceValueS__ValueAssignment_1"


    // $ANTLR start "rule__DeviceValueS__ConfigurationValueAssignment_2"
    // InternalShortDSLParser.g:5893:1: rule__DeviceValueS__ConfigurationValueAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DeviceValueS__ConfigurationValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5897:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5898:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5898:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5899:3: ( RULE_ID )
            {
             before(grammarAccess.getDeviceValueSAccess().getConfigurationValueConfigurationValueSCrossReference_2_0()); 
            // InternalShortDSLParser.g:5900:3: ( RULE_ID )
            // InternalShortDSLParser.g:5901:4: RULE_ID
            {
             before(grammarAccess.getDeviceValueSAccess().getConfigurationValueConfigurationValueSIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceValueSAccess().getConfigurationValueConfigurationValueSIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDeviceValueSAccess().getConfigurationValueConfigurationValueSCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceValueS__ConfigurationValueAssignment_2"


    // $ANTLR start "rule__ValueSlotS__ValueAssignment_0"
    // InternalShortDSLParser.g:5912:1: rule__ValueSlotS__ValueAssignment_0 : ( ruleDiskSlotStateValueS ) ;
    public final void rule__ValueSlotS__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5916:1: ( ( ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:5917:2: ( ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:5917:2: ( ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:5918:3: ruleDiskSlotStateValueS
            {
             before(grammarAccess.getValueSlotSAccess().getValueDiskSlotStateValueSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskSlotStateValueS();

            state._fsp--;

             after(grammarAccess.getValueSlotSAccess().getValueDiskSlotStateValueSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSlotS__ValueAssignment_0"


    // $ANTLR start "rule__ValueSlotS__ValueAssignment_1"
    // InternalShortDSLParser.g:5927:1: rule__ValueSlotS__ValueAssignment_1 : ( ruleColorValueS ) ;
    public final void rule__ValueSlotS__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5931:1: ( ( ruleColorValueS ) )
            // InternalShortDSLParser.g:5932:2: ( ruleColorValueS )
            {
            // InternalShortDSLParser.g:5932:2: ( ruleColorValueS )
            // InternalShortDSLParser.g:5933:3: ruleColorValueS
            {
             before(grammarAccess.getValueSlotSAccess().getValueColorValueSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColorValueS();

            state._fsp--;

             after(grammarAccess.getValueSlotSAccess().getValueColorValueSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSlotS__ValueAssignment_1"


    // $ANTLR start "rule__DSLTypeValue__ValueAssignment"
    // InternalShortDSLParser.g:5942:1: rule__DSLTypeValue__ValueAssignment : ( ruleDSL_TYPE_ENUM ) ;
    public final void rule__DSLTypeValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5946:1: ( ( ruleDSL_TYPE_ENUM ) )
            // InternalShortDSLParser.g:5947:2: ( ruleDSL_TYPE_ENUM )
            {
            // InternalShortDSLParser.g:5947:2: ( ruleDSL_TYPE_ENUM )
            // InternalShortDSLParser.g:5948:3: ruleDSL_TYPE_ENUM
            {
             before(grammarAccess.getDSLTypeValueAccess().getValueDSL_TYPE_ENUMEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDSL_TYPE_ENUM();

            state._fsp--;

             after(grammarAccess.getDSLTypeValueAccess().getValueDSL_TYPE_ENUMEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLTypeValue__ValueAssignment"


    // $ANTLR start "rule__DiskStateValueS__ValueAssignment"
    // InternalShortDSLParser.g:5957:1: rule__DiskStateValueS__ValueAssignment : ( ruleDISK_STATES_S ) ;
    public final void rule__DiskStateValueS__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5961:1: ( ( ruleDISK_STATES_S ) )
            // InternalShortDSLParser.g:5962:2: ( ruleDISK_STATES_S )
            {
            // InternalShortDSLParser.g:5962:2: ( ruleDISK_STATES_S )
            // InternalShortDSLParser.g:5963:3: ruleDISK_STATES_S
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
    // InternalShortDSLParser.g:5972:1: rule__DiskSlotStateValueS__ValueAssignment : ( ruleDISK_SLOT_STATES_S ) ;
    public final void rule__DiskSlotStateValueS__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5976:1: ( ( ruleDISK_SLOT_STATES_S ) )
            // InternalShortDSLParser.g:5977:2: ( ruleDISK_SLOT_STATES_S )
            {
            // InternalShortDSLParser.g:5977:2: ( ruleDISK_SLOT_STATES_S )
            // InternalShortDSLParser.g:5978:3: ruleDISK_SLOT_STATES_S
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
    // InternalShortDSLParser.g:5987:1: rule__ColorValueS__ValueAssignment : ( ruleCOLOR_S ) ;
    public final void rule__ColorValueS__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5991:1: ( ( ruleCOLOR_S ) )
            // InternalShortDSLParser.g:5992:2: ( ruleCOLOR_S )
            {
            // InternalShortDSLParser.g:5992:2: ( ruleCOLOR_S )
            // InternalShortDSLParser.g:5993:3: ruleCOLOR_S
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
    // InternalShortDSLParser.g:6002:1: rule__NumberS__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberS__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6006:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:6007:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:6007:2: ( RULE_INT )
            // InternalShortDSLParser.g:6008:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001005000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001005002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00001000200184B0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00001000200184B2L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001C08000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00001800200184B0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000010030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000300001035830L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100001025800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000001015030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000080000L});

}