package examenes.examen1IgnacioDelRio.FactoryMethod;

public class ControlComboBoxCreator extends Creator{
    @Override
    public ControlComboBox factoryMethodControl() {
        ControlComboBox controlComboBox = new ControlComboBox();
        controlComboBox.setForma("Rectangular");
        controlComboBox.setTamano(3);
        return controlComboBox;
    }
}
