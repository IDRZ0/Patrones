package comportamiento.interpreter.ejercicios.ej1my;

public class TerminalExpressionInt extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        context.input = context.input.substring(1);
    }
}
