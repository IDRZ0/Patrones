package comportamiento.iterator.ejercicio.ej1my;

import java.util.ArrayList;

public class ConcreteListB implements IAggregateList{
    ArrayList<Persona> nombre;

    public ConcreteListB() {
        nombre = new ArrayList<>();
    }

    public void add(Persona value){
        nombre.add(value);
    }

    @Override
    public Iterator iterator() {
        return new IteratorListB(this.nombre);
    }
}
