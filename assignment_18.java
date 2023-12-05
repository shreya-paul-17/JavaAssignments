public class assignment_18
{
    public static void main(String[] args)
    {
        // Define a label for the outer loop
        outerLoop:
        for (int i = 1; i <= 3; i++) 
        {
            for (int j = 1; j <= 3; j++)
            {
                // Using a condition to skip certain iterations
                if (i == 2 && j == 2)
                {
                    System.out.println("Skipping i: " + i + ", j: " + j);
                    continue outerLoop; // Labelled continue
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
