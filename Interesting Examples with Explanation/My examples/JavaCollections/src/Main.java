//import kolekcje.Lista;
import kolekcje.Lista;
import kolekcje.Mapy;
import kolekcje.Zbiory;
import tablice.Tablica;
import kolekcje.ArchiwalnaLista;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //TODO poczytac o map,set i queue -> rodzaje kolekcji w java i ich implementacjach
    //TODO rozbij kod na metody / klasy osobno dla tablic i kolekcji i osobno dla map,set,queue
    //TODO zrob obsluge wyjatkow (bledow, by program sie nie wywalal jak odkomentujesz ponizsza linie
    //nazwy[10] = "Martyna"; w tablice>Tablica
    //TODO: wypisz plusy i minusy jednego i drugiego rozwiazania czyli kiedy uzywac kolekcji a kiedy tablic
    public static void main(String[] args) {

        System.out.println("\n\nTablica:");
        Tablica.getTablice();



        //operacje na kolekcjach

        System.out.println("\n\nLista.(get(2)):");
        Lista.addToList();
        System.out.println("\n\nSet:");
        Zbiory.sets();
        System.out.println("\n\nMap:");
        Mapy.mapy();



    }
}
