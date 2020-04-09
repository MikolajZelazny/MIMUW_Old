public class Main {

    public static void main(String[] args) {

    }
}

class BrakPaliwa extends Exception {}
class BrakBenzyny extends BrakPaliwa {}
class BrakGazu extends BrakPaliwa {}

abstract class Samochód {
    abstract void jedź() throws BrakPaliwa;
}

class SamochódNaBenzynę extends Samochód {
    void jedź() throws BrakBenzyny {}
}

class SamochódONapędzieHybrydowym extends Samochód {
    void jedź() throws BrakBenzyny, BrakGazu {}
}

class BłądContinuum extends Exception {}
class ŁamiePrawaFizyki extends Exception {}

interface WehikułCzasu {
    void jedź() throws ŁamiePrawaFizyki;
    void przenieśSięWCzasie() throws BłądContinuum;
}

class PerpetuumMobile extends Samochód implements WehikułCzasu {
    public void jedź() {} //nie może deklarować wyjątków, bo
    //jedź() z Samochód i z WehikułCzasu nie mają wspólnych wyjątków
    public void przenieśSięWCzasie() throws BłądContinuum {}
}
