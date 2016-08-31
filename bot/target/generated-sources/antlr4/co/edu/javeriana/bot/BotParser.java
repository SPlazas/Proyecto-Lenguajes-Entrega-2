// Generated from co\edu\javeriana\bot\Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BotParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_norte = 1, RULE_sur = 2, RULE_este = 3, RULE_oeste = 4, 
		RULE_recoger = 5, RULE_soltar = 6;
	public static final String[] ruleNames = {
		"program", "norte", "sur", "este", "oeste", "recoger", "soltar"
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

	@Override
	public String getGrammarFileName() { return "Bot.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	private Bot bot;

	public BotParser(TokenStream input, Bot bot) {
	    this(input);
	    this.bot = bot;
	}


	public BotParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<NorteContext> norte() {
			return getRuleContexts(NorteContext.class);
		}
		public NorteContext norte(int i) {
			return getRuleContext(NorteContext.class,i);
		}
		public List<SurContext> sur() {
			return getRuleContexts(SurContext.class);
		}
		public SurContext sur(int i) {
			return getRuleContext(SurContext.class,i);
		}
		public List<EsteContext> este() {
			return getRuleContexts(EsteContext.class);
		}
		public EsteContext este(int i) {
			return getRuleContext(EsteContext.class,i);
		}
		public List<OesteContext> oeste() {
			return getRuleContexts(OesteContext.class);
		}
		public OesteContext oeste(int i) {
			return getRuleContext(OesteContext.class,i);
		}
		public List<RecogerContext> recoger() {
			return getRuleContexts(RecogerContext.class);
		}
		public RecogerContext recoger(int i) {
			return getRuleContext(RecogerContext.class,i);
		}
		public List<SoltarContext> soltar() {
			return getRuleContexts(SoltarContext.class);
		}
		public SoltarContext soltar(int i) {
			return getRuleContext(SoltarContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << WEST) | (1L << EAST) | (1L << PICK) | (1L << DROP))) != 0)) {
				{
				setState(20);
				switch (_input.LA(1)) {
				case NORTH:
					{
					setState(14);
					norte();
					}
					break;
				case SOUTH:
					{
					setState(15);
					sur();
					}
					break;
				case EAST:
					{
					setState(16);
					este();
					}
					break;
				case WEST:
					{
					setState(17);
					oeste();
					}
					break;
				case PICK:
					{
					setState(18);
					recoger();
					}
					break;
				case DROP:
					{
					setState(19);
					soltar();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(24);
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

	public static class NorteContext extends ParserRuleContext {
		public Token a;
		public TerminalNode NORTH() { return getToken(BotParser.NORTH, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(BotParser.NUMBER, 0); }
		public NorteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_norte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterNorte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitNorte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitNorte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NorteContext norte() throws RecognitionException {
		NorteContext _localctx = new NorteContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_norte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(NORTH);
			setState(26);
			((NorteContext)_localctx).a = match(NUMBER);
			bot.up(Integer.parseInt(((NorteContext)_localctx).a.getText()));
			setState(28);
			match(SEMICOLON);
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

	public static class SurContext extends ParserRuleContext {
		public Token a;
		public TerminalNode SOUTH() { return getToken(BotParser.SOUTH, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(BotParser.NUMBER, 0); }
		public SurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterSur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitSur(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitSur(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SurContext sur() throws RecognitionException {
		SurContext _localctx = new SurContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sur);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(SOUTH);
			setState(31);
			((SurContext)_localctx).a = match(NUMBER);
			bot.down(Integer.parseInt(((SurContext)_localctx).a.getText()));
			setState(33);
			match(SEMICOLON);
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

	public static class EsteContext extends ParserRuleContext {
		public Token a;
		public TerminalNode EAST() { return getToken(BotParser.EAST, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(BotParser.NUMBER, 0); }
		public EsteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_este; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterEste(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitEste(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitEste(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsteContext este() throws RecognitionException {
		EsteContext _localctx = new EsteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_este);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(EAST);
			setState(36);
			((EsteContext)_localctx).a = match(NUMBER);
			bot.right(Integer.parseInt(((EsteContext)_localctx).a.getText()));
			setState(38);
			match(SEMICOLON);
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

	public static class OesteContext extends ParserRuleContext {
		public Token a;
		public TerminalNode WEST() { return getToken(BotParser.WEST, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(BotParser.NUMBER, 0); }
		public OesteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oeste; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterOeste(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitOeste(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitOeste(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OesteContext oeste() throws RecognitionException {
		OesteContext _localctx = new OesteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_oeste);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(WEST);
			setState(41);
			((OesteContext)_localctx).a = match(NUMBER);
			bot.left(Integer.parseInt(((OesteContext)_localctx).a.getText()));
			setState(43);
			match(SEMICOLON);
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

	public static class RecogerContext extends ParserRuleContext {
		public TerminalNode PICK() { return getToken(BotParser.PICK, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public RecogerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recoger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterRecoger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitRecoger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitRecoger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecogerContext recoger() throws RecognitionException {
		RecogerContext _localctx = new RecogerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_recoger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(PICK);
			bot.pick();
			setState(47);
			match(SEMICOLON);
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

	public static class SoltarContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(BotParser.DROP, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public SoltarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soltar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterSoltar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitSoltar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitSoltar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoltarContext soltar() throws RecognitionException {
		SoltarContext _localctx = new SoltarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_soltar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(DROP);
			bot.drop();
			setState(51);
			match(SEMICOLON);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\398\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\7\2\27"+
		"\n\2\f\2\16\2\32\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\2"+
		"\2\t\2\4\6\b\n\f\16\2\2\66\2\30\3\2\2\2\4\33\3\2\2\2\6 \3\2\2\2\b%\3\2"+
		"\2\2\n*\3\2\2\2\f/\3\2\2\2\16\63\3\2\2\2\20\27\5\4\3\2\21\27\5\6\4\2\22"+
		"\27\5\b\5\2\23\27\5\n\6\2\24\27\5\f\7\2\25\27\5\16\b\2\26\20\3\2\2\2\26"+
		"\21\3\2\2\2\26\22\3\2\2\2\26\23\3\2\2\2\26\24\3\2\2\2\26\25\3\2\2\2\27"+
		"\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\3\3\2\2\2\32\30\3\2\2\2\33"+
		"\34\7\'\2\2\34\35\7\"\2\2\35\36\b\3\1\2\36\37\7%\2\2\37\5\3\2\2\2 !\7"+
		"(\2\2!\"\7\"\2\2\"#\b\4\1\2#$\7%\2\2$\7\3\2\2\2%&\7*\2\2&\'\7\"\2\2\'"+
		"(\b\5\1\2()\7%\2\2)\t\3\2\2\2*+\7)\2\2+,\7\"\2\2,-\b\6\1\2-.\7%\2\2.\13"+
		"\3\2\2\2/\60\7+\2\2\60\61\b\7\1\2\61\62\7%\2\2\62\r\3\2\2\2\63\64\7,\2"+
		"\2\64\65\b\b\1\2\65\66\7%\2\2\66\17\3\2\2\2\4\26\30";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}