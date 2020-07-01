package comportamiento.interpreter.ejercicios.ej1my;

public class Context {
    protected String input;
    protected String output;
    protected int cont;

    public Context(String input) {
        this.input = input;
        cont = Integer.parseInt(String.valueOf(input.charAt(0)));
    }
}
