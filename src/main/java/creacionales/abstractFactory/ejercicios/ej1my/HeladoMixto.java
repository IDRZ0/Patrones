package creacionales.abstractFactory.ejercicios.ej1my;

public class HeladoMixto implements IHelado{
    private int tamano;
    private String forma;
    private Fruta fruta;
    private Base base;
    private Crema crema;

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Crema getCrema() {
        return crema;
    }

    public void setCrema(Crema crema) {
        this.crema = crema;
    }

    @Override
    public void show() {
        System.out.println(this.toString());
    }
}
