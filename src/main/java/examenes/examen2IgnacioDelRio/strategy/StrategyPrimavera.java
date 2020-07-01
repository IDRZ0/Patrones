package examenes.examen2IgnacioDelRio.strategy;

public class StrategyPrimavera implements IStrategy{
    @Override
    public void execute(Ropa[] stock) {
        System.out.println("Estacion: Primavera");
        for (Ropa ropa: stock) {
            System.out.println("Tipo: " + ropa.getTipo());
            System.out.println("Precio de primavera sin rebaja: " + ropa.getPrecio());
        }
        System.out.println("**********");
    }
}
