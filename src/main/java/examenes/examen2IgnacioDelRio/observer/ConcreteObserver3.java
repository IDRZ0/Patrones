package examenes.examen2IgnacioDelRio.observer;

public class ConcreteObserver3 implements IObserver {
    private String nombre;

    public ConcreteObserver3(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String type, String promo) {
        if (type == "Premios") {
            System.out.println("Oferta de " + type + " para " + this.nombre + ": " + promo);
        }
    }
}
