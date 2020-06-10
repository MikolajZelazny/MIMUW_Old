package com.company;

public class Main {

    public static void main(String[] args) {
        MyGenericClass<Integer, String, Integer> obj = new MyGenericClass<>(10, "razy", 10);

        obj.showType();
    }
}
