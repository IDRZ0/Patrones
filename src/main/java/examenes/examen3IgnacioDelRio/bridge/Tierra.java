package examenes.examen3IgnacioDelRio.bridge;

public class Tierra implements ITransporte {
    @Override
    public void enviar(Paquete paquete) {
        System.out.println("Enviando paquete por Tierra.");
        System.out.println("Nombre del paquete: " + paquete.getNombre());
        System.out.println("Precio del paquete: " + paquete.getPrecio());
        System.out.println("Arancel por envio por tierra del 5%: " + paquete.getPrecio() * 0.05);
        paquete.setPrecio(paquete.getPrecio() + paquete.getPrecio() * 0.05);
        System.out.println("Precio total por el envio: " + paquete.getPrecio());
        System.out.println("**********");
    }
}
