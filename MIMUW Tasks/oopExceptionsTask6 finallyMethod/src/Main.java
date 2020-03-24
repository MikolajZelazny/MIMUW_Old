import java.io.IOException;

class InnyMożliwyWyjątek extends Exception {}

class Zasób2 {
    Zasób2(int i) {
        //...
    }
    void zarezerwuj() {}
    void używaj() throws IOException {}
    void innaNiebezpiecznaOperacja() throws InnyMożliwyWyjątek {}
    void zwolnij() {}
}

public class Main {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Zasób2 z = new Zasób2(i);
            try {
                z.zarezerwuj();

                //tu jest niebezpieczny kod
                z.używaj();
                z.innaNiebezpiecznaOperacja();
                //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                //trzeba zwolnić zasób, bo kończy się obrót pętli
                if (i == 3) continue;
                //trzeba zwolnić zasób, bo kończy się cała metoda
                if (i == 8) return;
                //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                //...

                //zwalnianie zasobów
                z.zwolnij();
            } catch (IOException e) {
                //obsługa wyjątku IOException

                //zwalnianie zasobów
                z.zwolnij();
            } catch (InnyMożliwyWyjątek w) {
                //obsługa wyjątku InnyMożliwyWyjątek

                //zwalnianie zasobów
                z.zwolnij();
            } catch (Exception e) {
                //innych wyjątków nie obsługujemy, ale przechwytujemy je na chwilę, żeby zwolnić zasoby
                //złapią się tu również wyjątki niekontrolowane (rozszerzające RuntimeException)

                //zwalnianie zasobów
                z.zwolnij();
                throw e;
            }
        }
    }
}