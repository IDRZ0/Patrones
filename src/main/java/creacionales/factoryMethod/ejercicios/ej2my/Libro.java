package creacionales.factoryMethod.ejercicios.ej2my;

public class Libro {
    private String tipo;
    private String autor;

    public Libro(String tipo, String autor) {
        this.tipo = tipo;
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
