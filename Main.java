package be.vives.ti;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Jas> rayon = new ArrayList<>();

        // maak een aantal jassen
        Jas jasRoodS = new Jas(Maat.SMALL, Kleur.ROOD,250.50);
        Jas jasBlauwXXL = new Jas(Maat.EXTRA_EXTRA_LARGE, Kleur.BLAUW,350.50);
        Jas jasGrijsL = new Jas(Maat.LARGE, Kleur.GRIJS,220.90);
        Jas jasZwartM = new Jas(Maat.MEDIUM, Kleur.ZWART,200.00);
        rayon.add(jasRoodS);
        rayon.add(jasBlauwXXL);
        rayon.add(jasGrijsL);
        rayon.add(jasZwartM);

        // geef alle mogelijke kleuren
        System.out.println("Alle mogelijke kleuren van de jassen:");
        for(Kleur kleur : Kleur.values()) System.out.print(kleur+" ");
        System.out.println();
        System.out.println();

        // geef alle mogelijke maten
        System.out.println("Alle mogelijke maten van de jassen:");
        for(Maat maat : Maat.values()) System.out.print(maat+" ("+maat.getGrootte()+") ");
        System.out.println();
        System.out.println();

        System.out.println("De aanwezige jassen:");
        for(Jas jas : rayon) System.out.println(jas);
    }
}
