package comportamiento.observer.ejercicio.ej1my;

public class Video {
    private String tipo;
    private String titulo;
    private String categoria;
    private String duracion;

    public Video(String tipo, String titulo, String categoria, String duracion) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.categoria = categoria;
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}
