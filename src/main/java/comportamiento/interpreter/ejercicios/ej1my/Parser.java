package comportamiento.interpreter.ejercicios.ej1my;

import java.util.ArrayList;

public class Parser {
    private ArrayList<AbstractExpression> parseTree = new ArrayList<>();
    private Context context;

    public Parser(String s){
        context = new Context(s.replace(" ",""));
        context.input = context.input.substring(1);
        for (String token : s.split(" ")) {
            switch (token){
                case "+":
                    parseTree.add(new TerminalExpressionPlus());
                    break;
                case "-":
                    parseTree.add(new TerminalExpressionLess());
                    break;
                default:
                    break;
            }
        }
    }

    public String evaluate(){
        for (AbstractExpression e : parseTree) {
            e.interpret(context);
        }
        context.output = Integer.toString(context.cont);
        return context.output;
    }
}
