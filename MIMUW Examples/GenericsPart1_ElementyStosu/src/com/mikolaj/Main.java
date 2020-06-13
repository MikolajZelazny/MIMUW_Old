package com.mikolaj;

public class Main {

    public static void main(String[] args) throws PustyStos {
        Osoba os1 = new Osoba("Jasio");
        Stos s = new Stos();

        s.wstaw(os1);
       // Osoba os2 = s.pobierz(); // metoda pobierz ma typ wyniku Object, a my potrzebujemy obiektu klasy Osoba.
        Osoba os2 = (Osoba) s.pobierz(); // działające ale wciąż nie optymalne rozwiązanie

        System.out.println("Równość par: " +
                new Para<Integer, Integer>(0,0).equals(new Para<Integer, Integer>(0,0)));

        Para p1 = new Para(8, "Stru");
        Para p2 = new Para(8, "Stru");
        System.out.println("Test2: " + p1.equals(p2));

    }



}
