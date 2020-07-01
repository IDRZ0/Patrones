package creacionales.factoryMethod.ejercicios.ej1my;

public class HeladoMixtoCreator extends Creator{
    @Override
    public HeladoMixto factoryMethodHelado() {
        HeladoMixto heladoMixto = new HeladoMixto();
        heladoMixto.setTamano(1);
        heladoMixto.setForma("Redonda");
        heladoMixto.setFruta(new Fruta("Limon","Citrico",1));
        heladoMixto.setBase(new Base("Simple","Vaso"));
        heladoMixto.setCrema(new Crema("Coco",1));
        return heladoMixto;
    }
}
