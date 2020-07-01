package examenes.examen1IgnacioDelRio.Singleton;

import java.util.HashMap;
import java.util.Map;

public class Colegio {
    private static Colegio instance = null;
    private int saldo;
    private Map<String, Estudiante> lista = new HashMap<>();

    private Colegio() {
        saldo = 0;
        System.out.println("Saldo inicial: " + saldo);
    }

    private synchronized static void makeInstance() {
        if(instance == null) {
            instance = new Colegio();
        }
    }

    public static Colegio getInstance() {
        if (instance == null) {
            makeInstance();
        }
        return instance;
    }

    public int getSaldo() {
        return saldo;
    }

    public Map<String, Estudiante> getLista() {
        return lista;
    }

    public void pagarMatricula(Estudiante estudiante, int cantidad) {
        if(!lista.containsKey(estudiante.getNombreCompleto())){
            saldo += cantidad;
            lista.put(estudiante.getNombreCompleto(), estudiante);
            System.out.println("**********");
            System.out.println("Estudiante: " + estudiante.getNombreCompleto());
            System.out.println("Pago: " + cantidad);
            System.out.println("Saldo de ventanilla: " + saldo);
        }
    }
}
