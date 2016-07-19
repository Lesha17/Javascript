// Generated from JavaScript.g4 by ANTLR 4.5
package lmm.javascript.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaScriptParser extends Parser {
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
	public static final int
		RULE_function_definition = 0, RULE_function_call = 1, RULE_variable = 2, 
		RULE_var_list = 3, RULE_code_block = 4, RULE_expr = 5, RULE_args_list = 6, 
		RULE_simple_expr = 7, RULE_expr_base = 8, RULE_prefix_expr = 9, RULE_postfix_expr = 10, 
		RULE_expr_in_brackets = 11, RULE_minus_expr = 12, RULE_not_expr = 13, 
		RULE_operator_list = 14, RULE_operator = 15, RULE_return_operator = 16, 
		RULE_assign_operator = 17, RULE_break_operator = 18, RULE_alert_operator = 19, 
		RULE_for_loop = 20, RULE_for_action = 21, RULE_if_statement = 22, RULE_if_part = 23, 
		RULE_elif_part = 24, RULE_else_part = 25;
	public static final String[] ruleNames = {
		"function_definition", "function_call", "variable", "var_list", "code_block", 
		"expr", "args_list", "simple_expr", "expr_base", "prefix_expr", "postfix_expr", 
		"expr_in_brackets", "minus_expr", "not_expr", "operator_list", "operator", 
		"return_operator", "assign_operator", "break_operator", "alert_operator", 
		"for_loop", "for_action", "if_statement", "if_part", "elif_part", "else_part"
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

	@Override
	public String getGrammarFileName() { return "JavaScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Function_definitionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(JavaScriptParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(JavaScriptParser.LBRACKET, 0); }
		public Var_listContext var_list() {
			return getRuleContext(Var_listContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(JavaScriptParser.RBRACKET, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(FUNCTION);
			setState(53);
			match(ID);
			setState(54);
			match(LBRACKET);
			setState(55);
			var_list();
			setState(56);
			match(RBRACKET);
			setState(57);
			code_block();
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(JavaScriptParser.LBRACKET, 0); }
		public Args_listContext args_list() {
			return getRuleContext(Args_listContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(JavaScriptParser.RBRACKET, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			setState(60);
			match(LBRACKET);
			setState(61);
			args_list();
			setState(62);
			match(RBRACKET);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
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

	public static class Var_listContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaScriptParser.COMMA, i);
		}
		public Var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitVar_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_listContext var_list() throws RecognitionException {
		Var_listContext _localctx = new Var_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_list);
		int _la;
		try {
			setState(75);
			switch (_input.LA(1)) {
			case RBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				variable();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(68);
					match(COMMA);
					setState(69);
					variable();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaScriptParser.LBRACE, 0); }
		public Operator_listContext operator_list() {
			return getRuleContext(Operator_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaScriptParser.RBRACE, 0); }
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(LBRACE);
			setState(78);
			operator_list();
			setState(79);
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

	public static class ExprContext extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(JavaScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JavaScriptParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(JavaScriptParser.MULT, 0); }
		public TerminalNode MOD() { return getToken(JavaScriptParser.MOD, 0); }
		public TerminalNode MORE_TH() { return getToken(JavaScriptParser.MORE_TH, 0); }
		public TerminalNode LESS_TH() { return getToken(JavaScriptParser.LESS_TH, 0); }
		public TerminalNode EQ() { return getToken(JavaScriptParser.EQ, 0); }
		public TerminalNode MORE_OR_EQ() { return getToken(JavaScriptParser.MORE_OR_EQ, 0); }
		public TerminalNode LESS_OR_EQ() { return getToken(JavaScriptParser.LESS_OR_EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(JavaScriptParser.NOT_EQ, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		int _la;
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				simple_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(82);
				simple_expr();
				setState(83);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MORE_TH) | (1L << LESS_TH) | (1L << EQ) | (1L << MORE_OR_EQ) | (1L << LESS_OR_EQ) | (1L << NOT_EQ) | (1L << MULT) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(84);
				expr();
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

	public static class Args_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaScriptParser.COMMA, i);
		}
		public Args_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitArgs_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Args_listContext args_list() throws RecognitionException {
		Args_listContext _localctx = new Args_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_args_list);
		int _la;
		try {
			setState(97);
			switch (_input.LA(1)) {
			case RBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LBRACKET:
			case MINUS:
			case INCR:
			case DECR:
			case NOT:
			case STRING:
			case NUMBER:
			case BOOLEAN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				expr();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(90);
					match(COMMA);
					setState(91);
					expr();
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Simple_exprContext extends ParserRuleContext {
		public Expr_baseContext expr_base() {
			return getRuleContext(Expr_baseContext.class,0);
		}
		public Expr_in_bracketsContext expr_in_brackets() {
			return getRuleContext(Expr_in_bracketsContext.class,0);
		}
		public Minus_exprContext minus_expr() {
			return getRuleContext(Minus_exprContext.class,0);
		}
		public Not_exprContext not_expr() {
			return getRuleContext(Not_exprContext.class,0);
		}
		public Prefix_exprContext prefix_expr() {
			return getRuleContext(Prefix_exprContext.class,0);
		}
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitSimple_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simple_expr);
		try {
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				expr_base();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				expr_in_brackets();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				minus_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				not_expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				prefix_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				postfix_expr();
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

	public static class Expr_baseContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JavaScriptParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(JavaScriptParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(JavaScriptParser.BOOLEAN, 0); }
		public Expr_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_base; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitExpr_base(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_baseContext expr_base() throws RecognitionException {
		Expr_baseContext _localctx = new Expr_baseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_base);
		try {
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				match(NUMBER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				match(BOOLEAN);
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

	public static class Prefix_exprContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode INCR() { return getToken(JavaScriptParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(JavaScriptParser.DECR, 0); }
		public Prefix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitPrefix_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_exprContext prefix_expr() throws RecognitionException {
		Prefix_exprContext _localctx = new Prefix_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_prefix_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==INCR || _la==DECR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(115);
			variable();
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

	public static class Postfix_exprContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode INCR() { return getToken(JavaScriptParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(JavaScriptParser.DECR, 0); }
		public Postfix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitPostfix_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_exprContext postfix_expr() throws RecognitionException {
		Postfix_exprContext _localctx = new Postfix_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_postfix_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			variable();
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==INCR || _la==DECR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Expr_in_bracketsContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(JavaScriptParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(JavaScriptParser.RBRACKET, 0); }
		public Expr_in_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_in_brackets; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitExpr_in_brackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_in_bracketsContext expr_in_brackets() throws RecognitionException {
		Expr_in_bracketsContext _localctx = new Expr_in_bracketsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_in_brackets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(LBRACKET);
			setState(121);
			expr();
			setState(122);
			match(RBRACKET);
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

	public static class Minus_exprContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(JavaScriptParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Minus_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitMinus_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Minus_exprContext minus_expr() throws RecognitionException {
		Minus_exprContext _localctx = new Minus_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_minus_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(MINUS);
			setState(125);
			expr();
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

	public static class Not_exprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(JavaScriptParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Not_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitNot_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_exprContext not_expr() throws RecognitionException {
		Not_exprContext _localctx = new Not_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_not_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(NOT);
			setState(128);
			expr();
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

	public static class Operator_listContext extends ParserRuleContext {
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(JavaScriptParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(JavaScriptParser.SEMICOLON, i);
		}
		public Operator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitOperator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_listContext operator_list() throws RecognitionException {
		Operator_listContext _localctx = new Operator_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << IF) | (1L << FUNCTION) | (1L << RETURN) | (1L << BREAK) | (1L << INCR) | (1L << DECR) | (1L << ALERT) | (1L << ID))) != 0)) {
				{
				{
				setState(130);
				operator();
				setState(132);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(131);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(138);
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

	public static class OperatorContext extends ParserRuleContext {
		public Return_operatorContext return_operator() {
			return getRuleContext(Return_operatorContext.class,0);
		}
		public Assign_operatorContext assign_operator() {
			return getRuleContext(Assign_operatorContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Break_operatorContext break_operator() {
			return getRuleContext(Break_operatorContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Alert_operatorContext alert_operator() {
			return getRuleContext(Alert_operatorContext.class,0);
		}
		public Prefix_exprContext prefix_expr() {
			return getRuleContext(Prefix_exprContext.class,0);
		}
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operator);
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				return_operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				assign_operator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				for_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				break_operator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				function_definition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				alert_operator();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				prefix_expr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(147);
				postfix_expr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(148);
				function_call();
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

	public static class Return_operatorContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaScriptParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitReturn_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_operatorContext return_operator() throws RecognitionException {
		Return_operatorContext _localctx = new Return_operatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_return_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(RETURN);
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(152);
				expr();
				}
				break;
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

	public static class Assign_operatorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaScriptParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaScriptParser.VAR, 0); }
		public Assign_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitAssign_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_operatorContext assign_operator() throws RecognitionException {
		Assign_operatorContext _localctx = new Assign_operatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(155);
				match(VAR);
				}
			}

			setState(158);
			variable();
			setState(159);
			match(ASSIGN);
			setState(160);
			expr();
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

	public static class Break_operatorContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(JavaScriptParser.BREAK, 0); }
		public Break_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitBreak_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_operatorContext break_operator() throws RecognitionException {
		Break_operatorContext _localctx = new Break_operatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_break_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(BREAK);
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

	public static class Alert_operatorContext extends ParserRuleContext {
		public TerminalNode ALERT() { return getToken(JavaScriptParser.ALERT, 0); }
		public TerminalNode LBRACKET() { return getToken(JavaScriptParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(JavaScriptParser.RBRACKET, 0); }
		public Alert_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alert_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitAlert_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alert_operatorContext alert_operator() throws RecognitionException {
		Alert_operatorContext _localctx = new Alert_operatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alert_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(ALERT);
			setState(165);
			match(LBRACKET);
			setState(166);
			expr();
			setState(167);
			match(RBRACKET);
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaScriptParser.FOR, 0); }
		public TerminalNode LBRACKET() { return getToken(JavaScriptParser.LBRACKET, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(JavaScriptParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(JavaScriptParser.SEMICOLON, i);
		}
		public TerminalNode RBRACKET() { return getToken(JavaScriptParser.RBRACKET, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_actionContext for_action() {
			return getRuleContext(For_actionContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(FOR);
			setState(170);
			match(LBRACKET);
			setState(172);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << IF) | (1L << FUNCTION) | (1L << RETURN) | (1L << BREAK) | (1L << INCR) | (1L << DECR) | (1L << ALERT) | (1L << ID))) != 0)) {
				{
				setState(171);
				operator();
				}
			}

			setState(174);
			match(SEMICOLON);
			setState(176);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACKET) | (1L << MINUS) | (1L << INCR) | (1L << DECR) | (1L << NOT) | (1L << STRING) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				setState(175);
				expr();
				}
			}

			setState(178);
			match(SEMICOLON);
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(179);
				for_action();
				}
				break;
			}
			setState(182);
			match(RBRACKET);
			setState(188);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(183);
				code_block();
				}
				break;
			case VAR:
			case FOR:
			case IF:
			case FUNCTION:
			case RETURN:
			case BREAK:
			case INCR:
			case DECR:
			case ALERT:
			case ID:
				{
				setState(184);
				operator();
				setState(186);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(185);
					match(SEMICOLON);
					}
					break;
				}
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

	public static class For_actionContext extends ParserRuleContext {
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaScriptParser.COMMA, i);
		}
		public For_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_action; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitFor_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_actionContext for_action() throws RecognitionException {
		For_actionContext _localctx = new For_actionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			switch (_input.LA(1)) {
			case RBRACKET:
				{
				}
				break;
			case VAR:
			case FOR:
			case IF:
			case FUNCTION:
			case RETURN:
			case BREAK:
			case INCR:
			case DECR:
			case ALERT:
			case ID:
				{
				setState(191);
				operator();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(192);
					match(COMMA);
					setState(193);
					operator();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class If_statementContext extends ParserRuleContext {
		public If_partContext if_part() {
			return getRuleContext(If_partContext.class,0);
		}
		public List<Elif_partContext> elif_part() {
			return getRuleContexts(Elif_partContext.class);
		}
		public Elif_partContext elif_part(int i) {
			return getRuleContext(Elif_partContext.class,i);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			if_part();
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					elif_part();
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(208);
				else_part();
				}
				break;
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

	public static class If_partContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaScriptParser.IF, 0); }
		public TerminalNode LBRACKET() { return getToken(JavaScriptParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(JavaScriptParser.RBRACKET, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaScriptParser.SEMICOLON, 0); }
		public If_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_part; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitIf_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_partContext if_part() throws RecognitionException {
		If_partContext _localctx = new If_partContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_if_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(IF);
			setState(212);
			match(LBRACKET);
			setState(213);
			expr();
			setState(214);
			match(RBRACKET);
			setState(220);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(215);
				code_block();
				}
				break;
			case VAR:
			case FOR:
			case IF:
			case FUNCTION:
			case RETURN:
			case BREAK:
			case INCR:
			case DECR:
			case ALERT:
			case ID:
				{
				setState(216);
				operator();
				setState(218);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(217);
					match(SEMICOLON);
					}
					break;
				}
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

	public static class Elif_partContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(JavaScriptParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(JavaScriptParser.IF, 0); }
		public TerminalNode LBRACKET() { return getToken(JavaScriptParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(JavaScriptParser.RBRACKET, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaScriptParser.SEMICOLON, 0); }
		public Elif_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_part; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitElif_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_partContext elif_part() throws RecognitionException {
		Elif_partContext _localctx = new Elif_partContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elif_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(222);
			match(ELSE);
			setState(223);
			match(IF);
			setState(224);
			match(LBRACKET);
			setState(225);
			expr();
			setState(226);
			match(RBRACKET);
			setState(232);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(227);
				code_block();
				}
				break;
			case VAR:
			case FOR:
			case IF:
			case FUNCTION:
			case RETURN:
			case BREAK:
			case INCR:
			case DECR:
			case ALERT:
			case ID:
				{
				setState(228);
				operator();
				setState(230);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(229);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Else_partContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(JavaScriptParser.ELSE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaScriptParser.SEMICOLON, 0); }
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitElse_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_else_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(234);
			match(ELSE);
			setState(240);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(235);
				code_block();
				}
				break;
			case VAR:
			case FOR:
			case IF:
			case FUNCTION:
			case RETURN:
			case BREAK:
			case INCR:
			case DECR:
			case ALERT:
			case ID:
				{
				setState(236);
				operator();
				setState(238);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(237);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\5\5N\n\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\7\b_\n\b\f\b\16\bb\13"+
		"\b\5\bd\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\n\3\n\3\n\5\ns"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\5\20\u0087\n\20\7\20\u0089\n\20\f\20\16\20\u008c\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0098\n\21"+
		"\3\22\3\22\5\22\u009c\n\22\3\23\5\23\u009f\n\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u00af\n\26\3\26"+
		"\3\26\5\26\u00b3\n\26\3\26\3\26\5\26\u00b7\n\26\3\26\3\26\3\26\3\26\5"+
		"\26\u00bd\n\26\5\26\u00bf\n\26\3\27\3\27\3\27\3\27\7\27\u00c5\n\27\f\27"+
		"\16\27\u00c8\13\27\5\27\u00ca\n\27\3\30\3\30\7\30\u00ce\n\30\f\30\16\30"+
		"\u00d1\13\30\3\30\5\30\u00d4\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5"+
		"\31\u00dd\n\31\5\31\u00df\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u00e9\n\32\5\32\u00eb\n\32\3\33\3\33\3\33\3\33\5\33\u00f1\n\33\5"+
		"\33\u00f3\n\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\2\4\4\2\23\24\27\36\3\2\25\26\u0104\2\66\3\2\2\2\4=\3\2"+
		"\2\2\6B\3\2\2\2\bM\3\2\2\2\nO\3\2\2\2\fX\3\2\2\2\16c\3\2\2\2\20k\3\2\2"+
		"\2\22r\3\2\2\2\24t\3\2\2\2\26w\3\2\2\2\30z\3\2\2\2\32~\3\2\2\2\34\u0081"+
		"\3\2\2\2\36\u008a\3\2\2\2 \u0097\3\2\2\2\"\u0099\3\2\2\2$\u009e\3\2\2"+
		"\2&\u00a4\3\2\2\2(\u00a6\3\2\2\2*\u00ab\3\2\2\2,\u00c9\3\2\2\2.\u00cb"+
		"\3\2\2\2\60\u00d5\3\2\2\2\62\u00e0\3\2\2\2\64\u00ec\3\2\2\2\66\67\7\7"+
		"\2\2\678\7%\2\289\7\n\2\29:\5\b\5\2:;\7\13\2\2;<\5\n\6\2<\3\3\2\2\2=>"+
		"\7%\2\2>?\7\n\2\2?@\5\16\b\2@A\7\13\2\2A\5\3\2\2\2BC\7%\2\2C\7\3\2\2\2"+
		"DN\3\2\2\2EJ\5\6\4\2FG\7\16\2\2GI\5\6\4\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2"+
		"\2JK\3\2\2\2KN\3\2\2\2LJ\3\2\2\2MD\3\2\2\2ME\3\2\2\2N\t\3\2\2\2OP\7\f"+
		"\2\2PQ\5\36\20\2QR\7\r\2\2R\13\3\2\2\2SY\5\20\t\2TU\5\20\t\2UV\t\2\2\2"+
		"VW\5\f\7\2WY\3\2\2\2XS\3\2\2\2XT\3\2\2\2Y\r\3\2\2\2Zd\3\2\2\2[`\5\f\7"+
		"\2\\]\7\16\2\2]_\5\f\7\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ad\3"+
		"\2\2\2b`\3\2\2\2cZ\3\2\2\2c[\3\2\2\2d\17\3\2\2\2el\5\22\n\2fl\5\30\r\2"+
		"gl\5\32\16\2hl\5\34\17\2il\5\24\13\2jl\5\26\f\2ke\3\2\2\2kf\3\2\2\2kg"+
		"\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\21\3\2\2\2ms\5\4\3\2ns\5\6\4\2"+
		"os\7\"\2\2ps\7#\2\2qs\7$\2\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2r"+
		"q\3\2\2\2s\23\3\2\2\2tu\t\3\2\2uv\5\6\4\2v\25\3\2\2\2wx\5\6\4\2xy\t\3"+
		"\2\2y\27\3\2\2\2z{\7\n\2\2{|\5\f\7\2|}\7\13\2\2}\31\3\2\2\2~\177\7\24"+
		"\2\2\177\u0080\5\f\7\2\u0080\33\3\2\2\2\u0081\u0082\7\37\2\2\u0082\u0083"+
		"\5\f\7\2\u0083\35\3\2\2\2\u0084\u0086\5 \21\2\u0085\u0087\7\20\2\2\u0086"+
		"\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0084\3\2"+
		"\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\37\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0098\5\"\22\2\u008e\u0098\5$\23"+
		"\2\u008f\u0098\5*\26\2\u0090\u0098\5&\24\2\u0091\u0098\5.\30\2\u0092\u0098"+
		"\5\2\2\2\u0093\u0098\5(\25\2\u0094\u0098\5\24\13\2\u0095\u0098\5\26\f"+
		"\2\u0096\u0098\5\4\3\2\u0097\u008d\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u008f"+
		"\3\2\2\2\u0097\u0090\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2\2\2\u0097"+
		"\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2"+
		"\2\2\u0098!\3\2\2\2\u0099\u009b\7\b\2\2\u009a\u009c\5\f\7\2\u009b\u009a"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c#\3\2\2\2\u009d\u009f\7\3\2\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\5\6"+
		"\4\2\u00a1\u00a2\7 \2\2\u00a2\u00a3\5\f\7\2\u00a3%\3\2\2\2\u00a4\u00a5"+
		"\7\t\2\2\u00a5\'\3\2\2\2\u00a6\u00a7\7!\2\2\u00a7\u00a8\7\n\2\2\u00a8"+
		"\u00a9\5\f\7\2\u00a9\u00aa\7\13\2\2\u00aa)\3\2\2\2\u00ab\u00ac\7\4\2\2"+
		"\u00ac\u00ae\7\n\2\2\u00ad\u00af\5 \21\2\u00ae\u00ad\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\7\20\2\2\u00b1\u00b3\5\f\7\2"+
		"\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6"+
		"\7\20\2\2\u00b5\u00b7\5,\27\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b8\u00be\7\13\2\2\u00b9\u00bf\5\n\6\2\u00ba\u00bc"+
		"\5 \21\2\u00bb\u00bd\7\20\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2"+
		"\u00bd\u00bf\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf+\3"+
		"\2\2\2\u00c0\u00ca\3\2\2\2\u00c1\u00c6\5 \21\2\u00c2\u00c3\7\16\2\2\u00c3"+
		"\u00c5\5 \21\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00c0\3\2\2\2\u00c9\u00c1\3\2\2\2\u00ca-\3\2\2\2\u00cb\u00cf\5\60\31"+
		"\2\u00cc\u00ce\5\62\32\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d2\u00d4\5\64\33\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"/\3\2\2\2\u00d5\u00d6\7\5\2\2\u00d6\u00d7\7\n\2\2\u00d7\u00d8\5\f\7\2"+
		"\u00d8\u00de\7\13\2\2\u00d9\u00df\5\n\6\2\u00da\u00dc\5 \21\2\u00db\u00dd"+
		"\7\20\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2"+
		"\u00de\u00d9\3\2\2\2\u00de\u00da\3\2\2\2\u00df\61\3\2\2\2\u00e0\u00e1"+
		"\7\6\2\2\u00e1\u00e2\7\5\2\2\u00e2\u00e3\7\n\2\2\u00e3\u00e4\5\f\7\2\u00e4"+
		"\u00ea\7\13\2\2\u00e5\u00eb\5\n\6\2\u00e6\u00e8\5 \21\2\u00e7\u00e9\7"+
		"\20\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00eb\63\3\2\2\2\u00ec\u00f2\7\6\2"+
		"\2\u00ed\u00f3\5\n\6\2\u00ee\u00f0\5 \21\2\u00ef\u00f1\7\20\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00ed\3\2"+
		"\2\2\u00f2\u00ee\3\2\2\2\u00f3\65\3\2\2\2\35JMX`ckr\u0086\u008a\u0097"+
		"\u009b\u009e\u00ae\u00b2\u00b6\u00bc\u00be\u00c6\u00c9\u00cf\u00d3\u00dc"+
		"\u00de\u00e8\u00ea\u00f0\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}