package co7217.week18.entity.ide.contentassist.antlr.internal;

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
import co7217.week18.entity.services.EntityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'aws'", "'gcp'", "'ubuntu'", "'amazon-linux'", "'windows'", "'small'", "'medium'", "'large'", "'london'", "'manchester'", "'birmingham'", "'edinburgh'", "'define'", "'infrastructure'", "'on'", "'{'", "'}'", "'vm'", "'running'", "'in'", "'network'", "'vpc'", "'hosted'", "'subnet'", "'type'", "'specifications'", "'cpu'", "':'", "'cores'", "'memory'", "'GB'", "'bucket'", "'enable'", "'configure'", "'address'", "'space'", "'subnets'", "'hostedzone'", "'domain'", "'properties'", "'range'", "'versioning'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEntityDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntityDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntityDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEntityDsl.g"; }


    	private EntityDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(EntityDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleInfrastructure"
    // InternalEntityDsl.g:53:1: entryRuleInfrastructure : ruleInfrastructure EOF ;
    public final void entryRuleInfrastructure() throws RecognitionException {
        try {
            // InternalEntityDsl.g:54:1: ( ruleInfrastructure EOF )
            // InternalEntityDsl.g:55:1: ruleInfrastructure EOF
            {
             before(grammarAccess.getInfrastructureRule()); 
            pushFollow(FOLLOW_1);
            ruleInfrastructure();

            state._fsp--;

             after(grammarAccess.getInfrastructureRule()); 
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
    // $ANTLR end "entryRuleInfrastructure"


    // $ANTLR start "ruleInfrastructure"
    // InternalEntityDsl.g:62:1: ruleInfrastructure : ( ( rule__Infrastructure__Group__0 ) ) ;
    public final void ruleInfrastructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:66:2: ( ( ( rule__Infrastructure__Group__0 ) ) )
            // InternalEntityDsl.g:67:2: ( ( rule__Infrastructure__Group__0 ) )
            {
            // InternalEntityDsl.g:67:2: ( ( rule__Infrastructure__Group__0 ) )
            // InternalEntityDsl.g:68:3: ( rule__Infrastructure__Group__0 )
            {
             before(grammarAccess.getInfrastructureAccess().getGroup()); 
            // InternalEntityDsl.g:69:3: ( rule__Infrastructure__Group__0 )
            // InternalEntityDsl.g:69:4: rule__Infrastructure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Infrastructure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInfrastructureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfrastructure"


    // $ANTLR start "entryRuleResource"
    // InternalEntityDsl.g:78:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalEntityDsl.g:79:1: ( ruleResource EOF )
            // InternalEntityDsl.g:80:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalEntityDsl.g:87:1: ruleResource : ( ( rule__Resource__Alternatives ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:91:2: ( ( ( rule__Resource__Alternatives ) ) )
            // InternalEntityDsl.g:92:2: ( ( rule__Resource__Alternatives ) )
            {
            // InternalEntityDsl.g:92:2: ( ( rule__Resource__Alternatives ) )
            // InternalEntityDsl.g:93:3: ( rule__Resource__Alternatives )
            {
             before(grammarAccess.getResourceAccess().getAlternatives()); 
            // InternalEntityDsl.g:94:3: ( rule__Resource__Alternatives )
            // InternalEntityDsl.g:94:4: rule__Resource__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleComputeInstance"
    // InternalEntityDsl.g:103:1: entryRuleComputeInstance : ruleComputeInstance EOF ;
    public final void entryRuleComputeInstance() throws RecognitionException {
        try {
            // InternalEntityDsl.g:104:1: ( ruleComputeInstance EOF )
            // InternalEntityDsl.g:105:1: ruleComputeInstance EOF
            {
             before(grammarAccess.getComputeInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleComputeInstance();

            state._fsp--;

             after(grammarAccess.getComputeInstanceRule()); 
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
    // $ANTLR end "entryRuleComputeInstance"


    // $ANTLR start "ruleComputeInstance"
    // InternalEntityDsl.g:112:1: ruleComputeInstance : ( ( rule__ComputeInstance__Group__0 ) ) ;
    public final void ruleComputeInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:116:2: ( ( ( rule__ComputeInstance__Group__0 ) ) )
            // InternalEntityDsl.g:117:2: ( ( rule__ComputeInstance__Group__0 ) )
            {
            // InternalEntityDsl.g:117:2: ( ( rule__ComputeInstance__Group__0 ) )
            // InternalEntityDsl.g:118:3: ( rule__ComputeInstance__Group__0 )
            {
             before(grammarAccess.getComputeInstanceAccess().getGroup()); 
            // InternalEntityDsl.g:119:3: ( rule__ComputeInstance__Group__0 )
            // InternalEntityDsl.g:119:4: rule__ComputeInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComputeInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComputeInstance"


    // $ANTLR start "entryRuleStorageBucket"
    // InternalEntityDsl.g:128:1: entryRuleStorageBucket : ruleStorageBucket EOF ;
    public final void entryRuleStorageBucket() throws RecognitionException {
        try {
            // InternalEntityDsl.g:129:1: ( ruleStorageBucket EOF )
            // InternalEntityDsl.g:130:1: ruleStorageBucket EOF
            {
             before(grammarAccess.getStorageBucketRule()); 
            pushFollow(FOLLOW_1);
            ruleStorageBucket();

            state._fsp--;

             after(grammarAccess.getStorageBucketRule()); 
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
    // $ANTLR end "entryRuleStorageBucket"


    // $ANTLR start "ruleStorageBucket"
    // InternalEntityDsl.g:137:1: ruleStorageBucket : ( ( rule__StorageBucket__Group__0 ) ) ;
    public final void ruleStorageBucket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:141:2: ( ( ( rule__StorageBucket__Group__0 ) ) )
            // InternalEntityDsl.g:142:2: ( ( rule__StorageBucket__Group__0 ) )
            {
            // InternalEntityDsl.g:142:2: ( ( rule__StorageBucket__Group__0 ) )
            // InternalEntityDsl.g:143:3: ( rule__StorageBucket__Group__0 )
            {
             before(grammarAccess.getStorageBucketAccess().getGroup()); 
            // InternalEntityDsl.g:144:3: ( rule__StorageBucket__Group__0 )
            // InternalEntityDsl.g:144:4: rule__StorageBucket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StorageBucket__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStorageBucketAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStorageBucket"


    // $ANTLR start "entryRuleNetwork"
    // InternalEntityDsl.g:153:1: entryRuleNetwork : ruleNetwork EOF ;
    public final void entryRuleNetwork() throws RecognitionException {
        try {
            // InternalEntityDsl.g:154:1: ( ruleNetwork EOF )
            // InternalEntityDsl.g:155:1: ruleNetwork EOF
            {
             before(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            ruleNetwork();

            state._fsp--;

             after(grammarAccess.getNetworkRule()); 
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
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalEntityDsl.g:162:1: ruleNetwork : ( ( rule__Network__Group__0 ) ) ;
    public final void ruleNetwork() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:166:2: ( ( ( rule__Network__Group__0 ) ) )
            // InternalEntityDsl.g:167:2: ( ( rule__Network__Group__0 ) )
            {
            // InternalEntityDsl.g:167:2: ( ( rule__Network__Group__0 ) )
            // InternalEntityDsl.g:168:3: ( rule__Network__Group__0 )
            {
             before(grammarAccess.getNetworkAccess().getGroup()); 
            // InternalEntityDsl.g:169:3: ( rule__Network__Group__0 )
            // InternalEntityDsl.g:169:4: rule__Network__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleVPC"
    // InternalEntityDsl.g:178:1: entryRuleVPC : ruleVPC EOF ;
    public final void entryRuleVPC() throws RecognitionException {
        try {
            // InternalEntityDsl.g:179:1: ( ruleVPC EOF )
            // InternalEntityDsl.g:180:1: ruleVPC EOF
            {
             before(grammarAccess.getVPCRule()); 
            pushFollow(FOLLOW_1);
            ruleVPC();

            state._fsp--;

             after(grammarAccess.getVPCRule()); 
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
    // $ANTLR end "entryRuleVPC"


    // $ANTLR start "ruleVPC"
    // InternalEntityDsl.g:187:1: ruleVPC : ( ( rule__VPC__Group__0 ) ) ;
    public final void ruleVPC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:191:2: ( ( ( rule__VPC__Group__0 ) ) )
            // InternalEntityDsl.g:192:2: ( ( rule__VPC__Group__0 ) )
            {
            // InternalEntityDsl.g:192:2: ( ( rule__VPC__Group__0 ) )
            // InternalEntityDsl.g:193:3: ( rule__VPC__Group__0 )
            {
             before(grammarAccess.getVPCAccess().getGroup()); 
            // InternalEntityDsl.g:194:3: ( rule__VPC__Group__0 )
            // InternalEntityDsl.g:194:4: rule__VPC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VPC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVPCAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVPC"


    // $ANTLR start "entryRuleHostedZone"
    // InternalEntityDsl.g:203:1: entryRuleHostedZone : ruleHostedZone EOF ;
    public final void entryRuleHostedZone() throws RecognitionException {
        try {
            // InternalEntityDsl.g:204:1: ( ruleHostedZone EOF )
            // InternalEntityDsl.g:205:1: ruleHostedZone EOF
            {
             before(grammarAccess.getHostedZoneRule()); 
            pushFollow(FOLLOW_1);
            ruleHostedZone();

            state._fsp--;

             after(grammarAccess.getHostedZoneRule()); 
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
    // $ANTLR end "entryRuleHostedZone"


    // $ANTLR start "ruleHostedZone"
    // InternalEntityDsl.g:212:1: ruleHostedZone : ( ( rule__HostedZone__Group__0 ) ) ;
    public final void ruleHostedZone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:216:2: ( ( ( rule__HostedZone__Group__0 ) ) )
            // InternalEntityDsl.g:217:2: ( ( rule__HostedZone__Group__0 ) )
            {
            // InternalEntityDsl.g:217:2: ( ( rule__HostedZone__Group__0 ) )
            // InternalEntityDsl.g:218:3: ( rule__HostedZone__Group__0 )
            {
             before(grammarAccess.getHostedZoneAccess().getGroup()); 
            // InternalEntityDsl.g:219:3: ( rule__HostedZone__Group__0 )
            // InternalEntityDsl.g:219:4: rule__HostedZone__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HostedZone__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHostedZoneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHostedZone"


    // $ANTLR start "entryRuleSubnet"
    // InternalEntityDsl.g:228:1: entryRuleSubnet : ruleSubnet EOF ;
    public final void entryRuleSubnet() throws RecognitionException {
        try {
            // InternalEntityDsl.g:229:1: ( ruleSubnet EOF )
            // InternalEntityDsl.g:230:1: ruleSubnet EOF
            {
             before(grammarAccess.getSubnetRule()); 
            pushFollow(FOLLOW_1);
            ruleSubnet();

            state._fsp--;

             after(grammarAccess.getSubnetRule()); 
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
    // $ANTLR end "entryRuleSubnet"


    // $ANTLR start "ruleSubnet"
    // InternalEntityDsl.g:237:1: ruleSubnet : ( ( rule__Subnet__Group__0 ) ) ;
    public final void ruleSubnet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:241:2: ( ( ( rule__Subnet__Group__0 ) ) )
            // InternalEntityDsl.g:242:2: ( ( rule__Subnet__Group__0 ) )
            {
            // InternalEntityDsl.g:242:2: ( ( rule__Subnet__Group__0 ) )
            // InternalEntityDsl.g:243:3: ( rule__Subnet__Group__0 )
            {
             before(grammarAccess.getSubnetAccess().getGroup()); 
            // InternalEntityDsl.g:244:3: ( rule__Subnet__Group__0 )
            // InternalEntityDsl.g:244:4: rule__Subnet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subnet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubnetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubnet"


    // $ANTLR start "ruleCloudProvider"
    // InternalEntityDsl.g:253:1: ruleCloudProvider : ( ( rule__CloudProvider__Alternatives ) ) ;
    public final void ruleCloudProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:257:1: ( ( ( rule__CloudProvider__Alternatives ) ) )
            // InternalEntityDsl.g:258:2: ( ( rule__CloudProvider__Alternatives ) )
            {
            // InternalEntityDsl.g:258:2: ( ( rule__CloudProvider__Alternatives ) )
            // InternalEntityDsl.g:259:3: ( rule__CloudProvider__Alternatives )
            {
             before(grammarAccess.getCloudProviderAccess().getAlternatives()); 
            // InternalEntityDsl.g:260:3: ( rule__CloudProvider__Alternatives )
            // InternalEntityDsl.g:260:4: rule__CloudProvider__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CloudProvider__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCloudProviderAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCloudProvider"


    // $ANTLR start "ruleOSImage"
    // InternalEntityDsl.g:269:1: ruleOSImage : ( ( rule__OSImage__Alternatives ) ) ;
    public final void ruleOSImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:273:1: ( ( ( rule__OSImage__Alternatives ) ) )
            // InternalEntityDsl.g:274:2: ( ( rule__OSImage__Alternatives ) )
            {
            // InternalEntityDsl.g:274:2: ( ( rule__OSImage__Alternatives ) )
            // InternalEntityDsl.g:275:3: ( rule__OSImage__Alternatives )
            {
             before(grammarAccess.getOSImageAccess().getAlternatives()); 
            // InternalEntityDsl.g:276:3: ( rule__OSImage__Alternatives )
            // InternalEntityDsl.g:276:4: rule__OSImage__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OSImage__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOSImageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOSImage"


    // $ANTLR start "ruleInstanceType"
    // InternalEntityDsl.g:285:1: ruleInstanceType : ( ( rule__InstanceType__Alternatives ) ) ;
    public final void ruleInstanceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:289:1: ( ( ( rule__InstanceType__Alternatives ) ) )
            // InternalEntityDsl.g:290:2: ( ( rule__InstanceType__Alternatives ) )
            {
            // InternalEntityDsl.g:290:2: ( ( rule__InstanceType__Alternatives ) )
            // InternalEntityDsl.g:291:3: ( rule__InstanceType__Alternatives )
            {
             before(grammarAccess.getInstanceTypeAccess().getAlternatives()); 
            // InternalEntityDsl.g:292:3: ( rule__InstanceType__Alternatives )
            // InternalEntityDsl.g:292:4: rule__InstanceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InstanceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstanceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceType"


    // $ANTLR start "ruleRegion"
    // InternalEntityDsl.g:301:1: ruleRegion : ( ( rule__Region__Alternatives ) ) ;
    public final void ruleRegion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:305:1: ( ( ( rule__Region__Alternatives ) ) )
            // InternalEntityDsl.g:306:2: ( ( rule__Region__Alternatives ) )
            {
            // InternalEntityDsl.g:306:2: ( ( rule__Region__Alternatives ) )
            // InternalEntityDsl.g:307:3: ( rule__Region__Alternatives )
            {
             before(grammarAccess.getRegionAccess().getAlternatives()); 
            // InternalEntityDsl.g:308:3: ( rule__Region__Alternatives )
            // InternalEntityDsl.g:308:4: rule__Region__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Region__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRegionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegion"


    // $ANTLR start "rule__Resource__Alternatives"
    // InternalEntityDsl.g:316:1: rule__Resource__Alternatives : ( ( ruleComputeInstance ) | ( ruleStorageBucket ) | ( ruleNetwork ) | ( ruleVPC ) | ( ruleSubnet ) | ( ruleHostedZone ) );
    public final void rule__Resource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:320:1: ( ( ruleComputeInstance ) | ( ruleStorageBucket ) | ( ruleNetwork ) | ( ruleVPC ) | ( ruleSubnet ) | ( ruleHostedZone ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt1=1;
                }
                break;
            case 42:
                {
                alt1=2;
                }
                break;
            case 44:
                {
                alt1=3;
                }
                break;
            case 32:
                {
                alt1=4;
                }
                break;
            case RULE_ID:
                {
                alt1=5;
                }
                break;
            case 48:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalEntityDsl.g:321:2: ( ruleComputeInstance )
                    {
                    // InternalEntityDsl.g:321:2: ( ruleComputeInstance )
                    // InternalEntityDsl.g:322:3: ruleComputeInstance
                    {
                     before(grammarAccess.getResourceAccess().getComputeInstanceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComputeInstance();

                    state._fsp--;

                     after(grammarAccess.getResourceAccess().getComputeInstanceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:327:2: ( ruleStorageBucket )
                    {
                    // InternalEntityDsl.g:327:2: ( ruleStorageBucket )
                    // InternalEntityDsl.g:328:3: ruleStorageBucket
                    {
                     before(grammarAccess.getResourceAccess().getStorageBucketParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStorageBucket();

                    state._fsp--;

                     after(grammarAccess.getResourceAccess().getStorageBucketParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEntityDsl.g:333:2: ( ruleNetwork )
                    {
                    // InternalEntityDsl.g:333:2: ( ruleNetwork )
                    // InternalEntityDsl.g:334:3: ruleNetwork
                    {
                     before(grammarAccess.getResourceAccess().getNetworkParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNetwork();

                    state._fsp--;

                     after(grammarAccess.getResourceAccess().getNetworkParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEntityDsl.g:339:2: ( ruleVPC )
                    {
                    // InternalEntityDsl.g:339:2: ( ruleVPC )
                    // InternalEntityDsl.g:340:3: ruleVPC
                    {
                     before(grammarAccess.getResourceAccess().getVPCParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVPC();

                    state._fsp--;

                     after(grammarAccess.getResourceAccess().getVPCParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEntityDsl.g:345:2: ( ruleSubnet )
                    {
                    // InternalEntityDsl.g:345:2: ( ruleSubnet )
                    // InternalEntityDsl.g:346:3: ruleSubnet
                    {
                     before(grammarAccess.getResourceAccess().getSubnetParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSubnet();

                    state._fsp--;

                     after(grammarAccess.getResourceAccess().getSubnetParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEntityDsl.g:351:2: ( ruleHostedZone )
                    {
                    // InternalEntityDsl.g:351:2: ( ruleHostedZone )
                    // InternalEntityDsl.g:352:3: ruleHostedZone
                    {
                     before(grammarAccess.getResourceAccess().getHostedZoneParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleHostedZone();

                    state._fsp--;

                     after(grammarAccess.getResourceAccess().getHostedZoneParserRuleCall_5()); 

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
    // $ANTLR end "rule__Resource__Alternatives"


    // $ANTLR start "rule__Network__Alternatives_4"
    // InternalEntityDsl.g:361:1: rule__Network__Alternatives_4 : ( ( ( rule__Network__VpcsAssignment_4_0 ) ) | ( ( rule__Network__ZonesAssignment_4_1 ) ) );
    public final void rule__Network__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:365:1: ( ( ( rule__Network__VpcsAssignment_4_0 ) ) | ( ( rule__Network__ZonesAssignment_4_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==32) ) {
                alt2=1;
            }
            else if ( (LA2_0==48) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEntityDsl.g:366:2: ( ( rule__Network__VpcsAssignment_4_0 ) )
                    {
                    // InternalEntityDsl.g:366:2: ( ( rule__Network__VpcsAssignment_4_0 ) )
                    // InternalEntityDsl.g:367:3: ( rule__Network__VpcsAssignment_4_0 )
                    {
                     before(grammarAccess.getNetworkAccess().getVpcsAssignment_4_0()); 
                    // InternalEntityDsl.g:368:3: ( rule__Network__VpcsAssignment_4_0 )
                    // InternalEntityDsl.g:368:4: rule__Network__VpcsAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Network__VpcsAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkAccess().getVpcsAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:372:2: ( ( rule__Network__ZonesAssignment_4_1 ) )
                    {
                    // InternalEntityDsl.g:372:2: ( ( rule__Network__ZonesAssignment_4_1 ) )
                    // InternalEntityDsl.g:373:3: ( rule__Network__ZonesAssignment_4_1 )
                    {
                     before(grammarAccess.getNetworkAccess().getZonesAssignment_4_1()); 
                    // InternalEntityDsl.g:374:3: ( rule__Network__ZonesAssignment_4_1 )
                    // InternalEntityDsl.g:374:4: rule__Network__ZonesAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Network__ZonesAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkAccess().getZonesAssignment_4_1()); 

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
    // $ANTLR end "rule__Network__Alternatives_4"


    // $ANTLR start "rule__CloudProvider__Alternatives"
    // InternalEntityDsl.g:382:1: rule__CloudProvider__Alternatives : ( ( ( 'aws' ) ) | ( ( 'gcp' ) ) );
    public final void rule__CloudProvider__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:386:1: ( ( ( 'aws' ) ) | ( ( 'gcp' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEntityDsl.g:387:2: ( ( 'aws' ) )
                    {
                    // InternalEntityDsl.g:387:2: ( ( 'aws' ) )
                    // InternalEntityDsl.g:388:3: ( 'aws' )
                    {
                     before(grammarAccess.getCloudProviderAccess().getAWSEnumLiteralDeclaration_0()); 
                    // InternalEntityDsl.g:389:3: ( 'aws' )
                    // InternalEntityDsl.g:389:4: 'aws'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getCloudProviderAccess().getAWSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:393:2: ( ( 'gcp' ) )
                    {
                    // InternalEntityDsl.g:393:2: ( ( 'gcp' ) )
                    // InternalEntityDsl.g:394:3: ( 'gcp' )
                    {
                     before(grammarAccess.getCloudProviderAccess().getGCPEnumLiteralDeclaration_1()); 
                    // InternalEntityDsl.g:395:3: ( 'gcp' )
                    // InternalEntityDsl.g:395:4: 'gcp'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCloudProviderAccess().getGCPEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__CloudProvider__Alternatives"


    // $ANTLR start "rule__OSImage__Alternatives"
    // InternalEntityDsl.g:403:1: rule__OSImage__Alternatives : ( ( ( 'ubuntu' ) ) | ( ( 'amazon-linux' ) ) | ( ( 'windows' ) ) );
    public final void rule__OSImage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:407:1: ( ( ( 'ubuntu' ) ) | ( ( 'amazon-linux' ) ) | ( ( 'windows' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalEntityDsl.g:408:2: ( ( 'ubuntu' ) )
                    {
                    // InternalEntityDsl.g:408:2: ( ( 'ubuntu' ) )
                    // InternalEntityDsl.g:409:3: ( 'ubuntu' )
                    {
                     before(grammarAccess.getOSImageAccess().getUBUNTUEnumLiteralDeclaration_0()); 
                    // InternalEntityDsl.g:410:3: ( 'ubuntu' )
                    // InternalEntityDsl.g:410:4: 'ubuntu'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOSImageAccess().getUBUNTUEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:414:2: ( ( 'amazon-linux' ) )
                    {
                    // InternalEntityDsl.g:414:2: ( ( 'amazon-linux' ) )
                    // InternalEntityDsl.g:415:3: ( 'amazon-linux' )
                    {
                     before(grammarAccess.getOSImageAccess().getAMAZON_LINUXEnumLiteralDeclaration_1()); 
                    // InternalEntityDsl.g:416:3: ( 'amazon-linux' )
                    // InternalEntityDsl.g:416:4: 'amazon-linux'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOSImageAccess().getAMAZON_LINUXEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEntityDsl.g:420:2: ( ( 'windows' ) )
                    {
                    // InternalEntityDsl.g:420:2: ( ( 'windows' ) )
                    // InternalEntityDsl.g:421:3: ( 'windows' )
                    {
                     before(grammarAccess.getOSImageAccess().getWINDOWSEnumLiteralDeclaration_2()); 
                    // InternalEntityDsl.g:422:3: ( 'windows' )
                    // InternalEntityDsl.g:422:4: 'windows'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOSImageAccess().getWINDOWSEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__OSImage__Alternatives"


    // $ANTLR start "rule__InstanceType__Alternatives"
    // InternalEntityDsl.g:430:1: rule__InstanceType__Alternatives : ( ( ( 'small' ) ) | ( ( 'medium' ) ) | ( ( 'large' ) ) );
    public final void rule__InstanceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:434:1: ( ( ( 'small' ) ) | ( ( 'medium' ) ) | ( ( 'large' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalEntityDsl.g:435:2: ( ( 'small' ) )
                    {
                    // InternalEntityDsl.g:435:2: ( ( 'small' ) )
                    // InternalEntityDsl.g:436:3: ( 'small' )
                    {
                     before(grammarAccess.getInstanceTypeAccess().getSmallEnumLiteralDeclaration_0()); 
                    // InternalEntityDsl.g:437:3: ( 'small' )
                    // InternalEntityDsl.g:437:4: 'small'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstanceTypeAccess().getSmallEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:441:2: ( ( 'medium' ) )
                    {
                    // InternalEntityDsl.g:441:2: ( ( 'medium' ) )
                    // InternalEntityDsl.g:442:3: ( 'medium' )
                    {
                     before(grammarAccess.getInstanceTypeAccess().getMediumEnumLiteralDeclaration_1()); 
                    // InternalEntityDsl.g:443:3: ( 'medium' )
                    // InternalEntityDsl.g:443:4: 'medium'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstanceTypeAccess().getMediumEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEntityDsl.g:447:2: ( ( 'large' ) )
                    {
                    // InternalEntityDsl.g:447:2: ( ( 'large' ) )
                    // InternalEntityDsl.g:448:3: ( 'large' )
                    {
                     before(grammarAccess.getInstanceTypeAccess().getLargeEnumLiteralDeclaration_2()); 
                    // InternalEntityDsl.g:449:3: ( 'large' )
                    // InternalEntityDsl.g:449:4: 'large'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getInstanceTypeAccess().getLargeEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__InstanceType__Alternatives"


    // $ANTLR start "rule__Region__Alternatives"
    // InternalEntityDsl.g:457:1: rule__Region__Alternatives : ( ( ( 'london' ) ) | ( ( 'manchester' ) ) | ( ( 'birmingham' ) ) | ( ( 'edinburgh' ) ) );
    public final void rule__Region__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:461:1: ( ( ( 'london' ) ) | ( ( 'manchester' ) ) | ( ( 'birmingham' ) ) | ( ( 'edinburgh' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalEntityDsl.g:462:2: ( ( 'london' ) )
                    {
                    // InternalEntityDsl.g:462:2: ( ( 'london' ) )
                    // InternalEntityDsl.g:463:3: ( 'london' )
                    {
                     before(grammarAccess.getRegionAccess().getLondonEnumLiteralDeclaration_0()); 
                    // InternalEntityDsl.g:464:3: ( 'london' )
                    // InternalEntityDsl.g:464:4: 'london'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegionAccess().getLondonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:468:2: ( ( 'manchester' ) )
                    {
                    // InternalEntityDsl.g:468:2: ( ( 'manchester' ) )
                    // InternalEntityDsl.g:469:3: ( 'manchester' )
                    {
                     before(grammarAccess.getRegionAccess().getManchesterEnumLiteralDeclaration_1()); 
                    // InternalEntityDsl.g:470:3: ( 'manchester' )
                    // InternalEntityDsl.g:470:4: 'manchester'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegionAccess().getManchesterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEntityDsl.g:474:2: ( ( 'birmingham' ) )
                    {
                    // InternalEntityDsl.g:474:2: ( ( 'birmingham' ) )
                    // InternalEntityDsl.g:475:3: ( 'birmingham' )
                    {
                     before(grammarAccess.getRegionAccess().getBirminghamEnumLiteralDeclaration_2()); 
                    // InternalEntityDsl.g:476:3: ( 'birmingham' )
                    // InternalEntityDsl.g:476:4: 'birmingham'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegionAccess().getBirminghamEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEntityDsl.g:480:2: ( ( 'edinburgh' ) )
                    {
                    // InternalEntityDsl.g:480:2: ( ( 'edinburgh' ) )
                    // InternalEntityDsl.g:481:3: ( 'edinburgh' )
                    {
                     before(grammarAccess.getRegionAccess().getEdinburghEnumLiteralDeclaration_3()); 
                    // InternalEntityDsl.g:482:3: ( 'edinburgh' )
                    // InternalEntityDsl.g:482:4: 'edinburgh'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegionAccess().getEdinburghEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Region__Alternatives"


    // $ANTLR start "rule__Infrastructure__Group__0"
    // InternalEntityDsl.g:490:1: rule__Infrastructure__Group__0 : rule__Infrastructure__Group__0__Impl rule__Infrastructure__Group__1 ;
    public final void rule__Infrastructure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:494:1: ( rule__Infrastructure__Group__0__Impl rule__Infrastructure__Group__1 )
            // InternalEntityDsl.g:495:2: rule__Infrastructure__Group__0__Impl rule__Infrastructure__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Infrastructure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infrastructure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infrastructure__Group__0"


    // $ANTLR start "rule__Infrastructure__Group__0__Impl"
    // InternalEntityDsl.g:502:1: rule__Infrastructure__Group__0__Impl : ( 'define' ) ;
    public final void rule__Infrastructure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:506:1: ( ( 'define' ) )
            // InternalEntityDsl.g:507:1: ( 'define' )
            {
            // InternalEntityDsl.g:507:1: ( 'define' )
            // InternalEntityDsl.g:508:2: 'define'
            {
             before(grammarAccess.getInfrastructureAccess().getDefineKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInfrastructureAccess().getDefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infrastructure__Group__0__Impl"


    // $ANTLR start "rule__Infrastructure__Group__1"
    // InternalEntityDsl.g:517:1: rule__Infrastructure__Group__1 : rule__Infrastructure__Group__1__Impl rule__Infrastructure__Group__2 ;
    public final void rule__Infrastructure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:521:1: ( rule__Infrastructure__Group__1__Impl rule__Infrastructure__Group__2 )
            // InternalEntityDsl.g:522:2: rule__Infrastructure__Group__1__Impl rule__Infrastructure__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Infrastructure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infrastructure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infrastructure__Group__1"


    // $ANTLR start "rule__Infrastructure__Group__1__Impl"
    // InternalEntityDsl.g:529:1: rule__Infrastructure__Group__1__Impl : ( 'infrastructure' ) ;
    public final void rule__Infrastructure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:533:1: ( ( 'infrastructure' ) )
            // InternalEntityDsl.g:534:1: ( 'infrastructure' )
            {
            // InternalEntityDsl.g:534:1: ( 'infrastructure' )
            // InternalEntityDsl.g:535:2: 'infrastructure'
            {
             before(grammarAccess.getInfrastructureAccess().getInfrastructureKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInfrastructureAccess().getInfrastructureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infrastructure__Group__1__Impl"


    // $ANTLR start "rule__Infrastructure__Group__2"
    // InternalEntityDsl.g:544:1: rule__Infrastructure__Group__2 : rule__Infrastructure__Group__2__Impl rule__Infrastructure__Group__3 ;
    public final void rule__Infrastructure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:548:1: ( rule__Infrastructure__Group__2__Impl rule__Infrastructure__Group__3 )
            // InternalEntityDsl.g:549:2: rule__Infrastructure__Group__2__Impl rule__Infrastructure__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Infrastructure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infrastructure__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infrastructure__Group__2"


    // $ANTLR start "rule__Infrastructure__Group__2__Impl"
    // InternalEntityDsl.g:556:1: rule__Infrastructure__Group__2__Impl : ( 'on' ) ;
    public final void rule__Infrastructure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:560:1: ( ( 'on' ) )
            // InternalEntityDsl.g:561:1: ( 'on' )
            {
            // InternalEntityDsl.g:561:1: ( 'on' )
            // InternalEntityDsl.g:562:2: 'on'
            {
             before(grammarAccess.getInfrastructureAccess().getOnKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInfrastructureAccess().getOnKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infrastructure__Group__2__Impl"


    // $ANTLR start "rule__Infrastructure__Group__3"
    // InternalEntityDsl.g:571:1: rule__Infrastructure__Group__3 : rule__Infrastructure__Group__3__Impl rule__Infrastructure__Group__4 ;
    public final void rule__Infrastructure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:575:1: ( rule__Infrastructure__Group__3__Impl rule__Infrastructure__Group__4 )
            // InternalEntityDsl.g:576:2: rule__Infrastructure__Group__3__Impl rule__Infrastructure__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Infrastructure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infrastructure__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infrastructure__Group__3"


    // $ANTLR start "rule__Infrastructure__Group__3__Impl"
    // InternalEntityDsl.g:583:1: rule__Infrastructure__Group__3__Impl : ( ( rule__Infrastructure__CloudProviderAssignment_3 ) ) ;
    public final void rule__Infrastructure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:587:1: ( ( ( rule__Infrastructure__CloudProviderAssignment_3 ) ) )
            // InternalEntityDsl.g:588:1: ( ( rule__Infrastructure__CloudProviderAssignment_3 ) )
            {
            // InternalEntityDsl.g:588:1: ( ( rule__Infrastructure__CloudProviderAssignment_3 ) )
            // InternalEntityDsl.g:589:2: ( rule__Infrastructure__CloudProviderAssignment_3 )
            {
             before(grammarAccess.getInfrastructureAccess().getCloudProviderAssignment_3()); 
            // InternalEntityDsl.g:590:2: ( rule__Infrastructure__CloudProviderAssignment_3 )
            // InternalEntityDsl.g:590:3: rule__Infrastructure__CloudProviderAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Infrastructure__CloudProviderAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInfrastructureAccess().getCloudProviderAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infrastructure__Group__3__Impl"


    // $ANTLR start "rule__Infrastructure__Group__4"
    // InternalEntityDsl.g:598:1: rule__Infrastructure__Group__4 : rule__Infrastructure__Group__4__Impl rule__Infrastructure__Group__5 ;
    public final void rule__Infrastructure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:602:1: ( rule__Infrastructure__Group__4__Impl rule__Infrastructure__Group__5 )
            // InternalEntityDsl.g:603:2: rule__Infrastructure__Group__4__Impl rule__Infrastructure__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Infrastructure__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infrastructure__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infrastructure__Group__4"


    // $ANTLR start "rule__Infrastructure__Group__4__Impl"
    // InternalEntityDsl.g:610:1: rule__Infrastructure__Group__4__Impl : ( '{' ) ;
    public final void rule__Infrastructure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:614:1: ( ( '{' ) )
            // InternalEntityDsl.g:615:1: ( '{' )
            {
            // InternalEntityDsl.g:615:1: ( '{' )
            // InternalEntityDsl.g:616:2: '{'
            {
             before(grammarAccess.getInfrastructureAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInfrastructureAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infrastructure__Group__4__Impl"


    // $ANTLR start "rule__Infrastructure__Group__5"
    // InternalEntityDsl.g:625:1: rule__Infrastructure__Group__5 : rule__Infrastructure__Group__5__Impl rule__Infrastructure__Group__6 ;
    public final void rule__Infrastructure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:629:1: ( rule__Infrastructure__Group__5__Impl rule__Infrastructure__Group__6 )
            // InternalEntityDsl.g:630:2: rule__Infrastructure__Group__5__Impl rule__Infrastructure__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Infrastructure__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infrastructure__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infrastructure__Group__5"


    // $ANTLR start "rule__Infrastructure__Group__5__Impl"
    // InternalEntityDsl.g:637:1: rule__Infrastructure__Group__5__Impl : ( ( rule__Infrastructure__ResourcesAssignment_5 )* ) ;
    public final void rule__Infrastructure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:641:1: ( ( ( rule__Infrastructure__ResourcesAssignment_5 )* ) )
            // InternalEntityDsl.g:642:1: ( ( rule__Infrastructure__ResourcesAssignment_5 )* )
            {
            // InternalEntityDsl.g:642:1: ( ( rule__Infrastructure__ResourcesAssignment_5 )* )
            // InternalEntityDsl.g:643:2: ( rule__Infrastructure__ResourcesAssignment_5 )*
            {
             before(grammarAccess.getInfrastructureAccess().getResourcesAssignment_5()); 
            // InternalEntityDsl.g:644:2: ( rule__Infrastructure__ResourcesAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==28||LA7_0==32||LA7_0==42||LA7_0==44||LA7_0==48) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEntityDsl.g:644:3: rule__Infrastructure__ResourcesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Infrastructure__ResourcesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getInfrastructureAccess().getResourcesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infrastructure__Group__5__Impl"


    // $ANTLR start "rule__Infrastructure__Group__6"
    // InternalEntityDsl.g:652:1: rule__Infrastructure__Group__6 : rule__Infrastructure__Group__6__Impl ;
    public final void rule__Infrastructure__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:656:1: ( rule__Infrastructure__Group__6__Impl )
            // InternalEntityDsl.g:657:2: rule__Infrastructure__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Infrastructure__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infrastructure__Group__6"


    // $ANTLR start "rule__Infrastructure__Group__6__Impl"
    // InternalEntityDsl.g:663:1: rule__Infrastructure__Group__6__Impl : ( '}' ) ;
    public final void rule__Infrastructure__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:667:1: ( ( '}' ) )
            // InternalEntityDsl.g:668:1: ( '}' )
            {
            // InternalEntityDsl.g:668:1: ( '}' )
            // InternalEntityDsl.g:669:2: '}'
            {
             before(grammarAccess.getInfrastructureAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInfrastructureAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infrastructure__Group__6__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__0"
    // InternalEntityDsl.g:679:1: rule__ComputeInstance__Group__0 : rule__ComputeInstance__Group__0__Impl rule__ComputeInstance__Group__1 ;
    public final void rule__ComputeInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:683:1: ( rule__ComputeInstance__Group__0__Impl rule__ComputeInstance__Group__1 )
            // InternalEntityDsl.g:684:2: rule__ComputeInstance__Group__0__Impl rule__ComputeInstance__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ComputeInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__0"


    // $ANTLR start "rule__ComputeInstance__Group__0__Impl"
    // InternalEntityDsl.g:691:1: rule__ComputeInstance__Group__0__Impl : ( 'vm' ) ;
    public final void rule__ComputeInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:695:1: ( ( 'vm' ) )
            // InternalEntityDsl.g:696:1: ( 'vm' )
            {
            // InternalEntityDsl.g:696:1: ( 'vm' )
            // InternalEntityDsl.g:697:2: 'vm'
            {
             before(grammarAccess.getComputeInstanceAccess().getVmKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getVmKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__0__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__1"
    // InternalEntityDsl.g:706:1: rule__ComputeInstance__Group__1 : rule__ComputeInstance__Group__1__Impl rule__ComputeInstance__Group__2 ;
    public final void rule__ComputeInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:710:1: ( rule__ComputeInstance__Group__1__Impl rule__ComputeInstance__Group__2 )
            // InternalEntityDsl.g:711:2: rule__ComputeInstance__Group__1__Impl rule__ComputeInstance__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ComputeInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__1"


    // $ANTLR start "rule__ComputeInstance__Group__1__Impl"
    // InternalEntityDsl.g:718:1: rule__ComputeInstance__Group__1__Impl : ( ( rule__ComputeInstance__NameAssignment_1 ) ) ;
    public final void rule__ComputeInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:722:1: ( ( ( rule__ComputeInstance__NameAssignment_1 ) ) )
            // InternalEntityDsl.g:723:1: ( ( rule__ComputeInstance__NameAssignment_1 ) )
            {
            // InternalEntityDsl.g:723:1: ( ( rule__ComputeInstance__NameAssignment_1 ) )
            // InternalEntityDsl.g:724:2: ( rule__ComputeInstance__NameAssignment_1 )
            {
             before(grammarAccess.getComputeInstanceAccess().getNameAssignment_1()); 
            // InternalEntityDsl.g:725:2: ( rule__ComputeInstance__NameAssignment_1 )
            // InternalEntityDsl.g:725:3: rule__ComputeInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComputeInstance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComputeInstanceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__1__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__2"
    // InternalEntityDsl.g:733:1: rule__ComputeInstance__Group__2 : rule__ComputeInstance__Group__2__Impl rule__ComputeInstance__Group__3 ;
    public final void rule__ComputeInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:737:1: ( rule__ComputeInstance__Group__2__Impl rule__ComputeInstance__Group__3 )
            // InternalEntityDsl.g:738:2: rule__ComputeInstance__Group__2__Impl rule__ComputeInstance__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ComputeInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__2"


    // $ANTLR start "rule__ComputeInstance__Group__2__Impl"
    // InternalEntityDsl.g:745:1: rule__ComputeInstance__Group__2__Impl : ( 'running' ) ;
    public final void rule__ComputeInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:749:1: ( ( 'running' ) )
            // InternalEntityDsl.g:750:1: ( 'running' )
            {
            // InternalEntityDsl.g:750:1: ( 'running' )
            // InternalEntityDsl.g:751:2: 'running'
            {
             before(grammarAccess.getComputeInstanceAccess().getRunningKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getRunningKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__2__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__3"
    // InternalEntityDsl.g:760:1: rule__ComputeInstance__Group__3 : rule__ComputeInstance__Group__3__Impl rule__ComputeInstance__Group__4 ;
    public final void rule__ComputeInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:764:1: ( rule__ComputeInstance__Group__3__Impl rule__ComputeInstance__Group__4 )
            // InternalEntityDsl.g:765:2: rule__ComputeInstance__Group__3__Impl rule__ComputeInstance__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__ComputeInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__3"


    // $ANTLR start "rule__ComputeInstance__Group__3__Impl"
    // InternalEntityDsl.g:772:1: rule__ComputeInstance__Group__3__Impl : ( 'on' ) ;
    public final void rule__ComputeInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:776:1: ( ( 'on' ) )
            // InternalEntityDsl.g:777:1: ( 'on' )
            {
            // InternalEntityDsl.g:777:1: ( 'on' )
            // InternalEntityDsl.g:778:2: 'on'
            {
             before(grammarAccess.getComputeInstanceAccess().getOnKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getOnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__3__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__4"
    // InternalEntityDsl.g:787:1: rule__ComputeInstance__Group__4 : rule__ComputeInstance__Group__4__Impl rule__ComputeInstance__Group__5 ;
    public final void rule__ComputeInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:791:1: ( rule__ComputeInstance__Group__4__Impl rule__ComputeInstance__Group__5 )
            // InternalEntityDsl.g:792:2: rule__ComputeInstance__Group__4__Impl rule__ComputeInstance__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ComputeInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__4"


    // $ANTLR start "rule__ComputeInstance__Group__4__Impl"
    // InternalEntityDsl.g:799:1: rule__ComputeInstance__Group__4__Impl : ( ( rule__ComputeInstance__OsImageAssignment_4 ) ) ;
    public final void rule__ComputeInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:803:1: ( ( ( rule__ComputeInstance__OsImageAssignment_4 ) ) )
            // InternalEntityDsl.g:804:1: ( ( rule__ComputeInstance__OsImageAssignment_4 ) )
            {
            // InternalEntityDsl.g:804:1: ( ( rule__ComputeInstance__OsImageAssignment_4 ) )
            // InternalEntityDsl.g:805:2: ( rule__ComputeInstance__OsImageAssignment_4 )
            {
             before(grammarAccess.getComputeInstanceAccess().getOsImageAssignment_4()); 
            // InternalEntityDsl.g:806:2: ( rule__ComputeInstance__OsImageAssignment_4 )
            // InternalEntityDsl.g:806:3: rule__ComputeInstance__OsImageAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ComputeInstance__OsImageAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComputeInstanceAccess().getOsImageAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__4__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__5"
    // InternalEntityDsl.g:814:1: rule__ComputeInstance__Group__5 : rule__ComputeInstance__Group__5__Impl rule__ComputeInstance__Group__6 ;
    public final void rule__ComputeInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:818:1: ( rule__ComputeInstance__Group__5__Impl rule__ComputeInstance__Group__6 )
            // InternalEntityDsl.g:819:2: rule__ComputeInstance__Group__5__Impl rule__ComputeInstance__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__ComputeInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__5"


    // $ANTLR start "rule__ComputeInstance__Group__5__Impl"
    // InternalEntityDsl.g:826:1: rule__ComputeInstance__Group__5__Impl : ( 'in' ) ;
    public final void rule__ComputeInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:830:1: ( ( 'in' ) )
            // InternalEntityDsl.g:831:1: ( 'in' )
            {
            // InternalEntityDsl.g:831:1: ( 'in' )
            // InternalEntityDsl.g:832:2: 'in'
            {
             before(grammarAccess.getComputeInstanceAccess().getInKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getInKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__5__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__6"
    // InternalEntityDsl.g:841:1: rule__ComputeInstance__Group__6 : rule__ComputeInstance__Group__6__Impl rule__ComputeInstance__Group__7 ;
    public final void rule__ComputeInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:845:1: ( rule__ComputeInstance__Group__6__Impl rule__ComputeInstance__Group__7 )
            // InternalEntityDsl.g:846:2: rule__ComputeInstance__Group__6__Impl rule__ComputeInstance__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__ComputeInstance__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__6"


    // $ANTLR start "rule__ComputeInstance__Group__6__Impl"
    // InternalEntityDsl.g:853:1: rule__ComputeInstance__Group__6__Impl : ( 'network' ) ;
    public final void rule__ComputeInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:857:1: ( ( 'network' ) )
            // InternalEntityDsl.g:858:1: ( 'network' )
            {
            // InternalEntityDsl.g:858:1: ( 'network' )
            // InternalEntityDsl.g:859:2: 'network'
            {
             before(grammarAccess.getComputeInstanceAccess().getNetworkKeyword_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getNetworkKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__6__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__7"
    // InternalEntityDsl.g:868:1: rule__ComputeInstance__Group__7 : rule__ComputeInstance__Group__7__Impl rule__ComputeInstance__Group__8 ;
    public final void rule__ComputeInstance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:872:1: ( rule__ComputeInstance__Group__7__Impl rule__ComputeInstance__Group__8 )
            // InternalEntityDsl.g:873:2: rule__ComputeInstance__Group__7__Impl rule__ComputeInstance__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__ComputeInstance__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__7"


    // $ANTLR start "rule__ComputeInstance__Group__7__Impl"
    // InternalEntityDsl.g:880:1: rule__ComputeInstance__Group__7__Impl : ( ( rule__ComputeInstance__NetworkAssignment_7 ) ) ;
    public final void rule__ComputeInstance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:884:1: ( ( ( rule__ComputeInstance__NetworkAssignment_7 ) ) )
            // InternalEntityDsl.g:885:1: ( ( rule__ComputeInstance__NetworkAssignment_7 ) )
            {
            // InternalEntityDsl.g:885:1: ( ( rule__ComputeInstance__NetworkAssignment_7 ) )
            // InternalEntityDsl.g:886:2: ( rule__ComputeInstance__NetworkAssignment_7 )
            {
             before(grammarAccess.getComputeInstanceAccess().getNetworkAssignment_7()); 
            // InternalEntityDsl.g:887:2: ( rule__ComputeInstance__NetworkAssignment_7 )
            // InternalEntityDsl.g:887:3: rule__ComputeInstance__NetworkAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ComputeInstance__NetworkAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getComputeInstanceAccess().getNetworkAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__7__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__8"
    // InternalEntityDsl.g:895:1: rule__ComputeInstance__Group__8 : rule__ComputeInstance__Group__8__Impl rule__ComputeInstance__Group__9 ;
    public final void rule__ComputeInstance__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:899:1: ( rule__ComputeInstance__Group__8__Impl rule__ComputeInstance__Group__9 )
            // InternalEntityDsl.g:900:2: rule__ComputeInstance__Group__8__Impl rule__ComputeInstance__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__ComputeInstance__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__8"


    // $ANTLR start "rule__ComputeInstance__Group__8__Impl"
    // InternalEntityDsl.g:907:1: rule__ComputeInstance__Group__8__Impl : ( 'in' ) ;
    public final void rule__ComputeInstance__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:911:1: ( ( 'in' ) )
            // InternalEntityDsl.g:912:1: ( 'in' )
            {
            // InternalEntityDsl.g:912:1: ( 'in' )
            // InternalEntityDsl.g:913:2: 'in'
            {
             before(grammarAccess.getComputeInstanceAccess().getInKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getInKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__8__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__9"
    // InternalEntityDsl.g:922:1: rule__ComputeInstance__Group__9 : rule__ComputeInstance__Group__9__Impl rule__ComputeInstance__Group__10 ;
    public final void rule__ComputeInstance__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:926:1: ( rule__ComputeInstance__Group__9__Impl rule__ComputeInstance__Group__10 )
            // InternalEntityDsl.g:927:2: rule__ComputeInstance__Group__9__Impl rule__ComputeInstance__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__ComputeInstance__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__9"


    // $ANTLR start "rule__ComputeInstance__Group__9__Impl"
    // InternalEntityDsl.g:934:1: rule__ComputeInstance__Group__9__Impl : ( 'vpc' ) ;
    public final void rule__ComputeInstance__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:938:1: ( ( 'vpc' ) )
            // InternalEntityDsl.g:939:1: ( 'vpc' )
            {
            // InternalEntityDsl.g:939:1: ( 'vpc' )
            // InternalEntityDsl.g:940:2: 'vpc'
            {
             before(grammarAccess.getComputeInstanceAccess().getVpcKeyword_9()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getVpcKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__9__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__10"
    // InternalEntityDsl.g:949:1: rule__ComputeInstance__Group__10 : rule__ComputeInstance__Group__10__Impl rule__ComputeInstance__Group__11 ;
    public final void rule__ComputeInstance__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:953:1: ( rule__ComputeInstance__Group__10__Impl rule__ComputeInstance__Group__11 )
            // InternalEntityDsl.g:954:2: rule__ComputeInstance__Group__10__Impl rule__ComputeInstance__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__ComputeInstance__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__10"


    // $ANTLR start "rule__ComputeInstance__Group__10__Impl"
    // InternalEntityDsl.g:961:1: rule__ComputeInstance__Group__10__Impl : ( ( rule__ComputeInstance__VpcAssignment_10 ) ) ;
    public final void rule__ComputeInstance__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:965:1: ( ( ( rule__ComputeInstance__VpcAssignment_10 ) ) )
            // InternalEntityDsl.g:966:1: ( ( rule__ComputeInstance__VpcAssignment_10 ) )
            {
            // InternalEntityDsl.g:966:1: ( ( rule__ComputeInstance__VpcAssignment_10 ) )
            // InternalEntityDsl.g:967:2: ( rule__ComputeInstance__VpcAssignment_10 )
            {
             before(grammarAccess.getComputeInstanceAccess().getVpcAssignment_10()); 
            // InternalEntityDsl.g:968:2: ( rule__ComputeInstance__VpcAssignment_10 )
            // InternalEntityDsl.g:968:3: rule__ComputeInstance__VpcAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__ComputeInstance__VpcAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getComputeInstanceAccess().getVpcAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__10__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__11"
    // InternalEntityDsl.g:976:1: rule__ComputeInstance__Group__11 : rule__ComputeInstance__Group__11__Impl rule__ComputeInstance__Group__12 ;
    public final void rule__ComputeInstance__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:980:1: ( rule__ComputeInstance__Group__11__Impl rule__ComputeInstance__Group__12 )
            // InternalEntityDsl.g:981:2: rule__ComputeInstance__Group__11__Impl rule__ComputeInstance__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__ComputeInstance__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__11"


    // $ANTLR start "rule__ComputeInstance__Group__11__Impl"
    // InternalEntityDsl.g:988:1: rule__ComputeInstance__Group__11__Impl : ( 'hosted' ) ;
    public final void rule__ComputeInstance__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:992:1: ( ( 'hosted' ) )
            // InternalEntityDsl.g:993:1: ( 'hosted' )
            {
            // InternalEntityDsl.g:993:1: ( 'hosted' )
            // InternalEntityDsl.g:994:2: 'hosted'
            {
             before(grammarAccess.getComputeInstanceAccess().getHostedKeyword_11()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getHostedKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__11__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__12"
    // InternalEntityDsl.g:1003:1: rule__ComputeInstance__Group__12 : rule__ComputeInstance__Group__12__Impl rule__ComputeInstance__Group__13 ;
    public final void rule__ComputeInstance__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1007:1: ( rule__ComputeInstance__Group__12__Impl rule__ComputeInstance__Group__13 )
            // InternalEntityDsl.g:1008:2: rule__ComputeInstance__Group__12__Impl rule__ComputeInstance__Group__13
            {
            pushFollow(FOLLOW_16);
            rule__ComputeInstance__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__12"


    // $ANTLR start "rule__ComputeInstance__Group__12__Impl"
    // InternalEntityDsl.g:1015:1: rule__ComputeInstance__Group__12__Impl : ( 'in' ) ;
    public final void rule__ComputeInstance__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1019:1: ( ( 'in' ) )
            // InternalEntityDsl.g:1020:1: ( 'in' )
            {
            // InternalEntityDsl.g:1020:1: ( 'in' )
            // InternalEntityDsl.g:1021:2: 'in'
            {
             before(grammarAccess.getComputeInstanceAccess().getInKeyword_12()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getInKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__12__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__13"
    // InternalEntityDsl.g:1030:1: rule__ComputeInstance__Group__13 : rule__ComputeInstance__Group__13__Impl rule__ComputeInstance__Group__14 ;
    public final void rule__ComputeInstance__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1034:1: ( rule__ComputeInstance__Group__13__Impl rule__ComputeInstance__Group__14 )
            // InternalEntityDsl.g:1035:2: rule__ComputeInstance__Group__13__Impl rule__ComputeInstance__Group__14
            {
            pushFollow(FOLLOW_17);
            rule__ComputeInstance__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__13"


    // $ANTLR start "rule__ComputeInstance__Group__13__Impl"
    // InternalEntityDsl.g:1042:1: rule__ComputeInstance__Group__13__Impl : ( ( rule__ComputeInstance__RegionAssignment_13 ) ) ;
    public final void rule__ComputeInstance__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1046:1: ( ( ( rule__ComputeInstance__RegionAssignment_13 ) ) )
            // InternalEntityDsl.g:1047:1: ( ( rule__ComputeInstance__RegionAssignment_13 ) )
            {
            // InternalEntityDsl.g:1047:1: ( ( rule__ComputeInstance__RegionAssignment_13 ) )
            // InternalEntityDsl.g:1048:2: ( rule__ComputeInstance__RegionAssignment_13 )
            {
             before(grammarAccess.getComputeInstanceAccess().getRegionAssignment_13()); 
            // InternalEntityDsl.g:1049:2: ( rule__ComputeInstance__RegionAssignment_13 )
            // InternalEntityDsl.g:1049:3: rule__ComputeInstance__RegionAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__ComputeInstance__RegionAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getComputeInstanceAccess().getRegionAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__13__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__14"
    // InternalEntityDsl.g:1057:1: rule__ComputeInstance__Group__14 : rule__ComputeInstance__Group__14__Impl rule__ComputeInstance__Group__15 ;
    public final void rule__ComputeInstance__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1061:1: ( rule__ComputeInstance__Group__14__Impl rule__ComputeInstance__Group__15 )
            // InternalEntityDsl.g:1062:2: rule__ComputeInstance__Group__14__Impl rule__ComputeInstance__Group__15
            {
            pushFollow(FOLLOW_9);
            rule__ComputeInstance__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__14"


    // $ANTLR start "rule__ComputeInstance__Group__14__Impl"
    // InternalEntityDsl.g:1069:1: rule__ComputeInstance__Group__14__Impl : ( 'subnet' ) ;
    public final void rule__ComputeInstance__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1073:1: ( ( 'subnet' ) )
            // InternalEntityDsl.g:1074:1: ( 'subnet' )
            {
            // InternalEntityDsl.g:1074:1: ( 'subnet' )
            // InternalEntityDsl.g:1075:2: 'subnet'
            {
             before(grammarAccess.getComputeInstanceAccess().getSubnetKeyword_14()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getSubnetKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__14__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__15"
    // InternalEntityDsl.g:1084:1: rule__ComputeInstance__Group__15 : rule__ComputeInstance__Group__15__Impl rule__ComputeInstance__Group__16 ;
    public final void rule__ComputeInstance__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1088:1: ( rule__ComputeInstance__Group__15__Impl rule__ComputeInstance__Group__16 )
            // InternalEntityDsl.g:1089:2: rule__ComputeInstance__Group__15__Impl rule__ComputeInstance__Group__16
            {
            pushFollow(FOLLOW_18);
            rule__ComputeInstance__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__15"


    // $ANTLR start "rule__ComputeInstance__Group__15__Impl"
    // InternalEntityDsl.g:1096:1: rule__ComputeInstance__Group__15__Impl : ( ( rule__ComputeInstance__SubnetAssignment_15 ) ) ;
    public final void rule__ComputeInstance__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1100:1: ( ( ( rule__ComputeInstance__SubnetAssignment_15 ) ) )
            // InternalEntityDsl.g:1101:1: ( ( rule__ComputeInstance__SubnetAssignment_15 ) )
            {
            // InternalEntityDsl.g:1101:1: ( ( rule__ComputeInstance__SubnetAssignment_15 ) )
            // InternalEntityDsl.g:1102:2: ( rule__ComputeInstance__SubnetAssignment_15 )
            {
             before(grammarAccess.getComputeInstanceAccess().getSubnetAssignment_15()); 
            // InternalEntityDsl.g:1103:2: ( rule__ComputeInstance__SubnetAssignment_15 )
            // InternalEntityDsl.g:1103:3: rule__ComputeInstance__SubnetAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__ComputeInstance__SubnetAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getComputeInstanceAccess().getSubnetAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__15__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__16"
    // InternalEntityDsl.g:1111:1: rule__ComputeInstance__Group__16 : rule__ComputeInstance__Group__16__Impl rule__ComputeInstance__Group__17 ;
    public final void rule__ComputeInstance__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1115:1: ( rule__ComputeInstance__Group__16__Impl rule__ComputeInstance__Group__17 )
            // InternalEntityDsl.g:1116:2: rule__ComputeInstance__Group__16__Impl rule__ComputeInstance__Group__17
            {
            pushFollow(FOLLOW_19);
            rule__ComputeInstance__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__16"


    // $ANTLR start "rule__ComputeInstance__Group__16__Impl"
    // InternalEntityDsl.g:1123:1: rule__ComputeInstance__Group__16__Impl : ( 'type' ) ;
    public final void rule__ComputeInstance__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1127:1: ( ( 'type' ) )
            // InternalEntityDsl.g:1128:1: ( 'type' )
            {
            // InternalEntityDsl.g:1128:1: ( 'type' )
            // InternalEntityDsl.g:1129:2: 'type'
            {
             before(grammarAccess.getComputeInstanceAccess().getTypeKeyword_16()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getTypeKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__16__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__17"
    // InternalEntityDsl.g:1138:1: rule__ComputeInstance__Group__17 : rule__ComputeInstance__Group__17__Impl rule__ComputeInstance__Group__18 ;
    public final void rule__ComputeInstance__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1142:1: ( rule__ComputeInstance__Group__17__Impl rule__ComputeInstance__Group__18 )
            // InternalEntityDsl.g:1143:2: rule__ComputeInstance__Group__17__Impl rule__ComputeInstance__Group__18
            {
            pushFollow(FOLLOW_6);
            rule__ComputeInstance__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__17"


    // $ANTLR start "rule__ComputeInstance__Group__17__Impl"
    // InternalEntityDsl.g:1150:1: rule__ComputeInstance__Group__17__Impl : ( ( rule__ComputeInstance__InstanceTypeAssignment_17 ) ) ;
    public final void rule__ComputeInstance__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1154:1: ( ( ( rule__ComputeInstance__InstanceTypeAssignment_17 ) ) )
            // InternalEntityDsl.g:1155:1: ( ( rule__ComputeInstance__InstanceTypeAssignment_17 ) )
            {
            // InternalEntityDsl.g:1155:1: ( ( rule__ComputeInstance__InstanceTypeAssignment_17 ) )
            // InternalEntityDsl.g:1156:2: ( rule__ComputeInstance__InstanceTypeAssignment_17 )
            {
             before(grammarAccess.getComputeInstanceAccess().getInstanceTypeAssignment_17()); 
            // InternalEntityDsl.g:1157:2: ( rule__ComputeInstance__InstanceTypeAssignment_17 )
            // InternalEntityDsl.g:1157:3: rule__ComputeInstance__InstanceTypeAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__ComputeInstance__InstanceTypeAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getComputeInstanceAccess().getInstanceTypeAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__17__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__18"
    // InternalEntityDsl.g:1165:1: rule__ComputeInstance__Group__18 : rule__ComputeInstance__Group__18__Impl rule__ComputeInstance__Group__19 ;
    public final void rule__ComputeInstance__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1169:1: ( rule__ComputeInstance__Group__18__Impl rule__ComputeInstance__Group__19 )
            // InternalEntityDsl.g:1170:2: rule__ComputeInstance__Group__18__Impl rule__ComputeInstance__Group__19
            {
            pushFollow(FOLLOW_20);
            rule__ComputeInstance__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__18"


    // $ANTLR start "rule__ComputeInstance__Group__18__Impl"
    // InternalEntityDsl.g:1177:1: rule__ComputeInstance__Group__18__Impl : ( '{' ) ;
    public final void rule__ComputeInstance__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1181:1: ( ( '{' ) )
            // InternalEntityDsl.g:1182:1: ( '{' )
            {
            // InternalEntityDsl.g:1182:1: ( '{' )
            // InternalEntityDsl.g:1183:2: '{'
            {
             before(grammarAccess.getComputeInstanceAccess().getLeftCurlyBracketKeyword_18()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getLeftCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__18__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__19"
    // InternalEntityDsl.g:1192:1: rule__ComputeInstance__Group__19 : rule__ComputeInstance__Group__19__Impl rule__ComputeInstance__Group__20 ;
    public final void rule__ComputeInstance__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1196:1: ( rule__ComputeInstance__Group__19__Impl rule__ComputeInstance__Group__20 )
            // InternalEntityDsl.g:1197:2: rule__ComputeInstance__Group__19__Impl rule__ComputeInstance__Group__20
            {
            pushFollow(FOLLOW_6);
            rule__ComputeInstance__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__19"


    // $ANTLR start "rule__ComputeInstance__Group__19__Impl"
    // InternalEntityDsl.g:1204:1: rule__ComputeInstance__Group__19__Impl : ( 'specifications' ) ;
    public final void rule__ComputeInstance__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1208:1: ( ( 'specifications' ) )
            // InternalEntityDsl.g:1209:1: ( 'specifications' )
            {
            // InternalEntityDsl.g:1209:1: ( 'specifications' )
            // InternalEntityDsl.g:1210:2: 'specifications'
            {
             before(grammarAccess.getComputeInstanceAccess().getSpecificationsKeyword_19()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getSpecificationsKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__19__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__20"
    // InternalEntityDsl.g:1219:1: rule__ComputeInstance__Group__20 : rule__ComputeInstance__Group__20__Impl rule__ComputeInstance__Group__21 ;
    public final void rule__ComputeInstance__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1223:1: ( rule__ComputeInstance__Group__20__Impl rule__ComputeInstance__Group__21 )
            // InternalEntityDsl.g:1224:2: rule__ComputeInstance__Group__20__Impl rule__ComputeInstance__Group__21
            {
            pushFollow(FOLLOW_21);
            rule__ComputeInstance__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__20"


    // $ANTLR start "rule__ComputeInstance__Group__20__Impl"
    // InternalEntityDsl.g:1231:1: rule__ComputeInstance__Group__20__Impl : ( '{' ) ;
    public final void rule__ComputeInstance__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1235:1: ( ( '{' ) )
            // InternalEntityDsl.g:1236:1: ( '{' )
            {
            // InternalEntityDsl.g:1236:1: ( '{' )
            // InternalEntityDsl.g:1237:2: '{'
            {
             before(grammarAccess.getComputeInstanceAccess().getLeftCurlyBracketKeyword_20()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getLeftCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__20__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__21"
    // InternalEntityDsl.g:1246:1: rule__ComputeInstance__Group__21 : rule__ComputeInstance__Group__21__Impl rule__ComputeInstance__Group__22 ;
    public final void rule__ComputeInstance__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1250:1: ( rule__ComputeInstance__Group__21__Impl rule__ComputeInstance__Group__22 )
            // InternalEntityDsl.g:1251:2: rule__ComputeInstance__Group__21__Impl rule__ComputeInstance__Group__22
            {
            pushFollow(FOLLOW_22);
            rule__ComputeInstance__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__21"


    // $ANTLR start "rule__ComputeInstance__Group__21__Impl"
    // InternalEntityDsl.g:1258:1: rule__ComputeInstance__Group__21__Impl : ( 'cpu' ) ;
    public final void rule__ComputeInstance__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1262:1: ( ( 'cpu' ) )
            // InternalEntityDsl.g:1263:1: ( 'cpu' )
            {
            // InternalEntityDsl.g:1263:1: ( 'cpu' )
            // InternalEntityDsl.g:1264:2: 'cpu'
            {
             before(grammarAccess.getComputeInstanceAccess().getCpuKeyword_21()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getCpuKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__21__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__22"
    // InternalEntityDsl.g:1273:1: rule__ComputeInstance__Group__22 : rule__ComputeInstance__Group__22__Impl rule__ComputeInstance__Group__23 ;
    public final void rule__ComputeInstance__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1277:1: ( rule__ComputeInstance__Group__22__Impl rule__ComputeInstance__Group__23 )
            // InternalEntityDsl.g:1278:2: rule__ComputeInstance__Group__22__Impl rule__ComputeInstance__Group__23
            {
            pushFollow(FOLLOW_23);
            rule__ComputeInstance__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__22"


    // $ANTLR start "rule__ComputeInstance__Group__22__Impl"
    // InternalEntityDsl.g:1285:1: rule__ComputeInstance__Group__22__Impl : ( ':' ) ;
    public final void rule__ComputeInstance__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1289:1: ( ( ':' ) )
            // InternalEntityDsl.g:1290:1: ( ':' )
            {
            // InternalEntityDsl.g:1290:1: ( ':' )
            // InternalEntityDsl.g:1291:2: ':'
            {
             before(grammarAccess.getComputeInstanceAccess().getColonKeyword_22()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getColonKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__22__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__23"
    // InternalEntityDsl.g:1300:1: rule__ComputeInstance__Group__23 : rule__ComputeInstance__Group__23__Impl rule__ComputeInstance__Group__24 ;
    public final void rule__ComputeInstance__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1304:1: ( rule__ComputeInstance__Group__23__Impl rule__ComputeInstance__Group__24 )
            // InternalEntityDsl.g:1305:2: rule__ComputeInstance__Group__23__Impl rule__ComputeInstance__Group__24
            {
            pushFollow(FOLLOW_24);
            rule__ComputeInstance__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__23"


    // $ANTLR start "rule__ComputeInstance__Group__23__Impl"
    // InternalEntityDsl.g:1312:1: rule__ComputeInstance__Group__23__Impl : ( ( rule__ComputeInstance__CPUAssignment_23 ) ) ;
    public final void rule__ComputeInstance__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1316:1: ( ( ( rule__ComputeInstance__CPUAssignment_23 ) ) )
            // InternalEntityDsl.g:1317:1: ( ( rule__ComputeInstance__CPUAssignment_23 ) )
            {
            // InternalEntityDsl.g:1317:1: ( ( rule__ComputeInstance__CPUAssignment_23 ) )
            // InternalEntityDsl.g:1318:2: ( rule__ComputeInstance__CPUAssignment_23 )
            {
             before(grammarAccess.getComputeInstanceAccess().getCPUAssignment_23()); 
            // InternalEntityDsl.g:1319:2: ( rule__ComputeInstance__CPUAssignment_23 )
            // InternalEntityDsl.g:1319:3: rule__ComputeInstance__CPUAssignment_23
            {
            pushFollow(FOLLOW_2);
            rule__ComputeInstance__CPUAssignment_23();

            state._fsp--;


            }

             after(grammarAccess.getComputeInstanceAccess().getCPUAssignment_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__23__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__24"
    // InternalEntityDsl.g:1327:1: rule__ComputeInstance__Group__24 : rule__ComputeInstance__Group__24__Impl rule__ComputeInstance__Group__25 ;
    public final void rule__ComputeInstance__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1331:1: ( rule__ComputeInstance__Group__24__Impl rule__ComputeInstance__Group__25 )
            // InternalEntityDsl.g:1332:2: rule__ComputeInstance__Group__24__Impl rule__ComputeInstance__Group__25
            {
            pushFollow(FOLLOW_25);
            rule__ComputeInstance__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__24"


    // $ANTLR start "rule__ComputeInstance__Group__24__Impl"
    // InternalEntityDsl.g:1339:1: rule__ComputeInstance__Group__24__Impl : ( 'cores' ) ;
    public final void rule__ComputeInstance__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1343:1: ( ( 'cores' ) )
            // InternalEntityDsl.g:1344:1: ( 'cores' )
            {
            // InternalEntityDsl.g:1344:1: ( 'cores' )
            // InternalEntityDsl.g:1345:2: 'cores'
            {
             before(grammarAccess.getComputeInstanceAccess().getCoresKeyword_24()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getCoresKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__24__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__25"
    // InternalEntityDsl.g:1354:1: rule__ComputeInstance__Group__25 : rule__ComputeInstance__Group__25__Impl rule__ComputeInstance__Group__26 ;
    public final void rule__ComputeInstance__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1358:1: ( rule__ComputeInstance__Group__25__Impl rule__ComputeInstance__Group__26 )
            // InternalEntityDsl.g:1359:2: rule__ComputeInstance__Group__25__Impl rule__ComputeInstance__Group__26
            {
            pushFollow(FOLLOW_22);
            rule__ComputeInstance__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__25"


    // $ANTLR start "rule__ComputeInstance__Group__25__Impl"
    // InternalEntityDsl.g:1366:1: rule__ComputeInstance__Group__25__Impl : ( 'memory' ) ;
    public final void rule__ComputeInstance__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1370:1: ( ( 'memory' ) )
            // InternalEntityDsl.g:1371:1: ( 'memory' )
            {
            // InternalEntityDsl.g:1371:1: ( 'memory' )
            // InternalEntityDsl.g:1372:2: 'memory'
            {
             before(grammarAccess.getComputeInstanceAccess().getMemoryKeyword_25()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getMemoryKeyword_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__25__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__26"
    // InternalEntityDsl.g:1381:1: rule__ComputeInstance__Group__26 : rule__ComputeInstance__Group__26__Impl rule__ComputeInstance__Group__27 ;
    public final void rule__ComputeInstance__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1385:1: ( rule__ComputeInstance__Group__26__Impl rule__ComputeInstance__Group__27 )
            // InternalEntityDsl.g:1386:2: rule__ComputeInstance__Group__26__Impl rule__ComputeInstance__Group__27
            {
            pushFollow(FOLLOW_23);
            rule__ComputeInstance__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__26"


    // $ANTLR start "rule__ComputeInstance__Group__26__Impl"
    // InternalEntityDsl.g:1393:1: rule__ComputeInstance__Group__26__Impl : ( ':' ) ;
    public final void rule__ComputeInstance__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1397:1: ( ( ':' ) )
            // InternalEntityDsl.g:1398:1: ( ':' )
            {
            // InternalEntityDsl.g:1398:1: ( ':' )
            // InternalEntityDsl.g:1399:2: ':'
            {
             before(grammarAccess.getComputeInstanceAccess().getColonKeyword_26()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getColonKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__26__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__27"
    // InternalEntityDsl.g:1408:1: rule__ComputeInstance__Group__27 : rule__ComputeInstance__Group__27__Impl rule__ComputeInstance__Group__28 ;
    public final void rule__ComputeInstance__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1412:1: ( rule__ComputeInstance__Group__27__Impl rule__ComputeInstance__Group__28 )
            // InternalEntityDsl.g:1413:2: rule__ComputeInstance__Group__27__Impl rule__ComputeInstance__Group__28
            {
            pushFollow(FOLLOW_26);
            rule__ComputeInstance__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__28();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__27"


    // $ANTLR start "rule__ComputeInstance__Group__27__Impl"
    // InternalEntityDsl.g:1420:1: rule__ComputeInstance__Group__27__Impl : ( ( rule__ComputeInstance__MemoryGBAssignment_27 ) ) ;
    public final void rule__ComputeInstance__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1424:1: ( ( ( rule__ComputeInstance__MemoryGBAssignment_27 ) ) )
            // InternalEntityDsl.g:1425:1: ( ( rule__ComputeInstance__MemoryGBAssignment_27 ) )
            {
            // InternalEntityDsl.g:1425:1: ( ( rule__ComputeInstance__MemoryGBAssignment_27 ) )
            // InternalEntityDsl.g:1426:2: ( rule__ComputeInstance__MemoryGBAssignment_27 )
            {
             before(grammarAccess.getComputeInstanceAccess().getMemoryGBAssignment_27()); 
            // InternalEntityDsl.g:1427:2: ( rule__ComputeInstance__MemoryGBAssignment_27 )
            // InternalEntityDsl.g:1427:3: rule__ComputeInstance__MemoryGBAssignment_27
            {
            pushFollow(FOLLOW_2);
            rule__ComputeInstance__MemoryGBAssignment_27();

            state._fsp--;


            }

             after(grammarAccess.getComputeInstanceAccess().getMemoryGBAssignment_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__27__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__28"
    // InternalEntityDsl.g:1435:1: rule__ComputeInstance__Group__28 : rule__ComputeInstance__Group__28__Impl rule__ComputeInstance__Group__29 ;
    public final void rule__ComputeInstance__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1439:1: ( rule__ComputeInstance__Group__28__Impl rule__ComputeInstance__Group__29 )
            // InternalEntityDsl.g:1440:2: rule__ComputeInstance__Group__28__Impl rule__ComputeInstance__Group__29
            {
            pushFollow(FOLLOW_27);
            rule__ComputeInstance__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__29();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__28"


    // $ANTLR start "rule__ComputeInstance__Group__28__Impl"
    // InternalEntityDsl.g:1447:1: rule__ComputeInstance__Group__28__Impl : ( 'GB' ) ;
    public final void rule__ComputeInstance__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1451:1: ( ( 'GB' ) )
            // InternalEntityDsl.g:1452:1: ( 'GB' )
            {
            // InternalEntityDsl.g:1452:1: ( 'GB' )
            // InternalEntityDsl.g:1453:2: 'GB'
            {
             before(grammarAccess.getComputeInstanceAccess().getGBKeyword_28()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getGBKeyword_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__28__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__29"
    // InternalEntityDsl.g:1462:1: rule__ComputeInstance__Group__29 : rule__ComputeInstance__Group__29__Impl rule__ComputeInstance__Group__30 ;
    public final void rule__ComputeInstance__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1466:1: ( rule__ComputeInstance__Group__29__Impl rule__ComputeInstance__Group__30 )
            // InternalEntityDsl.g:1467:2: rule__ComputeInstance__Group__29__Impl rule__ComputeInstance__Group__30
            {
            pushFollow(FOLLOW_27);
            rule__ComputeInstance__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__30();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__29"


    // $ANTLR start "rule__ComputeInstance__Group__29__Impl"
    // InternalEntityDsl.g:1474:1: rule__ComputeInstance__Group__29__Impl : ( '}' ) ;
    public final void rule__ComputeInstance__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1478:1: ( ( '}' ) )
            // InternalEntityDsl.g:1479:1: ( '}' )
            {
            // InternalEntityDsl.g:1479:1: ( '}' )
            // InternalEntityDsl.g:1480:2: '}'
            {
             before(grammarAccess.getComputeInstanceAccess().getRightCurlyBracketKeyword_29()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getRightCurlyBracketKeyword_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__29__Impl"


    // $ANTLR start "rule__ComputeInstance__Group__30"
    // InternalEntityDsl.g:1489:1: rule__ComputeInstance__Group__30 : rule__ComputeInstance__Group__30__Impl ;
    public final void rule__ComputeInstance__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1493:1: ( rule__ComputeInstance__Group__30__Impl )
            // InternalEntityDsl.g:1494:2: rule__ComputeInstance__Group__30__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComputeInstance__Group__30__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__30"


    // $ANTLR start "rule__ComputeInstance__Group__30__Impl"
    // InternalEntityDsl.g:1500:1: rule__ComputeInstance__Group__30__Impl : ( '}' ) ;
    public final void rule__ComputeInstance__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1504:1: ( ( '}' ) )
            // InternalEntityDsl.g:1505:1: ( '}' )
            {
            // InternalEntityDsl.g:1505:1: ( '}' )
            // InternalEntityDsl.g:1506:2: '}'
            {
             before(grammarAccess.getComputeInstanceAccess().getRightCurlyBracketKeyword_30()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getRightCurlyBracketKeyword_30()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__Group__30__Impl"


    // $ANTLR start "rule__StorageBucket__Group__0"
    // InternalEntityDsl.g:1516:1: rule__StorageBucket__Group__0 : rule__StorageBucket__Group__0__Impl rule__StorageBucket__Group__1 ;
    public final void rule__StorageBucket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1520:1: ( rule__StorageBucket__Group__0__Impl rule__StorageBucket__Group__1 )
            // InternalEntityDsl.g:1521:2: rule__StorageBucket__Group__0__Impl rule__StorageBucket__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__StorageBucket__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StorageBucket__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__0"


    // $ANTLR start "rule__StorageBucket__Group__0__Impl"
    // InternalEntityDsl.g:1528:1: rule__StorageBucket__Group__0__Impl : ( 'bucket' ) ;
    public final void rule__StorageBucket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1532:1: ( ( 'bucket' ) )
            // InternalEntityDsl.g:1533:1: ( 'bucket' )
            {
            // InternalEntityDsl.g:1533:1: ( 'bucket' )
            // InternalEntityDsl.g:1534:2: 'bucket'
            {
             before(grammarAccess.getStorageBucketAccess().getBucketKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getStorageBucketAccess().getBucketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__0__Impl"


    // $ANTLR start "rule__StorageBucket__Group__1"
    // InternalEntityDsl.g:1543:1: rule__StorageBucket__Group__1 : rule__StorageBucket__Group__1__Impl rule__StorageBucket__Group__2 ;
    public final void rule__StorageBucket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1547:1: ( rule__StorageBucket__Group__1__Impl rule__StorageBucket__Group__2 )
            // InternalEntityDsl.g:1548:2: rule__StorageBucket__Group__1__Impl rule__StorageBucket__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__StorageBucket__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StorageBucket__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__1"


    // $ANTLR start "rule__StorageBucket__Group__1__Impl"
    // InternalEntityDsl.g:1555:1: rule__StorageBucket__Group__1__Impl : ( ( rule__StorageBucket__NameAssignment_1 ) ) ;
    public final void rule__StorageBucket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1559:1: ( ( ( rule__StorageBucket__NameAssignment_1 ) ) )
            // InternalEntityDsl.g:1560:1: ( ( rule__StorageBucket__NameAssignment_1 ) )
            {
            // InternalEntityDsl.g:1560:1: ( ( rule__StorageBucket__NameAssignment_1 ) )
            // InternalEntityDsl.g:1561:2: ( rule__StorageBucket__NameAssignment_1 )
            {
             before(grammarAccess.getStorageBucketAccess().getNameAssignment_1()); 
            // InternalEntityDsl.g:1562:2: ( rule__StorageBucket__NameAssignment_1 )
            // InternalEntityDsl.g:1562:3: rule__StorageBucket__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StorageBucket__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStorageBucketAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__1__Impl"


    // $ANTLR start "rule__StorageBucket__Group__2"
    // InternalEntityDsl.g:1570:1: rule__StorageBucket__Group__2 : rule__StorageBucket__Group__2__Impl rule__StorageBucket__Group__3 ;
    public final void rule__StorageBucket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1574:1: ( rule__StorageBucket__Group__2__Impl rule__StorageBucket__Group__3 )
            // InternalEntityDsl.g:1575:2: rule__StorageBucket__Group__2__Impl rule__StorageBucket__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__StorageBucket__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StorageBucket__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__2"


    // $ANTLR start "rule__StorageBucket__Group__2__Impl"
    // InternalEntityDsl.g:1582:1: rule__StorageBucket__Group__2__Impl : ( 'hosted' ) ;
    public final void rule__StorageBucket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1586:1: ( ( 'hosted' ) )
            // InternalEntityDsl.g:1587:1: ( 'hosted' )
            {
            // InternalEntityDsl.g:1587:1: ( 'hosted' )
            // InternalEntityDsl.g:1588:2: 'hosted'
            {
             before(grammarAccess.getStorageBucketAccess().getHostedKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStorageBucketAccess().getHostedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__2__Impl"


    // $ANTLR start "rule__StorageBucket__Group__3"
    // InternalEntityDsl.g:1597:1: rule__StorageBucket__Group__3 : rule__StorageBucket__Group__3__Impl rule__StorageBucket__Group__4 ;
    public final void rule__StorageBucket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1601:1: ( rule__StorageBucket__Group__3__Impl rule__StorageBucket__Group__4 )
            // InternalEntityDsl.g:1602:2: rule__StorageBucket__Group__3__Impl rule__StorageBucket__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__StorageBucket__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StorageBucket__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__3"


    // $ANTLR start "rule__StorageBucket__Group__3__Impl"
    // InternalEntityDsl.g:1609:1: rule__StorageBucket__Group__3__Impl : ( 'in' ) ;
    public final void rule__StorageBucket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1613:1: ( ( 'in' ) )
            // InternalEntityDsl.g:1614:1: ( 'in' )
            {
            // InternalEntityDsl.g:1614:1: ( 'in' )
            // InternalEntityDsl.g:1615:2: 'in'
            {
             before(grammarAccess.getStorageBucketAccess().getInKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStorageBucketAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__3__Impl"


    // $ANTLR start "rule__StorageBucket__Group__4"
    // InternalEntityDsl.g:1624:1: rule__StorageBucket__Group__4 : rule__StorageBucket__Group__4__Impl rule__StorageBucket__Group__5 ;
    public final void rule__StorageBucket__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1628:1: ( rule__StorageBucket__Group__4__Impl rule__StorageBucket__Group__5 )
            // InternalEntityDsl.g:1629:2: rule__StorageBucket__Group__4__Impl rule__StorageBucket__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__StorageBucket__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StorageBucket__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__4"


    // $ANTLR start "rule__StorageBucket__Group__4__Impl"
    // InternalEntityDsl.g:1636:1: rule__StorageBucket__Group__4__Impl : ( ( rule__StorageBucket__RegionAssignment_4 ) ) ;
    public final void rule__StorageBucket__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1640:1: ( ( ( rule__StorageBucket__RegionAssignment_4 ) ) )
            // InternalEntityDsl.g:1641:1: ( ( rule__StorageBucket__RegionAssignment_4 ) )
            {
            // InternalEntityDsl.g:1641:1: ( ( rule__StorageBucket__RegionAssignment_4 ) )
            // InternalEntityDsl.g:1642:2: ( rule__StorageBucket__RegionAssignment_4 )
            {
             before(grammarAccess.getStorageBucketAccess().getRegionAssignment_4()); 
            // InternalEntityDsl.g:1643:2: ( rule__StorageBucket__RegionAssignment_4 )
            // InternalEntityDsl.g:1643:3: rule__StorageBucket__RegionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__StorageBucket__RegionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStorageBucketAccess().getRegionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__4__Impl"


    // $ANTLR start "rule__StorageBucket__Group__5"
    // InternalEntityDsl.g:1651:1: rule__StorageBucket__Group__5 : rule__StorageBucket__Group__5__Impl rule__StorageBucket__Group__6 ;
    public final void rule__StorageBucket__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1655:1: ( rule__StorageBucket__Group__5__Impl rule__StorageBucket__Group__6 )
            // InternalEntityDsl.g:1656:2: rule__StorageBucket__Group__5__Impl rule__StorageBucket__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__StorageBucket__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StorageBucket__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__5"


    // $ANTLR start "rule__StorageBucket__Group__5__Impl"
    // InternalEntityDsl.g:1663:1: rule__StorageBucket__Group__5__Impl : ( '{' ) ;
    public final void rule__StorageBucket__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1667:1: ( ( '{' ) )
            // InternalEntityDsl.g:1668:1: ( '{' )
            {
            // InternalEntityDsl.g:1668:1: ( '{' )
            // InternalEntityDsl.g:1669:2: '{'
            {
             before(grammarAccess.getStorageBucketAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStorageBucketAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__5__Impl"


    // $ANTLR start "rule__StorageBucket__Group__6"
    // InternalEntityDsl.g:1678:1: rule__StorageBucket__Group__6 : rule__StorageBucket__Group__6__Impl rule__StorageBucket__Group__7 ;
    public final void rule__StorageBucket__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1682:1: ( rule__StorageBucket__Group__6__Impl rule__StorageBucket__Group__7 )
            // InternalEntityDsl.g:1683:2: rule__StorageBucket__Group__6__Impl rule__StorageBucket__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__StorageBucket__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StorageBucket__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__6"


    // $ANTLR start "rule__StorageBucket__Group__6__Impl"
    // InternalEntityDsl.g:1690:1: rule__StorageBucket__Group__6__Impl : ( ( 'enable' )? ) ;
    public final void rule__StorageBucket__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1694:1: ( ( ( 'enable' )? ) )
            // InternalEntityDsl.g:1695:1: ( ( 'enable' )? )
            {
            // InternalEntityDsl.g:1695:1: ( ( 'enable' )? )
            // InternalEntityDsl.g:1696:2: ( 'enable' )?
            {
             before(grammarAccess.getStorageBucketAccess().getEnableKeyword_6()); 
            // InternalEntityDsl.g:1697:2: ( 'enable' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==43) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEntityDsl.g:1697:3: 'enable'
                    {
                    match(input,43,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getStorageBucketAccess().getEnableKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__6__Impl"


    // $ANTLR start "rule__StorageBucket__Group__7"
    // InternalEntityDsl.g:1705:1: rule__StorageBucket__Group__7 : rule__StorageBucket__Group__7__Impl rule__StorageBucket__Group__8 ;
    public final void rule__StorageBucket__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1709:1: ( rule__StorageBucket__Group__7__Impl rule__StorageBucket__Group__8 )
            // InternalEntityDsl.g:1710:2: rule__StorageBucket__Group__7__Impl rule__StorageBucket__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__StorageBucket__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StorageBucket__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__7"


    // $ANTLR start "rule__StorageBucket__Group__7__Impl"
    // InternalEntityDsl.g:1717:1: rule__StorageBucket__Group__7__Impl : ( ( rule__StorageBucket__VersioningAssignment_7 )? ) ;
    public final void rule__StorageBucket__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1721:1: ( ( ( rule__StorageBucket__VersioningAssignment_7 )? ) )
            // InternalEntityDsl.g:1722:1: ( ( rule__StorageBucket__VersioningAssignment_7 )? )
            {
            // InternalEntityDsl.g:1722:1: ( ( rule__StorageBucket__VersioningAssignment_7 )? )
            // InternalEntityDsl.g:1723:2: ( rule__StorageBucket__VersioningAssignment_7 )?
            {
             before(grammarAccess.getStorageBucketAccess().getVersioningAssignment_7()); 
            // InternalEntityDsl.g:1724:2: ( rule__StorageBucket__VersioningAssignment_7 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==52) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEntityDsl.g:1724:3: rule__StorageBucket__VersioningAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__StorageBucket__VersioningAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStorageBucketAccess().getVersioningAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__7__Impl"


    // $ANTLR start "rule__StorageBucket__Group__8"
    // InternalEntityDsl.g:1732:1: rule__StorageBucket__Group__8 : rule__StorageBucket__Group__8__Impl ;
    public final void rule__StorageBucket__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1736:1: ( rule__StorageBucket__Group__8__Impl )
            // InternalEntityDsl.g:1737:2: rule__StorageBucket__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StorageBucket__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__8"


    // $ANTLR start "rule__StorageBucket__Group__8__Impl"
    // InternalEntityDsl.g:1743:1: rule__StorageBucket__Group__8__Impl : ( '}' ) ;
    public final void rule__StorageBucket__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1747:1: ( ( '}' ) )
            // InternalEntityDsl.g:1748:1: ( '}' )
            {
            // InternalEntityDsl.g:1748:1: ( '}' )
            // InternalEntityDsl.g:1749:2: '}'
            {
             before(grammarAccess.getStorageBucketAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStorageBucketAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__Group__8__Impl"


    // $ANTLR start "rule__Network__Group__0"
    // InternalEntityDsl.g:1759:1: rule__Network__Group__0 : rule__Network__Group__0__Impl rule__Network__Group__1 ;
    public final void rule__Network__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1763:1: ( rule__Network__Group__0__Impl rule__Network__Group__1 )
            // InternalEntityDsl.g:1764:2: rule__Network__Group__0__Impl rule__Network__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Network__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__0"


    // $ANTLR start "rule__Network__Group__0__Impl"
    // InternalEntityDsl.g:1771:1: rule__Network__Group__0__Impl : ( 'configure' ) ;
    public final void rule__Network__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1775:1: ( ( 'configure' ) )
            // InternalEntityDsl.g:1776:1: ( 'configure' )
            {
            // InternalEntityDsl.g:1776:1: ( 'configure' )
            // InternalEntityDsl.g:1777:2: 'configure'
            {
             before(grammarAccess.getNetworkAccess().getConfigureKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getConfigureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__0__Impl"


    // $ANTLR start "rule__Network__Group__1"
    // InternalEntityDsl.g:1786:1: rule__Network__Group__1 : rule__Network__Group__1__Impl rule__Network__Group__2 ;
    public final void rule__Network__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1790:1: ( rule__Network__Group__1__Impl rule__Network__Group__2 )
            // InternalEntityDsl.g:1791:2: rule__Network__Group__1__Impl rule__Network__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Network__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__1"


    // $ANTLR start "rule__Network__Group__1__Impl"
    // InternalEntityDsl.g:1798:1: rule__Network__Group__1__Impl : ( 'network' ) ;
    public final void rule__Network__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1802:1: ( ( 'network' ) )
            // InternalEntityDsl.g:1803:1: ( 'network' )
            {
            // InternalEntityDsl.g:1803:1: ( 'network' )
            // InternalEntityDsl.g:1804:2: 'network'
            {
             before(grammarAccess.getNetworkAccess().getNetworkKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getNetworkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__1__Impl"


    // $ANTLR start "rule__Network__Group__2"
    // InternalEntityDsl.g:1813:1: rule__Network__Group__2 : rule__Network__Group__2__Impl rule__Network__Group__3 ;
    public final void rule__Network__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1817:1: ( rule__Network__Group__2__Impl rule__Network__Group__3 )
            // InternalEntityDsl.g:1818:2: rule__Network__Group__2__Impl rule__Network__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Network__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__2"


    // $ANTLR start "rule__Network__Group__2__Impl"
    // InternalEntityDsl.g:1825:1: rule__Network__Group__2__Impl : ( ( rule__Network__NameAssignment_2 ) ) ;
    public final void rule__Network__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1829:1: ( ( ( rule__Network__NameAssignment_2 ) ) )
            // InternalEntityDsl.g:1830:1: ( ( rule__Network__NameAssignment_2 ) )
            {
            // InternalEntityDsl.g:1830:1: ( ( rule__Network__NameAssignment_2 ) )
            // InternalEntityDsl.g:1831:2: ( rule__Network__NameAssignment_2 )
            {
             before(grammarAccess.getNetworkAccess().getNameAssignment_2()); 
            // InternalEntityDsl.g:1832:2: ( rule__Network__NameAssignment_2 )
            // InternalEntityDsl.g:1832:3: rule__Network__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Network__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__2__Impl"


    // $ANTLR start "rule__Network__Group__3"
    // InternalEntityDsl.g:1840:1: rule__Network__Group__3 : rule__Network__Group__3__Impl rule__Network__Group__4 ;
    public final void rule__Network__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1844:1: ( rule__Network__Group__3__Impl rule__Network__Group__4 )
            // InternalEntityDsl.g:1845:2: rule__Network__Group__3__Impl rule__Network__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Network__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__3"


    // $ANTLR start "rule__Network__Group__3__Impl"
    // InternalEntityDsl.g:1852:1: rule__Network__Group__3__Impl : ( '{' ) ;
    public final void rule__Network__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1856:1: ( ( '{' ) )
            // InternalEntityDsl.g:1857:1: ( '{' )
            {
            // InternalEntityDsl.g:1857:1: ( '{' )
            // InternalEntityDsl.g:1858:2: '{'
            {
             before(grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__3__Impl"


    // $ANTLR start "rule__Network__Group__4"
    // InternalEntityDsl.g:1867:1: rule__Network__Group__4 : rule__Network__Group__4__Impl rule__Network__Group__5 ;
    public final void rule__Network__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1871:1: ( rule__Network__Group__4__Impl rule__Network__Group__5 )
            // InternalEntityDsl.g:1872:2: rule__Network__Group__4__Impl rule__Network__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Network__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__4"


    // $ANTLR start "rule__Network__Group__4__Impl"
    // InternalEntityDsl.g:1879:1: rule__Network__Group__4__Impl : ( ( rule__Network__Alternatives_4 )* ) ;
    public final void rule__Network__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1883:1: ( ( ( rule__Network__Alternatives_4 )* ) )
            // InternalEntityDsl.g:1884:1: ( ( rule__Network__Alternatives_4 )* )
            {
            // InternalEntityDsl.g:1884:1: ( ( rule__Network__Alternatives_4 )* )
            // InternalEntityDsl.g:1885:2: ( rule__Network__Alternatives_4 )*
            {
             before(grammarAccess.getNetworkAccess().getAlternatives_4()); 
            // InternalEntityDsl.g:1886:2: ( rule__Network__Alternatives_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32||LA10_0==48) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEntityDsl.g:1886:3: rule__Network__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Network__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getNetworkAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__4__Impl"


    // $ANTLR start "rule__Network__Group__5"
    // InternalEntityDsl.g:1894:1: rule__Network__Group__5 : rule__Network__Group__5__Impl ;
    public final void rule__Network__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1898:1: ( rule__Network__Group__5__Impl )
            // InternalEntityDsl.g:1899:2: rule__Network__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__5"


    // $ANTLR start "rule__Network__Group__5__Impl"
    // InternalEntityDsl.g:1905:1: rule__Network__Group__5__Impl : ( '}' ) ;
    public final void rule__Network__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1909:1: ( ( '}' ) )
            // InternalEntityDsl.g:1910:1: ( '}' )
            {
            // InternalEntityDsl.g:1910:1: ( '}' )
            // InternalEntityDsl.g:1911:2: '}'
            {
             before(grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__5__Impl"


    // $ANTLR start "rule__VPC__Group__0"
    // InternalEntityDsl.g:1921:1: rule__VPC__Group__0 : rule__VPC__Group__0__Impl rule__VPC__Group__1 ;
    public final void rule__VPC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1925:1: ( rule__VPC__Group__0__Impl rule__VPC__Group__1 )
            // InternalEntityDsl.g:1926:2: rule__VPC__Group__0__Impl rule__VPC__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__VPC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__0"


    // $ANTLR start "rule__VPC__Group__0__Impl"
    // InternalEntityDsl.g:1933:1: rule__VPC__Group__0__Impl : ( 'vpc' ) ;
    public final void rule__VPC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1937:1: ( ( 'vpc' ) )
            // InternalEntityDsl.g:1938:1: ( 'vpc' )
            {
            // InternalEntityDsl.g:1938:1: ( 'vpc' )
            // InternalEntityDsl.g:1939:2: 'vpc'
            {
             before(grammarAccess.getVPCAccess().getVpcKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getVpcKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__0__Impl"


    // $ANTLR start "rule__VPC__Group__1"
    // InternalEntityDsl.g:1948:1: rule__VPC__Group__1 : rule__VPC__Group__1__Impl rule__VPC__Group__2 ;
    public final void rule__VPC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1952:1: ( rule__VPC__Group__1__Impl rule__VPC__Group__2 )
            // InternalEntityDsl.g:1953:2: rule__VPC__Group__1__Impl rule__VPC__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__VPC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__1"


    // $ANTLR start "rule__VPC__Group__1__Impl"
    // InternalEntityDsl.g:1960:1: rule__VPC__Group__1__Impl : ( ( rule__VPC__NameAssignment_1 ) ) ;
    public final void rule__VPC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1964:1: ( ( ( rule__VPC__NameAssignment_1 ) ) )
            // InternalEntityDsl.g:1965:1: ( ( rule__VPC__NameAssignment_1 ) )
            {
            // InternalEntityDsl.g:1965:1: ( ( rule__VPC__NameAssignment_1 ) )
            // InternalEntityDsl.g:1966:2: ( rule__VPC__NameAssignment_1 )
            {
             before(grammarAccess.getVPCAccess().getNameAssignment_1()); 
            // InternalEntityDsl.g:1967:2: ( rule__VPC__NameAssignment_1 )
            // InternalEntityDsl.g:1967:3: rule__VPC__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VPC__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVPCAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__1__Impl"


    // $ANTLR start "rule__VPC__Group__2"
    // InternalEntityDsl.g:1975:1: rule__VPC__Group__2 : rule__VPC__Group__2__Impl rule__VPC__Group__3 ;
    public final void rule__VPC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1979:1: ( rule__VPC__Group__2__Impl rule__VPC__Group__3 )
            // InternalEntityDsl.g:1980:2: rule__VPC__Group__2__Impl rule__VPC__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__VPC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__2"


    // $ANTLR start "rule__VPC__Group__2__Impl"
    // InternalEntityDsl.g:1987:1: rule__VPC__Group__2__Impl : ( '{' ) ;
    public final void rule__VPC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1991:1: ( ( '{' ) )
            // InternalEntityDsl.g:1992:1: ( '{' )
            {
            // InternalEntityDsl.g:1992:1: ( '{' )
            // InternalEntityDsl.g:1993:2: '{'
            {
             before(grammarAccess.getVPCAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__2__Impl"


    // $ANTLR start "rule__VPC__Group__3"
    // InternalEntityDsl.g:2002:1: rule__VPC__Group__3 : rule__VPC__Group__3__Impl rule__VPC__Group__4 ;
    public final void rule__VPC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2006:1: ( rule__VPC__Group__3__Impl rule__VPC__Group__4 )
            // InternalEntityDsl.g:2007:2: rule__VPC__Group__3__Impl rule__VPC__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__VPC__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__3"


    // $ANTLR start "rule__VPC__Group__3__Impl"
    // InternalEntityDsl.g:2014:1: rule__VPC__Group__3__Impl : ( 'address' ) ;
    public final void rule__VPC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2018:1: ( ( 'address' ) )
            // InternalEntityDsl.g:2019:1: ( 'address' )
            {
            // InternalEntityDsl.g:2019:1: ( 'address' )
            // InternalEntityDsl.g:2020:2: 'address'
            {
             before(grammarAccess.getVPCAccess().getAddressKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getAddressKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__3__Impl"


    // $ANTLR start "rule__VPC__Group__4"
    // InternalEntityDsl.g:2029:1: rule__VPC__Group__4 : rule__VPC__Group__4__Impl rule__VPC__Group__5 ;
    public final void rule__VPC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2033:1: ( rule__VPC__Group__4__Impl rule__VPC__Group__5 )
            // InternalEntityDsl.g:2034:2: rule__VPC__Group__4__Impl rule__VPC__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__VPC__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__4"


    // $ANTLR start "rule__VPC__Group__4__Impl"
    // InternalEntityDsl.g:2041:1: rule__VPC__Group__4__Impl : ( 'space' ) ;
    public final void rule__VPC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2045:1: ( ( 'space' ) )
            // InternalEntityDsl.g:2046:1: ( 'space' )
            {
            // InternalEntityDsl.g:2046:1: ( 'space' )
            // InternalEntityDsl.g:2047:2: 'space'
            {
             before(grammarAccess.getVPCAccess().getSpaceKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getSpaceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__4__Impl"


    // $ANTLR start "rule__VPC__Group__5"
    // InternalEntityDsl.g:2056:1: rule__VPC__Group__5 : rule__VPC__Group__5__Impl rule__VPC__Group__6 ;
    public final void rule__VPC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2060:1: ( rule__VPC__Group__5__Impl rule__VPC__Group__6 )
            // InternalEntityDsl.g:2061:2: rule__VPC__Group__5__Impl rule__VPC__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__VPC__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__5"


    // $ANTLR start "rule__VPC__Group__5__Impl"
    // InternalEntityDsl.g:2068:1: rule__VPC__Group__5__Impl : ( ( rule__VPC__CidrAssignment_5 ) ) ;
    public final void rule__VPC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2072:1: ( ( ( rule__VPC__CidrAssignment_5 ) ) )
            // InternalEntityDsl.g:2073:1: ( ( rule__VPC__CidrAssignment_5 ) )
            {
            // InternalEntityDsl.g:2073:1: ( ( rule__VPC__CidrAssignment_5 ) )
            // InternalEntityDsl.g:2074:2: ( rule__VPC__CidrAssignment_5 )
            {
             before(grammarAccess.getVPCAccess().getCidrAssignment_5()); 
            // InternalEntityDsl.g:2075:2: ( rule__VPC__CidrAssignment_5 )
            // InternalEntityDsl.g:2075:3: rule__VPC__CidrAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__VPC__CidrAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVPCAccess().getCidrAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__5__Impl"


    // $ANTLR start "rule__VPC__Group__6"
    // InternalEntityDsl.g:2083:1: rule__VPC__Group__6 : rule__VPC__Group__6__Impl rule__VPC__Group__7 ;
    public final void rule__VPC__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2087:1: ( rule__VPC__Group__6__Impl rule__VPC__Group__7 )
            // InternalEntityDsl.g:2088:2: rule__VPC__Group__6__Impl rule__VPC__Group__7
            {
            pushFollow(FOLLOW_32);
            rule__VPC__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__6"


    // $ANTLR start "rule__VPC__Group__6__Impl"
    // InternalEntityDsl.g:2095:1: rule__VPC__Group__6__Impl : ( ( rule__VPC__Group_6__0 )? ) ;
    public final void rule__VPC__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2099:1: ( ( ( rule__VPC__Group_6__0 )? ) )
            // InternalEntityDsl.g:2100:1: ( ( rule__VPC__Group_6__0 )? )
            {
            // InternalEntityDsl.g:2100:1: ( ( rule__VPC__Group_6__0 )? )
            // InternalEntityDsl.g:2101:2: ( rule__VPC__Group_6__0 )?
            {
             before(grammarAccess.getVPCAccess().getGroup_6()); 
            // InternalEntityDsl.g:2102:2: ( rule__VPC__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==47) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEntityDsl.g:2102:3: rule__VPC__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VPC__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVPCAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__6__Impl"


    // $ANTLR start "rule__VPC__Group__7"
    // InternalEntityDsl.g:2110:1: rule__VPC__Group__7 : rule__VPC__Group__7__Impl ;
    public final void rule__VPC__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2114:1: ( rule__VPC__Group__7__Impl )
            // InternalEntityDsl.g:2115:2: rule__VPC__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VPC__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__7"


    // $ANTLR start "rule__VPC__Group__7__Impl"
    // InternalEntityDsl.g:2121:1: rule__VPC__Group__7__Impl : ( '}' ) ;
    public final void rule__VPC__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2125:1: ( ( '}' ) )
            // InternalEntityDsl.g:2126:1: ( '}' )
            {
            // InternalEntityDsl.g:2126:1: ( '}' )
            // InternalEntityDsl.g:2127:2: '}'
            {
             before(grammarAccess.getVPCAccess().getRightCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__7__Impl"


    // $ANTLR start "rule__VPC__Group_6__0"
    // InternalEntityDsl.g:2137:1: rule__VPC__Group_6__0 : rule__VPC__Group_6__0__Impl rule__VPC__Group_6__1 ;
    public final void rule__VPC__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2141:1: ( rule__VPC__Group_6__0__Impl rule__VPC__Group_6__1 )
            // InternalEntityDsl.g:2142:2: rule__VPC__Group_6__0__Impl rule__VPC__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__VPC__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_6__0"


    // $ANTLR start "rule__VPC__Group_6__0__Impl"
    // InternalEntityDsl.g:2149:1: rule__VPC__Group_6__0__Impl : ( 'subnets' ) ;
    public final void rule__VPC__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2153:1: ( ( 'subnets' ) )
            // InternalEntityDsl.g:2154:1: ( 'subnets' )
            {
            // InternalEntityDsl.g:2154:1: ( 'subnets' )
            // InternalEntityDsl.g:2155:2: 'subnets'
            {
             before(grammarAccess.getVPCAccess().getSubnetsKeyword_6_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getSubnetsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_6__0__Impl"


    // $ANTLR start "rule__VPC__Group_6__1"
    // InternalEntityDsl.g:2164:1: rule__VPC__Group_6__1 : rule__VPC__Group_6__1__Impl rule__VPC__Group_6__2 ;
    public final void rule__VPC__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2168:1: ( rule__VPC__Group_6__1__Impl rule__VPC__Group_6__2 )
            // InternalEntityDsl.g:2169:2: rule__VPC__Group_6__1__Impl rule__VPC__Group_6__2
            {
            pushFollow(FOLLOW_33);
            rule__VPC__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_6__1"


    // $ANTLR start "rule__VPC__Group_6__1__Impl"
    // InternalEntityDsl.g:2176:1: rule__VPC__Group_6__1__Impl : ( '{' ) ;
    public final void rule__VPC__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2180:1: ( ( '{' ) )
            // InternalEntityDsl.g:2181:1: ( '{' )
            {
            // InternalEntityDsl.g:2181:1: ( '{' )
            // InternalEntityDsl.g:2182:2: '{'
            {
             before(grammarAccess.getVPCAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_6__1__Impl"


    // $ANTLR start "rule__VPC__Group_6__2"
    // InternalEntityDsl.g:2191:1: rule__VPC__Group_6__2 : rule__VPC__Group_6__2__Impl rule__VPC__Group_6__3 ;
    public final void rule__VPC__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2195:1: ( rule__VPC__Group_6__2__Impl rule__VPC__Group_6__3 )
            // InternalEntityDsl.g:2196:2: rule__VPC__Group_6__2__Impl rule__VPC__Group_6__3
            {
            pushFollow(FOLLOW_33);
            rule__VPC__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_6__2"


    // $ANTLR start "rule__VPC__Group_6__2__Impl"
    // InternalEntityDsl.g:2203:1: rule__VPC__Group_6__2__Impl : ( ( rule__VPC__SubnetsAssignment_6_2 )* ) ;
    public final void rule__VPC__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2207:1: ( ( ( rule__VPC__SubnetsAssignment_6_2 )* ) )
            // InternalEntityDsl.g:2208:1: ( ( rule__VPC__SubnetsAssignment_6_2 )* )
            {
            // InternalEntityDsl.g:2208:1: ( ( rule__VPC__SubnetsAssignment_6_2 )* )
            // InternalEntityDsl.g:2209:2: ( rule__VPC__SubnetsAssignment_6_2 )*
            {
             before(grammarAccess.getVPCAccess().getSubnetsAssignment_6_2()); 
            // InternalEntityDsl.g:2210:2: ( rule__VPC__SubnetsAssignment_6_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEntityDsl.g:2210:3: rule__VPC__SubnetsAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__VPC__SubnetsAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getVPCAccess().getSubnetsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_6__2__Impl"


    // $ANTLR start "rule__VPC__Group_6__3"
    // InternalEntityDsl.g:2218:1: rule__VPC__Group_6__3 : rule__VPC__Group_6__3__Impl ;
    public final void rule__VPC__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2222:1: ( rule__VPC__Group_6__3__Impl )
            // InternalEntityDsl.g:2223:2: rule__VPC__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VPC__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_6__3"


    // $ANTLR start "rule__VPC__Group_6__3__Impl"
    // InternalEntityDsl.g:2229:1: rule__VPC__Group_6__3__Impl : ( '}' ) ;
    public final void rule__VPC__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2233:1: ( ( '}' ) )
            // InternalEntityDsl.g:2234:1: ( '}' )
            {
            // InternalEntityDsl.g:2234:1: ( '}' )
            // InternalEntityDsl.g:2235:2: '}'
            {
             before(grammarAccess.getVPCAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getRightCurlyBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_6__3__Impl"


    // $ANTLR start "rule__HostedZone__Group__0"
    // InternalEntityDsl.g:2245:1: rule__HostedZone__Group__0 : rule__HostedZone__Group__0__Impl rule__HostedZone__Group__1 ;
    public final void rule__HostedZone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2249:1: ( rule__HostedZone__Group__0__Impl rule__HostedZone__Group__1 )
            // InternalEntityDsl.g:2250:2: rule__HostedZone__Group__0__Impl rule__HostedZone__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__HostedZone__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HostedZone__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostedZone__Group__0"


    // $ANTLR start "rule__HostedZone__Group__0__Impl"
    // InternalEntityDsl.g:2257:1: rule__HostedZone__Group__0__Impl : ( 'hostedzone' ) ;
    public final void rule__HostedZone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2261:1: ( ( 'hostedzone' ) )
            // InternalEntityDsl.g:2262:1: ( 'hostedzone' )
            {
            // InternalEntityDsl.g:2262:1: ( 'hostedzone' )
            // InternalEntityDsl.g:2263:2: 'hostedzone'
            {
             before(grammarAccess.getHostedZoneAccess().getHostedzoneKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getHostedZoneAccess().getHostedzoneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostedZone__Group__0__Impl"


    // $ANTLR start "rule__HostedZone__Group__1"
    // InternalEntityDsl.g:2272:1: rule__HostedZone__Group__1 : rule__HostedZone__Group__1__Impl rule__HostedZone__Group__2 ;
    public final void rule__HostedZone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2276:1: ( rule__HostedZone__Group__1__Impl rule__HostedZone__Group__2 )
            // InternalEntityDsl.g:2277:2: rule__HostedZone__Group__1__Impl rule__HostedZone__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__HostedZone__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HostedZone__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostedZone__Group__1"


    // $ANTLR start "rule__HostedZone__Group__1__Impl"
    // InternalEntityDsl.g:2284:1: rule__HostedZone__Group__1__Impl : ( ( rule__HostedZone__NameAssignment_1 ) ) ;
    public final void rule__HostedZone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2288:1: ( ( ( rule__HostedZone__NameAssignment_1 ) ) )
            // InternalEntityDsl.g:2289:1: ( ( rule__HostedZone__NameAssignment_1 ) )
            {
            // InternalEntityDsl.g:2289:1: ( ( rule__HostedZone__NameAssignment_1 ) )
            // InternalEntityDsl.g:2290:2: ( rule__HostedZone__NameAssignment_1 )
            {
             before(grammarAccess.getHostedZoneAccess().getNameAssignment_1()); 
            // InternalEntityDsl.g:2291:2: ( rule__HostedZone__NameAssignment_1 )
            // InternalEntityDsl.g:2291:3: rule__HostedZone__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HostedZone__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHostedZoneAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostedZone__Group__1__Impl"


    // $ANTLR start "rule__HostedZone__Group__2"
    // InternalEntityDsl.g:2299:1: rule__HostedZone__Group__2 : rule__HostedZone__Group__2__Impl rule__HostedZone__Group__3 ;
    public final void rule__HostedZone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2303:1: ( rule__HostedZone__Group__2__Impl rule__HostedZone__Group__3 )
            // InternalEntityDsl.g:2304:2: rule__HostedZone__Group__2__Impl rule__HostedZone__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__HostedZone__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HostedZone__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostedZone__Group__2"


    // $ANTLR start "rule__HostedZone__Group__2__Impl"
    // InternalEntityDsl.g:2311:1: rule__HostedZone__Group__2__Impl : ( '{' ) ;
    public final void rule__HostedZone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2315:1: ( ( '{' ) )
            // InternalEntityDsl.g:2316:1: ( '{' )
            {
            // InternalEntityDsl.g:2316:1: ( '{' )
            // InternalEntityDsl.g:2317:2: '{'
            {
             before(grammarAccess.getHostedZoneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHostedZoneAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostedZone__Group__2__Impl"


    // $ANTLR start "rule__HostedZone__Group__3"
    // InternalEntityDsl.g:2326:1: rule__HostedZone__Group__3 : rule__HostedZone__Group__3__Impl rule__HostedZone__Group__4 ;
    public final void rule__HostedZone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2330:1: ( rule__HostedZone__Group__3__Impl rule__HostedZone__Group__4 )
            // InternalEntityDsl.g:2331:2: rule__HostedZone__Group__3__Impl rule__HostedZone__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__HostedZone__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HostedZone__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostedZone__Group__3"


    // $ANTLR start "rule__HostedZone__Group__3__Impl"
    // InternalEntityDsl.g:2338:1: rule__HostedZone__Group__3__Impl : ( 'domain' ) ;
    public final void rule__HostedZone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2342:1: ( ( 'domain' ) )
            // InternalEntityDsl.g:2343:1: ( 'domain' )
            {
            // InternalEntityDsl.g:2343:1: ( 'domain' )
            // InternalEntityDsl.g:2344:2: 'domain'
            {
             before(grammarAccess.getHostedZoneAccess().getDomainKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getHostedZoneAccess().getDomainKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostedZone__Group__3__Impl"


    // $ANTLR start "rule__HostedZone__Group__4"
    // InternalEntityDsl.g:2353:1: rule__HostedZone__Group__4 : rule__HostedZone__Group__4__Impl rule__HostedZone__Group__5 ;
    public final void rule__HostedZone__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2357:1: ( rule__HostedZone__Group__4__Impl rule__HostedZone__Group__5 )
            // InternalEntityDsl.g:2358:2: rule__HostedZone__Group__4__Impl rule__HostedZone__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__HostedZone__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HostedZone__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostedZone__Group__4"


    // $ANTLR start "rule__HostedZone__Group__4__Impl"
    // InternalEntityDsl.g:2365:1: rule__HostedZone__Group__4__Impl : ( ( rule__HostedZone__DomainAssignment_4 ) ) ;
    public final void rule__HostedZone__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2369:1: ( ( ( rule__HostedZone__DomainAssignment_4 ) ) )
            // InternalEntityDsl.g:2370:1: ( ( rule__HostedZone__DomainAssignment_4 ) )
            {
            // InternalEntityDsl.g:2370:1: ( ( rule__HostedZone__DomainAssignment_4 ) )
            // InternalEntityDsl.g:2371:2: ( rule__HostedZone__DomainAssignment_4 )
            {
             before(grammarAccess.getHostedZoneAccess().getDomainAssignment_4()); 
            // InternalEntityDsl.g:2372:2: ( rule__HostedZone__DomainAssignment_4 )
            // InternalEntityDsl.g:2372:3: rule__HostedZone__DomainAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__HostedZone__DomainAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHostedZoneAccess().getDomainAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostedZone__Group__4__Impl"


    // $ANTLR start "rule__HostedZone__Group__5"
    // InternalEntityDsl.g:2380:1: rule__HostedZone__Group__5 : rule__HostedZone__Group__5__Impl ;
    public final void rule__HostedZone__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2384:1: ( rule__HostedZone__Group__5__Impl )
            // InternalEntityDsl.g:2385:2: rule__HostedZone__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HostedZone__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostedZone__Group__5"


    // $ANTLR start "rule__HostedZone__Group__5__Impl"
    // InternalEntityDsl.g:2391:1: rule__HostedZone__Group__5__Impl : ( '}' ) ;
    public final void rule__HostedZone__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2395:1: ( ( '}' ) )
            // InternalEntityDsl.g:2396:1: ( '}' )
            {
            // InternalEntityDsl.g:2396:1: ( '}' )
            // InternalEntityDsl.g:2397:2: '}'
            {
             before(grammarAccess.getHostedZoneAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHostedZoneAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostedZone__Group__5__Impl"


    // $ANTLR start "rule__Subnet__Group__0"
    // InternalEntityDsl.g:2407:1: rule__Subnet__Group__0 : rule__Subnet__Group__0__Impl rule__Subnet__Group__1 ;
    public final void rule__Subnet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2411:1: ( rule__Subnet__Group__0__Impl rule__Subnet__Group__1 )
            // InternalEntityDsl.g:2412:2: rule__Subnet__Group__0__Impl rule__Subnet__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Subnet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subnet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__0"


    // $ANTLR start "rule__Subnet__Group__0__Impl"
    // InternalEntityDsl.g:2419:1: rule__Subnet__Group__0__Impl : ( ( rule__Subnet__NameAssignment_0 ) ) ;
    public final void rule__Subnet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2423:1: ( ( ( rule__Subnet__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:2424:1: ( ( rule__Subnet__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:2424:1: ( ( rule__Subnet__NameAssignment_0 ) )
            // InternalEntityDsl.g:2425:2: ( rule__Subnet__NameAssignment_0 )
            {
             before(grammarAccess.getSubnetAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:2426:2: ( rule__Subnet__NameAssignment_0 )
            // InternalEntityDsl.g:2426:3: rule__Subnet__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Subnet__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSubnetAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__0__Impl"


    // $ANTLR start "rule__Subnet__Group__1"
    // InternalEntityDsl.g:2434:1: rule__Subnet__Group__1 : rule__Subnet__Group__1__Impl rule__Subnet__Group__2 ;
    public final void rule__Subnet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2438:1: ( rule__Subnet__Group__1__Impl rule__Subnet__Group__2 )
            // InternalEntityDsl.g:2439:2: rule__Subnet__Group__1__Impl rule__Subnet__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Subnet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subnet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__1"


    // $ANTLR start "rule__Subnet__Group__1__Impl"
    // InternalEntityDsl.g:2446:1: rule__Subnet__Group__1__Impl : ( 'in' ) ;
    public final void rule__Subnet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2450:1: ( ( 'in' ) )
            // InternalEntityDsl.g:2451:1: ( 'in' )
            {
            // InternalEntityDsl.g:2451:1: ( 'in' )
            // InternalEntityDsl.g:2452:2: 'in'
            {
             before(grammarAccess.getSubnetAccess().getInKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSubnetAccess().getInKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__1__Impl"


    // $ANTLR start "rule__Subnet__Group__2"
    // InternalEntityDsl.g:2461:1: rule__Subnet__Group__2 : rule__Subnet__Group__2__Impl rule__Subnet__Group__3 ;
    public final void rule__Subnet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2465:1: ( rule__Subnet__Group__2__Impl rule__Subnet__Group__3 )
            // InternalEntityDsl.g:2466:2: rule__Subnet__Group__2__Impl rule__Subnet__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Subnet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subnet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__2"


    // $ANTLR start "rule__Subnet__Group__2__Impl"
    // InternalEntityDsl.g:2473:1: rule__Subnet__Group__2__Impl : ( 'vpc' ) ;
    public final void rule__Subnet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2477:1: ( ( 'vpc' ) )
            // InternalEntityDsl.g:2478:1: ( 'vpc' )
            {
            // InternalEntityDsl.g:2478:1: ( 'vpc' )
            // InternalEntityDsl.g:2479:2: 'vpc'
            {
             before(grammarAccess.getSubnetAccess().getVpcKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSubnetAccess().getVpcKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__2__Impl"


    // $ANTLR start "rule__Subnet__Group__3"
    // InternalEntityDsl.g:2488:1: rule__Subnet__Group__3 : rule__Subnet__Group__3__Impl rule__Subnet__Group__4 ;
    public final void rule__Subnet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2492:1: ( rule__Subnet__Group__3__Impl rule__Subnet__Group__4 )
            // InternalEntityDsl.g:2493:2: rule__Subnet__Group__3__Impl rule__Subnet__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Subnet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subnet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__3"


    // $ANTLR start "rule__Subnet__Group__3__Impl"
    // InternalEntityDsl.g:2500:1: rule__Subnet__Group__3__Impl : ( ( rule__Subnet__VpcAssignment_3 ) ) ;
    public final void rule__Subnet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2504:1: ( ( ( rule__Subnet__VpcAssignment_3 ) ) )
            // InternalEntityDsl.g:2505:1: ( ( rule__Subnet__VpcAssignment_3 ) )
            {
            // InternalEntityDsl.g:2505:1: ( ( rule__Subnet__VpcAssignment_3 ) )
            // InternalEntityDsl.g:2506:2: ( rule__Subnet__VpcAssignment_3 )
            {
             before(grammarAccess.getSubnetAccess().getVpcAssignment_3()); 
            // InternalEntityDsl.g:2507:2: ( rule__Subnet__VpcAssignment_3 )
            // InternalEntityDsl.g:2507:3: rule__Subnet__VpcAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Subnet__VpcAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubnetAccess().getVpcAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__3__Impl"


    // $ANTLR start "rule__Subnet__Group__4"
    // InternalEntityDsl.g:2515:1: rule__Subnet__Group__4 : rule__Subnet__Group__4__Impl rule__Subnet__Group__5 ;
    public final void rule__Subnet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2519:1: ( rule__Subnet__Group__4__Impl rule__Subnet__Group__5 )
            // InternalEntityDsl.g:2520:2: rule__Subnet__Group__4__Impl rule__Subnet__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Subnet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subnet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__4"


    // $ANTLR start "rule__Subnet__Group__4__Impl"
    // InternalEntityDsl.g:2527:1: rule__Subnet__Group__4__Impl : ( 'hosted' ) ;
    public final void rule__Subnet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2531:1: ( ( 'hosted' ) )
            // InternalEntityDsl.g:2532:1: ( 'hosted' )
            {
            // InternalEntityDsl.g:2532:1: ( 'hosted' )
            // InternalEntityDsl.g:2533:2: 'hosted'
            {
             before(grammarAccess.getSubnetAccess().getHostedKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSubnetAccess().getHostedKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__4__Impl"


    // $ANTLR start "rule__Subnet__Group__5"
    // InternalEntityDsl.g:2542:1: rule__Subnet__Group__5 : rule__Subnet__Group__5__Impl rule__Subnet__Group__6 ;
    public final void rule__Subnet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2546:1: ( rule__Subnet__Group__5__Impl rule__Subnet__Group__6 )
            // InternalEntityDsl.g:2547:2: rule__Subnet__Group__5__Impl rule__Subnet__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Subnet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subnet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__5"


    // $ANTLR start "rule__Subnet__Group__5__Impl"
    // InternalEntityDsl.g:2554:1: rule__Subnet__Group__5__Impl : ( 'in' ) ;
    public final void rule__Subnet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2558:1: ( ( 'in' ) )
            // InternalEntityDsl.g:2559:1: ( 'in' )
            {
            // InternalEntityDsl.g:2559:1: ( 'in' )
            // InternalEntityDsl.g:2560:2: 'in'
            {
             before(grammarAccess.getSubnetAccess().getInKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSubnetAccess().getInKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__5__Impl"


    // $ANTLR start "rule__Subnet__Group__6"
    // InternalEntityDsl.g:2569:1: rule__Subnet__Group__6 : rule__Subnet__Group__6__Impl rule__Subnet__Group__7 ;
    public final void rule__Subnet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2573:1: ( rule__Subnet__Group__6__Impl rule__Subnet__Group__7 )
            // InternalEntityDsl.g:2574:2: rule__Subnet__Group__6__Impl rule__Subnet__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__Subnet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subnet__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__6"


    // $ANTLR start "rule__Subnet__Group__6__Impl"
    // InternalEntityDsl.g:2581:1: rule__Subnet__Group__6__Impl : ( ( rule__Subnet__RegionAssignment_6 ) ) ;
    public final void rule__Subnet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2585:1: ( ( ( rule__Subnet__RegionAssignment_6 ) ) )
            // InternalEntityDsl.g:2586:1: ( ( rule__Subnet__RegionAssignment_6 ) )
            {
            // InternalEntityDsl.g:2586:1: ( ( rule__Subnet__RegionAssignment_6 ) )
            // InternalEntityDsl.g:2587:2: ( rule__Subnet__RegionAssignment_6 )
            {
             before(grammarAccess.getSubnetAccess().getRegionAssignment_6()); 
            // InternalEntityDsl.g:2588:2: ( rule__Subnet__RegionAssignment_6 )
            // InternalEntityDsl.g:2588:3: rule__Subnet__RegionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Subnet__RegionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSubnetAccess().getRegionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__6__Impl"


    // $ANTLR start "rule__Subnet__Group__7"
    // InternalEntityDsl.g:2596:1: rule__Subnet__Group__7 : rule__Subnet__Group__7__Impl rule__Subnet__Group__8 ;
    public final void rule__Subnet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2600:1: ( rule__Subnet__Group__7__Impl rule__Subnet__Group__8 )
            // InternalEntityDsl.g:2601:2: rule__Subnet__Group__7__Impl rule__Subnet__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Subnet__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subnet__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__7"


    // $ANTLR start "rule__Subnet__Group__7__Impl"
    // InternalEntityDsl.g:2608:1: rule__Subnet__Group__7__Impl : ( 'properties' ) ;
    public final void rule__Subnet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2612:1: ( ( 'properties' ) )
            // InternalEntityDsl.g:2613:1: ( 'properties' )
            {
            // InternalEntityDsl.g:2613:1: ( 'properties' )
            // InternalEntityDsl.g:2614:2: 'properties'
            {
             before(grammarAccess.getSubnetAccess().getPropertiesKeyword_7()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSubnetAccess().getPropertiesKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__7__Impl"


    // $ANTLR start "rule__Subnet__Group__8"
    // InternalEntityDsl.g:2623:1: rule__Subnet__Group__8 : rule__Subnet__Group__8__Impl rule__Subnet__Group__9 ;
    public final void rule__Subnet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2627:1: ( rule__Subnet__Group__8__Impl rule__Subnet__Group__9 )
            // InternalEntityDsl.g:2628:2: rule__Subnet__Group__8__Impl rule__Subnet__Group__9
            {
            pushFollow(FOLLOW_37);
            rule__Subnet__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subnet__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__8"


    // $ANTLR start "rule__Subnet__Group__8__Impl"
    // InternalEntityDsl.g:2635:1: rule__Subnet__Group__8__Impl : ( '{' ) ;
    public final void rule__Subnet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2639:1: ( ( '{' ) )
            // InternalEntityDsl.g:2640:1: ( '{' )
            {
            // InternalEntityDsl.g:2640:1: ( '{' )
            // InternalEntityDsl.g:2641:2: '{'
            {
             before(grammarAccess.getSubnetAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSubnetAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__8__Impl"


    // $ANTLR start "rule__Subnet__Group__9"
    // InternalEntityDsl.g:2650:1: rule__Subnet__Group__9 : rule__Subnet__Group__9__Impl rule__Subnet__Group__10 ;
    public final void rule__Subnet__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2654:1: ( rule__Subnet__Group__9__Impl rule__Subnet__Group__10 )
            // InternalEntityDsl.g:2655:2: rule__Subnet__Group__9__Impl rule__Subnet__Group__10
            {
            pushFollow(FOLLOW_31);
            rule__Subnet__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subnet__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__9"


    // $ANTLR start "rule__Subnet__Group__9__Impl"
    // InternalEntityDsl.g:2662:1: rule__Subnet__Group__9__Impl : ( 'range' ) ;
    public final void rule__Subnet__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2666:1: ( ( 'range' ) )
            // InternalEntityDsl.g:2667:1: ( 'range' )
            {
            // InternalEntityDsl.g:2667:1: ( 'range' )
            // InternalEntityDsl.g:2668:2: 'range'
            {
             before(grammarAccess.getSubnetAccess().getRangeKeyword_9()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSubnetAccess().getRangeKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__9__Impl"


    // $ANTLR start "rule__Subnet__Group__10"
    // InternalEntityDsl.g:2677:1: rule__Subnet__Group__10 : rule__Subnet__Group__10__Impl rule__Subnet__Group__11 ;
    public final void rule__Subnet__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2681:1: ( rule__Subnet__Group__10__Impl rule__Subnet__Group__11 )
            // InternalEntityDsl.g:2682:2: rule__Subnet__Group__10__Impl rule__Subnet__Group__11
            {
            pushFollow(FOLLOW_27);
            rule__Subnet__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subnet__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__10"


    // $ANTLR start "rule__Subnet__Group__10__Impl"
    // InternalEntityDsl.g:2689:1: rule__Subnet__Group__10__Impl : ( ( rule__Subnet__CidrAssignment_10 ) ) ;
    public final void rule__Subnet__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2693:1: ( ( ( rule__Subnet__CidrAssignment_10 ) ) )
            // InternalEntityDsl.g:2694:1: ( ( rule__Subnet__CidrAssignment_10 ) )
            {
            // InternalEntityDsl.g:2694:1: ( ( rule__Subnet__CidrAssignment_10 ) )
            // InternalEntityDsl.g:2695:2: ( rule__Subnet__CidrAssignment_10 )
            {
             before(grammarAccess.getSubnetAccess().getCidrAssignment_10()); 
            // InternalEntityDsl.g:2696:2: ( rule__Subnet__CidrAssignment_10 )
            // InternalEntityDsl.g:2696:3: rule__Subnet__CidrAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Subnet__CidrAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getSubnetAccess().getCidrAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__10__Impl"


    // $ANTLR start "rule__Subnet__Group__11"
    // InternalEntityDsl.g:2704:1: rule__Subnet__Group__11 : rule__Subnet__Group__11__Impl ;
    public final void rule__Subnet__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2708:1: ( rule__Subnet__Group__11__Impl )
            // InternalEntityDsl.g:2709:2: rule__Subnet__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subnet__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__11"


    // $ANTLR start "rule__Subnet__Group__11__Impl"
    // InternalEntityDsl.g:2715:1: rule__Subnet__Group__11__Impl : ( '}' ) ;
    public final void rule__Subnet__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2719:1: ( ( '}' ) )
            // InternalEntityDsl.g:2720:1: ( '}' )
            {
            // InternalEntityDsl.g:2720:1: ( '}' )
            // InternalEntityDsl.g:2721:2: '}'
            {
             before(grammarAccess.getSubnetAccess().getRightCurlyBracketKeyword_11()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSubnetAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__Group__11__Impl"


    // $ANTLR start "rule__Infrastructure__CloudProviderAssignment_3"
    // InternalEntityDsl.g:2731:1: rule__Infrastructure__CloudProviderAssignment_3 : ( ruleCloudProvider ) ;
    public final void rule__Infrastructure__CloudProviderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2735:1: ( ( ruleCloudProvider ) )
            // InternalEntityDsl.g:2736:2: ( ruleCloudProvider )
            {
            // InternalEntityDsl.g:2736:2: ( ruleCloudProvider )
            // InternalEntityDsl.g:2737:3: ruleCloudProvider
            {
             before(grammarAccess.getInfrastructureAccess().getCloudProviderCloudProviderEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCloudProvider();

            state._fsp--;

             after(grammarAccess.getInfrastructureAccess().getCloudProviderCloudProviderEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infrastructure__CloudProviderAssignment_3"


    // $ANTLR start "rule__Infrastructure__ResourcesAssignment_5"
    // InternalEntityDsl.g:2746:1: rule__Infrastructure__ResourcesAssignment_5 : ( ruleResource ) ;
    public final void rule__Infrastructure__ResourcesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2750:1: ( ( ruleResource ) )
            // InternalEntityDsl.g:2751:2: ( ruleResource )
            {
            // InternalEntityDsl.g:2751:2: ( ruleResource )
            // InternalEntityDsl.g:2752:3: ruleResource
            {
             before(grammarAccess.getInfrastructureAccess().getResourcesResourceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getInfrastructureAccess().getResourcesResourceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infrastructure__ResourcesAssignment_5"


    // $ANTLR start "rule__ComputeInstance__NameAssignment_1"
    // InternalEntityDsl.g:2761:1: rule__ComputeInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComputeInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2765:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:2766:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:2766:2: ( RULE_ID )
            // InternalEntityDsl.g:2767:3: RULE_ID
            {
             before(grammarAccess.getComputeInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__NameAssignment_1"


    // $ANTLR start "rule__ComputeInstance__OsImageAssignment_4"
    // InternalEntityDsl.g:2776:1: rule__ComputeInstance__OsImageAssignment_4 : ( ruleOSImage ) ;
    public final void rule__ComputeInstance__OsImageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2780:1: ( ( ruleOSImage ) )
            // InternalEntityDsl.g:2781:2: ( ruleOSImage )
            {
            // InternalEntityDsl.g:2781:2: ( ruleOSImage )
            // InternalEntityDsl.g:2782:3: ruleOSImage
            {
             before(grammarAccess.getComputeInstanceAccess().getOsImageOSImageEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOSImage();

            state._fsp--;

             after(grammarAccess.getComputeInstanceAccess().getOsImageOSImageEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__OsImageAssignment_4"


    // $ANTLR start "rule__ComputeInstance__NetworkAssignment_7"
    // InternalEntityDsl.g:2791:1: rule__ComputeInstance__NetworkAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__ComputeInstance__NetworkAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2795:1: ( ( ( RULE_ID ) ) )
            // InternalEntityDsl.g:2796:2: ( ( RULE_ID ) )
            {
            // InternalEntityDsl.g:2796:2: ( ( RULE_ID ) )
            // InternalEntityDsl.g:2797:3: ( RULE_ID )
            {
             before(grammarAccess.getComputeInstanceAccess().getNetworkNetworkCrossReference_7_0()); 
            // InternalEntityDsl.g:2798:3: ( RULE_ID )
            // InternalEntityDsl.g:2799:4: RULE_ID
            {
             before(grammarAccess.getComputeInstanceAccess().getNetworkNetworkIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getNetworkNetworkIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getComputeInstanceAccess().getNetworkNetworkCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__NetworkAssignment_7"


    // $ANTLR start "rule__ComputeInstance__VpcAssignment_10"
    // InternalEntityDsl.g:2810:1: rule__ComputeInstance__VpcAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__ComputeInstance__VpcAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2814:1: ( ( ( RULE_ID ) ) )
            // InternalEntityDsl.g:2815:2: ( ( RULE_ID ) )
            {
            // InternalEntityDsl.g:2815:2: ( ( RULE_ID ) )
            // InternalEntityDsl.g:2816:3: ( RULE_ID )
            {
             before(grammarAccess.getComputeInstanceAccess().getVpcVPCCrossReference_10_0()); 
            // InternalEntityDsl.g:2817:3: ( RULE_ID )
            // InternalEntityDsl.g:2818:4: RULE_ID
            {
             before(grammarAccess.getComputeInstanceAccess().getVpcVPCIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getVpcVPCIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getComputeInstanceAccess().getVpcVPCCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__VpcAssignment_10"


    // $ANTLR start "rule__ComputeInstance__RegionAssignment_13"
    // InternalEntityDsl.g:2829:1: rule__ComputeInstance__RegionAssignment_13 : ( ruleRegion ) ;
    public final void rule__ComputeInstance__RegionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2833:1: ( ( ruleRegion ) )
            // InternalEntityDsl.g:2834:2: ( ruleRegion )
            {
            // InternalEntityDsl.g:2834:2: ( ruleRegion )
            // InternalEntityDsl.g:2835:3: ruleRegion
            {
             before(grammarAccess.getComputeInstanceAccess().getRegionRegionEnumRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleRegion();

            state._fsp--;

             after(grammarAccess.getComputeInstanceAccess().getRegionRegionEnumRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__RegionAssignment_13"


    // $ANTLR start "rule__ComputeInstance__SubnetAssignment_15"
    // InternalEntityDsl.g:2844:1: rule__ComputeInstance__SubnetAssignment_15 : ( ( RULE_ID ) ) ;
    public final void rule__ComputeInstance__SubnetAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2848:1: ( ( ( RULE_ID ) ) )
            // InternalEntityDsl.g:2849:2: ( ( RULE_ID ) )
            {
            // InternalEntityDsl.g:2849:2: ( ( RULE_ID ) )
            // InternalEntityDsl.g:2850:3: ( RULE_ID )
            {
             before(grammarAccess.getComputeInstanceAccess().getSubnetSubnetCrossReference_15_0()); 
            // InternalEntityDsl.g:2851:3: ( RULE_ID )
            // InternalEntityDsl.g:2852:4: RULE_ID
            {
             before(grammarAccess.getComputeInstanceAccess().getSubnetSubnetIDTerminalRuleCall_15_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getSubnetSubnetIDTerminalRuleCall_15_0_1()); 

            }

             after(grammarAccess.getComputeInstanceAccess().getSubnetSubnetCrossReference_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__SubnetAssignment_15"


    // $ANTLR start "rule__ComputeInstance__InstanceTypeAssignment_17"
    // InternalEntityDsl.g:2863:1: rule__ComputeInstance__InstanceTypeAssignment_17 : ( ruleInstanceType ) ;
    public final void rule__ComputeInstance__InstanceTypeAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2867:1: ( ( ruleInstanceType ) )
            // InternalEntityDsl.g:2868:2: ( ruleInstanceType )
            {
            // InternalEntityDsl.g:2868:2: ( ruleInstanceType )
            // InternalEntityDsl.g:2869:3: ruleInstanceType
            {
             before(grammarAccess.getComputeInstanceAccess().getInstanceTypeInstanceTypeEnumRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceType();

            state._fsp--;

             after(grammarAccess.getComputeInstanceAccess().getInstanceTypeInstanceTypeEnumRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__InstanceTypeAssignment_17"


    // $ANTLR start "rule__ComputeInstance__CPUAssignment_23"
    // InternalEntityDsl.g:2878:1: rule__ComputeInstance__CPUAssignment_23 : ( RULE_INT ) ;
    public final void rule__ComputeInstance__CPUAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2882:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:2883:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:2883:2: ( RULE_INT )
            // InternalEntityDsl.g:2884:3: RULE_INT
            {
             before(grammarAccess.getComputeInstanceAccess().getCPUINTTerminalRuleCall_23_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getCPUINTTerminalRuleCall_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__CPUAssignment_23"


    // $ANTLR start "rule__ComputeInstance__MemoryGBAssignment_27"
    // InternalEntityDsl.g:2893:1: rule__ComputeInstance__MemoryGBAssignment_27 : ( RULE_INT ) ;
    public final void rule__ComputeInstance__MemoryGBAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2897:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:2898:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:2898:2: ( RULE_INT )
            // InternalEntityDsl.g:2899:3: RULE_INT
            {
             before(grammarAccess.getComputeInstanceAccess().getMemoryGBINTTerminalRuleCall_27_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getComputeInstanceAccess().getMemoryGBINTTerminalRuleCall_27_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInstance__MemoryGBAssignment_27"


    // $ANTLR start "rule__StorageBucket__NameAssignment_1"
    // InternalEntityDsl.g:2908:1: rule__StorageBucket__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StorageBucket__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2912:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:2913:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:2913:2: ( RULE_ID )
            // InternalEntityDsl.g:2914:3: RULE_ID
            {
             before(grammarAccess.getStorageBucketAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStorageBucketAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__NameAssignment_1"


    // $ANTLR start "rule__StorageBucket__RegionAssignment_4"
    // InternalEntityDsl.g:2923:1: rule__StorageBucket__RegionAssignment_4 : ( ruleRegion ) ;
    public final void rule__StorageBucket__RegionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2927:1: ( ( ruleRegion ) )
            // InternalEntityDsl.g:2928:2: ( ruleRegion )
            {
            // InternalEntityDsl.g:2928:2: ( ruleRegion )
            // InternalEntityDsl.g:2929:3: ruleRegion
            {
             before(grammarAccess.getStorageBucketAccess().getRegionRegionEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRegion();

            state._fsp--;

             after(grammarAccess.getStorageBucketAccess().getRegionRegionEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__RegionAssignment_4"


    // $ANTLR start "rule__StorageBucket__VersioningAssignment_7"
    // InternalEntityDsl.g:2938:1: rule__StorageBucket__VersioningAssignment_7 : ( ( 'versioning' ) ) ;
    public final void rule__StorageBucket__VersioningAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2942:1: ( ( ( 'versioning' ) ) )
            // InternalEntityDsl.g:2943:2: ( ( 'versioning' ) )
            {
            // InternalEntityDsl.g:2943:2: ( ( 'versioning' ) )
            // InternalEntityDsl.g:2944:3: ( 'versioning' )
            {
             before(grammarAccess.getStorageBucketAccess().getVersioningVersioningKeyword_7_0()); 
            // InternalEntityDsl.g:2945:3: ( 'versioning' )
            // InternalEntityDsl.g:2946:4: 'versioning'
            {
             before(grammarAccess.getStorageBucketAccess().getVersioningVersioningKeyword_7_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getStorageBucketAccess().getVersioningVersioningKeyword_7_0()); 

            }

             after(grammarAccess.getStorageBucketAccess().getVersioningVersioningKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageBucket__VersioningAssignment_7"


    // $ANTLR start "rule__Network__NameAssignment_2"
    // InternalEntityDsl.g:2957:1: rule__Network__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Network__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2961:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:2962:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:2962:2: ( RULE_ID )
            // InternalEntityDsl.g:2963:3: RULE_ID
            {
             before(grammarAccess.getNetworkAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__NameAssignment_2"


    // $ANTLR start "rule__Network__VpcsAssignment_4_0"
    // InternalEntityDsl.g:2972:1: rule__Network__VpcsAssignment_4_0 : ( ruleVPC ) ;
    public final void rule__Network__VpcsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2976:1: ( ( ruleVPC ) )
            // InternalEntityDsl.g:2977:2: ( ruleVPC )
            {
            // InternalEntityDsl.g:2977:2: ( ruleVPC )
            // InternalEntityDsl.g:2978:3: ruleVPC
            {
             before(grammarAccess.getNetworkAccess().getVpcsVPCParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVPC();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getVpcsVPCParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__VpcsAssignment_4_0"


    // $ANTLR start "rule__Network__ZonesAssignment_4_1"
    // InternalEntityDsl.g:2987:1: rule__Network__ZonesAssignment_4_1 : ( ruleHostedZone ) ;
    public final void rule__Network__ZonesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2991:1: ( ( ruleHostedZone ) )
            // InternalEntityDsl.g:2992:2: ( ruleHostedZone )
            {
            // InternalEntityDsl.g:2992:2: ( ruleHostedZone )
            // InternalEntityDsl.g:2993:3: ruleHostedZone
            {
             before(grammarAccess.getNetworkAccess().getZonesHostedZoneParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHostedZone();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getZonesHostedZoneParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__ZonesAssignment_4_1"


    // $ANTLR start "rule__VPC__NameAssignment_1"
    // InternalEntityDsl.g:3002:1: rule__VPC__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VPC__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3006:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:3007:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:3007:2: ( RULE_ID )
            // InternalEntityDsl.g:3008:3: RULE_ID
            {
             before(grammarAccess.getVPCAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__NameAssignment_1"


    // $ANTLR start "rule__VPC__CidrAssignment_5"
    // InternalEntityDsl.g:3017:1: rule__VPC__CidrAssignment_5 : ( RULE_STRING ) ;
    public final void rule__VPC__CidrAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3021:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3022:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3022:2: ( RULE_STRING )
            // InternalEntityDsl.g:3023:3: RULE_STRING
            {
             before(grammarAccess.getVPCAccess().getCidrSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getCidrSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__CidrAssignment_5"


    // $ANTLR start "rule__VPC__SubnetsAssignment_6_2"
    // InternalEntityDsl.g:3032:1: rule__VPC__SubnetsAssignment_6_2 : ( ruleSubnet ) ;
    public final void rule__VPC__SubnetsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3036:1: ( ( ruleSubnet ) )
            // InternalEntityDsl.g:3037:2: ( ruleSubnet )
            {
            // InternalEntityDsl.g:3037:2: ( ruleSubnet )
            // InternalEntityDsl.g:3038:3: ruleSubnet
            {
             before(grammarAccess.getVPCAccess().getSubnetsSubnetParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubnet();

            state._fsp--;

             after(grammarAccess.getVPCAccess().getSubnetsSubnetParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__SubnetsAssignment_6_2"


    // $ANTLR start "rule__HostedZone__NameAssignment_1"
    // InternalEntityDsl.g:3047:1: rule__HostedZone__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HostedZone__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3051:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:3052:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:3052:2: ( RULE_ID )
            // InternalEntityDsl.g:3053:3: RULE_ID
            {
             before(grammarAccess.getHostedZoneAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHostedZoneAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostedZone__NameAssignment_1"


    // $ANTLR start "rule__HostedZone__DomainAssignment_4"
    // InternalEntityDsl.g:3062:1: rule__HostedZone__DomainAssignment_4 : ( RULE_STRING ) ;
    public final void rule__HostedZone__DomainAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3066:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3067:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3067:2: ( RULE_STRING )
            // InternalEntityDsl.g:3068:3: RULE_STRING
            {
             before(grammarAccess.getHostedZoneAccess().getDomainSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHostedZoneAccess().getDomainSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostedZone__DomainAssignment_4"


    // $ANTLR start "rule__Subnet__NameAssignment_0"
    // InternalEntityDsl.g:3077:1: rule__Subnet__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Subnet__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3081:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:3082:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:3082:2: ( RULE_ID )
            // InternalEntityDsl.g:3083:3: RULE_ID
            {
             before(grammarAccess.getSubnetAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubnetAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__NameAssignment_0"


    // $ANTLR start "rule__Subnet__VpcAssignment_3"
    // InternalEntityDsl.g:3092:1: rule__Subnet__VpcAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Subnet__VpcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3096:1: ( ( ( RULE_ID ) ) )
            // InternalEntityDsl.g:3097:2: ( ( RULE_ID ) )
            {
            // InternalEntityDsl.g:3097:2: ( ( RULE_ID ) )
            // InternalEntityDsl.g:3098:3: ( RULE_ID )
            {
             before(grammarAccess.getSubnetAccess().getVpcVPCCrossReference_3_0()); 
            // InternalEntityDsl.g:3099:3: ( RULE_ID )
            // InternalEntityDsl.g:3100:4: RULE_ID
            {
             before(grammarAccess.getSubnetAccess().getVpcVPCIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubnetAccess().getVpcVPCIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSubnetAccess().getVpcVPCCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__VpcAssignment_3"


    // $ANTLR start "rule__Subnet__RegionAssignment_6"
    // InternalEntityDsl.g:3111:1: rule__Subnet__RegionAssignment_6 : ( ruleRegion ) ;
    public final void rule__Subnet__RegionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3115:1: ( ( ruleRegion ) )
            // InternalEntityDsl.g:3116:2: ( ruleRegion )
            {
            // InternalEntityDsl.g:3116:2: ( ruleRegion )
            // InternalEntityDsl.g:3117:3: ruleRegion
            {
             before(grammarAccess.getSubnetAccess().getRegionRegionEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRegion();

            state._fsp--;

             after(grammarAccess.getSubnetAccess().getRegionRegionEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__RegionAssignment_6"


    // $ANTLR start "rule__Subnet__CidrAssignment_10"
    // InternalEntityDsl.g:3126:1: rule__Subnet__CidrAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Subnet__CidrAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:3130:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:3131:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:3131:2: ( RULE_STRING )
            // InternalEntityDsl.g:3132:3: RULE_STRING
            {
             before(grammarAccess.getSubnetAccess().getCidrSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSubnetAccess().getCidrSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subnet__CidrAssignment_10"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0001140118000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001140110000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0010080008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800008000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000000000L});

}