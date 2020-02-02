import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) {

        int x = 12;
        int y = 0;
        int z = 0;
        try
        {
            z = x / y;
            System.out.println(z);
        }
        catch (ArithmeticException e) {
            if(y==0){
                y+=1;
            }
            z=x/(y);
            //System.out.println("Panie Użytkowniku mamy Error bo podzieliłeś przez 0! Typ bledu: " + e.getMessage() + " " +e.getCause());
        }catch(Exception b){
            System.out.println("tutaj trafiaja wszystkie pozostale bledy");
        }

        System.out.println(x + "/" + y + "=" +z);
    }



}
