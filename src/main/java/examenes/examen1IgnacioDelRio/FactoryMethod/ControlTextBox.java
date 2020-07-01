package examenes.examen1IgnacioDelRio.FactoryMethod;

public class ControlTextBox implements IControl{
    private int tamano;
    private String forma;

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

    public void show(){
        System.out.println("**********");
        System.out.println("Tamano: " + tamano);
        System.out.println("Forma: " + forma);
    }
}
