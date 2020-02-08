package zadania.cd2.kapsulkowanie;

import java.util.ArrayList;
import java.util.List;

public class Liczba {
    //double decimalN;

    // Setter
    public static void decToArr(double c, int n) {
    //    this.decimalN = c;
        ArrayList<Integer> piList = new ArrayList<>();
        double current = c * n;
        while (current > 0) {
            int mostSignificantDigit = (int) current;
            piList.add(mostSignificantDigit);
            current = (current - mostSignificantDigit) * 10;

            int i = piList.size();
            while (piList.size()>10){
                i--;
                piList.remove(i);
            }

            // if n=1 1,
            // if n=



        }

        System.out.println(piList);
    }
}




