import java.io.IOException;


public class Main {
    void Wyjatek1() throws Exception {
        throw new Exception();
    }
    void Wyjatek2() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) {
    try {
        Wyjatek1();
        Wyjatek2();



    } catch (Exception w) {
        //obsługa wyjątków Typ1
    } catch (IOException w) {
        //obsługa wyjątków Typ2
    }  finally {
        //kod wykonywany niezależnie od wystąpienia wyjątku
        //tu zwalniamy zasoby
      }
    }
}
