import zadania.cd2.kapsulkowanie.DateTask;
import zadania.introductionToJava.BiggestDivider;
import zadania.introductionToJava.RozpadNaPierwsze;
import zadania.introductionToJava.tablica.osob.Osoba;
import zadania.introductionToJava.tablica.osob.TablicaOsob;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    //BiggestDivider.searchDivider(236,2200);
    //RozpadNaPierwsze.czynnikiPierwsze(36);

        Osoba o1 = new Osoba("Diomedios", "Laurent");
        //TablicaOsob.dodajDane(o1.getNames()); // czy mogę bez instancji i przechowa się wewnątrz klasy ewentualnie tylko do sout'a?




        //System.out.println(TablicaOsob.dodajDane(o1.getNames()));

        TablicaOsob firstArr = new TablicaOsob();

        firstArr.dodajDane(o1.getNames());
        TablicaOsob.dodajDane(o1.getNames()); //Czym to sie dokładnie różni?

        DateTask.dzisiaj();
        DateTask.tydzienTemu();
        DateTask.zaTydzien();









    }
}
