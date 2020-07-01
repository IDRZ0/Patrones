package comportamiento.iterator.ejercicio.ej1my;

import java.util.Vector;

public class IteratorListC implements Iterator{
    private int position;
    private Vector<Persona> nombre;

    public IteratorListC(Vector<Persona> nombre){
        this.nombre = nombre;
        this.position = 0;
    }

    @Override
    public Object next() {
        return this.nombre.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.nombre.size() != 0 && position < this.nombre.size();
    }
}
