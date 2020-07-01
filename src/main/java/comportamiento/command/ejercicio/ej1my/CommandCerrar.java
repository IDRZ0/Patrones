package comportamiento.command.ejercicio.ej1my;

public class CommandCerrar implements ICommand{
    private Reciever reciever;

    public CommandCerrar(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        this.reciever.operationCerrar();
    }
}
