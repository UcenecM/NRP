public class TestVarcevalniRacun {

    public static void main(String[] args) {
        VarcevalniRacun varcevalec1 = new VarcevalniRacun(2000);
        VarcevalniRacun varcevalec2 = new VarcevalniRacun(3000);

        System.out.println("Letna obrestna mera: 4%");
        double mesecne_obresti1 = varcevalec1.izracunMesecnihObresti();
        double mesecne_obresti2 = varcevalec2.izracunMesecnihObresti();
        System.out.println("Varcevalec 1: " + varcevalec1.getPrihranek() + " EUR");
        System.out.println("Varcevalec 2: " + varcevalec2.getPrihranek() + " EUR");

        VarcevalniRacun.spremeniObrestnoMero(0.05);

        System.out.println("\nLetna obrestna mera: 5%");
        mesecne_obresti1 = varcevalec1.izracunMesecnihObresti();
        mesecne_obresti2 = varcevalec2.izracunMesecnihObresti();
        System.out.println("Varcevalec 1: " + varcevalec1.getPrihranek() + " EUR");
        System.out.println("Varcevalec 2: " + varcevalec2.getPrihranek() + " EUR");
    }
}