package practicas.ejercicios3my.tres;

public class Memento {
    private Tesis state;

    public Memento(Tesis state) {
        this.state = state;
    }

    public Tesis getState() {
        return state;
    }

    public void setState(Tesis state) {
        this.state = state;
    }
}
