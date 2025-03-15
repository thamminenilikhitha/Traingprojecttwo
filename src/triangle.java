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
        }



