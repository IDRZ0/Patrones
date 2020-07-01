package creacionales.singleton.ejercicios.ej2;

public class Cliente {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Estudiante juan = new Estudiante("Juan");
                juan.pagarMatricula(100);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Estudiante jose = new Estudiante("Jose");
                jose.pagarMatricula(200);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Estudiante pablo = new Estudiante("Pablo");
                pablo.pagarMatricula(300);
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Estudiante pedro = new Estudiante("Pedro");
                pedro.pagarMatricula(200);
            }
        });
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                Estudiante rene = new Estudiante("Rene");
                rene.pagarMatricula(600);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}