public class Sedan extends Avto {

    private int dolzina;

    public Sedan(int hitrost, double cena, String barva, int dolzina) {
        super(hitrost, cena, barva);
        this.dolzina = dolzina;
    }

    public double vrniProdajnoCeno() {
        double popust = dolzina > 800 ? 0.05 : 0.1;
        return super.vrniProdajnoCeno() * (1 - popust);
    }
}
