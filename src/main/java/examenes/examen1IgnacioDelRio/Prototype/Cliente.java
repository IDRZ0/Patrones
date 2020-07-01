package examenes.examen1IgnacioDelRio.Prototype;

public class Cliente {
    public static void main(String[] args) {
        ConcreteCelular celular1 = new ConcreteCelular();
        celular1.setTamano(50);
        celular1.setPeso(60);
        celular1.setOrigen("Bolivia");
        celular1.setModelo("A1");
        celular1.setImei(10001);
        celular1.setCamara(new Camara(10,"5mp"));

        ConcreteCelular celular2 = (ConcreteCelular) celular1.clone();
        celular2.setImei(10002);
        ConcreteCelular celular3 = (ConcreteCelular) celular1.clone();
        celular3.setImei(10003);

        celular1.show();
        celular2.show();
        celular3.show();
    }
}
