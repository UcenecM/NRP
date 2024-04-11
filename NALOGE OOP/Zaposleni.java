public class Zaposleni {
    private String ime;
    private String priimek;
    private double osebniDohodek;
	
    public Zaposleni(String ime,String priimek,double osebniDohodek){
        this.ime=ime;
        this.priimek=priimek;
        this.osebniDohodek=osebniDohodek;
        if(osebniDohodek<0){
            this.osebniDohodek=0;
        }
    }
	
    public void izpis(){
        System.out.println(ime+" "+priimek+" "+osebniDohodek);  
    }
	
    public void NastaviIme(String ime){
        this.ime=ime;     
    }
	
    public void NastaviPriimek(String priimek){
        this.priimek=priimek;  
    }
	
    public void NastaviOsebniDohodek(double osebniDohodek){
        this.osebniDohodek=osebniDohodek;
    }
	
    public void povecaj(){
        osebniDohodek=osebniDohodek*1.1;
    }
}
