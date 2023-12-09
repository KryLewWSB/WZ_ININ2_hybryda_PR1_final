package org.example;

public class Pracownik implements InformacjePracownika {
    private String imie;
    private String nazwisko;
    private Dzial dzial;
    private int wynagrodzenie;

    public Pracownik(String imie, String nazwisko, Dzial dzial, int wynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dzial = dzial;
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public void wypiszDane() {
        System.out.println("Imię pracownika: " + this.imie +
                "\nNazwisko pracownika: " + this.nazwisko +
                "\nDział pracownika: " + this.dzial +
                "\nWynagrodzenie pracownika: " + this.wynagrodzenie);
    }
}
