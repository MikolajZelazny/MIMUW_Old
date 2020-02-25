public class Main {

    public static void main(String[] args) {
        // nie mozna stworzyc instancji klasy abstrakcyjnej -> AbstractJava abstrakcja = new AbstractJava();
        AbstractJava abstraction = new AbstractImplementation();
        ((AbstractImplementation) abstraction).setLiczba(5);
        System.out.println("Hello World, wypisuje liczbe z klasy ktora" +
                " rozszerzyla metode z klasy abstrakcyjnej: " + abstraction.zwrocLiczbe());
    }
}
