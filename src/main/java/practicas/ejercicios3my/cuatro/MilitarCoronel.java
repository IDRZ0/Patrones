package practicas.ejercicios3my.cuatro;

public class MilitarCoronel implements IMilitar{
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
        if (order == "Desbloqueo" || order == "Manifestacion") {
            System.out.println("Coronel ordena desbloquear.");
        } else {
            this.next.handle(order);
        }
    }
}
