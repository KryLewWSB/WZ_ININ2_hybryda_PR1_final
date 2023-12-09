package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Zadanie 24. */
        Pracownik pracownik1 = new Pracownik("Anna",
                                            "Nowak",
                                            Dzial.IT,
                                            5_000);//utworzenie nowego obiektu

        Pracownik pracownik2 = new Pracownik("Tomasz",
                                            "Kowalski",
                                            Dzial.KSIEGOWOSC,
                                            5_000);

        pracownik1.wypiszDane();//wywołanie metody pracownik
        pracownik2.wypiszDane();//wywołanie metody pracownik



    }
}