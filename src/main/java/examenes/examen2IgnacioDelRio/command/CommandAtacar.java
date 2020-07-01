package examenes.examen2IgnacioDelRio.command;

public class CommandAtacar implements ICommand {
    private RecieverJuego juego;

    public CommandAtacar(RecieverJuego juego) {
        this.juego = juego;
    }

    @Override
    public void execute() {
        this.juego.operacionAtacar();
    }
}
