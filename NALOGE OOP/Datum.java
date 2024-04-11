public class Datum {

    private int mesec;
    private int dan;
    private int leto;

    public Datum(int mesec, int dan, int leto) {
        this.mesec = mesec;
        this.dan = dan;
        this.leto = leto;
    }

    public int getMesec() {
        return mesec;
    }

    public void setMesec(int mesec) {
        this.mesec = mesec;
    }

    public int getDan() {
        return dan;
    }

    public void setDan(int dan) {
        this.dan = dan;
    }

    public int getLeto() {
        return leto;
    }

    public void setLeto(int leto) {
        this.leto = leto;
    }

    public void izpis() {
        System.out.println(dan + "/" + mesec + "/" + leto);
    }
}
