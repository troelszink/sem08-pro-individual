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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("Dsl", "'dsl'");
    		tokenNameToValue.put("Use", "'use'");
    		tokenNameToValue.put("Test", "'test'");
    		tokenNameToValue.put("Devices", "'devices'");
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
    // InternalShortDSLParser.g:65:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:66:1: ( ruleModel EOF )
            // InternalShortDSLParser.g:67:1: ruleModel EOF
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
    // InternalShortDSLParser.g:74:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:78:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalShortDSLParser.g:79:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalShortDSLParser.g:79:2: ( ( rule__Model__Group__0 ) )
            // InternalShortDSLParser.g:80:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalShortDSLParser.g:81:3: ( rule__Model__Group__0 )
            // InternalShortDSLParser.g:81:4: rule__Model__Group__0
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


    // $ANTLR start "entryRuleDSL_Short"
    // InternalShortDSLParser.g:90:1: entryRuleDSL_Short : ruleDSL_Short EOF ;
    public final void entryRuleDSL_Short() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:91:1: ( ruleDSL_Short EOF )
            // InternalShortDSLParser.g:92:1: ruleDSL_Short EOF
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
    // InternalShortDSLParser.g:99:1: ruleDSL_Short : ( ( rule__DSL_Short__Group__0 ) ) ;
    public final void ruleDSL_Short() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:103:2: ( ( ( rule__DSL_Short__Group__0 ) ) )
            // InternalShortDSLParser.g:104:2: ( ( rule__DSL_Short__Group__0 ) )
            {
            // InternalShortDSLParser.g:104:2: ( ( rule__DSL_Short__Group__0 ) )
            // InternalShortDSLParser.g:105:3: ( rule__DSL_Short__Group__0 )
            {
             before(grammarAccess.getDSL_ShortAccess().getGroup()); 
            // InternalShortDSLParser.g:106:3: ( rule__DSL_Short__Group__0 )
            // InternalShortDSLParser.g:106:4: rule__DSL_Short__Group__0
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


    // $ANTLR start "entryRuleConfiguration_Short"
    // InternalShortDSLParser.g:115:1: entryRuleConfiguration_Short : ruleConfiguration_Short EOF ;
    public final void entryRuleConfiguration_Short() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:116:1: ( ruleConfiguration_Short EOF )
            // InternalShortDSLParser.g:117:1: ruleConfiguration_Short EOF
            {
             before(grammarAccess.getConfiguration_ShortRule()); 
            pushFollow(FOLLOW_1);
            ruleConfiguration_Short();

            state._fsp--;

             after(grammarAccess.getConfiguration_ShortRule()); 
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
    // $ANTLR end "entryRuleConfiguration_Short"


    // $ANTLR start "ruleConfiguration_Short"
    // InternalShortDSLParser.g:124:1: ruleConfiguration_Short : ( ( rule__Configuration_Short__Group__0 ) ) ;
    public final void ruleConfiguration_Short() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:128:2: ( ( ( rule__Configuration_Short__Group__0 ) ) )
            // InternalShortDSLParser.g:129:2: ( ( rule__Configuration_Short__Group__0 ) )
            {
            // InternalShortDSLParser.g:129:2: ( ( rule__Configuration_Short__Group__0 ) )
            // InternalShortDSLParser.g:130:3: ( rule__Configuration_Short__Group__0 )
            {
             before(grammarAccess.getConfiguration_ShortAccess().getGroup()); 
            // InternalShortDSLParser.g:131:3: ( rule__Configuration_Short__Group__0 )
            // InternalShortDSLParser.g:131:4: rule__Configuration_Short__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Short__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_ShortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration_Short"


    // $ANTLR start "entryRuleDevice_Short"
    // InternalShortDSLParser.g:140:1: entryRuleDevice_Short : ruleDevice_Short EOF ;
    public final void entryRuleDevice_Short() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:141:1: ( ruleDevice_Short EOF )
            // InternalShortDSLParser.g:142:1: ruleDevice_Short EOF
            {
             before(grammarAccess.getDevice_ShortRule()); 
            pushFollow(FOLLOW_1);
            ruleDevice_Short();

            state._fsp--;

             after(grammarAccess.getDevice_ShortRule()); 
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
    // $ANTLR end "entryRuleDevice_Short"


    // $ANTLR start "ruleDevice_Short"
    // InternalShortDSLParser.g:149:1: ruleDevice_Short : ( ( rule__Device_Short__Alternatives ) ) ;
    public final void ruleDevice_Short() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:153:2: ( ( ( rule__Device_Short__Alternatives ) ) )
            // InternalShortDSLParser.g:154:2: ( ( rule__Device_Short__Alternatives ) )
            {
            // InternalShortDSLParser.g:154:2: ( ( rule__Device_Short__Alternatives ) )
            // InternalShortDSLParser.g:155:3: ( rule__Device_Short__Alternatives )
            {
             before(grammarAccess.getDevice_ShortAccess().getAlternatives()); 
            // InternalShortDSLParser.g:156:3: ( rule__Device_Short__Alternatives )
            // InternalShortDSLParser.g:156:4: rule__Device_Short__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Device_Short__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDevice_ShortAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDevice_Short"


    // $ANTLR start "entryRuleCrane_Short"
    // InternalShortDSLParser.g:165:1: entryRuleCrane_Short : ruleCrane_Short EOF ;
    public final void entryRuleCrane_Short() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:166:1: ( ruleCrane_Short EOF )
            // InternalShortDSLParser.g:167:1: ruleCrane_Short EOF
            {
             before(grammarAccess.getCrane_ShortRule()); 
            pushFollow(FOLLOW_1);
            ruleCrane_Short();

            state._fsp--;

             after(grammarAccess.getCrane_ShortRule()); 
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
    // $ANTLR end "entryRuleCrane_Short"


    // $ANTLR start "ruleCrane_Short"
    // InternalShortDSLParser.g:174:1: ruleCrane_Short : ( ( rule__Crane_Short__Group__0 ) ) ;
    public final void ruleCrane_Short() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:178:2: ( ( ( rule__Crane_Short__Group__0 ) ) )
            // InternalShortDSLParser.g:179:2: ( ( rule__Crane_Short__Group__0 ) )
            {
            // InternalShortDSLParser.g:179:2: ( ( rule__Crane_Short__Group__0 ) )
            // InternalShortDSLParser.g:180:3: ( rule__Crane_Short__Group__0 )
            {
             before(grammarAccess.getCrane_ShortAccess().getGroup()); 
            // InternalShortDSLParser.g:181:3: ( rule__Crane_Short__Group__0 )
            // InternalShortDSLParser.g:181:4: rule__Crane_Short__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Crane_Short__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCrane_ShortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCrane_Short"


    // $ANTLR start "entryRuleCranePosition_Short"
    // InternalShortDSLParser.g:190:1: entryRuleCranePosition_Short : ruleCranePosition_Short EOF ;
    public final void entryRuleCranePosition_Short() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:191:1: ( ruleCranePosition_Short EOF )
            // InternalShortDSLParser.g:192:1: ruleCranePosition_Short EOF
            {
             before(grammarAccess.getCranePosition_ShortRule()); 
            pushFollow(FOLLOW_1);
            ruleCranePosition_Short();

            state._fsp--;

             after(grammarAccess.getCranePosition_ShortRule()); 
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
    // $ANTLR end "entryRuleCranePosition_Short"


    // $ANTLR start "ruleCranePosition_Short"
    // InternalShortDSLParser.g:199:1: ruleCranePosition_Short : ( ( rule__CranePosition_Short__Group__0 ) ) ;
    public final void ruleCranePosition_Short() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:203:2: ( ( ( rule__CranePosition_Short__Group__0 ) ) )
            // InternalShortDSLParser.g:204:2: ( ( rule__CranePosition_Short__Group__0 ) )
            {
            // InternalShortDSLParser.g:204:2: ( ( rule__CranePosition_Short__Group__0 ) )
            // InternalShortDSLParser.g:205:3: ( rule__CranePosition_Short__Group__0 )
            {
             before(grammarAccess.getCranePosition_ShortAccess().getGroup()); 
            // InternalShortDSLParser.g:206:3: ( rule__CranePosition_Short__Group__0 )
            // InternalShortDSLParser.g:206:4: rule__CranePosition_Short__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CranePosition_Short__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCranePosition_ShortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCranePosition_Short"


    // $ANTLR start "entryRuleDisk_Short"
    // InternalShortDSLParser.g:215:1: entryRuleDisk_Short : ruleDisk_Short EOF ;
    public final void entryRuleDisk_Short() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:216:1: ( ruleDisk_Short EOF )
            // InternalShortDSLParser.g:217:1: ruleDisk_Short EOF
            {
             before(grammarAccess.getDisk_ShortRule()); 
            pushFollow(FOLLOW_1);
            ruleDisk_Short();

            state._fsp--;

             after(grammarAccess.getDisk_ShortRule()); 
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
    // $ANTLR end "entryRuleDisk_Short"


    // $ANTLR start "ruleDisk_Short"
    // InternalShortDSLParser.g:224:1: ruleDisk_Short : ( ( rule__Disk_Short__Group__0 ) ) ;
    public final void ruleDisk_Short() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:228:2: ( ( ( rule__Disk_Short__Group__0 ) ) )
            // InternalShortDSLParser.g:229:2: ( ( rule__Disk_Short__Group__0 ) )
            {
            // InternalShortDSLParser.g:229:2: ( ( rule__Disk_Short__Group__0 ) )
            // InternalShortDSLParser.g:230:3: ( rule__Disk_Short__Group__0 )
            {
             before(grammarAccess.getDisk_ShortAccess().getGroup()); 
            // InternalShortDSLParser.g:231:3: ( rule__Disk_Short__Group__0 )
            // InternalShortDSLParser.g:231:4: rule__Disk_Short__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Disk_Short__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDisk_ShortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDisk_Short"


    // $ANTLR start "entryRuleDiskZone_Short"
    // InternalShortDSLParser.g:240:1: entryRuleDiskZone_Short : ruleDiskZone_Short EOF ;
    public final void entryRuleDiskZone_Short() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:241:1: ( ruleDiskZone_Short EOF )
            // InternalShortDSLParser.g:242:1: ruleDiskZone_Short EOF
            {
             before(grammarAccess.getDiskZone_ShortRule()); 
            pushFollow(FOLLOW_1);
            ruleDiskZone_Short();

            state._fsp--;

             after(grammarAccess.getDiskZone_ShortRule()); 
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
    // $ANTLR end "entryRuleDiskZone_Short"


    // $ANTLR start "ruleDiskZone_Short"
    // InternalShortDSLParser.g:249:1: ruleDiskZone_Short : ( ( rule__DiskZone_Short__Group__0 ) ) ;
    public final void ruleDiskZone_Short() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:253:2: ( ( ( rule__DiskZone_Short__Group__0 ) ) )
            // InternalShortDSLParser.g:254:2: ( ( rule__DiskZone_Short__Group__0 ) )
            {
            // InternalShortDSLParser.g:254:2: ( ( rule__DiskZone_Short__Group__0 ) )
            // InternalShortDSLParser.g:255:3: ( rule__DiskZone_Short__Group__0 )
            {
             before(grammarAccess.getDiskZone_ShortAccess().getGroup()); 
            // InternalShortDSLParser.g:256:3: ( rule__DiskZone_Short__Group__0 )
            // InternalShortDSLParser.g:256:4: rule__DiskZone_Short__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DiskZone_Short__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiskZone_ShortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiskZone_Short"


    // $ANTLR start "entryRuleCamera_Short"
    // InternalShortDSLParser.g:265:1: entryRuleCamera_Short : ruleCamera_Short EOF ;
    public final void entryRuleCamera_Short() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:266:1: ( ruleCamera_Short EOF )
            // InternalShortDSLParser.g:267:1: ruleCamera_Short EOF
            {
             before(grammarAccess.getCamera_ShortRule()); 
            pushFollow(FOLLOW_1);
            ruleCamera_Short();

            state._fsp--;

             after(grammarAccess.getCamera_ShortRule()); 
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
    // $ANTLR end "entryRuleCamera_Short"


    // $ANTLR start "ruleCamera_Short"
    // InternalShortDSLParser.g:274:1: ruleCamera_Short : ( ( rule__Camera_Short__Group__0 ) ) ;
    public final void ruleCamera_Short() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:278:2: ( ( ( rule__Camera_Short__Group__0 ) ) )
            // InternalShortDSLParser.g:279:2: ( ( rule__Camera_Short__Group__0 ) )
            {
            // InternalShortDSLParser.g:279:2: ( ( rule__Camera_Short__Group__0 ) )
            // InternalShortDSLParser.g:280:3: ( rule__Camera_Short__Group__0 )
            {
             before(grammarAccess.getCamera_ShortAccess().getGroup()); 
            // InternalShortDSLParser.g:281:3: ( rule__Camera_Short__Group__0 )
            // InternalShortDSLParser.g:281:4: rule__Camera_Short__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Camera_Short__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCamera_ShortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCamera_Short"


    // $ANTLR start "entryRuleCameraColor_Short"
    // InternalShortDSLParser.g:290:1: entryRuleCameraColor_Short : ruleCameraColor_Short EOF ;
    public final void entryRuleCameraColor_Short() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:291:1: ( ruleCameraColor_Short EOF )
            // InternalShortDSLParser.g:292:1: ruleCameraColor_Short EOF
            {
             before(grammarAccess.getCameraColor_ShortRule()); 
            pushFollow(FOLLOW_1);
            ruleCameraColor_Short();

            state._fsp--;

             after(grammarAccess.getCameraColor_ShortRule()); 
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
    // $ANTLR end "entryRuleCameraColor_Short"


    // $ANTLR start "ruleCameraColor_Short"
    // InternalShortDSLParser.g:299:1: ruleCameraColor_Short : ( ( rule__CameraColor_Short__Group__0 ) ) ;
    public final void ruleCameraColor_Short() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:303:2: ( ( ( rule__CameraColor_Short__Group__0 ) ) )
            // InternalShortDSLParser.g:304:2: ( ( rule__CameraColor_Short__Group__0 ) )
            {
            // InternalShortDSLParser.g:304:2: ( ( rule__CameraColor_Short__Group__0 ) )
            // InternalShortDSLParser.g:305:3: ( rule__CameraColor_Short__Group__0 )
            {
             before(grammarAccess.getCameraColor_ShortAccess().getGroup()); 
            // InternalShortDSLParser.g:306:3: ( rule__CameraColor_Short__Group__0 )
            // InternalShortDSLParser.g:306:4: rule__CameraColor_Short__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CameraColor_Short__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCameraColor_ShortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCameraColor_Short"


    // $ANTLR start "entryRuleDeviceHandling_Short"
    // InternalShortDSLParser.g:315:1: entryRuleDeviceHandling_Short : ruleDeviceHandling_Short EOF ;
    public final void entryRuleDeviceHandling_Short() throws RecognitionException {
        try {
            // InternalShortDSLParser.g:316:1: ( ruleDeviceHandling_Short EOF )
            // InternalShortDSLParser.g:317:1: ruleDeviceHandling_Short EOF
            {
             before(grammarAccess.getDeviceHandling_ShortRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceHandling_Short();

            state._fsp--;

             after(grammarAccess.getDeviceHandling_ShortRule()); 
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
    // $ANTLR end "entryRuleDeviceHandling_Short"


    // $ANTLR start "ruleDeviceHandling_Short"
    // InternalShortDSLParser.g:324:1: ruleDeviceHandling_Short : ( ( rule__DeviceHandling_Short__Group__0 ) ) ;
    public final void ruleDeviceHandling_Short() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:328:2: ( ( ( rule__DeviceHandling_Short__Group__0 ) ) )
            // InternalShortDSLParser.g:329:2: ( ( rule__DeviceHandling_Short__Group__0 ) )
            {
            // InternalShortDSLParser.g:329:2: ( ( rule__DeviceHandling_Short__Group__0 ) )
            // InternalShortDSLParser.g:330:3: ( rule__DeviceHandling_Short__Group__0 )
            {
             before(grammarAccess.getDeviceHandling_ShortAccess().getGroup()); 
            // InternalShortDSLParser.g:331:3: ( rule__DeviceHandling_Short__Group__0 )
            // InternalShortDSLParser.g:331:4: rule__DeviceHandling_Short__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeviceHandling_Short__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceHandling_ShortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceHandling_Short"


    // $ANTLR start "rule__Device_Short__Alternatives"
    // InternalShortDSLParser.g:339:1: rule__Device_Short__Alternatives : ( ( ruleCrane_Short ) | ( ruleDisk_Short ) | ( ruleCamera_Short ) );
    public final void rule__Device_Short__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:343:1: ( ( ruleCrane_Short ) | ( ruleDisk_Short ) | ( ruleCamera_Short ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==Colon) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==RULE_BEGIN) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==RULE_ID) ) {
                            int LA1_5 = input.LA(5);

                            if ( (LA1_5==Colon) ) {
                                alt1=1;
                            }
                            else if ( (LA1_5==Comma||(LA1_5>=RULE_END && LA1_5<=RULE_ID)) ) {
                                alt1=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_1==LeftParenthesis) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalShortDSLParser.g:344:2: ( ruleCrane_Short )
                    {
                    // InternalShortDSLParser.g:344:2: ( ruleCrane_Short )
                    // InternalShortDSLParser.g:345:3: ruleCrane_Short
                    {
                     before(grammarAccess.getDevice_ShortAccess().getCrane_ShortParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCrane_Short();

                    state._fsp--;

                     after(grammarAccess.getDevice_ShortAccess().getCrane_ShortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShortDSLParser.g:350:2: ( ruleDisk_Short )
                    {
                    // InternalShortDSLParser.g:350:2: ( ruleDisk_Short )
                    // InternalShortDSLParser.g:351:3: ruleDisk_Short
                    {
                     before(grammarAccess.getDevice_ShortAccess().getDisk_ShortParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDisk_Short();

                    state._fsp--;

                     after(grammarAccess.getDevice_ShortAccess().getDisk_ShortParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShortDSLParser.g:356:2: ( ruleCamera_Short )
                    {
                    // InternalShortDSLParser.g:356:2: ( ruleCamera_Short )
                    // InternalShortDSLParser.g:357:3: ruleCamera_Short
                    {
                     before(grammarAccess.getDevice_ShortAccess().getCamera_ShortParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCamera_Short();

                    state._fsp--;

                     after(grammarAccess.getDevice_ShortAccess().getCamera_ShortParserRuleCall_2()); 

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
    // $ANTLR end "rule__Device_Short__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalShortDSLParser.g:366:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:370:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalShortDSLParser.g:371:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalShortDSLParser.g:378:1: rule__Model__Group__0__Impl : ( Use ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:382:1: ( ( Use ) )
            // InternalShortDSLParser.g:383:1: ( Use )
            {
            // InternalShortDSLParser.g:383:1: ( Use )
            // InternalShortDSLParser.g:384:2: Use
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
    // InternalShortDSLParser.g:393:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:397:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalShortDSLParser.g:398:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalShortDSLParser.g:405:1: rule__Model__Group__1__Impl : ( Dsl ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:409:1: ( ( Dsl ) )
            // InternalShortDSLParser.g:410:1: ( Dsl )
            {
            // InternalShortDSLParser.g:410:1: ( Dsl )
            // InternalShortDSLParser.g:411:2: Dsl
            {
             before(grammarAccess.getModelAccess().getDslKeyword_1()); 
            match(input,Dsl,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getDslKeyword_1()); 

            }


            }

        }
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
    // InternalShortDSLParser.g:420:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:424:1: ( rule__Model__Group__2__Impl )
            // InternalShortDSLParser.g:425:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalShortDSLParser.g:431:1: rule__Model__Group__2__Impl : ( ( rule__Model__TypeAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:435:1: ( ( ( rule__Model__TypeAssignment_2 ) ) )
            // InternalShortDSLParser.g:436:1: ( ( rule__Model__TypeAssignment_2 ) )
            {
            // InternalShortDSLParser.g:436:1: ( ( rule__Model__TypeAssignment_2 ) )
            // InternalShortDSLParser.g:437:2: ( rule__Model__TypeAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getTypeAssignment_2()); 
            // InternalShortDSLParser.g:438:2: ( rule__Model__TypeAssignment_2 )
            // InternalShortDSLParser.g:438:3: rule__Model__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTypeAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__DSL_Short__Group__0"
    // InternalShortDSLParser.g:447:1: rule__DSL_Short__Group__0 : rule__DSL_Short__Group__0__Impl rule__DSL_Short__Group__1 ;
    public final void rule__DSL_Short__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:451:1: ( rule__DSL_Short__Group__0__Impl rule__DSL_Short__Group__1 )
            // InternalShortDSLParser.g:452:2: rule__DSL_Short__Group__0__Impl rule__DSL_Short__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalShortDSLParser.g:459:1: rule__DSL_Short__Group__0__Impl : ( () ) ;
    public final void rule__DSL_Short__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:463:1: ( ( () ) )
            // InternalShortDSLParser.g:464:1: ( () )
            {
            // InternalShortDSLParser.g:464:1: ( () )
            // InternalShortDSLParser.g:465:2: ()
            {
             before(grammarAccess.getDSL_ShortAccess().getDSLShortAction_0()); 
            // InternalShortDSLParser.g:466:2: ()
            // InternalShortDSLParser.g:466:3: 
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
    // InternalShortDSLParser.g:474:1: rule__DSL_Short__Group__1 : rule__DSL_Short__Group__1__Impl rule__DSL_Short__Group__2 ;
    public final void rule__DSL_Short__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:478:1: ( rule__DSL_Short__Group__1__Impl rule__DSL_Short__Group__2 )
            // InternalShortDSLParser.g:479:2: rule__DSL_Short__Group__1__Impl rule__DSL_Short__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalShortDSLParser.g:486:1: rule__DSL_Short__Group__1__Impl : ( ( rule__DSL_Short__ConfigurationAssignment_1 ) ) ;
    public final void rule__DSL_Short__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:490:1: ( ( ( rule__DSL_Short__ConfigurationAssignment_1 ) ) )
            // InternalShortDSLParser.g:491:1: ( ( rule__DSL_Short__ConfigurationAssignment_1 ) )
            {
            // InternalShortDSLParser.g:491:1: ( ( rule__DSL_Short__ConfigurationAssignment_1 ) )
            // InternalShortDSLParser.g:492:2: ( rule__DSL_Short__ConfigurationAssignment_1 )
            {
             before(grammarAccess.getDSL_ShortAccess().getConfigurationAssignment_1()); 
            // InternalShortDSLParser.g:493:2: ( rule__DSL_Short__ConfigurationAssignment_1 )
            // InternalShortDSLParser.g:493:3: rule__DSL_Short__ConfigurationAssignment_1
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
    // InternalShortDSLParser.g:501:1: rule__DSL_Short__Group__2 : rule__DSL_Short__Group__2__Impl ;
    public final void rule__DSL_Short__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:505:1: ( rule__DSL_Short__Group__2__Impl )
            // InternalShortDSLParser.g:506:2: rule__DSL_Short__Group__2__Impl
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
    // InternalShortDSLParser.g:512:1: rule__DSL_Short__Group__2__Impl : ( ( rule__DSL_Short__DeviceHandlingsAssignment_2 ) ) ;
    public final void rule__DSL_Short__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:516:1: ( ( ( rule__DSL_Short__DeviceHandlingsAssignment_2 ) ) )
            // InternalShortDSLParser.g:517:1: ( ( rule__DSL_Short__DeviceHandlingsAssignment_2 ) )
            {
            // InternalShortDSLParser.g:517:1: ( ( rule__DSL_Short__DeviceHandlingsAssignment_2 ) )
            // InternalShortDSLParser.g:518:2: ( rule__DSL_Short__DeviceHandlingsAssignment_2 )
            {
             before(grammarAccess.getDSL_ShortAccess().getDeviceHandlingsAssignment_2()); 
            // InternalShortDSLParser.g:519:2: ( rule__DSL_Short__DeviceHandlingsAssignment_2 )
            // InternalShortDSLParser.g:519:3: rule__DSL_Short__DeviceHandlingsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DSL_Short__DeviceHandlingsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDSL_ShortAccess().getDeviceHandlingsAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Configuration_Short__Group__0"
    // InternalShortDSLParser.g:528:1: rule__Configuration_Short__Group__0 : rule__Configuration_Short__Group__0__Impl rule__Configuration_Short__Group__1 ;
    public final void rule__Configuration_Short__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:532:1: ( rule__Configuration_Short__Group__0__Impl rule__Configuration_Short__Group__1 )
            // InternalShortDSLParser.g:533:2: rule__Configuration_Short__Group__0__Impl rule__Configuration_Short__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Configuration_Short__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Short__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Short__Group__0"


    // $ANTLR start "rule__Configuration_Short__Group__0__Impl"
    // InternalShortDSLParser.g:540:1: rule__Configuration_Short__Group__0__Impl : ( Devices ) ;
    public final void rule__Configuration_Short__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:544:1: ( ( Devices ) )
            // InternalShortDSLParser.g:545:1: ( Devices )
            {
            // InternalShortDSLParser.g:545:1: ( Devices )
            // InternalShortDSLParser.g:546:2: Devices
            {
             before(grammarAccess.getConfiguration_ShortAccess().getDevicesKeyword_0()); 
            match(input,Devices,FOLLOW_2); 
             after(grammarAccess.getConfiguration_ShortAccess().getDevicesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Short__Group__0__Impl"


    // $ANTLR start "rule__Configuration_Short__Group__1"
    // InternalShortDSLParser.g:555:1: rule__Configuration_Short__Group__1 : rule__Configuration_Short__Group__1__Impl rule__Configuration_Short__Group__2 ;
    public final void rule__Configuration_Short__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:559:1: ( rule__Configuration_Short__Group__1__Impl rule__Configuration_Short__Group__2 )
            // InternalShortDSLParser.g:560:2: rule__Configuration_Short__Group__1__Impl rule__Configuration_Short__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Configuration_Short__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Short__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Short__Group__1"


    // $ANTLR start "rule__Configuration_Short__Group__1__Impl"
    // InternalShortDSLParser.g:567:1: rule__Configuration_Short__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Configuration_Short__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:571:1: ( ( LeftCurlyBracket ) )
            // InternalShortDSLParser.g:572:1: ( LeftCurlyBracket )
            {
            // InternalShortDSLParser.g:572:1: ( LeftCurlyBracket )
            // InternalShortDSLParser.g:573:2: LeftCurlyBracket
            {
             before(grammarAccess.getConfiguration_ShortAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getConfiguration_ShortAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Short__Group__1__Impl"


    // $ANTLR start "rule__Configuration_Short__Group__2"
    // InternalShortDSLParser.g:582:1: rule__Configuration_Short__Group__2 : rule__Configuration_Short__Group__2__Impl rule__Configuration_Short__Group__3 ;
    public final void rule__Configuration_Short__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:586:1: ( rule__Configuration_Short__Group__2__Impl rule__Configuration_Short__Group__3 )
            // InternalShortDSLParser.g:587:2: rule__Configuration_Short__Group__2__Impl rule__Configuration_Short__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Configuration_Short__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Short__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Short__Group__2"


    // $ANTLR start "rule__Configuration_Short__Group__2__Impl"
    // InternalShortDSLParser.g:594:1: rule__Configuration_Short__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__Configuration_Short__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:598:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:599:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:599:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:600:2: RULE_BEGIN
            {
             before(grammarAccess.getConfiguration_ShortAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getConfiguration_ShortAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Short__Group__2__Impl"


    // $ANTLR start "rule__Configuration_Short__Group__3"
    // InternalShortDSLParser.g:609:1: rule__Configuration_Short__Group__3 : rule__Configuration_Short__Group__3__Impl rule__Configuration_Short__Group__4 ;
    public final void rule__Configuration_Short__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:613:1: ( rule__Configuration_Short__Group__3__Impl rule__Configuration_Short__Group__4 )
            // InternalShortDSLParser.g:614:2: rule__Configuration_Short__Group__3__Impl rule__Configuration_Short__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Configuration_Short__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Short__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Short__Group__3"


    // $ANTLR start "rule__Configuration_Short__Group__3__Impl"
    // InternalShortDSLParser.g:621:1: rule__Configuration_Short__Group__3__Impl : ( ( ( rule__Configuration_Short__DevicesAssignment_3 ) ) ( ( rule__Configuration_Short__DevicesAssignment_3 )* ) ) ;
    public final void rule__Configuration_Short__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:625:1: ( ( ( ( rule__Configuration_Short__DevicesAssignment_3 ) ) ( ( rule__Configuration_Short__DevicesAssignment_3 )* ) ) )
            // InternalShortDSLParser.g:626:1: ( ( ( rule__Configuration_Short__DevicesAssignment_3 ) ) ( ( rule__Configuration_Short__DevicesAssignment_3 )* ) )
            {
            // InternalShortDSLParser.g:626:1: ( ( ( rule__Configuration_Short__DevicesAssignment_3 ) ) ( ( rule__Configuration_Short__DevicesAssignment_3 )* ) )
            // InternalShortDSLParser.g:627:2: ( ( rule__Configuration_Short__DevicesAssignment_3 ) ) ( ( rule__Configuration_Short__DevicesAssignment_3 )* )
            {
            // InternalShortDSLParser.g:627:2: ( ( rule__Configuration_Short__DevicesAssignment_3 ) )
            // InternalShortDSLParser.g:628:3: ( rule__Configuration_Short__DevicesAssignment_3 )
            {
             before(grammarAccess.getConfiguration_ShortAccess().getDevicesAssignment_3()); 
            // InternalShortDSLParser.g:629:3: ( rule__Configuration_Short__DevicesAssignment_3 )
            // InternalShortDSLParser.g:629:4: rule__Configuration_Short__DevicesAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__Configuration_Short__DevicesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_ShortAccess().getDevicesAssignment_3()); 

            }

            // InternalShortDSLParser.g:632:2: ( ( rule__Configuration_Short__DevicesAssignment_3 )* )
            // InternalShortDSLParser.g:633:3: ( rule__Configuration_Short__DevicesAssignment_3 )*
            {
             before(grammarAccess.getConfiguration_ShortAccess().getDevicesAssignment_3()); 
            // InternalShortDSLParser.g:634:3: ( rule__Configuration_Short__DevicesAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalShortDSLParser.g:634:4: rule__Configuration_Short__DevicesAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Configuration_Short__DevicesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getConfiguration_ShortAccess().getDevicesAssignment_3()); 

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
    // $ANTLR end "rule__Configuration_Short__Group__3__Impl"


    // $ANTLR start "rule__Configuration_Short__Group__4"
    // InternalShortDSLParser.g:643:1: rule__Configuration_Short__Group__4 : rule__Configuration_Short__Group__4__Impl rule__Configuration_Short__Group__5 ;
    public final void rule__Configuration_Short__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:647:1: ( rule__Configuration_Short__Group__4__Impl rule__Configuration_Short__Group__5 )
            // InternalShortDSLParser.g:648:2: rule__Configuration_Short__Group__4__Impl rule__Configuration_Short__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Configuration_Short__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Short__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Short__Group__4"


    // $ANTLR start "rule__Configuration_Short__Group__4__Impl"
    // InternalShortDSLParser.g:655:1: rule__Configuration_Short__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Configuration_Short__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:659:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:660:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:660:1: ( RULE_END )
            // InternalShortDSLParser.g:661:2: RULE_END
            {
             before(grammarAccess.getConfiguration_ShortAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getConfiguration_ShortAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Short__Group__4__Impl"


    // $ANTLR start "rule__Configuration_Short__Group__5"
    // InternalShortDSLParser.g:670:1: rule__Configuration_Short__Group__5 : rule__Configuration_Short__Group__5__Impl ;
    public final void rule__Configuration_Short__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:674:1: ( rule__Configuration_Short__Group__5__Impl )
            // InternalShortDSLParser.g:675:2: rule__Configuration_Short__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Short__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Short__Group__5"


    // $ANTLR start "rule__Configuration_Short__Group__5__Impl"
    // InternalShortDSLParser.g:681:1: rule__Configuration_Short__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__Configuration_Short__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:685:1: ( ( RightCurlyBracket ) )
            // InternalShortDSLParser.g:686:1: ( RightCurlyBracket )
            {
            // InternalShortDSLParser.g:686:1: ( RightCurlyBracket )
            // InternalShortDSLParser.g:687:2: RightCurlyBracket
            {
             before(grammarAccess.getConfiguration_ShortAccess().getRightCurlyBracketKeyword_5()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getConfiguration_ShortAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Short__Group__5__Impl"


    // $ANTLR start "rule__Crane_Short__Group__0"
    // InternalShortDSLParser.g:697:1: rule__Crane_Short__Group__0 : rule__Crane_Short__Group__0__Impl rule__Crane_Short__Group__1 ;
    public final void rule__Crane_Short__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:701:1: ( rule__Crane_Short__Group__0__Impl rule__Crane_Short__Group__1 )
            // InternalShortDSLParser.g:702:2: rule__Crane_Short__Group__0__Impl rule__Crane_Short__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Crane_Short__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Crane_Short__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crane_Short__Group__0"


    // $ANTLR start "rule__Crane_Short__Group__0__Impl"
    // InternalShortDSLParser.g:709:1: rule__Crane_Short__Group__0__Impl : ( ( rule__Crane_Short__NameAssignment_0 ) ) ;
    public final void rule__Crane_Short__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:713:1: ( ( ( rule__Crane_Short__NameAssignment_0 ) ) )
            // InternalShortDSLParser.g:714:1: ( ( rule__Crane_Short__NameAssignment_0 ) )
            {
            // InternalShortDSLParser.g:714:1: ( ( rule__Crane_Short__NameAssignment_0 ) )
            // InternalShortDSLParser.g:715:2: ( rule__Crane_Short__NameAssignment_0 )
            {
             before(grammarAccess.getCrane_ShortAccess().getNameAssignment_0()); 
            // InternalShortDSLParser.g:716:2: ( rule__Crane_Short__NameAssignment_0 )
            // InternalShortDSLParser.g:716:3: rule__Crane_Short__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Crane_Short__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCrane_ShortAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crane_Short__Group__0__Impl"


    // $ANTLR start "rule__Crane_Short__Group__1"
    // InternalShortDSLParser.g:724:1: rule__Crane_Short__Group__1 : rule__Crane_Short__Group__1__Impl rule__Crane_Short__Group__2 ;
    public final void rule__Crane_Short__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:728:1: ( rule__Crane_Short__Group__1__Impl rule__Crane_Short__Group__2 )
            // InternalShortDSLParser.g:729:2: rule__Crane_Short__Group__1__Impl rule__Crane_Short__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Crane_Short__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Crane_Short__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crane_Short__Group__1"


    // $ANTLR start "rule__Crane_Short__Group__1__Impl"
    // InternalShortDSLParser.g:736:1: rule__Crane_Short__Group__1__Impl : ( Colon ) ;
    public final void rule__Crane_Short__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:740:1: ( ( Colon ) )
            // InternalShortDSLParser.g:741:1: ( Colon )
            {
            // InternalShortDSLParser.g:741:1: ( Colon )
            // InternalShortDSLParser.g:742:2: Colon
            {
             before(grammarAccess.getCrane_ShortAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCrane_ShortAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crane_Short__Group__1__Impl"


    // $ANTLR start "rule__Crane_Short__Group__2"
    // InternalShortDSLParser.g:751:1: rule__Crane_Short__Group__2 : rule__Crane_Short__Group__2__Impl rule__Crane_Short__Group__3 ;
    public final void rule__Crane_Short__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:755:1: ( rule__Crane_Short__Group__2__Impl rule__Crane_Short__Group__3 )
            // InternalShortDSLParser.g:756:2: rule__Crane_Short__Group__2__Impl rule__Crane_Short__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Crane_Short__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Crane_Short__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crane_Short__Group__2"


    // $ANTLR start "rule__Crane_Short__Group__2__Impl"
    // InternalShortDSLParser.g:763:1: rule__Crane_Short__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__Crane_Short__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:767:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:768:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:768:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:769:2: RULE_BEGIN
            {
             before(grammarAccess.getCrane_ShortAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getCrane_ShortAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crane_Short__Group__2__Impl"


    // $ANTLR start "rule__Crane_Short__Group__3"
    // InternalShortDSLParser.g:778:1: rule__Crane_Short__Group__3 : rule__Crane_Short__Group__3__Impl rule__Crane_Short__Group__4 ;
    public final void rule__Crane_Short__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:782:1: ( rule__Crane_Short__Group__3__Impl rule__Crane_Short__Group__4 )
            // InternalShortDSLParser.g:783:2: rule__Crane_Short__Group__3__Impl rule__Crane_Short__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Crane_Short__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Crane_Short__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crane_Short__Group__3"


    // $ANTLR start "rule__Crane_Short__Group__3__Impl"
    // InternalShortDSLParser.g:790:1: rule__Crane_Short__Group__3__Impl : ( ( ( rule__Crane_Short__PositionsAssignment_3 ) ) ( ( rule__Crane_Short__PositionsAssignment_3 )* ) ) ;
    public final void rule__Crane_Short__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:794:1: ( ( ( ( rule__Crane_Short__PositionsAssignment_3 ) ) ( ( rule__Crane_Short__PositionsAssignment_3 )* ) ) )
            // InternalShortDSLParser.g:795:1: ( ( ( rule__Crane_Short__PositionsAssignment_3 ) ) ( ( rule__Crane_Short__PositionsAssignment_3 )* ) )
            {
            // InternalShortDSLParser.g:795:1: ( ( ( rule__Crane_Short__PositionsAssignment_3 ) ) ( ( rule__Crane_Short__PositionsAssignment_3 )* ) )
            // InternalShortDSLParser.g:796:2: ( ( rule__Crane_Short__PositionsAssignment_3 ) ) ( ( rule__Crane_Short__PositionsAssignment_3 )* )
            {
            // InternalShortDSLParser.g:796:2: ( ( rule__Crane_Short__PositionsAssignment_3 ) )
            // InternalShortDSLParser.g:797:3: ( rule__Crane_Short__PositionsAssignment_3 )
            {
             before(grammarAccess.getCrane_ShortAccess().getPositionsAssignment_3()); 
            // InternalShortDSLParser.g:798:3: ( rule__Crane_Short__PositionsAssignment_3 )
            // InternalShortDSLParser.g:798:4: rule__Crane_Short__PositionsAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__Crane_Short__PositionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCrane_ShortAccess().getPositionsAssignment_3()); 

            }

            // InternalShortDSLParser.g:801:2: ( ( rule__Crane_Short__PositionsAssignment_3 )* )
            // InternalShortDSLParser.g:802:3: ( rule__Crane_Short__PositionsAssignment_3 )*
            {
             before(grammarAccess.getCrane_ShortAccess().getPositionsAssignment_3()); 
            // InternalShortDSLParser.g:803:3: ( rule__Crane_Short__PositionsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalShortDSLParser.g:803:4: rule__Crane_Short__PositionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Crane_Short__PositionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getCrane_ShortAccess().getPositionsAssignment_3()); 

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
    // $ANTLR end "rule__Crane_Short__Group__3__Impl"


    // $ANTLR start "rule__Crane_Short__Group__4"
    // InternalShortDSLParser.g:812:1: rule__Crane_Short__Group__4 : rule__Crane_Short__Group__4__Impl ;
    public final void rule__Crane_Short__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:816:1: ( rule__Crane_Short__Group__4__Impl )
            // InternalShortDSLParser.g:817:2: rule__Crane_Short__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Crane_Short__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crane_Short__Group__4"


    // $ANTLR start "rule__Crane_Short__Group__4__Impl"
    // InternalShortDSLParser.g:823:1: rule__Crane_Short__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Crane_Short__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:827:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:828:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:828:1: ( RULE_END )
            // InternalShortDSLParser.g:829:2: RULE_END
            {
             before(grammarAccess.getCrane_ShortAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getCrane_ShortAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crane_Short__Group__4__Impl"


    // $ANTLR start "rule__CranePosition_Short__Group__0"
    // InternalShortDSLParser.g:839:1: rule__CranePosition_Short__Group__0 : rule__CranePosition_Short__Group__0__Impl rule__CranePosition_Short__Group__1 ;
    public final void rule__CranePosition_Short__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:843:1: ( rule__CranePosition_Short__Group__0__Impl rule__CranePosition_Short__Group__1 )
            // InternalShortDSLParser.g:844:2: rule__CranePosition_Short__Group__0__Impl rule__CranePosition_Short__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__CranePosition_Short__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CranePosition_Short__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CranePosition_Short__Group__0"


    // $ANTLR start "rule__CranePosition_Short__Group__0__Impl"
    // InternalShortDSLParser.g:851:1: rule__CranePosition_Short__Group__0__Impl : ( ( rule__CranePosition_Short__NameAssignment_0 ) ) ;
    public final void rule__CranePosition_Short__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:855:1: ( ( ( rule__CranePosition_Short__NameAssignment_0 ) ) )
            // InternalShortDSLParser.g:856:1: ( ( rule__CranePosition_Short__NameAssignment_0 ) )
            {
            // InternalShortDSLParser.g:856:1: ( ( rule__CranePosition_Short__NameAssignment_0 ) )
            // InternalShortDSLParser.g:857:2: ( rule__CranePosition_Short__NameAssignment_0 )
            {
             before(grammarAccess.getCranePosition_ShortAccess().getNameAssignment_0()); 
            // InternalShortDSLParser.g:858:2: ( rule__CranePosition_Short__NameAssignment_0 )
            // InternalShortDSLParser.g:858:3: rule__CranePosition_Short__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CranePosition_Short__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCranePosition_ShortAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CranePosition_Short__Group__0__Impl"


    // $ANTLR start "rule__CranePosition_Short__Group__1"
    // InternalShortDSLParser.g:866:1: rule__CranePosition_Short__Group__1 : rule__CranePosition_Short__Group__1__Impl rule__CranePosition_Short__Group__2 ;
    public final void rule__CranePosition_Short__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:870:1: ( rule__CranePosition_Short__Group__1__Impl rule__CranePosition_Short__Group__2 )
            // InternalShortDSLParser.g:871:2: rule__CranePosition_Short__Group__1__Impl rule__CranePosition_Short__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__CranePosition_Short__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CranePosition_Short__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CranePosition_Short__Group__1"


    // $ANTLR start "rule__CranePosition_Short__Group__1__Impl"
    // InternalShortDSLParser.g:878:1: rule__CranePosition_Short__Group__1__Impl : ( Colon ) ;
    public final void rule__CranePosition_Short__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:882:1: ( ( Colon ) )
            // InternalShortDSLParser.g:883:1: ( Colon )
            {
            // InternalShortDSLParser.g:883:1: ( Colon )
            // InternalShortDSLParser.g:884:2: Colon
            {
             before(grammarAccess.getCranePosition_ShortAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCranePosition_ShortAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CranePosition_Short__Group__1__Impl"


    // $ANTLR start "rule__CranePosition_Short__Group__2"
    // InternalShortDSLParser.g:893:1: rule__CranePosition_Short__Group__2 : rule__CranePosition_Short__Group__2__Impl rule__CranePosition_Short__Group__3 ;
    public final void rule__CranePosition_Short__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:897:1: ( rule__CranePosition_Short__Group__2__Impl rule__CranePosition_Short__Group__3 )
            // InternalShortDSLParser.g:898:2: rule__CranePosition_Short__Group__2__Impl rule__CranePosition_Short__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__CranePosition_Short__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CranePosition_Short__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CranePosition_Short__Group__2"


    // $ANTLR start "rule__CranePosition_Short__Group__2__Impl"
    // InternalShortDSLParser.g:905:1: rule__CranePosition_Short__Group__2__Impl : ( ( rule__CranePosition_Short__PositionAssignment_2 ) ) ;
    public final void rule__CranePosition_Short__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:909:1: ( ( ( rule__CranePosition_Short__PositionAssignment_2 ) ) )
            // InternalShortDSLParser.g:910:1: ( ( rule__CranePosition_Short__PositionAssignment_2 ) )
            {
            // InternalShortDSLParser.g:910:1: ( ( rule__CranePosition_Short__PositionAssignment_2 ) )
            // InternalShortDSLParser.g:911:2: ( rule__CranePosition_Short__PositionAssignment_2 )
            {
             before(grammarAccess.getCranePosition_ShortAccess().getPositionAssignment_2()); 
            // InternalShortDSLParser.g:912:2: ( rule__CranePosition_Short__PositionAssignment_2 )
            // InternalShortDSLParser.g:912:3: rule__CranePosition_Short__PositionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CranePosition_Short__PositionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCranePosition_ShortAccess().getPositionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CranePosition_Short__Group__2__Impl"


    // $ANTLR start "rule__CranePosition_Short__Group__3"
    // InternalShortDSLParser.g:920:1: rule__CranePosition_Short__Group__3 : rule__CranePosition_Short__Group__3__Impl ;
    public final void rule__CranePosition_Short__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:924:1: ( rule__CranePosition_Short__Group__3__Impl )
            // InternalShortDSLParser.g:925:2: rule__CranePosition_Short__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CranePosition_Short__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CranePosition_Short__Group__3"


    // $ANTLR start "rule__CranePosition_Short__Group__3__Impl"
    // InternalShortDSLParser.g:931:1: rule__CranePosition_Short__Group__3__Impl : ( ( Comma )? ) ;
    public final void rule__CranePosition_Short__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:935:1: ( ( ( Comma )? ) )
            // InternalShortDSLParser.g:936:1: ( ( Comma )? )
            {
            // InternalShortDSLParser.g:936:1: ( ( Comma )? )
            // InternalShortDSLParser.g:937:2: ( Comma )?
            {
             before(grammarAccess.getCranePosition_ShortAccess().getCommaKeyword_3()); 
            // InternalShortDSLParser.g:938:2: ( Comma )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Comma) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalShortDSLParser.g:938:3: Comma
                    {
                    match(input,Comma,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCranePosition_ShortAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CranePosition_Short__Group__3__Impl"


    // $ANTLR start "rule__Disk_Short__Group__0"
    // InternalShortDSLParser.g:947:1: rule__Disk_Short__Group__0 : rule__Disk_Short__Group__0__Impl rule__Disk_Short__Group__1 ;
    public final void rule__Disk_Short__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:951:1: ( rule__Disk_Short__Group__0__Impl rule__Disk_Short__Group__1 )
            // InternalShortDSLParser.g:952:2: rule__Disk_Short__Group__0__Impl rule__Disk_Short__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Disk_Short__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Disk_Short__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__Group__0"


    // $ANTLR start "rule__Disk_Short__Group__0__Impl"
    // InternalShortDSLParser.g:959:1: rule__Disk_Short__Group__0__Impl : ( ( rule__Disk_Short__NameAssignment_0 ) ) ;
    public final void rule__Disk_Short__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:963:1: ( ( ( rule__Disk_Short__NameAssignment_0 ) ) )
            // InternalShortDSLParser.g:964:1: ( ( rule__Disk_Short__NameAssignment_0 ) )
            {
            // InternalShortDSLParser.g:964:1: ( ( rule__Disk_Short__NameAssignment_0 ) )
            // InternalShortDSLParser.g:965:2: ( rule__Disk_Short__NameAssignment_0 )
            {
             before(grammarAccess.getDisk_ShortAccess().getNameAssignment_0()); 
            // InternalShortDSLParser.g:966:2: ( rule__Disk_Short__NameAssignment_0 )
            // InternalShortDSLParser.g:966:3: rule__Disk_Short__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Disk_Short__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDisk_ShortAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__Group__0__Impl"


    // $ANTLR start "rule__Disk_Short__Group__1"
    // InternalShortDSLParser.g:974:1: rule__Disk_Short__Group__1 : rule__Disk_Short__Group__1__Impl rule__Disk_Short__Group__2 ;
    public final void rule__Disk_Short__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:978:1: ( rule__Disk_Short__Group__1__Impl rule__Disk_Short__Group__2 )
            // InternalShortDSLParser.g:979:2: rule__Disk_Short__Group__1__Impl rule__Disk_Short__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Disk_Short__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Disk_Short__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__Group__1"


    // $ANTLR start "rule__Disk_Short__Group__1__Impl"
    // InternalShortDSLParser.g:986:1: rule__Disk_Short__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__Disk_Short__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:990:1: ( ( LeftParenthesis ) )
            // InternalShortDSLParser.g:991:1: ( LeftParenthesis )
            {
            // InternalShortDSLParser.g:991:1: ( LeftParenthesis )
            // InternalShortDSLParser.g:992:2: LeftParenthesis
            {
             before(grammarAccess.getDisk_ShortAccess().getLeftParenthesisKeyword_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getDisk_ShortAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__Group__1__Impl"


    // $ANTLR start "rule__Disk_Short__Group__2"
    // InternalShortDSLParser.g:1001:1: rule__Disk_Short__Group__2 : rule__Disk_Short__Group__2__Impl rule__Disk_Short__Group__3 ;
    public final void rule__Disk_Short__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1005:1: ( rule__Disk_Short__Group__2__Impl rule__Disk_Short__Group__3 )
            // InternalShortDSLParser.g:1006:2: rule__Disk_Short__Group__2__Impl rule__Disk_Short__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Disk_Short__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Disk_Short__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__Group__2"


    // $ANTLR start "rule__Disk_Short__Group__2__Impl"
    // InternalShortDSLParser.g:1013:1: rule__Disk_Short__Group__2__Impl : ( ( rule__Disk_Short__NSlotsAssignment_2 ) ) ;
    public final void rule__Disk_Short__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1017:1: ( ( ( rule__Disk_Short__NSlotsAssignment_2 ) ) )
            // InternalShortDSLParser.g:1018:1: ( ( rule__Disk_Short__NSlotsAssignment_2 ) )
            {
            // InternalShortDSLParser.g:1018:1: ( ( rule__Disk_Short__NSlotsAssignment_2 ) )
            // InternalShortDSLParser.g:1019:2: ( rule__Disk_Short__NSlotsAssignment_2 )
            {
             before(grammarAccess.getDisk_ShortAccess().getNSlotsAssignment_2()); 
            // InternalShortDSLParser.g:1020:2: ( rule__Disk_Short__NSlotsAssignment_2 )
            // InternalShortDSLParser.g:1020:3: rule__Disk_Short__NSlotsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Disk_Short__NSlotsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDisk_ShortAccess().getNSlotsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__Group__2__Impl"


    // $ANTLR start "rule__Disk_Short__Group__3"
    // InternalShortDSLParser.g:1028:1: rule__Disk_Short__Group__3 : rule__Disk_Short__Group__3__Impl rule__Disk_Short__Group__4 ;
    public final void rule__Disk_Short__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1032:1: ( rule__Disk_Short__Group__3__Impl rule__Disk_Short__Group__4 )
            // InternalShortDSLParser.g:1033:2: rule__Disk_Short__Group__3__Impl rule__Disk_Short__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Disk_Short__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Disk_Short__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__Group__3"


    // $ANTLR start "rule__Disk_Short__Group__3__Impl"
    // InternalShortDSLParser.g:1040:1: rule__Disk_Short__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__Disk_Short__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1044:1: ( ( RightParenthesis ) )
            // InternalShortDSLParser.g:1045:1: ( RightParenthesis )
            {
            // InternalShortDSLParser.g:1045:1: ( RightParenthesis )
            // InternalShortDSLParser.g:1046:2: RightParenthesis
            {
             before(grammarAccess.getDisk_ShortAccess().getRightParenthesisKeyword_3()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getDisk_ShortAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__Group__3__Impl"


    // $ANTLR start "rule__Disk_Short__Group__4"
    // InternalShortDSLParser.g:1055:1: rule__Disk_Short__Group__4 : rule__Disk_Short__Group__4__Impl rule__Disk_Short__Group__5 ;
    public final void rule__Disk_Short__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1059:1: ( rule__Disk_Short__Group__4__Impl rule__Disk_Short__Group__5 )
            // InternalShortDSLParser.g:1060:2: rule__Disk_Short__Group__4__Impl rule__Disk_Short__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Disk_Short__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Disk_Short__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__Group__4"


    // $ANTLR start "rule__Disk_Short__Group__4__Impl"
    // InternalShortDSLParser.g:1067:1: rule__Disk_Short__Group__4__Impl : ( Colon ) ;
    public final void rule__Disk_Short__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1071:1: ( ( Colon ) )
            // InternalShortDSLParser.g:1072:1: ( Colon )
            {
            // InternalShortDSLParser.g:1072:1: ( Colon )
            // InternalShortDSLParser.g:1073:2: Colon
            {
             before(grammarAccess.getDisk_ShortAccess().getColonKeyword_4()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getDisk_ShortAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__Group__4__Impl"


    // $ANTLR start "rule__Disk_Short__Group__5"
    // InternalShortDSLParser.g:1082:1: rule__Disk_Short__Group__5 : rule__Disk_Short__Group__5__Impl rule__Disk_Short__Group__6 ;
    public final void rule__Disk_Short__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1086:1: ( rule__Disk_Short__Group__5__Impl rule__Disk_Short__Group__6 )
            // InternalShortDSLParser.g:1087:2: rule__Disk_Short__Group__5__Impl rule__Disk_Short__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Disk_Short__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Disk_Short__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__Group__5"


    // $ANTLR start "rule__Disk_Short__Group__5__Impl"
    // InternalShortDSLParser.g:1094:1: rule__Disk_Short__Group__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__Disk_Short__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1098:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:1099:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:1099:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:1100:2: RULE_BEGIN
            {
             before(grammarAccess.getDisk_ShortAccess().getBEGINTerminalRuleCall_5()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getDisk_ShortAccess().getBEGINTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__Group__5__Impl"


    // $ANTLR start "rule__Disk_Short__Group__6"
    // InternalShortDSLParser.g:1109:1: rule__Disk_Short__Group__6 : rule__Disk_Short__Group__6__Impl rule__Disk_Short__Group__7 ;
    public final void rule__Disk_Short__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1113:1: ( rule__Disk_Short__Group__6__Impl rule__Disk_Short__Group__7 )
            // InternalShortDSLParser.g:1114:2: rule__Disk_Short__Group__6__Impl rule__Disk_Short__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Disk_Short__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Disk_Short__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__Group__6"


    // $ANTLR start "rule__Disk_Short__Group__6__Impl"
    // InternalShortDSLParser.g:1121:1: rule__Disk_Short__Group__6__Impl : ( ( ( rule__Disk_Short__ZonesAssignment_6 ) ) ( ( rule__Disk_Short__ZonesAssignment_6 )* ) ) ;
    public final void rule__Disk_Short__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1125:1: ( ( ( ( rule__Disk_Short__ZonesAssignment_6 ) ) ( ( rule__Disk_Short__ZonesAssignment_6 )* ) ) )
            // InternalShortDSLParser.g:1126:1: ( ( ( rule__Disk_Short__ZonesAssignment_6 ) ) ( ( rule__Disk_Short__ZonesAssignment_6 )* ) )
            {
            // InternalShortDSLParser.g:1126:1: ( ( ( rule__Disk_Short__ZonesAssignment_6 ) ) ( ( rule__Disk_Short__ZonesAssignment_6 )* ) )
            // InternalShortDSLParser.g:1127:2: ( ( rule__Disk_Short__ZonesAssignment_6 ) ) ( ( rule__Disk_Short__ZonesAssignment_6 )* )
            {
            // InternalShortDSLParser.g:1127:2: ( ( rule__Disk_Short__ZonesAssignment_6 ) )
            // InternalShortDSLParser.g:1128:3: ( rule__Disk_Short__ZonesAssignment_6 )
            {
             before(grammarAccess.getDisk_ShortAccess().getZonesAssignment_6()); 
            // InternalShortDSLParser.g:1129:3: ( rule__Disk_Short__ZonesAssignment_6 )
            // InternalShortDSLParser.g:1129:4: rule__Disk_Short__ZonesAssignment_6
            {
            pushFollow(FOLLOW_10);
            rule__Disk_Short__ZonesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDisk_ShortAccess().getZonesAssignment_6()); 

            }

            // InternalShortDSLParser.g:1132:2: ( ( rule__Disk_Short__ZonesAssignment_6 )* )
            // InternalShortDSLParser.g:1133:3: ( rule__Disk_Short__ZonesAssignment_6 )*
            {
             before(grammarAccess.getDisk_ShortAccess().getZonesAssignment_6()); 
            // InternalShortDSLParser.g:1134:3: ( rule__Disk_Short__ZonesAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalShortDSLParser.g:1134:4: rule__Disk_Short__ZonesAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Disk_Short__ZonesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getDisk_ShortAccess().getZonesAssignment_6()); 

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
    // $ANTLR end "rule__Disk_Short__Group__6__Impl"


    // $ANTLR start "rule__Disk_Short__Group__7"
    // InternalShortDSLParser.g:1143:1: rule__Disk_Short__Group__7 : rule__Disk_Short__Group__7__Impl ;
    public final void rule__Disk_Short__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1147:1: ( rule__Disk_Short__Group__7__Impl )
            // InternalShortDSLParser.g:1148:2: rule__Disk_Short__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Disk_Short__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__Group__7"


    // $ANTLR start "rule__Disk_Short__Group__7__Impl"
    // InternalShortDSLParser.g:1154:1: rule__Disk_Short__Group__7__Impl : ( RULE_END ) ;
    public final void rule__Disk_Short__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1158:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:1159:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:1159:1: ( RULE_END )
            // InternalShortDSLParser.g:1160:2: RULE_END
            {
             before(grammarAccess.getDisk_ShortAccess().getENDTerminalRuleCall_7()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getDisk_ShortAccess().getENDTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__Group__7__Impl"


    // $ANTLR start "rule__DiskZone_Short__Group__0"
    // InternalShortDSLParser.g:1170:1: rule__DiskZone_Short__Group__0 : rule__DiskZone_Short__Group__0__Impl rule__DiskZone_Short__Group__1 ;
    public final void rule__DiskZone_Short__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1174:1: ( rule__DiskZone_Short__Group__0__Impl rule__DiskZone_Short__Group__1 )
            // InternalShortDSLParser.g:1175:2: rule__DiskZone_Short__Group__0__Impl rule__DiskZone_Short__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__DiskZone_Short__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskZone_Short__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskZone_Short__Group__0"


    // $ANTLR start "rule__DiskZone_Short__Group__0__Impl"
    // InternalShortDSLParser.g:1182:1: rule__DiskZone_Short__Group__0__Impl : ( ( rule__DiskZone_Short__NameAssignment_0 ) ) ;
    public final void rule__DiskZone_Short__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1186:1: ( ( ( rule__DiskZone_Short__NameAssignment_0 ) ) )
            // InternalShortDSLParser.g:1187:1: ( ( rule__DiskZone_Short__NameAssignment_0 ) )
            {
            // InternalShortDSLParser.g:1187:1: ( ( rule__DiskZone_Short__NameAssignment_0 ) )
            // InternalShortDSLParser.g:1188:2: ( rule__DiskZone_Short__NameAssignment_0 )
            {
             before(grammarAccess.getDiskZone_ShortAccess().getNameAssignment_0()); 
            // InternalShortDSLParser.g:1189:2: ( rule__DiskZone_Short__NameAssignment_0 )
            // InternalShortDSLParser.g:1189:3: rule__DiskZone_Short__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DiskZone_Short__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDiskZone_ShortAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskZone_Short__Group__0__Impl"


    // $ANTLR start "rule__DiskZone_Short__Group__1"
    // InternalShortDSLParser.g:1197:1: rule__DiskZone_Short__Group__1 : rule__DiskZone_Short__Group__1__Impl rule__DiskZone_Short__Group__2 ;
    public final void rule__DiskZone_Short__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1201:1: ( rule__DiskZone_Short__Group__1__Impl rule__DiskZone_Short__Group__2 )
            // InternalShortDSLParser.g:1202:2: rule__DiskZone_Short__Group__1__Impl rule__DiskZone_Short__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__DiskZone_Short__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskZone_Short__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskZone_Short__Group__1"


    // $ANTLR start "rule__DiskZone_Short__Group__1__Impl"
    // InternalShortDSLParser.g:1209:1: rule__DiskZone_Short__Group__1__Impl : ( Colon ) ;
    public final void rule__DiskZone_Short__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1213:1: ( ( Colon ) )
            // InternalShortDSLParser.g:1214:1: ( Colon )
            {
            // InternalShortDSLParser.g:1214:1: ( Colon )
            // InternalShortDSLParser.g:1215:2: Colon
            {
             before(grammarAccess.getDiskZone_ShortAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getDiskZone_ShortAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskZone_Short__Group__1__Impl"


    // $ANTLR start "rule__DiskZone_Short__Group__2"
    // InternalShortDSLParser.g:1224:1: rule__DiskZone_Short__Group__2 : rule__DiskZone_Short__Group__2__Impl rule__DiskZone_Short__Group__3 ;
    public final void rule__DiskZone_Short__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1228:1: ( rule__DiskZone_Short__Group__2__Impl rule__DiskZone_Short__Group__3 )
            // InternalShortDSLParser.g:1229:2: rule__DiskZone_Short__Group__2__Impl rule__DiskZone_Short__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__DiskZone_Short__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiskZone_Short__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskZone_Short__Group__2"


    // $ANTLR start "rule__DiskZone_Short__Group__2__Impl"
    // InternalShortDSLParser.g:1236:1: rule__DiskZone_Short__Group__2__Impl : ( ( rule__DiskZone_Short__SlotAssignment_2 ) ) ;
    public final void rule__DiskZone_Short__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1240:1: ( ( ( rule__DiskZone_Short__SlotAssignment_2 ) ) )
            // InternalShortDSLParser.g:1241:1: ( ( rule__DiskZone_Short__SlotAssignment_2 ) )
            {
            // InternalShortDSLParser.g:1241:1: ( ( rule__DiskZone_Short__SlotAssignment_2 ) )
            // InternalShortDSLParser.g:1242:2: ( rule__DiskZone_Short__SlotAssignment_2 )
            {
             before(grammarAccess.getDiskZone_ShortAccess().getSlotAssignment_2()); 
            // InternalShortDSLParser.g:1243:2: ( rule__DiskZone_Short__SlotAssignment_2 )
            // InternalShortDSLParser.g:1243:3: rule__DiskZone_Short__SlotAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DiskZone_Short__SlotAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDiskZone_ShortAccess().getSlotAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskZone_Short__Group__2__Impl"


    // $ANTLR start "rule__DiskZone_Short__Group__3"
    // InternalShortDSLParser.g:1251:1: rule__DiskZone_Short__Group__3 : rule__DiskZone_Short__Group__3__Impl ;
    public final void rule__DiskZone_Short__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1255:1: ( rule__DiskZone_Short__Group__3__Impl )
            // InternalShortDSLParser.g:1256:2: rule__DiskZone_Short__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiskZone_Short__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskZone_Short__Group__3"


    // $ANTLR start "rule__DiskZone_Short__Group__3__Impl"
    // InternalShortDSLParser.g:1262:1: rule__DiskZone_Short__Group__3__Impl : ( ( Comma )? ) ;
    public final void rule__DiskZone_Short__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1266:1: ( ( ( Comma )? ) )
            // InternalShortDSLParser.g:1267:1: ( ( Comma )? )
            {
            // InternalShortDSLParser.g:1267:1: ( ( Comma )? )
            // InternalShortDSLParser.g:1268:2: ( Comma )?
            {
             before(grammarAccess.getDiskZone_ShortAccess().getCommaKeyword_3()); 
            // InternalShortDSLParser.g:1269:2: ( Comma )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Comma) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalShortDSLParser.g:1269:3: Comma
                    {
                    match(input,Comma,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDiskZone_ShortAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskZone_Short__Group__3__Impl"


    // $ANTLR start "rule__Camera_Short__Group__0"
    // InternalShortDSLParser.g:1278:1: rule__Camera_Short__Group__0 : rule__Camera_Short__Group__0__Impl rule__Camera_Short__Group__1 ;
    public final void rule__Camera_Short__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1282:1: ( rule__Camera_Short__Group__0__Impl rule__Camera_Short__Group__1 )
            // InternalShortDSLParser.g:1283:2: rule__Camera_Short__Group__0__Impl rule__Camera_Short__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Camera_Short__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camera_Short__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Camera_Short__Group__0"


    // $ANTLR start "rule__Camera_Short__Group__0__Impl"
    // InternalShortDSLParser.g:1290:1: rule__Camera_Short__Group__0__Impl : ( ( rule__Camera_Short__NameAssignment_0 ) ) ;
    public final void rule__Camera_Short__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1294:1: ( ( ( rule__Camera_Short__NameAssignment_0 ) ) )
            // InternalShortDSLParser.g:1295:1: ( ( rule__Camera_Short__NameAssignment_0 ) )
            {
            // InternalShortDSLParser.g:1295:1: ( ( rule__Camera_Short__NameAssignment_0 ) )
            // InternalShortDSLParser.g:1296:2: ( rule__Camera_Short__NameAssignment_0 )
            {
             before(grammarAccess.getCamera_ShortAccess().getNameAssignment_0()); 
            // InternalShortDSLParser.g:1297:2: ( rule__Camera_Short__NameAssignment_0 )
            // InternalShortDSLParser.g:1297:3: rule__Camera_Short__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Camera_Short__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCamera_ShortAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Camera_Short__Group__0__Impl"


    // $ANTLR start "rule__Camera_Short__Group__1"
    // InternalShortDSLParser.g:1305:1: rule__Camera_Short__Group__1 : rule__Camera_Short__Group__1__Impl rule__Camera_Short__Group__2 ;
    public final void rule__Camera_Short__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1309:1: ( rule__Camera_Short__Group__1__Impl rule__Camera_Short__Group__2 )
            // InternalShortDSLParser.g:1310:2: rule__Camera_Short__Group__1__Impl rule__Camera_Short__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Camera_Short__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camera_Short__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Camera_Short__Group__1"


    // $ANTLR start "rule__Camera_Short__Group__1__Impl"
    // InternalShortDSLParser.g:1317:1: rule__Camera_Short__Group__1__Impl : ( Colon ) ;
    public final void rule__Camera_Short__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1321:1: ( ( Colon ) )
            // InternalShortDSLParser.g:1322:1: ( Colon )
            {
            // InternalShortDSLParser.g:1322:1: ( Colon )
            // InternalShortDSLParser.g:1323:2: Colon
            {
             before(grammarAccess.getCamera_ShortAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCamera_ShortAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Camera_Short__Group__1__Impl"


    // $ANTLR start "rule__Camera_Short__Group__2"
    // InternalShortDSLParser.g:1332:1: rule__Camera_Short__Group__2 : rule__Camera_Short__Group__2__Impl rule__Camera_Short__Group__3 ;
    public final void rule__Camera_Short__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1336:1: ( rule__Camera_Short__Group__2__Impl rule__Camera_Short__Group__3 )
            // InternalShortDSLParser.g:1337:2: rule__Camera_Short__Group__2__Impl rule__Camera_Short__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Camera_Short__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camera_Short__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Camera_Short__Group__2"


    // $ANTLR start "rule__Camera_Short__Group__2__Impl"
    // InternalShortDSLParser.g:1344:1: rule__Camera_Short__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__Camera_Short__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1348:1: ( ( RULE_BEGIN ) )
            // InternalShortDSLParser.g:1349:1: ( RULE_BEGIN )
            {
            // InternalShortDSLParser.g:1349:1: ( RULE_BEGIN )
            // InternalShortDSLParser.g:1350:2: RULE_BEGIN
            {
             before(grammarAccess.getCamera_ShortAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getCamera_ShortAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Camera_Short__Group__2__Impl"


    // $ANTLR start "rule__Camera_Short__Group__3"
    // InternalShortDSLParser.g:1359:1: rule__Camera_Short__Group__3 : rule__Camera_Short__Group__3__Impl rule__Camera_Short__Group__4 ;
    public final void rule__Camera_Short__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1363:1: ( rule__Camera_Short__Group__3__Impl rule__Camera_Short__Group__4 )
            // InternalShortDSLParser.g:1364:2: rule__Camera_Short__Group__3__Impl rule__Camera_Short__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Camera_Short__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camera_Short__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Camera_Short__Group__3"


    // $ANTLR start "rule__Camera_Short__Group__3__Impl"
    // InternalShortDSLParser.g:1371:1: rule__Camera_Short__Group__3__Impl : ( ( ( rule__Camera_Short__ColorsAssignment_3 ) ) ( ( rule__Camera_Short__ColorsAssignment_3 )* ) ) ;
    public final void rule__Camera_Short__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1375:1: ( ( ( ( rule__Camera_Short__ColorsAssignment_3 ) ) ( ( rule__Camera_Short__ColorsAssignment_3 )* ) ) )
            // InternalShortDSLParser.g:1376:1: ( ( ( rule__Camera_Short__ColorsAssignment_3 ) ) ( ( rule__Camera_Short__ColorsAssignment_3 )* ) )
            {
            // InternalShortDSLParser.g:1376:1: ( ( ( rule__Camera_Short__ColorsAssignment_3 ) ) ( ( rule__Camera_Short__ColorsAssignment_3 )* ) )
            // InternalShortDSLParser.g:1377:2: ( ( rule__Camera_Short__ColorsAssignment_3 ) ) ( ( rule__Camera_Short__ColorsAssignment_3 )* )
            {
            // InternalShortDSLParser.g:1377:2: ( ( rule__Camera_Short__ColorsAssignment_3 ) )
            // InternalShortDSLParser.g:1378:3: ( rule__Camera_Short__ColorsAssignment_3 )
            {
             before(grammarAccess.getCamera_ShortAccess().getColorsAssignment_3()); 
            // InternalShortDSLParser.g:1379:3: ( rule__Camera_Short__ColorsAssignment_3 )
            // InternalShortDSLParser.g:1379:4: rule__Camera_Short__ColorsAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__Camera_Short__ColorsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCamera_ShortAccess().getColorsAssignment_3()); 

            }

            // InternalShortDSLParser.g:1382:2: ( ( rule__Camera_Short__ColorsAssignment_3 )* )
            // InternalShortDSLParser.g:1383:3: ( rule__Camera_Short__ColorsAssignment_3 )*
            {
             before(grammarAccess.getCamera_ShortAccess().getColorsAssignment_3()); 
            // InternalShortDSLParser.g:1384:3: ( rule__Camera_Short__ColorsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalShortDSLParser.g:1384:4: rule__Camera_Short__ColorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Camera_Short__ColorsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getCamera_ShortAccess().getColorsAssignment_3()); 

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
    // $ANTLR end "rule__Camera_Short__Group__3__Impl"


    // $ANTLR start "rule__Camera_Short__Group__4"
    // InternalShortDSLParser.g:1393:1: rule__Camera_Short__Group__4 : rule__Camera_Short__Group__4__Impl ;
    public final void rule__Camera_Short__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1397:1: ( rule__Camera_Short__Group__4__Impl )
            // InternalShortDSLParser.g:1398:2: rule__Camera_Short__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Camera_Short__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Camera_Short__Group__4"


    // $ANTLR start "rule__Camera_Short__Group__4__Impl"
    // InternalShortDSLParser.g:1404:1: rule__Camera_Short__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Camera_Short__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1408:1: ( ( RULE_END ) )
            // InternalShortDSLParser.g:1409:1: ( RULE_END )
            {
            // InternalShortDSLParser.g:1409:1: ( RULE_END )
            // InternalShortDSLParser.g:1410:2: RULE_END
            {
             before(grammarAccess.getCamera_ShortAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getCamera_ShortAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Camera_Short__Group__4__Impl"


    // $ANTLR start "rule__CameraColor_Short__Group__0"
    // InternalShortDSLParser.g:1420:1: rule__CameraColor_Short__Group__0 : rule__CameraColor_Short__Group__0__Impl rule__CameraColor_Short__Group__1 ;
    public final void rule__CameraColor_Short__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1424:1: ( rule__CameraColor_Short__Group__0__Impl rule__CameraColor_Short__Group__1 )
            // InternalShortDSLParser.g:1425:2: rule__CameraColor_Short__Group__0__Impl rule__CameraColor_Short__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__CameraColor_Short__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CameraColor_Short__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraColor_Short__Group__0"


    // $ANTLR start "rule__CameraColor_Short__Group__0__Impl"
    // InternalShortDSLParser.g:1432:1: rule__CameraColor_Short__Group__0__Impl : ( ( rule__CameraColor_Short__NameAssignment_0 ) ) ;
    public final void rule__CameraColor_Short__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1436:1: ( ( ( rule__CameraColor_Short__NameAssignment_0 ) ) )
            // InternalShortDSLParser.g:1437:1: ( ( rule__CameraColor_Short__NameAssignment_0 ) )
            {
            // InternalShortDSLParser.g:1437:1: ( ( rule__CameraColor_Short__NameAssignment_0 ) )
            // InternalShortDSLParser.g:1438:2: ( rule__CameraColor_Short__NameAssignment_0 )
            {
             before(grammarAccess.getCameraColor_ShortAccess().getNameAssignment_0()); 
            // InternalShortDSLParser.g:1439:2: ( rule__CameraColor_Short__NameAssignment_0 )
            // InternalShortDSLParser.g:1439:3: rule__CameraColor_Short__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CameraColor_Short__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCameraColor_ShortAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraColor_Short__Group__0__Impl"


    // $ANTLR start "rule__CameraColor_Short__Group__1"
    // InternalShortDSLParser.g:1447:1: rule__CameraColor_Short__Group__1 : rule__CameraColor_Short__Group__1__Impl ;
    public final void rule__CameraColor_Short__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1451:1: ( rule__CameraColor_Short__Group__1__Impl )
            // InternalShortDSLParser.g:1452:2: rule__CameraColor_Short__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CameraColor_Short__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraColor_Short__Group__1"


    // $ANTLR start "rule__CameraColor_Short__Group__1__Impl"
    // InternalShortDSLParser.g:1458:1: rule__CameraColor_Short__Group__1__Impl : ( ( Comma )? ) ;
    public final void rule__CameraColor_Short__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1462:1: ( ( ( Comma )? ) )
            // InternalShortDSLParser.g:1463:1: ( ( Comma )? )
            {
            // InternalShortDSLParser.g:1463:1: ( ( Comma )? )
            // InternalShortDSLParser.g:1464:2: ( Comma )?
            {
             before(grammarAccess.getCameraColor_ShortAccess().getCommaKeyword_1()); 
            // InternalShortDSLParser.g:1465:2: ( Comma )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Comma) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalShortDSLParser.g:1465:3: Comma
                    {
                    match(input,Comma,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCameraColor_ShortAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraColor_Short__Group__1__Impl"


    // $ANTLR start "rule__DeviceHandling_Short__Group__0"
    // InternalShortDSLParser.g:1474:1: rule__DeviceHandling_Short__Group__0 : rule__DeviceHandling_Short__Group__0__Impl rule__DeviceHandling_Short__Group__1 ;
    public final void rule__DeviceHandling_Short__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1478:1: ( rule__DeviceHandling_Short__Group__0__Impl rule__DeviceHandling_Short__Group__1 )
            // InternalShortDSLParser.g:1479:2: rule__DeviceHandling_Short__Group__0__Impl rule__DeviceHandling_Short__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__DeviceHandling_Short__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceHandling_Short__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceHandling_Short__Group__0"


    // $ANTLR start "rule__DeviceHandling_Short__Group__0__Impl"
    // InternalShortDSLParser.g:1486:1: rule__DeviceHandling_Short__Group__0__Impl : ( Test ) ;
    public final void rule__DeviceHandling_Short__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1490:1: ( ( Test ) )
            // InternalShortDSLParser.g:1491:1: ( Test )
            {
            // InternalShortDSLParser.g:1491:1: ( Test )
            // InternalShortDSLParser.g:1492:2: Test
            {
             before(grammarAccess.getDeviceHandling_ShortAccess().getTestKeyword_0()); 
            match(input,Test,FOLLOW_2); 
             after(grammarAccess.getDeviceHandling_ShortAccess().getTestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceHandling_Short__Group__0__Impl"


    // $ANTLR start "rule__DeviceHandling_Short__Group__1"
    // InternalShortDSLParser.g:1501:1: rule__DeviceHandling_Short__Group__1 : rule__DeviceHandling_Short__Group__1__Impl ;
    public final void rule__DeviceHandling_Short__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1505:1: ( rule__DeviceHandling_Short__Group__1__Impl )
            // InternalShortDSLParser.g:1506:2: rule__DeviceHandling_Short__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceHandling_Short__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceHandling_Short__Group__1"


    // $ANTLR start "rule__DeviceHandling_Short__Group__1__Impl"
    // InternalShortDSLParser.g:1512:1: rule__DeviceHandling_Short__Group__1__Impl : ( ( rule__DeviceHandling_Short__NameAssignment_1 ) ) ;
    public final void rule__DeviceHandling_Short__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1516:1: ( ( ( rule__DeviceHandling_Short__NameAssignment_1 ) ) )
            // InternalShortDSLParser.g:1517:1: ( ( rule__DeviceHandling_Short__NameAssignment_1 ) )
            {
            // InternalShortDSLParser.g:1517:1: ( ( rule__DeviceHandling_Short__NameAssignment_1 ) )
            // InternalShortDSLParser.g:1518:2: ( rule__DeviceHandling_Short__NameAssignment_1 )
            {
             before(grammarAccess.getDeviceHandling_ShortAccess().getNameAssignment_1()); 
            // InternalShortDSLParser.g:1519:2: ( rule__DeviceHandling_Short__NameAssignment_1 )
            // InternalShortDSLParser.g:1519:3: rule__DeviceHandling_Short__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeviceHandling_Short__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceHandling_ShortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceHandling_Short__Group__1__Impl"


    // $ANTLR start "rule__Model__TypeAssignment_2"
    // InternalShortDSLParser.g:1528:1: rule__Model__TypeAssignment_2 : ( ruleDSL_Short ) ;
    public final void rule__Model__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1532:1: ( ( ruleDSL_Short ) )
            // InternalShortDSLParser.g:1533:2: ( ruleDSL_Short )
            {
            // InternalShortDSLParser.g:1533:2: ( ruleDSL_Short )
            // InternalShortDSLParser.g:1534:3: ruleDSL_Short
            {
             before(grammarAccess.getModelAccess().getTypeDSL_ShortParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDSL_Short();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypeDSL_ShortParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TypeAssignment_2"


    // $ANTLR start "rule__DSL_Short__ConfigurationAssignment_1"
    // InternalShortDSLParser.g:1543:1: rule__DSL_Short__ConfigurationAssignment_1 : ( ruleConfiguration_Short ) ;
    public final void rule__DSL_Short__ConfigurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1547:1: ( ( ruleConfiguration_Short ) )
            // InternalShortDSLParser.g:1548:2: ( ruleConfiguration_Short )
            {
            // InternalShortDSLParser.g:1548:2: ( ruleConfiguration_Short )
            // InternalShortDSLParser.g:1549:3: ruleConfiguration_Short
            {
             before(grammarAccess.getDSL_ShortAccess().getConfigurationConfiguration_ShortParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConfiguration_Short();

            state._fsp--;

             after(grammarAccess.getDSL_ShortAccess().getConfigurationConfiguration_ShortParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__DSL_Short__DeviceHandlingsAssignment_2"
    // InternalShortDSLParser.g:1558:1: rule__DSL_Short__DeviceHandlingsAssignment_2 : ( ruleDeviceHandling_Short ) ;
    public final void rule__DSL_Short__DeviceHandlingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1562:1: ( ( ruleDeviceHandling_Short ) )
            // InternalShortDSLParser.g:1563:2: ( ruleDeviceHandling_Short )
            {
            // InternalShortDSLParser.g:1563:2: ( ruleDeviceHandling_Short )
            // InternalShortDSLParser.g:1564:3: ruleDeviceHandling_Short
            {
             before(grammarAccess.getDSL_ShortAccess().getDeviceHandlingsDeviceHandling_ShortParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceHandling_Short();

            state._fsp--;

             after(grammarAccess.getDSL_ShortAccess().getDeviceHandlingsDeviceHandling_ShortParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSL_Short__DeviceHandlingsAssignment_2"


    // $ANTLR start "rule__Configuration_Short__DevicesAssignment_3"
    // InternalShortDSLParser.g:1573:1: rule__Configuration_Short__DevicesAssignment_3 : ( ruleDevice_Short ) ;
    public final void rule__Configuration_Short__DevicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1577:1: ( ( ruleDevice_Short ) )
            // InternalShortDSLParser.g:1578:2: ( ruleDevice_Short )
            {
            // InternalShortDSLParser.g:1578:2: ( ruleDevice_Short )
            // InternalShortDSLParser.g:1579:3: ruleDevice_Short
            {
             before(grammarAccess.getConfiguration_ShortAccess().getDevicesDevice_ShortParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice_Short();

            state._fsp--;

             after(grammarAccess.getConfiguration_ShortAccess().getDevicesDevice_ShortParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Short__DevicesAssignment_3"


    // $ANTLR start "rule__Crane_Short__NameAssignment_0"
    // InternalShortDSLParser.g:1588:1: rule__Crane_Short__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Crane_Short__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1592:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:1593:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:1593:2: ( RULE_ID )
            // InternalShortDSLParser.g:1594:3: RULE_ID
            {
             before(grammarAccess.getCrane_ShortAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCrane_ShortAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crane_Short__NameAssignment_0"


    // $ANTLR start "rule__Crane_Short__PositionsAssignment_3"
    // InternalShortDSLParser.g:1603:1: rule__Crane_Short__PositionsAssignment_3 : ( ruleCranePosition_Short ) ;
    public final void rule__Crane_Short__PositionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1607:1: ( ( ruleCranePosition_Short ) )
            // InternalShortDSLParser.g:1608:2: ( ruleCranePosition_Short )
            {
            // InternalShortDSLParser.g:1608:2: ( ruleCranePosition_Short )
            // InternalShortDSLParser.g:1609:3: ruleCranePosition_Short
            {
             before(grammarAccess.getCrane_ShortAccess().getPositionsCranePosition_ShortParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCranePosition_Short();

            state._fsp--;

             after(grammarAccess.getCrane_ShortAccess().getPositionsCranePosition_ShortParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crane_Short__PositionsAssignment_3"


    // $ANTLR start "rule__CranePosition_Short__NameAssignment_0"
    // InternalShortDSLParser.g:1618:1: rule__CranePosition_Short__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CranePosition_Short__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1622:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:1623:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:1623:2: ( RULE_ID )
            // InternalShortDSLParser.g:1624:3: RULE_ID
            {
             before(grammarAccess.getCranePosition_ShortAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCranePosition_ShortAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CranePosition_Short__NameAssignment_0"


    // $ANTLR start "rule__CranePosition_Short__PositionAssignment_2"
    // InternalShortDSLParser.g:1633:1: rule__CranePosition_Short__PositionAssignment_2 : ( RULE_INT ) ;
    public final void rule__CranePosition_Short__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1637:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:1638:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:1638:2: ( RULE_INT )
            // InternalShortDSLParser.g:1639:3: RULE_INT
            {
             before(grammarAccess.getCranePosition_ShortAccess().getPositionINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCranePosition_ShortAccess().getPositionINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CranePosition_Short__PositionAssignment_2"


    // $ANTLR start "rule__Disk_Short__NameAssignment_0"
    // InternalShortDSLParser.g:1648:1: rule__Disk_Short__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Disk_Short__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1652:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:1653:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:1653:2: ( RULE_ID )
            // InternalShortDSLParser.g:1654:3: RULE_ID
            {
             before(grammarAccess.getDisk_ShortAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDisk_ShortAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__NameAssignment_0"


    // $ANTLR start "rule__Disk_Short__NSlotsAssignment_2"
    // InternalShortDSLParser.g:1663:1: rule__Disk_Short__NSlotsAssignment_2 : ( RULE_INT ) ;
    public final void rule__Disk_Short__NSlotsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1667:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:1668:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:1668:2: ( RULE_INT )
            // InternalShortDSLParser.g:1669:3: RULE_INT
            {
             before(grammarAccess.getDisk_ShortAccess().getNSlotsINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDisk_ShortAccess().getNSlotsINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__NSlotsAssignment_2"


    // $ANTLR start "rule__Disk_Short__ZonesAssignment_6"
    // InternalShortDSLParser.g:1678:1: rule__Disk_Short__ZonesAssignment_6 : ( ruleDiskZone_Short ) ;
    public final void rule__Disk_Short__ZonesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1682:1: ( ( ruleDiskZone_Short ) )
            // InternalShortDSLParser.g:1683:2: ( ruleDiskZone_Short )
            {
            // InternalShortDSLParser.g:1683:2: ( ruleDiskZone_Short )
            // InternalShortDSLParser.g:1684:3: ruleDiskZone_Short
            {
             before(grammarAccess.getDisk_ShortAccess().getZonesDiskZone_ShortParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDiskZone_Short();

            state._fsp--;

             after(grammarAccess.getDisk_ShortAccess().getZonesDiskZone_ShortParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disk_Short__ZonesAssignment_6"


    // $ANTLR start "rule__DiskZone_Short__NameAssignment_0"
    // InternalShortDSLParser.g:1693:1: rule__DiskZone_Short__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DiskZone_Short__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1697:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:1698:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:1698:2: ( RULE_ID )
            // InternalShortDSLParser.g:1699:3: RULE_ID
            {
             before(grammarAccess.getDiskZone_ShortAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDiskZone_ShortAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskZone_Short__NameAssignment_0"


    // $ANTLR start "rule__DiskZone_Short__SlotAssignment_2"
    // InternalShortDSLParser.g:1708:1: rule__DiskZone_Short__SlotAssignment_2 : ( RULE_INT ) ;
    public final void rule__DiskZone_Short__SlotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1712:1: ( ( RULE_INT ) )
            // InternalShortDSLParser.g:1713:2: ( RULE_INT )
            {
            // InternalShortDSLParser.g:1713:2: ( RULE_INT )
            // InternalShortDSLParser.g:1714:3: RULE_INT
            {
             before(grammarAccess.getDiskZone_ShortAccess().getSlotINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDiskZone_ShortAccess().getSlotINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiskZone_Short__SlotAssignment_2"


    // $ANTLR start "rule__Camera_Short__NameAssignment_0"
    // InternalShortDSLParser.g:1723:1: rule__Camera_Short__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Camera_Short__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1727:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:1728:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:1728:2: ( RULE_ID )
            // InternalShortDSLParser.g:1729:3: RULE_ID
            {
             before(grammarAccess.getCamera_ShortAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCamera_ShortAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Camera_Short__NameAssignment_0"


    // $ANTLR start "rule__Camera_Short__ColorsAssignment_3"
    // InternalShortDSLParser.g:1738:1: rule__Camera_Short__ColorsAssignment_3 : ( ruleCameraColor_Short ) ;
    public final void rule__Camera_Short__ColorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1742:1: ( ( ruleCameraColor_Short ) )
            // InternalShortDSLParser.g:1743:2: ( ruleCameraColor_Short )
            {
            // InternalShortDSLParser.g:1743:2: ( ruleCameraColor_Short )
            // InternalShortDSLParser.g:1744:3: ruleCameraColor_Short
            {
             before(grammarAccess.getCamera_ShortAccess().getColorsCameraColor_ShortParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCameraColor_Short();

            state._fsp--;

             after(grammarAccess.getCamera_ShortAccess().getColorsCameraColor_ShortParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Camera_Short__ColorsAssignment_3"


    // $ANTLR start "rule__CameraColor_Short__NameAssignment_0"
    // InternalShortDSLParser.g:1753:1: rule__CameraColor_Short__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CameraColor_Short__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1757:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:1758:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:1758:2: ( RULE_ID )
            // InternalShortDSLParser.g:1759:3: RULE_ID
            {
             before(grammarAccess.getCameraColor_ShortAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCameraColor_ShortAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraColor_Short__NameAssignment_0"


    // $ANTLR start "rule__DeviceHandling_Short__NameAssignment_1"
    // InternalShortDSLParser.g:1768:1: rule__DeviceHandling_Short__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DeviceHandling_Short__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShortDSLParser.g:1772:1: ( ( RULE_ID ) )
            // InternalShortDSLParser.g:1773:2: ( RULE_ID )
            {
            // InternalShortDSLParser.g:1773:2: ( RULE_ID )
            // InternalShortDSLParser.g:1774:3: RULE_ID
            {
             before(grammarAccess.getDeviceHandling_ShortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceHandling_ShortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceHandling_Short__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000200L});

}