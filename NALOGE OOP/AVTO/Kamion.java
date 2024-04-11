public class Kamion extends Avto {

    private int teza;

    public Kamion(int hitrost, double cena, String barva, int teza) {
        super(hitrost, cena, barva);
        this.teza = teza;
    }

    public double vrniProdajnoCeno() {
        double popust = teza > 2000 ? 0.1 : 0.2;
        return cena * (1 - popust);
    }
}
