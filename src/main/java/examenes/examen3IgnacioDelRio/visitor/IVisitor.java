package examenes.examen3IgnacioDelRio.visitor;

public interface IVisitor {
    void visit(Word word);
    void visit(Notepad notepad);
    void visit(Sublime sublime);
}
