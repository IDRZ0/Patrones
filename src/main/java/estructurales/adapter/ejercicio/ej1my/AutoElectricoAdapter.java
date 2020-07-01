package estructurales.adapter.ejercicio.ej1my;

public class AutoElectricoAdapter implements IAuto {
    private AutoElectrico adaptee;

    public AutoElectricoAdapter(AutoElectrico adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void llenar(int litros) {
        this.adaptee.cargar(litros);
    }

    @Override
    public void estado() {
        this.adaptee.estadoCarga();
    }
}
