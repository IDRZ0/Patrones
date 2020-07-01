package creacionales.factoryMethod.ejercicios.ej2my;

public class Cuaderno {
    private String tipo;
    private int hojas;

    public Cuaderno(String tipo, int hojas) {
        this.tipo = tipo;
        this.hojas = hojas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHojas() {
        return hojas;
    }

    public void setHojas(int hojas) {
        this.hojas = hojas;
    }
}
