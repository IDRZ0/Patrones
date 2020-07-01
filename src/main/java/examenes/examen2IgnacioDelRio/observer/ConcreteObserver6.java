package examenes.examen2IgnacioDelRio.observer;

public class ConcreteObserver6 implements IObserver {
    private String nombre;

    public ConcreteObserver6(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String type, String promo) {
        System.out.println(this.nombre + " no desea recibir notificaciones.");
    }
}
