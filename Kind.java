package be.vives.ti;

import java.time.LocalDate;

public class Kind extends Persoon{

    public Kind(LocalDate geboorteDatum, String naam) {
        super(geboorteDatum, naam);
    }

    @Override
    public String toString() {
        return "Kind\n" +
                super.toString();
    }
}
