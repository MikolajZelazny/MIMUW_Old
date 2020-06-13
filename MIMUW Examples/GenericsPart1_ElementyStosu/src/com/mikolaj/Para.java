package com.mikolaj;

public class Para<T1, T2> {
// NEW SOLUTION
    private T1 pierwszy;
    private T2 drugi;
    public Para(T1 pierwszy, T2 drugi) {
        this.pierwszy = pierwszy;
        this.drugi = drugi;
    }

    //Check same method in GenericsPart2 for compare
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Para<?, ?>)) return false;
        Para<T1, T2> p = (Para<T1, T2>) o;  // Ostrzeżenie kompilatora: unchecked cast
        if ((pierwszy() != null) && (drugi() != null))
            return pierwszy().equals(p.pierwszy()) &&
                    drugi().equals(p.drugi());
        else if ((pierwszy() == null) && (drugi() == null))
            return (p.pierwszy() == null) && (p.drugi() == null);
        else // dokładnie jeden z elementów pary jest równy null
            if (pierwszy() == null)
                return (p.pierwszy() == null) && (drugi().equals(p.drugi()));
            else // drugi()==null
                return pierwszy().equals(p.pierwszy()) && (p.drugi() == null);
    }

    public T1 pierwszy() {
        return pierwszy;
    }

    public T2 drugi() {
        return drugi;
    }

    public void pierwszy(T1 pierwszy) {
        this.pierwszy = pierwszy;
    }

    public void drugi(T2 drugi) {
        this.drugi = drugi;
    }
}