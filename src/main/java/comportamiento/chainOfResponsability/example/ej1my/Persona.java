package comportamiento.chainOfResponsability.example.ej1my;

public class Persona {
    private String nombre;
    private Organizador organizador;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void pedirPrestamo(int cantidad, Organizador organizador) {
        organizador.handle(cantidad);
    }
}
