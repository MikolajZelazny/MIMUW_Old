import java.io.IOException;

class InnyMożliwyWyjątek extends Exception {}

class Zasób3 {
    Zasób3(int i) {
        //...
    }
    void zarezerwuj() {}
    void używaj() throws IOException {}
    void innaNiebezpiecznaOperacja() throws InnyMożliwyWyjątek {}
    void zwolnij(int i) {
        System.out.println("zwalnianie" + i);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Zasób3 z = new Zasób3(i);
            try {
                z.zarezerwuj();

                //tu jest niebezpieczny kod
                z.używaj();
                z.innaNiebezpiecznaOperacja();
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
            }
        }
    }
}