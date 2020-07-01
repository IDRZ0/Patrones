package practicas.ejercicios3my.uno;

public class Originator {
    private Backup state;

    public Backup getState() {
        return state;
    }

    public void setState(Backup state) {
        System.out.println("Setting... Done");
        this.state = state;
    }

    public Memento create() {
        System.out.println("Creating...");
        state.show();
        return new Memento(this.state);
    }

    public void restore(Memento m) {
        System.out.println("Restoring...");
        this.state = m.getState();
        state.show();
    }
}
