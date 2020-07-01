package estructurales.decorator.ejercicio.ej1my;

import java.util.concurrent.ThreadLocalRandom;

public class Promocion extends Decorator {

    public Promocion(Cuenta cuenta) {
        super(cuenta);
    }

    public void showData() {
        super.showData();
        int rdn = ThreadLocalRandom.current().nextInt();
        if (rdn % 2 == 0) {
            System.out.println("Felicidades, ha ganado una promocion. Su monto se duplica.");
            super.promo();
        } else {
            System.out.println("No gano, siga participando.");
        }
    }
}
