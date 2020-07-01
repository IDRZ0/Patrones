package practicas.ejercicios3my.uno;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        Backup v1;
        List<Persona> base1 = new ArrayList<>();
        base1.add(new Persona("Juan",20,1));
        List<Persona> base2 = new ArrayList<>();
        base2.add(new Persona("Jose",30,2));
        List<Persona> base3 = new ArrayList<>();
        base3.add(new Persona("Pedro",40,3));
        List<Persona> base4 = new ArrayList<>();
        base4.add(new Persona("Pablo",50,4));
        List<Persona> base5 = new ArrayList<>();
        base5.add(new Persona("Adolfo",60,5));

        v1 = new Backup("BackupEnero", base1);
        originator.setState(v1);
        careTaker.addMemento(originator.create());

        v1 = new Backup("BackupFebrero", base2);
        originator.setState(v1);
        careTaker.addMemento(originator.create());

        v1 = new Backup("BackupMarzo", base3);
        originator.setState(v1);
        careTaker.addMemento(originator.create());

        v1 = new Backup("BackupAbril", base4);
        originator.setState(v1);
        careTaker.addMemento(originator.create());

        v1 = new Backup("BackupMayo", base5);
        originator.setState(v1);
        careTaker.addMemento(originator.create());

        originator.restore(careTaker.getMemento(1));
    }
}
