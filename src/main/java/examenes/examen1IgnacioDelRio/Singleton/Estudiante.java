package examenes.examen1IgnacioDelRio.Singleton;

public class Estudiante {
    String nombreCompleto;
    String horaMatricula;

    public Estudiante(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getHoraMatricula() {
        return horaMatricula;
    }

    public void setHoraMatricula(String horaMatricula) {
        this.horaMatricula = horaMatricula;
    }

    public void pagar(int cantidad, String horaMatricula) {
        this.horaMatricula = horaMatricula;
        Colegio.getInstance().pagarMatricula(this, cantidad);
    }
}
