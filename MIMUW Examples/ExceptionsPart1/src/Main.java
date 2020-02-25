import com.mikolaj.exceptions.NieobsługiwanyWyjątek;
import com.mikolaj.exceptions.ObsługiwanyWyjątek;

public class Main {

    public static void main(String[] args) throws Exception {
        // NIEOBSŁUGIWANY
        //System.out.println(" Obsługiwany : \n");
        //NieobsługiwanyWyjątek ue = new NieobsługiwanyWyjątek();
        //System.out.println("przed głęboko");
        //ue.głęboko(null);
        //System.out.println("po głęboko");

        //OBSŁUGIWANY
        System.out.println("\n Obsługiwany : \n");
        ObsługiwanyWyjątek ep = new ObsługiwanyWyjątek();
        System.out.println("przed głęboko");
        ep.głęboko(null);
        System.out.println("po głęboko");

    }
}
