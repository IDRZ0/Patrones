package examenes.examen3IgnacioDelRio.proxy;

public class TarjetaDebito implements ICuenta {
    private CuentaDeBanco cuenta;

    public TarjetaDebito(double saldo) {
        this.cuenta = new CuentaDeBanco(saldo);
    }

    @Override
    public void retirar(double monto, String divisa) {
        if (divisa == "Bs" && monto <= cuenta.getSaldo()) {
            this.cuenta.retirar(monto, divisa);
        } else if (divisa == "$"){
            retirar(monto * 6.97, "Bs");
        } else if (monto > cuenta.getSaldo()){
            System.out.println("No se puede realizar el retiro, el saldo es insuficiente");
        } else {
            System.out.println("No aceptamos la divisa requerida.");
        }
    }

    @Override
    public void comprar(String producto, double monto, String divisa) {
        if (divisa == "Bs" && monto <= cuenta.getSaldo()) {
            this.cuenta.comprar(producto, monto, divisa);
        } else if (divisa == "$"){
            comprar(producto,monto * 6.97, "Bs");
        } else if (monto > cuenta.getSaldo()){
            System.out.println("No se puede realizar la compra, el saldo es insuficiente");
        } else {
            System.out.println("No aceptamos la divisa requerida.");
        }
    }
}
