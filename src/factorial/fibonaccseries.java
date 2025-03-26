package factorial;

public class fibonaccseries {

    public static void main(String[] args) {
            int n = 10; // Number of terms
            int firstTerm = 1, secondTerm = 2;

            System.out.println("Fibonacci Series (Iteration):");
            for (int i = 0; i < n; i++) {
                System.out.println(firstTerm + " ");
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }

