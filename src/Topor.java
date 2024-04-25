

class Topor extends Bron_Biala {
    private String rodzajDrewna;

    public Topor(String nazwa, int obrazenia, String rodzajDrewna) {
        super();
        this.rodzajDrewna = rodzajDrewna;
    }

    @Override
    void atakuj() {
        System.out.println("Atakuję toporem " + nazwa + " - Obrażenia: " + obrazenia);
    }

    void rytualneTopienie() {
    System.out.println("Topór " + nazwa + " wykazuje rytualne znaczenie i wykonany jest z " + rodzajDrewna);
}
}