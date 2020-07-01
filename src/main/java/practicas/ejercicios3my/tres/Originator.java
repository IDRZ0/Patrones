package practicas.ejercicios3my.tres;

public class Originator {
    private Tesis state;

    public Tesis getState() {
        return state;
    }

    public void setState(Tesis state) {
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
        this.state.show();
    }
}
