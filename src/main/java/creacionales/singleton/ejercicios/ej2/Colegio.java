package creacionales.singleton.ejercicios.ej2;

public class Colegio {
    private static Colegio instance = null;
    private int dinero;
    private int codigoCajero;

    private Colegio(){
        dinero = 0;
        codigoCajero = 12345;
        System.out.println("Codigo del cajero: " + codigoCajero);
        System.out.println("Dinero inicial: " + dinero);
    }

    private synchronized static void makeInstance(){
        if(instance == null){
            instance = new Colegio();
        }
    }

    public static Colegio getInstance(){
        if(instance == null){
            makeInstance();
        }
        return instance;
    }

    public int getDinero(){
        return dinero;
    }

    public void pagarMatricula(int cantidad){
        dinero += cantidad;
        System.out.println("Pagando: " + cantidad);
        System.out.println("Dinero del cajero: " + getDinero());
    }
}
