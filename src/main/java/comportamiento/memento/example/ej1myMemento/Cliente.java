package comportamiento.memento.example.ej1myMemento;

public class Cliente {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        VersionCodigo v1;

        v1 = new VersionCodigo("h123","initial");
        originator.setState(v1);
        careTaker.addMemento("commit1", originator.createMemento());

        v1 = new VersionCodigo("h456","final");
        originator.setState(v1);
        careTaker.addMemento("commit2", originator.createMemento());

        originator.restore(careTaker.getMemento("commit1"));
    }
}
