package comportamiento.command.ejercicio.ej1my;

public class CommandSuspender implements ICommand{
    private Reciever reciever;

    public CommandSuspender(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        this.reciever.operationSuspender();
    }
}
