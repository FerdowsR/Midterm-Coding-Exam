package math.problems;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        Factorial factorial = new Factorial();
        Factorial.factRecursive(10);
        System.out.println();
        Fibonacci fibonacci = new Fibonacci();
        FindMissingNumber missingNumber = new FindMissingNumber();
        //FindMissingNumber.missingNumber();
        System.out.println();
        Pattern pattern = new Pattern();
        //Pattern.main();
        PrimeNumber primeNumber = new PrimeNumber();
        //PrimeNumber.main();

    }
}
