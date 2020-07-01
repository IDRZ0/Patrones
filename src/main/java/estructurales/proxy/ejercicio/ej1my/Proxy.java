package estructurales.proxy.ejercicio.ej1my;

public class Proxy implements IServidor {
    private Request request;
    private ServidorPrincipal principal;
    private ServidorBackup backup;

    public Proxy() {
        principal = new ServidorPrincipal();
        backup = new ServidorBackup();
    }

    @Override
    public void request(Request request) {
        if ((request.getTipo() == "Descarga" || request.getTipo() == "Carga") && (request.getArchivo().getExtension() == ".zip" || request.getArchivo().getExtension() == ".rar")) {
            principal.request(request);
            backup.request(request);
        } else {
            System.out.println("Solicitud invalida.");
            System.out.println("**********");
        }
    }
}
