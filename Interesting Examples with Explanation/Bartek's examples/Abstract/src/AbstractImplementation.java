public class AbstractImplementation extends AbstractJava {
    private int liczba;

    public AbstractImplementation() {
        System.out.printf("W tym momencie jest tworzona instancja klasy: " + this.getClass().getName() + "\n");
    }

    @Override
    int zwrocLiczbe() {
        super.gdzieJestem();
        return this.getLiczba();
    }

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }
}
