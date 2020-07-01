package examenes.examen3IgnacioDelRio.visitor;

public class Cliente {
    public static void main(String[] args) {
        Word word = new Word();
        word.crear("soy un documento word");

        Notepad notepad = new Notepad();
        notepad.crear("soy un documento notepad");
        notepad.editar("hola");

        Sublime sublime = new Sublime();
        sublime.crear("soy un documento sublime");
        sublime.eliminar();

        Plugin plugin = new Plugin();
        plugin.visit(word);
        plugin.visit(notepad);
        plugin.visit(sublime);
    }
}
