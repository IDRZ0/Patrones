package examenes.examen1IgnacioDelRio.Builder;

public class PlatoLomito extends PlatoBuilder{
    @Override
    public void buildCarne() {
        plato.setTipoDeCarne("Lomo");
    }

    @Override
    public void buildRefresco() {
        plato.setSaborRefresco("Pepsi");
    }

    @Override
    public void buildGuarnicion() {
        plato.setGuarnicion("Arroz");
    }
}