
public class Boss extends Jednostka {
    private int punktAtaku;
    private int punktObrony;
    private int szczescie;

    public Boss(String imie, int punktyZycia, int punktAtaku, int punktObrony, int szczescie) {
        super(imie, punktyZycia);
        this.punktAtaku = punktAtaku;
        this.punktObrony = punktObrony;
        this.szczescie = szczescie;
    }

    @Override
    public int getPunktAtaku() {
        return punktAtaku;
    }

    @Override
    public int getPunktObrony() {
        return punktObrony;
    }

    @Override
    public int getSzczescie() {
        return szczescie;
    }
}

