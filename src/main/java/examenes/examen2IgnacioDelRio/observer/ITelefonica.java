package examenes.examen2IgnacioDelRio.observer;

public interface ITelefonica {
    void attach(IObserver observer);
    void deattach(IObserver observer);
    void addNoti(Notificacion noti);
    void deleteNoti(Notificacion noti);
    void notifyObs();
}
