package estructurales.adapter.ejercicio.ej2my;

public class TV implements IArtefacto2 {
    private int costo;
    private String garantia;

    public TV(int costo, String garantia) {
        this.costo = costo;
        this.garantia = garantia;
    }

    @Override
    public void getCosto() {
        System.out.println("Costo de la TV: " + costo);
    }

    @Override
    public void getGarantia() {
        System.out.println("Garantia de la TV: " + garantia);
    }
}
