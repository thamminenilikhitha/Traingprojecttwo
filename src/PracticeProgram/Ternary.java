package PracticeProgram;

public class Ternary {
    public static void main(String[] args) {

        /*int a = 4, b = 7;
        int result = (false? b & a : b | a) > 3 ? 120 : 150;
        System.out.println(result);*/



        String name1 = new String("pen");




        String name2 = new String("pen");
        //int marks = name2.equals(name1)?50:80;
        int marks=(name2==name1)?50:80;
        //System.out.println("Marks=" + marks);
        System.out.println(System.identityHashCode(name1));
        System.out.println(System.identityHashCode(name2));
    }

}
