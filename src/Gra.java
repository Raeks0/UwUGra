
	import java.util.Random;
	import java.util.Scanner;

	public class Gra {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Witaj w barze! Wybierz, co chcesz zrobić:");
	        System.out.println("1. Porozmawiaj z barmanem");
	        System.out.println("2. Spróbuj szczęścia na maszynie hazardowej");

	        int wybor = scanner.nextInt();
	        scanner.nextLine();

	        switch (wybor) {
	            case 1:
	                rozpocznij();
	                break;
	            case 2:
	                Slotsy.graNaAutomacie();
	                break;
	            default:
	                System.out.println("Nieprawidłowy wybór.");
	        }

	        scanner.close();
	    }
// na szybko dane zeby jako tako byla mozliwosc wybotu potem dodac to albo do innej klasy albo tu zostawic 
	    public static void rozpocznij() {
	        // Tutaj umieść logikę rozpoczęcia rozmowy z barmanem
	        System.out.println("Rozpoczynasz rozmowę z barmanem...");
	        System.out.println("Barman: Witaj, czym mogę służyć?");
	    }

}
