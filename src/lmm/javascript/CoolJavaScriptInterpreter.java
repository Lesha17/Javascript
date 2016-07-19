package lmm.javascript;

import lmm.javascript.gen.*;

import java.util.HashMap;

public class CoolJavaScriptInterpreter extends JavaScriptBaseVisitor<JSValue> {
    private HashMap<String, JSValue> variables;
    private HashMap<String, JavaScriptParser.Function_definitionContext> functions;

    public CoolJavaScriptInterpreter() {
        super();
        variables = new HashMap<>();
        functions = new HashMap<>();
    }

    @Override
    public JSValue visitOperator(JavaScriptParser.OperatorContext ctx) {
        if (ctx.return_operator() != null) {
            return ctx.return_operator().expr() != null ?
                    visitExpr(ctx.return_operator().expr()).asReturned()
                    : JSValue.VOID.asReturned();
        }
        if (ctx.assign_operator() != null) {
            return visitAssign_operator(ctx.assign_operator());
        }
        if (ctx.break_operator() != null) {
            return JSValue.BREAK;
        }
        if (ctx.for_loop() != null) {
            return visitFor_loop(ctx.for_loop());
        }
        if (ctx.if_statement() != null) {
            return visitIf_statement(ctx.if_statement());
        }
        if (ctx.function_definition() != null) {
            return visitFunction_definition(ctx.function_definition());
        }
        if (ctx.alert_operator() != null) {
            return visitAlert_operator(ctx.alert_operator());
        }
        if (ctx.prefix_expr() != null) {
            return visitPrefix_expr(ctx.prefix_expr());
        }
        if (ctx.postfix_expr() != null) {
            return visitPostfix_expr(ctx.postfix_expr());
        }
        if (ctx.function_call() != null) {
            return visitFunction_call(ctx.function_call());
        }

        throw new UnsupportedOperationException("Must not be here");
    }

    @Override
    public JSValue visitAssign_operator(JavaScriptParser.Assign_operatorContext ctx) {
        String var_id = ctx.variable().ID().getText();
        JSValue expr_result = visitExpr(ctx.expr());
        variables.put(var_id, expr_result);
        return expr_result;
    }

    @Override
    public JSValue visitFor_loop(JavaScriptParser.For_loopContext ctx) {
        if (ctx.operator(0) != null) {
            JSValue result = visitOperator(ctx.operator(0));
            if (result.isReturn()) {
                return result;
            }
        }

        while (true) {
            if (ctx.expr() != null) {
                JSValue expr_result = visitExpr(ctx.expr());
                boolean for_expr = expr_result.isBool() ? expr_result.asBoolean()
                        : expr_result.isNumber() ? expr_result.asNumber().doubleValue() != 0.0 && expr_result.asNumber().doubleValue() != -0.0
                        : expr_result.isString() ? !expr_result.asString().isEmpty() : false;
                if (!for_expr) {
                    break;
                }
            }

            if (ctx.operator(1) != null) {
                JSValue result = visitOperator(ctx.operator(1));
                if (result == JSValue.BREAK) {
                    break;
                }
                if (result.isReturn()) {
                    return result;
                }
            }
            if (ctx.code_block() != null) {
                JSValue result = visitCode_block(ctx.code_block());
                if (result == JSValue.BREAK) {
                    break;
                }
                if (result.isReturn()) {
                    return result;
                }
            }

            if (ctx.for_action() != null) {
                for (JavaScriptParser.OperatorContext operator : ctx.for_action().operator()) {
                    JSValue result = visitOperator(operator);
                    if (result == JSValue.BREAK) {
                        break;
                    }
                    if (result.isReturn()) {
                        return result;
                    }
                }
            }
        }
        return JSValue.VOID;
    }

    @Override
    public JSValue visitIf_statement(JavaScriptParser.If_statementContext ctx) {
        if (ctx.if_part() != null) {
            JSValue if_expr_result = visitExpr(ctx.if_part().expr());

            boolean if_expr = if_expr_result.isBool() ? if_expr_result.asBoolean()
                    : if_expr_result.isNumber() ? if_expr_result.asNumber().doubleValue() != 0.0 && if_expr_result.asNumber().doubleValue() != -0.0
                    : if_expr_result.isString() ? !if_expr_result.asString().isEmpty() : false;
            if (if_expr) {
                if (ctx.if_part().operator() != null) {
                    JSValue result = visitOperator(ctx.if_part().operator());
                    if (result == JSValue.BREAK) {
                        return JSValue.BREAK;
                    }
                    if (result.isReturn()) {
                        return result;
                    }
                }
                if (ctx.if_part().code_block() != null) {
                    return visitCode_block(ctx.if_part().code_block());
                }
                return JSValue.VOID;
            }
        }

        if (ctx.elif_part() != null) {
            for (JavaScriptParser.Elif_partContext elctx : ctx.elif_part()) {
                JSValue elif_expr_result = visitExpr(elctx.expr());
                boolean elif_expr = elif_expr_result.isBool() ? elif_expr_result.asBoolean()
                        : elif_expr_result.isNumber() ? elif_expr_result.asNumber().doubleValue() != 0.0 && elif_expr_result.asNumber().doubleValue() != -0.0
                        : elif_expr_result.isString() ? !elif_expr_result.asString().isEmpty() : false;
                if (elif_expr) {
                    if (elctx.operator() != null) {
                        JSValue result = visitOperator(elctx.operator());
                        if (result == JSValue.BREAK) {
                            return JSValue.BREAK;
                        }
                        if (result.isReturn()) {
                            return result;
                        }
                    }
                    if (elctx.code_block() != null) {
                        return visitCode_block(elctx.code_block());
                    }

                    return JSValue.VOID;
                }
            }
        }

        if (ctx.else_part() != null) {
            if (ctx.else_part().operator() != null) {
                JSValue result = visitOperator(ctx.else_part().operator());
                if (result == JSValue.BREAK) {
                    return JSValue.BREAK;
                }
                if (result.isReturn()) {
                    return result;
                }
            }
            if (ctx.else_part().code_block() != null) {

                return visitCode_block(ctx.else_part().code_block());
            }
            return JSValue.VOID;
        }
        return JSValue.VOID;
    }

    @Override
    public JSValue visitFunction_definition(JavaScriptParser.Function_definitionContext ctx) {
        functions.put(ctx.ID().getText(), ctx);
        return JSValue.VOID;
    }

    @Override
    public JSValue visitAlert_operator(JavaScriptParser.Alert_operatorContext ctx) {
        JSValue result = visitExpr(ctx.expr());
        if (result == JSValue.BREAK) {
            return JSValue.BREAK;
        }
        if (result.isReturn()) {
            return result;
        }
        System.out.println(result.asString());
        return JSValue.VOID;
    }

    @Override
    public JSValue visitCode_block(JavaScriptParser.Code_blockContext ctx) {
        return visitOperator_list(ctx.operator_list());
    }

    @Override
    public JSValue visitExpr(JavaScriptParser.ExprContext ctx) {
        if (ctx.expr() == null) {
            return visitSimple_expr(ctx.simple_expr());
        } else {
            return visitBin_expr(ctx);
        }
    }

    @Override
    public JSValue visitSimple_expr(JavaScriptParser.Simple_exprContext ctx) {
        JSValue expr_result;
        if (ctx.expr_base() != null) {
            return visitExpr_base(ctx.expr_base());
        }
        if (ctx.prefix_expr() != null) {
            return visitPrefix_expr(ctx.prefix_expr());
        }
        if (ctx.postfix_expr() != null) {
            return visitPostfix_expr(ctx.postfix_expr());
        }
        if (ctx.expr_in_brackets() != null) {
            return visitExpr(ctx.expr_in_brackets().expr());
        }
        if (ctx.minus_expr() != null) {
            return visitMinus_expr(ctx.minus_expr());
        }
        if (ctx.not_expr() != null) {
            return visitNot_expr(ctx.not_expr());
        }
        throw new RuntimeException("Must not be here!");
    }

    @Override
    public JSValue visitExpr_base(JavaScriptParser.Expr_baseContext ctx) {
        if (ctx.function_call() != null) {
            return visitFunction_call(ctx.function_call());
        }
        if (ctx.variable() != null) {
            return visitVariable(ctx.variable());
        }

        if (ctx.STRING() != null) {
            String text = ctx.STRING().getText();
            return new JSValue(text.substring(1, text.length() - 1));
        }
        if (ctx.NUMBER() != null) {
            return new JSValue(Double.parseDouble(ctx.NUMBER().getText()));
        }
        if (ctx.BOOLEAN() != null) {
            return new JSValue(ctx.BOOLEAN().getText() == "true");
        }
        throw new RuntimeException("Must not be here!");
    }

    @Override
    public JSValue visitVariable(JavaScriptParser.VariableContext ctx) {
        String key = ctx.ID().getText();
        if (variables.containsKey(key)) {
            return variables.get(key);
        } else {
            throw new RuntimeException("Variable " + key + " is not defined");
        }
    }

    @Override
    public JSValue visitFunction_call(JavaScriptParser.Function_callContext ctx) {
        String key = "";
        key = ctx.ID().getText();

        if (functions.containsKey(key)) {
            return executeFunction(functions.get(key), ctx.args_list());
        } else {
            throw new RuntimeException("Function " + key + " is not defined");
        }
    }

    @Override
    public JSValue visitMinus_expr(JavaScriptParser.Minus_exprContext ctx) {
        JSValue expr_result = visitExpr(ctx.expr());
        double val = expr_result.isNumber() ? expr_result.asNumber().doubleValue() : (expr_result.isBool() ? (expr_result.asBoolean() ? 1 : 0) : Double.NaN);
        try {
            if (expr_result.isString()) {
                val = Double.parseDouble(expr_result.asString());
            }
        } catch (Exception e) {
        }
        return new JSValue(-1 * val);
    }

    @Override
    public JSValue visitNot_expr(JavaScriptParser.Not_exprContext ctx) {
        JSValue expr_result = visitExpr(ctx.expr());
        if (expr_result.isBool()) {
            return new JSValue(!expr_result.asBoolean());
        }
        if (expr_result.isNumber()) {
            double dv = expr_result.asNumber().doubleValue();
            return new JSValue((dv == 0.0 || dv == -0.0) ? true : false);
        }
        return new JSValue(false);
    }

    public JSValue visitBin_expr(JavaScriptParser.ExprContext ctx) {
        JSValue expr1 = visitSimple_expr(ctx.simple_expr());
        JSValue expr2 = visitExpr(ctx.expr());

        double v1 = expr1.isNumber() ? expr1.asNumber().doubleValue() : (expr1.isBool() ? (expr1.asBoolean() ? 1 : 0) : Double.NaN);
        double v2 = expr2.isNumber() ? expr2.asNumber().doubleValue() : (expr2.isBool() ? (expr2.asBoolean() ? 1 : 0) : Double.NaN);

        if (ctx.PLUS() != null) {
            if (expr1.isString() || expr2.isString()) {
                return new JSValue(expr1.asString() + expr2.asString());
            }
            return new JSValue(v1 + v2);
        }
        try {
            if (expr1.isString()) {
                v1 = Double.parseDouble(expr1.asString());
            }
        } catch (Exception e) {
        }
        try {
            if (expr2.isString()) {
                v2 = Double.parseDouble(expr2.asString());
            }
        } catch (Exception e) {
        }

        if (ctx.MINUS() != null) {
            return new JSValue(v1 - v2);
        }
        if (ctx.MULT() != null) {
            return new JSValue(v1 * v2);
        }
        if (ctx.MOD() != null) {
            return new JSValue(v1 % v2);
        }
        if (ctx.MORE_TH() != null) {
            if (expr1.isString() && expr2.isString()) {
                return new JSValue(expr1.asString().compareTo(expr2.asString()) > 0);
            }
            return new JSValue(v1 > v2);
        }
        if (ctx.LESS_TH() != null) {
            if (expr1.isString() && expr2.isString()) {
                return new JSValue(expr1.asString().compareTo(expr2.asString()) < 0);
            }
            return new JSValue(v1 < v2);
        }
        if (ctx.EQ() != null) {
            if (expr1.isString() && expr2.isString()) {
                return new JSValue(expr1.asString().equals(expr2.asString()));
            }
            return new JSValue(v1 == v2);
        }
        if (ctx.MORE_OR_EQ() != null) {
            if (expr1.isString() && expr2.isString()) {
                return new JSValue(expr1.asString().compareTo(expr2.asString()) >= 0);
            }
            return new JSValue(v1 >= v2);
        }
        if (ctx.LESS_OR_EQ() != null) {
            if (expr1.isString() && expr2.isString()) {
                return new JSValue(expr1.asString().compareTo(expr2.asString()) <= 0);
            }
            return new JSValue(v1 <= v2);
        }
        if (ctx.NOT_EQ() != null) {
            if (expr1.isString() && expr2.isString()) {
                return new JSValue(!expr1.asString().equals(expr2.asString()));
            }
            return new JSValue(v1 != v2);
        }
        throw new RuntimeException("Must not be here");
    }

    @Override
    public JSValue visitPrefix_expr(JavaScriptParser.Prefix_exprContext ctx) {
        String key = ctx.variable().ID().getText();
        if (variables.containsKey(key)) {
            JSValue oldJSValue = variables.get(key);
            double dval = oldJSValue.isNumber() ? oldJSValue.asNumber().doubleValue() : (oldJSValue.isBool() ? (oldJSValue.asBoolean() ? 1 : 0) : Double.NaN);
            try {
                if (oldJSValue.isString()) {
                    dval = Double.parseDouble(oldJSValue.asString());
                }
            } catch (Exception e) {
            }

            if (ctx.INCR() != null) {
                dval += 1;
            }
            if (ctx.DECR() != null) {
                dval -= 1;
            }
            JSValue newJSValue = new JSValue(dval);
            variables.put(key, newJSValue);
            return newJSValue;
        } else {
            throw new RuntimeException("Variable " + key + " is not defined");
        }
    }

    @Override
    public JSValue visitPostfix_expr(JavaScriptParser.Postfix_exprContext ctx) {
        String key = ctx.variable().ID().getText();
        if (variables.containsKey(key)) {
            JSValue oldJSValue = variables.get(key);
            double dval = oldJSValue.isNumber() ? oldJSValue.asNumber().doubleValue() : (oldJSValue.isBool() ? (oldJSValue.asBoolean() ? 1 : 0) : Double.NaN);
            try {
                if (oldJSValue.isString()) {
                    dval = Double.parseDouble(oldJSValue.asString());
                }
            } catch (Exception e) {
            }

            if (ctx.INCR() != null) {
                dval += 1;
            }
            if (ctx.DECR() != null) {
                dval -= 1;
            }
            JSValue newJSValue = new JSValue(dval);
            variables.put(key, newJSValue);
            return oldJSValue;
        } else {
            throw new RuntimeException("Variable " + key + " is not defined");
        }
    }

    @Override
    public JSValue visitOperator_list(JavaScriptParser.Operator_listContext ctx) {
        for (JavaScriptParser.OperatorContext operator : ctx.operator()) {
            JSValue reuslt = visitOperator(operator);
            if (reuslt.isReturn()) {
                return new JSValue(reuslt.getValue(), true);
            }
            if (reuslt == JSValue.BREAK) {
                return JSValue.BREAK;
            }
        }
        return JSValue.VOID;
    }

    public JSValue executeFunction(JavaScriptParser.Function_definitionContext ctx, JavaScriptParser.Args_listContext args_listContext) {
        HashMap<String, JSValue> default_varMap = variables;
        HashMap<String, JavaScriptParser.Function_definitionContext> default_funcMap = functions;

        variables = (HashMap<String, JSValue>) variables.clone();
        functions = (HashMap<String, JavaScriptParser.Function_definitionContext>) functions.clone();

        int i;
        for (i = 0; i < Math.min(ctx.var_list().variable().size(), args_listContext.expr().size()); ++i) {
            variables.put(ctx.var_list().variable(i).ID().getText(), visitExpr(args_listContext.expr(i)));
        }
        for (; i < ctx.var_list().variable().size(); ++i) {
            variables.put(ctx.var_list().variable(i).ID().getText(), JSValue.NULL);
        }

        JSValue toReturn = new JSValue(visitCode_block(ctx.code_block()).getValue());
        variables = default_varMap;
        functions = default_funcMap;
        return toReturn;
    }
}

