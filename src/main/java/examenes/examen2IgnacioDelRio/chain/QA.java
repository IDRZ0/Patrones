package examenes.examen2IgnacioDelRio.chain;

public class QA implements IIngeniero{
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
        if (tipo == "Bug" || tipo == "Mejora") {
            System.out.println("QA se encarga de " + tipo + ". La solicitud es: " + solicitud);
        } else {
            this.next.handle(tipo, solicitud);
        }
    }
}
