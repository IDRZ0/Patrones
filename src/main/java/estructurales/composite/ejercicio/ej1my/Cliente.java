package estructurales.composite.ejercicio.ej1my;

public class Cliente {
    public static void main(String[] args) {
        PC pc1 = new PC("Asus");
        PC pc2 = new PC("HP");
        PC pc3 = new PC("Dell");

        Composite labo1 = new Composite("Labo1");
        labo1.add(pc1);
        labo1.add(pc2);
        labo1.add(pc3);

        Composite labo2 = new Composite("Labo2");
        labo2.add(pc1);
        labo2.add(pc2);
        labo2.add(pc3);

        Composite labo3 = new Composite("Labo3");
        labo3.add(pc1);
        labo3.add(pc2);
        labo3.add(pc3);

        Composite container = new Composite("Container");
        container.add(labo1);
        container.add(labo2);
        container.add(labo3);

        container.precioTotal();
    }
}
