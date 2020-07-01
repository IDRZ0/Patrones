package creacionales.builder.examples.ej1my;

public class Cliente {
    public static void main(String[] args) {
        Director director = new Director();

        PizzaBuilder pizzaBuilder1 = new PizzaCarnivora();
        PizzaBuilder pizzaBuilder2 = new PizzaHawaiana();

        director.setPizzaBuilder(pizzaBuilder1);
        director.buildPizza();
        Pizza pizza1 = director.getPizza();

        director.setPizzaBuilder(pizzaBuilder2);
        director.buildPizza();
        Pizza pizza2 = director.getPizza();

        pizza1.show();
        pizza2.show();
    }
}
