package comportamiento.observer.ejercicio.ej1my;

import java.util.ArrayList;

public class ConcreteSubject implements ISubject{
    private ArrayList<IObserver> observers = new ArrayList<>();
    private ArrayList<Video> videos = new ArrayList<>();

    @Override
    public void upload(Video video) {
        this.videos.add(video);
        notify(video);
    }

    @Override
    public void delete(Video video) {
        this.videos.remove(video);
    }

    @Override
    public void attach(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void deAttach(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notify(Video video) {
        for(int i = 0; i < this.observers.size(); i++) {
            this.observers.get(i).update(video);
        }
    }
}
