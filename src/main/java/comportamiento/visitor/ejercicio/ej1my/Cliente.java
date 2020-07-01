package comportamiento.visitor.ejercicio.ej1my;

public class Cliente {
    public static void main(String[] args) {
        Argentina argentina = new Argentina();
        argentina.setCambio("Dolar");
        argentina.setMoneda(10);

        Bolivia bolivia = new Bolivia();
        bolivia.setCambio("Boliviano");
        bolivia.setMoneda(70);

        Brasil brasil = new Brasil();
        brasil.setCambio("Dolar");
        brasil.setMoneda(100);

        Cambista cambista = new Cambista();
        cambista.visit(argentina);
        cambista.visit(bolivia);
        cambista.visit(brasil);
    }
}
