package estructurales.adapter.ejercicio.ej2my;

public class Lavadora implements IArtefacto2 {
    private int costo;
    private String garantia;

    public Lavadora(int costo, String garantia) {
        this.costo = costo;
        this.garantia = garantia;
    }

    @Override
    public void getCosto() {
        System.out.println("Costo de la lavadora: " + costo);
    }

    @Override
    public void getGarantia() {
        System.out.println("Garantia de la lavadora: " + garantia);
    }
}
