package examenes.examen1IgnacioDelRio.FactoryMethod;

public class ControlLinkCreator extends Creator{
    @Override
    public ControlLink factoryMethodControl() {
        ControlLink controlLink = new ControlLink();
        controlLink.setForma("Ovalada");
        controlLink.setTamano(2);
        return controlLink;
    }
}
