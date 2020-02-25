package tablice;

import java.util.Arrays;

public class Tablica {
    public static void getTablice(){
        //operacje na tablicach

        String[] nazwy = new String[10]; // When String[10] Exception (out of bound) repair this, for now [11]
        nazwy[0] = "Bartek";
        nazwy[9] = "Mikolaj";


        try {
            nazwy=null;
            nazwy[10] = "Martyna";
        }


        catch (IndexOutOfBoundsException e) {
            System.out.println("Nie poprawny index dodanego elementu: " + e.getMessage());
        }
        catch (Exception m){
            System.out.println("Jestem w drugim " + m.getMessage());
        }
        //
      //  String opo(nazwy) throw StringIndexOutOfBoundsException {
      //      if (Arrays.asList(nazwy).indexOf("Sedan"))
       //         throw
       // }



        for (String n: nazwy) {
            System.out.println(n);
        }
    }
}
