package comportamiento.chainOfResponsability.example.ej2my;

public class PersonalEncargado implements IPersonal{
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
        if (cantidad > original) {
            System.out.println("Esta pagando " + (cantidad - original) + " extra.");
        } else {
            System.out.println("Prestamo pagado totalmente. Aqui tiene sus documentos");
        }
    }
}
