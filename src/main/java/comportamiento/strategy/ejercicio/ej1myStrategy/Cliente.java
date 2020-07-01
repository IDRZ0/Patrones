package comportamiento.strategy.ejercicio.ej1myStrategy;

public class Cliente {
    public static void main(String[] args) {
        Colegio colegio = new Colegio();

        Estudiante[] e1 = new Estudiante[3];
        e1[0] = new Estudiante("juan1",10);
        e1[1] = new Estudiante("juan2",90);
        e1[2] = new Estudiante("juan3",60);

        Estudiante[] e2 = new Estudiante[4];
        e2[0] = new Estudiante("juan1",10);
        e2[1] = new Estudiante("juan2",90);
        e2[2] = new Estudiante("juan3",60);
        e2[3] = new Estudiante("juan4",80);

        Estudiante[] e3 = new Estudiante[5];
        e3[0] = new Estudiante("juan1",10);
        e3[1] = new Estudiante("juan2",90);
        e3[2] = new Estudiante("juan3",60);
        e3[3] = new Estudiante("juan4",80);
        e3[4] = new Estudiante("juan5",50);

        colegio.setCantidadAlumnos(e1.length);
        colegio.setAlumnos(e1);
        colegio.execute();

        colegio.setCantidadAlumnos(e2.length);
        colegio.setAlumnos(e2);
        colegio.execute();

        colegio.setCantidadAlumnos(e3.length);
        colegio.setAlumnos(e3);
        colegio.execute();
    }
}
