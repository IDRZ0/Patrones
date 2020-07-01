package comportamiento.observer.ejercicio;

public interface IYoutube {


    void attach(IObserver observer);
    void deAttach(IObserver observer);
    void notifyObserver();
}
