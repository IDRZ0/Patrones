package examenes.examen2IgnacioDelRio.strategy;

public class Tienda {
    private IStrategy strategy;
    private Ropa[] stock;

    public Tienda(Ropa[] stock) {
        this.stock = stock;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public Ropa[] getStock() {
        return stock;
    }

    public void setStock(Ropa[] stock) {
        this.stock = stock;
    }

    public void execute() {
        this.strategy.execute(this.stock);
    }
}
