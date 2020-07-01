package practicas.ejercicios3my.tres;

public class Cliente {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        String content = "intro";
        Tesis v1;

        v1 = new Tesis("version1",content);
        originator.setState(v1);
        careTaker.addMemento(originator.create());

        content = content + ", marco teorico";
        v1 = new Tesis("version2",content);
        originator.setState(v1);
        careTaker.addMemento(originator.create());

        content = content + ", marco practico";
        v1 = new Tesis("version3",content);
        originator.setState(v1);
        careTaker.addMemento(originator.create());

        content = content + ", conclusion";
        v1 = new Tesis("version4",content);
        originator.setState(v1);
        careTaker.addMemento(originator.create());

        content = content + ", bibliografia";
        v1 = new Tesis("version5",content);
        originator.setState(v1);
        careTaker.addMemento(originator.create());

        originator.restore(careTaker.getMemento(2));
    }
}
