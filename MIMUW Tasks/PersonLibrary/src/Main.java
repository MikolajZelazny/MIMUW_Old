import com.mikolaj.person.Person;
import com.mikolaj.person.PersonLogic;

import java.lang.reflect.Array;

public class Main {
   /* Napisz program składający się z dwu klas, umieszczonych w dwu plikach (ale w jednym pakiecie).
    Jeden plik ma zawierać definicję klasy Person (z imieniem i nazwiskiem oraz metodami pozwalającymi
    na odczytywanie i zapisywanie tych atrybutów oraz konstruktorem),
    drugi ma wczytać od użytkownika dane 10 osób, zapamiętać je w tablicy osób,
    a następnie wypisać w odwrotnej kolejności.

    Wersja trudniejsza: program czyta dane, aż użytkownik poda puste nazwisko. Tablica początkowo ma np.
    10 elementów, ale w trakcie działania programu należy ją wymieniać w miarę potrzeby na większą
    (za każdym razem dwukrotnie zwiększając jej pojemność). Oczywiście nie można przy tym zgubić
    dotychczasowej zawartości. */
    public static void main(String[] args) {
        Person[] alfa = new Person[4];

        for(int i=0; i<alfa.length; i++) { // In loop because of java.lang.NullPointerException.
            alfa[i] = new Person("","");

            if (alfa[i].getName().isEmpty()) {
                alfa[0].setName("Arol");
                alfa[0].setSurname("Eusta");
            }
            if (alfa[i].getName().isEmpty()) {
                alfa[1].setName("Marol");
                alfa[1].setSurname("Kniaz");
            }
            if (alfa[i].getName().isEmpty()) {
                alfa[2].setName("Juda");
                alfa[2].setSurname("Morrt");
            }
            if (alfa[i].getName().isEmpty()) {
                alfa[3].setName("Gamiusz");
                alfa[3].setSurname("Czwarty");
            }

            //alfa[8].setName("Kugon");
            //alfa[9].setSurname("Esperalewski");

            //alfa[10].setName("Damianus");
            //alfa[11].setSurname("Rex");
        }





        PersonLogic logic = new PersonLogic();
        logic.savePersonData(alfa);
        logic.readPersonData(2);
        System.out.println("\n\nArray in reverse:\n");
        logic.showPersonRevertOrder();
    }
}
