package practicas.ejercicios3my.uno;

import java.util.List;

public class Backup {
    private String title;
    private List<Persona> base;

    public Backup(String title, List<Persona> base) {
        this.title = title;
        this.base = base;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Persona> getBase() {
        return base;
    }

    public void setBase(List<Persona> base) {
        this.base = base;
    }

    public void show() {
        System.out.println("Titulo: " + title);
        System.out.println("Personas:");
        for (Persona p: base) {
            System.out.println(p.getName());
        }
        System.out.println("**********");
    }
}
