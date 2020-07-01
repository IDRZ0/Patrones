package estructurales.bridge.ej1my;

public class Dolar implements IMoneda{
    @Override
    public void tipoCambio(double monto) {
        System.out.println(monto + " dolares son " + (monto * 6.96) + " bolivianos.");
    }

    @Override
    public String getDivisa() {
        return "Dolar";
    }
}
