package estructurales.proxy.ejercicio.ej1my;

public class Request {
    private String tipo;
    private Archivo archivo;

    public Request(String tipo, Archivo archivo) {
        this.tipo = tipo;
        this.archivo = archivo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Archivo getArchivo() {
        return archivo;
    }

    public void setArchivo(Archivo archivo) {
        this.archivo = archivo;
    }
}
