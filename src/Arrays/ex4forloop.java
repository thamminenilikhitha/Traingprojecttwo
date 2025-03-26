package Arrays;

public class ex4forloop {
    public static void main(String[] args)
    {
        for(int i=0;i<30;i++){
            if(i%2==0) {
                System.out.println("even->:" +i);
                continue;
            }
        System.out.println("odd->:" +i);
    }
}}
/*package Arrays;

public class ex4forloop {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) {
                System.out.println("even->:" + i);
                continue;
            }
            System.out.println("odd->:" + i);
        }
    }
}*/