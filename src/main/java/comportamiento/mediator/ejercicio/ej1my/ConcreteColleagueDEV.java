package comportamiento.mediator.ejercicio.ej1my;

public class ConcreteColleagueDEV extends Colleague{

    public ConcreteColleagueDEV(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("DEV received the message: " + msg);
    }
}
