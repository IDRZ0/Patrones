package examenes.examen2IgnacioDelRio.memento;

public class Documento {
    private String version;
    private String contenido;

    public Documento(String version, String contenido) {
        this.version = version;
        this.contenido = contenido;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void showData() {
        System.out.println("Version: " + version);
        System.out.println("Contenido: " + contenido);
        System.out.println("**********");
    }
}
