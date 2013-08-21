// Generated from cpmvc.g4 by ANTLR 4.0
package biz.cactussoft.cpmvc;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cpmvcParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DATAMODEL=1, CONTROLLER=2, INTERFACE=3, BEGIN=4, END=5, NAMETYPESEPARATOR=6, 
		LINEEND=7, INT=8, FLOAT=9, STRING=10, VECTOR=11, OF=12, LIST=13, MAP=14, 
		WITH=15, PARAMBEGIN=16, PARAMEND=17, COMMA=18, ID=19, WS=20, COMMENT=21;
	public static final String[] tokenNames = {
		"<INVALID>", "'datamodel'", "'controller'", "'interface'", "'{'", "'}'", 
		"':'", "';'", "'int'", "'float'", "'string'", "'vector'", "'of'", "'list'", 
		"'map'", "'with'", "'('", "')'", "','", "ID", "WS", "COMMENT"
	};
	public static final int
		RULE_mvc = 0, RULE_nameTypeDecl = 1, RULE_modelDecl = 2, RULE_modelAttributeDecl = 3, 
		RULE_typeDecl = 4, RULE_simpleDataType = 5, RULE_simpleObject = 6, RULE_arrayObject = 7, 
		RULE_mapObject = 8, RULE_controllerDecl = 9, RULE_methodDecl = 10, RULE_methodParamDecl = 11, 
		RULE_interfaceDecl = 12;
	public static final String[] ruleNames = {
		"mvc", "nameTypeDecl", "modelDecl", "modelAttributeDecl", "typeDecl", 
		"simpleDataType", "simpleObject", "arrayObject", "mapObject", "controllerDecl", 
		"methodDecl", "methodParamDecl", "interfaceDecl"
	};

	@Override
	public String getGrammarFileName() { return "cpmvc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public cpmvcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MvcContext extends ParserRuleContext {
		public ModelDeclContext modelDecl(int i) {
			return getRuleContext(ModelDeclContext.class,i);
		}
		public List<ControllerDeclContext> controllerDecl() {
			return getRuleContexts(ControllerDeclContext.class);
		}
		public InterfaceDeclContext interfaceDecl(int i) {
			return getRuleContext(InterfaceDeclContext.class,i);
		}
		public List<InterfaceDeclContext> interfaceDecl() {
			return getRuleContexts(InterfaceDeclContext.class);
		}
		public ControllerDeclContext controllerDecl(int i) {
			return getRuleContext(ControllerDeclContext.class,i);
		}
		public List<ModelDeclContext> modelDecl() {
			return getRuleContexts(ModelDeclContext.class);
		}
		public MvcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mvc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).enterMvc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).exitMvc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpmvcVisitor ) return ((cpmvcVisitor<? extends T>)visitor).visitMvc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MvcContext mvc() throws RecognitionException {
		MvcContext _localctx = new MvcContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mvc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATAMODEL) | (1L << CONTROLLER) | (1L << INTERFACE))) != 0)) {
				{
				setState(29);
				switch (_input.LA(1)) {
				case DATAMODEL:
					{
					setState(26); modelDecl();
					}
					break;
				case CONTROLLER:
					{
					setState(27); controllerDecl();
					}
					break;
				case INTERFACE:
					{
					setState(28); interfaceDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameTypeDeclContext extends ParserRuleContext {
		public Token name;
		public TypeDeclContext type;
		public TerminalNode NAMETYPESEPARATOR() { return getToken(cpmvcParser.NAMETYPESEPARATOR, 0); }
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public TerminalNode ID() { return getToken(cpmvcParser.ID, 0); }
		public NameTypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameTypeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).enterNameTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).exitNameTypeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpmvcVisitor ) return ((cpmvcVisitor<? extends T>)visitor).visitNameTypeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameTypeDeclContext nameTypeDecl() throws RecognitionException {
		NameTypeDeclContext _localctx = new NameTypeDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nameTypeDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(34); ((NameTypeDeclContext)_localctx).name = match(ID);
			setState(35); match(NAMETYPESEPARATOR);
			setState(36); ((NameTypeDeclContext)_localctx).type = typeDecl();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelDeclContext extends ParserRuleContext {
		public Token name;
		public ModelAttributeDeclContext modelAttributeDecl(int i) {
			return getRuleContext(ModelAttributeDeclContext.class,i);
		}
		public TerminalNode ID() { return getToken(cpmvcParser.ID, 0); }
		public TerminalNode END() { return getToken(cpmvcParser.END, 0); }
		public List<ModelAttributeDeclContext> modelAttributeDecl() {
			return getRuleContexts(ModelAttributeDeclContext.class);
		}
		public TerminalNode DATAMODEL() { return getToken(cpmvcParser.DATAMODEL, 0); }
		public TerminalNode BEGIN() { return getToken(cpmvcParser.BEGIN, 0); }
		public ModelDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).enterModelDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).exitModelDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpmvcVisitor ) return ((cpmvcVisitor<? extends T>)visitor).visitModelDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelDeclContext modelDecl() throws RecognitionException {
		ModelDeclContext _localctx = new ModelDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modelDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(DATAMODEL);
			setState(39); ((ModelDeclContext)_localctx).name = match(ID);
			setState(40); match(BEGIN);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(41); modelAttributeDecl();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelAttributeDeclContext extends ParserRuleContext {
		public NameTypeDeclContext nameTypeDecl() {
			return getRuleContext(NameTypeDeclContext.class,0);
		}
		public TerminalNode LINEEND() { return getToken(cpmvcParser.LINEEND, 0); }
		public ModelAttributeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelAttributeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).enterModelAttributeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).exitModelAttributeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpmvcVisitor ) return ((cpmvcVisitor<? extends T>)visitor).visitModelAttributeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelAttributeDeclContext modelAttributeDecl() throws RecognitionException {
		ModelAttributeDeclContext _localctx = new ModelAttributeDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_modelAttributeDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); nameTypeDecl();
			setState(50); match(LINEEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclContext extends ParserRuleContext {
		public MapObjectContext mapObject() {
			return getRuleContext(MapObjectContext.class,0);
		}
		public SimpleDataTypeContext simpleDataType() {
			return getRuleContext(SimpleDataTypeContext.class,0);
		}
		public ArrayObjectContext arrayObject() {
			return getRuleContext(ArrayObjectContext.class,0);
		}
		public SimpleObjectContext simpleObject() {
			return getRuleContext(SimpleObjectContext.class,0);
		}
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).enterTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).exitTypeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpmvcVisitor ) return ((cpmvcVisitor<? extends T>)visitor).visitTypeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
				{
				setState(52); simpleDataType();
				}
				break;
			case ID:
				{
				setState(53); simpleObject();
				}
				break;
			case VECTOR:
			case LIST:
				{
				setState(54); arrayObject();
				}
				break;
			case MAP:
				{
				setState(55); mapObject();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleDataTypeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(cpmvcParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(cpmvcParser.INT, 0); }
		public TerminalNode STRING() { return getToken(cpmvcParser.STRING, 0); }
		public SimpleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).enterSimpleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).exitSimpleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpmvcVisitor ) return ((cpmvcVisitor<? extends T>)visitor).visitSimpleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDataTypeContext simpleDataType() throws RecognitionException {
		SimpleDataTypeContext _localctx = new SimpleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simpleDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleObjectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(cpmvcParser.ID, 0); }
		public SimpleObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).enterSimpleObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).exitSimpleObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpmvcVisitor ) return ((cpmvcVisitor<? extends T>)visitor).visitSimpleObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleObjectContext simpleObject() throws RecognitionException {
		SimpleObjectContext _localctx = new SimpleObjectContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simpleObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayObjectContext extends ParserRuleContext {
		public Token name;
		public TypeDeclContext type;
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public TerminalNode VECTOR() { return getToken(cpmvcParser.VECTOR, 0); }
		public TerminalNode LIST() { return getToken(cpmvcParser.LIST, 0); }
		public TerminalNode OF() { return getToken(cpmvcParser.OF, 0); }
		public ArrayObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).enterArrayObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).exitArrayObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpmvcVisitor ) return ((cpmvcVisitor<? extends T>)visitor).visitArrayObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayObjectContext arrayObject() throws RecognitionException {
		ArrayObjectContext _localctx = new ArrayObjectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			((ArrayObjectContext)_localctx).name = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==VECTOR || _la==LIST) ) {
				((ArrayObjectContext)_localctx).name = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(63); match(OF);
			setState(64); ((ArrayObjectContext)_localctx).type = typeDecl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapObjectContext extends ParserRuleContext {
		public List<SimpleDataTypeContext> simpleDataType() {
			return getRuleContexts(SimpleDataTypeContext.class);
		}
		public List<SimpleObjectContext> simpleObject() {
			return getRuleContexts(SimpleObjectContext.class);
		}
		public SimpleDataTypeContext simpleDataType(int i) {
			return getRuleContext(SimpleDataTypeContext.class,i);
		}
		public TerminalNode OF() { return getToken(cpmvcParser.OF, 0); }
		public SimpleObjectContext simpleObject(int i) {
			return getRuleContext(SimpleObjectContext.class,i);
		}
		public TerminalNode WITH() { return getToken(cpmvcParser.WITH, 0); }
		public TerminalNode MAP() { return getToken(cpmvcParser.MAP, 0); }
		public MapObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).enterMapObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).exitMapObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpmvcVisitor ) return ((cpmvcVisitor<? extends T>)visitor).visitMapObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapObjectContext mapObject() throws RecognitionException {
		MapObjectContext _localctx = new MapObjectContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mapObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(MAP);
			setState(67); match(OF);
			setState(70);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
				{
				setState(68); simpleDataType();
				}
				break;
			case ID:
				{
				setState(69); simpleObject();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(72); match(WITH);
			setState(75);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
				{
				setState(73); simpleDataType();
				}
				break;
			case ID:
				{
				setState(74); simpleObject();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControllerDeclContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(cpmvcParser.ID, 0); }
		public TerminalNode END() { return getToken(cpmvcParser.END, 0); }
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public TerminalNode BEGIN() { return getToken(cpmvcParser.BEGIN, 0); }
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public TerminalNode CONTROLLER() { return getToken(cpmvcParser.CONTROLLER, 0); }
		public ControllerDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controllerDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).enterControllerDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).exitControllerDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpmvcVisitor ) return ((cpmvcVisitor<? extends T>)visitor).visitControllerDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControllerDeclContext controllerDecl() throws RecognitionException {
		ControllerDeclContext _localctx = new ControllerDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_controllerDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(CONTROLLER);
			setState(78); ((ControllerDeclContext)_localctx).name = match(ID);
			setState(79); match(BEGIN);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(80); methodDecl();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclContext extends ParserRuleContext {
		public Token name;
		public MethodParamDeclContext params;
		public TypeDeclContext returnType;
		public TerminalNode NAMETYPESEPARATOR() { return getToken(cpmvcParser.NAMETYPESEPARATOR, 0); }
		public TerminalNode PARAMBEGIN() { return getToken(cpmvcParser.PARAMBEGIN, 0); }
		public TerminalNode PARAMEND() { return getToken(cpmvcParser.PARAMEND, 0); }
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public List<MethodParamDeclContext> methodParamDecl() {
			return getRuleContexts(MethodParamDeclContext.class);
		}
		public TerminalNode LINEEND() { return getToken(cpmvcParser.LINEEND, 0); }
		public TerminalNode ID() { return getToken(cpmvcParser.ID, 0); }
		public MethodParamDeclContext methodParamDecl(int i) {
			return getRuleContext(MethodParamDeclContext.class,i);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpmvcVisitor ) return ((cpmvcVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); ((MethodDeclContext)_localctx).name = match(ID);
			setState(89); match(PARAMBEGIN);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(90); ((MethodDeclContext)_localctx).params = methodParamDecl();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96); match(PARAMEND);
			setState(99);
			_la = _input.LA(1);
			if (_la==NAMETYPESEPARATOR) {
				{
				setState(97); match(NAMETYPESEPARATOR);
				setState(98); ((MethodDeclContext)_localctx).returnType = typeDecl();
				}
			}

			setState(101); match(LINEEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodParamDeclContext extends ParserRuleContext {
		public List<NameTypeDeclContext> nameTypeDecl() {
			return getRuleContexts(NameTypeDeclContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(cpmvcParser.COMMA, i);
		}
		public NameTypeDeclContext nameTypeDecl(int i) {
			return getRuleContext(NameTypeDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cpmvcParser.COMMA); }
		public MethodParamDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParamDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).enterMethodParamDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).exitMethodParamDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpmvcVisitor ) return ((cpmvcVisitor<? extends T>)visitor).visitMethodParamDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParamDeclContext methodParamDecl() throws RecognitionException {
		MethodParamDeclContext _localctx = new MethodParamDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodParamDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); nameTypeDecl();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(104); match(COMMA);
				setState(105); nameTypeDecl();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclContext extends ParserRuleContext {
		public Token name;
		public TerminalNode INTERFACE() { return getToken(cpmvcParser.INTERFACE, 0); }
		public TerminalNode ID() { return getToken(cpmvcParser.ID, 0); }
		public TerminalNode END() { return getToken(cpmvcParser.END, 0); }
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public TerminalNode BEGIN() { return getToken(cpmvcParser.BEGIN, 0); }
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public InterfaceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).enterInterfaceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmvcListener ) ((cpmvcListener)listener).exitInterfaceDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpmvcVisitor ) return ((cpmvcVisitor<? extends T>)visitor).visitInterfaceDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclContext interfaceDecl() throws RecognitionException {
		InterfaceDeclContext _localctx = new InterfaceDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(INTERFACE);
			setState(112); ((InterfaceDeclContext)_localctx).name = match(ID);
			setState(113); match(BEGIN);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(114); methodDecl();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3\27}\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f"+
		"\2\16\2#\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6;\n\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\5\nI\n\n\3\n\3\n\3\n\5\nN\n\n\3\13\3\13\3\13"+
		"\3\13\7\13T\n\13\f\13\16\13W\13\13\3\13\3\13\3\f\3\f\3\f\7\f^\n\f\f\f"+
		"\16\fa\13\f\3\f\3\f\3\f\5\ff\n\f\3\f\3\f\3\r\3\r\3\r\7\rm\n\r\f\r\16\r"+
		"p\13\r\3\16\3\16\3\16\3\16\7\16v\n\16\f\16\16\16y\13\16\3\16\3\16\3\16"+
		"\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3\n\f\4\r\r\17\17}\2!\3\2\2"+
		"\2\4$\3\2\2\2\6(\3\2\2\2\b\63\3\2\2\2\n:\3\2\2\2\f<\3\2\2\2\16>\3\2\2"+
		"\2\20@\3\2\2\2\22D\3\2\2\2\24O\3\2\2\2\26Z\3\2\2\2\30i\3\2\2\2\32q\3\2"+
		"\2\2\34 \5\6\4\2\35 \5\24\13\2\36 \5\32\16\2\37\34\3\2\2\2\37\35\3\2\2"+
		"\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#!\3\2\2"+
		"\2$%\7\25\2\2%&\7\b\2\2&\'\5\n\6\2\'\5\3\2\2\2()\7\3\2\2)*\7\25\2\2*."+
		"\7\6\2\2+-\5\b\5\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2"+
		"\2\60.\3\2\2\2\61\62\7\7\2\2\62\7\3\2\2\2\63\64\5\4\3\2\64\65\7\t\2\2"+
		"\65\t\3\2\2\2\66;\5\f\7\2\67;\5\16\b\28;\5\20\t\29;\5\22\n\2:\66\3\2\2"+
		"\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\13\3\2\2\2<=\t\2\2\2=\r\3\2\2\2>?"+
		"\7\25\2\2?\17\3\2\2\2@A\t\3\2\2AB\7\16\2\2BC\5\n\6\2C\21\3\2\2\2DE\7\20"+
		"\2\2EH\7\16\2\2FI\5\f\7\2GI\5\16\b\2HF\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JM\7"+
		"\21\2\2KN\5\f\7\2LN\5\16\b\2MK\3\2\2\2ML\3\2\2\2N\23\3\2\2\2OP\7\4\2\2"+
		"PQ\7\25\2\2QU\7\6\2\2RT\5\26\f\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2"+
		"\2VX\3\2\2\2WU\3\2\2\2XY\7\7\2\2Y\25\3\2\2\2Z[\7\25\2\2[_\7\22\2\2\\^"+
		"\5\30\r\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2"+
		"be\7\23\2\2cd\7\b\2\2df\5\n\6\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\t\2"+
		"\2h\27\3\2\2\2in\5\4\3\2jk\7\24\2\2km\5\4\3\2lj\3\2\2\2mp\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2o\31\3\2\2\2pn\3\2\2\2qr\7\5\2\2rs\7\25\2\2sw\7\6\2\2"+
		"tv\5\26\f\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2"+
		"\2z{\7\7\2\2{\33\3\2\2\2\r\37!.:HMU_enw";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}