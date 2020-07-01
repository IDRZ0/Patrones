package comportamiento.command.ejercicio.ej1my;

import java.util.ArrayList;
import java.util.List;

public class InvokerPC {
    private List<ICommand> listaComandos = new ArrayList<>();

    public void setComando(ICommand iCommand) {
        this.listaComandos.add(iCommand);
    }

    public void run() {
        for(ICommand command: listaComandos) {
            command.execute();
        }
        listaComandos.clear();
    }
}
