package practicas.ejercicios3my.cuatro;

public class MilitarCabo implements IMilitar{
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
        if (order == "Limpiezas") {
            System.out.println("Cabo limpiando.");
        } else {
            this.next.handle(order);
        }
    }
}
