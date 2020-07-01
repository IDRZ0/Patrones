package comportamiento.state.ejemplo;

public class Computadora {
    // agregar- cumpla patron comportamiento.state
    private IState stateComputadora;

    public Computadora(){
    }

    public IState getStateComputadora() {
        return stateComputadora;
    }

    public void setStateComputadora(IState stateComputadora) {
        this.stateComputadora = stateComputadora;
    }

    // agregar- cumpla patron comportamiento.state
    public void request(){
        stateComputadora.cambioDeEstado();
    }

}
