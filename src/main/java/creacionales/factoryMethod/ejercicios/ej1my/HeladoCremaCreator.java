package creacionales.factoryMethod.ejercicios.ej1my;

public class HeladoCremaCreator extends Creator{
    @Override
    public HeladoCrema factoryMethodHelado() {
        HeladoCrema heladoCrema = new HeladoCrema();
        heladoCrema.setTamano(1);
        heladoCrema.setForma("Redonda");
        heladoCrema.setFruta(new Fruta("Limon","Citrico",1));
        heladoCrema.setBase(new Base("Simple","Vaso"));
        heladoCrema.setCrema(new Crema("Coco",1));
        return heladoCrema;
    }
}
