package creacionales.builder.examples.ej1my;

public class PizzaCarnivora extends PizzaBuilder{
    @Override
    public void createMasa() {
        pizza.setMasa("Crocante");
    }

    @Override
    public void createSalsa() {
        pizza.setSalsa("Poco picante");
    }

    @Override
    public void createQueso() {
        pizza.setQueso("Parmesano");
    }
}
