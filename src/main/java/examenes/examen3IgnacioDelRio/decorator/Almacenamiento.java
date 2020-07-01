package examenes.examen3IgnacioDelRio.decorator;

public class Almacenamiento extends Decorator {
    private int tamano;

    public Almacenamiento(IMarca marca, int tamano) {
        super(marca);
        this.tamano = tamano;
    }

    public void showData() {
        super.addAlmacenamiento(tamano);
    }
}
