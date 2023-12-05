public class assignment_20
{
    public static void main(String[] args)
    {
        // Call the overloaded methods
        int sum1 = add(5, 3);
        double sum2 = add(2.5, 3.7);
        String concatenatedString = add("Hello, ", "world!");

        // Display the results
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of two doubles: " + sum2);
        System.out.println("Concatenated string: " + concatenatedString);
    }

    // Overloaded method to add two integers
    public static int add(int a, int b)
    {
        return a + b;
    }

    // Overloaded method to add two doubles
    public static double add(double a, double b) 
    {
        return a + b;
    }

    // Overloaded method to concatenate two strings
    public static String add(String a, String b) 
    {
        return a + b;
    }
}
