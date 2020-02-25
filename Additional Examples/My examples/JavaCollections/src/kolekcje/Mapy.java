package kolekcje;

import java.util.HashMap;
import java.util.Map;

public class Mapy {

    public static void mapy () {
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("Wood", 132);
        mapa.put("Stone", 215);
        System.out.println(mapa.get("Wood")); // Why not map, only mapa?
    }
}
