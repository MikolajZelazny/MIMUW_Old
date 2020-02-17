import com.mikolaj.person.*;

/*
input: tablica [1,2,3]
output: nowa tablica [3,2,1]
 */
public class Main {
    private static Person[] personsOrdered = getPersonsOrdered();
    //private static Person[] personsReverted; //personOrdered but reverted
    private  static Person[] personsTest;

    public static void main(String[] args) {
        PersonLogic personLogic = new PersonLogic();
        personLogic.readAndSavePersonData(personsOrdered);
        System.out.println("\n\nArray in reverse:\n");
        // personsReverted = personLogic.doReversionOfTable(personsOrdered); Create in PersonLogic class.
        personsTest = personLogic.showPersons(personsOrdered);
        //personLogic.showPersons(personsReverted);
    }

    private static Person[] getPersonsOrdered() {
        Person[] persons = new Person[4];
        persons[0] = new Person("aaa", "aaa");
        persons[1] = new Person("bbb", "bbb");
        persons[2] = new Person("ccc", "ccc");
        persons[3] = new Person("ddd", "ddd");

        return persons;
    }
}
