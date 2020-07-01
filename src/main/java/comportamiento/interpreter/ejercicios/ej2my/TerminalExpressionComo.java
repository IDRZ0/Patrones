package comportamiento.interpreter.ejercicios.ej2my;

public class TerminalExpressionComo extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        context.output += "Given ";
        context.cont++;
    }
}
