package examenes.examen2IgnacioDelRio.state;

import java.util.concurrent.ThreadLocalRandom;

public class StatePrendido implements IState {
    @Override
    public void changeState(PC pc) {
        System.out.println("PC prendido");
        int rdn = ThreadLocalRandom.current().nextInt(1,5);
        pc.setProgramas(new String[rdn]);
        for (int i = 0; i < rdn; i++) {
            pc.getProgramas()[i] = "Programa" + (i + 1);
            System.out.println("Programa abierto: " + pc.getProgramas()[i]);
        }
        pc.setCpu((rdn*5)+"%");
        System.out.println("CPU: " + pc.getCpu());
        pc.setRam((rdn*5)+"%");
        System.out.println("RAM: " + pc.getRam());
        System.out.println("**********");
    }
}
