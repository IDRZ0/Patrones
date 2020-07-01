package examenes.examen3IgnacioDelRio.composite;

public abstract class Archivos {
    private String nombre;
    private int tamano;

    public Archivos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public abstract int tamanoTotal();
    public abstract void add(Archivos archivo);
    public abstract void remove(Archivos archivo);
    public abstract void getChild(int index);
}
