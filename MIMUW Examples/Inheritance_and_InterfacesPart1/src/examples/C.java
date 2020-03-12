package examples;

public class C extends B{
    public int iC=3;
    public void infoC(){
        infoA();
        infoB();
        System.out.println(
                "Jestem infoC() z klasy C\n"+
                        "  wywołano mnie w obiekcie klasy " + this.getClass().getSimpleName()+ "\n" +
                        "  iA="+iA + ", iB=" + iB + ", iC=" + iC);
    }
}
