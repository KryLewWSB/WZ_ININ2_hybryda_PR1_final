package org.example;

public class Kierownik extends Pracownik implements InformacjePracownika {
    private int premiaKierownicza;
    public Kierownik(String imie, String nazwisko, Dzial dzial, int wynagrodzenie, int premiaKierownicza) {
        super(imie, nazwisko, dzial, wynagrodzenie);
        this.premiaKierownicza = premiaKierownicza;
    }
    @Override
    public void wypiszDane() {
        System.out.println("\n-----------------------------------------------" +
                "\nImię pracownika: " + this.imie +
                "\nNazwisko pracownika: " + this.nazwisko +
                "\nDział pracownika: " + this.dzial +
                "\nWynagrodzenie pracownika: " + this.wynagrodzenie +
                "\nPremia Kierownicza: " + this.premiaKierownicza +
                "\n-----------------------------------------------");
    }
}
