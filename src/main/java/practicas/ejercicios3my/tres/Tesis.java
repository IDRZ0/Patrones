package practicas.ejercicios3my.tres;

public class Tesis {
    private String version;
    private String content;

    public Tesis(String version, String content) {
        this.version = version;
        this.content = content;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void show() {
        System.out.println("Version: " + version);
        System.out.println("Contenido: " + content);
        System.out.println("**********");
    }
}
