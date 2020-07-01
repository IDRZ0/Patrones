package estructurales.bridge.ej1my;

public class Boliviano implements IMoneda{
    @Override
    public void tipoCambio(double monto) {}

    @Override
    public String getDivisa() {
        return "Boliviano";
    }
}
