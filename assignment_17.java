public class assignment_17
{
    public static void main(String[] args) 
    {
        // Defining label for the outer loop
        outerLoop:
        for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= 3; j++)
            {
                System.out.println("i: " + i + ", j: " + j);
                
                // Using a condition to break out of both loops
                if (i == 2 && j == 2) 
                {
                    System.out.println("Breaking out of both loops.");
                    break outerLoop; // Labelled break
                }
            }
        }
    }
}
