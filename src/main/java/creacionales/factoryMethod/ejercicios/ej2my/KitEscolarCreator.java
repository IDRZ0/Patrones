package creacionales.factoryMethod.ejercicios.ej2my;

public class KitEscolarCreator extends Creator{
    @Override
    public KitEscolar factoryMethodKit() {
        KitEscolar kitEscolar = new KitEscolar();
        kitEscolar.setCuaderno(new Cuaderno("Anillado",500));
        kitEscolar.setDeportivo(new Deportivo(30,"Azul",10));
        kitEscolar.setMochila(new Mochila(5,"Grande"));
        return kitEscolar;
    }
}
