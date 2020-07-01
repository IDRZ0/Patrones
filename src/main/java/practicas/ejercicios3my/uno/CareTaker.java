package practicas.ejercicios3my.uno;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> savedStates = new ArrayList<>();

    public void addMemento(Memento m) {
        this.savedStates.add(m);
    }

    public Memento getMemento(int index) {
        return this.savedStates.get(index);
    }
}
