package creacionales.factoryMethod.ejercicios.ej2my;

public class KitColegial implements IKit{
    private Mochila mochila;
    private Libro libro;
    private Computadora computadora;

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public void show() {
        System.out.println("PC " + computadora.getMarca());
        System.out.println("Libro " + libro.getAutor());
    }
}
