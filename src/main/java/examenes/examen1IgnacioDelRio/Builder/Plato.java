package examenes.examen1IgnacioDelRio.Builder;

public class Plato {
    String tipoDeCarne;
    String saborRefresco;
    String guarnicion;

    public Plato() {}

    public String getTipoDeCarne() {
        return tipoDeCarne;
    }

    public void setTipoDeCarne(String tipoDeCarne) {
        this.tipoDeCarne = tipoDeCarne;
    }

    public String getSaborRefresco() {
        return saborRefresco;
    }

    public void setSaborRefresco(String saborRefresco) {
        this.saborRefresco = saborRefresco;
    }

    public String getGuarnicion() {
        return guarnicion;
    }

    public void setGuarnicion(String guarnicion) {
        this.guarnicion = guarnicion;
    }

    public void show(){
        System.out.println("*********");
        System.out.println("Carne: " + tipoDeCarne);
        System.out.println("Refresco: " + saborRefresco);
        System.out.println("Guarnicion: " + guarnicion);
    }
}
