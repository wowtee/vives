package be.vives.ti;

import java.util.List;

public class OnthaalMoeder extends Opvang {

    private final int MAX_KINDEREN = 8;
    private final int MIN_VERZORGERS = 1;

    public OnthaalMoeder(String naam, List<Verzorger> lijstVerzorgers) {
        super(naam, lijstVerzorgers);
    }

    public int getMinimumAantalVerzorgers(int aantalKinderen) {
        return MIN_VERZORGERS;
    }

    public int getMaximumAantalKinderen() {
        return MAX_KINDEREN;
    }



}
