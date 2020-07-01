package examenes.examen3IgnacioDelRio.composite;

public class Archivo extends Archivos {
    private String text;
    private int tamanoTotal;

    public Archivo(String nombre, String text) {
        super(nombre);
        this.text = text;
    }

    @Override
    public int tamanoTotal() {
        String[] arr = text.split(" ");
        this.tamanoTotal = arr.length;
        System.out.println("Tamano del archivo " + this.getNombre() + ": " + this.tamanoTotal);
        return this.tamanoTotal;
    }

    @Override
    public void add(Archivos archivo) {}

    @Override
    public void remove(Archivos archivo) {}

    @Override
    public void getChild(int index) {}
}
