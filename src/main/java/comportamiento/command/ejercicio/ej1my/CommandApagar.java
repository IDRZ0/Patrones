package comportamiento.command.ejercicio.ej1my;

public class CommandApagar implements ICommand{
    private Reciever reciever;

    public CommandApagar(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        this.reciever.operationApagar();
    }
}
