package creacionales.factoryMethod.ejercicios.ej2my;

public class KitColegialCreator extends Creator{
    @Override
    public KitColegial factoryMethodKit() {
        KitColegial kitColegial = new KitColegial();
        kitColegial.setComputadora(new Computadora("Asus","Windows"));
        kitColegial.setLibro(new Libro("Matematica","Chungara"));
        kitColegial.setMochila(new Mochila(7,"Enorme"));
        return kitColegial;
    }
}
