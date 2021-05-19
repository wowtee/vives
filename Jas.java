package be.vives.ti;

public class Jas {
    private Maat maat;
    private Kleur kleur;
    private double prijs;

    public Jas(Maat maat, Kleur kleur, double prijs) {
        this.maat = maat;
        this.kleur = kleur;
        this.prijs = prijs;
    }

    @Override
    public String toString() {
        return "Vest: " + "Grootte: " + maat + " in het : " + kleur + "\n en kost: " + prijs;
    }
}
