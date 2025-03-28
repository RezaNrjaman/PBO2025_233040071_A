package P6;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("123456789", "Fajar Darmawan, ST., M.KOM");
        Dosen dosen2 = new Dosen("123456788", "Siroj Niur Alum, ST., M.T");

        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3, dosen1);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC", 3, dosen1);
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3, dosen2);

        KartuHasilStudi khs = new KartuHasilStudi("2022");
        khs.addMatakuliah(mk1);
        khs.addMatakuliah(mk2);
        khs.addMatakuliah(mk3);
        khs.hitungIPS();

        Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

        TranskripNilai transkrip = new TranskripNilai(mhs, "2022");
        transkrip.addKHS(khs);
        transkrip.hitungIPK();
        transkrip.display();
    }
}
