package examenes.examen3IgnacioDelRio.adapter;

import java.util.concurrent.ThreadLocalRandom;

public class MotoDiesel implements IMoto {
    private int tanque;

    @Override
    public void llenarTanque(int litros) {
        if (litros <= 100 && litros >= 0) {
            this.tanque = litros;
            System.out.println("Diesel cargado: " + tanque);
        } else {
            System.out.println("No se puede cargar esa cantidad.");
        }
    }

    @Override
    public void estadoTanque() {
        int rdn = ThreadLocalRandom.current().nextInt(1,100);
        System.out.println("Nivel del tanque: " + rdn);
    }
}
