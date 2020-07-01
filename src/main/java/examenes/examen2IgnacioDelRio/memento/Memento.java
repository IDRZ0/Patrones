package examenes.examen2IgnacioDelRio.memento;

public class Memento {
    private Documento state;

    public Memento(Documento state) {
        this.state = state;
    }

    public Documento getState() {
        return state;
    }

    public void setState(Documento state) {
        this.state = state;
    }
}
