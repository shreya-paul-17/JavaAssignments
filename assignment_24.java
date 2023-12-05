public class assignment_24 
{
    public static void main(String[] args) 
    {
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    // Recursive method to calculate factorial
    public static long calculateFactorial(int n)
    {
        // Base case: factorial of 0 is 1
        if (n == 0) 
        {
            return 1;
        }
        // Recursive case: factorial of n is n times factorial of (n-1)
        else 
        {
            return n * calculateFactorial(n - 1);
        }
    }
}

