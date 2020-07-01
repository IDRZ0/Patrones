package comportamiento.interpreter.ejercicios.ej2my;

import java.util.ArrayList;

public class Parser {
    private ArrayList<AbstractExpression> parseTree = new ArrayList<>();
    private Context context;

    public Parser(String s) {
        context = new Context(s.split(" "));
        for (String token: s.split(" ")){
            switch (token){
                case "Como":
                    parseTree.add(new TerminalExpressionComo());
                    break;
                case "Quiero":
                    parseTree.add(new TerminalExpressionQuiero());
                    break;
                case "Para":
                    parseTree.add(new TerminalExpressionPara());
                    break;
                default:
                    parseTree.add(new TerminalExpressionWord());
                    break;
            }
        }
    }

    public String evaluate(){
        for(AbstractExpression e: parseTree){
            e.interpret(context);
        }
        return context.output;
    }
}
