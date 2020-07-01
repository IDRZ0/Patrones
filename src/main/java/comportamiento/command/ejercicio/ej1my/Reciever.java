package comportamiento.command.ejercicio.ej1my;
import java.time.LocalTime;

public class Reciever {
    private String userName;
    private LocalTime time = LocalTime.now();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void operationApagar() {
        System.out.println("Hora de apagado: " + time + ". Usuario: " + userName);
    }
    public void operationSuspender() {
        System.out.println("Hora de suspensión: " + time + ". Usuario: " + userName);
    }
    public void operationReiniciar() {
        System.out.println("Hora de reinicio: " + time + ". Usuario: " + userName);
    }
    public void operationCerrar() {
        System.out.println("Hora de cierre de sesion: " + time + ". Usuario: " + userName);
    }
}
