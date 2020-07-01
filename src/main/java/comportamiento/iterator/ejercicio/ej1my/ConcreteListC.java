package comportamiento.iterator.ejercicio.ej1my;

import java.util.Vector;

public class ConcreteListC implements IAggregateList{
    Vector<Persona> nombre;

    public ConcreteListC(){
        nombre = new Vector<>();
    }

    public void add(Persona value){
        nombre.add(value);
    }

    @Override
    public IteratorListC iterator() {
        return new IteratorListC(this.nombre);
    }
}
