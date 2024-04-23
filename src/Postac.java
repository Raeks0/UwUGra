import java.util.ArrayList;
import java.util.List;

public class Postac {
    private String imie;
    private Monety monety;
    private List<IloscMonet> obserwatorzy = new ArrayList<>();

    public Postac(String imie, int poczatkoweMonety) {
        this.imie = imie;
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
}
