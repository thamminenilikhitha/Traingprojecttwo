/*package Taskprogram;

//public class ex8secondlargestnum {

        public static void main(String[] args)
        {
            int[] num = {41,10,11,15,20,3};
            int Largest = num[0];
            int secondLargest = Integer.MIN_VALUE;

            for(int i=1;i<num.length;i++) {
                if(num[i] > Largest) {
                    secondLargest = largest;
                    largest = num[i];
                } else if (num[i] > secondLargest && num[i] != largest) {
                    secondLargest = num[i];
                }
            }
            System.out.println("The largest number is " +secondLargest);

        }
    }*/


package Taskprogram;

 class Ex8SecondLargestNum {
    public static void main(String[] args) {
        int[] num = {41, 10, 11, 15, 20, 3};
        int largest = num[0];  // Corrected variable name
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < num.length; i++) {  // Start loop from 1 (no need to check the first element with itself)
            if (num[i] > largest) {
                secondLargest = largest;
                largest = num[i];
            } else if (num[i] > secondLargest && num[i] != largest) {
                secondLargest = num[i];
            }
        }

        System.out.println("The second largest number is: " + secondLargest);
    }
}
