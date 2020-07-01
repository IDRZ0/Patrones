package examenes.examen3IgnacioDelRio.decorator;

public class Decorator implements IMarca {
    private IMarca marca;

    public Decorator(IMarca marca) {
        this.marca = marca;
    }

    @Override
    public void showData() {
        marca.showData();
    }

    @Override
    public String getMarca() {
        return marca.getMarca();
    }

    @Override
    public void setMarca(String marca) {
        this.marca.setMarca(marca);
    }

    @Override
    public String getModelo() {
        return marca.getModelo();
    }

    @Override
    public void setModelo(String modelo) {
        this.marca.setModelo(modelo);
    }

    @Override
    public int getRam() {
        return marca.getRam();
    }

    @Override
    public void setRam(int ram) {
        this.marca.setRam(ram);
    }

    @Override
    public int getAlmacenamiento() {
        return marca.getAlmacenamiento();
    }

    @Override
    public void setAlmacenamiento(int almacenamiento) {
        this.marca.setAlmacenamiento(almacenamiento);
    }

    @Override
    public String getCpu() {
        return marca.getCpu();
    }

    @Override
    public void setCpu(String cpu) {
        this.marca.setCpu(cpu);
    }

    @Override
    public int getPrecio() {
        return marca.getPrecio();
    }

    @Override
    public void setPrecio(int precio) {
        this.marca.setPrecio(precio);
    }

    public void addCarcasa(int precio) {
        System.out.println("Carcasa de " + precio + " Bs anadida.");
        marca.setPrecio(marca.getPrecio() + precio);
        marca.showData();
    }

    public void addVidrio(int precio) {
        System.out.println("Vidrio de " + precio + " Bs anadido.");
        marca.setPrecio(marca.getPrecio() + precio);
        marca.showData();
    }

    public void addAlmacenamiento(int tamano) {
        System.out.println("Almacenamiento de " + tamano + " GB anadido.");
        System.out.println("Precio del almacenamiento extra: " + tamano * 2 + " Bs.");
        marca.setPrecio(marca.getPrecio() + tamano * 2);
        marca.setAlmacenamiento(marca.getAlmacenamiento() + tamano);
        marca.showData();
    }
}
