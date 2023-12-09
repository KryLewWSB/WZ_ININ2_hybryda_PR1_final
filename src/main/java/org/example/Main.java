package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] przyjeteLiczby = new int[5];

        for (int i = 0; i < przyjeteLiczby.length; i++){
            System.out.println("Podaj liczbę numer " + (i + 1));
            przyjeteLiczby[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(przyjeteLiczby));//1 sposób wyświetloenia danych z tablicy

        //2 sposób wyświetloenia danych z tablicy:
        for(int liczba : przyjeteLiczby){
            System.out.println(liczba);
        }

    }
}