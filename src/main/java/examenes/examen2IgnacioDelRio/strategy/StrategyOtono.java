package examenes.examen2IgnacioDelRio.strategy;

public class StrategyOtono implements IStrategy{
    @Override
    public void execute(Ropa[] stock) {
        System.out.println("Estacion: Otono");
        for (Ropa ropa: stock) {
            System.out.println("Tipo: " + ropa.getTipo());
            System.out.println("Precio con rebaja de otono del 50%: " + (ropa.getPrecio()*0.5));
        }
        System.out.println("**********");
    }
}
