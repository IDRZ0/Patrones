package comportamiento.chainOfResponsability.example.ej2my;

public class Organizador implements IPersonal{
    private IPersonal next;
    private double prestamo;

    public double getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(double prestamo) {
        this.prestamo = prestamo;
    }

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
        PersonalCajero cajero = new PersonalCajero();
        PersonalAgente agente = new PersonalAgente();
        PersonalSupervisor supervisor = new PersonalSupervisor();
        PersonalEncargado encargado = new PersonalEncargado();

        this.setNext(cajero);
        cajero.setNext(agente);
        agente.setNext(supervisor);
        supervisor.setNext(encargado);

        this.next.handle(original,cantidad);
    }

    public void darPrestamo(double cantidad) {
        this.setPrestamo(cantidad);
        System.out.println("Prestamo otorgado de " + cantidad);
    }

    public void pagoPrestamo(double cantidad) {
        this.handle(this.prestamo, cantidad);
    }
}
