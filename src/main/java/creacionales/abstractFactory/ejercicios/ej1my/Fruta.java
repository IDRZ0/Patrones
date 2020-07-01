package creacionales.abstractFactory.ejercicios.ej1my;

public class Fruta {
    private String nombre;
    private String tipo;
    private int costo;

    public Fruta(String nombre, String tipo, int costo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
