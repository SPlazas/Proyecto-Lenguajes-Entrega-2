// Generated from co\edu\javeriana\bot\Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BotLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, ASSIGN=4, EQUAL=5, DIFFERENT=6, SUM=7, REST=8, MULT=9, 
		DIVI=10, MIN_E_THAN=11, MIN_THAN=12, MAX_E_THAN=13, MAX_THAN=14, NEGA=15, 
		PAR_O=16, PAR_C=17, CORCH_O=18, CORCH_C=19, CUAD_O=20, CUAD_C=21, QUOT=22, 
		QUOT_O=23, QUOT_C=24, IF=25, THEN=26, ELSE=27, ENDWHILE=28, ENDF=29, ENDIF=30, 
		RETORNO=31, NUMBER=32, FLOTANTE=33, COMMA=34, SEMICOLON=35, DECLARATION=36, 
		NORTH=37, SOUTH=38, WEST=39, EAST=40, PICK=41, DROP=42, LOOK=43, FUNC=44, 
		FUNCTION=45, MIENTRAS=46, READ=47, PRINT=48, DO=49, DOSP=50, STRING=51, 
		STR=52, ID=53, WS=54, WS1=55;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"AND", "OR", "NOT", "ASSIGN", "EQUAL", "DIFFERENT", "SUM", "REST", "MULT", 
		"DIVI", "MIN_E_THAN", "MIN_THAN", "MAX_E_THAN", "MAX_THAN", "NEGA", "PAR_O", 
		"PAR_C", "CORCH_O", "CORCH_C", "CUAD_O", "CUAD_C", "QUOT", "QUOT_O", "QUOT_C", 
		"IF", "THEN", "ELSE", "ENDWHILE", "ENDF", "ENDIF", "RETORNO", "NUMBER", 
		"FLOTANTE", "COMMA", "SEMICOLON", "DECLARATION", "NORTH", "SOUTH", "WEST", 
		"EAST", "PICK", "DROP", "LOOK", "FUNC", "FUNCTION", "MIENTRAS", "READ", 
		"PRINT", "DO", "DOSP", "STRING", "STR", "ID", "WS", "WS1"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'='", "'=='", "'<>'", "'+'", "'-'", "'*'", "'/'", 
		"'<='", "'<'", "'>='", "'>'", "'!'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "'\"'", "'“'", "'”'", "'if'", "'then'", "'else'", "'endwhile'", 
		"'endfunction'", "'endif'", "'return'", null, null, "','", "';'", "'var'", 
		"'north'", "'south'", "'west'", "'east'", "'pick'", "'drop'", "'look'", 
		"'function'", "'fun'", "'while'", "'read'", "'println'", "'do'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "ASSIGN", "EQUAL", "DIFFERENT", "SUM", "REST", 
		"MULT", "DIVI", "MIN_E_THAN", "MIN_THAN", "MAX_E_THAN", "MAX_THAN", "NEGA", 
		"PAR_O", "PAR_C", "CORCH_O", "CORCH_C", "CUAD_O", "CUAD_C", "QUOT", "QUOT_O", 
		"QUOT_C", "IF", "THEN", "ELSE", "ENDWHILE", "ENDF", "ENDIF", "RETORNO", 
		"NUMBER", "FLOTANTE", "COMMA", "SEMICOLON", "DECLARATION", "NORTH", "SOUTH", 
		"WEST", "EAST", "PICK", "DROP", "LOOK", "FUNC", "FUNCTION", "MIENTRAS", 
		"READ", "PRINT", "DO", "DOSP", "STRING", "STR", "ID", "WS", "WS1"
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


	public BotLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bot.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\29\u015d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3!\7!\u00db\n!\f!\16!\u00de\13!\3\"\6\"\u00e1"+
		"\n\"\r\"\16\"\u00e2\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3"+
		".\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\7\64\u013c\n\64"+
		"\f\64\16\64\u013f\13\64\3\64\3\64\3\65\3\65\7\65\u0145\n\65\f\65\16\65"+
		"\u0148\13\65\3\65\3\65\3\66\3\66\7\66\u014e\n\66\f\66\16\66\u0151\13\66"+
		"\3\67\6\67\u0154\n\67\r\67\16\67\u0155\3\67\3\67\38\38\38\38\2\29\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9\3\2"+
		"\6\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u0162\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\3q\3\2\2\2\5u\3\2\2\2\7x\3\2\2\2\t|\3\2\2\2\13~\3\2\2\2\r\u0081\3\2"+
		"\2\2\17\u0084\3\2\2\2\21\u0086\3\2\2\2\23\u0088\3\2\2\2\25\u008a\3\2\2"+
		"\2\27\u008c\3\2\2\2\31\u008f\3\2\2\2\33\u0091\3\2\2\2\35\u0094\3\2\2\2"+
		"\37\u0096\3\2\2\2!\u0098\3\2\2\2#\u009a\3\2\2\2%\u009c\3\2\2\2\'\u009e"+
		"\3\2\2\2)\u00a0\3\2\2\2+\u00a2\3\2\2\2-\u00a4\3\2\2\2/\u00a6\3\2\2\2\61"+
		"\u00a8\3\2\2\2\63\u00aa\3\2\2\2\65\u00ad\3\2\2\2\67\u00b2\3\2\2\29\u00b7"+
		"\3\2\2\2;\u00c0\3\2\2\2=\u00cc\3\2\2\2?\u00d2\3\2\2\2A\u00dc\3\2\2\2C"+
		"\u00e0\3\2\2\2E\u00e7\3\2\2\2G\u00e9\3\2\2\2I\u00eb\3\2\2\2K\u00ef\3\2"+
		"\2\2M\u00f5\3\2\2\2O\u00fb\3\2\2\2Q\u0100\3\2\2\2S\u0105\3\2\2\2U\u010a"+
		"\3\2\2\2W\u010f\3\2\2\2Y\u0114\3\2\2\2[\u011d\3\2\2\2]\u0121\3\2\2\2_"+
		"\u0127\3\2\2\2a\u012c\3\2\2\2c\u0134\3\2\2\2e\u0137\3\2\2\2g\u0139\3\2"+
		"\2\2i\u0142\3\2\2\2k\u014b\3\2\2\2m\u0153\3\2\2\2o\u0159\3\2\2\2qr\7c"+
		"\2\2rs\7p\2\2st\7f\2\2t\4\3\2\2\2uv\7q\2\2vw\7t\2\2w\6\3\2\2\2xy\7p\2"+
		"\2yz\7q\2\2z{\7v\2\2{\b\3\2\2\2|}\7?\2\2}\n\3\2\2\2~\177\7?\2\2\177\u0080"+
		"\7?\2\2\u0080\f\3\2\2\2\u0081\u0082\7>\2\2\u0082\u0083\7@\2\2\u0083\16"+
		"\3\2\2\2\u0084\u0085\7-\2\2\u0085\20\3\2\2\2\u0086\u0087\7/\2\2\u0087"+
		"\22\3\2\2\2\u0088\u0089\7,\2\2\u0089\24\3\2\2\2\u008a\u008b\7\61\2\2\u008b"+
		"\26\3\2\2\2\u008c\u008d\7>\2\2\u008d\u008e\7?\2\2\u008e\30\3\2\2\2\u008f"+
		"\u0090\7>\2\2\u0090\32\3\2\2\2\u0091\u0092\7@\2\2\u0092\u0093\7?\2\2\u0093"+
		"\34\3\2\2\2\u0094\u0095\7@\2\2\u0095\36\3\2\2\2\u0096\u0097\7#\2\2\u0097"+
		" \3\2\2\2\u0098\u0099\7*\2\2\u0099\"\3\2\2\2\u009a\u009b\7+\2\2\u009b"+
		"$\3\2\2\2\u009c\u009d\7}\2\2\u009d&\3\2\2\2\u009e\u009f\7\177\2\2\u009f"+
		"(\3\2\2\2\u00a0\u00a1\7]\2\2\u00a1*\3\2\2\2\u00a2\u00a3\7_\2\2\u00a3,"+
		"\3\2\2\2\u00a4\u00a5\7$\2\2\u00a5.\3\2\2\2\u00a6\u00a7\7\u201e\2\2\u00a7"+
		"\60\3\2\2\2\u00a8\u00a9\7\u201f\2\2\u00a9\62\3\2\2\2\u00aa\u00ab\7k\2"+
		"\2\u00ab\u00ac\7h\2\2\u00ac\64\3\2\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af"+
		"\7j\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7p\2\2\u00b1\66\3\2\2\2\u00b2\u00b3"+
		"\7g\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7g\2\2\u00b6"+
		"8\3\2\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7f\2\2\u00ba"+
		"\u00bb\7y\2\2\u00bb\u00bc\7j\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7n\2\2"+
		"\u00be\u00bf\7g\2\2\u00bf:\3\2\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7p\2"+
		"\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c6"+
		"\7p\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7k\2\2\u00c9"+
		"\u00ca\7q\2\2\u00ca\u00cb\7p\2\2\u00cb<\3\2\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\u00ce\7p\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7h\2\2"+
		"\u00d1>\3\2\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7v\2"+
		"\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7p\2\2\u00d8@\3\2"+
		"\2\2\u00d9\u00db\4\62;\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00ddB\3\2\2\2\u00de\u00dc\3\2\2\2"+
		"\u00df\u00e1\4\62;\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\60\2\2"+
		"\u00e5\u00e6\4\62;\2\u00e6D\3\2\2\2\u00e7\u00e8\7.\2\2\u00e8F\3\2\2\2"+
		"\u00e9\u00ea\7=\2\2\u00eaH\3\2\2\2\u00eb\u00ec\7x\2\2\u00ec\u00ed\7c\2"+
		"\2\u00ed\u00ee\7t\2\2\u00eeJ\3\2\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7"+
		"q\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7j\2\2\u00f4L"+
		"\3\2\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7w\2\2\u00f8"+
		"\u00f9\7v\2\2\u00f9\u00fa\7j\2\2\u00faN\3\2\2\2\u00fb\u00fc\7y\2\2\u00fc"+
		"\u00fd\7g\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7v\2\2\u00ffP\3\2\2\2\u0100"+
		"\u0101\7g\2\2\u0101\u0102\7c\2\2\u0102\u0103\7u\2\2\u0103\u0104\7v\2\2"+
		"\u0104R\3\2\2\2\u0105\u0106\7r\2\2\u0106\u0107\7k\2\2\u0107\u0108\7e\2"+
		"\2\u0108\u0109\7m\2\2\u0109T\3\2\2\2\u010a\u010b\7f\2\2\u010b\u010c\7"+
		"t\2\2\u010c\u010d\7q\2\2\u010d\u010e\7r\2\2\u010eV\3\2\2\2\u010f\u0110"+
		"\7n\2\2\u0110\u0111\7q\2\2\u0111\u0112\7q\2\2\u0112\u0113\7m\2\2\u0113"+
		"X\3\2\2\2\u0114\u0115\7h\2\2\u0115\u0116\7w\2\2\u0116\u0117\7p\2\2\u0117"+
		"\u0118\7e\2\2\u0118\u0119\7v\2\2\u0119\u011a\7k\2\2\u011a\u011b\7q\2\2"+
		"\u011b\u011c\7p\2\2\u011cZ\3\2\2\2\u011d\u011e\7h\2\2\u011e\u011f\7w\2"+
		"\2\u011f\u0120\7p\2\2\u0120\\\3\2\2\2\u0121\u0122\7y\2\2\u0122\u0123\7"+
		"j\2\2\u0123\u0124\7k\2\2\u0124\u0125\7n\2\2\u0125\u0126\7g\2\2\u0126^"+
		"\3\2\2\2\u0127\u0128\7t\2\2\u0128\u0129\7g\2\2\u0129\u012a\7c\2\2\u012a"+
		"\u012b\7f\2\2\u012b`\3\2\2\2\u012c\u012d\7r\2\2\u012d\u012e\7t\2\2\u012e"+
		"\u012f\7k\2\2\u012f\u0130\7p\2\2\u0130\u0131\7v\2\2\u0131\u0132\7n\2\2"+
		"\u0132\u0133\7p\2\2\u0133b\3\2\2\2\u0134\u0135\7f\2\2\u0135\u0136\7q\2"+
		"\2\u0136d\3\2\2\2\u0137\u0138\7<\2\2\u0138f\3\2\2\2\u0139\u013d\7$\2\2"+
		"\u013a\u013c\n\2\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140"+
		"\u0141\7$\2\2\u0141h\3\2\2\2\u0142\u0146\7$\2\2\u0143\u0145\13\2\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7$\2\2\u014a"+
		"j\3\2\2\2\u014b\u014f\t\3\2\2\u014c\u014e\t\4\2\2\u014d\u014c\3\2\2\2"+
		"\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150l\3"+
		"\2\2\2\u0151\u014f\3\2\2\2\u0152\u0154\t\5\2\2\u0153\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0158\b\67\2\2\u0158n\3\2\2\2\u0159\u015a\t\5\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015c\b8\2\2\u015cp\3\2\2\2\t\2\u00dc\u00e2\u013d\u0146"+
		"\u014f\u0155\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}