package examenes.examen1IgnacioDelRio.Singleton;

import java.util.Map;

public class Jefe {
    public void revisarLista() {
        Map<String, Estudiante> lista = Colegio.getInstance().getLista();
        System.out.println("Lista de estudiantes matriculados: ");
        for(Estudiante e: lista.values()){
            System.out.println("**********");
            System.out.println("Nombre: " + e.getNombreCompleto());
            System.out.println("Hora de matriculacion: " + e.getHoraMatricula());
        }
    }

    public void revisarSaldo(){
        System.out.println("Saldo: " + Colegio.getInstance().getSaldo());
    }
}
