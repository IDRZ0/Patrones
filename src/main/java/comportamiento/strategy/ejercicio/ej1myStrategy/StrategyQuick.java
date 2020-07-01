package comportamiento.strategy.ejercicio.ej1myStrategy;

public class StrategyQuick implements IStrategy {
    @Override
    public Estudiante[] execute(Estudiante[] lista) {
        return sort(lista,0,lista.length - 1);
    }

    public Estudiante[] sort(Estudiante[] vector, int izq, int der) {
        Estudiante pivote = vector[izq];
        int i = izq;
        int j = der;
        Estudiante auxIntercambio;
        while (i < j) {
            while (vector[i].getPromedio() <= pivote.getPromedio() && i < j) {
                i++;
            }
            while (vector[j].getPromedio() > pivote.getPromedio()) {
                j--;
            }
            if (i < j) {
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
        vector[izq] = vector[j];
        vector[j] = pivote;
        if (izq < j - 1) {
            sort(vector, izq, j - 1);
        }
        if (j + 1 < der) {
            sort(vector, j + 1, der);
        }
        for (int v = 0; v < vector.length; v++){
            System.out.println("Estudiante: ");
            System.out.println(vector[v].getNombre());
            System.out.println(vector[v].getPromedio());
        }
        return vector;
    }
}
