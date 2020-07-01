package comportamiento.strategy.ejercicio.ej1myStrategy;

public class StrategyBubble implements IStrategy {
    @Override
    public Estudiante[] execute(Estudiante[] lista) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++){
                if (lista[j].getPromedio() > lista[j + 1].getPromedio()) {
                    Estudiante temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
        for (int v = 0; v < lista.length; v++){
            System.out.println("Estudiante: ");
            System.out.println(lista[v].getNombre());
            System.out.println(lista[v].getPromedio());
        }
        return lista;
    }
}
