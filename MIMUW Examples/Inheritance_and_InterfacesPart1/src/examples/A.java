package examples;

public class A{
    public int iA=1;
    void infoA(){
        System.out.println(
                "Jestem infoA() z klasy A\n"+
                        "  wywołano mnie w obiekcie klasy " + this.getClass().getSimpleName() + "\n" +
                        "  iA="+iA);
    }
}
