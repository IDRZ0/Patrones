package examenes.examen1IgnacioDelRio.Builder;

public class Cliente {
    public static void main(String[] args) {
        Director director = new Director();

        PlatoBuilder platoBuilder1 = new PlatoBife();
        PlatoBuilder platoBuilder2 = new PlatoLomito();
        PlatoBuilder platoBuilder3 = new PlatoTira();

        director.setPlatoBuilder(platoBuilder1);
        director.buildPlato();
        Plato plato1 = director.getPlato();

        director.setPlatoBuilder(platoBuilder2);
        director.buildPlato();
        Plato plato2 = director.getPlato();

        director.setPlatoBuilder(platoBuilder3);
        director.buildPlato();
        Plato plato3 = director.getPlato();

        plato1.show();
        plato2.show();
        plato3.show();
    }
}
