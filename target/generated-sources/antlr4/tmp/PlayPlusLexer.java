// Generated from tmp\PlayPlus.g4 by ANTLR 4.6
package tmp;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BY", "DEFAULT", "DECLARE", "AND", "RETAIN", "YOUR", "TURN", "WHEN", "LOCAL", 
		"AS", "DO", "DONE", "LPAR", "RPAR", "LCRO", "RCRO", "COMMA", "PLUS", "MINUS", 
		"POINT", "POINTVIRGULE", "DIVIDE", "MODULO", "TIMES", "OR", "INF", "SUP", 
		"EQUAL", "NOT", "TRUE", "FALSE", "NORTH", "SOUTH", "EAST", "WEST", "ENNEMI", 
		"GRAAL", "IS", "LATITUDE", "LONGITUDE", "GRIDSIZE", "MAP", "RADIO", "RADAR", 
		"AMMO", "FRUITS", "SODA", "COUNT", "LIFE", "DIRT", "ROCK", "VINES", "ZOMBIE", 
		"PLAYER", "NEARBY", "SKIPCODE", "IF", "THEN", "ELSE", "WHILE", "SET", 
		"TO", "COMPUTE", "NEXT", "MOVE", "SHOOT", "USE", "NOTHING", "FUNCTION", 
		"VOID", "RETURN", "EXTWLD", "DOUBLEPOINT", "IMPORT", "SCALAR", "ID", "VARDECL", 
		"NUMBER", "LETTER", "DIGIT", "COMMENT_UNELIGNE", "COMMENT", "NEWLINE", 
		"WS"
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


	public PlayPlusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlayPlus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2T\u026e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!"+
		"\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/"+
		"\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\3"+
		"9\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3"+
		">\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3"+
		"C\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3J\3J\3K\3"+
		"K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\5L\u0228\nL\3M\3M\3M\7M\u022d\nM\fM\16M\u0230\13M\3N\3N\3N\7N"+
		"\u0235\nN\fN\16N\u0238\13N\3O\6O\u023b\nO\rO\16O\u023c\3P\3P\3Q\3Q\3R"+
		"\3R\3R\3R\7R\u0247\nR\fR\16R\u024a\13R\3R\5R\u024d\nR\3R\3R\3R\3R\3S\3"+
		"S\3S\3S\7S\u0257\nS\fS\16S\u025a\13S\3S\3S\3S\3S\3S\3T\5T\u0262\nT\3T"+
		"\3T\3T\3T\3U\6U\u0269\nU\rU\16U\u026a\3U\3U\4\u0248\u0258\2V\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f\2\u00a1\2\u00a3Q\u00a5"+
		"R\u00a7S\u00a9T\3\2\4\4\2C\\c|\4\2\13\13\"\"\u0277\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\3\u00ab\3\2\2\2\5\u00ae\3\2\2\2\7\u00b6"+
		"\3\2\2\2\t\u00be\3\2\2\2\13\u00c2\3\2\2\2\r\u00c9\3\2\2\2\17\u00ce\3\2"+
		"\2\2\21\u00d3\3\2\2\2\23\u00d8\3\2\2\2\25\u00de\3\2\2\2\27\u00e1\3\2\2"+
		"\2\31\u00e4\3\2\2\2\33\u00e9\3\2\2\2\35\u00eb\3\2\2\2\37\u00ed\3\2\2\2"+
		"!\u00ef\3\2\2\2#\u00f1\3\2\2\2%\u00f3\3\2\2\2\'\u00f5\3\2\2\2)\u00f7\3"+
		"\2\2\2+\u00f9\3\2\2\2-\u00fb\3\2\2\2/\u00fd\3\2\2\2\61\u00ff\3\2\2\2\63"+
		"\u0101\3\2\2\2\65\u0104\3\2\2\2\67\u0106\3\2\2\29\u0108\3\2\2\2;\u010a"+
		"\3\2\2\2=\u010e\3\2\2\2?\u0113\3\2\2\2A\u0119\3\2\2\2C\u011f\3\2\2\2E"+
		"\u0125\3\2\2\2G\u012a\3\2\2\2I\u012f\3\2\2\2K\u0136\3\2\2\2M\u013c\3\2"+
		"\2\2O\u013f\3\2\2\2Q\u0148\3\2\2\2S\u0152\3\2\2\2U\u015c\3\2\2\2W\u0160"+
		"\3\2\2\2Y\u0166\3\2\2\2[\u016c\3\2\2\2]\u0171\3\2\2\2_\u0178\3\2\2\2a"+
		"\u017d\3\2\2\2c\u0183\3\2\2\2e\u0188\3\2\2\2g\u018d\3\2\2\2i\u0192\3\2"+
		"\2\2k\u0198\3\2\2\2m\u019f\3\2\2\2o\u01a6\3\2\2\2q\u01ad\3\2\2\2s\u01b2"+
		"\3\2\2\2u\u01b5\3\2\2\2w\u01ba\3\2\2\2y\u01bf\3\2\2\2{\u01c5\3\2\2\2}"+
		"\u01c9\3\2\2\2\177\u01cc\3\2\2\2\u0081\u01d4\3\2\2\2\u0083\u01d9\3\2\2"+
		"\2\u0085\u01de\3\2\2\2\u0087\u01e4\3\2\2\2\u0089\u01e8\3\2\2\2\u008b\u01f0"+
		"\3\2\2\2\u008d\u01f9\3\2\2\2\u008f\u01fe\3\2\2\2\u0091\u0205\3\2\2\2\u0093"+
		"\u020a\3\2\2\2\u0095\u020c\3\2\2\2\u0097\u0227\3\2\2\2\u0099\u0229\3\2"+
		"\2\2\u009b\u0231\3\2\2\2\u009d\u023a\3\2\2\2\u009f\u023e\3\2\2\2\u00a1"+
		"\u0240\3\2\2\2\u00a3\u0242\3\2\2\2\u00a5\u0252\3\2\2\2\u00a7\u0261\3\2"+
		"\2\2\u00a9\u0268\3\2\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7{\2\2\u00ad\4"+
		"\3\2\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7h\2\2\u00b1"+
		"\u00b2\7c\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7v\2\2"+
		"\u00b5\6\3\2\2\2\u00b6\u00b7\7f\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7e"+
		"\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd"+
		"\7g\2\2\u00bd\b\3\2\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1"+
		"\7f\2\2\u00c1\n\3\2\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5"+
		"\7v\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8"+
		"\f\3\2\2\2\u00c9\u00ca\7{\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7w\2\2\u00cc"+
		"\u00cd\7t\2\2\u00cd\16\3\2\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7w\2\2\u00d0"+
		"\u00d1\7t\2\2\u00d1\u00d2\7p\2\2\u00d2\20\3\2\2\2\u00d3\u00d4\7y\2\2\u00d4"+
		"\u00d5\7j\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7p\2\2\u00d7\22\3\2\2\2\u00d8"+
		"\u00d9\7n\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7c\2\2"+
		"\u00dc\u00dd\7n\2\2\u00dd\24\3\2\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7"+
		"u\2\2\u00e0\26\3\2\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7q\2\2\u00e3\30"+
		"\3\2\2\2\u00e4\u00e5\7f\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7p\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8\32\3\2\2\2\u00e9\u00ea\7*\2\2\u00ea\34\3\2\2\2\u00eb"+
		"\u00ec\7+\2\2\u00ec\36\3\2\2\2\u00ed\u00ee\7]\2\2\u00ee \3\2\2\2\u00ef"+
		"\u00f0\7_\2\2\u00f0\"\3\2\2\2\u00f1\u00f2\7.\2\2\u00f2$\3\2\2\2\u00f3"+
		"\u00f4\7-\2\2\u00f4&\3\2\2\2\u00f5\u00f6\7/\2\2\u00f6(\3\2\2\2\u00f7\u00f8"+
		"\7\60\2\2\u00f8*\3\2\2\2\u00f9\u00fa\7=\2\2\u00fa,\3\2\2\2\u00fb\u00fc"+
		"\7\61\2\2\u00fc.\3\2\2\2\u00fd\u00fe\7\'\2\2\u00fe\60\3\2\2\2\u00ff\u0100"+
		"\7,\2\2\u0100\62\3\2\2\2\u0101\u0102\7q\2\2\u0102\u0103\7t\2\2\u0103\64"+
		"\3\2\2\2\u0104\u0105\7>\2\2\u0105\66\3\2\2\2\u0106\u0107\7@\2\2\u0107"+
		"8\3\2\2\2\u0108\u0109\7?\2\2\u0109:\3\2\2\2\u010a\u010b\7p\2\2\u010b\u010c"+
		"\7q\2\2\u010c\u010d\7v\2\2\u010d<\3\2\2\2\u010e\u010f\7v\2\2\u010f\u0110"+
		"\7t\2\2\u0110\u0111\7w\2\2\u0111\u0112\7g\2\2\u0112>\3\2\2\2\u0113\u0114"+
		"\7h\2\2\u0114\u0115\7c\2\2\u0115\u0116\7n\2\2\u0116\u0117\7u\2\2\u0117"+
		"\u0118\7g\2\2\u0118@\3\2\2\2\u0119\u011a\7p\2\2\u011a\u011b\7q\2\2\u011b"+
		"\u011c\7t\2\2\u011c\u011d\7v\2\2\u011d\u011e\7j\2\2\u011eB\3\2\2\2\u011f"+
		"\u0120\7u\2\2\u0120\u0121\7q\2\2\u0121\u0122\7w\2\2\u0122\u0123\7v\2\2"+
		"\u0123\u0124\7j\2\2\u0124D\3\2\2\2\u0125\u0126\7g\2\2\u0126\u0127\7c\2"+
		"\2\u0127\u0128\7u\2\2\u0128\u0129\7v\2\2\u0129F\3\2\2\2\u012a\u012b\7"+
		"y\2\2\u012b\u012c\7g\2\2\u012c\u012d\7u\2\2\u012d\u012e\7v\2\2\u012eH"+
		"\3\2\2\2\u012f\u0130\7g\2\2\u0130\u0131\7p\2\2\u0131\u0132\7p\2\2\u0132"+
		"\u0133\7g\2\2\u0133\u0134\7o\2\2\u0134\u0135\7k\2\2\u0135J\3\2\2\2\u0136"+
		"\u0137\7i\2\2\u0137\u0138\7t\2\2\u0138\u0139\7c\2\2\u0139\u013a\7c\2\2"+
		"\u013a\u013b\7n\2\2\u013bL\3\2\2\2\u013c\u013d\7k\2\2\u013d\u013e\7u\2"+
		"\2\u013eN\3\2\2\2\u013f\u0140\7n\2\2\u0140\u0141\7c\2\2\u0141\u0142\7"+
		"v\2\2\u0142\u0143\7k\2\2\u0143\u0144\7v\2\2\u0144\u0145\7w\2\2\u0145\u0146"+
		"\7f\2\2\u0146\u0147\7g\2\2\u0147P\3\2\2\2\u0148\u0149\7n\2\2\u0149\u014a"+
		"\7q\2\2\u014a\u014b\7p\2\2\u014b\u014c\7i\2\2\u014c\u014d\7k\2\2\u014d"+
		"\u014e\7v\2\2\u014e\u014f\7w\2\2\u014f\u0150\7f\2\2\u0150\u0151\7g\2\2"+
		"\u0151R\3\2\2\2\u0152\u0153\7i\2\2\u0153\u0154\7t\2\2\u0154\u0155\7k\2"+
		"\2\u0155\u0156\7f\2\2\u0156\u0157\7\"\2\2\u0157\u0158\7u\2\2\u0158\u0159"+
		"\7k\2\2\u0159\u015a\7|\2\2\u015a\u015b\7g\2\2\u015bT\3\2\2\2\u015c\u015d"+
		"\7o\2\2\u015d\u015e\7c\2\2\u015e\u015f\7r\2\2\u015fV\3\2\2\2\u0160\u0161"+
		"\7t\2\2\u0161\u0162\7c\2\2\u0162\u0163\7f\2\2\u0163\u0164\7k\2\2\u0164"+
		"\u0165\7q\2\2\u0165X\3\2\2\2\u0166\u0167\7t\2\2\u0167\u0168\7c\2\2\u0168"+
		"\u0169\7f\2\2\u0169\u016a\7c\2\2\u016a\u016b\7t\2\2\u016bZ\3\2\2\2\u016c"+
		"\u016d\7c\2\2\u016d\u016e\7o\2\2\u016e\u016f\7o\2\2\u016f\u0170\7q\2\2"+
		"\u0170\\\3\2\2\2\u0171\u0172\7h\2\2\u0172\u0173\7t\2\2\u0173\u0174\7w"+
		"\2\2\u0174\u0175\7k\2\2\u0175\u0176\7v\2\2\u0176\u0177\7u\2\2\u0177^\3"+
		"\2\2\2\u0178\u0179\7u\2\2\u0179\u017a\7q\2\2\u017a\u017b\7f\2\2\u017b"+
		"\u017c\7c\2\2\u017c`\3\2\2\2\u017d\u017e\7e\2\2\u017e\u017f\7q\2\2\u017f"+
		"\u0180\7w\2\2\u0180\u0181\7p\2\2\u0181\u0182\7v\2\2\u0182b\3\2\2\2\u0183"+
		"\u0184\7n\2\2\u0184\u0185\7k\2\2\u0185\u0186\7h\2\2\u0186\u0187\7g\2\2"+
		"\u0187d\3\2\2\2\u0188\u0189\7f\2\2\u0189\u018a\7k\2\2\u018a\u018b\7t\2"+
		"\2\u018b\u018c\7v\2\2\u018cf\3\2\2\2\u018d\u018e\7t\2\2\u018e\u018f\7"+
		"q\2\2\u018f\u0190\7e\2\2\u0190\u0191\7m\2\2\u0191h\3\2\2\2\u0192\u0193"+
		"\7x\2\2\u0193\u0194\7k\2\2\u0194\u0195\7p\2\2\u0195\u0196\7g\2\2\u0196"+
		"\u0197\7u\2\2\u0197j\3\2\2\2\u0198\u0199\7|\2\2\u0199\u019a\7q\2\2\u019a"+
		"\u019b\7o\2\2\u019b\u019c\7d\2\2\u019c\u019d\7k\2\2\u019d\u019e\7g\2\2"+
		"\u019el\3\2\2\2\u019f\u01a0\7r\2\2\u01a0\u01a1\7n\2\2\u01a1\u01a2\7c\2"+
		"\2\u01a2\u01a3\7{\2\2\u01a3\u01a4\7g\2\2\u01a4\u01a5\7t\2\2\u01a5n\3\2"+
		"\2\2\u01a6\u01a7\7p\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7c\2\2\u01a9\u01aa"+
		"\7t\2\2\u01aa\u01ab\7d\2\2\u01ab\u01ac\7{\2\2\u01acp\3\2\2\2\u01ad\u01ae"+
		"\7u\2\2\u01ae\u01af\7m\2\2\u01af\u01b0\7k\2\2\u01b0\u01b1\7r\2\2\u01b1"+
		"r\3\2\2\2\u01b2\u01b3\7k\2\2\u01b3\u01b4\7h\2\2\u01b4t\3\2\2\2\u01b5\u01b6"+
		"\7v\2\2\u01b6\u01b7\7j\2\2\u01b7\u01b8\7g\2\2\u01b8\u01b9\7p\2\2\u01b9"+
		"v\3\2\2\2\u01ba\u01bb\7g\2\2\u01bb\u01bc\7n\2\2\u01bc\u01bd\7u\2\2\u01bd"+
		"\u01be\7g\2\2\u01bex\3\2\2\2\u01bf\u01c0\7y\2\2\u01c0\u01c1\7j\2\2\u01c1"+
		"\u01c2\7k\2\2\u01c2\u01c3\7n\2\2\u01c3\u01c4\7g\2\2\u01c4z\3\2\2\2\u01c5"+
		"\u01c6\7u\2\2\u01c6\u01c7\7g\2\2\u01c7\u01c8\7v\2\2\u01c8|\3\2\2\2\u01c9"+
		"\u01ca\7v\2\2\u01ca\u01cb\7q\2\2\u01cb~\3\2\2\2\u01cc\u01cd\7e\2\2\u01cd"+
		"\u01ce\7q\2\2\u01ce\u01cf\7o\2\2\u01cf\u01d0\7r\2\2\u01d0\u01d1\7w\2\2"+
		"\u01d1\u01d2\7v\2\2\u01d2\u01d3\7g\2\2\u01d3\u0080\3\2\2\2\u01d4\u01d5"+
		"\7p\2\2\u01d5\u01d6\7g\2\2\u01d6\u01d7\7z\2\2\u01d7\u01d8\7v\2\2\u01d8"+
		"\u0082\3\2\2\2\u01d9\u01da\7o\2\2\u01da\u01db\7q\2\2\u01db\u01dc\7x\2"+
		"\2\u01dc\u01dd\7g\2\2\u01dd\u0084\3\2\2\2\u01de\u01df\7u\2\2\u01df\u01e0"+
		"\7j\2\2\u01e0\u01e1\7q\2\2\u01e1\u01e2\7q\2\2\u01e2\u01e3\7v\2\2\u01e3"+
		"\u0086\3\2\2\2\u01e4\u01e5\7w\2\2\u01e5\u01e6\7u\2\2\u01e6\u01e7\7g\2"+
		"\2\u01e7\u0088\3\2\2\2\u01e8\u01e9\7p\2\2\u01e9\u01ea\7q\2\2\u01ea\u01eb"+
		"\7v\2\2\u01eb\u01ec\7j\2\2\u01ec\u01ed\7k\2\2\u01ed\u01ee\7p\2\2\u01ee"+
		"\u01ef\7i\2\2\u01ef\u008a\3\2\2\2\u01f0\u01f1\7h\2\2\u01f1\u01f2\7w\2"+
		"\2\u01f2\u01f3\7p\2\2\u01f3\u01f4\7e\2\2\u01f4\u01f5\7v\2\2\u01f5\u01f6"+
		"\7k\2\2\u01f6\u01f7\7q\2\2\u01f7\u01f8\7p\2\2\u01f8\u008c\3\2\2\2\u01f9"+
		"\u01fa\7x\2\2\u01fa\u01fb\7q\2\2\u01fb\u01fc\7k\2\2\u01fc\u01fd\7f\2\2"+
		"\u01fd\u008e\3\2\2\2\u01fe\u01ff\7t\2\2\u01ff\u0200\7g\2\2\u0200\u0201"+
		"\7v\2\2\u0201\u0202\7w\2\2\u0202\u0203\7t\2\2\u0203\u0204\7p\2\2\u0204"+
		"\u0090\3\2\2\2\u0205\u0206\7\60\2\2\u0206\u0207\7y\2\2\u0207\u0208\7n"+
		"\2\2\u0208\u0209\7f\2\2\u0209\u0092\3\2\2\2\u020a\u020b\7<\2\2\u020b\u0094"+
		"\3\2\2\2\u020c\u020d\7k\2\2\u020d\u020e\7o\2\2\u020e\u020f\7r\2\2\u020f"+
		"\u0210\7q\2\2\u0210\u0211\7t\2\2\u0211\u0212\7v\2\2\u0212\u0096\3\2\2"+
		"\2\u0213\u0214\7d\2\2\u0214\u0215\7q\2\2\u0215\u0216\7q\2\2\u0216\u0217"+
		"\7n\2\2\u0217\u0218\7g\2\2\u0218\u0219\7c\2\2\u0219\u0228\7p\2\2\u021a"+
		"\u021b\7k\2\2\u021b\u021c\7p\2\2\u021c\u021d\7v\2\2\u021d\u021e\7g\2\2"+
		"\u021e\u021f\7i\2\2\u021f\u0220\7g\2\2\u0220\u0228\7t\2\2\u0221\u0222"+
		"\7u\2\2\u0222\u0223\7s\2\2\u0223\u0224\7w\2\2\u0224\u0225\7c\2\2\u0225"+
		"\u0226\7t\2\2\u0226\u0228\7g\2\2\u0227\u0213\3\2\2\2\u0227\u021a\3\2\2"+
		"\2\u0227\u0221\3\2\2\2\u0228\u0098\3\2\2\2\u0229\u022e\5\u009fP\2\u022a"+
		"\u022d\5\u009fP\2\u022b\u022d\5\u00a1Q\2\u022c\u022a\3\2\2\2\u022c\u022b"+
		"\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u009a\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0236\5\u009fP\2\u0232\u0235"+
		"\5\u009fP\2\u0233\u0235\5\u00a1Q\2\u0234\u0232\3\2\2\2\u0234\u0233\3\2"+
		"\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"\u009c\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023b\5\u00a1Q\2\u023a\u0239"+
		"\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u009e\3\2\2\2\u023e\u023f\t\2\2\2\u023f\u00a0\3\2\2\2\u0240\u0241\4\62"+
		";\2\u0241\u00a2\3\2\2\2\u0242\u0243\7\61\2\2\u0243\u0244\7\61\2\2\u0244"+
		"\u0248\3\2\2\2\u0245\u0247\13\2\2\2\u0246\u0245\3\2\2\2\u0247\u024a\3"+
		"\2\2\2\u0248\u0249\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u024c\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024b\u024d\7\17\2\2\u024c\u024b\3\2\2\2\u024c\u024d\3"+
		"\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\7\f\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0251\bR\2\2\u0251\u00a4\3\2\2\2\u0252\u0253\7\61\2\2\u0253\u0254\7,"+
		"\2\2\u0254\u0258\3\2\2\2\u0255\u0257\13\2\2\2\u0256\u0255\3\2\2\2\u0257"+
		"\u025a\3\2\2\2\u0258\u0259\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025b\3\2"+
		"\2\2\u025a\u0258\3\2\2\2\u025b\u025c\7,\2\2\u025c\u025d\7\61\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u025f\bS\2\2\u025f\u00a6\3\2\2\2\u0260\u0262\7\17"+
		"\2\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\3\2\2\2\u0263"+
		"\u0264\7\f\2\2\u0264\u0265\3\2\2\2\u0265\u0266\bT\2\2\u0266\u00a8\3\2"+
		"\2\2\u0267\u0269\t\3\2\2\u0268\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\bU"+
		"\2\2\u026d\u00aa\3\2\2\2\16\2\u0227\u022c\u022e\u0234\u0236\u023c\u0248"+
		"\u024c\u0258\u0261\u026a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}