import java.util.Scanner;

public class Sklepik {
    public static void Sklep(Postac gracz, Ekwipunek ekwipunek) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w sklepie z bronią!");
        System.out.println("Oto dostępne produkty:");

        System.out.println("Bronie palne:");
        System.out.println("1. Glock - 110 monet");
        System.out.println("2. Karabin - 200 monet");

        System.out.println("Bronie białe:");
        System.out.println("3. Maczeta - 45 monet");
        System.out.println("4. Topór - 50 monet");

        System.out.println("Ile monet masz do wydania?");
        int dostepneMonety = scanner.nextInt();

        System.out.println("Wybierz numer broni, którą chcesz kupić (1-4), lub 0 aby zakończyć zakupy:");
        int wybor = scanner.nextInt();

        while (wybor != 0) {
            switch (wybor) {
                case 1:
                    ekwipunek.dodajPrzedmiot("Glock", 110, gracz);
                    break;
                case 2:
                    ekwipunek.dodajPrzedmiot("Karabin", 200, gracz);
                    break;
                case 3:
                    ekwipunek.dodajPrzedmiot("Maczeta", 45, gracz);
                    break;
                case 4:
                    ekwipunek.dodajPrzedmiot("Topór", 50, gracz);
                    break;
                default:
                    System.out.println("Niepoprawny numer broni. Wybierz ponownie.");
            }

            System.out.println("Wybierz numer broni, którą chcesz kupić (1-4), lub 0 aby zakończyć zakupy:");
            wybor = scanner.nextInt();
        }

        ekwipunek.wyswietlEkwipunek();

        System.out.println("Dziękujemy za zakupy w sklepie z bronią!");
    }
}
