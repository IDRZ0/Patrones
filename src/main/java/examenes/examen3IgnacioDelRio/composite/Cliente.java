package examenes.examen3IgnacioDelRio.composite;

public class Cliente {
    public static void main(String[] args) {
        Archivo archivo1 = new Archivo("doc1.txt","hola como estas");
        Archivo archivo2 = new Archivo("doc2.txt","esta es una prueba");
        Archivo archivo3 = new Archivo("doc3.txt","deberia tener 11 palabras");

        ConjuntoDeArchivos folder1 = new ConjuntoDeArchivos("Desktop");
        folder1.add(archivo1);
        folder1.add(archivo2);
        folder1.add(archivo3);

        ConjuntoDeArchivos folder2 = new ConjuntoDeArchivos("Documents");
        folder2.add(archivo1);
        folder2.add(archivo2);
        folder2.add(archivo3);

        ConjuntoDeArchivos folder3 = new ConjuntoDeArchivos("Downloads");
        folder3.add(archivo1);
        folder3.add(archivo2);
        folder3.add(archivo3);

        ConjuntoDeArchivos discoC = new ConjuntoDeArchivos("Disco C");
        discoC.add(folder1);
        discoC.add(folder2);
        discoC.add(folder3);
        discoC.add(archivo1);
        discoC.tamanoTotal();
    }
}
