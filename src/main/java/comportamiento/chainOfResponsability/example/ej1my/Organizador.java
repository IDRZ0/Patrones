package comportamiento.chainOfResponsability.example.ej1my;

public class Organizador implements IAgente{
    private IAgente next;

    @Override
    public void setNext(IAgente agente) {
        this.next = agente;
    }

    @Override
    public IAgente next() {
        return this.next;
    }

    @Override
    public void handle(int cantidad) {
        AgenteLocal local = new AgenteLocal();
        AgenteSucursal sucursal = new AgenteSucursal();
        AgenteDept dept = new AgenteDept();
        AgenteNacional nacional = new AgenteNacional();

        this.setNext(local);
        local.setNext(sucursal);
        sucursal.setNext(dept);
        dept.setNext(nacional);

        this.next.handle(cantidad);
    }
}
