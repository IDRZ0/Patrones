package comportamiento.templateMethod.ejercicio.ej1my;

import java.time.LocalTime;

public abstract class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public final void time() {
        LocalTime time = LocalTime.now();
        System.out.println(nombre + " tiene la hora " + time);
    }

    public void showData() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
