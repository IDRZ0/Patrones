package comportamiento.command.ejercicio.ej1my;

public class CommandReiniciar implements ICommand{
    private Reciever reciever;

    public CommandReiniciar(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        this.reciever.operationReiniciar();
    }
}
