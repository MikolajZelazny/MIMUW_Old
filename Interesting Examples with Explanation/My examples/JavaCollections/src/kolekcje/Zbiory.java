package kolekcje;

import java.util.HashSet;
import java.util.Set;

public class Zbiory {
    // forEach - bo nie ma indexów.
    public static void sets () {
        Set<String> zbior = new HashSet<String>(); // Implementacja - HashSet
        zbior.add("Niebo");
        zbior.add("Noc");
        zbior.add("Ranek");
        zbior.remove("Noc");
        for (String ciagZnakow : zbior) {
            System.out.println(ciagZnakow);
        }
    }
}
