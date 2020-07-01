package examenes.examen2IgnacioDelRio.command;

import java.util.ArrayList;
import java.util.List;

public class InvokerJugador {
    private List<ICommand> commands = new ArrayList<>();

    public void setCommands(ICommand command) {
        this.commands.add(command);
    }

    public void play() {
        for (ICommand command: commands) {
            command.execute();
        }
        commands.clear();
    }
}
