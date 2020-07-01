package practicas.ejercicios3my.cuatro;

public class Cliente {
    public static void main(String[] args) {
        Organizador organizador = new Organizador();
        organizador.handle("Limpiezas");
        organizador.handle("Desbloqueo");
        organizador.handle("Disciplina");
        organizador.handle("Entrevista");
        organizador.handle("Otro");
    }
}
