package examenes.examen2IgnacioDelRio.chain;

public class DevOps implements IIngeniero{
    private IIngeniero next;

    @Override
    public void setNext(IIngeniero iIngeniero) {
        this.next = iIngeniero;
    }

    @Override
    public IIngeniero next() {
        return this.next;
    }

    @Override
    public void handle(String tipo, String solicitud) {
        if (tipo == "Infraestructura") {
            System.out.println("DevOps se encarga de " + tipo + ". La solicitud es: " + solicitud);
        } else {
            this.next.handle(tipo, solicitud);
        }
    }
}
