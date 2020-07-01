package estructurales.adapter.ejercicio.ej2my;

public class Celular implements IArtefacto1 {
    private int precio;
    private String tiempo;

    public Celular(int precio, String tiempo) {
        this.precio = precio;
        this.tiempo = tiempo;
    }

    @Override
    public void getPrecio() {
        System.out.println("Precio del celular: " + precio);
    }

    @Override
    public void getTiempo() {
        System.out.println("Tiempo de vida del celular: " + tiempo);
    }
}
