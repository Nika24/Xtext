package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.EntityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'typedef'", "'mapsto'", "'.'", "'entity'", "'extends'", "'{'", "'}'", "'*'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalEntityParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntityParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntityParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEntity.g"; }



     	private EntityGrammarAccess grammarAccess;

        public InternalEntityParser(TokenStream input, EntityGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected EntityGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEntity.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEntity.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalEntity.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalEntity.g:71:1: ruleModel returns [EObject current=null] : ( (lv_types_0_0= ruleType ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_0 = null;



        	enterRule();

        try {
            // InternalEntity.g:77:2: ( ( (lv_types_0_0= ruleType ) )* )
            // InternalEntity.g:78:2: ( (lv_types_0_0= ruleType ) )*
            {
            // InternalEntity.g:78:2: ( (lv_types_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEntity.g:79:3: (lv_types_0_0= ruleType )
            	    {
            	    // InternalEntity.g:79:3: (lv_types_0_0= ruleType )
            	    // InternalEntity.g:80:4: lv_types_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_types_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"types",
            	    					lv_types_0_0,
            	    					"org.xtext.example.Entity.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleType"
    // InternalEntity.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalEntity.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalEntity.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalEntity.g:107:1: ruleType returns [EObject current=null] : (this_TypeDef_0= ruleTypeDef | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDef_0 = null;

        EObject this_Entity_1 = null;



        	enterRule();

        try {
            // InternalEntity.g:113:2: ( (this_TypeDef_0= ruleTypeDef | this_Entity_1= ruleEntity ) )
            // InternalEntity.g:114:2: (this_TypeDef_0= ruleTypeDef | this_Entity_1= ruleEntity )
            {
            // InternalEntity.g:114:2: (this_TypeDef_0= ruleTypeDef | this_Entity_1= ruleEntity )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEntity.g:115:3: this_TypeDef_0= ruleTypeDef
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getTypeDefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeDef_0=ruleTypeDef();

                    state._fsp--;


                    			current = this_TypeDef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEntity.g:124:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeDef"
    // InternalEntity.g:136:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalEntity.g:136:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalEntity.g:137:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
             newCompositeNode(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;

             current =iv_ruleTypeDef; 
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
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalEntity.g:143:1: ruleTypeDef returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'mapsto' ( (lv_mappedType_3_0= ruleJAVAID ) ) )? ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_mappedType_3_0 = null;



        	enterRule();

        try {
            // InternalEntity.g:149:2: ( (otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'mapsto' ( (lv_mappedType_3_0= ruleJAVAID ) ) )? ) )
            // InternalEntity.g:150:2: (otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'mapsto' ( (lv_mappedType_3_0= ruleJAVAID ) ) )? )
            {
            // InternalEntity.g:150:2: (otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'mapsto' ( (lv_mappedType_3_0= ruleJAVAID ) ) )? )
            // InternalEntity.g:151:3: otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'mapsto' ( (lv_mappedType_3_0= ruleJAVAID ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDefAccess().getTypedefKeyword_0());
            		
            // InternalEntity.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntity.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEntity.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalEntity.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEntity.g:173:3: (otherlv_2= 'mapsto' ( (lv_mappedType_3_0= ruleJAVAID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEntity.g:174:4: otherlv_2= 'mapsto' ( (lv_mappedType_3_0= ruleJAVAID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeDefAccess().getMapstoKeyword_2_0());
                    			
                    // InternalEntity.g:178:4: ( (lv_mappedType_3_0= ruleJAVAID ) )
                    // InternalEntity.g:179:5: (lv_mappedType_3_0= ruleJAVAID )
                    {
                    // InternalEntity.g:179:5: (lv_mappedType_3_0= ruleJAVAID )
                    // InternalEntity.g:180:6: lv_mappedType_3_0= ruleJAVAID
                    {

                    						newCompositeNode(grammarAccess.getTypeDefAccess().getMappedTypeJAVAIDParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_mappedType_3_0=ruleJAVAID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    						}
                    						set(
                    							current,
                    							"mappedType",
                    							lv_mappedType_3_0,
                    							"org.xtext.example.Entity.JAVAID");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleJAVAID"
    // InternalEntity.g:202:1: entryRuleJAVAID returns [EObject current=null] : iv_ruleJAVAID= ruleJAVAID EOF ;
    public final EObject entryRuleJAVAID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJAVAID = null;


        try {
            // InternalEntity.g:202:47: (iv_ruleJAVAID= ruleJAVAID EOF )
            // InternalEntity.g:203:2: iv_ruleJAVAID= ruleJAVAID EOF
            {
             newCompositeNode(grammarAccess.getJAVAIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJAVAID=ruleJAVAID();

            state._fsp--;

             current =iv_ruleJAVAID; 
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
    // $ANTLR end "entryRuleJAVAID"


    // $ANTLR start "ruleJAVAID"
    // InternalEntity.g:209:1: ruleJAVAID returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )* ) ;
    public final EObject ruleJAVAID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalEntity.g:215:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )* ) )
            // InternalEntity.g:216:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )* )
            {
            // InternalEntity.g:216:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )* )
            // InternalEntity.g:217:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )*
            {
            // InternalEntity.g:217:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEntity.g:218:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEntity.g:218:4: (lv_name_0_0= RULE_ID )
            // InternalEntity.g:219:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getJAVAIDAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJAVAIDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEntity.g:235:3: (otherlv_1= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEntity.g:236:4: otherlv_1= '.' this_ID_2= RULE_ID
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				newLeafNode(this_ID_2, grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleJAVAID"


    // $ANTLR start "entryRuleEntity"
    // InternalEntity.g:249:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalEntity.g:249:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalEntity.g:250:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalEntity.g:256:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalEntity.g:262:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // InternalEntity.g:263:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // InternalEntity.g:263:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // InternalEntity.g:264:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalEntity.g:268:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntity.g:269:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEntity.g:269:4: (lv_name_1_0= RULE_ID )
            // InternalEntity.g:270:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEntity.g:286:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEntity.g:287:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalEntity.g:291:4: ( (otherlv_3= RULE_ID ) )
                    // InternalEntity.g:292:5: (otherlv_3= RULE_ID )
                    {
                    // InternalEntity.g:292:5: (otherlv_3= RULE_ID )
                    // InternalEntity.g:293:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEntity.g:309:3: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEntity.g:310:4: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalEntity.g:310:4: (lv_attributes_5_0= ruleAttribute )
            	    // InternalEntity.g:311:5: lv_attributes_5_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_5_0,
            	    						"org.xtext.example.Entity.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalEntity.g:336:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalEntity.g:336:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalEntity.g:337:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalEntity.g:343:1: ruleAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_many_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalEntity.g:349:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalEntity.g:350:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalEntity.g:350:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalEntity.g:351:3: ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalEntity.g:351:3: ( (otherlv_0= RULE_ID ) )
            // InternalEntity.g:352:4: (otherlv_0= RULE_ID )
            {
            // InternalEntity.g:352:4: (otherlv_0= RULE_ID )
            // InternalEntity.g:353:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0());
            				

            }


            }

            // InternalEntity.g:364:3: ( (lv_many_1_0= '*' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntity.g:365:4: (lv_many_1_0= '*' )
                    {
                    // InternalEntity.g:365:4: (lv_many_1_0= '*' )
                    // InternalEntity.g:366:5: lv_many_1_0= '*'
                    {
                    lv_many_1_0=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(lv_many_1_0, grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "*");
                    				

                    }


                    }
                    break;

            }

            // InternalEntity.g:378:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEntity.g:379:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEntity.g:379:4: (lv_name_2_0= RULE_ID )
            // InternalEntity.g:380:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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
    // $ANTLR end "ruleAttribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040010L});

}