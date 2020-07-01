package examenes.examen2IgnacioDelRio.strategy;

public class StrategyInvierno implements IStrategy{
    @Override
    public void execute(Ropa[] stock) {
        System.out.println("Estacion: Invierno");
        for (Ropa ropa: stock) {
            System.out.println("Tipo: " + ropa.getTipo());
            System.out.println("Precio con aumento de invierno del 10%: " + (ropa.getPrecio()+(ropa.getPrecio()*0.1)));
        }
        System.out.println("**********");
    }
}
