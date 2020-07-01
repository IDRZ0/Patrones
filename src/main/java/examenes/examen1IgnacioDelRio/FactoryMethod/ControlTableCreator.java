package examenes.examen1IgnacioDelRio.FactoryMethod;

public class ControlTableCreator extends Creator{
    @Override
    public ControlTable factoryMethodControl() {
        ControlTable controlTable = new ControlTable();
        controlTable.setForma("Cuadrada");
        controlTable.setTamano(5);
        return controlTable;
    }
}
