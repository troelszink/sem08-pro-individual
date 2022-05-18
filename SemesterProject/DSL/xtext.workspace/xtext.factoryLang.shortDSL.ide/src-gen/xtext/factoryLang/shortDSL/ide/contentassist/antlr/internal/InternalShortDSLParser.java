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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LessThanSign", "'<'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("ExclamationMarkEqualsSign", "'!='");
    		tokenNameToValue.put("HyphenMinusGreaterThanSign", "'->'");
    		tokenNameToValue.put("If", "'if'");
    		tokenNameToValue.put("HyphenMinusHyphenMinusGreaterThanSign", "'-->'");
    		tokenNameToValue.put("Dsl", "'dsl'");
    		tokenNameToValue.put("Red", "'red'");
    		tokenNameToValue.put("Use", "'use'");
    		tokenNameToValue.put("Blue", "'blue'");
    		tokenNameToValue.put("Drop", "'drop'");
    		tokenNameToValue.put("Free", "'free'");
    		tokenNameToValue.put("Full", "'full'");
    		tokenNameToValue.put("Long", "'long'");
    		tokenNameToValue.put("Test", "'test'");
    		tokenNameToValue.put("Empty", "'empty'");
    		tokenNameToValue.put("Green", "'green'");
    		tokenNameToValue.put("Short", "'short'");
    		tokenNameToValue.put("Pickup", "'pickup'");
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
    // InternalShortDSLParser.g:85:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:86:1: ( ruleModel EOF )
            // InternalShortDSLParser.g:87:1: ruleModel EOF
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
    // InternalShortDSLParser.g:94:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:98:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalShortDSLParser.g:99:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalShortDSLParser.g:99:2: ( ( rule__Model__Group__0 ) )
            // InternalShortDSLParser.g:100:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalShortDSLParser.g:101:3: ( rule__Model__Group__0 )
            // InternalShortDSLParser.g:101:4: rule__Model__Group__0
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
    // InternalShortDSLParser.g:110:1: entryRuleDSL_Long : ruleDSL_Long EOF ;
    public final void entryRuleDSL_Long() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:111:1: ( ruleDSL_Long EOF )
            // InternalShortDSLParser.g:112:1: ruleDSL_Long EOF
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
    // InternalShortDSLParser.g:119:1: ruleDSL_Long : ( ( rule__DSL_Long__Group__0 ) ) ;
    public final void ruleDSL_Long() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:123:2: ( ( ( rule__DSL_Long__Group__0 ) ) )
            // InternalShortDSLParser.g:124:2: ( ( rule__DSL_Long__Group__0 ) )
            {
            // InternalShortDSLParser.g:124:2: ( ( rule__DSL_Long__Group__0 ) )
            // InternalShortDSLParser.g:125:3: ( rule__DSL_Long__Group__0 )
            {
             before(grammarAccess.getDSL_LongAccess().getGroup()); 
            // InternalShortDSLParser.g:126:3: ( rule__DSL_Long__Group__0 )
            // InternalShortDSLParser.g:126:4: rule__DSL_Long__Group__0
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
    // InternalShortDSLParser.g:135:1: entryRuleDSL_Short : ruleDSL_Short EOF ;
    public final void entryRuleDSL_Short() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:136:1: ( ruleDSL_Short EOF )
            // InternalShortDSLParser.g:137:1: ruleDSL_Short EOF
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
    // InternalShortDSLParser.g:144:1: ruleDSL_Short : ( ( rule__DSL_Short__Group__0 ) ) ;
    public final void ruleDSL_Short() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:148:2: ( ( ( rule__DSL_Short__Group__0 ) ) )
            // InternalShortDSLParser.g:149:2: ( ( rule__DSL_Short__Group__0 ) )
            {
            // InternalShortDSLParser.g:149:2: ( ( rule__DSL_Short__Group__0 ) )
            // InternalShortDSLParser.g:150:3: ( rule__DSL_Short__Group__0 )
            {
             before(grammarAccess.getDSL_ShortAccess().getGroup()); 
            // InternalShortDSLParser.g:151:3: ( rule__DSL_Short__Group__0 )
            // InternalShortDSLParser.g:151:4: rule__DSL_Short__Group__0
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
    // InternalShortDSLParser.g:160:1: entryRuleConfigurationS : ruleConfigurationS EOF ;
    public final void entryRuleConfigurationS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:161:1: ( ruleConfigurationS EOF )
            // InternalShortDSLParser.g:162:1: ruleConfigurationS EOF
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
    // InternalShortDSLParser.g:169:1: ruleConfigurationS : ( ( rule__ConfigurationS__Group__0 ) ) ;
    public final void ruleConfigurationS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:173:2: ( ( ( rule__ConfigurationS__Group__0 ) ) )
            // InternalShortDSLParser.g:174:2: ( ( rule__ConfigurationS__Group__0 ) )
            {
            // InternalShortDSLParser.g:174:2: ( ( rule__ConfigurationS__Group__0 ) )
            // InternalShortDSLParser.g:175:3: ( rule__ConfigurationS__Group__0 )
            {
             before(grammarAccess.getConfigurationSAccess().getGroup()); 
            // InternalShortDSLParser.g:176:3: ( rule__ConfigurationS__Group__0 )
            // InternalShortDSLParser.g:176:4: rule__ConfigurationS__Group__0
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
    // InternalShortDSLParser.g:185:1: entryRuleDeviceS : ruleDeviceS EOF ;
    public final void entryRuleDeviceS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:186:1: ( ruleDeviceS EOF )
            // InternalShortDSLParser.g:187:1: ruleDeviceS EOF
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
    // InternalShortDSLParser.g:194:1: ruleDeviceS : ( ( rule__DeviceS__Alternatives ) ) ;
    public final void ruleDeviceS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:198:2: ( ( ( rule__DeviceS__Alternatives ) ) )
            // InternalShortDSLParser.g:199:2: ( ( rule__DeviceS__Alternatives ) )
            {
            // InternalShortDSLParser.g:199:2: ( ( rule__DeviceS__Alternatives ) )
            // InternalShortDSLParser.g:200:3: ( rule__DeviceS__Alternatives )
            {
             before(grammarAccess.getDeviceSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:201:3: ( rule__DeviceS__Alternatives )
            // InternalShortDSLParser.g:201:4: rule__DeviceS__Alternatives
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
    // InternalShortDSLParser.g:210:1: entryRuleCraneS : ruleCraneS EOF ;
    public final void entryRuleCraneS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:211:1: ( ruleCraneS EOF )
            // InternalShortDSLParser.g:212:1: ruleCraneS EOF
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
    // InternalShortDSLParser.g:219:1: ruleCraneS : ( ( rule__CraneS__Group__0 ) ) ;
    public final void ruleCraneS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:223:2: ( ( ( rule__CraneS__Group__0 ) ) )
            // InternalShortDSLParser.g:224:2: ( ( rule__CraneS__Group__0 ) )
            {
            // InternalShortDSLParser.g:224:2: ( ( rule__CraneS__Group__0 ) )
            // InternalShortDSLParser.g:225:3: ( rule__CraneS__Group__0 )
            {
             before(grammarAccess.getCraneSAccess().getGroup()); 
            // InternalShortDSLParser.g:226:3: ( rule__CraneS__Group__0 )
            // InternalShortDSLParser.g:226:4: rule__CraneS__Group__0
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
    // InternalShortDSLParser.g:235:1: entryRuleCraneZoneS : ruleCraneZoneS EOF ;
    public final void entryRuleCraneZoneS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:236:1: ( ruleCraneZoneS EOF )
            // InternalShortDSLParser.g:237:1: ruleCraneZoneS EOF
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
    // InternalShortDSLParser.g:244:1: ruleCraneZoneS : ( ( rule__CraneZoneS__Group__0 ) ) ;
    public final void ruleCraneZoneS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:248:2: ( ( ( rule__CraneZoneS__Group__0 ) ) )
            // InternalShortDSLParser.g:249:2: ( ( rule__CraneZoneS__Group__0 ) )
            {
            // InternalShortDSLParser.g:249:2: ( ( rule__CraneZoneS__Group__0 ) )
            // InternalShortDSLParser.g:250:3: ( rule__CraneZoneS__Group__0 )
            {
             before(grammarAccess.getCraneZoneSAccess().getGroup()); 
            // InternalShortDSLParser.g:251:3: ( rule__CraneZoneS__Group__0 )
            // InternalShortDSLParser.g:251:4: rule__CraneZoneS__Group__0
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
    // InternalShortDSLParser.g:260:1: entryRuleDiskS : ruleDiskS EOF ;
    public final void entryRuleDiskS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:261:1: ( ruleDiskS EOF )
            // InternalShortDSLParser.g:262:1: ruleDiskS EOF
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
    // InternalShortDSLParser.g:269:1: ruleDiskS : ( ( rule__DiskS__Group__0 ) ) ;
    public final void ruleDiskS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:273:2: ( ( ( rule__DiskS__Group__0 ) ) )
            // InternalShortDSLParser.g:274:2: ( ( rule__DiskS__Group__0 ) )
            {
            // InternalShortDSLParser.g:274:2: ( ( rule__DiskS__Group__0 ) )
            // InternalShortDSLParser.g:275:3: ( rule__DiskS__Group__0 )
            {
             before(grammarAccess.getDiskSAccess().getGroup()); 
            // InternalShortDSLParser.g:276:3: ( rule__DiskS__Group__0 )
            // InternalShortDSLParser.g:276:4: rule__DiskS__Group__0
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
    // InternalShortDSLParser.g:285:1: entryRuleDiskZoneS : ruleDiskZoneS EOF ;
    public final void entryRuleDiskZoneS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:286:1: ( ruleDiskZoneS EOF )
            // InternalShortDSLParser.g:287:1: ruleDiskZoneS EOF
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
    // InternalShortDSLParser.g:294:1: ruleDiskZoneS : ( ( rule__DiskZoneS__Group__0 ) ) ;
    public final void ruleDiskZoneS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:298:2: ( ( ( rule__DiskZoneS__Group__0 ) ) )
            // InternalShortDSLParser.g:299:2: ( ( rule__DiskZoneS__Group__0 ) )
            {
            // InternalShortDSLParser.g:299:2: ( ( rule__DiskZoneS__Group__0 ) )
            // InternalShortDSLParser.g:300:3: ( rule__DiskZoneS__Group__0 )
            {
             before(grammarAccess.getDiskZoneSAccess().getGroup()); 
            // InternalShortDSLParser.g:301:3: ( rule__DiskZoneS__Group__0 )
            // InternalShortDSLParser.g:301:4: rule__DiskZoneS__Group__0
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
    // InternalShortDSLParser.g:310:1: entryRuleCameraS : ruleCameraS EOF ;
    public final void entryRuleCameraS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:311:1: ( ruleCameraS EOF )
            // InternalShortDSLParser.g:312:1: ruleCameraS EOF
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
    // InternalShortDSLParser.g:319:1: ruleCameraS : ( ( rule__CameraS__Group__0 ) ) ;
    public final void ruleCameraS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:323:2: ( ( ( rule__CameraS__Group__0 ) ) )
            // InternalShortDSLParser.g:324:2: ( ( rule__CameraS__Group__0 ) )
            {
            // InternalShortDSLParser.g:324:2: ( ( rule__CameraS__Group__0 ) )
            // InternalShortDSLParser.g:325:3: ( rule__CameraS__Group__0 )
            {
             before(grammarAccess.getCameraSAccess().getGroup()); 
            // InternalShortDSLParser.g:326:3: ( rule__CameraS__Group__0 )
            // InternalShortDSLParser.g:326:4: rule__CameraS__Group__0
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
    // InternalShortDSLParser.g:335:1: entryRuleCameraColorS : ruleCameraColorS EOF ;
    public final void entryRuleCameraColorS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:336:1: ( ruleCameraColorS EOF )
            // InternalShortDSLParser.g:337:1: ruleCameraColorS EOF
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
    // InternalShortDSLParser.g:344:1: ruleCameraColorS : ( ( rule__CameraColorS__Group__0 ) ) ;
    public final void ruleCameraColorS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:348:2: ( ( ( rule__CameraColorS__Group__0 ) ) )
            // InternalShortDSLParser.g:349:2: ( ( rule__CameraColorS__Group__0 ) )
            {
            // InternalShortDSLParser.g:349:2: ( ( rule__CameraColorS__Group__0 ) )
            // InternalShortDSLParser.g:350:3: ( rule__CameraColorS__Group__0 )
            {
             before(grammarAccess.getCameraColorSAccess().getGroup()); 
            // InternalShortDSLParser.g:351:3: ( rule__CameraColorS__Group__0 )
            // InternalShortDSLParser.g:351:4: rule__CameraColorS__Group__0
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
    // InternalShortDSLParser.g:360:1: entryRuleDiskHandlingS : ruleDiskHandlingS EOF ;
    public final void entryRuleDiskHandlingS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:361:1: ( ruleDiskHandlingS EOF )
            // InternalShortDSLParser.g:362:1: ruleDiskHandlingS EOF
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
    // InternalShortDSLParser.g:369:1: ruleDiskHandlingS : ( ( rule__DiskHandlingS__Group__0 ) ) ;
    public final void ruleDiskHandlingS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:373:2: ( ( ( rule__DiskHandlingS__Group__0 ) ) )
            // InternalShortDSLParser.g:374:2: ( ( rule__DiskHandlingS__Group__0 ) )
            {
            // InternalShortDSLParser.g:374:2: ( ( rule__DiskHandlingS__Group__0 ) )
            // InternalShortDSLParser.g:375:3: ( rule__DiskHandlingS__Group__0 )
            {
             before(grammarAccess.getDiskHandlingSAccess().getGroup()); 
            // InternalShortDSLParser.g:376:3: ( rule__DiskHandlingS__Group__0 )
            // InternalShortDSLParser.g:376:4: rule__DiskHandlingS__Group__0
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
    // InternalShortDSLParser.g:385:1: entryRuleStatementS : ruleStatementS EOF ;
    public final void entryRuleStatementS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:386:1: ( ruleStatementS EOF )
            // InternalShortDSLParser.g:387:1: ruleStatementS EOF
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
    // InternalShortDSLParser.g:394:1: ruleStatementS : ( ( rule__StatementS__Alternatives ) ) ;
    public final void ruleStatementS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:398:2: ( ( ( rule__StatementS__Alternatives ) ) )
            // InternalShortDSLParser.g:399:2: ( ( rule__StatementS__Alternatives ) )
            {
            // InternalShortDSLParser.g:399:2: ( ( rule__StatementS__Alternatives ) )
            // InternalShortDSLParser.g:400:3: ( rule__StatementS__Alternatives )
            {
             before(grammarAccess.getStatementSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:401:3: ( rule__StatementS__Alternatives )
            // InternalShortDSLParser.g:401:4: rule__StatementS__Alternatives
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
    // InternalShortDSLParser.g:410:1: entryRuleLoopS : ruleLoopS EOF ;
    public final void entryRuleLoopS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:411:1: ( ruleLoopS EOF )
            // InternalShortDSLParser.g:412:1: ruleLoopS EOF
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
    // InternalShortDSLParser.g:419:1: ruleLoopS : ( ( rule__LoopS__Group__0 ) ) ;
    public final void ruleLoopS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:423:2: ( ( ( rule__LoopS__Group__0 ) ) )
            // InternalShortDSLParser.g:424:2: ( ( rule__LoopS__Group__0 ) )
            {
            // InternalShortDSLParser.g:424:2: ( ( rule__LoopS__Group__0 ) )
            // InternalShortDSLParser.g:425:3: ( rule__LoopS__Group__0 )
            {
             before(grammarAccess.getLoopSAccess().getGroup()); 
            // InternalShortDSLParser.g:426:3: ( rule__LoopS__Group__0 )
            // InternalShortDSLParser.g:426:4: rule__LoopS__Group__0
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
    // InternalShortDSLParser.g:435:1: entryRuleMoveS : ruleMoveS EOF ;
    public final void entryRuleMoveS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:436:1: ( ruleMoveS EOF )
            // InternalShortDSLParser.g:437:1: ruleMoveS EOF
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
    // InternalShortDSLParser.g:444:1: ruleMoveS : ( ( rule__MoveS__Alternatives ) ) ;
    public final void ruleMoveS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:448:2: ( ( ( rule__MoveS__Alternatives ) ) )
            // InternalShortDSLParser.g:449:2: ( ( rule__MoveS__Alternatives ) )
            {
            // InternalShortDSLParser.g:449:2: ( ( rule__MoveS__Alternatives ) )
            // InternalShortDSLParser.g:450:3: ( rule__MoveS__Alternatives )
            {
             before(grammarAccess.getMoveSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:451:3: ( rule__MoveS__Alternatives )
            // InternalShortDSLParser.g:451:4: rule__MoveS__Alternatives
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
    // InternalShortDSLParser.g:460:1: entryRuleMoveDiskS : ruleMoveDiskS EOF ;
    public final void entryRuleMoveDiskS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:461:1: ( ruleMoveDiskS EOF )
            // InternalShortDSLParser.g:462:1: ruleMoveDiskS EOF
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
    // InternalShortDSLParser.g:469:1: ruleMoveDiskS : ( ( rule__MoveDiskS__Group__0 ) ) ;
    public final void ruleMoveDiskS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:473:2: ( ( ( rule__MoveDiskS__Group__0 ) ) )
            // InternalShortDSLParser.g:474:2: ( ( rule__MoveDiskS__Group__0 ) )
            {
            // InternalShortDSLParser.g:474:2: ( ( rule__MoveDiskS__Group__0 ) )
            // InternalShortDSLParser.g:475:3: ( rule__MoveDiskS__Group__0 )
            {
             before(grammarAccess.getMoveDiskSAccess().getGroup()); 
            // InternalShortDSLParser.g:476:3: ( rule__MoveDiskS__Group__0 )
            // InternalShortDSLParser.g:476:4: rule__MoveDiskS__Group__0
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


    // $ANTLR start "entryRuleMoveCraneS"
    // InternalShortDSLParser.g:485:1: entryRuleMoveCraneS : ruleMoveCraneS EOF ;
    public final void entryRuleMoveCraneS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:486:1: ( ruleMoveCraneS EOF )
            // InternalShortDSLParser.g:487:1: ruleMoveCraneS EOF
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
    // InternalShortDSLParser.g:494:1: ruleMoveCraneS : ( ( rule__MoveCraneS__Group__0 ) ) ;
    public final void ruleMoveCraneS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:498:2: ( ( ( rule__MoveCraneS__Group__0 ) ) )
            // InternalShortDSLParser.g:499:2: ( ( rule__MoveCraneS__Group__0 ) )
            {
            // InternalShortDSLParser.g:499:2: ( ( rule__MoveCraneS__Group__0 ) )
            // InternalShortDSLParser.g:500:3: ( rule__MoveCraneS__Group__0 )
            {
             before(grammarAccess.getMoveCraneSAccess().getGroup()); 
            // InternalShortDSLParser.g:501:3: ( rule__MoveCraneS__Group__0 )
            // InternalShortDSLParser.g:501:4: rule__MoveCraneS__Group__0
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


    // $ANTLR start "entryRuleActionS"
    // InternalShortDSLParser.g:510:1: entryRuleActionS : ruleActionS EOF ;
    public final void entryRuleActionS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:511:1: ( ruleActionS EOF )
            // InternalShortDSLParser.g:512:1: ruleActionS EOF
            {
             before(grammarAccess.getActionSRule()); 
            pushFollow(FOLLOW_1);
            ruleActionS();

            state._fsp--;

             after(grammarAccess.getActionSRule()); 
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
    // $ANTLR end "entryRuleActionS"


    // $ANTLR start "ruleActionS"
    // InternalShortDSLParser.g:519:1: ruleActionS : ( ( rule__ActionS__Group__0 ) ) ;
    public final void ruleActionS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:523:2: ( ( ( rule__ActionS__Group__0 ) ) )
            // InternalShortDSLParser.g:524:2: ( ( rule__ActionS__Group__0 ) )
            {
            // InternalShortDSLParser.g:524:2: ( ( rule__ActionS__Group__0 ) )
            // InternalShortDSLParser.g:525:3: ( rule__ActionS__Group__0 )
            {
             before(grammarAccess.getActionSAccess().getGroup()); 
            // InternalShortDSLParser.g:526:3: ( rule__ActionS__Group__0 )
            // InternalShortDSLParser.g:526:4: rule__ActionS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionS"


    // $ANTLR start "entryRuleConditionS"
    // InternalShortDSLParser.g:535:1: entryRuleConditionS : ruleConditionS EOF ;
    public final void entryRuleConditionS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:536:1: ( ruleConditionS EOF )
            // InternalShortDSLParser.g:537:1: ruleConditionS EOF
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
    // InternalShortDSLParser.g:544:1: ruleConditionS : ( ( rule__ConditionS__Alternatives ) ) ;
    public final void ruleConditionS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:548:2: ( ( ( rule__ConditionS__Alternatives ) ) )
            // InternalShortDSLParser.g:549:2: ( ( rule__ConditionS__Alternatives ) )
            {
            // InternalShortDSLParser.g:549:2: ( ( rule__ConditionS__Alternatives ) )
            // InternalShortDSLParser.g:550:3: ( rule__ConditionS__Alternatives )
            {
             before(grammarAccess.getConditionSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:551:3: ( rule__ConditionS__Alternatives )
            // InternalShortDSLParser.g:551:4: rule__ConditionS__Alternatives
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
    // InternalShortDSLParser.g:560:1: entryRuleConditionVariableS : ruleConditionVariableS EOF ;
    public final void entryRuleConditionVariableS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:561:1: ( ruleConditionVariableS EOF )
            // InternalShortDSLParser.g:562:1: ruleConditionVariableS EOF
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
    // InternalShortDSLParser.g:569:1: ruleConditionVariableS : ( ( rule__ConditionVariableS__Group__0 ) ) ;
    public final void ruleConditionVariableS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:573:2: ( ( ( rule__ConditionVariableS__Group__0 ) ) )
            // InternalShortDSLParser.g:574:2: ( ( rule__ConditionVariableS__Group__0 ) )
            {
            // InternalShortDSLParser.g:574:2: ( ( rule__ConditionVariableS__Group__0 ) )
            // InternalShortDSLParser.g:575:3: ( rule__ConditionVariableS__Group__0 )
            {
             before(grammarAccess.getConditionVariableSAccess().getGroup()); 
            // InternalShortDSLParser.g:576:3: ( rule__ConditionVariableS__Group__0 )
            // InternalShortDSLParser.g:576:4: rule__ConditionVariableS__Group__0
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
    // InternalShortDSLParser.g:585:1: entryRuleConditionDeviceS : ruleConditionDeviceS EOF ;
    public final void entryRuleConditionDeviceS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:586:1: ( ruleConditionDeviceS EOF )
            // InternalShortDSLParser.g:587:1: ruleConditionDeviceS EOF
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
    // InternalShortDSLParser.g:594:1: ruleConditionDeviceS : ( ( rule__ConditionDeviceS__Group__0 ) ) ;
    public final void ruleConditionDeviceS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:598:2: ( ( ( rule__ConditionDeviceS__Group__0 ) ) )
            // InternalShortDSLParser.g:599:2: ( ( rule__ConditionDeviceS__Group__0 ) )
            {
            // InternalShortDSLParser.g:599:2: ( ( rule__ConditionDeviceS__Group__0 ) )
            // InternalShortDSLParser.g:600:3: ( rule__ConditionDeviceS__Group__0 )
            {
             before(grammarAccess.getConditionDeviceSAccess().getGroup()); 
            // InternalShortDSLParser.g:601:3: ( rule__ConditionDeviceS__Group__0 )
            // InternalShortDSLParser.g:601:4: rule__ConditionDeviceS__Group__0
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
    // InternalShortDSLParser.g:610:1: entryRuleMarkS : ruleMarkS EOF ;
    public final void entryRuleMarkS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:611:1: ( ruleMarkS EOF )
            // InternalShortDSLParser.g:612:1: ruleMarkS EOF
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
    // InternalShortDSLParser.g:619:1: ruleMarkS : ( ( rule__MarkS__Alternatives ) ) ;
    public final void ruleMarkS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:623:2: ( ( ( rule__MarkS__Alternatives ) ) )
            // InternalShortDSLParser.g:624:2: ( ( rule__MarkS__Alternatives ) )
            {
            // InternalShortDSLParser.g:624:2: ( ( rule__MarkS__Alternatives ) )
            // InternalShortDSLParser.g:625:3: ( rule__MarkS__Alternatives )
            {
             before(grammarAccess.getMarkSAccess().getAlternatives()); 
            // InternalShortDSLParser.g:626:3: ( rule__MarkS__Alternatives )
            // InternalShortDSLParser.g:626:4: rule__MarkS__Alternatives
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


    // $ANTLR start "entryRuleMarkVariableS"
    // InternalShortDSLParser.g:635:1: entryRuleMarkVariableS : ruleMarkVariableS EOF ;
    public final void entryRuleMarkVariableS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:636:1: ( ruleMarkVariableS EOF )
            // InternalShortDSLParser.g:637:1: ruleMarkVariableS EOF
            {
             before(grammarAccess.getMarkVariableSRule()); 
            pushFollow(FOLLOW_1);
            ruleMarkVariableS();

            state._fsp--;

             after(grammarAccess.getMarkVariableSRule()); 
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
    // $ANTLR end "entryRuleMarkVariableS"


    // $ANTLR start "ruleMarkVariableS"
    // InternalShortDSLParser.g:644:1: ruleMarkVariableS : ( ( rule__MarkVariableS__Group__0 ) ) ;
    public final void ruleMarkVariableS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:648:2: ( ( ( rule__MarkVariableS__Group__0 ) ) )
            // InternalShortDSLParser.g:649:2: ( ( rule__MarkVariableS__Group__0 ) )
            {
            // InternalShortDSLParser.g:649:2: ( ( rule__MarkVariableS__Group__0 ) )
            // InternalShortDSLParser.g:650:3: ( rule__MarkVariableS__Group__0 )
            {
             before(grammarAccess.getMarkVariableSAccess().getGroup()); 
            // InternalShortDSLParser.g:651:3: ( rule__MarkVariableS__Group__0 )
            // InternalShortDSLParser.g:651:4: rule__MarkVariableS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MarkVariableS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMarkVariableSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarkVariableS"


    // $ANTLR start "entryRuleMarkValueS"
    // InternalShortDSLParser.g:660:1: entryRuleMarkValueS : ruleMarkValueS EOF ;
    public final void entryRuleMarkValueS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:661:1: ( ruleMarkValueS EOF )
            // InternalShortDSLParser.g:662:1: ruleMarkValueS EOF
            {
             before(grammarAccess.getMarkValueSRule()); 
            pushFollow(FOLLOW_1);
            ruleMarkValueS();

            state._fsp--;

             after(grammarAccess.getMarkValueSRule()); 
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
    // $ANTLR end "entryRuleMarkValueS"


    // $ANTLR start "ruleMarkValueS"
    // InternalShortDSLParser.g:669:1: ruleMarkValueS : ( ( rule__MarkValueS__Group__0 ) ) ;
    public final void ruleMarkValueS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:673:2: ( ( ( rule__MarkValueS__Group__0 ) ) )
            // InternalShortDSLParser.g:674:2: ( ( rule__MarkValueS__Group__0 ) )
            {
            // InternalShortDSLParser.g:674:2: ( ( rule__MarkValueS__Group__0 ) )
            // InternalShortDSLParser.g:675:3: ( rule__MarkValueS__Group__0 )
            {
             before(grammarAccess.getMarkValueSAccess().getGroup()); 
            // InternalShortDSLParser.g:676:3: ( rule__MarkValueS__Group__0 )
            // InternalShortDSLParser.g:676:4: rule__MarkValueS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MarkValueS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMarkValueSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarkValueS"


    // $ANTLR start "entryRuleLocalVariableS"
    // InternalShortDSLParser.g:685:1: entryRuleLocalVariableS : ruleLocalVariableS EOF ;
    public final void entryRuleLocalVariableS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:686:1: ( ruleLocalVariableS EOF )
            // InternalShortDSLParser.g:687:1: ruleLocalVariableS EOF
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
    // InternalShortDSLParser.g:694:1: ruleLocalVariableS : ( ( rule__LocalVariableS__Group__0 ) ) ;
    public final void ruleLocalVariableS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:698:2: ( ( ( rule__LocalVariableS__Group__0 ) ) )
            // InternalShortDSLParser.g:699:2: ( ( rule__LocalVariableS__Group__0 ) )
            {
            // InternalShortDSLParser.g:699:2: ( ( rule__LocalVariableS__Group__0 ) )
            // InternalShortDSLParser.g:700:3: ( rule__LocalVariableS__Group__0 )
            {
             before(grammarAccess.getLocalVariableSAccess().getGroup()); 
            // InternalShortDSLParser.g:701:3: ( rule__LocalVariableS__Group__0 )
            // InternalShortDSLParser.g:701:4: rule__LocalVariableS__Group__0
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
    // InternalShortDSLParser.g:710:1: entryRuleGlobalVariableS : ruleGlobalVariableS EOF ;
    public final void entryRuleGlobalVariableS() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:711:1: ( ruleGlobalVariableS EOF )
            // InternalShortDSLParser.g:712:1: ruleGlobalVariableS EOF
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
    // InternalShortDSLParser.g:719:1: ruleGlobalVariableS : ( ( rule__GlobalVariableS__Group__0 ) ) ;
    public final void ruleGlobalVariableS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:723:2: ( ( ( rule__GlobalVariableS__Group__0 ) ) )
            // InternalShortDSLParser.g:724:2: ( ( rule__GlobalVariableS__Group__0 ) )
            {
            // InternalShortDSLParser.g:724:2: ( ( rule__GlobalVariableS__Group__0 ) )
            // InternalShortDSLParser.g:725:3: ( rule__GlobalVariableS__Group__0 )
            {
             before(grammarAccess.getGlobalVariableSAccess().getGroup()); 
            // InternalShortDSLParser.g:726:3: ( rule__GlobalVariableS__Group__0 )
            // InternalShortDSLParser.g:726:4: rule__GlobalVariableS__Group__0
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


    // $ANTLR start "entryRuleValue"
    // InternalShortDSLParser.g:735:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:736:1: ( ruleValue EOF )
            // InternalShortDSLParser.g:737:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalShortDSLParser.g:744:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:748:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalShortDSLParser.g:749:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalShortDSLParser.g:749:2: ( ( rule__Value__Alternatives ) )
            // InternalShortDSLParser.g:750:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalShortDSLParser.g:751:3: ( rule__Value__Alternatives )
            // InternalShortDSLParser.g:751:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "ruleCOMPARISON_OPERATOR_S"
    // InternalShortDSLParser.g:760:1: ruleCOMPARISON_OPERATOR_S : ( ( rule__COMPARISON_OPERATOR_S__Alternatives ) ) ;
    public final void ruleCOMPARISON_OPERATOR_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:764:1: ( ( ( rule__COMPARISON_OPERATOR_S__Alternatives ) ) )
            // InternalShortDSLParser.g:765:2: ( ( rule__COMPARISON_OPERATOR_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:765:2: ( ( rule__COMPARISON_OPERATOR_S__Alternatives ) )
            // InternalShortDSLParser.g:766:3: ( rule__COMPARISON_OPERATOR_S__Alternatives )
            {
             before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:767:3: ( rule__COMPARISON_OPERATOR_S__Alternatives )
            // InternalShortDSLParser.g:767:4: rule__COMPARISON_OPERATOR_S__Alternatives
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
    // InternalShortDSLParser.g:776:1: ruleCOLOR_S : ( ( rule__COLOR_S__Alternatives ) ) ;
    public final void ruleCOLOR_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:780:1: ( ( ( rule__COLOR_S__Alternatives ) ) )
            // InternalShortDSLParser.g:781:2: ( ( rule__COLOR_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:781:2: ( ( rule__COLOR_S__Alternatives ) )
            // InternalShortDSLParser.g:782:3: ( rule__COLOR_S__Alternatives )
            {
             before(grammarAccess.getCOLOR_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:783:3: ( rule__COLOR_S__Alternatives )
            // InternalShortDSLParser.g:783:4: rule__COLOR_S__Alternatives
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
    // InternalShortDSLParser.g:792:1: ruleDISK_SLOT_STATES_S : ( ( rule__DISK_SLOT_STATES_S__Alternatives ) ) ;
    public final void ruleDISK_SLOT_STATES_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:796:1: ( ( ( rule__DISK_SLOT_STATES_S__Alternatives ) ) )
            // InternalShortDSLParser.g:797:2: ( ( rule__DISK_SLOT_STATES_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:797:2: ( ( rule__DISK_SLOT_STATES_S__Alternatives ) )
            // InternalShortDSLParser.g:798:3: ( rule__DISK_SLOT_STATES_S__Alternatives )
            {
             before(grammarAccess.getDISK_SLOT_STATES_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:799:3: ( rule__DISK_SLOT_STATES_S__Alternatives )
            // InternalShortDSLParser.g:799:4: rule__DISK_SLOT_STATES_S__Alternatives
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
    // InternalShortDSLParser.g:808:1: ruleDISK_STATES_S : ( ( rule__DISK_STATES_S__Alternatives ) ) ;
    public final void ruleDISK_STATES_S() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:812:1: ( ( ( rule__DISK_STATES_S__Alternatives ) ) )
            // InternalShortDSLParser.g:813:2: ( ( rule__DISK_STATES_S__Alternatives ) )
            {
            // InternalShortDSLParser.g:813:2: ( ( rule__DISK_STATES_S__Alternatives ) )
            // InternalShortDSLParser.g:814:3: ( rule__DISK_STATES_S__Alternatives )
            {
             before(grammarAccess.getDISK_STATES_SAccess().getAlternatives()); 
            // InternalShortDSLParser.g:815:3: ( rule__DISK_STATES_S__Alternatives )
            // InternalShortDSLParser.g:815:4: rule__DISK_STATES_S__Alternatives
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


    // $ANTLR start "rule__Model__Alternatives_1"
    // InternalShortDSLParser.g:823:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__Group_1_0__0 ) ) | ( ( rule__Model__Group_1_1__0 ) ) );
    public final void rule__Model__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:827:1: ( ( ( rule__Model__Group_1_0__0 ) ) | ( ( rule__Model__Group_1_1__0 ) ) )
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
                    // InternalShortDSLParser.g:828:2: ( ( rule__Model__Group_1_0__0 ) )
                    {
                    // InternalShortDSLParser.g:828:2: ( ( rule__Model__Group_1_0__0 ) )
                    // InternalShortDSLParser.g:829:3: ( rule__Model__Group_1_0__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_1_0()); 
                    // InternalShortDSLParser.g:830:3: ( rule__Model__Group_1_0__0 )
                    // InternalShortDSLParser.g:830:4: rule__Model__Group_1_0__0
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
                    // InternalShortDSLParser.g:834:2: ( ( rule__Model__Group_1_1__0 ) )
                    {
                    // InternalShortDSLParser.g:834:2: ( ( rule__Model__Group_1_1__0 ) )
                    // InternalShortDSLParser.g:835:3: ( rule__Model__Group_1_1__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_1_1()); 
                    // InternalShortDSLParser.g:836:3: ( rule__Model__Group_1_1__0 )
                    // InternalShortDSLParser.g:836:4: rule__Model__Group_1_1__0
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
    // InternalShortDSLParser.g:844:1: rule__DeviceS__Alternatives : ( ( ruleCraneS ) | ( ruleDiskS ) | ( ruleCameraS ) );
    public final void rule__DeviceS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:848:1: ( ( ruleCraneS ) | ( ruleDiskS ) | ( ruleCameraS ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==Colon) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==RULE_BEGIN) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==RULE_ID) ) {
                            alt2=1;
                        }
                        else if ( (LA2_4==Green||LA2_4==Blue||LA2_4==Red) ) {
                            alt2=3;
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
                    // InternalShortDSLParser.g:849:2: ( ruleCraneS )
                    {
                    // InternalShortDSLParser.g:849:2: ( ruleCraneS )
                    // InternalShortDSLParser.g:850:3: ruleCraneS
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
                    // InternalShortDSLParser.g:855:2: ( ruleDiskS )
                    {
                    // InternalShortDSLParser.g:855:2: ( ruleDiskS )
                    // InternalShortDSLParser.g:856:3: ruleDiskS
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
                    // InternalShortDSLParser.g:861:2: ( ruleCameraS )
                    {
                    // InternalShortDSLParser.g:861:2: ( ruleCameraS )
                    // InternalShortDSLParser.g:862:3: ruleCameraS
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
    // InternalShortDSLParser.g:871:1: rule__StatementS__Alternatives : ( ( ruleLoopS ) | ( ruleMoveS ) | ( ruleActionS ) | ( ruleConditionS ) | ( ruleMarkS ) );
    public final void rule__StatementS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:875:1: ( ( ruleLoopS ) | ( ruleMoveS ) | ( ruleActionS ) | ( ruleConditionS ) | ( ruleMarkS ) )
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
                else if ( (LA3_2==LeftParenthesis) ) {
                    alt3=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
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
                    // InternalShortDSLParser.g:876:2: ( ruleLoopS )
                    {
                    // InternalShortDSLParser.g:876:2: ( ruleLoopS )
                    // InternalShortDSLParser.g:877:3: ruleLoopS
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
                    // InternalShortDSLParser.g:882:2: ( ruleMoveS )
                    {
                    // InternalShortDSLParser.g:882:2: ( ruleMoveS )
                    // InternalShortDSLParser.g:883:3: ruleMoveS
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
                    // InternalShortDSLParser.g:888:2: ( ruleActionS )
                    {
                    // InternalShortDSLParser.g:888:2: ( ruleActionS )
                    // InternalShortDSLParser.g:889:3: ruleActionS
                    {
                     before(grammarAccess.getStatementSAccess().getActionSParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleActionS();

                    state._fsp--;

                     after(grammarAccess.getStatementSAccess().getActionSParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalShortDSLParser.g:894:2: ( ruleConditionS )
                    {
                    // InternalShortDSLParser.g:894:2: ( ruleConditionS )
                    // InternalShortDSLParser.g:895:3: ruleConditionS
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
                    // InternalShortDSLParser.g:900:2: ( ruleMarkS )
                    {
                    // InternalShortDSLParser.g:900:2: ( ruleMarkS )
                    // InternalShortDSLParser.g:901:3: ruleMarkS
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
    // InternalShortDSLParser.g:910:1: rule__MoveS__Alternatives : ( ( ruleMoveDiskS ) | ( ruleMoveCraneS ) );
    public final void rule__MoveS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:914:1: ( ( ruleMoveDiskS ) | ( ruleMoveCraneS ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==Pickup||LA4_1==Drop) ) {
                    alt4=2;
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
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalShortDSLParser.g:915:2: ( ruleMoveDiskS )
                    {
                    // InternalShortDSLParser.g:915:2: ( ruleMoveDiskS )
                    // InternalShortDSLParser.g:916:3: ruleMoveDiskS
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
                    // InternalShortDSLParser.g:921:2: ( ruleMoveCraneS )
                    {
                    // InternalShortDSLParser.g:921:2: ( ruleMoveCraneS )
                    // InternalShortDSLParser.g:922:3: ruleMoveCraneS
                    {
                     before(grammarAccess.getMoveSAccess().getMoveCraneSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveCraneS();

                    state._fsp--;

                     after(grammarAccess.getMoveSAccess().getMoveCraneSParserRuleCall_1()); 

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
    // InternalShortDSLParser.g:931:1: rule__MoveDiskS__Alternatives_2 : ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) );
    public final void rule__MoveDiskS__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:935:1: ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) )
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
                    // InternalShortDSLParser.g:936:2: ( HyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:936:2: ( HyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:937:3: HyphenMinusGreaterThanSign
                    {
                     before(grammarAccess.getMoveDiskSAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 
                    match(input,HyphenMinusGreaterThanSign,FOLLOW_2); 
                     after(grammarAccess.getMoveDiskSAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:942:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:942:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:943:3: HyphenMinusHyphenMinusGreaterThanSign
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


    // $ANTLR start "rule__MoveCraneS__Alternatives_3"
    // InternalShortDSLParser.g:952:1: rule__MoveCraneS__Alternatives_3 : ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) );
    public final void rule__MoveCraneS__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:956:1: ( ( HyphenMinusGreaterThanSign ) | ( HyphenMinusHyphenMinusGreaterThanSign ) )
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
                    // InternalShortDSLParser.g:957:2: ( HyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:957:2: ( HyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:958:3: HyphenMinusGreaterThanSign
                    {
                     before(grammarAccess.getMoveCraneSAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
                    match(input,HyphenMinusGreaterThanSign,FOLLOW_2); 
                     after(grammarAccess.getMoveCraneSAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:963:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    {
                    // InternalShortDSLParser.g:963:2: ( HyphenMinusHyphenMinusGreaterThanSign )
                    // InternalShortDSLParser.g:964:3: HyphenMinusHyphenMinusGreaterThanSign
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


    // $ANTLR start "rule__ActionS__Alternatives_1"
    // InternalShortDSLParser.g:973:1: rule__ActionS__Alternatives_1 : ( ( Pickup ) | ( Drop ) );
    public final void rule__ActionS__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:977:1: ( ( Pickup ) | ( Drop ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Pickup) ) {
                alt7=1;
            }
            else if ( (LA7_0==Drop) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalShortDSLParser.g:978:2: ( Pickup )
                    {
                    // InternalShortDSLParser.g:978:2: ( Pickup )
                    // InternalShortDSLParser.g:979:3: Pickup
                    {
                     before(grammarAccess.getActionSAccess().getPickupKeyword_1_0()); 
                    match(input,Pickup,FOLLOW_2); 
                     after(grammarAccess.getActionSAccess().getPickupKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:984:2: ( Drop )
                    {
                    // InternalShortDSLParser.g:984:2: ( Drop )
                    // InternalShortDSLParser.g:985:3: Drop
                    {
                     before(grammarAccess.getActionSAccess().getDropKeyword_1_1()); 
                    match(input,Drop,FOLLOW_2); 
                     after(grammarAccess.getActionSAccess().getDropKeyword_1_1()); 

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
    // $ANTLR end "rule__ActionS__Alternatives_1"


    // $ANTLR start "rule__ConditionS__Alternatives"
    // InternalShortDSLParser.g:994:1: rule__ConditionS__Alternatives : ( ( ruleConditionVariableS ) | ( ruleConditionDeviceS ) );
    public final void rule__ConditionS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:998:1: ( ( ruleConditionVariableS ) | ( ruleConditionDeviceS ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==If) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==Test) ) {
                    alt8=1;
                }
                else if ( (LA8_1==RULE_ID) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalShortDSLParser.g:999:2: ( ruleConditionVariableS )
                    {
                    // InternalShortDSLParser.g:999:2: ( ruleConditionVariableS )
                    // InternalShortDSLParser.g:1000:3: ruleConditionVariableS
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
                    // InternalShortDSLParser.g:1005:2: ( ruleConditionDeviceS )
                    {
                    // InternalShortDSLParser.g:1005:2: ( ruleConditionDeviceS )
                    // InternalShortDSLParser.g:1006:3: ruleConditionDeviceS
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
    // InternalShortDSLParser.g:1015:1: rule__MarkS__Alternatives : ( ( ruleMarkVariableS ) | ( ruleMarkValueS ) );
    public final void rule__MarkS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1019:1: ( ( ruleMarkVariableS ) | ( ruleMarkValueS ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==LeftParenthesis) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==RULE_ID) ) {
                        int LA9_3 = input.LA(4);

                        if ( (LA9_3==Comma) ) {
                            int LA9_5 = input.LA(5);

                            if ( (LA9_5==RULE_INT) ) {
                                int LA9_7 = input.LA(6);

                                if ( (LA9_7==RightParenthesis) ) {
                                    alt9=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 9, 7, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA9_3==RightParenthesis) ) {
                            alt9=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA9_2>=In_progress && LA9_2<=Complete)||(LA9_2>=Empty && LA9_2<=Green)||LA9_2==Blue||(LA9_2>=Free && LA9_2<=Full)||LA9_2==Red||LA9_2==RULE_INT) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
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
                    // InternalShortDSLParser.g:1020:2: ( ruleMarkVariableS )
                    {
                    // InternalShortDSLParser.g:1020:2: ( ruleMarkVariableS )
                    // InternalShortDSLParser.g:1021:3: ruleMarkVariableS
                    {
                     before(grammarAccess.getMarkSAccess().getMarkVariableSParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMarkVariableS();

                    state._fsp--;

                     after(grammarAccess.getMarkSAccess().getMarkVariableSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1026:2: ( ruleMarkValueS )
                    {
                    // InternalShortDSLParser.g:1026:2: ( ruleMarkValueS )
                    // InternalShortDSLParser.g:1027:3: ruleMarkValueS
                    {
                     before(grammarAccess.getMarkSAccess().getMarkValueSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMarkValueS();

                    state._fsp--;

                     after(grammarAccess.getMarkSAccess().getMarkValueSParserRuleCall_1()); 

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


    // $ANTLR start "rule__Value__Alternatives"
    // InternalShortDSLParser.g:1036:1: rule__Value__Alternatives : ( ( ( rule__Value__ValueDiskSlotStateAssignment_0 ) ) | ( ( rule__Value__ValueDiskStateAssignment_1 ) ) | ( ( rule__Value__ValueColorAssignment_2 ) ) | ( ( rule__Value__ValueIntAssignment_3 ) ) | ( ( rule__Value__VariableAssignment_4 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1040:1: ( ( ( rule__Value__ValueDiskSlotStateAssignment_0 ) ) | ( ( rule__Value__ValueDiskStateAssignment_1 ) ) | ( ( rule__Value__ValueColorAssignment_2 ) ) | ( ( rule__Value__ValueIntAssignment_3 ) ) | ( ( rule__Value__VariableAssignment_4 ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case In_progress:
            case Complete:
            case Free:
                {
                alt10=1;
                }
                break;
            case Empty:
            case Full:
                {
                alt10=2;
                }
                break;
            case Green:
            case Blue:
            case Red:
                {
                alt10=3;
                }
                break;
            case RULE_INT:
                {
                alt10=4;
                }
                break;
            case RULE_ID:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalShortDSLParser.g:1041:2: ( ( rule__Value__ValueDiskSlotStateAssignment_0 ) )
                    {
                    // InternalShortDSLParser.g:1041:2: ( ( rule__Value__ValueDiskSlotStateAssignment_0 ) )
                    // InternalShortDSLParser.g:1042:3: ( rule__Value__ValueDiskSlotStateAssignment_0 )
                    {
                     before(grammarAccess.getValueAccess().getValueDiskSlotStateAssignment_0()); 
                    // InternalShortDSLParser.g:1043:3: ( rule__Value__ValueDiskSlotStateAssignment_0 )
                    // InternalShortDSLParser.g:1043:4: rule__Value__ValueDiskSlotStateAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__ValueDiskSlotStateAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getValueDiskSlotStateAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1047:2: ( ( rule__Value__ValueDiskStateAssignment_1 ) )
                    {
                    // InternalShortDSLParser.g:1047:2: ( ( rule__Value__ValueDiskStateAssignment_1 ) )
                    // InternalShortDSLParser.g:1048:3: ( rule__Value__ValueDiskStateAssignment_1 )
                    {
                     before(grammarAccess.getValueAccess().getValueDiskStateAssignment_1()); 
                    // InternalShortDSLParser.g:1049:3: ( rule__Value__ValueDiskStateAssignment_1 )
                    // InternalShortDSLParser.g:1049:4: rule__Value__ValueDiskStateAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__ValueDiskStateAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getValueDiskStateAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1053:2: ( ( rule__Value__ValueColorAssignment_2 ) )
                    {
                    // InternalShortDSLParser.g:1053:2: ( ( rule__Value__ValueColorAssignment_2 ) )
                    // InternalShortDSLParser.g:1054:3: ( rule__Value__ValueColorAssignment_2 )
                    {
                     before(grammarAccess.getValueAccess().getValueColorAssignment_2()); 
                    // InternalShortDSLParser.g:1055:3: ( rule__Value__ValueColorAssignment_2 )
                    // InternalShortDSLParser.g:1055:4: rule__Value__ValueColorAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__ValueColorAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getValueColorAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalShortDSLParser.g:1059:2: ( ( rule__Value__ValueIntAssignment_3 ) )
                    {
                    // InternalShortDSLParser.g:1059:2: ( ( rule__Value__ValueIntAssignment_3 ) )
                    // InternalShortDSLParser.g:1060:3: ( rule__Value__ValueIntAssignment_3 )
                    {
                     before(grammarAccess.getValueAccess().getValueIntAssignment_3()); 
                    // InternalShortDSLParser.g:1061:3: ( rule__Value__ValueIntAssignment_3 )
                    // InternalShortDSLParser.g:1061:4: rule__Value__ValueIntAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__ValueIntAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getValueIntAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalShortDSLParser.g:1065:2: ( ( rule__Value__VariableAssignment_4 ) )
                    {
                    // InternalShortDSLParser.g:1065:2: ( ( rule__Value__VariableAssignment_4 ) )
                    // InternalShortDSLParser.g:1066:3: ( rule__Value__VariableAssignment_4 )
                    {
                     before(grammarAccess.getValueAccess().getVariableAssignment_4()); 
                    // InternalShortDSLParser.g:1067:3: ( rule__Value__VariableAssignment_4 )
                    // InternalShortDSLParser.g:1067:4: rule__Value__VariableAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__VariableAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getVariableAssignment_4()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__COMPARISON_OPERATOR_S__Alternatives"
    // InternalShortDSLParser.g:1075:1: rule__COMPARISON_OPERATOR_S__Alternatives : ( ( ( EqualsSign ) ) | ( ( LessThanSign ) ) | ( ( GreaterThanSign ) ) | ( ( ExclamationMarkEqualsSign ) ) );
    public final void rule__COMPARISON_OPERATOR_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1079:1: ( ( ( EqualsSign ) ) | ( ( LessThanSign ) ) | ( ( GreaterThanSign ) ) | ( ( ExclamationMarkEqualsSign ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case EqualsSign:
                {
                alt11=1;
                }
                break;
            case LessThanSign:
                {
                alt11=2;
                }
                break;
            case GreaterThanSign:
                {
                alt11=3;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalShortDSLParser.g:1080:2: ( ( EqualsSign ) )
                    {
                    // InternalShortDSLParser.g:1080:2: ( ( EqualsSign ) )
                    // InternalShortDSLParser.g:1081:3: ( EqualsSign )
                    {
                     before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1082:3: ( EqualsSign )
                    // InternalShortDSLParser.g:1082:4: EqualsSign
                    {
                    match(input,EqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1086:2: ( ( LessThanSign ) )
                    {
                    // InternalShortDSLParser.g:1086:2: ( ( LessThanSign ) )
                    // InternalShortDSLParser.g:1087:3: ( LessThanSign )
                    {
                     before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getLESS_THANEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1088:3: ( LessThanSign )
                    // InternalShortDSLParser.g:1088:4: LessThanSign
                    {
                    match(input,LessThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getLESS_THANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1092:2: ( ( GreaterThanSign ) )
                    {
                    // InternalShortDSLParser.g:1092:2: ( ( GreaterThanSign ) )
                    // InternalShortDSLParser.g:1093:3: ( GreaterThanSign )
                    {
                     before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getGREATER_THANEnumLiteralDeclaration_2()); 
                    // InternalShortDSLParser.g:1094:3: ( GreaterThanSign )
                    // InternalShortDSLParser.g:1094:4: GreaterThanSign
                    {
                    match(input,GreaterThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getGREATER_THANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalShortDSLParser.g:1098:2: ( ( ExclamationMarkEqualsSign ) )
                    {
                    // InternalShortDSLParser.g:1098:2: ( ( ExclamationMarkEqualsSign ) )
                    // InternalShortDSLParser.g:1099:3: ( ExclamationMarkEqualsSign )
                    {
                     before(grammarAccess.getCOMPARISON_OPERATOR_SAccess().getNOTEnumLiteralDeclaration_3()); 
                    // InternalShortDSLParser.g:1100:3: ( ExclamationMarkEqualsSign )
                    // InternalShortDSLParser.g:1100:4: ExclamationMarkEqualsSign
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
    // InternalShortDSLParser.g:1108:1: rule__COLOR_S__Alternatives : ( ( ( Red ) ) | ( ( Green ) ) | ( ( Blue ) ) );
    public final void rule__COLOR_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1112:1: ( ( ( Red ) ) | ( ( Green ) ) | ( ( Blue ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case Red:
                {
                alt12=1;
                }
                break;
            case Green:
                {
                alt12=2;
                }
                break;
            case Blue:
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
                    // InternalShortDSLParser.g:1113:2: ( ( Red ) )
                    {
                    // InternalShortDSLParser.g:1113:2: ( ( Red ) )
                    // InternalShortDSLParser.g:1114:3: ( Red )
                    {
                     before(grammarAccess.getCOLOR_SAccess().getREDEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1115:3: ( Red )
                    // InternalShortDSLParser.g:1115:4: Red
                    {
                    match(input,Red,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOLOR_SAccess().getREDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1119:2: ( ( Green ) )
                    {
                    // InternalShortDSLParser.g:1119:2: ( ( Green ) )
                    // InternalShortDSLParser.g:1120:3: ( Green )
                    {
                     before(grammarAccess.getCOLOR_SAccess().getGREENEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1121:3: ( Green )
                    // InternalShortDSLParser.g:1121:4: Green
                    {
                    match(input,Green,FOLLOW_2); 

                    }

                     after(grammarAccess.getCOLOR_SAccess().getGREENEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1125:2: ( ( Blue ) )
                    {
                    // InternalShortDSLParser.g:1125:2: ( ( Blue ) )
                    // InternalShortDSLParser.g:1126:3: ( Blue )
                    {
                     before(grammarAccess.getCOLOR_SAccess().getBLUEEnumLiteralDeclaration_2()); 
                    // InternalShortDSLParser.g:1127:3: ( Blue )
                    // InternalShortDSLParser.g:1127:4: Blue
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
    // InternalShortDSLParser.g:1135:1: rule__DISK_SLOT_STATES_S__Alternatives : ( ( ( Free ) ) | ( ( In_progress ) ) | ( ( Complete ) ) );
    public final void rule__DISK_SLOT_STATES_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1139:1: ( ( ( Free ) ) | ( ( In_progress ) ) | ( ( Complete ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case Free:
                {
                alt13=1;
                }
                break;
            case In_progress:
                {
                alt13=2;
                }
                break;
            case Complete:
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
                    // InternalShortDSLParser.g:1140:2: ( ( Free ) )
                    {
                    // InternalShortDSLParser.g:1140:2: ( ( Free ) )
                    // InternalShortDSLParser.g:1141:3: ( Free )
                    {
                     before(grammarAccess.getDISK_SLOT_STATES_SAccess().getFREEEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1142:3: ( Free )
                    // InternalShortDSLParser.g:1142:4: Free
                    {
                    match(input,Free,FOLLOW_2); 

                    }

                     after(grammarAccess.getDISK_SLOT_STATES_SAccess().getFREEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1146:2: ( ( In_progress ) )
                    {
                    // InternalShortDSLParser.g:1146:2: ( ( In_progress ) )
                    // InternalShortDSLParser.g:1147:3: ( In_progress )
                    {
                     before(grammarAccess.getDISK_SLOT_STATES_SAccess().getIN_PROGRESSEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1148:3: ( In_progress )
                    // InternalShortDSLParser.g:1148:4: In_progress
                    {
                    match(input,In_progress,FOLLOW_2); 

                    }

                     after(grammarAccess.getDISK_SLOT_STATES_SAccess().getIN_PROGRESSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:1152:2: ( ( Complete ) )
                    {
                    // InternalShortDSLParser.g:1152:2: ( ( Complete ) )
                    // InternalShortDSLParser.g:1153:3: ( Complete )
                    {
                     before(grammarAccess.getDISK_SLOT_STATES_SAccess().getCOMPLETEEnumLiteralDeclaration_2()); 
                    // InternalShortDSLParser.g:1154:3: ( Complete )
                    // InternalShortDSLParser.g:1154:4: Complete
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
    // InternalShortDSLParser.g:1162:1: rule__DISK_STATES_S__Alternatives : ( ( ( Full ) ) | ( ( Empty ) ) );
    public final void rule__DISK_STATES_S__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1166:1: ( ( ( Full ) ) | ( ( Empty ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Full) ) {
                alt14=1;
            }
            else if ( (LA14_0==Empty) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalShortDSLParser.g:1167:2: ( ( Full ) )
                    {
                    // InternalShortDSLParser.g:1167:2: ( ( Full ) )
                    // InternalShortDSLParser.g:1168:3: ( Full )
                    {
                     before(grammarAccess.getDISK_STATES_SAccess().getFULLEnumLiteralDeclaration_0()); 
                    // InternalShortDSLParser.g:1169:3: ( Full )
                    // InternalShortDSLParser.g:1169:4: Full
                    {
                    match(input,Full,FOLLOW_2); 

                    }

                     after(grammarAccess.getDISK_STATES_SAccess().getFULLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:1173:2: ( ( Empty ) )
                    {
                    // InternalShortDSLParser.g:1173:2: ( ( Empty ) )
                    // InternalShortDSLParser.g:1174:3: ( Empty )
                    {
                     before(grammarAccess.getDISK_STATES_SAccess().getEMPTYEnumLiteralDeclaration_1()); 
                    // InternalShortDSLParser.g:1175:3: ( Empty )
                    // InternalShortDSLParser.g:1175:4: Empty
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalShortDSLParser.g:1183:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1187:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalShortDSLParser.g:1188:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalShortDSLParser.g:1195:1: rule__Model__Group__0__Impl : ( Use ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1199:1: ( ( Use ) )
            // InternalShortDSLParser.g:1200:1: ( Use )
            {
            // InternalShortDSLParser.g:1200:1: ( Use )
            // InternalShortDSLParser.g:1201:2: Use
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
    // InternalShortDSLParser.g:1210:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1214:1: ( rule__Model__Group__1__Impl )
            // InternalShortDSLParser.g:1215:2: rule__Model__Group__1__Impl
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
    // InternalShortDSLParser.g:1221:1: rule__Model__Group__1__Impl : ( ( rule__Model__Alternatives_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1225:1: ( ( ( rule__Model__Alternatives_1 ) ) )
            // InternalShortDSLParser.g:1226:1: ( ( rule__Model__Alternatives_1 ) )
            {
            // InternalShortDSLParser.g:1226:1: ( ( rule__Model__Alternatives_1 ) )
            // InternalShortDSLParser.g:1227:2: ( rule__Model__Alternatives_1 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_1()); 
            // InternalShortDSLParser.g:1228:2: ( rule__Model__Alternatives_1 )
            // InternalShortDSLParser.g:1228:3: rule__Model__Alternatives_1
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
    // InternalShortDSLParser.g:1237:1: rule__Model__Group_1_0__0 : rule__Model__Group_1_0__0__Impl rule__Model__Group_1_0__1 ;
    public final void rule__Model__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1241:1: ( rule__Model__Group_1_0__0__Impl rule__Model__Group_1_0__1 )
            // InternalShortDSLParser.g:1242:2: rule__Model__Group_1_0__0__Impl rule__Model__Group_1_0__1
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
    // InternalShortDSLParser.g:1249:1: rule__Model__Group_1_0__0__Impl : ( Long ) ;
    public final void rule__Model__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1253:1: ( ( Long ) )
            // InternalShortDSLParser.g:1254:1: ( Long )
            {
            // InternalShortDSLParser.g:1254:1: ( Long )
            // InternalShortDSLParser.g:1255:2: Long
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
    // InternalShortDSLParser.g:1264:1: rule__Model__Group_1_0__1 : rule__Model__Group_1_0__1__Impl rule__Model__Group_1_0__2 ;
    public final void rule__Model__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1268:1: ( rule__Model__Group_1_0__1__Impl rule__Model__Group_1_0__2 )
            // InternalShortDSLParser.g:1269:2: rule__Model__Group_1_0__1__Impl rule__Model__Group_1_0__2
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
    // InternalShortDSLParser.g:1276:1: rule__Model__Group_1_0__1__Impl : ( Dsl ) ;
    public final void rule__Model__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1280:1: ( ( Dsl ) )
            // InternalShortDSLParser.g:1281:1: ( Dsl )
            {
            // InternalShortDSLParser.g:1281:1: ( Dsl )
            // InternalShortDSLParser.g:1282:2: Dsl
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
    // InternalShortDSLParser.g:1291:1: rule__Model__Group_1_0__2 : rule__Model__Group_1_0__2__Impl ;
    public final void rule__Model__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1295:1: ( rule__Model__Group_1_0__2__Impl )
            // InternalShortDSLParser.g:1296:2: rule__Model__Group_1_0__2__Impl
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
    // InternalShortDSLParser.g:1302:1: rule__Model__Group_1_0__2__Impl : ( ( rule__Model__TypeAssignment_1_0_2 ) ) ;
    public final void rule__Model__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1306:1: ( ( ( rule__Model__TypeAssignment_1_0_2 ) ) )
            // InternalShortDSLParser.g:1307:1: ( ( rule__Model__TypeAssignment_1_0_2 ) )
            {
            // InternalShortDSLParser.g:1307:1: ( ( rule__Model__TypeAssignment_1_0_2 ) )
            // InternalShortDSLParser.g:1308:2: ( rule__Model__TypeAssignment_1_0_2 )
            {
             before(grammarAccess.getModelAccess().getTypeAssignment_1_0_2()); 
            // InternalShortDSLParser.g:1309:2: ( rule__Model__TypeAssignment_1_0_2 )
            // InternalShortDSLParser.g:1309:3: rule__Model__TypeAssignment_1_0_2
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
    // InternalShortDSLParser.g:1318:1: rule__Model__Group_1_1__0 : rule__Model__Group_1_1__0__Impl rule__Model__Group_1_1__1 ;
    public final void rule__Model__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1322:1: ( rule__Model__Group_1_1__0__Impl rule__Model__Group_1_1__1 )
            // InternalShortDSLParser.g:1323:2: rule__Model__Group_1_1__0__Impl rule__Model__Group_1_1__1
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
    // InternalShortDSLParser.g:1330:1: rule__Model__Group_1_1__0__Impl : ( Short ) ;
    public final void rule__Model__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1334:1: ( ( Short ) )
            // InternalShortDSLParser.g:1335:1: ( Short )
            {
            // InternalShortDSLParser.g:1335:1: ( Short )
            // InternalShortDSLParser.g:1336:2: Short
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
    // InternalShortDSLParser.g:1345:1: rule__Model__Group_1_1__1 : rule__Model__Group_1_1__1__Impl rule__Model__Group_1_1__2 ;
    public final void rule__Model__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1349:1: ( rule__Model__Group_1_1__1__Impl rule__Model__Group_1_1__2 )
            // InternalShortDSLParser.g:1350:2: rule__Model__Group_1_1__1__Impl rule__Model__Group_1_1__2
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
    // InternalShortDSLParser.g:1357:1: rule__Model__Group_1_1__1__Impl : ( Dsl ) ;
    public final void rule__Model__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1361:1: ( ( Dsl ) )
            // InternalShortDSLParser.g:1362:1: ( Dsl )
            {
            // InternalShortDSLParser.g:1362:1: ( Dsl )
            // InternalShortDSLParser.g:1363:2: Dsl
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
    // InternalShortDSLParser.g:1372:1: rule__Model__Group_1_1__2 : rule__Model__Group_1_1__2__Impl ;
    public final void rule__Model__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1376:1: ( rule__Model__Group_1_1__2__Impl )
            // InternalShortDSLParser.g:1377:2: rule__Model__Group_1_1__2__Impl
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
    // InternalShortDSLParser.g:1383:1: rule__Model__Group_1_1__2__Impl : ( ( rule__Model__TypeAssignment_1_1_2 ) ) ;
    public final void rule__Model__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1387:1: ( ( ( rule__Model__TypeAssignment_1_1_2 ) ) )
            // InternalShortDSLParser.g:1388:1: ( ( rule__Model__TypeAssignment_1_1_2 ) )
            {
            // InternalShortDSLParser.g:1388:1: ( ( rule__Model__TypeAssignment_1_1_2 ) )
            // InternalShortDSLParser.g:1389:2: ( rule__Model__TypeAssignment_1_1_2 )
            {
             before(grammarAccess.getModelAccess().getTypeAssignment_1_1_2()); 
            // InternalShortDSLParser.g:1390:2: ( rule__Model__TypeAssignment_1_1_2 )
            // InternalShortDSLParser.g:1390:3: rule__Model__TypeAssignment_1_1_2
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
    // InternalShortDSLParser.g:1399:1: rule__DSL_Long__Group__0 : rule__DSL_Long__Group__0__Impl rule__DSL_Long__Group__1 ;
    public final void rule__DSL_Long__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1403:1: ( rule__DSL_Long__Group__0__Impl rule__DSL_Long__Group__1 )
            // InternalShortDSLParser.g:1404:2: rule__DSL_Long__Group__0__Impl rule__DSL_Long__Group__1
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
    // InternalShortDSLParser.g:1411:1: rule__DSL_Long__Group__0__Impl : ( Test ) ;
    public final void rule__DSL_Long__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1415:1: ( ( Test ) )
            // InternalShortDSLParser.g:1416:1: ( Test )
            {
            // InternalShortDSLParser.g:1416:1: ( Test )
            // InternalShortDSLParser.g:1417:2: Test
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
    // InternalShortDSLParser.g:1426:1: rule__DSL_Long__Group__1 : rule__DSL_Long__Group__1__Impl ;
    public final void rule__DSL_Long__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1430:1: ( rule__DSL_Long__Group__1__Impl )
            // InternalShortDSLParser.g:1431:2: rule__DSL_Long__Group__1__Impl
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
    // InternalShortDSLParser.g:1437:1: rule__DSL_Long__Group__1__Impl : ( ( rule__DSL_Long__NameAssignment_1 ) ) ;
    public final void rule__DSL_Long__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1441:1: ( ( ( rule__DSL_Long__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:1442:1: ( ( rule__DSL_Long__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:1442:1: ( ( rule__DSL_Long__NameAssignment_1 ) )
            // InternalShortDSLParser.g:1443:2: ( rule__DSL_Long__NameAssignment_1 )
            {
             before(grammarAccess.getDSL_LongAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:1444:2: ( rule__DSL_Long__NameAssignment_1 )
            // InternalShortDSLParser.g:1444:3: rule__DSL_Long__NameAssignment_1
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
    // InternalShortDSLParser.g:1453:1: rule__DSL_Short__Group__0 : rule__DSL_Short__Group__0__Impl rule__DSL_Short__Group__1 ;
    public final void rule__DSL_Short__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1457:1: ( rule__DSL_Short__Group__0__Impl rule__DSL_Short__Group__1 )
            // InternalShortDSLParser.g:1458:2: rule__DSL_Short__Group__0__Impl rule__DSL_Short__Group__1
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
    // InternalShortDSLParser.g:1465:1: rule__DSL_Short__Group__0__Impl : ( () ) ;
    public final void rule__DSL_Short__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1469:1: ( ( () ) )
            // InternalShortDSLParser.g:1470:1: ( () )
            {
            // InternalShortDSLParser.g:1470:1: ( () )
            // InternalShortDSLParser.g:1471:2: ()
            {
             before(grammarAccess.getDSL_ShortAccess().getDSLShortAction_0()); 
            // InternalShortDSLParser.g:1472:2: ()
            // InternalShortDSLParser.g:1472:3: 
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
    // InternalShortDSLParser.g:1480:1: rule__DSL_Short__Group__1 : rule__DSL_Short__Group__1__Impl rule__DSL_Short__Group__2 ;
    public final void rule__DSL_Short__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1484:1: ( rule__DSL_Short__Group__1__Impl rule__DSL_Short__Group__2 )
            // InternalShortDSLParser.g:1485:2: rule__DSL_Short__Group__1__Impl rule__DSL_Short__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalShortDSLParser.g:1492:1: rule__DSL_Short__Group__1__Impl : ( ( rule__DSL_Short__ConfigurationAssignment_1 ) ) ;
    public final void rule__DSL_Short__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1496:1: ( ( ( rule__DSL_Short__ConfigurationAssignment_1 ) ) )
            // InternalShortDSLParser.g:1497:1: ( ( rule__DSL_Short__ConfigurationAssignment_1 ) )
            {
            // InternalShortDSLParser.g:1497:1: ( ( rule__DSL_Short__ConfigurationAssignment_1 ) )
            // InternalShortDSLParser.g:1498:2: ( rule__DSL_Short__ConfigurationAssignment_1 )
            {
             before(grammarAccess.getDSL_ShortAccess().getConfigurationAssignment_1()); 
            // InternalShortDSLParser.g:1499:2: ( rule__DSL_Short__ConfigurationAssignment_1 )
            // InternalShortDSLParser.g:1499:3: rule__DSL_Short__ConfigurationAssignment_1
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
    // InternalShortDSLParser.g:1507:1: rule__DSL_Short__Group__2 : rule__DSL_Short__Group__2__Impl ;
    public final void rule__DSL_Short__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1511:1: ( rule__DSL_Short__Group__2__Impl )
            // InternalShortDSLParser.g:1512:2: rule__DSL_Short__Group__2__Impl
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
    // InternalShortDSLParser.g:1518:1: rule__DSL_Short__Group__2__Impl : ( ( rule__DSL_Short__DiskHandlingsAssignment_2 )* ) ;
    public final void rule__DSL_Short__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1522:1: ( ( ( rule__DSL_Short__DiskHandlingsAssignment_2 )* ) )
            // InternalShortDSLParser.g:1523:1: ( ( rule__DSL_Short__DiskHandlingsAssignment_2 )* )
            {
            // InternalShortDSLParser.g:1523:1: ( ( rule__DSL_Short__DiskHandlingsAssignment_2 )* )
            // InternalShortDSLParser.g:1524:2: ( rule__DSL_Short__DiskHandlingsAssignment_2 )*
            {
             before(grammarAccess.getDSL_ShortAccess().getDiskHandlingsAssignment_2()); 
            // InternalShortDSLParser.g:1525:2: ( rule__DSL_Short__DiskHandlingsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalShortDSLParser.g:1525:3: rule__DSL_Short__DiskHandlingsAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DSL_Short__DiskHandlingsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalShortDSLParser.g:1534:1: rule__ConfigurationS__Group__0 : rule__ConfigurationS__Group__0__Impl rule__ConfigurationS__Group__1 ;
    public final void rule__ConfigurationS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1538:1: ( rule__ConfigurationS__Group__0__Impl rule__ConfigurationS__Group__1 )
            // InternalShortDSLParser.g:1539:2: rule__ConfigurationS__Group__0__Impl rule__ConfigurationS__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalShortDSLParser.g:1546:1: rule__ConfigurationS__Group__0__Impl : ( Devices ) ;
    public final void rule__ConfigurationS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1550:1: ( ( Devices ) )
            // InternalShortDSLParser.g:1551:1: ( Devices )
            {
            // InternalShortDSLParser.g:1551:1: ( Devices )
            // InternalShortDSLParser.g:1552:2: Devices
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
    // InternalShortDSLParser.g:1561:1: rule__ConfigurationS__Group__1 : rule__ConfigurationS__Group__1__Impl rule__ConfigurationS__Group__2 ;
    public final void rule__ConfigurationS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1565:1: ( rule__ConfigurationS__Group__1__Impl rule__ConfigurationS__Group__2 )
            // InternalShortDSLParser.g:1566:2: rule__ConfigurationS__Group__1__Impl rule__ConfigurationS__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalShortDSLParser.g:1573:1: rule__ConfigurationS__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ConfigurationS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1577:1: ( ( LeftCurlyBracket ) )
            // InternalShortDSLParser.g:1578:1: ( LeftCurlyBracket )
            {
            // InternalShortDSLParser.g:1578:1: ( LeftCurlyBracket )
            // InternalShortDSLParser.g:1579:2: LeftCurlyBracket
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
    // InternalShortDSLParser.g:1588:1: rule__ConfigurationS__Group__2 : rule__ConfigurationS__Group__2__Impl rule__ConfigurationS__Group__3 ;
    public final void rule__ConfigurationS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1592:1: ( rule__ConfigurationS__Group__2__Impl rule__ConfigurationS__Group__3 )
            // InternalShortDSLParser.g:1593:2: rule__ConfigurationS__Group__2__Impl rule__ConfigurationS__Group__3
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
    // InternalShortDSLParser.g:1600:1: rule__ConfigurationS__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ConfigurationS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1604:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:1605:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:1605:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:1606:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:1615:1: rule__ConfigurationS__Group__3 : rule__ConfigurationS__Group__3__Impl rule__ConfigurationS__Group__4 ;
    public final void rule__ConfigurationS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1619:1: ( rule__ConfigurationS__Group__3__Impl rule__ConfigurationS__Group__4 )
            // InternalShortDSLParser.g:1620:2: rule__ConfigurationS__Group__3__Impl rule__ConfigurationS__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalShortDSLParser.g:1627:1: rule__ConfigurationS__Group__3__Impl : ( ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* ) ) ;
    public final void rule__ConfigurationS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1631:1: ( ( ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* ) ) )
            // InternalShortDSLParser.g:1632:1: ( ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* ) )
            {
            // InternalShortDSLParser.g:1632:1: ( ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* ) )
            // InternalShortDSLParser.g:1633:2: ( ( rule__ConfigurationS__DevicesAssignment_3 ) ) ( ( rule__ConfigurationS__DevicesAssignment_3 )* )
            {
            // InternalShortDSLParser.g:1633:2: ( ( rule__ConfigurationS__DevicesAssignment_3 ) )
            // InternalShortDSLParser.g:1634:3: ( rule__ConfigurationS__DevicesAssignment_3 )
            {
             before(grammarAccess.getConfigurationSAccess().getDevicesAssignment_3()); 
            // InternalShortDSLParser.g:1635:3: ( rule__ConfigurationS__DevicesAssignment_3 )
            // InternalShortDSLParser.g:1635:4: rule__ConfigurationS__DevicesAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__ConfigurationS__DevicesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationSAccess().getDevicesAssignment_3()); 

            }

            // InternalShortDSLParser.g:1638:2: ( ( rule__ConfigurationS__DevicesAssignment_3 )* )
            // InternalShortDSLParser.g:1639:3: ( rule__ConfigurationS__DevicesAssignment_3 )*
            {
             before(grammarAccess.getConfigurationSAccess().getDevicesAssignment_3()); 
            // InternalShortDSLParser.g:1640:3: ( rule__ConfigurationS__DevicesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalShortDSLParser.g:1640:4: rule__ConfigurationS__DevicesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ConfigurationS__DevicesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalShortDSLParser.g:1649:1: rule__ConfigurationS__Group__4 : rule__ConfigurationS__Group__4__Impl rule__ConfigurationS__Group__5 ;
    public final void rule__ConfigurationS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1653:1: ( rule__ConfigurationS__Group__4__Impl rule__ConfigurationS__Group__5 )
            // InternalShortDSLParser.g:1654:2: rule__ConfigurationS__Group__4__Impl rule__ConfigurationS__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalShortDSLParser.g:1661:1: rule__ConfigurationS__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ConfigurationS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1665:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:1666:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:1666:1: ( RULE_END )
            // InternalShortDSLParser.g:1667:2: RULE_END
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
    // InternalShortDSLParser.g:1676:1: rule__ConfigurationS__Group__5 : rule__ConfigurationS__Group__5__Impl ;
    public final void rule__ConfigurationS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1680:1: ( rule__ConfigurationS__Group__5__Impl )
            // InternalShortDSLParser.g:1681:2: rule__ConfigurationS__Group__5__Impl
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
    // InternalShortDSLParser.g:1687:1: rule__ConfigurationS__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__ConfigurationS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1691:1: ( ( RightCurlyBracket ) )
            // InternalShortDSLParser.g:1692:1: ( RightCurlyBracket )
            {
            // InternalShortDSLParser.g:1692:1: ( RightCurlyBracket )
            // InternalShortDSLParser.g:1693:2: RightCurlyBracket
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
    // InternalShortDSLParser.g:1703:1: rule__CraneS__Group__0 : rule__CraneS__Group__0__Impl rule__CraneS__Group__1 ;
    public final void rule__CraneS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1707:1: ( rule__CraneS__Group__0__Impl rule__CraneS__Group__1 )
            // InternalShortDSLParser.g:1708:2: rule__CraneS__Group__0__Impl rule__CraneS__Group__1
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
    // InternalShortDSLParser.g:1715:1: rule__CraneS__Group__0__Impl : ( () ) ;
    public final void rule__CraneS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1719:1: ( ( () ) )
            // InternalShortDSLParser.g:1720:1: ( () )
            {
            // InternalShortDSLParser.g:1720:1: ( () )
            // InternalShortDSLParser.g:1721:2: ()
            {
             before(grammarAccess.getCraneSAccess().getCraneAction_0()); 
            // InternalShortDSLParser.g:1722:2: ()
            // InternalShortDSLParser.g:1722:3: 
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
    // InternalShortDSLParser.g:1730:1: rule__CraneS__Group__1 : rule__CraneS__Group__1__Impl rule__CraneS__Group__2 ;
    public final void rule__CraneS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1734:1: ( rule__CraneS__Group__1__Impl rule__CraneS__Group__2 )
            // InternalShortDSLParser.g:1735:2: rule__CraneS__Group__1__Impl rule__CraneS__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalShortDSLParser.g:1742:1: rule__CraneS__Group__1__Impl : ( ( rule__CraneS__NameAssignment_1 ) ) ;
    public final void rule__CraneS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1746:1: ( ( ( rule__CraneS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:1747:1: ( ( rule__CraneS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:1747:1: ( ( rule__CraneS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:1748:2: ( rule__CraneS__NameAssignment_1 )
            {
             before(grammarAccess.getCraneSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:1749:2: ( rule__CraneS__NameAssignment_1 )
            // InternalShortDSLParser.g:1749:3: rule__CraneS__NameAssignment_1
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
    // InternalShortDSLParser.g:1757:1: rule__CraneS__Group__2 : rule__CraneS__Group__2__Impl rule__CraneS__Group__3 ;
    public final void rule__CraneS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1761:1: ( rule__CraneS__Group__2__Impl rule__CraneS__Group__3 )
            // InternalShortDSLParser.g:1762:2: rule__CraneS__Group__2__Impl rule__CraneS__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalShortDSLParser.g:1769:1: rule__CraneS__Group__2__Impl : ( Colon ) ;
    public final void rule__CraneS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1773:1: ( ( Colon ) )
            // InternalShortDSLParser.g:1774:1: ( Colon )
            {
            // InternalShortDSLParser.g:1774:1: ( Colon )
            // InternalShortDSLParser.g:1775:2: Colon
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
    // InternalShortDSLParser.g:1784:1: rule__CraneS__Group__3 : rule__CraneS__Group__3__Impl rule__CraneS__Group__4 ;
    public final void rule__CraneS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1788:1: ( rule__CraneS__Group__3__Impl rule__CraneS__Group__4 )
            // InternalShortDSLParser.g:1789:2: rule__CraneS__Group__3__Impl rule__CraneS__Group__4
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
    // InternalShortDSLParser.g:1796:1: rule__CraneS__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__CraneS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1800:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:1801:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:1801:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:1802:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:1811:1: rule__CraneS__Group__4 : rule__CraneS__Group__4__Impl rule__CraneS__Group__5 ;
    public final void rule__CraneS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1815:1: ( rule__CraneS__Group__4__Impl rule__CraneS__Group__5 )
            // InternalShortDSLParser.g:1816:2: rule__CraneS__Group__4__Impl rule__CraneS__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalShortDSLParser.g:1823:1: rule__CraneS__Group__4__Impl : ( ( ( rule__CraneS__PositionsAssignment_4 ) ) ( ( rule__CraneS__PositionsAssignment_4 )* ) ) ;
    public final void rule__CraneS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1827:1: ( ( ( ( rule__CraneS__PositionsAssignment_4 ) ) ( ( rule__CraneS__PositionsAssignment_4 )* ) ) )
            // InternalShortDSLParser.g:1828:1: ( ( ( rule__CraneS__PositionsAssignment_4 ) ) ( ( rule__CraneS__PositionsAssignment_4 )* ) )
            {
            // InternalShortDSLParser.g:1828:1: ( ( ( rule__CraneS__PositionsAssignment_4 ) ) ( ( rule__CraneS__PositionsAssignment_4 )* ) )
            // InternalShortDSLParser.g:1829:2: ( ( rule__CraneS__PositionsAssignment_4 ) ) ( ( rule__CraneS__PositionsAssignment_4 )* )
            {
            // InternalShortDSLParser.g:1829:2: ( ( rule__CraneS__PositionsAssignment_4 ) )
            // InternalShortDSLParser.g:1830:3: ( rule__CraneS__PositionsAssignment_4 )
            {
             before(grammarAccess.getCraneSAccess().getPositionsAssignment_4()); 
            // InternalShortDSLParser.g:1831:3: ( rule__CraneS__PositionsAssignment_4 )
            // InternalShortDSLParser.g:1831:4: rule__CraneS__PositionsAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__CraneS__PositionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCraneSAccess().getPositionsAssignment_4()); 

            }

            // InternalShortDSLParser.g:1834:2: ( ( rule__CraneS__PositionsAssignment_4 )* )
            // InternalShortDSLParser.g:1835:3: ( rule__CraneS__PositionsAssignment_4 )*
            {
             before(grammarAccess.getCraneSAccess().getPositionsAssignment_4()); 
            // InternalShortDSLParser.g:1836:3: ( rule__CraneS__PositionsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalShortDSLParser.g:1836:4: rule__CraneS__PositionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CraneS__PositionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCraneSAccess().getPositionsAssignment_4()); 

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
    // InternalShortDSLParser.g:1845:1: rule__CraneS__Group__5 : rule__CraneS__Group__5__Impl ;
    public final void rule__CraneS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1849:1: ( rule__CraneS__Group__5__Impl )
            // InternalShortDSLParser.g:1850:2: rule__CraneS__Group__5__Impl
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
    // InternalShortDSLParser.g:1856:1: rule__CraneS__Group__5__Impl : ( RULE_END ) ;
    public final void rule__CraneS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1860:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:1861:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:1861:1: ( RULE_END )
            // InternalShortDSLParser.g:1862:2: RULE_END
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
    // InternalShortDSLParser.g:1872:1: rule__CraneZoneS__Group__0 : rule__CraneZoneS__Group__0__Impl rule__CraneZoneS__Group__1 ;
    public final void rule__CraneZoneS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1876:1: ( rule__CraneZoneS__Group__0__Impl rule__CraneZoneS__Group__1 )
            // InternalShortDSLParser.g:1877:2: rule__CraneZoneS__Group__0__Impl rule__CraneZoneS__Group__1
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
    // InternalShortDSLParser.g:1884:1: rule__CraneZoneS__Group__0__Impl : ( () ) ;
    public final void rule__CraneZoneS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1888:1: ( ( () ) )
            // InternalShortDSLParser.g:1889:1: ( () )
            {
            // InternalShortDSLParser.g:1889:1: ( () )
            // InternalShortDSLParser.g:1890:2: ()
            {
             before(grammarAccess.getCraneZoneSAccess().getCraneZoneAction_0()); 
            // InternalShortDSLParser.g:1891:2: ()
            // InternalShortDSLParser.g:1891:3: 
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
    // InternalShortDSLParser.g:1899:1: rule__CraneZoneS__Group__1 : rule__CraneZoneS__Group__1__Impl rule__CraneZoneS__Group__2 ;
    public final void rule__CraneZoneS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1903:1: ( rule__CraneZoneS__Group__1__Impl rule__CraneZoneS__Group__2 )
            // InternalShortDSLParser.g:1904:2: rule__CraneZoneS__Group__1__Impl rule__CraneZoneS__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalShortDSLParser.g:1911:1: rule__CraneZoneS__Group__1__Impl : ( ( rule__CraneZoneS__NameAssignment_1 ) ) ;
    public final void rule__CraneZoneS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1915:1: ( ( ( rule__CraneZoneS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:1916:1: ( ( rule__CraneZoneS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:1916:1: ( ( rule__CraneZoneS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:1917:2: ( rule__CraneZoneS__NameAssignment_1 )
            {
             before(grammarAccess.getCraneZoneSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:1918:2: ( rule__CraneZoneS__NameAssignment_1 )
            // InternalShortDSLParser.g:1918:3: rule__CraneZoneS__NameAssignment_1
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
    // InternalShortDSLParser.g:1926:1: rule__CraneZoneS__Group__2 : rule__CraneZoneS__Group__2__Impl rule__CraneZoneS__Group__3 ;
    public final void rule__CraneZoneS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1930:1: ( rule__CraneZoneS__Group__2__Impl rule__CraneZoneS__Group__3 )
            // InternalShortDSLParser.g:1931:2: rule__CraneZoneS__Group__2__Impl rule__CraneZoneS__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalShortDSLParser.g:1938:1: rule__CraneZoneS__Group__2__Impl : ( Colon ) ;
    public final void rule__CraneZoneS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1942:1: ( ( Colon ) )
            // InternalShortDSLParser.g:1943:1: ( Colon )
            {
            // InternalShortDSLParser.g:1943:1: ( Colon )
            // InternalShortDSLParser.g:1944:2: Colon
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
    // InternalShortDSLParser.g:1953:1: rule__CraneZoneS__Group__3 : rule__CraneZoneS__Group__3__Impl rule__CraneZoneS__Group__4 ;
    public final void rule__CraneZoneS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1957:1: ( rule__CraneZoneS__Group__3__Impl rule__CraneZoneS__Group__4 )
            // InternalShortDSLParser.g:1958:2: rule__CraneZoneS__Group__3__Impl rule__CraneZoneS__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalShortDSLParser.g:1965:1: rule__CraneZoneS__Group__3__Impl : ( ( rule__CraneZoneS__ZoneValueAssignment_3 ) ) ;
    public final void rule__CraneZoneS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1969:1: ( ( ( rule__CraneZoneS__ZoneValueAssignment_3 ) ) )
            // InternalShortDSLParser.g:1970:1: ( ( rule__CraneZoneS__ZoneValueAssignment_3 ) )
            {
            // InternalShortDSLParser.g:1970:1: ( ( rule__CraneZoneS__ZoneValueAssignment_3 ) )
            // InternalShortDSLParser.g:1971:2: ( rule__CraneZoneS__ZoneValueAssignment_3 )
            {
             before(grammarAccess.getCraneZoneSAccess().getZoneValueAssignment_3()); 
            // InternalShortDSLParser.g:1972:2: ( rule__CraneZoneS__ZoneValueAssignment_3 )
            // InternalShortDSLParser.g:1972:3: rule__CraneZoneS__ZoneValueAssignment_3
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
    // InternalShortDSLParser.g:1980:1: rule__CraneZoneS__Group__4 : rule__CraneZoneS__Group__4__Impl ;
    public final void rule__CraneZoneS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1984:1: ( rule__CraneZoneS__Group__4__Impl )
            // InternalShortDSLParser.g:1985:2: rule__CraneZoneS__Group__4__Impl
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
    // InternalShortDSLParser.g:1991:1: rule__CraneZoneS__Group__4__Impl : ( ( Comma )? ) ;
    public final void rule__CraneZoneS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1995:1: ( ( ( Comma )? ) )
            // InternalShortDSLParser.g:1996:1: ( ( Comma )? )
            {
            // InternalShortDSLParser.g:1996:1: ( ( Comma )? )
            // InternalShortDSLParser.g:1997:2: ( Comma )?
            {
             before(grammarAccess.getCraneZoneSAccess().getCommaKeyword_4()); 
            // InternalShortDSLParser.g:1998:2: ( Comma )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Comma) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalShortDSLParser.g:1998:3: Comma
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
    // InternalShortDSLParser.g:2007:1: rule__DiskS__Group__0 : rule__DiskS__Group__0__Impl rule__DiskS__Group__1 ;
    public final void rule__DiskS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2011:1: ( rule__DiskS__Group__0__Impl rule__DiskS__Group__1 )
            // InternalShortDSLParser.g:2012:2: rule__DiskS__Group__0__Impl rule__DiskS__Group__1
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
    // InternalShortDSLParser.g:2019:1: rule__DiskS__Group__0__Impl : ( () ) ;
    public final void rule__DiskS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2023:1: ( ( () ) )
            // InternalShortDSLParser.g:2024:1: ( () )
            {
            // InternalShortDSLParser.g:2024:1: ( () )
            // InternalShortDSLParser.g:2025:2: ()
            {
             before(grammarAccess.getDiskSAccess().getDiskAction_0()); 
            // InternalShortDSLParser.g:2026:2: ()
            // InternalShortDSLParser.g:2026:3: 
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
    // InternalShortDSLParser.g:2034:1: rule__DiskS__Group__1 : rule__DiskS__Group__1__Impl rule__DiskS__Group__2 ;
    public final void rule__DiskS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2038:1: ( rule__DiskS__Group__1__Impl rule__DiskS__Group__2 )
            // InternalShortDSLParser.g:2039:2: rule__DiskS__Group__1__Impl rule__DiskS__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalShortDSLParser.g:2046:1: rule__DiskS__Group__1__Impl : ( ( rule__DiskS__NameAssignment_1 ) ) ;
    public final void rule__DiskS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2050:1: ( ( ( rule__DiskS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2051:1: ( ( rule__DiskS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2051:1: ( ( rule__DiskS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2052:2: ( rule__DiskS__NameAssignment_1 )
            {
             before(grammarAccess.getDiskSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2053:2: ( rule__DiskS__NameAssignment_1 )
            // InternalShortDSLParser.g:2053:3: rule__DiskS__NameAssignment_1
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
    // InternalShortDSLParser.g:2061:1: rule__DiskS__Group__2 : rule__DiskS__Group__2__Impl rule__DiskS__Group__3 ;
    public final void rule__DiskS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2065:1: ( rule__DiskS__Group__2__Impl rule__DiskS__Group__3 )
            // InternalShortDSLParser.g:2066:2: rule__DiskS__Group__2__Impl rule__DiskS__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalShortDSLParser.g:2073:1: rule__DiskS__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__DiskS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2077:1: ( ( LeftParenthesis ) )
            // InternalShortDSLParser.g:2078:1: ( LeftParenthesis )
            {
            // InternalShortDSLParser.g:2078:1: ( LeftParenthesis )
            // InternalShortDSLParser.g:2079:2: LeftParenthesis
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
    // InternalShortDSLParser.g:2088:1: rule__DiskS__Group__3 : rule__DiskS__Group__3__Impl rule__DiskS__Group__4 ;
    public final void rule__DiskS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2092:1: ( rule__DiskS__Group__3__Impl rule__DiskS__Group__4 )
            // InternalShortDSLParser.g:2093:2: rule__DiskS__Group__3__Impl rule__DiskS__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalShortDSLParser.g:2100:1: rule__DiskS__Group__3__Impl : ( ( rule__DiskS__NSlotsAssignment_3 ) ) ;
    public final void rule__DiskS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2104:1: ( ( ( rule__DiskS__NSlotsAssignment_3 ) ) )
            // InternalShortDSLParser.g:2105:1: ( ( rule__DiskS__NSlotsAssignment_3 ) )
            {
            // InternalShortDSLParser.g:2105:1: ( ( rule__DiskS__NSlotsAssignment_3 ) )
            // InternalShortDSLParser.g:2106:2: ( rule__DiskS__NSlotsAssignment_3 )
            {
             before(grammarAccess.getDiskSAccess().getNSlotsAssignment_3()); 
            // InternalShortDSLParser.g:2107:2: ( rule__DiskS__NSlotsAssignment_3 )
            // InternalShortDSLParser.g:2107:3: rule__DiskS__NSlotsAssignment_3
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
    // InternalShortDSLParser.g:2115:1: rule__DiskS__Group__4 : rule__DiskS__Group__4__Impl rule__DiskS__Group__5 ;
    public final void rule__DiskS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2119:1: ( rule__DiskS__Group__4__Impl rule__DiskS__Group__5 )
            // InternalShortDSLParser.g:2120:2: rule__DiskS__Group__4__Impl rule__DiskS__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalShortDSLParser.g:2127:1: rule__DiskS__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__DiskS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2131:1: ( ( RightParenthesis ) )
            // InternalShortDSLParser.g:2132:1: ( RightParenthesis )
            {
            // InternalShortDSLParser.g:2132:1: ( RightParenthesis )
            // InternalShortDSLParser.g:2133:2: RightParenthesis
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
    // InternalShortDSLParser.g:2142:1: rule__DiskS__Group__5 : rule__DiskS__Group__5__Impl rule__DiskS__Group__6 ;
    public final void rule__DiskS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2146:1: ( rule__DiskS__Group__5__Impl rule__DiskS__Group__6 )
            // InternalShortDSLParser.g:2147:2: rule__DiskS__Group__5__Impl rule__DiskS__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalShortDSLParser.g:2154:1: rule__DiskS__Group__5__Impl : ( Colon ) ;
    public final void rule__DiskS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2158:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2159:1: ( Colon )
            {
            // InternalShortDSLParser.g:2159:1: ( Colon )
            // InternalShortDSLParser.g:2160:2: Colon
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
    // InternalShortDSLParser.g:2169:1: rule__DiskS__Group__6 : rule__DiskS__Group__6__Impl rule__DiskS__Group__7 ;
    public final void rule__DiskS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2173:1: ( rule__DiskS__Group__6__Impl rule__DiskS__Group__7 )
            // InternalShortDSLParser.g:2174:2: rule__DiskS__Group__6__Impl rule__DiskS__Group__7
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
    // InternalShortDSLParser.g:2181:1: rule__DiskS__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__DiskS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2185:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:2186:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:2186:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:2187:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:2196:1: rule__DiskS__Group__7 : rule__DiskS__Group__7__Impl rule__DiskS__Group__8 ;
    public final void rule__DiskS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2200:1: ( rule__DiskS__Group__7__Impl rule__DiskS__Group__8 )
            // InternalShortDSLParser.g:2201:2: rule__DiskS__Group__7__Impl rule__DiskS__Group__8
            {
            pushFollow(FOLLOW_11);
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
    // InternalShortDSLParser.g:2208:1: rule__DiskS__Group__7__Impl : ( ( ( rule__DiskS__ZonesAssignment_7 ) ) ( ( rule__DiskS__ZonesAssignment_7 )* ) ) ;
    public final void rule__DiskS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2212:1: ( ( ( ( rule__DiskS__ZonesAssignment_7 ) ) ( ( rule__DiskS__ZonesAssignment_7 )* ) ) )
            // InternalShortDSLParser.g:2213:1: ( ( ( rule__DiskS__ZonesAssignment_7 ) ) ( ( rule__DiskS__ZonesAssignment_7 )* ) )
            {
            // InternalShortDSLParser.g:2213:1: ( ( ( rule__DiskS__ZonesAssignment_7 ) ) ( ( rule__DiskS__ZonesAssignment_7 )* ) )
            // InternalShortDSLParser.g:2214:2: ( ( rule__DiskS__ZonesAssignment_7 ) ) ( ( rule__DiskS__ZonesAssignment_7 )* )
            {
            // InternalShortDSLParser.g:2214:2: ( ( rule__DiskS__ZonesAssignment_7 ) )
            // InternalShortDSLParser.g:2215:3: ( rule__DiskS__ZonesAssignment_7 )
            {
             before(grammarAccess.getDiskSAccess().getZonesAssignment_7()); 
            // InternalShortDSLParser.g:2216:3: ( rule__DiskS__ZonesAssignment_7 )
            // InternalShortDSLParser.g:2216:4: rule__DiskS__ZonesAssignment_7
            {
            pushFollow(FOLLOW_8);
            rule__DiskS__ZonesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDiskSAccess().getZonesAssignment_7()); 

            }

            // InternalShortDSLParser.g:2219:2: ( ( rule__DiskS__ZonesAssignment_7 )* )
            // InternalShortDSLParser.g:2220:3: ( rule__DiskS__ZonesAssignment_7 )*
            {
             before(grammarAccess.getDiskSAccess().getZonesAssignment_7()); 
            // InternalShortDSLParser.g:2221:3: ( rule__DiskS__ZonesAssignment_7 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalShortDSLParser.g:2221:4: rule__DiskS__ZonesAssignment_7
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DiskS__ZonesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDiskSAccess().getZonesAssignment_7()); 

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
    // InternalShortDSLParser.g:2230:1: rule__DiskS__Group__8 : rule__DiskS__Group__8__Impl ;
    public final void rule__DiskS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2234:1: ( rule__DiskS__Group__8__Impl )
            // InternalShortDSLParser.g:2235:2: rule__DiskS__Group__8__Impl
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
    // InternalShortDSLParser.g:2241:1: rule__DiskS__Group__8__Impl : ( RULE_END ) ;
    public final void rule__DiskS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2245:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:2246:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:2246:1: ( RULE_END )
            // InternalShortDSLParser.g:2247:2: RULE_END
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
    // InternalShortDSLParser.g:2257:1: rule__DiskZoneS__Group__0 : rule__DiskZoneS__Group__0__Impl rule__DiskZoneS__Group__1 ;
    public final void rule__DiskZoneS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2261:1: ( rule__DiskZoneS__Group__0__Impl rule__DiskZoneS__Group__1 )
            // InternalShortDSLParser.g:2262:2: rule__DiskZoneS__Group__0__Impl rule__DiskZoneS__Group__1
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
    // InternalShortDSLParser.g:2269:1: rule__DiskZoneS__Group__0__Impl : ( () ) ;
    public final void rule__DiskZoneS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2273:1: ( ( () ) )
            // InternalShortDSLParser.g:2274:1: ( () )
            {
            // InternalShortDSLParser.g:2274:1: ( () )
            // InternalShortDSLParser.g:2275:2: ()
            {
             before(grammarAccess.getDiskZoneSAccess().getDiskZoneAction_0()); 
            // InternalShortDSLParser.g:2276:2: ()
            // InternalShortDSLParser.g:2276:3: 
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
    // InternalShortDSLParser.g:2284:1: rule__DiskZoneS__Group__1 : rule__DiskZoneS__Group__1__Impl rule__DiskZoneS__Group__2 ;
    public final void rule__DiskZoneS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2288:1: ( rule__DiskZoneS__Group__1__Impl rule__DiskZoneS__Group__2 )
            // InternalShortDSLParser.g:2289:2: rule__DiskZoneS__Group__1__Impl rule__DiskZoneS__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalShortDSLParser.g:2296:1: rule__DiskZoneS__Group__1__Impl : ( ( rule__DiskZoneS__NameAssignment_1 ) ) ;
    public final void rule__DiskZoneS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2300:1: ( ( ( rule__DiskZoneS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2301:1: ( ( rule__DiskZoneS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2301:1: ( ( rule__DiskZoneS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2302:2: ( rule__DiskZoneS__NameAssignment_1 )
            {
             before(grammarAccess.getDiskZoneSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2303:2: ( rule__DiskZoneS__NameAssignment_1 )
            // InternalShortDSLParser.g:2303:3: rule__DiskZoneS__NameAssignment_1
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
    // InternalShortDSLParser.g:2311:1: rule__DiskZoneS__Group__2 : rule__DiskZoneS__Group__2__Impl rule__DiskZoneS__Group__3 ;
    public final void rule__DiskZoneS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2315:1: ( rule__DiskZoneS__Group__2__Impl rule__DiskZoneS__Group__3 )
            // InternalShortDSLParser.g:2316:2: rule__DiskZoneS__Group__2__Impl rule__DiskZoneS__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalShortDSLParser.g:2323:1: rule__DiskZoneS__Group__2__Impl : ( Colon ) ;
    public final void rule__DiskZoneS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2327:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2328:1: ( Colon )
            {
            // InternalShortDSLParser.g:2328:1: ( Colon )
            // InternalShortDSLParser.g:2329:2: Colon
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
    // InternalShortDSLParser.g:2338:1: rule__DiskZoneS__Group__3 : rule__DiskZoneS__Group__3__Impl rule__DiskZoneS__Group__4 ;
    public final void rule__DiskZoneS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2342:1: ( rule__DiskZoneS__Group__3__Impl rule__DiskZoneS__Group__4 )
            // InternalShortDSLParser.g:2343:2: rule__DiskZoneS__Group__3__Impl rule__DiskZoneS__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalShortDSLParser.g:2350:1: rule__DiskZoneS__Group__3__Impl : ( ( rule__DiskZoneS__SlotAssignment_3 ) ) ;
    public final void rule__DiskZoneS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2354:1: ( ( ( rule__DiskZoneS__SlotAssignment_3 ) ) )
            // InternalShortDSLParser.g:2355:1: ( ( rule__DiskZoneS__SlotAssignment_3 ) )
            {
            // InternalShortDSLParser.g:2355:1: ( ( rule__DiskZoneS__SlotAssignment_3 ) )
            // InternalShortDSLParser.g:2356:2: ( rule__DiskZoneS__SlotAssignment_3 )
            {
             before(grammarAccess.getDiskZoneSAccess().getSlotAssignment_3()); 
            // InternalShortDSLParser.g:2357:2: ( rule__DiskZoneS__SlotAssignment_3 )
            // InternalShortDSLParser.g:2357:3: rule__DiskZoneS__SlotAssignment_3
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
    // InternalShortDSLParser.g:2365:1: rule__DiskZoneS__Group__4 : rule__DiskZoneS__Group__4__Impl ;
    public final void rule__DiskZoneS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2369:1: ( rule__DiskZoneS__Group__4__Impl )
            // InternalShortDSLParser.g:2370:2: rule__DiskZoneS__Group__4__Impl
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
    // InternalShortDSLParser.g:2376:1: rule__DiskZoneS__Group__4__Impl : ( ( Comma )? ) ;
    public final void rule__DiskZoneS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2380:1: ( ( ( Comma )? ) )
            // InternalShortDSLParser.g:2381:1: ( ( Comma )? )
            {
            // InternalShortDSLParser.g:2381:1: ( ( Comma )? )
            // InternalShortDSLParser.g:2382:2: ( Comma )?
            {
             before(grammarAccess.getDiskZoneSAccess().getCommaKeyword_4()); 
            // InternalShortDSLParser.g:2383:2: ( Comma )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Comma) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalShortDSLParser.g:2383:3: Comma
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
    // InternalShortDSLParser.g:2392:1: rule__CameraS__Group__0 : rule__CameraS__Group__0__Impl rule__CameraS__Group__1 ;
    public final void rule__CameraS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2396:1: ( rule__CameraS__Group__0__Impl rule__CameraS__Group__1 )
            // InternalShortDSLParser.g:2397:2: rule__CameraS__Group__0__Impl rule__CameraS__Group__1
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
    // InternalShortDSLParser.g:2404:1: rule__CameraS__Group__0__Impl : ( () ) ;
    public final void rule__CameraS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2408:1: ( ( () ) )
            // InternalShortDSLParser.g:2409:1: ( () )
            {
            // InternalShortDSLParser.g:2409:1: ( () )
            // InternalShortDSLParser.g:2410:2: ()
            {
             before(grammarAccess.getCameraSAccess().getCameraAction_0()); 
            // InternalShortDSLParser.g:2411:2: ()
            // InternalShortDSLParser.g:2411:3: 
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
    // InternalShortDSLParser.g:2419:1: rule__CameraS__Group__1 : rule__CameraS__Group__1__Impl rule__CameraS__Group__2 ;
    public final void rule__CameraS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2423:1: ( rule__CameraS__Group__1__Impl rule__CameraS__Group__2 )
            // InternalShortDSLParser.g:2424:2: rule__CameraS__Group__1__Impl rule__CameraS__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalShortDSLParser.g:2431:1: rule__CameraS__Group__1__Impl : ( ( rule__CameraS__NameAssignment_1 ) ) ;
    public final void rule__CameraS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2435:1: ( ( ( rule__CameraS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:2436:1: ( ( rule__CameraS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2436:1: ( ( rule__CameraS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:2437:2: ( rule__CameraS__NameAssignment_1 )
            {
             before(grammarAccess.getCameraSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:2438:2: ( rule__CameraS__NameAssignment_1 )
            // InternalShortDSLParser.g:2438:3: rule__CameraS__NameAssignment_1
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
    // InternalShortDSLParser.g:2446:1: rule__CameraS__Group__2 : rule__CameraS__Group__2__Impl rule__CameraS__Group__3 ;
    public final void rule__CameraS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2450:1: ( rule__CameraS__Group__2__Impl rule__CameraS__Group__3 )
            // InternalShortDSLParser.g:2451:2: rule__CameraS__Group__2__Impl rule__CameraS__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalShortDSLParser.g:2458:1: rule__CameraS__Group__2__Impl : ( Colon ) ;
    public final void rule__CameraS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2462:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2463:1: ( Colon )
            {
            // InternalShortDSLParser.g:2463:1: ( Colon )
            // InternalShortDSLParser.g:2464:2: Colon
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
    // InternalShortDSLParser.g:2473:1: rule__CameraS__Group__3 : rule__CameraS__Group__3__Impl rule__CameraS__Group__4 ;
    public final void rule__CameraS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2477:1: ( rule__CameraS__Group__3__Impl rule__CameraS__Group__4 )
            // InternalShortDSLParser.g:2478:2: rule__CameraS__Group__3__Impl rule__CameraS__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalShortDSLParser.g:2485:1: rule__CameraS__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__CameraS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2489:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:2490:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:2490:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:2491:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:2500:1: rule__CameraS__Group__4 : rule__CameraS__Group__4__Impl rule__CameraS__Group__5 ;
    public final void rule__CameraS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2504:1: ( rule__CameraS__Group__4__Impl rule__CameraS__Group__5 )
            // InternalShortDSLParser.g:2505:2: rule__CameraS__Group__4__Impl rule__CameraS__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalShortDSLParser.g:2512:1: rule__CameraS__Group__4__Impl : ( ( ( rule__CameraS__ColorsAssignment_4 ) ) ( ( rule__CameraS__ColorsAssignment_4 )* ) ) ;
    public final void rule__CameraS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2516:1: ( ( ( ( rule__CameraS__ColorsAssignment_4 ) ) ( ( rule__CameraS__ColorsAssignment_4 )* ) ) )
            // InternalShortDSLParser.g:2517:1: ( ( ( rule__CameraS__ColorsAssignment_4 ) ) ( ( rule__CameraS__ColorsAssignment_4 )* ) )
            {
            // InternalShortDSLParser.g:2517:1: ( ( ( rule__CameraS__ColorsAssignment_4 ) ) ( ( rule__CameraS__ColorsAssignment_4 )* ) )
            // InternalShortDSLParser.g:2518:2: ( ( rule__CameraS__ColorsAssignment_4 ) ) ( ( rule__CameraS__ColorsAssignment_4 )* )
            {
            // InternalShortDSLParser.g:2518:2: ( ( rule__CameraS__ColorsAssignment_4 ) )
            // InternalShortDSLParser.g:2519:3: ( rule__CameraS__ColorsAssignment_4 )
            {
             before(grammarAccess.getCameraSAccess().getColorsAssignment_4()); 
            // InternalShortDSLParser.g:2520:3: ( rule__CameraS__ColorsAssignment_4 )
            // InternalShortDSLParser.g:2520:4: rule__CameraS__ColorsAssignment_4
            {
            pushFollow(FOLLOW_19);
            rule__CameraS__ColorsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCameraSAccess().getColorsAssignment_4()); 

            }

            // InternalShortDSLParser.g:2523:2: ( ( rule__CameraS__ColorsAssignment_4 )* )
            // InternalShortDSLParser.g:2524:3: ( rule__CameraS__ColorsAssignment_4 )*
            {
             before(grammarAccess.getCameraSAccess().getColorsAssignment_4()); 
            // InternalShortDSLParser.g:2525:3: ( rule__CameraS__ColorsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Green||LA21_0==Blue||LA21_0==Red) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalShortDSLParser.g:2525:4: rule__CameraS__ColorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__CameraS__ColorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getCameraSAccess().getColorsAssignment_4()); 

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
    // InternalShortDSLParser.g:2534:1: rule__CameraS__Group__5 : rule__CameraS__Group__5__Impl ;
    public final void rule__CameraS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2538:1: ( rule__CameraS__Group__5__Impl )
            // InternalShortDSLParser.g:2539:2: rule__CameraS__Group__5__Impl
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
    // InternalShortDSLParser.g:2545:1: rule__CameraS__Group__5__Impl : ( RULE_END ) ;
    public final void rule__CameraS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2549:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:2550:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:2550:1: ( RULE_END )
            // InternalShortDSLParser.g:2551:2: RULE_END
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
    // InternalShortDSLParser.g:2561:1: rule__CameraColorS__Group__0 : rule__CameraColorS__Group__0__Impl rule__CameraColorS__Group__1 ;
    public final void rule__CameraColorS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2565:1: ( rule__CameraColorS__Group__0__Impl rule__CameraColorS__Group__1 )
            // InternalShortDSLParser.g:2566:2: rule__CameraColorS__Group__0__Impl rule__CameraColorS__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalShortDSLParser.g:2573:1: rule__CameraColorS__Group__0__Impl : ( () ) ;
    public final void rule__CameraColorS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2577:1: ( ( () ) )
            // InternalShortDSLParser.g:2578:1: ( () )
            {
            // InternalShortDSLParser.g:2578:1: ( () )
            // InternalShortDSLParser.g:2579:2: ()
            {
             before(grammarAccess.getCameraColorSAccess().getCameraColorAction_0()); 
            // InternalShortDSLParser.g:2580:2: ()
            // InternalShortDSLParser.g:2580:3: 
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
    // InternalShortDSLParser.g:2588:1: rule__CameraColorS__Group__1 : rule__CameraColorS__Group__1__Impl rule__CameraColorS__Group__2 ;
    public final void rule__CameraColorS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2592:1: ( rule__CameraColorS__Group__1__Impl rule__CameraColorS__Group__2 )
            // InternalShortDSLParser.g:2593:2: rule__CameraColorS__Group__1__Impl rule__CameraColorS__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalShortDSLParser.g:2600:1: rule__CameraColorS__Group__1__Impl : ( ( rule__CameraColorS__ColorAssignment_1 ) ) ;
    public final void rule__CameraColorS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2604:1: ( ( ( rule__CameraColorS__ColorAssignment_1 ) ) )
            // InternalShortDSLParser.g:2605:1: ( ( rule__CameraColorS__ColorAssignment_1 ) )
            {
            // InternalShortDSLParser.g:2605:1: ( ( rule__CameraColorS__ColorAssignment_1 ) )
            // InternalShortDSLParser.g:2606:2: ( rule__CameraColorS__ColorAssignment_1 )
            {
             before(grammarAccess.getCameraColorSAccess().getColorAssignment_1()); 
            // InternalShortDSLParser.g:2607:2: ( rule__CameraColorS__ColorAssignment_1 )
            // InternalShortDSLParser.g:2607:3: rule__CameraColorS__ColorAssignment_1
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
    // InternalShortDSLParser.g:2615:1: rule__CameraColorS__Group__2 : rule__CameraColorS__Group__2__Impl ;
    public final void rule__CameraColorS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2619:1: ( rule__CameraColorS__Group__2__Impl )
            // InternalShortDSLParser.g:2620:2: rule__CameraColorS__Group__2__Impl
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
    // InternalShortDSLParser.g:2626:1: rule__CameraColorS__Group__2__Impl : ( ( Comma )? ) ;
    public final void rule__CameraColorS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2630:1: ( ( ( Comma )? ) )
            // InternalShortDSLParser.g:2631:1: ( ( Comma )? )
            {
            // InternalShortDSLParser.g:2631:1: ( ( Comma )? )
            // InternalShortDSLParser.g:2632:2: ( Comma )?
            {
             before(grammarAccess.getCameraColorSAccess().getCommaKeyword_2()); 
            // InternalShortDSLParser.g:2633:2: ( Comma )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Comma) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalShortDSLParser.g:2633:3: Comma
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
    // InternalShortDSLParser.g:2642:1: rule__DiskHandlingS__Group__0 : rule__DiskHandlingS__Group__0__Impl rule__DiskHandlingS__Group__1 ;
    public final void rule__DiskHandlingS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2646:1: ( rule__DiskHandlingS__Group__0__Impl rule__DiskHandlingS__Group__1 )
            // InternalShortDSLParser.g:2647:2: rule__DiskHandlingS__Group__0__Impl rule__DiskHandlingS__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalShortDSLParser.g:2654:1: rule__DiskHandlingS__Group__0__Impl : ( ( rule__DiskHandlingS__DiskAssignment_0 ) ) ;
    public final void rule__DiskHandlingS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2658:1: ( ( ( rule__DiskHandlingS__DiskAssignment_0 ) ) )
            // InternalShortDSLParser.g:2659:1: ( ( rule__DiskHandlingS__DiskAssignment_0 ) )
            {
            // InternalShortDSLParser.g:2659:1: ( ( rule__DiskHandlingS__DiskAssignment_0 ) )
            // InternalShortDSLParser.g:2660:2: ( rule__DiskHandlingS__DiskAssignment_0 )
            {
             before(grammarAccess.getDiskHandlingSAccess().getDiskAssignment_0()); 
            // InternalShortDSLParser.g:2661:2: ( rule__DiskHandlingS__DiskAssignment_0 )
            // InternalShortDSLParser.g:2661:3: rule__DiskHandlingS__DiskAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DiskHandlingS__DiskAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDiskHandlingSAccess().getDiskAssignment_0()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:2669:1: rule__DiskHandlingS__Group__1 : rule__DiskHandlingS__Group__1__Impl rule__DiskHandlingS__Group__2 ;
    public final void rule__DiskHandlingS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2673:1: ( rule__DiskHandlingS__Group__1__Impl rule__DiskHandlingS__Group__2 )
            // InternalShortDSLParser.g:2674:2: rule__DiskHandlingS__Group__1__Impl rule__DiskHandlingS__Group__2
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
    // InternalShortDSLParser.g:2681:1: rule__DiskHandlingS__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__DiskHandlingS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2685:1: ( ( LeftCurlyBracket ) )
            // InternalShortDSLParser.g:2686:1: ( LeftCurlyBracket )
            {
            // InternalShortDSLParser.g:2686:1: ( LeftCurlyBracket )
            // InternalShortDSLParser.g:2687:2: LeftCurlyBracket
            {
             before(grammarAccess.getDiskHandlingSAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getDiskHandlingSAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:2696:1: rule__DiskHandlingS__Group__2 : rule__DiskHandlingS__Group__2__Impl rule__DiskHandlingS__Group__3 ;
    public final void rule__DiskHandlingS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2700:1: ( rule__DiskHandlingS__Group__2__Impl rule__DiskHandlingS__Group__3 )
            // InternalShortDSLParser.g:2701:2: rule__DiskHandlingS__Group__2__Impl rule__DiskHandlingS__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalShortDSLParser.g:2708:1: rule__DiskHandlingS__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__DiskHandlingS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2712:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:2713:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:2713:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:2714:2: RULE_BEGIN
            {
             before(grammarAccess.getDiskHandlingSAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getDiskHandlingSAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:2723:1: rule__DiskHandlingS__Group__3 : rule__DiskHandlingS__Group__3__Impl rule__DiskHandlingS__Group__4 ;
    public final void rule__DiskHandlingS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2727:1: ( rule__DiskHandlingS__Group__3__Impl rule__DiskHandlingS__Group__4 )
            // InternalShortDSLParser.g:2728:2: rule__DiskHandlingS__Group__3__Impl rule__DiskHandlingS__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalShortDSLParser.g:2735:1: rule__DiskHandlingS__Group__3__Impl : ( ( ( rule__DiskHandlingS__StatementsAssignment_3 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_3 )* ) ) ;
    public final void rule__DiskHandlingS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2739:1: ( ( ( ( rule__DiskHandlingS__StatementsAssignment_3 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_3 )* ) ) )
            // InternalShortDSLParser.g:2740:1: ( ( ( rule__DiskHandlingS__StatementsAssignment_3 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_3 )* ) )
            {
            // InternalShortDSLParser.g:2740:1: ( ( ( rule__DiskHandlingS__StatementsAssignment_3 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_3 )* ) )
            // InternalShortDSLParser.g:2741:2: ( ( rule__DiskHandlingS__StatementsAssignment_3 ) ) ( ( rule__DiskHandlingS__StatementsAssignment_3 )* )
            {
            // InternalShortDSLParser.g:2741:2: ( ( rule__DiskHandlingS__StatementsAssignment_3 ) )
            // InternalShortDSLParser.g:2742:3: ( rule__DiskHandlingS__StatementsAssignment_3 )
            {
             before(grammarAccess.getDiskHandlingSAccess().getStatementsAssignment_3()); 
            // InternalShortDSLParser.g:2743:3: ( rule__DiskHandlingS__StatementsAssignment_3 )
            // InternalShortDSLParser.g:2743:4: rule__DiskHandlingS__StatementsAssignment_3
            {
            pushFollow(FOLLOW_21);
            rule__DiskHandlingS__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDiskHandlingSAccess().getStatementsAssignment_3()); 

            }

            // InternalShortDSLParser.g:2746:2: ( ( rule__DiskHandlingS__StatementsAssignment_3 )* )
            // InternalShortDSLParser.g:2747:3: ( rule__DiskHandlingS__StatementsAssignment_3 )*
            {
             before(grammarAccess.getDiskHandlingSAccess().getStatementsAssignment_3()); 
            // InternalShortDSLParser.g:2748:3: ( rule__DiskHandlingS__StatementsAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=Foreach && LA23_0<=Pickup)||LA23_0==Drop||LA23_0==If||LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalShortDSLParser.g:2748:4: rule__DiskHandlingS__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__DiskHandlingS__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getDiskHandlingSAccess().getStatementsAssignment_3()); 

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
    // $ANTLR end "rule__DiskHandlingS__Group__3__Impl"


    // $ANTLR start "rule__DiskHandlingS__Group__4"
    // InternalShortDSLParser.g:2757:1: rule__DiskHandlingS__Group__4 : rule__DiskHandlingS__Group__4__Impl rule__DiskHandlingS__Group__5 ;
    public final void rule__DiskHandlingS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2761:1: ( rule__DiskHandlingS__Group__4__Impl rule__DiskHandlingS__Group__5 )
            // InternalShortDSLParser.g:2762:2: rule__DiskHandlingS__Group__4__Impl rule__DiskHandlingS__Group__5
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
    // InternalShortDSLParser.g:2769:1: rule__DiskHandlingS__Group__4__Impl : ( RULE_END ) ;
    public final void rule__DiskHandlingS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2773:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:2774:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:2774:1: ( RULE_END )
            // InternalShortDSLParser.g:2775:2: RULE_END
            {
             before(grammarAccess.getDiskHandlingSAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getDiskHandlingSAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:2784:1: rule__DiskHandlingS__Group__5 : rule__DiskHandlingS__Group__5__Impl ;
    public final void rule__DiskHandlingS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2788:1: ( rule__DiskHandlingS__Group__5__Impl )
            // InternalShortDSLParser.g:2789:2: rule__DiskHandlingS__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiskHandlingS__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalShortDSLParser.g:2795:1: rule__DiskHandlingS__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__DiskHandlingS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2799:1: ( ( RightCurlyBracket ) )
            // InternalShortDSLParser.g:2800:1: ( RightCurlyBracket )
            {
            // InternalShortDSLParser.g:2800:1: ( RightCurlyBracket )
            // InternalShortDSLParser.g:2801:2: RightCurlyBracket
            {
             before(grammarAccess.getDiskHandlingSAccess().getRightCurlyBracketKeyword_5()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getDiskHandlingSAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__LoopS__Group__0"
    // InternalShortDSLParser.g:2811:1: rule__LoopS__Group__0 : rule__LoopS__Group__0__Impl rule__LoopS__Group__1 ;
    public final void rule__LoopS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2815:1: ( rule__LoopS__Group__0__Impl rule__LoopS__Group__1 )
            // InternalShortDSLParser.g:2816:2: rule__LoopS__Group__0__Impl rule__LoopS__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalShortDSLParser.g:2823:1: rule__LoopS__Group__0__Impl : ( () ) ;
    public final void rule__LoopS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2827:1: ( ( () ) )
            // InternalShortDSLParser.g:2828:1: ( () )
            {
            // InternalShortDSLParser.g:2828:1: ( () )
            // InternalShortDSLParser.g:2829:2: ()
            {
             before(grammarAccess.getLoopSAccess().getLoopAction_0()); 
            // InternalShortDSLParser.g:2830:2: ()
            // InternalShortDSLParser.g:2830:3: 
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
    // InternalShortDSLParser.g:2838:1: rule__LoopS__Group__1 : rule__LoopS__Group__1__Impl rule__LoopS__Group__2 ;
    public final void rule__LoopS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2842:1: ( rule__LoopS__Group__1__Impl rule__LoopS__Group__2 )
            // InternalShortDSLParser.g:2843:2: rule__LoopS__Group__1__Impl rule__LoopS__Group__2
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
    // InternalShortDSLParser.g:2850:1: rule__LoopS__Group__1__Impl : ( Foreach ) ;
    public final void rule__LoopS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2854:1: ( ( Foreach ) )
            // InternalShortDSLParser.g:2855:1: ( Foreach )
            {
            // InternalShortDSLParser.g:2855:1: ( Foreach )
            // InternalShortDSLParser.g:2856:2: Foreach
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
    // InternalShortDSLParser.g:2865:1: rule__LoopS__Group__2 : rule__LoopS__Group__2__Impl rule__LoopS__Group__3 ;
    public final void rule__LoopS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2869:1: ( rule__LoopS__Group__2__Impl rule__LoopS__Group__3 )
            // InternalShortDSLParser.g:2870:2: rule__LoopS__Group__2__Impl rule__LoopS__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalShortDSLParser.g:2877:1: rule__LoopS__Group__2__Impl : ( ( rule__LoopS__VariableAssignment_2 ) ) ;
    public final void rule__LoopS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2881:1: ( ( ( rule__LoopS__VariableAssignment_2 ) ) )
            // InternalShortDSLParser.g:2882:1: ( ( rule__LoopS__VariableAssignment_2 ) )
            {
            // InternalShortDSLParser.g:2882:1: ( ( rule__LoopS__VariableAssignment_2 ) )
            // InternalShortDSLParser.g:2883:2: ( rule__LoopS__VariableAssignment_2 )
            {
             before(grammarAccess.getLoopSAccess().getVariableAssignment_2()); 
            // InternalShortDSLParser.g:2884:2: ( rule__LoopS__VariableAssignment_2 )
            // InternalShortDSLParser.g:2884:3: rule__LoopS__VariableAssignment_2
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
    // InternalShortDSLParser.g:2892:1: rule__LoopS__Group__3 : rule__LoopS__Group__3__Impl rule__LoopS__Group__4 ;
    public final void rule__LoopS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2896:1: ( rule__LoopS__Group__3__Impl rule__LoopS__Group__4 )
            // InternalShortDSLParser.g:2897:2: rule__LoopS__Group__3__Impl rule__LoopS__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalShortDSLParser.g:2904:1: rule__LoopS__Group__3__Impl : ( ( rule__LoopS__ComparisonOperatorAssignment_3 ) ) ;
    public final void rule__LoopS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2908:1: ( ( ( rule__LoopS__ComparisonOperatorAssignment_3 ) ) )
            // InternalShortDSLParser.g:2909:1: ( ( rule__LoopS__ComparisonOperatorAssignment_3 ) )
            {
            // InternalShortDSLParser.g:2909:1: ( ( rule__LoopS__ComparisonOperatorAssignment_3 ) )
            // InternalShortDSLParser.g:2910:2: ( rule__LoopS__ComparisonOperatorAssignment_3 )
            {
             before(grammarAccess.getLoopSAccess().getComparisonOperatorAssignment_3()); 
            // InternalShortDSLParser.g:2911:2: ( rule__LoopS__ComparisonOperatorAssignment_3 )
            // InternalShortDSLParser.g:2911:3: rule__LoopS__ComparisonOperatorAssignment_3
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
    // InternalShortDSLParser.g:2919:1: rule__LoopS__Group__4 : rule__LoopS__Group__4__Impl rule__LoopS__Group__5 ;
    public final void rule__LoopS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2923:1: ( rule__LoopS__Group__4__Impl rule__LoopS__Group__5 )
            // InternalShortDSLParser.g:2924:2: rule__LoopS__Group__4__Impl rule__LoopS__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalShortDSLParser.g:2931:1: rule__LoopS__Group__4__Impl : ( ( rule__LoopS__SlotStateAssignment_4 ) ) ;
    public final void rule__LoopS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2935:1: ( ( ( rule__LoopS__SlotStateAssignment_4 ) ) )
            // InternalShortDSLParser.g:2936:1: ( ( rule__LoopS__SlotStateAssignment_4 ) )
            {
            // InternalShortDSLParser.g:2936:1: ( ( rule__LoopS__SlotStateAssignment_4 ) )
            // InternalShortDSLParser.g:2937:2: ( rule__LoopS__SlotStateAssignment_4 )
            {
             before(grammarAccess.getLoopSAccess().getSlotStateAssignment_4()); 
            // InternalShortDSLParser.g:2938:2: ( rule__LoopS__SlotStateAssignment_4 )
            // InternalShortDSLParser.g:2938:3: rule__LoopS__SlotStateAssignment_4
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
    // InternalShortDSLParser.g:2946:1: rule__LoopS__Group__5 : rule__LoopS__Group__5__Impl rule__LoopS__Group__6 ;
    public final void rule__LoopS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2950:1: ( rule__LoopS__Group__5__Impl rule__LoopS__Group__6 )
            // InternalShortDSLParser.g:2951:2: rule__LoopS__Group__5__Impl rule__LoopS__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalShortDSLParser.g:2958:1: rule__LoopS__Group__5__Impl : ( Colon ) ;
    public final void rule__LoopS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2962:1: ( ( Colon ) )
            // InternalShortDSLParser.g:2963:1: ( Colon )
            {
            // InternalShortDSLParser.g:2963:1: ( Colon )
            // InternalShortDSLParser.g:2964:2: Colon
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
    // InternalShortDSLParser.g:2973:1: rule__LoopS__Group__6 : rule__LoopS__Group__6__Impl rule__LoopS__Group__7 ;
    public final void rule__LoopS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2977:1: ( rule__LoopS__Group__6__Impl rule__LoopS__Group__7 )
            // InternalShortDSLParser.g:2978:2: rule__LoopS__Group__6__Impl rule__LoopS__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalShortDSLParser.g:2985:1: rule__LoopS__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__LoopS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:2989:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:2990:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:2990:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:2991:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:3000:1: rule__LoopS__Group__7 : rule__LoopS__Group__7__Impl rule__LoopS__Group__8 ;
    public final void rule__LoopS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3004:1: ( rule__LoopS__Group__7__Impl rule__LoopS__Group__8 )
            // InternalShortDSLParser.g:3005:2: rule__LoopS__Group__7__Impl rule__LoopS__Group__8
            {
            pushFollow(FOLLOW_25);
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
    // InternalShortDSLParser.g:3012:1: rule__LoopS__Group__7__Impl : ( ( rule__LoopS__StatementsAssignment_7 )* ) ;
    public final void rule__LoopS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3016:1: ( ( ( rule__LoopS__StatementsAssignment_7 )* ) )
            // InternalShortDSLParser.g:3017:1: ( ( rule__LoopS__StatementsAssignment_7 )* )
            {
            // InternalShortDSLParser.g:3017:1: ( ( rule__LoopS__StatementsAssignment_7 )* )
            // InternalShortDSLParser.g:3018:2: ( rule__LoopS__StatementsAssignment_7 )*
            {
             before(grammarAccess.getLoopSAccess().getStatementsAssignment_7()); 
            // InternalShortDSLParser.g:3019:2: ( rule__LoopS__StatementsAssignment_7 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=Foreach && LA24_0<=Pickup)||LA24_0==Drop||LA24_0==If||LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalShortDSLParser.g:3019:3: rule__LoopS__StatementsAssignment_7
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__LoopS__StatementsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalShortDSLParser.g:3027:1: rule__LoopS__Group__8 : rule__LoopS__Group__8__Impl ;
    public final void rule__LoopS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3031:1: ( rule__LoopS__Group__8__Impl )
            // InternalShortDSLParser.g:3032:2: rule__LoopS__Group__8__Impl
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
    // InternalShortDSLParser.g:3038:1: rule__LoopS__Group__8__Impl : ( RULE_END ) ;
    public final void rule__LoopS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3042:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:3043:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:3043:1: ( RULE_END )
            // InternalShortDSLParser.g:3044:2: RULE_END
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
    // InternalShortDSLParser.g:3054:1: rule__MoveDiskS__Group__0 : rule__MoveDiskS__Group__0__Impl rule__MoveDiskS__Group__1 ;
    public final void rule__MoveDiskS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3058:1: ( rule__MoveDiskS__Group__0__Impl rule__MoveDiskS__Group__1 )
            // InternalShortDSLParser.g:3059:2: rule__MoveDiskS__Group__0__Impl rule__MoveDiskS__Group__1
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
    // InternalShortDSLParser.g:3066:1: rule__MoveDiskS__Group__0__Impl : ( () ) ;
    public final void rule__MoveDiskS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3070:1: ( ( () ) )
            // InternalShortDSLParser.g:3071:1: ( () )
            {
            // InternalShortDSLParser.g:3071:1: ( () )
            // InternalShortDSLParser.g:3072:2: ()
            {
             before(grammarAccess.getMoveDiskSAccess().getMoveDiskAction_0()); 
            // InternalShortDSLParser.g:3073:2: ()
            // InternalShortDSLParser.g:3073:3: 
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
    // InternalShortDSLParser.g:3081:1: rule__MoveDiskS__Group__1 : rule__MoveDiskS__Group__1__Impl rule__MoveDiskS__Group__2 ;
    public final void rule__MoveDiskS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3085:1: ( rule__MoveDiskS__Group__1__Impl rule__MoveDiskS__Group__2 )
            // InternalShortDSLParser.g:3086:2: rule__MoveDiskS__Group__1__Impl rule__MoveDiskS__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalShortDSLParser.g:3093:1: rule__MoveDiskS__Group__1__Impl : ( ( rule__MoveDiskS__SlotAssignment_1 ) ) ;
    public final void rule__MoveDiskS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3097:1: ( ( ( rule__MoveDiskS__SlotAssignment_1 ) ) )
            // InternalShortDSLParser.g:3098:1: ( ( rule__MoveDiskS__SlotAssignment_1 ) )
            {
            // InternalShortDSLParser.g:3098:1: ( ( rule__MoveDiskS__SlotAssignment_1 ) )
            // InternalShortDSLParser.g:3099:2: ( rule__MoveDiskS__SlotAssignment_1 )
            {
             before(grammarAccess.getMoveDiskSAccess().getSlotAssignment_1()); 
            // InternalShortDSLParser.g:3100:2: ( rule__MoveDiskS__SlotAssignment_1 )
            // InternalShortDSLParser.g:3100:3: rule__MoveDiskS__SlotAssignment_1
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
    // InternalShortDSLParser.g:3108:1: rule__MoveDiskS__Group__2 : rule__MoveDiskS__Group__2__Impl rule__MoveDiskS__Group__3 ;
    public final void rule__MoveDiskS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3112:1: ( rule__MoveDiskS__Group__2__Impl rule__MoveDiskS__Group__3 )
            // InternalShortDSLParser.g:3113:2: rule__MoveDiskS__Group__2__Impl rule__MoveDiskS__Group__3
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
    // InternalShortDSLParser.g:3120:1: rule__MoveDiskS__Group__2__Impl : ( ( rule__MoveDiskS__Alternatives_2 ) ) ;
    public final void rule__MoveDiskS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3124:1: ( ( ( rule__MoveDiskS__Alternatives_2 ) ) )
            // InternalShortDSLParser.g:3125:1: ( ( rule__MoveDiskS__Alternatives_2 ) )
            {
            // InternalShortDSLParser.g:3125:1: ( ( rule__MoveDiskS__Alternatives_2 ) )
            // InternalShortDSLParser.g:3126:2: ( rule__MoveDiskS__Alternatives_2 )
            {
             before(grammarAccess.getMoveDiskSAccess().getAlternatives_2()); 
            // InternalShortDSLParser.g:3127:2: ( rule__MoveDiskS__Alternatives_2 )
            // InternalShortDSLParser.g:3127:3: rule__MoveDiskS__Alternatives_2
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
    // InternalShortDSLParser.g:3135:1: rule__MoveDiskS__Group__3 : rule__MoveDiskS__Group__3__Impl ;
    public final void rule__MoveDiskS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3139:1: ( rule__MoveDiskS__Group__3__Impl )
            // InternalShortDSLParser.g:3140:2: rule__MoveDiskS__Group__3__Impl
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
    // InternalShortDSLParser.g:3146:1: rule__MoveDiskS__Group__3__Impl : ( ( rule__MoveDiskS__ZoneAssignment_3 ) ) ;
    public final void rule__MoveDiskS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3150:1: ( ( ( rule__MoveDiskS__ZoneAssignment_3 ) ) )
            // InternalShortDSLParser.g:3151:1: ( ( rule__MoveDiskS__ZoneAssignment_3 ) )
            {
            // InternalShortDSLParser.g:3151:1: ( ( rule__MoveDiskS__ZoneAssignment_3 ) )
            // InternalShortDSLParser.g:3152:2: ( rule__MoveDiskS__ZoneAssignment_3 )
            {
             before(grammarAccess.getMoveDiskSAccess().getZoneAssignment_3()); 
            // InternalShortDSLParser.g:3153:2: ( rule__MoveDiskS__ZoneAssignment_3 )
            // InternalShortDSLParser.g:3153:3: rule__MoveDiskS__ZoneAssignment_3
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


    // $ANTLR start "rule__MoveCraneS__Group__0"
    // InternalShortDSLParser.g:3162:1: rule__MoveCraneS__Group__0 : rule__MoveCraneS__Group__0__Impl rule__MoveCraneS__Group__1 ;
    public final void rule__MoveCraneS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3166:1: ( rule__MoveCraneS__Group__0__Impl rule__MoveCraneS__Group__1 )
            // InternalShortDSLParser.g:3167:2: rule__MoveCraneS__Group__0__Impl rule__MoveCraneS__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalShortDSLParser.g:3174:1: rule__MoveCraneS__Group__0__Impl : ( () ) ;
    public final void rule__MoveCraneS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3178:1: ( ( () ) )
            // InternalShortDSLParser.g:3179:1: ( () )
            {
            // InternalShortDSLParser.g:3179:1: ( () )
            // InternalShortDSLParser.g:3180:2: ()
            {
             before(grammarAccess.getMoveCraneSAccess().getMoveCraneAction_0()); 
            // InternalShortDSLParser.g:3181:2: ()
            // InternalShortDSLParser.g:3181:3: 
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
    // InternalShortDSLParser.g:3189:1: rule__MoveCraneS__Group__1 : rule__MoveCraneS__Group__1__Impl rule__MoveCraneS__Group__2 ;
    public final void rule__MoveCraneS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3193:1: ( rule__MoveCraneS__Group__1__Impl rule__MoveCraneS__Group__2 )
            // InternalShortDSLParser.g:3194:2: rule__MoveCraneS__Group__1__Impl rule__MoveCraneS__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalShortDSLParser.g:3201:1: rule__MoveCraneS__Group__1__Impl : ( ( rule__MoveCraneS__CraneAssignment_1 ) ) ;
    public final void rule__MoveCraneS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3205:1: ( ( ( rule__MoveCraneS__CraneAssignment_1 ) ) )
            // InternalShortDSLParser.g:3206:1: ( ( rule__MoveCraneS__CraneAssignment_1 ) )
            {
            // InternalShortDSLParser.g:3206:1: ( ( rule__MoveCraneS__CraneAssignment_1 ) )
            // InternalShortDSLParser.g:3207:2: ( rule__MoveCraneS__CraneAssignment_1 )
            {
             before(grammarAccess.getMoveCraneSAccess().getCraneAssignment_1()); 
            // InternalShortDSLParser.g:3208:2: ( rule__MoveCraneS__CraneAssignment_1 )
            // InternalShortDSLParser.g:3208:3: rule__MoveCraneS__CraneAssignment_1
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
    // InternalShortDSLParser.g:3216:1: rule__MoveCraneS__Group__2 : rule__MoveCraneS__Group__2__Impl rule__MoveCraneS__Group__3 ;
    public final void rule__MoveCraneS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3220:1: ( rule__MoveCraneS__Group__2__Impl rule__MoveCraneS__Group__3 )
            // InternalShortDSLParser.g:3221:2: rule__MoveCraneS__Group__2__Impl rule__MoveCraneS__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalShortDSLParser.g:3228:1: rule__MoveCraneS__Group__2__Impl : ( ( rule__MoveCraneS__ActionAssignment_2 ) ) ;
    public final void rule__MoveCraneS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3232:1: ( ( ( rule__MoveCraneS__ActionAssignment_2 ) ) )
            // InternalShortDSLParser.g:3233:1: ( ( rule__MoveCraneS__ActionAssignment_2 ) )
            {
            // InternalShortDSLParser.g:3233:1: ( ( rule__MoveCraneS__ActionAssignment_2 ) )
            // InternalShortDSLParser.g:3234:2: ( rule__MoveCraneS__ActionAssignment_2 )
            {
             before(grammarAccess.getMoveCraneSAccess().getActionAssignment_2()); 
            // InternalShortDSLParser.g:3235:2: ( rule__MoveCraneS__ActionAssignment_2 )
            // InternalShortDSLParser.g:3235:3: rule__MoveCraneS__ActionAssignment_2
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
    // InternalShortDSLParser.g:3243:1: rule__MoveCraneS__Group__3 : rule__MoveCraneS__Group__3__Impl rule__MoveCraneS__Group__4 ;
    public final void rule__MoveCraneS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3247:1: ( rule__MoveCraneS__Group__3__Impl rule__MoveCraneS__Group__4 )
            // InternalShortDSLParser.g:3248:2: rule__MoveCraneS__Group__3__Impl rule__MoveCraneS__Group__4
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
    // InternalShortDSLParser.g:3255:1: rule__MoveCraneS__Group__3__Impl : ( ( rule__MoveCraneS__Alternatives_3 ) ) ;
    public final void rule__MoveCraneS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3259:1: ( ( ( rule__MoveCraneS__Alternatives_3 ) ) )
            // InternalShortDSLParser.g:3260:1: ( ( rule__MoveCraneS__Alternatives_3 ) )
            {
            // InternalShortDSLParser.g:3260:1: ( ( rule__MoveCraneS__Alternatives_3 ) )
            // InternalShortDSLParser.g:3261:2: ( rule__MoveCraneS__Alternatives_3 )
            {
             before(grammarAccess.getMoveCraneSAccess().getAlternatives_3()); 
            // InternalShortDSLParser.g:3262:2: ( rule__MoveCraneS__Alternatives_3 )
            // InternalShortDSLParser.g:3262:3: rule__MoveCraneS__Alternatives_3
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
    // InternalShortDSLParser.g:3270:1: rule__MoveCraneS__Group__4 : rule__MoveCraneS__Group__4__Impl ;
    public final void rule__MoveCraneS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3274:1: ( rule__MoveCraneS__Group__4__Impl )
            // InternalShortDSLParser.g:3275:2: rule__MoveCraneS__Group__4__Impl
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
    // InternalShortDSLParser.g:3281:1: rule__MoveCraneS__Group__4__Impl : ( ( rule__MoveCraneS__ZoneAssignment_4 ) ) ;
    public final void rule__MoveCraneS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3285:1: ( ( ( rule__MoveCraneS__ZoneAssignment_4 ) ) )
            // InternalShortDSLParser.g:3286:1: ( ( rule__MoveCraneS__ZoneAssignment_4 ) )
            {
            // InternalShortDSLParser.g:3286:1: ( ( rule__MoveCraneS__ZoneAssignment_4 ) )
            // InternalShortDSLParser.g:3287:2: ( rule__MoveCraneS__ZoneAssignment_4 )
            {
             before(grammarAccess.getMoveCraneSAccess().getZoneAssignment_4()); 
            // InternalShortDSLParser.g:3288:2: ( rule__MoveCraneS__ZoneAssignment_4 )
            // InternalShortDSLParser.g:3288:3: rule__MoveCraneS__ZoneAssignment_4
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


    // $ANTLR start "rule__ActionS__Group__0"
    // InternalShortDSLParser.g:3297:1: rule__ActionS__Group__0 : rule__ActionS__Group__0__Impl rule__ActionS__Group__1 ;
    public final void rule__ActionS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3301:1: ( rule__ActionS__Group__0__Impl rule__ActionS__Group__1 )
            // InternalShortDSLParser.g:3302:2: rule__ActionS__Group__0__Impl rule__ActionS__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ActionS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionS__Group__0"


    // $ANTLR start "rule__ActionS__Group__0__Impl"
    // InternalShortDSLParser.g:3309:1: rule__ActionS__Group__0__Impl : ( () ) ;
    public final void rule__ActionS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3313:1: ( ( () ) )
            // InternalShortDSLParser.g:3314:1: ( () )
            {
            // InternalShortDSLParser.g:3314:1: ( () )
            // InternalShortDSLParser.g:3315:2: ()
            {
             before(grammarAccess.getActionSAccess().getActionAction_0()); 
            // InternalShortDSLParser.g:3316:2: ()
            // InternalShortDSLParser.g:3316:3: 
            {
            }

             after(grammarAccess.getActionSAccess().getActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionS__Group__0__Impl"


    // $ANTLR start "rule__ActionS__Group__1"
    // InternalShortDSLParser.g:3324:1: rule__ActionS__Group__1 : rule__ActionS__Group__1__Impl ;
    public final void rule__ActionS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3328:1: ( rule__ActionS__Group__1__Impl )
            // InternalShortDSLParser.g:3329:2: rule__ActionS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionS__Group__1"


    // $ANTLR start "rule__ActionS__Group__1__Impl"
    // InternalShortDSLParser.g:3335:1: rule__ActionS__Group__1__Impl : ( ( rule__ActionS__Alternatives_1 ) ) ;
    public final void rule__ActionS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3339:1: ( ( ( rule__ActionS__Alternatives_1 ) ) )
            // InternalShortDSLParser.g:3340:1: ( ( rule__ActionS__Alternatives_1 ) )
            {
            // InternalShortDSLParser.g:3340:1: ( ( rule__ActionS__Alternatives_1 ) )
            // InternalShortDSLParser.g:3341:2: ( rule__ActionS__Alternatives_1 )
            {
             before(grammarAccess.getActionSAccess().getAlternatives_1()); 
            // InternalShortDSLParser.g:3342:2: ( rule__ActionS__Alternatives_1 )
            // InternalShortDSLParser.g:3342:3: rule__ActionS__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionS__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getActionSAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionS__Group__1__Impl"


    // $ANTLR start "rule__ConditionVariableS__Group__0"
    // InternalShortDSLParser.g:3351:1: rule__ConditionVariableS__Group__0 : rule__ConditionVariableS__Group__0__Impl rule__ConditionVariableS__Group__1 ;
    public final void rule__ConditionVariableS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3355:1: ( rule__ConditionVariableS__Group__0__Impl rule__ConditionVariableS__Group__1 )
            // InternalShortDSLParser.g:3356:2: rule__ConditionVariableS__Group__0__Impl rule__ConditionVariableS__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalShortDSLParser.g:3363:1: rule__ConditionVariableS__Group__0__Impl : ( () ) ;
    public final void rule__ConditionVariableS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3367:1: ( ( () ) )
            // InternalShortDSLParser.g:3368:1: ( () )
            {
            // InternalShortDSLParser.g:3368:1: ( () )
            // InternalShortDSLParser.g:3369:2: ()
            {
             before(grammarAccess.getConditionVariableSAccess().getConditionVariableAction_0()); 
            // InternalShortDSLParser.g:3370:2: ()
            // InternalShortDSLParser.g:3370:3: 
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
    // InternalShortDSLParser.g:3378:1: rule__ConditionVariableS__Group__1 : rule__ConditionVariableS__Group__1__Impl rule__ConditionVariableS__Group__2 ;
    public final void rule__ConditionVariableS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3382:1: ( rule__ConditionVariableS__Group__1__Impl rule__ConditionVariableS__Group__2 )
            // InternalShortDSLParser.g:3383:2: rule__ConditionVariableS__Group__1__Impl rule__ConditionVariableS__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalShortDSLParser.g:3390:1: rule__ConditionVariableS__Group__1__Impl : ( If ) ;
    public final void rule__ConditionVariableS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3394:1: ( ( If ) )
            // InternalShortDSLParser.g:3395:1: ( If )
            {
            // InternalShortDSLParser.g:3395:1: ( If )
            // InternalShortDSLParser.g:3396:2: If
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
    // InternalShortDSLParser.g:3405:1: rule__ConditionVariableS__Group__2 : rule__ConditionVariableS__Group__2__Impl rule__ConditionVariableS__Group__3 ;
    public final void rule__ConditionVariableS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3409:1: ( rule__ConditionVariableS__Group__2__Impl rule__ConditionVariableS__Group__3 )
            // InternalShortDSLParser.g:3410:2: rule__ConditionVariableS__Group__2__Impl rule__ConditionVariableS__Group__3
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
    // InternalShortDSLParser.g:3417:1: rule__ConditionVariableS__Group__2__Impl : ( Test ) ;
    public final void rule__ConditionVariableS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3421:1: ( ( Test ) )
            // InternalShortDSLParser.g:3422:1: ( Test )
            {
            // InternalShortDSLParser.g:3422:1: ( Test )
            // InternalShortDSLParser.g:3423:2: Test
            {
             before(grammarAccess.getConditionVariableSAccess().getTestKeyword_2()); 
            match(input,Test,FOLLOW_2); 
             after(grammarAccess.getConditionVariableSAccess().getTestKeyword_2()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:3432:1: rule__ConditionVariableS__Group__3 : rule__ConditionVariableS__Group__3__Impl rule__ConditionVariableS__Group__4 ;
    public final void rule__ConditionVariableS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3436:1: ( rule__ConditionVariableS__Group__3__Impl rule__ConditionVariableS__Group__4 )
            // InternalShortDSLParser.g:3437:2: rule__ConditionVariableS__Group__3__Impl rule__ConditionVariableS__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalShortDSLParser.g:3444:1: rule__ConditionVariableS__Group__3__Impl : ( ( rule__ConditionVariableS__VariableAssignment_3 ) ) ;
    public final void rule__ConditionVariableS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3448:1: ( ( ( rule__ConditionVariableS__VariableAssignment_3 ) ) )
            // InternalShortDSLParser.g:3449:1: ( ( rule__ConditionVariableS__VariableAssignment_3 ) )
            {
            // InternalShortDSLParser.g:3449:1: ( ( rule__ConditionVariableS__VariableAssignment_3 ) )
            // InternalShortDSLParser.g:3450:2: ( rule__ConditionVariableS__VariableAssignment_3 )
            {
             before(grammarAccess.getConditionVariableSAccess().getVariableAssignment_3()); 
            // InternalShortDSLParser.g:3451:2: ( rule__ConditionVariableS__VariableAssignment_3 )
            // InternalShortDSLParser.g:3451:3: rule__ConditionVariableS__VariableAssignment_3
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
    // InternalShortDSLParser.g:3459:1: rule__ConditionVariableS__Group__4 : rule__ConditionVariableS__Group__4__Impl rule__ConditionVariableS__Group__5 ;
    public final void rule__ConditionVariableS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3463:1: ( rule__ConditionVariableS__Group__4__Impl rule__ConditionVariableS__Group__5 )
            // InternalShortDSLParser.g:3464:2: rule__ConditionVariableS__Group__4__Impl rule__ConditionVariableS__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalShortDSLParser.g:3471:1: rule__ConditionVariableS__Group__4__Impl : ( ( rule__ConditionVariableS__ComparisonOperatorAssignment_4 ) ) ;
    public final void rule__ConditionVariableS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3475:1: ( ( ( rule__ConditionVariableS__ComparisonOperatorAssignment_4 ) ) )
            // InternalShortDSLParser.g:3476:1: ( ( rule__ConditionVariableS__ComparisonOperatorAssignment_4 ) )
            {
            // InternalShortDSLParser.g:3476:1: ( ( rule__ConditionVariableS__ComparisonOperatorAssignment_4 ) )
            // InternalShortDSLParser.g:3477:2: ( rule__ConditionVariableS__ComparisonOperatorAssignment_4 )
            {
             before(grammarAccess.getConditionVariableSAccess().getComparisonOperatorAssignment_4()); 
            // InternalShortDSLParser.g:3478:2: ( rule__ConditionVariableS__ComparisonOperatorAssignment_4 )
            // InternalShortDSLParser.g:3478:3: rule__ConditionVariableS__ComparisonOperatorAssignment_4
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
    // InternalShortDSLParser.g:3486:1: rule__ConditionVariableS__Group__5 : rule__ConditionVariableS__Group__5__Impl rule__ConditionVariableS__Group__6 ;
    public final void rule__ConditionVariableS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3490:1: ( rule__ConditionVariableS__Group__5__Impl rule__ConditionVariableS__Group__6 )
            // InternalShortDSLParser.g:3491:2: rule__ConditionVariableS__Group__5__Impl rule__ConditionVariableS__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalShortDSLParser.g:3498:1: rule__ConditionVariableS__Group__5__Impl : ( ( rule__ConditionVariableS__ValueAssignment_5 ) ) ;
    public final void rule__ConditionVariableS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3502:1: ( ( ( rule__ConditionVariableS__ValueAssignment_5 ) ) )
            // InternalShortDSLParser.g:3503:1: ( ( rule__ConditionVariableS__ValueAssignment_5 ) )
            {
            // InternalShortDSLParser.g:3503:1: ( ( rule__ConditionVariableS__ValueAssignment_5 ) )
            // InternalShortDSLParser.g:3504:2: ( rule__ConditionVariableS__ValueAssignment_5 )
            {
             before(grammarAccess.getConditionVariableSAccess().getValueAssignment_5()); 
            // InternalShortDSLParser.g:3505:2: ( rule__ConditionVariableS__ValueAssignment_5 )
            // InternalShortDSLParser.g:3505:3: rule__ConditionVariableS__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ConditionVariableS__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConditionVariableSAccess().getValueAssignment_5()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:3513:1: rule__ConditionVariableS__Group__6 : rule__ConditionVariableS__Group__6__Impl rule__ConditionVariableS__Group__7 ;
    public final void rule__ConditionVariableS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3517:1: ( rule__ConditionVariableS__Group__6__Impl rule__ConditionVariableS__Group__7 )
            // InternalShortDSLParser.g:3518:2: rule__ConditionVariableS__Group__6__Impl rule__ConditionVariableS__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalShortDSLParser.g:3525:1: rule__ConditionVariableS__Group__6__Impl : ( Colon ) ;
    public final void rule__ConditionVariableS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3529:1: ( ( Colon ) )
            // InternalShortDSLParser.g:3530:1: ( Colon )
            {
            // InternalShortDSLParser.g:3530:1: ( Colon )
            // InternalShortDSLParser.g:3531:2: Colon
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
    // InternalShortDSLParser.g:3540:1: rule__ConditionVariableS__Group__7 : rule__ConditionVariableS__Group__7__Impl rule__ConditionVariableS__Group__8 ;
    public final void rule__ConditionVariableS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3544:1: ( rule__ConditionVariableS__Group__7__Impl rule__ConditionVariableS__Group__8 )
            // InternalShortDSLParser.g:3545:2: rule__ConditionVariableS__Group__7__Impl rule__ConditionVariableS__Group__8
            {
            pushFollow(FOLLOW_25);
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
    // InternalShortDSLParser.g:3552:1: rule__ConditionVariableS__Group__7__Impl : ( RULE_BEGIN ) ;
    public final void rule__ConditionVariableS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3556:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:3557:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:3557:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:3558:2: RULE_BEGIN
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
    // InternalShortDSLParser.g:3567:1: rule__ConditionVariableS__Group__8 : rule__ConditionVariableS__Group__8__Impl rule__ConditionVariableS__Group__9 ;
    public final void rule__ConditionVariableS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3571:1: ( rule__ConditionVariableS__Group__8__Impl rule__ConditionVariableS__Group__9 )
            // InternalShortDSLParser.g:3572:2: rule__ConditionVariableS__Group__8__Impl rule__ConditionVariableS__Group__9
            {
            pushFollow(FOLLOW_25);
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
    // InternalShortDSLParser.g:3579:1: rule__ConditionVariableS__Group__8__Impl : ( ( rule__ConditionVariableS__StatementsAssignment_8 )* ) ;
    public final void rule__ConditionVariableS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3583:1: ( ( ( rule__ConditionVariableS__StatementsAssignment_8 )* ) )
            // InternalShortDSLParser.g:3584:1: ( ( rule__ConditionVariableS__StatementsAssignment_8 )* )
            {
            // InternalShortDSLParser.g:3584:1: ( ( rule__ConditionVariableS__StatementsAssignment_8 )* )
            // InternalShortDSLParser.g:3585:2: ( rule__ConditionVariableS__StatementsAssignment_8 )*
            {
             before(grammarAccess.getConditionVariableSAccess().getStatementsAssignment_8()); 
            // InternalShortDSLParser.g:3586:2: ( rule__ConditionVariableS__StatementsAssignment_8 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=Foreach && LA25_0<=Pickup)||LA25_0==Drop||LA25_0==If||LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalShortDSLParser.g:3586:3: rule__ConditionVariableS__StatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ConditionVariableS__StatementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalShortDSLParser.g:3594:1: rule__ConditionVariableS__Group__9 : rule__ConditionVariableS__Group__9__Impl ;
    public final void rule__ConditionVariableS__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3598:1: ( rule__ConditionVariableS__Group__9__Impl )
            // InternalShortDSLParser.g:3599:2: rule__ConditionVariableS__Group__9__Impl
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
    // InternalShortDSLParser.g:3605:1: rule__ConditionVariableS__Group__9__Impl : ( RULE_END ) ;
    public final void rule__ConditionVariableS__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3609:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:3610:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:3610:1: ( RULE_END )
            // InternalShortDSLParser.g:3611:2: RULE_END
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
    // InternalShortDSLParser.g:3621:1: rule__ConditionDeviceS__Group__0 : rule__ConditionDeviceS__Group__0__Impl rule__ConditionDeviceS__Group__1 ;
    public final void rule__ConditionDeviceS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3625:1: ( rule__ConditionDeviceS__Group__0__Impl rule__ConditionDeviceS__Group__1 )
            // InternalShortDSLParser.g:3626:2: rule__ConditionDeviceS__Group__0__Impl rule__ConditionDeviceS__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalShortDSLParser.g:3633:1: rule__ConditionDeviceS__Group__0__Impl : ( () ) ;
    public final void rule__ConditionDeviceS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3637:1: ( ( () ) )
            // InternalShortDSLParser.g:3638:1: ( () )
            {
            // InternalShortDSLParser.g:3638:1: ( () )
            // InternalShortDSLParser.g:3639:2: ()
            {
             before(grammarAccess.getConditionDeviceSAccess().getConditionDeviceAction_0()); 
            // InternalShortDSLParser.g:3640:2: ()
            // InternalShortDSLParser.g:3640:3: 
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
    // InternalShortDSLParser.g:3648:1: rule__ConditionDeviceS__Group__1 : rule__ConditionDeviceS__Group__1__Impl rule__ConditionDeviceS__Group__2 ;
    public final void rule__ConditionDeviceS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3652:1: ( rule__ConditionDeviceS__Group__1__Impl rule__ConditionDeviceS__Group__2 )
            // InternalShortDSLParser.g:3653:2: rule__ConditionDeviceS__Group__1__Impl rule__ConditionDeviceS__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalShortDSLParser.g:3660:1: rule__ConditionDeviceS__Group__1__Impl : ( If ) ;
    public final void rule__ConditionDeviceS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3664:1: ( ( If ) )
            // InternalShortDSLParser.g:3665:1: ( If )
            {
            // InternalShortDSLParser.g:3665:1: ( If )
            // InternalShortDSLParser.g:3666:2: If
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
    // InternalShortDSLParser.g:3675:1: rule__ConditionDeviceS__Group__2 : rule__ConditionDeviceS__Group__2__Impl rule__ConditionDeviceS__Group__3 ;
    public final void rule__ConditionDeviceS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3679:1: ( rule__ConditionDeviceS__Group__2__Impl rule__ConditionDeviceS__Group__3 )
            // InternalShortDSLParser.g:3680:2: rule__ConditionDeviceS__Group__2__Impl rule__ConditionDeviceS__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalShortDSLParser.g:3687:1: rule__ConditionDeviceS__Group__2__Impl : ( ( rule__ConditionDeviceS__DeviceAssignment_2 ) ) ;
    public final void rule__ConditionDeviceS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3691:1: ( ( ( rule__ConditionDeviceS__DeviceAssignment_2 ) ) )
            // InternalShortDSLParser.g:3692:1: ( ( rule__ConditionDeviceS__DeviceAssignment_2 ) )
            {
            // InternalShortDSLParser.g:3692:1: ( ( rule__ConditionDeviceS__DeviceAssignment_2 ) )
            // InternalShortDSLParser.g:3693:2: ( rule__ConditionDeviceS__DeviceAssignment_2 )
            {
             before(grammarAccess.getConditionDeviceSAccess().getDeviceAssignment_2()); 
            // InternalShortDSLParser.g:3694:2: ( rule__ConditionDeviceS__DeviceAssignment_2 )
            // InternalShortDSLParser.g:3694:3: rule__ConditionDeviceS__DeviceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__DeviceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionDeviceSAccess().getDeviceAssignment_2()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:3702:1: rule__ConditionDeviceS__Group__3 : rule__ConditionDeviceS__Group__3__Impl rule__ConditionDeviceS__Group__4 ;
    public final void rule__ConditionDeviceS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3706:1: ( rule__ConditionDeviceS__Group__3__Impl rule__ConditionDeviceS__Group__4 )
            // InternalShortDSLParser.g:3707:2: rule__ConditionDeviceS__Group__3__Impl rule__ConditionDeviceS__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalShortDSLParser.g:3714:1: rule__ConditionDeviceS__Group__3__Impl : ( ( rule__ConditionDeviceS__ComparisonOperatorAssignment_3 ) ) ;
    public final void rule__ConditionDeviceS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3718:1: ( ( ( rule__ConditionDeviceS__ComparisonOperatorAssignment_3 ) ) )
            // InternalShortDSLParser.g:3719:1: ( ( rule__ConditionDeviceS__ComparisonOperatorAssignment_3 ) )
            {
            // InternalShortDSLParser.g:3719:1: ( ( rule__ConditionDeviceS__ComparisonOperatorAssignment_3 ) )
            // InternalShortDSLParser.g:3720:2: ( rule__ConditionDeviceS__ComparisonOperatorAssignment_3 )
            {
             before(grammarAccess.getConditionDeviceSAccess().getComparisonOperatorAssignment_3()); 
            // InternalShortDSLParser.g:3721:2: ( rule__ConditionDeviceS__ComparisonOperatorAssignment_3 )
            // InternalShortDSLParser.g:3721:3: rule__ConditionDeviceS__ComparisonOperatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__ComparisonOperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionDeviceSAccess().getComparisonOperatorAssignment_3()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:3729:1: rule__ConditionDeviceS__Group__4 : rule__ConditionDeviceS__Group__4__Impl rule__ConditionDeviceS__Group__5 ;
    public final void rule__ConditionDeviceS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3733:1: ( rule__ConditionDeviceS__Group__4__Impl rule__ConditionDeviceS__Group__5 )
            // InternalShortDSLParser.g:3734:2: rule__ConditionDeviceS__Group__4__Impl rule__ConditionDeviceS__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalShortDSLParser.g:3741:1: rule__ConditionDeviceS__Group__4__Impl : ( ( rule__ConditionDeviceS__ValueAssignment_4 ) ) ;
    public final void rule__ConditionDeviceS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3745:1: ( ( ( rule__ConditionDeviceS__ValueAssignment_4 ) ) )
            // InternalShortDSLParser.g:3746:1: ( ( rule__ConditionDeviceS__ValueAssignment_4 ) )
            {
            // InternalShortDSLParser.g:3746:1: ( ( rule__ConditionDeviceS__ValueAssignment_4 ) )
            // InternalShortDSLParser.g:3747:2: ( rule__ConditionDeviceS__ValueAssignment_4 )
            {
             before(grammarAccess.getConditionDeviceSAccess().getValueAssignment_4()); 
            // InternalShortDSLParser.g:3748:2: ( rule__ConditionDeviceS__ValueAssignment_4 )
            // InternalShortDSLParser.g:3748:3: rule__ConditionDeviceS__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionDeviceSAccess().getValueAssignment_4()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:3756:1: rule__ConditionDeviceS__Group__5 : rule__ConditionDeviceS__Group__5__Impl rule__ConditionDeviceS__Group__6 ;
    public final void rule__ConditionDeviceS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3760:1: ( rule__ConditionDeviceS__Group__5__Impl rule__ConditionDeviceS__Group__6 )
            // InternalShortDSLParser.g:3761:2: rule__ConditionDeviceS__Group__5__Impl rule__ConditionDeviceS__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalShortDSLParser.g:3768:1: rule__ConditionDeviceS__Group__5__Impl : ( Colon ) ;
    public final void rule__ConditionDeviceS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3772:1: ( ( Colon ) )
            // InternalShortDSLParser.g:3773:1: ( Colon )
            {
            // InternalShortDSLParser.g:3773:1: ( Colon )
            // InternalShortDSLParser.g:3774:2: Colon
            {
             before(grammarAccess.getConditionDeviceSAccess().getColonKeyword_5()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getConditionDeviceSAccess().getColonKeyword_5()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:3783:1: rule__ConditionDeviceS__Group__6 : rule__ConditionDeviceS__Group__6__Impl rule__ConditionDeviceS__Group__7 ;
    public final void rule__ConditionDeviceS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3787:1: ( rule__ConditionDeviceS__Group__6__Impl rule__ConditionDeviceS__Group__7 )
            // InternalShortDSLParser.g:3788:2: rule__ConditionDeviceS__Group__6__Impl rule__ConditionDeviceS__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalShortDSLParser.g:3795:1: rule__ConditionDeviceS__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__ConditionDeviceS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3799:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:3800:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:3800:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:3801:2: RULE_BEGIN
            {
             before(grammarAccess.getConditionDeviceSAccess().getBEGINTerminalRuleCall_6()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getConditionDeviceSAccess().getBEGINTerminalRuleCall_6()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:3810:1: rule__ConditionDeviceS__Group__7 : rule__ConditionDeviceS__Group__7__Impl rule__ConditionDeviceS__Group__8 ;
    public final void rule__ConditionDeviceS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3814:1: ( rule__ConditionDeviceS__Group__7__Impl rule__ConditionDeviceS__Group__8 )
            // InternalShortDSLParser.g:3815:2: rule__ConditionDeviceS__Group__7__Impl rule__ConditionDeviceS__Group__8
            {
            pushFollow(FOLLOW_25);
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
    // InternalShortDSLParser.g:3822:1: rule__ConditionDeviceS__Group__7__Impl : ( ( rule__ConditionDeviceS__StatementsAssignment_7 )* ) ;
    public final void rule__ConditionDeviceS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3826:1: ( ( ( rule__ConditionDeviceS__StatementsAssignment_7 )* ) )
            // InternalShortDSLParser.g:3827:1: ( ( rule__ConditionDeviceS__StatementsAssignment_7 )* )
            {
            // InternalShortDSLParser.g:3827:1: ( ( rule__ConditionDeviceS__StatementsAssignment_7 )* )
            // InternalShortDSLParser.g:3828:2: ( rule__ConditionDeviceS__StatementsAssignment_7 )*
            {
             before(grammarAccess.getConditionDeviceSAccess().getStatementsAssignment_7()); 
            // InternalShortDSLParser.g:3829:2: ( rule__ConditionDeviceS__StatementsAssignment_7 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=Foreach && LA26_0<=Pickup)||LA26_0==Drop||LA26_0==If||LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalShortDSLParser.g:3829:3: rule__ConditionDeviceS__StatementsAssignment_7
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ConditionDeviceS__StatementsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getConditionDeviceSAccess().getStatementsAssignment_7()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:3837:1: rule__ConditionDeviceS__Group__8 : rule__ConditionDeviceS__Group__8__Impl ;
    public final void rule__ConditionDeviceS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3841:1: ( rule__ConditionDeviceS__Group__8__Impl )
            // InternalShortDSLParser.g:3842:2: rule__ConditionDeviceS__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionDeviceS__Group__8__Impl();

            state._fsp--;


            }

        }
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
    // InternalShortDSLParser.g:3848:1: rule__ConditionDeviceS__Group__8__Impl : ( RULE_END ) ;
    public final void rule__ConditionDeviceS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3852:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:3853:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:3853:1: ( RULE_END )
            // InternalShortDSLParser.g:3854:2: RULE_END
            {
             before(grammarAccess.getConditionDeviceSAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getConditionDeviceSAccess().getENDTerminalRuleCall_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__MarkVariableS__Group__0"
    // InternalShortDSLParser.g:3864:1: rule__MarkVariableS__Group__0 : rule__MarkVariableS__Group__0__Impl rule__MarkVariableS__Group__1 ;
    public final void rule__MarkVariableS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3868:1: ( rule__MarkVariableS__Group__0__Impl rule__MarkVariableS__Group__1 )
            // InternalShortDSLParser.g:3869:2: rule__MarkVariableS__Group__0__Impl rule__MarkVariableS__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MarkVariableS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkVariableS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__Group__0"


    // $ANTLR start "rule__MarkVariableS__Group__0__Impl"
    // InternalShortDSLParser.g:3876:1: rule__MarkVariableS__Group__0__Impl : ( () ) ;
    public final void rule__MarkVariableS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3880:1: ( ( () ) )
            // InternalShortDSLParser.g:3881:1: ( () )
            {
            // InternalShortDSLParser.g:3881:1: ( () )
            // InternalShortDSLParser.g:3882:2: ()
            {
             before(grammarAccess.getMarkVariableSAccess().getMarkVariableAction_0()); 
            // InternalShortDSLParser.g:3883:2: ()
            // InternalShortDSLParser.g:3883:3: 
            {
            }

             after(grammarAccess.getMarkVariableSAccess().getMarkVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__Group__0__Impl"


    // $ANTLR start "rule__MarkVariableS__Group__1"
    // InternalShortDSLParser.g:3891:1: rule__MarkVariableS__Group__1 : rule__MarkVariableS__Group__1__Impl rule__MarkVariableS__Group__2 ;
    public final void rule__MarkVariableS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3895:1: ( rule__MarkVariableS__Group__1__Impl rule__MarkVariableS__Group__2 )
            // InternalShortDSLParser.g:3896:2: rule__MarkVariableS__Group__1__Impl rule__MarkVariableS__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__MarkVariableS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkVariableS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__Group__1"


    // $ANTLR start "rule__MarkVariableS__Group__1__Impl"
    // InternalShortDSLParser.g:3903:1: rule__MarkVariableS__Group__1__Impl : ( ( rule__MarkVariableS__DeviceAssignment_1 ) ) ;
    public final void rule__MarkVariableS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3907:1: ( ( ( rule__MarkVariableS__DeviceAssignment_1 ) ) )
            // InternalShortDSLParser.g:3908:1: ( ( rule__MarkVariableS__DeviceAssignment_1 ) )
            {
            // InternalShortDSLParser.g:3908:1: ( ( rule__MarkVariableS__DeviceAssignment_1 ) )
            // InternalShortDSLParser.g:3909:2: ( rule__MarkVariableS__DeviceAssignment_1 )
            {
             before(grammarAccess.getMarkVariableSAccess().getDeviceAssignment_1()); 
            // InternalShortDSLParser.g:3910:2: ( rule__MarkVariableS__DeviceAssignment_1 )
            // InternalShortDSLParser.g:3910:3: rule__MarkVariableS__DeviceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MarkVariableS__DeviceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMarkVariableSAccess().getDeviceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__Group__1__Impl"


    // $ANTLR start "rule__MarkVariableS__Group__2"
    // InternalShortDSLParser.g:3918:1: rule__MarkVariableS__Group__2 : rule__MarkVariableS__Group__2__Impl rule__MarkVariableS__Group__3 ;
    public final void rule__MarkVariableS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3922:1: ( rule__MarkVariableS__Group__2__Impl rule__MarkVariableS__Group__3 )
            // InternalShortDSLParser.g:3923:2: rule__MarkVariableS__Group__2__Impl rule__MarkVariableS__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__MarkVariableS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkVariableS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__Group__2"


    // $ANTLR start "rule__MarkVariableS__Group__2__Impl"
    // InternalShortDSLParser.g:3930:1: rule__MarkVariableS__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__MarkVariableS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3934:1: ( ( LeftParenthesis ) )
            // InternalShortDSLParser.g:3935:1: ( LeftParenthesis )
            {
            // InternalShortDSLParser.g:3935:1: ( LeftParenthesis )
            // InternalShortDSLParser.g:3936:2: LeftParenthesis
            {
             before(grammarAccess.getMarkVariableSAccess().getLeftParenthesisKeyword_2()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getMarkVariableSAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__Group__2__Impl"


    // $ANTLR start "rule__MarkVariableS__Group__3"
    // InternalShortDSLParser.g:3945:1: rule__MarkVariableS__Group__3 : rule__MarkVariableS__Group__3__Impl rule__MarkVariableS__Group__4 ;
    public final void rule__MarkVariableS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3949:1: ( rule__MarkVariableS__Group__3__Impl rule__MarkVariableS__Group__4 )
            // InternalShortDSLParser.g:3950:2: rule__MarkVariableS__Group__3__Impl rule__MarkVariableS__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__MarkVariableS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkVariableS__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__Group__3"


    // $ANTLR start "rule__MarkVariableS__Group__3__Impl"
    // InternalShortDSLParser.g:3957:1: rule__MarkVariableS__Group__3__Impl : ( ( rule__MarkVariableS__VariableAssignment_3 ) ) ;
    public final void rule__MarkVariableS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3961:1: ( ( ( rule__MarkVariableS__VariableAssignment_3 ) ) )
            // InternalShortDSLParser.g:3962:1: ( ( rule__MarkVariableS__VariableAssignment_3 ) )
            {
            // InternalShortDSLParser.g:3962:1: ( ( rule__MarkVariableS__VariableAssignment_3 ) )
            // InternalShortDSLParser.g:3963:2: ( rule__MarkVariableS__VariableAssignment_3 )
            {
             before(grammarAccess.getMarkVariableSAccess().getVariableAssignment_3()); 
            // InternalShortDSLParser.g:3964:2: ( rule__MarkVariableS__VariableAssignment_3 )
            // InternalShortDSLParser.g:3964:3: rule__MarkVariableS__VariableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MarkVariableS__VariableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMarkVariableSAccess().getVariableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__Group__3__Impl"


    // $ANTLR start "rule__MarkVariableS__Group__4"
    // InternalShortDSLParser.g:3972:1: rule__MarkVariableS__Group__4 : rule__MarkVariableS__Group__4__Impl rule__MarkVariableS__Group__5 ;
    public final void rule__MarkVariableS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3976:1: ( rule__MarkVariableS__Group__4__Impl rule__MarkVariableS__Group__5 )
            // InternalShortDSLParser.g:3977:2: rule__MarkVariableS__Group__4__Impl rule__MarkVariableS__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__MarkVariableS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkVariableS__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__Group__4"


    // $ANTLR start "rule__MarkVariableS__Group__4__Impl"
    // InternalShortDSLParser.g:3984:1: rule__MarkVariableS__Group__4__Impl : ( ( rule__MarkVariableS__Group_4__0 )? ) ;
    public final void rule__MarkVariableS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:3988:1: ( ( ( rule__MarkVariableS__Group_4__0 )? ) )
            // InternalShortDSLParser.g:3989:1: ( ( rule__MarkVariableS__Group_4__0 )? )
            {
            // InternalShortDSLParser.g:3989:1: ( ( rule__MarkVariableS__Group_4__0 )? )
            // InternalShortDSLParser.g:3990:2: ( rule__MarkVariableS__Group_4__0 )?
            {
             before(grammarAccess.getMarkVariableSAccess().getGroup_4()); 
            // InternalShortDSLParser.g:3991:2: ( rule__MarkVariableS__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Comma) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalShortDSLParser.g:3991:3: rule__MarkVariableS__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MarkVariableS__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMarkVariableSAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__Group__4__Impl"


    // $ANTLR start "rule__MarkVariableS__Group__5"
    // InternalShortDSLParser.g:3999:1: rule__MarkVariableS__Group__5 : rule__MarkVariableS__Group__5__Impl ;
    public final void rule__MarkVariableS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4003:1: ( rule__MarkVariableS__Group__5__Impl )
            // InternalShortDSLParser.g:4004:2: rule__MarkVariableS__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MarkVariableS__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__Group__5"


    // $ANTLR start "rule__MarkVariableS__Group__5__Impl"
    // InternalShortDSLParser.g:4010:1: rule__MarkVariableS__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__MarkVariableS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4014:1: ( ( RightParenthesis ) )
            // InternalShortDSLParser.g:4015:1: ( RightParenthesis )
            {
            // InternalShortDSLParser.g:4015:1: ( RightParenthesis )
            // InternalShortDSLParser.g:4016:2: RightParenthesis
            {
             before(grammarAccess.getMarkVariableSAccess().getRightParenthesisKeyword_5()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getMarkVariableSAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__Group__5__Impl"


    // $ANTLR start "rule__MarkVariableS__Group_4__0"
    // InternalShortDSLParser.g:4026:1: rule__MarkVariableS__Group_4__0 : rule__MarkVariableS__Group_4__0__Impl rule__MarkVariableS__Group_4__1 ;
    public final void rule__MarkVariableS__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4030:1: ( rule__MarkVariableS__Group_4__0__Impl rule__MarkVariableS__Group_4__1 )
            // InternalShortDSLParser.g:4031:2: rule__MarkVariableS__Group_4__0__Impl rule__MarkVariableS__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__MarkVariableS__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkVariableS__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__Group_4__0"


    // $ANTLR start "rule__MarkVariableS__Group_4__0__Impl"
    // InternalShortDSLParser.g:4038:1: rule__MarkVariableS__Group_4__0__Impl : ( Comma ) ;
    public final void rule__MarkVariableS__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4042:1: ( ( Comma ) )
            // InternalShortDSLParser.g:4043:1: ( Comma )
            {
            // InternalShortDSLParser.g:4043:1: ( Comma )
            // InternalShortDSLParser.g:4044:2: Comma
            {
             before(grammarAccess.getMarkVariableSAccess().getCommaKeyword_4_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getMarkVariableSAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__Group_4__0__Impl"


    // $ANTLR start "rule__MarkVariableS__Group_4__1"
    // InternalShortDSLParser.g:4053:1: rule__MarkVariableS__Group_4__1 : rule__MarkVariableS__Group_4__1__Impl ;
    public final void rule__MarkVariableS__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4057:1: ( rule__MarkVariableS__Group_4__1__Impl )
            // InternalShortDSLParser.g:4058:2: rule__MarkVariableS__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MarkVariableS__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__Group_4__1"


    // $ANTLR start "rule__MarkVariableS__Group_4__1__Impl"
    // InternalShortDSLParser.g:4064:1: rule__MarkVariableS__Group_4__1__Impl : ( ( rule__MarkVariableS__TimeAssignment_4_1 ) ) ;
    public final void rule__MarkVariableS__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4068:1: ( ( ( rule__MarkVariableS__TimeAssignment_4_1 ) ) )
            // InternalShortDSLParser.g:4069:1: ( ( rule__MarkVariableS__TimeAssignment_4_1 ) )
            {
            // InternalShortDSLParser.g:4069:1: ( ( rule__MarkVariableS__TimeAssignment_4_1 ) )
            // InternalShortDSLParser.g:4070:2: ( rule__MarkVariableS__TimeAssignment_4_1 )
            {
             before(grammarAccess.getMarkVariableSAccess().getTimeAssignment_4_1()); 
            // InternalShortDSLParser.g:4071:2: ( rule__MarkVariableS__TimeAssignment_4_1 )
            // InternalShortDSLParser.g:4071:3: rule__MarkVariableS__TimeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MarkVariableS__TimeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMarkVariableSAccess().getTimeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__Group_4__1__Impl"


    // $ANTLR start "rule__MarkValueS__Group__0"
    // InternalShortDSLParser.g:4080:1: rule__MarkValueS__Group__0 : rule__MarkValueS__Group__0__Impl rule__MarkValueS__Group__1 ;
    public final void rule__MarkValueS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4084:1: ( rule__MarkValueS__Group__0__Impl rule__MarkValueS__Group__1 )
            // InternalShortDSLParser.g:4085:2: rule__MarkValueS__Group__0__Impl rule__MarkValueS__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MarkValueS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkValueS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__Group__0"


    // $ANTLR start "rule__MarkValueS__Group__0__Impl"
    // InternalShortDSLParser.g:4092:1: rule__MarkValueS__Group__0__Impl : ( () ) ;
    public final void rule__MarkValueS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4096:1: ( ( () ) )
            // InternalShortDSLParser.g:4097:1: ( () )
            {
            // InternalShortDSLParser.g:4097:1: ( () )
            // InternalShortDSLParser.g:4098:2: ()
            {
             before(grammarAccess.getMarkValueSAccess().getMarkValueAction_0()); 
            // InternalShortDSLParser.g:4099:2: ()
            // InternalShortDSLParser.g:4099:3: 
            {
            }

             after(grammarAccess.getMarkValueSAccess().getMarkValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__Group__0__Impl"


    // $ANTLR start "rule__MarkValueS__Group__1"
    // InternalShortDSLParser.g:4107:1: rule__MarkValueS__Group__1 : rule__MarkValueS__Group__1__Impl rule__MarkValueS__Group__2 ;
    public final void rule__MarkValueS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4111:1: ( rule__MarkValueS__Group__1__Impl rule__MarkValueS__Group__2 )
            // InternalShortDSLParser.g:4112:2: rule__MarkValueS__Group__1__Impl rule__MarkValueS__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__MarkValueS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkValueS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__Group__1"


    // $ANTLR start "rule__MarkValueS__Group__1__Impl"
    // InternalShortDSLParser.g:4119:1: rule__MarkValueS__Group__1__Impl : ( ( rule__MarkValueS__VariableAssignment_1 ) ) ;
    public final void rule__MarkValueS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4123:1: ( ( ( rule__MarkValueS__VariableAssignment_1 ) ) )
            // InternalShortDSLParser.g:4124:1: ( ( rule__MarkValueS__VariableAssignment_1 ) )
            {
            // InternalShortDSLParser.g:4124:1: ( ( rule__MarkValueS__VariableAssignment_1 ) )
            // InternalShortDSLParser.g:4125:2: ( rule__MarkValueS__VariableAssignment_1 )
            {
             before(grammarAccess.getMarkValueSAccess().getVariableAssignment_1()); 
            // InternalShortDSLParser.g:4126:2: ( rule__MarkValueS__VariableAssignment_1 )
            // InternalShortDSLParser.g:4126:3: rule__MarkValueS__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MarkValueS__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMarkValueSAccess().getVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__Group__1__Impl"


    // $ANTLR start "rule__MarkValueS__Group__2"
    // InternalShortDSLParser.g:4134:1: rule__MarkValueS__Group__2 : rule__MarkValueS__Group__2__Impl rule__MarkValueS__Group__3 ;
    public final void rule__MarkValueS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4138:1: ( rule__MarkValueS__Group__2__Impl rule__MarkValueS__Group__3 )
            // InternalShortDSLParser.g:4139:2: rule__MarkValueS__Group__2__Impl rule__MarkValueS__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__MarkValueS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkValueS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__Group__2"


    // $ANTLR start "rule__MarkValueS__Group__2__Impl"
    // InternalShortDSLParser.g:4146:1: rule__MarkValueS__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__MarkValueS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4150:1: ( ( LeftParenthesis ) )
            // InternalShortDSLParser.g:4151:1: ( LeftParenthesis )
            {
            // InternalShortDSLParser.g:4151:1: ( LeftParenthesis )
            // InternalShortDSLParser.g:4152:2: LeftParenthesis
            {
             before(grammarAccess.getMarkValueSAccess().getLeftParenthesisKeyword_2()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getMarkValueSAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__Group__2__Impl"


    // $ANTLR start "rule__MarkValueS__Group__3"
    // InternalShortDSLParser.g:4161:1: rule__MarkValueS__Group__3 : rule__MarkValueS__Group__3__Impl rule__MarkValueS__Group__4 ;
    public final void rule__MarkValueS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4165:1: ( rule__MarkValueS__Group__3__Impl rule__MarkValueS__Group__4 )
            // InternalShortDSLParser.g:4166:2: rule__MarkValueS__Group__3__Impl rule__MarkValueS__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__MarkValueS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkValueS__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__Group__3"


    // $ANTLR start "rule__MarkValueS__Group__3__Impl"
    // InternalShortDSLParser.g:4173:1: rule__MarkValueS__Group__3__Impl : ( ( rule__MarkValueS__ValueAssignment_3 ) ) ;
    public final void rule__MarkValueS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4177:1: ( ( ( rule__MarkValueS__ValueAssignment_3 ) ) )
            // InternalShortDSLParser.g:4178:1: ( ( rule__MarkValueS__ValueAssignment_3 ) )
            {
            // InternalShortDSLParser.g:4178:1: ( ( rule__MarkValueS__ValueAssignment_3 ) )
            // InternalShortDSLParser.g:4179:2: ( rule__MarkValueS__ValueAssignment_3 )
            {
             before(grammarAccess.getMarkValueSAccess().getValueAssignment_3()); 
            // InternalShortDSLParser.g:4180:2: ( rule__MarkValueS__ValueAssignment_3 )
            // InternalShortDSLParser.g:4180:3: rule__MarkValueS__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MarkValueS__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMarkValueSAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__Group__3__Impl"


    // $ANTLR start "rule__MarkValueS__Group__4"
    // InternalShortDSLParser.g:4188:1: rule__MarkValueS__Group__4 : rule__MarkValueS__Group__4__Impl rule__MarkValueS__Group__5 ;
    public final void rule__MarkValueS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4192:1: ( rule__MarkValueS__Group__4__Impl rule__MarkValueS__Group__5 )
            // InternalShortDSLParser.g:4193:2: rule__MarkValueS__Group__4__Impl rule__MarkValueS__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__MarkValueS__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkValueS__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__Group__4"


    // $ANTLR start "rule__MarkValueS__Group__4__Impl"
    // InternalShortDSLParser.g:4200:1: rule__MarkValueS__Group__4__Impl : ( ( rule__MarkValueS__Group_4__0 )? ) ;
    public final void rule__MarkValueS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4204:1: ( ( ( rule__MarkValueS__Group_4__0 )? ) )
            // InternalShortDSLParser.g:4205:1: ( ( rule__MarkValueS__Group_4__0 )? )
            {
            // InternalShortDSLParser.g:4205:1: ( ( rule__MarkValueS__Group_4__0 )? )
            // InternalShortDSLParser.g:4206:2: ( rule__MarkValueS__Group_4__0 )?
            {
             before(grammarAccess.getMarkValueSAccess().getGroup_4()); 
            // InternalShortDSLParser.g:4207:2: ( rule__MarkValueS__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Comma) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalShortDSLParser.g:4207:3: rule__MarkValueS__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MarkValueS__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMarkValueSAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__Group__4__Impl"


    // $ANTLR start "rule__MarkValueS__Group__5"
    // InternalShortDSLParser.g:4215:1: rule__MarkValueS__Group__5 : rule__MarkValueS__Group__5__Impl ;
    public final void rule__MarkValueS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4219:1: ( rule__MarkValueS__Group__5__Impl )
            // InternalShortDSLParser.g:4220:2: rule__MarkValueS__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MarkValueS__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__Group__5"


    // $ANTLR start "rule__MarkValueS__Group__5__Impl"
    // InternalShortDSLParser.g:4226:1: rule__MarkValueS__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__MarkValueS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4230:1: ( ( RightParenthesis ) )
            // InternalShortDSLParser.g:4231:1: ( RightParenthesis )
            {
            // InternalShortDSLParser.g:4231:1: ( RightParenthesis )
            // InternalShortDSLParser.g:4232:2: RightParenthesis
            {
             before(grammarAccess.getMarkValueSAccess().getRightParenthesisKeyword_5()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getMarkValueSAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__Group__5__Impl"


    // $ANTLR start "rule__MarkValueS__Group_4__0"
    // InternalShortDSLParser.g:4242:1: rule__MarkValueS__Group_4__0 : rule__MarkValueS__Group_4__0__Impl rule__MarkValueS__Group_4__1 ;
    public final void rule__MarkValueS__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4246:1: ( rule__MarkValueS__Group_4__0__Impl rule__MarkValueS__Group_4__1 )
            // InternalShortDSLParser.g:4247:2: rule__MarkValueS__Group_4__0__Impl rule__MarkValueS__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__MarkValueS__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkValueS__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__Group_4__0"


    // $ANTLR start "rule__MarkValueS__Group_4__0__Impl"
    // InternalShortDSLParser.g:4254:1: rule__MarkValueS__Group_4__0__Impl : ( Comma ) ;
    public final void rule__MarkValueS__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4258:1: ( ( Comma ) )
            // InternalShortDSLParser.g:4259:1: ( Comma )
            {
            // InternalShortDSLParser.g:4259:1: ( Comma )
            // InternalShortDSLParser.g:4260:2: Comma
            {
             before(grammarAccess.getMarkValueSAccess().getCommaKeyword_4_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getMarkValueSAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__Group_4__0__Impl"


    // $ANTLR start "rule__MarkValueS__Group_4__1"
    // InternalShortDSLParser.g:4269:1: rule__MarkValueS__Group_4__1 : rule__MarkValueS__Group_4__1__Impl ;
    public final void rule__MarkValueS__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4273:1: ( rule__MarkValueS__Group_4__1__Impl )
            // InternalShortDSLParser.g:4274:2: rule__MarkValueS__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MarkValueS__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__Group_4__1"


    // $ANTLR start "rule__MarkValueS__Group_4__1__Impl"
    // InternalShortDSLParser.g:4280:1: rule__MarkValueS__Group_4__1__Impl : ( ( rule__MarkValueS__TimeAssignment_4_1 ) ) ;
    public final void rule__MarkValueS__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4284:1: ( ( ( rule__MarkValueS__TimeAssignment_4_1 ) ) )
            // InternalShortDSLParser.g:4285:1: ( ( rule__MarkValueS__TimeAssignment_4_1 ) )
            {
            // InternalShortDSLParser.g:4285:1: ( ( rule__MarkValueS__TimeAssignment_4_1 ) )
            // InternalShortDSLParser.g:4286:2: ( rule__MarkValueS__TimeAssignment_4_1 )
            {
             before(grammarAccess.getMarkValueSAccess().getTimeAssignment_4_1()); 
            // InternalShortDSLParser.g:4287:2: ( rule__MarkValueS__TimeAssignment_4_1 )
            // InternalShortDSLParser.g:4287:3: rule__MarkValueS__TimeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MarkValueS__TimeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMarkValueSAccess().getTimeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__Group_4__1__Impl"


    // $ANTLR start "rule__LocalVariableS__Group__0"
    // InternalShortDSLParser.g:4296:1: rule__LocalVariableS__Group__0 : rule__LocalVariableS__Group__0__Impl rule__LocalVariableS__Group__1 ;
    public final void rule__LocalVariableS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4300:1: ( rule__LocalVariableS__Group__0__Impl rule__LocalVariableS__Group__1 )
            // InternalShortDSLParser.g:4301:2: rule__LocalVariableS__Group__0__Impl rule__LocalVariableS__Group__1
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
    // InternalShortDSLParser.g:4308:1: rule__LocalVariableS__Group__0__Impl : ( () ) ;
    public final void rule__LocalVariableS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4312:1: ( ( () ) )
            // InternalShortDSLParser.g:4313:1: ( () )
            {
            // InternalShortDSLParser.g:4313:1: ( () )
            // InternalShortDSLParser.g:4314:2: ()
            {
             before(grammarAccess.getLocalVariableSAccess().getLocalVariableAction_0()); 
            // InternalShortDSLParser.g:4315:2: ()
            // InternalShortDSLParser.g:4315:3: 
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
    // InternalShortDSLParser.g:4323:1: rule__LocalVariableS__Group__1 : rule__LocalVariableS__Group__1__Impl ;
    public final void rule__LocalVariableS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4327:1: ( rule__LocalVariableS__Group__1__Impl )
            // InternalShortDSLParser.g:4328:2: rule__LocalVariableS__Group__1__Impl
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
    // InternalShortDSLParser.g:4334:1: rule__LocalVariableS__Group__1__Impl : ( ( rule__LocalVariableS__NameAssignment_1 ) ) ;
    public final void rule__LocalVariableS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4338:1: ( ( ( rule__LocalVariableS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:4339:1: ( ( rule__LocalVariableS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:4339:1: ( ( rule__LocalVariableS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:4340:2: ( rule__LocalVariableS__NameAssignment_1 )
            {
             before(grammarAccess.getLocalVariableSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:4341:2: ( rule__LocalVariableS__NameAssignment_1 )
            // InternalShortDSLParser.g:4341:3: rule__LocalVariableS__NameAssignment_1
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
    // InternalShortDSLParser.g:4350:1: rule__GlobalVariableS__Group__0 : rule__GlobalVariableS__Group__0__Impl rule__GlobalVariableS__Group__1 ;
    public final void rule__GlobalVariableS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4354:1: ( rule__GlobalVariableS__Group__0__Impl rule__GlobalVariableS__Group__1 )
            // InternalShortDSLParser.g:4355:2: rule__GlobalVariableS__Group__0__Impl rule__GlobalVariableS__Group__1
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
    // InternalShortDSLParser.g:4362:1: rule__GlobalVariableS__Group__0__Impl : ( () ) ;
    public final void rule__GlobalVariableS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4366:1: ( ( () ) )
            // InternalShortDSLParser.g:4367:1: ( () )
            {
            // InternalShortDSLParser.g:4367:1: ( () )
            // InternalShortDSLParser.g:4368:2: ()
            {
             before(grammarAccess.getGlobalVariableSAccess().getGlobalVariableAction_0()); 
            // InternalShortDSLParser.g:4369:2: ()
            // InternalShortDSLParser.g:4369:3: 
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
    // InternalShortDSLParser.g:4377:1: rule__GlobalVariableS__Group__1 : rule__GlobalVariableS__Group__1__Impl ;
    public final void rule__GlobalVariableS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4381:1: ( rule__GlobalVariableS__Group__1__Impl )
            // InternalShortDSLParser.g:4382:2: rule__GlobalVariableS__Group__1__Impl
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
    // InternalShortDSLParser.g:4388:1: rule__GlobalVariableS__Group__1__Impl : ( ( rule__GlobalVariableS__NameAssignment_1 ) ) ;
    public final void rule__GlobalVariableS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4392:1: ( ( ( rule__GlobalVariableS__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:4393:1: ( ( rule__GlobalVariableS__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:4393:1: ( ( rule__GlobalVariableS__NameAssignment_1 ) )
            // InternalShortDSLParser.g:4394:2: ( rule__GlobalVariableS__NameAssignment_1 )
            {
             before(grammarAccess.getGlobalVariableSAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:4395:2: ( rule__GlobalVariableS__NameAssignment_1 )
            // InternalShortDSLParser.g:4395:3: rule__GlobalVariableS__NameAssignment_1
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
    // InternalShortDSLParser.g:4404:1: rule__Model__TypeAssignment_1_0_2 : ( ruleDSL_Long ) ;
    public final void rule__Model__TypeAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4408:1: ( ( ruleDSL_Long ) )
            // InternalShortDSLParser.g:4409:2: ( ruleDSL_Long )
            {
            // InternalShortDSLParser.g:4409:2: ( ruleDSL_Long )
            // InternalShortDSLParser.g:4410:3: ruleDSL_Long
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
    // InternalShortDSLParser.g:4419:1: rule__Model__TypeAssignment_1_1_2 : ( ruleDSL_Short ) ;
    public final void rule__Model__TypeAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4423:1: ( ( ruleDSL_Short ) )
            // InternalShortDSLParser.g:4424:2: ( ruleDSL_Short )
            {
            // InternalShortDSLParser.g:4424:2: ( ruleDSL_Short )
            // InternalShortDSLParser.g:4425:3: ruleDSL_Short
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
    // InternalShortDSLParser.g:4434:1: rule__DSL_Long__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSL_Long__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4438:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4439:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:4439:2: ( RULE_ID )
            // InternalShortDSLParser.g:4440:3: RULE_ID
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
    // InternalShortDSLParser.g:4449:1: rule__DSL_Short__ConfigurationAssignment_1 : ( ruleConfigurationS ) ;
    public final void rule__DSL_Short__ConfigurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4453:1: ( ( ruleConfigurationS ) )
            // InternalShortDSLParser.g:4454:2: ( ruleConfigurationS )
            {
            // InternalShortDSLParser.g:4454:2: ( ruleConfigurationS )
            // InternalShortDSLParser.g:4455:3: ruleConfigurationS
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
    // InternalShortDSLParser.g:4464:1: rule__DSL_Short__DiskHandlingsAssignment_2 : ( ruleDiskHandlingS ) ;
    public final void rule__DSL_Short__DiskHandlingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4468:1: ( ( ruleDiskHandlingS ) )
            // InternalShortDSLParser.g:4469:2: ( ruleDiskHandlingS )
            {
            // InternalShortDSLParser.g:4469:2: ( ruleDiskHandlingS )
            // InternalShortDSLParser.g:4470:3: ruleDiskHandlingS
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
    // InternalShortDSLParser.g:4479:1: rule__ConfigurationS__DevicesAssignment_3 : ( ruleDeviceS ) ;
    public final void rule__ConfigurationS__DevicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4483:1: ( ( ruleDeviceS ) )
            // InternalShortDSLParser.g:4484:2: ( ruleDeviceS )
            {
            // InternalShortDSLParser.g:4484:2: ( ruleDeviceS )
            // InternalShortDSLParser.g:4485:3: ruleDeviceS
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
    // InternalShortDSLParser.g:4494:1: rule__CraneS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CraneS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4498:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4499:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:4499:2: ( RULE_ID )
            // InternalShortDSLParser.g:4500:3: RULE_ID
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


    // $ANTLR start "rule__CraneS__PositionsAssignment_4"
    // InternalShortDSLParser.g:4509:1: rule__CraneS__PositionsAssignment_4 : ( ruleCraneZoneS ) ;
    public final void rule__CraneS__PositionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4513:1: ( ( ruleCraneZoneS ) )
            // InternalShortDSLParser.g:4514:2: ( ruleCraneZoneS )
            {
            // InternalShortDSLParser.g:4514:2: ( ruleCraneZoneS )
            // InternalShortDSLParser.g:4515:3: ruleCraneZoneS
            {
             before(grammarAccess.getCraneSAccess().getPositionsCraneZoneSParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCraneZoneS();

            state._fsp--;

             after(grammarAccess.getCraneSAccess().getPositionsCraneZoneSParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CraneS__PositionsAssignment_4"


    // $ANTLR start "rule__CraneZoneS__NameAssignment_1"
    // InternalShortDSLParser.g:4524:1: rule__CraneZoneS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CraneZoneS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4528:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4529:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:4529:2: ( RULE_ID )
            // InternalShortDSLParser.g:4530:3: RULE_ID
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
    // InternalShortDSLParser.g:4539:1: rule__CraneZoneS__ZoneValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__CraneZoneS__ZoneValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4543:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:4544:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:4544:2: ( RULE_INT )
            // InternalShortDSLParser.g:4545:3: RULE_INT
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
    // InternalShortDSLParser.g:4554:1: rule__DiskS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DiskS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4558:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4559:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:4559:2: ( RULE_ID )
            // InternalShortDSLParser.g:4560:3: RULE_ID
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
    // InternalShortDSLParser.g:4569:1: rule__DiskS__NSlotsAssignment_3 : ( RULE_INT ) ;
    public final void rule__DiskS__NSlotsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4573:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:4574:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:4574:2: ( RULE_INT )
            // InternalShortDSLParser.g:4575:3: RULE_INT
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


    // $ANTLR start "rule__DiskS__ZonesAssignment_7"
    // InternalShortDSLParser.g:4584:1: rule__DiskS__ZonesAssignment_7 : ( ruleDiskZoneS ) ;
    public final void rule__DiskS__ZonesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4588:1: ( ( ruleDiskZoneS ) )
            // InternalShortDSLParser.g:4589:2: ( ruleDiskZoneS )
            {
            // InternalShortDSLParser.g:4589:2: ( ruleDiskZoneS )
            // InternalShortDSLParser.g:4590:3: ruleDiskZoneS
            {
             before(grammarAccess.getDiskSAccess().getZonesDiskZoneSParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskZoneS();

            state._fsp--;

             after(grammarAccess.getDiskSAccess().getZonesDiskZoneSParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskS__ZonesAssignment_7"


    // $ANTLR start "rule__DiskZoneS__NameAssignment_1"
    // InternalShortDSLParser.g:4599:1: rule__DiskZoneS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DiskZoneS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4603:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4604:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:4604:2: ( RULE_ID )
            // InternalShortDSLParser.g:4605:3: RULE_ID
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
    // InternalShortDSLParser.g:4614:1: rule__DiskZoneS__SlotAssignment_3 : ( RULE_INT ) ;
    public final void rule__DiskZoneS__SlotAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4618:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:4619:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:4619:2: ( RULE_INT )
            // InternalShortDSLParser.g:4620:3: RULE_INT
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
    // InternalShortDSLParser.g:4629:1: rule__CameraS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CameraS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4633:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4634:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:4634:2: ( RULE_ID )
            // InternalShortDSLParser.g:4635:3: RULE_ID
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


    // $ANTLR start "rule__CameraS__ColorsAssignment_4"
    // InternalShortDSLParser.g:4644:1: rule__CameraS__ColorsAssignment_4 : ( ruleCameraColorS ) ;
    public final void rule__CameraS__ColorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4648:1: ( ( ruleCameraColorS ) )
            // InternalShortDSLParser.g:4649:2: ( ruleCameraColorS )
            {
            // InternalShortDSLParser.g:4649:2: ( ruleCameraColorS )
            // InternalShortDSLParser.g:4650:3: ruleCameraColorS
            {
             before(grammarAccess.getCameraSAccess().getColorsCameraColorSParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCameraColorS();

            state._fsp--;

             after(grammarAccess.getCameraSAccess().getColorsCameraColorSParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraS__ColorsAssignment_4"


    // $ANTLR start "rule__CameraColorS__ColorAssignment_1"
    // InternalShortDSLParser.g:4659:1: rule__CameraColorS__ColorAssignment_1 : ( ruleCOLOR_S ) ;
    public final void rule__CameraColorS__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4663:1: ( ( ruleCOLOR_S ) )
            // InternalShortDSLParser.g:4664:2: ( ruleCOLOR_S )
            {
            // InternalShortDSLParser.g:4664:2: ( ruleCOLOR_S )
            // InternalShortDSLParser.g:4665:3: ruleCOLOR_S
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


    // $ANTLR start "rule__DiskHandlingS__DiskAssignment_0"
    // InternalShortDSLParser.g:4674:1: rule__DiskHandlingS__DiskAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DiskHandlingS__DiskAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4678:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:4679:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:4679:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4680:3: ( RULE_ID )
            {
             before(grammarAccess.getDiskHandlingSAccess().getDiskDiskCrossReference_0_0()); 
            // InternalShortDSLParser.g:4681:3: ( RULE_ID )
            // InternalShortDSLParser.g:4682:4: RULE_ID
            {
             before(grammarAccess.getDiskHandlingSAccess().getDiskDiskIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDiskHandlingSAccess().getDiskDiskIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDiskHandlingSAccess().getDiskDiskCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskHandlingS__DiskAssignment_0"


    // $ANTLR start "rule__DiskHandlingS__StatementsAssignment_3"
    // InternalShortDSLParser.g:4693:1: rule__DiskHandlingS__StatementsAssignment_3 : ( ruleStatementS ) ;
    public final void rule__DiskHandlingS__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4697:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:4698:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:4698:2: ( ruleStatementS )
            // InternalShortDSLParser.g:4699:3: ruleStatementS
            {
             before(grammarAccess.getDiskHandlingSAccess().getStatementsStatementSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementS();

            state._fsp--;

             after(grammarAccess.getDiskHandlingSAccess().getStatementsStatementSParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskHandlingS__StatementsAssignment_3"


    // $ANTLR start "rule__LoopS__VariableAssignment_2"
    // InternalShortDSLParser.g:4708:1: rule__LoopS__VariableAssignment_2 : ( ruleLocalVariableS ) ;
    public final void rule__LoopS__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4712:1: ( ( ruleLocalVariableS ) )
            // InternalShortDSLParser.g:4713:2: ( ruleLocalVariableS )
            {
            // InternalShortDSLParser.g:4713:2: ( ruleLocalVariableS )
            // InternalShortDSLParser.g:4714:3: ruleLocalVariableS
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
    // InternalShortDSLParser.g:4723:1: rule__LoopS__ComparisonOperatorAssignment_3 : ( ruleCOMPARISON_OPERATOR_S ) ;
    public final void rule__LoopS__ComparisonOperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4727:1: ( ( ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:4728:2: ( ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:4728:2: ( ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:4729:3: ruleCOMPARISON_OPERATOR_S
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
    // InternalShortDSLParser.g:4738:1: rule__LoopS__SlotStateAssignment_4 : ( ruleDISK_SLOT_STATES_S ) ;
    public final void rule__LoopS__SlotStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4742:1: ( ( ruleDISK_SLOT_STATES_S ) )
            // InternalShortDSLParser.g:4743:2: ( ruleDISK_SLOT_STATES_S )
            {
            // InternalShortDSLParser.g:4743:2: ( ruleDISK_SLOT_STATES_S )
            // InternalShortDSLParser.g:4744:3: ruleDISK_SLOT_STATES_S
            {
             before(grammarAccess.getLoopSAccess().getSlotStateDISK_SLOT_STATES_SEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDISK_SLOT_STATES_S();

            state._fsp--;

             after(grammarAccess.getLoopSAccess().getSlotStateDISK_SLOT_STATES_SEnumRuleCall_4_0()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:4753:1: rule__LoopS__StatementsAssignment_7 : ( ruleStatementS ) ;
    public final void rule__LoopS__StatementsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4757:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:4758:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:4758:2: ( ruleStatementS )
            // InternalShortDSLParser.g:4759:3: ruleStatementS
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
    // InternalShortDSLParser.g:4768:1: rule__MoveDiskS__SlotAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MoveDiskS__SlotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4772:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:4773:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:4773:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4774:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveDiskSAccess().getSlotVariableCrossReference_1_0()); 
            // InternalShortDSLParser.g:4775:3: ( RULE_ID )
            // InternalShortDSLParser.g:4776:4: RULE_ID
            {
             before(grammarAccess.getMoveDiskSAccess().getSlotVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMoveDiskSAccess().getSlotVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMoveDiskSAccess().getSlotVariableCrossReference_1_0()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:4787:1: rule__MoveDiskS__ZoneAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MoveDiskS__ZoneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4791:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:4792:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:4792:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4793:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveDiskSAccess().getZoneDiskZoneCrossReference_3_0()); 
            // InternalShortDSLParser.g:4794:3: ( RULE_ID )
            // InternalShortDSLParser.g:4795:4: RULE_ID
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


    // $ANTLR start "rule__MoveCraneS__CraneAssignment_1"
    // InternalShortDSLParser.g:4806:1: rule__MoveCraneS__CraneAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MoveCraneS__CraneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4810:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:4811:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:4811:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4812:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveCraneSAccess().getCraneCraneCrossReference_1_0()); 
            // InternalShortDSLParser.g:4813:3: ( RULE_ID )
            // InternalShortDSLParser.g:4814:4: RULE_ID
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
    // InternalShortDSLParser.g:4825:1: rule__MoveCraneS__ActionAssignment_2 : ( ruleActionS ) ;
    public final void rule__MoveCraneS__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4829:1: ( ( ruleActionS ) )
            // InternalShortDSLParser.g:4830:2: ( ruleActionS )
            {
            // InternalShortDSLParser.g:4830:2: ( ruleActionS )
            // InternalShortDSLParser.g:4831:3: ruleActionS
            {
             before(grammarAccess.getMoveCraneSAccess().getActionActionSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActionS();

            state._fsp--;

             after(grammarAccess.getMoveCraneSAccess().getActionActionSParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:4840:1: rule__MoveCraneS__ZoneAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__MoveCraneS__ZoneAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4844:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:4845:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:4845:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4846:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveCraneSAccess().getZoneCraneZoneCrossReference_4_0()); 
            // InternalShortDSLParser.g:4847:3: ( RULE_ID )
            // InternalShortDSLParser.g:4848:4: RULE_ID
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
    // InternalShortDSLParser.g:4859:1: rule__ConditionVariableS__VariableAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionVariableS__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4863:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:4864:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:4864:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4865:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionVariableSAccess().getVariableVariableCrossReference_3_0()); 
            // InternalShortDSLParser.g:4866:3: ( RULE_ID )
            // InternalShortDSLParser.g:4867:4: RULE_ID
            {
             before(grammarAccess.getConditionVariableSAccess().getVariableVariableIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionVariableSAccess().getVariableVariableIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getConditionVariableSAccess().getVariableVariableCrossReference_3_0()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:4878:1: rule__ConditionVariableS__ComparisonOperatorAssignment_4 : ( ruleCOMPARISON_OPERATOR_S ) ;
    public final void rule__ConditionVariableS__ComparisonOperatorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4882:1: ( ( ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:4883:2: ( ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:4883:2: ( ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:4884:3: ruleCOMPARISON_OPERATOR_S
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


    // $ANTLR start "rule__ConditionVariableS__ValueAssignment_5"
    // InternalShortDSLParser.g:4893:1: rule__ConditionVariableS__ValueAssignment_5 : ( ruleValue ) ;
    public final void rule__ConditionVariableS__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4897:1: ( ( ruleValue ) )
            // InternalShortDSLParser.g:4898:2: ( ruleValue )
            {
            // InternalShortDSLParser.g:4898:2: ( ruleValue )
            // InternalShortDSLParser.g:4899:3: ruleValue
            {
             before(grammarAccess.getConditionVariableSAccess().getValueValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getConditionVariableSAccess().getValueValueParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionVariableS__ValueAssignment_5"


    // $ANTLR start "rule__ConditionVariableS__StatementsAssignment_8"
    // InternalShortDSLParser.g:4908:1: rule__ConditionVariableS__StatementsAssignment_8 : ( ruleStatementS ) ;
    public final void rule__ConditionVariableS__StatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4912:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:4913:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:4913:2: ( ruleStatementS )
            // InternalShortDSLParser.g:4914:3: ruleStatementS
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


    // $ANTLR start "rule__ConditionDeviceS__DeviceAssignment_2"
    // InternalShortDSLParser.g:4923:1: rule__ConditionDeviceS__DeviceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionDeviceS__DeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4927:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:4928:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:4928:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4929:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionDeviceSAccess().getDeviceDeviceSCrossReference_2_0()); 
            // InternalShortDSLParser.g:4930:3: ( RULE_ID )
            // InternalShortDSLParser.g:4931:4: RULE_ID
            {
             before(grammarAccess.getConditionDeviceSAccess().getDeviceDeviceSIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionDeviceSAccess().getDeviceDeviceSIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getConditionDeviceSAccess().getDeviceDeviceSCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionDeviceS__DeviceAssignment_2"


    // $ANTLR start "rule__ConditionDeviceS__ComparisonOperatorAssignment_3"
    // InternalShortDSLParser.g:4942:1: rule__ConditionDeviceS__ComparisonOperatorAssignment_3 : ( ruleCOMPARISON_OPERATOR_S ) ;
    public final void rule__ConditionDeviceS__ComparisonOperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4946:1: ( ( ruleCOMPARISON_OPERATOR_S ) )
            // InternalShortDSLParser.g:4947:2: ( ruleCOMPARISON_OPERATOR_S )
            {
            // InternalShortDSLParser.g:4947:2: ( ruleCOMPARISON_OPERATOR_S )
            // InternalShortDSLParser.g:4948:3: ruleCOMPARISON_OPERATOR_S
            {
             before(grammarAccess.getConditionDeviceSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMPARISON_OPERATOR_S();

            state._fsp--;

             after(grammarAccess.getConditionDeviceSAccess().getComparisonOperatorCOMPARISON_OPERATOR_SEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionDeviceS__ComparisonOperatorAssignment_3"


    // $ANTLR start "rule__ConditionDeviceS__ValueAssignment_4"
    // InternalShortDSLParser.g:4957:1: rule__ConditionDeviceS__ValueAssignment_4 : ( ruleValue ) ;
    public final void rule__ConditionDeviceS__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4961:1: ( ( ruleValue ) )
            // InternalShortDSLParser.g:4962:2: ( ruleValue )
            {
            // InternalShortDSLParser.g:4962:2: ( ruleValue )
            // InternalShortDSLParser.g:4963:3: ruleValue
            {
             before(grammarAccess.getConditionDeviceSAccess().getValueValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getConditionDeviceSAccess().getValueValueParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionDeviceS__ValueAssignment_4"


    // $ANTLR start "rule__ConditionDeviceS__StatementsAssignment_7"
    // InternalShortDSLParser.g:4972:1: rule__ConditionDeviceS__StatementsAssignment_7 : ( ruleStatementS ) ;
    public final void rule__ConditionDeviceS__StatementsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4976:1: ( ( ruleStatementS ) )
            // InternalShortDSLParser.g:4977:2: ( ruleStatementS )
            {
            // InternalShortDSLParser.g:4977:2: ( ruleStatementS )
            // InternalShortDSLParser.g:4978:3: ruleStatementS
            {
             before(grammarAccess.getConditionDeviceSAccess().getStatementsStatementSParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementS();

            state._fsp--;

             after(grammarAccess.getConditionDeviceSAccess().getStatementsStatementSParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionDeviceS__StatementsAssignment_7"


    // $ANTLR start "rule__MarkVariableS__DeviceAssignment_1"
    // InternalShortDSLParser.g:4987:1: rule__MarkVariableS__DeviceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MarkVariableS__DeviceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:4991:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:4992:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:4992:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:4993:3: ( RULE_ID )
            {
             before(grammarAccess.getMarkVariableSAccess().getDeviceDeviceSCrossReference_1_0()); 
            // InternalShortDSLParser.g:4994:3: ( RULE_ID )
            // InternalShortDSLParser.g:4995:4: RULE_ID
            {
             before(grammarAccess.getMarkVariableSAccess().getDeviceDeviceSIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMarkVariableSAccess().getDeviceDeviceSIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMarkVariableSAccess().getDeviceDeviceSCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__DeviceAssignment_1"


    // $ANTLR start "rule__MarkVariableS__VariableAssignment_3"
    // InternalShortDSLParser.g:5006:1: rule__MarkVariableS__VariableAssignment_3 : ( ruleGlobalVariableS ) ;
    public final void rule__MarkVariableS__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5010:1: ( ( ruleGlobalVariableS ) )
            // InternalShortDSLParser.g:5011:2: ( ruleGlobalVariableS )
            {
            // InternalShortDSLParser.g:5011:2: ( ruleGlobalVariableS )
            // InternalShortDSLParser.g:5012:3: ruleGlobalVariableS
            {
             before(grammarAccess.getMarkVariableSAccess().getVariableGlobalVariableSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobalVariableS();

            state._fsp--;

             after(grammarAccess.getMarkVariableSAccess().getVariableGlobalVariableSParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__VariableAssignment_3"


    // $ANTLR start "rule__MarkVariableS__TimeAssignment_4_1"
    // InternalShortDSLParser.g:5021:1: rule__MarkVariableS__TimeAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__MarkVariableS__TimeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5025:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:5026:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:5026:2: ( RULE_INT )
            // InternalShortDSLParser.g:5027:3: RULE_INT
            {
             before(grammarAccess.getMarkVariableSAccess().getTimeINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMarkVariableSAccess().getTimeINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkVariableS__TimeAssignment_4_1"


    // $ANTLR start "rule__MarkValueS__VariableAssignment_1"
    // InternalShortDSLParser.g:5036:1: rule__MarkValueS__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MarkValueS__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5040:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5041:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5041:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5042:3: ( RULE_ID )
            {
             before(grammarAccess.getMarkValueSAccess().getVariableLocalVariableCrossReference_1_0()); 
            // InternalShortDSLParser.g:5043:3: ( RULE_ID )
            // InternalShortDSLParser.g:5044:4: RULE_ID
            {
             before(grammarAccess.getMarkValueSAccess().getVariableLocalVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMarkValueSAccess().getVariableLocalVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMarkValueSAccess().getVariableLocalVariableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__VariableAssignment_1"


    // $ANTLR start "rule__MarkValueS__ValueAssignment_3"
    // InternalShortDSLParser.g:5055:1: rule__MarkValueS__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__MarkValueS__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5059:1: ( ( ruleValue ) )
            // InternalShortDSLParser.g:5060:2: ( ruleValue )
            {
            // InternalShortDSLParser.g:5060:2: ( ruleValue )
            // InternalShortDSLParser.g:5061:3: ruleValue
            {
             before(grammarAccess.getMarkValueSAccess().getValueValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getMarkValueSAccess().getValueValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__ValueAssignment_3"


    // $ANTLR start "rule__MarkValueS__TimeAssignment_4_1"
    // InternalShortDSLParser.g:5070:1: rule__MarkValueS__TimeAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__MarkValueS__TimeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5074:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:5075:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:5075:2: ( RULE_INT )
            // InternalShortDSLParser.g:5076:3: RULE_INT
            {
             before(grammarAccess.getMarkValueSAccess().getTimeINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMarkValueSAccess().getTimeINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValueS__TimeAssignment_4_1"


    // $ANTLR start "rule__LocalVariableS__NameAssignment_1"
    // InternalShortDSLParser.g:5085:1: rule__LocalVariableS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LocalVariableS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5089:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5090:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5090:2: ( RULE_ID )
            // InternalShortDSLParser.g:5091:3: RULE_ID
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
    // InternalShortDSLParser.g:5100:1: rule__GlobalVariableS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GlobalVariableS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5104:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5105:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:5105:2: ( RULE_ID )
            // InternalShortDSLParser.g:5106:3: RULE_ID
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


    // $ANTLR start "rule__Value__ValueDiskSlotStateAssignment_0"
    // InternalShortDSLParser.g:5115:1: rule__Value__ValueDiskSlotStateAssignment_0 : ( ruleDISK_SLOT_STATES_S ) ;
    public final void rule__Value__ValueDiskSlotStateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5119:1: ( ( ruleDISK_SLOT_STATES_S ) )
            // InternalShortDSLParser.g:5120:2: ( ruleDISK_SLOT_STATES_S )
            {
            // InternalShortDSLParser.g:5120:2: ( ruleDISK_SLOT_STATES_S )
            // InternalShortDSLParser.g:5121:3: ruleDISK_SLOT_STATES_S
            {
             before(grammarAccess.getValueAccess().getValueDiskSlotStateDISK_SLOT_STATES_SEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDISK_SLOT_STATES_S();

            state._fsp--;

             after(grammarAccess.getValueAccess().getValueDiskSlotStateDISK_SLOT_STATES_SEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueDiskSlotStateAssignment_0"


    // $ANTLR start "rule__Value__ValueDiskStateAssignment_1"
    // InternalShortDSLParser.g:5130:1: rule__Value__ValueDiskStateAssignment_1 : ( ruleDISK_STATES_S ) ;
    public final void rule__Value__ValueDiskStateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5134:1: ( ( ruleDISK_STATES_S ) )
            // InternalShortDSLParser.g:5135:2: ( ruleDISK_STATES_S )
            {
            // InternalShortDSLParser.g:5135:2: ( ruleDISK_STATES_S )
            // InternalShortDSLParser.g:5136:3: ruleDISK_STATES_S
            {
             before(grammarAccess.getValueAccess().getValueDiskStateDISK_STATES_SEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDISK_STATES_S();

            state._fsp--;

             after(grammarAccess.getValueAccess().getValueDiskStateDISK_STATES_SEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueDiskStateAssignment_1"


    // $ANTLR start "rule__Value__ValueColorAssignment_2"
    // InternalShortDSLParser.g:5145:1: rule__Value__ValueColorAssignment_2 : ( ruleCOLOR_S ) ;
    public final void rule__Value__ValueColorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5149:1: ( ( ruleCOLOR_S ) )
            // InternalShortDSLParser.g:5150:2: ( ruleCOLOR_S )
            {
            // InternalShortDSLParser.g:5150:2: ( ruleCOLOR_S )
            // InternalShortDSLParser.g:5151:3: ruleCOLOR_S
            {
             before(grammarAccess.getValueAccess().getValueColorCOLOR_SEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCOLOR_S();

            state._fsp--;

             after(grammarAccess.getValueAccess().getValueColorCOLOR_SEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueColorAssignment_2"


    // $ANTLR start "rule__Value__ValueIntAssignment_3"
    // InternalShortDSLParser.g:5160:1: rule__Value__ValueIntAssignment_3 : ( RULE_INT ) ;
    public final void rule__Value__ValueIntAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5164:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:5165:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:5165:2: ( RULE_INT )
            // InternalShortDSLParser.g:5166:3: RULE_INT
            {
             before(grammarAccess.getValueAccess().getValueIntINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getValueIntINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueIntAssignment_3"


    // $ANTLR start "rule__Value__VariableAssignment_4"
    // InternalShortDSLParser.g:5175:1: rule__Value__VariableAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Value__VariableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:5179:1: ( ( ( RULE_ID ) ) )
            // InternalShortDSLParser.g:5180:2: ( ( RULE_ID ) )
            {
            // InternalShortDSLParser.g:5180:2: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:5181:3: ( RULE_ID )
            {
             before(grammarAccess.getValueAccess().getVariableVariableCrossReference_4_0()); 
            // InternalShortDSLParser.g:5182:3: ( RULE_ID )
            // InternalShortDSLParser.g:5183:4: RULE_ID
            {
             before(grammarAccess.getValueAccess().getVariableVariableIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getVariableVariableIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getValueAccess().getVariableVariableCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__VariableAssignment_4"

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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000101400L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000101402L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001001002180L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001001002182L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000E0400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001801002180L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000300010D630L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000C000000L});

}