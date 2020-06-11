package com.company;

public class Main {

    public static void main(String[] args) {
        MyGenericClass<Integer, String, Integer> obj = new MyGenericClass<>(10, "razy", 10);
        obj.showType();

        MyGenericNumbers<Integer> obj2 = new MyGenericNumbers<>(8);
        System.out.println(obj2.square());

        MyGenericNumbers<Double> obj3 = new MyGenericNumbers<>(-8.0);
        System.out.println(obj2.absEqual(obj3));

        System.out.println(("Trója : " + obj));

    }
}
