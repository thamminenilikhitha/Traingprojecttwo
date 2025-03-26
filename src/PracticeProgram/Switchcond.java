package PracticeProgram;

import java.util.Scanner;

public class Switchcond {

    public static void main(String[] args) {

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the week days");
        int day=sc.nextInt();

        switch(day){

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("saturday");
                case 3:
            System.out.println("Friday");
            break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("no days");*/

   // }


    char ch = 'a';

                switch(ch){
        case 98:
            System.out.println("yes.Asscii value");

        default:
            System.out.println("not");
                }


            int itemcode = 001;
            switch (itemcode) {
                case 001, 002, 003:
                    System.out.println("all the item are electric charges");
//                    case 006,007,008:
//                        System.out.println("this is sample");
                default:
                    System.out.println("t");
            }


            int c = 24;
            switch (8) {
                case 5:
                    System.out.println("not match");
                case 9:
                    System.out.println(" match");
                    break;
                case 56:
                    System.out.println("not mah1");
                default:
                    System.out.println("deaffult");

            }



}
}