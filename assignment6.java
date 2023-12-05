public class assignment6
{
    public static void main( String args[] )
    {
        int x = 10;
        if(x==10){
            int y = 20;
            System.out.println("x(inner scope) is " + x);
            System.out.println("y(inner scope) is " + y); 
        }
        System.out.println("x(outer scope) is " + x);
        //System.out.println("y(outer scope) is " + y); 
    }
}