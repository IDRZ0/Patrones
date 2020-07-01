package comportamiento.iterator.ejercicio.ej1my;

import java.util.HashMap;
import java.util.Map;

public class Cliente {
    public static void main(String[] args) {
        ConcreteListA listA = new ConcreteListA();
        listA.add(new Persona("juan1",1));
        listA.add(new Persona("juan2",2));
        listA.add(new Persona("juan3",3));
        listA.add(new Persona("juan4",4));
        listA.add(new Persona("juan5",5));

        ConcreteListB listB = new ConcreteListB();
        listB.add(new Persona("jose1",6));
        listB.add(new Persona("jose2",7));
        listB.add(new Persona("jose3",8));
        listB.add(new Persona("jose4",9));
        listB.add(new Persona("jose5",10));

        ConcreteListC listC = new ConcreteListC();
        listC.add(new Persona("pepe1",11));
        listC.add(new Persona("pepe2",12));
        listC.add(new Persona("pepe3",13));
        listC.add(new Persona("pepe4",14));
        listC.add(new Persona("pepe5",15));

        Map<Persona,Integer> todos = new HashMap<>();
        Iterator iterator;

        iterator = listA.iterator();
        while (iterator.hasNext()){
            todos.put((Persona) iterator.next(),1);
        }

        iterator = listB.iterator();
        while (iterator.hasNext()){
            todos.put((Persona) iterator.next(),1);
        }

        iterator = listC.iterator();
        while (iterator.hasNext()){
            todos.put((Persona) iterator.next(),1);
        }
    }
}
