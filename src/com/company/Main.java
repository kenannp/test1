package com.company;

import com.company.KopfZahlCamera.Ergebnis;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int anzahl = 7;

        Ergebnis[] wuerfe = new Ergebnis[anzahl];

        for (int i = 0; i < anzahl; i++) {
            wuerfe[i] = KopfZahlCamera.ermittleErgebnis();
        }

        System.out.println(Arrays.toString(wuerfe));


    }
}
