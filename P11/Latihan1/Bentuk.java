package P11.Latihan1;

public abstract class Bentuk {
    protected double PHI = 3.14;
    protected int jari2;

    public Bentuk(int jari2) {
        super();
        this.jari2 = jari2;
    }

    public abstract double luas();

    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }

    public int getJari2() {
        return jari2;
    }
}
