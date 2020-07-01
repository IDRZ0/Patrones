package creacionales.builder.examples.ej1my;

public class Pizza {
    String masa;
    String salsa;
    String queso;

    public Pizza() {}

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getQueso() {
        return queso;
    }

    public void setQueso(String queso) {
        this.queso = queso;
    }

    public void show(){
        System.out.println("**********");
        System.out.println("La masa es: " + masa);
        System.out.println("La salsa es: " + salsa);
        System.out.println("El queso es: " + queso);
    }
}
