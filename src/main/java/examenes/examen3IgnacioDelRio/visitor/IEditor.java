package examenes.examen3IgnacioDelRio.visitor;

public interface IEditor {
    void crear(String text);
    void editar(String text);
    void eliminar();
    void accept(IVisitor visitor);
}
