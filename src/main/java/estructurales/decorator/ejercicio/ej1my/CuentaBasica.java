package estructurales.decorator.ejercicio.ej1my;

public class CuentaBasica implements Cuenta {
    private String nombrePropietario;
    private double monto;

    public CuentaBasica(String nombrePropietario, int monto) {
        this.nombrePropietario = nombrePropietario;
        this.monto = monto;
    }

    @Override
    public double getMonto() {
        return monto;
    }

    @Override
    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public void showData() {
        System.out.println("Propietario de la cuenta: " + nombrePropietario);
        System.out.println("Saldo de la cuenta: " + monto);
    }
}
