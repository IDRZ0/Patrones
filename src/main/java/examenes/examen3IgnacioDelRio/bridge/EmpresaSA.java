package examenes.examen3IgnacioDelRio.bridge;

public class EmpresaSA implements IEmpresa {
    private ITransporte metodoTransporte;

    @Override
    public void setTransporte(ITransporte transporte) {
        this.metodoTransporte = transporte;
    }

    @Override
    public void enviarPaquete(Paquete paquete) {
        this.metodoTransporte.enviar(paquete);
    }
}
