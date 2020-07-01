package comportamiento.chainOfResponsability.example.ej1my;

public class AgenteSucursal implements IAgente {
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
        if(cantidad > 10 && cantidad <= 20) {
            System.out.println("Atendido por el agente de sucural.");
            Ventanilla.getInstance().pagarPrestamo(cantidad);
        } else {
            this.next.handle(cantidad);
        }
    }
}
