//Czy deklaracja wyjątków należy do sygnatury metody? Przygotuj przykład, który to rozstrzyga.

//        Rozwiązanie:
//          Nie. Deklaracja wyjątków nie należy do sygnatury metody, tak samo jak wartość zwrotna.

class WyjA extends Exception {}
class WyjB extends Exception {}

public class Zad5 {
    //z poniższych metod może być odkomentowana tylko jedna!
    //void test() {}
    //void test() throws WyjA {}
    //void test() throws WyjB {}
    //void test() throws WyjA, WyjB {}
    void test() throws Exception {}
}
