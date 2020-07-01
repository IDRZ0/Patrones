package creacionales.prototype.ejercicios.ej2my;

public class ConcreteContrato implements IContrato{
    private int sueldo;
    private int cargaHoraria;
    private boolean cursoEdSup;
    private boolean accesoPlat;
    private boolean marcadoBiometrico;
    private String horaEntrada;
    private String horaSalida;
    private String nombreDocente;
    private String apellidoDocente;

    public ConcreteContrato(){}

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isCursoEdSup() {
        return cursoEdSup;
    }

    public void setCursoEdSup(boolean cursoEdSup) {
        this.cursoEdSup = cursoEdSup;
    }

    public boolean isAccesoPlat() {
        return accesoPlat;
    }

    public void setAccesoPlat(boolean accesoPlat) {
        this.accesoPlat = accesoPlat;
    }

    public boolean isMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getApellidoDocente() {
        return apellidoDocente;
    }

    public void setApellidoDocente(String apellidoDocente) {
        this.apellidoDocente = apellidoDocente;
    }

    @Override
    public Object clone() {
        ConcreteContrato cloneObject = new ConcreteContrato();
        cloneObject.setAccesoPlat(this.accesoPlat);
        cloneObject.setApellidoDocente(this.apellidoDocente);
        cloneObject.setCargaHoraria(this.cargaHoraria);
        cloneObject.setCursoEdSup(this.cursoEdSup);
        cloneObject.setHoraEntrada(this.horaEntrada);
        cloneObject.setHoraSalida(this.horaSalida);
        cloneObject.setMarcadoBiometrico(this.marcadoBiometrico);
        cloneObject.setNombreDocente(this.nombreDocente);
        cloneObject.setSueldo(this.sueldo);
        return cloneObject;
    }

    public void show() {
        System.out.println(nombreDocente);
        System.out.println(apellidoDocente);
        System.out.println("Sueldo: " + sueldo);
    }
}
