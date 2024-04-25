import java.util.ArrayList;
import java.util.List;

public class Postac extends Jednostka implements IloscMonet {
    private Monety monety;
    private List<IloscMonet> obserwatorzy = new ArrayList<>();

    public Postac(String imie, int poczatkoweMonety, int punktyZycia) {
        super(imie, punktyZycia);
        this.monety = new Monety(poczatkoweMonety);
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
		return 0;
        // Implementacja zwracająca punkt ataku postaci
    }

    @Override
    public int getPunktObrony() {
		return 0;
        // Implementacja zwracająca punkt obrony postaci
    }

    @Override
    public int getSzczescie() {
		return 0;
        // Implementacja zwracająca szczęście postaci
    }

    @Override
    public void aktualizujIloscMonet(int iloscMonet) {
        // Implementacja aktualizacji ilości monet
    }
}
