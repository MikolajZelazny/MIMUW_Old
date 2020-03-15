package keyword;

public class Student extends Osoba{
    private String nrIndeksu;  // Typ String, tak by numer indeksu mógł zawierać nie tylko cyfry (np. I-123456)
    //...
    @Override
    public String toString(){
        return super.toString() + ", nr indeksu = " + nrIndeksu;
    }
}