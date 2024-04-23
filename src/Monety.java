
public class Monety {
	private int ilosc;

    public Monety(int ilosc) {
        this.ilosc = ilosc;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void dodajMonety(int ilosc) {
        this.ilosc += ilosc;
    }

    public void odejmijMonety(int ilosc) {
        if (this.ilosc >= ilosc) {
            this.ilosc -= ilosc;
        } else {
            System.out.println("Nie masz wystarczająco monet!");
        }
    }
}
