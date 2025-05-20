package P11.Tugas;

public class Lagu extends Media implements Favoritable {

    Lagu(String judul, double durasi) {
        super(judul, durasi); // Memanggil konstruktor superclass (Media)
    }

    // implementasi metode abstrak dari superclass (Media)
    public void play() {
        System.out.println("Memutar lagu: " + judul + ", Durasi: " + durasi + " menit");
    }

    public void pause() {
        System.out.println("Menjeda lagu: " + judul);
    }

    public void stop() {
        System.out.println("Menghentikan lagu: " + judul);
    }

    // implementasi metode asbtrak dari inteface (Favoritable)
    public void tambahKeFavorit() {
        System.out.println("Lagu \"" + judul + "\" telah ditambahkan ke favorit.");
    }
}
