package comportamiento.chainOfResponsability.example.ej1my;

public class Ventanilla {
    private static Ventanilla instance = null;
    private int saldo;

    private Ventanilla() {
        saldo = 70;
        System.out.println("Saldo inicial: " + saldo);
    }

    private static synchronized void makeInstance() {
        if(instance == null) {
            instance = new Ventanilla();
        }
    }

    public static Ventanilla getInstance() {
        if (instance == null) {
            makeInstance();
        }
        return instance;
    }

    public void pagarPrestamo(int cantidad) {
        if(saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Prestamo pagado de: " + cantidad);
            System.out.println("Saldo de ventanilla actual: " + saldo);
        } else {
            System.out.println("No hay saldo suficiente. Prestamo cancelado");
        }
    }
}
