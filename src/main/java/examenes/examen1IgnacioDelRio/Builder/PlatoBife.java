package examenes.examen1IgnacioDelRio.Builder;

public class PlatoBife extends PlatoBuilder{
    @Override
    public void buildCarne() {
        plato.setTipoDeCarne("Bife");
    }

    @Override
    public void buildRefresco() {
        plato.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildGuarnicion() {
        plato.setGuarnicion("Papas Fritas");
    }
}
