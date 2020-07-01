package creacionales.abstractFactory.ejercicios.ej1my;

public class Cliente {
    public static void main(String[] args) {
        FactoryHelado.make(FactoryHelado.Type.HELADOAGUA).show();
        FactoryHelado.make(FactoryHelado.Type.HELADOAGUA).show();
        FactoryHelado.make(FactoryHelado.Type.HELADOCREMA).show();
        FactoryHelado.make(FactoryHelado.Type.HELADOCREMA).show();
        FactoryHelado.make(FactoryHelado.Type.HELADOMIXTO).show();
        FactoryHelado.make(FactoryHelado.Type.HELADOMIXTO).show();
    }
}
