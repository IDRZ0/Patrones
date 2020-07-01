package comportamiento.memento.example.ej1myMemento;

public class VersionCodigo {
    private String hash;
    private String state;

    public VersionCodigo(String hash, String state) {
        this.hash = hash;
        this.state = state;
    }

    public void show() {
        System.out.println("Version: " + hash);
        System.out.println("Estado: " + state);
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
