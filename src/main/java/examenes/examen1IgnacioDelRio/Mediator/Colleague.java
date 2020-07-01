package examenes.examen1IgnacioDelRio.Mediator;

public abstract class Colleague{
    protected Mediator mediator;
    protected String nombre;
    protected String equipo;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
