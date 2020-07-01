package examenes.examen1IgnacioDelRio.FactoryMethod;

public class ControlCheckBoxCreator extends Creator{
    @Override
    public ControlCheckBox factoryMethodControl() {
        ControlCheckBox controlCheckBox = new ControlCheckBox();
        controlCheckBox.setForma("Triangular");
        controlCheckBox.setTamano(1);
        return controlCheckBox;
    }
}
