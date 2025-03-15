public class incrementdecrementTask {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++); //o/p-->11+11+12=34
        System.out.println(a);//Output was-->13


        int b = 20;
        System.out.println(--b + b++ + b--); //O/p-->19+19+20=58
    }
}