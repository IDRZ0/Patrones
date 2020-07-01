package estructurales.decorator.ejercicio.ej1my;

import java.util.concurrent.ThreadLocalRandom;

public class Seguro extends Decorator {

    public Seguro(Cuenta cuenta) {
        super(cuenta);
    }

    public void showData() {
        super.showData();
        int rdn = ThreadLocalRandom.current().nextInt(1,10);
        System.out.println("Descontando un " + rdn + "% por el seguro.");
        super.seguro(rdn);
    }
}
