package comportamiento.chainOfResponsability.example.ej1my;

public class AgenteNacional implements IAgente {
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
        if(cantidad > 50) {
            System.out.println("Atendido por el agente nacional.");
            Ventanilla.getInstance().pagarPrestamo(cantidad);
        }
    }
}
