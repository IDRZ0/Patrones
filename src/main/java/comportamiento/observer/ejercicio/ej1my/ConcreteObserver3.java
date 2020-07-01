package comportamiento.observer.ejercicio.ej1my;

public class ConcreteObserver3 implements IObserver{
    private String name;

    public ConcreteObserver3(String name) {
        this.name = name;
    }

    @Override
    public void update(Video video) {
        System.out.println(this.name + ": Nuevo video: " + video.getTitulo() + ". Categoria: " + video.getCategoria());
    }
}
