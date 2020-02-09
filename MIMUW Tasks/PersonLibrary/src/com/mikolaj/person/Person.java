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
public class Person {
    private String name, surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = " " + surname;
    }
}
