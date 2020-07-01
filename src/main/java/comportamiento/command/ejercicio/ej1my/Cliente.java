package comportamiento.command.ejercicio.ej1my;

public class Cliente {
    public static void main(String[] args) {
        Reciever reciever = new Reciever();
        reciever.setUserName("juan");

        CommandApagar commandApagar = new CommandApagar(reciever);
        CommandCerrar commandCerrar = new CommandCerrar(reciever);
        CommandReiniciar commandReiniciar = new CommandReiniciar(reciever);
        CommandSuspender commandSuspender = new CommandSuspender(reciever);

        InvokerPC pc = new InvokerPC();
        pc.setComando(commandApagar);
        pc.setComando(commandCerrar);
        pc.setComando(commandReiniciar);
        pc.setComando(commandSuspender);

        pc.run();
    }
}
