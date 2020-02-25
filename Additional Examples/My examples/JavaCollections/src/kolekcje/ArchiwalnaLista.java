package kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArchiwalnaLista {

    public static void archievum (){
        ArrayList<String> nazwyCollection= new ArrayList<>();
        nazwyCollection.add("Bartek");
        nazwyCollection.addAll(Arrays.asList("Mikolaj", "Martyna"));
        System.out.println(nazwyCollection.get(2));
    }

}
