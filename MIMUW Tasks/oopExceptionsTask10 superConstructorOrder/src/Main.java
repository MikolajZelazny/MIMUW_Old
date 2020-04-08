public class Main extends ParentClass {


    public Main() throws Exception {
        super();
    }



    public static void main(String[] args) {
        try {
            new Main();
        } catch (Exception e) {
            System.out.println("Catch");
        }
    }
}
