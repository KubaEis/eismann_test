public class Hodnoceni {
    private String nazev;
    private String predmet;
    private int znamka;


    public Hodnoceni(String nazev, String predmet, int znamka) {
        this.nazev = nazev;
        this.predmet = predmet;
        this.znamka = znamka;
    }


    public String getNazev() {
        return nazev;
    }

    public String getPredmet() {
        return predmet;
    }

    public int getZnamka() {
        return znamka;
    }
}
