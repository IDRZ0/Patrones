package comportamiento.state.ejercicio.ej1myState;

public class Maquina {
    private IState state;
    private int costo;

    public Maquina() {
        costo = 10;
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void requestCompra(int money) {
        if (money < costo) {
            this.setState(new MontoMenor());
            this.state.changeState(money);
        } else if (money == costo) {
            this.setState(new MontoExacto());
            this.state.changeState(money);
        } else {
            this.setState(new MontoMayor());
            this.state.changeState(money - costo);
        }
    }
}
