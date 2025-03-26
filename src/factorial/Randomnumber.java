//package factorial;
//import java.util.Random;
//import java.util.Scanner;
//public class Randomnumber {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//        int numberToguess=r.nextInt(20)+1;
//        System.out.println(numberToguess);
//        Scanner scanner=new Scanner(System.in);
//                System.out.println("enter the number");
//
//        int guess;
//        int attempts =0;
//
//        while(true)
//        guess = scanner.nextInt();
//                    attempts++;
//       if(guess<numberToguess)
//      {
//            System.out.println("low number");
//        }
//        else if(guess>numberToguess)
//       {
//            System.out.println("high number");
//    }else{
//           System.out.println("correct you gueesit!"+attempts+"attempets");
//          // break;
//       }
//
//    }
//}
