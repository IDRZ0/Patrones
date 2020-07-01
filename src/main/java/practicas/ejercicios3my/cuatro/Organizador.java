package practicas.ejercicios3my.cuatro;

public class Organizador implements IMilitar{
    private IMilitar next;

    @Override
    public void setNext(IMilitar militar) {
        this.next = militar;
    }

    @Override
    public IMilitar next() {
        return this.next;
    }

    @Override
    public void handle(String order) {
        MilitarCabo cabo = new MilitarCabo();
        MilitarCoronel coronel = new MilitarCoronel();
        MilitarGeneral general = new MilitarGeneral();
        MilitarTeniente teniente = new MilitarTeniente();

        cabo.setNext(coronel);
        coronel.setNext(teniente);
        teniente.setNext(general);

        this.setNext(cabo);
        this.next.handle(order);
    }
}
