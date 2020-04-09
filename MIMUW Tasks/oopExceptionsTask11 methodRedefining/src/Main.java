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
