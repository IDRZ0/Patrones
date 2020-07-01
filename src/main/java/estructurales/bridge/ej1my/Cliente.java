package estructurales.bridge.ej1my;

public class Cliente {
    public static void main(String[] args) {
        CuentaAhorro ahorro = new CuentaAhorro(new Boliviano());
        ahorro.depositar(100);

        CuentaCredito credito = new CuentaCredito(new Dolar());
        credito.depositar(100);

        CuentaPlazoFijo plazoFijo = new CuentaPlazoFijo(new Euro());
        plazoFijo.depositar(100);
    }
}
