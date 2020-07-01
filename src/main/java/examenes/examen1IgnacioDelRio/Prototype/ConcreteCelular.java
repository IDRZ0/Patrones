package examenes.examen1IgnacioDelRio.Prototype;

public class ConcreteCelular implements ICelular {
    private String modelo;
    private int tamano;
    private int peso;
    private Camara camara;
    private int imei;
    private String origen;

    public ConcreteCelular() {}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public Object clone() {
        ConcreteCelular cloneObject = new ConcreteCelular();
        cloneObject.setCamara(this.camara);
        cloneObject.setImei(this.imei);
        cloneObject.setModelo(this.modelo);
        cloneObject.setOrigen(this.origen);
        cloneObject.setPeso(this.peso);
        cloneObject.setTamano(this.tamano);
        return cloneObject;
    }

    public void show(){
        System.out.println("**********");
        System.out.println("Modelo: " + modelo);
        System.out.println("Origen: " + origen);
        System.out.println("Imei: " + imei);
    }
}
