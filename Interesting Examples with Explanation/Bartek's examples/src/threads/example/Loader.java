package threads.example;

class Loader extends Thread {

    private int i;


    public Loader (int i){
        this.i=i;
    }

    public void run() {

        System.out.println("Hello " + this.i);
    }
}

class MyClass {
    public static void main(String[ ] args) {


        Loader obj = new Loader(1);
        obj.start();

        Loader obj2 = new Loader(2);
        obj2.start();


        Loader obj3 = new Loader(3);
        obj3.start();


        Loader obj4 = new Loader(4);
        obj4.start();
    }
}

