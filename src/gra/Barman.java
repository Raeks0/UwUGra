package gra;

import java.util.Random;
import java.util.Scanner;

public class Barman {

    private static int iloscWypitychDrinkow = 0;

    public static void RozmowaZBarmanem(Postac gracz) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Witaj! Jak mogę Ci pomóc?");

        while (true) {
            System.out.println("Wybierz jedną z opcji:");
            System.out.println("1. Zaproponuj mi drinka");
            System.out.println("2. Zaproponuj dodatkową misję");
            System.out.println("3. Wyjdź");

            int wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    zaproponujDrinka(random);
                    break;
                case 2:
                	wykonajMisje(random);
                    break;
                case 3:
                    System.out.println("Dziękuję za wizytę! Zapraszam ponownie!");
                    return;
                default:
                    System.out.println("Niepoprawny wybór, spróbuj ponownie.");
            }

            if (iloscWypitychDrinkow >= 10) {
                upicia();
                return;
            }
        }
    }

    public static void zaproponujDrinka(Random random) {
        String[] drinki = {"Mojito", "Piña Colada", "Sex on the Beach", "Cosmopolitan", "Margarita", "Caipirinha"};
        int index = random.nextInt(drinki.length);
        String drink = drinki[index];
        System.out.println("Proponuję Ci drinka: " + drink);
        iloscWypitychDrinkow++;
        System.out.println(iloscWypitychDrinkow + " drink");
    }
    public static void wykonajMisje(Random random) {
        String[] misje = {"Znajdz i porwij dziecko", "Zabij pierwszą napotkaną osobę po wyjściu z baru", "Wypij 10 drinków"};
        int index = random.nextInt(misje.length);
        String misja = misje[index];
        System.out.println("Proponuję Ci dodatkową misję: " + misja);
        System.out.println("Czy chcesz wykonać tę misję? (Tak/Nie)");
        Scanner scanner = new Scanner(System.in);
        String odpowiedz = scanner.nextLine();

        if (odpowiedz.equalsIgnoreCase("Tak")) {
            System.out.println("Super! Życzę powodzenia w wykonaniu misji: " + misja);
        } else {
            System.out.println("Może następnym razem!");
        }
    }

    public static void upicia() {
        System.out.println("Ojej! Wypiłeś już 10 drinków. Wygląda na to, że jesteś już dość... pokaźnie wstawiony.");
        System.out.println("Może czas na małą przerwę?");
    }
}