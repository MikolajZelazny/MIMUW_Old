import com.mikolaj.person.*;

/*
input: tablica [1,2,3]
output: nowa tablica [3,2,1]
 */
public class Main {
    private static Person[] personsOrdered = getPersonsOrdered();
    private static Person[] personsReverted; //personOrdered but reverted

    public static void main(String[] args) {
        PersonLogic personLogic = new PersonLogic();
        System.out.println("\n Save initial data: \n");
        personLogic.readAndSavePersonData(personsOrdered);
        System.out.println("\n Reversion check: \n");
        personLogic.doReversionOfTable(personsOrdered);
        System.out.println("\n Final(show method) compatibility test:  \n");
        personLogic.showPersons();


        // personsReverted = personLogic.doReversionOfTable(personsOrdered); Create in PersonLogic class.
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
