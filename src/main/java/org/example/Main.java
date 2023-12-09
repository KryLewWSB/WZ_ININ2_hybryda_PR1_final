package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Zadanie 24. */
        Pracownik pracownik1 = new Pracownik();
        pracownik1.imie = "Adam";
        pracownik1.nazwisko = "Kowalski";
        pracownik1.dzial = "IT";
        pracownik1.wynagrodzenie = 6_000;
        System.out.println("Imię pracownika: " + pracownik1.imie +
                        "\nNazwisko pracownika: " + pracownik1.nazwisko +
                        "\nDział pracownika: " + pracownik1.dzial +
                        "\nWynagrodzenie pracownika: " + pracownik1.wynagrodzenie);

    }
}