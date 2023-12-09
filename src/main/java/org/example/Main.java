package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        /* Przykład - program symulujący grę w kostkę [1-6] */
        //metoda random generuje liczby pseudolosowe z zakresu od 0 do 1.
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Proszę podać liczbę [ od 1 do 6 ]: ");
            int podanaCyfra = scan.nextInt();
            if(podanaCyfra > 0 && podanaCyfra < 7) {

                int wylosowanaWartosc = (int) (Math.random() * 5 + 1);  //Metoda random ggenerująca wartości od 1 do 6.
                if (podanaCyfra == wylosowanaWartosc) {
                    System.out.println("Gratulację! Wygrałeś! " + "\nPodana cyfra: " + podanaCyfra +
                            "\nWylosowana cyfra: " + wylosowanaWartosc);
                } else {
                    System.out.println("Przegrałeś! Nie udało się :( ! " + "\nPodana cyfra: " + podanaCyfra +
                            "\nWylosowana cyfra: " + wylosowanaWartosc);
                }
            }else{
                System.out.println("POdałeś złą cyfrę! Podaj ponownie!");
            }
        }

    }
}