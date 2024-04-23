

import java.util.Scanner;

public class Sklepik {
	private static Monety monety;
	public void Postac(int poczatkoweMonety) {
        this.monety = new Monety(poczatkoweMonety);
    }
	
	public static void Sklep(Postac gracz) {
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
        int dostepneMonety = monety.getIlosc();
        System.out.println("Dostępne monety: "+ monety);

        System.out.println("Wybierz numer broni, którą chcesz kupić (1-4), lub 0 aby zakończyć zakupy:");
        int wybor = scanner.nextInt();

        while (wybor != 0) {
            switch (wybor) {
                case 1:
                    kupBron("Glock", 110, dostepneMonety);
                    gracz.odejmijMonety(110);
                    break;
                case 2:
                    kupBron("Karabin", 200, dostepneMonety);
                    gracz.odejmijMonety(200);
                    break;
                case 3:
                    kupBron("Maczeta", 45, dostepneMonety);
                    gracz.odejmijMonety(45);
                    break;
                case 4:
                    kupBron("Topór", 50, dostepneMonety);
                    gracz.odejmijMonety(50);
                    break;
                default:
                    System.out.println("Niepoprawny numer broni. Wybierz ponownie.");
            }

            System.out.println("Wybierz numer broni, którą chcesz kupić (1-4), lub 0 aby zakończyć zakupy:");
            wybor = scanner.nextInt();
        }

        System.out.println("Dziękujemy za zakupy w sklepie z bronią!");
    }

    public static void kupBron(String nazwa, int cena, int dostepneMonety) {
        if (dostepneMonety >= cena) {
            System.out.println("Kupiłeś " + nazwa + " za " + cena + " monet.");
            dostepneMonety -= cena;
            System.out.println("Pozostało Ci " + dostepneMonety + " monet.");
        } else {
            System.out.println("Nie masz wystarczającej ilości monet, aby kupić " + nazwa + ".");
        }
    }
}
