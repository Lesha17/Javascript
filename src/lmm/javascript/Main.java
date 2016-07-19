package lmm.javascript;

import lmm.javascript.gen.JavaScriptLexer;
import lmm.javascript.gen.JavaScriptParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        for (String src : args) {
            try {
                JavaScriptLexer lexer = new JavaScriptLexer(new ANTLRFileStream(src));
                JavaScriptParser parser = new JavaScriptParser(new CommonTokenStream(lexer));
                parser.setBuildParseTree(true);

                CoolJavaScriptInterpreter interpreter = new CoolJavaScriptInterpreter();

                interpreter.visitOperator_list(parser.operator_list());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
