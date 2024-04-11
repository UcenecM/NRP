public class TestKnjiga {
    public static void main(String[]args){
        Knjiga k1=new Knjiga("Slovo od mladosti", 12345, "Jaka", "Mladinska knjiga");
        Knjiga k2=new Knjiga("Martin Krpan", 98344, "Tone", "Mladinska knjiga");
        Knjiga k3=new Knjiga("Vrba ", 43243, "Svetlana", "Mladinska knjiga");
        Knjiga k4=new Knjiga("Trije bratje", 42564, "Tone", "Mladinska knjiga");
        Knjiga k5=new Knjiga("Desetnica ", 48283, "Ivan", "Mladinska knjiga");

        k1.knjigaInfo();
        k2.knjigaInfo();
        k3.knjigaInfo();
        k4.knjigaInfo();
        k5.knjigaInfo();
    }
}