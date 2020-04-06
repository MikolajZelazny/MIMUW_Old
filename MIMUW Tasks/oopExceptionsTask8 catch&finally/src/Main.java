import java.io.IOException;


class Zasób3 {
    void używaj() throws IOException {
        System.out.println("and use");
        throw new IOException();

    }
    void innaNiebezpiecznaOperacja() throws NullPointerException {
        System.out.println("and other");
        throw new NullPointerException();
    }
}

public class Main {


    public static void main(String[] args) {
        Zasób3 z = new Zasób3();
        try {

            z.używaj();
            z.innaNiebezpiecznaOperacja();




    } catch (IOException w) {
            System.out.println("IOE catch");
    } catch (NullPointerException w) {
            // One catch is enough for this task
            System.out.println("Any exception catch");
    }  finally {
            System.out.println("finally key-word");
      }
    }
}
