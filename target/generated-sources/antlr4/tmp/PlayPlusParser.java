// Generated from tmp\PlayPlus.g4 by ANTLR 4.6
package tmp;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BY=1, DEFAULT=2, DECLARE=3, AND=4, RETAIN=5, YOUR=6, TURN=7, WHEN=8, LOCAL=9, 
		AS=10, DO=11, DONE=12, LPAR=13, RPAR=14, LCRO=15, RCRO=16, COMMA=17, PLUS=18, 
		MINUS=19, POINT=20, POINTVIRGULE=21, DIVIDE=22, MODULO=23, TIMES=24, OR=25, 
		INF=26, SUP=27, EQUAL=28, NOT=29, TRUE=30, FALSE=31, NORTH=32, SOUTH=33, 
		EAST=34, WEST=35, ENNEMI=36, GRAAL=37, IS=38, LATITUDE=39, LONGITUDE=40, 
		GRIDSIZE=41, MAP=42, RADIO=43, RADAR=44, AMMO=45, FRUITS=46, SODA=47, 
		COUNT=48, LIFE=49, DIRT=50, ROCK=51, VINES=52, ZOMBIE=53, PLAYER=54, NEARBY=55, 
		SKIPCODE=56, IF=57, THEN=58, ELSE=59, WHILE=60, SET=61, TO=62, COMPUTE=63, 
		NEXT=64, MOVE=65, SHOOT=66, USE=67, NOTHING=68, FUNCTION=69, VOID=70, 
		RETURN=71, EXTWLD=72, DOUBLEPOINT=73, IMPORT=74, SCALAR=75, ID=76, VARDECL=77, 
		NUMBER=78, COMMENT_UNELIGNE=79, COMMENT=80, NEWLINE=81, WS=82;
	public static final int
		RULE_root = 0, RULE_programmemonde = 1, RULE_programmestrat = 2, RULE_clausewhen = 3, 
		RULE_clausewhencond = 4, RULE_clausewhenins = 5, RULE_clausedefault = 6, 
		RULE_endprog = 7, RULE_vardecl = 8, RULE_type = 9, RULE_array = 10, RULE_exprD = 11, 
		RULE_exprG = 12, RULE_exprEnt = 13, RULE_exprCase = 14, RULE_instruction = 15, 
		RULE_donewhile = 16, RULE_condblock = 17, RULE_truecondblock = 18, RULE_elsecondblock = 19, 
		RULE_action = 20, RULE_fctdecl = 21, RULE_fdeclreturn = 22, RULE_impdecl = 23, 
		RULE_filedecl = 24, RULE_filename = 25;
	public static final String[] ruleNames = {
		"root", "programmemonde", "programmestrat", "clausewhen", "clausewhencond", 
		"clausewhenins", "clausedefault", "endprog", "vardecl", "type", "array", 
		"exprD", "exprG", "exprEnt", "exprCase", "instruction", "donewhile", "condblock", 
		"truecondblock", "elsecondblock", "action", "fctdecl", "fdeclreturn", 
		"impdecl", "filedecl", "filename"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'by'", "'default'", "'declare'", "'and'", "'retain'", "'your'", 
		"'turn'", "'when'", "'local'", "'as'", "'do'", "'done'", "'('", "')'", 
		"'['", "']'", "','", "'+'", "'-'", "'.'", "';'", "'/'", "'%'", "'*'", 
		"'or'", "'<'", "'>'", "'='", "'not'", "'true'", "'false'", "'north'", 
		"'south'", "'east'", "'west'", "'ennemi'", "'graal'", "'is'", "'latitude'", 
		"'longitude'", "'grid size'", "'map'", "'radio'", "'radar'", "'ammo'", 
		"'fruits'", "'soda'", "'count'", "'life'", "'dirt'", "'rock'", "'vines'", 
		"'zombie'", "'player'", "'nearby'", "'skip'", "'if'", "'then'", "'else'", 
		"'while'", "'set'", "'to'", "'compute'", "'next'", "'move'", "'shoot'", 
		"'use'", "'nothing'", "'function'", "'void'", "'return'", "'.wld'", "':'", 
		"'import'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BY", "DEFAULT", "DECLARE", "AND", "RETAIN", "YOUR", "TURN", "WHEN", 
		"LOCAL", "AS", "DO", "DONE", "LPAR", "RPAR", "LCRO", "RCRO", "COMMA", 
		"PLUS", "MINUS", "POINT", "POINTVIRGULE", "DIVIDE", "MODULO", "TIMES", 
		"OR", "INF", "SUP", "EQUAL", "NOT", "TRUE", "FALSE", "NORTH", "SOUTH", 
		"EAST", "WEST", "ENNEMI", "GRAAL", "IS", "LATITUDE", "LONGITUDE", "GRIDSIZE", 
		"MAP", "RADIO", "RADAR", "AMMO", "FRUITS", "SODA", "COUNT", "LIFE", "DIRT", 
		"ROCK", "VINES", "ZOMBIE", "PLAYER", "NEARBY", "SKIPCODE", "IF", "THEN", 
		"ELSE", "WHILE", "SET", "TO", "COMPUTE", "NEXT", "MOVE", "SHOOT", "USE", 
		"NOTHING", "FUNCTION", "VOID", "RETURN", "EXTWLD", "DOUBLEPOINT", "IMPORT", 
		"SCALAR", "ID", "VARDECL", "NUMBER", "COMMENT_UNELIGNE", "COMMENT", "NEWLINE", 
		"WS"
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
	public String getGrammarFileName() { return "PlayPlus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlayPlusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public ProgrammemondeContext programmemonde() {
			return getRuleContext(ProgrammemondeContext.class,0);
		}
		public ProgrammestratContext programmestrat() {
			return getRuleContext(ProgrammestratContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				programmemonde();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				programmestrat();
				}
				break;
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

	public static class ProgrammemondeContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(PlayPlusParser.DECLARE, 0); }
		public TerminalNode AND() { return getToken(PlayPlusParser.AND, 0); }
		public TerminalNode RETAIN() { return getToken(PlayPlusParser.RETAIN, 0); }
		public ClausedefaultContext clausedefault() {
			return getRuleContext(ClausedefaultContext.class,0);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<TerminalNode> POINTVIRGULE() { return getTokens(PlayPlusParser.POINTVIRGULE); }
		public TerminalNode POINTVIRGULE(int i) {
			return getToken(PlayPlusParser.POINTVIRGULE, i);
		}
		public List<FctdeclContext> fctdecl() {
			return getRuleContexts(FctdeclContext.class);
		}
		public FctdeclContext fctdecl(int i) {
			return getRuleContext(FctdeclContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ProgrammemondeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programmemonde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterProgrammemonde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitProgrammemonde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitProgrammemonde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammemondeContext programmemonde() throws RecognitionException {
		ProgrammemondeContext _localctx = new ProgrammemondeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programmemonde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(DECLARE);
			setState(57);
			match(AND);
			setState(58);
			match(RETAIN);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(59);
					vardecl();
					setState(60);
					match(POINTVIRGULE);
					}
					break;
				case 2:
					{
					setState(62);
					fctdecl();
					}
					break;
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (SKIPCODE - 56)) | (1L << (IF - 56)) | (1L << (WHILE - 56)) | (1L << (SET - 56)) | (1L << (COMPUTE - 56)) | (1L << (NEXT - 56)))) != 0)) {
				{
				{
				setState(68);
				instruction();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			clausedefault();
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

	public static class ProgrammestratContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(PlayPlusParser.DECLARE, 0); }
		public TerminalNode AND() { return getToken(PlayPlusParser.AND, 0); }
		public TerminalNode RETAIN() { return getToken(PlayPlusParser.RETAIN, 0); }
		public TerminalNode WHEN() { return getToken(PlayPlusParser.WHEN, 0); }
		public TerminalNode YOUR() { return getToken(PlayPlusParser.YOUR, 0); }
		public TerminalNode TURN() { return getToken(PlayPlusParser.TURN, 0); }
		public ClausedefaultContext clausedefault() {
			return getRuleContext(ClausedefaultContext.class,0);
		}
		public List<ImpdeclContext> impdecl() {
			return getRuleContexts(ImpdeclContext.class);
		}
		public ImpdeclContext impdecl(int i) {
			return getRuleContext(ImpdeclContext.class,i);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<TerminalNode> POINTVIRGULE() { return getTokens(PlayPlusParser.POINTVIRGULE); }
		public TerminalNode POINTVIRGULE(int i) {
			return getToken(PlayPlusParser.POINTVIRGULE, i);
		}
		public List<FctdeclContext> fctdecl() {
			return getRuleContexts(FctdeclContext.class);
		}
		public FctdeclContext fctdecl(int i) {
			return getRuleContext(FctdeclContext.class,i);
		}
		public List<ClausewhenContext> clausewhen() {
			return getRuleContexts(ClausewhenContext.class);
		}
		public ClausewhenContext clausewhen(int i) {
			return getRuleContext(ClausewhenContext.class,i);
		}
		public ProgrammestratContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programmestrat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterProgrammestrat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitProgrammestrat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitProgrammestrat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammestratContext programmestrat() throws RecognitionException {
		ProgrammestratContext _localctx = new ProgrammestratContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_programmestrat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(DECLARE);
			setState(77);
			match(AND);
			setState(78);
			match(RETAIN);
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(79);
				impdecl();
				}
				break;
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT || _la==ID) {
				{
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(82);
					vardecl();
					setState(83);
					match(POINTVIRGULE);
					}
					break;
				case 2:
					{
					setState(85);
					fctdecl();
					}
					break;
				case 3:
					{
					setState(86);
					impdecl();
					}
					break;
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(WHEN);
			setState(93);
			match(YOUR);
			setState(94);
			match(TURN);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(95);
				clausewhen();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			clausedefault();
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

	public static class ClausewhenContext extends ParserRuleContext {
		public ClausewhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clausewhen; }
	 
		public ClausewhenContext() { }
		public void copyFrom(ClausewhenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsideClauseWHENContext extends ClausewhenContext {
		public TerminalNode WHEN() { return getToken(PlayPlusParser.WHEN, 0); }
		public ClausewhencondContext clausewhencond() {
			return getRuleContext(ClausewhencondContext.class,0);
		}
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public ClausewheninsContext clausewhenins() {
			return getRuleContext(ClausewheninsContext.class,0);
		}
		public TerminalNode DONE() { return getToken(PlayPlusParser.DONE, 0); }
		public TerminalNode DECLARE() { return getToken(PlayPlusParser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(PlayPlusParser.LOCAL, 0); }
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<TerminalNode> POINTVIRGULE() { return getTokens(PlayPlusParser.POINTVIRGULE); }
		public TerminalNode POINTVIRGULE(int i) {
			return getToken(PlayPlusParser.POINTVIRGULE, i);
		}
		public InsideClauseWHENContext(ClausewhenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInsideClauseWHEN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInsideClauseWHEN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInsideClauseWHEN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClausewhenContext clausewhen() throws RecognitionException {
		ClausewhenContext _localctx = new ClausewhenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_clausewhen);
		int _la;
		try {
			_localctx = new InsideClauseWHENContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(WHEN);
			setState(104);
			clausewhencond();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(105);
				match(DECLARE);
				setState(106);
				match(LOCAL);
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(107);
					vardecl();
					setState(108);
					match(POINTVIRGULE);
					}
					}
					setState(112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(116);
			match(DO);
			setState(117);
			clausewhenins();
			setState(118);
			match(DONE);
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

	public static class ClausewhencondContext extends ParserRuleContext {
		public ClausewhencondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clausewhencond; }
	 
		public ClausewhencondContext() { }
		public void copyFrom(ClausewhencondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsideClauseWHENCondContext extends ClausewhencondContext {
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public InsideClauseWHENCondContext(ClausewhencondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInsideClauseWHENCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInsideClauseWHENCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInsideClauseWHENCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClausewhencondContext clausewhencond() throws RecognitionException {
		ClausewhencondContext _localctx = new ClausewhencondContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_clausewhencond);
		try {
			_localctx = new InsideClauseWHENCondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			exprD(0);
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

	public static class ClausewheninsContext extends ParserRuleContext {
		public ClausewheninsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clausewhenins; }
	 
		public ClausewheninsContext() { }
		public void copyFrom(ClausewheninsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsideClauseWHENInsContext extends ClausewheninsContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public InsideClauseWHENInsContext(ClausewheninsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInsideClauseWHENIns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInsideClauseWHENIns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInsideClauseWHENIns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClausewheninsContext clausewhenins() throws RecognitionException {
		ClausewheninsContext _localctx = new ClausewheninsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_clausewhenins);
		int _la;
		try {
			_localctx = new InsideClauseWHENInsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				instruction();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (SKIPCODE - 56)) | (1L << (IF - 56)) | (1L << (WHILE - 56)) | (1L << (SET - 56)) | (1L << (COMPUTE - 56)) | (1L << (NEXT - 56)))) != 0) );
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

	public static class ClausedefaultContext extends ParserRuleContext {
		public ClausedefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clausedefault; }
	 
		public ClausedefaultContext() { }
		public void copyFrom(ClausedefaultContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsideClauseDefaultContext extends ClausedefaultContext {
		public TerminalNode BY() { return getToken(PlayPlusParser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(PlayPlusParser.DEFAULT, 0); }
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public EndprogContext endprog() {
			return getRuleContext(EndprogContext.class,0);
		}
		public TerminalNode DECLARE() { return getToken(PlayPlusParser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(PlayPlusParser.LOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<TerminalNode> POINTVIRGULE() { return getTokens(PlayPlusParser.POINTVIRGULE); }
		public TerminalNode POINTVIRGULE(int i) {
			return getToken(PlayPlusParser.POINTVIRGULE, i);
		}
		public InsideClauseDefaultContext(ClausedefaultContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInsideClauseDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInsideClauseDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInsideClauseDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClausedefaultContext clausedefault() throws RecognitionException {
		ClausedefaultContext _localctx = new ClausedefaultContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_clausedefault);
		int _la;
		try {
			_localctx = new InsideClauseDefaultContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(BY);
			setState(128);
			match(DEFAULT);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(129);
				match(DECLARE);
				setState(130);
				match(LOCAL);
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					vardecl();
					setState(132);
					match(POINTVIRGULE);
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(140);
			match(DO);
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				instruction();
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (SKIPCODE - 56)) | (1L << (IF - 56)) | (1L << (WHILE - 56)) | (1L << (SET - 56)) | (1L << (COMPUTE - 56)) | (1L << (NEXT - 56)))) != 0) );
			setState(146);
			endprog();
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

	public static class EndprogContext extends ParserRuleContext {
		public EndprogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endprog; }
	 
		public EndprogContext() { }
		public void copyFrom(EndprogContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsideEndProgContext extends EndprogContext {
		public TerminalNode DONE() { return getToken(PlayPlusParser.DONE, 0); }
		public InsideEndProgContext(EndprogContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInsideEndProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInsideEndProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInsideEndProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndprogContext endprog() throws RecognitionException {
		EndprogContext _localctx = new EndprogContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_endprog);
		try {
			_localctx = new InsideEndProgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(DONE);
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

	public static class VardeclContext extends ParserRuleContext {
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
	 
		public VardeclContext() { }
		public void copyFrom(VardeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentificationContext extends VardeclContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentificationContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterIdentification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitIdentification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitIdentification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vardecl);
		try {
			_localctx = new IdentificationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ID);
			setState(151);
			match(AS);
			setState(152);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode SCALAR() { return getToken(PlayPlusParser.SCALAR, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(SCALAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				array();
				}
				break;
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

	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayDeclarationContext extends ArrayContext {
		public TerminalNode SCALAR() { return getToken(PlayPlusParser.SCALAR, 0); }
		public TerminalNode LCRO() { return getToken(PlayPlusParser.LCRO, 0); }
		public TerminalNode RCRO() { return getToken(PlayPlusParser.RCRO, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(PlayPlusParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PlayPlusParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public ArrayDeclarationContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array);
		int _la;
		try {
			_localctx = new ArrayDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(SCALAR);
			setState(159);
			match(LCRO);
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				match(NUMBER);
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(165);
				match(COMMA);
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166);
					match(NUMBER);
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
			}

			setState(173);
			match(RCRO);
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

	public static class ExprDContext extends ParserRuleContext {
		public ExprDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprD; }
	 
		public ExprDContext() { }
		public void copyFrom(ExprDContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprDEntiereContext extends ExprDContext {
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public ExprDEntiereContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDEntiere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDEntiere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDEntiere(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDGraalIsContext extends ExprDContext {
		public TerminalNode GRAAL() { return getToken(PlayPlusParser.GRAAL, 0); }
		public TerminalNode IS() { return getToken(PlayPlusParser.IS, 0); }
		public TerminalNode NORTH() { return getToken(PlayPlusParser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(PlayPlusParser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(PlayPlusParser.EAST, 0); }
		public TerminalNode WEST() { return getToken(PlayPlusParser.WEST, 0); }
		public ExprDGraalIsContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDGraalIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDGraalIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDGraalIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPlusMinusContext extends ExprDContext {
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PlayPlusParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PlayPlusParser.MINUS, 0); }
		public ExprPlusMinusContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDNotContext extends ExprDContext {
		public TerminalNode NOT() { return getToken(PlayPlusParser.NOT, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public ExprDNotContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDVarDeclCroContext extends ExprDContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode LCRO() { return getToken(PlayPlusParser.LCRO, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode RCRO() { return getToken(PlayPlusParser.RCRO, 0); }
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public ExprDVarDeclCroContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDVarDeclCro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDVarDeclCro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDVarDeclCro(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDTimesContext extends ExprDContext {
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(PlayPlusParser.TIMES, 0); }
		public ExprDTimesContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDTimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDTimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDTimes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDExprGContext extends ExprDContext {
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public ExprDExprGContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDExprG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDExprG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDExprG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDDivideContext extends ExprDContext {
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(PlayPlusParser.DIVIDE, 0); }
		public ExprDDivideContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDEqualContext extends ExprDContext {
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(PlayPlusParser.EQUAL, 0); }
		public ExprDEqualContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDTrueContext extends ExprDContext {
		public TerminalNode TRUE() { return getToken(PlayPlusParser.TRUE, 0); }
		public ExprDTrueContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDOrContext extends ExprDContext {
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode OR() { return getToken(PlayPlusParser.OR, 0); }
		public ExprDOrContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDMinusContext extends ExprDContext {
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(PlayPlusParser.MINUS, 0); }
		public ExprDMinusContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDAndContext extends ExprDContext {
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode AND() { return getToken(PlayPlusParser.AND, 0); }
		public ExprDAndContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDLPARPARContext extends ExprDContext {
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public ExprDLPARPARContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDLPARPAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDLPARPAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDLPARPAR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDModuloContext extends ExprDContext {
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode MODULO() { return getToken(PlayPlusParser.MODULO, 0); }
		public ExprDModuloContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDModulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDInfContext extends ExprDContext {
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode INF() { return getToken(PlayPlusParser.INF, 0); }
		public ExprDInfContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDInf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDInf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDInf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDSupContext extends ExprDContext {
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode SUP() { return getToken(PlayPlusParser.SUP, 0); }
		public ExprDSupContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDSup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDSup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDSup(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDexprCaseContext extends ExprDContext {
		public ExprCaseContext exprCase() {
			return getRuleContext(ExprCaseContext.class,0);
		}
		public ExprDexprCaseContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDexprCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDexprCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDexprCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDPlusContext extends ExprDContext {
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PlayPlusParser.PLUS, 0); }
		public ExprDPlusContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDVarDeclContext extends ExprDContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public ExprDVarDeclContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDFalseContext extends ExprDContext {
		public TerminalNode FALSE() { return getToken(PlayPlusParser.FALSE, 0); }
		public ExprDFalseContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDEnnemIsContext extends ExprDContext {
		public TerminalNode ENNEMI() { return getToken(PlayPlusParser.ENNEMI, 0); }
		public TerminalNode IS() { return getToken(PlayPlusParser.IS, 0); }
		public TerminalNode NORTH() { return getToken(PlayPlusParser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(PlayPlusParser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(PlayPlusParser.EAST, 0); }
		public TerminalNode WEST() { return getToken(PlayPlusParser.WEST, 0); }
		public ExprDEnnemIsContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDEnnemIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDEnnemIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDEnnemIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDLPARExprDRPARContext extends ExprDContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public ExprDLPARExprDRPARContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprDLPARExprDRPAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprDLPARExprDRPAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprDLPARExprDRPAR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprDContext exprD() throws RecognitionException {
		return exprD(0);
	}

	private ExprDContext exprD(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprDContext _localctx = new ExprDContext(_ctx, _parentState);
		ExprDContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exprD, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new ExprDEntiereContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(176);
				exprEnt();
				}
				break;
			case 2:
				{
				_localctx = new ExprPlusMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(178);
				exprD(22);
				}
				break;
			case 3:
				{
				_localctx = new ExprDNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(NOT);
				setState(180);
				exprD(21);
				}
				break;
			case 4:
				{
				_localctx = new ExprDTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(TRUE);
				}
				break;
			case 5:
				{
				_localctx = new ExprDFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(FALSE);
				}
				break;
			case 6:
				{
				_localctx = new ExprDEnnemIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(ENNEMI);
				setState(184);
				match(IS);
				setState(185);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				{
				_localctx = new ExprDGraalIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(GRAAL);
				setState(187);
				match(IS);
				setState(188);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 8:
				{
				_localctx = new ExprDexprCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				exprCase();
				}
				break;
			case 9:
				{
				_localctx = new ExprDVarDeclContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(ID);
				}
				break;
			case 10:
				{
				_localctx = new ExprDVarDeclCroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(ID);
				setState(192);
				match(LCRO);
				setState(193);
				exprD(0);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(194);
					match(COMMA);
					setState(195);
					exprD(0);
					}
				}

				setState(198);
				match(RCRO);
				}
				break;
			case 11:
				{
				_localctx = new ExprDExprGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				exprG();
				}
				break;
			case 12:
				{
				_localctx = new ExprDLPARExprDRPARContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				match(ID);
				setState(202);
				match(LPAR);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << ENNEMI) | (1L << GRAAL) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRIDSIZE) | (1L << MAP) | (1L << RADIO) | (1L << RADAR) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << LIFE) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << NEARBY))) != 0) || _la==ID || _la==NUMBER) {
					{
					setState(203);
					exprD(0);
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(204);
						match(COMMA);
						setState(205);
						exprD(0);
						}
						}
						setState(210);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(213);
				match(RPAR);
				}
				break;
			case 13:
				{
				_localctx = new ExprDLPARPARContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(LPAR);
				setState(215);
				exprD(0);
				setState(216);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprDTimesContext(new ExprDContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(220);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(221);
						match(TIMES);
						setState(222);
						exprD(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprDDivideContext(new ExprDContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(223);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(224);
						match(DIVIDE);
						setState(225);
						exprD(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprDModuloContext(new ExprDContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(226);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(227);
						match(MODULO);
						setState(228);
						exprD(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprDPlusContext(new ExprDContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(229);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(230);
						match(PLUS);
						setState(231);
						exprD(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprDMinusContext(new ExprDContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(232);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(233);
						match(MINUS);
						setState(234);
						exprD(7);
						}
						break;
					case 6:
						{
						_localctx = new ExprDEqualContext(new ExprDContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(235);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(236);
						match(EQUAL);
						setState(237);
						exprD(6);
						}
						break;
					case 7:
						{
						_localctx = new ExprDInfContext(new ExprDContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(238);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(239);
						match(INF);
						setState(240);
						exprD(5);
						}
						break;
					case 8:
						{
						_localctx = new ExprDSupContext(new ExprDContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(241);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(242);
						match(SUP);
						setState(243);
						exprD(4);
						}
						break;
					case 9:
						{
						_localctx = new ExprDAndContext(new ExprDContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(244);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(245);
						match(AND);
						setState(246);
						exprD(3);
						}
						break;
					case 10:
						{
						_localctx = new ExprDOrContext(new ExprDContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(247);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(248);
						match(OR);
						setState(249);
						exprD(2);
						}
						break;
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprGContext extends ParserRuleContext {
		public ExprGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprG; }
	 
		public ExprGContext() { }
		public void copyFrom(ExprGContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprGIDContext extends ExprGContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public ExprGIDContext(ExprGContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprGID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprGID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprGID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprGArrayContext extends ExprGContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode LCRO() { return getToken(PlayPlusParser.LCRO, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode RCRO() { return getToken(PlayPlusParser.RCRO, 0); }
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public ExprGArrayContext(ExprGContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprGArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprGArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprGArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprGContext exprG() throws RecognitionException {
		ExprGContext _localctx = new ExprGContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprG);
		int _la;
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ExprGIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ExprGArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(256);
				match(ID);
				setState(257);
				match(LCRO);
				setState(258);
				exprD(0);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(259);
					match(COMMA);
					setState(260);
					exprD(0);
					}
				}

				setState(263);
				match(RCRO);
				}
				}
				break;
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

	public static class ExprEntContext extends ParserRuleContext {
		public ExprEntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprEnt; }
	 
		public ExprEntContext() { }
		public void copyFrom(ExprEntContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprEntNumberContext extends ExprEntContext {
		public TerminalNode NUMBER() { return getToken(PlayPlusParser.NUMBER, 0); }
		public ExprEntNumberContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprEntNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprEntNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprEntNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntLatitudeContext extends ExprEntContext {
		public TerminalNode LATITUDE() { return getToken(PlayPlusParser.LATITUDE, 0); }
		public ExprEntLatitudeContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprEntLatitude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprEntLatitude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprEntLatitude(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntCountContext extends ExprEntContext {
		public TerminalNode COUNT() { return getToken(PlayPlusParser.COUNT, 0); }
		public TerminalNode MAP() { return getToken(PlayPlusParser.MAP, 0); }
		public TerminalNode RADIO() { return getToken(PlayPlusParser.RADIO, 0); }
		public TerminalNode RADAR() { return getToken(PlayPlusParser.RADAR, 0); }
		public TerminalNode AMMO() { return getToken(PlayPlusParser.AMMO, 0); }
		public TerminalNode FRUITS() { return getToken(PlayPlusParser.FRUITS, 0); }
		public TerminalNode SODA() { return getToken(PlayPlusParser.SODA, 0); }
		public ExprEntCountContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprEntCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprEntCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprEntCount(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntLifeContext extends ExprEntContext {
		public TerminalNode LIFE() { return getToken(PlayPlusParser.LIFE, 0); }
		public ExprEntLifeContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprEntLife(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprEntLife(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprEntLife(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntGridSizeContext extends ExprEntContext {
		public TerminalNode GRIDSIZE() { return getToken(PlayPlusParser.GRIDSIZE, 0); }
		public ExprEntGridSizeContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprEntGridSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprEntGridSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprEntGridSize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntLongitudeContext extends ExprEntContext {
		public TerminalNode LONGITUDE() { return getToken(PlayPlusParser.LONGITUDE, 0); }
		public ExprEntLongitudeContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprEntLongitude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprEntLongitude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprEntLongitude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprEntContext exprEnt() throws RecognitionException {
		ExprEntContext _localctx = new ExprEntContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprEnt);
		int _la;
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new ExprEntNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(NUMBER);
				}
				break;
			case LATITUDE:
				_localctx = new ExprEntLatitudeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(LATITUDE);
				}
				break;
			case LONGITUDE:
				_localctx = new ExprEntLongitudeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(LONGITUDE);
				}
				break;
			case GRIDSIZE:
				_localctx = new ExprEntGridSizeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(GRIDSIZE);
				}
				break;
			case MAP:
			case RADIO:
			case RADAR:
			case AMMO:
			case FRUITS:
			case SODA:
				_localctx = new ExprEntCountContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAP) | (1L << RADIO) | (1L << RADAR) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
				match(COUNT);
				}
				break;
			case LIFE:
				_localctx = new ExprEntLifeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				match(LIFE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExprCaseContext extends ParserRuleContext {
		public ExprCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCase; }
	 
		public ExprCaseContext() { }
		public void copyFrom(ExprCaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprCasePlayerContext extends ExprCaseContext {
		public TerminalNode PLAYER() { return getToken(PlayPlusParser.PLAYER, 0); }
		public ExprCasePlayerContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprCasePlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprCasePlayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprCasePlayer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseGraalContext extends ExprCaseContext {
		public TerminalNode GRAAL() { return getToken(PlayPlusParser.GRAAL, 0); }
		public ExprCaseGraalContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprCaseGraal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprCaseGraal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprCaseGraal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseAmmoContext extends ExprCaseContext {
		public TerminalNode AMMO() { return getToken(PlayPlusParser.AMMO, 0); }
		public ExprCaseAmmoContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprCaseAmmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprCaseAmmo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprCaseAmmo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseRockContext extends ExprCaseContext {
		public TerminalNode ROCK() { return getToken(PlayPlusParser.ROCK, 0); }
		public ExprCaseRockContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprCaseRock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprCaseRock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprCaseRock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseZombieContext extends ExprCaseContext {
		public TerminalNode ZOMBIE() { return getToken(PlayPlusParser.ZOMBIE, 0); }
		public ExprCaseZombieContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprCaseZombie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprCaseZombie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprCaseZombie(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseRadarContext extends ExprCaseContext {
		public TerminalNode RADAR() { return getToken(PlayPlusParser.RADAR, 0); }
		public ExprCaseRadarContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprCaseRadar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprCaseRadar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprCaseRadar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseFruitsContext extends ExprCaseContext {
		public TerminalNode FRUITS() { return getToken(PlayPlusParser.FRUITS, 0); }
		public ExprCaseFruitsContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprCaseFruits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprCaseFruits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprCaseFruits(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseVinesContext extends ExprCaseContext {
		public TerminalNode VINES() { return getToken(PlayPlusParser.VINES, 0); }
		public ExprCaseVinesContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprCaseVines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprCaseVines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprCaseVines(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseDirtContext extends ExprCaseContext {
		public TerminalNode DIRT() { return getToken(PlayPlusParser.DIRT, 0); }
		public ExprCaseDirtContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprCaseDirt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprCaseDirt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprCaseDirt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseNearbyContext extends ExprCaseContext {
		public TerminalNode NEARBY() { return getToken(PlayPlusParser.NEARBY, 0); }
		public TerminalNode LCRO() { return getToken(PlayPlusParser.LCRO, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public TerminalNode RCRO() { return getToken(PlayPlusParser.RCRO, 0); }
		public ExprCaseNearbyContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprCaseNearby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprCaseNearby(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprCaseNearby(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseSodaContext extends ExprCaseContext {
		public TerminalNode SODA() { return getToken(PlayPlusParser.SODA, 0); }
		public ExprCaseSodaContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprCaseSoda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprCaseSoda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprCaseSoda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseRadioContext extends ExprCaseContext {
		public TerminalNode RADIO() { return getToken(PlayPlusParser.RADIO, 0); }
		public ExprCaseRadioContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprCaseRadio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprCaseRadio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprCaseRadio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseMapContext extends ExprCaseContext {
		public TerminalNode MAP() { return getToken(PlayPlusParser.MAP, 0); }
		public ExprCaseMapContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprCaseMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprCaseMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprCaseMap(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseEnnemiContext extends ExprCaseContext {
		public TerminalNode ENNEMI() { return getToken(PlayPlusParser.ENNEMI, 0); }
		public ExprCaseEnnemiContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprCaseEnnemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprCaseEnnemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprCaseEnnemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCaseContext exprCase() throws RecognitionException {
		ExprCaseContext _localctx = new ExprCaseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprCase);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRT:
				_localctx = new ExprCaseDirtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(DIRT);
				}
				break;
			case ROCK:
				_localctx = new ExprCaseRockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(ROCK);
				}
				break;
			case VINES:
				_localctx = new ExprCaseVinesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(VINES);
				}
				break;
			case ZOMBIE:
				_localctx = new ExprCaseZombieContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				match(ZOMBIE);
				}
				break;
			case PLAYER:
				_localctx = new ExprCasePlayerContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				match(PLAYER);
				}
				break;
			case ENNEMI:
				_localctx = new ExprCaseEnnemiContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				match(ENNEMI);
				}
				break;
			case MAP:
				_localctx = new ExprCaseMapContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(282);
				match(MAP);
				}
				break;
			case RADIO:
				_localctx = new ExprCaseRadioContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(283);
				match(RADIO);
				}
				break;
			case RADAR:
				_localctx = new ExprCaseRadarContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(284);
				match(RADAR);
				}
				break;
			case AMMO:
				_localctx = new ExprCaseAmmoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(285);
				match(AMMO);
				}
				break;
			case FRUITS:
				_localctx = new ExprCaseFruitsContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(286);
				match(FRUITS);
				}
				break;
			case SODA:
				_localctx = new ExprCaseSodaContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(287);
				match(SODA);
				}
				break;
			case GRAAL:
				_localctx = new ExprCaseGraalContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(288);
				match(GRAAL);
				}
				break;
			case NEARBY:
				_localctx = new ExprCaseNearbyContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(289);
				match(NEARBY);
				setState(290);
				match(LCRO);
				setState(291);
				exprD(0);
				setState(292);
				match(COMMA);
				setState(293);
				exprD(0);
				setState(294);
				match(RCRO);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfThenInstrContext extends InstructionContext {
		public TerminalNode IF() { return getToken(PlayPlusParser.IF, 0); }
		public CondblockContext condblock() {
			return getRuleContext(CondblockContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PlayPlusParser.THEN, 0); }
		public TruecondblockContext truecondblock() {
			return getRuleContext(TruecondblockContext.class,0);
		}
		public TerminalNode DONE() { return getToken(PlayPlusParser.DONE, 0); }
		public IfThenInstrContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterIfThenInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitIfThenInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitIfThenInstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileInstrContext extends InstructionContext {
		public TerminalNode WHILE() { return getToken(PlayPlusParser.WHILE, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public DonewhileContext donewhile() {
			return getRuleContext(DonewhileContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public WhileInstrContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterWhileInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitWhileInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitWhileInstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComputeInstrContext extends InstructionContext {
		public TerminalNode COMPUTE() { return getToken(PlayPlusParser.COMPUTE, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public ComputeInstrContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterComputeInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitComputeInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitComputeInstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfThenElseInstrContext extends InstructionContext {
		public TerminalNode IF() { return getToken(PlayPlusParser.IF, 0); }
		public CondblockContext condblock() {
			return getRuleContext(CondblockContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PlayPlusParser.THEN, 0); }
		public TruecondblockContext truecondblock() {
			return getRuleContext(TruecondblockContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(PlayPlusParser.ELSE, 0); }
		public ElsecondblockContext elsecondblock() {
			return getRuleContext(ElsecondblockContext.class,0);
		}
		public TerminalNode DONE() { return getToken(PlayPlusParser.DONE, 0); }
		public IfThenElseInstrContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterIfThenElseInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitIfThenElseInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitIfThenElseInstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipInstrContext extends InstructionContext {
		public TerminalNode SKIPCODE() { return getToken(PlayPlusParser.SKIPCODE, 0); }
		public SkipInstrContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterSkipInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitSkipInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitSkipInstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NextInstrContext extends InstructionContext {
		public TerminalNode NEXT() { return getToken(PlayPlusParser.NEXT, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public NextInstrContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterNextInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitNextInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitNextInstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AffectInstrContext extends InstructionContext {
		public TerminalNode SET() { return getToken(PlayPlusParser.SET, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode TO() { return getToken(PlayPlusParser.TO, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public AffectInstrContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterAffectInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitAffectInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitAffectInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instruction);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new SkipInstrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(SKIPCODE);
				}
				break;
			case 2:
				_localctx = new IfThenInstrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(IF);
				setState(300);
				condblock();
				setState(301);
				match(THEN);
				setState(302);
				truecondblock();
				setState(303);
				match(DONE);
				}
				break;
			case 3:
				_localctx = new IfThenElseInstrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(IF);
				setState(306);
				condblock();
				setState(307);
				match(THEN);
				setState(308);
				truecondblock();
				setState(309);
				match(ELSE);
				setState(310);
				elsecondblock();
				setState(311);
				match(DONE);
				}
				break;
			case 4:
				_localctx = new WhileInstrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				match(WHILE);
				setState(314);
				exprD(0);
				setState(315);
				match(DO);
				setState(317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(316);
					instruction();
					}
					}
					setState(319); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (SKIPCODE - 56)) | (1L << (IF - 56)) | (1L << (WHILE - 56)) | (1L << (SET - 56)) | (1L << (COMPUTE - 56)) | (1L << (NEXT - 56)))) != 0) );
				setState(321);
				donewhile();
				}
				break;
			case 5:
				_localctx = new AffectInstrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				match(SET);
				setState(324);
				exprG();
				setState(325);
				match(TO);
				setState(326);
				exprD(0);
				}
				break;
			case 6:
				_localctx = new ComputeInstrContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(328);
				match(COMPUTE);
				setState(329);
				exprD(0);
				}
				break;
			case 7:
				_localctx = new NextInstrContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(330);
				match(NEXT);
				setState(331);
				action();
				}
				break;
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

	public static class DonewhileContext extends ParserRuleContext {
		public DonewhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_donewhile; }
	 
		public DonewhileContext() { }
		public void copyFrom(DonewhileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsideDoneWhileContext extends DonewhileContext {
		public TerminalNode DONE() { return getToken(PlayPlusParser.DONE, 0); }
		public InsideDoneWhileContext(DonewhileContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInsideDoneWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInsideDoneWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInsideDoneWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DonewhileContext donewhile() throws RecognitionException {
		DonewhileContext _localctx = new DonewhileContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_donewhile);
		try {
			_localctx = new InsideDoneWhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(DONE);
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

	public static class CondblockContext extends ParserRuleContext {
		public CondblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condblock; }
	 
		public CondblockContext() { }
		public void copyFrom(CondblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfcondblockContext extends CondblockContext {
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public IfcondblockContext(CondblockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterIfcondblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitIfcondblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitIfcondblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondblockContext condblock() throws RecognitionException {
		CondblockContext _localctx = new CondblockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condblock);
		try {
			_localctx = new IfcondblockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			exprD(0);
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

	public static class TruecondblockContext extends ParserRuleContext {
		public TruecondblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truecondblock; }
	 
		public TruecondblockContext() { }
		public void copyFrom(TruecondblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IftruecondblockContext extends TruecondblockContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public IftruecondblockContext(TruecondblockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterIftruecondblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitIftruecondblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitIftruecondblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruecondblockContext truecondblock() throws RecognitionException {
		TruecondblockContext _localctx = new TruecondblockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_truecondblock);
		int _la;
		try {
			_localctx = new IftruecondblockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(339); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(338);
				instruction();
				}
				}
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (SKIPCODE - 56)) | (1L << (IF - 56)) | (1L << (WHILE - 56)) | (1L << (SET - 56)) | (1L << (COMPUTE - 56)) | (1L << (NEXT - 56)))) != 0) );
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

	public static class ElsecondblockContext extends ParserRuleContext {
		public ElsecondblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsecondblock; }
	 
		public ElsecondblockContext() { }
		public void copyFrom(ElsecondblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfelsecondblockContext extends ElsecondblockContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public IfelsecondblockContext(ElsecondblockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterIfelsecondblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitIfelsecondblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitIfelsecondblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsecondblockContext elsecondblock() throws RecognitionException {
		ElsecondblockContext _localctx = new ElsecondblockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elsecondblock);
		int _la;
		try {
			_localctx = new IfelsecondblockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(344); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(343);
				instruction();
				}
				}
				setState(346); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (SKIPCODE - 56)) | (1L << (IF - 56)) | (1L << (WHILE - 56)) | (1L << (SET - 56)) | (1L << (COMPUTE - 56)) | (1L << (NEXT - 56)))) != 0) );
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

	public static class ActionContext extends ParserRuleContext {
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	 
		public ActionContext() { }
		public void copyFrom(ActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActionUseContext extends ActionContext {
		public TerminalNode USE() { return getToken(PlayPlusParser.USE, 0); }
		public TerminalNode MAP() { return getToken(PlayPlusParser.MAP, 0); }
		public TerminalNode RADIO() { return getToken(PlayPlusParser.RADIO, 0); }
		public TerminalNode RADAR() { return getToken(PlayPlusParser.RADAR, 0); }
		public TerminalNode FRUITS() { return getToken(PlayPlusParser.FRUITS, 0); }
		public TerminalNode SODA() { return getToken(PlayPlusParser.SODA, 0); }
		public ActionUseContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterActionUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitActionUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitActionUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActionDoNothingContext extends ActionContext {
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public TerminalNode NOTHING() { return getToken(PlayPlusParser.NOTHING, 0); }
		public ActionDoNothingContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterActionDoNothing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitActionDoNothing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitActionDoNothing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActionMoveContext extends ActionContext {
		public TerminalNode MOVE() { return getToken(PlayPlusParser.MOVE, 0); }
		public TerminalNode NORTH() { return getToken(PlayPlusParser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(PlayPlusParser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(PlayPlusParser.EAST, 0); }
		public TerminalNode WEST() { return getToken(PlayPlusParser.WEST, 0); }
		public ActionMoveContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterActionMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitActionMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitActionMove(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActionShootContext extends ActionContext {
		public TerminalNode SHOOT() { return getToken(PlayPlusParser.SHOOT, 0); }
		public TerminalNode NORTH() { return getToken(PlayPlusParser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(PlayPlusParser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(PlayPlusParser.EAST, 0); }
		public TerminalNode WEST() { return getToken(PlayPlusParser.WEST, 0); }
		public ActionShootContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterActionShoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitActionShoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitActionShoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_action);
		int _la;
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				_localctx = new ActionMoveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(MOVE);
				setState(349);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SHOOT:
				_localctx = new ActionShootContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(SHOOT);
				setState(351);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case USE:
				_localctx = new ActionUseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				match(USE);
				setState(353);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAP) | (1L << RADIO) | (1L << RADAR) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DO:
				_localctx = new ActionDoNothingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				match(DO);
				setState(355);
				match(NOTHING);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FctdeclContext extends ParserRuleContext {
		public FctdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fctdecl; }
	 
		public FctdeclContext() { }
		public void copyFrom(FctdeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FctdeclInstrContext extends FctdeclContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TerminalNode FUNCTION() { return getToken(PlayPlusParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public TerminalNode DOUBLEPOINT() { return getToken(PlayPlusParser.DOUBLEPOINT, 0); }
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public FdeclreturnContext fdeclreturn() {
			return getRuleContext(FdeclreturnContext.class,0);
		}
		public TerminalNode DONE() { return getToken(PlayPlusParser.DONE, 0); }
		public TerminalNode SCALAR() { return getToken(PlayPlusParser.SCALAR, 0); }
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public TerminalNode DECLARE() { return getToken(PlayPlusParser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(PlayPlusParser.LOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public List<TerminalNode> POINTVIRGULE() { return getTokens(PlayPlusParser.POINTVIRGULE); }
		public TerminalNode POINTVIRGULE(int i) {
			return getToken(PlayPlusParser.POINTVIRGULE, i);
		}
		public FctdeclInstrContext(FctdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFctdeclInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFctdeclInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFctdeclInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FctdeclContext fctdecl() throws RecognitionException {
		FctdeclContext _localctx = new FctdeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fctdecl);
		int _la;
		try {
			_localctx = new FctdeclInstrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(ID);
			setState(359);
			match(AS);
			setState(360);
			match(FUNCTION);
			setState(361);
			match(LPAR);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(362);
				vardecl();
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(363);
					match(COMMA);
					setState(364);
					vardecl();
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(372);
			match(RPAR);
			setState(373);
			match(DOUBLEPOINT);
			setState(374);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==SCALAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(375);
				match(DECLARE);
				setState(376);
				match(LOCAL);
				setState(380); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(377);
					vardecl();
					setState(378);
					match(POINTVIRGULE);
					}
					}
					setState(382); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(386);
			match(DO);
			setState(388); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(387);
				instruction();
				}
				}
				setState(390); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (SKIPCODE - 56)) | (1L << (IF - 56)) | (1L << (WHILE - 56)) | (1L << (SET - 56)) | (1L << (COMPUTE - 56)) | (1L << (NEXT - 56)))) != 0) );
			setState(392);
			fdeclreturn();
			setState(393);
			match(DONE);
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

	public static class FdeclreturnContext extends ParserRuleContext {
		public FdeclreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fdeclreturn; }
	 
		public FdeclreturnContext() { }
		public void copyFrom(FdeclreturnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FctdeclreturnContext extends FdeclreturnContext {
		public TerminalNode RETURN() { return getToken(PlayPlusParser.RETURN, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
		public FctdeclreturnContext(FdeclreturnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFctdeclreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFctdeclreturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFctdeclreturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FdeclreturnContext fdeclreturn() throws RecognitionException {
		FdeclreturnContext _localctx = new FdeclreturnContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fdeclreturn);
		try {
			_localctx = new FctdeclreturnContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(RETURN);
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case PLUS:
			case MINUS:
			case NOT:
			case TRUE:
			case FALSE:
			case ENNEMI:
			case GRAAL:
			case LATITUDE:
			case LONGITUDE:
			case GRIDSIZE:
			case MAP:
			case RADIO:
			case RADAR:
			case AMMO:
			case FRUITS:
			case SODA:
			case LIFE:
			case DIRT:
			case ROCK:
			case VINES:
			case ZOMBIE:
			case PLAYER:
			case NEARBY:
			case ID:
			case NUMBER:
				{
				setState(396);
				exprD(0);
				}
				break;
			case VOID:
				{
				setState(397);
				match(VOID);
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

	public static class ImpdeclContext extends ParserRuleContext {
		public ImpdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impdecl; }
	 
		public ImpdeclContext() { }
		public void copyFrom(ImpdeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImportInstrContext extends ImpdeclContext {
		public TerminalNode IMPORT() { return getToken(PlayPlusParser.IMPORT, 0); }
		public FiledeclContext filedecl() {
			return getRuleContext(FiledeclContext.class,0);
		}
		public ImportInstrContext(ImpdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterImportInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitImportInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitImportInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpdeclContext impdecl() throws RecognitionException {
		ImpdeclContext _localctx = new ImpdeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_impdecl);
		try {
			_localctx = new ImportInstrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(IMPORT);
			setState(401);
			filedecl();
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

	public static class FiledeclContext extends ParserRuleContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public TerminalNode EXTWLD() { return getToken(PlayPlusParser.EXTWLD, 0); }
		public FiledeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filedecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFiledecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFiledecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFiledecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FiledeclContext filedecl() throws RecognitionException {
		FiledeclContext _localctx = new FiledeclContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_filedecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			filename();
			setState(404);
			match(EXTWLD);
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

	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return exprD_sempred((ExprDContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprD_sempred(ExprDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3T\u019b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\5\29\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"B\n\3\f\3\16\3E\13\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\5\4S\n\4\3\4\3\4\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\4\3"+
		"\4\7\4c\n\4\f\4\16\4f\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5q\n"+
		"\5\r\5\16\5r\5\5u\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\6\7~\n\7\r\7\16\7\177"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u0089\n\b\r\b\16\b\u008a\5\b\u008d\n"+
		"\b\3\b\3\b\6\b\u0091\n\b\r\b\16\b\u0092\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\5\13\u009f\n\13\3\f\3\f\3\f\6\f\u00a4\n\f\r\f\16\f\u00a5"+
		"\3\f\3\f\6\f\u00aa\n\f\r\f\16\f\u00ab\5\f\u00ae\n\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u00c7\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d1\n\r\f\r\16"+
		"\r\u00d4\13\r\5\r\u00d6\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u00dd\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fd\n\r\f\r\16\r\u0100"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0108\n\16\3\16\3\16\5\16\u010c"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0115\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u012b\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u0140\n\21"+
		"\r\21\16\21\u0141\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u014f\n\21\3\22\3\22\3\23\3\23\3\24\6\24\u0156\n\24\r\24\16\24"+
		"\u0157\3\25\6\25\u015b\n\25\r\25\16\25\u015c\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0167\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27"+
		"\u0170\n\27\f\27\16\27\u0173\13\27\5\27\u0175\n\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\6\27\u017f\n\27\r\27\16\27\u0180\5\27\u0183\n\27"+
		"\3\27\3\27\6\27\u0187\n\27\r\27\16\27\u0188\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\5\30\u0191\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\2\3\30"+
		"\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\7\3\2\24"+
		"\25\3\2\"%\3\2,\61\4\2,.\60\61\4\2HHMM\u01d2\28\3\2\2\2\4:\3\2\2\2\6N"+
		"\3\2\2\2\bi\3\2\2\2\nz\3\2\2\2\f}\3\2\2\2\16\u0081\3\2\2\2\20\u0096\3"+
		"\2\2\2\22\u0098\3\2\2\2\24\u009e\3\2\2\2\26\u00a0\3\2\2\2\30\u00dc\3\2"+
		"\2\2\32\u010b\3\2\2\2\34\u0114\3\2\2\2\36\u012a\3\2\2\2 \u014e\3\2\2\2"+
		"\"\u0150\3\2\2\2$\u0152\3\2\2\2&\u0155\3\2\2\2(\u015a\3\2\2\2*\u0166\3"+
		"\2\2\2,\u0168\3\2\2\2.\u018d\3\2\2\2\60\u0192\3\2\2\2\62\u0195\3\2\2\2"+
		"\64\u0198\3\2\2\2\669\5\4\3\2\679\5\6\4\28\66\3\2\2\28\67\3\2\2\29\3\3"+
		"\2\2\2:;\7\5\2\2;<\7\6\2\2<C\7\7\2\2=>\5\22\n\2>?\7\27\2\2?B\3\2\2\2@"+
		"B\5,\27\2A=\3\2\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DI\3\2\2\2"+
		"EC\3\2\2\2FH\5 \21\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2"+
		"KI\3\2\2\2LM\5\16\b\2M\5\3\2\2\2NO\7\5\2\2OP\7\6\2\2PR\7\7\2\2QS\5\60"+
		"\31\2RQ\3\2\2\2RS\3\2\2\2S[\3\2\2\2TU\5\22\n\2UV\7\27\2\2VZ\3\2\2\2WZ"+
		"\5,\27\2XZ\5\60\31\2YT\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2"+
		"[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\n\2\2_`\7\b\2\2`d\7\t\2\2ac\5\b\5"+
		"\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\5\16"+
		"\b\2h\7\3\2\2\2ij\7\n\2\2jt\5\n\6\2kl\7\5\2\2lp\7\13\2\2mn\5\22\n\2no"+
		"\7\27\2\2oq\3\2\2\2pm\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2"+
		"tk\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\r\2\2wx\5\f\7\2xy\7\16\2\2y\t\3\2\2"+
		"\2z{\5\30\r\2{\13\3\2\2\2|~\5 \21\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\r\3\2\2\2\u0081\u0082\7\3\2\2\u0082\u008c\7"+
		"\4\2\2\u0083\u0084\7\5\2\2\u0084\u0088\7\13\2\2\u0085\u0086\5\22\n\2\u0086"+
		"\u0087\7\27\2\2\u0087\u0089\3\2\2\2\u0088\u0085\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u0083\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\7\r"+
		"\2\2\u008f\u0091\5 \21\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\5\20"+
		"\t\2\u0095\17\3\2\2\2\u0096\u0097\7\16\2\2\u0097\21\3\2\2\2\u0098\u0099"+
		"\7N\2\2\u0099\u009a\7\f\2\2\u009a\u009b\5\24\13\2\u009b\23\3\2\2\2\u009c"+
		"\u009f\7M\2\2\u009d\u009f\5\26\f\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2"+
		"\2\2\u009f\25\3\2\2\2\u00a0\u00a1\7M\2\2\u00a1\u00a3\7\21\2\2\u00a2\u00a4"+
		"\7P\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00ad\3\2\2\2\u00a7\u00a9\7\23\2\2\u00a8\u00aa\7"+
		"P\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7\22\2\2\u00b0\27\3\2\2\2\u00b1\u00b2"+
		"\b\r\1\2\u00b2\u00dd\5\34\17\2\u00b3\u00b4\t\2\2\2\u00b4\u00dd\5\30\r"+
		"\30\u00b5\u00b6\7\37\2\2\u00b6\u00dd\5\30\r\27\u00b7\u00dd\7 \2\2\u00b8"+
		"\u00dd\7!\2\2\u00b9\u00ba\7&\2\2\u00ba\u00bb\7(\2\2\u00bb\u00dd\t\3\2"+
		"\2\u00bc\u00bd\7\'\2\2\u00bd\u00be\7(\2\2\u00be\u00dd\t\3\2\2\u00bf\u00dd"+
		"\5\36\20\2\u00c0\u00dd\7N\2\2\u00c1\u00c2\7N\2\2\u00c2\u00c3\7\21\2\2"+
		"\u00c3\u00c6\5\30\r\2\u00c4\u00c5\7\23\2\2\u00c5\u00c7\5\30\r\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\22"+
		"\2\2\u00c9\u00dd\3\2\2\2\u00ca\u00dd\5\32\16\2\u00cb\u00cc\7N\2\2\u00cc"+
		"\u00d5\7\17\2\2\u00cd\u00d2\5\30\r\2\u00ce\u00cf\7\23\2\2\u00cf\u00d1"+
		"\5\30\r\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00cd"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00dd\7\20\2\2"+
		"\u00d8\u00d9\7\17\2\2\u00d9\u00da\5\30\r\2\u00da\u00db\7\20\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00b1\3\2\2\2\u00dc\u00b3\3\2\2\2\u00dc\u00b5\3\2"+
		"\2\2\u00dc\u00b7\3\2\2\2\u00dc\u00b8\3\2\2\2\u00dc\u00b9\3\2\2\2\u00dc"+
		"\u00bc\3\2\2\2\u00dc\u00bf\3\2\2\2\u00dc\u00c0\3\2\2\2\u00dc\u00c1\3\2"+
		"\2\2\u00dc\u00ca\3\2\2\2\u00dc\u00cb\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd"+
		"\u00fe\3\2\2\2\u00de\u00df\f\f\2\2\u00df\u00e0\7\32\2\2\u00e0\u00fd\5"+
		"\30\r\r\u00e1\u00e2\f\13\2\2\u00e2\u00e3\7\30\2\2\u00e3\u00fd\5\30\r\f"+
		"\u00e4\u00e5\f\n\2\2\u00e5\u00e6\7\31\2\2\u00e6\u00fd\5\30\r\13\u00e7"+
		"\u00e8\f\t\2\2\u00e8\u00e9\7\24\2\2\u00e9\u00fd\5\30\r\n\u00ea\u00eb\f"+
		"\b\2\2\u00eb\u00ec\7\25\2\2\u00ec\u00fd\5\30\r\t\u00ed\u00ee\f\7\2\2\u00ee"+
		"\u00ef\7\36\2\2\u00ef\u00fd\5\30\r\b\u00f0\u00f1\f\6\2\2\u00f1\u00f2\7"+
		"\34\2\2\u00f2\u00fd\5\30\r\7\u00f3\u00f4\f\5\2\2\u00f4\u00f5\7\35\2\2"+
		"\u00f5\u00fd\5\30\r\6\u00f6\u00f7\f\4\2\2\u00f7\u00f8\7\6\2\2\u00f8\u00fd"+
		"\5\30\r\5\u00f9\u00fa\f\3\2\2\u00fa\u00fb\7\33\2\2\u00fb\u00fd\5\30\r"+
		"\4\u00fc\u00de\3\2\2\2\u00fc\u00e1\3\2\2\2\u00fc\u00e4\3\2\2\2\u00fc\u00e7"+
		"\3\2\2\2\u00fc\u00ea\3\2\2\2\u00fc\u00ed\3\2\2\2\u00fc\u00f0\3\2\2\2\u00fc"+
		"\u00f3\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd\u0100\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\31\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0101\u010c\7N\2\2\u0102\u0103\7N\2\2\u0103\u0104\7\21\2\2\u0104"+
		"\u0107\5\30\r\2\u0105\u0106\7\23\2\2\u0106\u0108\5\30\r\2\u0107\u0105"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7\22\2\2"+
		"\u010a\u010c\3\2\2\2\u010b\u0101\3\2\2\2\u010b\u0102\3\2\2\2\u010c\33"+
		"\3\2\2\2\u010d\u0115\7P\2\2\u010e\u0115\7)\2\2\u010f\u0115\7*\2\2\u0110"+
		"\u0115\7+\2\2\u0111\u0112\t\4\2\2\u0112\u0115\7\62\2\2\u0113\u0115\7\63"+
		"\2\2\u0114\u010d\3\2\2\2\u0114\u010e\3\2\2\2\u0114\u010f\3\2\2\2\u0114"+
		"\u0110\3\2\2\2\u0114\u0111\3\2\2\2\u0114\u0113\3\2\2\2\u0115\35\3\2\2"+
		"\2\u0116\u012b\7\64\2\2\u0117\u012b\7\65\2\2\u0118\u012b\7\66\2\2\u0119"+
		"\u012b\7\67\2\2\u011a\u012b\78\2\2\u011b\u012b\7&\2\2\u011c\u012b\7,\2"+
		"\2\u011d\u012b\7-\2\2\u011e\u012b\7.\2\2\u011f\u012b\7/\2\2\u0120\u012b"+
		"\7\60\2\2\u0121\u012b\7\61\2\2\u0122\u012b\7\'\2\2\u0123\u0124\79\2\2"+
		"\u0124\u0125\7\21\2\2\u0125\u0126\5\30\r\2\u0126\u0127\7\23\2\2\u0127"+
		"\u0128\5\30\r\2\u0128\u0129\7\22\2\2\u0129\u012b\3\2\2\2\u012a\u0116\3"+
		"\2\2\2\u012a\u0117\3\2\2\2\u012a\u0118\3\2\2\2\u012a\u0119\3\2\2\2\u012a"+
		"\u011a\3\2\2\2\u012a\u011b\3\2\2\2\u012a\u011c\3\2\2\2\u012a\u011d\3\2"+
		"\2\2\u012a\u011e\3\2\2\2\u012a\u011f\3\2\2\2\u012a\u0120\3\2\2\2\u012a"+
		"\u0121\3\2\2\2\u012a\u0122\3\2\2\2\u012a\u0123\3\2\2\2\u012b\37\3\2\2"+
		"\2\u012c\u014f\7:\2\2\u012d\u012e\7;\2\2\u012e\u012f\5$\23\2\u012f\u0130"+
		"\7<\2\2\u0130\u0131\5&\24\2\u0131\u0132\7\16\2\2\u0132\u014f\3\2\2\2\u0133"+
		"\u0134\7;\2\2\u0134\u0135\5$\23\2\u0135\u0136\7<\2\2\u0136\u0137\5&\24"+
		"\2\u0137\u0138\7=\2\2\u0138\u0139\5(\25\2\u0139\u013a\7\16\2\2\u013a\u014f"+
		"\3\2\2\2\u013b\u013c\7>\2\2\u013c\u013d\5\30\r\2\u013d\u013f\7\r\2\2\u013e"+
		"\u0140\5 \21\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\5\"\22\2\u0144"+
		"\u014f\3\2\2\2\u0145\u0146\7?\2\2\u0146\u0147\5\32\16\2\u0147\u0148\7"+
		"@\2\2\u0148\u0149\5\30\r\2\u0149\u014f\3\2\2\2\u014a\u014b\7A\2\2\u014b"+
		"\u014f\5\30\r\2\u014c\u014d\7B\2\2\u014d\u014f\5*\26\2\u014e\u012c\3\2"+
		"\2\2\u014e\u012d\3\2\2\2\u014e\u0133\3\2\2\2\u014e\u013b\3\2\2\2\u014e"+
		"\u0145\3\2\2\2\u014e\u014a\3\2\2\2\u014e\u014c\3\2\2\2\u014f!\3\2\2\2"+
		"\u0150\u0151\7\16\2\2\u0151#\3\2\2\2\u0152\u0153\5\30\r\2\u0153%\3\2\2"+
		"\2\u0154\u0156\5 \21\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0158\'\3\2\2\2\u0159\u015b\5 \21\2\u015a"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d)\3\2\2\2\u015e\u015f\7C\2\2\u015f\u0167\t\3\2\2\u0160\u0161"+
		"\7D\2\2\u0161\u0167\t\3\2\2\u0162\u0163\7E\2\2\u0163\u0167\t\5\2\2\u0164"+
		"\u0165\7\r\2\2\u0165\u0167\7F\2\2\u0166\u015e\3\2\2\2\u0166\u0160\3\2"+
		"\2\2\u0166\u0162\3\2\2\2\u0166\u0164\3\2\2\2\u0167+\3\2\2\2\u0168\u0169"+
		"\7N\2\2\u0169\u016a\7\f\2\2\u016a\u016b\7G\2\2\u016b\u0174\7\17\2\2\u016c"+
		"\u0171\5\22\n\2\u016d\u016e\7\23\2\2\u016e\u0170\5\22\n\2\u016f\u016d"+
		"\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u016c\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176\u0177\7\20\2\2\u0177\u0178\7K\2\2\u0178"+
		"\u0182\t\6\2\2\u0179\u017a\7\5\2\2\u017a\u017e\7\13\2\2\u017b\u017c\5"+
		"\22\n\2\u017c\u017d\7\27\2\2\u017d\u017f\3\2\2\2\u017e\u017b\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2"+
		"\2\2\u0182\u0179\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0186\7\r\2\2\u0185\u0187\5 \21\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\5.\30\2\u018b\u018c\7\16\2\2\u018c-\3\2\2\2\u018d\u0190\7I\2\2"+
		"\u018e\u0191\5\30\r\2\u018f\u0191\7H\2\2\u0190\u018e\3\2\2\2\u0190\u018f"+
		"\3\2\2\2\u0191/\3\2\2\2\u0192\u0193\7L\2\2\u0193\u0194\5\62\32\2\u0194"+
		"\61\3\2\2\2\u0195\u0196\5\64\33\2\u0196\u0197\7J\2\2\u0197\63\3\2\2\2"+
		"\u0198\u0199\7N\2\2\u0199\65\3\2\2\2)8ACIRY[drt\177\u008a\u008c\u0092"+
		"\u009e\u00a5\u00ab\u00ad\u00c6\u00d2\u00d5\u00dc\u00fc\u00fe\u0107\u010b"+
		"\u0114\u012a\u0141\u014e\u0157\u015c\u0166\u0171\u0174\u0180\u0182\u0188"+
		"\u0190";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}