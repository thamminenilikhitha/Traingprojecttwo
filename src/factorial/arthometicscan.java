/*package factorial;
import java.util.*;
public class arthometicscan {
    public static void main(String[] args) {
        Scanner arth = new Scanner(System.in);
        System.out.println("enter the num");
        int num = arth.nextInt();
        System.out.println("enter the num2");
        int num2 = arth.nextInt();
        System.out.println("enter the num3 ");
        int num3 = arth.nextInt();
        System.out.println("enter thr num4");
        int div = arth.nextInt();

        int result_add=add(a,b,c,d);
        int result_sub=sub(a,b,c,d);
        int result_mul=mul(a,b,c,d);
        int result_div=div(a,b,c,d);


        System.out.println(result_add);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
    }

    static int add(int a, int b ,int c,int d);{
        return a+b+c+d;
}
        static int sub(int a,int b,int c,int d);{
        return a-b-c-d;
        }
        static int mul(int a,int b,int c,int d);{
        return a*b*c*d;
        }
        static int div(int a,int b,int c,int d);{
        return a/b/c/d;

    }
}*/
package factorial;

import java.util.Scanner; // Importing Scanner class

public class arthometicscan {
    public static void main(String[] args) {
        Scanner arth = new Scanner(System.in);

        // Taking inputs from the user
        System.out.println("Enter num1:");
        int num1 = arth.nextInt();
        System.out.println("Enter num2:");
        int num2 = arth.nextInt();
        System.out.println("Enter num3:");
        int num3 = arth.nextInt();
        System.out.println("Enter num4:");
        int num4 = arth.nextInt();

        // Performing operations
        int result_add = add(num1, num2, num3, num4);
        int result_sub = sub(num1, num2, num3, num4);
        int result_mul = mul(num1, num2, num3, num4);
        int result_div = div(num1, num2, num3, num4);

        // Displaying results
        System.out.println("Addition: " + result_add);
        System.out.println("Subtraction: " + result_sub);
        System.out.println("Multiplication: " + result_mul);
        System.out.println("Division: " + result_div);
    }

    // Defining static methods for arithmetic operations
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static int sub(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    public static int mul(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public static int div(int a, int b, int c, int d) {
        if (b != 0 && c != 0 && d != 0) { // Avoid division by zero
            return a / b / c / d;
        }
            return 0;
        }
    }

