package practicas.ejercicios3my.uno;

public class Persona {
    private String name;
    private int edad;
    private int ci;

    public Persona(String name, int edad, int ci) {
        this.name = name;
        this.edad = edad;
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
}
