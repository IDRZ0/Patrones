package creacionales.prototype.basicStructure.ejercicios.ej1my;

public class ConcretePasaje implements IPasaje {

    private int numeroVuelo;
    private String origen;
    private String destino;
    private int tiempoVuelo;
    private int costo;
    private int numeroAsiento;
    private Persona pasajero;

    public ConcretePasaje(){}

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getTiempoVuelo() {
        return tiempoVuelo;
    }

    public void setTiempoVuelo(int tiempoVuelo) {
        this.tiempoVuelo = tiempoVuelo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public Persona getPasajero() {
        return pasajero;
    }

    public void setPasajero(Persona pasajero) {
        this.pasajero = pasajero;
    }

    @Override
    public Object clone() {
        ConcretePasaje cloneObject = new ConcretePasaje();
        cloneObject.setNumeroVuelo(this.numeroVuelo);
        cloneObject.setOrigen(this.origen);
        cloneObject.setDestino(this.destino);
        cloneObject.setTiempoVuelo(this.tiempoVuelo);
        cloneObject.setCosto(this.costo);
        cloneObject.setNumeroAsiento(this.numeroAsiento);
        cloneObject.setPasajero(this.pasajero);
        return cloneObject;
    }
}
