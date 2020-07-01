package creacionales.builder.examples.ej1my;

public class PizzaHawaiana extends PizzaBuilder {
    @Override
    public void createMasa() { pizza.setMasa("Blanda"); }

    @Override
    public void createSalsa() {
        pizza.setSalsa("Tomate dulce");
    }

    @Override
    public void createQueso() {
        pizza.setQueso("Muzarella");
    }
}

