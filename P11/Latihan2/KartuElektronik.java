package P11.Latihan2;

public class KartuElektronik implements Kartu {
    private String kodeBank;
    private String pin;

    public KartuElektronik(String kodeBank, String pin) {
        super();
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    @Override
    public boolean otentikasi(String pinInput) {
        if (pin.equals(pinInput))
            return true;
        else
            return false;
    }

    @Override
    public String encode(String pin) {
        // melakukan enkripsi inputan PIN
        return null;
    }
}
