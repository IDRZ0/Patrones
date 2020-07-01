package estructurales.adapter.ejercicio.ej2my;

public class Artefacto2Adapter implements IArtefacto1 {
    private IArtefacto2 artefacto2;

    public Artefacto2Adapter(IArtefacto2 artefacto2) {
        this.artefacto2 = artefacto2;
    }

    @Override
    public void getPrecio() {
        artefacto2.getCosto();
    }

    @Override
    public void getTiempo() {
        artefacto2.getGarantia();
    }
}
