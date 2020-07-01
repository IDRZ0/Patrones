package comportamiento.interpreter.ejercicios.ej2my;

public class Context {
    protected String[] input;
    protected int cont;
    protected String output;

    public Context(String[] input) {
        this.input = input;
        cont = 0;
        this.output = "";
    }
}
