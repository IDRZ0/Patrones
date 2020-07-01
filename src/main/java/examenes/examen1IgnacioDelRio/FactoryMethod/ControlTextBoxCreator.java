package examenes.examen1IgnacioDelRio.FactoryMethod;

public class ControlTextBoxCreator extends Creator{
    @Override
    public ControlTextBox factoryMethodControl() {
        ControlTextBox controlTextBox = new ControlTextBox();
        controlTextBox.setForma("Circular");
        controlTextBox.setTamano(4);
        return controlTextBox;
    }
}
