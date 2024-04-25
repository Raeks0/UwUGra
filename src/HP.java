
public class HP {
    private int hp;

    // Konstruktor
    public HP() {
        this.hp = 100; // Ustawienie początkowej wartości HP na 100
    }

    // Metoda do zmniejszania wartości HP
    public void obrazeniaHP(int ilosc) {
        hp -= ilosc;
        if (hp <= 0) {
            System.out.println("Game Over! Koniec gry."); // Wyświetlenie komunikatu końca gry
            System.exit(0); // Zakończenie programu
        }
    }

    // Metoda zwracająca aktualną wartość HP
    public int getHP() {
        return hp;
    }
}