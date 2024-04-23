class Karabin extends Bron_Palna {
    private int pojemnoscMagazynka;

    public Karabin(String nazwa, int obrazenia, int pojemnoscMagazynka) {
        super();
        this.pojemnoscMagazynka = pojemnoscMagazynka;
    }

    @Override
    void strzelaj() {
        System.out.println("Strzelam z karabinu " + nazwa + " - Obrażenia: " + obrazenia);
    }

    // Dodatkowa metoda specyficzna dla karabinu
    void wymienAmunicję() {
        System.out.println("Wymieniam amunicję w karabinie " + nazwa);
    }
}