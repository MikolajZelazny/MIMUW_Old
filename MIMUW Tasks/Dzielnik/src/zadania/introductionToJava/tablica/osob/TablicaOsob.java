package zadania.introductionToJava.tablica.osob;

 public class TablicaOsob {


    public static void dodajDane(String a) {
        String[] osoby = new String[10]; // w metodzie czy klasie?

        for (int i=0;i<10;i++) {
            if (osoby == null) {
                osoby[i]=a;
                break;
            }
        }


        System.out.println(osoby);
    }
 }
        //String[] osoby = new String[10]; // jeżeli ma przechowywac dane lepiej jak jest w klasie czy metodzie?
        // jak ustawiało się wielkości o które ma powiększać sie tablica?






