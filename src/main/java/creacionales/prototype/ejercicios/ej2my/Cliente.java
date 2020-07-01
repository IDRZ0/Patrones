package creacionales.prototype.ejercicios.ej2my;

public class Cliente {
    public static void main(String[] args) {
        ConcreteContrato docente1 = new ConcreteContrato();
        docente1.setSueldo(5000);
        docente1.setNombreDocente("juan1");
        docente1.setApellidoDocente("perez1");
        docente1.setMarcadoBiometrico(false);
        docente1.setHoraEntrada("08:00");
        docente1.setHoraSalida("18:00");
        docente1.setCursoEdSup(true);
        docente1.setCargaHoraria(80);
        docente1.setAccesoPlat(true);

        ConcreteContrato docente2 = (ConcreteContrato) docente1.clone();
        docente2.setNombreDocente("juan2");
        docente2.setApellidoDocente("perez2");
        ConcreteContrato docente3 = (ConcreteContrato) docente1.clone();
        docente3.setNombreDocente("juan3");
        docente3.setApellidoDocente("perez3");
        ConcreteContrato docente4 = (ConcreteContrato) docente1.clone();
        docente4.setNombreDocente("juan4");
        docente4.setApellidoDocente("perez4");
        ConcreteContrato docente5 = (ConcreteContrato) docente1.clone();
        docente5.setNombreDocente("juan5");
        docente5.setApellidoDocente("perez5");

        docente1.show();
        docente2.show();
        docente3.show();
        docente4.show();
        docente5.show();
    }
}
