package examenes.examen1IgnacioDelRio.Mediator;

public class ConcreteColleagueTeamA extends Colleague{
    public ConcreteColleagueTeamA(Mediator mediator) {
        super(mediator);
        this.equipo = "A";
    }

    @Override
    public void send(String msg) {
        mediator.send("Mensaje enviado de: " + this.nombre + ", Equipo: " + this.equipo + ": " + msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Mensaje recibido por: " + this.nombre + ", Equipo: " + this.equipo + ": " + msg);
    }
}
