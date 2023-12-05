import java.util.*;
public class assignment_26
{
    public static int factorial(int n)
    {
        if(n<0)
        {
            throw new
            IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if(n==0 || n==1)
        {
            return 1;
        }
        int result=1;
        for(int i=2;i<=n;i++)
        {
            result=result*i;
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num=sc.nextInt();
        int result=factorial(num);
        System.out.println("Factorial of"+num+"is:"+result);
    }
}