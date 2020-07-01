package comportamiento.templateMethod.ejercicio.ej1my;

public class Cliente {
    public static void main(String[] args) {
        Persona juan = new Estudiante("juan",15);
        Persona jose = new Docente("jose",35);
        Persona julio = new Director("julio",60);

        juan.showData();
        juan.time();
        jose.showData();
        jose.time();
        julio.showData();
        julio.time();
    }
}
