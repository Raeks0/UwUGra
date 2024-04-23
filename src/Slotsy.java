import java.util.Random;
import java.util.Scanner;

public class Slotsy {
    public static void graNaAutomacie(Postac gracz) {
        Scanner scanner = new Scanner(System.in);
        String odpowiedz;

        do {
            System.out.println("Naciśnij Enter, aby zakręcić maszyną...");
            scanner.nextLine();

            if (gracz.getMonety().getIlosc() < 1) {
                System.out.println("Nie masz wystarczająco monet! Gra zakończona.");
                break;
            } else {
                gracz.odejmijMonety(1); // Odejmujemy jedną monetę za zakręcenie maszyną
            }

            boolean wygrana = kręćMaszyną();

            if (wygrana) {
                gracz.dodajMonety(100); // Dodajemy 100 monet po wygranej
            }

            System.out.println("Czy chcesz zagrać jeszcze raz? (tak/nie)");
            odpowiedz = scanner.nextLine();

            if (odpowiedz.equalsIgnoreCase("nie")) {
                break;
            } else if (!odpowiedz.equalsIgnoreCase("tak")) {
                System.out.println("Nieprawidłowa odpowiedź. Proszę wpisać 'tak' lub 'nie'.");
            }

        } while (true);

        System.out.println("Dziękujemy za grę!");
    }

    public static boolean kręćMaszyną() {
        System.out.println("Maszyna się kręci...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String[] symbole = {"7", "🍆", "🍑"};
        Random random = new Random();

        String[] wylosowaneSymbole = new String[3];

        for (int i = 0; i < 3; i++) {
            int symbolIndex = random.nextInt(symbole.length);
            wylosowaneSymbole[i] = symbole[symbolIndex];
            System.out.print(wylosowaneSymbole[i] + " ");
        }

        System.out.println();

        return czyWygrał(wylosowaneSymbole);
    }

    public static boolean czyWygrał(String[] symbole) {
        return symbole[0].equals(symbole[1]) && symbole[1].equals(symbole[2]);
    }
}
