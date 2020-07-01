package comportamiento.visitor.basic;

public interface IElemento {
    String method1();
    String method2();
    int method3();

    // metodo que empieza a implementar el patron comportamiento.visitor
    double accept(IVisitor visitor);
}
