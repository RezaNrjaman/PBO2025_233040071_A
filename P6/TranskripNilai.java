package P6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;
    private String semester; // Menambahkan atribut semester

    public TranskripNilai(Mahasiswa mahasiswa, String semester) {
        this.mahasiswa = mahasiswa;
        this.semester = semester;
        this.kartuHasilStudi = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalNilai = 0;
        int totalSKS = 0;

        for (KartuHasilStudi khs : kartuHasilStudi) {
            khs.hitungIPS();
            totalNilai += khs.getIPS() * getTotalSKS(khs);
            totalSKS += getTotalSKS(khs);
        }

        this.ipk = totalSKS > 0 ? totalNilai / totalSKS : 0;
    }

    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public int getTotalSKS(KartuHasilStudi khs) {
        return khs.getDaftarMatakuliah().stream().mapToInt(MataKuliah::getSks).sum();
    }

    public String getSemester() {
        return semester;
    }

    public double getIpk() {
        return ipk;
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Semester: " + semester);
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }
}
