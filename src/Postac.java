import java.util.ArrayList;
import java.util.List;

public class Postac extends Jednostka implements IloscMonet {
    private Monety monety;
    private Bronie bron; // Dodajemy pole przechowujące broń gracza
    private List<IloscMonet> obserwatorzy = new ArrayList<>();

    public Postac(String imie, int poczatkoweMonety, int punktyZycia) {
        super(imie, punktyZycia);
        this.monety = new Monety(poczatkoweMonety);
    }

    public void odejmijPunktyZycia(int obrazenia) {
        hp.zmniejszPunktyZycia(obrazenia);
    }
    
    public Monety getMonety() {
        return monety;
    }

    public void dodajMonety(int ilosc) {
        monety.dodajMonety(ilosc);
        powiadomObserwatorow();
    }

    public void odejmijMonety(int ilosc) {
        monety.odejmijMonety(ilosc);
        powiadomObserwatorow();
    }

    public void zarejestrujObserwatora(IloscMonet obserwator) {
        obserwatorzy.add(obserwator);
    }

    private void powiadomObserwatorow() {
        int iloscMonet = monety.getIlosc();
        for (IloscMonet obserwator : obserwatorzy) {
            obserwator.aktualizujIloscMonet(iloscMonet);
        }
    }

    @Override
    public int getPunktAtaku() {
        int punktAtaku = 10; // Bazowa wartość punktów ataku gracza
        if (bron != null) {
            punktAtaku += bron.obrazenia(); // Jeśli gracz ma broń, dodajemy punkty ataku z broni
        }
        return punktAtaku;
    }

    @Override
    public int getPunktObrony() {
        // Załóżmy, że postać ma stałą wartość punktów obrony np. 5
        return 5;
    }

    @Override
    public int getSzczescie() {
        // Załóżmy, że postać ma stałą wartość szczęścia np. 15
        return 15;
    }

    @Override
    public void aktualizujIloscMonet(int iloscMonet) {
        // Implementacja aktualizacji ilości monet
    }

    public void atakuj(Jednostka przeciwnik) {
        if (czyUnik(przeciwnik.getSzczescie())) {
            System.out.println("Gracz unika ataku przeciwnika!");
        } else {
            int obrazenia = getPunktAtaku() - przeciwnik.getPunktObrony();
            if (obrazenia > 0) {
                przeciwnik.odejmijPunktyZycia(obrazenia);
                System.out.println("Gracz zadaje " + obrazenia + " obrażeń przeciwnikowi.");
            } else {
                System.out.println("Gracz nie zadaje obrażeń przeciwnikowi.");
            }
        }
    }


    // Metody do obsługi broni
    public void dodajBron(Bronie bron) {
        this.bron = bron;
    }

    public void usunBron() {
        this.bron = null;
    }
}