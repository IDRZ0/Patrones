package comportamiento.interpreter.ejercicios.ej1my;

public class TerminalExpressionPlus extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        context.cont += Integer.parseInt(String.valueOf(context.input.charAt(1)));
        context.input = context.input.substring(2);
    }
}
