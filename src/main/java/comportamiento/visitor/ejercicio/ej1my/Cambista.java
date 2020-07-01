package comportamiento.visitor.ejercicio.ej1my;

public class Cambista implements IVisitor{
    @Override
    public void visit(Bolivia bolivia) {
        System.out.println("Visitando Bolivia");
        if (bolivia.getCambio() == "Dolar") {
            System.out.println(bolivia.getMoneda() + " dolares son: " + (bolivia.getMoneda() * 6.97) + " bolivianos.");
        } else if (bolivia.getCambio() == "Boliviano") {
            System.out.println(bolivia.getMoneda() + " bolivianos son: " + (bolivia.getMoneda() / 6.96) + " dolares");
        } else {
            System.out.println("No tenemos ese tipo de cambio");
        }
    }

    @Override
    public void visit(Argentina argentina) {
        System.out.println("Visitando Argentina");
        if (argentina.getCambio() == "Dolar") {
            System.out.println(argentina.getMoneda() + " dolares son: " + (argentina.getMoneda() * 69.58) + " pesos.");
        } else if (argentina.getCambio() == "Peso") {
            System.out.println(argentina.getMoneda() + " pesos son: " + (argentina.getMoneda() / 69.58) + " dolares");
        } else {
            System.out.println("No tenemos ese tipo de cambio");
        }
    }

    @Override
    public void visit(Brasil brasil) {
        System.out.println("Visitando Brasil");
        if (brasil.getCambio() == "Dolar") {
            System.out.println(brasil.getMoneda() + " dolares son: " + (brasil.getMoneda() * 5.23) + " reales.");
        } else if (brasil.getCambio() == "Real") {
            System.out.println(brasil.getMoneda() + " reales son: " + (brasil.getMoneda() / 5.23) + " dolares");
        } else {
            System.out.println("No tenemos ese tipo de cambio");
        }
    }
}
