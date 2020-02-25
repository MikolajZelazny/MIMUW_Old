public class Main {

    public static void main(String[] args) {
        String[] stringArr = {"oOo", "xXx", "oOo", "iIi", "Witam", "Start"};


        System.out.println("\n//////////////////////\n///////FoR///////////\n////////////////////");


        for (int i=0;i<stringArr.length;i++) {
            System.out.println(stringArr[i]);
        }


        System.out.println("\n\n/////////////////////\n/////forEach////////\n///////////////////\n");

        for (String str : stringArr ) {
            System.out.println(str);
        }

        System.out.println("\n\nExample: A-preInkrementacja, Example B-posInkrementacja");

        int a = 10;
        int b = 10;

        System.out.println("\nA-use:"+a++);
        System.out.println("A-afterUse:"+a);

        System.out.println("\nB-use:"+ ++b);
        System.out.println("B-afterUse:"+b);





    }
}
