package examenes.examen3IgnacioDelRio.proxy;

public class Cliente {
    public static void main(String[] args) {
        ICuenta tarjeta = new TarjetaDebito(1000);
        tarjeta.retirar(100,"$");
        tarjeta.comprar("Juegos",300,"Bs");
    }
}
