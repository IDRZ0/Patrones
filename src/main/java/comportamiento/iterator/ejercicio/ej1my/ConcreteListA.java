package comportamiento.iterator.ejercicio.ej1my;

public class ConcreteListA implements IAggregateList{
    private int position;
    private Persona[] nombre;

    public ConcreteListA(){
        this.position=0;
        nombre = new Persona[5];
    }

    public void add(Persona value){
        nombre[position]=value;
        position++;
    }

    @Override
    public IteratorListA iterator() {
        return new IteratorListA(this.nombre);
    }
}
