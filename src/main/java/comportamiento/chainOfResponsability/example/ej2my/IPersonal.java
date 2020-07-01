package comportamiento.chainOfResponsability.example.ej2my;

public interface IPersonal {
    void setNext(IPersonal personal);
    IPersonal next();
    void handle(double original, double cantidad);
}
