package Taskprogram;

import java.util.Scanner;

public class triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
         double a = sc.nextDouble();
         System.out.println("Enter the second number : ");
         double b = sc.nextDouble();
         System.out.println("Enter the third number : ");
         double c = sc.nextDouble();

//        /* if(a==b && b==c && c==a){
//
//             System.out.println("Equivalent Triangle");
//         }
//         else if(a==b ||b==c || a==c){
//             System.out.println("isosceles Triangle");
//        }
//         else {
//             System.out.println("scalene Triangle");
//         }*/
         String triangle = (a==b && b==c && c==a) ? "Equivalent Triangle" :(a==b ||b==c || a==c) ? "isosceles Triangle" : "scalene Triangle";
         System.out.println(triangle);

         }

    public static class Evenodd {

        public static void main(String[] args) {

            int num=40;
            String result=num%3==0?"even":"odd";
            System.out.println(result);

            int L1=6;
            int L2=8;
            int L3=-10;
          //int max=(L1>L2)?(L1>L3) ? L1:L3 : ((L2>L3)? L2:L3);
            int max = (L1 > L2) ? L1 : (L2 > L3) ? L2 : L3;
            System.out.println(max);










        }
    }
}



