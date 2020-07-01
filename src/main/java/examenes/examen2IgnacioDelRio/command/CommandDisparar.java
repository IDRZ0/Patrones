package examenes.examen2IgnacioDelRio.command;

public class CommandDisparar implements ICommand {
    private RecieverJuego juego;

    public CommandDisparar(RecieverJuego juego) {
        this.juego = juego;
    }

    @Override
    public void execute() {
        this.juego.operacionDisparar();
    }
}