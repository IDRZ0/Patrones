package practicas.ejercicios3my.dos;

public class Cliente {
    public static void main(String[] args) {
        Organizador organizador = new Organizador();

        Persona juan = new Persona("Juan",false,true,true);
        Persona jose = new Persona("Jose",true,false,true);
        Persona pedro = new Persona("Pedro", true,true,false);
        Persona pablo = new Persona("Pablo",true,true,true);

        juan.carnetizarce(organizador);
        jose.carnetizarce(organizador);
        pedro.carnetizarce(organizador);
        pablo.carnetizarce(organizador);
    }
}
