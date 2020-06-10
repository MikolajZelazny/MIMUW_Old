package com.company;

public class MyGenericNumbers<T extends Number> {
    //Number --> Integer, Double Float

    T num;

    MyGenericNumbers(T ob) {
        this.num = ob;
    }

    double square (){
        return num.intValue() * num.doubleValue(); //without "extends Number" compiler doesn't know type so this is error
        // because we cannon't multiply string * string.
    }
}
