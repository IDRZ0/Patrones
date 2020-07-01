package comportamiento.chainOfResponsability.example.ej2my;

public class Cliente {
    public static void main(String[] args) {
        Organizador organizador = new Organizador();

        Persona juan = new Persona("Juan");
        juan.pedirPrestamo(100, organizador);

        juan.pagarPrestamo(10, organizador);
        juan.pagarPrestamo(25, organizador);
        juan.pagarPrestamo(75, organizador);
        juan.pagarPrestamo(200, organizador);

    }
}
