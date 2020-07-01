package estructurales.decorator.ejercicio.ej1my;

public class Decorator implements Cuenta {
    private Cuenta cuenta;

    public Decorator(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void showData() {
        this.cuenta.showData();
    }

    @Override
    public double getMonto() {
        return cuenta.getMonto();
    }

    @Override
    public void setMonto(double monto) {
        this.cuenta.setMonto(monto);
    }

    public void seguro(int cantidad) {
        cuenta.setMonto(cuenta.getMonto() - (cuenta.getMonto() * 0.01 * cantidad));
        System.out.println("Monto con descuenta: " + cuenta.getMonto());
    }

    public void promo() {
        cuenta.setMonto(cuenta.getMonto() * 2);
        System.out.println("Monto con promocion: " + cuenta.getMonto());
    }
}
