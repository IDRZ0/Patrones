package examenes.examen2IgnacioDelRio.observer;

public class Notificacion {
    String type;
    String promo;

    public Notificacion(String type, String promo) {
        this.type = type;
        this.promo = promo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }
}
