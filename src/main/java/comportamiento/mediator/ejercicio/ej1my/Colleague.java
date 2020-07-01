package comportamiento.mediator.ejercicio.ej1my;

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
