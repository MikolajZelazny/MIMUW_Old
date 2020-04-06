import java.io.IOException;

class Wyjatek1 extends IOException {
}
class Wyjatek2 extends NullPointerException {}
class Wyjatek3 extends Exception {}

public class Main {


    public static void main(String[] args) {
    try {
        throw new Wyjatek1();
        //throw new Wyjatek2();
        //throw new Wyjatek3();


    } catch (Wyjatek1 w) {
        //obsługa wyjątków Typ1
    } catch (Wyjatek2 w) {
        //obsługa wyjątków Typ2
    } catch (Wyjatek3 w) {
        //obsługa wyjątków Typ3
    } finally {
        //kod wykonywany niezależnie od wystąpienia wyjątku
        //tu zwalniamy zasoby
      }
    }
}
