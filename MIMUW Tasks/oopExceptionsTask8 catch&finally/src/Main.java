import java.io.IOException;

class Zasób3 {
    void używaj() throws IOException {}
    void innaNiebezpiecznaOperacja() throws Exception {}
}

public class Main {


    public static void main(String[] args) {

        try {
            throw new IOException();




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
