package estructurales.bridge.ej1my;

public class Euro implements IMoneda{
    @Override
    public void tipoCambio(double monto) {
        System.out.println(monto + " euros son " + (monto * 7.87) + " bolivianos.");
    }

    @Override
    public String getDivisa() {
        return "Euro";
    }
}
