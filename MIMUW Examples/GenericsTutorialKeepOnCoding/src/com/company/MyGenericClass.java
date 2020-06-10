package com.company;

public class MyGenericClass<T, C, V> {
    T ob;
    C ob2;
    V ob3;

    MyGenericClass(T ob, C ob2, V ob3){
        this.ob=ob;
        this.ob2=ob2;
        this.ob3=ob3;
    }

    void showType(){
        System.out.println(ob.getClass().getName() + ob2.getClass().getName() + ob3.getClass().getName());
    }


}
