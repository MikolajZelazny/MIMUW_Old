public class Main {

    public void strToLength (String a) {
            System.out.println(a.length());
        }

    public static void main(String[] args) throws Exception{
        try {
            Main obj = new Main();
            obj.strToLength(null);
        } catch (NullPointerException n) {
            n.printStackTrace(System.out);
            //n.fillInStackTrace(); - Temporary
            //throw n; - Temporary
            //throw new Exception(); - Same usage as above method implementation.
            throw new Exception(n); // Like in 12 line :"n.printStackTrace(System.out);"(precision) and cause added.
        } /*finally {
            //System.out.println("Final!");
        }*/
    }
}
