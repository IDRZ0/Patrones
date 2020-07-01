package creacionales.prototype.basicStructure.ejercicios.ej1my;

public class Client {
    public static void main(String[] args) {
        Persona juan = new Persona();
        juan.setCi(1);
        juan.setNombre("Juan");
        Persona jose = new Persona();
        jose.setCi(2);
        jose.setNombre("Jose");
        Persona pablo = new Persona();
        pablo.setCi(3);
        pablo.setNombre("Pablo");
        Persona pedro = new Persona();
        pedro.setCi(4);
        pedro.setNombre("Pedro");
        Persona joe = new Persona();
        joe.setCi(5);
        joe.setNombre("Joe");

        ConcretePasaje pasaje1 = new ConcretePasaje();
        pasaje1.setTiempoVuelo(1);
        pasaje1.setOrigen("La Paz");
        pasaje1.setDestino("Cochabamba");
        pasaje1.setNumeroVuelo(620);
        pasaje1.setCosto(300);
        pasaje1.setNumeroAsiento(1);
        pasaje1.setPasajero(juan);

        ConcretePasaje pasaje2 = (ConcretePasaje) pasaje1.clone();
        pasaje2.setNumeroAsiento(2);
        pasaje2.setPasajero(jose);
        ConcretePasaje pasaje3 = (ConcretePasaje) pasaje1.clone();
        pasaje3.setNumeroAsiento(3);
        pasaje3.setPasajero(pablo);
        ConcretePasaje pasaje4 = (ConcretePasaje) pasaje1.clone();
        pasaje4.setNumeroAsiento(4);
        pasaje4.setPasajero(pedro);
        ConcretePasaje pasaje5 = (ConcretePasaje) pasaje1.clone();
        pasaje5.setNumeroAsiento(5);
        pasaje5.setPasajero(joe);

        System.out.println("pasajero: "+pasaje1.getPasajero().getNombre() + " en el asiento "+pasaje1.getNumeroAsiento());
        System.out.println("pasajero: "+pasaje2.getPasajero().getNombre() + " en el asiento "+pasaje2.getNumeroAsiento());
        System.out.println("pasajero: "+pasaje3.getPasajero().getNombre() + " en el asiento "+pasaje3.getNumeroAsiento());
        System.out.println("pasajero: "+pasaje4.getPasajero().getNombre() + " en el asiento "+pasaje4.getNumeroAsiento());
        System.out.println("pasajero: "+pasaje5.getPasajero().getNombre() + " en el asiento "+pasaje5.getNumeroAsiento());
    }
}
