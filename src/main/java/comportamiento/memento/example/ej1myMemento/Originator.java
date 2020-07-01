package comportamiento.memento.example.ej1myMemento;

public class Originator {
    private VersionCodigo state;

    public VersionCodigo getState() {
        return this.state;
    }

    public void setState(VersionCodigo state) {
        System.out.println("Setting");
        state.show();
        this.state = state;
    }

    public Memento createMemento() {
        System.out.println("Creating");
        state.show();
        return new Memento(this.state);
    }

    public void restore(Memento m) {
        System.out.println("Restoring");
        this.state = m.getState();
        this.state.show();
    }
}
