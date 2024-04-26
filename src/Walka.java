import java.util.Random;

public class Walka {
    private static Jednostka gracz;
    private static Jednostka przeciwnik;
    private static Random random;

    public Walka(Jednostka gracz, Jednostka przeciwnik) {
        Walka.gracz = gracz;
        Walka.przeciwnik = przeciwnik;
        Walka.random = new Random();
    }

    public void rozpocznijWalke() {
        System.out.println("Rozpoczyna się walka!");
        while (gracz.czyZyje() && przeciwnik.czyZyje()) {
            wykonajRunde();
        }
        zakonczWalke();
    }

    private static void wykonajRunde() {
        if (gracz instanceof Boss) {
            ((Boss) gracz).atakuj(przeciwnik);
        } else {
            gracz.atakuj(przeciwnik);
        }

        try {
            Thread.sleep(3000); // Opóźnienie o 3 sekundy
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (przeciwnik instanceof Boss) {
            ((Boss) przeciwnik).atakuj(gracz);
        } else {
            przeciwnik.atakuj(gracz);
        }

        System.out.println("Punkty życia gracza: " + gracz.getHP().pobierzAktualnePunktyZycia());
        System.out.println("Punkty życia przeciwnika: " + przeciwnik.getHP().pobierzAktualnePunktyZycia());
        System.out.println();
    }


    private static void zakonczWalke() {
        if (gracz.czyZyje()) {
            System.out.println("Gracz zwycięża!");
        } else {
            System.out.println("Przeciwnik zwycięża!");
        }
    }
}