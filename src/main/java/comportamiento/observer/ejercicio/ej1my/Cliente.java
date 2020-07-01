package comportamiento.observer.ejercicio.ej1my;

public class Cliente {
    public static void main(String[] args) {
        ConcreteSubject canal = new ConcreteSubject();

        ConcreteObserver1 sub1 = new ConcreteObserver1("Juan");
        ConcreteObserver2 sub2 = new ConcreteObserver2("Jose");
        ConcreteObserver3 sub3 = new ConcreteObserver3("Pepe");
        ConcreteObserver2 sub4 = new ConcreteObserver2("Pedro");
        ConcreteObserver3 sub5 = new ConcreteObserver3("Pablo");

        Video video1 = new Video("Todos","Decoracion","Manualidades","10");
        Video video2 = new Video("Todos","Futbol","Deporte","20");
        Video video3 = new Video("Adolescentes","Gameplay","Juegos","15");
        Video video4 = new Video("Todos","Estreno","Musica","12");
        Video video5 = new Video("Mayores","Virus","Salud","11");

        canal.attach(sub1);
        canal.attach(sub2);
        canal.attach(sub3);
        canal.attach(sub4);
        canal.attach(sub5);

        canal.upload(video1);
        canal.upload(video2);
        canal.upload(video3);
        canal.upload(video4);
        canal.upload(video5);
    }
}
