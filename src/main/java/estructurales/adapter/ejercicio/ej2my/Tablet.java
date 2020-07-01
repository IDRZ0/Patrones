package estructurales.adapter.ejercicio.ej2my;

public class Tablet implements IArtefacto1 {
    private int precio;
    private String tiempo;

    public Tablet(int precio, String tiempo) {
        this.precio = precio;
        this.tiempo = tiempo;
    }

    @Override
    public void getPrecio() {
        System.out.println("Precio de la tablet: " + precio);
    }

    @Override
    public void getTiempo() {
        System.out.println("Tiempo de vida de la tablet: " + tiempo);
    }
}
