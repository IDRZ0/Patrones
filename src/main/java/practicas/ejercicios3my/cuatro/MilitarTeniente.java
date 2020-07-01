package practicas.ejercicios3my.cuatro;

public class MilitarTeniente implements IMilitar{
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
        if (order == "Disciplina") {
            System.out.println("Teniente ponga disciplina.");
        } else {
            this.next.handle(order);
        }
    }
}
