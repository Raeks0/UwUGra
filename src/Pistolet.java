class Pistolet extends Bron_Palna {
    private int magazynekPojemnosc;

    public Pistolet(String nazwa, int obrazenia, int magazynekPojemnosc) {
        super();
        this.magazynekPojemnosc = magazynekPojemnosc;
    }

    @Override
    void strzelaj() {
        System.out.println("Strzelam z pistoletu " + nazwa + " - Obrażenia: " + obrazenia);
    }

    // Dodatkowa metoda specyficzna dla pistoletu
    void wymienMagazynek() {
        System.out.println("Wymieniam magazynek w pistolecie " + nazwa);
    }
}