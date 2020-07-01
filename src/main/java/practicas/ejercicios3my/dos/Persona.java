package practicas.ejercicios3my.dos;

public class Persona {
    private String name;
    private boolean certi;
    private boolean pago;
    private boolean ficha;
    private Organizador organizador;

    public Persona(String name, boolean certi, boolean pago, boolean ficha) {
        this.name = name;
        this.certi = certi;
        this.pago = pago;
        this.ficha = ficha;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasCerti() {
        return certi;
    }

    public void setCerti(boolean certi) {
        this.certi = certi;
    }

    public boolean hasPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public boolean hasFicha() {
        return ficha;
    }

    public void setFicha(boolean ficha) {
        this.ficha = ficha;
    }

    public void carnetizarce(Organizador organizador) {
        organizador.handle(this);
    }
}
