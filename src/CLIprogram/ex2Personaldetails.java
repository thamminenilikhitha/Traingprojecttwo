package CLIprogram;
import java.util.Scanner;
public class ex2Personaldetails {

    public static void main(String[] args)

    {
        Scanner jack=new Scanner(System.in);



        System.out.println("enter the name: ");
        String name=jack.nextLine();

        System.out.println("enter the company: ");
        String company=jack.nextLine();


        System.out.println("enter the age: ");
        int age=jack.nextInt();

        System.out.println("enter the salary: ");
       double salary=jack.nextDouble();


        //System.out.println("\n -----user information----");

        System.out.println("Name: "+name);
        System.out.println("company: "+company);
        System.out.println("age: "+age);
        System.out.println("salary: "+salary);


    }


}
