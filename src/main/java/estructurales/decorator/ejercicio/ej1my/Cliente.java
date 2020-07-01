package estructurales.decorator.ejercicio.ej1my;

public class Cliente {
    public static void main(String[] args) {
        Cuenta cuenta1 = new CuentaBasica("Juan",100);
        cuenta1 = new Promocion(cuenta1);
        cuenta1.showData();

        System.out.println("**********");

        Cuenta cuenta2 = new CuentaBasica("Jose",200);
        cuenta2 = new Internet(cuenta2);
        cuenta2 = new Seguro(cuenta2);
        cuenta2 = new Promocion(cuenta2);
        cuenta2.showData();
    }
}
