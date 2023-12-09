package org.example;

public class Main {
    public static void main(String[] args) {
        int[] tab1 = new int[4]; //delkaracja tablicy typu int o długości 4
        int[] tab2 = {1, 2, 3, 4, 5};//deklaracja tablicy intów o długości 5, i inicjalizacja tablicy
        tab1[0] = 5;//inicjalizacja (przypisanie wartości) tablicy
        tab1[3] = 7;//inicjalizacja (przypisanie wartości) tablicy

        System.out.println("Element pierwszy tablicy tab1: " + tab1[0] +
                            "\nElement drugi tablicy tab1: " + tab1[1] +
                            "\nElement trzeci tablicy tab1: " + tab1[2] +
                            "\nElement czwarty tablicy tab1: " + tab1[3] );
        System.out.println(tab1.length);

        System.out.println("Początek pętli");
        for(int liczba : tab2){
            System.out.println("Element tab2: " + liczba);
        }
        System.out.println("Koniec pętli");
    }
}