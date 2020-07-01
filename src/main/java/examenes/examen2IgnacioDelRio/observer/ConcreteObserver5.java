package examenes.examen2IgnacioDelRio.observer;

public class ConcreteObserver5 implements IObserver {
    private String nombre;

    public ConcreteObserver5(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String type, String promo) {
        if (type == "Precios" || type == "Premios" || type == "Promociones" || type == "Noticias") {
            System.out.println("Oferta de " + type + " para " + this.nombre + ": " + promo);
        }
    }
}
