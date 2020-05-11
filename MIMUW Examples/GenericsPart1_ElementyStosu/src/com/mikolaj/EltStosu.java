package com.mikolaj;

class EltStosu {

    public final Object elt;
    public final EltStosu nast;
    // Ponieważ obiekty klasy EltStosu są ukryte w Stosie, nie
    // ma potrzeby deklarowania ich atrybutów jako prywatnych.
    // Również fakt, że klasa EltStosu nie jest publiczna, oraz deklaracja
    // final pozwalają tu na wyjątek od ogólnej reguły, zgodnie z którą
    // atrybuty zawsze powinny by prywatne lub chronione.

    public EltStosu(Object elt, EltStosu nast) {
        this.elt = elt;
        this.nast = nast;
    }
}
