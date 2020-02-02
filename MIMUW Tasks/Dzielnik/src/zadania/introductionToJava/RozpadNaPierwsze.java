package zadania.introductionToJava;

import java.util.ArrayList;

public class RozpadNaPierwsze {

    public static void czynnikiPierwsze (int a) {

        ArrayList<Integer> dividers = new ArrayList<>(); //A dividers
        ArrayList<Integer> pierwsze = new ArrayList<>();

        int aa=a;
        int i=2;
        // for (int i=1; dividers.size()==2 ; i++) { nie można jak if statement?
          for ( i=2; i<=aa ;) {
            //if (dividers.size()==0){
                if (aa%i==0) { // 2
                    dividers.add(i); // dividers add 2
                    aa=aa/dividers.get(0); // = 18
                    pierwsze.add(dividers.get(0));
                    dividers.remove(0);
                    i=2;
                } else i++;
            //}


        }

        System.out.println("Rozpad liczby " + a +" na liczby pierwsze: " +pierwsze);


    }

}
