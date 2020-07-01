package estructurales.adapter.ejercicio.ej2my;

public class Cliente {
    public static void main(String[] args) {
        Celular celular = new Celular(500,"3 ano");
        Tablet tablet = new Tablet(1000,"5 ano");
        PC pc = new PC(7000,"7 ano");
        Lavadora lavadora = new Lavadora(10000,"10 ano");
        Refrigerador refrigerador = new Refrigerador(15000,"15 ano");
        TV tv = new TV(12000,"8 ano");
        Artefacto2Adapter adapter;

        celular.getPrecio();
        tablet.getPrecio();
        pc.getPrecio();
        adapter = new Artefacto2Adapter(lavadora);
        adapter.getPrecio();
        adapter = new Artefacto2Adapter(refrigerador);
        adapter.getPrecio();
        adapter = new Artefacto2Adapter(tv);
        adapter.getPrecio();
    }
}
