package creacionales.builder.examples.ej1my;

public class Director {
    private PizzaBuilder pizzaBuilder;

    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }

    public void buildPizza(){
        pizzaBuilder.createPizza();
        pizzaBuilder.createMasa();
        pizzaBuilder.createSalsa();
        pizzaBuilder.createQueso();
    }
}
