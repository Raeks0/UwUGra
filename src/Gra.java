
	import java.util.Random;
	import java.util.Scanner;

	public class Gra {
		public static void rozpocznij() {
	        Scanner scanner = new Scanner(System.in);
	        boolean kontynuuj = true;

	        while (kontynuuj) {
	            System.out.println("Witaj w barze! Wybierz, co chcesz zrobić:");
	            System.out.println("1. Porozmawiaj z barmanem");
	            System.out.println("2. Spróbuj szczęścia na maszynie hazardowej");
	            System.out.println("3. Wyjdź z gry");

	            int wybor = scanner.nextInt();
	            scanner.nextLine(); // Skonsumuj znak nowej linii

	            switch (wybor) {
	                case 1:
	                    System.out.print("dfdfd");
	                    break;
	                case 2:
	                    Slotsy.graNaAutomacie();
	                    break;
	                case 3:
	                    kontynuuj = false;
	                    break;
	                default:
	                    System.out.println("Nieprawidłowy wybór.");
	            }
	        }

	        System.out.println("Dziękujemy za grę! Do zobaczenia następnym razem.");
	        scanner.close();
	    }
// na szybko dane zeby jako tako byla mozliwosc wybotu potem dodac to albo do innej klasy albo tu zostawic 
//	    public static void rozpocznij() {
//	        // Tutaj umieść logikę rozpoczęcia rozmowy z barmanem
//	        System.out.println("Rozpoczynasz rozmowę z barmanem...");
//	        System.out.println("Barman: Witaj, czym mogę służyć?");
//	    }

}
