package com.mikolaj.person;
/* Napisz program składający się z dwu klas, umieszczonych w dwu plikach (ale w jednym pakiecie).
Jeden plik ma zawierać definicję klasy Person (z imieniem i nazwiskiem oraz metodami pozwalającymi
na odczytywanie i zapisywanie tych atrybutów oraz konstruktorem),
drugi ma wczytać od użytkownika dane 10 osób, zapamiętać je w tablicy osób,
a następnie wypisać w odwrotnej kolejności.

Wersja trudniejsza: program czyta dane, aż użytkownik poda puste nazwisko. Tablica początkowo ma np.
10 elementów, ale w trakcie działania programu należy ją wymieniać w miarę potrzeby na większą
(za każdym razem dwukrotnie zwiększając jej pojemność). Oczywiście nie można przy tym zgubić
dotychczasowej zawartości. */
public class PersonLogic {
    private Person[] person; // Przechowuje personOrdered
    private Person[] temp; // jak pokazac w showPerson zamiast temp person


    public void readAndSavePersonData(Person[] personArr){
        person = personArr.clone();

        for (int c = 0; c<=personArr.length-1; c++){
            System.out.println("save check " + "Nr. " + c + " " + personArr[c] + " ......");
        }


    }

    public void doReversionOfTable (Person[] person) {
        Person[] temp = new Person[person.length];
        for (int i = 0; i <= person.length - 1; i++) {
            temp[i] = person[person.length - 1 - i];

        }

        // Check index
        for (int ci = 0; ci <= temp.length - 1; ci++) {
            System.out.println("save check " + "Nr. " + ci + " " + temp[ci] + " ......");
        }

        // Przekazanie zawartosci tymczasowej do ogolnej tablicy "person"
        person = temp.clone();
    }



    public void showPersons(Person[] temp){ //ShowPerson, other method will revert.
        for (int l=0;l<=temp.length-1;l++){ //0 to length
            System.out.println(l + "-" + temp[l].getName() + temp[l].getSurname());
        }
        System.out.println("SHOW: " + temp[1]);
        //System.out.println("SHOW: " + temp[1]);
    }
}
