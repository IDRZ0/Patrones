package estructurales.composite.ejercicio.ej1my;

public class PC extends Component {

    public PC(String name) {
        super(name);
    }

    @Override
    public int precioTotal() {
        System.out.println("Precio de " + this.getName() + ": " + this.getPrecio());
        return this.getPrecio();
    }

    @Override
    public void add(Component component) {}

    @Override
    public void remove(Component component) {}

    @Override
    public void getChild(int index) {}
}
