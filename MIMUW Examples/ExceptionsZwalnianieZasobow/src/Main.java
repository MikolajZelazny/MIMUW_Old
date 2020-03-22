import java.io.IOException; // Errors with operating on files

class InnyMożliwyWyjątek extends Exception {}

class Zasób1 {
    void zarezerwuj() {}
    void używaj() throws IOException {}
    void innaNiebezpiecznaOperacja() throws InnyMożliwyWyjątek {}
    void zwolnij() {}
}

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Working");
        Zasób1 z = new Zasób1();
        try {
            z.zarezerwuj();

            //tu jest niebezpieczny kod
            z.używaj();
            z.innaNiebezpiecznaOperacja();
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