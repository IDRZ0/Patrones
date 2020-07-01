package estructurales.proxy.ejercicio.ej1my;

public class Cliente {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request(new Request("Carga", new Archivo("index",".zip")));
        proxy.request(new Request("Descarga",new Archivo("tesis",".rar")));
        proxy.request(new Request("Subit",new Archivo("f",".rar")));
    }
}
