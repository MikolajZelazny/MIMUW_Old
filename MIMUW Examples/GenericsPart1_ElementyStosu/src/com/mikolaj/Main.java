package com.mikolaj;

public class Main {

    public static void main(String[] args) {
        Osoba os1 = new Osoba("Jasio");
        Stos s = new Stos();

        s.wstaw(os1);
       // Osoba os2 = s.pobierz(); // metoda pobierz ma typ wyniku Object, a my potrzebujemy obiektu klasy Osoba.
    }
}
