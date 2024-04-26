public class Boss extends Jednostka {
    private int punktAtaku;
    private int punktObrony;
    private int szczescie;

    public Boss(String imie, int punktyZycia, int punktAtaku, int punktObrony, int szczescie) {
        super(imie, punktyZycia);
        this.punktAtaku = punktAtaku;
        this.punktObrony = punktObrony;
        this.szczescie = szczescie;
    }

    @Override
    public int getPunktAtaku() {
        return punktAtaku;
    }

    @Override
    public int getPunktObrony() {
        return punktObrony;
    }

    @Override
    public int getSzczescie() {
        return szczescie;
    }

    @Override
    public void atakuj(Jednostka przeciwnik) {
    	if (czyUnik(przeciwnik.getSzczescie())) {
    	    System.out.println("Boss unika ataku gracza!");
    	} else {
    	    int obrazenia = getPunktAtaku() - przeciwnik.getPunktObrony();
    	    if (obrazenia > 0) {
    	        przeciwnik.odejmijPunktyZycia(obrazenia);
    	        System.out.println("Gracz zadaje " + obrazenia + " obrażeń bossowi.");
    	    } else {
    	        System.out.println("Gracz nie zadaje obrażeń bossowi.");
    	    }
    	}
    }
}
