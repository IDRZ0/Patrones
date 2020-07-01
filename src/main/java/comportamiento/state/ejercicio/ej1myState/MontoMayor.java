package comportamiento.state.ejercicio.ej1myState;

public class MontoMayor implements IState{
    @Override
    public void changeState(int money) {
        System.out.println("Entregando producto. Su cambio es de " + money + " pesos.");
    }
}
