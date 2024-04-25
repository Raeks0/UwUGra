class HP {
    private int aktualnePunktyZycia;
    private static final int maksymalnePunktyZycia = 100;

    // Konstruktor klasy HP
    public HP() {
        this.aktualnePunktyZycia = maksymalnePunktyZycia;
    }

    // Metoda zwracająca aktualne punkty życia
    public int pobierzAktualnePunktyZycia() {
        return aktualnePunktyZycia;
    }

    // Metoda zwracająca maksymalne punkty życia
    public int pobierzMaksymalnePunktyZycia() {
        return maksymalnePunktyZycia;
    }

    // Metoda ustawiająca aktualne punkty życia
    public void ustawAktualnePunktyZycia(int aktualnePunktyZycia) {
        this.aktualnePunktyZycia = aktualnePunktyZycia;
        if (this.aktualnePunktyZycia < 0) {
            this.aktualnePunktyZycia = 0;
        } else if (this.aktualnePunktyZycia > maksymalnePunktyZycia) {
            this.aktualnePunktyZycia = maksymalnePunktyZycia;
        }
    }

    // Metoda zmniejszająca aktualne punkty życia o podaną wartość
    public void zmniejszPunktyZycia(int ilosc) {
        aktualnePunktyZycia -= ilosc;
        if (aktualnePunktyZycia <= 0) {
            aktualnePunktyZycia = 0;
            System.out.println("Umierasz...");
        }
    }

    // Metoda zwracająca true, jeśli jednostka jest żywa (posiada więcej niż 0 punktów życia)
    public boolean czyJestZywy() {
        return aktualnePunktyZycia > 0;
    }

    // Metoda odejmująca podaną wartość punktów życia
    public void otrzymajObrazenia(int obrazenia) {
        aktualnePunktyZycia -= obrazenia;
        if (aktualnePunktyZycia <= 0) {
            aktualnePunktyZycia = 0;
            System.out.println("Umierasz...");
        }
    }
}
