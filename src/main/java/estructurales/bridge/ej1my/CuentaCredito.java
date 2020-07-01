package estructurales.bridge.ej1my;

public class CuentaCredito implements ICuenta{
    private IMoneda moneda;
    private double saldo;
    private double interes;

    public CuentaCredito(IMoneda moneda) {
        this.saldo = 0;
        this.interes = 0;
        this.moneda = moneda;
        System.out.println("Cuenta de credito abierta.");
    }

    @Override
    public void depositar(double monto) {
        System.out.println("Se introducen " + monto + " " + moneda.getDivisa());
        moneda.tipoCambio(monto);
        this.saldo = saldo + monto + (monto * interes);
        System.out.println("Saldo actual: " + saldo + " " + moneda.getDivisa());
    }
}
