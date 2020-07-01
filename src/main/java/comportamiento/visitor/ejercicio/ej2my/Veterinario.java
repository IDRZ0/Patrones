package comportamiento.visitor.ejercicio.ej2my;

import java.time.LocalTime;

public class Veterinario implements IVeterinario {
    LocalTime time = LocalTime.now();

    @Override
    public void atender(Perro perro) {
        if (perro.getEnfermedad() instanceof Rabia) {
            System.out.println("Vacunando al perro de rabia a las " + time);
        } else if (perro.getEnfermedad() instanceof Pulgas) {
            System.out.println("Bañando al perro con pulgas a las " + time);
        }
    }

    @Override
    public void atender(Gato gato) {
        if (gato.getEnfermedad() instanceof Rabia) {
            System.out.println("Vacunando al gato de rabia a las " + time);
        } else if (gato.getEnfermedad() instanceof Pulgas) {
            System.out.println("Bañando al gato con pulgas a las " + time);
        }
    }

    @Override
    public void atender(Caballo caballo) {
        if (caballo.getEnfermedad() instanceof Rabia) {
            System.out.println("Vacunando al caballo de rabia a las " + time);
        } else if (caballo.getEnfermedad() instanceof Pulgas) {
            System.out.println("Bañando al caballo con pulgas a las " + time);
        }
    }
}
