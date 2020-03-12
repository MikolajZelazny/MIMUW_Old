import com.mikolaj.exceptions.NieobsługiwanyWyjątek;

public class Main {

    public static void main(String[] args) throws Exception {
        NieobsługiwanyWyjątek ue = new NieobsługiwanyWyjątek();
        System.out.println("przed głęboko");
        ue.głeboko(null);
        System.out.println("po głęboko");
    }
}

