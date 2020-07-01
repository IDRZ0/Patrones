package examenes.examen3IgnacioDelRio.bridge;

public class Cliente {
    public static void main(String[] args) {
        EmpresaSA sa = new EmpresaSA();
        EmpresaSRL srl = new EmpresaSRL();
        ITransporte aire = new Aire();
        ITransporte tierra = new Tierra();
        ITransporte mar = new Mar();

        sa.setTransporte(aire);
        sa.enviarPaquete(new Paquete(100,"galletas"));

        srl.setTransporte(tierra);
        srl.enviarPaquete(new Paquete(200,"teclado"));

        sa.setTransporte(mar);
        sa.enviarPaquete(new Paquete(1000, "PC"));
    }
}
