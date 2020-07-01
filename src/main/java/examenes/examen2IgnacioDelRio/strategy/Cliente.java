package examenes.examen2IgnacioDelRio.strategy;

public class Cliente {
    public static void main(String[] args) {
        Ropa[] stock = new Ropa[3];
        stock[0] = new Ropa("Chompa",100);
        stock[1] = new Ropa("Pantalon",80);
        stock[2] = new Ropa("Camisa",50);

        StrategyInvierno invierno = new StrategyInvierno();
        StrategyOtono otono = new StrategyOtono();
        StrategyPrimavera primavera = new StrategyPrimavera();
        StrategyVerano verano = new StrategyVerano();

        Tienda tienda = new Tienda(stock);

        tienda.setStrategy(invierno);
        tienda.execute();

        tienda.setStrategy(otono);
        tienda.execute();

        tienda.setStrategy(primavera);
        tienda.execute();

        tienda.setStrategy(verano);
        tienda.execute();
    }
}
