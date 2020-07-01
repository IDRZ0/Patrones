package creacionales.singleton.ejercicios.ej2;

public class Estudiante {
    String nombre;
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void pagarMatricula(int cantidad){
        Colegio.getInstance().pagarMatricula(cantidad);
    }
}
