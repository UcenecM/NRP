public class Avto {

    public int hitrost;
    public double cena;
    public String barva;

    public Avto(int hitrost, double cena, String barva) {
        this.hitrost = hitrost;
        this.cena = cena;
        this.barva = barva;
    }

    public double vrniProdajnoCeno() {
        return cena;
    }
}
