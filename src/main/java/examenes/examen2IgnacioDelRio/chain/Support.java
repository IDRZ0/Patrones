package examenes.examen2IgnacioDelRio.chain;

public class Support implements IIngeniero{
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
        System.out.println("Support se encarga de " + tipo + ". La solicitud es: " + solicitud);
    }
}
