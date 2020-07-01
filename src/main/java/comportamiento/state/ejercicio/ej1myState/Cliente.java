package comportamiento.state.ejercicio.ej1myState;

public class Cliente {
    public static void main(String[] args) {
        Maquina maquina = new Maquina();
        maquina.requestCompra(5);
        maquina.requestCompra(10);
        maquina.requestCompra(20);
    }
}
