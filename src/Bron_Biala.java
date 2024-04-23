
abstract class Bron_Biala {
    protected String nazwa;
    protected int obrazenia;

    public void BronBiala(String nazwa, int obrazenia) {
        this.nazwa = nazwa;
        this.obrazenia = obrazenia;
    }

    // Metoda do wykonania ataku bronią białą
    abstract void atakuj();
}




