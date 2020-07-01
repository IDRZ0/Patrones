package creacionales.factoryMethod.ejercicios.ej2my;

public class KitEscolar implements IKit{
    private Mochila mochila;
    private Cuaderno cuaderno;
    private Deportivo deportivo;

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Cuaderno getCuaderno() {
        return cuaderno;
    }

    public void setCuaderno(Cuaderno cuaderno) {
        this.cuaderno = cuaderno;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public void show(){
        System.out.println("Deportivo " + deportivo.getTalla());
    }
}
