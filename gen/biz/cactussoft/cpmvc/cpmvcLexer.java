// Generated from cpmvc.g4 by ANTLR 4.0
package biz.cactussoft.cpmvc;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cpmvcLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DATAMODEL=1, CONTROLLER=2, INTERFACE=3, BEGIN=4, END=5, NAMETYPESEPARATOR=6, 
		LINEEND=7, INT=8, FLOAT=9, STRING=10, VECTOR=11, OF=12, LIST=13, MAP=14, 
		WITH=15, PARAMBEGIN=16, PARAMEND=17, COMMA=18, ID=19, WS=20, COMMENT=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'datamodel'", "'controller'", "'interface'", "'{'", "'}'", "':'", "';'", 
		"'int'", "'float'", "'string'", "'vector'", "'of'", "'list'", "'map'", 
		"'with'", "'('", "')'", "','", "ID", "WS", "COMMENT"
	};
	public static final String[] ruleNames = {
		"DATAMODEL", "CONTROLLER", "INTERFACE", "BEGIN", "END", "NAMETYPESEPARATOR", 
		"LINEEND", "INT", "FLOAT", "STRING", "VECTOR", "OF", "LIST", "MAP", "WITH", 
		"PARAMBEGIN", "PARAMEND", "COMMA", "ID", "WS", "COMMENT"
	};


	public cpmvcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cpmvc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 19: WS_action((RuleContext)_localctx, actionIndex); break;

		case 20: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\27\u00aa\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\7\24\u0086\n\24\f\24\16\24\u0089\13\24\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0093\n\26\f\26\16\26\u0096"+
		"\13\26\3\26\5\26\u0099\n\26\3\26\3\26\3\26\3\26\3\26\7\26\u00a0\n\26\f"+
		"\26\16\26\u00a3\13\26\3\26\3\26\5\26\u00a7\n\26\3\26\3\26\3\u00a1\27\3"+
		"\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r"+
		"\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\2+\27"+
		"\3\3\2\6\4C\\c|\5\62;C\\c|\5\13\f\17\17\"\"\4\f\f\17\17\u00ae\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\67\3\2\2\2\7B\3"+
		"\2\2\2\tL\3\2\2\2\13N\3\2\2\2\rP\3\2\2\2\17R\3\2\2\2\21T\3\2\2\2\23X\3"+
		"\2\2\2\25^\3\2\2\2\27e\3\2\2\2\31l\3\2\2\2\33o\3\2\2\2\35t\3\2\2\2\37"+
		"x\3\2\2\2!}\3\2\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0083\3\2\2\2)\u008a"+
		"\3\2\2\2+\u00a6\3\2\2\2-.\7f\2\2./\7c\2\2/\60\7v\2\2\60\61\7c\2\2\61\62"+
		"\7o\2\2\62\63\7q\2\2\63\64\7f\2\2\64\65\7g\2\2\65\66\7n\2\2\66\4\3\2\2"+
		"\2\678\7e\2\289\7q\2\29:\7p\2\2:;\7v\2\2;<\7t\2\2<=\7q\2\2=>\7n\2\2>?"+
		"\7n\2\2?@\7g\2\2@A\7t\2\2A\6\3\2\2\2BC\7k\2\2CD\7p\2\2DE\7v\2\2EF\7g\2"+
		"\2FG\7t\2\2GH\7h\2\2HI\7c\2\2IJ\7e\2\2JK\7g\2\2K\b\3\2\2\2LM\7}\2\2M\n"+
		"\3\2\2\2NO\7\177\2\2O\f\3\2\2\2PQ\7<\2\2Q\16\3\2\2\2RS\7=\2\2S\20\3\2"+
		"\2\2TU\7k\2\2UV\7p\2\2VW\7v\2\2W\22\3\2\2\2XY\7h\2\2YZ\7n\2\2Z[\7q\2\2"+
		"[\\\7c\2\2\\]\7v\2\2]\24\3\2\2\2^_\7u\2\2_`\7v\2\2`a\7t\2\2ab\7k\2\2b"+
		"c\7p\2\2cd\7i\2\2d\26\3\2\2\2ef\7x\2\2fg\7g\2\2gh\7e\2\2hi\7v\2\2ij\7"+
		"q\2\2jk\7t\2\2k\30\3\2\2\2lm\7q\2\2mn\7h\2\2n\32\3\2\2\2op\7n\2\2pq\7"+
		"k\2\2qr\7u\2\2rs\7v\2\2s\34\3\2\2\2tu\7o\2\2uv\7c\2\2vw\7r\2\2w\36\3\2"+
		"\2\2xy\7y\2\2yz\7k\2\2z{\7v\2\2{|\7j\2\2| \3\2\2\2}~\7*\2\2~\"\3\2\2\2"+
		"\177\u0080\7+\2\2\u0080$\3\2\2\2\u0081\u0082\7.\2\2\u0082&\3\2\2\2\u0083"+
		"\u0087\t\2\2\2\u0084\u0086\t\3\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088(\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008b\t\4\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\25\2\2"+
		"\u008d*\3\2\2\2\u008e\u008f\7\61\2\2\u008f\u0090\7\61\2\2\u0090\u0094"+
		"\3\2\2\2\u0091\u0093\n\5\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0099\7\17\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u00a7\7\f\2\2\u009b\u009c\7\61\2\2\u009c\u009d\7"+
		",\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0\13\2\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7,\2\2\u00a5\u00a7\7\61\2\2\u00a6"+
		"\u008e\3\2\2\2\u00a6\u009b\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\26"+
		"\3\2\u00a9,\3\2\2\2\b\2\u0087\u0094\u0098\u00a1\u00a6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}