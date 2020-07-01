package creacionales.factoryMethod.ejercicios.ej1my;

public class Cliente {
    public static void main(String[] args) {
        HeladoAguaCreator heladoAguaCreator = new HeladoAguaCreator();
        HeladoCremaCreator heladoCremaCreator = new HeladoCremaCreator();
        HeladoMixtoCreator heladoMixtoCreator = new HeladoMixtoCreator();

        HeladoAgua heladoAgua1 = heladoAguaCreator.factoryMethodHelado();
        HeladoAgua heladoAgua2 = heladoAguaCreator.factoryMethodHelado();
        HeladoCrema heladoCrema1 = heladoCremaCreator.factoryMethodHelado();
        HeladoCrema heladoCrema2 = heladoCremaCreator.factoryMethodHelado();
        HeladoMixto heladoMixto1 = heladoMixtoCreator.factoryMethodHelado();
        HeladoMixto heladoMixto2 = heladoMixtoCreator.factoryMethodHelado();

        heladoAgua1.setForma("Cuadrado");
        heladoAgua2.setTamano(1);
        heladoCrema1.setFruta(new Fruta("Naranja","Citrico",2));
        heladoCrema2.setCrema(new Crema("Vainilla",1));
        heladoMixto1.setBase(new Base("Acaramelada","Cono"));
        heladoMixto2.setCrema(new Crema("Chocolate",2));

        heladoAgua1.show();
        heladoAgua2.show();
        heladoCrema1.show();
        heladoCrema2.show();
        heladoMixto1.show();
        heladoMixto2.show();
    }
}
