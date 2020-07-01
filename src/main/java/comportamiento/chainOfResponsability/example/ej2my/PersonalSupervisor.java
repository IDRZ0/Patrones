package comportamiento.chainOfResponsability.example.ej2my;

public class PersonalSupervisor implements IPersonal{
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
        if (cantidad > (original * 0.5) && cantidad < original) {
            System.out.println("Pagando " + cantidad + " al supervisor. Falta pagar " + (original - cantidad));
            System.out.println("Tenemos nuevos prestamos, le gustaria conocerlos?");
        } else {
            this.next.handle(original, cantidad);
        }
    }
}
