package estructurales.bridge.ej1my;

public class CuentaAhorro implements ICuenta{
    private IMoneda moneda;
    private double saldo;
    private double interes;

    public CuentaAhorro(IMoneda moneda) {
        this.saldo = 0;
        this.interes = 0.02;
        this.moneda = moneda;
        System.out.println("Cuenta de ahorro abierta.");
    }

    @Override
    public void depositar(double monto) {
        System.out.println("Se introducen " + monto + " " + moneda.getDivisa());
        moneda.tipoCambio(monto);
        this.saldo = saldo + monto + (monto * interes);
        System.out.println("Saldo actual: " + saldo + " " + moneda.getDivisa());
    }
}
