package estructurales.adapter.ejercicio.ej1my;

import java.util.concurrent.ThreadLocalRandom;

public class AutoElectrico {
    private int carga;

    public void cargar(int cantidad) {
        if (cantidad <= 100 && cantidad >= 0 && (cantidad % 2 == 0)) {
            this.carga = cantidad;
            System.out.println("Electricidad cargada: " + carga);
        } else {
            System.out.println("No se puede cargar esa cantidad");
        }
    }

    public void estadoCarga() {
        int rdn = ThreadLocalRandom.current().nextInt(1,100);
        System.out.println("Nivel de carga: " + rdn);
    }
}
