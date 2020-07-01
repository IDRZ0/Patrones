package examenes.examen3IgnacioDelRio.visitor;

public class Plugin implements IVisitor {
    @Override
    public void visit(Word word) {
        System.out.println("Guardando archivo Word a pdf.");
        System.out.println("Texto del documento Word: " + word.getText());
        word.setChars(word.getText().length());
        System.out.println("Numero de caracteres del texto Word: " + word.getChars());
    }

    @Override
    public void visit(Notepad notepad) {
        System.out.println("Guardando archivo Notepad a pdf.");
        System.out.println("Texto del documento Notepad: " + notepad.getText());
        notepad.setChars(notepad.getText().length());
        System.out.println("Numero de caracteres del texto Notepad: " + notepad.getChars());
    }

    @Override
    public void visit(Sublime sublime) {
        System.out.println("Guardando archivo Sublime a pdf.");
        System.out.println("Texto del documento Sublime: " + sublime.getText());
        sublime.setChars(sublime.getText().length());
        System.out.println("Numero de caracteres del texto Sublime: " + sublime.getChars());
    }
}
