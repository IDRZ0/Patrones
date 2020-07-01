package comportamiento.iterator.ejercicio.ej1my;

public class IteratorListA implements Iterator{
    private int position;
    private Persona[] nombre;

    public IteratorListA(Persona[] nombre) {
        this.nombre = nombre;
    }

    @Override
    public Object next() {
        return this.nombre[position++];
    }

    @Override
    public boolean hasNext() {
        return this.nombre.length != 0 && position < this.nombre.length;
    }
}
