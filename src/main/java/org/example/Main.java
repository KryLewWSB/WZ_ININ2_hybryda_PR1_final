package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        * Zadanie 15. Wybierz kolor.
        * Poproś użytkownika o podanie kodu koloru (np. "R" - red, "G" - green, "B" - blue) i wyświetl pełną nazwę koloru.
        * String colorCode = "G";*/
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Podaj kod koloru R, G, B)");
            String podanaWartosc = scan.next();

            switch (podanaWartosc) {
                case "R" -> System.out.println("Kolor red / czerwony.");
                case "G" -> System.out.println("Kolor green / zielony.");
                case "B" -> System.out.println("Kolor blue / niebieski.");
                default -> System.out.println("Podałeś zły kod koloru!");
            }
        }

    }
}