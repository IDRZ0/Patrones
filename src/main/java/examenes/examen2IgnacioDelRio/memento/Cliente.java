package examenes.examen2IgnacioDelRio.memento;

public class Cliente {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator(careTaker);
        String contenido = "";
        Documento v1;

        contenido += "intro";
        v1 = new Documento("version1",contenido);
        originator.setState(v1);
        careTaker.addMemento(originator.create());

        contenido += ", cuerpo";
        v1 = new Documento("version2",contenido);
        originator.setState(v1);
        careTaker.addMemento(originator.create());

        contenido += ", conclusion";
        v1 = new Documento("version3",contenido);
        originator.setState(v1);
        careTaker.addMemento(originator.create());

        contenido += ", bibliografia";
        v1 = new Documento("version4",contenido);
        originator.setState(v1);
        careTaker.addMemento(originator.create());

        originator.revertir();
        originator.revertir();
        originator.revertir();

        originator.deshacer();
        originator.deshacer();
        originator.deshacer();
    }
}
