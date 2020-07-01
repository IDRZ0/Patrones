package comportamiento.templateMethod.ejercicio.ej1my;

public class Director extends Persona {
    public Director(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public int getEdad() {
        System.out.print("La edad del director es: ");
        return super.getEdad();
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Ocupacion: Director");
    }

    public void estudiar() {
        System.out.println(super.getNombre() + " esta haciendo gestiones");
    }
}
