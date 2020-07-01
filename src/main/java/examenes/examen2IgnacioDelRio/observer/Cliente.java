package examenes.examen2IgnacioDelRio.observer;

public class Cliente {
    public static void main(String[] args) {
        ConcreteTelefonica telefonica = new ConcreteTelefonica();
        telefonica.addNoti(new Notificacion("Noticias","Nuevo plan"));
        telefonica.addNoti(new Notificacion("Precios","Rebajas"));
        telefonica.addNoti(new Notificacion("Premios","Megas gratis"));
        telefonica.addNoti(new Notificacion("Promociones","2x1"));

        ConcreteObserver1 juan1 = new ConcreteObserver1("juan1");
        ConcreteObserver2 juan2 = new ConcreteObserver2("juan2");
        ConcreteObserver3 juan3 = new ConcreteObserver3("juan3");
        ConcreteObserver4 juan4 = new ConcreteObserver4("juan4");
        ConcreteObserver5 juan5 = new ConcreteObserver5("juan5");
        ConcreteObserver6 juan6 = new ConcreteObserver6("juan6");

        telefonica.attach(juan1);
        telefonica.attach(juan2);
        telefonica.attach(juan3);
        telefonica.attach(juan4);
        telefonica.attach(juan5);
        telefonica.attach(juan6);

        telefonica.notifyObs();
    }
}
