// Generated from Malayalam.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MalayalamParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPES=1, LPAREN=2, RPAREN=3, LBRACE=4, RBRACE=5, LBRACK=6, RBRACK=7, SEMI=8, 
		COMMA=9, DOT=10, ASSIGN=11, GT=12, LT=13, BANG=14, TILDE=15, QUESTION=16, 
		COLON=17, EQUAL=18, LE=19, GE=20, NOTEQUAL=21, AND=22, OR=23, INC=24, 
		DEC=25, ADD=26, SUB=27, MUL=28, DIV=29, BITAND=30, BITOR=31, CARET=32, 
		MOD=33, ARROW=34, COLONCOLON=35, ADD_ASSIGN=36, SUB_ASSIGN=37, MUL_ASSIGN=38, 
		DIV_ASSIGN=39, AND_ASSIGN=40, OR_ASSIGN=41, XOR_ASSIGN=42, MOD_ASSIGN=43, 
		LSHIFT_ASSIGN=44, RSHIFT_ASSIGN=45, URSHIFT_ASSIGN=46, TRUE=47, FALSE=48, 
		NIL=49, AANENKIL=50, ATHAVA=51, ALLENKIL=52, AAYIRIKKUMPOL=53, PATHIKKUKA=54, 
		SWEEKARIKKUKA=55, SAMKHYA=56, BHINNA=57, ID=58, INT=59, FLOAT=60, STRING=61, 
		WS=62, COMMENT=63, LINE_COMMENT=64, OTHER=65;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_statement = 2, RULE_block = 3, 
		RULE_assignment = 4, RULE_aanenkilStatement = 5, RULE_aayirikkumbolStatement = 6, 
		RULE_pathikkukaStatement = 7, RULE_sweekarikkukaStatement = 8, RULE_expr = 9, 
		RULE_conditionalExpr = 10, RULE_conditionalOrExpr = 11, RULE_conditionalAndExpr = 12, 
		RULE_inclusiveOrExpr = 13, RULE_exclusiveOrExpr = 14, RULE_andExpr = 15, 
		RULE_equalityExpr = 16, RULE_relationalExpr = 17, RULE_shiftExpr = 18, 
		RULE_additiveExpr = 19, RULE_multiplicativeExpr = 20, RULE_unaryExpr = 21, 
		RULE_preIncrementExpression = 22, RULE_preDecrementExpression = 23, RULE_unaryExprNotPlusMinus = 24, 
		RULE_postfixExpression = 25, RULE_postIncrementExpression = 26, RULE_postIncrementExpression_lf_postfixExpression = 27, 
		RULE_postDecrementExpression = 28, RULE_postDecrementExpression_lf_postfixExpression = 29, 
		RULE_castExpression = 30, RULE_atom = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "statement", "block", "assignment", "aanenkilStatement", 
			"aayirikkumbolStatement", "pathikkukaStatement", "sweekarikkukaStatement", 
			"expr", "conditionalExpr", "conditionalOrExpr", "conditionalAndExpr", 
			"inclusiveOrExpr", "exclusiveOrExpr", "andExpr", "equalityExpr", "relationalExpr", 
			"shiftExpr", "additiveExpr", "multiplicativeExpr", "unaryExpr", "preIncrementExpression", 
			"preDecrementExpression", "unaryExprNotPlusMinus", "postfixExpression", 
			"postIncrementExpression", "postIncrementExpression_lf_postfixExpression", 
			"postDecrementExpression", "postDecrementExpression_lf_postfixExpression", 
			"castExpression", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
			"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
			"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
			"'|'", "'^'", "'%'", "'->'", "'::'", "'+='", "'-='", "'*='", "'/='", 
			"'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "'true'", 
			"'false'", "'nil'", "'\u0D06\u0D23\u0D46\u0D19\u0D4D\u0D15\u0D3F\u0D32\u0D4D\u200D'", 
			"'\u0D05\u0D25\u0D35\u0D3E'", "'\u0D05\u0D32\u0D4D\u0D32\u0D46\u0D19\u0D4D\u0D15\u0D3F\u0D32\u0D4D\u200D'", 
			"'\u0D06\u0D2F\u0D3F\u0D30\u0D3F\u0D15\u0D4D\u0D15\u0D41\u0D2E\u0D4D\u0D2A\u0D4B\u0D33\u0D4D\u200D'", 
			"'\u0D2A\u0D24\u0D3F\u0D15\u0D4D\u0D15\u0D41\u0D15'", "'\u0D38\u0D4D\u0D35\u0D40\u0D15\u0D30\u0D3F\u0D15\u0D4D\u0D15\u0D41\u0D15'", 
			"'\u0D38\u0D02\u0D16\u0D4D\u0D2F'", "'\u0D2D\u0D3F\u0D28\u0D4D\u0D28'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPES", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", 
			"COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "TRUE", "FALSE", "NIL", "AANENKIL", 
			"ATHAVA", "ALLENKIL", "AAYIRIKKUMPOL", "PATHIKKUKA", "SWEEKARIKKUKA", 
			"SAMKHYA", "BHINNA", "ID", "INT", "FLOAT", "STRING", "WS", "COMMENT", 
			"LINE_COMMENT", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Malayalam.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MalayalamParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MalayalamParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			statements();
			setState(65);
			match(EOF);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				statement();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (LPAREN - 2)) | (1L << (LBRACE - 2)) | (1L << (BANG - 2)) | (1L << (TILDE - 2)) | (1L << (INC - 2)) | (1L << (DEC - 2)) | (1L << (ADD - 2)) | (1L << (SUB - 2)) | (1L << (TRUE - 2)) | (1L << (FALSE - 2)) | (1L << (NIL - 2)) | (1L << (PATHIKKUKA - 2)) | (1L << (ID - 2)) | (1L << (INT - 2)) | (1L << (FLOAT - 2)) | (1L << (STRING - 2)) | (1L << (OTHER - 2)))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public Token OTHER;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AanenkilStatementContext aanenkilStatement() {
			return getRuleContext(AanenkilStatementContext.class,0);
		}
		public AayirikkumbolStatementContext aayirikkumbolStatement() {
			return getRuleContext(AayirikkumbolStatementContext.class,0);
		}
		public PathikkukaStatementContext pathikkukaStatement() {
			return getRuleContext(PathikkukaStatementContext.class,0);
		}
		public SweekarikkukaStatementContext sweekarikkukaStatement() {
			return getRuleContext(SweekarikkukaStatementContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(MalayalamParser.OTHER, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				aanenkilStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				aayirikkumbolStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				pathikkukaStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				sweekarikkukaStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				((StatementContext)_localctx).OTHER = match(OTHER);
				System.err.println("unknown character: " + (((StatementContext)_localctx).OTHER!=null?((StatementContext)_localctx).OTHER.getText():null));
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MalayalamParser.LBRACE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MalayalamParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(LBRACE);
			setState(83);
			statements();
			setState(84);
			match(RBRACE);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MalayalamParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MalayalamParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MalayalamParser.SEMI, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
			setState(87);
			match(ASSIGN);
			setState(88);
			expr();
			setState(89);
			match(SEMI);
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

	public static class AanenkilStatementContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> AANENKIL() { return getTokens(MalayalamParser.AANENKIL); }
		public TerminalNode AANENKIL(int i) {
			return getToken(MalayalamParser.AANENKIL, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ATHAVA() { return getTokens(MalayalamParser.ATHAVA); }
		public TerminalNode ATHAVA(int i) {
			return getToken(MalayalamParser.ATHAVA, i);
		}
		public TerminalNode ALLENKIL() { return getToken(MalayalamParser.ALLENKIL, 0); }
		public AanenkilStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aanenkilStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterAanenkilStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitAanenkilStatement(this);
		}
	}

	public final AanenkilStatementContext aanenkilStatement() throws RecognitionException {
		AanenkilStatementContext _localctx = new AanenkilStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_aanenkilStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			expr();
			setState(92);
			match(AANENKIL);
			setState(93);
			block();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATHAVA) {
				{
				{
				setState(94);
				match(ATHAVA);
				setState(95);
				expr();
				setState(96);
				match(AANENKIL);
				setState(97);
				block();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALLENKIL) {
				{
				setState(104);
				match(ALLENKIL);
				setState(105);
				block();
				}
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

	public static class AayirikkumbolStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AAYIRIKKUMPOL() { return getToken(MalayalamParser.AAYIRIKKUMPOL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AayirikkumbolStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aayirikkumbolStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterAayirikkumbolStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitAayirikkumbolStatement(this);
		}
	}

	public final AayirikkumbolStatementContext aayirikkumbolStatement() throws RecognitionException {
		AayirikkumbolStatementContext _localctx = new AayirikkumbolStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_aayirikkumbolStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			expr();
			setState(109);
			match(AAYIRIKKUMPOL);
			setState(110);
			block();
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

	public static class PathikkukaStatementContext extends ParserRuleContext {
		public TerminalNode PATHIKKUKA() { return getToken(MalayalamParser.PATHIKKUKA, 0); }
		public TerminalNode LPAREN() { return getToken(MalayalamParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MalayalamParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(MalayalamParser.SEMI, 0); }
		public PathikkukaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathikkukaStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterPathikkukaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitPathikkukaStatement(this);
		}
	}

	public final PathikkukaStatementContext pathikkukaStatement() throws RecognitionException {
		PathikkukaStatementContext _localctx = new PathikkukaStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pathikkukaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(PATHIKKUKA);
			setState(113);
			match(LPAREN);
			setState(114);
			expr();
			setState(115);
			match(RPAREN);
			setState(116);
			match(SEMI);
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

	public static class SweekarikkukaStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MalayalamParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MalayalamParser.ASSIGN, 0); }
		public TerminalNode SWEEKARIKKUKA() { return getToken(MalayalamParser.SWEEKARIKKUKA, 0); }
		public TerminalNode LPAREN() { return getToken(MalayalamParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MalayalamParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(MalayalamParser.SEMI, 0); }
		public TerminalNode STRING() { return getToken(MalayalamParser.STRING, 0); }
		public SweekarikkukaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sweekarikkukaStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterSweekarikkukaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitSweekarikkukaStatement(this);
		}
	}

	public final SweekarikkukaStatementContext sweekarikkukaStatement() throws RecognitionException {
		SweekarikkukaStatementContext _localctx = new SweekarikkukaStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sweekarikkukaStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ID);
			setState(119);
			match(ASSIGN);
			setState(120);
			match(SWEEKARIKKUKA);
			setState(121);
			match(LPAREN);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(122);
				match(STRING);
				}
			}

			setState(125);
			match(RPAREN);
			setState(126);
			match(SEMI);
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

	public static class ExprContext extends ParserRuleContext {
		public ConditionalExprContext conditionalExpr() {
			return getRuleContext(ConditionalExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			conditionalExpr();
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

	public static class ConditionalExprContext extends ParserRuleContext {
		public ConditionalOrExprContext conditionalOrExpr() {
			return getRuleContext(ConditionalOrExprContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(MalayalamParser.QUESTION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MalayalamParser.COLON, 0); }
		public ConditionalExprContext conditionalExpr() {
			return getRuleContext(ConditionalExprContext.class,0);
		}
		public ConditionalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterConditionalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitConditionalExpr(this);
		}
	}

	public final ConditionalExprContext conditionalExpr() throws RecognitionException {
		ConditionalExprContext _localctx = new ConditionalExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditionalExpr);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				conditionalOrExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				conditionalOrExpr(0);
				setState(132);
				match(QUESTION);
				setState(133);
				expr();
				setState(134);
				match(COLON);
				setState(135);
				conditionalExpr();
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

	public static class ConditionalOrExprContext extends ParserRuleContext {
		public ConditionalAndExprContext conditionalAndExpr() {
			return getRuleContext(ConditionalAndExprContext.class,0);
		}
		public ConditionalOrExprContext conditionalOrExpr() {
			return getRuleContext(ConditionalOrExprContext.class,0);
		}
		public TerminalNode OR() { return getToken(MalayalamParser.OR, 0); }
		public ConditionalOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterConditionalOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitConditionalOrExpr(this);
		}
	}

	public final ConditionalOrExprContext conditionalOrExpr() throws RecognitionException {
		return conditionalOrExpr(0);
	}

	private ConditionalOrExprContext conditionalOrExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExprContext _localctx = new ConditionalOrExprContext(_ctx, _parentState);
		ConditionalOrExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_conditionalOrExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(140);
			conditionalAndExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpr);
					setState(142);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(143);
					match(OR);
					setState(144);
					conditionalAndExpr(0);
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ConditionalAndExprContext extends ParserRuleContext {
		public InclusiveOrExprContext inclusiveOrExpr() {
			return getRuleContext(InclusiveOrExprContext.class,0);
		}
		public ConditionalAndExprContext conditionalAndExpr() {
			return getRuleContext(ConditionalAndExprContext.class,0);
		}
		public TerminalNode AND() { return getToken(MalayalamParser.AND, 0); }
		public ConditionalAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterConditionalAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitConditionalAndExpr(this);
		}
	}

	public final ConditionalAndExprContext conditionalAndExpr() throws RecognitionException {
		return conditionalAndExpr(0);
	}

	private ConditionalAndExprContext conditionalAndExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExprContext _localctx = new ConditionalAndExprContext(_ctx, _parentState);
		ConditionalAndExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_conditionalAndExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(151);
			inclusiveOrExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpr);
					setState(153);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(154);
					match(AND);
					setState(155);
					inclusiveOrExpr(0);
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class InclusiveOrExprContext extends ParserRuleContext {
		public ExclusiveOrExprContext exclusiveOrExpr() {
			return getRuleContext(ExclusiveOrExprContext.class,0);
		}
		public InclusiveOrExprContext inclusiveOrExpr() {
			return getRuleContext(InclusiveOrExprContext.class,0);
		}
		public TerminalNode BITOR() { return getToken(MalayalamParser.BITOR, 0); }
		public InclusiveOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterInclusiveOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitInclusiveOrExpr(this);
		}
	}

	public final InclusiveOrExprContext inclusiveOrExpr() throws RecognitionException {
		return inclusiveOrExpr(0);
	}

	private InclusiveOrExprContext inclusiveOrExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExprContext _localctx = new InclusiveOrExprContext(_ctx, _parentState);
		InclusiveOrExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_inclusiveOrExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(162);
			exclusiveOrExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpr);
					setState(164);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(165);
					match(BITOR);
					setState(166);
					exclusiveOrExpr(0);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ExclusiveOrExprContext extends ParserRuleContext {
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public ExclusiveOrExprContext exclusiveOrExpr() {
			return getRuleContext(ExclusiveOrExprContext.class,0);
		}
		public TerminalNode CARET() { return getToken(MalayalamParser.CARET, 0); }
		public ExclusiveOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterExclusiveOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitExclusiveOrExpr(this);
		}
	}

	public final ExclusiveOrExprContext exclusiveOrExpr() throws RecognitionException {
		return exclusiveOrExpr(0);
	}

	private ExclusiveOrExprContext exclusiveOrExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExprContext _localctx = new ExclusiveOrExprContext(_ctx, _parentState);
		ExclusiveOrExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_exclusiveOrExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(173);
			andExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpr);
					setState(175);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(176);
					match(CARET);
					setState(177);
					andExpr(0);
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class AndExprContext extends ParserRuleContext {
		public EqualityExprContext equalityExpr() {
			return getRuleContext(EqualityExprContext.class,0);
		}
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public TerminalNode BITAND() { return getToken(MalayalamParser.BITAND, 0); }
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitAndExpr(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		return andExpr(0);
	}

	private AndExprContext andExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExprContext _localctx = new AndExprContext(_ctx, _parentState);
		AndExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_andExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(184);
			equalityExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpr);
					setState(186);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(187);
					match(BITAND);
					setState(188);
					equalityExpr(0);
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class EqualityExprContext extends ParserRuleContext {
		public RelationalExprContext relationalExpr() {
			return getRuleContext(RelationalExprContext.class,0);
		}
		public EqualityExprContext equalityExpr() {
			return getRuleContext(EqualityExprContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MalayalamParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(MalayalamParser.NOTEQUAL, 0); }
		public EqualityExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitEqualityExpr(this);
		}
	}

	public final EqualityExprContext equalityExpr() throws RecognitionException {
		return equalityExpr(0);
	}

	private EqualityExprContext equalityExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExprContext _localctx = new EqualityExprContext(_ctx, _parentState);
		EqualityExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_equalityExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(195);
			relationalExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpr);
						setState(197);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(198);
						match(EQUAL);
						setState(199);
						relationalExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpr);
						setState(200);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(201);
						match(NOTEQUAL);
						setState(202);
						relationalExpr(0);
						}
						break;
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class RelationalExprContext extends ParserRuleContext {
		public ShiftExprContext shiftExpr() {
			return getRuleContext(ShiftExprContext.class,0);
		}
		public RelationalExprContext relationalExpr() {
			return getRuleContext(RelationalExprContext.class,0);
		}
		public TerminalNode LT() { return getToken(MalayalamParser.LT, 0); }
		public TerminalNode GT() { return getToken(MalayalamParser.GT, 0); }
		public TerminalNode LE() { return getToken(MalayalamParser.LE, 0); }
		public TerminalNode GE() { return getToken(MalayalamParser.GE, 0); }
		public RelationalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitRelationalExpr(this);
		}
	}

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		return relationalExpr(0);
	}

	private RelationalExprContext relationalExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, _parentState);
		RelationalExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_relationalExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(209);
			shiftExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(223);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpr);
						setState(211);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(212);
						match(LT);
						setState(213);
						shiftExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpr);
						setState(214);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(215);
						match(GT);
						setState(216);
						shiftExpr(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpr);
						setState(217);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(218);
						match(LE);
						setState(219);
						shiftExpr(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpr);
						setState(220);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(221);
						match(GE);
						setState(222);
						shiftExpr(0);
						}
						break;
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ShiftExprContext extends ParserRuleContext {
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public ShiftExprContext shiftExpr() {
			return getRuleContext(ShiftExprContext.class,0);
		}
		public List<TerminalNode> LT() { return getTokens(MalayalamParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(MalayalamParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(MalayalamParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(MalayalamParser.GT, i);
		}
		public ShiftExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterShiftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitShiftExpr(this);
		}
	}

	public final ShiftExprContext shiftExpr() throws RecognitionException {
		return shiftExpr(0);
	}

	private ShiftExprContext shiftExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExprContext _localctx = new ShiftExprContext(_ctx, _parentState);
		ShiftExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_shiftExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(229);
			additiveExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpr);
						setState(231);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(232);
						match(LT);
						setState(233);
						match(LT);
						setState(234);
						additiveExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpr);
						setState(235);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(236);
						match(GT);
						setState(237);
						match(GT);
						setState(238);
						additiveExpr(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpr);
						setState(239);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(240);
						match(GT);
						setState(241);
						match(GT);
						setState(242);
						match(GT);
						setState(243);
						additiveExpr(0);
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class AdditiveExprContext extends ParserRuleContext {
		public MultiplicativeExprContext multiplicativeExpr() {
			return getRuleContext(MultiplicativeExprContext.class,0);
		}
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(MalayalamParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MalayalamParser.SUB, 0); }
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitAdditiveExpr(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		return additiveExpr(0);
	}

	private AdditiveExprContext additiveExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, _parentState);
		AdditiveExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_additiveExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(250);
			multiplicativeExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(258);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpr);
						setState(252);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(253);
						match(ADD);
						setState(254);
						multiplicativeExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpr);
						setState(255);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(256);
						match(SUB);
						setState(257);
						multiplicativeExpr(0);
						}
						break;
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class MultiplicativeExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public MultiplicativeExprContext multiplicativeExpr() {
			return getRuleContext(MultiplicativeExprContext.class,0);
		}
		public TerminalNode MUL() { return getToken(MalayalamParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MalayalamParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MalayalamParser.MOD, 0); }
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitMultiplicativeExpr(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		return multiplicativeExpr(0);
	}

	private MultiplicativeExprContext multiplicativeExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, _parentState);
		MultiplicativeExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_multiplicativeExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(264);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(275);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpr);
						setState(266);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(267);
						match(MUL);
						setState(268);
						unaryExpr();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpr);
						setState(269);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(270);
						match(DIV);
						setState(271);
						unaryExpr();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpr);
						setState(272);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(273);
						match(MOD);
						setState(274);
						unaryExpr();
						}
						break;
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class UnaryExprContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(MalayalamParser.ADD, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(MalayalamParser.SUB, 0); }
		public UnaryExprNotPlusMinusContext unaryExprNotPlusMinus() {
			return getRuleContext(UnaryExprNotPlusMinusContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryExpr);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				match(ADD);
				setState(283);
				unaryExpr();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(SUB);
				setState(285);
				unaryExpr();
				}
				break;
			case LPAREN:
			case BANG:
			case TILDE:
			case TRUE:
			case FALSE:
			case NIL:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				unaryExprNotPlusMinus();
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

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(MalayalamParser.INC, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitPreIncrementExpression(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(INC);
			setState(290);
			unaryExpr();
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

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(MalayalamParser.DEC, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitPreDecrementExpression(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(DEC);
			setState(293);
			unaryExpr();
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

	public static class UnaryExprNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(MalayalamParser.TILDE, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode BANG() { return getToken(MalayalamParser.BANG, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExprNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExprNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterUnaryExprNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitUnaryExprNotPlusMinus(this);
		}
	}

	public final UnaryExprNotPlusMinusContext unaryExprNotPlusMinus() throws RecognitionException {
		UnaryExprNotPlusMinusContext _localctx = new UnaryExprNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unaryExprNotPlusMinus);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(TILDE);
				setState(297);
				unaryExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(BANG);
				setState(299);
				unaryExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				castExpression();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			atom();
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(306);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(304);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(305);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(MalayalamParser.INC, 0); }
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitPostIncrementExpression(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			postfixExpression();
			setState(312);
			match(INC);
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

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(MalayalamParser.INC, 0); }
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(INC);
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

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DEC() { return getToken(MalayalamParser.DEC, 0); }
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitPostDecrementExpression(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			postfixExpression();
			setState(317);
			match(DEC);
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

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(MalayalamParser.DEC, 0); }
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(DEC);
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

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MalayalamParser.LPAREN, 0); }
		public TerminalNode TYPES() { return getToken(MalayalamParser.TYPES, 0); }
		public TerminalNode RPAREN() { return getToken(MalayalamParser.RPAREN, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_castExpression);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(LPAREN);
				setState(322);
				match(TYPES);
				setState(323);
				match(RPAREN);
				setState(324);
				unaryExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				atom();
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(MalayalamParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MalayalamParser.RPAREN, 0); }
		public ParExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitParExpr(this);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(MalayalamParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MalayalamParser.FALSE, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitBooleanAtom(this);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(MalayalamParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitIdAtom(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(MalayalamParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitStringAtom(this);
		}
	}
	public static class NilAtomContext extends AtomContext {
		public TerminalNode NIL() { return getToken(MalayalamParser.NIL, 0); }
		public NilAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterNilAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitNilAtom(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(MalayalamParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MalayalamParser.FLOAT, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MalayalamListener ) ((MalayalamListener)listener).exitNumberAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_atom);
		int _la;
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(LPAREN);
				setState(329);
				expr();
				setState(330);
				match(RPAREN);
				}
				break;
			case INT:
			case FLOAT:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				match(STRING);
				}
				break;
			case NIL:
				_localctx = new NilAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(336);
				match(NIL);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return conditionalOrExpr_sempred((ConditionalOrExprContext)_localctx, predIndex);
		case 12:
			return conditionalAndExpr_sempred((ConditionalAndExprContext)_localctx, predIndex);
		case 13:
			return inclusiveOrExpr_sempred((InclusiveOrExprContext)_localctx, predIndex);
		case 14:
			return exclusiveOrExpr_sempred((ExclusiveOrExprContext)_localctx, predIndex);
		case 15:
			return andExpr_sempred((AndExprContext)_localctx, predIndex);
		case 16:
			return equalityExpr_sempred((EqualityExprContext)_localctx, predIndex);
		case 17:
			return relationalExpr_sempred((RelationalExprContext)_localctx, predIndex);
		case 18:
			return shiftExpr_sempred((ShiftExprContext)_localctx, predIndex);
		case 19:
			return additiveExpr_sempred((AdditiveExprContext)_localctx, predIndex);
		case 20:
			return multiplicativeExpr_sempred((MultiplicativeExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conditionalOrExpr_sempred(ConditionalOrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpr_sempred(ConditionalAndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpr_sempred(InclusiveOrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpr_sempred(ExclusiveOrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpr_sempred(AndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpr_sempred(EqualityExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpr_sempred(RelationalExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpr_sempred(ShiftExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpr_sempred(AdditiveExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpr_sempred(MultiplicativeExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u0156\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\6\3G\n\3\r\3\16\3H\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4S\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7f\n\7\f\7\16\7i\13\7\3\7\3\7\5\7m\n\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u0094\n\r\f\r\16\r\u0097\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u009f"+
		"\n\16\f\16\16\16\u00a2\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00aa"+
		"\n\17\f\17\16\17\u00ad\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00b5"+
		"\n\20\f\20\16\20\u00b8\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00c0"+
		"\n\21\f\21\16\21\u00c3\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\7\22\u00ce\n\22\f\22\16\22\u00d1\13\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e2\n\23\f\23"+
		"\16\23\u00e5\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\7\24\u00f7\n\24\f\24\16\24\u00fa\13\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0105\n\25\f\25\16\25"+
		"\u0108\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\7\26\u0116\n\26\f\26\16\26\u0119\13\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u0122\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0130\n\32\3\33\3\33\3\33\7\33\u0135\n\33\f\33\16"+
		"\33\u0138\13\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3"+
		" \3 \3 \3 \5 \u0149\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0154\n!\3!\2\f\30"+
		"\32\34\36 \"$&(*\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@\2\4\3\2=>\3\2\61\62\2\u0162\2B\3\2\2\2\4F\3\2\2\2\6R\3"+
		"\2\2\2\bT\3\2\2\2\nX\3\2\2\2\f]\3\2\2\2\16n\3\2\2\2\20r\3\2\2\2\22x\3"+
		"\2\2\2\24\u0082\3\2\2\2\26\u008b\3\2\2\2\30\u008d\3\2\2\2\32\u0098\3\2"+
		"\2\2\34\u00a3\3\2\2\2\36\u00ae\3\2\2\2 \u00b9\3\2\2\2\"\u00c4\3\2\2\2"+
		"$\u00d2\3\2\2\2&\u00e6\3\2\2\2(\u00fb\3\2\2\2*\u0109\3\2\2\2,\u0121\3"+
		"\2\2\2.\u0123\3\2\2\2\60\u0126\3\2\2\2\62\u012f\3\2\2\2\64\u0131\3\2\2"+
		"\2\66\u0139\3\2\2\28\u013c\3\2\2\2:\u013e\3\2\2\2<\u0141\3\2\2\2>\u0148"+
		"\3\2\2\2@\u0153\3\2\2\2BC\5\4\3\2CD\7\2\2\3D\3\3\2\2\2EG\5\6\4\2FE\3\2"+
		"\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\5\3\2\2\2JS\5\b\5\2KS\5\n\6\2LS\5"+
		"\f\7\2MS\5\16\b\2NS\5\20\t\2OS\5\22\n\2PQ\7C\2\2QS\b\4\1\2RJ\3\2\2\2R"+
		"K\3\2\2\2RL\3\2\2\2RM\3\2\2\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2S\7\3\2\2\2"+
		"TU\7\6\2\2UV\5\4\3\2VW\7\7\2\2W\t\3\2\2\2XY\7<\2\2YZ\7\r\2\2Z[\5\24\13"+
		"\2[\\\7\n\2\2\\\13\3\2\2\2]^\5\24\13\2^_\7\64\2\2_g\5\b\5\2`a\7\65\2\2"+
		"ab\5\24\13\2bc\7\64\2\2cd\5\b\5\2df\3\2\2\2e`\3\2\2\2fi\3\2\2\2ge\3\2"+
		"\2\2gh\3\2\2\2hl\3\2\2\2ig\3\2\2\2jk\7\66\2\2km\5\b\5\2lj\3\2\2\2lm\3"+
		"\2\2\2m\r\3\2\2\2no\5\24\13\2op\7\67\2\2pq\5\b\5\2q\17\3\2\2\2rs\78\2"+
		"\2st\7\4\2\2tu\5\24\13\2uv\7\5\2\2vw\7\n\2\2w\21\3\2\2\2xy\7<\2\2yz\7"+
		"\r\2\2z{\79\2\2{}\7\4\2\2|~\7?\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\7\5\2\2\u0080\u0081\7\n\2\2\u0081\23\3\2\2\2\u0082\u0083\5\26\f"+
		"\2\u0083\25\3\2\2\2\u0084\u008c\5\30\r\2\u0085\u0086\5\30\r\2\u0086\u0087"+
		"\7\22\2\2\u0087\u0088\5\24\13\2\u0088\u0089\7\23\2\2\u0089\u008a\5\26"+
		"\f\2\u008a\u008c\3\2\2\2\u008b\u0084\3\2\2\2\u008b\u0085\3\2\2\2\u008c"+
		"\27\3\2\2\2\u008d\u008e\b\r\1\2\u008e\u008f\5\32\16\2\u008f\u0095\3\2"+
		"\2\2\u0090\u0091\f\3\2\2\u0091\u0092\7\31\2\2\u0092\u0094\5\32\16\2\u0093"+
		"\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\31\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\b\16\1\2\u0099\u009a"+
		"\5\34\17\2\u009a\u00a0\3\2\2\2\u009b\u009c\f\3\2\2\u009c\u009d\7\30\2"+
		"\2\u009d\u009f\5\34\17\2\u009e\u009b\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\33\3\2\2\2\u00a2\u00a0\3\2\2"+
		"\2\u00a3\u00a4\b\17\1\2\u00a4\u00a5\5\36\20\2\u00a5\u00ab\3\2\2\2\u00a6"+
		"\u00a7\f\3\2\2\u00a7\u00a8\7!\2\2\u00a8\u00aa\5\36\20\2\u00a9\u00a6\3"+
		"\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\35\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\b\20\1\2\u00af\u00b0\5 \21"+
		"\2\u00b0\u00b6\3\2\2\2\u00b1\u00b2\f\3\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b5"+
		"\5 \21\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\37\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\b\21\1"+
		"\2\u00ba\u00bb\5\"\22\2\u00bb\u00c1\3\2\2\2\u00bc\u00bd\f\3\2\2\u00bd"+
		"\u00be\7 \2\2\u00be\u00c0\5\"\22\2\u00bf\u00bc\3\2\2\2\u00c0\u00c3\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2!\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c4\u00c5\b\22\1\2\u00c5\u00c6\5$\23\2\u00c6\u00cf\3\2\2\2"+
		"\u00c7\u00c8\f\4\2\2\u00c8\u00c9\7\24\2\2\u00c9\u00ce\5$\23\2\u00ca\u00cb"+
		"\f\3\2\2\u00cb\u00cc\7\27\2\2\u00cc\u00ce\5$\23\2\u00cd\u00c7\3\2\2\2"+
		"\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0#\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\b\23\1\2\u00d3"+
		"\u00d4\5&\24\2\u00d4\u00e3\3\2\2\2\u00d5\u00d6\f\6\2\2\u00d6\u00d7\7\17"+
		"\2\2\u00d7\u00e2\5&\24\2\u00d8\u00d9\f\5\2\2\u00d9\u00da\7\16\2\2\u00da"+
		"\u00e2\5&\24\2\u00db\u00dc\f\4\2\2\u00dc\u00dd\7\25\2\2\u00dd\u00e2\5"+
		"&\24\2\u00de\u00df\f\3\2\2\u00df\u00e0\7\26\2\2\u00e0\u00e2\5&\24\2\u00e1"+
		"\u00d5\3\2\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00de\3\2"+
		"\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"%\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\b\24\1\2\u00e7\u00e8\5(\25\2"+
		"\u00e8\u00f8\3\2\2\2\u00e9\u00ea\f\5\2\2\u00ea\u00eb\7\17\2\2\u00eb\u00ec"+
		"\7\17\2\2\u00ec\u00f7\5(\25\2\u00ed\u00ee\f\4\2\2\u00ee\u00ef\7\16\2\2"+
		"\u00ef\u00f0\7\16\2\2\u00f0\u00f7\5(\25\2\u00f1\u00f2\f\3\2\2\u00f2\u00f3"+
		"\7\16\2\2\u00f3\u00f4\7\16\2\2\u00f4\u00f5\7\16\2\2\u00f5\u00f7\5(\25"+
		"\2\u00f6\u00e9\3\2\2\2\u00f6\u00ed\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f7\u00fa"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\'\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\b\25\1\2\u00fc\u00fd\5*\26\2\u00fd\u0106\3"+
		"\2\2\2\u00fe\u00ff\f\4\2\2\u00ff\u0100\7\34\2\2\u0100\u0105\5*\26\2\u0101"+
		"\u0102\f\3\2\2\u0102\u0103\7\35\2\2\u0103\u0105\5*\26\2\u0104\u00fe\3"+
		"\2\2\2\u0104\u0101\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107)\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\b\26\1\2"+
		"\u010a\u010b\5,\27\2\u010b\u0117\3\2\2\2\u010c\u010d\f\5\2\2\u010d\u010e"+
		"\7\36\2\2\u010e\u0116\5,\27\2\u010f\u0110\f\4\2\2\u0110\u0111\7\37\2\2"+
		"\u0111\u0116\5,\27\2\u0112\u0113\f\3\2\2\u0113\u0114\7#\2\2\u0114\u0116"+
		"\5,\27\2\u0115\u010c\3\2\2\2\u0115\u010f\3\2\2\2\u0115\u0112\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118+\3\2\2\2"+
		"\u0119\u0117\3\2\2\2\u011a\u0122\5.\30\2\u011b\u0122\5\60\31\2\u011c\u011d"+
		"\7\34\2\2\u011d\u0122\5,\27\2\u011e\u011f\7\35\2\2\u011f\u0122\5,\27\2"+
		"\u0120\u0122\5\62\32\2\u0121\u011a\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u011c"+
		"\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u0120\3\2\2\2\u0122-\3\2\2\2\u0123"+
		"\u0124\7\32\2\2\u0124\u0125\5,\27\2\u0125/\3\2\2\2\u0126\u0127\7\33\2"+
		"\2\u0127\u0128\5,\27\2\u0128\61\3\2\2\2\u0129\u0130\5\64\33\2\u012a\u012b"+
		"\7\21\2\2\u012b\u0130\5,\27\2\u012c\u012d\7\20\2\2\u012d\u0130\5,\27\2"+
		"\u012e\u0130\5> \2\u012f\u0129\3\2\2\2\u012f\u012a\3\2\2\2\u012f\u012c"+
		"\3\2\2\2\u012f\u012e\3\2\2\2\u0130\63\3\2\2\2\u0131\u0136\5@!\2\u0132"+
		"\u0135\58\35\2\u0133\u0135\5<\37\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2"+
		"\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\65\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\5\64\33\2\u013a\u013b\7\32"+
		"\2\2\u013b\67\3\2\2\2\u013c\u013d\7\32\2\2\u013d9\3\2\2\2\u013e\u013f"+
		"\5\64\33\2\u013f\u0140\7\33\2\2\u0140;\3\2\2\2\u0141\u0142\7\33\2\2\u0142"+
		"=\3\2\2\2\u0143\u0144\7\4\2\2\u0144\u0145\7\3\2\2\u0145\u0146\7\5\2\2"+
		"\u0146\u0149\5,\27\2\u0147\u0149\5@!\2\u0148\u0143\3\2\2\2\u0148\u0147"+
		"\3\2\2\2\u0149?\3\2\2\2\u014a\u014b\7\4\2\2\u014b\u014c\5\24\13\2\u014c"+
		"\u014d\7\5\2\2\u014d\u0154\3\2\2\2\u014e\u0154\t\2\2\2\u014f\u0154\t\3"+
		"\2\2\u0150\u0154\7<\2\2\u0151\u0154\7?\2\2\u0152\u0154\7\63\2\2\u0153"+
		"\u014a\3\2\2\2\u0153\u014e\3\2\2\2\u0153\u014f\3\2\2\2\u0153\u0150\3\2"+
		"\2\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154A\3\2\2\2\35HRgl}\u008b"+
		"\u0095\u00a0\u00ab\u00b6\u00c1\u00cd\u00cf\u00e1\u00e3\u00f6\u00f8\u0104"+
		"\u0106\u0115\u0117\u0121\u012f\u0134\u0136\u0148\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}