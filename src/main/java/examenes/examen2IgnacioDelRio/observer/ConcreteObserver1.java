package examenes.examen2IgnacioDelRio.observer;

public class ConcreteObserver1 implements IObserver {
    private String nombre;

    public ConcreteObserver1(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String type, String promo) {
        if (type == "Precios") {
            System.out.println("Oferta de " + type + " para " + this.nombre + ": " + promo);
        }
    }
}
