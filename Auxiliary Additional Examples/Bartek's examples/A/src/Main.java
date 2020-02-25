public class Main {

    public static void main(String args[]) {

        for (String s : args) {
            //works when startup config is setup with argument -d
            if(s.equals("-d")){
                System.out.println("jestem w logice dla pierwszego argumentu");
            }

        }

    }
}


