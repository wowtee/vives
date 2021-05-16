package be.vives.ti;

import java.util.List;

public abstract class Opvang {

    private String naam;
    private List<Kind> lijstKinderen;
    private List<Verzorger> lijstVerzorgers;

    public Opvang(String naam, List<Verzorger> lijstVerzorgers) {
        this.naam = naam;
        this.lijstVerzorgers = lijstVerzorgers;
    }

    public List<Kind> getLijstKinderen() {
        return lijstKinderen;
    }

    public List<Verzorger> getLijstVerzorgers() {
        return lijstVerzorgers;
    }

    public int getAantalKinderen() {
        return lijstKinderen.size();
    }

    abstract public int getMinimumAantalVerzorgers(int aantalKinderen);

}
