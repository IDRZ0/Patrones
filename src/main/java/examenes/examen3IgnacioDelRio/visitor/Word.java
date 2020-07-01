package examenes.examen3IgnacioDelRio.visitor;

public class Word implements IEditor {
    private String text = "";
    private int chars;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getChars() {
        return chars;
    }

    public void setChars(int chars) {
        this.chars = chars;
    }

    @Override
    public void crear(String text) {
        this.text = text;
    }

    @Override
    public void editar(String text) {
        this.text = text;
    }

    @Override
    public void eliminar() {
        this.text = "";
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
