package comportamiento.observer.ejercicio.ej1my;

public class ConcreteObserver2 implements IObserver{
    private String name;

    public ConcreteObserver2(String name) {
        this.name = name;
    }

    @Override
    public void update(Video video) {
        if (video.getCategoria() == "Juegos") {
            System.out.println(this.name + ": Nuevo video: " + video.getTitulo() + ". Categoria: " + video.getCategoria());
        }
    }
}
