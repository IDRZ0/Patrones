package examenes.examen1IgnacioDelRio.Singleton;

public class Cliente {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Estudiante juan = new Estudiante("Juan Perez");
                juan.pagar(100,"08:00");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Estudiante jose = new Estudiante("Jose Perez");
                jose.pagar(200,"08:30");
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Estudiante luis = new Estudiante("Luis Perez");
                luis.pagar(300,"09:00");
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Estudiante juan1 = new Estudiante("Juan Perez");
                juan1.pagar(400,"09:30");
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Jefe jefe = new Jefe();
        jefe.revisarLista();
        jefe.revisarSaldo();
    }
}
