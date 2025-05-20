package P11.Tugas;

public class Podcast extends Media implements Favoritable {

    Podcast(String judul, double durasi) {
        super(judul, durasi); // Memanggil konstruktor dari kelas media
    }

    // implementasi metode abstrak dari superclass (Media)
    public void play() {
        System.out.println("Memutar lagu: " + judul + ", Durasi: " + durasi + " menit");
    }

    public void pause() {
        System.out.println("Menjeda podcast: " + judul);
    }

    public void stop() {
        System.out.println("Menghentikan podcast: " + judul);
    }

    // implementasi metode abstrak dari interface(Favoritable)
    public void tambahKeFavorit() {
        System.out.println("Podcast \"" + judul + "\" telah ditambahkan ke favorit.");
    }
}
