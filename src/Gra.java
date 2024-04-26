import java.util.Random;
import java.util.Scanner;

public class Gra {
    private static final Jednostka Boss = null;
	private static Postac gracz = new Postac("Gracz1", 100, 100);
    private static Ekwipunek ekwipunek = new Ekwipunek(); // Dodajemy obiekt klasy Equipment

    
    public static void rozpocznij() {
        Scanner scanner = new Scanner(System.in);
        boolean kontynuuj = true;

        while (kontynuuj) {
            System.out.println("Witaj w barze! Wybierz, co chcesz zrobić:");
            System.out.println("1. Porozmawiaj z barmanem");
            System.out.println("2. Spróbuj szczęścia na maszynie hazardowej");
            System.out.println("3. Wyjdź z baru");
            System.out.println("4. Wyświetl ekwipunek");
            System.out.println("5. Wyjdź z gry");
            
            int wybor = scanner.nextInt();
            scanner.nextLine(); 

            switch (wybor) {
                case 1:
                    Barman.RozmowaZBarmanem(gracz);
                    break;
                case 2:
                    Slotsy.graNaAutomacie(gracz);
                    break;
                case 3:
                    System.out.println("Wychodzisz z baru. Co chcesz teraz zrobić?");
                    System.out.println("1. Rozejrzyj się po mieście");
                    System.out.println("2. Idź do lasu");
                    System.out.println("3. Idź do sklepu z bronią");
                    System.out.println("4. Wyświetl ekwipunek ");
                    System.out.println("5. Zaczynaj żebrać");
                    int wyborPoWyjsciu = scanner.nextInt();
                    scanner.nextLine();
                    switch (wyborPoWyjsciu) {
                        case 1:
                            System.out.println("Rozejrzeliście się po mieście.");
                            break;
                        case 2:
                            System.out.println("Poszli do lasu Poszli");
                            System.out.println("Po ziemi przebiegłą mysza i potem ...");

                            System.out.println("Spotkaliście GOBLINA Krzysia");
                            Boss goblinKrzysio = new Boss("Goblin Krzysio", 100, 20, 10, 20); // Tworzenie obiektu Boss
                            Walka walkaZGoblinem = new Walka(gracz, goblinKrzysio); // Przekazanie gracza i bossa do obiektu Walka
                            walkaZGoblinem.rozpocznijWalke(); // Rozpoczęcie walki
                            break;


                        case 3:
                        	Sklepik.Sklep(gracz, ekwipunek); // tutaj bedzie ze wchodzisz se do sklepu noramlnie i masz ze ziutek mowi elo mam takie bronei na sprzedarz i mozesz se je kupic 
                            break;
                        case 4: 
                        	System.out.println("Ekwipunek gracza:");
                            ekwipunek.wyswietlEkwipunek(); // Wywołujemy metodę z obiektu klasy Ekwipunek
                            break;
                        case 5:
                            if (losujSzansę(25)) { // Losowanie szansy 25%
                                gracz.dodajMonety(20); // Dodanie 20 monet
                                System.out.println("Dostajesz 20 monet!");
                            } else {
                                System.out.println("Zaczynasz żebrać, ale nikt wam nic nie dał.");
                            }
                            break;
                        default:
                            System.out.println("Nieprawidłowy wybór. Wróćmy do baru.");
                            break;
                    }
                    break;
                case 4:
                	System.out.println("Ekwipunek gracza:");
                    ekwipunek.wyswietlEkwipunek(); // Wywołujemy metodę z obiektu klasy Ekwipunek
                    break;
                case 5:
                	kontynuuj = false;
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór.");
            }
        }

        System.out.println("Dziękujemy za grę! Do zobaczenia następnym razem.");
        scanner.close();
    }

    private static boolean losujSzansę(int procent) {
        Random random = new Random();
        int losowaLiczba = random.nextInt(100); // Losujemy liczbę od 0 do 99
        return losowaLiczba < procent; // Zwracamy true, jeśli liczba jest mniejsza od procentu
    }
}
