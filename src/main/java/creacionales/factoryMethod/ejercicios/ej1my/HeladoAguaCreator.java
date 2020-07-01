package creacionales.factoryMethod.ejercicios.ej1my;

public class HeladoAguaCreator extends Creator{
    @Override
    public HeladoAgua factoryMethodHelado() {
        HeladoAgua heladoAgua = new HeladoAgua();
        heladoAgua.setTamano(1);
        heladoAgua.setForma("Redonda");
        heladoAgua.setFruta(new Fruta("Limon","Citrico",1));
        heladoAgua.setBase(new Base("Simple","Vaso"));
        return heladoAgua;
    }
}
