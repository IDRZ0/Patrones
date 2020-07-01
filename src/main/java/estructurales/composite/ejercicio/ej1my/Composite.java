package estructurales.composite.ejercicio.ej1my;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> list = new ArrayList<>();
    private int precioTotal = 0;

    public Composite(String name) {
        super(name);
    }

    @Override
    public int precioTotal() {
        for (Component c: list) {
            precioTotal += c.precioTotal();
        }
        System.out.println("Precio total de " + this.getName() + ": " + this.precioTotal);
        System.out.println("**********");
        return this.precioTotal;
    }

    @Override
    public void add(Component component) {
        this.list.add(component);
    }

    @Override
    public void remove(Component component) {
        this.list.remove(component);
    }

    @Override
    public void getChild(int index) {
        System.out.println(this.list.get(index).getName());
    }
}
