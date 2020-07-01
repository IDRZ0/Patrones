package estructurales.decorator.ejercicio.ej1my;

public class Internet extends Decorator {
    boolean enable;

    public Internet(Cuenta cuenta) {
        super(cuenta);
        enable = true;
    }

    public void showData() {
        super.showData();
        if (enable) {
            System.out.println("Banca por internet habilitada.");
        }
    }
}
