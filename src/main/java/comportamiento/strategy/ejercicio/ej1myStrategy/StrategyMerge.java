package comportamiento.strategy.ejercicio.ej1myStrategy;

public class StrategyMerge implements IStrategy {
    @Override
    public Estudiante[] execute(Estudiante[] lista) {
        return sort(lista,0,lista.length - 1);
    }

    private Estudiante[] sort(Estudiante[] lista, int l, int r) {
        if (l < r) {
            int m = (l + r)/2;
            sort(lista, l, m);
            sort(lista,m + 1, r);
            merge(lista, l, m, r);
        }
        for (int v = 0; v < lista.length; v++){
            System.out.println("Estudiante: ");
            System.out.println(lista[v].getNombre());
            System.out.println(lista[v].getPromedio());
        }
        return lista;
    }

    private void merge(Estudiante[] lista, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        Estudiante[] L = new Estudiante[n1];
        Estudiante[] R = new Estudiante[n2];

        for (int i = 0; i < n1; i++)
            L[i] = lista[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = lista[m + 1+ j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getPromedio() <= R[j].getPromedio()) {
                lista[k] = L[i];
                i++;
            }
            else {
                lista[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            lista[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            lista[k] = R[j];
            j++;
            k++;
        }
    }
}
