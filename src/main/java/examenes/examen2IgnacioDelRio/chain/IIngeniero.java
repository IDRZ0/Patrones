package examenes.examen2IgnacioDelRio.chain;

public interface IIngeniero {
    void setNext(IIngeniero iIngeniero);
    IIngeniero next();
    void handle(String tipo, String solicitud);
}
