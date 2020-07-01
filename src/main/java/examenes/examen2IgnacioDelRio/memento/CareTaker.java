package examenes.examen2IgnacioDelRio.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> savedStates = new ArrayList<>();
    private int index = -1;

    public void addMemento(Memento m) {
        this.savedStates.add(m);
        index++;
    }

    public Memento revertir() {
        index--;
        return this.savedStates.get(index);
    }

    public Memento deshacer() {
        index++;
        return this.savedStates.get(index);
    }
}
