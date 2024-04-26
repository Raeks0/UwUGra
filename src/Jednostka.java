import java.util.Random;

public abstract class Jednostka {
    protected String imie;
    protected HP hp;
    protected Random random;

    public Jednostka(String imie, int punktyZycia) {
        this.imie = imie;
        this.hp = new HP();
        this.random = new Random();
    }

    public abstract int getPunktAtaku();
    public abstract int getPunktObrony();
    public abstract int getSzczescie();

    public HP getHP() {
        return hp;
    }
    public abstract void atakuj(Jednostka przeciwnik);
    
    public boolean czyZyje() {
        return hp.czyJestZywy();
    }

    public void odejmijPunktyZycia(int obrazenia) {
        hp.zmniejszPunktyZycia(obrazenia);
    }

    protected boolean czyUnik(int szczescie) {
        int losowaLiczba = random.nextInt(100) + 1; // losowa liczba od 1 do 100
        return losowaLiczba <= szczescie;
    }
}
