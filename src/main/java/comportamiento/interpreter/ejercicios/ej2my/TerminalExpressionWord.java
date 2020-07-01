package comportamiento.interpreter.ejercicios.ej2my;

public class TerminalExpressionWord extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        context.output += context.input[context.cont] + " ";
        context.cont++;
    }
}
