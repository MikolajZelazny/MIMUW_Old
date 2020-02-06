package com.ass.components;
// Your ass is selfish.
public class Ass {

    public static char[] trueAboutAss (String assy) {
        char[] assArray = assy.toCharArray();
            int i=0;
            for (char j : assArray) {
                if (Character.isUpperCase(j)) {
                    assArray[i] = 'Y';
                }
                i++;
            }


        return assArray;
    }

}
