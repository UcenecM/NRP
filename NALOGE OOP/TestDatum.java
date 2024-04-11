public class TestDatum {

    public static void main(String[] args) {
        Datum datum1 = new Datum(12, 25, 2023);
        datum1.izpis();

        datum1.setMesec(1);
        datum1.setDan(1);
        datum1.setLeto(2024);
		
        datum1.izpis();

        Datum datum2 = new Datum(3, 8, 2025);
        datum2.izpis();
    }
}
