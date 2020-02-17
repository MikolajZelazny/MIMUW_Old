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
    private Person[] personReverted;

    public void readAndSavePersonData(Person[] persons){
        person = persons.clone();
    }

    public void doReversionOfTable (Person[] person) {
        for(int i=0; i<person.length-1; i++){
            personReverted[i] = person[person.length-i-1];
            //array[i] = array[array.length -i -1];
            //array[array.length -i -1] = temp;
        }
    }


    public void showPersons(Person[] personReverted){ //ShowPerson, other method will revert.
        //for (int l=0;l<personReverted.length-1;l++){ //0 to length
            //System.out.println(l + "-" + personReverted[l].getName() + personReverted[l].getSurname());
        //}
        System.out.println(personReverted[1]);
    }
}
