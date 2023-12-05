class MyRunnable implements Runnable
{
    private int start;
    private int end;
    private int sum;

    public MyRunnable(int start, int end)
    {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() 
    {
        for (int i = start; i <= end; i += 2) 
        {
            sum += i;
        }
    }

    public int getSum() 
    {
        return sum;
    }
}

public class assignment_42
{
    private static int N = 1000;
    private static int sumParent = 0;
    private static int sumChild = 0;

    public static void main(String[] args) 
    {
        MyRunnable parentRunnable = new MyRunnable(1, N);
        MyRunnable childRunnable = new MyRunnable(0, N);

        Thread parentThread = new Thread(parentRunnable);
        Thread childThread = new Thread(childRunnable);

        parentThread.start();
        childThread.start();

        try 
        {
            parentThread.join();
            childThread.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        sumParent = parentRunnable.getSum();
        sumChild = childRunnable.getSum();

        int totalSum = sumParent + sumChild;
        System.out.println("Sum of odd numbers (Parent Thread): " + sumParent);
        System.out.println("Sum of even numbers (Child Thread): " + sumChild);
        System.out.println("Total Sum: " + totalSum);
    }
}
