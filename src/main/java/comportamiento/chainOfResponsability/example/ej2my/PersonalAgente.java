package comportamiento.chainOfResponsability.example.ej2my;

public class PersonalAgente implements IPersonal{
    private IPersonal next;

    @Override
    public void setNext(IPersonal personal) {
        this.next = personal;
    }

    @Override
    public IPersonal next() {
        return this.next;
    }

    @Override
    public void handle(double original, double cantidad) {
        if (cantidad >= (original * 0.25) && cantidad <= (original * 0.5)) {
            System.out.println("Pagando " + cantidad + " al agente de credito. Falta pagar " + (original - cantidad));
            System.out.println("Tenemos planes para refinanciar el prestamo, quiere verlos?");
        } else {
            this.next.handle(original, cantidad);
        }
    }
}
