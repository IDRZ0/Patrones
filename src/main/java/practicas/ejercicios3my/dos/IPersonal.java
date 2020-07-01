package practicas.ejercicios3my.dos;

public interface IPersonal {
    void setNext(IPersonal iPersonal);
    IPersonal next();
    void handle(Persona persona);
}
