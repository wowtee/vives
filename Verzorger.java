package be.vives.ti;

import java.time.LocalDate;

public class Verzorger extends Persoon {

    private LocalDate startDatum;

    public Verzorger(LocalDate geboorteDatum, String naam, LocalDate startDatum) {
        super(geboorteDatum, naam);
        this.startDatum = startDatum;
    }

    public LocalDate getStartDatum() {
        return startDatum;
    }

    @Override
    public String toString() {
        return "Verzorger\n" +
                super.toString() +
                "startDatum: " + startDatum +
                "\n";
    }
}
