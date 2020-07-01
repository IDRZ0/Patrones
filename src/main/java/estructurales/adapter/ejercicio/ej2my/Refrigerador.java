package estructurales.adapter.ejercicio.ej2my;

public class Refrigerador implements IArtefacto2 {
    private int costo;
    private String garantia;

    public Refrigerador(int costo, String garantia) {
        this.costo = costo;
        this.garantia = garantia;
    }

    @Override
    public void getCosto() {
        System.out.println("Costo del refrigerador: " + costo);
    }

    @Override
    public void getGarantia() {
        System.out.println("Garantia del refrigerador: " + garantia);
    }
}
