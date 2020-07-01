package examenes.examen2IgnacioDelRio.strategy;

public class StrategyVerano implements IStrategy{
    @Override
    public void execute(Ropa[] stock) {
        System.out.println("Estacion: Verano");
        for (Ropa ropa: stock) {
            System.out.println("Tipo: " + ropa.getTipo());
            System.out.println("Precio con rebaja de verano del 10%: " + (ropa.getPrecio()*0.9));
        }
        System.out.println("**********");
    }
}
