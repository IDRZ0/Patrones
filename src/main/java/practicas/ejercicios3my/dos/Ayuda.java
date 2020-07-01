package practicas.ejercicios3my.dos;

public class Ayuda implements IPersonal{
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
        System.out.println("Senor " + persona.getName() + " le faltan varios requisitos. Por favor hacer los tramites faltantes");
    }
}
