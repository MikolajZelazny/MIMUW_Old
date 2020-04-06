import java.io.IOException;

class Zasób3 {
    void używaj() throws IOException {
        throw new IOException();
    }
    void innaNiebezpiecznaOperacja() throws Exception {}
}

public class Main {


    public static void main(String[] args) {
        Zasób3 z = new Zasób3();
        try {

            z.innaNiebezpiecznaOperacja();
            z.używaj();



    } catch (IOException w) {
            System.out.println("IOE catch");
    } catch (Exception w) {
        //obsługa wyjątków Typ2
    }  finally {
        //kod wykonywany niezależnie od wystąpienia wyjątku
        //tu zwalniamy zasoby
      }
    }
}
