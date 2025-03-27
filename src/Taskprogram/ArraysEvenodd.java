package Taskprogram;

public class ArraysEvenodd {
    public static void main(String[] args) {
        int[] num = {30, 5, 6, 7, 2, 10, 20};
        for(int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println("enen number" + num[i]);
            } else {
                System.out.println(" not an enen number:" + num[i]);
            }
        }
    }

}
