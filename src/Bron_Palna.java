// Abstrakcyjna klasa bazowa dla broni palnej
abstract class Bron_Palna {
    protected String nazwa;
    protected int obrazenia;

    public void BronPalna(String nazwa, int obrazenia) {
        this.nazwa = nazwa;
        this.obrazenia = obrazenia;
    }

    // Metoda do oddawania strzału
    abstract void strzelaj();
}
