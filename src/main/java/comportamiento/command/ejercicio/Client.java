package comportamiento.command.ejercicio;

public class Client {
    public static void main (String[]args){
        Computadora pcI3 = new Computadora();
        pcI3.setNameUser("upb");

        CommandApagar apagar = new CommandApagar(pcI3);
        CommandCerrarSesion cerrarSession = new CommandCerrarSesion(pcI3);
        CommandReiniciar reiniciar = new CommandReiniciar(pcI3);
        CommandSuspender suspender = new CommandSuspender(pcI3);

        PowerShell cmd = new PowerShell();
        cmd.setCommand(apagar);
        cmd.setCommand(cerrarSession);
        cmd.setCommand(reiniciar);
        cmd.setCommand(suspender);

        cmd.runCommand();

    }

}
