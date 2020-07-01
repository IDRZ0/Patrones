package creacionales.builder.examples.ej1my;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza(){
        return this.pizza;
    }

    public void createPizza(){
        pizza = new Pizza();
    }

    public abstract void createMasa();
    public abstract void createSalsa();
    public abstract void createQueso();
}
