package examenes.examen2IgnacioDelRio.observer;

public class ConcreteObserver2 implements IObserver {
    private String nombre;

    public ConcreteObserver2(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String type, String promo) {
        if (type == "Promociones") {
            System.out.println("Oferta de " + type + " para " + this.nombre + ": " + promo);
        }
    }
}
