package practicas.ejercicios3my.cuatro;

public class MilitarGeneral implements IMilitar{
    private IMilitar next;

    @Override
    public void setNext(IMilitar militar) {
        this.next = militar;
    }

    @Override
    public IMilitar next() {
        return this.next;
    }

    @Override
    public void handle(String order) {
        if (order == "Entrevista") {
            System.out.println("General debe realizar una entrevista.");
        } else {
            System.out.println("Nadie puede realizar esa orden.");
        }
    }
}
