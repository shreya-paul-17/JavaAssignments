public class assignment_27
{
    private static int Count=0;
    private int var;
    public assignment_27(int var)
    {
        this.var=var;
        Count++;
    }
    public static int getCount()
    {
        return Count;
    }
    public static void main(String args[])
    {
        assignment_27 obj1=new assignment_27(10);
        assignment_27 obj2=new assignment_27(20);
        assignment_27 obj3=new assignment_27(30);
        System.out.println("Number of instances created:"+assignment_27.getCount());
        System.out.println("Instance 1 variable:" + obj1.var);
        System.out.println("Instance 2 variable:" + obj2.var);
        System.out.println("Instance 3 variable:" +obj3.var);
        
    }
}