package examenes.examen3IgnacioDelRio.bridge;

public class Mar implements ITransporte {
    @Override
    public void enviar(Paquete paquete) {
        System.out.println("Enviando paquete por Mar.");
        System.out.println("Nombre del paquete: " + paquete.getNombre());
        System.out.println("Precio del paquete: " + paquete.getPrecio());
        System.out.println("Arancel por envio por mar del 25%: " + paquete.getPrecio() * 0.25);
        paquete.setPrecio(paquete.getPrecio() + paquete.getPrecio() * 0.25);
        System.out.println("Precio total por el envio: " + paquete.getPrecio());
        System.out.println("**********");
    }
}
