package zadania.cd2.kapsulkowanie;

import java.util.Calendar;
//import java.util.Date;
//import java.time.LocalDate;

public class DateTask{ // czy potrzebne


    public static void tydzienTemu() {
        Calendar zeszly = Calendar.getInstance();
        zeszly.add(Calendar.DATE, -7);
        System.out.println(zeszly.getTime());

    }

    public static void dzisiaj() {
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow.getTime());

    }

    public static void zaTydzien() {
        Calendar przyszly = Calendar.getInstance();
        przyszly.add(Calendar.DATE, +7);
        System.out.println(przyszly.getTime());
    }

}
