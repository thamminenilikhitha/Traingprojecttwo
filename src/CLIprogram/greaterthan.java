package CLIprogram;

public class greaterthan {
    public static void main(String[] args)
    {
        int[] num = {41,10,11,15,20,3};
        int large = num[0];
        int small = num[0];

        for(int i=1;i<num.length;i++)

           {
               if(num[i] < small)
               {
                   small = num[i];
               }
               if(num[i] > large)
               {
                   large = num[i];
               }
        }
        System.out.println("The largest number is " +large);
        System.out.println("The small number is " +small);
    }
}
