package comportamiento.chainOfResponsability.example.ej1my;

public interface IAgente {
    void setNext(IAgente agente);
    IAgente next();
    void handle(int cantidad);
}
