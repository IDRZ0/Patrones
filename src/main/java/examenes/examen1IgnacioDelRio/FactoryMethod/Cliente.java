package examenes.examen1IgnacioDelRio.FactoryMethod;

public class Cliente {
    public static void main(String[] args) {
        ControlCheckBoxCreator checkBoxCreator = new ControlCheckBoxCreator();
        ControlLinkCreator linkCreator = new ControlLinkCreator();
        ControlComboBoxCreator comboBoxCreator = new ControlComboBoxCreator();
        ControlTableCreator tableCreator = new ControlTableCreator();
        ControlTextBoxCreator textBoxCreator = new ControlTextBoxCreator();

        ControlTextBox controlTextBox = textBoxCreator.factoryMethodControl();
        ControlTable controlTable = tableCreator.factoryMethodControl();
        ControlComboBox controlComboBox = comboBoxCreator.factoryMethodControl();
        ControlLink controlLink = linkCreator.factoryMethodControl();
        ControlCheckBox controlCheckBox = checkBoxCreator.factoryMethodControl();

        controlCheckBox.show();
        controlComboBox.show();
        controlLink.show();
        controlTable.show();
        controlTextBox.show();
    }
}
