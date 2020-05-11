package com.mikolaj;

public class Stos {

    private EltStosu wierzch;

    public Stos() {
        wierzch = null;
    }

    public boolean pusty(){
        return wierzch == null;
    }
    public void wstaw(Object elt){
        wierzch = new EltStosu(elt, wierzch);
    }
    public Object pobierz() throws PustyStos {
        if (pusty())
            throw new PustyStos();
        Object wynik = wierzch.elt;
        wierzch = wierzch.nast;
        return wynik;
    }
}