package examples;

class B extends A{
    int iB=2;
    void infoB(){
        infoA();
        System.out.println(
                "Jestem infoB() z klasy B\n"+
                        "  wywołano mnie w obiekcie klasy " + this.getClass().getSimpleName() + "\n" +
                        "  iA="+iA + ", iB=" + iB);
    }
}