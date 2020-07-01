package comportamiento.memento.example.ej1myMemento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {
    private Map<String,Memento> savedStates = new HashMap<>();

    public void addMemento(String msg, Memento m) {
        this.savedStates.put(msg,m);
    }

    public Memento getMemento(String msg) {
        return this.savedStates.get(msg);
    }
}
