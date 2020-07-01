package estructurales.composite.ejercicio.ej1my;

public abstract class Component {
    private int precio = 100;
    private String name;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Component(String name) {
        this.name = name;
    }

    public abstract int precioTotal();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void getChild(int index);
}
