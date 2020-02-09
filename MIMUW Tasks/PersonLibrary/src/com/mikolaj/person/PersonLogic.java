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
    Person[] person;


    public void readPersonData(int numberOfPerson){
//W poleceniu jest "wczytać" do czego nam readPersonsData, taka sama operacja(loop) wykonuje się w "saveP..", czy tylko do souta?
        for (int i=0;i<person.length;i++) {
            if (i==numberOfPerson) {
                System.out.println("\nPerson " + i + " : " + person[i].getName() + person[i].getSurname());
            }
        }
    }

    public void savePersonData(Person[] a){
        person = new Person[a.length];
        for (int x=0;x<a.length;x++) {
            person[x]=a[x];
        }
    }

    public void showPersonRevertOrder (){
        for (int l=person.length-1;l>0;l--){
            System.out.println(person[l].getName() + person[l].getSurname());
        }
    }
}
