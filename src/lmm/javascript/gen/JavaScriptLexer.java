// Generated from JavaScript.g4 by ANTLR 4.5
package lmm.javascript.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, FOR=2, IF=3, ELSE=4, FUNCTION=5, RETURN=6, BREAK=7, LBRACKET=8, 
		RBRACKET=9, LBRACE=10, RBRACE=11, COMMA=12, COLON=13, SEMICOLON=14, WS=15, 
		Comment=16, PLUS=17, MINUS=18, INCR=19, DECR=20, MORE_TH=21, LESS_TH=22, 
		EQ=23, MORE_OR_EQ=24, LESS_OR_EQ=25, NOT_EQ=26, MULT=27, MOD=28, NOT=29, 
		ASSIGN=30, ALERT=31, STRING=32, NUMBER=33, BOOLEAN=34, ID=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VAR", "FOR", "IF", "ELSE", "FUNCTION", "RETURN", "BREAK", "LBRACKET", 
		"RBRACKET", "LBRACE", "RBRACE", "COMMA", "COLON", "SEMICOLON", "WS", "Comment", 
		"PLUS", "MINUS", "INCR", "DECR", "MORE_TH", "LESS_TH", "EQ", "MORE_OR_EQ", 
		"LESS_OR_EQ", "NOT_EQ", "MULT", "MOD", "NOT", "ASSIGN", "ALERT", "STRING", 
		"NUMBER", "BOOLEAN", "ESCAPES", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'for'", "'if'", "'else'", "'function'", "'return'", "'break'", 
		"'('", "')'", "'{'", "'}'", "','", "':'", "';'", null, null, "'+'", "'-'", 
		"'++'", "'--'", "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'*'", "'%'", 
		"'!'", "'='", "'alert'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VAR", "FOR", "IF", "ELSE", "FUNCTION", "RETURN", "BREAK", "LBRACKET", 
		"RBRACKET", "LBRACE", "RBRACE", "COMMA", "COLON", "SEMICOLON", "WS", "Comment", 
		"PLUS", "MINUS", "INCR", "DECR", "MORE_TH", "LESS_TH", "EQ", "MORE_OR_EQ", 
		"LESS_OR_EQ", "NOT_EQ", "MULT", "MOD", "NOT", "ASSIGN", "ALERT", "STRING", 
		"NUMBER", "BOOLEAN", "ID"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public JavaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u0115\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\7\20\u0081\n\20\f\20\16\20\u0084"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u008c\n\21\f\21\16\21\u008f"+
		"\13\21\3\21\3\21\3\21\3\21\7\21\u0095\n\21\f\21\16\21\u0098\13\21\3\21"+
		"\3\21\5\21\u009c\n\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\7!\u00cb\n!\f!\16!\u00ce\13!\3!\3!\3!\3!\7!\u00d4\n"+
		"!\f!\16!\u00d7\13!\3!\5!\u00da\n!\3\"\6\"\u00dd\n\"\r\"\16\"\u00de\3\""+
		"\3\"\6\"\u00e3\n\"\r\"\16\"\u00e4\5\"\u00e7\n\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\5#\u00f2\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\5$\u010d\n$\3%\3%\7%\u0111\n%\f%\16%\u0114\13%"+
		"\3\u0096\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G\2I%\3\2\f\6\2\13\f\17\17\"\"))\4\2\f\f\17\17\3"+
		"\2$$\6\2\f\f\17\17$$^^\3\2))\6\2\f\f\17\17))^^\3\2\62;\5\2\62;CHch\5\2"+
		"C\\aac|\6\2\62;C\\aac|\u012a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5O\3\2\2\2\7S\3\2\2\2\tV\3\2"+
		"\2\2\13[\3\2\2\2\rd\3\2\2\2\17k\3\2\2\2\21q\3\2\2\2\23s\3\2\2\2\25u\3"+
		"\2\2\2\27w\3\2\2\2\31y\3\2\2\2\33{\3\2\2\2\35}\3\2\2\2\37\u0082\3\2\2"+
		"\2!\u009b\3\2\2\2#\u009f\3\2\2\2%\u00a1\3\2\2\2\'\u00a3\3\2\2\2)\u00a6"+
		"\3\2\2\2+\u00a9\3\2\2\2-\u00ab\3\2\2\2/\u00ad\3\2\2\2\61\u00b0\3\2\2\2"+
		"\63\u00b3\3\2\2\2\65\u00b6\3\2\2\2\67\u00b9\3\2\2\29\u00bb\3\2\2\2;\u00bd"+
		"\3\2\2\2=\u00bf\3\2\2\2?\u00c1\3\2\2\2A\u00d9\3\2\2\2C\u00dc\3\2\2\2E"+
		"\u00f1\3\2\2\2G\u010c\3\2\2\2I\u010e\3\2\2\2KL\7x\2\2LM\7c\2\2MN\7t\2"+
		"\2N\4\3\2\2\2OP\7h\2\2PQ\7q\2\2QR\7t\2\2R\6\3\2\2\2ST\7k\2\2TU\7h\2\2"+
		"U\b\3\2\2\2VW\7g\2\2WX\7n\2\2XY\7u\2\2YZ\7g\2\2Z\n\3\2\2\2[\\\7h\2\2\\"+
		"]\7w\2\2]^\7p\2\2^_\7e\2\2_`\7v\2\2`a\7k\2\2ab\7q\2\2bc\7p\2\2c\f\3\2"+
		"\2\2de\7t\2\2ef\7g\2\2fg\7v\2\2gh\7w\2\2hi\7t\2\2ij\7p\2\2j\16\3\2\2\2"+
		"kl\7d\2\2lm\7t\2\2mn\7g\2\2no\7c\2\2op\7m\2\2p\20\3\2\2\2qr\7*\2\2r\22"+
		"\3\2\2\2st\7+\2\2t\24\3\2\2\2uv\7}\2\2v\26\3\2\2\2wx\7\177\2\2x\30\3\2"+
		"\2\2yz\7.\2\2z\32\3\2\2\2{|\7<\2\2|\34\3\2\2\2}~\7=\2\2~\36\3\2\2\2\177"+
		"\u0081\t\2\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086"+
		"\b\20\2\2\u0086 \3\2\2\2\u0087\u0088\7\61\2\2\u0088\u0089\7\61\2\2\u0089"+
		"\u008d\3\2\2\2\u008a\u008c\n\3\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u009c\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\7\61\2\2\u0091\u0092\7,\2\2\u0092\u0096\3\2"+
		"\2\2\u0093\u0095\13\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009a\7,\2\2\u009a\u009c\7\61\2\2\u009b\u0087\3\2\2\2\u009b"+
		"\u0090\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\21\2\2\u009e\"\3\2\2"+
		"\2\u009f\u00a0\7-\2\2\u00a0$\3\2\2\2\u00a1\u00a2\7/\2\2\u00a2&\3\2\2\2"+
		"\u00a3\u00a4\7-\2\2\u00a4\u00a5\7-\2\2\u00a5(\3\2\2\2\u00a6\u00a7\7/\2"+
		"\2\u00a7\u00a8\7/\2\2\u00a8*\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa,\3\2\2\2"+
		"\u00ab\u00ac\7>\2\2\u00ac.\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae\u00af\7?\2"+
		"\2\u00af\60\3\2\2\2\u00b0\u00b1\7@\2\2\u00b1\u00b2\7?\2\2\u00b2\62\3\2"+
		"\2\2\u00b3\u00b4\7>\2\2\u00b4\u00b5\7?\2\2\u00b5\64\3\2\2\2\u00b6\u00b7"+
		"\7#\2\2\u00b7\u00b8\7?\2\2\u00b8\66\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba8"+
		"\3\2\2\2\u00bb\u00bc\7\'\2\2\u00bc:\3\2\2\2\u00bd\u00be\7#\2\2\u00be<"+
		"\3\2\2\2\u00bf\u00c0\7?\2\2\u00c0>\3\2\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3"+
		"\7n\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7v\2\2\u00c6"+
		"@\3\2\2\2\u00c7\u00cc\t\4\2\2\u00c8\u00cb\n\5\2\2\u00c9\u00cb\5G$\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00da\t\4\2\2\u00d0\u00d5\t\6\2\2\u00d1\u00d4\n\7\2\2\u00d2\u00d4\5G"+
		"$\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\u00da\t\6\2\2\u00d9\u00c7\3\2\2\2\u00d9\u00d0\3\2\2\2\u00da"+
		"B\3\2\2\2\u00db\u00dd\t\b\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e6\3\2\2\2\u00e0\u00e2"+
		"\7\60\2\2\u00e1\u00e3\t\b\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e0"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7D\3\2\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea"+
		"\7t\2\2\u00ea\u00eb\7w\2\2\u00eb\u00f2\7g\2\2\u00ec\u00ed\7h\2\2\u00ed"+
		"\u00ee\7c\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f2\7g\2\2"+
		"\u00f1\u00e8\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f2F\3\2\2\2\u00f3\u00f4\7"+
		"^\2\2\u00f4\u010d\7p\2\2\u00f5\u00f6\7^\2\2\u00f6\u010d\7t\2\2\u00f7\u00f8"+
		"\7^\2\2\u00f8\u010d\7d\2\2\u00f9\u00fa\7^\2\2\u00fa\u010d\7v\2\2\u00fb"+
		"\u00fc\7^\2\2\u00fc\u010d\7x\2\2\u00fd\u00fe\7^\2\2\u00fe\u010d\7h\2\2"+
		"\u00ff\u0100\7^\2\2\u0100\u010d\7^\2\2\u0101\u0102\7^\2\2\u0102\u010d"+
		"\7$\2\2\u0103\u0104\7^\2\2\u0104\u010d\7)\2\2\u0105\u0106\7^\2\2\u0106"+
		"\u0107\7w\2\2\u0107\u0108\3\2\2\2\u0108\u0109\t\t\2\2\u0109\u010a\t\t"+
		"\2\2\u010a\u010b\t\t\2\2\u010b\u010d\t\t\2\2\u010c\u00f3\3\2\2\2\u010c"+
		"\u00f5\3\2\2\2\u010c\u00f7\3\2\2\2\u010c\u00f9\3\2\2\2\u010c\u00fb\3\2"+
		"\2\2\u010c\u00fd\3\2\2\2\u010c\u00ff\3\2\2\2\u010c\u0101\3\2\2\2\u010c"+
		"\u0103\3\2\2\2\u010c\u0105\3\2\2\2\u010dH\3\2\2\2\u010e\u0112\t\n\2\2"+
		"\u010f\u0111\t\13\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113J\3\2\2\2\u0114\u0112\3\2\2\2\22\2\u0082"+
		"\u008d\u0096\u009b\u00ca\u00cc\u00d3\u00d5\u00d9\u00de\u00e4\u00e6\u00f1"+
		"\u010c\u0112\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}