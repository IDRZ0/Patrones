package examenes.examen3IgnacioDelRio.adapter;

public class MotoElectricaAdapter implements IMoto {
    private MotoElectrica adaptee;

    public MotoElectricaAdapter(MotoElectrica adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void llenarTanque(int litros) {
        this.adaptee.cargarElecricidad(litros);
    }

    @Override
    public void estadoTanque() {
        this.adaptee.estadoElectricidad();
    }
}
