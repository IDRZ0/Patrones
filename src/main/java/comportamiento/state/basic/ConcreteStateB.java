package comportamiento.state.basic;

public class ConcreteStateB implements  IState {
    @Override
    public void handle() {
        System.out.println("State > ConcreteStateB");
    }
}
