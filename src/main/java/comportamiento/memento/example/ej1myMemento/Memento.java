package comportamiento.memento.example.ej1myMemento;

public class Memento {
    private VersionCodigo state;

    public Memento(VersionCodigo state) {
        this.state = state;
    }

    public VersionCodigo getState() {
        return state;
    }

    public void setState(VersionCodigo state) {
        this.state = state;
    }
}
