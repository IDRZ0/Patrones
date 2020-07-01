package comportamiento.templateMethod.ejercicio.ej1my;

public class Estudiante extends Persona {
    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public int getEdad() {
        System.out.print("La edad del estudiante es: ");
        return super.getEdad();
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Ocupacion: Estudiante");
    }

    public void estudiar() {
        System.out.println(super.getNombre() + " esta estudianto");
    }
}
