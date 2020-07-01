package comportamiento.interpreter.ejercicios.ej2my;

public class TerminalExpressionQuiero extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        context.output += "When ";
        context.cont++;
    }
}
