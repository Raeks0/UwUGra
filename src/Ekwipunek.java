import java.util.HashMap;
import java.util.Map;

public class Ekwipunek {
    private Map<String, Integer> przedmioty;

    public Ekwipunek() {
        this.przedmioty = new HashMap<>();
    }

    public void dodajPrzedmiot(String nazwaPrzedmiotu, int cena, Postac gracz) {
        if (gracz.getMonety().getIlosc() >= cena) {
            gracz.getMonety().odejmijMonety(cena);
            if (przedmioty.containsKey(nazwaPrzedmiotu)) {
                int aktualnaIlosc = przedmioty.get(nazwaPrzedmiotu);
                przedmioty.put(nazwaPrzedmiotu, aktualnaIlosc + 1);
            } else {
                przedmioty.put(nazwaPrzedmiotu, 1);
            }
            System.out.println("Kupiłeś " + nazwaPrzedmiotu + " za " + cena + " monet.");
            System.out.println("Pozostało Ci " + gracz.getMonety().getIlosc() + " monet.");
        } else {
            System.out.println("Nie masz wystarczającej ilości monet, aby kupić " + nazwaPrzedmiotu + ".");
        }
    }

    public boolean czyMaPrzedmiot(String nazwaPrzedmiotu) {
        return przedmioty.containsKey(nazwaPrzedmiotu);
    }

    public int iloscPrzedmiotu(String nazwaPrzedmiotu) {
        return przedmioty.getOrDefault(nazwaPrzedmiotu, 0);
    }

    public void wyswietlEkwipunek() {
        if (przedmioty.isEmpty()) {
            System.out.println("Ekwipunek jest pusty.");
        } else {
            System.out.println("Zawartość ekwipunku:");
            for (Map.Entry<String, Integer> wpis : przedmioty.entrySet()) {
                System.out.println(wpis.getKey() + ": " + wpis.getValue());
            }
        }
    }
}
