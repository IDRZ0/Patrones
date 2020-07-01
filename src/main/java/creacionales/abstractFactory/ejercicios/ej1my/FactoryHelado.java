package creacionales.abstractFactory.ejercicios.ej1my;

public class FactoryHelado {
    public enum Type{
        HELADOAGUA, HELADOCREMA, HELADOMIXTO
    }
    public static IHelado make(Type type){
        IHelado helado;
        switch (type){
            case HELADOAGUA:
                helado = new HeladoAgua();
                break;
            case HELADOCREMA:
                helado = new HeladoCrema();
                break;
            case HELADOMIXTO:
                helado = new HeladoMixto();
                break;
            default:
                helado = new HeladoMixto();
                break;
        }
        return helado;
    }
}
