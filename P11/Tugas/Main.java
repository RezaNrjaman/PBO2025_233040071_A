package P11.Tugas;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Lagu dan Podcast
        Lagu l = new Lagu("Hati-Hati di Jalan", 3.43);
        Podcast p = new Podcast("PODHUB", 50.43);

        // Menjalankan metode pada objek lagu
        l.play(); // Memutar lagu
        l.tambahKeFavorit(); // Menambahkan ke favorit
        l.stop(); // Menghentikan lagu

        System.out.println(); // Baris kosong untuk pemisah

        p.play(); // Memutar podcast
        p.tambahKeFavorit(); // Menambahkan ke favorit
        p.stop(); // Menghentikan podcast
    }
}
