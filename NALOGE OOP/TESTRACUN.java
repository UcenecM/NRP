public class TESTRACUN {
    public static void main(String[] args){
        Racun r1=new Racun(1,"ledini caj",2,1.69);
		System.out.print(r1.sifraIzd()+ " ");
		System.out.print(r1.imeIzd()+ " ");
		System.out.print(r1.kolicina()+ " ");
		System.out.print(r1.cenaIzd()+ " ");
        System.out.println(r1.znesek()+ " ");;
		
        Racun r2=new Racun(2,"pivo",10,3.50);
		System.out.print(r2.sifraIzd()+ " ");
		System.out.print(r2.imeIzd()+ " ");
		System.out.print(r2.kolicina()+ " ");
		System.out.print(r2.cenaIzd()+ " ");
        System.out.print(r2.znesek()+ " ");;
    }
}
