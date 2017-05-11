package org.xtext.example.ide.contentassist.antlr.internal;

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
import org.xtext.example.services.EntityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'typedef'", "'mapsto'", "'.'", "'entity'", "'{'", "'}'", "'extends'", "'*'"
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

    	public void setGrammarAccess(EntityGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalEntity.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalEntity.g:54:1: ( ruleModel EOF )
            // InternalEntity.g:55:1: ruleModel EOF
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
    // InternalEntity.g:62:1: ruleModel : ( ( rule__Model__TypesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:66:2: ( ( ( rule__Model__TypesAssignment )* ) )
            // InternalEntity.g:67:2: ( ( rule__Model__TypesAssignment )* )
            {
            // InternalEntity.g:67:2: ( ( rule__Model__TypesAssignment )* )
            // InternalEntity.g:68:3: ( rule__Model__TypesAssignment )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment()); 
            // InternalEntity.g:69:3: ( rule__Model__TypesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEntity.g:69:4: rule__Model__TypesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__TypesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTypesAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleType"
    // InternalEntity.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalEntity.g:79:1: ( ruleType EOF )
            // InternalEntity.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalEntity.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalEntity.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalEntity.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalEntity.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalEntity.g:94:3: ( rule__Type__Alternatives )
            // InternalEntity.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeDef"
    // InternalEntity.g:103:1: entryRuleTypeDef : ruleTypeDef EOF ;
    public final void entryRuleTypeDef() throws RecognitionException {
        try {
            // InternalEntity.g:104:1: ( ruleTypeDef EOF )
            // InternalEntity.g:105:1: ruleTypeDef EOF
            {
             before(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeDef();

            state._fsp--;

             after(grammarAccess.getTypeDefRule()); 
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
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalEntity.g:112:1: ruleTypeDef : ( ( rule__TypeDef__Group__0 ) ) ;
    public final void ruleTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:116:2: ( ( ( rule__TypeDef__Group__0 ) ) )
            // InternalEntity.g:117:2: ( ( rule__TypeDef__Group__0 ) )
            {
            // InternalEntity.g:117:2: ( ( rule__TypeDef__Group__0 ) )
            // InternalEntity.g:118:3: ( rule__TypeDef__Group__0 )
            {
             before(grammarAccess.getTypeDefAccess().getGroup()); 
            // InternalEntity.g:119:3: ( rule__TypeDef__Group__0 )
            // InternalEntity.g:119:4: rule__TypeDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleJAVAID"
    // InternalEntity.g:128:1: entryRuleJAVAID : ruleJAVAID EOF ;
    public final void entryRuleJAVAID() throws RecognitionException {
        try {
            // InternalEntity.g:129:1: ( ruleJAVAID EOF )
            // InternalEntity.g:130:1: ruleJAVAID EOF
            {
             before(grammarAccess.getJAVAIDRule()); 
            pushFollow(FOLLOW_1);
            ruleJAVAID();

            state._fsp--;

             after(grammarAccess.getJAVAIDRule()); 
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
    // $ANTLR end "entryRuleJAVAID"


    // $ANTLR start "ruleJAVAID"
    // InternalEntity.g:137:1: ruleJAVAID : ( ( rule__JAVAID__Group__0 ) ) ;
    public final void ruleJAVAID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:141:2: ( ( ( rule__JAVAID__Group__0 ) ) )
            // InternalEntity.g:142:2: ( ( rule__JAVAID__Group__0 ) )
            {
            // InternalEntity.g:142:2: ( ( rule__JAVAID__Group__0 ) )
            // InternalEntity.g:143:3: ( rule__JAVAID__Group__0 )
            {
             before(grammarAccess.getJAVAIDAccess().getGroup()); 
            // InternalEntity.g:144:3: ( rule__JAVAID__Group__0 )
            // InternalEntity.g:144:4: rule__JAVAID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JAVAID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJAVAIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJAVAID"


    // $ANTLR start "entryRuleEntity"
    // InternalEntity.g:153:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalEntity.g:154:1: ( ruleEntity EOF )
            // InternalEntity.g:155:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalEntity.g:162:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:166:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalEntity.g:167:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalEntity.g:167:2: ( ( rule__Entity__Group__0 ) )
            // InternalEntity.g:168:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalEntity.g:169:3: ( rule__Entity__Group__0 )
            // InternalEntity.g:169:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalEntity.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalEntity.g:179:1: ( ruleAttribute EOF )
            // InternalEntity.g:180:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalEntity.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalEntity.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalEntity.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalEntity.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalEntity.g:194:3: ( rule__Attribute__Group__0 )
            // InternalEntity.g:194:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalEntity.g:202:1: rule__Type__Alternatives : ( ( ruleTypeDef ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:206:1: ( ( ruleTypeDef ) | ( ruleEntity ) )
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
                    // InternalEntity.g:207:2: ( ruleTypeDef )
                    {
                    // InternalEntity.g:207:2: ( ruleTypeDef )
                    // InternalEntity.g:208:3: ruleTypeDef
                    {
                     before(grammarAccess.getTypeAccess().getTypeDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeDef();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTypeDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntity.g:213:2: ( ruleEntity )
                    {
                    // InternalEntity.g:213:2: ( ruleEntity )
                    // InternalEntity.g:214:3: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__TypeDef__Group__0"
    // InternalEntity.g:223:1: rule__TypeDef__Group__0 : rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 ;
    public final void rule__TypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:227:1: ( rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 )
            // InternalEntity.g:228:2: rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TypeDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__0"


    // $ANTLR start "rule__TypeDef__Group__0__Impl"
    // InternalEntity.g:235:1: rule__TypeDef__Group__0__Impl : ( 'typedef' ) ;
    public final void rule__TypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:239:1: ( ( 'typedef' ) )
            // InternalEntity.g:240:1: ( 'typedef' )
            {
            // InternalEntity.g:240:1: ( 'typedef' )
            // InternalEntity.g:241:2: 'typedef'
            {
             before(grammarAccess.getTypeDefAccess().getTypedefKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTypeDefAccess().getTypedefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__0__Impl"


    // $ANTLR start "rule__TypeDef__Group__1"
    // InternalEntity.g:250:1: rule__TypeDef__Group__1 : rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2 ;
    public final void rule__TypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:254:1: ( rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2 )
            // InternalEntity.g:255:2: rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TypeDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__1"


    // $ANTLR start "rule__TypeDef__Group__1__Impl"
    // InternalEntity.g:262:1: rule__TypeDef__Group__1__Impl : ( ( rule__TypeDef__NameAssignment_1 ) ) ;
    public final void rule__TypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:266:1: ( ( ( rule__TypeDef__NameAssignment_1 ) ) )
            // InternalEntity.g:267:1: ( ( rule__TypeDef__NameAssignment_1 ) )
            {
            // InternalEntity.g:267:1: ( ( rule__TypeDef__NameAssignment_1 ) )
            // InternalEntity.g:268:2: ( rule__TypeDef__NameAssignment_1 )
            {
             before(grammarAccess.getTypeDefAccess().getNameAssignment_1()); 
            // InternalEntity.g:269:2: ( rule__TypeDef__NameAssignment_1 )
            // InternalEntity.g:269:3: rule__TypeDef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__1__Impl"


    // $ANTLR start "rule__TypeDef__Group__2"
    // InternalEntity.g:277:1: rule__TypeDef__Group__2 : rule__TypeDef__Group__2__Impl ;
    public final void rule__TypeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:281:1: ( rule__TypeDef__Group__2__Impl )
            // InternalEntity.g:282:2: rule__TypeDef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__2"


    // $ANTLR start "rule__TypeDef__Group__2__Impl"
    // InternalEntity.g:288:1: rule__TypeDef__Group__2__Impl : ( ( rule__TypeDef__Group_2__0 )? ) ;
    public final void rule__TypeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:292:1: ( ( ( rule__TypeDef__Group_2__0 )? ) )
            // InternalEntity.g:293:1: ( ( rule__TypeDef__Group_2__0 )? )
            {
            // InternalEntity.g:293:1: ( ( rule__TypeDef__Group_2__0 )? )
            // InternalEntity.g:294:2: ( rule__TypeDef__Group_2__0 )?
            {
             before(grammarAccess.getTypeDefAccess().getGroup_2()); 
            // InternalEntity.g:295:2: ( rule__TypeDef__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEntity.g:295:3: rule__TypeDef__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeDef__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeDefAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__2__Impl"


    // $ANTLR start "rule__TypeDef__Group_2__0"
    // InternalEntity.g:304:1: rule__TypeDef__Group_2__0 : rule__TypeDef__Group_2__0__Impl rule__TypeDef__Group_2__1 ;
    public final void rule__TypeDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:308:1: ( rule__TypeDef__Group_2__0__Impl rule__TypeDef__Group_2__1 )
            // InternalEntity.g:309:2: rule__TypeDef__Group_2__0__Impl rule__TypeDef__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__TypeDef__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2__0"


    // $ANTLR start "rule__TypeDef__Group_2__0__Impl"
    // InternalEntity.g:316:1: rule__TypeDef__Group_2__0__Impl : ( 'mapsto' ) ;
    public final void rule__TypeDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:320:1: ( ( 'mapsto' ) )
            // InternalEntity.g:321:1: ( 'mapsto' )
            {
            // InternalEntity.g:321:1: ( 'mapsto' )
            // InternalEntity.g:322:2: 'mapsto'
            {
             before(grammarAccess.getTypeDefAccess().getMapstoKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTypeDefAccess().getMapstoKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2__0__Impl"


    // $ANTLR start "rule__TypeDef__Group_2__1"
    // InternalEntity.g:331:1: rule__TypeDef__Group_2__1 : rule__TypeDef__Group_2__1__Impl ;
    public final void rule__TypeDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:335:1: ( rule__TypeDef__Group_2__1__Impl )
            // InternalEntity.g:336:2: rule__TypeDef__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2__1"


    // $ANTLR start "rule__TypeDef__Group_2__1__Impl"
    // InternalEntity.g:342:1: rule__TypeDef__Group_2__1__Impl : ( ( rule__TypeDef__MappedTypeAssignment_2_1 ) ) ;
    public final void rule__TypeDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:346:1: ( ( ( rule__TypeDef__MappedTypeAssignment_2_1 ) ) )
            // InternalEntity.g:347:1: ( ( rule__TypeDef__MappedTypeAssignment_2_1 ) )
            {
            // InternalEntity.g:347:1: ( ( rule__TypeDef__MappedTypeAssignment_2_1 ) )
            // InternalEntity.g:348:2: ( rule__TypeDef__MappedTypeAssignment_2_1 )
            {
             before(grammarAccess.getTypeDefAccess().getMappedTypeAssignment_2_1()); 
            // InternalEntity.g:349:2: ( rule__TypeDef__MappedTypeAssignment_2_1 )
            // InternalEntity.g:349:3: rule__TypeDef__MappedTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__MappedTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getMappedTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2__1__Impl"


    // $ANTLR start "rule__JAVAID__Group__0"
    // InternalEntity.g:358:1: rule__JAVAID__Group__0 : rule__JAVAID__Group__0__Impl rule__JAVAID__Group__1 ;
    public final void rule__JAVAID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:362:1: ( rule__JAVAID__Group__0__Impl rule__JAVAID__Group__1 )
            // InternalEntity.g:363:2: rule__JAVAID__Group__0__Impl rule__JAVAID__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__JAVAID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JAVAID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JAVAID__Group__0"


    // $ANTLR start "rule__JAVAID__Group__0__Impl"
    // InternalEntity.g:370:1: rule__JAVAID__Group__0__Impl : ( ( rule__JAVAID__NameAssignment_0 ) ) ;
    public final void rule__JAVAID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:374:1: ( ( ( rule__JAVAID__NameAssignment_0 ) ) )
            // InternalEntity.g:375:1: ( ( rule__JAVAID__NameAssignment_0 ) )
            {
            // InternalEntity.g:375:1: ( ( rule__JAVAID__NameAssignment_0 ) )
            // InternalEntity.g:376:2: ( rule__JAVAID__NameAssignment_0 )
            {
             before(grammarAccess.getJAVAIDAccess().getNameAssignment_0()); 
            // InternalEntity.g:377:2: ( rule__JAVAID__NameAssignment_0 )
            // InternalEntity.g:377:3: rule__JAVAID__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__JAVAID__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJAVAIDAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JAVAID__Group__0__Impl"


    // $ANTLR start "rule__JAVAID__Group__1"
    // InternalEntity.g:385:1: rule__JAVAID__Group__1 : rule__JAVAID__Group__1__Impl ;
    public final void rule__JAVAID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:389:1: ( rule__JAVAID__Group__1__Impl )
            // InternalEntity.g:390:2: rule__JAVAID__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JAVAID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JAVAID__Group__1"


    // $ANTLR start "rule__JAVAID__Group__1__Impl"
    // InternalEntity.g:396:1: rule__JAVAID__Group__1__Impl : ( ( rule__JAVAID__Group_1__0 )* ) ;
    public final void rule__JAVAID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:400:1: ( ( ( rule__JAVAID__Group_1__0 )* ) )
            // InternalEntity.g:401:1: ( ( rule__JAVAID__Group_1__0 )* )
            {
            // InternalEntity.g:401:1: ( ( rule__JAVAID__Group_1__0 )* )
            // InternalEntity.g:402:2: ( rule__JAVAID__Group_1__0 )*
            {
             before(grammarAccess.getJAVAIDAccess().getGroup_1()); 
            // InternalEntity.g:403:2: ( rule__JAVAID__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEntity.g:403:3: rule__JAVAID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__JAVAID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getJAVAIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JAVAID__Group__1__Impl"


    // $ANTLR start "rule__JAVAID__Group_1__0"
    // InternalEntity.g:412:1: rule__JAVAID__Group_1__0 : rule__JAVAID__Group_1__0__Impl rule__JAVAID__Group_1__1 ;
    public final void rule__JAVAID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:416:1: ( rule__JAVAID__Group_1__0__Impl rule__JAVAID__Group_1__1 )
            // InternalEntity.g:417:2: rule__JAVAID__Group_1__0__Impl rule__JAVAID__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__JAVAID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JAVAID__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JAVAID__Group_1__0"


    // $ANTLR start "rule__JAVAID__Group_1__0__Impl"
    // InternalEntity.g:424:1: rule__JAVAID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__JAVAID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:428:1: ( ( '.' ) )
            // InternalEntity.g:429:1: ( '.' )
            {
            // InternalEntity.g:429:1: ( '.' )
            // InternalEntity.g:430:2: '.'
            {
             before(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JAVAID__Group_1__0__Impl"


    // $ANTLR start "rule__JAVAID__Group_1__1"
    // InternalEntity.g:439:1: rule__JAVAID__Group_1__1 : rule__JAVAID__Group_1__1__Impl ;
    public final void rule__JAVAID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:443:1: ( rule__JAVAID__Group_1__1__Impl )
            // InternalEntity.g:444:2: rule__JAVAID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JAVAID__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JAVAID__Group_1__1"


    // $ANTLR start "rule__JAVAID__Group_1__1__Impl"
    // InternalEntity.g:450:1: rule__JAVAID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__JAVAID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:454:1: ( ( RULE_ID ) )
            // InternalEntity.g:455:1: ( RULE_ID )
            {
            // InternalEntity.g:455:1: ( RULE_ID )
            // InternalEntity.g:456:2: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JAVAID__Group_1__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalEntity.g:466:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:470:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalEntity.g:471:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalEntity.g:478:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:482:1: ( ( 'entity' ) )
            // InternalEntity.g:483:1: ( 'entity' )
            {
            // InternalEntity.g:483:1: ( 'entity' )
            // InternalEntity.g:484:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalEntity.g:493:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:497:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalEntity.g:498:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalEntity.g:505:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:509:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalEntity.g:510:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalEntity.g:510:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalEntity.g:511:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalEntity.g:512:2: ( rule__Entity__NameAssignment_1 )
            // InternalEntity.g:512:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalEntity.g:520:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:524:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalEntity.g:525:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalEntity.g:532:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:536:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalEntity.g:537:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalEntity.g:537:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalEntity.g:538:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalEntity.g:539:2: ( rule__Entity__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEntity.g:539:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalEntity.g:547:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:551:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalEntity.g:552:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalEntity.g:559:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:563:1: ( ( '{' ) )
            // InternalEntity.g:564:1: ( '{' )
            {
            // InternalEntity.g:564:1: ( '{' )
            // InternalEntity.g:565:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalEntity.g:574:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:578:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalEntity.g:579:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalEntity.g:586:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__AttributesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:590:1: ( ( ( rule__Entity__AttributesAssignment_4 )* ) )
            // InternalEntity.g:591:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            {
            // InternalEntity.g:591:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            // InternalEntity.g:592:2: ( rule__Entity__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // InternalEntity.g:593:2: ( rule__Entity__AttributesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEntity.g:593:3: rule__Entity__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalEntity.g:601:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:605:1: ( rule__Entity__Group__5__Impl )
            // InternalEntity.g:606:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalEntity.g:612:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:616:1: ( ( '}' ) )
            // InternalEntity.g:617:1: ( '}' )
            {
            // InternalEntity.g:617:1: ( '}' )
            // InternalEntity.g:618:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalEntity.g:628:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:632:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalEntity.g:633:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalEntity.g:640:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:644:1: ( ( 'extends' ) )
            // InternalEntity.g:645:1: ( 'extends' )
            {
            // InternalEntity.g:645:1: ( 'extends' )
            // InternalEntity.g:646:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalEntity.g:655:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:659:1: ( rule__Entity__Group_2__1__Impl )
            // InternalEntity.g:660:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalEntity.g:666:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperEntityAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:670:1: ( ( ( rule__Entity__SuperEntityAssignment_2_1 ) ) )
            // InternalEntity.g:671:1: ( ( rule__Entity__SuperEntityAssignment_2_1 ) )
            {
            // InternalEntity.g:671:1: ( ( rule__Entity__SuperEntityAssignment_2_1 ) )
            // InternalEntity.g:672:2: ( rule__Entity__SuperEntityAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_2_1()); 
            // InternalEntity.g:673:2: ( rule__Entity__SuperEntityAssignment_2_1 )
            // InternalEntity.g:673:3: rule__Entity__SuperEntityAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperEntityAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperEntityAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalEntity.g:682:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:686:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalEntity.g:687:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalEntity.g:694:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:698:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // InternalEntity.g:699:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // InternalEntity.g:699:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // InternalEntity.g:700:2: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // InternalEntity.g:701:2: ( rule__Attribute__TypeAssignment_0 )
            // InternalEntity.g:701:3: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalEntity.g:709:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:713:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalEntity.g:714:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalEntity.g:721:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__ManyAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:725:1: ( ( ( rule__Attribute__ManyAssignment_1 )? ) )
            // InternalEntity.g:726:1: ( ( rule__Attribute__ManyAssignment_1 )? )
            {
            // InternalEntity.g:726:1: ( ( rule__Attribute__ManyAssignment_1 )? )
            // InternalEntity.g:727:2: ( rule__Attribute__ManyAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getManyAssignment_1()); 
            // InternalEntity.g:728:2: ( rule__Attribute__ManyAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntity.g:728:3: rule__Attribute__ManyAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__ManyAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getManyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalEntity.g:736:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:740:1: ( rule__Attribute__Group__2__Impl )
            // InternalEntity.g:741:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalEntity.g:747:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:751:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // InternalEntity.g:752:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // InternalEntity.g:752:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // InternalEntity.g:753:2: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // InternalEntity.g:754:2: ( rule__Attribute__NameAssignment_2 )
            // InternalEntity.g:754:3: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Model__TypesAssignment"
    // InternalEntity.g:763:1: rule__Model__TypesAssignment : ( ruleType ) ;
    public final void rule__Model__TypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:767:1: ( ( ruleType ) )
            // InternalEntity.g:768:2: ( ruleType )
            {
            // InternalEntity.g:768:2: ( ruleType )
            // InternalEntity.g:769:3: ruleType
            {
             before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TypesAssignment"


    // $ANTLR start "rule__TypeDef__NameAssignment_1"
    // InternalEntity.g:778:1: rule__TypeDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:782:1: ( ( RULE_ID ) )
            // InternalEntity.g:783:2: ( RULE_ID )
            {
            // InternalEntity.g:783:2: ( RULE_ID )
            // InternalEntity.g:784:3: RULE_ID
            {
             before(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__NameAssignment_1"


    // $ANTLR start "rule__TypeDef__MappedTypeAssignment_2_1"
    // InternalEntity.g:793:1: rule__TypeDef__MappedTypeAssignment_2_1 : ( ruleJAVAID ) ;
    public final void rule__TypeDef__MappedTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:797:1: ( ( ruleJAVAID ) )
            // InternalEntity.g:798:2: ( ruleJAVAID )
            {
            // InternalEntity.g:798:2: ( ruleJAVAID )
            // InternalEntity.g:799:3: ruleJAVAID
            {
             before(grammarAccess.getTypeDefAccess().getMappedTypeJAVAIDParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJAVAID();

            state._fsp--;

             after(grammarAccess.getTypeDefAccess().getMappedTypeJAVAIDParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__MappedTypeAssignment_2_1"


    // $ANTLR start "rule__JAVAID__NameAssignment_0"
    // InternalEntity.g:808:1: rule__JAVAID__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__JAVAID__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:812:1: ( ( RULE_ID ) )
            // InternalEntity.g:813:2: ( RULE_ID )
            {
            // InternalEntity.g:813:2: ( RULE_ID )
            // InternalEntity.g:814:3: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJAVAIDAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JAVAID__NameAssignment_0"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalEntity.g:823:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:827:1: ( ( RULE_ID ) )
            // InternalEntity.g:828:2: ( RULE_ID )
            {
            // InternalEntity.g:828:2: ( RULE_ID )
            // InternalEntity.g:829:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperEntityAssignment_2_1"
    // InternalEntity.g:838:1: rule__Entity__SuperEntityAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperEntityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:842:1: ( ( ( RULE_ID ) ) )
            // InternalEntity.g:843:2: ( ( RULE_ID ) )
            {
            // InternalEntity.g:843:2: ( ( RULE_ID ) )
            // InternalEntity.g:844:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_2_1_0()); 
            // InternalEntity.g:845:3: ( RULE_ID )
            // InternalEntity.g:846:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperEntityAssignment_2_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_4"
    // InternalEntity.g:857:1: rule__Entity__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:861:1: ( ( ruleAttribute ) )
            // InternalEntity.g:862:2: ( ruleAttribute )
            {
            // InternalEntity.g:862:2: ( ruleAttribute )
            // InternalEntity.g:863:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__TypeAssignment_0"
    // InternalEntity.g:872:1: rule__Attribute__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:876:1: ( ( ( RULE_ID ) ) )
            // InternalEntity.g:877:2: ( ( RULE_ID ) )
            {
            // InternalEntity.g:877:2: ( ( RULE_ID ) )
            // InternalEntity.g:878:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 
            // InternalEntity.g:879:3: ( RULE_ID )
            // InternalEntity.g:880:4: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_0"


    // $ANTLR start "rule__Attribute__ManyAssignment_1"
    // InternalEntity.g:891:1: rule__Attribute__ManyAssignment_1 : ( ( '*' ) ) ;
    public final void rule__Attribute__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:895:1: ( ( ( '*' ) ) )
            // InternalEntity.g:896:2: ( ( '*' ) )
            {
            // InternalEntity.g:896:2: ( ( '*' ) )
            // InternalEntity.g:897:3: ( '*' )
            {
             before(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0()); 
            // InternalEntity.g:898:3: ( '*' )
            // InternalEntity.g:899:4: '*'
            {
             before(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ManyAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // InternalEntity.g:910:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntity.g:914:1: ( ( RULE_ID ) )
            // InternalEntity.g:915:2: ( RULE_ID )
            {
            // InternalEntity.g:915:2: ( RULE_ID )
            // InternalEntity.g:916:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040010L});

}