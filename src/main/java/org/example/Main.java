package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        /* Zadanie 24. */
        Pracownik pracownik1 = new Pracownik("Anna",
                                            "Nowak",
                                            Dzial.IT,
                                            5_000);//utworzenie nowego obiektu

        Pracownik pracownik2 = new Pracownik("Tadeusz",
                                            "Nowicki",
                                            Dzial.IT,
                                            7_000);//utworzenie nowego obiektu

        Kierownik kierownik1 = new Kierownik("Tomasz",
                                            "Kowalski",
                                            Dzial.KSIEGOWOSC,
                                            5_000,
                                            2_000);

        List<Pracownik> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(pracownik1);
        listaPracownikow.add(pracownik2);

        for(Pracownik pracownik : listaPracownikow) {
            pracownik.wypiszDane();//wywołanie metody pracownik
        }

        kierownik1.wypiszDane();//wywołanie metody pracownik



    }
}