package comportamiento.interpreter.ejercicios.ej2my;

public class Cliente {
    public static void main(String[] args) {
        String input = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        System.out.println("Input: " + input);
        System.out.println("Output: " + new Parser(input).evaluate());
    }
}
