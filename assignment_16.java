public class assignment_16
 {
    public static void main(String[] args)
    {
        // Create an array of numbers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Numbers divisible by 3:");

        // Iterate through the array
        for (int num : numbers) 
        {
            // Check if the number is not divisible by 3
            if (num % 3 != 0) 
            {
                // Skip this iteration and continue to the next
                continue;
            }

            // Print numbers that are divisible by 3
            System.out.println(num);
        }
    }
}
