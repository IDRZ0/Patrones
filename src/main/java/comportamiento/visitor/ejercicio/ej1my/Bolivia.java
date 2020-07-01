package comportamiento.visitor.ejercicio.ej1my;

public class Bolivia implements IPais{
    private int moneda;
    private String cambio;

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
