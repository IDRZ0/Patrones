package examenes.examen2IgnacioDelRio.observer;

public class ConcreteObserver4 implements IObserver {
    private String nombre;

    public ConcreteObserver4(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String type, String promo) {
        if (type == "Noticias") {
            System.out.println("Oferta de " + type + " para " + this.nombre + ": " + promo);
        }
    }
}
