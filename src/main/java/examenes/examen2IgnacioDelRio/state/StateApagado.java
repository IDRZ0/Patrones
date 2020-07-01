package examenes.examen2IgnacioDelRio.state;

public class StateApagado implements IState {
    @Override
    public void changeState(PC pc) {
        System.out.println("PC apagado");
        pc.setProgramas(new String[0]);
        System.out.println("Programas activos: " + pc.getProgramas().length);
        pc.setCpu("0%");
        System.out.println("CPU usado: " + pc.getCpu());
        pc.setRam("0%");
        System.out.println("RAM usada: " + pc.getRam());
        System.out.println("**********");
    }
}
