package comportamiento.mediator.ejercicio.ej1my;

public class ConcreteColleagueQA extends Colleague{

    public ConcreteColleagueQA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("QA received the message: " + msg);
    }
}
