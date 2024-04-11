/*5. Izdelaj razred varcevalni Racun. Uporabi staticno spremenljivko letna_obrestna_mera za shranjevanje letne obrestne mere za vse imetnike racunov. Vsak objekt razreda naj vsebuje atribut (private) prihranek, ki oznacuje znesek na komitentovem varcevalnem racunu. Izdelaj metodo izracun mesecnih obresti, ki vrne znesek mesecnih obresti za posameznega komitenta. Ob tem naj se prihranki povecajo za znesek mesecnih obresti. Izdelaj staticno metodo spremeni obrestno mero, ki nastavi letno obrestno mero na novo vrednost. Izdelaj testni razred, kjer testiraš razred varcevalni racun. Deklariraj dva objekta varcevalec1 in varcevalec2, varcevalec1 naj ima privarcevano 2000EUR, varcevalec2 pa 3000EUR.
Nastavi letno obrestno mero na 4%, izracunaj znesek mesecnih obresti za oba varcevalca in izpiši prihranke za oba varcevalca.
Nastavi letno obrestno mero na 5%, izracunaj znesek mesecnih obresti za oba varcevalca in izpiši prihranke za oba varcevalca.*/
public class VarcevalniRacun {

    private static double letna_obrestna_mera = 0.04;
    private double prihranek;

    public VarcevalniRacun(double prihranek) {
        this.prihranek = prihranek;
    }

    public double izracunMesecnihObresti() {
        double mesecna_obrestna_mera = letna_obrestna_mera / 12;
        double mesecne_obresti = prihranek * mesecna_obrestna_mera;
        prihranek = prihranek + mesecne_obresti;
        return mesecne_obresti;
    }

    public static void spremeniObrestnoMero(double nova_obrestna_mera) {
        letna_obrestna_mera = nova_obrestna_mera;
    }

    public double getPrihranek() {
        return prihranek;
    }

}
