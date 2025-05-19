package P11.Latihan1;

public class Main {
    public static void main(String[] args) {
        Lingkaran L = new Lingkaran(10);
        System.out.println("== Lingkaran ==");
        System.out.println("jari2: " + L.getJari2());
        System.out.println("luas: " + L.luas());
        Tabung T = new Tabung(10, 5);
        System.out.println("== Tabung ==");
        System.out.println("jari2: " + T.getJari2() + ", tinggi: " + T.getTinggi());
        System.out.println("luas: " + T.luas());

    }
}
