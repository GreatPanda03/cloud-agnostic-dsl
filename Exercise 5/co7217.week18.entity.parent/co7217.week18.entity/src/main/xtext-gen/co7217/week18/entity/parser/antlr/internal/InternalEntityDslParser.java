package co7217.week18.entity.parser.antlr.internal;

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
import co7217.week18.entity.services.EntityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'define'", "'infrastructure'", "'on'", "'{'", "'}'", "'vm'", "'running'", "'in'", "'network'", "'vpc'", "'hosted'", "'subnet'", "'type'", "'specifications'", "'cpu'", "':'", "'cores'", "'memory'", "'GB'", "'bucket'", "'enable'", "'versioning'", "'configure'", "'address'", "'space'", "'subnets'", "'hostedzone'", "'domain'", "'properties'", "'range'", "'aws'", "'gcp'", "'ubuntu'", "'amazon-linux'", "'windows'", "'small'", "'medium'", "'large'", "'london'", "'manchester'", "'birmingham'", "'edinburgh'"
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

        public InternalEntityDslParser(TokenStream input, EntityDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Infrastructure";
       	}

       	@Override
       	protected EntityDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInfrastructure"
    // InternalEntityDsl.g:65:1: entryRuleInfrastructure returns [EObject current=null] : iv_ruleInfrastructure= ruleInfrastructure EOF ;
    public final EObject entryRuleInfrastructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfrastructure = null;


        try {
            // InternalEntityDsl.g:65:55: (iv_ruleInfrastructure= ruleInfrastructure EOF )
            // InternalEntityDsl.g:66:2: iv_ruleInfrastructure= ruleInfrastructure EOF
            {
             newCompositeNode(grammarAccess.getInfrastructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfrastructure=ruleInfrastructure();

            state._fsp--;

             current =iv_ruleInfrastructure; 
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
    // $ANTLR end "entryRuleInfrastructure"


    // $ANTLR start "ruleInfrastructure"
    // InternalEntityDsl.g:72:1: ruleInfrastructure returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'infrastructure' otherlv_2= 'on' ( (lv_cloudProvider_3_0= ruleCloudProvider ) ) otherlv_4= '{' ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}' ) ;
    public final EObject ruleInfrastructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_cloudProvider_3_0 = null;

        EObject lv_resources_5_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:78:2: ( (otherlv_0= 'define' otherlv_1= 'infrastructure' otherlv_2= 'on' ( (lv_cloudProvider_3_0= ruleCloudProvider ) ) otherlv_4= '{' ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}' ) )
            // InternalEntityDsl.g:79:2: (otherlv_0= 'define' otherlv_1= 'infrastructure' otherlv_2= 'on' ( (lv_cloudProvider_3_0= ruleCloudProvider ) ) otherlv_4= '{' ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}' )
            {
            // InternalEntityDsl.g:79:2: (otherlv_0= 'define' otherlv_1= 'infrastructure' otherlv_2= 'on' ( (lv_cloudProvider_3_0= ruleCloudProvider ) ) otherlv_4= '{' ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}' )
            // InternalEntityDsl.g:80:3: otherlv_0= 'define' otherlv_1= 'infrastructure' otherlv_2= 'on' ( (lv_cloudProvider_3_0= ruleCloudProvider ) ) otherlv_4= '{' ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInfrastructureAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInfrastructureAccess().getInfrastructureKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInfrastructureAccess().getOnKeyword_2());
            		
            // InternalEntityDsl.g:92:3: ( (lv_cloudProvider_3_0= ruleCloudProvider ) )
            // InternalEntityDsl.g:93:4: (lv_cloudProvider_3_0= ruleCloudProvider )
            {
            // InternalEntityDsl.g:93:4: (lv_cloudProvider_3_0= ruleCloudProvider )
            // InternalEntityDsl.g:94:5: lv_cloudProvider_3_0= ruleCloudProvider
            {

            					newCompositeNode(grammarAccess.getInfrastructureAccess().getCloudProviderCloudProviderEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_cloudProvider_3_0=ruleCloudProvider();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfrastructureRule());
            					}
            					set(
            						current,
            						"cloudProvider",
            						lv_cloudProvider_3_0,
            						"co7217.week18.entity.EntityDsl.CloudProvider");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getInfrastructureAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalEntityDsl.g:115:3: ( (lv_resources_5_0= ruleResource ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==16||LA1_0==20||LA1_0==30||LA1_0==33||LA1_0==37) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEntityDsl.g:116:4: (lv_resources_5_0= ruleResource )
            	    {
            	    // InternalEntityDsl.g:116:4: (lv_resources_5_0= ruleResource )
            	    // InternalEntityDsl.g:117:5: lv_resources_5_0= ruleResource
            	    {

            	    					newCompositeNode(grammarAccess.getInfrastructureAccess().getResourcesResourceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_resources_5_0=ruleResource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInfrastructureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"resources",
            	    						lv_resources_5_0,
            	    						"co7217.week18.entity.EntityDsl.Resource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getInfrastructureAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleInfrastructure"


    // $ANTLR start "entryRuleResource"
    // InternalEntityDsl.g:142:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalEntityDsl.g:142:49: (iv_ruleResource= ruleResource EOF )
            // InternalEntityDsl.g:143:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalEntityDsl.g:149:1: ruleResource returns [EObject current=null] : (this_ComputeInstance_0= ruleComputeInstance | this_StorageBucket_1= ruleStorageBucket | this_Network_2= ruleNetwork | this_VPC_3= ruleVPC | this_Subnet_4= ruleSubnet | this_HostedZone_5= ruleHostedZone ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        EObject this_ComputeInstance_0 = null;

        EObject this_StorageBucket_1 = null;

        EObject this_Network_2 = null;

        EObject this_VPC_3 = null;

        EObject this_Subnet_4 = null;

        EObject this_HostedZone_5 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:155:2: ( (this_ComputeInstance_0= ruleComputeInstance | this_StorageBucket_1= ruleStorageBucket | this_Network_2= ruleNetwork | this_VPC_3= ruleVPC | this_Subnet_4= ruleSubnet | this_HostedZone_5= ruleHostedZone ) )
            // InternalEntityDsl.g:156:2: (this_ComputeInstance_0= ruleComputeInstance | this_StorageBucket_1= ruleStorageBucket | this_Network_2= ruleNetwork | this_VPC_3= ruleVPC | this_Subnet_4= ruleSubnet | this_HostedZone_5= ruleHostedZone )
            {
            // InternalEntityDsl.g:156:2: (this_ComputeInstance_0= ruleComputeInstance | this_StorageBucket_1= ruleStorageBucket | this_Network_2= ruleNetwork | this_VPC_3= ruleVPC | this_Subnet_4= ruleSubnet | this_HostedZone_5= ruleHostedZone )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 33:
                {
                alt2=3;
                }
                break;
            case 20:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
                {
                alt2=5;
                }
                break;
            case 37:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEntityDsl.g:157:3: this_ComputeInstance_0= ruleComputeInstance
                    {

                    			newCompositeNode(grammarAccess.getResourceAccess().getComputeInstanceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComputeInstance_0=ruleComputeInstance();

                    state._fsp--;


                    			current = this_ComputeInstance_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:166:3: this_StorageBucket_1= ruleStorageBucket
                    {

                    			newCompositeNode(grammarAccess.getResourceAccess().getStorageBucketParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StorageBucket_1=ruleStorageBucket();

                    state._fsp--;


                    			current = this_StorageBucket_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEntityDsl.g:175:3: this_Network_2= ruleNetwork
                    {

                    			newCompositeNode(grammarAccess.getResourceAccess().getNetworkParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Network_2=ruleNetwork();

                    state._fsp--;


                    			current = this_Network_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEntityDsl.g:184:3: this_VPC_3= ruleVPC
                    {

                    			newCompositeNode(grammarAccess.getResourceAccess().getVPCParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VPC_3=ruleVPC();

                    state._fsp--;


                    			current = this_VPC_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEntityDsl.g:193:3: this_Subnet_4= ruleSubnet
                    {

                    			newCompositeNode(grammarAccess.getResourceAccess().getSubnetParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Subnet_4=ruleSubnet();

                    state._fsp--;


                    			current = this_Subnet_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalEntityDsl.g:202:3: this_HostedZone_5= ruleHostedZone
                    {

                    			newCompositeNode(grammarAccess.getResourceAccess().getHostedZoneParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_HostedZone_5=ruleHostedZone();

                    state._fsp--;


                    			current = this_HostedZone_5;
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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleComputeInstance"
    // InternalEntityDsl.g:214:1: entryRuleComputeInstance returns [EObject current=null] : iv_ruleComputeInstance= ruleComputeInstance EOF ;
    public final EObject entryRuleComputeInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputeInstance = null;


        try {
            // InternalEntityDsl.g:214:56: (iv_ruleComputeInstance= ruleComputeInstance EOF )
            // InternalEntityDsl.g:215:2: iv_ruleComputeInstance= ruleComputeInstance EOF
            {
             newCompositeNode(grammarAccess.getComputeInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComputeInstance=ruleComputeInstance();

            state._fsp--;

             current =iv_ruleComputeInstance; 
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
    // $ANTLR end "entryRuleComputeInstance"


    // $ANTLR start "ruleComputeInstance"
    // InternalEntityDsl.g:221:1: ruleComputeInstance returns [EObject current=null] : (otherlv_0= 'vm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'running' otherlv_3= 'on' ( (lv_osImage_4_0= ruleOSImage ) ) otherlv_5= 'in' otherlv_6= 'network' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'in' otherlv_9= 'vpc' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'hosted' otherlv_12= 'in' ( (lv_region_13_0= ruleRegion ) ) otherlv_14= 'subnet' ( (otherlv_15= RULE_ID ) ) otherlv_16= 'type' ( (lv_instanceType_17_0= ruleInstanceType ) ) otherlv_18= '{' otherlv_19= 'specifications' otherlv_20= '{' otherlv_21= 'cpu' otherlv_22= ':' ( (lv_CPU_23_0= RULE_INT ) ) otherlv_24= 'cores' otherlv_25= 'memory' otherlv_26= ':' ( (lv_memoryGB_27_0= RULE_INT ) ) otherlv_28= 'GB' otherlv_29= '}' otherlv_30= '}' ) ;
    public final EObject ruleComputeInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_CPU_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_memoryGB_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Enumerator lv_osImage_4_0 = null;

        Enumerator lv_region_13_0 = null;

        Enumerator lv_instanceType_17_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:227:2: ( (otherlv_0= 'vm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'running' otherlv_3= 'on' ( (lv_osImage_4_0= ruleOSImage ) ) otherlv_5= 'in' otherlv_6= 'network' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'in' otherlv_9= 'vpc' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'hosted' otherlv_12= 'in' ( (lv_region_13_0= ruleRegion ) ) otherlv_14= 'subnet' ( (otherlv_15= RULE_ID ) ) otherlv_16= 'type' ( (lv_instanceType_17_0= ruleInstanceType ) ) otherlv_18= '{' otherlv_19= 'specifications' otherlv_20= '{' otherlv_21= 'cpu' otherlv_22= ':' ( (lv_CPU_23_0= RULE_INT ) ) otherlv_24= 'cores' otherlv_25= 'memory' otherlv_26= ':' ( (lv_memoryGB_27_0= RULE_INT ) ) otherlv_28= 'GB' otherlv_29= '}' otherlv_30= '}' ) )
            // InternalEntityDsl.g:228:2: (otherlv_0= 'vm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'running' otherlv_3= 'on' ( (lv_osImage_4_0= ruleOSImage ) ) otherlv_5= 'in' otherlv_6= 'network' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'in' otherlv_9= 'vpc' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'hosted' otherlv_12= 'in' ( (lv_region_13_0= ruleRegion ) ) otherlv_14= 'subnet' ( (otherlv_15= RULE_ID ) ) otherlv_16= 'type' ( (lv_instanceType_17_0= ruleInstanceType ) ) otherlv_18= '{' otherlv_19= 'specifications' otherlv_20= '{' otherlv_21= 'cpu' otherlv_22= ':' ( (lv_CPU_23_0= RULE_INT ) ) otherlv_24= 'cores' otherlv_25= 'memory' otherlv_26= ':' ( (lv_memoryGB_27_0= RULE_INT ) ) otherlv_28= 'GB' otherlv_29= '}' otherlv_30= '}' )
            {
            // InternalEntityDsl.g:228:2: (otherlv_0= 'vm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'running' otherlv_3= 'on' ( (lv_osImage_4_0= ruleOSImage ) ) otherlv_5= 'in' otherlv_6= 'network' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'in' otherlv_9= 'vpc' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'hosted' otherlv_12= 'in' ( (lv_region_13_0= ruleRegion ) ) otherlv_14= 'subnet' ( (otherlv_15= RULE_ID ) ) otherlv_16= 'type' ( (lv_instanceType_17_0= ruleInstanceType ) ) otherlv_18= '{' otherlv_19= 'specifications' otherlv_20= '{' otherlv_21= 'cpu' otherlv_22= ':' ( (lv_CPU_23_0= RULE_INT ) ) otherlv_24= 'cores' otherlv_25= 'memory' otherlv_26= ':' ( (lv_memoryGB_27_0= RULE_INT ) ) otherlv_28= 'GB' otherlv_29= '}' otherlv_30= '}' )
            // InternalEntityDsl.g:229:3: otherlv_0= 'vm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'running' otherlv_3= 'on' ( (lv_osImage_4_0= ruleOSImage ) ) otherlv_5= 'in' otherlv_6= 'network' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'in' otherlv_9= 'vpc' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'hosted' otherlv_12= 'in' ( (lv_region_13_0= ruleRegion ) ) otherlv_14= 'subnet' ( (otherlv_15= RULE_ID ) ) otherlv_16= 'type' ( (lv_instanceType_17_0= ruleInstanceType ) ) otherlv_18= '{' otherlv_19= 'specifications' otherlv_20= '{' otherlv_21= 'cpu' otherlv_22= ':' ( (lv_CPU_23_0= RULE_INT ) ) otherlv_24= 'cores' otherlv_25= 'memory' otherlv_26= ':' ( (lv_memoryGB_27_0= RULE_INT ) ) otherlv_28= 'GB' otherlv_29= '}' otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getComputeInstanceAccess().getVmKeyword_0());
            		
            // InternalEntityDsl.g:233:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntityDsl.g:234:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEntityDsl.g:234:4: (lv_name_1_0= RULE_ID )
            // InternalEntityDsl.g:235:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComputeInstanceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComputeInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getComputeInstanceAccess().getRunningKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getComputeInstanceAccess().getOnKeyword_3());
            		
            // InternalEntityDsl.g:259:3: ( (lv_osImage_4_0= ruleOSImage ) )
            // InternalEntityDsl.g:260:4: (lv_osImage_4_0= ruleOSImage )
            {
            // InternalEntityDsl.g:260:4: (lv_osImage_4_0= ruleOSImage )
            // InternalEntityDsl.g:261:5: lv_osImage_4_0= ruleOSImage
            {

            					newCompositeNode(grammarAccess.getComputeInstanceAccess().getOsImageOSImageEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_osImage_4_0=ruleOSImage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputeInstanceRule());
            					}
            					set(
            						current,
            						"osImage",
            						lv_osImage_4_0,
            						"co7217.week18.entity.EntityDsl.OSImage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getComputeInstanceAccess().getInKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getComputeInstanceAccess().getNetworkKeyword_6());
            		
            // InternalEntityDsl.g:286:3: ( (otherlv_7= RULE_ID ) )
            // InternalEntityDsl.g:287:4: (otherlv_7= RULE_ID )
            {
            // InternalEntityDsl.g:287:4: (otherlv_7= RULE_ID )
            // InternalEntityDsl.g:288:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComputeInstanceRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_7, grammarAccess.getComputeInstanceAccess().getNetworkNetworkCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getComputeInstanceAccess().getInKeyword_8());
            		
            otherlv_9=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getComputeInstanceAccess().getVpcKeyword_9());
            		
            // InternalEntityDsl.g:307:3: ( (otherlv_10= RULE_ID ) )
            // InternalEntityDsl.g:308:4: (otherlv_10= RULE_ID )
            {
            // InternalEntityDsl.g:308:4: (otherlv_10= RULE_ID )
            // InternalEntityDsl.g:309:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComputeInstanceRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_10, grammarAccess.getComputeInstanceAccess().getVpcVPCCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getComputeInstanceAccess().getHostedKeyword_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_12, grammarAccess.getComputeInstanceAccess().getInKeyword_12());
            		
            // InternalEntityDsl.g:328:3: ( (lv_region_13_0= ruleRegion ) )
            // InternalEntityDsl.g:329:4: (lv_region_13_0= ruleRegion )
            {
            // InternalEntityDsl.g:329:4: (lv_region_13_0= ruleRegion )
            // InternalEntityDsl.g:330:5: lv_region_13_0= ruleRegion
            {

            					newCompositeNode(grammarAccess.getComputeInstanceAccess().getRegionRegionEnumRuleCall_13_0());
            				
            pushFollow(FOLLOW_16);
            lv_region_13_0=ruleRegion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputeInstanceRule());
            					}
            					set(
            						current,
            						"region",
            						lv_region_13_0,
            						"co7217.week18.entity.EntityDsl.Region");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_14, grammarAccess.getComputeInstanceAccess().getSubnetKeyword_14());
            		
            // InternalEntityDsl.g:351:3: ( (otherlv_15= RULE_ID ) )
            // InternalEntityDsl.g:352:4: (otherlv_15= RULE_ID )
            {
            // InternalEntityDsl.g:352:4: (otherlv_15= RULE_ID )
            // InternalEntityDsl.g:353:5: otherlv_15= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComputeInstanceRule());
            					}
            				
            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_15, grammarAccess.getComputeInstanceAccess().getSubnetSubnetCrossReference_15_0());
            				

            }


            }

            otherlv_16=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_16, grammarAccess.getComputeInstanceAccess().getTypeKeyword_16());
            		
            // InternalEntityDsl.g:368:3: ( (lv_instanceType_17_0= ruleInstanceType ) )
            // InternalEntityDsl.g:369:4: (lv_instanceType_17_0= ruleInstanceType )
            {
            // InternalEntityDsl.g:369:4: (lv_instanceType_17_0= ruleInstanceType )
            // InternalEntityDsl.g:370:5: lv_instanceType_17_0= ruleInstanceType
            {

            					newCompositeNode(grammarAccess.getComputeInstanceAccess().getInstanceTypeInstanceTypeEnumRuleCall_17_0());
            				
            pushFollow(FOLLOW_6);
            lv_instanceType_17_0=ruleInstanceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputeInstanceRule());
            					}
            					set(
            						current,
            						"instanceType",
            						lv_instanceType_17_0,
            						"co7217.week18.entity.EntityDsl.InstanceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_18, grammarAccess.getComputeInstanceAccess().getLeftCurlyBracketKeyword_18());
            		
            otherlv_19=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_19, grammarAccess.getComputeInstanceAccess().getSpecificationsKeyword_19());
            		
            otherlv_20=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_20, grammarAccess.getComputeInstanceAccess().getLeftCurlyBracketKeyword_20());
            		
            otherlv_21=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_21, grammarAccess.getComputeInstanceAccess().getCpuKeyword_21());
            		
            otherlv_22=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_22, grammarAccess.getComputeInstanceAccess().getColonKeyword_22());
            		
            // InternalEntityDsl.g:407:3: ( (lv_CPU_23_0= RULE_INT ) )
            // InternalEntityDsl.g:408:4: (lv_CPU_23_0= RULE_INT )
            {
            // InternalEntityDsl.g:408:4: (lv_CPU_23_0= RULE_INT )
            // InternalEntityDsl.g:409:5: lv_CPU_23_0= RULE_INT
            {
            lv_CPU_23_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_CPU_23_0, grammarAccess.getComputeInstanceAccess().getCPUINTTerminalRuleCall_23_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComputeInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"CPU",
            						lv_CPU_23_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_24=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_24, grammarAccess.getComputeInstanceAccess().getCoresKeyword_24());
            		
            otherlv_25=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_25, grammarAccess.getComputeInstanceAccess().getMemoryKeyword_25());
            		
            otherlv_26=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_26, grammarAccess.getComputeInstanceAccess().getColonKeyword_26());
            		
            // InternalEntityDsl.g:437:3: ( (lv_memoryGB_27_0= RULE_INT ) )
            // InternalEntityDsl.g:438:4: (lv_memoryGB_27_0= RULE_INT )
            {
            // InternalEntityDsl.g:438:4: (lv_memoryGB_27_0= RULE_INT )
            // InternalEntityDsl.g:439:5: lv_memoryGB_27_0= RULE_INT
            {
            lv_memoryGB_27_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_memoryGB_27_0, grammarAccess.getComputeInstanceAccess().getMemoryGBINTTerminalRuleCall_27_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComputeInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"memoryGB",
            						lv_memoryGB_27_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_28=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_28, grammarAccess.getComputeInstanceAccess().getGBKeyword_28());
            		
            otherlv_29=(Token)match(input,15,FOLLOW_26); 

            			newLeafNode(otherlv_29, grammarAccess.getComputeInstanceAccess().getRightCurlyBracketKeyword_29());
            		
            otherlv_30=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getComputeInstanceAccess().getRightCurlyBracketKeyword_30());
            		

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
    // $ANTLR end "ruleComputeInstance"


    // $ANTLR start "entryRuleStorageBucket"
    // InternalEntityDsl.g:471:1: entryRuleStorageBucket returns [EObject current=null] : iv_ruleStorageBucket= ruleStorageBucket EOF ;
    public final EObject entryRuleStorageBucket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStorageBucket = null;


        try {
            // InternalEntityDsl.g:471:54: (iv_ruleStorageBucket= ruleStorageBucket EOF )
            // InternalEntityDsl.g:472:2: iv_ruleStorageBucket= ruleStorageBucket EOF
            {
             newCompositeNode(grammarAccess.getStorageBucketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStorageBucket=ruleStorageBucket();

            state._fsp--;

             current =iv_ruleStorageBucket; 
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
    // $ANTLR end "entryRuleStorageBucket"


    // $ANTLR start "ruleStorageBucket"
    // InternalEntityDsl.g:478:1: ruleStorageBucket returns [EObject current=null] : (otherlv_0= 'bucket' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hosted' otherlv_3= 'in' ( (lv_region_4_0= ruleRegion ) ) otherlv_5= '{' (otherlv_6= 'enable' )? ( (lv_versioning_7_0= 'versioning' ) )? otherlv_8= '}' ) ;
    public final EObject ruleStorageBucket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_versioning_7_0=null;
        Token otherlv_8=null;
        Enumerator lv_region_4_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:484:2: ( (otherlv_0= 'bucket' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hosted' otherlv_3= 'in' ( (lv_region_4_0= ruleRegion ) ) otherlv_5= '{' (otherlv_6= 'enable' )? ( (lv_versioning_7_0= 'versioning' ) )? otherlv_8= '}' ) )
            // InternalEntityDsl.g:485:2: (otherlv_0= 'bucket' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hosted' otherlv_3= 'in' ( (lv_region_4_0= ruleRegion ) ) otherlv_5= '{' (otherlv_6= 'enable' )? ( (lv_versioning_7_0= 'versioning' ) )? otherlv_8= '}' )
            {
            // InternalEntityDsl.g:485:2: (otherlv_0= 'bucket' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hosted' otherlv_3= 'in' ( (lv_region_4_0= ruleRegion ) ) otherlv_5= '{' (otherlv_6= 'enable' )? ( (lv_versioning_7_0= 'versioning' ) )? otherlv_8= '}' )
            // InternalEntityDsl.g:486:3: otherlv_0= 'bucket' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hosted' otherlv_3= 'in' ( (lv_region_4_0= ruleRegion ) ) otherlv_5= '{' (otherlv_6= 'enable' )? ( (lv_versioning_7_0= 'versioning' ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getStorageBucketAccess().getBucketKeyword_0());
            		
            // InternalEntityDsl.g:490:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntityDsl.g:491:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEntityDsl.g:491:4: (lv_name_1_0= RULE_ID )
            // InternalEntityDsl.g:492:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStorageBucketAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStorageBucketRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getStorageBucketAccess().getHostedKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getStorageBucketAccess().getInKeyword_3());
            		
            // InternalEntityDsl.g:516:3: ( (lv_region_4_0= ruleRegion ) )
            // InternalEntityDsl.g:517:4: (lv_region_4_0= ruleRegion )
            {
            // InternalEntityDsl.g:517:4: (lv_region_4_0= ruleRegion )
            // InternalEntityDsl.g:518:5: lv_region_4_0= ruleRegion
            {

            					newCompositeNode(grammarAccess.getStorageBucketAccess().getRegionRegionEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_region_4_0=ruleRegion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStorageBucketRule());
            					}
            					set(
            						current,
            						"region",
            						lv_region_4_0,
            						"co7217.week18.entity.EntityDsl.Region");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getStorageBucketAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalEntityDsl.g:539:3: (otherlv_6= 'enable' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEntityDsl.g:540:4: otherlv_6= 'enable'
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getStorageBucketAccess().getEnableKeyword_6());
                    			

                    }
                    break;

            }

            // InternalEntityDsl.g:545:3: ( (lv_versioning_7_0= 'versioning' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEntityDsl.g:546:4: (lv_versioning_7_0= 'versioning' )
                    {
                    // InternalEntityDsl.g:546:4: (lv_versioning_7_0= 'versioning' )
                    // InternalEntityDsl.g:547:5: lv_versioning_7_0= 'versioning'
                    {
                    lv_versioning_7_0=(Token)match(input,32,FOLLOW_26); 

                    					newLeafNode(lv_versioning_7_0, grammarAccess.getStorageBucketAccess().getVersioningVersioningKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStorageBucketRule());
                    					}
                    					setWithLastConsumed(current, "versioning", lv_versioning_7_0 != null, "versioning");
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getStorageBucketAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleStorageBucket"


    // $ANTLR start "entryRuleNetwork"
    // InternalEntityDsl.g:567:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalEntityDsl.g:567:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalEntityDsl.g:568:2: iv_ruleNetwork= ruleNetwork EOF
            {
             newCompositeNode(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetwork=ruleNetwork();

            state._fsp--;

             current =iv_ruleNetwork; 
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
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalEntityDsl.g:574:1: ruleNetwork returns [EObject current=null] : (otherlv_0= 'configure' otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_vpcs_4_0= ruleVPC ) ) | ( (lv_zones_5_0= ruleHostedZone ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_vpcs_4_0 = null;

        EObject lv_zones_5_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:580:2: ( (otherlv_0= 'configure' otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_vpcs_4_0= ruleVPC ) ) | ( (lv_zones_5_0= ruleHostedZone ) ) )* otherlv_6= '}' ) )
            // InternalEntityDsl.g:581:2: (otherlv_0= 'configure' otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_vpcs_4_0= ruleVPC ) ) | ( (lv_zones_5_0= ruleHostedZone ) ) )* otherlv_6= '}' )
            {
            // InternalEntityDsl.g:581:2: (otherlv_0= 'configure' otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_vpcs_4_0= ruleVPC ) ) | ( (lv_zones_5_0= ruleHostedZone ) ) )* otherlv_6= '}' )
            // InternalEntityDsl.g:582:3: otherlv_0= 'configure' otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_vpcs_4_0= ruleVPC ) ) | ( (lv_zones_5_0= ruleHostedZone ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkAccess().getConfigureKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkAccess().getNetworkKeyword_1());
            		
            // InternalEntityDsl.g:590:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEntityDsl.g:591:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEntityDsl.g:591:4: (lv_name_2_0= RULE_ID )
            // InternalEntityDsl.g:592:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getNetworkAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEntityDsl.g:612:3: ( ( (lv_vpcs_4_0= ruleVPC ) ) | ( (lv_zones_5_0= ruleHostedZone ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }
                else if ( (LA5_0==37) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEntityDsl.g:613:4: ( (lv_vpcs_4_0= ruleVPC ) )
            	    {
            	    // InternalEntityDsl.g:613:4: ( (lv_vpcs_4_0= ruleVPC ) )
            	    // InternalEntityDsl.g:614:5: (lv_vpcs_4_0= ruleVPC )
            	    {
            	    // InternalEntityDsl.g:614:5: (lv_vpcs_4_0= ruleVPC )
            	    // InternalEntityDsl.g:615:6: lv_vpcs_4_0= ruleVPC
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkAccess().getVpcsVPCParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_vpcs_4_0=ruleVPC();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vpcs",
            	    							lv_vpcs_4_0,
            	    							"co7217.week18.entity.EntityDsl.VPC");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEntityDsl.g:633:4: ( (lv_zones_5_0= ruleHostedZone ) )
            	    {
            	    // InternalEntityDsl.g:633:4: ( (lv_zones_5_0= ruleHostedZone ) )
            	    // InternalEntityDsl.g:634:5: (lv_zones_5_0= ruleHostedZone )
            	    {
            	    // InternalEntityDsl.g:634:5: (lv_zones_5_0= ruleHostedZone )
            	    // InternalEntityDsl.g:635:6: lv_zones_5_0= ruleHostedZone
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkAccess().getZonesHostedZoneParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_zones_5_0=ruleHostedZone();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"zones",
            	    							lv_zones_5_0,
            	    							"co7217.week18.entity.EntityDsl.HostedZone");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleVPC"
    // InternalEntityDsl.g:661:1: entryRuleVPC returns [EObject current=null] : iv_ruleVPC= ruleVPC EOF ;
    public final EObject entryRuleVPC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVPC = null;


        try {
            // InternalEntityDsl.g:661:44: (iv_ruleVPC= ruleVPC EOF )
            // InternalEntityDsl.g:662:2: iv_ruleVPC= ruleVPC EOF
            {
             newCompositeNode(grammarAccess.getVPCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVPC=ruleVPC();

            state._fsp--;

             current =iv_ruleVPC; 
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
    // $ANTLR end "entryRuleVPC"


    // $ANTLR start "ruleVPC"
    // InternalEntityDsl.g:668:1: ruleVPC returns [EObject current=null] : (otherlv_0= 'vpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= 'space' ( (lv_cidr_5_0= RULE_STRING ) ) (otherlv_6= 'subnets' otherlv_7= '{' ( (lv_subnets_8_0= ruleSubnet ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleVPC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_cidr_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_subnets_8_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:674:2: ( (otherlv_0= 'vpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= 'space' ( (lv_cidr_5_0= RULE_STRING ) ) (otherlv_6= 'subnets' otherlv_7= '{' ( (lv_subnets_8_0= ruleSubnet ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalEntityDsl.g:675:2: (otherlv_0= 'vpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= 'space' ( (lv_cidr_5_0= RULE_STRING ) ) (otherlv_6= 'subnets' otherlv_7= '{' ( (lv_subnets_8_0= ruleSubnet ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalEntityDsl.g:675:2: (otherlv_0= 'vpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= 'space' ( (lv_cidr_5_0= RULE_STRING ) ) (otherlv_6= 'subnets' otherlv_7= '{' ( (lv_subnets_8_0= ruleSubnet ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalEntityDsl.g:676:3: otherlv_0= 'vpc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= 'space' ( (lv_cidr_5_0= RULE_STRING ) ) (otherlv_6= 'subnets' otherlv_7= '{' ( (lv_subnets_8_0= ruleSubnet ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVPCAccess().getVpcKeyword_0());
            		
            // InternalEntityDsl.g:680:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntityDsl.g:681:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEntityDsl.g:681:4: (lv_name_1_0= RULE_ID )
            // InternalEntityDsl.g:682:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVPCAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVPCRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getVPCAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getVPCAccess().getAddressKeyword_3());
            		
            otherlv_4=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getVPCAccess().getSpaceKeyword_4());
            		
            // InternalEntityDsl.g:710:3: ( (lv_cidr_5_0= RULE_STRING ) )
            // InternalEntityDsl.g:711:4: (lv_cidr_5_0= RULE_STRING )
            {
            // InternalEntityDsl.g:711:4: (lv_cidr_5_0= RULE_STRING )
            // InternalEntityDsl.g:712:5: lv_cidr_5_0= RULE_STRING
            {
            lv_cidr_5_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_cidr_5_0, grammarAccess.getVPCAccess().getCidrSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVPCRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cidr",
            						lv_cidr_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalEntityDsl.g:728:3: (otherlv_6= 'subnets' otherlv_7= '{' ( (lv_subnets_8_0= ruleSubnet ) )* otherlv_9= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntityDsl.g:729:4: otherlv_6= 'subnets' otherlv_7= '{' ( (lv_subnets_8_0= ruleSubnet ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getVPCAccess().getSubnetsKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getVPCAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalEntityDsl.g:737:4: ( (lv_subnets_8_0= ruleSubnet ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalEntityDsl.g:738:5: (lv_subnets_8_0= ruleSubnet )
                    	    {
                    	    // InternalEntityDsl.g:738:5: (lv_subnets_8_0= ruleSubnet )
                    	    // InternalEntityDsl.g:739:6: lv_subnets_8_0= ruleSubnet
                    	    {

                    	    						newCompositeNode(grammarAccess.getVPCAccess().getSubnetsSubnetParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_33);
                    	    lv_subnets_8_0=ruleSubnet();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getVPCRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"subnets",
                    	    							lv_subnets_8_0,
                    	    							"co7217.week18.entity.EntityDsl.Subnet");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_26); 

                    				newLeafNode(otherlv_9, grammarAccess.getVPCAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getVPCAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleVPC"


    // $ANTLR start "entryRuleHostedZone"
    // InternalEntityDsl.g:769:1: entryRuleHostedZone returns [EObject current=null] : iv_ruleHostedZone= ruleHostedZone EOF ;
    public final EObject entryRuleHostedZone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostedZone = null;


        try {
            // InternalEntityDsl.g:769:51: (iv_ruleHostedZone= ruleHostedZone EOF )
            // InternalEntityDsl.g:770:2: iv_ruleHostedZone= ruleHostedZone EOF
            {
             newCompositeNode(grammarAccess.getHostedZoneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHostedZone=ruleHostedZone();

            state._fsp--;

             current =iv_ruleHostedZone; 
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
    // $ANTLR end "entryRuleHostedZone"


    // $ANTLR start "ruleHostedZone"
    // InternalEntityDsl.g:776:1: ruleHostedZone returns [EObject current=null] : (otherlv_0= 'hostedzone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'domain' ( (lv_domain_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleHostedZone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_domain_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:782:2: ( (otherlv_0= 'hostedzone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'domain' ( (lv_domain_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalEntityDsl.g:783:2: (otherlv_0= 'hostedzone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'domain' ( (lv_domain_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalEntityDsl.g:783:2: (otherlv_0= 'hostedzone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'domain' ( (lv_domain_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalEntityDsl.g:784:3: otherlv_0= 'hostedzone' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'domain' ( (lv_domain_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getHostedZoneAccess().getHostedzoneKeyword_0());
            		
            // InternalEntityDsl.g:788:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntityDsl.g:789:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEntityDsl.g:789:4: (lv_name_1_0= RULE_ID )
            // InternalEntityDsl.g:790:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHostedZoneAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHostedZoneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getHostedZoneAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getHostedZoneAccess().getDomainKeyword_3());
            		
            // InternalEntityDsl.g:814:3: ( (lv_domain_4_0= RULE_STRING ) )
            // InternalEntityDsl.g:815:4: (lv_domain_4_0= RULE_STRING )
            {
            // InternalEntityDsl.g:815:4: (lv_domain_4_0= RULE_STRING )
            // InternalEntityDsl.g:816:5: lv_domain_4_0= RULE_STRING
            {
            lv_domain_4_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_domain_4_0, grammarAccess.getHostedZoneAccess().getDomainSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHostedZoneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"domain",
            						lv_domain_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getHostedZoneAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleHostedZone"


    // $ANTLR start "entryRuleSubnet"
    // InternalEntityDsl.g:840:1: entryRuleSubnet returns [EObject current=null] : iv_ruleSubnet= ruleSubnet EOF ;
    public final EObject entryRuleSubnet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubnet = null;


        try {
            // InternalEntityDsl.g:840:47: (iv_ruleSubnet= ruleSubnet EOF )
            // InternalEntityDsl.g:841:2: iv_ruleSubnet= ruleSubnet EOF
            {
             newCompositeNode(grammarAccess.getSubnetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubnet=ruleSubnet();

            state._fsp--;

             current =iv_ruleSubnet; 
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
    // $ANTLR end "entryRuleSubnet"


    // $ANTLR start "ruleSubnet"
    // InternalEntityDsl.g:847:1: ruleSubnet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= 'vpc' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'hosted' otherlv_5= 'in' ( (lv_region_6_0= ruleRegion ) ) otherlv_7= 'properties' otherlv_8= '{' otherlv_9= 'range' ( (lv_cidr_10_0= RULE_STRING ) ) otherlv_11= '}' ) ;
    public final EObject ruleSubnet() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_cidr_10_0=null;
        Token otherlv_11=null;
        Enumerator lv_region_6_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:853:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= 'vpc' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'hosted' otherlv_5= 'in' ( (lv_region_6_0= ruleRegion ) ) otherlv_7= 'properties' otherlv_8= '{' otherlv_9= 'range' ( (lv_cidr_10_0= RULE_STRING ) ) otherlv_11= '}' ) )
            // InternalEntityDsl.g:854:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= 'vpc' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'hosted' otherlv_5= 'in' ( (lv_region_6_0= ruleRegion ) ) otherlv_7= 'properties' otherlv_8= '{' otherlv_9= 'range' ( (lv_cidr_10_0= RULE_STRING ) ) otherlv_11= '}' )
            {
            // InternalEntityDsl.g:854:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= 'vpc' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'hosted' otherlv_5= 'in' ( (lv_region_6_0= ruleRegion ) ) otherlv_7= 'properties' otherlv_8= '{' otherlv_9= 'range' ( (lv_cidr_10_0= RULE_STRING ) ) otherlv_11= '}' )
            // InternalEntityDsl.g:855:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= 'vpc' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'hosted' otherlv_5= 'in' ( (lv_region_6_0= ruleRegion ) ) otherlv_7= 'properties' otherlv_8= '{' otherlv_9= 'range' ( (lv_cidr_10_0= RULE_STRING ) ) otherlv_11= '}'
            {
            // InternalEntityDsl.g:855:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEntityDsl.g:856:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEntityDsl.g:856:4: (lv_name_0_0= RULE_ID )
            // InternalEntityDsl.g:857:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSubnetAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubnetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSubnetAccess().getInKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSubnetAccess().getVpcKeyword_2());
            		
            // InternalEntityDsl.g:881:3: ( (otherlv_3= RULE_ID ) )
            // InternalEntityDsl.g:882:4: (otherlv_3= RULE_ID )
            {
            // InternalEntityDsl.g:882:4: (otherlv_3= RULE_ID )
            // InternalEntityDsl.g:883:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubnetRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_3, grammarAccess.getSubnetAccess().getVpcVPCCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getSubnetAccess().getHostedKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getSubnetAccess().getInKeyword_5());
            		
            // InternalEntityDsl.g:902:3: ( (lv_region_6_0= ruleRegion ) )
            // InternalEntityDsl.g:903:4: (lv_region_6_0= ruleRegion )
            {
            // InternalEntityDsl.g:903:4: (lv_region_6_0= ruleRegion )
            // InternalEntityDsl.g:904:5: lv_region_6_0= ruleRegion
            {

            					newCompositeNode(grammarAccess.getSubnetAccess().getRegionRegionEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_35);
            lv_region_6_0=ruleRegion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubnetRule());
            					}
            					set(
            						current,
            						"region",
            						lv_region_6_0,
            						"co7217.week18.entity.EntityDsl.Region");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getSubnetAccess().getPropertiesKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_8, grammarAccess.getSubnetAccess().getLeftCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,40,FOLLOW_31); 

            			newLeafNode(otherlv_9, grammarAccess.getSubnetAccess().getRangeKeyword_9());
            		
            // InternalEntityDsl.g:933:3: ( (lv_cidr_10_0= RULE_STRING ) )
            // InternalEntityDsl.g:934:4: (lv_cidr_10_0= RULE_STRING )
            {
            // InternalEntityDsl.g:934:4: (lv_cidr_10_0= RULE_STRING )
            // InternalEntityDsl.g:935:5: lv_cidr_10_0= RULE_STRING
            {
            lv_cidr_10_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_cidr_10_0, grammarAccess.getSubnetAccess().getCidrSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubnetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cidr",
            						lv_cidr_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSubnetAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleSubnet"


    // $ANTLR start "ruleCloudProvider"
    // InternalEntityDsl.g:959:1: ruleCloudProvider returns [Enumerator current=null] : ( (enumLiteral_0= 'aws' ) | (enumLiteral_1= 'gcp' ) ) ;
    public final Enumerator ruleCloudProvider() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:965:2: ( ( (enumLiteral_0= 'aws' ) | (enumLiteral_1= 'gcp' ) ) )
            // InternalEntityDsl.g:966:2: ( (enumLiteral_0= 'aws' ) | (enumLiteral_1= 'gcp' ) )
            {
            // InternalEntityDsl.g:966:2: ( (enumLiteral_0= 'aws' ) | (enumLiteral_1= 'gcp' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==41) ) {
                alt8=1;
            }
            else if ( (LA8_0==42) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEntityDsl.g:967:3: (enumLiteral_0= 'aws' )
                    {
                    // InternalEntityDsl.g:967:3: (enumLiteral_0= 'aws' )
                    // InternalEntityDsl.g:968:4: enumLiteral_0= 'aws'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getCloudProviderAccess().getAWSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCloudProviderAccess().getAWSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:975:3: (enumLiteral_1= 'gcp' )
                    {
                    // InternalEntityDsl.g:975:3: (enumLiteral_1= 'gcp' )
                    // InternalEntityDsl.g:976:4: enumLiteral_1= 'gcp'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getCloudProviderAccess().getGCPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCloudProviderAccess().getGCPEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleCloudProvider"


    // $ANTLR start "ruleOSImage"
    // InternalEntityDsl.g:986:1: ruleOSImage returns [Enumerator current=null] : ( (enumLiteral_0= 'ubuntu' ) | (enumLiteral_1= 'amazon-linux' ) | (enumLiteral_2= 'windows' ) ) ;
    public final Enumerator ruleOSImage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:992:2: ( ( (enumLiteral_0= 'ubuntu' ) | (enumLiteral_1= 'amazon-linux' ) | (enumLiteral_2= 'windows' ) ) )
            // InternalEntityDsl.g:993:2: ( (enumLiteral_0= 'ubuntu' ) | (enumLiteral_1= 'amazon-linux' ) | (enumLiteral_2= 'windows' ) )
            {
            // InternalEntityDsl.g:993:2: ( (enumLiteral_0= 'ubuntu' ) | (enumLiteral_1= 'amazon-linux' ) | (enumLiteral_2= 'windows' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt9=1;
                }
                break;
            case 44:
                {
                alt9=2;
                }
                break;
            case 45:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalEntityDsl.g:994:3: (enumLiteral_0= 'ubuntu' )
                    {
                    // InternalEntityDsl.g:994:3: (enumLiteral_0= 'ubuntu' )
                    // InternalEntityDsl.g:995:4: enumLiteral_0= 'ubuntu'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOSImageAccess().getUBUNTUEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOSImageAccess().getUBUNTUEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:1002:3: (enumLiteral_1= 'amazon-linux' )
                    {
                    // InternalEntityDsl.g:1002:3: (enumLiteral_1= 'amazon-linux' )
                    // InternalEntityDsl.g:1003:4: enumLiteral_1= 'amazon-linux'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getOSImageAccess().getAMAZON_LINUXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOSImageAccess().getAMAZON_LINUXEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEntityDsl.g:1010:3: (enumLiteral_2= 'windows' )
                    {
                    // InternalEntityDsl.g:1010:3: (enumLiteral_2= 'windows' )
                    // InternalEntityDsl.g:1011:4: enumLiteral_2= 'windows'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getOSImageAccess().getWINDOWSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOSImageAccess().getWINDOWSEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleOSImage"


    // $ANTLR start "ruleInstanceType"
    // InternalEntityDsl.g:1021:1: ruleInstanceType returns [Enumerator current=null] : ( (enumLiteral_0= 'small' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'large' ) ) ;
    public final Enumerator ruleInstanceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:1027:2: ( ( (enumLiteral_0= 'small' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'large' ) ) )
            // InternalEntityDsl.g:1028:2: ( (enumLiteral_0= 'small' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'large' ) )
            {
            // InternalEntityDsl.g:1028:2: ( (enumLiteral_0= 'small' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'large' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt10=1;
                }
                break;
            case 47:
                {
                alt10=2;
                }
                break;
            case 48:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalEntityDsl.g:1029:3: (enumLiteral_0= 'small' )
                    {
                    // InternalEntityDsl.g:1029:3: (enumLiteral_0= 'small' )
                    // InternalEntityDsl.g:1030:4: enumLiteral_0= 'small'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getInstanceTypeAccess().getSmallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInstanceTypeAccess().getSmallEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:1037:3: (enumLiteral_1= 'medium' )
                    {
                    // InternalEntityDsl.g:1037:3: (enumLiteral_1= 'medium' )
                    // InternalEntityDsl.g:1038:4: enumLiteral_1= 'medium'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getInstanceTypeAccess().getMediumEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getInstanceTypeAccess().getMediumEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEntityDsl.g:1045:3: (enumLiteral_2= 'large' )
                    {
                    // InternalEntityDsl.g:1045:3: (enumLiteral_2= 'large' )
                    // InternalEntityDsl.g:1046:4: enumLiteral_2= 'large'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getInstanceTypeAccess().getLargeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getInstanceTypeAccess().getLargeEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleInstanceType"


    // $ANTLR start "ruleRegion"
    // InternalEntityDsl.g:1056:1: ruleRegion returns [Enumerator current=null] : ( (enumLiteral_0= 'london' ) | (enumLiteral_1= 'manchester' ) | (enumLiteral_2= 'birmingham' ) | (enumLiteral_3= 'edinburgh' ) ) ;
    public final Enumerator ruleRegion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:1062:2: ( ( (enumLiteral_0= 'london' ) | (enumLiteral_1= 'manchester' ) | (enumLiteral_2= 'birmingham' ) | (enumLiteral_3= 'edinburgh' ) ) )
            // InternalEntityDsl.g:1063:2: ( (enumLiteral_0= 'london' ) | (enumLiteral_1= 'manchester' ) | (enumLiteral_2= 'birmingham' ) | (enumLiteral_3= 'edinburgh' ) )
            {
            // InternalEntityDsl.g:1063:2: ( (enumLiteral_0= 'london' ) | (enumLiteral_1= 'manchester' ) | (enumLiteral_2= 'birmingham' ) | (enumLiteral_3= 'edinburgh' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt11=1;
                }
                break;
            case 50:
                {
                alt11=2;
                }
                break;
            case 51:
                {
                alt11=3;
                }
                break;
            case 52:
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
                    // InternalEntityDsl.g:1064:3: (enumLiteral_0= 'london' )
                    {
                    // InternalEntityDsl.g:1064:3: (enumLiteral_0= 'london' )
                    // InternalEntityDsl.g:1065:4: enumLiteral_0= 'london'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getRegionAccess().getLondonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRegionAccess().getLondonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:1072:3: (enumLiteral_1= 'manchester' )
                    {
                    // InternalEntityDsl.g:1072:3: (enumLiteral_1= 'manchester' )
                    // InternalEntityDsl.g:1073:4: enumLiteral_1= 'manchester'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getRegionAccess().getManchesterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRegionAccess().getManchesterEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEntityDsl.g:1080:3: (enumLiteral_2= 'birmingham' )
                    {
                    // InternalEntityDsl.g:1080:3: (enumLiteral_2= 'birmingham' )
                    // InternalEntityDsl.g:1081:4: enumLiteral_2= 'birmingham'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getRegionAccess().getBirminghamEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRegionAccess().getBirminghamEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEntityDsl.g:1088:3: (enumLiteral_3= 'edinburgh' )
                    {
                    // InternalEntityDsl.g:1088:3: (enumLiteral_3= 'edinburgh' )
                    // InternalEntityDsl.g:1089:4: enumLiteral_3= 'edinburgh'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getRegionAccess().getEdinburghEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRegionAccess().getEdinburghEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleRegion"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002240118010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000180008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});

}