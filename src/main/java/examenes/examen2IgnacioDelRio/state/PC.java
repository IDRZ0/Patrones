package examenes.examen2IgnacioDelRio.state;

public class PC {
    private IState statePC;
    private String[] programas;
    private String ram;
    private String cpu;

    public PC() {}

    public IState getStatePC() {
        return statePC;
    }

    public void setStatePC(IState statePC) {
        this.statePC = statePC;
    }

    public String[] getProgramas() {
        return programas;
    }

    public void setProgramas(String[] programas) {
        this.programas = programas;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void request() {
        this.statePC.changeState(this);
    }
}
