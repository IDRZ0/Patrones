package comportamiento.mediator.ejercicio.ej1my;

public class Cliente {
    public static void main(String[] args) {
        ConcreteMediatorSkype concreteMediatorSkype = new ConcreteMediatorSkype();

        ConcreteColleagueDEV dev = new ConcreteColleagueDEV(concreteMediatorSkype);
        ConcreteColleagueQA qa = new ConcreteColleagueQA(concreteMediatorSkype);
        ConcreteColleagueSM sm = new ConcreteColleagueSM(concreteMediatorSkype);

        concreteMediatorSkype.setColleagueDEV(dev);
        concreteMediatorSkype.setColleagueQA(qa);
        concreteMediatorSkype.setColleagueSM(sm);

        sm.send("Hello");
    }
}
