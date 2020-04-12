package com.company;

public class KopfZahlCamera {


    enum Ergebnis {
        Kopf,
        Zahl

    }

    public static Ergebnis ermittleErgebnis (){

        double number = Math.random();


        if (number < 0.5){

            return Ergebnis.Kopf;

        } else {

            return Ergebnis.Zahl;

        }




    }

}

