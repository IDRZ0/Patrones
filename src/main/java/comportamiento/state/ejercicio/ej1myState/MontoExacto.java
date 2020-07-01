package comportamiento.state.ejercicio.ej1myState;

public class MontoExacto implements IState{
    @Override
    public void changeState(int money) {
        System.out.println("Entregando producto. No hay cambio.");
    }
}
