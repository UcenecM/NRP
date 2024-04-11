public class TestObjekt3 {
    public static void main(String[] args) {
        Zaposleni z1=new Zaposleni("Tone","Zeppe",1000);
        Zaposleni z2=new Zaposleni("Janez","Novak",-100);
		
		z1.izpis();
		z2.izpis();
		
        z1.NastaviOsebniDohodek(1000);
        z1.povecaj();
        z1.izpis();
		z2.NastaviOsebniDohodek(-100);
        z2.povecaj();
        z2.izpis();
    }
}
