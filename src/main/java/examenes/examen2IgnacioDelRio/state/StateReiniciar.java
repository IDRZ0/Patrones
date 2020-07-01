package examenes.examen2IgnacioDelRio.state;

import java.util.concurrent.ThreadLocalRandom;

public class StateReiniciar implements IState {
    @Override
    public void changeState(PC pc) {
        System.out.println("PC reiniciando");
        int rdn = ThreadLocalRandom.current().nextInt(1,5);
        pc.setProgramas(new String[rdn]);
        for (int i = 0; i < rdn; i++) {
            pc.getProgramas()[i] = "Programa" + (i + 1);
            System.out.println("Cerrando programa: " + pc.getProgramas()[i]);
        }
        pc.setProgramas(new String[0]);
        System.out.println("Programas activos: " + pc.getProgramas().length);
        pc.setCpu("0%");
        System.out.println("CPU usado: " + pc.getCpu());
        pc.setRam("0%");
        System.out.println("RAM usada: " + pc.getRam());
        System.out.println("**********");
    }
}
