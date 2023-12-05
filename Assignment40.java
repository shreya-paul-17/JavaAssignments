public class Assignment40 
{
    public static void main(String[] args) 
        {
            try 
            {
                throwThrowable();
            } 
            catch (Throwable throwable)
            {
                System.err.println("Caught a Throwable: " + throwable.getMessage());
            }
        }
    
    public static void throwThrowable() throws Throwable 
        {
            // Create and throw a custom Throwable object
            Throwable customThrowable = new Throwable("This is a custom Throwable");
            throw customThrowable;
        }
    
}