package examenes.examen2IgnacioDelRio.state;

public class Cliente {
    public static void main(String[] args) {
        PC pc = new PC();

        StateApagado apagado = new StateApagado();
        StatePrendido prendido = new StatePrendido();
        StateReiniciar reiniciar = new StateReiniciar();

        pc.setStatePC(apagado);
        pc.request();

        pc.setStatePC(prendido);
        pc.request();

        pc.setStatePC(reiniciar);
        pc.request();
    }
}
