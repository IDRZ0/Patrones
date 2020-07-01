package comportamiento.visitor.ejercicio.ej2my;

public class Perro implements IAnimal {
    private IEnfermedad enfermedad;

    public Perro(IEnfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    public IEnfermedad getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(IEnfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public void accept(IVeterinario veterinario) {
        veterinario.atender(this);
    }
}
