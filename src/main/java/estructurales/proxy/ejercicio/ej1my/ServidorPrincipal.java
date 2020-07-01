package estructurales.proxy.ejercicio.ej1my;

public class ServidorPrincipal implements IServidor {
    private Request request;

    public ServidorPrincipal() {}

    @Override
    public void request(Request request) {
        System.out.println("Solicitud aceptada.");
        System.out.println("Tipo: " + request.getTipo());
        System.out.println("Archivo: " + request.getArchivo().getNombre() + request.getArchivo().getExtension());
        System.out.println("**********");
    }
}
