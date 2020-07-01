package comportamiento.chainOfResponsability.example.ej2my;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void pedirPrestamo(double cantidad, Organizador organizador) {
        organizador.darPrestamo(cantidad);
    }

    public void pagarPrestamo(double cantidad, Organizador organizador) {
        organizador.pagoPrestamo(cantidad);
    }
}
