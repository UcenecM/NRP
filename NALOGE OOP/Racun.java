/*2. Izdelaj razred Račun katerega lahko trgovina s strojno opremo uporabi za izdajo računa pri prodaji artikla v trgovini. Račun naj bo sestavljen iz štirih delov: šifra izdelka, ime izdelka, število kupljenih izdelkov in cena izdelkov. Razred naj vsebuje konstruktor, ki nastavi vse predhodno naštete atribute. Izdelaj tudi metodo znesekRacuna, ki naj vrne znesek na računu, ki je rezultat produkta (število artiklov*cena). Če število kosov ni pozitivno potem naj metoda vrne vrednost 0 in prav tako, če je cena enaka 0. V testnem razredu izdelaj dva objekta tipa Račun in izpiši vse njihove podrobnosti.*/
public class Racun{
    private int sifraIzd;
    private String imeIzd;
    private int kolicina;
    private double cenaIzd;
    
    public Racun(int sifraIzd, String imeIzd, int kolicina, double cenaIzd){
        this.sifraIzd=sifraIzd;
        this.imeIzd=imeIzd;
        this.kolicina=kolicina;
        this.cenaIzd=cenaIzd;
    }
	public int sifraIzd(){
		return sifraIzd;
	}
	public String imeIzd(){
		return imeIzd;
	}
	public int kolicina(){
		return kolicina;
	}
	public double cenaIzd(){
		return cenaIzd;
	}

    public double znesek(){
        if(kolicina<=0){
            return 0;
        }else{
            return kolicina*cenaIzd;
        }
    }
}