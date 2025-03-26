package Taskprogram;

public class Forloop {
    public static void main(String[] args)
    {
        //int i=100;
        for( int i=0;i<=100;i++)
            if ((i % 3 == 0) && (i % 5 ==  0))
            {
            System.out.println(" both:"+i);
        }
        else if(i%5==0) {
        System.out.println("5 bizz:"+i);
    }
   else  if(i%3==0)
 {
        System.out.println("3 fizz:"+i);
    }
  // else
       // {
        //    System.out.println(i);
       // }
    }
}
