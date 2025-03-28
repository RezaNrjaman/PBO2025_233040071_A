package P6;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(MataKuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (MataKuliah mk : daftarMatakuliah) {
            sb.append(mk.display()).append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS() {
        double totalNilai = 0;
        int totalSKS = 0;

        for (MataKuliah mk : daftarMatakuliah) {
            totalNilai += mk.nilaiIndex() * mk.getSks();
            totalSKS += mk.getSks();
        }

        this.ips = totalSKS > 0 ? totalNilai / totalSKS : 0;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getIPS() {
        return ips;
    }

    public void setIPS(double ips) {
        this.ips = ips;
    }

    public List<MataKuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }
}

