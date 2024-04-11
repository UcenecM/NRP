/* 6. Izdelaj razred Knjiga, ki predstavlja knjigo. Razred Knjiga naj vsebuje 4 atribute, ki opisujejo knjigo in sicer ime knjige, ISBN številko, ime avtorja in ime založnika. Razred naj vsebuje dva konstruktorja. Prvi, ki je brez parametrov naj nastavi atributom "prazne vrednosti", drugi pa naj nastavi vrednosti omenjenih atributov na podlagi parametrov konstruktorja. Za vse atribute izdelaj metode tipa "setter" in "getter". Poleg teh metod izdelaj še metodo vrniKnjigaInfo, ki vrne opis knjige; opis naj vsebuje vse informacije o knjigi. Izdelaj testni razred TestKnjiga kjer kreiraš tabelo 30ih objektov tipa Knjiga. Napolni tabelo s petimi knjigami in nato vsebino tabele izpiši.*/
public class Knjiga {
    public String ime;
    public int ISBN;
    public String avtor;
    public String zaloznik;
    
    //KONSTRUKTORJI
    public Knjiga(String i, int st, String a, String z) {
        this.ime = i;
        this.ISBN = st;
        this.avtor = a;
        this.zaloznik = z;
    }
    public Knjiga() {
        this.ime = "";
        this.ISBN = 0;
        this.avtor = "";
        this.zaloznik = "";
    }
    //SETTER
    public void nastaviIme(String i){
        ime=i;
    }
    public void nastaviSt(int st){
        ISBN=st;
    }
    public void nastaviAvtorja(String a){
        avtor=a;
    }
    public void nastaviZaloznik(String z){
        zaloznik=z;
    }
    //GETTER
    public String getIme(){
        return ime;
    }
    public int getSt(){
        return ISBN;
    }
    public String getAvtorja(){
        return avtor;
    }
    public String getZaloznik(){
        return zaloznik;
    }
    //IZPISE
    public void knjigaInfo(){
        System.out.println(ime+" "+ISBN+" "+avtor+" "+zaloznik);
    }
}