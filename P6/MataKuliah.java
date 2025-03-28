package P6;

public class MataKuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;
    private Dosen dosenPengampu;

    public MataKuliah(String kode, String nama, String index, int sks, Dosen dosen) {
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
        this.dosenPengampu = dosen;
    }

    public int getSks() {
        return sks;
    }

    public double nilaiIndex() {
        return switch (index) {
            case "A" -> 4.0;
            case "AB" -> 3.5;
            case "B" -> 3.0;
            case "BC" -> 2.5;
            case "C" -> 2.0;
            case "D" -> 1.0;
            default -> 0.0;
        };
    }

    public String display() {
        return kode + " - " + nama + " (" + index + ") - " + sks + " SKS\n" + dosenPengampu.display();
    }
}
