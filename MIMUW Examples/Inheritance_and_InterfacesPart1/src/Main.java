import examples.A;
import examples.C;

public class Main {

    public static void main(String[] args) {
        C c = new C();
        c.infoC();

        A a = new C();
        System.out.println("a.iA=" + a.iA + ", c.iA=" + c.iC);
    }
}
