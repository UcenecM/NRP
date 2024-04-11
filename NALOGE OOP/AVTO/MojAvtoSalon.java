public class MojAvtoSalon{
    public static void main(String[] args) {

    //SEDAN
    Sedan sedan = new Sedan(180, 25000, "Modra", 4500);

     // Ford
     Ford ford1 = new Ford(200, 40000, "Rumena", 2024, 2500);
     Ford ford2 = new Ford(160, 31000, "Modra", 2021, 1900);

      // Avto
      Avto avto = new Avto(140, 18000, "Crna");

      // Kamion
      Kamion kamion = new Kamion(100, 40000, "Bela", 3500);

      // Izpis prodajnih cen
      System.out.println("Sedan: " + sedan.vrniProdajnoCeno());
      System.out.println("Ford 1: " + ford1.vrniProdajnoCeno());
      System.out.println("Ford 2: " + ford2.vrniProdajnoCeno());
      System.out.println("Avto: " + avto.vrniProdajnoCeno());
      System.out.println("Kamion: " + kamion.vrniProdajnoCeno());
  }
}
