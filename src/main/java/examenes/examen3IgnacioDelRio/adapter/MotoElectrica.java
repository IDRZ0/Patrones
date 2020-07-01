package examenes.examen3IgnacioDelRio.adapter;

import java.util.concurrent.ThreadLocalRandom;

public class MotoElectrica {
    private int carga;

    public void cargarElecricidad(int cantidad) {
        if (cantidad <= 100 && cantidad >= 0 && (cantidad % 2 == 0)) {
            this.carga = cantidad;
            System.out.println("Electricidad cargada: " + carga);
        } else {
            System.out.println("No se puede cargar esa cantidad");
        }
    }

    public void estadoElectricidad() {
        int rdn = ThreadLocalRandom.current().nextInt(1,10);
        System.out.println("Nivel de carga: " + rdn);
    }
}
