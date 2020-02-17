package com.mikolaj.liczba;

import java.util.ArrayList;

public class Liczba {
    private int[] digits = new int[10];
    private double strValue;

    public Liczba(String str, int d) {
        strValue = Double.parseDouble(str);
        this.strValue=strValue;
        //...
    }

    //OTHER WAY
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
}
}
