import java.io.IOException; // Errors with operating on files

class InnyMożliwyWyjątek extends Exception {}

class Zasób1 {
    void zarezerwuj() {}
    void używaj() throws IOException {}
    void innaNiebezpiecznaOperacja( int i ) throws Exception {
        if (i == 3) throw new Exception();
    }
    void zwolnij() {}
}

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Working");
        Zasób1 z = new Zasób1();
        try {
            z.zarezerwuj();
            System.out.println("Working try");
            //tu jest niebezpieczny kod
            z.używaj();
            z.innaNiebezpiecznaOperacja(3);
            //...

            //zwalnianie zasobów
            z.zwolnij();

        } catch (IOException e) {
            //obsługa wyjątku IOException

            System.out.println("Working catch1");
            //zwalnianie zasobów
            z.zwolnij();
        }
        catch (InnyMożliwyWyjątek w) {
            //obsługa wyjątku InnyMożliwyWyjątek

            //z.innaNiebezpiecznaOperacja(2);

            //zwalnianie zasobów
            z.zwolnij();
        }
        catch (Exception e) {
            //innych wyjątków nie obsługujemy, ale przechwytujemy je na chwilę, żeby zwolnić zasoby
            //złapią się tu również wyjątki niekontrolowane (rozszerzające RuntimeException)
            System.out.println("Working last catch");
            //zwalnianie zasobów
            z.zwolnij();
            throw e;
        }
    }
}

// TODO make check of this code for every catch