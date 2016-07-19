// Generated from JavaScript.g4 by ANTLR 4.5
package lmm.javascript.gen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(JavaScriptParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(JavaScriptParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(JavaScriptParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_list(JavaScriptParser.Var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(JavaScriptParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(JavaScriptParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#args_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_list(JavaScriptParser.Args_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expr(JavaScriptParser.Simple_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#expr_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_base(JavaScriptParser.Expr_baseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#prefix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_expr(JavaScriptParser.Prefix_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#postfix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expr(JavaScriptParser.Postfix_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#expr_in_brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_in_brackets(JavaScriptParser.Expr_in_bracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#minus_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus_expr(JavaScriptParser.Minus_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#not_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_expr(JavaScriptParser.Not_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#operator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_list(JavaScriptParser.Operator_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(JavaScriptParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#return_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_operator(JavaScriptParser.Return_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#assign_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_operator(JavaScriptParser.Assign_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#break_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_operator(JavaScriptParser.Break_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#alert_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlert_operator(JavaScriptParser.Alert_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(JavaScriptParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#for_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_action(JavaScriptParser.For_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(JavaScriptParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#if_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_part(JavaScriptParser.If_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#elif_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_part(JavaScriptParser.Elif_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_part(JavaScriptParser.Else_partContext ctx);
}