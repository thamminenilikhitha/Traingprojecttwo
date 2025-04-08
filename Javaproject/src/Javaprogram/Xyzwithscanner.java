package Javaprogram;

import java.util.Scanner;

public class Xyzwithscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        // Input values for x, y, and z
        System.out.print("Enter value for x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter value for y: ");
        double y = scanner.nextDouble();
        System.out.print("Enter value for z: ");
        double z = scanner.nextDouble();

        // Calculate the expression
        double result = Math.cbrt(Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z));

        // Display the result
        System.out.println("The result of the expression is:"+result);
	}

}
