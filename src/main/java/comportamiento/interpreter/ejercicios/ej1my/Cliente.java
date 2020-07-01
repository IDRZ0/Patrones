package comportamiento.interpreter.ejercicios.ej1my;

public class Cliente {
    public static void main(String[] args) {
        String input = "1 + 2 - 3 + 4";
        System.out.println("Input: " + input);
        System.out.println("Output: " + (new Parser(input).evaluate()));
    }
}
