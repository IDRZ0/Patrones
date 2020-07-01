package examenes.examen2IgnacioDelRio.memento;

public class Originator {
    private Documento state;
    private CareTaker careTaker;

    public Originator(CareTaker careTaker) {
        this.careTaker = careTaker;
    }

    public Documento getState() {
        return state;
    }

    public void setState(Documento state) {
        System.out.println("Setting documento");
        this.state = state;
    }

    public Memento create() {
        System.out.println("Creating documento");
        state.showData();
        return new Memento(this.state);
    }

    public void revertir() {
        System.out.println("Revirtiendo a version anterior");
        this.state = this.careTaker.revertir().getState();
        this.state.showData();
    }

    public void deshacer() {
        System.out.println("Deshaciendo a version siguiente");
        this.state = this.careTaker.deshacer().getState();
        this.state.showData();
    }
}
