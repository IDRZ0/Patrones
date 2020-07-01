package practicas.ejercicios3my.uno;

public class Memento {
    private Backup state;

    public Memento(Backup state) {
        this.state = state;
    }

    public Backup getState() {
        return state;
    }

    public void setState(Backup state) {
        this.state = state;
    }
}
