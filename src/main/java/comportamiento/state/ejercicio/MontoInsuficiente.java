package comportamiento.state.ejercicio;

public class MontoInsuficiente implements IState {
    @Override
    public void handle() {
        System.out.println("State > MontoInsuficiente");
    }
}
