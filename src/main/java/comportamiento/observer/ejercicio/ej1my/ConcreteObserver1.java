package comportamiento.observer.ejercicio.ej1my;

public class ConcreteObserver1 implements IObserver{
    private String name;

    public ConcreteObserver1(String name) {
        this.name = name;
    }

    @Override
    public void update(Video video) {
        if (video.getCategoria() == "Deporte") {
            System.out.println(this.name + ": Nuevo video: " + video.getTitulo() + ". Categoria: " + video.getCategoria());
        }
    }
}
