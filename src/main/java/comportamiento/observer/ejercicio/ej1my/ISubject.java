package comportamiento.observer.ejercicio.ej1my;

public interface ISubject {
    void upload(Video video);
    void delete(Video video);
    void attach(IObserver observer);
    void deAttach(IObserver observer);
    void notify(Video video);
}
