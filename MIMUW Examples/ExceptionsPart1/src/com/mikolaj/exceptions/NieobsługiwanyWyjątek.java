package com.mikolaj.exceptions;

public class NieobsługiwanyWyjątek {
    public void głębiej(String s) throws Exception {
        System.out.println("początek głębiej");
        if (s == null) throw new Exception();
        System.out.println("koniec głębiej");
    }

    public void głęboko(String s) throws Exception {
        System.out.println("początek głęboko");
        głębiej(s);
        System.out.println("koniec głęboko");
    }


}