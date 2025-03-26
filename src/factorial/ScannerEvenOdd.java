package factorial;
import java.util.*;
public class ScannerEvenOdd {
    public static void main(String[] args)
    {
        Scanner jacker=new Scanner(System.in);
        int num=jacker.nextInt();
        if(num%3==0) {
            System.out.println("even:");
        }else {
            System.out.println("odd:");
        }
    }
}
