package examenes.examen1IgnacioDelRio.Builder;

public class PlatoTira extends PlatoBuilder{
    @Override
    public void buildCarne() {
        plato.setTipoDeCarne("Tira de carne");
    }

    @Override
    public void buildRefresco() {
        plato.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildGuarnicion() {
        plato.setGuarnicion("Fideo");
    }
}