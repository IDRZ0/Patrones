package practicas.ejercicios3my.dos;

public class Organizador implements IPersonal{
    private IPersonal next;

    @Override
    public void setNext(IPersonal iPersonal) {
        this.next = iPersonal;
    }

    @Override
    public IPersonal next() {
        return this.next;
    }

    @Override
    public void handle(Persona persona) {
        Responsable responsable = new Responsable();
        Notario notario = new Notario();
        Cajero cajero = new Cajero();
        Ayuda ayuda = new Ayuda();

        notario.setNext(responsable);
        cajero.setNext(responsable);

        if (!persona.hasCerti() && persona.hasFicha() && persona.hasPago()) {
            this.setNext(notario);
        } else if (persona.hasCerti() && persona.hasFicha() && !persona.hasPago()) {
            this.setNext(cajero);
        } else if (persona.hasCerti() && persona.hasFicha() && persona.hasPago()) {
            this.setNext(responsable);
        } else {
            this.setNext(ayuda);
        }

        this.next.handle(persona);
    }
}
