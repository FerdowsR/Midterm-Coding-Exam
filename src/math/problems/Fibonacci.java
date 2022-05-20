package math.problems;

public class Fibonacci {
    /*
     Write 40 Fibonacci numbers with java.
     0,1,1,2,3,5,8,13
    */
    public static void main(String[] args) {
        int maxNumber = 40;
        int previousNumber = 0;
        int nextNumber = 1;
        System.out.println("Fibonacci Series of " + maxNumber + "numbers:");
        for (int i = 1; i <= 40; ++i) {
            System.out.println(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}


