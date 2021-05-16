package be.vives.ti;

import java.util.List;

public class Crèche extends Opvang {

    private final static int MAX_LEEFTIJD_KIND = 3;
    private final static int MAX_AANTAL_KINDEREN = 100;

    public Crèche(List<Kind> lijstKinderen, List<Verzorger> lijstVerzorgers) {
        super(lijstKinderen, lijstVerzorgers);
    }

    public int getMinimumAantalVerzorgers(int aantalKinderen) {
        if (aantalKinderen <= 28) {
            return 2;
        } else {
            return (int) Math.ceil(aantalKinderen/14);
        }
    }
}
