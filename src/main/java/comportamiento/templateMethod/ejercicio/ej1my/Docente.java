package comportamiento.templateMethod.ejercicio.ej1my;

public class Docente extends Persona {
    public Docente(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public int getEdad() {
        System.out.print("La edad del docente es: ");
        return super.getEdad();
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Ocupacion: Docente");
    }

    public void revisar() {
        System.out.println(super.getNombre() + " esta revisando examenes");
    }
}
