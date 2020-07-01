package comportamiento.state.ejercicio;

public class MontoExacto implements IState {
    @Override
    public void handle() {
        System.out.println("State > MontoExacto");
    }
}
