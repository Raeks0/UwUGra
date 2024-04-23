class Miecz extends Bron_Biala {
    private int dlugosc;

    public Miecz(String nazwa, int obrazenia, int dlugosc) {
        super();
        this.dlugosc = dlugosc;
    }

    @Override
    void atakuj() {
        System.out.println("Atakuję mieczem " + nazwa + " - Obrażenia: " + obrazenia);
    }

    // Dodatkowa metoda specyficzna dla miecza
    void ostrzeWStal() {
        System.out.println("Ostrze miecza " + nazwa + " jest wykonane ze stali.");
    }
}