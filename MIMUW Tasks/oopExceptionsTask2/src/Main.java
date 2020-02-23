

public class Main {
    class excA extends Exception {}
    class excB extends Exception  {}
    class excC extends Exception  {}

    void rndmExc() throws excA, excB, excC {
        double x = (int)(Math.random()*3)+1;

        if (x == 1.0) throw new excA();
        else if (x == 2.0) throw new excB();
        else throw new excC();
    }


    public static void main(String[] args) throws Exception{
        Main obj = new Main();
        try {
            obj.rndmExc();
        } catch (excA e) {
            System.out.println(e.getClass());
        } catch (excB e) {
            System.out.println(e.getClass());
        }// catch (excC e) {
           // System.out.println(e.getClass());
        //}
    }
}
