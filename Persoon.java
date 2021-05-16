package be.vives.ti;

import java.time.LocalDate;

public abstract class Persoon {
    private LocalDate geboorteDatum;
    private String naam;

    public Persoon(LocalDate geboorteDatum, String naam) {
        this.geboorteDatum = geboorteDatum;
        this.naam = naam;
    }

    public int getLeeftijd() {
        int huidigJaartal = LocalDate.now().getYear();
        int geboortejaar = geboorteDatum.getYear();
        LocalDate  birthday = geboorteDatum.withYear(huidigJaartal);
        if (LocalDate.now().isBefore(birthday)) {
            return huidigJaartal - geboortejaar - 1; //nog niet verjaard
        } else {
            return huidigJaartal - geboortejaar;
        }
    }

    public String getNaam() {
        return naam;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    @Override
    public String toString() {
        return "geboorteDatum: " + geboorteDatum +
                "\nnaam: " + naam +
                "\nleeftijd: " + getLeeftijd() +
                "\n";
    }
}
