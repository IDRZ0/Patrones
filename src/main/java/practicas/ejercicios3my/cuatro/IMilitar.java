package practicas.ejercicios3my.cuatro;

public interface IMilitar {
    void setNext(IMilitar militar);
    IMilitar next();
    void handle(String order);
}
