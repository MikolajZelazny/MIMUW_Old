package com.mikolaj;

public class Main {

    public static void main(String[] args) throws PustyStos {
        Osoba os1 = new Osoba("Jasio");
        Stos s = new Stos();

        s.wstaw(os1);
       // Osoba os2 = s.pobierz(); // metoda pobierz ma typ wyniku Object, a my potrzebujemy obiektu klasy Osoba.
        Osoba os2 = (Osoba) s.pobierz(); // działające ale wciąż nie optymalne rozwiązanie
    }
}
