package comportamiento.interpreter.ejercicios.ej2my;

public class TerminalExpressionPara extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        context.output += "Then ";
        context.cont++;
    }
}
