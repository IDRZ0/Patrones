package comportamiento.visitor.ejercicio.ej2my;

public class Cliente {
    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();
        Perro perro = new Perro(new Rabia());
        Gato gato = new Gato(new Pulgas());
        Caballo caballo = new Caballo(new Rabia());

        veterinario.atender(perro);
        veterinario.atender(gato);
        veterinario.atender(caballo);
    }
}
