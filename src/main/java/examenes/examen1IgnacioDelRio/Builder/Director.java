package examenes.examen1IgnacioDelRio.Builder;

public class Director {
    private PlatoBuilder platoBuilder;

    public Plato getPlato(){
        return platoBuilder.getPlato();
    }

    public void setPlatoBuilder(PlatoBuilder platoBuilder) {
        this.platoBuilder = platoBuilder;
    }

    public void buildPlato(){
        platoBuilder.createPlato();
        platoBuilder.buildCarne();
        platoBuilder.buildRefresco();
        platoBuilder.buildGuarnicion();
    }
}
