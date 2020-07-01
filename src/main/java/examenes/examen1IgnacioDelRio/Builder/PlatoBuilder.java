package examenes.examen1IgnacioDelRio.Builder;

public abstract class PlatoBuilder {
    protected Plato plato;

    public Plato getPlato(){
        return this.plato;
    }

    public void createPlato(){
        plato = new Plato();
    }

    public abstract void buildCarne();
    public abstract void buildRefresco();
    public abstract void buildGuarnicion();
}
