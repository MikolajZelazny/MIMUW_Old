package com.mikolaj.person;
public class PersonLogic {
    private Person[] person; // Przechowuje personOrdered



    public void readAndSavePersonData(Person[] personArr){
        person = personArr.clone();

        //Check index
        for (int c = 0; c<=personArr.length-1; c++){
            System.out.println("save check " + "Nr. " + c + " " + personArr[c].getName() + " " + personArr[c].getSurname() + " ......");
        }


    }

    public void doReversionOfTable (Person[] person) {
        Person[] temp = new Person[person.length];
        for (int i = 0; i <= person.length - 1; i++) {
            temp[i] = person[person.length - 1 - i];
        }

        // Check index
        for (int ci = 0; ci <= temp.length - 1; ci++) {
            System.out.println("save check " + "Nr. " + ci + " " + temp[ci].getName() + " " + temp[ci].getSurname() + " ......");
        }
        this.person = temp.clone();
    }



    public void showPersons (){ //ShowPerson, other method will revert.
        //System.out.println("SHOW: " + temp[1]);

        for (int l=0;l<=person.length-1;l++){ //0 to length
            System.out.println("Show : " + person[l].getName() + " " + person[l].getSurname());
        }

        //System.out.println("SHOW: " + temp[1]);
    }
}
