package zadania.introductionToJava.tablica.osob;


   public class Osoba{
       // gettery i settery innym rozwiązaniem.


        String imię;
        String nazwisko;

        public Osoba(String imię, String nazwisko){
            this.imię = imię;
            this.nazwisko = nazwisko;
        }
       // Setter
       //public void setColor(String c) {
       //    this.color = c;
       //}
   //}

        public String getNames() {
            return imię + " " + nazwisko; // czy powinno być this.imię?
        }

    }


