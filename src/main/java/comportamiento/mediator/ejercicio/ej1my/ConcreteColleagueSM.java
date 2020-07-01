package comportamiento.mediator.ejercicio.ej1my;

public class ConcreteColleagueSM extends Colleague{

    public ConcreteColleagueSM(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Can't receive messages.");
    }
}
