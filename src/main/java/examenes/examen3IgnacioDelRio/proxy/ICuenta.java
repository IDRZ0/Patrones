package examenes.examen3IgnacioDelRio.proxy;

public interface ICuenta {
    void retirar(double monto, String divisa);
    void comprar(String producto,double monto, String divisa);
}
