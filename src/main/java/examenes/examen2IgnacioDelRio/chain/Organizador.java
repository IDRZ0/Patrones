package examenes.examen2IgnacioDelRio.chain;

public class Organizador implements IIngeniero{
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
        QA qa = new QA();
        Support support = new Support();
        Developer developer = new Developer();
        DevOps devOps = new DevOps();
        Finanzas finanzas = new Finanzas();

        this.setNext(devOps);
        devOps.setNext(qa);
        qa.setNext(developer);
        developer.setNext(finanzas);
        finanzas.setNext(support);

        this.next.handle(tipo, solicitud);
    }
}
