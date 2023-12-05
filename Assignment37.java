public class Assignment37
 {
    public static void main(String[] args) 
        {
            int num = 10;
            int den= 0;
    
            try 
            {
                int result = num/ den;
                System.out.println("Result: " + result);
            } 
            catch (ArithmeticException e)
            {
                System.err.println("An ArithmeticException occurred: " + e.getMessage());
            }
        }
    }