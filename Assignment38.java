public class Assignment38 
{
    
        public static void main(String[] args) 
        {
            try 
            {
                int[] numbers = {1, 2, 3};
                int result = numbers[5] / 0; // This will throw an ArrayIndexOutOfBoundsException
            } 
            catch (ArrayIndexOutOfBoundsException e) 
            {
                System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            } 
            catch (ArithmeticException e) 
            {
                System.err.println("ArithmeticException: " + e.getMessage());
            } 
            catch (Exception e)
            {
                System.err.println("Exception: " + e.getMessage());
            }
        }
    }