package examenes.examen3IgnacioDelRio.proxy;

public class CuentaDeBanco implements ICuenta {
    private double saldo;

    public CuentaDeBanco(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void retirar(double monto, String divisa) {
        System.out.println("Retirando " + monto + " de la cuenta.");
        saldo -= monto;
        System.out.println("Monto retirado. Saldo actual: " + saldo);
    }

    @Override
    public void comprar(String producto, double monto, String divisa) {
        System.out.println("Realizando compra de " + producto + " por " + monto);
        saldo -= monto;
        System.out.println("Compra realizada. Saldo actual: " + saldo);
    }
}
