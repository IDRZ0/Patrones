package creacionales.factoryMethod.ejercicios.ej2my;

public class Cliente {
    public static void main(String[] args) {
        KitColegialCreator kitColegialCreator = new KitColegialCreator();
        KitEscolarCreator kitEscolarCreator = new KitEscolarCreator();

        KitEscolar kitEscolar = kitEscolarCreator.factoryMethodKit();
        KitColegial kitColegial = kitColegialCreator.factoryMethodKit();

        kitColegial.show();
        kitEscolar.show();
    }
}
