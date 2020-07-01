package comportamiento.mediator.ejercicio.ej1my;

public class ConcreteMediatorSkype implements Mediator{
    private ConcreteColleagueDEV colleagueDEV;
    private ConcreteColleagueQA colleagueQA;
    private ConcreteColleagueSM colleagueSM;

    @Override
    public void send(String msg, Colleague colleague) {
        if (colleague == colleagueSM) {
            colleagueDEV.receive(msg);
            colleagueQA.receive(msg);
        } else if (colleague == colleagueDEV) {
            colleagueDEV.receive(msg);
        } else {
            colleagueQA.receive(msg);
        }
    }

    public ConcreteColleagueDEV getColleagueDEV() {
        return colleagueDEV;
    }

    public void setColleagueDEV(ConcreteColleagueDEV colleagueDEV) {
        this.colleagueDEV = colleagueDEV;
    }

    public ConcreteColleagueQA getColleagueQA() {
        return colleagueQA;
    }

    public void setColleagueQA(ConcreteColleagueQA colleagueQA) {
        this.colleagueQA = colleagueQA;
    }

    public ConcreteColleagueSM getColleagueSM() {
        return colleagueSM;
    }

    public void setColleagueSM(ConcreteColleagueSM colleagueSM) {
        this.colleagueSM = colleagueSM;
    }
}
