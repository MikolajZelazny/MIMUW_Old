package com.company;

public class MyGenericNumbers<T extends Number> {

    T ob;

    MyGenericNumbers(T ob) {
        this.ob = ob;
    }

    double square (T ob){
        return ob.intValue() * ob.doubleValue(); //without "extends Number" compiler doesn't know type so this is error
        // because we cannon't multiply string * string.
    }
}
