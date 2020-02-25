package com.mikolaj.exceptions;

public class ObsługiwanyWyjątek {
    public void głębiej(String s) throws Exception {
        System.out.println("początek głębiej");
        if (s == null) throw new Exception();
        System.out.println("koniec głębiej");
    }

    public void głęboko(String s) {
        try {
            System.out.println("początek głęboko");
            głębiej(s);
            System.out.println("koniec głęboko");
        } catch (Exception e) {
            System.out.println("obsługa wyjątku");
            e.printStackTrace(System.out);
        }
        System.out.println("po obsłużeniu wyjątku");
    }
}