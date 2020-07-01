package examenes.examen2IgnacioDelRio.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteTelefonica implements ITelefonica {
    private List<IObserver> clientes = new ArrayList<>();
    private List<Notificacion> notificaciones = new ArrayList<>();

    @Override
    public void attach(IObserver observer) {
        this.clientes.add(observer);
    }

    @Override
    public void deattach(IObserver observer) {
        this.clientes.remove(observer);
    }

    @Override
    public void addNoti(Notificacion noti) {
        this.notificaciones.add(noti);
    }

    @Override
    public void deleteNoti(Notificacion noti) {
        this.notificaciones.remove(noti);
    }

    @Override
    public void notifyObs() {
        for (IObserver observer: clientes) {
            for (Notificacion notificacion: notificaciones) {
                observer.update(notificacion.getType(),notificacion.getPromo());
            }
        }
    }
}
