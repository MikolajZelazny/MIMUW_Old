package zadania.introductionToJava;

import java.util.ArrayList;

public class BiggestDivider {

    // Zrobić kolekcje ArrayList
    public static void searchDivider (int a, int b) {

        ArrayList<Integer> valuesA = new ArrayList<>(); //A dividers
        ArrayList<Integer> valuesB = new ArrayList<>(); //B dividers

        ArrayList<Integer> equivalent = new ArrayList<>(); // equivalent dividers

        //A (searching for dividers), ca I create 1 for (loop) for A and B?
        for (int i=1; i<=a; i++) {
            if (a%i==0) {
               valuesA.add(i);
            }
        }

        //B
        for (int j=1; j<=b; j++) {
            if (b%j==0) {
                valuesB.add(j);
            }
        }

        int dividersAmount;
        if (valuesA.size()<valuesB.size()) {
            dividersAmount=valuesA.size();
        } else dividersAmount=valuesB.size();

        int[] sames = new int[dividersAmount];

        //for (int l=0; l<=valuesA.size() || l<=valuesB.size() ; l++) { // Why not that way?
        for (int l=1; l<=dividersAmount ; l++) {
            if (valuesA.get(l-1)==valuesB.get(l-1)) {
                sames[l] = valuesA.get(l); // Interesting bug
                equivalent.add(valuesA.get(l-1));
            }
        }

        System.out.println("A dividers: "+valuesA);
        System.out.println("B dividers: "+valuesB);
        System.out.println("Dividers amount: "+dividersAmount);
        System.out.println("sames= "+sames); // Interesting bug
        System.out.println("\nBiggest equivalent divider of " +a + " and " +b + " is: "+ equivalent.get(equivalent.size()-1));
        //System.out.println(equivalent.get(-1)); Why not "get(-1)" if it needs only index?



    }
}

