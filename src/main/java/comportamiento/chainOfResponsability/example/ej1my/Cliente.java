package comportamiento.chainOfResponsability.example.ej1my;

public class Cliente {
    public static void main(String[] args) {
        Organizador organizador = new Organizador();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona juan1 = new Persona("Juan1");
                juan1.pedirPrestamo(10,organizador);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona juan2 = new Persona("Juan2");
                juan2.pedirPrestamo(20,organizador);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona juan3 = new Persona("Juan3");
                juan3.pedirPrestamo(30,organizador);
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona juan4 = new Persona("Juan4");
                juan4.pedirPrestamo(60,organizador);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
