/*
W poniższym przykładzie w bloku try jest pięć instrukcji. Każda z nich może zgłosić taki sam wyjątek.
Zaproponuj rozwiązanie, które w kodzie obsługi wyjątku pozwoli sprawdzić, w której instrukcji on wystąpił.

public class Main {
    void możeZgłosićWyjątek() throws Exception {
        if (new java.util.Random().nextInt(5) == 0)
            throw new Exception();
    }

    public static void main(String[] args) {
        Main z = new Main();
        try {
            z.możeZgłosićWyjątek();
            z.możeZgłosićWyjątek();
            z.możeZgłosićWyjątek();
            z.możeZgłosićWyjątek();
            z.możeZgłosićWyjątek();
        } catch (Exception e) {
            //jakiś kod obsługi
        }
    }
}
*/