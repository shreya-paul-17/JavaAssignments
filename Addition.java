import javax.swing.JOptionPane;

public class Addition
{
    public static void main(String args[])
    {
        String firstNumber;
        String secondNumber;
        double number1;
        double number2;
        double sum;
        //read in first number from user as a string
        firstNumber=
                    JOptionPane.showInputDialog("Enter first integer");
                    
        //read in second number from user as a string
        secondNumber=
                    JOptionPane.showInputDialog("Enter second integer");
                    
        //convert numbers from type String to type int
        number1=Double.parseDouble(firstNumber);
        number2=Double.parseDouble(secondNumber);
        
        
        //add the numbers
        sum=number1+number2;
        
        //display the results
        JOptionPane.showMessageDialog(
            null, "The sum is"+sum, "Results",
            JOptionPane.PLAIN_MESSAGE);
            System.exit(0);//terminate the program
    }
}