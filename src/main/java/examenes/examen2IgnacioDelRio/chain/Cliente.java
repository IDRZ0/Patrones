package examenes.examen2IgnacioDelRio.chain;

public class Cliente {
    public static void main(String[] args) {
        Organizador organizador = new Organizador();
        organizador.handle("Infraestructura","nuevo servidor");
        organizador.handle("Bug","bug en la clase");
        organizador.handle("Funcionalidad","nuevo metodo");
        organizador.handle("Costos","costo de servidor");
        organizador.handle("Servicio al cliente","no funciona");
    }
}
