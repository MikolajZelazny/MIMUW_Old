

package kolekcje;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class Lista {

    // Normal for because of indexes

    public static void addToList (){
        //ArrayList<String> lista= new ArrayList<>(); //  Under class or under method?
      List<String> lista = new ArrayList<String>(); //What difference?
        List<String> lista2 = new LinkedList<>();



        lista.add("Jupiter");
        lista.add("Mars");
        lista.addAll(Arrays.asList("Earth", "Pluto"));

        System.out.println(lista.get(2));//wypisze "drugi"
    }
    //System.out.println(lista.get(1)); //wypisze "drugi"

}

