import java.util.Random;
import java.util.Scanner;

public class Slotsy {
	public static void graNaAutomacie() {
        Scanner scanner = new Scanner(System.in);
        String odpowiedz;

        do {
            System.out.println("Naciśnij Enter, aby zakręcić maszyną...");
            scanner.nextLine();

            kręćMaszyną();

            System.out.println("Czy chcesz zagrać jeszcze raz? (tak/nie)");
            odpowiedz = scanner.nextLine();

            if (odpowiedz.equalsIgnoreCase("nie")) {
                break; // Wyjście z pętli do-while
            } else if (!odpowiedz.equalsIgnoreCase("tak")) {
                System.out.println("Nieprawidłowa odpowiedź. Proszę wpisać 'tak' lub 'nie'.");
            }

        } while (true);

        scanner.close();
    }

    public static void kręćMaszyną() {
        System.out.println("Maszyna się kręci...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        String[] symbole = {"[Jabłko]", "[Pomarańcza]", "[Wiśnia]"};
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int symbolIndex = random.nextInt(symbole.length);
            System.out.print(symbole[symbolIndex] + " ");
        }

        System.out.println();


        if (czyWygrał()) {
            System.out.println("Gratulacje! Wygrałeś!");
        } else {
            System.out.println("Niestety, tym razem nie udało Ci się wygrać.");
        }
    }

    public static boolean czyWygrał() {
        Random random = new Random();
        return random.nextInt(10) == 0; // Szansa na wygraną wynosi 10%
    }
}
