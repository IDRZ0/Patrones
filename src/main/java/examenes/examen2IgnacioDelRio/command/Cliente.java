package examenes.examen2IgnacioDelRio.command;

public class Cliente {
    public static void main(String[] args) {
        RecieverJuego juego = new RecieverJuego();

        CommandAtacar atacar = new CommandAtacar(juego);
        CommandDefender defender = new CommandDefender(juego);
        CommandDisparar disparar = new CommandDisparar(juego);

        InvokerJugador jugador = new InvokerJugador();
        jugador.setCommands(disparar);
        jugador.setCommands(atacar);
        jugador.setCommands(defender);

        jugador.play();
    }
}
