package comportamiento.chainOfResponsability.example.ej2my;

public class PersonalCajero implements IPersonal{
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
        if (cantidad < (original * 0.25)) {
            System.out.println("Pagando " + cantidad + " al cajero. Falta pagar " + (original - cantidad));
        } else {
            this.next.handle(original, cantidad);
        }
    }
}
