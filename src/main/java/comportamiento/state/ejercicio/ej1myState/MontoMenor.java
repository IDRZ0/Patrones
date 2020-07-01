package comportamiento.state.ejercicio.ej1myState;

public class MontoMenor implements IState{
    @Override
    public void changeState(int money) {
        System.out.println("Dinero insuficiente. Retornando " + money + " pesos.");
    }
}
