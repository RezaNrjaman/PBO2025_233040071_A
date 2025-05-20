package P11.Tugas;

public abstract class Media { // pendefinisian kelas abstrak
    String judul; // menyimpan judul media
    double durasi; // menyimpan durasi media dalam menit

    Media(String judul, double durasi) { // Konstruktor
        this.judul = judul;
        this.durasi = durasi;
    }

    // Metode abstrak yang harus diimplementasikan oleh subclass
    abstract void play();

    abstract void pause();

    abstract void stop();
}
