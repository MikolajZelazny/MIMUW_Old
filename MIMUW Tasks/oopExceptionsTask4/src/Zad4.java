/*
W poniższym przykładzie w bloku try jest pięć instrukcji. Każda z nich może zgłosić taki sam wyjątek.
Zaproponuj rozwiązanie, które w kodzie obsługi wyjątku pozwoli sprawdzić, w której instrukcji on wystąpił.
*/
/*
public class Main {
    void możeZgłosićWyjątek() throws Exception {
        if (new java.util.Random().nextInt(5) == 0)
            throw new Exception();
    }

    public static void main(String[] args) {
        Main z = new Main();
        try {
            z.możeZgłosićWyjątek();
            z.możeZgłosićWyjątek();
            z.możeZgłosićWyjątek();
            z.możeZgłosićWyjątek();
            z.możeZgłosićWyjątek();
        } catch (Exception e) {
            e.printStackTrace(System.out);       }
    }
}
*/

public class Zad4 {
    void możeZgłosićWyjątek() throws Exception {
        if (new java.util.Random().nextInt(5) == 0)
            throw new Exception();
    }
    /*java.util.Random.nextInt(int n) : The nextInt(int n) is used to get a random number between 0(inclusive)
     and the number passed in this argument(n), exclusive.
     */

    public static void main(String[] args) {
        Zad4 z = new Zad4();
        int i = 1;
        try {
            z.możeZgłosićWyjątek();
            i++;
            z.możeZgłosićWyjątek();
            i++;
            z.możeZgłosićWyjątek();
            i++;
            z.możeZgłosićWyjątek();
            i++;
            z.możeZgłosićWyjątek();
            i++;
        } catch (Exception e) {
            System.out.println("Wyjątek wystąpił w instrukcji "+ i);
            //jakiś kod obsługi
        }
        if (i == 6) System.out.println("Wyjątek nie wystąpił");
    }
}