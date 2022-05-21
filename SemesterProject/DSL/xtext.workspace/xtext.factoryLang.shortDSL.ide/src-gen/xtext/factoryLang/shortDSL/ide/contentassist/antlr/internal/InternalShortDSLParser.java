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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "In_progress", "Complete", "Devices", "Foreach", "Logging", "Handle", "Pickup", "Empty", "Green", "Short", "Blue", "Drop", "Free", "Full", "Long", "Scan", "Slot", "Test", "HyphenMinusHyphenMinusGreaterThanSign", "Dev", "Dsl", "Red", "Use", "Var", "ExclamationMarkEqualsSign", "HyphenMinusGreaterThanSign", "If", "LeftParenthesis", "RightParenthesis", "Comma", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "H", "M", "S", "LeftCurlyBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_BEGIN=43;
    public static final int Var=27;
    public static final int Devices=6;
    public static final int Full=17;
    public static final int LessThanSign=35;
    public static final int LeftParenthesis=31;
    public static final int Test=21;
    public static final int In_progress=4;
    public static final int Dsl=24;
    public static final int Short=13;
    public static final int Logging=8;
    public static final int GreaterThanSign=37;
    public static final int RULE_ID=45;
    public static final int RightParenthesis=32;
    public static final int Free=16;
    public static final int Handle=9;
    public static final int Drop=15;
    public static final int RULE_INT=46;
    public static final int Long=18;
    public static final int RULE_ML_COMMENT=48;
    public static final int Slot=20;
    public static final int Scan=19;
    public static final int If=30;
    public static final int RULE_END=44;
    public static final int Complete=5;
    public static final int H=38;
    public static final int RULE_STRING=47;
    public static final int M=39;
    public static final int RULE_SL_COMMENT=49;
    public static final int Comma=33;
    public static final int EqualsSign=36;
    public static final int Empty=11;
    public static final int S=40;
    public static final int Colon=34;
    public static final int RightCurlyBracket=42;
    public static final int EOF=-1;
    public static final int Pickup=10;
    public static final int Blue=14;
    public static final int RULE_WS=50;
    public static final int Use=26;
    public static final int LeftCurlyBracket=41;
    public static final int RULE_ANY_OTHER=51;
    public static final int Red=25;
    public static final int Dev=23;
    public static final int HyphenMinusHyphenMinusGreaterThanSign=22;
    public static final int Foreach=7;
    public static final int ExclamationMarkEqualsSign=28;
    public static final int HyphenMinusGreaterThanSign=29;
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
    		tokenNameToValue.put("Slot", "'slot'");
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
    // InternalShortDSLParser.g:94:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:95:1: ( ruleModel EOF )
            // InternalShortDSLParser.g:96:1: ruleModel EOF
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
    // InternalShortDSLParser.g:103:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:107:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalShortDSLParser.g:108:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalShortDSLParser.g:108:2: ( ( rule__Model__Group__0 ) )
            // InternalShortDSLParser.g:109:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalShortDSLParser.g:110:3: ( rule__Model__Group__0 )
            // InternalShortDSLParser.g:110:4: rule__Model__Group__0
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
    // InternalShortDSLParser.g:119:1: entryRuleDSLProgram : ruleDSLProgram EOF ;
    public final void entryRuleDSLProgram() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:120:1: ( ruleDSLProgram EOF )
            // InternalShortDSLParser.g:121:1: ruleDSLProgram EOF
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
    // InternalShortDSLParser.g:128:1: ruleDSLProgram : ( ( rule__DSLProgram__Alternatives ) ) ;
    public final void ruleDSLProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:132:2: ( ( ( rule__DSLProgram__Alternatives ) ) )
            // InternalShortDSLParser.g:133:2: ( ( rule__DSLProgram__Alternatives ) )
            {
            // InternalShortDSLParser.g:133:2: ( ( rule__DSLProgram__Alternatives ) )
            // InternalShortDSLParser.g:134:3: ( rule__DSLProgram__Alternatives )
            {
             before(grammarAccess.getDSLProgramAccess().getAlternatives()); 
            // InternalShortDSLParser.g:135:3: ( rule__DSLProgram__Alternatives )
            // InternalShortDSLParser.g:135:4: rule__DSLProgram__Alternatives
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
    // InternalShortDSLParser.g:144:1: entryRuleDSLLong : ruleDSLLong EOF ;
    public final void entryRuleDSLLong() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:145:1: ( ruleDSLLong EOF )
            // InternalShortDSLParser.g:146:1: ruleDSLLong EOF
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
    // InternalShortDSLParser.g:153:1: ruleDSLLong : ( ( rule__DSLLong__Group__0 ) ) ;
    public final void ruleDSLLong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:157:2: ( ( ( rule__DSLLong__Group__0 ) ) )
            // InternalShortDSLParser.g:158:2: ( ( rule__DSLLong__Group__0 ) )
            {
            // InternalShortDSLParser.g:158:2: ( ( rule__DSLLong__Group__0 ) )
            // InternalShortDSLParser.g:159:3: ( rule__DSLLong__Group__0 )
            {
             before(grammarAccess.getDSLLongAccess().getGroup()); 
            // InternalShortDSLParser.g:160:3: ( rule__DSLLong__Group__0 )
            // InternalShortDSLParser.g:160:4: rule__DSLLong__Group__0
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
    // InternalShortDSLParser.g:169:1: entryRuleDSLShort : ruleDSLShort EOF ;
    public final void entryRuleDSLShort() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:170:1: ( ruleDSLShort EOF )
            // InternalShortDSLParser.g:171:1: ruleDSLShort EOF
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
    // InternalShortDSLParser.g:178:1: ruleDSLShort : ( ( rule__DSLShort__Group__0 ) ) ;
    public final void ruleDSLShort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:182:2: ( ( ( rule__DSLShort__Group__0 ) ) )
            // InternalShortDSLParser.g:183:2: ( ( rule__DSLShort__Group__0 ) )
            {
            // InternalShortDSLParser.g:183:2: ( ( rule__DSLShort__Group__0 ) )
            // InternalShortDSLParser.g:184:3: ( rule__DSLShort__Group__0 )
            {
             before(grammarAccess.getDSLShortAccess().getGroup()); 
            // InternalShortDSLParser.g:185:3: ( rule__DSLShort__Group__0 )
            // InternalShortDSLParser.g:185:4: rule__DSLShort__Group__0
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
    // InternalShortDSLParser.g:194:1: entryRuleConfigurationS : ruleConfigurationS EOF ;
    public final void entryRuleConfigurationS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:195:1: ( ruleConfigurationS EOF )
            // InternalShortDSLParser.g:196:1: ruleConfigurationS EOF
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
    // InternalShortDSLParser.g:203:1: ruleConfigurationS : ( ( rule__ConfigurationS__Group__0 ) ) ;
    public final void ruleConfigurationS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:207:2: ( ( ( rule__ConfigurationS__Group__0 ) ) )
            // InternalShortDSLParser.g:208:2: ( ( rule__ConfigurationS__Group__0 ) )
            {
            // InternalShortDSLParser.g:208:2: ( ( rule__ConfigurationS__Group__0 ) )
            // InternalShortDSLParser.g:209:3: ( rule__ConfigurationS__Group__0 )
            {
             before(grammarAccess.getConfigurationSAccess().getGroup()); 
            // InternalShortDSLParser.g:210:3: ( rule__ConfigurationS__Group__0 )
            // InternalShortDSLParser.g:210:4: rule__ConfigurationS__Group__0
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
    // InternalShortDSLParser.g:219:1: entryRuleDeviceS : ruleDeviceS EOF ;
    public final void entryRuleDeviceS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:220:1: ( ruleDeviceS EOF )
            // InternalShortDSLParser.g:221:1: ruleDeviceS EOF
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
    // InternalShortDSLParser.g:228:1: ruleDeviceS : ( ( rule__DeviceS__Alternatives ) ) ;
    public final void ruleDeviceS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:232:2: ( ( ( rule__DeviceS__Alternatives ) ) )
            // InternalShortDSLParser.g:233:2: ( ( rule__DeviceS__Alternatives ) )
            {
            // InternalShortDSLParser.g:233:2: ( ( rule__DeviceS__Alternatives ) )
            // InternalShortDSLParser.g:234:3: ( rule__DeviceS__Alternatives )
            {
             before(grammarAccess.getDeviceSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:235:3: ( rule__DeviceS__Alternatives )
            // InternalShortDSLParser.g:235:4: rule__DeviceS__Alternatives
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
    // InternalShortDSLParser.g:244:1: entryRuleCraneS : ruleCraneS EOF ;
    public final void entryRuleCraneS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:245:1: ( ruleCraneS EOF )
            // InternalShortDSLParser.g:246:1: ruleCraneS EOF
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
    // InternalShortDSLParser.g:253:1: ruleCraneS : ( ( rule__CraneS__Group__0 ) ) ;
    public final void ruleCraneS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:257:2: ( ( ( rule__CraneS__Group__0 ) ) )
            // InternalShortDSLParser.g:258:2: ( ( rule__CraneS__Group__0 ) )
            {
            // InternalShortDSLParser.g:258:2: ( ( rule__CraneS__Group__0 ) )
            // InternalShortDSLParser.g:259:3: ( rule__CraneS__Group__0 )
            {
             before(grammarAccess.getCraneSAccess().getGroup()); 
            // InternalShortDSLParser.g:260:3: ( rule__CraneS__Group__0 )
            // InternalShortDSLParser.g:260:4: rule__CraneS__Group__0
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
    // InternalShortDSLParser.g:269:1: entryRuleCraneZoneS : ruleCraneZoneS EOF ;
    public final void entryRuleCraneZoneS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:270:1: ( ruleCraneZoneS EOF )
            // InternalShortDSLParser.g:271:1: ruleCraneZoneS EOF
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
    // InternalShortDSLParser.g:278:1: ruleCraneZoneS : ( ( rule__CraneZoneS__Group__0 ) ) ;
    public final void ruleCraneZoneS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:282:2: ( ( ( rule__CraneZoneS__Group__0 ) ) )
            // InternalShortDSLParser.g:283:2: ( ( rule__CraneZoneS__Group__0 ) )
            {
            // InternalShortDSLParser.g:283:2: ( ( rule__CraneZoneS__Group__0 ) )
            // InternalShortDSLParser.g:284:3: ( rule__CraneZoneS__Group__0 )
            {
             before(grammarAccess.getCraneZoneSAccess().getGroup()); 
            // InternalShortDSLParser.g:285:3: ( rule__CraneZoneS__Group__0 )
            // InternalShortDSLParser.g:285:4: rule__CraneZoneS__Group__0
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
    // InternalShortDSLParser.g:294:1: entryRuleDiskS : ruleDiskS EOF ;
    public final void entryRuleDiskS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:295:1: ( ruleDiskS EOF )
            // InternalShortDSLParser.g:296:1: ruleDiskS EOF
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
    // InternalShortDSLParser.g:303:1: ruleDiskS : ( ( rule__DiskS__Group__0 ) ) ;
    public final void ruleDiskS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:307:2: ( ( ( rule__DiskS__Group__0 ) ) )
            // InternalShortDSLParser.g:308:2: ( ( rule__DiskS__Group__0 ) )
            {
            // InternalShortDSLParser.g:308:2: ( ( rule__DiskS__Group__0 ) )
            // InternalShortDSLParser.g:309:3: ( rule__DiskS__Group__0 )
            {
             before(grammarAccess.getDiskSAccess().getGroup()); 
            // InternalShortDSLParser.g:310:3: ( rule__DiskS__Group__0 )
            // InternalShortDSLParser.g:310:4: rule__DiskS__Group__0
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
    // InternalShortDSLParser.g:319:1: entryRuleDiskZoneS : ruleDiskZoneS EOF ;
    public final void entryRuleDiskZoneS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:320:1: ( ruleDiskZoneS EOF )
            // InternalShortDSLParser.g:321:1: ruleDiskZoneS EOF
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
    // InternalShortDSLParser.g:328:1: ruleDiskZoneS : ( ( rule__DiskZoneS__Group__0 ) ) ;
    public final void ruleDiskZoneS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:332:2: ( ( ( rule__DiskZoneS__Group__0 ) ) )
            // InternalShortDSLParser.g:333:2: ( ( rule__DiskZoneS__Group__0 ) )
            {
            // InternalShortDSLParser.g:333:2: ( ( rule__DiskZoneS__Group__0 ) )
            // InternalShortDSLParser.g:334:3: ( rule__DiskZoneS__Group__0 )
            {
             before(grammarAccess.getDiskZoneSAccess().getGroup()); 
            // InternalShortDSLParser.g:335:3: ( rule__DiskZoneS__Group__0 )
            // InternalShortDSLParser.g:335:4: rule__DiskZoneS__Group__0
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
    // InternalShortDSLParser.g:344:1: entryRuleCameraS : ruleCameraS EOF ;
    public final void entryRuleCameraS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:345:1: ( ruleCameraS EOF )
            // InternalShortDSLParser.g:346:1: ruleCameraS EOF
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
    // InternalShortDSLParser.g:353:1: ruleCameraS : ( ( rule__CameraS__Group__0 ) ) ;
    public final void ruleCameraS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:357:2: ( ( ( rule__CameraS__Group__0 ) ) )
            // InternalShortDSLParser.g:358:2: ( ( rule__CameraS__Group__0 ) )
            {
            // InternalShortDSLParser.g:358:2: ( ( rule__CameraS__Group__0 ) )
            // InternalShortDSLParser.g:359:3: ( rule__CameraS__Group__0 )
            {
             before(grammarAccess.getCameraSAccess().getGroup()); 
            // InternalShortDSLParser.g:360:3: ( rule__CameraS__Group__0 )
            // InternalShortDSLParser.g:360:4: rule__CameraS__Group__0
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
    // InternalShortDSLParser.g:369:1: entryRuleCameraColorS : ruleCameraColorS EOF ;
    public final void entryRuleCameraColorS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:370:1: ( ruleCameraColorS EOF )
            // InternalShortDSLParser.g:371:1: ruleCameraColorS EOF
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
    // InternalShortDSLParser.g:378:1: ruleCameraColorS : ( ( rule__CameraColorS__Group__0 ) ) ;
    public final void ruleCameraColorS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:382:2: ( ( ( rule__CameraColorS__Group__0 ) ) )
            // InternalShortDSLParser.g:383:2: ( ( rule__CameraColorS__Group__0 ) )
            {
            // InternalShortDSLParser.g:383:2: ( ( rule__CameraColorS__Group__0 ) )
            // InternalShortDSLParser.g:384:3: ( rule__CameraColorS__Group__0 )
            {
             before(grammarAccess.getCameraColorSAccess().getGroup()); 
            // InternalShortDSLParser.g:385:3: ( rule__CameraColorS__Group__0 )
            // InternalShortDSLParser.g:385:4: rule__CameraColorS__Group__0
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
    // InternalShortDSLParser.g:394:1: entryRuleLoggingS : ruleLoggingS EOF ;
    public final void entryRuleLoggingS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:395:1: ( ruleLoggingS EOF )
            // InternalShortDSLParser.g:396:1: ruleLoggingS EOF
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
    // InternalShortDSLParser.g:403:1: ruleLoggingS : ( ( rule__LoggingS__Group__0 ) ) ;
    public final void ruleLoggingS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:407:2: ( ( ( rule__LoggingS__Group__0 ) ) )
            // InternalShortDSLParser.g:408:2: ( ( rule__LoggingS__Group__0 ) )
            {
            // InternalShortDSLParser.g:408:2: ( ( rule__LoggingS__Group__0 ) )
            // InternalShortDSLParser.g:409:3: ( rule__LoggingS__Group__0 )
            {
             before(grammarAccess.getLoggingSAccess().getGroup()); 
            // InternalShortDSLParser.g:410:3: ( rule__LoggingS__Group__0 )
            // InternalShortDSLParser.g:410:4: rule__LoggingS__Group__0
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
    // InternalShortDSLParser.g:419:1: entryRuleDiskHandlingS : ruleDiskHandlingS EOF ;
    public final void entryRuleDiskHandlingS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:420:1: ( ruleDiskHandlingS EOF )
            // InternalShortDSLParser.g:421:1: ruleDiskHandlingS EOF
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
    // InternalShortDSLParser.g:428:1: ruleDiskHandlingS : ( ( rule__DiskHandlingS__Group__0 ) ) ;
    public final void ruleDiskHandlingS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:432:2: ( ( ( rule__DiskHandlingS__Group__0 ) ) )
            // InternalShortDSLParser.g:433:2: ( ( rule__DiskHandlingS__Group__0 ) )
            {
            // InternalShortDSLParser.g:433:2: ( ( rule__DiskHandlingS__Group__0 ) )
            // InternalShortDSLParser.g:434:3: ( rule__DiskHandlingS__Group__0 )
            {
             before(grammarAccess.getDiskHandlingSAccess().getGroup()); 
            // InternalShortDSLParser.g:435:3: ( rule__DiskHandlingS__Group__0 )
            // InternalShortDSLParser.g:435:4: rule__DiskHandlingS__Group__0
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
    // InternalShortDSLParser.g:444:1: entryRuleStatementS : ruleStatementS EOF ;
    public final void entryRuleStatementS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:445:1: ( ruleStatementS EOF )
            // InternalShortDSLParser.g:446:1: ruleStatementS EOF
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
    // InternalShortDSLParser.g:453:1: ruleStatementS : ( ( rule__StatementS__Alternatives ) ) ;
    public final void ruleStatementS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:457:2: ( ( ( rule__StatementS__Alternatives ) ) )
            // InternalShortDSLParser.g:458:2: ( ( rule__StatementS__Alternatives ) )
            {
            // InternalShortDSLParser.g:458:2: ( ( rule__StatementS__Alternatives ) )
            // InternalShortDSLParser.g:459:3: ( rule__StatementS__Alternatives )
            {
             before(grammarAccess.getStatementSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:460:3: ( rule__StatementS__Alternatives )
            // InternalShortDSLParser.g:460:4: rule__StatementS__Alternatives
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
    // InternalShortDSLParser.g:469:1: entryRuleLoopS : ruleLoopS EOF ;
    public final void entryRuleLoopS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:470:1: ( ruleLoopS EOF )
            // InternalShortDSLParser.g:471:1: ruleLoopS EOF
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
    // InternalShortDSLParser.g:478:1: ruleLoopS : ( ( rule__LoopS__Alternatives ) ) ;
    public final void ruleLoopS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:482:2: ( ( ( rule__LoopS__Alternatives ) ) )
            // InternalShortDSLParser.g:483:2: ( ( rule__LoopS__Alternatives ) )
            {
            // InternalShortDSLParser.g:483:2: ( ( rule__LoopS__Alternatives ) )
            // InternalShortDSLParser.g:484:3: ( rule__LoopS__Alternatives )
            {
             before(grammarAccess.getLoopSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:485:3: ( rule__LoopS__Alternatives )
            // InternalShortDSLParser.g:485:4: rule__LoopS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LoopS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLoopSAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleLoopVariableS"
    // InternalShortDSLParser.g:494:1: entryRuleLoopVariableS : ruleLoopVariableS EOF ;
    public final void entryRuleLoopVariableS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:495:1: ( ruleLoopVariableS EOF )
            // InternalShortDSLParser.g:496:1: ruleLoopVariableS EOF
            {
             before(grammarAccess.getLoopVariableSRule()); 
            pushFollow(FOLLOW_1);
            ruleLoopVariableS();

            state._fsp--;

             after(grammarAccess.getLoopVariableSRule()); 
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
    // $ANTLR end "entryRuleLoopVariableS"


    // $ANTLR start "ruleLoopVariableS"
    // InternalShortDSLParser.g:503:1: ruleLoopVariableS : ( ( rule__LoopVariableS__Group__0 ) ) ;
    public final void ruleLoopVariableS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:507:2: ( ( ( rule__LoopVariableS__Group__0 ) ) )
            // InternalShortDSLParser.g:508:2: ( ( rule__LoopVariableS__Group__0 ) )
            {
            // InternalShortDSLParser.g:508:2: ( ( rule__LoopVariableS__Group__0 ) )
            // InternalShortDSLParser.g:509:3: ( rule__LoopVariableS__Group__0 )
            {
             before(grammarAccess.getLoopVariableSAccess().getGroup()); 
            // InternalShortDSLParser.g:510:3: ( rule__LoopVariableS__Group__0 )
            // InternalShortDSLParser.g:510:4: rule__LoopVariableS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoopVariableS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopVariableSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoopVariableS"


    // $ANTLR start "entryRuleLoopSlotS"
    // InternalShortDSLParser.g:519:1: entryRuleLoopSlotS : ruleLoopSlotS EOF ;
    public final void entryRuleLoopSlotS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:520:1: ( ruleLoopSlotS EOF )
            // InternalShortDSLParser.g:521:1: ruleLoopSlotS EOF
            {
             before(grammarAccess.getLoopSlotSRule()); 
            pushFollow(FOLLOW_1);
            ruleLoopSlotS();

            state._fsp--;

             after(grammarAccess.getLoopSlotSRule()); 
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
    // $ANTLR end "entryRuleLoopSlotS"


    // $ANTLR start "ruleLoopSlotS"
    // InternalShortDSLParser.g:528:1: ruleLoopSlotS : ( ( rule__LoopSlotS__Group__0 ) ) ;
    public final void ruleLoopSlotS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:532:2: ( ( ( rule__LoopSlotS__Group__0 ) ) )
            // InternalShortDSLParser.g:533:2: ( ( rule__LoopSlotS__Group__0 ) )
            {
            // InternalShortDSLParser.g:533:2: ( ( rule__LoopSlotS__Group__0 ) )
            // InternalShortDSLParser.g:534:3: ( rule__LoopSlotS__Group__0 )
            {
             before(grammarAccess.getLoopSlotSAccess().getGroup()); 
            // InternalShortDSLParser.g:535:3: ( rule__LoopSlotS__Group__0 )
            // InternalShortDSLParser.g:535:4: rule__LoopSlotS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoopSlotS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopSlotSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoopSlotS"


    // $ANTLR start "entryRuleMoveS"
    // InternalShortDSLParser.g:544:1: entryRuleMoveS : ruleMoveS EOF ;
    public final void entryRuleMoveS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:545:1: ( ruleMoveS EOF )
            // InternalShortDSLParser.g:546:1: ruleMoveS EOF
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
    // InternalShortDSLParser.g:553:1: ruleMoveS : ( ( rule__MoveS__Alternatives ) ) ;
    public final void ruleMoveS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:557:2: ( ( ( rule__MoveS__Alternatives ) ) )
            // InternalShortDSLParser.g:558:2: ( ( rule__MoveS__Alternatives ) )
            {
            // InternalShortDSLParser.g:558:2: ( ( rule__MoveS__Alternatives ) )
            // InternalShortDSLParser.g:559:3: ( rule__MoveS__Alternatives )
            {
             before(grammarAccess.getMoveSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:560:3: ( rule__MoveS__Alternatives )
            // InternalShortDSLParser.g:560:4: rule__MoveS__Alternatives
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
    // InternalShortDSLParser.g:569:1: entryRuleMoveDiskS : ruleMoveDiskS EOF ;
    public final void entryRuleMoveDiskS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:570:1: ( ruleMoveDiskS EOF )
            // InternalShortDSLParser.g:571:1: ruleMoveDiskS EOF
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
    // InternalShortDSLParser.g:578:1: ruleMoveDiskS : ( ( rule__MoveDiskS__Group__0 ) ) ;
    public final void ruleMoveDiskS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:582:2: ( ( ( rule__MoveDiskS__Group__0 ) ) )
            // InternalShortDSLParser.g:583:2: ( ( rule__MoveDiskS__Group__0 ) )
            {
            // InternalShortDSLParser.g:583:2: ( ( rule__MoveDiskS__Group__0 ) )
            // InternalShortDSLParser.g:584:3: ( rule__MoveDiskS__Group__0 )
            {
             before(grammarAccess.getMoveDiskSAccess().getGroup()); 
            // InternalShortDSLParser.g:585:3: ( rule__MoveDiskS__Group__0 )
            // InternalShortDSLParser.g:585:4: rule__MoveDiskS__Group__0
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
    // InternalShortDSLParser.g:594:1: entryRuleMoveAnySlotS : ruleMoveAnySlotS EOF ;
    public final void entryRuleMoveAnySlotS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:595:1: ( ruleMoveAnySlotS EOF )
            // InternalShortDSLParser.g:596:1: ruleMoveAnySlotS EOF
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
    // InternalShortDSLParser.g:603:1: ruleMoveAnySlotS : ( ( rule__MoveAnySlotS__Group__0 ) ) ;
    public final void ruleMoveAnySlotS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:607:2: ( ( ( rule__MoveAnySlotS__Group__0 ) ) )
            // InternalShortDSLParser.g:608:2: ( ( rule__MoveAnySlotS__Group__0 ) )
            {
            // InternalShortDSLParser.g:608:2: ( ( rule__MoveAnySlotS__Group__0 ) )
            // InternalShortDSLParser.g:609:3: ( rule__MoveAnySlotS__Group__0 )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getGroup()); 
            // InternalShortDSLParser.g:610:3: ( rule__MoveAnySlotS__Group__0 )
            // InternalShortDSLParser.g:610:4: rule__MoveAnySlotS__Group__0
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
    // InternalShortDSLParser.g:619:1: entryRuleMoveCraneS : ruleMoveCraneS EOF ;
    public final void entryRuleMoveCraneS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:620:1: ( ruleMoveCraneS EOF )
            // InternalShortDSLParser.g:621:1: ruleMoveCraneS EOF
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
    // InternalShortDSLParser.g:628:1: ruleMoveCraneS : ( ( rule__MoveCraneS__Group__0 ) ) ;
    public final void ruleMoveCraneS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:632:2: ( ( ( rule__MoveCraneS__Group__0 ) ) )
            // InternalShortDSLParser.g:633:2: ( ( rule__MoveCraneS__Group__0 ) )
            {
            // InternalShortDSLParser.g:633:2: ( ( rule__MoveCraneS__Group__0 ) )
            // InternalShortDSLParser.g:634:3: ( rule__MoveCraneS__Group__0 )
            {
             before(grammarAccess.getMoveCraneSAccess().getGroup()); 
            // InternalShortDSLParser.g:635:3: ( rule__MoveCraneS__Group__0 )
            // InternalShortDSLParser.g:635:4: rule__MoveCraneS__Group__0
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
    // InternalShortDSLParser.g:644:1: entryRuleCraneActionS : ruleCraneActionS EOF ;
    public final void entryRuleCraneActionS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:645:1: ( ruleCraneActionS EOF )
            // InternalShortDSLParser.g:646:1: ruleCraneActionS EOF
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
    // InternalShortDSLParser.g:653:1: ruleCraneActionS : ( ( rule__CraneActionS__Group__0 ) ) ;
    public final void ruleCraneActionS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:657:2: ( ( ( rule__CraneActionS__Group__0 ) ) )
            // InternalShortDSLParser.g:658:2: ( ( rule__CraneActionS__Group__0 ) )
            {
            // InternalShortDSLParser.g:658:2: ( ( rule__CraneActionS__Group__0 ) )
            // InternalShortDSLParser.g:659:3: ( rule__CraneActionS__Group__0 )
            {
             before(grammarAccess.getCraneActionSAccess().getGroup()); 
            // InternalShortDSLParser.g:660:3: ( rule__CraneActionS__Group__0 )
            // InternalShortDSLParser.g:660:4: rule__CraneActionS__Group__0
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
    // InternalShortDSLParser.g:669:1: entryRuleConditionS : ruleConditionS EOF ;
    public final void entryRuleConditionS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:670:1: ( ruleConditionS EOF )
            // InternalShortDSLParser.g:671:1: ruleConditionS EOF
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
    // InternalShortDSLParser.g:678:1: ruleConditionS : ( ( rule__ConditionS__Alternatives ) ) ;
    public final void ruleConditionS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:682:2: ( ( ( rule__ConditionS__Alternatives ) ) )
            // InternalShortDSLParser.g:683:2: ( ( rule__ConditionS__Alternatives ) )
            {
            // InternalShortDSLParser.g:683:2: ( ( rule__ConditionS__Alternatives ) )
            // InternalShortDSLParser.g:684:3: ( rule__ConditionS__Alternatives )
            {
             before(grammarAccess.getConditionSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:685:3: ( rule__ConditionS__Alternatives )
            // InternalShortDSLParser.g:685:4: rule__ConditionS__Alternatives
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
    // InternalShortDSLParser.g:694:1: entryRuleConditionVariableS : ruleConditionVariableS EOF ;
    public final void entryRuleConditionVariableS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:695:1: ( ruleConditionVariableS EOF )
            // InternalShortDSLParser.g:696:1: ruleConditionVariableS EOF
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
    // InternalShortDSLParser.g:703:1: ruleConditionVariableS : ( ( rule__ConditionVariableS__Group__0 ) ) ;
    public final void ruleConditionVariableS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:707:2: ( ( ( rule__ConditionVariableS__Group__0 ) ) )
            // InternalShortDSLParser.g:708:2: ( ( rule__ConditionVariableS__Group__0 ) )
            {
            // InternalShortDSLParser.g:708:2: ( ( rule__ConditionVariableS__Group__0 ) )
            // InternalShortDSLParser.g:709:3: ( rule__ConditionVariableS__Group__0 )
            {
             before(grammarAccess.getConditionVariableSAccess().getGroup()); 
            // InternalShortDSLParser.g:710:3: ( rule__ConditionVariableS__Group__0 )
            // InternalShortDSLParser.g:710:4: rule__ConditionVariableS__Group__0
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


    // $ANTLR start "entryRuleConditionSlotS"
    // InternalShortDSLParser.g:719:1: entryRuleConditionSlotS : ruleConditionSlotS EOF ;
    public final void entryRuleConditionSlotS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:720:1: ( ruleConditionSlotS EOF )
            // InternalShortDSLParser.g:721:1: ruleConditionSlotS EOF
            {
             before(grammarAccess.getConditionSlotSRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionSlotS();

            state._fsp--;

             after(grammarAccess.getConditionSlotSRule()); 
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
    // $ANTLR end "entryRuleConditionSlotS"


    // $ANTLR start "ruleConditionSlotS"
    // InternalShortDSLParser.g:728:1: ruleConditionSlotS : ( ( rule__ConditionSlotS__Group__0 ) ) ;
    public final void ruleConditionSlotS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:732:2: ( ( ( rule__ConditionSlotS__Group__0 ) ) )
            // InternalShortDSLParser.g:733:2: ( ( rule__ConditionSlotS__Group__0 ) )
            {
            // InternalShortDSLParser.g:733:2: ( ( rule__ConditionSlotS__Group__0 ) )
            // InternalShortDSLParser.g:734:3: ( rule__ConditionSlotS__Group__0 )
            {
             before(grammarAccess.getConditionSlotSAccess().getGroup()); 
            // InternalShortDSLParser.g:735:3: ( rule__ConditionSlotS__Group__0 )
            // InternalShortDSLParser.g:735:4: rule__ConditionSlotS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionSlotS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionSlotSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionSlotS"


    // $ANTLR start "entryRuleConditionDeviceS"
    // InternalShortDSLParser.g:744:1: entryRuleConditionDeviceS : ruleConditionDeviceS EOF ;
    public final void entryRuleConditionDeviceS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:745:1: ( ruleConditionDeviceS EOF )
            // InternalShortDSLParser.g:746:1: ruleConditionDeviceS EOF
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
    // InternalShortDSLParser.g:753:1: ruleConditionDeviceS : ( ( rule__ConditionDeviceS__Group__0 ) ) ;
    public final void ruleConditionDeviceS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:757:2: ( ( ( rule__ConditionDeviceS__Group__0 ) ) )
            // InternalShortDSLParser.g:758:2: ( ( rule__ConditionDeviceS__Group__0 ) )
            {
            // InternalShortDSLParser.g:758:2: ( ( rule__ConditionDeviceS__Group__0 ) )
            // InternalShortDSLParser.g:759:3: ( rule__ConditionDeviceS__Group__0 )
            {
             before(grammarAccess.getConditionDeviceSAccess().getGroup()); 
            // InternalShortDSLParser.g:760:3: ( rule__ConditionDeviceS__Group__0 )
            // InternalShortDSLParser.g:760:4: rule__ConditionDeviceS__Group__0
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
    // InternalShortDSLParser.g:769:1: entryRuleMarkS : ruleMarkS EOF ;
    public final void entryRuleMarkS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:770:1: ( ruleMarkS EOF )
            // InternalShortDSLParser.g:771:1: ruleMarkS EOF
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
    // InternalShortDSLParser.g:778:1: ruleMarkS : ( ( rule__MarkS__Alternatives ) ) ;
    public final void ruleMarkS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:782:2: ( ( ( rule__MarkS__Alternatives ) ) )
            // InternalShortDSLParser.g:783:2: ( ( rule__MarkS__Alternatives ) )
            {
            // InternalShortDSLParser.g:783:2: ( ( rule__MarkS__Alternatives ) )
            // InternalShortDSLParser.g:784:3: ( rule__MarkS__Alternatives )
            {
             before(grammarAccess.getMarkSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:785:3: ( rule__MarkS__Alternatives )
            // InternalShortDSLParser.g:785:4: rule__MarkS__Alternatives
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
    // InternalShortDSLParser.g:794:1: entryRuleMarkVariableValueS : ruleMarkVariableValueS EOF ;
    public final void entryRuleMarkVariableValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:795:1: ( ruleMarkVariableValueS EOF )
            // InternalShortDSLParser.g:796:1: ruleMarkVariableValueS EOF
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
    // InternalShortDSLParser.g:803:1: ruleMarkVariableValueS : ( ( rule__MarkVariableValueS__Group__0 ) ) ;
    public final void ruleMarkVariableValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:807:2: ( ( ( rule__MarkVariableValueS__Group__0 ) ) )
            // InternalShortDSLParser.g:808:2: ( ( rule__MarkVariableValueS__Group__0 ) )
            {
            // InternalShortDSLParser.g:808:2: ( ( rule__MarkVariableValueS__Group__0 ) )
            // InternalShortDSLParser.g:809:3: ( rule__MarkVariableValueS__Group__0 )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getGroup()); 
            // InternalShortDSLParser.g:810:3: ( rule__MarkVariableValueS__Group__0 )
            // InternalShortDSLParser.g:810:4: rule__MarkVariableValueS__Group__0
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
    // InternalShortDSLParser.g:819:1: entryRuleMarkCameraValueS : ruleMarkCameraValueS EOF ;
    public final void entryRuleMarkCameraValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:820:1: ( ruleMarkCameraValueS EOF )
            // InternalShortDSLParser.g:821:1: ruleMarkCameraValueS EOF
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
    // InternalShortDSLParser.g:828:1: ruleMarkCameraValueS : ( ( rule__MarkCameraValueS__Group__0 ) ) ;
    public final void ruleMarkCameraValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:832:2: ( ( ( rule__MarkCameraValueS__Group__0 ) ) )
            // InternalShortDSLParser.g:833:2: ( ( rule__MarkCameraValueS__Group__0 ) )
            {
            // InternalShortDSLParser.g:833:2: ( ( rule__MarkCameraValueS__Group__0 ) )
            // InternalShortDSLParser.g:834:3: ( rule__MarkCameraValueS__Group__0 )
            {
             before(grammarAccess.getMarkCameraValueSAccess().getGroup()); 
            // InternalShortDSLParser.g:835:3: ( rule__MarkCameraValueS__Group__0 )
            // InternalShortDSLParser.g:835:4: rule__MarkCameraValueS__Group__0
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


    // $ANTLR start "entryRuleOrdinaryVariableS"
    // InternalShortDSLParser.g:844:1: entryRuleOrdinaryVariableS : ruleOrdinaryVariableS EOF ;
    public final void entryRuleOrdinaryVariableS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:845:1: ( ruleOrdinaryVariableS EOF )
            // InternalShortDSLParser.g:846:1: ruleOrdinaryVariableS EOF
            {
             before(grammarAccess.getOrdinaryVariableSRule()); 
            pushFollow(FOLLOW_1);
            ruleOrdinaryVariableS();

            state._fsp--;

             after(grammarAccess.getOrdinaryVariableSRule()); 
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
    // $ANTLR end "entryRuleOrdinaryVariableS"


    // $ANTLR start "ruleOrdinaryVariableS"
    // InternalShortDSLParser.g:853:1: ruleOrdinaryVariableS : ( ( rule__OrdinaryVariableS__Group__0 ) ) ;
    public final void ruleOrdinaryVariableS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:857:2: ( ( ( rule__OrdinaryVariableS__Group__0 ) ) )
            // InternalShortDSLParser.g:858:2: ( ( rule__OrdinaryVariableS__Group__0 ) )
            {
            // InternalShortDSLParser.g:858:2: ( ( rule__OrdinaryVariableS__Group__0 ) )
            // InternalShortDSLParser.g:859:3: ( rule__OrdinaryVariableS__Group__0 )
            {
             before(grammarAccess.getOrdinaryVariableSAccess().getGroup()); 
            // InternalShortDSLParser.g:860:3: ( rule__OrdinaryVariableS__Group__0 )
            // InternalShortDSLParser.g:860:4: rule__OrdinaryVariableS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrdinaryVariableS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrdinaryVariableSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrdinaryVariableS"


    // $ANTLR start "entryRuleSlotVariableS"
    // InternalShortDSLParser.g:869:1: entryRuleSlotVariableS : ruleSlotVariableS EOF ;
    public final void entryRuleSlotVariableS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:870:1: ( ruleSlotVariableS EOF )
            // InternalShortDSLParser.g:871:1: ruleSlotVariableS EOF
            {
             before(grammarAccess.getSlotVariableSRule()); 
            pushFollow(FOLLOW_1);
            ruleSlotVariableS();

            state._fsp--;

             after(grammarAccess.getSlotVariableSRule()); 
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
    // $ANTLR end "entryRuleSlotVariableS"


    // $ANTLR start "ruleSlotVariableS"
    // InternalShortDSLParser.g:878:1: ruleSlotVariableS : ( ( rule__SlotVariableS__Group__0 ) ) ;
    public final void ruleSlotVariableS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:882:2: ( ( ( rule__SlotVariableS__Group__0 ) ) )
            // InternalShortDSLParser.g:883:2: ( ( rule__SlotVariableS__Group__0 ) )
            {
            // InternalShortDSLParser.g:883:2: ( ( rule__SlotVariableS__Group__0 ) )
            // InternalShortDSLParser.g:884:3: ( rule__SlotVariableS__Group__0 )
            {
             before(grammarAccess.getSlotVariableSAccess().getGroup()); 
            // InternalShortDSLParser.g:885:3: ( rule__SlotVariableS__Group__0 )
            // InternalShortDSLParser.g:885:4: rule__SlotVariableS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SlotVariableS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSlotVariableSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlotVariableS"


    // $ANTLR start "entryRuleVariableValueS"
    // InternalShortDSLParser.g:894:1: entryRuleVariableValueS : ruleVariableValueS EOF ;
    public final void entryRuleVariableValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:895:1: ( ruleVariableValueS EOF )
            // InternalShortDSLParser.g:896:1: ruleVariableValueS EOF
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
    // InternalShortDSLParser.g:903:1: ruleVariableValueS : ( ( rule__VariableValueS__Alternatives ) ) ;
    public final void ruleVariableValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:907:2: ( ( ( rule__VariableValueS__Alternatives ) ) )
            // InternalShortDSLParser.g:908:2: ( ( rule__VariableValueS__Alternatives ) )
            {
            // InternalShortDSLParser.g:908:2: ( ( rule__VariableValueS__Alternatives ) )
            // InternalShortDSLParser.g:909:3: ( rule__VariableValueS__Alternatives )
            {
             before(grammarAccess.getVariableValueSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:910:3: ( rule__VariableValueS__Alternatives )
            // InternalShortDSLParser.g:910:4: rule__VariableValueS__Alternatives
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
    // InternalShortDSLParser.g:919:1: entryRuleDeviceValueS : ruleDeviceValueS EOF ;
    public final void entryRuleDeviceValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:920:1: ( ruleDeviceValueS EOF )
            // InternalShortDSLParser.g:921:1: ruleDeviceValueS EOF
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
    // InternalShortDSLParser.g:928:1: ruleDeviceValueS : ( ( rule__DeviceValueS__Alternatives ) ) ;
    public final void ruleDeviceValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:932:2: ( ( ( rule__DeviceValueS__Alternatives ) ) )
            // InternalShortDSLParser.g:933:2: ( ( rule__DeviceValueS__Alternatives ) )
            {
            // InternalShortDSLParser.g:933:2: ( ( rule__DeviceValueS__Alternatives ) )
            // InternalShortDSLParser.g:934:3: ( rule__DeviceValueS__Alternatives )
            {
             before(grammarAccess.getDeviceValueSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:935:3: ( rule__DeviceValueS__Alternatives )
            // InternalShortDSLParser.g:935:4: rule__DeviceValueS__Alternatives
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
    // InternalShortDSLParser.g:944:1: entryRuleValueSlotS : ruleValueSlotS EOF ;
    public final void entryRuleValueSlotS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:945:1: ( ruleValueSlotS EOF )
            // InternalShortDSLParser.g:946:1: ruleValueSlotS EOF
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
    // InternalShortDSLParser.g:953:1: ruleValueSlotS : ( ( rule__ValueSlotS__Alternatives ) ) ;
    public final void ruleValueSlotS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:957:2: ( ( ( rule__ValueSlotS__Alternatives ) ) )
            // InternalShortDSLParser.g:958:2: ( ( rule__ValueSlotS__Alternatives ) )
            {
            // InternalShortDSLParser.g:958:2: ( ( rule__ValueSlotS__Alternatives ) )
            // InternalShortDSLParser.g:959:3: ( rule__ValueSlotS__Alternatives )
            {
             before(grammarAccess.getValueSlotSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:960:3: ( rule__ValueSlotS__Alternatives )
            // InternalShortDSLParser.g:960:4: rule__ValueSlotS__Alternatives
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
    // InternalShortDSLParser.g:969:1: entryRuleDSLTypeValue : ruleDSLTypeValue EOF ;
    public final void entryRuleDSLTypeValue() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:970:1: ( ruleDSLTypeValue EOF )
            // InternalShortDSLParser.g:971:1: ruleDSLTypeValue EOF
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
    // InternalShortDSLParser.g:978:1: ruleDSLTypeValue : ( ( rule__DSLTypeValue__ValueAssignment ) ) ;
    public final void ruleDSLTypeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:982:2: ( ( ( rule__DSLTypeValue__ValueAssignment ) ) )
            // InternalShortDSLParser.g:983:2: ( ( rule__DSLTypeValue__ValueAssignment ) )
            {
            // InternalShortDSLParser.g:983:2: ( ( rule__DSLTypeValue__ValueAssignment ) )
            // InternalShortDSLParser.g:984:3: ( rule__DSLTypeValue__ValueAssignment )
            {
             before(grammarAccess.getDSLTypeValueAccess().getValueAssignment()); 
            // InternalShortDSLParser.g:985:3: ( rule__DSLTypeValue__ValueAssignment )
            // InternalShortDSLParser.g:985:4: rule__DSLTypeValue__ValueAssignment
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
    // InternalShortDSLParser.g:994:1: entryRuleDiskStateValueS : ruleDiskStateValueS EOF ;
    public final void entryRuleDiskStateValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:995:1: ( ruleDiskStateValueS EOF )
            // InternalShortDSLParser.g:996:1: ruleDiskStateValueS EOF
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
    // InternalShortDSLParser.g:1003:1: ruleDiskStateValueS : ( ( rule__DiskStateValueS__ValueAssignment ) ) ;
    public final void ruleDiskStateValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1007:2: ( ( ( rule__DiskStateValueS__ValueAssignment ) ) )
            // InternalShortDSLParser.g:1008:2: ( ( rule__DiskStateValueS__ValueAssignment ) )
            {
            // InternalShortDSLParser.g:1008:2: ( ( rule__DiskStateValueS__ValueAssignment ) )
            // InternalShortDSLParser.g:1009:3: ( rule__DiskStateValueS__ValueAssignment )
            {
             before(grammarAccess.getDiskStateValueSAccess().getValueAssignment()); 
            // InternalShortDSLParser.g:1010:3: ( rule__DiskStateValueS__ValueAssignment )
            // InternalShortDSLParser.g:1010:4: rule__DiskStateValueS__ValueAssignment
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
    // InternalShortDSLParser.g:1019:1: entryRuleDiskSlotStateValueS : ruleDiskSlotStateValueS EOF ;
    public final void entryRuleDiskSlotStateValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:1020:1: ( ruleDiskSlotStateValueS EOF )
            // InternalShortDSLParser.g:1021:1: ruleDiskSlotStateValueS EOF
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
    // InternalShortDSLParser.g:1028:1: ruleDiskSlotStateValueS : ( ( rule__DiskSlotStateValueS__ValueAssignment ) ) ;
    public final void ruleDiskSlotStateValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1032:2: ( ( ( rule__DiskSlotStateValueS__ValueAssignment ) ) )
            // InternalShortDSLParser.g:1033:2: ( ( rule__DiskSlotStateValueS__ValueAssignment ) )
            {
            // InternalShortDSLParser.g:1033:2: ( ( rule__DiskSlotStateValueS__ValueAssignment ) )
            // InternalShortDSLParser.g:1034:3: ( rule__DiskSlotStateValueS__ValueAssignment )
            {
             before(grammarAccess.getDiskSlotStateValueSAccess().getValueAssignment()); 
            // InternalShortDSLParser.g:1035:3: ( rule__DiskSlotStateValueS__ValueAssignment )
            // InternalShortDSLParser.g:1035:4: rule__DiskSlotStateValueS__ValueAssignment
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
    // InternalShortDSLParser.g:1044:1: entryRuleColorValueS : ruleColorValueS EOF ;
    public final void entryRuleColorValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:1045:1: ( ruleColorValueS EOF )
            // InternalShortDSLParser.g:1046:1: ruleColorValueS EOF
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
    // InternalShortDSLParser.g:1053:1: ruleColorValueS : ( ( rule__ColorValueS__ValueAssignment ) ) ;
    public final void ruleColorValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1057:2: ( ( ( rule__ColorValueS__ValueAssignment ) ) )
            // InternalShortDSLParser.g:1058:2: ( ( rule__ColorValueS__ValueAssignment ) )
            {
            // InternalShortDSLParser.g:1058:2: ( ( rule__ColorValueS__ValueAssignment ) )
            // InternalShortDSLParser.g:1059:3: ( rule__ColorValueS__ValueAssignment )
            {
             before(grammarAccess.getColorValueSAccess().getValueAssignment()); 
            // InternalShortDSLParser.g:1060:3: ( rule__ColorValueS__ValueAssignment )
            // InternalShortDSLParser.g:1060:4: rule__ColorValueS__ValueAssignment
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
    // InternalShortDSLParser.g:1069:1: entryRuleNumberS : ruleNumberS EOF ;
    public final void entryRuleNumberS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:1070:1: ( ruleNumberS EOF )
            // InternalShortDSLParser.g:1071:1: ruleNumberS EOF
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
    // InternalShortDSLParser.g:1078:1: ruleNumberS : ( ( rule__NumberS__ValueAssignment ) ) ;
    public final void ruleNumberS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1082:2: ( ( ( rule__NumberS__ValueAssignment ) ) )
            // InternalShortDSLParser.g:1083:2: ( ( rule__NumberS__ValueAssignment ) )
            {
            // InternalShortDSLParser.g:1083:2: ( ( rule__NumberS__ValueAssignment ) )
            // InternalShortDSLParser.g:1084:3: ( rule__NumberS__ValueAssignment )
            {
             before(grammarAccess.getNumberSAccess().getValueAssignment()); 
            // InternalShortDSLParser.g:1085:3: ( rule__NumberS__ValueAssignment )
            // InternalShortDSLParser.g:1085:4: rule__NumberS__ValueAssignment
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
    // InternalShortDSLParser.g:1094:1: ruleDSL_TYPE_ENUM : ( ( rule__DSL_TYPE_ENUM__Alternatives ) ) ;
    public final void ruleDSL_TYPE_ENUM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1098:1: ( ( ( rule__DSL_TYPE_ENUM__Alternatives ) ) )
            // InternalShortDSLParser.g:1099:2: ( ( rule__DSL_TYPE_ENUM__Alternatives ) )
            {
            // InternalShortDSLParser.g:1099:2: ( ( rule__DSL_TYPE_ENUM__Alternatives ) )
            // InternalShortDSLParser.g:1100:3: ( rule__DSL_TYPE_ENUM__Alternatives )
            {
             before(grammarAccess.getDSL_TYPE_ENUMAccess().getAlternatives()); 
            // InternalShortDSLParser.g:1101:3: ( rule__DSL_TYPE_ENUM__Alternatives )
            // InternalShortDSLParser.g:1101:4: rule__DSL_TYPE_ENUM__Alternatives
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
    // InternalShortDSLParser.g:1110:1: ruleCOMPARISON_OPERATOR_S : ( ( rule__COMPARISON_OPERATOR_S__Alternatives ) ) ;
    public final void ruleCOMPARISON_OPERATOR_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1114:1: ( ( ( rule__COMPARISON_OPERATOR_S__Alternatives ) ) )
            // InternalShortDSLParser.g:1115:2: ( ( rule__COMPARISON_OPERATOR_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:1115:2: ( ( rule__COMPARISON_OPERATOR_S__Alternatives ) )
            // InternalShortDSLParser.g:1116:3: ( rule__COMPARISON_OPERATOR_S__Alternatives )
            {
             before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:1117:3: ( rule__COMPARISON_OPERATOR_S__Alternatives )
            // InternalShortDSLParser.g:1117:4: rule__COMPARISON_OPERATOR_S__Alternatives
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
    // InternalShortDSLParser.g:1126:1: ruleCOLOR_S : ( ( rule__COLOR_S__Alternatives ) ) ;
    public final void ruleCOLOR_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1130:1: ( ( ( rule__COLOR_S__Alternatives ) ) )
            // InternalShortDSLParser.g:1131:2: ( ( rule__COLOR_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:1131:2: ( ( rule__COLOR_S__Alternatives ) )
            // InternalShortDSLParser.g:1132:3: ( rule__COLOR_S__Alternatives )
            {
             before(grammarAccess.getCOLOR_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:1133:3: ( rule__COLOR_S__Alternatives )
            // InternalShortDSLParser.g:1133:4: rule__COLOR_S__Alternatives
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
    // InternalShortDSLParser.g:1142:1: ruleDISK_SLOT_STATES_S : ( ( rule__DISK_SLOT_STATES_S__Alternatives ) ) ;
    public final void ruleDISK_SLOT_STATES_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1146:1: ( ( ( rule__DISK_SLOT_STATES_S__Alternatives ) ) )
            // InternalShortDSLParser.g:1147:2: ( ( rule__DISK_SLOT_STATES_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:1147:2: ( ( rule__DISK_SLOT_STATES_S__Alternatives ) )
            // InternalShortDSLParser.g:1148:3: ( rule__DISK_SLOT_STATES_S__Alternatives )
            {
             before(grammarAccess.getDISK_SLOT_STATES_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:1149:3: ( rule__DISK_SLOT_STATES_S__Alternatives )
            // InternalShortDSLParser.g:1149:4: rule__DISK_SLOT_STATES_S__Alternatives
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
    // InternalShortDSLParser.g:1158:1: ruleDISK_STATES_S : ( ( rule__DISK_STATES_S__Alternatives ) ) ;
    public final void ruleDISK_STATES_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1162:1: ( ( ( rule__DISK_STATES_S__Alternatives ) ) )
            // InternalShortDSLParser.g:1163:2: ( ( rule__DISK_STATES_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:1163:2: ( ( rule__DISK_STATES_S__Alternatives ) )
            // InternalShortDSLParser.g:1164:3: ( rule__DISK_STATES_S__Alternatives )
            {
             before(grammarAccess.getDISK_STATES_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:1165:3: ( rule__DISK_STATES_S__Alternatives )
            // InternalShortDSLParser.g:1165:4: rule__DISK_STATES_S__Alternatives
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
    // InternalShortDSLParser.g:1174:1: ruleTIME_UNIT_S : ( ( rule__TIME_UNIT_S__Alternatives ) ) ;
    public final void ruleTIME_UNIT_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1178:1: ( ( ( rule__TIME_UNIT_S__Alternatives ) ) )
            // InternalShortDSLParser.g:1179:2: ( ( rule__TIME_UNIT_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:1179:2: ( ( rule__TIME_UNIT_S__Alternatives ) )
            // InternalShortDSLParser.g:1180:3: ( rule__TIME_UNIT_S__Alternatives )
            {
             before(grammarAccess.getTIME_UNIT_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:1181:3: ( rule__TIME_UNIT_S__Alternatives )
            // InternalShortDSLParser.g:1181:4: rule__TIME_UNIT_S__Alternatives
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
    // InternalShortDSLParser.g:1189:1: rule__DSLProgram__Alternatives : ( ( ruleDSLLong ) | ( ruleDSLShort ) );
    public final void rule__DSLProgram__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1193:1: ( ( ruleDSLLong ) | ( ruleDSLShort ) )
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
                    // InternalShortDSLParser.g:1194:2: ( ruleDSLLong )
                    {
                    // InternalShortDSLParser.g:1194:2: ( ruleDSLLong )
                    // InternalShortDSLParser.g:1195:3: ruleDSLLong
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
                    // InternalShortDSLParser.g:1200:2: ( ruleDSLShort )
                    {
                    // InternalShortDSLParser.g:1200:2: ( ruleDSLShort )
                    // InternalShortDSLParser.g:1201:3: ruleDSLShort
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
    // InternalShortDSLParser.g:1210:1: rule__DeviceS__Alternatives : ( ( ruleCraneS ) | ( ruleDiskS ) | ( ruleCameraS ) );
    public final void rule__DeviceS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1214:1: ( ( ruleCraneS ) | ( ruleDiskS ) | ( ruleCameraS ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case LeftParenthesis:
                    {
                    alt2=2;
                    }
                    break;
                case Logging:
                    {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==Colon) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==RULE_BEGIN) ) {
                            int LA2_5 = input.LA(5);

                            if ( (LA2_5==Green||LA2_5==Blue||LA2_5==Red) ) {
                                alt2=3;
                            }
                            else if ( (LA2_5==RULE_ID) ) {
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
                    break;
                case Colon:
                    {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==RULE_BEGIN) ) {
                        int LA2_5 = input.LA(4);

                        if ( (LA2_5==Green||LA2_5==Blue||LA2_5==Red) ) {
                            alt2=3;
                        }
                        else if ( (LA2_5==RULE_ID) ) {
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
                    // InternalShortDSLParser.g:1215:2: ( ruleCraneS )
                    {
                    // InternalShortDSLParser.g:1215:2: ( ruleCraneS )
                    // InternalShortDSLParser.g:1216:3: ruleCraneS
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
                    // InternalShortDSLParser.g:1221:2: ( ruleDiskS )
                    {
                    // InternalShortDSLParser.g:1221:2: ( ruleDiskS )
                    // InternalShortDSLParser.g:1222:3: ruleDiskS
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
                    // InternalShortDSLParser.g:1227:2: ( ruleCameraS )
                    {
                    // InternalShortDSLParser.g:1227:2: ( ruleCameraS )
                    // InternalShortDSLParser.g:1228:3: ruleCameraS
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
    // InternalShortDSLParser.g:1237:1: rule__StatementS__Alternatives : ( ( ruleLoopS ) | ( ruleMoveS ) | ( ruleCraneActionS ) | ( ruleConditionS ) | ( ruleMarkS ) );
    public final void rule__StatementS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1241:1: ( ( ruleLoopS ) | ( ruleMoveS ) | ( ruleCraneActionS ) | ( ruleConditionS ) | ( ruleMarkS ) )
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

                if ( (LA3_2==Scan||LA3_2==LeftParenthesis) ) {
                    alt3=5;
                }
                else if ( (LA3_2==Pickup||LA3_2==Drop||LA3_2==HyphenMinusHyphenMinusGreaterThanSign||LA3_2==HyphenMinusGreaterThanSign) ) {
                    alt3=2;
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
                    // InternalShortDSLParser.g:1242:2: ( ruleLoopS )
                    {
                    // InternalShortDSLParser.g:1242:2: ( ruleLoopS )
                    // InternalShortDSLParser.g:1243:3: ruleLoopS
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
                    // InternalShortDSLParser.g:1248:2: ( ruleMoveS )
                    {
                    // InternalShortDSLParser.g:1248:2: ( ruleMoveS )
                    // InternalShortDSLParser.g:1249:3: ruleMoveS
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
                    // InternalShortDSLParser.g:1254:2: ( ruleCraneActionS )
                    {
                    // InternalShortDSLParser.g:1254:2: ( ruleCraneActionS )
                    // InternalShortDSLParser.g:1255:3: ruleCraneActionS
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
                    // InternalShortDSLParser.g:1260:2: ( ruleConditionS )
                    {
                    // InternalShortDSLParser.g:1260:2: ( ruleConditionS )
                    // InternalShortDSLParser.g:1261:3: ruleConditionS
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
                    // InternalShortDSLParser.g:1266:2: ( ruleMarkS )
                    {
                    // InternalShortDSLParser.g:1266:2: ( ruleMarkS )
                    // InternalShortDSLParser.g:1267:3: ruleMarkS
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


    // $ANTLR start "rule__LoopS__Alternatives"
    // InternalShortDSLParser.g:1276:1: rule__LoopS__Alternatives : ( ( ruleLoopVariableS ) | ( ruleLoopSlotS ) );
    public final void rule__LoopS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1280:1: ( ( ruleLoopVariableS ) | ( ruleLoopSlotS ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Foreach) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==Var) ) {
                    alt4=1;
                }
                else if ( (LA4_1==Slot) ) {
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
                    // InternalShortDSLParser.g:1281:2: ( ruleLoopVariableS )
                    {
                    // InternalShortDSLParser.g:1281:2: ( ruleLoopVariableS )
                    // InternalShortDSLParser.g:1282:3: ruleLoopVariableS
                    {
                     before(grammarAccess.getLoopSAccess().getLoopVariableSParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLoopVariableS();

                    state._fsp--;

                     after(grammarAccess.getLoopSAccess().getLoopVariableSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1287:2: ( ruleLoopSlotS )
                    {
                    // InternalShortDSLParser.g:1287:2: ( ruleLoopSlotS )
                    // InternalShortDSLParser.g:1288:3: ruleLoopSlotS
                    {
                     before(grammarAccess.getLoopSAccess().getLoopSlotSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLoopSlotS();

                    state._fsp--;

                     after(grammarAccess.getLoopSAccess().getLoopSlotSParserRuleCall_1()); 

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
    // $ANTLR end "rule__LoopS__Alternatives"


    // $ANTLR start "rule__MoveS__Alternatives"
    // InternalShortDSLParser.g:1297:1: rule__MoveS__Alternatives : ( ( ruleMoveDiskS ) | ( ruleMoveAnySlotS ) | ( ruleMoveCraneS ) );
    public final void rule__MoveS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1301:1: ( ( ruleMoveDiskS ) | ( ruleMoveAnySlotS ) | ( ruleMoveCraneS ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==HyphenMinusHyphenMinusGreaterThanSign||LA5_1==HyphenMinusGreaterThanSign) ) {
                    alt5=1;
                }
                else if ( (LA5_1==Pickup||LA5_1==Drop) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA5_0>=In_progress && LA5_0<=Complete)||LA5_0==Free) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalShortDSLParser.g:1302:2: ( ruleMoveDiskS )
                    {
                    // InternalShortDSLParser.g:1302:2: ( ruleMoveDiskS )
                    // InternalShortDSLParser.g:1303:3: ruleMoveDiskS
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
                    // InternalShortDSLParser.g:1308:2: ( ruleMoveAnySlotS )
                    {
                    // InternalShortDSLParser.g:1308:2: ( ruleMoveAnySlotS )
                    // InternalShortDSLParser.g:1309:3: ruleMoveAnySlotS
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
                    // InternalShortDSLParser.g:1314:2: ( ruleMoveCraneS )
                    {
                    // InternalShortDSLParser.g:1314:2: ( ruleMoveCraneS )
                    // InternalShortDSLParser.g:1315:3: ruleMoveCraneS
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
    // InternalShortDSLParser.g:1324:1: rule__MoveDiskS__Alternatives_2 : ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) );
    public final void rule__MoveDiskS__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1328:1: ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) )
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
                    // InternalShortDSLParser.g:1329:2: ( HyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1329:2: ( HyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1330:3: HyphenMinusGreaterThanSign
                    {
                     before(grammarAccess.getMoveDiskSAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 
                    match(input,HyphenMinusGreaterThanSign,FOLLOW_2); 
                     after(grammarAccess.getMoveDiskSAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1335:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1335:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1336:3: HyphenMinusHyphenMinusGreaterThanSign
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
    // InternalShortDSLParser.g:1345:1: rule__MoveAnySlotS__Alternatives_3 : ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) );
    public final void rule__MoveAnySlotS__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1349:1: ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) )
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
                    // InternalShortDSLParser.g:1350:2: ( HyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1350:2: ( HyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1351:3: HyphenMinusGreaterThanSign
                    {
                     before(grammarAccess.getMoveAnySlotSAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
                    match(input,HyphenMinusGreaterThanSign,FOLLOW_2); 
                     after(grammarAccess.getMoveAnySlotSAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1356:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1356:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1357:3: HyphenMinusHyphenMinusGreaterThanSign
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
    // InternalShortDSLParser.g:1366:1: rule__MoveCraneS__Alternatives_3 : ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) );
    public final void rule__MoveCraneS__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1370:1: ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==HyphenMinusGreaterThanSign) ) {
                alt8=1;
            }
            else if ( (LA8_0==HyphenMinusHyphenMinusGreaterThanSign) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalShortDSLParser.g:1371:2: ( HyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1371:2: ( HyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1372:3: HyphenMinusGreaterThanSign
                    {
                     before(grammarAccess.getMoveCraneSAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
                    match(input,HyphenMinusGreaterThanSign,FOLLOW_2); 
                     after(grammarAccess.getMoveCraneSAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1377:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:1377:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:1378:3: HyphenMinusHyphenMinusGreaterThanSign
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
    // InternalShortDSLParser.g:1387:1: rule__CraneActionS__Alternatives_1 : ( ( Pickup ) | ( Drop ) );
    public final void rule__CraneActionS__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1391:1: ( ( Pickup ) | ( Drop ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Pickup) ) {
                alt9=1;
            }
            else if ( (LA9_0==Drop) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalShortDSLParser.g:1392:2: ( Pickup )
                    {
                    // InternalShortDSLParser.g:1392:2: ( Pickup )
                    // InternalShortDSLParser.g:1393:3: Pickup
                    {
                     before(grammarAccess.getCraneActionSAccess().getPickupKeyword_1_0()); 
                    match(input,Pickup,FOLLOW_2); 
                     after(grammarAccess.getCraneActionSAccess().getPickupKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1398:2: ( Drop )
                    {
                    // InternalShortDSLParser.g:1398:2: ( Drop )
                    // InternalShortDSLParser.g:1399:3: Drop
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
    // InternalShortDSLParser.g:1408:1: rule__ConditionS__Alternatives : ( ( ruleConditionVariableS ) | ( ruleConditionDeviceS ) | ( ruleConditionSlotS ) );
    public final void rule__ConditionS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1412:1: ( ( ruleConditionVariableS ) | ( ruleConditionDeviceS ) | ( ruleConditionSlotS ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==If) ) {
                switch ( input.LA(2) ) {
                case Var:
                    {
                    alt10=1;
                    }
                    break;
                case Slot:
                    {
                    alt10=3;
                    }
                    break;
                case Dev:
                    {
                    alt10=2;
                    }
                    break;
                default:
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
                    // InternalShortDSLParser.g:1413:2: ( ruleConditionVariableS )
                    {
                    // InternalShortDSLParser.g:1413:2: ( ruleConditionVariableS )
                    // InternalShortDSLParser.g:1414:3: ruleConditionVariableS
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
                    // InternalShortDSLParser.g:1419:2: ( ruleConditionDeviceS )
                    {
                    // InternalShortDSLParser.g:1419:2: ( ruleConditionDeviceS )
                    // InternalShortDSLParser.g:1420:3: ruleConditionDeviceS
                    {
                     before(grammarAccess.getConditionSAccess().getConditionDeviceSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConditionDeviceS();

                    state._fsp--;

                     after(grammarAccess.getConditionSAccess().getConditionDeviceSParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1425:2: ( ruleConditionSlotS )
                    {
                    // InternalShortDSLParser.g:1425:2: ( ruleConditionSlotS )
                    // InternalShortDSLParser.g:1426:3: ruleConditionSlotS
                    {
                     before(grammarAccess.getConditionSAccess().getConditionSlotSParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleConditionSlotS();

                    state._fsp--;

                     after(grammarAccess.getConditionSAccess().getConditionSlotSParserRuleCall_2()); 

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
    // InternalShortDSLParser.g:1435:1: rule__MarkS__Alternatives : ( ( ruleMarkVariableValueS ) | ( ruleMarkCameraValueS ) );
    public final void rule__MarkS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1439:1: ( ( ruleMarkVariableValueS ) | ( ruleMarkCameraValueS ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==Scan) ) {
                    alt11=2;
                }
                else if ( (LA11_1==LeftParenthesis) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalShortDSLParser.g:1440:2: ( ruleMarkVariableValueS )
                    {
                    // InternalShortDSLParser.g:1440:2: ( ruleMarkVariableValueS )
                    // InternalShortDSLParser.g:1441:3: ruleMarkVariableValueS
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
                    // InternalShortDSLParser.g:1446:2: ( ruleMarkCameraValueS )
                    {
                    // InternalShortDSLParser.g:1446:2: ( ruleMarkCameraValueS )
                    // InternalShortDSLParser.g:1447:3: ruleMarkCameraValueS
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
    // InternalShortDSLParser.g:1456:1: rule__VariableValueS__Alternatives : ( ( ( rule__VariableValueS__ValueAssignment_0 ) ) | ( ( rule__VariableValueS__ValueAssignment_1 ) ) | ( ( rule__VariableValueS__ValueAssignment_2 ) ) | ( ( rule__VariableValueS__ValueAssignment_3 ) ) | ( ( rule__VariableValueS__RefAssignment_4 ) ) );
    public final void rule__VariableValueS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1460:1: ( ( ( rule__VariableValueS__ValueAssignment_0 ) ) | ( ( rule__VariableValueS__ValueAssignment_1 ) ) | ( ( rule__VariableValueS__ValueAssignment_2 ) ) | ( ( rule__VariableValueS__ValueAssignment_3 ) ) | ( ( rule__VariableValueS__RefAssignment_4 ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case In_progress:
            case Complete:
            case Free:
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
            case RULE_INT:
                {
                alt12=3;
                }
                break;
            case Empty:
            case Full:
                {
                alt12=4;
                }
                break;
            case RULE_ID:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalShortDSLParser.g:1461:2: ( ( rule__VariableValueS__ValueAssignment_0 ) )
                    {
                    // InternalShortDSLParser.g:1461:2: ( ( rule__VariableValueS__ValueAssignment_0 ) )
                    // InternalShortDSLParser.g:1462:3: ( rule__VariableValueS__ValueAssignment_0 )
                    {
                     before(grammarAccess.getVariableValueSAccess().getValueAssignment_0()); 
                    // InternalShortDSLParser.g:1463:3: ( rule__VariableValueS__ValueAssignment_0 )
                    // InternalShortDSLParser.g:1463:4: rule__VariableValueS__ValueAssignment_0
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
                    // InternalShortDSLParser.g:1467:2: ( ( rule__VariableValueS__ValueAssignment_1 ) )
                    {
                    // InternalShortDSLParser.g:1467:2: ( ( rule__VariableValueS__ValueAssignment_1 ) )
                    // InternalShortDSLParser.g:1468:3: ( rule__VariableValueS__ValueAssignment_1 )
                    {
                     before(grammarAccess.getVariableValueSAccess().getValueAssignment_1()); 
                    // InternalShortDSLParser.g:1469:3: ( rule__VariableValueS__ValueAssignment_1 )
                    // InternalShortDSLParser.g:1469:4: rule__VariableValueS__ValueAssignment_1
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
                    // InternalShortDSLParser.g:1473:2: ( ( rule__VariableValueS__ValueAssignment_2 ) )
                    {
                    // InternalShortDSLParser.g:1473:2: ( ( rule__VariableValueS__ValueAssignment_2 ) )
                    // InternalShortDSLParser.g:1474:3: ( rule__VariableValueS__ValueAssignment_2 )
                    {
                     before(grammarAccess.getVariableValueSAccess().getValueAssignment_2()); 
                    // InternalShortDSLParser.g:1475:3: ( rule__VariableValueS__ValueAssignment_2 )
                    // InternalShortDSLParser.g:1475:4: rule__VariableValueS__ValueAssignment_2
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
                    // InternalShortDSLParser.g:1479:2: ( ( rule__VariableValueS__ValueAssignment_3 ) )
                    {
                    // InternalShortDSLParser.g:1479:2: ( ( rule__VariableValueS__ValueAssignment_3 ) )
                    // InternalShortDSLParser.g:1480:3: ( rule__VariableValueS__ValueAssignment_3 )
                    {
                     before(grammarAccess.getVariableValueSAccess().getValueAssignment_3()); 
                    // InternalShortDSLParser.g:1481:3: ( rule__VariableValueS__ValueAssignment_3 )
                    // InternalShortDSLParser.g:1481:4: rule__VariableValueS__ValueAssignment_3
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
                    // InternalShortDSLParser.g:1485:2: ( ( rule__VariableValueS__RefAssignment_4 ) )
                    {
                    // InternalShortDSLParser.g:1485:2: ( ( rule__VariableValueS__RefAssignment_4 ) )
                    // InternalShortDSLParser.g:1486:3: ( rule__VariableValueS__RefAssignment_4 )
                    {
                     before(grammarAccess.getVariableValueSAccess().getRefAssignment_4()); 
                    // InternalShortDSLParser.g:1487:3: ( rule__VariableValueS__RefAssignment_4 )
                    // InternalShortDSLParser.g:1487:4: rule__VariableValueS__RefAssignment_4
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
    // InternalShortDSLParser.g:1495:1: rule__DeviceValueS__Alternatives : ( ( ( rule__DeviceValueS__ValueAssignment_0 ) ) | ( ( rule__DeviceValueS__ValueAssignment_1 ) ) | ( ( rule__DeviceValueS__ConfigurationValueAssignment_2 ) ) );
    public final void rule__DeviceValueS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1499:1: ( ( ( rule__DeviceValueS__ValueAssignment_0 ) ) | ( ( rule__DeviceValueS__ValueAssignment_1 ) ) | ( ( rule__DeviceValueS__ConfigurationValueAssignment_2 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case Empty:
            case Full:
                {
                alt13=1;
                }
                break;
            case Green:
            case Blue:
            case Red:
                {
                alt13=2;
                }
                break;
            case RULE_ID:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalShortDSLParser.g:1500:2: ( ( rule__DeviceValueS__ValueAssignment_0 ) )
                    {
                    // InternalShortDSLParser.g:1500:2: ( ( rule__DeviceValueS__ValueAssignment_0 ) )
                    // InternalShortDSLParser.g:1501:3: ( rule__DeviceValueS__ValueAssignment_0 )
                    {
                     before(grammarAccess.getDeviceValueSAccess().getValueAssignment_0()); 
                    // InternalShortDSLParser.g:1502:3: ( rule__DeviceValueS__ValueAssignment_0 )
                    // InternalShortDSLParser.g:1502:4: rule__DeviceValueS__ValueAssignment_0
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
                    // InternalShortDSLParser.g:1506:2: ( ( rule__DeviceValueS__ValueAssignment_1 ) )
                    {
                    // InternalShortDSLParser.g:1506:2: ( ( rule__DeviceValueS__ValueAssignment_1 ) )
                    // InternalShortDSLParser.g:1507:3: ( rule__DeviceValueS__ValueAssignment_1 )
                    {
                     before(grammarAccess.getDeviceValueSAccess().getValueAssignment_1()); 
                    // InternalShortDSLParser.g:1508:3: ( rule__DeviceValueS__ValueAssignment_1 )
                    // InternalShortDSLParser.g:1508:4: rule__DeviceValueS__ValueAssignment_1
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
                    // InternalShortDSLParser.g:1512:2: ( ( rule__DeviceValueS__ConfigurationValueAssignment_2 ) )
                    {
                    // InternalShortDSLParser.g:1512:2: ( ( rule__DeviceValueS__ConfigurationValueAssignment_2 ) )
                    // InternalShortDSLParser.g:1513:3: ( rule__DeviceValueS__ConfigurationValueAssignment_2 )
                    {
                     before(grammarAccess.getDeviceValueSAccess().getConfigurationValueAssignment_2()); 
                    // InternalShortDSLParser.g:1514:3: ( rule__DeviceValueS__ConfigurationValueAssignment_2 )
                    // InternalShortDSLParser.g:1514:4: rule__DeviceValueS__ConfigurationValueAssignment_2
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
    // InternalShortDSLParser.g:1522:1: rule__ValueSlotS__Alternatives : ( ( ( rule__ValueSlotS__ValueAssignment_0 ) ) | ( ( rule__ValueSlotS__ValueAssignment_1 ) ) );
    public final void rule__ValueSlotS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1526:1: ( ( ( rule__ValueSlotS__ValueAssignment_0 ) ) | ( ( rule__ValueSlotS__ValueAssignment_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=In_progress && LA14_0<=Complete)||LA14_0==Free) ) {
                alt14=1;
            }
            else if ( (LA14_0==Green||LA14_0==Blue||LA14_0==Red) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalShortDSLParser.g:1527:2: ( ( rule__ValueSlotS__ValueAssignment_0 ) )
                    {
                    // InternalShortDSLParser.g:1527:2: ( ( rule__ValueSlotS__ValueAssignment_0 ) )
                    // InternalShortDSLParser.g:1528:3: ( rule__ValueSlotS__ValueAssignment_0 )
                    {
                     before(grammarAccess.getValueSlotSAccess().getValueAssignment_0()); 
                    // InternalShortDSLParser.g:1529:3: ( rule__ValueSlotS__ValueAssignment_0 )
                    // InternalShortDSLParser.g:1529:4: rule__ValueSlotS__ValueAssignment_0
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
                    // InternalShortDSLParser.g:1533:2: ( ( rule__ValueSlotS__ValueAssignment_1 ) )
                    {
                    // InternalShortDSLParser.g:1533:2: ( ( rule__ValueSlotS__ValueAssignment_1 ) )
                    // InternalShortDSLParser.g:1534:3: ( rule__ValueSlotS__ValueAssignment_1 )
                    {
                     before(grammarAccess.getValueSlotSAccess().getValueAssignment_1()); 
                    // InternalShortDSLParser.g:1535:3: ( rule__ValueSlotS__ValueAssignment_1 )
                    // InternalShortDSLParser.g:1535:4: rule__ValueSlotS__ValueAssignment_1
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
    // InternalShortDSLParser.g:1543:1: rule__DSL_TYPE_ENUM__Alternatives : ( ( ( Long ) ) | ( ( Short ) ) );
    public final void rule__DSL_TYPE_ENUM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1547:1: ( ( ( Long ) ) | ( ( Short ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Long) ) {
                alt15=1;
            }
            else if ( (LA15_0==Short) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalShortDSLParser.g:1548:2: ( ( Long ) )
                    {
                    // InternalShortDSLParser.g:1548:2: ( ( Long ) )
                    // InternalShortDSLParser.g:1549:3: ( Long )
                    {
                     before(grammarAccess.getDSL_TYPE_ENUMAccess().getLONGEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1550:3: ( Long )
                    // InternalShortDSLParser.g:1550:4: Long
                    {
                    match(input,Long,FOLLOW_2); 

                    }

                     after(grammarAccess.getDSL_TYPE_ENUMAccess().getLONGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1554:2: ( ( Short ) )
                    {
                    // InternalShortDSLParser.g:1554:2: ( ( Short ) )
                    // InternalShortDSLParser.g:1555:3: ( Short )
                    {
                     before(grammarAccess.getDSL_TYPE_ENUMAccess().getSHORTEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1556:3: ( Short )
                    // InternalShortDSLParser.g:1556:4: Short
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
    // InternalShortDSLParser.g:1564:1: rule__COMPARISON_OPERATOR_S__Alternatives : ( ( ( EqualsSign ) ) | ( ( LessThanSign ) ) | ( ( GreaterThanSign ) ) | ( ( ExclamationMarkEqualsSign ) ) );
    public final void rule__COMPARISON_OPERATOR_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1568:1: ( ( ( EqualsSign ) ) | ( ( LessThanSign ) ) | ( ( GreaterThanSign ) ) | ( ( ExclamationMarkEqualsSign ) ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case EqualsSign:
                {
                alt16=1;
                }
                break;
            case LessThanSign:
                {
                alt16=2;
                }
                break;
            case GreaterThanSign:
                {
                alt16=3;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalShortDSLParser.g:1569:2: ( ( EqualsSign ) )
                    {
                    // InternalShortDSLParser.g:1569:2: ( ( EqualsSign ) )
                    // InternalShortDSLParser.g:1570:3: ( EqualsSign )
                    {
                     before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1571:3: ( EqualsSign )
                    // InternalShortDSLParser.g:1571:4: EqualsSign
                    {
                    match(input,EqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1575:2: ( ( LessThanSign ) )
                    {
                    // InternalShortDSLParser.g:1575:2: ( ( LessThanSign ) )
                    // InternalShortDSLParser.g:1576:3: ( LessThanSign )
                    {
                     before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getLESS_THANEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1577:3: ( LessThanSign )
                    // InternalShortDSLParser.g:1577:4: LessThanSign
                    {
                    match(input,LessThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getLESS_THANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1581:2: ( ( GreaterThanSign ) )
                    {
                    // InternalShortDSLParser.g:1581:2: ( ( GreaterThanSign ) )
                    // InternalShortDSLParser.g:1582:3: ( GreaterThanSign )
                    {
                     before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getGREATER_THANEnumLiteralDeclaration_2()); 
                    // InternalShortDSLParser.g:1583:3: ( GreaterThanSign )
                    // InternalShortDSLParser.g:1583:4: GreaterThanSign
                    {
                    match(input,GreaterThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getGREATER_THANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalShortDSLParser.g:1587:2: ( ( ExclamationMarkEqualsSign ) )
                    {
                    // InternalShortDSLParser.g:1587:2: ( ( ExclamationMarkEqualsSign ) )
                    // InternalShortDSLParser.g:1588:3: ( ExclamationMarkEqualsSign )
                    {
                     before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getNOTEnumLiteralDeclaration_3()); 
                    // InternalShortDSLParser.g:1589:3: ( ExclamationMarkEqualsSign )
                    // InternalShortDSLParser.g:1589:4: ExclamationMarkEqualsSign
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
    // InternalShortDSLParser.g:1597:1: rule__COLOR_S__Alternatives : ( ( ( Red ) ) | ( ( Green ) ) | ( ( Blue ) ) );
    public final void rule__COLOR_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1601:1: ( ( ( Red ) ) | ( ( Green ) ) | ( ( Blue ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case Red:
                {
                alt17=1;
                }
                break;
            case Green:
                {
                alt17=2;
                }
                break;
            case Blue:
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
                    // InternalShortDSLParser.g:1602:2: ( ( Red ) )
                    {
                    // InternalShortDSLParser.g:1602:2: ( ( Red ) )
                    // InternalShortDSLParser.g:1603:3: ( Red )
                    {
                     before(grammarAccess.getCOLOR_SAccess().getREDEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1604:3: ( Red )
                    // InternalShortDSLParser.g:1604:4: Red
                    {
                    match(input,Red,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOLOR_SAccess().getREDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1608:2: ( ( Green ) )
                    {
                    // InternalShortDSLParser.g:1608:2: ( ( Green ) )
                    // InternalShortDSLParser.g:1609:3: ( Green )
                    {
                     before(grammarAccess.getCOLOR_SAccess().getGREENEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1610:3: ( Green )
                    // InternalShortDSLParser.g:1610:4: Green
                    {
                    match(input,Green,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOLOR_SAccess().getGREENEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1614:2: ( ( Blue ) )
                    {
                    // InternalShortDSLParser.g:1614:2: ( ( Blue ) )
                    // InternalShortDSLParser.g:1615:3: ( Blue )
                    {
                     before(grammarAccess.getCOLOR_SAccess().getBLUEEnumLiteralDeclaration_2()); 
                    // InternalShortDSLParser.g:1616:3: ( Blue )
                    // InternalShortDSLParser.g:1616:4: Blue
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
    // InternalShortDSLParser.g:1624:1: rule__DISK_SLOT_STATES_S__Alternatives : ( ( ( Free ) ) | ( ( In_progress ) ) | ( ( Complete ) ) );
    public final void rule__DISK_SLOT_STATES_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1628:1: ( ( ( Free ) ) | ( ( In_progress ) ) | ( ( Complete ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case Free:
                {
                alt18=1;
                }
                break;
            case In_progress:
                {
                alt18=2;
                }
                break;
            case Complete:
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
                    // InternalShortDSLParser.g:1629:2: ( ( Free ) )
                    {
                    // InternalShortDSLParser.g:1629:2: ( ( Free ) )
                    // InternalShortDSLParser.g:1630:3: ( Free )
                    {
                     before(grammarAccess.getDISK_SLOT_STATES_SAccess().getFREEEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1631:3: ( Free )
                    // InternalShortDSLParser.g:1631:4: Free
                    {
                    match(input,Free,FOLLOW_2); 

                    }

                     after(grammarAccess.getDISK_SLOT_STATES_SAccess().getFREEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1635:2: ( ( In_progress ) )
                    {
                    // InternalShortDSLParser.g:1635:2: ( ( In_progress ) )
                    // InternalShortDSLParser.g:1636:3: ( In_progress )
                    {
                     before(grammarAccess.getDISK_SLOT_STATES_SAccess().getIN_PROGRESSEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1637:3: ( In_progress )
                    // InternalShortDSLParser.g:1637:4: In_progress
                    {
                    match(input,In_progress,FOLLOW_2); 

                    }

                     after(grammarAccess.getDISK_SLOT_STATES_SAccess().getIN_PROGRESSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1641:2: ( ( Complete ) )
                    {
                    // InternalShortDSLParser.g:1641:2: ( ( Complete ) )
                    // InternalShortDSLParser.g:1642:3: ( Complete )
                    {
                     before(grammarAccess.getDISK_SLOT_STATES_SAccess().getCOMPLETEEnumLiteralDeclaration_2()); 
                    // InternalShortDSLParser.g:1643:3: ( Complete )
                    // InternalShortDSLParser.g:1643:4: Complete
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
    // InternalShortDSLParser.g:1651:1: rule__DISK_STATES_S__Alternatives : ( ( ( Full ) ) | ( ( Empty ) ) );
    public final void rule__DISK_STATES_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1655:1: ( ( ( Full ) ) | ( ( Empty ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Full) ) {
                alt19=1;
            }
            else if ( (LA19_0==Empty) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalShortDSLParser.g:1656:2: ( ( Full ) )
                    {
                    // InternalShortDSLParser.g:1656:2: ( ( Full ) )
                    // InternalShortDSLParser.g:1657:3: ( Full )
                    {
                     before(grammarAccess.getDISK_STATES_SAccess().getFULLEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1658:3: ( Full )
                    // InternalShortDSLParser.g:1658:4: Full
                    {
                    match(input,Full,FOLLOW_2); 

                    }

                     after(grammarAccess.getDISK_STATES_SAccess().getFULLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1662:2: ( ( Empty ) )
                    {
                    // InternalShortDSLParser.g:1662:2: ( ( Empty ) )
                    // InternalShortDSLParser.g:1663:3: ( Empty )
                    {
                     before(grammarAccess.getDISK_STATES_SAccess().getEMPTYEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1664:3: ( Empty )
                    // InternalShortDSLParser.g:1664:4: Empty
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
    // InternalShortDSLParser.g:1672:1: rule__TIME_UNIT_S__Alternatives : ( ( ( S ) ) | ( ( M ) ) | ( ( H ) ) );
    public final void rule__TIME_UNIT_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1676:1: ( ( ( S ) ) | ( ( M ) ) | ( ( H ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case S:
                {
                alt20=1;
                }
                break;
            case M:
                {
                alt20=2;
                }
                break;
            case H:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalShortDSLParser.g:1677:2: ( ( S ) )
                    {
                    // InternalShortDSLParser.g:1677:2: ( ( S ) )
                    // InternalShortDSLParser.g:1678:3: ( S )
                    {
                     before(grammarAccess.getTIME_UNIT_SAccess().getSECONDEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1679:3: ( S )
                    // InternalShortDSLParser.g:1679:4: S
                    {
                    match(input,S,FOLLOW_2); 

                    }

                     after(grammarAccess.getTIME_UNIT_SAccess().getSECONDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1683:2: ( ( M ) )
                    {
                    // InternalShortDSLParser.g:1683:2: ( ( M ) )
                    // InternalShortDSLParser.g:1684:3: ( M )
                    {
                     before(grammarAccess.getTIME_UNIT_SAccess().getMINUTEEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1685:3: ( M )
                    // InternalShortDSLParser.g:1685:4: M
                    {
                    match(input,M,FOLLOW_2); 

                    }

                     after(grammarAccess.getTIME_UNIT_SAccess().getMINUTEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1689:2: ( ( H ) )
                    {
                    // InternalShortDSLParser.g:1689:2: ( ( H ) )
                    // InternalShortDSLParser.g:1690:3: ( H )
                    {
                     before(grammarAccess.getTIME_UNIT_SAccess().getHOUREnumLiteralDeclaration_2()); 
                    // InternalShortDSLParser.g:1691:3: ( H )
                    // InternalShortDSLParser.g:1691:4: H
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
    // InternalShortDSLParser.g:1699:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1703:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalShortDSLParser.g:1704:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalShortDSLParser.g:1711:1: rule__Model__Group__0__Impl : ( Use ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1715:1: ( ( Use ) )
            // InternalShortDSLParser.g:1716:1: ( Use )
            {
            // InternalShortDSLParser.g:1716:1: ( Use )
            // InternalShortDSLParser.g:1717:2: Use
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
    // InternalShortDSLParser.g:1726:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1730:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalShortDSLParser.g:1731:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalShortDSLParser.g:1738:1: rule__Model__Group__1__Impl : ( ( rule__Model__DslTypeAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1742:1: ( ( ( rule__Model__DslTypeAssignment_1 ) ) )
            // InternalShortDSLParser.g:1743:1: ( ( rule__Model__DslTypeAssignment_1 ) )
            {
            // InternalShortDSLParser.g:1743:1: ( ( rule__Model__DslTypeAssignment_1 ) )
            // InternalShortDSLParser.g:1744:2: ( rule__Model__DslTypeAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getDslTypeAssignment_1()); 
            // InternalShortDSLParser.g:1745:2: ( rule__Model__DslTypeAssignment_1 )
            // InternalShortDSLParser.g:1745:3: rule__Model__DslTypeAssignment_1
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
    // InternalShortDSLParser.g:1753:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1757:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalShortDSLParser.g:1758:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalShortDSLParser.g:1765:1: rule__Model__Group__2__Impl : ( Dsl ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1769:1: ( ( Dsl ) )
            // InternalShortDSLParser.g:1770:1: ( Dsl )
            {
            // InternalShortDSLParser.g:1770:1: ( Dsl )
            // InternalShortDSLParser.g:1771:2: Dsl
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
    // InternalShortDSLParser.g:1780:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1784:1: ( rule__Model__Group__3__Impl )
            // InternalShortDSLParser.g:1785:2: rule__Model__Group__3__Impl
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
    // InternalShortDSLParser.g:1791:1: rule__Model__Group__3__Impl : ( ( rule__Model__DslProgramAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1795:1: ( ( ( rule__Model__DslProgramAssignment_3 ) ) )
            // InternalShortDSLParser.g:1796:1: ( ( rule__Model__DslProgramAssignment_3 ) )
            {
            // InternalShortDSLParser.g:1796:1: ( ( rule__Model__DslProgramAssignment_3 ) )
            // InternalShortDSLParser.g:1797:2: ( rule__Model__DslProgramAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getDslProgramAssignment_3()); 
            // InternalShortDSLParser.g:1798:2: ( rule__Model__DslProgramAssignment_3 )
            // InternalShortDSLParser.g:1798:3: rule__Model__DslProgramAssignment_3
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
    // InternalShortDSLParser.g:1807:1: rule__DSLLong__Group__0 : rule__DSLLong__Group__0__Impl rule__DSLLong__Group__1 ;
    public final void rule__DSLLong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1811:1: ( rule__DSLLong__Group__0__Impl rule__DSLLong__Group__1 )
            // InternalShortDSLParser.g:1812:2: rule__DSLLong__Group__0__Impl rule__DSLLong__Group__1
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
    // InternalShortDSLParser.g:1819:1: rule__DSLLong__Group__0__Impl : ( () ) ;
    public final void rule__DSLLong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1823:1: ( ( () ) )
            // InternalShortDSLParser.g:1824:1: ( () )
            {
            // InternalShortDSLParser.g:1824:1: ( () )
            // InternalShortDSLParser.g:1825:2: ()
            {
             before(grammarAccess.getDSLLongAccess().getDSLLongAction_0()); 
            // InternalShortDSLParser.g:1826:2: ()
            // InternalShortDSLParser.g:1826:3: 
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
    // InternalShortDSLParser.g:1834:1: rule__DSLLong__Group__1 : rule__DSLLong__Group__1__Impl rule__DSLLong__Group__2 ;
    public final void rule__DSLLong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1838:1: ( rule__DSLLong__Group__1__Impl rule__DSLLong__Group__2 )
            // InternalShortDSLParser.g:1839:2: rule__DSLLong__Group__1__Impl rule__DSLLong__Group__2
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
    // InternalShortDSLParser.g:1846:1: rule__DSLLong__Group__1__Impl : ( Test ) ;
    public final void rule__DSLLong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1850:1: ( ( Test ) )
            // InternalShortDSLParser.g:1851:1: ( Test )
            {
            // InternalShortDSLParser.g:1851:1: ( Test )
            // InternalShortDSLParser.g:1852:2: Test
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
    // InternalShortDSLParser.g:1861:1: rule__DSLLong__Group__2 : rule__DSLLong__Group__2__Impl ;
    public final void rule__DSLLong__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1865:1: ( rule__DSLLong__Group__2__Impl )
            // InternalShortDSLParser.g:1866:2: rule__DSLLong__Group__2__Impl
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
    // InternalShortDSLParser.g:1872:1: rule__DSLLong__Group__2__Impl : ( ( rule__DSLLong__NameAssignment_2 ) ) ;
    public final void rule__DSLLong__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1876:1: ( ( ( rule__DSLLong__NameAssignment_2 ) ) )
            // InternalShortDSLParser.g:1877:1: ( ( rule__DSLLong__NameAssignment_2 ) )
            {
            // InternalShortDSLParser.g:1877:1: ( ( rule__DSLLong__NameAssignment_2 ) )
            // InternalShortDSLParser.g:1878:2: ( rule__DSLLong__NameAssignment_2 )
            {
             before(grammarAccess.getDSLLongAccess().getNameAssignment_2()); 
            // InternalShortDSLParser.g:1879:2: ( rule__DSLLong__NameAssignment_2 )
            // InternalShortDSLParser.g:1879:3: rule__DSLLong__NameAssignment_2
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
    // InternalShortDSLParser.g:1888:1: rule__DSLShort__Group__0 : rule__DSLShort__Group__0__Impl rule__DSLShort__Group__1 ;
    public final void rule__DSLShort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1892:1: ( rule__DSLShort__Group__0__Impl rule__DSLShort__Group__1 )
            // InternalShortDSLParser.g:1893:2: rule__DSLShort__Group__0__Impl rule__DSLShort__Group__1
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
    // InternalShortDSLParser.g:1900:1: rule__DSLShort__Group__0__Impl : ( () ) ;
    public final void rule__DSLShort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1904:1: ( ( () ) )
            // InternalShortDSLParser.g:1905:1: ( () )
            {
            // InternalShortDSLParser.g:1905:1: ( () )
            // InternalShortDSLParser.g:1906:2: ()
            {
             before(grammarAccess.getDSLShortAccess().getDSLShortAction_0()); 
            // InternalShortDSLParser.g:1907:2: ()
            // InternalShortDSLParser.g:1907:3: 
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
    // InternalShortDSLParser.g:1915:1: rule__DSLShort__Group__1 : rule__DSLShort__Group__1__Impl rule__DSLShort__Group__2 ;
    public final void rule__DSLShort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1919:1: ( rule__DSLShort__Group__1__Impl rule__DSLShort__Group__2 )
            // InternalShortDSLParser.g:1920:2: rule__DSLShort__Group__1__Impl rule__DSLShort__Group__2
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
    // InternalShortDSLParser.g:1927:1: rule__DSLShort__Group__1__Impl : ( ( rule__DSLShort__ConfigurationAssignment_1 ) ) ;
    public final void rule__DSLShort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1931:1: ( ( ( rule__DSLShort__ConfigurationAssignment_1 ) ) )
            // InternalShortDSLParser.g:1932:1: ( ( rule__DSLShort__ConfigurationAssignment_1 ) )
            {
            // InternalShortDSLParser.g:1932:1: ( ( rule__DSLShort__ConfigurationAssignment_1 ) )
            // InternalShortDSLParser.g:1933:2: ( rule__DSLShort__ConfigurationAssignment_1 )
            {
             before(grammarAccess.getDSLShortAccess().getConfigurationAssignment_1()); 
            // InternalShortDSLParser.g:1934:2: ( rule__DSLShort__ConfigurationAssignment_1 )
            // InternalShortDSLParser.g:1934:3: rule__DSLShort__ConfigurationAssignment_1
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
    // InternalShortDSLParser.g:1942:1: rule__DSLShort__Group__2 : rule__DSLShort__Group__2__Impl ;
    public final void rule__DSLShort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1946:1: ( rule__DSLShort__Group__2__Impl )
            // InternalShortDSLParser.g:1947:2: rule__DSLShort__Group__2__Impl
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
    // InternalShortDSLParser.g:1953:1: rule__DSLShort__Group__2__Impl : ( ( rule__DSLShort__DiskHandlingsAssignment_2 )* ) ;
    public final void rule__DSLShort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1957:1: ( ( ( rule__DSLShort__DiskHandlingsAssignment_2 )* ) )
            // InternalShortDSLParser.g:1958:1: ( ( rule__DSLShort__DiskHandlingsAssignment_2 )* )
            {
            // InternalShortDSLParser.g:1958:1: ( ( rule__DSLShort__DiskHandlingsAssignment_2 )* )
            // InternalShortDSLParser.g:1959:2: ( rule__DSLShort__DiskHandlingsAssignment_2 )*
            {
             before(grammarAccess.getDSLShortAccess().getDiskHandlingsAssignment_2()); 
            // InternalShortDSLParser.g:1960:2: ( rule__DSLShort__DiskHandlingsAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Handle) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalShortDSLParser.g:1960:3: rule__DSLShort__DiskHandlingsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DSLShort__DiskHandlingsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalShortDSLParser.g:1969:1: rule__ConfigurationS__Group__0 : rule__ConfigurationS__Group__0__Impl rule__ConfigurationS__Group__1 ;
    public final void rule__ConfigurationS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1973:1: ( rule__ConfigurationS__Group__0__Impl rule__ConfigurationS__Group__1 )
            // InternalShortDSLParser.g:1974:2: rule__ConfigurationS__Group__0__Impl rule__ConfigurationS__Group__1
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
    // InternalShortDSLParser.g:1981:1: rule__ConfigurationS__Group__0__Impl : ( Devices ) ;
    public final void rule__ConfigurationS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1985:1: ( ( Devices ) )
            // InternalShortDSLParser.g:1986:1: ( Devices )
            {
            // InternalShortDSLParser.g:1986:1: ( Devices )
            // InternalShortDSLParser.g:1987:2: Devices
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
    // InternalShortDSLParser.g:1996:1: rule__ConfigurationS__Group__1 : rule__ConfigurationS__Group__1__Impl rule__ConfigurationS__Group__2 ;
    public final void rule__ConfigurationS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2000:1: ( rule__ConfigurationS__Group__1__Impl rule__ConfigurationS__Group__2 )
            // InternalShortDSLParser.g:2001:2: rule__ConfigurationS__Group__1__Impl rule__ConfigurationS__Group__2
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
    // InternalShortDSLParser.g:2008:1: rule__ConfigurationS__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ConfigurationS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2012:1: ( ( LeftCurlyBracket ) )
            // InternalShortDSLParser.g:2013:1: ( LeftCurlyBracket )
            {
            // InternalShortDSLParser.g:2013:1: ( LeftCurlyBracket )
            // InternalShortDSLParser.g:2014:2: LeftCurlyBracket
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
    // InternalShortDSLParser.g:2023:1: rule__ConfigurationS__Group__2 : rule__ConfigurationS__Group__2__Impl rule__ConfigurationS__Group__3 ;
    public final void rule__ConfigurationS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2027:1: ( rule__ConfigurationS__Group__2__Impl rule__ConfigurationS__Group__3 )
            // InternalShortDSLParser.g:2028:2: rule__ConfigurationS__Group__2__Impl rule__ConfigurationS__Group__3
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
    // InternalShortDSLParser.g:2035:1: rule__ConfigurationS__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ConfigurationS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2039:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:2040:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:2040:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:2041:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:2050:1: rule__ConfigurationS__Group__3 : rule__ConfigurationS__Group__3__Impl rule__ConfigurationS__Group__4 ;
    public final void rule__ConfigurationS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2054:1: ( rule__ConfigurationS__Group__3__Impl rule__ConfigurationS__Group__4 )
            // InternalShortDSLParser.g:2055:2: rule__ConfigurationS__Group__3__Impl rule__ConfigurationS__Group__4
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
    // InternalShortDSLParser.g:2062:1: rule__ConfigurationS__Group__3__Impl : ( ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* ) ) ;
    public final void rule__ConfigurationS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2066:1: ( ( ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* ) ) )
            // InternalShortDSLParser.g:2067:1: ( ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* ) )
            {
            // InternalShortDSLParser.g:2067:1: ( ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* ) )
            // InternalShortDSLParser.g:2068:2: ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* )
            {
            // InternalShortDSLParser.g:2068:2: ( ( rule__ConfigurationS__DevicesAssignment_3 ) )
            // InternalShortDSLParser.g:2069:3: ( rule__ConfigurationS__DevicesAssignment_3 )
            {
             before(grammarAccess.getConfigurationSAccess().getDevicesAssignment_3()); 
            // InternalShortDSLParser.g:2070:3: ( rule__ConfigurationS__DevicesAssignment_3 )
            // InternalShortDSLParser.g:2070:4: rule__ConfigurationS__DevicesAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__ConfigurationS__DevicesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationSAccess().getDevicesAssignment_3()); 

            }

            // InternalShortDSLParser.g:2073:2: ( ( rule__ConfigurationS__DevicesAssignment_3 )* )
            // InternalShortDSLParser.g:2074:3: ( rule__ConfigurationS__DevicesAssignment_3 )*
            {
             before(grammarAccess.getConfigurationSAccess().getDevicesAssignment_3()); 
            // InternalShortDSLParser.g:2075:3: ( rule__ConfigurationS__DevicesAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalShortDSLParser.g:2075:4: rule__ConfigurationS__DevicesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ConfigurationS__DevicesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalShortDSLParser.g:2084:1: rule__ConfigurationS__Group__4 : rule__ConfigurationS__Group__4__Impl rule__ConfigurationS__Group__5 ;
    public final void rule__ConfigurationS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2088:1: ( rule__ConfigurationS__Group__4__Impl rule__ConfigurationS__Group__5 )
            // InternalShortDSLParser.g:2089:2: rule__ConfigurationS__Group__4__Impl rule__ConfigurationS__Group__5
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
    // InternalShortDSLParser.g:2096:1: rule__ConfigurationS__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ConfigurationS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2100:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:2101:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:2101:1: ( RULE_END )
            // InternalShortDSLParser.g:2102:2: RULE_END
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
    // InternalShortDSLParser.g:2111:1: rule__ConfigurationS__Group__5 : rule__ConfigurationS__Group__5__Impl ;
    public final void rule__ConfigurationS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2115:1: ( rule__ConfigurationS__Group__5__Impl )
            // InternalShortDSLParser.g:2116:2: rule__ConfigurationS__Group__5__Impl
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
    // InternalShortDSLParser.g:2122:1: rule__ConfigurationS__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__ConfigurationS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2126:1: ( ( RightCurlyBracket ) )
            // InternalShortDSLParser.g:2127:1: ( RightCurlyBracket )
            {
            // InternalShortDSLParser.g:2127:1: ( RightCurlyBracket )
            // InternalShortDSLParser.g:2128:2: RightCurlyBracket
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
    // InternalShortDSLParser.g:2138:1: rule__CraneS__Group__0 : rule__CraneS__Group__0__Impl rule__CraneS__Group__1 ;
    public final void rule__CraneS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2142:1: ( rule__CraneS__Group__0__Impl rule__CraneS__Group__1 )
            // InternalShortDSLParser.g:2143:2: rule__CraneS__Group__0__Impl rule__CraneS__Group__1
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
    // InternalShortDSLParser.g:2150:1: rule__CraneS__Group__0__Impl : ( () ) ;
    public final void rule__CraneS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2154:1: ( ( () ) )
            // InternalShortDSLParser.g:2155:1: ( () )
            {
            // InternalShortDSLParser.g:2155:1: ( () )
            // InternalShortDSLParser.g:2156:2: ()
            {
             before(grammarAccess.getCraneSAccess().getCraneAction_0()); 
            // InternalShortDSLParser.g:2157:2: ()
            // InternalShortDSLParser.g:2157:3: 
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
    // InternalShortDSLParser.g:2165:1: rule__CraneS__Group__1 : rule__CraneS__Group__1__Impl rule__CraneS__Group__2 ;
    public final void rule__CraneS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2169:1: ( rule__CraneS__Group__1__Impl rule__CraneS__Group__2 )
            // InternalShortDSLParser.g:2170:2: rule__CraneS__Group__1__Impl rule__CraneS__Group__2
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
    // InternalShortDSLParser.g:2177:1: rule__CraneS__Group__1__Impl : ( ( rule__CraneS__NameAssignment_1 ) ) ;
    public final void rule__CraneS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2181:1: ( ( ( rule__CraneS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2182:1: ( ( rule__CraneS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2182:1: ( ( rule__CraneS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2183:2: ( rule__CraneS__NameAssignment_1 )
            {
             before(grammarAccess.getCraneSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2184:2: ( rule__CraneS__NameAssignment_1 )
            // InternalShortDSLParser.g:2184:3: rule__CraneS__NameAssignment_1
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
    // InternalShortDSLParser.g:2192:1: rule__CraneS__Group__2 : rule__CraneS__Group__2__Impl rule__CraneS__Group__3 ;
    public final void rule__CraneS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2196:1: ( rule__CraneS__Group__2__Impl rule__CraneS__Group__3 )
            // InternalShortDSLParser.g:2197:2: rule__CraneS__Group__2__Impl rule__CraneS__Group__3
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
    // InternalShortDSLParser.g:2204:1: rule__CraneS__Group__2__Impl : ( ( rule__CraneS__LoggingAssignment_2 )? ) ;
    public final void rule__CraneS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2208:1: ( ( ( rule__CraneS__LoggingAssignment_2 )? ) )
            // InternalShortDSLParser.g:2209:1: ( ( rule__CraneS__LoggingAssignment_2 )? )
            {
            // InternalShortDSLParser.g:2209:1: ( ( rule__CraneS__LoggingAssignment_2 )? )
            // InternalShortDSLParser.g:2210:2: ( rule__CraneS__LoggingAssignment_2 )?
            {
             before(grammarAccess.getCraneSAccess().getLoggingAssignment_2()); 
            // InternalShortDSLParser.g:2211:2: ( rule__CraneS__LoggingAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Logging) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalShortDSLParser.g:2211:3: rule__CraneS__LoggingAssignment_2
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
    // InternalShortDSLParser.g:2219:1: rule__CraneS__Group__3 : rule__CraneS__Group__3__Impl rule__CraneS__Group__4 ;
    public final void rule__CraneS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2223:1: ( rule__CraneS__Group__3__Impl rule__CraneS__Group__4 )
            // InternalShortDSLParser.g:2224:2: rule__CraneS__Group__3__Impl rule__CraneS__Group__4
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
    // InternalShortDSLParser.g:2231:1: rule__CraneS__Group__3__Impl : ( Colon ) ;
    public final void rule__CraneS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2235:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2236:1: ( Colon )
            {
            // InternalShortDSLParser.g:2236:1: ( Colon )
            // InternalShortDSLParser.g:2237:2: Colon
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
    // InternalShortDSLParser.g:2246:1: rule__CraneS__Group__4 : rule__CraneS__Group__4__Impl rule__CraneS__Group__5 ;
    public final void rule__CraneS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2250:1: ( rule__CraneS__Group__4__Impl rule__CraneS__Group__5 )
            // InternalShortDSLParser.g:2251:2: rule__CraneS__Group__4__Impl rule__CraneS__Group__5
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
    // InternalShortDSLParser.g:2258:1: rule__CraneS__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__CraneS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2262:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:2263:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:2263:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:2264:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:2273:1: rule__CraneS__Group__5 : rule__CraneS__Group__5__Impl rule__CraneS__Group__6 ;
    public final void rule__CraneS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2277:1: ( rule__CraneS__Group__5__Impl rule__CraneS__Group__6 )
            // InternalShortDSLParser.g:2278:2: rule__CraneS__Group__5__Impl rule__CraneS__Group__6
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
    // InternalShortDSLParser.g:2285:1: rule__CraneS__Group__5__Impl : ( ( ( rule__CraneS__TargetsAssignment_5 ) ) ( ( rule__CraneS__TargetsAssignment_5 )* ) ) ;
    public final void rule__CraneS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2289:1: ( ( ( ( rule__CraneS__TargetsAssignment_5 ) ) ( ( rule__CraneS__TargetsAssignment_5 )* ) ) )
            // InternalShortDSLParser.g:2290:1: ( ( ( rule__CraneS__TargetsAssignment_5 ) ) ( ( rule__CraneS__TargetsAssignment_5 )* ) )
            {
            // InternalShortDSLParser.g:2290:1: ( ( ( rule__CraneS__TargetsAssignment_5 ) ) ( ( rule__CraneS__TargetsAssignment_5 )* ) )
            // InternalShortDSLParser.g:2291:2: ( ( rule__CraneS__TargetsAssignment_5 ) ) ( ( rule__CraneS__TargetsAssignment_5 )* )
            {
            // InternalShortDSLParser.g:2291:2: ( ( rule__CraneS__TargetsAssignment_5 ) )
            // InternalShortDSLParser.g:2292:3: ( rule__CraneS__TargetsAssignment_5 )
            {
             before(grammarAccess.getCraneSAccess().getTargetsAssignment_5()); 
            // InternalShortDSLParser.g:2293:3: ( rule__CraneS__TargetsAssignment_5 )
            // InternalShortDSLParser.g:2293:4: rule__CraneS__TargetsAssignment_5
            {
            pushFollow(FOLLOW_13);
            rule__CraneS__TargetsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCraneSAccess().getTargetsAssignment_5()); 

            }

            // InternalShortDSLParser.g:2296:2: ( ( rule__CraneS__TargetsAssignment_5 )* )
            // InternalShortDSLParser.g:2297:3: ( rule__CraneS__TargetsAssignment_5 )*
            {
             before(grammarAccess.getCraneSAccess().getTargetsAssignment_5()); 
            // InternalShortDSLParser.g:2298:3: ( rule__CraneS__TargetsAssignment_5 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalShortDSLParser.g:2298:4: rule__CraneS__TargetsAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__CraneS__TargetsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalShortDSLParser.g:2307:1: rule__CraneS__Group__6 : rule__CraneS__Group__6__Impl ;
    public final void rule__CraneS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2311:1: ( rule__CraneS__Group__6__Impl )
            // InternalShortDSLParser.g:2312:2: rule__CraneS__Group__6__Impl
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
    // InternalShortDSLParser.g:2318:1: rule__CraneS__Group__6__Impl : ( RULE_END ) ;
    public final void rule__CraneS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2322:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:2323:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:2323:1: ( RULE_END )
            // InternalShortDSLParser.g:2324:2: RULE_END
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
    // InternalShortDSLParser.g:2334:1: rule__CraneZoneS__Group__0 : rule__CraneZoneS__Group__0__Impl rule__CraneZoneS__Group__1 ;
    public final void rule__CraneZoneS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2338:1: ( rule__CraneZoneS__Group__0__Impl rule__CraneZoneS__Group__1 )
            // InternalShortDSLParser.g:2339:2: rule__CraneZoneS__Group__0__Impl rule__CraneZoneS__Group__1
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
    // InternalShortDSLParser.g:2346:1: rule__CraneZoneS__Group__0__Impl : ( () ) ;
    public final void rule__CraneZoneS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2350:1: ( ( () ) )
            // InternalShortDSLParser.g:2351:1: ( () )
            {
            // InternalShortDSLParser.g:2351:1: ( () )
            // InternalShortDSLParser.g:2352:2: ()
            {
             before(grammarAccess.getCraneZoneSAccess().getCraneZoneAction_0()); 
            // InternalShortDSLParser.g:2353:2: ()
            // InternalShortDSLParser.g:2353:3: 
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
    // InternalShortDSLParser.g:2361:1: rule__CraneZoneS__Group__1 : rule__CraneZoneS__Group__1__Impl rule__CraneZoneS__Group__2 ;
    public final void rule__CraneZoneS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2365:1: ( rule__CraneZoneS__Group__1__Impl rule__CraneZoneS__Group__2 )
            // InternalShortDSLParser.g:2366:2: rule__CraneZoneS__Group__1__Impl rule__CraneZoneS__Group__2
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
    // InternalShortDSLParser.g:2373:1: rule__CraneZoneS__Group__1__Impl : ( ( rule__CraneZoneS__NameAssignment_1 ) ) ;
    public final void rule__CraneZoneS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2377:1: ( ( ( rule__CraneZoneS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2378:1: ( ( rule__CraneZoneS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2378:1: ( ( rule__CraneZoneS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2379:2: ( rule__CraneZoneS__NameAssignment_1 )
            {
             before(grammarAccess.getCraneZoneSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2380:2: ( rule__CraneZoneS__NameAssignment_1 )
            // InternalShortDSLParser.g:2380:3: rule__CraneZoneS__NameAssignment_1
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
    // InternalShortDSLParser.g:2388:1: rule__CraneZoneS__Group__2 : rule__CraneZoneS__Group__2__Impl rule__CraneZoneS__Group__3 ;
    public final void rule__CraneZoneS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2392:1: ( rule__CraneZoneS__Group__2__Impl rule__CraneZoneS__Group__3 )
            // InternalShortDSLParser.g:2393:2: rule__CraneZoneS__Group__2__Impl rule__CraneZoneS__Group__3
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
    // InternalShortDSLParser.g:2400:1: rule__CraneZoneS__Group__2__Impl : ( Colon ) ;
    public final void rule__CraneZoneS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2404:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2405:1: ( Colon )
            {
            // InternalShortDSLParser.g:2405:1: ( Colon )
            // InternalShortDSLParser.g:2406:2: Colon
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
    // InternalShortDSLParser.g:2415:1: rule__CraneZoneS__Group__3 : rule__CraneZoneS__Group__3__Impl rule__CraneZoneS__Group__4 ;
    public final void rule__CraneZoneS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2419:1: ( rule__CraneZoneS__Group__3__Impl rule__CraneZoneS__Group__4 )
            // InternalShortDSLParser.g:2420:2: rule__CraneZoneS__Group__3__Impl rule__CraneZoneS__Group__4
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
    // InternalShortDSLParser.g:2427:1: rule__CraneZoneS__Group__3__Impl : ( ( rule__CraneZoneS__ZoneValueAssignment_3 ) ) ;
    public final void rule__CraneZoneS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2431:1: ( ( ( rule__CraneZoneS__ZoneValueAssignment_3 ) ) )
            // InternalShortDSLParser.g:2432:1: ( ( rule__CraneZoneS__ZoneValueAssignment_3 ) )
            {
            // InternalShortDSLParser.g:2432:1: ( ( rule__CraneZoneS__ZoneValueAssignment_3 ) )
            // InternalShortDSLParser.g:2433:2: ( rule__CraneZoneS__ZoneValueAssignment_3 )
            {
             before(grammarAccess.getCraneZoneSAccess().getZoneValueAssignment_3()); 
            // InternalShortDSLParser.g:2434:2: ( rule__CraneZoneS__ZoneValueAssignment_3 )
            // InternalShortDSLParser.g:2434:3: rule__CraneZoneS__ZoneValueAssignment_3
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
    // InternalShortDSLParser.g:2442:1: rule__CraneZoneS__Group__4 : rule__CraneZoneS__Group__4__Impl ;
    public final void rule__CraneZoneS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2446:1: ( rule__CraneZoneS__Group__4__Impl )
            // InternalShortDSLParser.g:2447:2: rule__CraneZoneS__Group__4__Impl
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
    // InternalShortDSLParser.g:2453:1: rule__CraneZoneS__Group__4__Impl : ( ( Comma )? ) ;
    public final void rule__CraneZoneS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2457:1: ( ( ( Comma )? ) )
            // InternalShortDSLParser.g:2458:1: ( ( Comma )? )
            {
            // InternalShortDSLParser.g:2458:1: ( ( Comma )? )
            // InternalShortDSLParser.g:2459:2: ( Comma )?
            {
             before(grammarAccess.getCraneZoneSAccess().getCommaKeyword_4()); 
            // InternalShortDSLParser.g:2460:2: ( Comma )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Comma) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalShortDSLParser.g:2460:3: Comma
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
    // InternalShortDSLParser.g:2469:1: rule__DiskS__Group__0 : rule__DiskS__Group__0__Impl rule__DiskS__Group__1 ;
    public final void rule__DiskS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2473:1: ( rule__DiskS__Group__0__Impl rule__DiskS__Group__1 )
            // InternalShortDSLParser.g:2474:2: rule__DiskS__Group__0__Impl rule__DiskS__Group__1
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
    // InternalShortDSLParser.g:2481:1: rule__DiskS__Group__0__Impl : ( () ) ;
    public final void rule__DiskS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2485:1: ( ( () ) )
            // InternalShortDSLParser.g:2486:1: ( () )
            {
            // InternalShortDSLParser.g:2486:1: ( () )
            // InternalShortDSLParser.g:2487:2: ()
            {
             before(grammarAccess.getDiskSAccess().getDiskAction_0()); 
            // InternalShortDSLParser.g:2488:2: ()
            // InternalShortDSLParser.g:2488:3: 
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
    // InternalShortDSLParser.g:2496:1: rule__DiskS__Group__1 : rule__DiskS__Group__1__Impl rule__DiskS__Group__2 ;
    public final void rule__DiskS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2500:1: ( rule__DiskS__Group__1__Impl rule__DiskS__Group__2 )
            // InternalShortDSLParser.g:2501:2: rule__DiskS__Group__1__Impl rule__DiskS__Group__2
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
    // InternalShortDSLParser.g:2508:1: rule__DiskS__Group__1__Impl : ( ( rule__DiskS__NameAssignment_1 ) ) ;
    public final void rule__DiskS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2512:1: ( ( ( rule__DiskS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2513:1: ( ( rule__DiskS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2513:1: ( ( rule__DiskS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2514:2: ( rule__DiskS__NameAssignment_1 )
            {
             before(grammarAccess.getDiskSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2515:2: ( rule__DiskS__NameAssignment_1 )
            // InternalShortDSLParser.g:2515:3: rule__DiskS__NameAssignment_1
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
    // InternalShortDSLParser.g:2523:1: rule__DiskS__Group__2 : rule__DiskS__Group__2__Impl rule__DiskS__Group__3 ;
    public final void rule__DiskS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2527:1: ( rule__DiskS__Group__2__Impl rule__DiskS__Group__3 )
            // InternalShortDSLParser.g:2528:2: rule__DiskS__Group__2__Impl rule__DiskS__Group__3
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
    // InternalShortDSLParser.g:2535:1: rule__DiskS__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__DiskS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2539:1: ( ( LeftParenthesis ) )
            // InternalShortDSLParser.g:2540:1: ( LeftParenthesis )
            {
            // InternalShortDSLParser.g:2540:1: ( LeftParenthesis )
            // InternalShortDSLParser.g:2541:2: LeftParenthesis
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
    // InternalShortDSLParser.g:2550:1: rule__DiskS__Group__3 : rule__DiskS__Group__3__Impl rule__DiskS__Group__4 ;
    public final void rule__DiskS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2554:1: ( rule__DiskS__Group__3__Impl rule__DiskS__Group__4 )
            // InternalShortDSLParser.g:2555:2: rule__DiskS__Group__3__Impl rule__DiskS__Group__4
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
    // InternalShortDSLParser.g:2562:1: rule__DiskS__Group__3__Impl : ( ( rule__DiskS__NSlotsAssignment_3 ) ) ;
    public final void rule__DiskS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2566:1: ( ( ( rule__DiskS__NSlotsAssignment_3 ) ) )
            // InternalShortDSLParser.g:2567:1: ( ( rule__DiskS__NSlotsAssignment_3 ) )
            {
            // InternalShortDSLParser.g:2567:1: ( ( rule__DiskS__NSlotsAssignment_3 ) )
            // InternalShortDSLParser.g:2568:2: ( rule__DiskS__NSlotsAssignment_3 )
            {
             before(grammarAccess.getDiskSAccess().getNSlotsAssignment_3()); 
            // InternalShortDSLParser.g:2569:2: ( rule__DiskS__NSlotsAssignment_3 )
            // InternalShortDSLParser.g:2569:3: rule__DiskS__NSlotsAssignment_3
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
    // InternalShortDSLParser.g:2577:1: rule__DiskS__Group__4 : rule__DiskS__Group__4__Impl rule__DiskS__Group__5 ;
    public final void rule__DiskS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2581:1: ( rule__DiskS__Group__4__Impl rule__DiskS__Group__5 )
            // InternalShortDSLParser.g:2582:2: rule__DiskS__Group__4__Impl rule__DiskS__Group__5
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
    // InternalShortDSLParser.g:2589:1: rule__DiskS__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__DiskS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2593:1: ( ( RightParenthesis ) )
            // InternalShortDSLParser.g:2594:1: ( RightParenthesis )
            {
            // InternalShortDSLParser.g:2594:1: ( RightParenthesis )
            // InternalShortDSLParser.g:2595:2: RightParenthesis
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
    // InternalShortDSLParser.g:2604:1: rule__DiskS__Group__5 : rule__DiskS__Group__5__Impl rule__DiskS__Group__6 ;
    public final void rule__DiskS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2608:1: ( rule__DiskS__Group__5__Impl rule__DiskS__Group__6 )
            // InternalShortDSLParser.g:2609:2: rule__DiskS__Group__5__Impl rule__DiskS__Group__6
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
    // InternalShortDSLParser.g:2616:1: rule__DiskS__Group__5__Impl : ( ( rule__DiskS__LoggingAssignment_5 )? ) ;
    public final void rule__DiskS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2620:1: ( ( ( rule__DiskS__LoggingAssignment_5 )? ) )
            // InternalShortDSLParser.g:2621:1: ( ( rule__DiskS__LoggingAssignment_5 )? )
            {
            // InternalShortDSLParser.g:2621:1: ( ( rule__DiskS__LoggingAssignment_5 )? )
            // InternalShortDSLParser.g:2622:2: ( rule__DiskS__LoggingAssignment_5 )?
            {
             before(grammarAccess.getDiskSAccess().getLoggingAssignment_5()); 
            // InternalShortDSLParser.g:2623:2: ( rule__DiskS__LoggingAssignment_5 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Logging) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalShortDSLParser.g:2623:3: rule__DiskS__LoggingAssignment_5
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
    // InternalShortDSLParser.g:2631:1: rule__DiskS__Group__6 : rule__DiskS__Group__6__Impl rule__DiskS__Group__7 ;
    public final void rule__DiskS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2635:1: ( rule__DiskS__Group__6__Impl rule__DiskS__Group__7 )
            // InternalShortDSLParser.g:2636:2: rule__DiskS__Group__6__Impl rule__DiskS__Group__7
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
    // InternalShortDSLParser.g:2643:1: rule__DiskS__Group__6__Impl : ( Colon ) ;
    public final void rule__DiskS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2647:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2648:1: ( Colon )
            {
            // InternalShortDSLParser.g:2648:1: ( Colon )
            // InternalShortDSLParser.g:2649:2: Colon
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
    // InternalShortDSLParser.g:2658:1: rule__DiskS__Group__7 : rule__DiskS__Group__7__Impl rule__DiskS__Group__8 ;
    public final void rule__DiskS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2662:1: ( rule__DiskS__Group__7__Impl rule__DiskS__Group__8 )
            // InternalShortDSLParser.g:2663:2: rule__DiskS__Group__7__Impl rule__DiskS__Group__8
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
    // InternalShortDSLParser.g:2670:1: rule__DiskS__Group__7__Impl : ( RULE_BEGIN ) ;
    public final void rule__DiskS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2674:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:2675:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:2675:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:2676:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:2685:1: rule__DiskS__Group__8 : rule__DiskS__Group__8__Impl rule__DiskS__Group__9 ;
    public final void rule__DiskS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2689:1: ( rule__DiskS__Group__8__Impl rule__DiskS__Group__9 )
            // InternalShortDSLParser.g:2690:2: rule__DiskS__Group__8__Impl rule__DiskS__Group__9
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
    // InternalShortDSLParser.g:2697:1: rule__DiskS__Group__8__Impl : ( ( ( rule__DiskS__TargetsAssignment_8 ) ) ( ( rule__DiskS__TargetsAssignment_8 )* ) ) ;
    public final void rule__DiskS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2701:1: ( ( ( ( rule__DiskS__TargetsAssignment_8 ) ) ( ( rule__DiskS__TargetsAssignment_8 )* ) ) )
            // InternalShortDSLParser.g:2702:1: ( ( ( rule__DiskS__TargetsAssignment_8 ) ) ( ( rule__DiskS__TargetsAssignment_8 )* ) )
            {
            // InternalShortDSLParser.g:2702:1: ( ( ( rule__DiskS__TargetsAssignment_8 ) ) ( ( rule__DiskS__TargetsAssignment_8 )* ) )
            // InternalShortDSLParser.g:2703:2: ( ( rule__DiskS__TargetsAssignment_8 ) ) ( ( rule__DiskS__TargetsAssignment_8 )* )
            {
            // InternalShortDSLParser.g:2703:2: ( ( rule__DiskS__TargetsAssignment_8 ) )
            // InternalShortDSLParser.g:2704:3: ( rule__DiskS__TargetsAssignment_8 )
            {
             before(grammarAccess.getDiskSAccess().getTargetsAssignment_8()); 
            // InternalShortDSLParser.g:2705:3: ( rule__DiskS__TargetsAssignment_8 )
            // InternalShortDSLParser.g:2705:4: rule__DiskS__TargetsAssignment_8
            {
            pushFollow(FOLLOW_13);
            rule__DiskS__TargetsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDiskSAccess().getTargetsAssignment_8()); 

            }

            // InternalShortDSLParser.g:2708:2: ( ( rule__DiskS__TargetsAssignment_8 )* )
            // InternalShortDSLParser.g:2709:3: ( rule__DiskS__TargetsAssignment_8 )*
            {
             before(grammarAccess.getDiskSAccess().getTargetsAssignment_8()); 
            // InternalShortDSLParser.g:2710:3: ( rule__DiskS__TargetsAssignment_8 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalShortDSLParser.g:2710:4: rule__DiskS__TargetsAssignment_8
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DiskS__TargetsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalShortDSLParser.g:2719:1: rule__DiskS__Group__9 : rule__DiskS__Group__9__Impl ;
    public final void rule__DiskS__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2723:1: ( rule__DiskS__Group__9__Impl )
            // InternalShortDSLParser.g:2724:2: rule__DiskS__Group__9__Impl
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
    // InternalShortDSLParser.g:2730:1: rule__DiskS__Group__9__Impl : ( RULE_END ) ;
    public final void rule__DiskS__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2734:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:2735:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:2735:1: ( RULE_END )
            // InternalShortDSLParser.g:2736:2: RULE_END
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
    // InternalShortDSLParser.g:2746:1: rule__DiskZoneS__Group__0 : rule__DiskZoneS__Group__0__Impl rule__DiskZoneS__Group__1 ;
    public final void rule__DiskZoneS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2750:1: ( rule__DiskZoneS__Group__0__Impl rule__DiskZoneS__Group__1 )
            // InternalShortDSLParser.g:2751:2: rule__DiskZoneS__Group__0__Impl rule__DiskZoneS__Group__1
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
    // InternalShortDSLParser.g:2758:1: rule__DiskZoneS__Group__0__Impl : ( () ) ;
    public final void rule__DiskZoneS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2762:1: ( ( () ) )
            // InternalShortDSLParser.g:2763:1: ( () )
            {
            // InternalShortDSLParser.g:2763:1: ( () )
            // InternalShortDSLParser.g:2764:2: ()
            {
             before(grammarAccess.getDiskZoneSAccess().getDiskZoneAction_0()); 
            // InternalShortDSLParser.g:2765:2: ()
            // InternalShortDSLParser.g:2765:3: 
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
    // InternalShortDSLParser.g:2773:1: rule__DiskZoneS__Group__1 : rule__DiskZoneS__Group__1__Impl rule__DiskZoneS__Group__2 ;
    public final void rule__DiskZoneS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2777:1: ( rule__DiskZoneS__Group__1__Impl rule__DiskZoneS__Group__2 )
            // InternalShortDSLParser.g:2778:2: rule__DiskZoneS__Group__1__Impl rule__DiskZoneS__Group__2
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
    // InternalShortDSLParser.g:2785:1: rule__DiskZoneS__Group__1__Impl : ( ( rule__DiskZoneS__NameAssignment_1 ) ) ;
    public final void rule__DiskZoneS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2789:1: ( ( ( rule__DiskZoneS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2790:1: ( ( rule__DiskZoneS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2790:1: ( ( rule__DiskZoneS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2791:2: ( rule__DiskZoneS__NameAssignment_1 )
            {
             before(grammarAccess.getDiskZoneSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2792:2: ( rule__DiskZoneS__NameAssignment_1 )
            // InternalShortDSLParser.g:2792:3: rule__DiskZoneS__NameAssignment_1
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
    // InternalShortDSLParser.g:2800:1: rule__DiskZoneS__Group__2 : rule__DiskZoneS__Group__2__Impl rule__DiskZoneS__Group__3 ;
    public final void rule__DiskZoneS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2804:1: ( rule__DiskZoneS__Group__2__Impl rule__DiskZoneS__Group__3 )
            // InternalShortDSLParser.g:2805:2: rule__DiskZoneS__Group__2__Impl rule__DiskZoneS__Group__3
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
    // InternalShortDSLParser.g:2812:1: rule__DiskZoneS__Group__2__Impl : ( Colon ) ;
    public final void rule__DiskZoneS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2816:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2817:1: ( Colon )
            {
            // InternalShortDSLParser.g:2817:1: ( Colon )
            // InternalShortDSLParser.g:2818:2: Colon
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
    // InternalShortDSLParser.g:2827:1: rule__DiskZoneS__Group__3 : rule__DiskZoneS__Group__3__Impl rule__DiskZoneS__Group__4 ;
    public final void rule__DiskZoneS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2831:1: ( rule__DiskZoneS__Group__3__Impl rule__DiskZoneS__Group__4 )
            // InternalShortDSLParser.g:2832:2: rule__DiskZoneS__Group__3__Impl rule__DiskZoneS__Group__4
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
    // InternalShortDSLParser.g:2839:1: rule__DiskZoneS__Group__3__Impl : ( ( rule__DiskZoneS__SlotAssignment_3 ) ) ;
    public final void rule__DiskZoneS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2843:1: ( ( ( rule__DiskZoneS__SlotAssignment_3 ) ) )
            // InternalShortDSLParser.g:2844:1: ( ( rule__DiskZoneS__SlotAssignment_3 ) )
            {
            // InternalShortDSLParser.g:2844:1: ( ( rule__DiskZoneS__SlotAssignment_3 ) )
            // InternalShortDSLParser.g:2845:2: ( rule__DiskZoneS__SlotAssignment_3 )
            {
             before(grammarAccess.getDiskZoneSAccess().getSlotAssignment_3()); 
            // InternalShortDSLParser.g:2846:2: ( rule__DiskZoneS__SlotAssignment_3 )
            // InternalShortDSLParser.g:2846:3: rule__DiskZoneS__SlotAssignment_3
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
    // InternalShortDSLParser.g:2854:1: rule__DiskZoneS__Group__4 : rule__DiskZoneS__Group__4__Impl ;
    public final void rule__DiskZoneS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2858:1: ( rule__DiskZoneS__Group__4__Impl )
            // InternalShortDSLParser.g:2859:2: rule__DiskZoneS__Group__4__Impl
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
    // InternalShortDSLParser.g:2865:1: rule__DiskZoneS__Group__4__Impl : ( ( Comma )? ) ;
    public final void rule__DiskZoneS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2869:1: ( ( ( Comma )? ) )
            // InternalShortDSLParser.g:2870:1: ( ( Comma )? )
            {
            // InternalShortDSLParser.g:2870:1: ( ( Comma )? )
            // InternalShortDSLParser.g:2871:2: ( Comma )?
            {
             before(grammarAccess.getDiskZoneSAccess().getCommaKeyword_4()); 
            // InternalShortDSLParser.g:2872:2: ( Comma )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Comma) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalShortDSLParser.g:2872:3: Comma
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
    // InternalShortDSLParser.g:2881:1: rule__CameraS__Group__0 : rule__CameraS__Group__0__Impl rule__CameraS__Group__1 ;
    public final void rule__CameraS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2885:1: ( rule__CameraS__Group__0__Impl rule__CameraS__Group__1 )
            // InternalShortDSLParser.g:2886:2: rule__CameraS__Group__0__Impl rule__CameraS__Group__1
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
    // InternalShortDSLParser.g:2893:1: rule__CameraS__Group__0__Impl : ( () ) ;
    public final void rule__CameraS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2897:1: ( ( () ) )
            // InternalShortDSLParser.g:2898:1: ( () )
            {
            // InternalShortDSLParser.g:2898:1: ( () )
            // InternalShortDSLParser.g:2899:2: ()
            {
             before(grammarAccess.getCameraSAccess().getCameraAction_0()); 
            // InternalShortDSLParser.g:2900:2: ()
            // InternalShortDSLParser.g:2900:3: 
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
    // InternalShortDSLParser.g:2908:1: rule__CameraS__Group__1 : rule__CameraS__Group__1__Impl rule__CameraS__Group__2 ;
    public final void rule__CameraS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2912:1: ( rule__CameraS__Group__1__Impl rule__CameraS__Group__2 )
            // InternalShortDSLParser.g:2913:2: rule__CameraS__Group__1__Impl rule__CameraS__Group__2
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
    // InternalShortDSLParser.g:2920:1: rule__CameraS__Group__1__Impl : ( ( rule__CameraS__NameAssignment_1 ) ) ;
    public final void rule__CameraS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2924:1: ( ( ( rule__CameraS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2925:1: ( ( rule__CameraS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2925:1: ( ( rule__CameraS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2926:2: ( rule__CameraS__NameAssignment_1 )
            {
             before(grammarAccess.getCameraSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2927:2: ( rule__CameraS__NameAssignment_1 )
            // InternalShortDSLParser.g:2927:3: rule__CameraS__NameAssignment_1
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
    // InternalShortDSLParser.g:2935:1: rule__CameraS__Group__2 : rule__CameraS__Group__2__Impl rule__CameraS__Group__3 ;
    public final void rule__CameraS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2939:1: ( rule__CameraS__Group__2__Impl rule__CameraS__Group__3 )
            // InternalShortDSLParser.g:2940:2: rule__CameraS__Group__2__Impl rule__CameraS__Group__3
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
    // InternalShortDSLParser.g:2947:1: rule__CameraS__Group__2__Impl : ( ( rule__CameraS__LoggingAssignment_2 )? ) ;
    public final void rule__CameraS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2951:1: ( ( ( rule__CameraS__LoggingAssignment_2 )? ) )
            // InternalShortDSLParser.g:2952:1: ( ( rule__CameraS__LoggingAssignment_2 )? )
            {
            // InternalShortDSLParser.g:2952:1: ( ( rule__CameraS__LoggingAssignment_2 )? )
            // InternalShortDSLParser.g:2953:2: ( rule__CameraS__LoggingAssignment_2 )?
            {
             before(grammarAccess.getCameraSAccess().getLoggingAssignment_2()); 
            // InternalShortDSLParser.g:2954:2: ( rule__CameraS__LoggingAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Logging) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalShortDSLParser.g:2954:3: rule__CameraS__LoggingAssignment_2
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
    // InternalShortDSLParser.g:2962:1: rule__CameraS__Group__3 : rule__CameraS__Group__3__Impl rule__CameraS__Group__4 ;
    public final void rule__CameraS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2966:1: ( rule__CameraS__Group__3__Impl rule__CameraS__Group__4 )
            // InternalShortDSLParser.g:2967:2: rule__CameraS__Group__3__Impl rule__CameraS__Group__4
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
    // InternalShortDSLParser.g:2974:1: rule__CameraS__Group__3__Impl : ( Colon ) ;
    public final void rule__CameraS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2978:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2979:1: ( Colon )
            {
            // InternalShortDSLParser.g:2979:1: ( Colon )
            // InternalShortDSLParser.g:2980:2: Colon
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
    // InternalShortDSLParser.g:2989:1: rule__CameraS__Group__4 : rule__CameraS__Group__4__Impl rule__CameraS__Group__5 ;
    public final void rule__CameraS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2993:1: ( rule__CameraS__Group__4__Impl rule__CameraS__Group__5 )
            // InternalShortDSLParser.g:2994:2: rule__CameraS__Group__4__Impl rule__CameraS__Group__5
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
    // InternalShortDSLParser.g:3001:1: rule__CameraS__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__CameraS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3005:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:3006:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:3006:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:3007:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:3016:1: rule__CameraS__Group__5 : rule__CameraS__Group__5__Impl rule__CameraS__Group__6 ;
    public final void rule__CameraS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3020:1: ( rule__CameraS__Group__5__Impl rule__CameraS__Group__6 )
            // InternalShortDSLParser.g:3021:2: rule__CameraS__Group__5__Impl rule__CameraS__Group__6
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
    // InternalShortDSLParser.g:3028:1: rule__CameraS__Group__5__Impl : ( ( ( rule__CameraS__TargetsAssignment_5 ) ) ( ( rule__CameraS__TargetsAssignment_5 )* ) ) ;
    public final void rule__CameraS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3032:1: ( ( ( ( rule__CameraS__TargetsAssignment_5 ) ) ( ( rule__CameraS__TargetsAssignment_5 )* ) ) )
            // InternalShortDSLParser.g:3033:1: ( ( ( rule__CameraS__TargetsAssignment_5 ) ) ( ( rule__CameraS__TargetsAssignment_5 )* ) )
            {
            // InternalShortDSLParser.g:3033:1: ( ( ( rule__CameraS__TargetsAssignment_5 ) ) ( ( rule__CameraS__TargetsAssignment_5 )* ) )
            // InternalShortDSLParser.g:3034:2: ( ( rule__CameraS__TargetsAssignment_5 ) ) ( ( rule__CameraS__TargetsAssignment_5 )* )
            {
            // InternalShortDSLParser.g:3034:2: ( ( rule__CameraS__TargetsAssignment_5 ) )
            // InternalShortDSLParser.g:3035:3: ( rule__CameraS__TargetsAssignment_5 )
            {
             before(grammarAccess.getCameraSAccess().getTargetsAssignment_5()); 
            // InternalShortDSLParser.g:3036:3: ( rule__CameraS__TargetsAssignment_5 )
            // InternalShortDSLParser.g:3036:4: rule__CameraS__TargetsAssignment_5
            {
            pushFollow(FOLLOW_22);
            rule__CameraS__TargetsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCameraSAccess().getTargetsAssignment_5()); 

            }

            // InternalShortDSLParser.g:3039:2: ( ( rule__CameraS__TargetsAssignment_5 )* )
            // InternalShortDSLParser.g:3040:3: ( rule__CameraS__TargetsAssignment_5 )*
            {
             before(grammarAccess.getCameraSAccess().getTargetsAssignment_5()); 
            // InternalShortDSLParser.g:3041:3: ( rule__CameraS__TargetsAssignment_5 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Green||LA30_0==Blue||LA30_0==Red) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalShortDSLParser.g:3041:4: rule__CameraS__TargetsAssignment_5
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__CameraS__TargetsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalShortDSLParser.g:3050:1: rule__CameraS__Group__6 : rule__CameraS__Group__6__Impl ;
    public final void rule__CameraS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3054:1: ( rule__CameraS__Group__6__Impl )
            // InternalShortDSLParser.g:3055:2: rule__CameraS__Group__6__Impl
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
    // InternalShortDSLParser.g:3061:1: rule__CameraS__Group__6__Impl : ( RULE_END ) ;
    public final void rule__CameraS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3065:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:3066:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:3066:1: ( RULE_END )
            // InternalShortDSLParser.g:3067:2: RULE_END
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
    // InternalShortDSLParser.g:3077:1: rule__CameraColorS__Group__0 : rule__CameraColorS__Group__0__Impl rule__CameraColorS__Group__1 ;
    public final void rule__CameraColorS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3081:1: ( rule__CameraColorS__Group__0__Impl rule__CameraColorS__Group__1 )
            // InternalShortDSLParser.g:3082:2: rule__CameraColorS__Group__0__Impl rule__CameraColorS__Group__1
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
    // InternalShortDSLParser.g:3089:1: rule__CameraColorS__Group__0__Impl : ( () ) ;
    public final void rule__CameraColorS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3093:1: ( ( () ) )
            // InternalShortDSLParser.g:3094:1: ( () )
            {
            // InternalShortDSLParser.g:3094:1: ( () )
            // InternalShortDSLParser.g:3095:2: ()
            {
             before(grammarAccess.getCameraColorSAccess().getCameraColorAction_0()); 
            // InternalShortDSLParser.g:3096:2: ()
            // InternalShortDSLParser.g:3096:3: 
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
    // InternalShortDSLParser.g:3104:1: rule__CameraColorS__Group__1 : rule__CameraColorS__Group__1__Impl rule__CameraColorS__Group__2 ;
    public final void rule__CameraColorS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3108:1: ( rule__CameraColorS__Group__1__Impl rule__CameraColorS__Group__2 )
            // InternalShortDSLParser.g:3109:2: rule__CameraColorS__Group__1__Impl rule__CameraColorS__Group__2
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
    // InternalShortDSLParser.g:3116:1: rule__CameraColorS__Group__1__Impl : ( ( rule__CameraColorS__ColorAssignment_1 ) ) ;
    public final void rule__CameraColorS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3120:1: ( ( ( rule__CameraColorS__ColorAssignment_1 ) ) )
            // InternalShortDSLParser.g:3121:1: ( ( rule__CameraColorS__ColorAssignment_1 ) )
            {
            // InternalShortDSLParser.g:3121:1: ( ( rule__CameraColorS__ColorAssignment_1 ) )
            // InternalShortDSLParser.g:3122:2: ( rule__CameraColorS__ColorAssignment_1 )
            {
             before(grammarAccess.getCameraColorSAccess().getColorAssignment_1()); 
            // InternalShortDSLParser.g:3123:2: ( rule__CameraColorS__ColorAssignment_1 )
            // InternalShortDSLParser.g:3123:3: rule__CameraColorS__ColorAssignment_1
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
    // InternalShortDSLParser.g:3131:1: rule__CameraColorS__Group__2 : rule__CameraColorS__Group__2__Impl ;
    public final void rule__CameraColorS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3135:1: ( rule__CameraColorS__Group__2__Impl )
            // InternalShortDSLParser.g:3136:2: rule__CameraColorS__Group__2__Impl
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
    // InternalShortDSLParser.g:3142:1: rule__CameraColorS__Group__2__Impl : ( ( Comma )? ) ;
    public final void rule__CameraColorS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3146:1: ( ( ( Comma )? ) )
            // InternalShortDSLParser.g:3147:1: ( ( Comma )? )
            {
            // InternalShortDSLParser.g:3147:1: ( ( Comma )? )
            // InternalShortDSLParser.g:3148:2: ( Comma )?
            {
             before(grammarAccess.getCameraColorSAccess().getCommaKeyword_2()); 
            // InternalShortDSLParser.g:3149:2: ( Comma )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Comma) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalShortDSLParser.g:3149:3: Comma
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
    // InternalShortDSLParser.g:3158:1: rule__LoggingS__Group__0 : rule__LoggingS__Group__0__Impl rule__LoggingS__Group__1 ;
    public final void rule__LoggingS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3162:1: ( rule__LoggingS__Group__0__Impl rule__LoggingS__Group__1 )
            // InternalShortDSLParser.g:3163:2: rule__LoggingS__Group__0__Impl rule__LoggingS__Group__1
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
    // InternalShortDSLParser.g:3170:1: rule__LoggingS__Group__0__Impl : ( () ) ;
    public final void rule__LoggingS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3174:1: ( ( () ) )
            // InternalShortDSLParser.g:3175:1: ( () )
            {
            // InternalShortDSLParser.g:3175:1: ( () )
            // InternalShortDSLParser.g:3176:2: ()
            {
             before(grammarAccess.getLoggingSAccess().getLoggingAction_0()); 
            // InternalShortDSLParser.g:3177:2: ()
            // InternalShortDSLParser.g:3177:3: 
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
    // InternalShortDSLParser.g:3185:1: rule__LoggingS__Group__1 : rule__LoggingS__Group__1__Impl ;
    public final void rule__LoggingS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3189:1: ( rule__LoggingS__Group__1__Impl )
            // InternalShortDSLParser.g:3190:2: rule__LoggingS__Group__1__Impl
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
    // InternalShortDSLParser.g:3196:1: rule__LoggingS__Group__1__Impl : ( Logging ) ;
    public final void rule__LoggingS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3200:1: ( ( Logging ) )
            // InternalShortDSLParser.g:3201:1: ( Logging )
            {
            // InternalShortDSLParser.g:3201:1: ( Logging )
            // InternalShortDSLParser.g:3202:2: Logging
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
    // InternalShortDSLParser.g:3212:1: rule__DiskHandlingS__Group__0 : rule__DiskHandlingS__Group__0__Impl rule__DiskHandlingS__Group__1 ;
    public final void rule__DiskHandlingS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3216:1: ( rule__DiskHandlingS__Group__0__Impl rule__DiskHandlingS__Group__1 )
            // InternalShortDSLParser.g:3217:2: rule__DiskHandlingS__Group__0__Impl rule__DiskHandlingS__Group__1
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
    // InternalShortDSLParser.g:3224:1: rule__DiskHandlingS__Group__0__Impl : ( Handle ) ;
    public final void rule__DiskHandlingS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3228:1: ( ( Handle ) )
            // InternalShortDSLParser.g:3229:1: ( Handle )
            {
            // InternalShortDSLParser.g:3229:1: ( Handle )
            // InternalShortDSLParser.g:3230:2: Handle
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
    // InternalShortDSLParser.g:3239:1: rule__DiskHandlingS__Group__1 : rule__DiskHandlingS__Group__1__Impl rule__DiskHandlingS__Group__2 ;
    public final void rule__DiskHandlingS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3243:1: ( rule__DiskHandlingS__Group__1__Impl rule__DiskHandlingS__Group__2 )
            // InternalShortDSLParser.g:3244:2: rule__DiskHandlingS__Group__1__Impl rule__DiskHandlingS__Group__2
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
    // InternalShortDSLParser.g:3251:1: rule__DiskHandlingS__Group__1__Impl : ( ( rule__DiskHandlingS__DiskAssignment_1 ) ) ;
    public final void rule__DiskHandlingS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3255:1: ( ( ( rule__DiskHandlingS__DiskAssignment_1 ) ) )
            // InternalShortDSLParser.g:3256:1: ( ( rule__DiskHandlingS__DiskAssignment_1 ) )
            {
            // InternalShortDSLParser.g:3256:1: ( ( rule__DiskHandlingS__DiskAssignment_1 ) )
            // InternalShortDSLParser.g:3257:2: ( rule__DiskHandlingS__DiskAssignment_1 )
            {
             before(grammarAccess.getDiskHandlingSAccess().getDiskAssignment_1()); 
            // InternalShortDSLParser.g:3258:2: ( rule__DiskHandlingS__DiskAssignment_1 )
            // InternalShortDSLParser.g:3258:3: rule__DiskHandlingS__DiskAssignment_1
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
    // InternalShortDSLParser.g:3266:1: rule__DiskHandlingS__Group__2 : rule__DiskHandlingS__Group__2__Impl rule__DiskHandlingS__Group__3 ;
    public final void rule__DiskHandlingS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3270:1: ( rule__DiskHandlingS__Group__2__Impl rule__DiskHandlingS__Group__3 )
            // InternalShortDSLParser.g:3271:2: rule__DiskHandlingS__Group__2__Impl rule__DiskHandlingS__Group__3
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
    // InternalShortDSLParser.g:3278:1: rule__DiskHandlingS__Group__2__Impl : ( LeftCurlyBracket ) ;
    public final void rule__DiskHandlingS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3282:1: ( ( LeftCurlyBracket ) )
            // InternalShortDSLParser.g:3283:1: ( LeftCurlyBracket )
            {
            // InternalShortDSLParser.g:3283:1: ( LeftCurlyBracket )
            // InternalShortDSLParser.g:3284:2: LeftCurlyBracket
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
    // InternalShortDSLParser.g:3293:1: rule__DiskHandlingS__Group__3 : rule__DiskHandlingS__Group__3__Impl rule__DiskHandlingS__Group__4 ;
    public final void rule__DiskHandlingS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3297:1: ( rule__DiskHandlingS__Group__3__Impl rule__DiskHandlingS__Group__4 )
            // InternalShortDSLParser.g:3298:2: rule__DiskHandlingS__Group__3__Impl rule__DiskHandlingS__Group__4
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
    // InternalShortDSLParser.g:3305:1: rule__DiskHandlingS__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__DiskHandlingS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3309:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:3310:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:3310:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:3311:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:3320:1: rule__DiskHandlingS__Group__4 : rule__DiskHandlingS__Group__4__Impl rule__DiskHandlingS__Group__5 ;
    public final void rule__DiskHandlingS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3324:1: ( rule__DiskHandlingS__Group__4__Impl rule__DiskHandlingS__Group__5 )
            // InternalShortDSLParser.g:3325:2: rule__DiskHandlingS__Group__4__Impl rule__DiskHandlingS__Group__5
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
    // InternalShortDSLParser.g:3332:1: rule__DiskHandlingS__Group__4__Impl : ( ( ( rule__DiskHandlingS__StatementsAssignment_4 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_4 )* ) ) ;
    public final void rule__DiskHandlingS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3336:1: ( ( ( ( rule__DiskHandlingS__StatementsAssignment_4 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_4 )* ) ) )
            // InternalShortDSLParser.g:3337:1: ( ( ( rule__DiskHandlingS__StatementsAssignment_4 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_4 )* ) )
            {
            // InternalShortDSLParser.g:3337:1: ( ( ( rule__DiskHandlingS__StatementsAssignment_4 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_4 )* ) )
            // InternalShortDSLParser.g:3338:2: ( ( rule__DiskHandlingS__StatementsAssignment_4 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_4 )* )
            {
            // InternalShortDSLParser.g:3338:2: ( ( rule__DiskHandlingS__StatementsAssignment_4 ) )
            // InternalShortDSLParser.g:3339:3: ( rule__DiskHandlingS__StatementsAssignment_4 )
            {
             before(grammarAccess.getDiskHandlingSAccess().getStatementsAssignment_4()); 
            // InternalShortDSLParser.g:3340:3: ( rule__DiskHandlingS__StatementsAssignment_4 )
            // InternalShortDSLParser.g:3340:4: rule__DiskHandlingS__StatementsAssignment_4
            {
            pushFollow(FOLLOW_25);
            rule__DiskHandlingS__StatementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDiskHandlingSAccess().getStatementsAssignment_4()); 

            }

            // InternalShortDSLParser.g:3343:2: ( ( rule__DiskHandlingS__StatementsAssignment_4 )* )
            // InternalShortDSLParser.g:3344:3: ( rule__DiskHandlingS__StatementsAssignment_4 )*
            {
             before(grammarAccess.getDiskHandlingSAccess().getStatementsAssignment_4()); 
            // InternalShortDSLParser.g:3345:3: ( rule__DiskHandlingS__StatementsAssignment_4 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=In_progress && LA32_0<=Complete)||LA32_0==Foreach||LA32_0==Pickup||(LA32_0>=Drop && LA32_0<=Free)||LA32_0==If||LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalShortDSLParser.g:3345:4: rule__DiskHandlingS__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__DiskHandlingS__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalShortDSLParser.g:3354:1: rule__DiskHandlingS__Group__5 : rule__DiskHandlingS__Group__5__Impl rule__DiskHandlingS__Group__6 ;
    public final void rule__DiskHandlingS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3358:1: ( rule__DiskHandlingS__Group__5__Impl rule__DiskHandlingS__Group__6 )
            // InternalShortDSLParser.g:3359:2: rule__DiskHandlingS__Group__5__Impl rule__DiskHandlingS__Group__6
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
    // InternalShortDSLParser.g:3366:1: rule__DiskHandlingS__Group__5__Impl : ( RULE_END ) ;
    public final void rule__DiskHandlingS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3370:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:3371:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:3371:1: ( RULE_END )
            // InternalShortDSLParser.g:3372:2: RULE_END
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
    // InternalShortDSLParser.g:3381:1: rule__DiskHandlingS__Group__6 : rule__DiskHandlingS__Group__6__Impl ;
    public final void rule__DiskHandlingS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3385:1: ( rule__DiskHandlingS__Group__6__Impl )
            // InternalShortDSLParser.g:3386:2: rule__DiskHandlingS__Group__6__Impl
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
    // InternalShortDSLParser.g:3392:1: rule__DiskHandlingS__Group__6__Impl : ( RightCurlyBracket ) ;
    public final void rule__DiskHandlingS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3396:1: ( ( RightCurlyBracket ) )
            // InternalShortDSLParser.g:3397:1: ( RightCurlyBracket )
            {
            // InternalShortDSLParser.g:3397:1: ( RightCurlyBracket )
            // InternalShortDSLParser.g:3398:2: RightCurlyBracket
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


    // $ANTLR start "rule__LoopVariableS__Group__0"
    // InternalShortDSLParser.g:3408:1: rule__LoopVariableS__Group__0 : rule__LoopVariableS__Group__0__Impl rule__LoopVariableS__Group__1 ;
    public final void rule__LoopVariableS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3412:1: ( rule__LoopVariableS__Group__0__Impl rule__LoopVariableS__Group__1 )
            // InternalShortDSLParser.g:3413:2: rule__LoopVariableS__Group__0__Impl rule__LoopVariableS__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__LoopVariableS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopVariableS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__0"


    // $ANTLR start "rule__LoopVariableS__Group__0__Impl"
    // InternalShortDSLParser.g:3420:1: rule__LoopVariableS__Group__0__Impl : ( () ) ;
    public final void rule__LoopVariableS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3424:1: ( ( () ) )
            // InternalShortDSLParser.g:3425:1: ( () )
            {
            // InternalShortDSLParser.g:3425:1: ( () )
            // InternalShortDSLParser.g:3426:2: ()
            {
             before(grammarAccess.getLoopVariableSAccess().getLoopVariableAction_0()); 
            // InternalShortDSLParser.g:3427:2: ()
            // InternalShortDSLParser.g:3427:3: 
            {
            }

             after(grammarAccess.getLoopVariableSAccess().getLoopVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__0__Impl"


    // $ANTLR start "rule__LoopVariableS__Group__1"
    // InternalShortDSLParser.g:3435:1: rule__LoopVariableS__Group__1 : rule__LoopVariableS__Group__1__Impl rule__LoopVariableS__Group__2 ;
    public final void rule__LoopVariableS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3439:1: ( rule__LoopVariableS__Group__1__Impl rule__LoopVariableS__Group__2 )
            // InternalShortDSLParser.g:3440:2: rule__LoopVariableS__Group__1__Impl rule__LoopVariableS__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__LoopVariableS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopVariableS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__1"


    // $ANTLR start "rule__LoopVariableS__Group__1__Impl"
    // InternalShortDSLParser.g:3447:1: rule__LoopVariableS__Group__1__Impl : ( Foreach ) ;
    public final void rule__LoopVariableS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3451:1: ( ( Foreach ) )
            // InternalShortDSLParser.g:3452:1: ( Foreach )
            {
            // InternalShortDSLParser.g:3452:1: ( Foreach )
            // InternalShortDSLParser.g:3453:2: Foreach
            {
             before(grammarAccess.getLoopVariableSAccess().getForeachKeyword_1()); 
            match(input,Foreach,FOLLOW_2); 
             after(grammarAccess.getLoopVariableSAccess().getForeachKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__1__Impl"


    // $ANTLR start "rule__LoopVariableS__Group__2"
    // InternalShortDSLParser.g:3462:1: rule__LoopVariableS__Group__2 : rule__LoopVariableS__Group__2__Impl rule__LoopVariableS__Group__3 ;
    public final void rule__LoopVariableS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3466:1: ( rule__LoopVariableS__Group__2__Impl rule__LoopVariableS__Group__3 )
            // InternalShortDSLParser.g:3467:2: rule__LoopVariableS__Group__2__Impl rule__LoopVariableS__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__LoopVariableS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopVariableS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__2"


    // $ANTLR start "rule__LoopVariableS__Group__2__Impl"
    // InternalShortDSLParser.g:3474:1: rule__LoopVariableS__Group__2__Impl : ( Var ) ;
    public final void rule__LoopVariableS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3478:1: ( ( Var ) )
            // InternalShortDSLParser.g:3479:1: ( Var )
            {
            // InternalShortDSLParser.g:3479:1: ( Var )
            // InternalShortDSLParser.g:3480:2: Var
            {
             before(grammarAccess.getLoopVariableSAccess().getVarKeyword_2()); 
            match(input,Var,FOLLOW_2); 
             after(grammarAccess.getLoopVariableSAccess().getVarKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__2__Impl"


    // $ANTLR start "rule__LoopVariableS__Group__3"
    // InternalShortDSLParser.g:3489:1: rule__LoopVariableS__Group__3 : rule__LoopVariableS__Group__3__Impl rule__LoopVariableS__Group__4 ;
    public final void rule__LoopVariableS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3493:1: ( rule__LoopVariableS__Group__3__Impl rule__LoopVariableS__Group__4 )
            // InternalShortDSLParser.g:3494:2: rule__LoopVariableS__Group__3__Impl rule__LoopVariableS__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__LoopVariableS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopVariableS__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__3"


    // $ANTLR start "rule__LoopVariableS__Group__3__Impl"
    // InternalShortDSLParser.g:3501:1: rule__LoopVariableS__Group__3__Impl : ( ( rule__LoopVariableS__OrdinaryVariableAssignment_3 ) ) ;
    public final void rule__LoopVariableS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3505:1: ( ( ( rule__LoopVariableS__OrdinaryVariableAssignment_3 ) ) )
            // InternalShortDSLParser.g:3506:1: ( ( rule__LoopVariableS__OrdinaryVariableAssignment_3 ) )
            {
            // InternalShortDSLParser.g:3506:1: ( ( rule__LoopVariableS__OrdinaryVariableAssignment_3 ) )
            // InternalShortDSLParser.g:3507:2: ( rule__LoopVariableS__OrdinaryVariableAssignment_3 )
            {
             before(grammarAccess.getLoopVariableSAccess().getOrdinaryVariableAssignment_3()); 
            // InternalShortDSLParser.g:3508:2: ( rule__LoopVariableS__OrdinaryVariableAssignment_3 )
            // InternalShortDSLParser.g:3508:3: rule__LoopVariableS__OrdinaryVariableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LoopVariableS__OrdinaryVariableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLoopVariableSAccess().getOrdinaryVariableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__3__Impl"


    // $ANTLR start "rule__LoopVariableS__Group__4"
    // InternalShortDSLParser.g:3516:1: rule__LoopVariableS__Group__4 : rule__LoopVariableS__Group__4__Impl rule__LoopVariableS__Group__5 ;
    public final void rule__LoopVariableS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3520:1: ( rule__LoopVariableS__Group__4__Impl rule__LoopVariableS__Group__5 )
            // InternalShortDSLParser.g:3521:2: rule__LoopVariableS__Group__4__Impl rule__LoopVariableS__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__LoopVariableS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopVariableS__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__4"


    // $ANTLR start "rule__LoopVariableS__Group__4__Impl"
    // InternalShortDSLParser.g:3528:1: rule__LoopVariableS__Group__4__Impl : ( ( rule__LoopVariableS__ComparisonOperatorAssignment_4 ) ) ;
    public final void rule__LoopVariableS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3532:1: ( ( ( rule__LoopVariableS__ComparisonOperatorAssignment_4 ) ) )
            // InternalShortDSLParser.g:3533:1: ( ( rule__LoopVariableS__ComparisonOperatorAssignment_4 ) )
            {
            // InternalShortDSLParser.g:3533:1: ( ( rule__LoopVariableS__ComparisonOperatorAssignment_4 ) )
            // InternalShortDSLParser.g:3534:2: ( rule__LoopVariableS__ComparisonOperatorAssignment_4 )
            {
             before(grammarAccess.getLoopVariableSAccess().getComparisonOperatorAssignment_4()); 
            // InternalShortDSLParser.g:3535:2: ( rule__LoopVariableS__ComparisonOperatorAssignment_4 )
            // InternalShortDSLParser.g:3535:3: rule__LoopVariableS__ComparisonOperatorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LoopVariableS__ComparisonOperatorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLoopVariableSAccess().getComparisonOperatorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__4__Impl"


    // $ANTLR start "rule__LoopVariableS__Group__5"
    // InternalShortDSLParser.g:3543:1: rule__LoopVariableS__Group__5 : rule__LoopVariableS__Group__5__Impl rule__LoopVariableS__Group__6 ;
    public final void rule__LoopVariableS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3547:1: ( rule__LoopVariableS__Group__5__Impl rule__LoopVariableS__Group__6 )
            // InternalShortDSLParser.g:3548:2: rule__LoopVariableS__Group__5__Impl rule__LoopVariableS__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__LoopVariableS__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopVariableS__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__5"


    // $ANTLR start "rule__LoopVariableS__Group__5__Impl"
    // InternalShortDSLParser.g:3555:1: rule__LoopVariableS__Group__5__Impl : ( ( rule__LoopVariableS__SlotStateAssignment_5 ) ) ;
    public final void rule__LoopVariableS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3559:1: ( ( ( rule__LoopVariableS__SlotStateAssignment_5 ) ) )
            // InternalShortDSLParser.g:3560:1: ( ( rule__LoopVariableS__SlotStateAssignment_5 ) )
            {
            // InternalShortDSLParser.g:3560:1: ( ( rule__LoopVariableS__SlotStateAssignment_5 ) )
            // InternalShortDSLParser.g:3561:2: ( rule__LoopVariableS__SlotStateAssignment_5 )
            {
             before(grammarAccess.getLoopVariableSAccess().getSlotStateAssignment_5()); 
            // InternalShortDSLParser.g:3562:2: ( rule__LoopVariableS__SlotStateAssignment_5 )
            // InternalShortDSLParser.g:3562:3: rule__LoopVariableS__SlotStateAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LoopVariableS__SlotStateAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLoopVariableSAccess().getSlotStateAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__5__Impl"


    // $ANTLR start "rule__LoopVariableS__Group__6"
    // InternalShortDSLParser.g:3570:1: rule__LoopVariableS__Group__6 : rule__LoopVariableS__Group__6__Impl rule__LoopVariableS__Group__7 ;
    public final void rule__LoopVariableS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3574:1: ( rule__LoopVariableS__Group__6__Impl rule__LoopVariableS__Group__7 )
            // InternalShortDSLParser.g:3575:2: rule__LoopVariableS__Group__6__Impl rule__LoopVariableS__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__LoopVariableS__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopVariableS__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__6"


    // $ANTLR start "rule__LoopVariableS__Group__6__Impl"
    // InternalShortDSLParser.g:3582:1: rule__LoopVariableS__Group__6__Impl : ( Colon ) ;
    public final void rule__LoopVariableS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3586:1: ( ( Colon ) )
            // InternalShortDSLParser.g:3587:1: ( Colon )
            {
            // InternalShortDSLParser.g:3587:1: ( Colon )
            // InternalShortDSLParser.g:3588:2: Colon
            {
             before(grammarAccess.getLoopVariableSAccess().getColonKeyword_6()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getLoopVariableSAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__6__Impl"


    // $ANTLR start "rule__LoopVariableS__Group__7"
    // InternalShortDSLParser.g:3597:1: rule__LoopVariableS__Group__7 : rule__LoopVariableS__Group__7__Impl rule__LoopVariableS__Group__8 ;
    public final void rule__LoopVariableS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3601:1: ( rule__LoopVariableS__Group__7__Impl rule__LoopVariableS__Group__8 )
            // InternalShortDSLParser.g:3602:2: rule__LoopVariableS__Group__7__Impl rule__LoopVariableS__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__LoopVariableS__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopVariableS__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__7"


    // $ANTLR start "rule__LoopVariableS__Group__7__Impl"
    // InternalShortDSLParser.g:3609:1: rule__LoopVariableS__Group__7__Impl : ( RULE_BEGIN ) ;
    public final void rule__LoopVariableS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3613:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:3614:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:3614:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:3615:2: RULE_BEGIN
            {
             before(grammarAccess.getLoopVariableSAccess().getBEGINTerminalRuleCall_7()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getLoopVariableSAccess().getBEGINTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__7__Impl"


    // $ANTLR start "rule__LoopVariableS__Group__8"
    // InternalShortDSLParser.g:3624:1: rule__LoopVariableS__Group__8 : rule__LoopVariableS__Group__8__Impl rule__LoopVariableS__Group__9 ;
    public final void rule__LoopVariableS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3628:1: ( rule__LoopVariableS__Group__8__Impl rule__LoopVariableS__Group__9 )
            // InternalShortDSLParser.g:3629:2: rule__LoopVariableS__Group__8__Impl rule__LoopVariableS__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__LoopVariableS__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopVariableS__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__8"


    // $ANTLR start "rule__LoopVariableS__Group__8__Impl"
    // InternalShortDSLParser.g:3636:1: rule__LoopVariableS__Group__8__Impl : ( ( rule__LoopVariableS__StatementsAssignment_8 )* ) ;
    public final void rule__LoopVariableS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3640:1: ( ( ( rule__LoopVariableS__StatementsAssignment_8 )* ) )
            // InternalShortDSLParser.g:3641:1: ( ( rule__LoopVariableS__StatementsAssignment_8 )* )
            {
            // InternalShortDSLParser.g:3641:1: ( ( rule__LoopVariableS__StatementsAssignment_8 )* )
            // InternalShortDSLParser.g:3642:2: ( rule__LoopVariableS__StatementsAssignment_8 )*
            {
             before(grammarAccess.getLoopVariableSAccess().getStatementsAssignment_8()); 
            // InternalShortDSLParser.g:3643:2: ( rule__LoopVariableS__StatementsAssignment_8 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=In_progress && LA33_0<=Complete)||LA33_0==Foreach||LA33_0==Pickup||(LA33_0>=Drop && LA33_0<=Free)||LA33_0==If||LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalShortDSLParser.g:3643:3: rule__LoopVariableS__StatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__LoopVariableS__StatementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getLoopVariableSAccess().getStatementsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__8__Impl"


    // $ANTLR start "rule__LoopVariableS__Group__9"
    // InternalShortDSLParser.g:3651:1: rule__LoopVariableS__Group__9 : rule__LoopVariableS__Group__9__Impl ;
    public final void rule__LoopVariableS__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3655:1: ( rule__LoopVariableS__Group__9__Impl )
            // InternalShortDSLParser.g:3656:2: rule__LoopVariableS__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopVariableS__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__9"


    // $ANTLR start "rule__LoopVariableS__Group__9__Impl"
    // InternalShortDSLParser.g:3662:1: rule__LoopVariableS__Group__9__Impl : ( RULE_END ) ;
    public final void rule__LoopVariableS__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3666:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:3667:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:3667:1: ( RULE_END )
            // InternalShortDSLParser.g:3668:2: RULE_END
            {
             before(grammarAccess.getLoopVariableSAccess().getENDTerminalRuleCall_9()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getLoopVariableSAccess().getENDTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__Group__9__Impl"


    // $ANTLR start "rule__LoopSlotS__Group__0"
    // InternalShortDSLParser.g:3678:1: rule__LoopSlotS__Group__0 : rule__LoopSlotS__Group__0__Impl rule__LoopSlotS__Group__1 ;
    public final void rule__LoopSlotS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3682:1: ( rule__LoopSlotS__Group__0__Impl rule__LoopSlotS__Group__1 )
            // InternalShortDSLParser.g:3683:2: rule__LoopSlotS__Group__0__Impl rule__LoopSlotS__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__LoopSlotS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopSlotS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__0"


    // $ANTLR start "rule__LoopSlotS__Group__0__Impl"
    // InternalShortDSLParser.g:3690:1: rule__LoopSlotS__Group__0__Impl : ( () ) ;
    public final void rule__LoopSlotS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3694:1: ( ( () ) )
            // InternalShortDSLParser.g:3695:1: ( () )
            {
            // InternalShortDSLParser.g:3695:1: ( () )
            // InternalShortDSLParser.g:3696:2: ()
            {
             before(grammarAccess.getLoopSlotSAccess().getLoopSlotAction_0()); 
            // InternalShortDSLParser.g:3697:2: ()
            // InternalShortDSLParser.g:3697:3: 
            {
            }

             after(grammarAccess.getLoopSlotSAccess().getLoopSlotAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__0__Impl"


    // $ANTLR start "rule__LoopSlotS__Group__1"
    // InternalShortDSLParser.g:3705:1: rule__LoopSlotS__Group__1 : rule__LoopSlotS__Group__1__Impl rule__LoopSlotS__Group__2 ;
    public final void rule__LoopSlotS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3709:1: ( rule__LoopSlotS__Group__1__Impl rule__LoopSlotS__Group__2 )
            // InternalShortDSLParser.g:3710:2: rule__LoopSlotS__Group__1__Impl rule__LoopSlotS__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__LoopSlotS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopSlotS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__1"


    // $ANTLR start "rule__LoopSlotS__Group__1__Impl"
    // InternalShortDSLParser.g:3717:1: rule__LoopSlotS__Group__1__Impl : ( Foreach ) ;
    public final void rule__LoopSlotS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3721:1: ( ( Foreach ) )
            // InternalShortDSLParser.g:3722:1: ( Foreach )
            {
            // InternalShortDSLParser.g:3722:1: ( Foreach )
            // InternalShortDSLParser.g:3723:2: Foreach
            {
             before(grammarAccess.getLoopSlotSAccess().getForeachKeyword_1()); 
            match(input,Foreach,FOLLOW_2); 
             after(grammarAccess.getLoopSlotSAccess().getForeachKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__1__Impl"


    // $ANTLR start "rule__LoopSlotS__Group__2"
    // InternalShortDSLParser.g:3732:1: rule__LoopSlotS__Group__2 : rule__LoopSlotS__Group__2__Impl rule__LoopSlotS__Group__3 ;
    public final void rule__LoopSlotS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3736:1: ( rule__LoopSlotS__Group__2__Impl rule__LoopSlotS__Group__3 )
            // InternalShortDSLParser.g:3737:2: rule__LoopSlotS__Group__2__Impl rule__LoopSlotS__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__LoopSlotS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopSlotS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__2"


    // $ANTLR start "rule__LoopSlotS__Group__2__Impl"
    // InternalShortDSLParser.g:3744:1: rule__LoopSlotS__Group__2__Impl : ( Slot ) ;
    public final void rule__LoopSlotS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3748:1: ( ( Slot ) )
            // InternalShortDSLParser.g:3749:1: ( Slot )
            {
            // InternalShortDSLParser.g:3749:1: ( Slot )
            // InternalShortDSLParser.g:3750:2: Slot
            {
             before(grammarAccess.getLoopSlotSAccess().getSlotKeyword_2()); 
            match(input,Slot,FOLLOW_2); 
             after(grammarAccess.getLoopSlotSAccess().getSlotKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__2__Impl"


    // $ANTLR start "rule__LoopSlotS__Group__3"
    // InternalShortDSLParser.g:3759:1: rule__LoopSlotS__Group__3 : rule__LoopSlotS__Group__3__Impl rule__LoopSlotS__Group__4 ;
    public final void rule__LoopSlotS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3763:1: ( rule__LoopSlotS__Group__3__Impl rule__LoopSlotS__Group__4 )
            // InternalShortDSLParser.g:3764:2: rule__LoopSlotS__Group__3__Impl rule__LoopSlotS__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__LoopSlotS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopSlotS__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__3"


    // $ANTLR start "rule__LoopSlotS__Group__3__Impl"
    // InternalShortDSLParser.g:3771:1: rule__LoopSlotS__Group__3__Impl : ( ( rule__LoopSlotS__SlotVariableAssignment_3 ) ) ;
    public final void rule__LoopSlotS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3775:1: ( ( ( rule__LoopSlotS__SlotVariableAssignment_3 ) ) )
            // InternalShortDSLParser.g:3776:1: ( ( rule__LoopSlotS__SlotVariableAssignment_3 ) )
            {
            // InternalShortDSLParser.g:3776:1: ( ( rule__LoopSlotS__SlotVariableAssignment_3 ) )
            // InternalShortDSLParser.g:3777:2: ( rule__LoopSlotS__SlotVariableAssignment_3 )
            {
             before(grammarAccess.getLoopSlotSAccess().getSlotVariableAssignment_3()); 
            // InternalShortDSLParser.g:3778:2: ( rule__LoopSlotS__SlotVariableAssignment_3 )
            // InternalShortDSLParser.g:3778:3: rule__LoopSlotS__SlotVariableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LoopSlotS__SlotVariableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLoopSlotSAccess().getSlotVariableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__3__Impl"


    // $ANTLR start "rule__LoopSlotS__Group__4"
    // InternalShortDSLParser.g:3786:1: rule__LoopSlotS__Group__4 : rule__LoopSlotS__Group__4__Impl rule__LoopSlotS__Group__5 ;
    public final void rule__LoopSlotS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3790:1: ( rule__LoopSlotS__Group__4__Impl rule__LoopSlotS__Group__5 )
            // InternalShortDSLParser.g:3791:2: rule__LoopSlotS__Group__4__Impl rule__LoopSlotS__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__LoopSlotS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopSlotS__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__4"


    // $ANTLR start "rule__LoopSlotS__Group__4__Impl"
    // InternalShortDSLParser.g:3798:1: rule__LoopSlotS__Group__4__Impl : ( ( rule__LoopSlotS__ComparisonOperatorAssignment_4 ) ) ;
    public final void rule__LoopSlotS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3802:1: ( ( ( rule__LoopSlotS__ComparisonOperatorAssignment_4 ) ) )
            // InternalShortDSLParser.g:3803:1: ( ( rule__LoopSlotS__ComparisonOperatorAssignment_4 ) )
            {
            // InternalShortDSLParser.g:3803:1: ( ( rule__LoopSlotS__ComparisonOperatorAssignment_4 ) )
            // InternalShortDSLParser.g:3804:2: ( rule__LoopSlotS__ComparisonOperatorAssignment_4 )
            {
             before(grammarAccess.getLoopSlotSAccess().getComparisonOperatorAssignment_4()); 
            // InternalShortDSLParser.g:3805:2: ( rule__LoopSlotS__ComparisonOperatorAssignment_4 )
            // InternalShortDSLParser.g:3805:3: rule__LoopSlotS__ComparisonOperatorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LoopSlotS__ComparisonOperatorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLoopSlotSAccess().getComparisonOperatorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__4__Impl"


    // $ANTLR start "rule__LoopSlotS__Group__5"
    // InternalShortDSLParser.g:3813:1: rule__LoopSlotS__Group__5 : rule__LoopSlotS__Group__5__Impl rule__LoopSlotS__Group__6 ;
    public final void rule__LoopSlotS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3817:1: ( rule__LoopSlotS__Group__5__Impl rule__LoopSlotS__Group__6 )
            // InternalShortDSLParser.g:3818:2: rule__LoopSlotS__Group__5__Impl rule__LoopSlotS__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__LoopSlotS__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopSlotS__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__5"


    // $ANTLR start "rule__LoopSlotS__Group__5__Impl"
    // InternalShortDSLParser.g:3825:1: rule__LoopSlotS__Group__5__Impl : ( ( rule__LoopSlotS__SlotStateAssignment_5 ) ) ;
    public final void rule__LoopSlotS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3829:1: ( ( ( rule__LoopSlotS__SlotStateAssignment_5 ) ) )
            // InternalShortDSLParser.g:3830:1: ( ( rule__LoopSlotS__SlotStateAssignment_5 ) )
            {
            // InternalShortDSLParser.g:3830:1: ( ( rule__LoopSlotS__SlotStateAssignment_5 ) )
            // InternalShortDSLParser.g:3831:2: ( rule__LoopSlotS__SlotStateAssignment_5 )
            {
             before(grammarAccess.getLoopSlotSAccess().getSlotStateAssignment_5()); 
            // InternalShortDSLParser.g:3832:2: ( rule__LoopSlotS__SlotStateAssignment_5 )
            // InternalShortDSLParser.g:3832:3: rule__LoopSlotS__SlotStateAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LoopSlotS__SlotStateAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLoopSlotSAccess().getSlotStateAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__5__Impl"


    // $ANTLR start "rule__LoopSlotS__Group__6"
    // InternalShortDSLParser.g:3840:1: rule__LoopSlotS__Group__6 : rule__LoopSlotS__Group__6__Impl rule__LoopSlotS__Group__7 ;
    public final void rule__LoopSlotS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3844:1: ( rule__LoopSlotS__Group__6__Impl rule__LoopSlotS__Group__7 )
            // InternalShortDSLParser.g:3845:2: rule__LoopSlotS__Group__6__Impl rule__LoopSlotS__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__LoopSlotS__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopSlotS__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__6"


    // $ANTLR start "rule__LoopSlotS__Group__6__Impl"
    // InternalShortDSLParser.g:3852:1: rule__LoopSlotS__Group__6__Impl : ( Colon ) ;
    public final void rule__LoopSlotS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3856:1: ( ( Colon ) )
            // InternalShortDSLParser.g:3857:1: ( Colon )
            {
            // InternalShortDSLParser.g:3857:1: ( Colon )
            // InternalShortDSLParser.g:3858:2: Colon
            {
             before(grammarAccess.getLoopSlotSAccess().getColonKeyword_6()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getLoopSlotSAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__6__Impl"


    // $ANTLR start "rule__LoopSlotS__Group__7"
    // InternalShortDSLParser.g:3867:1: rule__LoopSlotS__Group__7 : rule__LoopSlotS__Group__7__Impl rule__LoopSlotS__Group__8 ;
    public final void rule__LoopSlotS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3871:1: ( rule__LoopSlotS__Group__7__Impl rule__LoopSlotS__Group__8 )
            // InternalShortDSLParser.g:3872:2: rule__LoopSlotS__Group__7__Impl rule__LoopSlotS__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__LoopSlotS__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopSlotS__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__7"


    // $ANTLR start "rule__LoopSlotS__Group__7__Impl"
    // InternalShortDSLParser.g:3879:1: rule__LoopSlotS__Group__7__Impl : ( RULE_BEGIN ) ;
    public final void rule__LoopSlotS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3883:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:3884:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:3884:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:3885:2: RULE_BEGIN
            {
             before(grammarAccess.getLoopSlotSAccess().getBEGINTerminalRuleCall_7()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getLoopSlotSAccess().getBEGINTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__7__Impl"


    // $ANTLR start "rule__LoopSlotS__Group__8"
    // InternalShortDSLParser.g:3894:1: rule__LoopSlotS__Group__8 : rule__LoopSlotS__Group__8__Impl rule__LoopSlotS__Group__9 ;
    public final void rule__LoopSlotS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3898:1: ( rule__LoopSlotS__Group__8__Impl rule__LoopSlotS__Group__9 )
            // InternalShortDSLParser.g:3899:2: rule__LoopSlotS__Group__8__Impl rule__LoopSlotS__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__LoopSlotS__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopSlotS__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__8"


    // $ANTLR start "rule__LoopSlotS__Group__8__Impl"
    // InternalShortDSLParser.g:3906:1: rule__LoopSlotS__Group__8__Impl : ( ( rule__LoopSlotS__StatementsAssignment_8 )* ) ;
    public final void rule__LoopSlotS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3910:1: ( ( ( rule__LoopSlotS__StatementsAssignment_8 )* ) )
            // InternalShortDSLParser.g:3911:1: ( ( rule__LoopSlotS__StatementsAssignment_8 )* )
            {
            // InternalShortDSLParser.g:3911:1: ( ( rule__LoopSlotS__StatementsAssignment_8 )* )
            // InternalShortDSLParser.g:3912:2: ( rule__LoopSlotS__StatementsAssignment_8 )*
            {
             before(grammarAccess.getLoopSlotSAccess().getStatementsAssignment_8()); 
            // InternalShortDSLParser.g:3913:2: ( rule__LoopSlotS__StatementsAssignment_8 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=In_progress && LA34_0<=Complete)||LA34_0==Foreach||LA34_0==Pickup||(LA34_0>=Drop && LA34_0<=Free)||LA34_0==If||LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalShortDSLParser.g:3913:3: rule__LoopSlotS__StatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__LoopSlotS__StatementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getLoopSlotSAccess().getStatementsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__8__Impl"


    // $ANTLR start "rule__LoopSlotS__Group__9"
    // InternalShortDSLParser.g:3921:1: rule__LoopSlotS__Group__9 : rule__LoopSlotS__Group__9__Impl ;
    public final void rule__LoopSlotS__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3925:1: ( rule__LoopSlotS__Group__9__Impl )
            // InternalShortDSLParser.g:3926:2: rule__LoopSlotS__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopSlotS__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__9"


    // $ANTLR start "rule__LoopSlotS__Group__9__Impl"
    // InternalShortDSLParser.g:3932:1: rule__LoopSlotS__Group__9__Impl : ( RULE_END ) ;
    public final void rule__LoopSlotS__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3936:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:3937:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:3937:1: ( RULE_END )
            // InternalShortDSLParser.g:3938:2: RULE_END
            {
             before(grammarAccess.getLoopSlotSAccess().getENDTerminalRuleCall_9()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getLoopSlotSAccess().getENDTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__Group__9__Impl"


    // $ANTLR start "rule__MoveDiskS__Group__0"
    // InternalShortDSLParser.g:3948:1: rule__MoveDiskS__Group__0 : rule__MoveDiskS__Group__0__Impl rule__MoveDiskS__Group__1 ;
    public final void rule__MoveDiskS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3952:1: ( rule__MoveDiskS__Group__0__Impl rule__MoveDiskS__Group__1 )
            // InternalShortDSLParser.g:3953:2: rule__MoveDiskS__Group__0__Impl rule__MoveDiskS__Group__1
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
    // InternalShortDSLParser.g:3960:1: rule__MoveDiskS__Group__0__Impl : ( () ) ;
    public final void rule__MoveDiskS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3964:1: ( ( () ) )
            // InternalShortDSLParser.g:3965:1: ( () )
            {
            // InternalShortDSLParser.g:3965:1: ( () )
            // InternalShortDSLParser.g:3966:2: ()
            {
             before(grammarAccess.getMoveDiskSAccess().getMoveDiskAction_0()); 
            // InternalShortDSLParser.g:3967:2: ()
            // InternalShortDSLParser.g:3967:3: 
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
    // InternalShortDSLParser.g:3975:1: rule__MoveDiskS__Group__1 : rule__MoveDiskS__Group__1__Impl rule__MoveDiskS__Group__2 ;
    public final void rule__MoveDiskS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3979:1: ( rule__MoveDiskS__Group__1__Impl rule__MoveDiskS__Group__2 )
            // InternalShortDSLParser.g:3980:2: rule__MoveDiskS__Group__1__Impl rule__MoveDiskS__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalShortDSLParser.g:3987:1: rule__MoveDiskS__Group__1__Impl : ( ( rule__MoveDiskS__SlotAssignment_1 ) ) ;
    public final void rule__MoveDiskS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3991:1: ( ( ( rule__MoveDiskS__SlotAssignment_1 ) ) )
            // InternalShortDSLParser.g:3992:1: ( ( rule__MoveDiskS__SlotAssignment_1 ) )
            {
            // InternalShortDSLParser.g:3992:1: ( ( rule__MoveDiskS__SlotAssignment_1 ) )
            // InternalShortDSLParser.g:3993:2: ( rule__MoveDiskS__SlotAssignment_1 )
            {
             before(grammarAccess.getMoveDiskSAccess().getSlotAssignment_1()); 
            // InternalShortDSLParser.g:3994:2: ( rule__MoveDiskS__SlotAssignment_1 )
            // InternalShortDSLParser.g:3994:3: rule__MoveDiskS__SlotAssignment_1
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
    // InternalShortDSLParser.g:4002:1: rule__MoveDiskS__Group__2 : rule__MoveDiskS__Group__2__Impl rule__MoveDiskS__Group__3 ;
    public final void rule__MoveDiskS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4006:1: ( rule__MoveDiskS__Group__2__Impl rule__MoveDiskS__Group__3 )
            // InternalShortDSLParser.g:4007:2: rule__MoveDiskS__Group__2__Impl rule__MoveDiskS__Group__3
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
    // InternalShortDSLParser.g:4014:1: rule__MoveDiskS__Group__2__Impl : ( ( rule__MoveDiskS__Alternatives_2 ) ) ;
    public final void rule__MoveDiskS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4018:1: ( ( ( rule__MoveDiskS__Alternatives_2 ) ) )
            // InternalShortDSLParser.g:4019:1: ( ( rule__MoveDiskS__Alternatives_2 ) )
            {
            // InternalShortDSLParser.g:4019:1: ( ( rule__MoveDiskS__Alternatives_2 ) )
            // InternalShortDSLParser.g:4020:2: ( rule__MoveDiskS__Alternatives_2 )
            {
             before(grammarAccess.getMoveDiskSAccess().getAlternatives_2()); 
            // InternalShortDSLParser.g:4021:2: ( rule__MoveDiskS__Alternatives_2 )
            // InternalShortDSLParser.g:4021:3: rule__MoveDiskS__Alternatives_2
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
    // InternalShortDSLParser.g:4029:1: rule__MoveDiskS__Group__3 : rule__MoveDiskS__Group__3__Impl ;
    public final void rule__MoveDiskS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4033:1: ( rule__MoveDiskS__Group__3__Impl )
            // InternalShortDSLParser.g:4034:2: rule__MoveDiskS__Group__3__Impl
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
    // InternalShortDSLParser.g:4040:1: rule__MoveDiskS__Group__3__Impl : ( ( rule__MoveDiskS__ZoneAssignment_3 ) ) ;
    public final void rule__MoveDiskS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4044:1: ( ( ( rule__MoveDiskS__ZoneAssignment_3 ) ) )
            // InternalShortDSLParser.g:4045:1: ( ( rule__MoveDiskS__ZoneAssignment_3 ) )
            {
            // InternalShortDSLParser.g:4045:1: ( ( rule__MoveDiskS__ZoneAssignment_3 ) )
            // InternalShortDSLParser.g:4046:2: ( rule__MoveDiskS__ZoneAssignment_3 )
            {
             before(grammarAccess.getMoveDiskSAccess().getZoneAssignment_3()); 
            // InternalShortDSLParser.g:4047:2: ( rule__MoveDiskS__ZoneAssignment_3 )
            // InternalShortDSLParser.g:4047:3: rule__MoveDiskS__ZoneAssignment_3
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
    // InternalShortDSLParser.g:4056:1: rule__MoveAnySlotS__Group__0 : rule__MoveAnySlotS__Group__0__Impl rule__MoveAnySlotS__Group__1 ;
    public final void rule__MoveAnySlotS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4060:1: ( rule__MoveAnySlotS__Group__0__Impl rule__MoveAnySlotS__Group__1 )
            // InternalShortDSLParser.g:4061:2: rule__MoveAnySlotS__Group__0__Impl rule__MoveAnySlotS__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalShortDSLParser.g:4068:1: rule__MoveAnySlotS__Group__0__Impl : ( () ) ;
    public final void rule__MoveAnySlotS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4072:1: ( ( () ) )
            // InternalShortDSLParser.g:4073:1: ( () )
            {
            // InternalShortDSLParser.g:4073:1: ( () )
            // InternalShortDSLParser.g:4074:2: ()
            {
             before(grammarAccess.getMoveAnySlotSAccess().getMoveAnySlotAction_0()); 
            // InternalShortDSLParser.g:4075:2: ()
            // InternalShortDSLParser.g:4075:3: 
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
    // InternalShortDSLParser.g:4083:1: rule__MoveAnySlotS__Group__1 : rule__MoveAnySlotS__Group__1__Impl rule__MoveAnySlotS__Group__2 ;
    public final void rule__MoveAnySlotS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4087:1: ( rule__MoveAnySlotS__Group__1__Impl rule__MoveAnySlotS__Group__2 )
            // InternalShortDSLParser.g:4088:2: rule__MoveAnySlotS__Group__1__Impl rule__MoveAnySlotS__Group__2
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
    // InternalShortDSLParser.g:4095:1: rule__MoveAnySlotS__Group__1__Impl : ( ( rule__MoveAnySlotS__StateAssignment_1 ) ) ;
    public final void rule__MoveAnySlotS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4099:1: ( ( ( rule__MoveAnySlotS__StateAssignment_1 ) ) )
            // InternalShortDSLParser.g:4100:1: ( ( rule__MoveAnySlotS__StateAssignment_1 ) )
            {
            // InternalShortDSLParser.g:4100:1: ( ( rule__MoveAnySlotS__StateAssignment_1 ) )
            // InternalShortDSLParser.g:4101:2: ( rule__MoveAnySlotS__StateAssignment_1 )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getStateAssignment_1()); 
            // InternalShortDSLParser.g:4102:2: ( rule__MoveAnySlotS__StateAssignment_1 )
            // InternalShortDSLParser.g:4102:3: rule__MoveAnySlotS__StateAssignment_1
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
    // InternalShortDSLParser.g:4110:1: rule__MoveAnySlotS__Group__2 : rule__MoveAnySlotS__Group__2__Impl rule__MoveAnySlotS__Group__3 ;
    public final void rule__MoveAnySlotS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4114:1: ( rule__MoveAnySlotS__Group__2__Impl rule__MoveAnySlotS__Group__3 )
            // InternalShortDSLParser.g:4115:2: rule__MoveAnySlotS__Group__2__Impl rule__MoveAnySlotS__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalShortDSLParser.g:4122:1: rule__MoveAnySlotS__Group__2__Impl : ( ( rule__MoveAnySlotS__AnySlotAssignment_2 ) ) ;
    public final void rule__MoveAnySlotS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4126:1: ( ( ( rule__MoveAnySlotS__AnySlotAssignment_2 ) ) )
            // InternalShortDSLParser.g:4127:1: ( ( rule__MoveAnySlotS__AnySlotAssignment_2 ) )
            {
            // InternalShortDSLParser.g:4127:1: ( ( rule__MoveAnySlotS__AnySlotAssignment_2 ) )
            // InternalShortDSLParser.g:4128:2: ( rule__MoveAnySlotS__AnySlotAssignment_2 )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getAnySlotAssignment_2()); 
            // InternalShortDSLParser.g:4129:2: ( rule__MoveAnySlotS__AnySlotAssignment_2 )
            // InternalShortDSLParser.g:4129:3: rule__MoveAnySlotS__AnySlotAssignment_2
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
    // InternalShortDSLParser.g:4137:1: rule__MoveAnySlotS__Group__3 : rule__MoveAnySlotS__Group__3__Impl rule__MoveAnySlotS__Group__4 ;
    public final void rule__MoveAnySlotS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4141:1: ( rule__MoveAnySlotS__Group__3__Impl rule__MoveAnySlotS__Group__4 )
            // InternalShortDSLParser.g:4142:2: rule__MoveAnySlotS__Group__3__Impl rule__MoveAnySlotS__Group__4
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
    // InternalShortDSLParser.g:4149:1: rule__MoveAnySlotS__Group__3__Impl : ( ( rule__MoveAnySlotS__Alternatives_3 ) ) ;
    public final void rule__MoveAnySlotS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4153:1: ( ( ( rule__MoveAnySlotS__Alternatives_3 ) ) )
            // InternalShortDSLParser.g:4154:1: ( ( rule__MoveAnySlotS__Alternatives_3 ) )
            {
            // InternalShortDSLParser.g:4154:1: ( ( rule__MoveAnySlotS__Alternatives_3 ) )
            // InternalShortDSLParser.g:4155:2: ( rule__MoveAnySlotS__Alternatives_3 )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getAlternatives_3()); 
            // InternalShortDSLParser.g:4156:2: ( rule__MoveAnySlotS__Alternatives_3 )
            // InternalShortDSLParser.g:4156:3: rule__MoveAnySlotS__Alternatives_3
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
    // InternalShortDSLParser.g:4164:1: rule__MoveAnySlotS__Group__4 : rule__MoveAnySlotS__Group__4__Impl ;
    public final void rule__MoveAnySlotS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4168:1: ( rule__MoveAnySlotS__Group__4__Impl )
            // InternalShortDSLParser.g:4169:2: rule__MoveAnySlotS__Group__4__Impl
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
    // InternalShortDSLParser.g:4175:1: rule__MoveAnySlotS__Group__4__Impl : ( ( rule__MoveAnySlotS__ZoneAssignment_4 ) ) ;
    public final void rule__MoveAnySlotS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4179:1: ( ( ( rule__MoveAnySlotS__ZoneAssignment_4 ) ) )
            // InternalShortDSLParser.g:4180:1: ( ( rule__MoveAnySlotS__ZoneAssignment_4 ) )
            {
            // InternalShortDSLParser.g:4180:1: ( ( rule__MoveAnySlotS__ZoneAssignment_4 ) )
            // InternalShortDSLParser.g:4181:2: ( rule__MoveAnySlotS__ZoneAssignment_4 )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getZoneAssignment_4()); 
            // InternalShortDSLParser.g:4182:2: ( rule__MoveAnySlotS__ZoneAssignment_4 )
            // InternalShortDSLParser.g:4182:3: rule__MoveAnySlotS__ZoneAssignment_4
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
    // InternalShortDSLParser.g:4191:1: rule__MoveCraneS__Group__0 : rule__MoveCraneS__Group__0__Impl rule__MoveCraneS__Group__1 ;
    public final void rule__MoveCraneS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4195:1: ( rule__MoveCraneS__Group__0__Impl rule__MoveCraneS__Group__1 )
            // InternalShortDSLParser.g:4196:2: rule__MoveCraneS__Group__0__Impl rule__MoveCraneS__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalShortDSLParser.g:4203:1: rule__MoveCraneS__Group__0__Impl : ( () ) ;
    public final void rule__MoveCraneS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4207:1: ( ( () ) )
            // InternalShortDSLParser.g:4208:1: ( () )
            {
            // InternalShortDSLParser.g:4208:1: ( () )
            // InternalShortDSLParser.g:4209:2: ()
            {
             before(grammarAccess.getMoveCraneSAccess().getMoveCraneAction_0()); 
            // InternalShortDSLParser.g:4210:2: ()
            // InternalShortDSLParser.g:4210:3: 
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
    // InternalShortDSLParser.g:4218:1: rule__MoveCraneS__Group__1 : rule__MoveCraneS__Group__1__Impl rule__MoveCraneS__Group__2 ;
    public final void rule__MoveCraneS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4222:1: ( rule__MoveCraneS__Group__1__Impl rule__MoveCraneS__Group__2 )
            // InternalShortDSLParser.g:4223:2: rule__MoveCraneS__Group__1__Impl rule__MoveCraneS__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalShortDSLParser.g:4230:1: rule__MoveCraneS__Group__1__Impl : ( ( rule__MoveCraneS__CraneAssignment_1 ) ) ;
    public final void rule__MoveCraneS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4234:1: ( ( ( rule__MoveCraneS__CraneAssignment_1 ) ) )
            // InternalShortDSLParser.g:4235:1: ( ( rule__MoveCraneS__CraneAssignment_1 ) )
            {
            // InternalShortDSLParser.g:4235:1: ( ( rule__MoveCraneS__CraneAssignment_1 ) )
            // InternalShortDSLParser.g:4236:2: ( rule__MoveCraneS__CraneAssignment_1 )
            {
             before(grammarAccess.getMoveCraneSAccess().getCraneAssignment_1()); 
            // InternalShortDSLParser.g:4237:2: ( rule__MoveCraneS__CraneAssignment_1 )
            // InternalShortDSLParser.g:4237:3: rule__MoveCraneS__CraneAssignment_1
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
    // InternalShortDSLParser.g:4245:1: rule__MoveCraneS__Group__2 : rule__MoveCraneS__Group__2__Impl rule__MoveCraneS__Group__3 ;
    public final void rule__MoveCraneS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4249:1: ( rule__MoveCraneS__Group__2__Impl rule__MoveCraneS__Group__3 )
            // InternalShortDSLParser.g:4250:2: rule__MoveCraneS__Group__2__Impl rule__MoveCraneS__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalShortDSLParser.g:4257:1: rule__MoveCraneS__Group__2__Impl : ( ( rule__MoveCraneS__ActionAssignment_2 ) ) ;
    public final void rule__MoveCraneS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4261:1: ( ( ( rule__MoveCraneS__ActionAssignment_2 ) ) )
            // InternalShortDSLParser.g:4262:1: ( ( rule__MoveCraneS__ActionAssignment_2 ) )
            {
            // InternalShortDSLParser.g:4262:1: ( ( rule__MoveCraneS__ActionAssignment_2 ) )
            // InternalShortDSLParser.g:4263:2: ( rule__MoveCraneS__ActionAssignment_2 )
            {
             before(grammarAccess.getMoveCraneSAccess().getActionAssignment_2()); 
            // InternalShortDSLParser.g:4264:2: ( rule__MoveCraneS__ActionAssignment_2 )
            // InternalShortDSLParser.g:4264:3: rule__MoveCraneS__ActionAssignment_2
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
    // InternalShortDSLParser.g:4272:1: rule__MoveCraneS__Group__3 : rule__MoveCraneS__Group__3__Impl rule__MoveCraneS__Group__4 ;
    public final void rule__MoveCraneS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4276:1: ( rule__MoveCraneS__Group__3__Impl rule__MoveCraneS__Group__4 )
            // InternalShortDSLParser.g:4277:2: rule__MoveCraneS__Group__3__Impl rule__MoveCraneS__Group__4
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
    // InternalShortDSLParser.g:4284:1: rule__MoveCraneS__Group__3__Impl : ( ( rule__MoveCraneS__Alternatives_3 ) ) ;
    public final void rule__MoveCraneS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4288:1: ( ( ( rule__MoveCraneS__Alternatives_3 ) ) )
            // InternalShortDSLParser.g:4289:1: ( ( rule__MoveCraneS__Alternatives_3 ) )
            {
            // InternalShortDSLParser.g:4289:1: ( ( rule__MoveCraneS__Alternatives_3 ) )
            // InternalShortDSLParser.g:4290:2: ( rule__MoveCraneS__Alternatives_3 )
            {
             before(grammarAccess.getMoveCraneSAccess().getAlternatives_3()); 
            // InternalShortDSLParser.g:4291:2: ( rule__MoveCraneS__Alternatives_3 )
            // InternalShortDSLParser.g:4291:3: rule__MoveCraneS__Alternatives_3
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
    // InternalShortDSLParser.g:4299:1: rule__MoveCraneS__Group__4 : rule__MoveCraneS__Group__4__Impl ;
    public final void rule__MoveCraneS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4303:1: ( rule__MoveCraneS__Group__4__Impl )
            // InternalShortDSLParser.g:4304:2: rule__MoveCraneS__Group__4__Impl
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
    // InternalShortDSLParser.g:4310:1: rule__MoveCraneS__Group__4__Impl : ( ( rule__MoveCraneS__ZoneAssignment_4 ) ) ;
    public final void rule__MoveCraneS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4314:1: ( ( ( rule__MoveCraneS__ZoneAssignment_4 ) ) )
            // InternalShortDSLParser.g:4315:1: ( ( rule__MoveCraneS__ZoneAssignment_4 ) )
            {
            // InternalShortDSLParser.g:4315:1: ( ( rule__MoveCraneS__ZoneAssignment_4 ) )
            // InternalShortDSLParser.g:4316:2: ( rule__MoveCraneS__ZoneAssignment_4 )
            {
             before(grammarAccess.getMoveCraneSAccess().getZoneAssignment_4()); 
            // InternalShortDSLParser.g:4317:2: ( rule__MoveCraneS__ZoneAssignment_4 )
            // InternalShortDSLParser.g:4317:3: rule__MoveCraneS__ZoneAssignment_4
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
    // InternalShortDSLParser.g:4326:1: rule__CraneActionS__Group__0 : rule__CraneActionS__Group__0__Impl rule__CraneActionS__Group__1 ;
    public final void rule__CraneActionS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4330:1: ( rule__CraneActionS__Group__0__Impl rule__CraneActionS__Group__1 )
            // InternalShortDSLParser.g:4331:2: rule__CraneActionS__Group__0__Impl rule__CraneActionS__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalShortDSLParser.g:4338:1: rule__CraneActionS__Group__0__Impl : ( () ) ;
    public final void rule__CraneActionS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4342:1: ( ( () ) )
            // InternalShortDSLParser.g:4343:1: ( () )
            {
            // InternalShortDSLParser.g:4343:1: ( () )
            // InternalShortDSLParser.g:4344:2: ()
            {
             before(grammarAccess.getCraneActionSAccess().getCraneActionAction_0()); 
            // InternalShortDSLParser.g:4345:2: ()
            // InternalShortDSLParser.g:4345:3: 
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
    // InternalShortDSLParser.g:4353:1: rule__CraneActionS__Group__1 : rule__CraneActionS__Group__1__Impl ;
    public final void rule__CraneActionS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4357:1: ( rule__CraneActionS__Group__1__Impl )
            // InternalShortDSLParser.g:4358:2: rule__CraneActionS__Group__1__Impl
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
    // InternalShortDSLParser.g:4364:1: rule__CraneActionS__Group__1__Impl : ( ( rule__CraneActionS__Alternatives_1 ) ) ;
    public final void rule__CraneActionS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4368:1: ( ( ( rule__CraneActionS__Alternatives_1 ) ) )
            // InternalShortDSLParser.g:4369:1: ( ( rule__CraneActionS__Alternatives_1 ) )
            {
            // InternalShortDSLParser.g:4369:1: ( ( rule__CraneActionS__Alternatives_1 ) )
            // InternalShortDSLParser.g:4370:2: ( rule__CraneActionS__Alternatives_1 )
            {
             before(grammarAccess.getCraneActionSAccess().getAlternatives_1()); 
            // InternalShortDSLParser.g:4371:2: ( rule__CraneActionS__Alternatives_1 )
            // InternalShortDSLParser.g:4371:3: rule__CraneActionS__Alternatives_1
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
    // InternalShortDSLParser.g:4380:1: rule__ConditionVariableS__Group__0 : rule__ConditionVariableS__Group__0__Impl rule__ConditionVariableS__Group__1 ;
    public final void rule__ConditionVariableS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4384:1: ( rule__ConditionVariableS__Group__0__Impl rule__ConditionVariableS__Group__1 )
            // InternalShortDSLParser.g:4385:2: rule__ConditionVariableS__Group__0__Impl rule__ConditionVariableS__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalShortDSLParser.g:4392:1: rule__ConditionVariableS__Group__0__Impl : ( () ) ;
    public final void rule__ConditionVariableS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4396:1: ( ( () ) )
            // InternalShortDSLParser.g:4397:1: ( () )
            {
            // InternalShortDSLParser.g:4397:1: ( () )
            // InternalShortDSLParser.g:4398:2: ()
            {
             before(grammarAccess.getConditionVariableSAccess().getConditionVariableAction_0()); 
            // InternalShortDSLParser.g:4399:2: ()
            // InternalShortDSLParser.g:4399:3: 
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
    // InternalShortDSLParser.g:4407:1: rule__ConditionVariableS__Group__1 : rule__ConditionVariableS__Group__1__Impl rule__ConditionVariableS__Group__2 ;
    public final void rule__ConditionVariableS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4411:1: ( rule__ConditionVariableS__Group__1__Impl rule__ConditionVariableS__Group__2 )
            // InternalShortDSLParser.g:4412:2: rule__ConditionVariableS__Group__1__Impl rule__ConditionVariableS__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalShortDSLParser.g:4419:1: rule__ConditionVariableS__Group__1__Impl : ( If ) ;
    public final void rule__ConditionVariableS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4423:1: ( ( If ) )
            // InternalShortDSLParser.g:4424:1: ( If )
            {
            // InternalShortDSLParser.g:4424:1: ( If )
            // InternalShortDSLParser.g:4425:2: If
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
    // InternalShortDSLParser.g:4434:1: rule__ConditionVariableS__Group__2 : rule__ConditionVariableS__Group__2__Impl rule__ConditionVariableS__Group__3 ;
    public final void rule__ConditionVariableS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4438:1: ( rule__ConditionVariableS__Group__2__Impl rule__ConditionVariableS__Group__3 )
            // InternalShortDSLParser.g:4439:2: rule__ConditionVariableS__Group__2__Impl rule__ConditionVariableS__Group__3
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
    // InternalShortDSLParser.g:4446:1: rule__ConditionVariableS__Group__2__Impl : ( Var ) ;
    public final void rule__ConditionVariableS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4450:1: ( ( Var ) )
            // InternalShortDSLParser.g:4451:1: ( Var )
            {
            // InternalShortDSLParser.g:4451:1: ( Var )
            // InternalShortDSLParser.g:4452:2: Var
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
    // InternalShortDSLParser.g:4461:1: rule__ConditionVariableS__Group__3 : rule__ConditionVariableS__Group__3__Impl rule__ConditionVariableS__Group__4 ;
    public final void rule__ConditionVariableS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4465:1: ( rule__ConditionVariableS__Group__3__Impl rule__ConditionVariableS__Group__4 )
            // InternalShortDSLParser.g:4466:2: rule__ConditionVariableS__Group__3__Impl rule__ConditionVariableS__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalShortDSLParser.g:4473:1: rule__ConditionVariableS__Group__3__Impl : ( ( rule__ConditionVariableS__VariableAssignment_3 ) ) ;
    public final void rule__ConditionVariableS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4477:1: ( ( ( rule__ConditionVariableS__VariableAssignment_3 ) ) )
            // InternalShortDSLParser.g:4478:1: ( ( rule__ConditionVariableS__VariableAssignment_3 ) )
            {
            // InternalShortDSLParser.g:4478:1: ( ( rule__ConditionVariableS__VariableAssignment_3 ) )
            // InternalShortDSLParser.g:4479:2: ( rule__ConditionVariableS__VariableAssignment_3 )
            {
             before(grammarAccess.getConditionVariableSAccess().getVariableAssignment_3()); 
            // InternalShortDSLParser.g:4480:2: ( rule__ConditionVariableS__VariableAssignment_3 )
            // InternalShortDSLParser.g:4480:3: rule__ConditionVariableS__VariableAssignment_3
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
    // InternalShortDSLParser.g:4488:1: rule__ConditionVariableS__Group__4 : rule__ConditionVariableS__Group__4__Impl rule__ConditionVariableS__Group__5 ;
    public final void rule__ConditionVariableS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4492:1: ( rule__ConditionVariableS__Group__4__Impl rule__ConditionVariableS__Group__5 )
            // InternalShortDSLParser.g:4493:2: rule__ConditionVariableS__Group__4__Impl rule__ConditionVariableS__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalShortDSLParser.g:4500:1: rule__ConditionVariableS__Group__4__Impl : ( ( rule__ConditionVariableS__ComparisonOperatorAssignment_4 ) ) ;
    public final void rule__ConditionVariableS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4504:1: ( ( ( rule__ConditionVariableS__ComparisonOperatorAssignment_4 ) ) )
            // InternalShortDSLParser.g:4505:1: ( ( rule__ConditionVariableS__ComparisonOperatorAssignment_4 ) )
            {
            // InternalShortDSLParser.g:4505:1: ( ( rule__ConditionVariableS__ComparisonOperatorAssignment_4 ) )
            // InternalShortDSLParser.g:4506:2: ( rule__ConditionVariableS__ComparisonOperatorAssignment_4 )
            {
             before(grammarAccess.getConditionVariableSAccess().getComparisonOperatorAssignment_4()); 
            // InternalShortDSLParser.g:4507:2: ( rule__ConditionVariableS__ComparisonOperatorAssignment_4 )
            // InternalShortDSLParser.g:4507:3: rule__ConditionVariableS__ComparisonOperatorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ConditionVariableS__ComparisonOperatorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionVariableSAccess().getComparisonOperatorAssignment_4()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:4515:1: rule__ConditionVariableS__Group__5 : rule__ConditionVariableS__Group__5__Impl rule__ConditionVariableS__Group__6 ;
    public final void rule__ConditionVariableS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4519:1: ( rule__ConditionVariableS__Group__5__Impl rule__ConditionVariableS__Group__6 )
            // InternalShortDSLParser.g:4520:2: rule__ConditionVariableS__Group__5__Impl rule__ConditionVariableS__Group__6
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
    // InternalShortDSLParser.g:4527:1: rule__ConditionVariableS__Group__5__Impl : ( ( rule__ConditionVariableS__VariableValueAssignment_5 ) ) ;
    public final void rule__ConditionVariableS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4531:1: ( ( ( rule__ConditionVariableS__VariableValueAssignment_5 ) ) )
            // InternalShortDSLParser.g:4532:1: ( ( rule__ConditionVariableS__VariableValueAssignment_5 ) )
            {
            // InternalShortDSLParser.g:4532:1: ( ( rule__ConditionVariableS__VariableValueAssignment_5 ) )
            // InternalShortDSLParser.g:4533:2: ( rule__ConditionVariableS__VariableValueAssignment_5 )
            {
             before(grammarAccess.getConditionVariableSAccess().getVariableValueAssignment_5()); 
            // InternalShortDSLParser.g:4534:2: ( rule__ConditionVariableS__VariableValueAssignment_5 )
            // InternalShortDSLParser.g:4534:3: rule__ConditionVariableS__VariableValueAssignment_5
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
    // InternalShortDSLParser.g:4542:1: rule__ConditionVariableS__Group__6 : rule__ConditionVariableS__Group__6__Impl rule__ConditionVariableS__Group__7 ;
    public final void rule__ConditionVariableS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4546:1: ( rule__ConditionVariableS__Group__6__Impl rule__ConditionVariableS__Group__7 )
            // InternalShortDSLParser.g:4547:2: rule__ConditionVariableS__Group__6__Impl rule__ConditionVariableS__Group__7
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
    // InternalShortDSLParser.g:4554:1: rule__ConditionVariableS__Group__6__Impl : ( Colon ) ;
    public final void rule__ConditionVariableS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4558:1: ( ( Colon ) )
            // InternalShortDSLParser.g:4559:1: ( Colon )
            {
            // InternalShortDSLParser.g:4559:1: ( Colon )
            // InternalShortDSLParser.g:4560:2: Colon
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
    // InternalShortDSLParser.g:4569:1: rule__ConditionVariableS__Group__7 : rule__ConditionVariableS__Group__7__Impl rule__ConditionVariableS__Group__8 ;
    public final void rule__ConditionVariableS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4573:1: ( rule__ConditionVariableS__Group__7__Impl rule__ConditionVariableS__Group__8 )
            // InternalShortDSLParser.g:4574:2: rule__ConditionVariableS__Group__7__Impl rule__ConditionVariableS__Group__8
            {
            pushFollow(FOLLOW_30);
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
    // InternalShortDSLParser.g:4581:1: rule__ConditionVariableS__Group__7__Impl : ( RULE_BEGIN ) ;
    public final void rule__ConditionVariableS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4585:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:4586:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:4586:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:4587:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:4596:1: rule__ConditionVariableS__Group__8 : rule__ConditionVariableS__Group__8__Impl rule__ConditionVariableS__Group__9 ;
    public final void rule__ConditionVariableS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4600:1: ( rule__ConditionVariableS__Group__8__Impl rule__ConditionVariableS__Group__9 )
            // InternalShortDSLParser.g:4601:2: rule__ConditionVariableS__Group__8__Impl rule__ConditionVariableS__Group__9
            {
            pushFollow(FOLLOW_30);
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
    // InternalShortDSLParser.g:4608:1: rule__ConditionVariableS__Group__8__Impl : ( ( rule__ConditionVariableS__StatementsAssignment_8 )* ) ;
    public final void rule__ConditionVariableS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4612:1: ( ( ( rule__ConditionVariableS__StatementsAssignment_8 )* ) )
            // InternalShortDSLParser.g:4613:1: ( ( rule__ConditionVariableS__StatementsAssignment_8 )* )
            {
            // InternalShortDSLParser.g:4613:1: ( ( rule__ConditionVariableS__StatementsAssignment_8 )* )
            // InternalShortDSLParser.g:4614:2: ( rule__ConditionVariableS__StatementsAssignment_8 )*
            {
             before(grammarAccess.getConditionVariableSAccess().getStatementsAssignment_8()); 
            // InternalShortDSLParser.g:4615:2: ( rule__ConditionVariableS__StatementsAssignment_8 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=In_progress && LA35_0<=Complete)||LA35_0==Foreach||LA35_0==Pickup||(LA35_0>=Drop && LA35_0<=Free)||LA35_0==If||LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalShortDSLParser.g:4615:3: rule__ConditionVariableS__StatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__ConditionVariableS__StatementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalShortDSLParser.g:4623:1: rule__ConditionVariableS__Group__9 : rule__ConditionVariableS__Group__9__Impl ;
    public final void rule__ConditionVariableS__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4627:1: ( rule__ConditionVariableS__Group__9__Impl )
            // InternalShortDSLParser.g:4628:2: rule__ConditionVariableS__Group__9__Impl
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
    // InternalShortDSLParser.g:4634:1: rule__ConditionVariableS__Group__9__Impl : ( RULE_END ) ;
    public final void rule__ConditionVariableS__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4638:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:4639:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:4639:1: ( RULE_END )
            // InternalShortDSLParser.g:4640:2: RULE_END
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


    // $ANTLR start "rule__ConditionSlotS__Group__0"
    // InternalShortDSLParser.g:4650:1: rule__ConditionSlotS__Group__0 : rule__ConditionSlotS__Group__0__Impl rule__ConditionSlotS__Group__1 ;
    public final void rule__ConditionSlotS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4654:1: ( rule__ConditionSlotS__Group__0__Impl rule__ConditionSlotS__Group__1 )
            // InternalShortDSLParser.g:4655:2: rule__ConditionSlotS__Group__0__Impl rule__ConditionSlotS__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ConditionSlotS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionSlotS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__0"


    // $ANTLR start "rule__ConditionSlotS__Group__0__Impl"
    // InternalShortDSLParser.g:4662:1: rule__ConditionSlotS__Group__0__Impl : ( () ) ;
    public final void rule__ConditionSlotS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4666:1: ( ( () ) )
            // InternalShortDSLParser.g:4667:1: ( () )
            {
            // InternalShortDSLParser.g:4667:1: ( () )
            // InternalShortDSLParser.g:4668:2: ()
            {
             before(grammarAccess.getConditionSlotSAccess().getConditionSlotAction_0()); 
            // InternalShortDSLParser.g:4669:2: ()
            // InternalShortDSLParser.g:4669:3: 
            {
            }

             after(grammarAccess.getConditionSlotSAccess().getConditionSlotAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__0__Impl"


    // $ANTLR start "rule__ConditionSlotS__Group__1"
    // InternalShortDSLParser.g:4677:1: rule__ConditionSlotS__Group__1 : rule__ConditionSlotS__Group__1__Impl rule__ConditionSlotS__Group__2 ;
    public final void rule__ConditionSlotS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4681:1: ( rule__ConditionSlotS__Group__1__Impl rule__ConditionSlotS__Group__2 )
            // InternalShortDSLParser.g:4682:2: rule__ConditionSlotS__Group__1__Impl rule__ConditionSlotS__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__ConditionSlotS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionSlotS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__1"


    // $ANTLR start "rule__ConditionSlotS__Group__1__Impl"
    // InternalShortDSLParser.g:4689:1: rule__ConditionSlotS__Group__1__Impl : ( If ) ;
    public final void rule__ConditionSlotS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4693:1: ( ( If ) )
            // InternalShortDSLParser.g:4694:1: ( If )
            {
            // InternalShortDSLParser.g:4694:1: ( If )
            // InternalShortDSLParser.g:4695:2: If
            {
             before(grammarAccess.getConditionSlotSAccess().getIfKeyword_1()); 
            match(input,If,FOLLOW_2); 
             after(grammarAccess.getConditionSlotSAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__1__Impl"


    // $ANTLR start "rule__ConditionSlotS__Group__2"
    // InternalShortDSLParser.g:4704:1: rule__ConditionSlotS__Group__2 : rule__ConditionSlotS__Group__2__Impl rule__ConditionSlotS__Group__3 ;
    public final void rule__ConditionSlotS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4708:1: ( rule__ConditionSlotS__Group__2__Impl rule__ConditionSlotS__Group__3 )
            // InternalShortDSLParser.g:4709:2: rule__ConditionSlotS__Group__2__Impl rule__ConditionSlotS__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ConditionSlotS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionSlotS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__2"


    // $ANTLR start "rule__ConditionSlotS__Group__2__Impl"
    // InternalShortDSLParser.g:4716:1: rule__ConditionSlotS__Group__2__Impl : ( Slot ) ;
    public final void rule__ConditionSlotS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4720:1: ( ( Slot ) )
            // InternalShortDSLParser.g:4721:1: ( Slot )
            {
            // InternalShortDSLParser.g:4721:1: ( Slot )
            // InternalShortDSLParser.g:4722:2: Slot
            {
             before(grammarAccess.getConditionSlotSAccess().getSlotKeyword_2()); 
            match(input,Slot,FOLLOW_2); 
             after(grammarAccess.getConditionSlotSAccess().getSlotKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__2__Impl"


    // $ANTLR start "rule__ConditionSlotS__Group__3"
    // InternalShortDSLParser.g:4731:1: rule__ConditionSlotS__Group__3 : rule__ConditionSlotS__Group__3__Impl rule__ConditionSlotS__Group__4 ;
    public final void rule__ConditionSlotS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4735:1: ( rule__ConditionSlotS__Group__3__Impl rule__ConditionSlotS__Group__4 )
            // InternalShortDSLParser.g:4736:2: rule__ConditionSlotS__Group__3__Impl rule__ConditionSlotS__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__ConditionSlotS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionSlotS__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__3"


    // $ANTLR start "rule__ConditionSlotS__Group__3__Impl"
    // InternalShortDSLParser.g:4743:1: rule__ConditionSlotS__Group__3__Impl : ( ( rule__ConditionSlotS__VariableAssignment_3 ) ) ;
    public final void rule__ConditionSlotS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4747:1: ( ( ( rule__ConditionSlotS__VariableAssignment_3 ) ) )
            // InternalShortDSLParser.g:4748:1: ( ( rule__ConditionSlotS__VariableAssignment_3 ) )
            {
            // InternalShortDSLParser.g:4748:1: ( ( rule__ConditionSlotS__VariableAssignment_3 ) )
            // InternalShortDSLParser.g:4749:2: ( rule__ConditionSlotS__VariableAssignment_3 )
            {
             before(grammarAccess.getConditionSlotSAccess().getVariableAssignment_3()); 
            // InternalShortDSLParser.g:4750:2: ( rule__ConditionSlotS__VariableAssignment_3 )
            // InternalShortDSLParser.g:4750:3: rule__ConditionSlotS__VariableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConditionSlotS__VariableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionSlotSAccess().getVariableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__3__Impl"


    // $ANTLR start "rule__ConditionSlotS__Group__4"
    // InternalShortDSLParser.g:4758:1: rule__ConditionSlotS__Group__4 : rule__ConditionSlotS__Group__4__Impl rule__ConditionSlotS__Group__5 ;
    public final void rule__ConditionSlotS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4762:1: ( rule__ConditionSlotS__Group__4__Impl rule__ConditionSlotS__Group__5 )
            // InternalShortDSLParser.g:4763:2: rule__ConditionSlotS__Group__4__Impl rule__ConditionSlotS__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__ConditionSlotS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionSlotS__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__4"


    // $ANTLR start "rule__ConditionSlotS__Group__4__Impl"
    // InternalShortDSLParser.g:4770:1: rule__ConditionSlotS__Group__4__Impl : ( ( rule__ConditionSlotS__ComparisonOperatorAssignment_4 ) ) ;
    public final void rule__ConditionSlotS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4774:1: ( ( ( rule__ConditionSlotS__ComparisonOperatorAssignment_4 ) ) )
            // InternalShortDSLParser.g:4775:1: ( ( rule__ConditionSlotS__ComparisonOperatorAssignment_4 ) )
            {
            // InternalShortDSLParser.g:4775:1: ( ( rule__ConditionSlotS__ComparisonOperatorAssignment_4 ) )
            // InternalShortDSLParser.g:4776:2: ( rule__ConditionSlotS__ComparisonOperatorAssignment_4 )
            {
             before(grammarAccess.getConditionSlotSAccess().getComparisonOperatorAssignment_4()); 
            // InternalShortDSLParser.g:4777:2: ( rule__ConditionSlotS__ComparisonOperatorAssignment_4 )
            // InternalShortDSLParser.g:4777:3: rule__ConditionSlotS__ComparisonOperatorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ConditionSlotS__ComparisonOperatorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionSlotSAccess().getComparisonOperatorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__4__Impl"


    // $ANTLR start "rule__ConditionSlotS__Group__5"
    // InternalShortDSLParser.g:4785:1: rule__ConditionSlotS__Group__5 : rule__ConditionSlotS__Group__5__Impl rule__ConditionSlotS__Group__6 ;
    public final void rule__ConditionSlotS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4789:1: ( rule__ConditionSlotS__Group__5__Impl rule__ConditionSlotS__Group__6 )
            // InternalShortDSLParser.g:4790:2: rule__ConditionSlotS__Group__5__Impl rule__ConditionSlotS__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__ConditionSlotS__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionSlotS__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__5"


    // $ANTLR start "rule__ConditionSlotS__Group__5__Impl"
    // InternalShortDSLParser.g:4797:1: rule__ConditionSlotS__Group__5__Impl : ( ( rule__ConditionSlotS__SlotValueAssignment_5 ) ) ;
    public final void rule__ConditionSlotS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4801:1: ( ( ( rule__ConditionSlotS__SlotValueAssignment_5 ) ) )
            // InternalShortDSLParser.g:4802:1: ( ( rule__ConditionSlotS__SlotValueAssignment_5 ) )
            {
            // InternalShortDSLParser.g:4802:1: ( ( rule__ConditionSlotS__SlotValueAssignment_5 ) )
            // InternalShortDSLParser.g:4803:2: ( rule__ConditionSlotS__SlotValueAssignment_5 )
            {
             before(grammarAccess.getConditionSlotSAccess().getSlotValueAssignment_5()); 
            // InternalShortDSLParser.g:4804:2: ( rule__ConditionSlotS__SlotValueAssignment_5 )
            // InternalShortDSLParser.g:4804:3: rule__ConditionSlotS__SlotValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ConditionSlotS__SlotValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConditionSlotSAccess().getSlotValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__5__Impl"


    // $ANTLR start "rule__ConditionSlotS__Group__6"
    // InternalShortDSLParser.g:4812:1: rule__ConditionSlotS__Group__6 : rule__ConditionSlotS__Group__6__Impl rule__ConditionSlotS__Group__7 ;
    public final void rule__ConditionSlotS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4816:1: ( rule__ConditionSlotS__Group__6__Impl rule__ConditionSlotS__Group__7 )
            // InternalShortDSLParser.g:4817:2: rule__ConditionSlotS__Group__6__Impl rule__ConditionSlotS__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__ConditionSlotS__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionSlotS__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__6"


    // $ANTLR start "rule__ConditionSlotS__Group__6__Impl"
    // InternalShortDSLParser.g:4824:1: rule__ConditionSlotS__Group__6__Impl : ( Colon ) ;
    public final void rule__ConditionSlotS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4828:1: ( ( Colon ) )
            // InternalShortDSLParser.g:4829:1: ( Colon )
            {
            // InternalShortDSLParser.g:4829:1: ( Colon )
            // InternalShortDSLParser.g:4830:2: Colon
            {
             before(grammarAccess.getConditionSlotSAccess().getColonKeyword_6()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getConditionSlotSAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__6__Impl"


    // $ANTLR start "rule__ConditionSlotS__Group__7"
    // InternalShortDSLParser.g:4839:1: rule__ConditionSlotS__Group__7 : rule__ConditionSlotS__Group__7__Impl rule__ConditionSlotS__Group__8 ;
    public final void rule__ConditionSlotS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4843:1: ( rule__ConditionSlotS__Group__7__Impl rule__ConditionSlotS__Group__8 )
            // InternalShortDSLParser.g:4844:2: rule__ConditionSlotS__Group__7__Impl rule__ConditionSlotS__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__ConditionSlotS__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionSlotS__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__7"


    // $ANTLR start "rule__ConditionSlotS__Group__7__Impl"
    // InternalShortDSLParser.g:4851:1: rule__ConditionSlotS__Group__7__Impl : ( RULE_BEGIN ) ;
    public final void rule__ConditionSlotS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4855:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:4856:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:4856:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:4857:2: RULE_BEGIN
            {
             before(grammarAccess.getConditionSlotSAccess().getBEGINTerminalRuleCall_7()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getConditionSlotSAccess().getBEGINTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__7__Impl"


    // $ANTLR start "rule__ConditionSlotS__Group__8"
    // InternalShortDSLParser.g:4866:1: rule__ConditionSlotS__Group__8 : rule__ConditionSlotS__Group__8__Impl rule__ConditionSlotS__Group__9 ;
    public final void rule__ConditionSlotS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4870:1: ( rule__ConditionSlotS__Group__8__Impl rule__ConditionSlotS__Group__9 )
            // InternalShortDSLParser.g:4871:2: rule__ConditionSlotS__Group__8__Impl rule__ConditionSlotS__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__ConditionSlotS__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionSlotS__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__8"


    // $ANTLR start "rule__ConditionSlotS__Group__8__Impl"
    // InternalShortDSLParser.g:4878:1: rule__ConditionSlotS__Group__8__Impl : ( ( rule__ConditionSlotS__StatementsAssignment_8 )* ) ;
    public final void rule__ConditionSlotS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4882:1: ( ( ( rule__ConditionSlotS__StatementsAssignment_8 )* ) )
            // InternalShortDSLParser.g:4883:1: ( ( rule__ConditionSlotS__StatementsAssignment_8 )* )
            {
            // InternalShortDSLParser.g:4883:1: ( ( rule__ConditionSlotS__StatementsAssignment_8 )* )
            // InternalShortDSLParser.g:4884:2: ( rule__ConditionSlotS__StatementsAssignment_8 )*
            {
             before(grammarAccess.getConditionSlotSAccess().getStatementsAssignment_8()); 
            // InternalShortDSLParser.g:4885:2: ( rule__ConditionSlotS__StatementsAssignment_8 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=In_progress && LA36_0<=Complete)||LA36_0==Foreach||LA36_0==Pickup||(LA36_0>=Drop && LA36_0<=Free)||LA36_0==If||LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalShortDSLParser.g:4885:3: rule__ConditionSlotS__StatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__ConditionSlotS__StatementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getConditionSlotSAccess().getStatementsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__8__Impl"


    // $ANTLR start "rule__ConditionSlotS__Group__9"
    // InternalShortDSLParser.g:4893:1: rule__ConditionSlotS__Group__9 : rule__ConditionSlotS__Group__9__Impl ;
    public final void rule__ConditionSlotS__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4897:1: ( rule__ConditionSlotS__Group__9__Impl )
            // InternalShortDSLParser.g:4898:2: rule__ConditionSlotS__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionSlotS__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__9"


    // $ANTLR start "rule__ConditionSlotS__Group__9__Impl"
    // InternalShortDSLParser.g:4904:1: rule__ConditionSlotS__Group__9__Impl : ( RULE_END ) ;
    public final void rule__ConditionSlotS__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4908:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:4909:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:4909:1: ( RULE_END )
            // InternalShortDSLParser.g:4910:2: RULE_END
            {
             before(grammarAccess.getConditionSlotSAccess().getENDTerminalRuleCall_9()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getConditionSlotSAccess().getENDTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__Group__9__Impl"


    // $ANTLR start "rule__ConditionDeviceS__Group__0"
    // InternalShortDSLParser.g:4920:1: rule__ConditionDeviceS__Group__0 : rule__ConditionDeviceS__Group__0__Impl rule__ConditionDeviceS__Group__1 ;
    public final void rule__ConditionDeviceS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4924:1: ( rule__ConditionDeviceS__Group__0__Impl rule__ConditionDeviceS__Group__1 )
            // InternalShortDSLParser.g:4925:2: rule__ConditionDeviceS__Group__0__Impl rule__ConditionDeviceS__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalShortDSLParser.g:4932:1: rule__ConditionDeviceS__Group__0__Impl : ( () ) ;
    public final void rule__ConditionDeviceS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4936:1: ( ( () ) )
            // InternalShortDSLParser.g:4937:1: ( () )
            {
            // InternalShortDSLParser.g:4937:1: ( () )
            // InternalShortDSLParser.g:4938:2: ()
            {
             before(grammarAccess.getConditionDeviceSAccess().getConditionDeviceAction_0()); 
            // InternalShortDSLParser.g:4939:2: ()
            // InternalShortDSLParser.g:4939:3: 
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
    // InternalShortDSLParser.g:4947:1: rule__ConditionDeviceS__Group__1 : rule__ConditionDeviceS__Group__1__Impl rule__ConditionDeviceS__Group__2 ;
    public final void rule__ConditionDeviceS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4951:1: ( rule__ConditionDeviceS__Group__1__Impl rule__ConditionDeviceS__Group__2 )
            // InternalShortDSLParser.g:4952:2: rule__ConditionDeviceS__Group__1__Impl rule__ConditionDeviceS__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalShortDSLParser.g:4959:1: rule__ConditionDeviceS__Group__1__Impl : ( If ) ;
    public final void rule__ConditionDeviceS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4963:1: ( ( If ) )
            // InternalShortDSLParser.g:4964:1: ( If )
            {
            // InternalShortDSLParser.g:4964:1: ( If )
            // InternalShortDSLParser.g:4965:2: If
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
    // InternalShortDSLParser.g:4974:1: rule__ConditionDeviceS__Group__2 : rule__ConditionDeviceS__Group__2__Impl rule__ConditionDeviceS__Group__3 ;
    public final void rule__ConditionDeviceS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4978:1: ( rule__ConditionDeviceS__Group__2__Impl rule__ConditionDeviceS__Group__3 )
            // InternalShortDSLParser.g:4979:2: rule__ConditionDeviceS__Group__2__Impl rule__ConditionDeviceS__Group__3
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
    // InternalShortDSLParser.g:4986:1: rule__ConditionDeviceS__Group__2__Impl : ( Dev ) ;
    public final void rule__ConditionDeviceS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4990:1: ( ( Dev ) )
            // InternalShortDSLParser.g:4991:1: ( Dev )
            {
            // InternalShortDSLParser.g:4991:1: ( Dev )
            // InternalShortDSLParser.g:4992:2: Dev
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
    // InternalShortDSLParser.g:5001:1: rule__ConditionDeviceS__Group__3 : rule__ConditionDeviceS__Group__3__Impl rule__ConditionDeviceS__Group__4 ;
    public final void rule__ConditionDeviceS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5005:1: ( rule__ConditionDeviceS__Group__3__Impl rule__ConditionDeviceS__Group__4 )
            // InternalShortDSLParser.g:5006:2: rule__ConditionDeviceS__Group__3__Impl rule__ConditionDeviceS__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalShortDSLParser.g:5013:1: rule__ConditionDeviceS__Group__3__Impl : ( ( rule__ConditionDeviceS__DeviceAssignment_3 ) ) ;
    public final void rule__ConditionDeviceS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5017:1: ( ( ( rule__ConditionDeviceS__DeviceAssignment_3 ) ) )
            // InternalShortDSLParser.g:5018:1: ( ( rule__ConditionDeviceS__DeviceAssignment_3 ) )
            {
            // InternalShortDSLParser.g:5018:1: ( ( rule__ConditionDeviceS__DeviceAssignment_3 ) )
            // InternalShortDSLParser.g:5019:2: ( rule__ConditionDeviceS__DeviceAssignment_3 )
            {
             before(grammarAccess.getConditionDeviceSAccess().getDeviceAssignment_3()); 
            // InternalShortDSLParser.g:5020:2: ( rule__ConditionDeviceS__DeviceAssignment_3 )
            // InternalShortDSLParser.g:5020:3: rule__ConditionDeviceS__DeviceAssignment_3
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
    // InternalShortDSLParser.g:5028:1: rule__ConditionDeviceS__Group__4 : rule__ConditionDeviceS__Group__4__Impl rule__ConditionDeviceS__Group__5 ;
    public final void rule__ConditionDeviceS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5032:1: ( rule__ConditionDeviceS__Group__4__Impl rule__ConditionDeviceS__Group__5 )
            // InternalShortDSLParser.g:5033:2: rule__ConditionDeviceS__Group__4__Impl rule__ConditionDeviceS__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalShortDSLParser.g:5040:1: rule__ConditionDeviceS__Group__4__Impl : ( ( rule__ConditionDeviceS__ComparisonOperatorAssignment_4 ) ) ;
    public final void rule__ConditionDeviceS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5044:1: ( ( ( rule__ConditionDeviceS__ComparisonOperatorAssignment_4 ) ) )
            // InternalShortDSLParser.g:5045:1: ( ( rule__ConditionDeviceS__ComparisonOperatorAssignment_4 ) )
            {
            // InternalShortDSLParser.g:5045:1: ( ( rule__ConditionDeviceS__ComparisonOperatorAssignment_4 ) )
            // InternalShortDSLParser.g:5046:2: ( rule__ConditionDeviceS__ComparisonOperatorAssignment_4 )
            {
             before(grammarAccess.getConditionDeviceSAccess().getComparisonOperatorAssignment_4()); 
            // InternalShortDSLParser.g:5047:2: ( rule__ConditionDeviceS__ComparisonOperatorAssignment_4 )
            // InternalShortDSLParser.g:5047:3: rule__ConditionDeviceS__ComparisonOperatorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__ComparisonOperatorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionDeviceSAccess().getComparisonOperatorAssignment_4()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:5055:1: rule__ConditionDeviceS__Group__5 : rule__ConditionDeviceS__Group__5__Impl rule__ConditionDeviceS__Group__6 ;
    public final void rule__ConditionDeviceS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5059:1: ( rule__ConditionDeviceS__Group__5__Impl rule__ConditionDeviceS__Group__6 )
            // InternalShortDSLParser.g:5060:2: rule__ConditionDeviceS__Group__5__Impl rule__ConditionDeviceS__Group__6
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
    // InternalShortDSLParser.g:5067:1: rule__ConditionDeviceS__Group__5__Impl : ( ( rule__ConditionDeviceS__DeviceValueAssignment_5 ) ) ;
    public final void rule__ConditionDeviceS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5071:1: ( ( ( rule__ConditionDeviceS__DeviceValueAssignment_5 ) ) )
            // InternalShortDSLParser.g:5072:1: ( ( rule__ConditionDeviceS__DeviceValueAssignment_5 ) )
            {
            // InternalShortDSLParser.g:5072:1: ( ( rule__ConditionDeviceS__DeviceValueAssignment_5 ) )
            // InternalShortDSLParser.g:5073:2: ( rule__ConditionDeviceS__DeviceValueAssignment_5 )
            {
             before(grammarAccess.getConditionDeviceSAccess().getDeviceValueAssignment_5()); 
            // InternalShortDSLParser.g:5074:2: ( rule__ConditionDeviceS__DeviceValueAssignment_5 )
            // InternalShortDSLParser.g:5074:3: rule__ConditionDeviceS__DeviceValueAssignment_5
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
    // InternalShortDSLParser.g:5082:1: rule__ConditionDeviceS__Group__6 : rule__ConditionDeviceS__Group__6__Impl rule__ConditionDeviceS__Group__7 ;
    public final void rule__ConditionDeviceS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5086:1: ( rule__ConditionDeviceS__Group__6__Impl rule__ConditionDeviceS__Group__7 )
            // InternalShortDSLParser.g:5087:2: rule__ConditionDeviceS__Group__6__Impl rule__ConditionDeviceS__Group__7
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
    // InternalShortDSLParser.g:5094:1: rule__ConditionDeviceS__Group__6__Impl : ( Colon ) ;
    public final void rule__ConditionDeviceS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5098:1: ( ( Colon ) )
            // InternalShortDSLParser.g:5099:1: ( Colon )
            {
            // InternalShortDSLParser.g:5099:1: ( Colon )
            // InternalShortDSLParser.g:5100:2: Colon
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
    // InternalShortDSLParser.g:5109:1: rule__ConditionDeviceS__Group__7 : rule__ConditionDeviceS__Group__7__Impl rule__ConditionDeviceS__Group__8 ;
    public final void rule__ConditionDeviceS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5113:1: ( rule__ConditionDeviceS__Group__7__Impl rule__ConditionDeviceS__Group__8 )
            // InternalShortDSLParser.g:5114:2: rule__ConditionDeviceS__Group__7__Impl rule__ConditionDeviceS__Group__8
            {
            pushFollow(FOLLOW_30);
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
    // InternalShortDSLParser.g:5121:1: rule__ConditionDeviceS__Group__7__Impl : ( RULE_BEGIN ) ;
    public final void rule__ConditionDeviceS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5125:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:5126:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:5126:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:5127:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:5136:1: rule__ConditionDeviceS__Group__8 : rule__ConditionDeviceS__Group__8__Impl rule__ConditionDeviceS__Group__9 ;
    public final void rule__ConditionDeviceS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5140:1: ( rule__ConditionDeviceS__Group__8__Impl rule__ConditionDeviceS__Group__9 )
            // InternalShortDSLParser.g:5141:2: rule__ConditionDeviceS__Group__8__Impl rule__ConditionDeviceS__Group__9
            {
            pushFollow(FOLLOW_30);
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
    // InternalShortDSLParser.g:5148:1: rule__ConditionDeviceS__Group__8__Impl : ( ( rule__ConditionDeviceS__StatementsAssignment_8 )* ) ;
    public final void rule__ConditionDeviceS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5152:1: ( ( ( rule__ConditionDeviceS__StatementsAssignment_8 )* ) )
            // InternalShortDSLParser.g:5153:1: ( ( rule__ConditionDeviceS__StatementsAssignment_8 )* )
            {
            // InternalShortDSLParser.g:5153:1: ( ( rule__ConditionDeviceS__StatementsAssignment_8 )* )
            // InternalShortDSLParser.g:5154:2: ( rule__ConditionDeviceS__StatementsAssignment_8 )*
            {
             before(grammarAccess.getConditionDeviceSAccess().getStatementsAssignment_8()); 
            // InternalShortDSLParser.g:5155:2: ( rule__ConditionDeviceS__StatementsAssignment_8 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=In_progress && LA37_0<=Complete)||LA37_0==Foreach||LA37_0==Pickup||(LA37_0>=Drop && LA37_0<=Free)||LA37_0==If||LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalShortDSLParser.g:5155:3: rule__ConditionDeviceS__StatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__ConditionDeviceS__StatementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalShortDSLParser.g:5163:1: rule__ConditionDeviceS__Group__9 : rule__ConditionDeviceS__Group__9__Impl ;
    public final void rule__ConditionDeviceS__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5167:1: ( rule__ConditionDeviceS__Group__9__Impl )
            // InternalShortDSLParser.g:5168:2: rule__ConditionDeviceS__Group__9__Impl
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
    // InternalShortDSLParser.g:5174:1: rule__ConditionDeviceS__Group__9__Impl : ( RULE_END ) ;
    public final void rule__ConditionDeviceS__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5178:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:5179:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:5179:1: ( RULE_END )
            // InternalShortDSLParser.g:5180:2: RULE_END
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
    // InternalShortDSLParser.g:5190:1: rule__MarkVariableValueS__Group__0 : rule__MarkVariableValueS__Group__0__Impl rule__MarkVariableValueS__Group__1 ;
    public final void rule__MarkVariableValueS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5194:1: ( rule__MarkVariableValueS__Group__0__Impl rule__MarkVariableValueS__Group__1 )
            // InternalShortDSLParser.g:5195:2: rule__MarkVariableValueS__Group__0__Impl rule__MarkVariableValueS__Group__1
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
    // InternalShortDSLParser.g:5202:1: rule__MarkVariableValueS__Group__0__Impl : ( () ) ;
    public final void rule__MarkVariableValueS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5206:1: ( ( () ) )
            // InternalShortDSLParser.g:5207:1: ( () )
            {
            // InternalShortDSLParser.g:5207:1: ( () )
            // InternalShortDSLParser.g:5208:2: ()
            {
             before(grammarAccess.getMarkVariableValueSAccess().getMarkVariableValueAction_0()); 
            // InternalShortDSLParser.g:5209:2: ()
            // InternalShortDSLParser.g:5209:3: 
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
    // InternalShortDSLParser.g:5217:1: rule__MarkVariableValueS__Group__1 : rule__MarkVariableValueS__Group__1__Impl rule__MarkVariableValueS__Group__2 ;
    public final void rule__MarkVariableValueS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5221:1: ( rule__MarkVariableValueS__Group__1__Impl rule__MarkVariableValueS__Group__2 )
            // InternalShortDSLParser.g:5222:2: rule__MarkVariableValueS__Group__1__Impl rule__MarkVariableValueS__Group__2
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
    // InternalShortDSLParser.g:5229:1: rule__MarkVariableValueS__Group__1__Impl : ( ( rule__MarkVariableValueS__VariableAssignment_1 ) ) ;
    public final void rule__MarkVariableValueS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5233:1: ( ( ( rule__MarkVariableValueS__VariableAssignment_1 ) ) )
            // InternalShortDSLParser.g:5234:1: ( ( rule__MarkVariableValueS__VariableAssignment_1 ) )
            {
            // InternalShortDSLParser.g:5234:1: ( ( rule__MarkVariableValueS__VariableAssignment_1 ) )
            // InternalShortDSLParser.g:5235:2: ( rule__MarkVariableValueS__VariableAssignment_1 )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getVariableAssignment_1()); 
            // InternalShortDSLParser.g:5236:2: ( rule__MarkVariableValueS__VariableAssignment_1 )
            // InternalShortDSLParser.g:5236:3: rule__MarkVariableValueS__VariableAssignment_1
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
    // InternalShortDSLParser.g:5244:1: rule__MarkVariableValueS__Group__2 : rule__MarkVariableValueS__Group__2__Impl rule__MarkVariableValueS__Group__3 ;
    public final void rule__MarkVariableValueS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5248:1: ( rule__MarkVariableValueS__Group__2__Impl rule__MarkVariableValueS__Group__3 )
            // InternalShortDSLParser.g:5249:2: rule__MarkVariableValueS__Group__2__Impl rule__MarkVariableValueS__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalShortDSLParser.g:5256:1: rule__MarkVariableValueS__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__MarkVariableValueS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5260:1: ( ( LeftParenthesis ) )
            // InternalShortDSLParser.g:5261:1: ( LeftParenthesis )
            {
            // InternalShortDSLParser.g:5261:1: ( LeftParenthesis )
            // InternalShortDSLParser.g:5262:2: LeftParenthesis
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
    // InternalShortDSLParser.g:5271:1: rule__MarkVariableValueS__Group__3 : rule__MarkVariableValueS__Group__3__Impl rule__MarkVariableValueS__Group__4 ;
    public final void rule__MarkVariableValueS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5275:1: ( rule__MarkVariableValueS__Group__3__Impl rule__MarkVariableValueS__Group__4 )
            // InternalShortDSLParser.g:5276:2: rule__MarkVariableValueS__Group__3__Impl rule__MarkVariableValueS__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalShortDSLParser.g:5283:1: rule__MarkVariableValueS__Group__3__Impl : ( ( rule__MarkVariableValueS__ValueAssignment_3 ) ) ;
    public final void rule__MarkVariableValueS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5287:1: ( ( ( rule__MarkVariableValueS__ValueAssignment_3 ) ) )
            // InternalShortDSLParser.g:5288:1: ( ( rule__MarkVariableValueS__ValueAssignment_3 ) )
            {
            // InternalShortDSLParser.g:5288:1: ( ( rule__MarkVariableValueS__ValueAssignment_3 ) )
            // InternalShortDSLParser.g:5289:2: ( rule__MarkVariableValueS__ValueAssignment_3 )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getValueAssignment_3()); 
            // InternalShortDSLParser.g:5290:2: ( rule__MarkVariableValueS__ValueAssignment_3 )
            // InternalShortDSLParser.g:5290:3: rule__MarkVariableValueS__ValueAssignment_3
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
    // InternalShortDSLParser.g:5298:1: rule__MarkVariableValueS__Group__4 : rule__MarkVariableValueS__Group__4__Impl rule__MarkVariableValueS__Group__5 ;
    public final void rule__MarkVariableValueS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5302:1: ( rule__MarkVariableValueS__Group__4__Impl rule__MarkVariableValueS__Group__5 )
            // InternalShortDSLParser.g:5303:2: rule__MarkVariableValueS__Group__4__Impl rule__MarkVariableValueS__Group__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalShortDSLParser.g:5310:1: rule__MarkVariableValueS__Group__4__Impl : ( ( rule__MarkVariableValueS__Group_4__0 )? ) ;
    public final void rule__MarkVariableValueS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5314:1: ( ( ( rule__MarkVariableValueS__Group_4__0 )? ) )
            // InternalShortDSLParser.g:5315:1: ( ( rule__MarkVariableValueS__Group_4__0 )? )
            {
            // InternalShortDSLParser.g:5315:1: ( ( rule__MarkVariableValueS__Group_4__0 )? )
            // InternalShortDSLParser.g:5316:2: ( rule__MarkVariableValueS__Group_4__0 )?
            {
             before(grammarAccess.getMarkVariableValueSAccess().getGroup_4()); 
            // InternalShortDSLParser.g:5317:2: ( rule__MarkVariableValueS__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Comma) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalShortDSLParser.g:5317:3: rule__MarkVariableValueS__Group_4__0
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
    // InternalShortDSLParser.g:5325:1: rule__MarkVariableValueS__Group__5 : rule__MarkVariableValueS__Group__5__Impl ;
    public final void rule__MarkVariableValueS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5329:1: ( rule__MarkVariableValueS__Group__5__Impl )
            // InternalShortDSLParser.g:5330:2: rule__MarkVariableValueS__Group__5__Impl
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
    // InternalShortDSLParser.g:5336:1: rule__MarkVariableValueS__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__MarkVariableValueS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5340:1: ( ( RightParenthesis ) )
            // InternalShortDSLParser.g:5341:1: ( RightParenthesis )
            {
            // InternalShortDSLParser.g:5341:1: ( RightParenthesis )
            // InternalShortDSLParser.g:5342:2: RightParenthesis
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
    // InternalShortDSLParser.g:5352:1: rule__MarkVariableValueS__Group_4__0 : rule__MarkVariableValueS__Group_4__0__Impl rule__MarkVariableValueS__Group_4__1 ;
    public final void rule__MarkVariableValueS__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5356:1: ( rule__MarkVariableValueS__Group_4__0__Impl rule__MarkVariableValueS__Group_4__1 )
            // InternalShortDSLParser.g:5357:2: rule__MarkVariableValueS__Group_4__0__Impl rule__MarkVariableValueS__Group_4__1
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
    // InternalShortDSLParser.g:5364:1: rule__MarkVariableValueS__Group_4__0__Impl : ( Comma ) ;
    public final void rule__MarkVariableValueS__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5368:1: ( ( Comma ) )
            // InternalShortDSLParser.g:5369:1: ( Comma )
            {
            // InternalShortDSLParser.g:5369:1: ( Comma )
            // InternalShortDSLParser.g:5370:2: Comma
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
    // InternalShortDSLParser.g:5379:1: rule__MarkVariableValueS__Group_4__1 : rule__MarkVariableValueS__Group_4__1__Impl rule__MarkVariableValueS__Group_4__2 ;
    public final void rule__MarkVariableValueS__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5383:1: ( rule__MarkVariableValueS__Group_4__1__Impl rule__MarkVariableValueS__Group_4__2 )
            // InternalShortDSLParser.g:5384:2: rule__MarkVariableValueS__Group_4__1__Impl rule__MarkVariableValueS__Group_4__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalShortDSLParser.g:5391:1: rule__MarkVariableValueS__Group_4__1__Impl : ( ( rule__MarkVariableValueS__TimeAssignment_4_1 ) ) ;
    public final void rule__MarkVariableValueS__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5395:1: ( ( ( rule__MarkVariableValueS__TimeAssignment_4_1 ) ) )
            // InternalShortDSLParser.g:5396:1: ( ( rule__MarkVariableValueS__TimeAssignment_4_1 ) )
            {
            // InternalShortDSLParser.g:5396:1: ( ( rule__MarkVariableValueS__TimeAssignment_4_1 ) )
            // InternalShortDSLParser.g:5397:2: ( rule__MarkVariableValueS__TimeAssignment_4_1 )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getTimeAssignment_4_1()); 
            // InternalShortDSLParser.g:5398:2: ( rule__MarkVariableValueS__TimeAssignment_4_1 )
            // InternalShortDSLParser.g:5398:3: rule__MarkVariableValueS__TimeAssignment_4_1
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
    // InternalShortDSLParser.g:5406:1: rule__MarkVariableValueS__Group_4__2 : rule__MarkVariableValueS__Group_4__2__Impl ;
    public final void rule__MarkVariableValueS__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5410:1: ( rule__MarkVariableValueS__Group_4__2__Impl )
            // InternalShortDSLParser.g:5411:2: rule__MarkVariableValueS__Group_4__2__Impl
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
    // InternalShortDSLParser.g:5417:1: rule__MarkVariableValueS__Group_4__2__Impl : ( ( rule__MarkVariableValueS__UnitAssignment_4_2 ) ) ;
    public final void rule__MarkVariableValueS__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5421:1: ( ( ( rule__MarkVariableValueS__UnitAssignment_4_2 ) ) )
            // InternalShortDSLParser.g:5422:1: ( ( rule__MarkVariableValueS__UnitAssignment_4_2 ) )
            {
            // InternalShortDSLParser.g:5422:1: ( ( rule__MarkVariableValueS__UnitAssignment_4_2 ) )
            // InternalShortDSLParser.g:5423:2: ( rule__MarkVariableValueS__UnitAssignment_4_2 )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getUnitAssignment_4_2()); 
            // InternalShortDSLParser.g:5424:2: ( rule__MarkVariableValueS__UnitAssignment_4_2 )
            // InternalShortDSLParser.g:5424:3: rule__MarkVariableValueS__UnitAssignment_4_2
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
    // InternalShortDSLParser.g:5433:1: rule__MarkCameraValueS__Group__0 : rule__MarkCameraValueS__Group__0__Impl rule__MarkCameraValueS__Group__1 ;
    public final void rule__MarkCameraValueS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5437:1: ( rule__MarkCameraValueS__Group__0__Impl rule__MarkCameraValueS__Group__1 )
            // InternalShortDSLParser.g:5438:2: rule__MarkCameraValueS__Group__0__Impl rule__MarkCameraValueS__Group__1
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
    // InternalShortDSLParser.g:5445:1: rule__MarkCameraValueS__Group__0__Impl : ( () ) ;
    public final void rule__MarkCameraValueS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5449:1: ( ( () ) )
            // InternalShortDSLParser.g:5450:1: ( () )
            {
            // InternalShortDSLParser.g:5450:1: ( () )
            // InternalShortDSLParser.g:5451:2: ()
            {
             before(grammarAccess.getMarkCameraValueSAccess().getMarkCameraValueAction_0()); 
            // InternalShortDSLParser.g:5452:2: ()
            // InternalShortDSLParser.g:5452:3: 
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
    // InternalShortDSLParser.g:5460:1: rule__MarkCameraValueS__Group__1 : rule__MarkCameraValueS__Group__1__Impl rule__MarkCameraValueS__Group__2 ;
    public final void rule__MarkCameraValueS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5464:1: ( rule__MarkCameraValueS__Group__1__Impl rule__MarkCameraValueS__Group__2 )
            // InternalShortDSLParser.g:5465:2: rule__MarkCameraValueS__Group__1__Impl rule__MarkCameraValueS__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalShortDSLParser.g:5472:1: rule__MarkCameraValueS__Group__1__Impl : ( ( rule__MarkCameraValueS__CameraAssignment_1 ) ) ;
    public final void rule__MarkCameraValueS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5476:1: ( ( ( rule__MarkCameraValueS__CameraAssignment_1 ) ) )
            // InternalShortDSLParser.g:5477:1: ( ( rule__MarkCameraValueS__CameraAssignment_1 ) )
            {
            // InternalShortDSLParser.g:5477:1: ( ( rule__MarkCameraValueS__CameraAssignment_1 ) )
            // InternalShortDSLParser.g:5478:2: ( rule__MarkCameraValueS__CameraAssignment_1 )
            {
             before(grammarAccess.getMarkCameraValueSAccess().getCameraAssignment_1()); 
            // InternalShortDSLParser.g:5479:2: ( rule__MarkCameraValueS__CameraAssignment_1 )
            // InternalShortDSLParser.g:5479:3: rule__MarkCameraValueS__CameraAssignment_1
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
    // InternalShortDSLParser.g:5487:1: rule__MarkCameraValueS__Group__2 : rule__MarkCameraValueS__Group__2__Impl rule__MarkCameraValueS__Group__3 ;
    public final void rule__MarkCameraValueS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5491:1: ( rule__MarkCameraValueS__Group__2__Impl rule__MarkCameraValueS__Group__3 )
            // InternalShortDSLParser.g:5492:2: rule__MarkCameraValueS__Group__2__Impl rule__MarkCameraValueS__Group__3
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
    // InternalShortDSLParser.g:5499:1: rule__MarkCameraValueS__Group__2__Impl : ( Scan ) ;
    public final void rule__MarkCameraValueS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5503:1: ( ( Scan ) )
            // InternalShortDSLParser.g:5504:1: ( Scan )
            {
            // InternalShortDSLParser.g:5504:1: ( Scan )
            // InternalShortDSLParser.g:5505:2: Scan
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
    // InternalShortDSLParser.g:5514:1: rule__MarkCameraValueS__Group__3 : rule__MarkCameraValueS__Group__3__Impl ;
    public final void rule__MarkCameraValueS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5518:1: ( rule__MarkCameraValueS__Group__3__Impl )
            // InternalShortDSLParser.g:5519:2: rule__MarkCameraValueS__Group__3__Impl
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
    // InternalShortDSLParser.g:5525:1: rule__MarkCameraValueS__Group__3__Impl : ( ( rule__MarkCameraValueS__VariableAssignment_3 ) ) ;
    public final void rule__MarkCameraValueS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5529:1: ( ( ( rule__MarkCameraValueS__VariableAssignment_3 ) ) )
            // InternalShortDSLParser.g:5530:1: ( ( rule__MarkCameraValueS__VariableAssignment_3 ) )
            {
            // InternalShortDSLParser.g:5530:1: ( ( rule__MarkCameraValueS__VariableAssignment_3 ) )
            // InternalShortDSLParser.g:5531:2: ( rule__MarkCameraValueS__VariableAssignment_3 )
            {
             before(grammarAccess.getMarkCameraValueSAccess().getVariableAssignment_3()); 
            // InternalShortDSLParser.g:5532:2: ( rule__MarkCameraValueS__VariableAssignment_3 )
            // InternalShortDSLParser.g:5532:3: rule__MarkCameraValueS__VariableAssignment_3
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


    // $ANTLR start "rule__OrdinaryVariableS__Group__0"
    // InternalShortDSLParser.g:5541:1: rule__OrdinaryVariableS__Group__0 : rule__OrdinaryVariableS__Group__0__Impl rule__OrdinaryVariableS__Group__1 ;
    public final void rule__OrdinaryVariableS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5545:1: ( rule__OrdinaryVariableS__Group__0__Impl rule__OrdinaryVariableS__Group__1 )
            // InternalShortDSLParser.g:5546:2: rule__OrdinaryVariableS__Group__0__Impl rule__OrdinaryVariableS__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__OrdinaryVariableS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrdinaryVariableS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdinaryVariableS__Group__0"


    // $ANTLR start "rule__OrdinaryVariableS__Group__0__Impl"
    // InternalShortDSLParser.g:5553:1: rule__OrdinaryVariableS__Group__0__Impl : ( () ) ;
    public final void rule__OrdinaryVariableS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5557:1: ( ( () ) )
            // InternalShortDSLParser.g:5558:1: ( () )
            {
            // InternalShortDSLParser.g:5558:1: ( () )
            // InternalShortDSLParser.g:5559:2: ()
            {
             before(grammarAccess.getOrdinaryVariableSAccess().getOrdinaryVariableAction_0()); 
            // InternalShortDSLParser.g:5560:2: ()
            // InternalShortDSLParser.g:5560:3: 
            {
            }

             after(grammarAccess.getOrdinaryVariableSAccess().getOrdinaryVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdinaryVariableS__Group__0__Impl"


    // $ANTLR start "rule__OrdinaryVariableS__Group__1"
    // InternalShortDSLParser.g:5568:1: rule__OrdinaryVariableS__Group__1 : rule__OrdinaryVariableS__Group__1__Impl ;
    public final void rule__OrdinaryVariableS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5572:1: ( rule__OrdinaryVariableS__Group__1__Impl )
            // InternalShortDSLParser.g:5573:2: rule__OrdinaryVariableS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrdinaryVariableS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdinaryVariableS__Group__1"


    // $ANTLR start "rule__OrdinaryVariableS__Group__1__Impl"
    // InternalShortDSLParser.g:5579:1: rule__OrdinaryVariableS__Group__1__Impl : ( ( rule__OrdinaryVariableS__NameAssignment_1 ) ) ;
    public final void rule__OrdinaryVariableS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5583:1: ( ( ( rule__OrdinaryVariableS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:5584:1: ( ( rule__OrdinaryVariableS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:5584:1: ( ( rule__OrdinaryVariableS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:5585:2: ( rule__OrdinaryVariableS__NameAssignment_1 )
            {
             before(grammarAccess.getOrdinaryVariableSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:5586:2: ( rule__OrdinaryVariableS__NameAssignment_1 )
            // InternalShortDSLParser.g:5586:3: rule__OrdinaryVariableS__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OrdinaryVariableS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdinaryVariableSAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdinaryVariableS__Group__1__Impl"


    // $ANTLR start "rule__SlotVariableS__Group__0"
    // InternalShortDSLParser.g:5595:1: rule__SlotVariableS__Group__0 : rule__SlotVariableS__Group__0__Impl rule__SlotVariableS__Group__1 ;
    public final void rule__SlotVariableS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5599:1: ( rule__SlotVariableS__Group__0__Impl rule__SlotVariableS__Group__1 )
            // InternalShortDSLParser.g:5600:2: rule__SlotVariableS__Group__0__Impl rule__SlotVariableS__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SlotVariableS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotVariableS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotVariableS__Group__0"


    // $ANTLR start "rule__SlotVariableS__Group__0__Impl"
    // InternalShortDSLParser.g:5607:1: rule__SlotVariableS__Group__0__Impl : ( () ) ;
    public final void rule__SlotVariableS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5611:1: ( ( () ) )
            // InternalShortDSLParser.g:5612:1: ( () )
            {
            // InternalShortDSLParser.g:5612:1: ( () )
            // InternalShortDSLParser.g:5613:2: ()
            {
             before(grammarAccess.getSlotVariableSAccess().getSlotVariableAction_0()); 
            // InternalShortDSLParser.g:5614:2: ()
            // InternalShortDSLParser.g:5614:3: 
            {
            }

             after(grammarAccess.getSlotVariableSAccess().getSlotVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotVariableS__Group__0__Impl"


    // $ANTLR start "rule__SlotVariableS__Group__1"
    // InternalShortDSLParser.g:5622:1: rule__SlotVariableS__Group__1 : rule__SlotVariableS__Group__1__Impl ;
    public final void rule__SlotVariableS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5626:1: ( rule__SlotVariableS__Group__1__Impl )
            // InternalShortDSLParser.g:5627:2: rule__SlotVariableS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SlotVariableS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotVariableS__Group__1"


    // $ANTLR start "rule__SlotVariableS__Group__1__Impl"
    // InternalShortDSLParser.g:5633:1: rule__SlotVariableS__Group__1__Impl : ( ( rule__SlotVariableS__NameAssignment_1 ) ) ;
    public final void rule__SlotVariableS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5637:1: ( ( ( rule__SlotVariableS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:5638:1: ( ( rule__SlotVariableS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:5638:1: ( ( rule__SlotVariableS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:5639:2: ( rule__SlotVariableS__NameAssignment_1 )
            {
             before(grammarAccess.getSlotVariableSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:5640:2: ( rule__SlotVariableS__NameAssignment_1 )
            // InternalShortDSLParser.g:5640:3: rule__SlotVariableS__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SlotVariableS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSlotVariableSAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotVariableS__Group__1__Impl"


    // $ANTLR start "rule__Model__DslTypeAssignment_1"
    // InternalShortDSLParser.g:5649:1: rule__Model__DslTypeAssignment_1 : ( ruleDSLTypeValue ) ;
    public final void rule__Model__DslTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5653:1: ( ( ruleDSLTypeValue ) )
            // InternalShortDSLParser.g:5654:2: ( ruleDSLTypeValue )
            {
            // InternalShortDSLParser.g:5654:2: ( ruleDSLTypeValue )
            // InternalShortDSLParser.g:5655:3: ruleDSLTypeValue
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
    // InternalShortDSLParser.g:5664:1: rule__Model__DslProgramAssignment_3 : ( ruleDSLProgram ) ;
    public final void rule__Model__DslProgramAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5668:1: ( ( ruleDSLProgram ) )
            // InternalShortDSLParser.g:5669:2: ( ruleDSLProgram )
            {
            // InternalShortDSLParser.g:5669:2: ( ruleDSLProgram )
            // InternalShortDSLParser.g:5670:3: ruleDSLProgram
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
    // InternalShortDSLParser.g:5679:1: rule__DSLLong__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DSLLong__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5683:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5684:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5684:2: ( RULE_ID )
            // InternalShortDSLParser.g:5685:3: RULE_ID
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
    // InternalShortDSLParser.g:5694:1: rule__DSLShort__ConfigurationAssignment_1 : ( ruleConfigurationS ) ;
    public final void rule__DSLShort__ConfigurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5698:1: ( ( ruleConfigurationS ) )
            // InternalShortDSLParser.g:5699:2: ( ruleConfigurationS )
            {
            // InternalShortDSLParser.g:5699:2: ( ruleConfigurationS )
            // InternalShortDSLParser.g:5700:3: ruleConfigurationS
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
    // InternalShortDSLParser.g:5709:1: rule__DSLShort__DiskHandlingsAssignment_2 : ( ruleDiskHandlingS ) ;
    public final void rule__DSLShort__DiskHandlingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5713:1: ( ( ruleDiskHandlingS ) )
            // InternalShortDSLParser.g:5714:2: ( ruleDiskHandlingS )
            {
            // InternalShortDSLParser.g:5714:2: ( ruleDiskHandlingS )
            // InternalShortDSLParser.g:5715:3: ruleDiskHandlingS
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
    // InternalShortDSLParser.g:5724:1: rule__ConfigurationS__DevicesAssignment_3 : ( ruleDeviceS ) ;
    public final void rule__ConfigurationS__DevicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5728:1: ( ( ruleDeviceS ) )
            // InternalShortDSLParser.g:5729:2: ( ruleDeviceS )
            {
            // InternalShortDSLParser.g:5729:2: ( ruleDeviceS )
            // InternalShortDSLParser.g:5730:3: ruleDeviceS
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
    // InternalShortDSLParser.g:5739:1: rule__CraneS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CraneS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5743:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5744:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5744:2: ( RULE_ID )
            // InternalShortDSLParser.g:5745:3: RULE_ID
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
    // InternalShortDSLParser.g:5754:1: rule__CraneS__LoggingAssignment_2 : ( ruleLoggingS ) ;
    public final void rule__CraneS__LoggingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5758:1: ( ( ruleLoggingS ) )
            // InternalShortDSLParser.g:5759:2: ( ruleLoggingS )
            {
            // InternalShortDSLParser.g:5759:2: ( ruleLoggingS )
            // InternalShortDSLParser.g:5760:3: ruleLoggingS
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
    // InternalShortDSLParser.g:5769:1: rule__CraneS__TargetsAssignment_5 : ( ruleCraneZoneS ) ;
    public final void rule__CraneS__TargetsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5773:1: ( ( ruleCraneZoneS ) )
            // InternalShortDSLParser.g:5774:2: ( ruleCraneZoneS )
            {
            // InternalShortDSLParser.g:5774:2: ( ruleCraneZoneS )
            // InternalShortDSLParser.g:5775:3: ruleCraneZoneS
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
    // InternalShortDSLParser.g:5784:1: rule__CraneZoneS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CraneZoneS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5788:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5789:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5789:2: ( RULE_ID )
            // InternalShortDSLParser.g:5790:3: RULE_ID
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
    // InternalShortDSLParser.g:5799:1: rule__CraneZoneS__ZoneValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__CraneZoneS__ZoneValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5803:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:5804:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:5804:2: ( RULE_INT )
            // InternalShortDSLParser.g:5805:3: RULE_INT
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
    // InternalShortDSLParser.g:5814:1: rule__DiskS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DiskS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5818:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5819:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5819:2: ( RULE_ID )
            // InternalShortDSLParser.g:5820:3: RULE_ID
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
    // InternalShortDSLParser.g:5829:1: rule__DiskS__NSlotsAssignment_3 : ( RULE_INT ) ;
    public final void rule__DiskS__NSlotsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5833:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:5834:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:5834:2: ( RULE_INT )
            // InternalShortDSLParser.g:5835:3: RULE_INT
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
    // InternalShortDSLParser.g:5844:1: rule__DiskS__LoggingAssignment_5 : ( ruleLoggingS ) ;
    public final void rule__DiskS__LoggingAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5848:1: ( ( ruleLoggingS ) )
            // InternalShortDSLParser.g:5849:2: ( ruleLoggingS )
            {
            // InternalShortDSLParser.g:5849:2: ( ruleLoggingS )
            // InternalShortDSLParser.g:5850:3: ruleLoggingS
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
    // InternalShortDSLParser.g:5859:1: rule__DiskS__TargetsAssignment_8 : ( ruleDiskZoneS ) ;
    public final void rule__DiskS__TargetsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5863:1: ( ( ruleDiskZoneS ) )
            // InternalShortDSLParser.g:5864:2: ( ruleDiskZoneS )
            {
            // InternalShortDSLParser.g:5864:2: ( ruleDiskZoneS )
            // InternalShortDSLParser.g:5865:3: ruleDiskZoneS
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
    // InternalShortDSLParser.g:5874:1: rule__DiskZoneS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DiskZoneS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5878:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5879:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5879:2: ( RULE_ID )
            // InternalShortDSLParser.g:5880:3: RULE_ID
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
    // InternalShortDSLParser.g:5889:1: rule__DiskZoneS__SlotAssignment_3 : ( RULE_INT ) ;
    public final void rule__DiskZoneS__SlotAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5893:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:5894:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:5894:2: ( RULE_INT )
            // InternalShortDSLParser.g:5895:3: RULE_INT
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
    // InternalShortDSLParser.g:5904:1: rule__CameraS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CameraS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5908:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5909:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5909:2: ( RULE_ID )
            // InternalShortDSLParser.g:5910:3: RULE_ID
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
    // InternalShortDSLParser.g:5919:1: rule__CameraS__LoggingAssignment_2 : ( ruleLoggingS ) ;
    public final void rule__CameraS__LoggingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5923:1: ( ( ruleLoggingS ) )
            // InternalShortDSLParser.g:5924:2: ( ruleLoggingS )
            {
            // InternalShortDSLParser.g:5924:2: ( ruleLoggingS )
            // InternalShortDSLParser.g:5925:3: ruleLoggingS
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
    // InternalShortDSLParser.g:5934:1: rule__CameraS__TargetsAssignment_5 : ( ruleCameraColorS ) ;
    public final void rule__CameraS__TargetsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5938:1: ( ( ruleCameraColorS ) )
            // InternalShortDSLParser.g:5939:2: ( ruleCameraColorS )
            {
            // InternalShortDSLParser.g:5939:2: ( ruleCameraColorS )
            // InternalShortDSLParser.g:5940:3: ruleCameraColorS
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
    // InternalShortDSLParser.g:5949:1: rule__CameraColorS__ColorAssignment_1 : ( ruleCOLOR_S ) ;
    public final void rule__CameraColorS__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5953:1: ( ( ruleCOLOR_S ) )
            // InternalShortDSLParser.g:5954:2: ( ruleCOLOR_S )
            {
            // InternalShortDSLParser.g:5954:2: ( ruleCOLOR_S )
            // InternalShortDSLParser.g:5955:3: ruleCOLOR_S
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
    // InternalShortDSLParser.g:5964:1: rule__DiskHandlingS__DiskAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DiskHandlingS__DiskAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5968:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5969:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5969:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5970:3: ( RULE_ID )
            {
             before(grammarAccess.getDiskHandlingSAccess().getDiskDiskCrossReference_1_0()); 
            // InternalShortDSLParser.g:5971:3: ( RULE_ID )
            // InternalShortDSLParser.g:5972:4: RULE_ID
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
    // InternalShortDSLParser.g:5983:1: rule__DiskHandlingS__StatementsAssignment_4 : ( ruleStatementS ) ;
    public final void rule__DiskHandlingS__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5987:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:5988:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:5988:2: ( ruleStatementS )
            // InternalShortDSLParser.g:5989:3: ruleStatementS
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


    // $ANTLR start "rule__LoopVariableS__OrdinaryVariableAssignment_3"
    // InternalShortDSLParser.g:5998:1: rule__LoopVariableS__OrdinaryVariableAssignment_3 : ( ruleOrdinaryVariableS ) ;
    public final void rule__LoopVariableS__OrdinaryVariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6002:1: ( ( ruleOrdinaryVariableS ) )
            // InternalShortDSLParser.g:6003:2: ( ruleOrdinaryVariableS )
            {
            // InternalShortDSLParser.g:6003:2: ( ruleOrdinaryVariableS )
            // InternalShortDSLParser.g:6004:3: ruleOrdinaryVariableS
            {
             before(grammarAccess.getLoopVariableSAccess().getOrdinaryVariableOrdinaryVariableSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOrdinaryVariableS();

            state._fsp--;

             after(grammarAccess.getLoopVariableSAccess().getOrdinaryVariableOrdinaryVariableSParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__OrdinaryVariableAssignment_3"


    // $ANTLR start "rule__LoopVariableS__ComparisonOperatorAssignment_4"
    // InternalShortDSLParser.g:6013:1: rule__LoopVariableS__ComparisonOperatorAssignment_4 : ( ruleCOMPARISON_OPERATOR_S ) ;
    public final void rule__LoopVariableS__ComparisonOperatorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6017:1: ( ( ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:6018:2: ( ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:6018:2: ( ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:6019:3: ruleCOMPARISON_OPERATOR_S
            {
             before(grammarAccess.getLoopVariableSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMPARISON_OPERATOR_S();

            state._fsp--;

             after(grammarAccess.getLoopVariableSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__ComparisonOperatorAssignment_4"


    // $ANTLR start "rule__LoopVariableS__SlotStateAssignment_5"
    // InternalShortDSLParser.g:6028:1: rule__LoopVariableS__SlotStateAssignment_5 : ( ruleDiskSlotStateValueS ) ;
    public final void rule__LoopVariableS__SlotStateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6032:1: ( ( ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:6033:2: ( ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:6033:2: ( ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:6034:3: ruleDiskSlotStateValueS
            {
             before(grammarAccess.getLoopVariableSAccess().getSlotStateDiskSlotStateValueSParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskSlotStateValueS();

            state._fsp--;

             after(grammarAccess.getLoopVariableSAccess().getSlotStateDiskSlotStateValueSParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__SlotStateAssignment_5"


    // $ANTLR start "rule__LoopVariableS__StatementsAssignment_8"
    // InternalShortDSLParser.g:6043:1: rule__LoopVariableS__StatementsAssignment_8 : ( ruleStatementS ) ;
    public final void rule__LoopVariableS__StatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6047:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:6048:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:6048:2: ( ruleStatementS )
            // InternalShortDSLParser.g:6049:3: ruleStatementS
            {
             before(grammarAccess.getLoopVariableSAccess().getStatementsStatementSParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementS();

            state._fsp--;

             after(grammarAccess.getLoopVariableSAccess().getStatementsStatementSParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopVariableS__StatementsAssignment_8"


    // $ANTLR start "rule__LoopSlotS__SlotVariableAssignment_3"
    // InternalShortDSLParser.g:6058:1: rule__LoopSlotS__SlotVariableAssignment_3 : ( ruleSlotVariableS ) ;
    public final void rule__LoopSlotS__SlotVariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6062:1: ( ( ruleSlotVariableS ) )
            // InternalShortDSLParser.g:6063:2: ( ruleSlotVariableS )
            {
            // InternalShortDSLParser.g:6063:2: ( ruleSlotVariableS )
            // InternalShortDSLParser.g:6064:3: ruleSlotVariableS
            {
             before(grammarAccess.getLoopSlotSAccess().getSlotVariableSlotVariableSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSlotVariableS();

            state._fsp--;

             after(grammarAccess.getLoopSlotSAccess().getSlotVariableSlotVariableSParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__SlotVariableAssignment_3"


    // $ANTLR start "rule__LoopSlotS__ComparisonOperatorAssignment_4"
    // InternalShortDSLParser.g:6073:1: rule__LoopSlotS__ComparisonOperatorAssignment_4 : ( ruleCOMPARISON_OPERATOR_S ) ;
    public final void rule__LoopSlotS__ComparisonOperatorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6077:1: ( ( ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:6078:2: ( ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:6078:2: ( ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:6079:3: ruleCOMPARISON_OPERATOR_S
            {
             before(grammarAccess.getLoopSlotSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMPARISON_OPERATOR_S();

            state._fsp--;

             after(grammarAccess.getLoopSlotSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__ComparisonOperatorAssignment_4"


    // $ANTLR start "rule__LoopSlotS__SlotStateAssignment_5"
    // InternalShortDSLParser.g:6088:1: rule__LoopSlotS__SlotStateAssignment_5 : ( ruleDiskSlotStateValueS ) ;
    public final void rule__LoopSlotS__SlotStateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6092:1: ( ( ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:6093:2: ( ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:6093:2: ( ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:6094:3: ruleDiskSlotStateValueS
            {
             before(grammarAccess.getLoopSlotSAccess().getSlotStateDiskSlotStateValueSParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskSlotStateValueS();

            state._fsp--;

             after(grammarAccess.getLoopSlotSAccess().getSlotStateDiskSlotStateValueSParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__SlotStateAssignment_5"


    // $ANTLR start "rule__LoopSlotS__StatementsAssignment_8"
    // InternalShortDSLParser.g:6103:1: rule__LoopSlotS__StatementsAssignment_8 : ( ruleStatementS ) ;
    public final void rule__LoopSlotS__StatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6107:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:6108:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:6108:2: ( ruleStatementS )
            // InternalShortDSLParser.g:6109:3: ruleStatementS
            {
             before(grammarAccess.getLoopSlotSAccess().getStatementsStatementSParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementS();

            state._fsp--;

             after(grammarAccess.getLoopSlotSAccess().getStatementsStatementSParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopSlotS__StatementsAssignment_8"


    // $ANTLR start "rule__MoveDiskS__SlotAssignment_1"
    // InternalShortDSLParser.g:6118:1: rule__MoveDiskS__SlotAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MoveDiskS__SlotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6122:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:6123:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:6123:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:6124:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveDiskSAccess().getSlotSlotVariableCrossReference_1_0()); 
            // InternalShortDSLParser.g:6125:3: ( RULE_ID )
            // InternalShortDSLParser.g:6126:4: RULE_ID
            {
             before(grammarAccess.getMoveDiskSAccess().getSlotSlotVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMoveDiskSAccess().getSlotSlotVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMoveDiskSAccess().getSlotSlotVariableCrossReference_1_0()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:6137:1: rule__MoveDiskS__ZoneAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MoveDiskS__ZoneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6141:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:6142:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:6142:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:6143:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveDiskSAccess().getZoneDiskZoneCrossReference_3_0()); 
            // InternalShortDSLParser.g:6144:3: ( RULE_ID )
            // InternalShortDSLParser.g:6145:4: RULE_ID
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
    // InternalShortDSLParser.g:6156:1: rule__MoveAnySlotS__StateAssignment_1 : ( ruleDiskSlotStateValueS ) ;
    public final void rule__MoveAnySlotS__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6160:1: ( ( ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:6161:2: ( ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:6161:2: ( ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:6162:3: ruleDiskSlotStateValueS
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
    // InternalShortDSLParser.g:6171:1: rule__MoveAnySlotS__AnySlotAssignment_2 : ( ruleSlotVariableS ) ;
    public final void rule__MoveAnySlotS__AnySlotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6175:1: ( ( ruleSlotVariableS ) )
            // InternalShortDSLParser.g:6176:2: ( ruleSlotVariableS )
            {
            // InternalShortDSLParser.g:6176:2: ( ruleSlotVariableS )
            // InternalShortDSLParser.g:6177:3: ruleSlotVariableS
            {
             before(grammarAccess.getMoveAnySlotSAccess().getAnySlotSlotVariableSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSlotVariableS();

            state._fsp--;

             after(grammarAccess.getMoveAnySlotSAccess().getAnySlotSlotVariableSParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:6186:1: rule__MoveAnySlotS__ZoneAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__MoveAnySlotS__ZoneAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6190:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:6191:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:6191:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:6192:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveAnySlotSAccess().getZoneDiskZoneCrossReference_4_0()); 
            // InternalShortDSLParser.g:6193:3: ( RULE_ID )
            // InternalShortDSLParser.g:6194:4: RULE_ID
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
    // InternalShortDSLParser.g:6205:1: rule__MoveCraneS__CraneAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MoveCraneS__CraneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6209:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:6210:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:6210:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:6211:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveCraneSAccess().getCraneCraneCrossReference_1_0()); 
            // InternalShortDSLParser.g:6212:3: ( RULE_ID )
            // InternalShortDSLParser.g:6213:4: RULE_ID
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
    // InternalShortDSLParser.g:6224:1: rule__MoveCraneS__ActionAssignment_2 : ( ruleCraneActionS ) ;
    public final void rule__MoveCraneS__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6228:1: ( ( ruleCraneActionS ) )
            // InternalShortDSLParser.g:6229:2: ( ruleCraneActionS )
            {
            // InternalShortDSLParser.g:6229:2: ( ruleCraneActionS )
            // InternalShortDSLParser.g:6230:3: ruleCraneActionS
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
    // InternalShortDSLParser.g:6239:1: rule__MoveCraneS__ZoneAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__MoveCraneS__ZoneAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6243:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:6244:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:6244:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:6245:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveCraneSAccess().getZoneCraneZoneCrossReference_4_0()); 
            // InternalShortDSLParser.g:6246:3: ( RULE_ID )
            // InternalShortDSLParser.g:6247:4: RULE_ID
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
    // InternalShortDSLParser.g:6258:1: rule__ConditionVariableS__VariableAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionVariableS__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6262:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:6263:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:6263:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:6264:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionVariableSAccess().getVariableOrdinaryVariableCrossReference_3_0()); 
            // InternalShortDSLParser.g:6265:3: ( RULE_ID )
            // InternalShortDSLParser.g:6266:4: RULE_ID
            {
             before(grammarAccess.getConditionVariableSAccess().getVariableOrdinaryVariableIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionVariableSAccess().getVariableOrdinaryVariableIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getConditionVariableSAccess().getVariableOrdinaryVariableCrossReference_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ConditionVariableS__ComparisonOperatorAssignment_4"
    // InternalShortDSLParser.g:6277:1: rule__ConditionVariableS__ComparisonOperatorAssignment_4 : ( ruleCOMPARISON_OPERATOR_S ) ;
    public final void rule__ConditionVariableS__ComparisonOperatorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6281:1: ( ( ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:6282:2: ( ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:6282:2: ( ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:6283:3: ruleCOMPARISON_OPERATOR_S
            {
             before(grammarAccess.getConditionVariableSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMPARISON_OPERATOR_S();

            state._fsp--;

             after(grammarAccess.getConditionVariableSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionVariableS__ComparisonOperatorAssignment_4"


    // $ANTLR start "rule__ConditionVariableS__VariableValueAssignment_5"
    // InternalShortDSLParser.g:6292:1: rule__ConditionVariableS__VariableValueAssignment_5 : ( ruleVariableValueS ) ;
    public final void rule__ConditionVariableS__VariableValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6296:1: ( ( ruleVariableValueS ) )
            // InternalShortDSLParser.g:6297:2: ( ruleVariableValueS )
            {
            // InternalShortDSLParser.g:6297:2: ( ruleVariableValueS )
            // InternalShortDSLParser.g:6298:3: ruleVariableValueS
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
    // InternalShortDSLParser.g:6307:1: rule__ConditionVariableS__StatementsAssignment_8 : ( ruleStatementS ) ;
    public final void rule__ConditionVariableS__StatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6311:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:6312:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:6312:2: ( ruleStatementS )
            // InternalShortDSLParser.g:6313:3: ruleStatementS
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


    // $ANTLR start "rule__ConditionSlotS__VariableAssignment_3"
    // InternalShortDSLParser.g:6322:1: rule__ConditionSlotS__VariableAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionSlotS__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6326:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:6327:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:6327:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:6328:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionSlotSAccess().getVariableSlotVariableCrossReference_3_0()); 
            // InternalShortDSLParser.g:6329:3: ( RULE_ID )
            // InternalShortDSLParser.g:6330:4: RULE_ID
            {
             before(grammarAccess.getConditionSlotSAccess().getVariableSlotVariableIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionSlotSAccess().getVariableSlotVariableIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getConditionSlotSAccess().getVariableSlotVariableCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__VariableAssignment_3"


    // $ANTLR start "rule__ConditionSlotS__ComparisonOperatorAssignment_4"
    // InternalShortDSLParser.g:6341:1: rule__ConditionSlotS__ComparisonOperatorAssignment_4 : ( ruleCOMPARISON_OPERATOR_S ) ;
    public final void rule__ConditionSlotS__ComparisonOperatorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6345:1: ( ( ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:6346:2: ( ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:6346:2: ( ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:6347:3: ruleCOMPARISON_OPERATOR_S
            {
             before(grammarAccess.getConditionSlotSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMPARISON_OPERATOR_S();

            state._fsp--;

             after(grammarAccess.getConditionSlotSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__ComparisonOperatorAssignment_4"


    // $ANTLR start "rule__ConditionSlotS__SlotValueAssignment_5"
    // InternalShortDSLParser.g:6356:1: rule__ConditionSlotS__SlotValueAssignment_5 : ( ruleValueSlotS ) ;
    public final void rule__ConditionSlotS__SlotValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6360:1: ( ( ruleValueSlotS ) )
            // InternalShortDSLParser.g:6361:2: ( ruleValueSlotS )
            {
            // InternalShortDSLParser.g:6361:2: ( ruleValueSlotS )
            // InternalShortDSLParser.g:6362:3: ruleValueSlotS
            {
             before(grammarAccess.getConditionSlotSAccess().getSlotValueValueSlotSParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleValueSlotS();

            state._fsp--;

             after(grammarAccess.getConditionSlotSAccess().getSlotValueValueSlotSParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__SlotValueAssignment_5"


    // $ANTLR start "rule__ConditionSlotS__StatementsAssignment_8"
    // InternalShortDSLParser.g:6371:1: rule__ConditionSlotS__StatementsAssignment_8 : ( ruleStatementS ) ;
    public final void rule__ConditionSlotS__StatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6375:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:6376:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:6376:2: ( ruleStatementS )
            // InternalShortDSLParser.g:6377:3: ruleStatementS
            {
             before(grammarAccess.getConditionSlotSAccess().getStatementsStatementSParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementS();

            state._fsp--;

             after(grammarAccess.getConditionSlotSAccess().getStatementsStatementSParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionSlotS__StatementsAssignment_8"


    // $ANTLR start "rule__ConditionDeviceS__DeviceAssignment_3"
    // InternalShortDSLParser.g:6386:1: rule__ConditionDeviceS__DeviceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionDeviceS__DeviceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6390:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:6391:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:6391:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:6392:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionDeviceSAccess().getDeviceDeviceSCrossReference_3_0()); 
            // InternalShortDSLParser.g:6393:3: ( RULE_ID )
            // InternalShortDSLParser.g:6394:4: RULE_ID
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


    // $ANTLR start "rule__ConditionDeviceS__ComparisonOperatorAssignment_4"
    // InternalShortDSLParser.g:6405:1: rule__ConditionDeviceS__ComparisonOperatorAssignment_4 : ( ruleCOMPARISON_OPERATOR_S ) ;
    public final void rule__ConditionDeviceS__ComparisonOperatorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6409:1: ( ( ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:6410:2: ( ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:6410:2: ( ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:6411:3: ruleCOMPARISON_OPERATOR_S
            {
             before(grammarAccess.getConditionDeviceSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMPARISON_OPERATOR_S();

            state._fsp--;

             after(grammarAccess.getConditionDeviceSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionDeviceS__ComparisonOperatorAssignment_4"


    // $ANTLR start "rule__ConditionDeviceS__DeviceValueAssignment_5"
    // InternalShortDSLParser.g:6420:1: rule__ConditionDeviceS__DeviceValueAssignment_5 : ( ruleDeviceValueS ) ;
    public final void rule__ConditionDeviceS__DeviceValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6424:1: ( ( ruleDeviceValueS ) )
            // InternalShortDSLParser.g:6425:2: ( ruleDeviceValueS )
            {
            // InternalShortDSLParser.g:6425:2: ( ruleDeviceValueS )
            // InternalShortDSLParser.g:6426:3: ruleDeviceValueS
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
    // InternalShortDSLParser.g:6435:1: rule__ConditionDeviceS__StatementsAssignment_8 : ( ruleStatementS ) ;
    public final void rule__ConditionDeviceS__StatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6439:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:6440:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:6440:2: ( ruleStatementS )
            // InternalShortDSLParser.g:6441:3: ruleStatementS
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
    // InternalShortDSLParser.g:6450:1: rule__MarkVariableValueS__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MarkVariableValueS__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6454:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:6455:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:6455:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:6456:3: ( RULE_ID )
            {
             before(grammarAccess.getMarkVariableValueSAccess().getVariableVariableSCrossReference_1_0()); 
            // InternalShortDSLParser.g:6457:3: ( RULE_ID )
            // InternalShortDSLParser.g:6458:4: RULE_ID
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
    // InternalShortDSLParser.g:6469:1: rule__MarkVariableValueS__ValueAssignment_3 : ( ruleValueSlotS ) ;
    public final void rule__MarkVariableValueS__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6473:1: ( ( ruleValueSlotS ) )
            // InternalShortDSLParser.g:6474:2: ( ruleValueSlotS )
            {
            // InternalShortDSLParser.g:6474:2: ( ruleValueSlotS )
            // InternalShortDSLParser.g:6475:3: ruleValueSlotS
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
    // InternalShortDSLParser.g:6484:1: rule__MarkVariableValueS__TimeAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__MarkVariableValueS__TimeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6488:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:6489:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:6489:2: ( RULE_INT )
            // InternalShortDSLParser.g:6490:3: RULE_INT
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
    // InternalShortDSLParser.g:6499:1: rule__MarkVariableValueS__UnitAssignment_4_2 : ( ruleTIME_UNIT_S ) ;
    public final void rule__MarkVariableValueS__UnitAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6503:1: ( ( ruleTIME_UNIT_S ) )
            // InternalShortDSLParser.g:6504:2: ( ruleTIME_UNIT_S )
            {
            // InternalShortDSLParser.g:6504:2: ( ruleTIME_UNIT_S )
            // InternalShortDSLParser.g:6505:3: ruleTIME_UNIT_S
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
    // InternalShortDSLParser.g:6514:1: rule__MarkCameraValueS__CameraAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MarkCameraValueS__CameraAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6518:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:6519:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:6519:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:6520:3: ( RULE_ID )
            {
             before(grammarAccess.getMarkCameraValueSAccess().getCameraCameraCrossReference_1_0()); 
            // InternalShortDSLParser.g:6521:3: ( RULE_ID )
            // InternalShortDSLParser.g:6522:4: RULE_ID
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
    // InternalShortDSLParser.g:6533:1: rule__MarkCameraValueS__VariableAssignment_3 : ( ruleOrdinaryVariableS ) ;
    public final void rule__MarkCameraValueS__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6537:1: ( ( ruleOrdinaryVariableS ) )
            // InternalShortDSLParser.g:6538:2: ( ruleOrdinaryVariableS )
            {
            // InternalShortDSLParser.g:6538:2: ( ruleOrdinaryVariableS )
            // InternalShortDSLParser.g:6539:3: ruleOrdinaryVariableS
            {
             before(grammarAccess.getMarkCameraValueSAccess().getVariableOrdinaryVariableSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOrdinaryVariableS();

            state._fsp--;

             after(grammarAccess.getMarkCameraValueSAccess().getVariableOrdinaryVariableSParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__OrdinaryVariableS__NameAssignment_1"
    // InternalShortDSLParser.g:6548:1: rule__OrdinaryVariableS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OrdinaryVariableS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6552:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:6553:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:6553:2: ( RULE_ID )
            // InternalShortDSLParser.g:6554:3: RULE_ID
            {
             before(grammarAccess.getOrdinaryVariableSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOrdinaryVariableSAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdinaryVariableS__NameAssignment_1"


    // $ANTLR start "rule__SlotVariableS__NameAssignment_1"
    // InternalShortDSLParser.g:6563:1: rule__SlotVariableS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SlotVariableS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6567:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:6568:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:6568:2: ( RULE_ID )
            // InternalShortDSLParser.g:6569:3: RULE_ID
            {
             before(grammarAccess.getSlotVariableSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSlotVariableSAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotVariableS__NameAssignment_1"


    // $ANTLR start "rule__VariableValueS__ValueAssignment_0"
    // InternalShortDSLParser.g:6578:1: rule__VariableValueS__ValueAssignment_0 : ( ruleDiskSlotStateValueS ) ;
    public final void rule__VariableValueS__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6582:1: ( ( ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:6583:2: ( ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:6583:2: ( ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:6584:3: ruleDiskSlotStateValueS
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
    // InternalShortDSLParser.g:6593:1: rule__VariableValueS__ValueAssignment_1 : ( ruleColorValueS ) ;
    public final void rule__VariableValueS__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6597:1: ( ( ruleColorValueS ) )
            // InternalShortDSLParser.g:6598:2: ( ruleColorValueS )
            {
            // InternalShortDSLParser.g:6598:2: ( ruleColorValueS )
            // InternalShortDSLParser.g:6599:3: ruleColorValueS
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
    // InternalShortDSLParser.g:6608:1: rule__VariableValueS__ValueAssignment_2 : ( ruleNumberS ) ;
    public final void rule__VariableValueS__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6612:1: ( ( ruleNumberS ) )
            // InternalShortDSLParser.g:6613:2: ( ruleNumberS )
            {
            // InternalShortDSLParser.g:6613:2: ( ruleNumberS )
            // InternalShortDSLParser.g:6614:3: ruleNumberS
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
    // InternalShortDSLParser.g:6623:1: rule__VariableValueS__ValueAssignment_3 : ( ruleDiskStateValueS ) ;
    public final void rule__VariableValueS__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6627:1: ( ( ruleDiskStateValueS ) )
            // InternalShortDSLParser.g:6628:2: ( ruleDiskStateValueS )
            {
            // InternalShortDSLParser.g:6628:2: ( ruleDiskStateValueS )
            // InternalShortDSLParser.g:6629:3: ruleDiskStateValueS
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
    // InternalShortDSLParser.g:6638:1: rule__VariableValueS__RefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__VariableValueS__RefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6642:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:6643:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:6643:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:6644:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableValueSAccess().getRefVariableSCrossReference_4_0()); 
            // InternalShortDSLParser.g:6645:3: ( RULE_ID )
            // InternalShortDSLParser.g:6646:4: RULE_ID
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
    // InternalShortDSLParser.g:6657:1: rule__DeviceValueS__ValueAssignment_0 : ( ruleDiskStateValueS ) ;
    public final void rule__DeviceValueS__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6661:1: ( ( ruleDiskStateValueS ) )
            // InternalShortDSLParser.g:6662:2: ( ruleDiskStateValueS )
            {
            // InternalShortDSLParser.g:6662:2: ( ruleDiskStateValueS )
            // InternalShortDSLParser.g:6663:3: ruleDiskStateValueS
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
    // InternalShortDSLParser.g:6672:1: rule__DeviceValueS__ValueAssignment_1 : ( ruleColorValueS ) ;
    public final void rule__DeviceValueS__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6676:1: ( ( ruleColorValueS ) )
            // InternalShortDSLParser.g:6677:2: ( ruleColorValueS )
            {
            // InternalShortDSLParser.g:6677:2: ( ruleColorValueS )
            // InternalShortDSLParser.g:6678:3: ruleColorValueS
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
    // InternalShortDSLParser.g:6687:1: rule__DeviceValueS__ConfigurationValueAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DeviceValueS__ConfigurationValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6691:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:6692:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:6692:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:6693:3: ( RULE_ID )
            {
             before(grammarAccess.getDeviceValueSAccess().getConfigurationValueConfigurationValueSCrossReference_2_0()); 
            // InternalShortDSLParser.g:6694:3: ( RULE_ID )
            // InternalShortDSLParser.g:6695:4: RULE_ID
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
    // InternalShortDSLParser.g:6706:1: rule__ValueSlotS__ValueAssignment_0 : ( ruleDiskSlotStateValueS ) ;
    public final void rule__ValueSlotS__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6710:1: ( ( ruleDiskSlotStateValueS ) )
            // InternalShortDSLParser.g:6711:2: ( ruleDiskSlotStateValueS )
            {
            // InternalShortDSLParser.g:6711:2: ( ruleDiskSlotStateValueS )
            // InternalShortDSLParser.g:6712:3: ruleDiskSlotStateValueS
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
    // InternalShortDSLParser.g:6721:1: rule__ValueSlotS__ValueAssignment_1 : ( ruleColorValueS ) ;
    public final void rule__ValueSlotS__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6725:1: ( ( ruleColorValueS ) )
            // InternalShortDSLParser.g:6726:2: ( ruleColorValueS )
            {
            // InternalShortDSLParser.g:6726:2: ( ruleColorValueS )
            // InternalShortDSLParser.g:6727:3: ruleColorValueS
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
    // InternalShortDSLParser.g:6736:1: rule__DSLTypeValue__ValueAssignment : ( ruleDSL_TYPE_ENUM ) ;
    public final void rule__DSLTypeValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6740:1: ( ( ruleDSL_TYPE_ENUM ) )
            // InternalShortDSLParser.g:6741:2: ( ruleDSL_TYPE_ENUM )
            {
            // InternalShortDSLParser.g:6741:2: ( ruleDSL_TYPE_ENUM )
            // InternalShortDSLParser.g:6742:3: ruleDSL_TYPE_ENUM
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
    // InternalShortDSLParser.g:6751:1: rule__DiskStateValueS__ValueAssignment : ( ruleDISK_STATES_S ) ;
    public final void rule__DiskStateValueS__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6755:1: ( ( ruleDISK_STATES_S ) )
            // InternalShortDSLParser.g:6756:2: ( ruleDISK_STATES_S )
            {
            // InternalShortDSLParser.g:6756:2: ( ruleDISK_STATES_S )
            // InternalShortDSLParser.g:6757:3: ruleDISK_STATES_S
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
    // InternalShortDSLParser.g:6766:1: rule__DiskSlotStateValueS__ValueAssignment : ( ruleDISK_SLOT_STATES_S ) ;
    public final void rule__DiskSlotStateValueS__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6770:1: ( ( ruleDISK_SLOT_STATES_S ) )
            // InternalShortDSLParser.g:6771:2: ( ruleDISK_SLOT_STATES_S )
            {
            // InternalShortDSLParser.g:6771:2: ( ruleDISK_SLOT_STATES_S )
            // InternalShortDSLParser.g:6772:3: ruleDISK_SLOT_STATES_S
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
    // InternalShortDSLParser.g:6781:1: rule__ColorValueS__ValueAssignment : ( ruleCOLOR_S ) ;
    public final void rule__ColorValueS__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6785:1: ( ( ruleCOLOR_S ) )
            // InternalShortDSLParser.g:6786:2: ( ruleCOLOR_S )
            {
            // InternalShortDSLParser.g:6786:2: ( ruleCOLOR_S )
            // InternalShortDSLParser.g:6787:3: ruleCOLOR_S
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
    // InternalShortDSLParser.g:6796:1: rule__NumberS__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberS__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:6800:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:6801:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:6801:2: ( RULE_INT )
            // InternalShortDSLParser.g:6802:3: RULE_INT
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002005000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002005002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00002000400184B0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00002000400184B2L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000003810000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00003000400184B0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000010030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000600002035830L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000002015030L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200002025800L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000080000L});

}