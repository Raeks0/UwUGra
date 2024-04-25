import java.util.Random;

public class Walka {
    private Jednostka gracz;
    private Jednostka przeciwnik;
    private Random random;

    public Walka(Jednostka gracz, Jednostka przeciwnik) {
        this.gracz = gracz;
        this.przeciwnik = przeciwnik;
        this.random = new Random();
    }

    public void rozpocznijWalke() {
        System.out.println("Rozpoczyna się walka!");
        while (gracz.czyZyje() && przeciwnik.czyZyje()) {
            wykonajRunde();
        }
        zakonczWalke();
    }

    private void wykonajRunde() {
        if (czyUnik(gracz.getSzczescie())) {
            System.out.println("Gracz unika ataku przeciwnika!");
        } else {
            int obrazeniaGracza = gracz.getPunktAtaku() - przeciwnik.getPunktObrony();
            if (obrazeniaGracza > 0) {
                przeciwnik.odejmijPunktyZycia(obrazeniaGracza);
                System.out.println("Gracz zadaje " + obrazeniaGracza + " obrażeń przeciwnikowi.");
            } else {
                System.out.println("Gracz nie zadaje obrażeń przeciwnikowi.");
            }
        }

        if (czyUnik(przeciwnik.getSzczescie())) {
            System.out.println("Przeciwnik unika ataku gracza!");
        } else {
            int obrazeniaPrzeciwnika = przeciwnik.getPunktAtaku() - gracz.getPunktObrony();
            if (obrazeniaPrzeciwnika > 0) {
                gracz.odejmijPunktyZycia(obrazeniaPrzeciwnika);
                System.out.println("Przeciwnik zadaje " + obrazeniaPrzeciwnika + " obrażeń graczowi.");
            } else {
                System.out.println("Przeciwnik nie zadaje obrażeń graczowi.");
            }
        }
        System.out.println("Punkty życia gracza: " + gracz.getHP().pobierzAktualnePunktyZycia());
        System.out.println("Punkty życia przeciwnika: " + przeciwnik.getHP().pobierzAktualnePunktyZycia());
        System.out.println();
    }

    private boolean czyUnik(int szczescie) {
        int losowaLiczba = random.nextInt(100) + 1; // losowa liczba od 1 do 100
        return losowaLiczba <= szczescie;
    }

    private void zakonczWalke() {
        if (gracz.czyZyje()) {
            System.out.println("Gracz zwycięża!");
        } else {
            System.out.println("Przeciwnik zwycięża!");
        }
    }
}