package comportamiento.strategy.ejercicio.ej1myStrategy;

public class Colegio {
    private int cantidadAlumnos;
    private Estudiante[] alumnos;
    private IStrategy strategy;

    public Colegio() {}

    public void execute(){
        if (cantidadAlumnos <= 3) {
            this.strategy = new StrategyBubble();
            System.out.println("Ejecutando Bubble");
            this.strategy.execute(alumnos);
        } else if (cantidadAlumnos <= 4) {
            this.strategy = new StrategyMerge();
            System.out.println("Ejecutando Merge");
            this.strategy.execute(alumnos);
        } else {
            this.strategy = new StrategyQuick();
            System.out.println("Ejecutando Quick");
            this.strategy.execute(alumnos);
        }
    }

    public Estudiante[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Estudiante[] alumnos) {
        this.alumnos = alumnos;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }
}
