import java.io.IOException;

class InnyMożliwyWyjątek extends Exception {}
class JeszczeInnyMożliwyWyjątek extends Exception {}


class Zasób3 {
    Zasób3(int i) {
        //...
    }
    void zarezerwuj() {}
    void używaj() throws IOException {}
    void innaNiebezpiecznaOperacja() throws InnyMożliwyWyjątek {}
    void zwolnij(int i) {
        System.out.println("zwalnianie Zasób3 - obrót: " + i);
    }
}

class Zasób4 {
    Zasób4(int i) {
        //...
    }
    void zarezerwuj() throws IOException {}
    void używaj() throws IOException {}
    void innaNiebezpiecznaOperacja() throws InnyMożliwyWyjątek, JeszczeInnyMożliwyWyjątek {}
    void zwolnij(int i) throws IOException {
        System.out.println("zwalnianie Zasób4 - obrót: " + i);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Zasób3 z = new Zasób3(i);
            Zasób4 z4 = new Zasób4(i);
            try {
                z.zarezerwuj();
                z4.zarezerwuj();

                //tu jest niebezpieczny kod
                z.używaj();
                z.innaNiebezpiecznaOperacja();
                z4.używaj();
                z4.innaNiebezpiecznaOperacja();
                if (i == 3) continue;
                if (i == 8) return;
                //if (i == 8) break;
                //...

            } catch (IOException e) {
                //obsługa wyjątku IOException
            } catch (InnyMożliwyWyjątek w) {
                //obsługa wyjątku InnyMożliwyWyjątek
            } finally {
                //zwalnianie zasobów
                z.zwolnij(i);
                z4.zwolnij(i);
                System.out.println("\n");
            }
        }
    }
}

/* ALTERATIVE (PROBABLY CODE ABOVE IS WRONG)
public class ZwalnianieZasobów4 {
  public static void main(String[] args) throws Exception {
    for (int i = 0; i < 10; i++) {
      Zasób4 z1 = new Zasób4(i);
      Zasób4 z2 = new Zasób4(i);
      try {
        z1.zarezerwuj();
        z2.zarezerwuj();

        //tu jest niebezpieczny kod
        z1.używaj();
        z2.używaj();
        z1.innaNiebezpiecznaOperacja();
        z2.innaNiebezpiecznaOperacja();
        if (i == 3) continue;
        if (i == 8) return;
        //...

      } catch (IOException e) {
        //obsługa wyjątku IOException
      } catch (InnyMożliwyWyjątek w) {
        //obsługa wyjątku InnyMożliwyWyjątek
      } finally {
        //obsługa wyjątków jest konieczna,
        //żeby nie dopuścić do zaginięcia JeszczeInnyMożliwyWyjątek
        try {
          z1.zwolnij();
        } catch (IOException e) {}
        try {
          z2.zwolnij();
        } catch (IOException e) {}
      }
    }
  }
}
 */