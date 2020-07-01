package estructurales.proxy.ejercicio.ej1my;

import java.util.ArrayList;
import java.util.List;

public class ServidorBackup implements IServidor {
    private Request request;
    private List<Request> backup = new ArrayList<>();

    public ServidorBackup() {}

    @Override
    public void request(Request request) {
        backup.add(request);
        System.out.println("Backup guardado.");
        System.out.println("Tipo: " + request.getTipo());
        System.out.println("Archivo: " + request.getArchivo().getNombre() + request.getArchivo().getExtension());
        System.out.println("**********");
    }
}
