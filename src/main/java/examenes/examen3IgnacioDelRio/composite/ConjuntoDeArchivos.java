package examenes.examen3IgnacioDelRio.composite;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoDeArchivos extends Archivos {
    private List<Archivos> conjunto = new ArrayList<>();
    private int tamanoTotal = 0;

    public ConjuntoDeArchivos(String nombre) {
        super(nombre);
    }

    @Override
    public int tamanoTotal() {
        for (Archivos a: conjunto) {
            tamanoTotal += a.tamanoTotal();
        }
        System.out.println("Tamano total del conjunto " + this.getNombre() + ": " + tamanoTotal);
        System.out.println("**********");
        return tamanoTotal;
    }

    @Override
    public void add(Archivos archivo) {
        this.conjunto.add(archivo);
    }

    @Override
    public void remove(Archivos archivo) {
        this.conjunto.remove(archivo);
    }

    @Override
    public void getChild(int index) {
        this.conjunto.get(index);
    }
}
