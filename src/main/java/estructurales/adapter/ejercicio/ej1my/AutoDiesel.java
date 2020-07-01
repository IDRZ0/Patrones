package estructurales.adapter.ejercicio.ej1my;

import java.util.concurrent.ThreadLocalRandom;

public class AutoDiesel implements IAuto {
    private int tanque;

    @Override
    public void llenar(int litros) {
        if (litros <= 100 && litros >= 0) {
            this.tanque = litros;
            System.out.println("Diesel cargado: " + tanque);
        } else {
            System.out.println("No se puede cargar esa cantidad.");
        }
    }

    @Override
    public void estado() {
        int rdn = ThreadLocalRandom.current().nextInt(1,100);
        System.out.println("Nivel del tanque: " + rdn);
    }
}
