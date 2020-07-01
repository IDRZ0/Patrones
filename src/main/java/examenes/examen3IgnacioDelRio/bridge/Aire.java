package examenes.examen3IgnacioDelRio.bridge;

public class Aire implements ITransporte {
    @Override
    public void enviar(Paquete paquete) {
        System.out.println("Enviando paquete por Aire.");
        System.out.println("Nombre del paquete: " + paquete.getNombre());
        System.out.println("Precio del paquete: " + paquete.getPrecio());
        System.out.println("Arancel por envio por aire del 10%: " + paquete.getPrecio() * 0.1);
        paquete.setPrecio(paquete.getPrecio() + paquete.getPrecio() * 0.1);
        System.out.println("Precio total por el envio: " + paquete.getPrecio());
        System.out.println("**********");
    }
}
