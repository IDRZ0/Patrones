package estructurales.adapter.ejercicio.ej2my;

public class PC implements IArtefacto1 {
    private int precio;
    private String tiempo;

    public PC(int precio, String tiempo) {
        this.precio = precio;
        this.tiempo = tiempo;
    }

    @Override
    public void getPrecio() {
        System.out.println("Precio del PC: " + precio);
    }

    @Override
    public void getTiempo() {
        System.out.println("Tiempo de vida del PC: " + tiempo);
    }
}
